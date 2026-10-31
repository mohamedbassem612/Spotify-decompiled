package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class adx0 {
    public final Throwable a;

    public adx0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof adx0) && this.a.equals(((adx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
