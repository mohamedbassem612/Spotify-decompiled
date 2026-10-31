package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hgi1 implements jgi1 {
    public final af5 a;

    public hgi1(af5 af5Var) {
        this.a = af5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgi1) && this.a.equals(((hgi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
