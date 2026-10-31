package p;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k930 {
    public final FontFamily a;
    public final FontWeight b;

    public k930(FontFamily fontFamily, FontWeight fontWeight) {
        this.a = fontFamily;
        this.b = fontWeight;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k930)) {
            return false;
        }
        k930 k930Var = (k930) obj;
        return u890.j(this.a, k930Var.a) && u890.j(this.b, k930Var.b);
    }

    public final int hashCode() {
        FontFamily fontFamily = this.a;
        int iHashCode = (fontFamily == null ? 0 : fontFamily.hashCode()) * 31;
        FontWeight fontWeight = this.b;
        return iHashCode + (fontWeight != null ? fontWeight.a : 0);
    }
}
