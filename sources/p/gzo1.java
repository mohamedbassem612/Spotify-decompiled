package p;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.internal.play_crossdeviceprompt.zzp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gzo1 {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final mcn1 b;
    public boolean g;
    public final Intent h;
    public v7y l;
    public mg70 m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final w7n1 j = new w7n1(this, (byte) 1);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.crossdevicepromptservice.CrossDevicePromptService";
    public final WeakReference i = new WeakReference(null);

    public gzo1(Context context, mcn1 mcn1Var, Intent intent) {
        this.a = context;
        this.b = mcn1Var;
        this.h = intent;
    }

    public static void b(gzo1 gzo1Var, qxn1 qxn1Var) {
        mg70 mg70Var = gzo1Var.m;
        ArrayList<a2o1> arrayList = gzo1Var.d;
        mcn1 mcn1Var = gzo1Var.b;
        if (mg70Var != null || gzo1Var.g) {
            if (!gzo1Var.g) {
                qxn1Var.run();
                return;
            } else {
                mcn1Var.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(qxn1Var);
                return;
            }
        }
        mcn1Var.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(qxn1Var);
        ServiceConnection v7yVar = new v7y(gzo1Var);
        gzo1Var.l = v7yVar;
        gzo1Var.g = true;
        if (gzo1Var.a.bindService(gzo1Var.h, v7yVar, 1)) {
            return;
        }
        mcn1Var.b("Failed to bind to the service.", new Object[0]);
        gzo1Var.g = false;
        for (a2o1 a2o1Var : arrayList) {
            zzp zzpVar = new zzp();
            bsd1 bsd1Var = a2o1Var.a;
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
}
