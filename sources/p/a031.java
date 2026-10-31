package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a031 {
    public final Activity a;
    public final dms0 b;
    public final iwe0 c;

    public a031(Activity activity, dms0 dms0Var, iwe0 iwe0Var) {
        this.a = activity;
        this.b = dms0Var;
        this.c = iwe0Var;
    }

    public final void a() {
        Activity activity = this.a;
        activity.finish();
        activity.startActivity(iwe0.c(this.c, activity, this.b.a(), null, 88));
    }
}
