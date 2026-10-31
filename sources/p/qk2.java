package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qk2 {
    public int a;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i;
    public boolean j;

    public final rk2 a() {
        return new rk2(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk2)) {
            return false;
        }
        qk2 qk2Var = (qk2) obj;
        return this.a == qk2Var.a && u890.j(this.b, qk2Var.b) && u890.j(this.c, qk2Var.c) && this.d == qk2Var.d && this.e == qk2Var.e && this.f == qk2Var.f && this.g == qk2Var.g && this.h == qk2Var.h && u890.j(this.i, qk2Var.i) && this.j == qk2Var.j;
    }

    public final int hashCode() {
        int iD = cy30.d(l1d.C(this.a) * 31, 31, this.b);
        String str = this.c;
        int iF = kaa0.f(this.h, kaa0.f(this.g, kaa0.f(this.f, kaa0.f(this.e, kaa0.f(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31);
        String str2 = this.i;
        return Boolean.hashCode(this.j) + ((iF + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
