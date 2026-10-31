package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o8m0 implements q8m0 {
    public final pae a;

    public o8m0(pae paeVar) {
        this.a = paeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8m0) && this.a == ((o8m0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
