package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qw01 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final d8r0 f;
    public final int g;
    public final String h;
    public final int i;
    public final boolean j;

    public qw01(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, d8r0 d8r0Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = d8r0Var;
        this.g = i2;
        this.h = str5;
        this.i = i3;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw01)) {
            return false;
        }
        qw01 qw01Var = (qw01) obj;
        return u890.j(this.a, qw01Var.a) && u890.j(this.b, qw01Var.b) && u890.j(this.c, qw01Var.c) && this.d == qw01Var.d && u890.j(this.e, qw01Var.e) && this.f.equals(qw01Var.f) && this.g == qw01Var.g && u890.j(this.h, qw01Var.h) && this.i == qw01Var.i && this.j == qw01Var.j;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = this.d;
        return Boolean.hashCode(this.j) + kaa0.f(this.i, cy30.d(kaa0.f(this.g, hrt.i(this.f, cy30.d((iD + (i == 0 ? 0 : l1d.C(i))) * 31, 31, this.e), 31), 31), 31, this.h), 31);
    }
}
