package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n6j1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final x360 f;
    public final n1x g;
    public final String h;

    public n6j1(String str, String str2, String str3, String str4, String str5, x360 x360Var, n1x n1xVar, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = x360Var;
        this.g = n1xVar;
        this.h = str6;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6j1)) {
            return false;
        }
        n6j1 n6j1Var = (n6j1) obj;
        return this.a.equals(n6j1Var.a) && this.b.equals(n6j1Var.b) && this.c.equals(n6j1Var.c) && u890.j(this.d, n6j1Var.d) && this.e.equals(n6j1Var.e) && u890.j(this.f, n6j1Var.f) && u890.j(this.g, n6j1Var.g) && this.h.equals(n6j1Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iD2 = cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        x360 x360Var = this.f;
        int iHashCode = (iD2 + (x360Var == null ? 0 : x360Var.hashCode())) * 31;
        n1x n1xVar = this.g;
        return this.h.hashCode() + ((iHashCode + (n1xVar != null ? n1xVar.hashCode() : 0)) * 31);
    }
}
