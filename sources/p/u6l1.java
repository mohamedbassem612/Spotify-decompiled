package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u6l1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final aq70 f;
    public final blj1 g;
    public final String h;
    public final String i;
    public final aq70 j;
    public final String k;
    public final Float l;
    public final u7h m;

    public u6l1(String str, String str2, String str3, String str4, String str5, aq70 aq70Var, blj1 blj1Var, String str6, String str7, aq70 aq70Var2, String str8, Float f, u7h u7hVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = aq70Var;
        this.g = blj1Var;
        this.h = str6;
        this.i = str7;
        this.j = aq70Var2;
        this.k = str8;
        this.l = f;
        this.m = u7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6l1)) {
            return false;
        }
        u6l1 u6l1Var = (u6l1) obj;
        return this.a.equals(u6l1Var.a) && this.b.equals(u6l1Var.b) && this.c.equals(u6l1Var.c) && this.d.equals(u6l1Var.d) && this.e.equals(u6l1Var.e) && this.f.equals(u6l1Var.f) && this.g.equals(u6l1Var.g) && this.h.equals(u6l1Var.h) && this.i.equals(u6l1Var.i) && this.j.equals(u6l1Var.j) && this.k.equals(u6l1Var.k) && u890.j(this.l, u6l1Var.l) && u890.j(this.m, u6l1Var.m);
    }

    public final int hashCode() {
        int iD = cy30.d((this.j.hashCode() + cy30.d(cy30.d((this.g.hashCode() + ((this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31, 31, this.h), 31, this.i)) * 31, 31, this.k);
        Float f = this.l;
        int iHashCode = (iD + (f == null ? 0 : f.hashCode())) * 31;
        u7h u7hVar = this.m;
        return iHashCode + (u7hVar != null ? z4h1.c(u7hVar.a) : 0);
    }
}
