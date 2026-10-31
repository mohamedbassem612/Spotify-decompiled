package p;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ycs implements clp0 {
    public final Context a;
    public final NotificationManager b;
    public final dto0 c;
    public final String d;
    public final vku e = new vku();

    public ycs(Context context, NotificationManager notificationManager, dto0 dto0Var, String str) {
        this.a = context;
        this.b = notificationManager;
        this.c = dto0Var;
        this.d = str;
    }

    public final PendingIntent a(String str) {
        Intent intent = new Intent();
        intent.setAction(str);
        String str2 = this.d;
        Context context = this.a;
        intent.setClassName(context, str2);
        intent.setExtrasClassLoader(context.getClassLoader());
        intent.setFlags(268435456);
        return PendingIntent.getActivity(context, 0, intent, 201326592);
    }

    public final void b(l0l l0lVar) {
        tym0 tym0Var = this.c.a;
        Context context = this.a;
        if (tym0Var.g(context)) {
            int i = Build.VERSION.SDK_INT;
            NotificationManager notificationManager = this.b;
            if (i >= 26) {
                wu7.m();
                notificationManager.createNotificationChannel(wu7.a(context.getString(2131962877)));
            }
            int iHashCode = UUID.randomUUID().hashCode();
            dko0 dko0Var = new dko0(context, "spotify_connect");
            dko0Var.j(context.getString(2131959310, l0lVar.getName()));
            dko0Var.i(context.getString(2131959309));
            dko0Var.q(2131232674);
            dko0Var.o(4);
            dko0Var.h(a("OFF_NETWORK_CLICK"));
            dko0Var.k(a("OFF_NETWORK_CANCEL"));
            dko0Var.f(true);
            notificationManager.notify(iHashCode, dko0Var.c());
        }
    }
}
