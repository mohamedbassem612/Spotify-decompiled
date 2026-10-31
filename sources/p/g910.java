package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g910 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Integer e;

    public g910(boolean z, boolean z2, boolean z3, boolean z4, Integer num) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g910)) {
            return false;
        }
        g910 g910Var = (g910) obj;
        return this.a == g910Var.a && this.b == g910Var.b && this.c == g910Var.c && this.d == g910Var.d && u890.j(this.e, g910Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        Integer num = this.e;
        return iG + (num == null ? 0 : num.hashCode());
    }
}
