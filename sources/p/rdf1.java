package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rdf1 {
    public final String a;
    public final String b;
    public final cvt0 c;
    public final String d;
    public final u7h e;
    public final String f;

    public rdf1(String str, String str2, cvt0 cvt0Var, String str3, u7h u7hVar, String str4) {
        this.a = str;
        this.b = str2;
        this.c = cvt0Var;
        this.d = str3;
        this.e = u7hVar;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdf1)) {
            return false;
        }
        rdf1 rdf1Var = (rdf1) obj;
        return u890.j(this.a, rdf1Var.a) && u890.j(this.b, rdf1Var.b) && u890.j(this.c, rdf1Var.c) && u890.j(this.d, rdf1Var.d) && u890.j(this.e, rdf1Var.e) && u890.j(this.f, rdf1Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        cvt0 cvt0Var = this.c;
        int iD2 = cy30.d((iD + (cvt0Var == null ? 0 : cvt0Var.hashCode())) * 31, 31, this.d);
        u7h u7hVar = this.e;
        int iHashCode = (iD2 + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31;
        String str = this.f;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public /* synthetic */ rdf1(String str, String str2, String str3, String str4) {
        this(str, str2, null, str3, null, str4);
    }
}
