package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sia1 {
    public final r3d0 a;
    public final qxc0 b;

    public sia1(r3d0 r3d0Var, qxc0 qxc0Var) {
        this.a = r3d0Var;
        this.b = qxc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sia1)) {
            return false;
        }
        sia1 sia1Var = (sia1) obj;
        return u890.j(this.a, sia1Var.a) && this.b.equals(sia1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
