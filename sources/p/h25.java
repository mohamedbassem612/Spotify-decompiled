package p;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h25 implements ComponentCallbacks2 {
    public final /* synthetic */ i25 a;

    public h25(i25 i25Var) {
        this.a = i25Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        i25 i25Var = this.a;
        synchronized (i25Var) {
            if (((rf01) ((WeakReference) i25Var.b).get()) == null) {
                i25Var.f();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        wf01 wf01VarD;
        long jB;
        long j;
        i25 i25Var = this.a;
        synchronized (i25Var) {
            try {
                rf01 rf01Var = (rf01) ((WeakReference) i25Var.b).get();
                if (rf01Var != null) {
                    pf01 pf01Var = rf01Var.a;
                    if (i >= 40) {
                        wf01 wf01VarD2 = rf01Var.d();
                        if (wf01VarD2 != null) {
                            wf01VarD2.a();
                        }
                    } else if (i >= 20) {
                        g25 g25Var = (g25) i25Var.c;
                        Context context = pf01Var.a;
                        double d = g25Var.a;
                        if (d != 1.0d) {
                            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(g25Var);
                            i25 i25Var2 = g25Var.b;
                            rf01 rf01Var2 = (rf01) ((WeakReference) i25Var2.b).get();
                            if (rf01Var2 != null) {
                                wf01 wf01VarD3 = rf01Var2.d();
                                if (wf01VarD3 != null) {
                                    synchronized (wf01VarD3.c) {
                                        j = wf01VarD3.a.a;
                                    }
                                    wf01VarD3.c((long) (d * j));
                                }
                            } else {
                                i25Var2.f();
                            }
                        }
                    } else if (i >= 10 && (wf01VarD = rf01Var.d()) != null) {
                        synchronized (wf01VarD.c) {
                            jB = ((cg01) wf01VarD.a.c).b();
                        }
                        long j2 = jB / 2;
                        synchronized (wf01VarD.c) {
                            ((cg01) wf01VarD.a.c).d(j2);
                        }
                    }
                } else {
                    i25Var.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
