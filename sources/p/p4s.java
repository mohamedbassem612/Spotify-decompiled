package p;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p4s {
    public final e831 a;
    public final hu90 b;

    public p4s(e831 e831Var, hu90 hu90Var) {
        this.a = e831Var;
        this.b = hu90Var;
    }

    public final void a(ou80 ou80Var, iu30 iu30Var) {
        Activity activityB = b(ou80Var);
        if (activityB == null) {
            iu30Var.invoke((Object) null);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new a6n(new ssm(iu30Var, this, activityB, (byte) 11), (byte) 6), 250L);
        }
    }

    public final Activity b(ou80 ou80Var) {
        Activity activityA = this.a.a();
        if (activityA == null || activityA.isDestroyed() || activityA.isFinishing()) {
            activityA = null;
        }
        if (activityA == null) {
            return null;
        }
        g5p0.b((g5p0) this.b.invoke(activityA), ou80Var, 2);
        return activityA;
    }
}
