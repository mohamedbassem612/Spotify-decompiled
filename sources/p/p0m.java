package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p0m implements v0m {
    public final Exception a;

    public p0m(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0m) && this.a.equals(((p0m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
