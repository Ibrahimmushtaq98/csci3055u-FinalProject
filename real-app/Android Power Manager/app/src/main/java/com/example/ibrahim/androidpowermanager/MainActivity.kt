package com.example.ibrahim.androidpowermanager

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.support.v4.app.NotificationManagerCompat
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var batInfo: TextView
    private lateinit var batHealth: String
    private var isCharging: Boolean = false
    private lateinit var chargeMethod: String
    private var temp: Int = -1
    public val CHANNEL_ID = "jhd"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        batInfo = findViewById(R.id.txtViewBattery)
        this.registerReceiver(this.batteryinfoReceiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED))

    }
    private var batteryinfoReceiver=object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            var intentFilter = IntentFilter(Intent.ACTION_BATTERY_CHANGED)
            var batteryStats = context.registerReceiver(null, intentFilter)
            var health = intent.getIntExtra(BatteryManager.EXTRA_HEALTH, 0)
            var status = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1)
            temp = intent.getIntExtra(BatteryManager.EXTRA_TEMPERATURE, 0)
            var chargePlug = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1)
            isCharging = status == BatteryManager.BATTERY_STATUS_CHARGING || status == BatteryManager.BATTERY_STATUS_FULL
            var usbCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_USB
            var acCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_AC

            batHealth = if(health == BatteryManager.BATTERY_HEALTH_GOOD)
                "Good"
            else if (health == BatteryManager.BATTERY_HEALTH_COLD)
                "Cold"
            else if (health == BatteryManager.BATTERY_HEALTH_DEAD)
                "Dead"
            else ""

            chargeMethod = if (usbCharge)
                "USB"
            else if (acCharge)
                "AC"
            else ""

            batInfo.setText("Battery Health: $batHealth \n"
            + "Is Charging: $isCharging \n"
            + "Method of Charging: $chargeMethod \n"
            + "Temperature: $temp \n")

            createNotificationChannel()
            notifyThis()
        }


    }

    public fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val name: CharSequence = CHANNEL_ID
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val mChannel = NotificationChannel(CHANNEL_ID, name, importance)
            val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(mChannel)

        }

    }

    fun notifyThis() {
        val intents = Intent(this,MainActivity::class.java)
        val pi = PendingIntent.getActivity(this, 0,intents,0)
        val mBuilder: NotificationCompat.Builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(android.R.drawable.ic_menu_report_image)
            .setContentTitle("Battery Health")
            .setStyle(NotificationCompat.BigTextStyle().bigText("Battery Health: $batHealth \n " +
                    "Is charging: $isCharging \n" +
                    "Method of Charging: $chargeMethod \n" +
                    "Temperature: $temp \n "))
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setContentIntent(pi)
            .setAutoCancel(true)

        val notificationCompat = NotificationManagerCompat.from(this)
        notificationCompat.notify(0,mBuilder.build())

    }

    /*
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);

        // notificationId is a unique int for each notification that you must define
        notificationManager.notify(0, mBuilder.build());
    }
     */

}
