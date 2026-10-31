package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r7g0 {
    public final j7g0 a;
    public final Boolean b;
    public final Boolean c;
    public final boolean d;

    public r7g0(j7g0 j7g0Var, Boolean bool, Boolean bool2, boolean z) {
        this.a = j7g0Var;
        this.b = bool;
        this.c = bool2;
        this.d = z;
    }

    public static r7g0 a(r7g0 r7g0Var, Boolean bool, Boolean bool2, int i) {
        j7g0 j7g0Var = r7g0Var.a;
        if ((i & 2) != 0) {
            bool = r7g0Var.b;
        }
        if ((i & 4) != 0) {
            bool2 = r7g0Var.c;
        }
        boolean z = r7g0Var.d;
        r7g0Var.getClass();
        return new r7g0(j7g0Var, bool, bool2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7g0)) {
            return false;
        }
        r7g0 r7g0Var = (r7g0) obj;
        return u890.j(this.a, r7g0Var.a) && u890.j(this.b, r7g0Var.b) && u890.j(this.c, r7g0Var.c) && this.d == r7g0Var.d;
    }

    public final int hashCode() {
        j7g0 j7g0Var = this.a;
        int iHashCode = (j7g0Var == null ? 0 : Boolean.hashCode(j7g0Var.a)) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }
}
