package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uu81 implements vu81 {
    public final Throwable a;

    public uu81(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uu81) && u890.j(this.a, ((uu81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
