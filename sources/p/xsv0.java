package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xsv0 {
    public final aq50 a;
    public final int b;
    public final boolean c;

    public xsv0(aq50 aq50Var, int i, boolean z) {
        this.a = aq50Var;
        this.b = i;
        this.c = z;
    }

    public static xsv0 a(xsv0 xsv0Var, boolean z) {
        aq50 aq50Var = xsv0Var.a;
        int i = xsv0Var.b;
        xsv0Var.getClass();
        return new xsv0(aq50Var, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsv0)) {
            return false;
        }
        xsv0 xsv0Var = (xsv0) obj;
        return this.a.equals(xsv0Var.a) && this.b == xsv0Var.b && this.c == xsv0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
