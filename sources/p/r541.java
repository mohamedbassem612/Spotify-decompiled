package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r541 implements t541 {
    public final String a;
    public final String b;
    public final Long c;
    public final List d;
    public final String e;
    public final jfv f;
    public final q541 g;
    public final String h;
    public final int i;
    public final String j;
    public final int k;
    public final qtt0 l;
    public final String m;
    public final String n;
    public final b9u0 o;

    public r541(String str, String str2, Long l, List list, String str3, jfv jfvVar, q541 q541Var, String str4, int i, String str5, int i2, qtt0 qtt0Var, String str6, String str7, b9u0 b9u0Var) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = list;
        this.e = str3;
        this.f = jfvVar;
        this.g = q541Var;
        this.h = str4;
        this.i = i;
        this.j = str5;
        this.k = i2;
        this.l = qtt0Var;
        this.m = str6;
        this.n = str7;
        this.o = b9u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r541)) {
            return false;
        }
        r541 r541Var = (r541) obj;
        return u890.j(this.a, r541Var.a) && this.b.equals(r541Var.b) && u890.j(this.c, r541Var.c) && this.d.equals(r541Var.d) && u890.j(this.e, r541Var.e) && u890.j(this.f, r541Var.f) && this.g == r541Var.g && u890.j(this.h, r541Var.h) && this.i == r541Var.i && this.j.equals(r541Var.j) && this.k == r541Var.k && this.l == r541Var.l && u890.j(this.m, r541Var.m) && this.n.equals(r541Var.n) && this.o.equals(r541Var.o);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        int iB = f4i1.b((iD + (l == null ? 0 : l.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        jfv jfvVar = this.f;
        int iHashCode2 = (iHashCode + (jfvVar == null ? 0 : Long.hashCode(jfvVar.a))) * 31;
        q541 q541Var = this.g;
        int iHashCode3 = (iHashCode2 + (q541Var == null ? 0 : q541Var.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        int i = this.i;
        int iD2 = cy30.d((iHashCode4 + (i == 0 ? 0 : l1d.C(i))) * 31, 31, this.j);
        int i2 = this.k;
        return this.o.hashCode() + cy30.d(cy30.d((this.l.hashCode() + ((iD2 + (i2 != 0 ? l1d.C(i2) : 0)) * 31)) * 31, 31, this.m), 31, this.n);
    }
}
