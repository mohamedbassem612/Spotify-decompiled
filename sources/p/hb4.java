package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hb4 implements pdy0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f47p;
    public final int q;
    public final boolean r;
    public final boolean s;
    public final tgp0 t;
    public final luk u;
    public final idd1 v = new idd1(new gb4(this, (byte) 1));
    public final idd1 w = new idd1(new gb4(this, (byte) 0));

    public hb4(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z8, int i9, boolean z9, boolean z10, tgp0 tgp0Var, luk lukVar) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = i5;
        this.m = i6;
        this.n = i7;
        this.o = i8;
        this.f47p = z8;
        this.q = i9;
        this.r = z9;
        this.s = z10;
        this.t = tgp0Var;
        this.u = lukVar;
    }

    public final int a() {
        hb4 hb4VarB = b();
        return hb4VarB != null ? hb4VarB.a() : this.a;
    }

    public final hb4 b() {
        return (hb4) this.w.getValue();
    }

    public final boolean c() {
        hb4 hb4VarB = b();
        return hb4VarB != null ? hb4VarB.c() : this.b;
    }

    public final boolean d() {
        hb4 hb4VarB = b();
        return hb4VarB != null ? hb4VarB.d() : this.c;
    }

    public final boolean e() {
        hb4 hb4VarB = b();
        return hb4VarB != null ? hb4VarB.e() : this.d;
    }

    public final boolean f() {
        hb4 hb4VarB = b();
        return hb4VarB != null ? hb4VarB.f() : this.e;
    }

    public final boolean g() {
        hb4 hb4VarB = b();
        return hb4VarB != null ? hb4VarB.g() : this.f;
    }

    public final boolean h() {
        hb4 hb4VarB = b();
        return hb4VarB != null ? hb4VarB.h() : this.g;
    }

    public final boolean i() {
        hb4 hb4VarB = b();
        return hb4VarB != null ? hb4VarB.i() : this.h;
    }

    public final int j() {
        hb4 hb4VarB = b();
        return hb4VarB != null ? hb4VarB.j() : this.i;
    }

    public final int k() {
        hb4 hb4VarB = b();
        return hb4VarB != null ? hb4VarB.k() : this.j;
    }

    public final int l() {
        hb4 hb4VarB = b();
        return hb4VarB != null ? hb4VarB.l() : this.k;
    }

    public final int m() {
        hb4 hb4VarB = b();
        return hb4VarB != null ? hb4VarB.m() : this.l;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("client_token_failure_cache_millis", "android-connectivity", a(), 0, 30000), new fpb("decorator_zero_hop", "android-connectivity", c()), new fpb("disable_broken_cache_detector", "android-connectivity", d()), new fpb("disable_decorator_scheduling", "android-connectivity", e()), new fpb("disable_webgate_token_cache", "android-connectivity", f()), new fpb("evict_connection_pools_on_reachability_change_enabled", "android-connectivity", g()), new fpb("evict_connection_pools_on_trim_enabled", "android-connectivity", h()), new fpb("global_routing_default_enabled", "android-connectivity", i()), new fpb("plain_instance_call_timeout_millis", "android-connectivity", j(), 0, 600000), new fpb("plain_instance_connect_timeout_millis", "android-connectivity", k(), 1000, 600000), new fpb("plain_instance_connection_pool_keep_alive_duration_minutes", "android-connectivity", l(), 1, 1440), new fpb("plain_instance_connection_pool_max_idle_connections", "android-connectivity", m(), 1, 1000), new fpb("plain_instance_max_requests", "android-connectivity", n(), 1, 1000), new fpb("plain_instance_max_requests_per_host", "android-connectivity", o(), 1, 1000), new fpb("plain_instance_read_timeout_millis", "android-connectivity", p(), 1000, 600000), new fpb("plain_instance_retry_on_connection_failure", "android-connectivity", q()), new fpb("plain_instance_write_timeout_millis", "android-connectivity", r(), 1000, 600000), new fpb("pre_warm_connections", "android-connectivity", s()), new fpb("short_circuit_all_offline_states", "android-connectivity", t())});
    }

    public final int n() {
        hb4 hb4VarB = b();
        return hb4VarB != null ? hb4VarB.n() : this.m;
    }

    public final int o() {
        hb4 hb4VarB = b();
        return hb4VarB != null ? hb4VarB.o() : this.n;
    }

    public final int p() {
        hb4 hb4VarB = b();
        return hb4VarB != null ? hb4VarB.p() : this.o;
    }

    public final boolean q() {
        hb4 hb4VarB = b();
        return hb4VarB != null ? hb4VarB.q() : this.f47p;
    }

    public final int r() {
        hb4 hb4VarB = b();
        return hb4VarB != null ? hb4VarB.r() : this.q;
    }

    public final boolean s() {
        hb4 hb4VarB = b();
        return hb4VarB != null ? hb4VarB.s() : this.r;
    }

    public final boolean t() {
        hb4 hb4VarB = b();
        return hb4VarB != null ? hb4VarB.t() : this.s;
    }
}
