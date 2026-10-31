package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vpd0 {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (obj instanceof vpd0) {
            return this.a == ((vpd0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a ? 1 : 0);
    }

    public final String toString() {
        boolean z = this.a;
        if (z) {
            return z ? "Assertive" : "Unknown";
        }
        return "Polite";
    }
}
