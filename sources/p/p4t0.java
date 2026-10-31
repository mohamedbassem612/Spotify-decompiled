package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p4t0 {
    public final jge a;
    public final zob1 b;

    public p4t0(jge jgeVar, zob1 zob1Var) {
        this.a = jgeVar;
        this.b = zob1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p4t0) {
            p4t0 p4t0Var = (p4t0) obj;
            if (this.a == p4t0Var.a && u890.j(this.b, p4t0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
