package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hg41 extends pim0 implements m7v, zlb0 {
    public final idn0 O0;
    public final o95 P0 = c97.b(1.0f);
    public final o95 Q0 = c97.b(1.0f);

    public hg41(idn0 idn0Var) {
        this.O0 = idn0Var;
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        q5t0 q5t0VarH = afh0Var.H(j);
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new hf31(q5t0VarH, this, (byte) 12));
    }

    public final void t0(lsl lslVar) {
        float fFloatValue = ((Number) this.P0.e()).floatValue();
        long jG1 = lslVar.g1();
        cab cabVarA1 = lslVar.a1();
        long jU = cabVarA1.u();
        cabVarA1.p().q();
        try {
            ((dg8) cabVarA1.b).t(fFloatValue, fFloatValue, jG1);
            lslVar.s1();
        } finally {
            i3a.n(cabVarA1, jU);
        }
    }

    public final void z1() {
        fn31.T(v1(), (o8n) null, 0, new fg41(this, null, (byte) 4), 3);
    }
}
