package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w4d1 implements g5d1 {
    public final g7d1 a;
    public final yf b;

    public w4d1(g7d1 g7d1Var, yf yfVar) {
        this.a = g7d1Var;
        this.b = yfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4d1)) {
            return false;
        }
        w4d1 w4d1Var = (w4d1) obj;
        return this.a.equals(w4d1Var.a) && this.b.equals(w4d1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
