package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s7g0 {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;

    public s7g0(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = bool4;
    }

    public static s7g0 a(s7g0 s7g0Var, Boolean bool, Boolean bool2, Boolean bool3, int i) {
        if ((i & 1) != 0) {
            bool = s7g0Var.a;
        }
        Boolean bool4 = s7g0Var.b;
        if ((i & 4) != 0) {
            bool2 = s7g0Var.c;
        }
        if ((i & 8) != 0) {
            bool3 = s7g0Var.d;
        }
        s7g0Var.getClass();
        return new s7g0(bool, bool4, bool2, bool3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7g0)) {
            return false;
        }
        s7g0 s7g0Var = (s7g0) obj;
        return u890.j(this.a, s7g0Var.a) && u890.j(this.b, s7g0Var.b) && u890.j(this.c, s7g0Var.c) && u890.j(this.d, s7g0Var.d);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.d;
        return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }
}
