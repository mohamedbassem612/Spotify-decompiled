package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a5y {
    public final bpu a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final ou80 g;

    public a5y(bpu bpuVar, String str, String str2, boolean z, int i, boolean z2, ou80 ou80Var) {
        this.a = bpuVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = i;
        this.f = z2;
        this.g = ou80Var;
    }

    public static a5y a(a5y a5yVar, bpu bpuVar, String str, String str2, boolean z, int i, ou80 ou80Var, int i2) {
        if ((i2 & 1) != 0) {
            bpuVar = a5yVar.a;
        }
        bpu bpuVar2 = bpuVar;
        if ((i2 & 2) != 0) {
            str = a5yVar.b;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = a5yVar.c;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            z = a5yVar.d;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            i = a5yVar.e;
        }
        int i3 = i;
        boolean z3 = (i2 & 32) != 0 ? a5yVar.f : false;
        if ((i2 & 64) != 0) {
            ou80Var = a5yVar.g;
        }
        a5yVar.getClass();
        return new a5y(bpuVar2, str3, str4, z2, i3, z3, ou80Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5y)) {
            return false;
        }
        a5y a5yVar = (a5y) obj;
        return u890.j(this.a, a5yVar.a) && u890.j(this.b, a5yVar.b) && u890.j(this.c, a5yVar.c) && this.d == a5yVar.d && this.e == a5yVar.e && this.f == a5yVar.f && u890.j(this.g, a5yVar.g);
    }

    public final int hashCode() {
        bpu bpuVar = this.a;
        int iG = xcg1.g(ab80.k(this.e, xcg1.g(cy30.d(cy30.d((bpuVar == null ? 0 : bpuVar.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f);
        ou80 ou80Var = this.g;
        return iG + (ou80Var != null ? ou80Var.a.hashCode() : 0);
    }

    public /* synthetic */ a5y() {
        this(null, "not-set", "not-set", false, 1, true, null);
    }
}
