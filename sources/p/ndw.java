package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ndw {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Long e;
    public final tv80 f;
    public final String g;

    public ndw(Long l, String str, String str2, String str3, String str4, tv80 tv80Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = l;
        this.f = tv80Var;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndw)) {
            return false;
        }
        ndw ndwVar = (ndw) obj;
        return u890.j(this.a, ndwVar.a) && u890.j(this.b, ndwVar.b) && u890.j(this.c, ndwVar.c) && this.d == ndwVar.d && u890.j(this.e, ndwVar.e) && this.f.equals(ndwVar.f) && u890.j(this.g, ndwVar.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iG = xcg1.g((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        Long l = this.e;
        int iHashCode3 = (this.f.hashCode() + ((iG + (l == null ? 0 : l.hashCode())) * 31)) * 31;
        String str3 = this.g;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
