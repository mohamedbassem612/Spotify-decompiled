package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b4b0 {
    public static final b4b0 c = new b4b0(0, null);
    public final int a;
    public final y3b0 b;

    public b4b0(int i, y3b0 y3b0Var) {
        this.a = i;
        this.b = y3b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4b0)) {
            return false;
        }
        b4b0 b4b0Var = (b4b0) obj;
        return this.a == b4b0Var.a && u890.j(this.b, b4b0Var.b);
    }

    public final int hashCode() {
        int i = this.a;
        int iC = (i == 0 ? 0 : l1d.C(i)) * 31;
        y3b0 y3b0Var = this.b;
        return iC + (y3b0Var != null ? y3b0Var.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("KmTypeProjection(variance=");
        int i = this.a;
        if (i == 1) {
            str = "INVARIANT";
        } else if (i != 2) {
            str = i != 3 ? "null" : "OUT";
        } else {
            str = "IN";
        }
        sb.append(str);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
