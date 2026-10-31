package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j3a1 implements h4a1 {
    public final Boolean a;
    public final kx91 b;

    public j3a1(Boolean bool, kx91 kx91Var) {
        this.a = bool;
        this.b = kx91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3a1)) {
            return false;
        }
        j3a1 j3a1Var = (j3a1) obj;
        return u890.j(this.a, j3a1Var.a) && u890.j(this.b, j3a1Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        kx91 kx91Var = this.b;
        return iHashCode + (kx91Var != null ? kx91Var.hashCode() : 0);
    }
}
