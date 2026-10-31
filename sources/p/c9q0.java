package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c9q0 {
    public final String a;
    public final k900 b;
    public final Boolean c;

    public c9q0(String str, k900 k900Var, Boolean bool) {
        this.a = str;
        this.b = k900Var;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9q0)) {
            return false;
        }
        c9q0 c9q0Var = (c9q0) obj;
        return this.a.equals(c9q0Var.a) && u890.j(this.b, c9q0Var.b) && u890.j(this.c, c9q0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        k900 k900Var = this.b;
        int iHashCode2 = (iHashCode + (k900Var == null ? 0 : k900Var.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }
}
