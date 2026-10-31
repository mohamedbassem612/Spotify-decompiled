package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jxk0 implements w6h1, p8h1 {
    public final r6h1 a;
    public final y6h1 b;

    public jxk0(r6h1 r6h1Var) {
        this.a = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-companion-content-image-gallery";
        x6h1VarI.f = "1.0.0";
        x6h1VarI.g = "22.0.0";
        this.b = x6h1VarI.a();
    }

    @Override // p.n8h1
    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        dlg1 dlg1VarS = b3o1.s();
        dlg1VarS.s(this.b);
        dlg1VarS.C(this.a);
        return dlg1VarS.f();
    }

    @Override // p.p8h1
    public final l7h1 e() {
        k7h1 k7h1VarL = s3o1.l();
        k7h1VarL.d(this.b);
        k7h1VarL.e(this.a);
        k7h1VarL.c(System.currentTimeMillis());
        return (l7h1) k7h1VarL.a();
    }
}
