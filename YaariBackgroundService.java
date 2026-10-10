
package com.yaari.power;
import android.app.*;
public class YaariBackgroundService extends Service {
    @Override public android.os.IBinder onBind(android.content.Intent i){return null;}
    @Override public int onStartCommand(android.content.Intent intent, int flags, int id){
        NotificationChannel ch = new NotificationChannel("yaari","Yaari Background", NotificationManager.IMPORTANCE_LOW);
        ((NotificationManager)getSystemService(NOTIFICATION_SERVICE)).createNotificationChannel(ch);
        Notification n = new Notification.Builder(this,"yaari").setContentTitle("Yaari sun rahi hai...").setContentText("Hey Yaari bolo").setSmallIcon(android.R.drawable.ic_btn_speak_now).build();
        startForeground(1,n);
        return START_STICKY;
    }
}
