package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mde1 {
    public final int a;
    public final String b;
    public final long c;
    public final ode1 d;
    public final boolean e;
    public final long f;
    public final boolean g;

    public mde1(int i, String str, long j, ode1 ode1Var, boolean z, long j2, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = ode1Var;
        this.e = z;
        this.f = j2;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mde1)) {
            return false;
        }
        mde1 mde1Var = (mde1) obj;
        return this.a == mde1Var.a && u890.j(this.b, mde1Var.b) && this.c == mde1Var.c && this.d.equals(mde1Var.d) && this.e == mde1Var.e && this.f == mde1Var.f && this.g == mde1Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + cy30.f(xcg1.g((this.d.hashCode() + cy30.f(cy30.d(l1d.C(this.a) * 31, 31, this.b), this.c, 31)) * 31, 31, this.e), this.f, 31);
    }
}
