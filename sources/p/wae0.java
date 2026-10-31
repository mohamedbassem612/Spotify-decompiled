package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wae0 implements ace0 {
    public final Throwable a;

    public wae0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wae0) && this.a.equals(((wae0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
