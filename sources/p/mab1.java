package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mab1 implements ufp0 {
    public final i3i0 a;
    public final xcu0 b;
    public final n900 c;
    public final int d;
    public final ix21 e;
    public final int f;

    public mab1(i3i0 i3i0Var, xcu0 xcu0Var, n900 n900Var, int i, ix21 ix21Var, int i2) {
        this.a = i3i0Var;
        this.b = xcu0Var;
        this.c = n900Var;
        this.d = i;
        this.e = ix21Var;
        this.f = i2;
    }

    public final int a() {
        return this.d;
    }

    public final n900 b() {
        return this.c;
    }

    public final ix21 c() {
        return this.e;
    }

    public final i3i0 d() {
        return this.a;
    }

    public final xcu0 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mab1)) {
            return false;
        }
        mab1 mab1Var = (mab1) obj;
        return this.a.equals(mab1Var.a) && this.b.equals(mab1Var.b) && this.c.equals(mab1Var.c) && this.d == mab1Var.d && this.e == mab1Var.e && this.f == mab1Var.f;
    }

    public final int f() {
        return this.f;
    }

    public final int hashCode() {
        int iK = ab80.k(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
        ix21 ix21Var = this.e;
        int iHashCode = (iK + (ix21Var == null ? 0 : ix21Var.hashCode())) * 31;
        int i = this.f;
        return iHashCode + (i != 0 ? l1d.C(i) : 0);
    }
}
