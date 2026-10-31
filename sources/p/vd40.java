package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vd40 implements xd40 {
    public final n4y0 a;

    public vd40(n4y0 n4y0Var) {
        this.a = n4y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vd40) && this.a.equals(((vd40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
