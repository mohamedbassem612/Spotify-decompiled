package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pj91 extends bk91 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public pj91(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj91)) {
            return false;
        }
        pj91 pj91Var = (pj91) obj;
        return u890.j(this.a, pj91Var.a) && this.b == pj91Var.b && this.c == pj91Var.c && this.d == pj91Var.d && this.e == pj91Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public /* synthetic */ pj91(String str, boolean z, boolean z2) {
        this(str, z, z2, false, true);
    }
}
