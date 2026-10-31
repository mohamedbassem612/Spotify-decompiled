package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h3j1 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ h3j1(String str, int i) {
        this(str, (i & 2) == 0, true, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3j1)) {
            return false;
        }
        h3j1 h3j1Var = (h3j1) obj;
        return u890.j(this.a, h3j1Var.a) && this.b == h3j1Var.b && this.c == h3j1Var.c && this.d == h3j1Var.d && this.e == h3j1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public h3j1(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }
}
