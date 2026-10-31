package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uof1 {
    public final jo70 a;
    public final jo70 b;
    public final mtl c;
    public final Boolean d;

    public uof1(jo70 jo70Var, jo70 jo70Var2, mtl mtlVar, Boolean bool) {
        this.a = jo70Var;
        this.b = jo70Var2;
        this.c = mtlVar;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uof1)) {
            return false;
        }
        uof1 uof1Var = (uof1) obj;
        return u890.j(this.a, uof1Var.a) && u890.j(this.b, uof1Var.b) && u890.j(this.c, uof1Var.c) && u890.j(this.d, uof1Var.d);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (jo70Var == null ? 0 : jo70Var.hashCode()) * 31;
        jo70 jo70Var2 = this.b;
        int iHashCode2 = (iHashCode + (jo70Var2 == null ? 0 : jo70Var2.hashCode())) * 31;
        mtl mtlVar = this.c;
        int iHashCode3 = (iHashCode2 + (mtlVar == null ? 0 : mtlVar.a.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }
}
