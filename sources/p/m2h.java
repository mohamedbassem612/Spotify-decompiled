package p;

import android.os.Bundle;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m2h implements f4h1 {
    public final cr6 a;
    public final k8m0 b;
    public final v9k1 c;
    public final rku d = new rku();
    public final View e;

    public m2h(cr6 cr6Var, k8m0 k8m0Var, v9k1 v9k1Var) {
        this.a = cr6Var;
        this.b = k8m0Var;
        this.c = v9k1Var;
        this.e = (CoordinatorLayout) cr6Var.e;
    }

    public final Object getView() {
        return this.e;
    }

    public final Bundle serialize() {
        return mno1.g();
    }

    public final void start() {
        this.d.b(this.b.k(this.a, this.c.f));
    }

    public final void stop() {
        this.d.a();
    }
}
