package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g7o {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final h7o e;
    public final f7o f;

    public g7o(String str, String str2, String str3, String str4, h7o h7oVar, f7o f7oVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = h7oVar;
        this.f = f7oVar;
    }

    public static g7o a(g7o g7oVar) {
        return new g7o(g7oVar.a, g7oVar.b, null, g7oVar.d, g7oVar.e, g7oVar.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7o)) {
            return false;
        }
        g7o g7oVar = (g7o) obj;
        return u890.j(this.a, g7oVar.a) && this.b.equals(g7oVar.b) && u890.j(this.c, g7oVar.c) && u890.j(this.d, g7oVar.d) && u890.j(this.e, g7oVar.e) && u890.j(this.f, g7oVar.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        h7o h7oVar = this.e;
        return ((iHashCode2 + (h7oVar == null ? 0 : h7oVar.a.hashCode())) * 31) + (this.f != null ? 306129761 : 0);
    }
}
