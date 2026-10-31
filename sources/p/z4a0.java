package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z4a0 implements a5a0 {
    public final nq90 a;

    public z4a0(nq90 nq90Var) {
        this.a = nq90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4a0) && u890.j(this.a, ((z4a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
