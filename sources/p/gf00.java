package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gf00 extends hf00 {
    public final int a;
    public final tr80 b;

    public gf00(int i, tr80 tr80Var) {
        this.a = i;
        this.b = tr80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf00)) {
            return false;
        }
        gf00 gf00Var = (gf00) obj;
        return this.a == gf00Var.a && this.b.equals(gf00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
