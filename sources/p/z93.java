package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z93 {
    public final qxc0 a;
    public final jo70 b;

    public z93(qxc0 qxc0Var, jo70 jo70Var) {
        this.a = qxc0Var;
        this.b = jo70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z93)) {
            return false;
        }
        z93 z93Var = (z93) obj;
        return this.a.equals(z93Var.a) && u890.j(this.b, z93Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jo70 jo70Var = this.b;
        return iHashCode + (jo70Var == null ? 0 : jo70Var.hashCode());
    }
}
