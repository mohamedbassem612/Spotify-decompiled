package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yb0 extends vv71 {
    public final ua91 a;
    public final hrr0 b;
    public final hrr0 c;

    public yb0(ua91 ua91Var, yq71 yq71Var, n511 n511Var) {
        this.a = ua91Var;
        this.b = v8r.q(yq71Var);
        this.c = v8r.q(n511Var);
    }

    @Override // p.vv71
    public final vv71 a(xs71 xs71Var, yq71 yq71Var, long j, long j2, long j3) {
        hrr0 hrr0Var = this.b;
        f4p1.w(this.a, j, j2, j3, !u890.j((yq71) hrr0Var.getValue(), yq71Var));
        hrr0Var.setValue(yq71Var);
        return this;
    }

    @Override // p.vv71
    public final n511 c() {
        return (n511) this.c.getValue();
    }

    @Override // p.vv71
    public final boolean d() {
        return true;
    }

    @Override // p.vv71
    public final ua91 e() {
        return this.a;
    }

    @Override // p.vv71
    public final vv71 h() {
        ua91 ua91Var = this.a;
        anm1.g(Offset.g(((Offset) ((hrr0) ua91Var.e).getValue()).a, ((Offset) ((hrr0) ua91Var.d).getValue()).a), ua91Var.J());
        ys71 ys71Var = ((yq71) this.b.getValue()).S0;
        lv71 lv71Var = (lv71) ys71Var.p().b.getValue();
        ys71Var.p();
        elb0 elb0Var = ys71Var.k().b.f;
        if (elb0Var == null) {
            hhg1.n("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
            return null;
        }
        o0c.R(elb0Var.b());
        lv71Var.getClass();
        return lbo0.a;
    }

    @Override // p.vv71
    public final void i(n511 n511Var) {
        this.c.setValue(n511Var);
    }
}
