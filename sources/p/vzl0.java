package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vzl0 implements w6h1 {
    public final y6h1 a;
    public final List b;

    public vzl0() {
        r6h1 r6h1Var = r6h1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-signup-account-already-exists-modal";
        x6h1VarI.f = "2.0.0";
        x6h1VarI.g = "22.0.0";
        this.a = x6h1VarI.a();
        this.b = k4p1.x("signup/accountalreadyexists");
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
