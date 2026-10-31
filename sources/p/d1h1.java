package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d1h1 {
    public final y0h1 a;
    public final o8a0 b;

    public d1h1(y0h1 y0h1Var, o8a0 o8a0Var) {
        this.a = y0h1Var;
        this.b = o8a0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d1h1)) {
            return false;
        }
        d1h1 d1h1Var = (d1h1) obj;
        return u890.j(d1h1Var.a, this.a) && u890.j(d1h1Var.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        return this.b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.a + ", typeAttr=" + this.b + ')';
    }
}
