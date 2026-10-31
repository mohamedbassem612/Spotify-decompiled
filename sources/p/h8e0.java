package p;

import androidx.compose.ui.text.font.FontFamily;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h8e0 extends FontFamily {
    public final w4b1 f;

    public h8e0(w4b1 w4b1Var) {
        this.f = w4b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h8e0) {
            return this.f == ((h8e0) obj).f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f + ")";
    }
}
