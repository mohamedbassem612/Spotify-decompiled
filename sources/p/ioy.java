package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ioy implements joy {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final y4m g;
    public final r840 h;
    public final ast0 i;
    public final doy j;

    public ioy(String str, String str2, String str3, String str4, boolean z, boolean z2, y4m y4mVar, r840 r840Var, ast0 ast0Var, doy doyVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = y4mVar;
        this.h = r840Var;
        this.i = ast0Var;
        this.j = doyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioy)) {
            return false;
        }
        ioy ioyVar = (ioy) obj;
        return u890.j(this.a, ioyVar.a) && this.b.equals(ioyVar.b) && u890.j(this.c, ioyVar.c) && u890.j(this.d, ioyVar.d) && this.e == ioyVar.e && this.f == ioyVar.f && u890.j(this.g, ioyVar.g) && u890.j(this.h, ioyVar.h) && this.i == ioyVar.i && u890.j(this.j, ioyVar.j);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + xcg1.g(xcg1.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f)) * 31)) * 31)) * 31;
        doy doyVar = this.j;
        return iHashCode2 + (doyVar != null ? doyVar.hashCode() : 0);
    }
}
