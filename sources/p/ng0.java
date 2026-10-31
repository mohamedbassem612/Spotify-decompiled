package p;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ng0 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ byte a;

    public /* synthetic */ ng0(byte b) {
        this.a = b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 0:
                fza fzaVar = oue0.a;
                ScheduledExecutorService scheduledExecutorService = og0.a;
                synchronized (wf10.b) {
                }
                og0.a.execute(new k((byte) 2));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.a) {
            case 0:
                fza fzaVar = oue0.a;
                ScheduledExecutorService scheduledExecutorService = og0.a;
                synchronized (wf10.b) {
                }
                wwg wwgVar = wwg.a;
                Set set = dhn.a;
                if (!set.contains(wwg.class)) {
                    try {
                        zwg zwgVarO = zwg.f.o();
                        if (!set.contains(zwgVarO)) {
                            try {
                                ((HashMap) zwgVarO.e).remove(Integer.valueOf(activity.hashCode()));
                            } catch (Throwable th) {
                                dhn.a(zwgVarO, th);
                                return;
                            }
                            break;
                        }
                    } catch (Throwable th2) {
                        dhn.a(wwg.class, th2);
                        return;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006b A[Catch: all -> 0x0075, TryCatch #2 {all -> 0x0075, blocks: (B:14:0x0032, B:17:0x003b, B:19:0x0048, B:32:0x0068, B:33:0x006b, B:35:0x006f, B:22:0x004f, B:25:0x005a, B:27:0x005e, B:30:0x0064), top: B:45:0x0032, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x006f A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #2 {all -> 0x0075, blocks: (B:14:0x0032, B:17:0x003b, B:19:0x0048, B:32:0x0068, B:33:0x006b, B:35:0x006f, B:22:0x004f, B:25:0x005a, B:27:0x005e, B:30:0x0064), top: B:45:0x0032, inners: #0 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        SensorManager sensorManager;
        switch (this.a) {
            case 0:
                fza fzaVar = oue0.a;
                ScheduledExecutorService scheduledExecutorService = og0.a;
                synchronized (wf10.b) {
                }
                AtomicInteger atomicInteger = og0.e;
                if (atomicInteger.decrementAndGet() < 0) {
                    atomicInteger.set(0);
                }
                og0.a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strK = fpi1.k(activity);
                wwg wwgVar = wwg.a;
                Set set = dhn.a;
                if (!set.contains(wwg.class)) {
                    try {
                        if (wwg.f.get()) {
                            zwg.f.o().A(activity);
                            lbk1 lbk1Var = wwg.d;
                            if (lbk1Var == null || set.contains(lbk1Var)) {
                                sensorManager = wwg.c;
                                if (sensorManager != null) {
                                    sensorManager.unregisterListener((SensorEventListener) wwg.b);
                                }
                            } else {
                                try {
                                    if (((Activity) lbk1Var.b.get()) != null) {
                                        try {
                                            Timer timer = lbk1Var.c;
                                            if (timer != null) {
                                                timer.cancel();
                                            }
                                            lbk1Var.c = null;
                                            break;
                                        } catch (Exception unused) {
                                        }
                                        sensorManager = wwg.c;
                                        if (sensorManager != null) {
                                            sensorManager.unregisterListener((SensorEventListener) wwg.b);
                                        }
                                    } else {
                                        sensorManager = wwg.c;
                                        if (sensorManager != null) {
                                            sensorManager.unregisterListener((SensorEventListener) wwg.b);
                                        }
                                    }
                                } catch (Throwable th) {
                                    dhn.a(lbk1Var, th);
                                }
                            }
                            break;
                        }
                    } catch (Throwable th2) {
                        dhn.a(wwg.class, th2);
                    }
                }
                og0.a.execute(new mg0((byte) 1, jCurrentTimeMillis, strK));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.a) {
            case 0:
                fza fzaVar = oue0.a;
                ScheduledExecutorService scheduledExecutorService = og0.a;
                synchronized (wf10.b) {
                }
                og0.k = new WeakReference(activity);
                og0.e.incrementAndGet();
                og0.a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                og0.i = jCurrentTimeMillis;
                String strK = fpi1.k(activity);
                SensorEventListener sensorEventListener = wwg.b;
                wwg wwgVar = wwg.a;
                Set set = dhn.a;
                if (!set.contains(wwg.class)) {
                    try {
                        if (wwg.f.get()) {
                            zwg.f.o().b(activity);
                            Context applicationContext = activity.getApplicationContext();
                            String strB = wf10.b();
                            c120 c120VarB = g120.b(strB);
                            if (c120VarB == null || !c120VarB.g) {
                                set.contains(wwgVar);
                            } else {
                                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                                if (sensorManager != null) {
                                    wwg.c = sensorManager;
                                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                    lbk1 lbk1Var = new lbk1(activity);
                                    wwg.d = lbk1Var;
                                    uk4 uk4Var = new uk4(c120VarB, strB, (byte) 7);
                                    if (!set.contains(sensorEventListener)) {
                                        try {
                                            ((mbk1) sensorEventListener).a = uk4Var;
                                        } catch (Throwable th) {
                                            dhn.a(sensorEventListener, th);
                                        }
                                    }
                                    sensorManager.registerListener(sensorEventListener, defaultSensor, 2);
                                    if (c120VarB.g) {
                                        lbk1Var.c();
                                    }
                                    break;
                                }
                            }
                            dhn.a.contains(wwgVar);
                            break;
                        }
                    } catch (Throwable th2) {
                        dhn.a(wwg.class, th2);
                    }
                }
                fkj0 fkj0Var = fkj0.b;
                if (!dhn.a.contains(fkj0.class)) {
                    try {
                        if (fkj0.c) {
                            CopyOnWriteArraySet copyOnWriteArraySet = tmj0.d;
                            if (!czo1.h().isEmpty()) {
                                HashMap map = koj0.e;
                                d0p1.i0(activity);
                                break;
                            }
                        }
                    } catch (Exception unused) {
                    } catch (Throwable th3) {
                        dhn.a(fkj0.class, th3);
                    }
                }
                etc1.d(activity);
                String str = og0.l;
                if (str != null && ihc1.h0(str, "ProxyBillingActivity", false) && !strK.equals("ProxyBillingActivity")) {
                    og0.b.execute(new k((byte) 1));
                }
                og0.a.execute(new mg0(activity.getApplicationContext(), strK, jCurrentTimeMillis));
                og0.l = strK;
                break;
            default:
                try {
                    wf10.c().execute(new k((byte) 11));
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 0:
                fza fzaVar = oue0.a;
                ScheduledExecutorService scheduledExecutorService = og0.a;
                synchronized (wf10.b) {
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.a) {
            case 0:
                og0.j++;
                fza fzaVar = oue0.a;
                synchronized (wf10.b) {
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 0:
                fza fzaVar = oue0.a;
                ScheduledExecutorService scheduledExecutorService = og0.a;
                synchronized (wf10.b) {
                }
                x6o0 x6o0Var = gm5.a;
                if (!dhn.a.contains(gm5.class)) {
                    try {
                        gm5.b.execute(new k((byte) 6));
                    } catch (Throwable th) {
                        dhn.a(gm5.class, th);
                    }
                }
                og0.j--;
                break;
            default:
                try {
                    if (u890.j(m580.c, Boolean.TRUE) && u890.j(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                        wf10.c().execute(new k((byte) 10));
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void a(Activity activity, Bundle bundle) {
    }

    private final void d(Activity activity, Bundle bundle) {
    }
}
