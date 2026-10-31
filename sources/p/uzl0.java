package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uzl0 implements t9h1 {
    public final y6h1 a;
    public final List b;

    public uzl0(String str) {
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-side-drawer";
        x6h1VarI.f = "7.1.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = str;
        x6h1VarI.d = "spotify:activitycenter";
        this.a = x6h1VarI.a();
        this.b = p7h.M("sidedrawer", "home", "home-funkis", "yourlibrary", "search", "find");
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        dlg1 dlg1VarS = b3o1.s();
        dlg1VarS.s(this.a);
        return dlg1VarS.f();
    }
}
