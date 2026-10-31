package p;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ij61 implements Application.ActivityLifecycleCallbacks {
    public static final ij61 b = new ij61(0);
    public static boolean c;
    public static y441 d;
    public final /* synthetic */ byte a;

    public /* synthetic */ ij61(byte b2) {
        this.a = b2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        byte b2 = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        byte b2 = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.a) {
            case 0:
                y441 y441Var = d;
                if (y441Var != null) {
                    y441Var.g();
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        rih1 rih1Var;
        switch (this.a) {
            case 0:
                y441 y441Var = d;
                if (y441Var != null) {
                    y441Var.n();
                    rih1Var = rih1.a;
                } else {
                    rih1Var = null;
                }
                if (rih1Var == null) {
                    c = true;
                }
                break;
            default:
                dp5 dp5VarA = dp5.c.a();
                if (dp5VarA != null) {
                    dp5VarA.m(activity);
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        byte b2 = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.a) {
            case 0:
                break;
            default:
                dp5 dp5VarA = dp5.c.a();
                if (dp5VarA != null) {
                    dp5VarA.m(activity);
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        byte b2 = this.a;
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void j(Activity activity) {
    }

    private final void a(Activity activity, Bundle bundle) {
    }

    private final void b(Activity activity, Bundle bundle) {
    }

    private final void f(Activity activity, Bundle bundle) {
    }

    private final void g(Activity activity, Bundle bundle) {
    }
}
