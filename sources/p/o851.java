package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o851 implements g951 {
    public final Throwable a;

    public o851(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o851) && this.a.equals(((o851) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
