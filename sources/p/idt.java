package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class idt extends pk80 implements zlb0 {
    public erl1 Q0;
    public t8e1 R0;
    public erl1 S0;

    public final void I1() {
        this.S0 = new wl00(this.Q0, ((pk80) this).O0);
        super.I1();
        dio1.y(this);
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        int iC;
        t8e1 t8e1Var = this.R0;
        erl1 erl1Var = this.S0;
        switch (t8e1Var.a) {
            case 26:
                iC = erl1Var.c(ifh0Var);
                break;
            default:
                iC = erl1Var.d(ifh0Var);
                break;
        }
        int i = iC;
        b7x b7xVar = b7x.a;
        if (i == 0) {
            return ifh0Var.S(0, 0, b7xVar, new u1c((byte) 17));
        }
        q5t0 q5t0VarH = afh0Var.H(hjl.b(j, 0, 0, i, i, 3));
        return ifh0Var.S(q5t0VarH.a, i, b7xVar, new p6(q5t0VarH, (byte) 5));
    }
}
