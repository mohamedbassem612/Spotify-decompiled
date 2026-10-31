package p;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.graphics.fonts.FontVariationAxis;
import android.media.AudioFocusRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract /* synthetic */ class wu7 {
    public static /* synthetic */ NotificationChannel a(String str) {
        return new NotificationChannel("spotify_connect", str, 4);
    }

    public static /* synthetic */ NotificationChannel b(String str, String str2) {
        return new NotificationChannel(str, str2, 3);
    }

    public static /* synthetic */ PictureInPictureParams.Builder c() {
        return new PictureInPictureParams.Builder();
    }

    public static /* synthetic */ RemoteAction d(Icon icon, String str, String str2, PendingIntent pendingIntent) {
        return new RemoteAction(icon, str, str2, pendingIntent);
    }

    public static /* synthetic */ FontVariationAxis e(String str, float f) {
        return new FontVariationAxis(str, f);
    }

    public static /* synthetic */ AudioFocusRequest.Builder f(int i) {
        return new AudioFocusRequest.Builder(i);
    }

    public static /* synthetic */ NotificationChannel g(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ NotificationChannel h(String str) {
        return new NotificationChannel("NOTIFICATION_CHANNEL_DEFAULT", str, 3);
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ NotificationChannel j(String str) {
        return new NotificationChannel("NOTIFICATION_CHANNEL_MESSAGES", str, 4);
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void m() {
    }
}
