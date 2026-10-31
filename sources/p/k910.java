package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k910 {
    public final t6g1 a;
    public final dt11 b;
    public final iix0 c;
    public final n6u d;
    public final boolean e;
    public final rrt0 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Double j;
    public final me2 k;
    public final xn70 l;
    public final boolean m;

    public /* synthetic */ k910(t6g1 t6g1Var, dt11 dt11Var, iix0 iix0Var, n6u n6uVar, rrt0 rrt0Var, boolean z, boolean z2, boolean z3, Double d, me2 me2Var, xn70 xn70Var, boolean z4, int i) {
        this((i & 1) != 0 ? r6g1.a : t6g1Var, (i & 2) != 0 ? new dt11((q1v) null, 3) : dt11Var, (i & 4) != 0 ? null : iix0Var, (i & 8) != 0 ? j6u.a : n6uVar, false, (i & 32) != 0 ? rrt0.b : rrt0Var, (i & 64) != 0 ? true : z, (i & 128) != 0 ? true : z2, (i & 256) != 0 ? false : z3, (i & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? null : d, (i & 1024) != 0 ? null : me2Var, (i & 2048) != 0 ? null : xn70Var, (i & 4096) != 0 ? false : z4);
    }

    public static k910 a(k910 k910Var, t6g1 t6g1Var, dt11 dt11Var, iix0 iix0Var, n6u n6uVar, boolean z, rrt0 rrt0Var, boolean z2, boolean z3, boolean z4, Double d, me2 me2Var, int i) {
        return new k910((i & 1) != 0 ? k910Var.a : t6g1Var, (i & 2) != 0 ? k910Var.b : dt11Var, (i & 4) != 0 ? k910Var.c : iix0Var, (i & 8) != 0 ? k910Var.d : n6uVar, (i & 16) != 0 ? k910Var.e : z, (i & 32) != 0 ? k910Var.f : rrt0Var, (i & 64) != 0 ? k910Var.g : z2, (i & 128) != 0 ? k910Var.h : z3, (i & 256) != 0 ? k910Var.i : z4, (i & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? k910Var.j : d, (i & 1024) != 0 ? k910Var.k : me2Var, k910Var.l, k910Var.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k910)) {
            return false;
        }
        k910 k910Var = (k910) obj;
        return u890.j(this.a, k910Var.a) && u890.j(this.b, k910Var.b) && u890.j(this.c, k910Var.c) && u890.j(this.d, k910Var.d) && this.e == k910Var.e && this.f == k910Var.f && this.g == k910Var.g && this.h == k910Var.h && this.i == k910Var.i && u890.j(this.j, k910Var.j) && u890.j(this.k, k910Var.k) && u890.j(this.l, k910Var.l) && this.m == k910Var.m;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        iix0 iix0Var = this.c;
        int iG = xcg1.g(xcg1.g(xcg1.g((this.f.hashCode() + xcg1.g((this.d.hashCode() + ((iHashCode + (iix0Var == null ? 0 : iix0Var.hashCode())) * 31)) * 31, 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i);
        Double d = this.j;
        int iHashCode2 = (iG + (d == null ? 0 : d.hashCode())) * 31;
        me2 me2Var = this.k;
        int iHashCode3 = (iHashCode2 + (me2Var == null ? 0 : me2Var.hashCode())) * 31;
        xn70 xn70Var = this.l;
        return Boolean.hashCode(this.m) + ((iHashCode3 + (xn70Var != null ? xn70Var.hashCode() : 0)) * 31);
    }

    public k910(t6g1 t6g1Var, dt11 dt11Var, iix0 iix0Var, n6u n6uVar, boolean z, rrt0 rrt0Var, boolean z2, boolean z3, boolean z4, Double d, me2 me2Var, xn70 xn70Var, boolean z5) {
        this.a = t6g1Var;
        this.b = dt11Var;
        this.c = iix0Var;
        this.d = n6uVar;
        this.e = z;
        this.f = rrt0Var;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = d;
        this.k = me2Var;
        this.l = xn70Var;
        this.m = z5;
    }
}
