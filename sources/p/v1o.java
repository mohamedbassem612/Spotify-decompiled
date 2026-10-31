package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v1o implements c2o {
    public final String a;
    public final String b;
    public final String c;
    public final b2o d;
    public final String e;
    public final String f;
    public final String g;

    public v1o(String str, String str2, String str3, b2o b2oVar, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = b2oVar;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1o)) {
            return false;
        }
        v1o v1oVar = (v1o) obj;
        return this.a.equals(v1oVar.a) && this.b.equals(v1oVar.b) && this.c.equals(v1oVar.c) && this.d.equals(v1oVar.d) && u890.j(this.e, v1oVar.e) && u890.j(this.f, v1oVar.f) && u890.j(this.g, v1oVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
