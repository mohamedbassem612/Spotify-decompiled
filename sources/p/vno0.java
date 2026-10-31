package p;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vno0 {
    public static String d;
    public static uno0 g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public vno0(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i, Notification notification) {
        Bundle bundleO = gio1.o(notification);
        if (bundleO == null || !bundleO.getBoolean("android.support.useSideChannel")) {
            this.b.notify(null, i, notification);
            return;
        }
        rno0 rno0Var = new rno0(this.a.getPackageName(), i, notification);
        synchronized (f) {
            try {
                uno0 uno0Var = g;
                if (uno0Var == null) {
                    uno0Var = new uno0(this.a.getApplicationContext());
                    g = uno0Var;
                }
                uno0Var.b(rno0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.cancel(null, i);
    }
}
