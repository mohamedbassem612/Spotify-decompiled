package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zuj1 implements cvj1 {
    public final Throwable a;

    public zuj1(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zuj1) && this.a.equals(((zuj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
