package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xdu0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final iko h;

    public xdu0(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, iko ikoVar) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = ikoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdu0)) {
            return false;
        }
        xdu0 xdu0Var = (xdu0) obj;
        return this.a.equals(xdu0Var.a) && this.b == xdu0Var.b && this.c == xdu0Var.c && this.d == xdu0Var.d && this.e == xdu0Var.e && this.f == xdu0Var.f && this.g == xdu0Var.g && this.h == xdu0Var.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
