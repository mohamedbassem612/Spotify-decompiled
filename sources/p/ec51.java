package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ec51 {
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final Integer f;
    public final ac51 g;
    public final long h;

    public ec51(int i, long j, long j2, int i2, int i3, Integer num, ac51 ac51Var, long j3) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = i2;
        this.e = i3;
        this.f = num;
        this.g = ac51Var;
        this.h = j3;
    }

    public static ec51 a(ec51 ec51Var, int i, long j, long j2, int i2, int i3, Integer num, ac51 ac51Var, long j3, int i4) {
        if ((i4 & 1) != 0) {
            i = ec51Var.a;
        }
        int i5 = i;
        long j4 = (i4 & 2) != 0 ? ec51Var.b : j;
        long j5 = (i4 & 4) != 0 ? ec51Var.c : j2;
        int i6 = (i4 & 8) != 0 ? ec51Var.d : i2;
        int i7 = (i4 & 16) != 0 ? ec51Var.e : i3;
        Integer num2 = (i4 & 32) != 0 ? ec51Var.f : num;
        ac51 ac51Var2 = (i4 & 64) != 0 ? ec51Var.g : ac51Var;
        long j6 = (i4 & 128) != 0 ? ec51Var.h : j3;
        ec51Var.getClass();
        return new ec51(i5, j4, j5, i6, i7, num2, ac51Var2, j6);
    }

    public final ac51 b() {
        return this.g;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.h;
    }

    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec51)) {
            return false;
        }
        ec51 ec51Var = (ec51) obj;
        return this.a == ec51Var.a && this.b == ec51Var.b && this.c == ec51Var.c && this.d == ec51Var.d && this.e == ec51Var.e && u890.j(this.f, ec51Var.f) && u890.j(this.g, ec51Var.g) && this.h == ec51Var.h;
    }

    public final int hashCode() {
        int i = this.a;
        int iF = kaa0.f(this.e, ab80.k(this.d, cy30.f(cy30.f((i == 0 ? 0 : l1d.C(i)) * 31, this.b, 31), this.c, 31), 31), 31);
        Integer num = this.f;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        ac51 ac51Var = this.g;
        return Long.hashCode(this.h) + ((iHashCode + (ac51Var != null ? ac51Var.hashCode() : 0)) * 31);
    }

    public /* synthetic */ ec51() {
        this(0, 0L, 0L, 1, 0, null, null, 0L);
    }
}
