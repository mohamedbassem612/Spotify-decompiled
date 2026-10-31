package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vlt0 implements xlt0 {
    public final pry a;
    public final i5w b;

    public vlt0(pry pryVar, i5w i5wVar) {
        this.a = pryVar;
        this.b = i5wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vlt0) {
            vlt0 vlt0Var = (vlt0) obj;
            return u890.j(this.a, vlt0Var.a) && this.b == vlt0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
