package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o7g implements q7g {
    public final Throwable a;

    public o7g(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o7g) && this.a.equals(((o7g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
