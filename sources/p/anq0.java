package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class anq0 implements dnq0 {
    public final Exception a;

    public anq0(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof anq0) && this.a.equals(((anq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
