package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l2u0 {
    public final boolean a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float f;
    public final boolean g;
    public final Integer h;
    public final Integer i;
    public final long j;

    public l2u0(boolean z, long j, long j2, long j3, long j4, float f, boolean z2, Integer num, Integer num2) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = f;
        this.g = z2;
        this.h = num;
        this.i = num2;
        this.j = j + j3;
    }

    public static l2u0 a(l2u0 l2u0Var, boolean z, long j, long j2, boolean z2, Integer num, int i) {
        return new l2u0((i & 1) != 0 ? l2u0Var.a : z, l2u0Var.b, l2u0Var.c, (i & 8) != 0 ? l2u0Var.d : j, (i & 16) != 0 ? l2u0Var.e : j2, l2u0Var.f, (i & 64) != 0 ? l2u0Var.g : z2, (i & 128) != 0 ? l2u0Var.h : num, l2u0Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2u0)) {
            return false;
        }
        l2u0 l2u0Var = (l2u0) obj;
        return this.a == l2u0Var.a && this.b == l2u0Var.b && this.c == l2u0Var.c && this.d == l2u0Var.d && this.e == l2u0Var.e && Float.compare(this.f, l2u0Var.f) == 0 && this.g == l2u0Var.g && u890.j(this.h, l2u0Var.h) && u890.j(this.i, l2u0Var.i);
    }

    public final int hashCode() {
        int iG = xcg1.g(x0d.f(cy30.f(cy30.f(cy30.f(cy30.f(Boolean.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), 31, this.f), 31, this.g);
        Integer num = this.h;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public /* synthetic */ l2u0(boolean z, long j, long j2, long j3, long j4, float f, Integer num, Integer num2, int i) {
        this(z, j, j2, j3, j4, f, false, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : num2);
    }
}
