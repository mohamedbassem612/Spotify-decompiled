package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kca implements ko21 {
    public final faa0 a;

    public final boolean equals(Object obj) {
        if (obj instanceof kca) {
            return this.a.equals(((kca) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.a + ')';
    }
}
