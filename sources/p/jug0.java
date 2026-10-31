package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jug0 {
    public final int a;

    public static String a(int i) {
        if (i == 0) {
            return "Immediately";
        }
        if (i == 1) {
            return "WhileFocused";
        }
        bhn0.x(i, "invalid value: ");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jug0) {
            return this.a == ((jug0) obj).a;
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
