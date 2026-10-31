package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b0m1 implements g0m1 {
    public final iyl1 a;
    public final String b;
    public final String c;

    public b0m1(iyl1 iyl1Var, String str, String str2) {
        this.a = iyl1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0m1)) {
            return false;
        }
        b0m1 b0m1Var = (b0m1) obj;
        return u890.j(this.a, b0m1Var.a) && this.b.equals(b0m1Var.b) && this.c.equals(b0m1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
