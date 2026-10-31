package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u8v0 implements s8v0 {
    public final dtq0 a;
    public final r1n0 b;
    public final i1n0 c;
    public final jik1 d;
    public final fqq e;
    public final wdm f;
    public final iu30 g;
    public final iu30 h;
    public final iu30 i;

    public u8v0(dtq0 dtq0Var, r1n0 r1n0Var, i1n0 i1n0Var, jik1 jik1Var, fqq fqqVar, wdm wdmVar, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3) {
        this.a = dtq0Var;
        this.b = r1n0Var;
        this.c = i1n0Var;
        this.d = jik1Var;
        this.e = fqqVar;
        this.f = wdmVar;
        this.g = iu30Var;
        this.h = iu30Var2;
        this.i = iu30Var3;
    }

    @Override // p.s8v0
    public final v8v0 a(k481 k481Var, mae0 mae0Var) {
        w7r0 w7r0VarA = this.b.a(k481Var, k481Var, f4p1.g(this.a));
        ees eesVarA = this.c.a(mae0Var, this.d);
        t8v0 t8v0Var = new t8v0(this, (byte) 0);
        a680 a680Var = eesVarA.a;
        a680Var.b = t8v0Var;
        a680Var.d = s28.j;
        a680Var.e = new t8v0(this, (byte) 1);
        return new v8v0(w7r0VarA, eesVarA, this.h, this.i);
    }
}
