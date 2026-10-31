package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q9l0 implements t9h1 {
    public final y6h1 a;
    public final List b;

    public q9l0(int i) {
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-genpods-prompt-page";
        x6h1VarI.f = "1.2.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.e = s7l0.a(i);
        this.a = x6h1VarI.a();
        this.b = k4p1.x("bluejay/create");
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        dlg1 dlg1VarS = b3o1.s();
        dlg1VarS.s(this.a);
        return dlg1VarS.f();
    }
}
