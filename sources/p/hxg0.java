package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hxg0 extends qxg0 {
    public final Throwable a;

    public hxg0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hxg0) && this.a.equals(((hxg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
