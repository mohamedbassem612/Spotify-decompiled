package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qn8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final d8r0 i;

    public qn8(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, String str5, d8r0 d8r0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str5;
        this.i = d8r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn8)) {
            return false;
        }
        qn8 qn8Var = (qn8) obj;
        return u890.j(this.a, qn8Var.a) && u890.j(this.b, qn8Var.b) && u890.j(this.c, qn8Var.c) && u890.j(this.d, qn8Var.d) && this.e == qn8Var.e && this.f == qn8Var.f && this.g == qn8Var.g && u890.j(this.h, qn8Var.h) && this.i.equals(qn8Var.i);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.i.hashCode() + cy30.d(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, false), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
