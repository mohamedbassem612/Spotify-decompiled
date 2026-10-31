package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mql1 implements mti0 {
    public final cra a;

    public mql1(cra craVar) {
        this.a = craVar;
    }

    @Override // p.mti0
    public final int a(ur80 ur80Var, long j, int i, flb0 flb0Var) {
        int i2 = (int) (j >> 32);
        if (i < i2) {
            return yoi1.p(this.a.a(i, i2, flb0Var), 0, i2 - i);
        }
        return c13.e(1.0f, flb0Var == flb0.a ? 0.0f : -0.0f, (i2 - i) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mql1) && this.a.equals(((mql1) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
