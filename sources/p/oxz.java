package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class oxz implements k700 {
    public final tan a;

    public oxz(tan tanVar) {
        this.a = tanVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxz) && this.a.equals(((oxz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
