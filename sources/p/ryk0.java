package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ryk0 implements w6h1 {
    public final r6h1 a;
    public final y6h1 b;

    public ryk0(r6h1 r6h1Var) {
        this.a = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-context-menu-button";
        x6h1VarI.f = "2.0.0";
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

    public final w7h1 e() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.b, this.a, System.currentTimeMillis());
    }
}
