package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class toy0 implements i6r0 {
    public final moy0 a;
    public final llm b;
    public ben0 c;
    public xab1 d;
    public int e;

    public toy0(moy0 moy0Var) {
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a.f;
        this.a = moy0Var;
        this.b = smo1.e(flo1.l(guo1.B(), bs50Var));
        this.c = new ben0();
    }

    @Override // p.i6r0
    public final Boolean a() {
        return this.c.b;
    }

    @Override // p.i6r0
    public final kku b(px20 px20Var) {
        int i = this.e;
        boolean z = i == 0;
        this.e = i + 1;
        kku kkuVarB = this.c.b(px20Var);
        if (z) {
            this.d = fn31.T(this.b, (o8n) null, 4, new c3u0(this, (lnm) null, (byte) 24), 1);
        }
        return new agp0(new l811(), (ujp0) kkuVarB, this, (byte) 1);
    }
}
