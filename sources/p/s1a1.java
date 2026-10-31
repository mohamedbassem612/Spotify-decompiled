package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s1a1 implements q2a1 {
    public final Boolean a;
    public final kx91 b;

    public s1a1(Boolean bool, kx91 kx91Var) {
        this.a = bool;
        this.b = kx91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1a1)) {
            return false;
        }
        s1a1 s1a1Var = (s1a1) obj;
        return u890.j(this.a, s1a1Var.a) && u890.j(this.b, s1a1Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        kx91 kx91Var = this.b;
        return iHashCode + (kx91Var != null ? kx91Var.hashCode() : 0);
    }
}
