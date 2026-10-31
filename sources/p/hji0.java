package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hji0 {
    public final String a;
    public final String b;
    public final jyo1 c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public hji0(String str, String str2, jyo1 jyo1Var, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = jyo1Var;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
    }

    public final boolean equals(Object obj) {
        Object obj2 = 0;
        if (this == obj) {
            return true;
        }
        if (obj instanceof hji0) {
            hji0 hji0Var = (hji0) obj;
            if (this.a.equals(hji0Var.a) && this.b.equals(hji0Var.b) && this.c.equals(hji0Var.c) && this.d == hji0Var.d && this.e.equals(hji0Var.e) && this.f.equals(hji0Var.f) && this.g.equals(hji0Var.g) && obj2.equals(obj2) && this.h.equals(hji0Var.h) && u890.j(this.i, hji0Var.i) && this.j.equals(hji0Var.j) && this.k.equals(hji0Var.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = 0;
        int iD = cy30.d((num.hashCode() + cy30.d(cy30.d(cy30.d(xcg1.g((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.h);
        String str = this.i;
        return this.k.hashCode() + cy30.d((iD + (str != null ? str.hashCode() : 0)) * 31, 31, this.j);
    }
}
