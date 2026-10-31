package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pk1 {
    public final qk1 a;
    public final boolean b;
    public final String c;
    public final String d;
    public final j7p1 e;

    public /* synthetic */ pk1(qk1 qk1Var, boolean z, String str, String str2, j7p1 j7p1Var, int i) {
        this(qk1Var, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? sk1.c : j7p1Var);
    }

    public static pk1 a(pk1 pk1Var, qk1 qk1Var, j7p1 j7p1Var, int i) {
        if ((i & 1) != 0) {
            qk1Var = pk1Var.a;
        }
        qk1 qk1Var2 = qk1Var;
        boolean z = pk1Var.b;
        String str = pk1Var.c;
        String str2 = pk1Var.d;
        if ((i & 16) != 0) {
            j7p1Var = pk1Var.e;
        }
        return new pk1(qk1Var2, z, str, str2, j7p1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk1)) {
            return false;
        }
        pk1 pk1Var = (pk1) obj;
        return this.a == pk1Var.a && this.b == pk1Var.b && u890.j(this.c, pk1Var.c) && u890.j(this.d, pk1Var.d) && u890.j(this.e, pk1Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public pk1(qk1 qk1Var, boolean z, String str, String str2, j7p1 j7p1Var) {
        this.a = qk1Var;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = j7p1Var;
    }
}
