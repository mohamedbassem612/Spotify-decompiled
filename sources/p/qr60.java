package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qr60 {
    public final dlm a;
    public final y2k1 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public qr60(dlm dlmVar, y2k1 y2k1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.a = dlmVar;
        this.b = y2k1Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = z9;
        this.l = z10;
        this.m = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr60)) {
            return false;
        }
        qr60 qr60Var = (qr60) obj;
        return this.a == qr60Var.a && this.b == qr60Var.b && this.c == qr60Var.c && this.d == qr60Var.d && this.e == qr60Var.e && this.f == qr60Var.f && this.g == qr60Var.g && this.h == qr60Var.h && this.i == qr60Var.i && this.j == qr60Var.j && this.k == qr60Var.k && this.l == qr60Var.l && this.m == qr60Var.m;
    }

    public final int hashCode() {
        dlm dlmVar = this.a;
        return Boolean.hashCode(this.m) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.b.hashCode() + ((dlmVar == null ? 0 : dlmVar.hashCode()) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }
}
