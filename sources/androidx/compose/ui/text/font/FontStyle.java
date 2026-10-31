package androidx.compose.ui.text.font;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class FontStyle {
    public final int a;

    public static String a(int i) {
        if (i == 0) {
            return "Normal";
        }
        return i == 1 ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FontStyle) {
            return this.a == ((FontStyle) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
