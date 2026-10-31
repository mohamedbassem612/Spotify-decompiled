package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g55 implements pdy0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final luk f41p;
    public final idd1 q = new idd1(new f55(this, (byte) 0));

    public g55(int i, int i2, int i3, int i4, int i5, boolean z, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z2, boolean z3, luk lukVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = z;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = i11;
        this.m = i12;
        this.n = z2;
        this.o = z3;
        this.f41p = lukVar;
    }

    public final int a() {
        g55 g55VarG = g();
        return g55VarG != null ? g55VarG.a() : this.a;
    }

    public final int b() {
        g55 g55VarG = g();
        return g55VarG != null ? g55VarG.b() : this.b;
    }

    public final int c() {
        g55 g55VarG = g();
        return g55VarG != null ? g55VarG.c() : this.c;
    }

    public final int d() {
        g55 g55VarG = g();
        return g55VarG != null ? g55VarG.d() : this.d;
    }

    public final int e() {
        g55 g55VarG = g();
        return g55VarG != null ? g55VarG.e() : this.e;
    }

    public final boolean f() {
        g55 g55VarG = g();
        return g55VarG != null ? g55VarG.f() : this.f;
    }

    public final g55 g() {
        return (g55) this.q.getValue();
    }

    public final int h() {
        g55 g55VarG = g();
        return g55VarG != null ? g55VarG.h() : this.g;
    }

    public final int i() {
        g55 g55VarG = g();
        return g55VarG != null ? g55VarG.i() : this.h;
    }

    public final int j() {
        g55 g55VarG = g();
        return g55VarG != null ? g55VarG.j() : this.i;
    }

    public final int k() {
        g55 g55VarG = g();
        return g55VarG != null ? g55VarG.k() : this.j;
    }

    public final int l() {
        g55 g55VarG = g();
        return g55VarG != null ? g55VarG.l() : this.k;
    }

    public final int m() {
        g55 g55VarG = g();
        return g55VarG != null ? g55VarG.m() : this.l;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("connection_quality_max_concurrent_latency_bypass", "android-trafficapi-impl", a(), 0, 1000000), new fpb("connection_quality_max_timer_error_ms", "android-trafficapi-impl", b(), 0, 60000), new fpb("connection_quality_min_p90_sample_count", "android-trafficapi-impl", c(), 0, 1000), new fpb("connection_quality_poor_latency_threshold_ms", "android-trafficapi-impl", d(), 0, 60000), new fpb("connection_quality_poor_timeout_count", "android-trafficapi-impl", e(), 0, 1000), new fpb("connection_quality_report_enabled", "android-trafficapi-impl", f()), new fpb("debounce_good_to_poor_threshold", "android-trafficapi-impl", h(), 0, 100), new fpb("debounce_poor_to_good_threshold", "android-trafficapi-impl", i(), 0, 100), new fpb("debounce_unknown_to_good_threshold", "android-trafficapi-impl", j(), 0, 100), new fpb("debounce_unknown_to_poor_threshold", "android-trafficapi-impl", k(), 0, 100), new fpb("request_bucketing_interval", "android-trafficapi-impl", l(), 0, 120), new fpb("speed_test_sample_rate_percent", "android-trafficapi-impl", m(), 0, 100), new fpb("speed_test_url_variant", "android-trafficapi-impl", n(), 0, 10000), new fpb("traffic_bucket_aggregation_v2_enabled", "android-trafficapi-impl", o()), new fpb("traffic_stats_enabled", "android-trafficapi-impl", p())});
    }

    public final int n() {
        g55 g55VarG = g();
        return g55VarG != null ? g55VarG.n() : this.m;
    }

    public final boolean o() {
        g55 g55VarG = g();
        return g55VarG != null ? g55VarG.o() : this.n;
    }

    public final boolean p() {
        g55 g55VarG = g();
        return g55VarG != null ? g55VarG.p() : this.o;
    }
}
