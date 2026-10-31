package p;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jrw0 extends b6x {
    final /* synthetic */ krw0 this$0;

    public static final class a extends b6x {
        final /* synthetic */ krw0 this$0;

        public a(krw0 krw0Var) {
            this.this$0 = krw0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            krw0 krw0Var = this.this$0;
            int i = krw0Var.a + 1;
            krw0Var.a = i;
            if (i == 1 && krw0Var.d) {
                krw0Var.f.g(k8c0.ON_START);
                krw0Var.d = false;
            }
        }
    }

    public jrw0(krw0 krw0Var) {
        this.this$0 = krw0Var;
    }

    @Override // p.b6x, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = bl21.b;
            ((bl21) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).a = this.this$0.h;
        }
    }

    @Override // p.b6x, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        krw0 krw0Var = this.this$0;
        int i = krw0Var.b - 1;
        krw0Var.b = i;
        if (i == 0) {
            Handler handler = krw0Var.e;
            handler.getClass();
            handler.postDelayed(krw0Var.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        d55.g(activity, new a(this.this$0));
    }

    @Override // p.b6x, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        krw0 krw0Var = this.this$0;
        int i = krw0Var.a - 1;
        krw0Var.a = i;
        if (i == 0 && krw0Var.c) {
            krw0Var.f.g(k8c0.ON_STOP);
            krw0Var.d = true;
        }
    }
}
