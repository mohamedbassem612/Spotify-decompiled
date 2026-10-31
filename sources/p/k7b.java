package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class k7b {
    public final lzn0 a;
    public final r630 b;
    public final kt91 c;
    public final dg30 d;
    public final a7b e;
    public i7b f;

    public k7b(lzn0 lzn0Var, r630 r630Var, kt91 kt91Var, dg30 dg30Var, a7b a7bVar) {
        this.a = lzn0Var;
        this.b = r630Var;
        this.c = kt91Var;
        this.d = dg30Var;
        this.e = a7bVar;
    }

    public final void a(String str, String str2, h7b h7bVar) {
        dg30 dg30Var = this.d;
        mw40 mw40VarT = yoi1.T(dg30Var, dg30Var.getString(2131952762, str2), this.e.a(str2));
        String string = dg30Var.getString(2131952758);
        j7b j7bVar = new j7b(this, str, h7bVar, (byte) 0);
        mw40VarT.a = string;
        mw40VarT.c = j7bVar;
        String string2 = dg30Var.getString(2131961134);
        k6b k6bVar = k6b.c;
        mw40VarT.b = string2;
        mw40VarT.d = k6bVar;
        mw40VarT.b().b();
    }
}
