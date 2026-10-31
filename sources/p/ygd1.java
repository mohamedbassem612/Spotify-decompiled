package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ygd1 {
    public final xgd1 a;
    public final bpd b;
    public final int c;
    public final String d;

    public ygd1(xgd1 xgd1Var, bpd bpdVar, int i, String str) {
        this.a = xgd1Var;
        this.b = bpdVar;
        this.c = i;
        this.d = str;
    }

    public static ygd1 a(ygd1 ygd1Var, bpd bpdVar, int i, String str, int i2) {
        xgd1 xgd1Var = ygd1Var.a;
        if ((i2 & 2) != 0) {
            bpdVar = ygd1Var.b;
        }
        if ((i2 & 8) != 0) {
            str = ygd1Var.d;
        }
        return new ygd1(xgd1Var, bpdVar, i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygd1)) {
            return false;
        }
        ygd1 ygd1Var = (ygd1) obj;
        return u890.j(this.a, ygd1Var.a) && this.b.equals(ygd1Var.b) && this.c == ygd1Var.c && u890.j(this.d, ygd1Var.d);
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        return iK + (str == null ? 0 : str.hashCode());
    }
}
