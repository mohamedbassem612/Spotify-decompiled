package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class biz0 extends eiz0 {
    public final Throwable a;

    public biz0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof biz0) && this.a.equals(((biz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
