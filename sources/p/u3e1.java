package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u3e1 extends l5t implements j4k, g3e1 {
    public k3f1 Q0;
    public iu30 R0;
    public iu30 S0;
    public iu30 T0;
    public xab1 U0;
    public final mdt V0 = yv91.a(new ww21(this, (byte) 19));
    public n511 W0 = n511.e;

    public u3e1(k3f1 k3f1Var, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3) {
        this.Q0 = k3f1Var;
        this.R0 = iu30Var;
        this.S0 = iu30Var2;
        this.T0 = iu30Var3;
    }

    public final void A1() {
        k3f1 k3f1Var = this.Q0;
        k3f1Var.b = 2;
        k3f1Var.a = null;
    }

    @Override // p.g3e1
    public final f3e1 R() {
        return (f3e1) this.V0.getValue();
    }

    @Override // p.g3e1
    public final long l0(elb0 elb0Var) {
        return o0(elb0Var).h();
    }

    @Override // p.g3e1
    public final n511 o0(elb0 elb0Var) {
        if (!((pim0) this).N0) {
            return this.W0;
        }
        n511 n511Var = (n511) this.T0.invoke(elb0Var);
        if (n511Var == null) {
            return this.W0;
        }
        this.W0 = n511Var;
        return n511Var;
    }

    public final void z1() {
        k3f1 k3f1Var = this.Q0;
        k3f1Var.b = 3;
        k3f1Var.a = this;
    }
}
