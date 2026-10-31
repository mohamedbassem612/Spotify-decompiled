package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i3s0 implements k3s0 {
    public final String a;
    public final String b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public i3s0(String str, String str2, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public static i3s0 a(i3s0 i3s0Var, long j, boolean z, boolean z2, boolean z3, int i) {
        String str = i3s0Var.a;
        String str2 = i3s0Var.b;
        if ((i & 4) != 0) {
            j = i3s0Var.c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z = i3s0Var.d;
        }
        boolean z4 = z;
        boolean z5 = i3s0Var.e;
        if ((i & 32) != 0) {
            z2 = i3s0Var.f;
        }
        boolean z6 = z2;
        if ((i & 64) != 0) {
            z3 = i3s0Var.g;
        }
        i3s0Var.getClass();
        return new i3s0(str, str2, j2, z4, z5, z6, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3s0)) {
            return false;
        }
        i3s0 i3s0Var = (i3s0) obj;
        return this.a.equals(i3s0Var.a) && this.b.equals(i3s0Var.b) && this.c == i3s0Var.c && this.d == i3s0Var.d && this.e == i3s0Var.e && this.f == i3s0Var.f && this.g == i3s0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g(xcg1.g(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), 31, this.d), 31, this.e), 31, this.f);
    }
}
