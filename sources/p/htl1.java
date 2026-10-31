package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class htl1 {
    public final ltl1 a;
    public final brl1 b;

    public htl1(ltl1 ltl1Var, brl1 brl1Var) {
        this.a = ltl1Var;
        this.b = brl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!htl1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        htl1 htl1Var = (htl1) obj;
        return this.a.equals(htl1Var.a) && this.b.equals(htl1Var.b);
    }

    public final int hashCode() {
        return (this.a.a * 31) + this.b.a;
    }

    public final String toString() {
        return "SizeClass { widthSizeClass: " + this.a + ", heightSizeClass: " + this.b + " }";
    }
}
