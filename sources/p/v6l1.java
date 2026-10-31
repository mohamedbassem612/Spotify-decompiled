package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v6l1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final iq70 f;
    public final dlj1 g;
    public final String h;
    public final String i;
    public final iq70 j;
    public final String k;
    public final Float l;
    public final iq70 m;
    public final fah n;

    public v6l1(String str, String str2, String str3, String str4, String str5, iq70 iq70Var, dlj1 dlj1Var, String str6, String str7, iq70 iq70Var2, String str8, Float f, iq70 iq70Var3, fah fahVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = iq70Var;
        this.g = dlj1Var;
        this.h = str6;
        this.i = str7;
        this.j = iq70Var2;
        this.k = str8;
        this.l = f;
        this.m = iq70Var3;
        this.n = fahVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6l1)) {
            return false;
        }
        v6l1 v6l1Var = (v6l1) obj;
        return this.a.equals(v6l1Var.a) && this.b.equals(v6l1Var.b) && this.c.equals(v6l1Var.c) && this.d.equals(v6l1Var.d) && this.e.equals(v6l1Var.e) && this.f.equals(v6l1Var.f) && this.g.equals(v6l1Var.g) && this.h.equals(v6l1Var.h) && this.i.equals(v6l1Var.i) && this.j.equals(v6l1Var.j) && this.k.equals(v6l1Var.k) && u890.j(this.l, v6l1Var.l) && u890.j(this.m, v6l1Var.m) && u890.j(this.n, v6l1Var.n);
    }

    public final int hashCode() {
        int iD = cy30.d((this.j.hashCode() + cy30.d(cy30.d((this.g.hashCode() + ((this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31, 31, this.h), 31, this.i)) * 31, 31, this.k);
        Float f = this.l;
        int iHashCode = (iD + (f == null ? 0 : f.hashCode())) * 31;
        iq70 iq70Var = this.m;
        int iHashCode2 = (iHashCode + (iq70Var == null ? 0 : iq70Var.hashCode())) * 31;
        fah fahVar = this.n;
        return iHashCode2 + (fahVar != null ? fahVar.hashCode() : 0);
    }
}
