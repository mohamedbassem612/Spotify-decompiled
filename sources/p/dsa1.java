package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dsa1 {
    public final String a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public dsa1(String str, int i, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsa1)) {
            return false;
        }
        dsa1 dsa1Var = (dsa1) obj;
        return u890.j(this.a, dsa1Var.a) && this.b == dsa1Var.b && this.c == dsa1Var.c && this.d == dsa1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public /* synthetic */ dsa1() {
        this("", 100, false, false);
    }
}
