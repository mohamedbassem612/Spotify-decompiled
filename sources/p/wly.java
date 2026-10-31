package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wly implements xly {
    public final int a;

    public wly(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wly) && this.a == ((wly) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
