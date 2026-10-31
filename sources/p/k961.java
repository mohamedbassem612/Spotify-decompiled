package p;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k961 implements i961 {
    public final Context a;
    public final NotificationManager b;
    public final wd30 c;
    public final ow3 d;
    public final ConcurrentHashMap e = new ConcurrentHashMap(1);

    public k961(Context context, NotificationManager notificationManager, wd30 wd30Var, ow3 ow3Var) {
        this.a = context;
        this.b = notificationManager;
        this.c = wd30Var;
        this.d = ow3Var;
    }

    public final Notification a() {
        if (Build.VERSION.SDK_INT >= 26) {
            wu7.m();
            this.b.createNotificationChannel(new NotificationChannel("external_integration_service_channel", this.a.getString(2131956109), 2));
        }
        return b(c());
    }

    public final Notification b(ArrayList arrayList) {
        cko0 cko0Var = new cko0((byte) 1);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                ((ArrayList) cko0Var.f).add(dko0.d(str));
            }
        }
        Context context = this.a;
        dko0 dko0Var = new dko0(context, "external_integration_service_channel");
        dko0Var.e = dko0.d(context.getString(2131956110));
        dko0Var.D.icon = 2131233418;
        dko0Var.r(cko0Var);
        return dko0Var.c();
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList(1);
        for (String str : this.e.values()) {
            if (!"foreground-service-empty-notification-message".equals(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final boolean d(String str) {
        boolean z = this.e.get(str) != null;
        Logger.b("Is service " + str + " foreground: " + z, new Object[0]);
        return z;
    }

    public final void e(hpq hpqVar, String str, Integer num) {
        if (d(str)) {
            Logger.b("Foreground service (fgsType=" + num + ") already started: " + str, new Object[0]);
            return;
        }
        Logger.b("Starting foreground service (fgsType=" + num + "): " + str, new Object[0]);
        if (Build.VERSION.SDK_INT >= 31) {
            this.d.n(hpqVar, hpqVar.getClass().getSimpleName(), new j961(num, hpqVar, this));
        } else {
            hpqVar.startForeground(28, a());
        }
        this.c.a.onNext(0L);
        this.e.put(str, "foreground-service-empty-notification-message");
    }

    public final void f(hpq hpqVar, String str) {
        if (!d(str)) {
            Logger.b("Foreground service already stopped: ".concat(str), new Object[0]);
            return;
        }
        Logger.b("Stopping foreground service: ".concat(str), new Object[0]);
        ConcurrentHashMap concurrentHashMap = this.e;
        concurrentHashMap.remove(str);
        hpqVar.stopForeground(1);
        this.c.a.onNext(0L);
        boolean zIsEmpty = concurrentHashMap.isEmpty();
        NotificationManager notificationManager = this.b;
        if (zIsEmpty) {
            notificationManager.cancel(28);
        } else {
            notificationManager.notify(28, b(c()));
        }
    }

    public final void g(String str, String str2) {
        ConcurrentHashMap concurrentHashMap = this.e;
        if (concurrentHashMap.containsKey(str)) {
            if (str2 == null) {
                str2 = "foreground-service-empty-notification-message";
            }
            concurrentHashMap.put(str, str2);
            boolean zIsEmpty = concurrentHashMap.isEmpty();
            NotificationManager notificationManager = this.b;
            if (zIsEmpty) {
                notificationManager.cancel(28);
            } else {
                notificationManager.notify(28, b(c()));
            }
        }
    }
}
