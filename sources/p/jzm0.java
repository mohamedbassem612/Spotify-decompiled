package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jzm0 extends i1n0 {
    public final dg30 e;
    public final o7r0 f;

    public jzm0(dg30 dg30Var, lzn0 lzn0Var, i8h1 i8h1Var, lyg lygVar, bsp0 bsp0Var, o7r0 o7r0Var) {
        super(lzn0Var, i8h1Var, lygVar, bsp0Var);
        this.e = dg30Var;
        this.f = o7r0Var;
    }

    @Override // p.i1n0
    public final ees a(o6r0 o6r0Var, jik1 jik1Var) {
        bbr0 izm0Var = new izm0(o6r0Var, jik1Var);
        c7r0 c7r0VarC = o7r0.c(this.f, this.e, new nxq0(), izm0Var, fsm0.f, null, null, 96);
        c7r0VarC.g(izm0Var);
        ees eesVarA = super.a(o6r0Var, jik1Var);
        eesVarA.b = new qkn0(c7r0VarC, (byte) 13);
        return eesVarA;
    }
}
