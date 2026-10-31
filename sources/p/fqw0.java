package p;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fqw0 {
    public final Context a;

    public fqw0(Context context) {
        this.a = context.getApplicationContext();
    }

    public final void a(PendingIntent pendingIntent) {
        Context context = this.a;
        String string = context.getString(2131959167);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        dko0 dko0Var = new dko0(context, "spotify_updates_channel");
        dko0Var.g = pendingIntent;
        dko0Var.e = dko0.d(string);
        dko0Var.s(string);
        dko0Var.f = dko0.d(context.getString(2131959166));
        dko0Var.D.icon = 2131233418;
        dko0Var.l(16, true);
        notificationManager.notify(2131430168, dko0Var.c());
    }
}
