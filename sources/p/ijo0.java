package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ijo0 extends jjo0 {
    public final mx81 d;
    public final View e;
    public final w4f1 f;
    public final wnw0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijo0(mx81 mx81Var, View view, w4f1 w4f1Var, int i) {
        super(view);
        w4f1Var = (i & 4) != 0 ? null : w4f1Var;
        wnw0 wnw0Var = (i & 8) != 0 ? wnw0.c : wnw0.b;
        this.d = mx81Var;
        this.e = view;
        this.f = w4f1Var;
        this.g = wnw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijo0)) {
            return false;
        }
        ijo0 ijo0Var = (ijo0) obj;
        return this.d.equals(ijo0Var.d) && u890.j(this.e, ijo0Var.e) && u890.j(this.f, ijo0Var.f) && this.g == ijo0Var.g;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + (this.d.hashCode() * 31)) * 31;
        w4f1 w4f1Var = this.f;
        return this.g.hashCode() + ((iHashCode + (w4f1Var == null ? 0 : w4f1Var.hashCode())) * 31);
    }

    public final wnw0 w() {
        return this.g;
    }
}
