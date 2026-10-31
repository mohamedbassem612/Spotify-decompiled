package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b1a0 implements d1a0 {
    public final Throwable a;

    public b1a0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1a0) && this.a.equals(((b1a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
