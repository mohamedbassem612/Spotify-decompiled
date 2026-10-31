package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class es01 extends vxo1 {
    public final Throwable c;

    public es01(Throwable th) {
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof es01) && u890.j(this.c, ((es01) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
