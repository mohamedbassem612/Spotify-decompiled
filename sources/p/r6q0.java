package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r6q0 {
    public final e6q0 a;

    public final boolean equals(Object obj) {
        if (obj instanceof r6q0) {
            return this.a.equals(((r6q0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPlatformNavigationItem(value=" + this.a + ")";
    }
}
