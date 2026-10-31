package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qd60 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final d8r0 h;
    public final q8b i;
    public final int j;

    public qd60(String str, String str2, int i, String str3, String str4, String str5, String str6, d8r0 d8r0Var, q8b q8bVar, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = d8r0Var;
        this.i = q8bVar;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd60)) {
            return false;
        }
        qd60 qd60Var = (qd60) obj;
        return u890.j(this.a, qd60Var.a) && u890.j(this.b, qd60Var.b) && this.c == qd60Var.c && u890.j(this.d, qd60Var.d) && u890.j(this.e, qd60Var.e) && u890.j(this.f, qd60Var.f) && u890.j(this.g, qd60Var.g) && this.h.equals(qd60Var.h) && this.i.equals(qd60Var.i) && this.j == qd60Var.j;
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        String str = this.e;
        return l1d.C(this.j) + ((this.i.hashCode() + hrt.i(this.h, cy30.d(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31)) * 31);
    }
}
