package androidx.compose.ui.text.font;

import java.util.List;
import p.gvg;
import p.p7h;
import p.rf80;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class FontWeight implements Comparable {
    public static final FontWeight N0;
    public static final FontWeight O0;
    public static final List P0;
    public static final FontWeight X;
    public static final FontWeight Y;
    public static final FontWeight Z;
    public static final FontWeight b;
    public static final FontWeight c;
    public static final FontWeight d;
    public static final FontWeight e;
    public static final FontWeight f;
    public static final FontWeight g;
    public static final FontWeight h;
    public static final FontWeight i;
    public static final FontWeight t;
    public final int a;

    static {
        FontWeight fontWeight = new FontWeight(100);
        FontWeight fontWeight2 = new FontWeight(200);
        FontWeight fontWeight3 = new FontWeight(300);
        FontWeight fontWeight4 = new FontWeight(400);
        b = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(500);
        c = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        d = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(700);
        e = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(800);
        f = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(900);
        g = fontWeight;
        h = fontWeight2;
        i = fontWeight3;
        t = fontWeight4;
        X = fontWeight5;
        Y = fontWeight6;
        Z = fontWeight7;
        N0 = fontWeight8;
        O0 = fontWeight9;
        P0 = p7h.M(new FontWeight[]{fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9});
    }

    public FontWeight(int i2) {
        this.a = i2;
        boolean z = false;
        if (1 <= i2 && i2 < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        rf80.a("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(FontWeight fontWeight) {
        return u890.q(this.a, fontWeight.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FontWeight) {
            return this.a == ((FontWeight) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return gvg.e(this.a, "FontWeight(weight=", ")");
    }
}
