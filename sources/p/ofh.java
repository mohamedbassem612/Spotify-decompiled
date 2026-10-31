package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ofh implements sfh {
    public final Throwable a;

    public ofh(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ofh) && this.a.equals(((ofh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
