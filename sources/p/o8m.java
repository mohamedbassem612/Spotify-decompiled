package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o8m implements q8m {
    public final Exception a;

    public o8m(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8m) && this.a.equals(((o8m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
