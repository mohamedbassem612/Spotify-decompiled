package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mkp {
    public final nkp a;
    public final uy90 b;
    public final sr90 c;
    public final lkp d = new lkp(this, 0, (byte) 0);
    public final jly0 e = iy81.a(new lkp(this, 1, (byte) 0));

    public mkp(uy90 uy90Var, sr90 sr90Var, nkp nkpVar) {
        this.a = nkpVar;
        this.b = uy90Var;
        this.c = sr90Var;
    }

    public final mxr a() {
        ukp ukpVar = this.b;
        c9c0 c9c0VarB = ukpVar.b();
        c8o.l(c9c0VarB);
        vcd0 vcd0Var = (vcd0) this.c.F.get();
        vu60 vu60VarB = this.a.b();
        c8o.l(vu60VarB);
        ut21 ut21VarG = ukpVar.g();
        c8o.l(ut21VarG);
        return new mxr(c9c0VarB, vcd0Var, vu60VarB, ut21VarG);
    }
}
