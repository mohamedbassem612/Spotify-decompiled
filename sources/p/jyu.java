package p;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jyu implements iyu {
    public final Context a;
    public final NotificationManager b;

    public jyu(Context context, NotificationManager notificationManager) {
        this.a = context;
        this.b = notificationManager;
    }

    public final void a() {
        int i = Build.VERSION.SDK_INT;
        NotificationManager notificationManager = this.b;
        Context context = this.a;
        if (i >= 26) {
            wu7.m();
            NotificationChannel notificationChannelB = wu7.b(context.getString(2131962276), context.getString(2131962277));
            notificationChannelB.setDescription(context.getString(2131962275));
            notificationManager.createNotificationChannel(notificationChannelB);
        }
        dko0 dko0Var = new dko0(context, context.getString(2131962276));
        dko0Var.q(R.drawable.stat_sys_download);
        dko0Var.j(context.getString(2131955101));
        dko0Var.p(0, 0, true);
        dko0Var.o(0);
        notificationManager.notify(2131962276, dko0Var.c());
    }

    public final void b(Uri uri, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("output", uri);
        intent.setDataAndType(uri, str);
        intent.setFlags(1);
        Context context = this.a;
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        dko0 dko0Var = new dko0(context, context.getString(2131962276));
        dko0Var.j(context.getString(2131955100));
        dko0Var.q(R.drawable.stat_sys_download_done);
        dko0Var.p(0, 0, false);
        dko0Var.h(activity);
        dko0Var.f(true);
        this.b.notify(2131962276, dko0Var.c());
    }
}
