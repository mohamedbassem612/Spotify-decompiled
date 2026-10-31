package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ovs0 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final int h;

    public ovs0(int i, int i2, boolean z, boolean z2, boolean z3, String str, String str2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str;
        this.g = str2;
        this.h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovs0)) {
            return false;
        }
        ovs0 ovs0Var = (ovs0) obj;
        return this.a == ovs0Var.a && this.b == ovs0Var.b && this.c == ovs0Var.c && this.d == ovs0Var.d && this.e == ovs0Var.e && u890.j(this.f, ovs0Var.f) && u890.j(this.g, ovs0Var.g) && this.h == ovs0Var.h;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return Integer.hashCode(this.h) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
