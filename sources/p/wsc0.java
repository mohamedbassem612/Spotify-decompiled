package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wsc0 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final List e;
    public final kby f;
    public final long g;
    public final Integer h;
    public final boolean i;
    public final Map j;
    public final long k;
    public final List l;
    public final int m;
    public final Integer n;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wsc0(int i, int i2, int i3, boolean z, List list, kby kbyVar, long j, Integer num, boolean z2, Map map, long j2, List list2, int i4, int i5) {
        int i6 = (i5 & 1) != 0 ? 0 : i;
        int i7 = (i5 & 2) != 0 ? 0 : i2;
        int i8 = (i5 & 4) != 0 ? 0 : i3;
        boolean z3 = (i5 & 8) != 0 ? false : z;
        int i9 = i5 & 16;
        z6x z6xVar = z6x.a;
        this(i6, i7, i8, z3, i9 != 0 ? z6xVar : list, (i5 & 32) != 0 ? new kby(0 == true ? 1 : 0, -1) : kbyVar, (i5 & 64) != 0 ? 0L : j, (i5 & 128) == 0 ? num : null, (i5 & 256) != 0 ? false : z2, (i5 & 512) != 0 ? b7x.a : map, (i5 & 1024) == 0 ? j2 : 0L, (i5 & 2048) != 0 ? z6xVar : list2, (i5 & 4096) != 0 ? 0 : i4, (Integer) null);
    }

    public static wsc0 a(wsc0 wsc0Var, Integer num) {
        return new wsc0(wsc0Var.a, wsc0Var.b, wsc0Var.c, wsc0Var.d, wsc0Var.e, wsc0Var.f, wsc0Var.g, wsc0Var.h, wsc0Var.i, wsc0Var.j, wsc0Var.k, wsc0Var.l, wsc0Var.m, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsc0)) {
            return false;
        }
        wsc0 wsc0Var = (wsc0) obj;
        return this.a == wsc0Var.a && this.b == wsc0Var.b && this.c == wsc0Var.c && this.d == wsc0Var.d && u890.j(this.e, wsc0Var.e) && u890.j(this.f, wsc0Var.f) && this.g == wsc0Var.g && u890.j(this.h, wsc0Var.h) && this.i == wsc0Var.i && u890.j(this.j, wsc0Var.j) && this.k == wsc0Var.k && u890.j(this.l, wsc0Var.l) && this.m == wsc0Var.m && u890.j(this.n, wsc0Var.n);
    }

    public final int hashCode() {
        int iF = cy30.f((this.f.hashCode() + f4i1.b(xcg1.g(kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e)) * 31, this.g, 31);
        Integer num = this.h;
        int iF2 = kaa0.f(this.m, f4i1.b(cy30.f(cy30.e(xcg1.g((iF + (num == null ? 0 : num.hashCode())) * 31, 31, this.i), 31, this.j), this.k, 31), 31, this.l), 31);
        Integer num2 = this.n;
        return iF2 + (num2 != null ? num2.hashCode() : 0);
    }

    public wsc0(int i, int i2, int i3, boolean z, List list, kby kbyVar, long j, Integer num, boolean z2, Map map, long j2, List list2, int i4, Integer num2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = list;
        this.f = kbyVar;
        this.g = j;
        this.h = num;
        this.i = z2;
        this.j = map;
        this.k = j2;
        this.l = list2;
        this.m = i4;
        this.n = num2;
    }
}
