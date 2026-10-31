package p;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.gms.internal.engage.zzp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rzo1 {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final jm b;
    public boolean g;
    public final Intent h;
    public v7y l;
    public hg70 m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final z6o1 j = new z6o1(this);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "AppEngageService";
    public final WeakReference i = new WeakReference(null);

    public rzo1(Context context, jm jmVar, Intent intent) {
        this.a = context;
        this.b = jmVar;
        this.h = intent;
    }

    public static void b(rzo1 rzo1Var) {
        rzo1Var.b.d("reportBinderDeath", new Object[0]);
        if (rzo1Var.i.get() != null) {
            bhn0.d();
            return;
        }
        rzo1Var.b.d("%s : Binder has died.", new Object[]{rzo1Var.c});
        for (w1o1 w1o1Var : rzo1Var.d) {
            RemoteException remoteException = new RemoteException(String.valueOf(rzo1Var.c).concat(" : Binder has died."));
            bsd1 bsd1Var = w1o1Var.a;
            if (bsd1Var != null) {
                bsd1Var.c(remoteException);
            }
        }
        rzo1Var.d.clear();
        synchronized (rzo1Var.f) {
            rzo1Var.f();
        }
    }

    public static void c(rzo1 rzo1Var, gfo1 gfo1Var) {
        hg70 hg70Var = rzo1Var.m;
        jm jmVar = rzo1Var.b;
        ArrayList<w1o1> arrayList = rzo1Var.d;
        if (hg70Var != null || rzo1Var.g) {
            if (!rzo1Var.g) {
                gfo1Var.run();
                return;
            } else {
                jmVar.d("Waiting to bind to the service.", new Object[0]);
                arrayList.add(gfo1Var);
                return;
            }
        }
        jmVar.d("Initiate binding to the service.", new Object[0]);
        arrayList.add(gfo1Var);
        ServiceConnection v7yVar = new v7y(rzo1Var, (byte) 7);
        rzo1Var.l = v7yVar;
        rzo1Var.g = true;
        if (rzo1Var.a.bindService(rzo1Var.h, v7yVar, 1)) {
            return;
        }
        jmVar.d("Failed to bind to the service.", new Object[0]);
        rzo1Var.g = false;
        for (w1o1 w1o1Var : arrayList) {
            zzp zzpVar = new zzp();
            bsd1 bsd1Var = w1o1Var.a;
            if (bsd1Var != null) {
                bsd1Var.c(zzpVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = n;
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

    public final void d(gfo1 gfo1Var, bsd1 bsd1Var) {
        a().post(new gfo1(this, gfo1Var.a, bsd1Var, gfo1Var));
    }

    public final void e(bsd1 bsd1Var) {
        synchronized (this.f) {
            this.e.remove(bsd1Var);
        }
        a().post(new nio1(this, (byte) 0));
    }

    public final void f() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((bsd1) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
