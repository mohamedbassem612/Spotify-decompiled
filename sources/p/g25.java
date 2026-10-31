package p;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g25 implements Application.ActivityLifecycleCallbacks {
    public final double a;
    public final /* synthetic */ i25 b;

    public g25(i25 i25Var, rf01 rf01Var) {
        this.b = i25Var;
        pf01 pf01Var = rf01Var.a;
        jc10 jc10Var = qw70.a;
        this.a = ((Number) kto1.w(pf01Var.b.n, qw70.d)).doubleValue();
    }

    public final void a(Context context) {
        long j;
        if (this.a == 1.0d) {
            return;
        }
        ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        i25 i25Var = this.b;
        rf01 rf01Var = (rf01) ((WeakReference) i25Var.b).get();
        if (rf01Var == null) {
            i25Var.f();
            return;
        }
        wf01 wf01VarD = rf01Var.d();
        if (wf01VarD != null) {
            synchronized (wf01VarD.c) {
                j = wf01VarD.a.a;
            }
            wf01VarD.c(j);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
