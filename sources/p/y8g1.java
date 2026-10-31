package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y8g1 {
    public final mwz0 a;
    public final gcg1 b;

    public y8g1(mwz0 mwz0Var, gcg1 gcg1Var) {
        this.a = mwz0Var;
        this.b = gcg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8g1)) {
            return false;
        }
        y8g1 y8g1Var = (y8g1) obj;
        return this.a.equals(y8g1Var.a) && u890.j(this.b, y8g1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }
}
