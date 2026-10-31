package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xjr0 implements hfh0 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final qqq0 e;
    public final int f;
    public final int g;
    public final int h;
    public final mfh0 i;
    public final mfh0 j;
    public final float k;
    public final int l;
    public final boolean m;
    public final xu91 n;
    public final hfh0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f142p;
    public final List q;
    public final List r;
    public final c9n s;
    public final wat t;
    public final long u;

    public xjr0(List list, int i, int i2, int i3, qqq0 qqq0Var, int i4, int i5, int i6, mfh0 mfh0Var, mfh0 mfh0Var2, float f, int i7, boolean z, xu91 xu91Var, hfh0 hfh0Var, boolean z2, List list2, List list3, c9n c9nVar, wat watVar, long j) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = qqq0Var;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = mfh0Var;
        this.j = mfh0Var2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = xu91Var;
        this.o = hfh0Var;
        this.f142p = z2;
        this.q = list2;
        this.r = list3;
        this.s = c9nVar;
        this.t = watVar;
        this.u = j;
    }

    @Override // p.hfh0
    public final void a() {
        this.o.a();
    }

    @Override // p.hfh0
    public final iu30 b() {
        return this.o.b();
    }

    @Override // p.hfh0
    public final Map c() {
        return this.o.c();
    }

    @Override // p.hfh0
    public final vu30 d() {
        return this.o.d();
    }

    @Override // p.hfh0
    public final iu30 e() {
        return this.o.e();
    }

    public final xjr0 f(int i) {
        int i2;
        int i3 = this.b + this.c;
        if (this.f142p) {
            return null;
        }
        List list = this.a;
        if (list.isEmpty() || this.i == null || (i2 = this.l - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.k - (i3 != 0 ? i / i3 : 0.0f);
        if (this.j == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        mfh0 mfh0Var = (mfh0) o7h.q0(list);
        mfh0 mfh0Var2 = (mfh0) o7h.A0(list);
        int i4 = this.g;
        int i5 = this.f;
        if (i < 0) {
            if (Math.min((mfh0Var.k + i3) - i5, (mfh0Var2.k + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - mfh0Var.k, i4 - mfh0Var2.k) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((mfh0) list.get(i6)).a(i);
        }
        List list2 = this.q;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((mfh0) list2.get(i7)).a(i);
        }
        List list3 = this.r;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((mfh0) list3.get(i8)).a(i);
        }
        return new xjr0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f, i2, this.m || i > 0, this.n, this.o, this.f142p, this.q, this.r, this.s, this.t, this.u);
    }

    public final long g() {
        hfh0 hfh0Var = this.o;
        return (((long) hfh0Var.getWidth()) << 32) | (((long) hfh0Var.getHeight()) & 4294967295L);
    }

    @Override // p.hfh0
    public final int getHeight() {
        return this.o.getHeight();
    }

    @Override // p.hfh0
    public final int getWidth() {
        return this.o.getWidth();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ xjr0(int i, int i2, int i3, qqq0 qqq0Var, int i4, int i5, int i6, xu91 xu91Var, hfh0 hfh0Var, c9n c9nVar, wat watVar, long j) {
        z6x z6xVar = z6x.a;
        this(z6xVar, i, i2, i3, qqq0Var, i4, i5, i6, null, null, 0.0f, 0, false, xu91Var, hfh0Var, false, z6xVar, z6xVar, c9nVar, watVar, j);
    }
}
