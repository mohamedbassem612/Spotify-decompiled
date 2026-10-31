package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bua0 {
    public static final bua0 d = new bua0(null, null, null, 63);
    public final iu30 a;
    public final iu30 b;
    public final iu30 c;

    public bua0(iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, int i) {
        iu30Var = (i & 1) != 0 ? null : iu30Var;
        iu30Var2 = (i & 4) != 0 ? null : iu30Var2;
        iu30Var3 = (i & 16) != 0 ? null : iu30Var3;
        this.a = iu30Var;
        this.b = iu30Var2;
        this.c = iu30Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bua0)) {
            return false;
        }
        bua0 bua0Var = (bua0) obj;
        return this.a == bua0Var.a && this.b == bua0Var.b && this.c == bua0Var.c;
    }

    public final int hashCode() {
        iu30 iu30Var = this.a;
        int iHashCode = (iu30Var != null ? iu30Var.hashCode() : 0) * 961;
        iu30 iu30Var2 = this.b;
        int iHashCode2 = (iHashCode + (iu30Var2 != null ? iu30Var2.hashCode() : 0)) * 961;
        iu30 iu30Var3 = this.c;
        return (iHashCode2 + (iu30Var3 != null ? iu30Var3.hashCode() : 0)) * 31;
    }
}
