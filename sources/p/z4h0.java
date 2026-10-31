package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z4h0 implements h5h0 {
    public final xv2 a;
    public final String b;

    public z4h0(xv2 xv2Var, String str) {
        this.a = xv2Var;
        this.b = str;
    }

    public static z4h0 a(z4h0 z4h0Var, xv2 xv2Var, String str, int i) {
        if ((i & 4) != 0) {
            str = z4h0Var.b;
        }
        return new z4h0(xv2Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4h0)) {
            return false;
        }
        z4h0 z4h0Var = (z4h0) obj;
        return u890.j(this.a, z4h0Var.a) && u890.j(this.b, z4h0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
