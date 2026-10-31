package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p2m implements r2m {
    public final Exception a;

    public p2m(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2m) && this.a.equals(((p2m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
