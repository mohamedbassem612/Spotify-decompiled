package p;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.internal.playcore_age_signals.zzp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hzo1 {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final hdn1 b;
    public boolean g;
    public final Intent h;
    public v7y l;
    public cg70 m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final w7n1 j = new w7n1(this, (byte) 2);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "AgeSignalsService";
    public final WeakReference i = new WeakReference(null);

    public hzo1(Context context, hdn1 hdn1Var, Intent intent) {
        this.a = context;
        this.b = hdn1Var;
        this.h = intent;
    }

    public static /* bridge */ /* synthetic */ void b(hzo1 hzo1Var, f2o1 f2o1Var) {
        cg70 cg70Var = hzo1Var.m;
        ArrayList arrayList = hzo1Var.d;
        hdn1 hdn1Var = hzo1Var.b;
        if (cg70Var != null || hzo1Var.g) {
            if (!hzo1Var.g) {
                f2o1Var.run();
                return;
            } else {
                hdn1Var.g("Waiting to bind to the service.", new Object[0]);
                arrayList.add(f2o1Var);
                return;
            }
        }
        hdn1Var.g("Initiate binding to the service.", new Object[0]);
        arrayList.add(f2o1Var);
        ServiceConnection v7yVar = new v7y(hzo1Var);
        hzo1Var.l = v7yVar;
        hzo1Var.g = true;
        if (hzo1Var.a.bindService(hzo1Var.h, v7yVar, 1)) {
            return;
        }
        hdn1Var.g("Failed to bind to the service.", new Object[0]);
        hzo1Var.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b2o1) it.next()).a(new zzp());
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = n;
        synchronized (map) {
            try {
                String str = this.c;
                if (!map.containsKey(str)) {
                    HandlerThread handlerThread = new HandlerThread(str, 10);
                    handlerThread.start();
                    map.put(str, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(str);
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
        a().post(new jio1(this));
    }
}
