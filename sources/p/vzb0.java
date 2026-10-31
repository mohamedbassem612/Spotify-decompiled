package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vzb0 extends pim0 implements rdt0, j4k, mv40 {
    public ml4 O0;
    public r1c0 P0;
    public x6e1 Q0;
    public final hrr0 R0 = v8r.q((Object) null);

    public vzb0(ml4 ml4Var, r1c0 r1c0Var, x6e1 x6e1Var) {
        this.O0 = ml4Var;
        this.P0 = r1c0Var;
        this.Q0 = x6e1Var;
    }

    public final void A1() {
        this.O0.k(this);
    }

    public final void E(elb0 elb0Var) {
        this.R0.setValue(elb0Var);
    }

    public final void z1() {
        ml4 ml4Var = this.O0;
        if (ml4Var.a != null) {
            tf80.c("Expected textInputModifierNode to be null");
        }
        ml4Var.a = this;
    }
}
