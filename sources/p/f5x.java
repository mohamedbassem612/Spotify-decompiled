package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f5x {
    public final int a;

    public static String a(int i) {
        if (i == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i == 1) {
            return "EmojiSupportMatch.None";
        }
        return i == 2 ? "EmojiSupportMatch.All" : gvg.e(i, "Invalid(value=", ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f5x) {
            return this.a == ((f5x) obj).a;
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
