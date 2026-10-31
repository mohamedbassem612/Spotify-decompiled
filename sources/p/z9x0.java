package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z9x0 extends yax0 {
    public final Throwable a;

    public z9x0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z9x0) && this.a.equals(((z9x0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
