package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c3e0 implements g3e0 {
    public final Throwable a;

    public c3e0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c3e0) && this.a.equals(((c3e0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
