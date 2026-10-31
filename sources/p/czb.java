package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class czb {
    public final String a;
    public final String b;
    public final azh1 c;
    public final bzb d;
    public final bzb e;
    public final zyh1 f;

    public czb(String str, String str2, azh1 azh1Var, bzb bzbVar, bzb bzbVar2, zyh1 zyh1Var) {
        this.a = str;
        this.b = str2;
        this.c = azh1Var;
        this.d = bzbVar;
        this.e = bzbVar2;
        this.f = zyh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czb)) {
            return false;
        }
        czb czbVar = (czb) obj;
        return u890.j(this.a, czbVar.a) && u890.j(this.b, czbVar.b) && u890.j(this.c, czbVar.c) && this.d.equals(czbVar.d) && u890.j(this.e, czbVar.e) && u890.j(this.f, czbVar.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        azh1 azh1Var = this.c;
        int iHashCode = (this.d.hashCode() + ((iD + (azh1Var == null ? 0 : azh1Var.hashCode())) * 31)) * 31;
        bzb bzbVar = this.e;
        int iHashCode2 = (iHashCode + (bzbVar == null ? 0 : bzbVar.hashCode())) * 31;
        zyh1 zyh1Var = this.f;
        return iHashCode2 + (zyh1Var != null ? zyh1Var.hashCode() : 0);
    }
}
