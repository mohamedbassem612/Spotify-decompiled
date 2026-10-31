package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j3m0 implements w6h1 {
    public final r6h1 a;
    public final y6h1 b;
    public final List c;

    public j3m0(r6h1 r6h1Var) {
        this.a = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-voting-experience";
        x6h1VarI.f = "5.0.0";
        x6h1VarI.g = "22.0.0";
        this.b = x6h1VarI.a();
        this.c = p7h.M("playlist/ondemand", "voting/root", "voting/confirmation", "voting/share");
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
