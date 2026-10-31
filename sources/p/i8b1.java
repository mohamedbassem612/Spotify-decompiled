package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class i8b1 extends pim0 implements zlb0 {
    public final /* synthetic */ k8b1 O0;

    public i8b1(k8b1 k8b1Var) {
        this.O0 = k8b1Var;
    }

    public void H1(kd31 kd31Var, float f, float f2) {
        kd31Var.r(Math.abs(f) + 1.0f);
        kd31Var.A(sgc1.u(0.5f, f > 0.0f ? 0.0f : 1.0f));
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        q5t0 q5t0VarH = afh0Var.H(j);
        int i = q5t0VarH.b;
        k8b1 k8b1Var = this.O0;
        k8b1Var.b = i;
        return ifh0Var.S(q5t0VarH.a, i, b7x.a, new h8b1(q5t0VarH, k8b1Var, this));
    }
}
