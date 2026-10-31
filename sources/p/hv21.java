package p;

import androidx.compose.ui.text.font.FontFamily;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hv21 {
    public final lee1 a;
    public final FontFamily b;
    public final float c;

    public hv21(lee1 lee1Var, FontFamily fontFamily, float f) {
        this.a = lee1Var;
        this.b = fontFamily;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv21)) {
            return false;
        }
        hv21 hv21Var = (hv21) obj;
        return this.a.equals(hv21Var.a) && u890.j(this.b, hv21Var.b) && Float.compare(this.c, hv21Var.c) == 0;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        FontFamily fontFamily = this.b;
        return Float.hashCode(this.c) + ((iHashCode + (fontFamily == null ? 0 : fontFamily.hashCode())) * 31);
    }
}
