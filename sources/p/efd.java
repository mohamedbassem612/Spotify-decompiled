package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class efd implements hfd {
    public final Throwable a;

    public efd(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof efd) && this.a.equals(((efd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
