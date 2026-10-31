package p;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ec0 extends g5 {
    public final /* synthetic */ byte a;
    public final Object b;

    public ec0(dc0 dc0Var) {
        this.a = (byte) 0;
        this.b = dc0Var;
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        smo1.e(flo1.l(j0d1VarB, pyf0.a.f));
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 2:
                ((Application.ActivityLifecycleCallbacks) ((ynb0) this.b).get()).onActivityCreated(activity, bundle);
                break;
        }
    }

    public void onActivityDestroyed(Activity activity) {
        switch (this.a) {
            case 2:
                ((Application.ActivityLifecycleCallbacks) ((ynb0) this.b).get()).onActivityDestroyed(activity);
                break;
        }
    }

    public void onActivityPaused(Activity activity) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ((kmc) obj).b.remove(activity.getLocalClassName());
                break;
            case 2:
                ((Application.ActivityLifecycleCallbacks) ((ynb0) obj).get()).onActivityPaused(activity);
                break;
            case 3:
                if (activity instanceof g0i) {
                    ar91 ar91Var = (ar91) obj;
                    ce0 ce0Var = ar91Var.a;
                    mma0[] mma0VarArr = ar91.f;
                    mma0 mma0Var = mma0VarArr[0];
                    ce0Var.c(mma0VarArr[0], ar91Var, o7h.J0((List) ((sgp0) ce0Var).a, activity));
                    break;
                }
                break;
        }
    }

    public void onActivityResumed(Activity activity) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ((kmc) obj).b.add(activity.getLocalClassName());
                break;
            case 2:
                ((Application.ActivityLifecycleCallbacks) ((ynb0) obj).get()).onActivityResumed(activity);
                break;
            case 3:
                ar91 ar91Var = (ar91) obj;
                ce0 ce0Var = ar91Var.a;
                if (activity instanceof g0i) {
                    mma0[] mma0VarArr = ar91.f;
                    mma0 mma0Var = mma0VarArr[0];
                    ce0Var.c(mma0VarArr[0], ar91Var, o7h.O0(activity, (List) ((sgp0) ce0Var).a));
                    ar91Var.d.invoke(activity);
                    break;
                }
                break;
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 2:
                ((Application.ActivityLifecycleCallbacks) ((ynb0) this.b).get()).onActivitySaveInstanceState(activity, bundle);
                break;
        }
    }

    public void onActivityStarted(Activity activity) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((dc0) obj).a.getClass();
                break;
            case 2:
                ((Application.ActivityLifecycleCallbacks) ((ynb0) obj).get()).onActivityStarted(activity);
                break;
        }
    }

    public void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 2:
                ((Application.ActivityLifecycleCallbacks) ((ynb0) this.b).get()).onActivityStopped(activity);
                break;
        }
    }

    public /* synthetic */ ec0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
