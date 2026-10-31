package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ui41 implements vi41 {
    public final Exception a;

    public ui41(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ui41) && this.a.equals(((ui41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
