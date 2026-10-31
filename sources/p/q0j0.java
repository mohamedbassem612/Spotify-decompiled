package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q0j0 implements w0j0 {
    public final String a;
    public final ou80 b;

    public q0j0(String str, ou80 ou80Var) {
        this.a = str;
        this.b = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0j0)) {
            return false;
        }
        q0j0 q0j0Var = (q0j0) obj;
        return u890.j(this.a, q0j0Var.a) && u890.j(this.b, q0j0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ou80 ou80Var = this.b;
        return iHashCode + (ou80Var == null ? 0 : ou80Var.a.hashCode());
    }
}
