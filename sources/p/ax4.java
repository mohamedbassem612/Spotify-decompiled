package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ax4 implements pdy0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f8p;
    public final tgp0 q;
    public final luk r;
    public final idd1 s = new idd1(new q30(this, (byte) 20));
    public final idd1 t = new idd1(new fv4(this, (byte) 22));

    public ax4(int i, boolean z, boolean z2, boolean z3, int i2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i3, int i4, boolean z9, boolean z10, boolean z11, int i5, tgp0 tgp0Var, luk lukVar) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i2;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = i3;
        this.l = i4;
        this.m = z9;
        this.n = z10;
        this.o = z11;
        this.f8p = i5;
        this.q = tgp0Var;
        this.r = lukVar;
    }

    public final int a() {
        ax4 ax4VarF = f();
        return ax4VarF != null ? ax4VarF.a() : this.a;
    }

    public final boolean b() {
        ax4 ax4VarF = f();
        return ax4VarF != null ? ax4VarF.b() : this.b;
    }

    public final boolean c() {
        ax4 ax4VarF = f();
        return ax4VarF != null ? ax4VarF.c() : this.c;
    }

    public final boolean d() {
        ax4 ax4VarF = f();
        return ax4VarF != null ? ax4VarF.d() : this.d;
    }

    public final int e() {
        ax4 ax4VarF = f();
        return ax4VarF != null ? ax4VarF.e() : this.e;
    }

    public final ax4 f() {
        return (ax4) this.t.getValue();
    }

    public final boolean g() {
        ax4 ax4VarF = f();
        return ax4VarF != null ? ax4VarF.g() : this.f;
    }

    public final boolean h() {
        ax4 ax4VarF = f();
        return ax4VarF != null ? ax4VarF.h() : this.g;
    }

    public final boolean i() {
        ax4 ax4VarF = f();
        return ax4VarF != null ? ax4VarF.i() : this.h;
    }

    public final boolean j() {
        ax4 ax4VarF = f();
        return ax4VarF != null ? ax4VarF.j() : this.i;
    }

    public final boolean k() {
        ax4 ax4VarF = f();
        return ax4VarF != null ? ax4VarF.k() : this.j;
    }

    public final int l() {
        ax4 ax4VarF = f();
        return ax4VarF != null ? ax4VarF.l() : this.k;
    }

    public final int m() {
        ax4 ax4VarF = f();
        return ax4VarF != null ? ax4VarF.m() : this.l;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("ads_fetch_oops_sampling_bps", "android-perf-tracking", a(), 0, 10000), new fpb("anr_profile_upload_enabled", "android-perf-tracking", b()), new fpb("anr_profiling_enabled", "android-perf-tracking", c()), new fpb("cold_startup_time_guardrail_metric", "android-perf-tracking", d()), new fpb("connect_transfer_oops_sampling_bps", "android-perf-tracking", e(), 0, 10000), new fpb("device_metrics_enabled", "android-perf-tracking", g()), new fpb("jank_coordinator_enabled", "android-perf-tracking", h()), new fpb("network_metrics_from_core", "android-perf-tracking", i()), new fpb("observability_platform_enabled", "android-perf-tracking", j()), new fpb("page_load_time_guardrail_metric", "android-perf-tracking", k()), new fpb("page_visit_baseline_oops_sampling_bps", "android-perf-tracking", l(), 0, 10000), new fpb("page_visit_detailed_oops_sampling_bps", "android-perf-tracking", m(), 0, 10000), new fpb("seqlock_buffer_enabled", "android-perf-tracking", n()), new fpb("should_log_cold_startup_subdurations", "android-perf-tracking", o()), new fpb("should_send_time_measurements", "android-perf-tracking", p()), new fpb("workmanager_execution_oops_sampling_bps", "android-perf-tracking", q(), 0, 10000));
    }

    public final boolean n() {
        ax4 ax4VarF = f();
        return ax4VarF != null ? ax4VarF.n() : this.m;
    }

    public final boolean o() {
        ax4 ax4VarF = f();
        return ax4VarF != null ? ax4VarF.o() : this.n;
    }

    public final boolean p() {
        ax4 ax4VarF = f();
        return ax4VarF != null ? ax4VarF.p() : this.o;
    }

    public final int q() {
        ax4 ax4VarF = f();
        return ax4VarF != null ? ax4VarF.q() : this.f8p;
    }
}
