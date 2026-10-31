package p;

import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class fwy0 {
    public static final bma1 a = bma1.b.k("push_notification_pending_intent_ordered_notification_ids");
    public static final r36 b = new r36(wr80.a, (byte) 0);

    public static final String a(AppLifecycleServicePendingIntent appLifecycleServicePendingIntent, boolean z) {
        if (appLifecycleServicePendingIntent != AppLifecycleServicePendingIntent.OPEN_URL) {
            return l1d.m("com.spotify.notifications.intent.category.", appLifecycleServicePendingIntent.name());
        }
        return "com.spotify.notifications.intent.category." + appLifecycleServicePendingIntent.name() + z;
    }
}
