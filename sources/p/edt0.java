package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class edt0 {
    public static final edt0 c = new edt0(0, false);
    public final boolean a;
    public final int b;

    public edt0(boolean z) {
        this.a = z;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edt0)) {
            return false;
        }
        edt0 edt0Var = (edt0) obj;
        return this.a == edt0Var.a && this.b == edt0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + f5x.a(this.b) + ")";
    }

    public edt0(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
