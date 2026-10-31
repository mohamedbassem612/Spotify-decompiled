package p;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jz51 {
    public final lzn0 a;
    public final a1r0 b;
    public final dg30 c;

    public jz51(lzn0 lzn0Var, a1r0 a1r0Var, dg30 dg30Var) {
        this.a = lzn0Var;
        this.b = a1r0Var;
        this.c = dg30Var;
    }

    public final void a(String str) {
        Set set = s4b1.f;
        String strJ = uic.x(str).j();
        if (strJ == null) {
            strJ = "";
        }
        String strConcat = "spotify:readalong:selection:".concat(strJ);
        Bundle bundleH = mno1.h(new mmr0[]{new mmr0("selectionParams", new c061(str))});
        dg30 dg30Var = this.c;
        lzn0 lzn0Var = this.a;
        if (lzn0Var.j(dg30Var)) {
            lzn0Var.i(new dwn0(strConcat, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), bundleH);
        } else {
            a1r0.j(this.b, strConcat, (String) null, bundleH, false, 10);
        }
    }
}
