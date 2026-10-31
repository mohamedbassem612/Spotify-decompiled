package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gk50 implements kk50 {
    public final Throwable a;

    public gk50(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gk50) && this.a.equals(((gk50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
