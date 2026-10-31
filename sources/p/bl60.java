package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bl60 extends gl60 {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f16p;
    public final x8v q;
    public final b380 r;
    public final b380 s;
    public final j380 t;
    public final long u;
    public final al60 v;
    public final b380 w;
    public final yk60 x;

    public bl60(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, x8v x8vVar, List list2, List list3, al60 al60Var, Map map, List list4, yk60 yk60Var) {
        long j6;
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.f16p = z5;
        this.q = x8vVar;
        this.r = b380.p(list2);
        this.s = b380.p(list3);
        this.t = j380.c(map);
        this.w = b380.p(list4);
        this.x = yk60Var;
        if (!list3.isEmpty()) {
            wk60 wk60Var = (wk60) hr80.r(list3);
            j6 = wk60Var.e + wk60Var.c;
            this.u = j6;
        } else if (list2.isEmpty()) {
            this.u = 0L;
            j6 = 0;
        } else {
            yk60 yk60Var2 = (yk60) hr80.r(list2);
            j6 = yk60Var2.e + yk60Var2.c;
            this.u = j6;
        }
        this.e = j != -9223372036854775807L ? j >= 0 ? Math.min(j6, j) : Math.max(0L, j6 + j) : -9223372036854775807L;
        this.f = j >= 0;
        this.v = al60Var;
    }

    @Override // p.kf20
    public final Object a(List list) {
        return this;
    }
}
