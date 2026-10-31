package p;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tdh1 extends g5 {
    public final /* synthetic */ udh1 a;

    public tdh1(udh1 udh1Var) {
        this.a = udh1Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        udh1 udh1Var = this.a;
        if (udh1Var.c == 0) {
            ((wo70) udh1Var.b).a(yzm0.a);
        }
    }

    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        udh1 udh1Var = this.a;
        if (udh1Var.c == 0) {
            ((wo70) udh1Var.b).a(yzm0.a);
        }
        udh1Var.c++;
    }

    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        udh1 udh1Var = this.a;
        int i = udh1Var.c - 1;
        udh1Var.c = i;
        if (i == 0) {
            ((wo70) udh1Var.b).g(yzm0.a);
        }
    }
}
