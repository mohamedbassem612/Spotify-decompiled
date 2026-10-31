package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hll0 implements t9h1, p8h1 {
    public final y6h1 a;

    public hll0(String str, String str2) {
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-plan-overview";
        x6h1VarI.f = "6.2.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = str;
        x6h1VarI.d = str2;
        this.a = x6h1VarI.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        dlg1 dlg1VarS = b3o1.s();
        dlg1VarS.s(this.a);
        return dlg1VarS.f();
    }

    @Override // p.p8h1
    public final l7h1 e() {
        k7h1 k7h1VarL = s3o1.l();
        k7h1VarL.d(this.a);
        k7h1VarL.c(System.currentTimeMillis());
        return (l7h1) k7h1VarL.a();
    }
}
