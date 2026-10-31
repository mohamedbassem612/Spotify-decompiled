package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nfw0 implements tbw0 {
    public final q8n a;
    public final kly0 b;
    public final kly0 c;
    public final kly0 d;
    public final kly0 e;
    public final kly0 f;
    public final kly0 g;
    public final kly0 h;
    public final kly0 i;

    public nfw0(q8n q8nVar, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, kly0 kly0Var4, kly0 kly0Var5, kly0 kly0Var6, kly0 kly0Var7, kly0 kly0Var8) {
        this.a = q8nVar;
        this.b = kly0Var;
        this.c = kly0Var2;
        this.d = kly0Var3;
        this.e = kly0Var4;
        this.f = kly0Var5;
        this.g = kly0Var6;
        this.h = kly0Var7;
        this.i = kly0Var8;
    }

    @Override // p.tbw0
    public final ubw0 a(abu0 abu0Var, p731 p731Var, tl7 tl7Var, jr30 jr30Var) {
        p731 p731Var2;
        jr30 jr30VarA;
        yqg yqgVar = (yqg) this.b.get();
        ugn0 ugn0Var = (ugn0) this.c.get();
        nwt nwtVar = (nwt) this.d.get();
        clm clmVar = (clm) this.e.get();
        ggl gglVar = (ggl) this.f.get();
        aru0 aru0Var = new aru0((byte) 24);
        w9u0 w9u0Var = (w9u0) this.g.get();
        hfw0 hfw0Var = (hfw0) this.h.get();
        if (jr30Var == null) {
            p731Var2 = p731Var;
            jr30VarA = ((oyo) this.i.get()).a(p731Var2);
        } else {
            p731Var2 = p731Var;
            jr30VarA = jr30Var;
        }
        return new ofw0(abu0Var, tl7Var, p731Var2, this.a, yqgVar, ugn0Var, nwtVar, clmVar, gglVar, aru0Var, w9u0Var, hfw0Var, jr30VarA);
    }
}
