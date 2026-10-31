package p;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c5n1 {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final u7n1 b;
    public boolean g;
    public final Intent h;
    public final xpv0 i;
    public v7y m;
    public o7n1 n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final w7n1 k = new w7n1(this, (byte) 0);
    public final AtomicInteger l = new AtomicInteger(0);
    public final String c = "ExpressIntegrityService";
    public final WeakReference j = new WeakReference(null);

    public c5n1(Context context, u7n1 u7n1Var, Intent intent, xpv0 xpv0Var) {
        this.a = context;
        this.b = u7n1Var;
        this.h = intent;
        this.i = xpv0Var;
    }

    public static /* bridge */ /* synthetic */ void b(c5n1 c5n1Var, x5n1 x5n1Var) {
        o7n1 o7n1Var = c5n1Var.n;
        u7n1 u7n1Var = c5n1Var.b;
        ArrayList arrayList = c5n1Var.d;
        if (o7n1Var != null || c5n1Var.g) {
            if (!c5n1Var.g) {
                x5n1Var.run();
                return;
            } else {
                u7n1Var.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(x5n1Var);
                return;
            }
        }
        u7n1Var.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(x5n1Var);
        ServiceConnection v7yVar = new v7y(c5n1Var, (byte) 3);
        c5n1Var.m = v7yVar;
        c5n1Var.g = true;
        if (c5n1Var.a.bindService(c5n1Var.h, v7yVar, 1)) {
            return;
        }
        u7n1Var.b("Failed to bind to the service.", new Object[0]);
        c5n1Var.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((v7n1) it.next()).a(new com.google.android.play.integrity.internal.af());
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(bsd1 bsd1Var) {
        synchronized (this.f) {
            this.e.remove(bsd1Var);
        }
        a().post(new y7n1(this));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((bsd1) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
