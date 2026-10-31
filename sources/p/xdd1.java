package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xdd1 {
    public final String a;
    public final int b;
    public final int c;

    public xdd1(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdd1)) {
            return false;
        }
        xdd1 xdd1Var = (xdd1) obj;
        return u890.j(this.a, xdd1Var.a) && this.b == xdd1Var.b && this.c == xdd1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return l1d.o(sb, this.c, ')');
    }
}
