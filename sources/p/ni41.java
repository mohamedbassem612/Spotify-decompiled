package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ni41 {
    public final ji41 a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final long e;

    public ni41(ji41 ji41Var, long j, boolean z, boolean z2, long j2) {
        this.a = ji41Var;
        this.b = j;
        this.c = z;
        this.d = z2;
        this.e = j2;
    }

    public static ni41 a(ni41 ni41Var, ji41 ji41Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            ji41Var = ni41Var.a;
        }
        ji41 ji41Var2 = ji41Var;
        if ((i & 2) != 0) {
            j = ni41Var.b;
        }
        long j3 = j;
        boolean z = (i & 4) != 0 ? ni41Var.c : true;
        boolean z2 = (i & 8) != 0 ? ni41Var.d : true;
        if ((i & 16) != 0) {
            j2 = ni41Var.e;
        }
        ni41Var.getClass();
        return new ni41(ji41Var2, j3, z, z2, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni41)) {
            return false;
        }
        ni41 ni41Var = (ni41) obj;
        return u890.j(this.a, ni41Var.a) && this.b == ni41Var.b && this.c == ni41Var.c && this.d == ni41Var.d && this.e == ni41Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + xcg1.g(xcg1.g(cy30.f(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31, this.d);
    }
}
