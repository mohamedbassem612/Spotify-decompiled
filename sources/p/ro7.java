package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ro7 implements ez00 {
    public final double a;
    public final String b;
    public final int c;
    public final qo7 d;

    public ro7(double d, String str, int i, qo7 qo7Var) {
        this.a = d;
        this.b = str;
        this.c = i;
        this.d = qo7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro7)) {
            return false;
        }
        ro7 ro7Var = (ro7) obj;
        return Double.compare(this.a, ro7Var.a) == 0 && this.b.equals(ro7Var.b) && this.c == ro7Var.c && this.d.equals(ro7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ab80.k(this.c, cy30.d(Double.hashCode(this.a) * 31, 31, this.b), 31);
    }
}
