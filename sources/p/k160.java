package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k160 {
    public final wik a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Integer i;

    public k160(wik wikVar, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, Integer num) {
        this.a = wikVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k160)) {
            return false;
        }
        k160 k160Var = (k160) obj;
        return u890.j(this.a, k160Var.a) && u890.j(this.b, k160Var.b) && u890.j(this.c, k160Var.c) && u890.j(this.d, k160Var.d) && this.e == k160Var.e && this.f == k160Var.f && this.g == k160Var.g && this.h == k160Var.h && u890.j(this.i, k160Var.i);
    }

    public final int hashCode() {
        wik wikVar = this.a;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d((wikVar == null ? 0 : wikVar.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        Integer num = this.i;
        return iG + (num != null ? num.hashCode() : 0);
    }
}
