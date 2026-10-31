package p;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g930 implements f930 {
    public final w741 a;
    public final pj4 b;
    public final ptf1 c;
    public final j930 d;
    public final l1p0 e;
    public final gv20 f;

    public g930(w741 w741Var, pj4 pj4Var) {
        ptf1 ptf1Var = h930.a;
        j930 j930Var = new j930(h930.b);
        l1p0 l1p0Var = new l1p0();
        this.a = w741Var;
        this.b = pj4Var;
        this.c = ptf1Var;
        this.d = j930Var;
        this.e = l1p0Var;
        this.f = new gv20(this, (byte) 1);
    }

    public final f2h1 a(FontFamily fontFamily, FontWeight fontWeight, int i, int i2) {
        int i3 = this.b.a;
        c2h1 c2h1Var = new c2h1(fontFamily, (i3 == 0 || i3 == Integer.MAX_VALUE) ? fontWeight : new FontWeight(yoi1.p(fontWeight.a + i3, 1, 1000)), i, i2, null);
        return this.c.v(c2h1Var, new b6(this, c2h1Var, (byte) 23));
    }
}
