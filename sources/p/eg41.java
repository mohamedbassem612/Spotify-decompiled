package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eg41 {
    public final float a;
    public final long b;
    public final ni20 c;

    public eg41(float f, long j, ni20 ni20Var) {
        this.a = f;
        this.b = j;
        this.c = ni20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg41)) {
            return false;
        }
        eg41 eg41Var = (eg41) obj;
        return Float.compare(this.a, eg41Var.a) == 0 && ofg1.a(this.b, eg41Var.b) && u890.j(this.c, eg41Var.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        int i = ofg1.c;
        return this.c.hashCode() + cy30.f(iHashCode, this.b, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ofg1.b(this.b) + ", animationSpec=" + this.c + ")";
    }

    public /* synthetic */ eg41(float f, int i, long j, ni20 ni20Var) {
        this(f, j, ni20Var);
    }
}
