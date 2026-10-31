package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nad1 {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final Integer e;
    public final boolean f;

    public nad1(String str, long j, long j2, boolean z, Integer num, boolean z2) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = num;
        this.f = z2;
    }

    public static nad1 a(nad1 nad1Var, boolean z, boolean z2, int i) {
        String str = nad1Var.a;
        long j = nad1Var.b;
        long j2 = nad1Var.c;
        if ((i & 8) != 0) {
            z = nad1Var.d;
        }
        boolean z3 = z;
        Integer num = nad1Var.e;
        if ((i & 32) != 0) {
            z2 = nad1Var.f;
        }
        nad1Var.getClass();
        return new nad1(str, j, j2, z3, num, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nad1)) {
            return false;
        }
        nad1 nad1Var = (nad1) obj;
        return this.a.equals(nad1Var.a) && this.b == nad1Var.b && this.c == nad1Var.c && this.d == nad1Var.d && u890.j(this.e, nad1Var.e) && this.f == nad1Var.f;
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d);
        Integer num = this.e;
        return Boolean.hashCode(this.f) + ((iG + (num == null ? 0 : num.hashCode())) * 31);
    }
}
