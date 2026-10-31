package androidx.compose.ui.text.font;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class FontSynthesis {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof FontSynthesis) {
            return this.a == ((FontSynthesis) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Weight";
        }
        if (i == 2) {
            return "Style";
        }
        return i == 65535 ? "All" : "Invalid";
    }
}
