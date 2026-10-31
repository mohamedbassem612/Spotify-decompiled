package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pyk0 implements w6h1 {
    public final r6h1 a;
    public final y6h1 b;

    public pyk0(Integer num, String str, String str2, r6h1 r6h1Var) {
        this.a = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-content-retrieval-section";
        x6h1VarI.f = "3.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = str;
        x6h1VarI.c = num;
        x6h1VarI.e = str2;
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
}
