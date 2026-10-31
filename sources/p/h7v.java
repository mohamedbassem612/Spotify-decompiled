package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h7v {
    public final boolean a;
    public final boolean b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final Integer g;
    public final Integer h;
    public final int i;
    public final int j;
    public final float k;
    public final Integer l;
    public final int m;
    public final float n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f26p;

    public h7v(boolean z, boolean z2, float f, float f2, float f3, float f4, Integer num, Integer num2, int i, int i2, float f5, Integer num3, int i3, float f6, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = num;
        this.h = num2;
        this.i = i;
        this.j = i2;
        this.k = f5;
        this.l = num3;
        this.m = i3;
        this.n = f6;
        this.o = z3;
        this.f26p = z4;
    }

    public static h7v a(h7v h7vVar, boolean z, boolean z2, float f, float f2, float f3, float f4, Integer num, Integer num2, int i, int i2, float f5, Integer num3, int i3, float f6, boolean z3, boolean z4, int i4) {
        boolean z5 = (i4 & 1) != 0 ? h7vVar.a : z;
        boolean z6 = (i4 & 2) != 0 ? h7vVar.b : z2;
        float f7 = (i4 & 4) != 0 ? h7vVar.c : f;
        float f8 = (i4 & 8) != 0 ? h7vVar.d : f2;
        float f9 = (i4 & 16) != 0 ? h7vVar.e : f3;
        float f10 = (i4 & 32) != 0 ? h7vVar.f : f4;
        Integer num4 = (i4 & 64) != 0 ? h7vVar.g : num;
        Integer num5 = (i4 & 128) != 0 ? h7vVar.h : num2;
        int i5 = (i4 & 256) != 0 ? h7vVar.i : i;
        int i6 = (i4 & 512) != 0 ? h7vVar.j : i2;
        float f11 = (i4 & 1024) != 0 ? h7vVar.k : f5;
        Integer num6 = (i4 & 2048) != 0 ? h7vVar.l : num3;
        int i7 = (i4 & 4096) != 0 ? h7vVar.m : i3;
        float f12 = (i4 & 8192) != 0 ? h7vVar.n : f6;
        boolean z7 = z5;
        boolean z8 = (i4 & 16384) != 0 ? h7vVar.o : z3;
        boolean z9 = (i4 & 32768) != 0 ? h7vVar.f26p : z4;
        h7vVar.getClass();
        return new h7v(z7, z6, f7, f8, f9, f10, num4, num5, i5, i6, f11, num6, i7, f12, z8, z9);
    }

    public final boolean b() {
        return this.a || this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7v)) {
            return false;
        }
        h7v h7vVar = (h7v) obj;
        return this.a == h7vVar.a && this.b == h7vVar.b && Float.compare(this.c, h7vVar.c) == 0 && Float.compare(this.d, h7vVar.d) == 0 && Float.compare(this.e, h7vVar.e) == 0 && Float.compare(this.f, h7vVar.f) == 0 && u890.j(this.g, h7vVar.g) && u890.j(this.h, h7vVar.h) && this.i == h7vVar.i && this.j == h7vVar.j && Float.compare(this.k, h7vVar.k) == 0 && u890.j(this.l, h7vVar.l) && this.m == h7vVar.m && Float.compare(this.n, h7vVar.n) == 0 && this.o == h7vVar.o && this.f26p == h7vVar.f26p;
    }

    public final int hashCode() {
        int iF = x0d.f(x0d.f(x0d.f(x0d.f(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        Integer num = this.g;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.h;
        int iF2 = x0d.f(kaa0.f(this.j, kaa0.f(this.i, (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31), 31, this.k);
        Integer num3 = this.l;
        return Boolean.hashCode(this.f26p) + xcg1.g(x0d.f(kaa0.f(this.m, (iF2 + (num3 != null ? num3.hashCode() : 0)) * 31, 31), 31, this.n), 31, this.o);
    }
}
