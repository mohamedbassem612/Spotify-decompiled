package p;

import androidx.compose.ui.text.PlatformSpanStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wdt0 {
    public final PlatformSpanStyle a;
    public final edt0 b;

    public wdt0(boolean z) {
        this(null, new edt0(z));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdt0)) {
            return false;
        }
        wdt0 wdt0Var = (wdt0) obj;
        return u890.j(this.b, wdt0Var.b) && u890.j(this.a, wdt0Var.a);
    }

    public final int hashCode() {
        PlatformSpanStyle platformSpanStyle = this.a;
        int iHashCode = (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0) * 31;
        edt0 edt0Var = this.b;
        return iHashCode + (edt0Var != null ? edt0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ")";
    }

    public wdt0(PlatformSpanStyle platformSpanStyle, edt0 edt0Var) {
        this.a = platformSpanStyle;
        this.b = edt0Var;
    }
}
