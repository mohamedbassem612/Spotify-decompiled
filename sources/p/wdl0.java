package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wdl0 implements w6h1 {
    public final y6h1 a;
    public final List b;

    public wdl0() {
        r6h1 r6h1Var = r6h1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-login-something-went-wrong-dialog";
        x6h1VarI.f = "0.1.0";
        x6h1VarI.g = "22.0.0";
        this.a = x6h1VarI.a();
        this.b = k4p1.x("login/somethingwentwrong");
    }

    @Override // p.n8h1
    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        dlg1 dlg1VarS = b3o1.s();
        dlg1VarS.s(this.a);
        dlg1VarS.C(r6h1.c);
        return dlg1VarS.f();
    }
}
