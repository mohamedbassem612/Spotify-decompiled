package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j3s0 implements k3s0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final boolean f;

    public j3s0(int i, String str, String str2, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = i;
        this.f = z2;
    }

    public static j3s0 a(j3s0 j3s0Var, int i, boolean z, int i2) {
        String str = j3s0Var.a;
        String str2 = j3s0Var.b;
        String str3 = j3s0Var.c;
        boolean z2 = j3s0Var.d;
        if ((i2 & 32) != 0) {
            z = j3s0Var.f;
        }
        return new j3s0(i, str, str2, str3, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3s0)) {
            return false;
        }
        j3s0 j3s0Var = (j3s0) obj;
        return this.a.equals(j3s0Var.a) && this.b.equals(j3s0Var.b) && this.c.equals(j3s0Var.c) && this.d == j3s0Var.d && this.e == j3s0Var.e && this.f == j3s0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ab80.k(this.e, xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }
}
