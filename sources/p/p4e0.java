package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p4e0 extends r4e0 {
    public final Throwable a;

    public p4e0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p4e0) && this.a.equals(((p4e0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
