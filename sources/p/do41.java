package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class do41 implements yd50 {
    public wdn0 a;
    public yd50 b;

    public final em3 a() {
        yd50 yd50Var = this.b;
        if (!(yd50Var != null)) {
            qf80.c("GraphicsContext not provided");
        }
        return yd50Var.a();
    }

    public final be50 b() {
        yd50 yd50Var = this.b;
        if (yd50Var == null) {
            qf80.c("GraphicsContext not provided");
        }
        be50 be50VarB = yd50Var.b();
        wdn0 wdn0Var = this.a;
        if (wdn0Var != null) {
            wdn0Var.b(be50VarB);
            return be50VarB;
        }
        Object[] objArr = lfp0.a;
        wdn0 wdn0Var2 = new wdn0(1);
        wdn0Var2.b(be50VarB);
        this.a = wdn0Var2;
        return be50VarB;
    }

    public final void c(be50 be50Var) {
        yd50 yd50Var = this.b;
        if (yd50Var != null) {
            yd50Var.c(be50Var);
        }
    }

    public final void d() {
        wdn0 wdn0Var = this.a;
        if (wdn0Var != null) {
            Object[] objArr = wdn0Var.a;
            int i = wdn0Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                c((be50) objArr[i2]);
            }
            wdn0Var.e();
        }
    }
}
