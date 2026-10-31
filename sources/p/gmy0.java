package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gmy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final wab l;

    public gmy0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, wab wabVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = wabVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gmy0) {
            gmy0 gmy0Var = (gmy0) obj;
            return this.a == gmy0Var.a && this.b == gmy0Var.b && this.c == gmy0Var.c && this.d == gmy0Var.d && this.e == gmy0Var.e && this.f == gmy0Var.f && this.g == gmy0Var.g && this.h == gmy0Var.h && this.i == gmy0Var.i && this.j == gmy0Var.j && this.k == gmy0Var.k && this.l == gmy0Var.l;
        }
        return false;
    }

    public final int hashCode() {
        return this.l.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
