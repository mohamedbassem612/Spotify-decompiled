package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lbd implements obd {
    public final Throwable a;

    public lbd(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lbd) && this.a.equals(((lbd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
