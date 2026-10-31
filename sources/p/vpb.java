package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vpb implements ypb {
    public final Throwable a;

    public vpb(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vpb) && this.a.equals(((vpb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
