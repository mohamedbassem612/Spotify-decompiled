package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z1i1 implements a2i1 {
    public final ila0 a;

    public z1i1(ila0 ila0Var) {
        this.a = ila0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1i1) && this.a.equals(((z1i1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
