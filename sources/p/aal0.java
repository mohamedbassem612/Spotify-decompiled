package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class aal0 implements w6h1, p8h1 {
    public final r6h1 a;
    public final y6h1 b;

    public aal0(int i, String str, r6h1 r6h1Var) {
        this.a = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-heading";
        x6h1VarI.f = "10.3.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = z9l0.a(i);
        x6h1VarI.d = str;
        this.b = x6h1VarI.a();
    }

    public final w7h1 a(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, zno1.t(oqn1.n("destination", str))), this.b, this.a, System.currentTimeMillis());
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

    public final w7h1 h() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.b, this.a, System.currentTimeMillis());
    }
}
