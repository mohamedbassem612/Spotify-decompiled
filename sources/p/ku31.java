package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ku31 {
    public final String a;
    public final cob1 b;
    public final u061 c;

    public ku31(String str, cob1 cob1Var, u061 u061Var) {
        this.a = str;
        this.b = cob1Var;
        this.c = u061Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku31)) {
            return false;
        }
        ku31 ku31Var = (ku31) obj;
        return u890.j(this.a, ku31Var.a) && this.b == ku31Var.b && u890.j(this.c, ku31Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        cob1 cob1Var = this.b;
        int iHashCode2 = (iHashCode + (cob1Var == null ? 0 : cob1Var.hashCode())) * 31;
        u061 u061Var = this.c;
        return iHashCode2 + (u061Var != null ? Boolean.hashCode(u061Var.a) : 0);
    }
}
