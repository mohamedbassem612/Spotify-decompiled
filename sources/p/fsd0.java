package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fsd0 extends isd0 {
    public final Throwable a;

    public fsd0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fsd0) && this.a.equals(((fsd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
