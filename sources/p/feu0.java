package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class feu0 extends heu0 {
    public final Throwable a;

    public feu0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof feu0) && this.a.equals(((feu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
