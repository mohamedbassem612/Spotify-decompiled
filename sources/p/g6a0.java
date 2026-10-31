package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g6a0 implements xz71 {
    public final ynb0 a;
    public final ynb0 b;
    public final ynb0 c;
    public final ynb0 d;
    public final k9r e;
    public final ynb0 f;
    public final ynb0 g;

    public g6a0(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4, k9r k9rVar, ynb0 ynb0Var5, ynb0 ynb0Var6) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = ynb0Var3;
        this.d = ynb0Var4;
        this.e = k9rVar;
        this.f = ynb0Var5;
        this.g = ynb0Var6;
    }

    public final mr20 a(fd0 fd0Var) {
        zob1 zob1VarB = ((c9c0) this.c.get()).d.b();
        if (!((no4) ((b0a0) this.d.get()).a.get()).w0()) {
            return new x880(zob1VarB, this, (byte) 11);
        }
        ezc ezcVarG = yoi1.g(((xir) this.f.get()).c);
        ezc ezcVarG2 = yoi1.g(((oir) this.g.get()).b);
        k9r k9rVar = this.e;
        return h5p1.q(zob1VarB, ezcVarG, ezcVarG2, new ht20(new qer(new i0h(new wef(yoi1.g(((xir) ((ynb0) k9rVar.c).get()).e), (byte) 25), (byte) 16), k9rVar, (byte) 17), new qjr(2, (lnm) null, (byte) 7)), new ht20(new qer(new qer(new wef(yoi1.g(((oir) ((ynb0) k9rVar.d).get()).c), (byte) 24), k9rVar, (byte) 15), k9rVar, (byte) 16), new qjr(2, (lnm) null, (byte) 6)), new e6a0(this, null));
    }

    public final x081 getType() {
        return x081.b;
    }
}
