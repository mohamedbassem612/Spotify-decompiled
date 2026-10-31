package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g271 {
    public final u771 a;
    public final int b;
    public final int c;
    public final ela1 d;

    public g271(u771 u771Var, int i, int i2, ela1 ela1Var) {
        this.a = u771Var;
        this.b = i;
        this.c = i2;
        this.d = ela1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g271)) {
            return false;
        }
        g271 g271Var = (g271) obj;
        return u890.j(this.a, g271Var.a) && this.b == g271Var.b && this.c == g271Var.c && u890.j(this.d, g271Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ab80.k(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
