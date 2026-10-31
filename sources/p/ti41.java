package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ti41 implements vi41 {
    public final Exception a;

    public ti41(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ti41) && this.a.equals(((ti41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
