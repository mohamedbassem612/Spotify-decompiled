package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class avb0 implements jsb0 {
    public final int a;
    public final Object b;
    public final List c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final Object i;
    public final bsb0 j;
    public final long k;
    public boolean l = true;
    public final int m;
    public final int n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f13p;
    public final int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public final long v;
    public long w;

    public avb0(int i, Object obj, List list, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj2, bsb0 bsb0Var, long j) {
        int i7;
        int i8;
        int i9;
        this.a = i;
        this.b = obj;
        this.c = list;
        this.d = z;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = obj2;
        this.j = bsb0Var;
        this.k = j;
        int i10 = 1;
        if (!list.isEmpty()) {
            q5t0 q5t0Var = (q5t0) list.get(0);
            i7 = z ? q5t0Var.b : q5t0Var.a;
            int iL = p7h.L(list);
            if (1 <= iL) {
                int i11 = 1;
                while (true) {
                    q5t0 q5t0Var2 = (q5t0) list.get(i11);
                    int i12 = this.d ? q5t0Var2.b : q5t0Var2.a;
                    i7 = i12 > i7 ? i12 : i7;
                    if (i11 == iL) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        } else {
            i7 = 0;
        }
        this.m = i7;
        List list2 = this.c;
        if (!list2.isEmpty()) {
            q5t0 q5t0Var3 = (q5t0) list2.get(0);
            i8 = this.d ? q5t0Var3.a : q5t0Var3.b;
            int iL2 = p7h.L(list2);
            if (1 <= iL2) {
                while (true) {
                    q5t0 q5t0Var4 = (q5t0) list2.get(i10);
                    int i13 = this.d ? q5t0Var4.a : q5t0Var4.b;
                    i8 = i13 > i8 ? i13 : i8;
                    if (i10 == iL2) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            i8 = 0;
        }
        this.r = os00.INVALID_ID;
        boolean z2 = this.d;
        if (z2) {
            this.q = i2;
            i9 = this.m;
            this.o = i9;
            this.n = i8;
            this.f13p = 0;
        } else {
            this.q = 0;
            this.o = i8;
            i9 = this.m;
            this.n = i9;
            this.f13p = i2;
        }
        this.v = z2 ? (((long) i9) & 4294967295L) | (((long) i8) << 32) : (((long) i9) << 32) | (((long) i8) & 4294967295L);
        this.w = 0L;
    }

    public final void a(int i, int i2, int i3, int i4) {
        if (this.d) {
            i3 = i4;
        }
        o(i, i2, i3);
    }

    public final int b() {
        return this.f;
    }

    public final int c() {
        return this.o;
    }

    public final long d() {
        return this.k;
    }

    public final void e() {
        this.u = true;
    }

    public final int f() {
        return this.f13p;
    }

    public final List g() {
        return this.c;
    }

    public final int getIndex() {
        return this.a;
    }

    public final Object getKey() {
        return this.b;
    }

    public final int h() {
        return this.q;
    }

    public final long i(int i) {
        return this.w;
    }

    public final int j() {
        return this.e;
    }

    public final int k() {
        return this.n;
    }

    public final int l(long j) {
        return (int) (this.d ? j & 4294967295L : j >> 32);
    }

    public final int m() {
        long j = this.w;
        return (int) (!this.d ? j >> 32 : j & 4294967295L);
    }

    public final int n() {
        int i;
        int i2;
        if (this.d) {
            i = this.o;
            i2 = this.q;
        } else {
            i = this.n;
            i2 = this.f13p;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public final void o(int i, int i2, int i3) {
        long j;
        this.r = i3;
        this.s = -this.g;
        this.t = i3 + this.h;
        if (this.d) {
            j = (((long) i2) << 32) | (4294967295L & ((long) i));
        } else {
            j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        }
        this.w = j;
    }
}
