package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oxe0 implements w11 {
    public final cw80 a;

    public oxe0(cw80 cw80Var) {
        this.a = cw80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxe0) && this.a.equals(((oxe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
