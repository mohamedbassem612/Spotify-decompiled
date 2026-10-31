package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g330 {
    public final int a;
    public final boolean b;
    public final z6p1 c;

    public g330(int i, boolean z, int i2) {
        z = (i2 & 2) != 0 ? false : z;
        z6p1 z6p1Var = (i2 & 4) != 0 ? f430.c : g430.c;
        this.a = i;
        this.b = z;
        this.c = z6p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g330)) {
            return false;
        }
        g330 g330Var = (g330) obj;
        return this.a == g330Var.a && this.b == g330Var.b && this.c.equals(g330Var.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() + xcg1.g(l1d.C(this.a) * 31, 31, this.b)) * 31;
    }
}
