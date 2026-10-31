package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k891 {
    public final x340 a;

    public final boolean equals(Object obj) {
        if (obj instanceof k891) {
            return this.a == ((k891) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.a + ")";
    }
}
