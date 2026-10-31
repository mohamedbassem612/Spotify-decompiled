package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i991 extends g5 {
    public final ep31 a;
    public final n381 b;
    public final vku c = new vku();

    public i991(ep31 ep31Var, n381 n381Var) {
        this.a = ep31Var;
        this.b = n381Var;
    }

    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.c.c();
    }

    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.a.e()) {
            this.c.a(this.b.c(activity).E().subscribe());
        }
    }
}
