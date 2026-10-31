package p;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c2h1 {
    public final FontFamily a;
    public final FontWeight b;
    public final int c;
    public final int d;
    public final Object e;

    public c2h1(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj) {
        this.a = fontFamily;
        this.b = fontWeight;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2h1)) {
            return false;
        }
        c2h1 c2h1Var = (c2h1) obj;
        return u890.j(this.a, c2h1Var.a) && u890.j(this.b, c2h1Var.b) && this.c == c2h1Var.c && this.d == c2h1Var.d && u890.j(this.e, c2h1Var.e);
    }

    public final int hashCode() {
        FontFamily fontFamily = this.a;
        int iF = kaa0.f(this.d, kaa0.f(this.c, (((fontFamily == null ? 0 : fontFamily.hashCode()) * 31) + this.b.a) * 31, 31), 31);
        Object obj = this.e;
        return iF + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String strA = FontStyle.a(this.c);
        int i = this.d;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Weight";
        } else if (i == 2) {
            str = "Style";
        } else {
            str = i == 65535 ? "All" : "Invalid";
        }
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        bb00.j(sb, strA, ", fontSynthesis=", str, ", resourceLoaderCacheKey=");
        return td6.l(sb, this.e, ")");
    }
}
