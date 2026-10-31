package p;

import androidx.work.OverwritingInputMerger;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vwl1 {
    public static final hhg1 z;
    public final String a;
    public wvl1 b;
    public final String c;
    public final String d;
    public ewq e;
    public final ewq f;
    public long g;
    public long h;
    public long i;
    public gjl j;
    public final int k;
    public h0a l;
    public long m;
    public long n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f128p;
    public boolean q;
    public int r;
    public final int s;
    public final int t;
    public long u;
    public int v;
    public final int w;
    public String x;
    public final Boolean y;

    static {
        qs10.c("WorkSpec");
        z = new hhg1((byte) 16);
    }

    public /* synthetic */ vwl1(String str, wvl1 wvl1Var, String str2, String str3, ewq ewqVar, ewq ewqVar2, long j, long j2, long j3, gjl gjlVar, int i, h0a h0aVar, long j4, long j5, long j6, long j7, boolean z2, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool, int i6) {
        this(str, (i6 & 2) != 0 ? wvl1.a : wvl1Var, str2, (i6 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i6 & 16) != 0 ? ewq.b : ewqVar, (i6 & 32) != 0 ? ewq.b : ewqVar2, (i6 & 64) != 0 ? 0L : j, (i6 & 128) != 0 ? 0L : j2, (i6 & 256) != 0 ? 0L : j3, (i6 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? gjl.j : gjlVar, (i6 & 1024) != 0 ? 0 : i, (i6 & 2048) != 0 ? h0a.a : h0aVar, (i6 & 4096) != 0 ? 30000L : j4, (i6 & 8192) != 0 ? -1L : j5, (i6 & 16384) == 0 ? j6 : 0L, (32768 & i6) != 0 ? -1L : j7, (65536 & i6) != 0 ? false : z2, (131072 & i6) != 0 ? 1 : i2, (262144 & i6) != 0 ? 0 : i3, 0, (1048576 & i6) != 0 ? Long.MAX_VALUE : j8, (2097152 & i6) != 0 ? 0 : i4, (4194304 & i6) != 0 ? -256 : i5, (8388608 & i6) != 0 ? null : str4, (i6 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public static vwl1 b(vwl1 vwl1Var, String str, wvl1 wvl1Var, String str2, ewq ewqVar, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        return new vwl1((i5 & 1) != 0 ? vwl1Var.a : str, (i5 & 2) != 0 ? vwl1Var.b : wvl1Var, (i5 & 4) != 0 ? vwl1Var.c : str2, vwl1Var.d, (i5 & 16) != 0 ? vwl1Var.e : ewqVar, vwl1Var.f, vwl1Var.g, vwl1Var.h, vwl1Var.i, vwl1Var.j, (i5 & 1024) != 0 ? vwl1Var.k : i, vwl1Var.l, vwl1Var.m, (i5 & 8192) != 0 ? vwl1Var.n : j, vwl1Var.o, vwl1Var.f128p, vwl1Var.q, vwl1Var.r, (i5 & 262144) != 0 ? vwl1Var.s : i2, (i5 & 524288) != 0 ? vwl1Var.t : i3, (i5 & 1048576) != 0 ? vwl1Var.u : j2, (i5 & 2097152) != 0 ? vwl1Var.v : i4, vwl1Var.w, vwl1Var.x, vwl1Var.y);
    }

    public final long a() {
        return j2h1.j(this.b == wvl1.a && this.k > 0, this.k, this.l, this.m, this.n, this.s, c(), this.g, this.i, this.h, this.u);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final void d(long j, long j2) {
        if (j < 900000) {
            qs10.a().getClass();
        }
        if (j < 900000) {
            j = 900000;
        }
        this.h = j;
        if (j2 < 300000) {
            qs10.a().getClass();
        }
        if (j2 > this.h) {
            qs10.a().getClass();
        }
        this.i = yoi1.r(j2, 300000L, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwl1)) {
            return false;
        }
        vwl1 vwl1Var = (vwl1) obj;
        return u890.j(this.a, vwl1Var.a) && this.b == vwl1Var.b && u890.j(this.c, vwl1Var.c) && u890.j(this.d, vwl1Var.d) && u890.j(this.e, vwl1Var.e) && u890.j(this.f, vwl1Var.f) && this.g == vwl1Var.g && this.h == vwl1Var.h && this.i == vwl1Var.i && u890.j(this.j, vwl1Var.j) && this.k == vwl1Var.k && this.l == vwl1Var.l && this.m == vwl1Var.m && this.n == vwl1Var.n && this.o == vwl1Var.o && this.f128p == vwl1Var.f128p && this.q == vwl1Var.q && this.r == vwl1Var.r && this.s == vwl1Var.s && this.t == vwl1Var.t && this.u == vwl1Var.u && this.v == vwl1Var.v && this.w == vwl1Var.w && u890.j(this.x, vwl1Var.x) && u890.j(this.y, vwl1Var.y);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.w, kaa0.f(this.v, cy30.f(kaa0.f(this.t, kaa0.f(this.s, ab80.k(this.r, xcg1.g(cy30.f(cy30.f(cy30.f(cy30.f((this.l.hashCode() + kaa0.f(this.k, (this.j.hashCode() + cy30.f(cy30.f(cy30.f((this.f.hashCode() + ((this.e.hashCode() + cy30.d(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, this.g, 31), this.h, 31), this.i, 31)) * 31, 31)) * 31, this.m, 31), this.n, 31), this.o, 31), this.f128p, 31), 31, this.q), 31), 31), 31), this.u, 31), 31), 31);
        String str = this.x;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.y;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return gvg.k(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    public vwl1(String str, wvl1 wvl1Var, String str2, String str3, ewq ewqVar, ewq ewqVar2, long j, long j2, long j3, gjl gjlVar, int i, h0a h0aVar, long j4, long j5, long j6, long j7, boolean z2, int i2, int i3, int i4, long j8, int i5, int i6, String str4, Boolean bool) {
        this.a = str;
        this.b = wvl1Var;
        this.c = str2;
        this.d = str3;
        this.e = ewqVar;
        this.f = ewqVar2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = gjlVar;
        this.k = i;
        this.l = h0aVar;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.f128p = j7;
        this.q = z2;
        this.r = i2;
        this.s = i3;
        this.t = i4;
        this.u = j8;
        this.v = i5;
        this.w = i6;
        this.x = str4;
        this.y = bool;
    }
}
