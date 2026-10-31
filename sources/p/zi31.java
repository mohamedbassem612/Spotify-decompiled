package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zi31 implements cj31 {
    public final Exception a;

    public zi31(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zi31) && this.a.equals(((zi31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
