package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mg41 extends uux implements m7v {
    public final o95 P0;

    public mg41(idn0 idn0Var) {
        super(idn0Var);
        this.P0 = c97.b(1.0f);
    }

    @Override // p.uux
    public final Object H1(lnm lnmVar) {
        Object objB = o95.b(this.P0, yah0.o(1.0f), null, null, null, lnmVar, 14);
        return objB == d9n.a ? objB : rih1.a;
    }

    @Override // p.uux
    public final Object I1(lnm lnmVar) {
        Object objB = o95.b(this.P0, yah0.o(0.9f), null, null, null, lnmVar, 14);
        return objB == d9n.a ? objB : rih1.a;
    }

    @Override // p.m7v
    public final void t0(lsl lslVar) {
        float fFloatValue = ((Number) this.P0.e()).floatValue();
        if (fFloatValue == 1.0f) {
            lslVar.s1();
            return;
        }
        long jG1 = lslVar.g1();
        cab cabVarA1 = lslVar.a1();
        long jU = cabVarA1.u();
        cabVarA1.p().q();
        try {
            cabVarA1.v().t(fFloatValue, fFloatValue, jG1);
            lslVar.s1();
        } finally {
            i3a.n(cabVarA1, jU);
        }
    }
}
