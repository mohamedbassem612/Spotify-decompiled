package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o6f0 implements s6f0 {
    public final Throwable a;

    public o6f0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6f0) && this.a.equals(((o6f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
