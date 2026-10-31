package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m26 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f55p;
    public final boolean q;
    public final tgp0 r;
    public final luk s;
    public final idd1 t;
    public final idd1 u;

    public m26(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z4, boolean z5, boolean z6, tgp0 tgp0Var, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = i7;
        this.k = i8;
        this.l = i9;
        this.m = i10;
        this.n = i11;
        this.o = z4;
        this.f55p = z5;
        this.q = z6;
        this.r = tgp0Var;
        this.s = lukVar;
        this.t = new idd1(new q30(this, (byte) 22));
        this.u = new idd1(new i26(this, (byte) 0));
    }

    public final boolean a() {
        m26 m26VarC = c();
        return m26VarC != null ? m26VarC.a() : this.a;
    }

    public final boolean b() {
        m26 m26VarC = c();
        return m26VarC != null ? m26VarC.b() : this.b;
    }

    public final m26 c() {
        return (m26) this.u.getValue();
    }

    public final boolean d() {
        m26 m26VarC = c();
        return m26VarC != null ? m26VarC.d() : this.c;
    }

    public final int e() {
        m26 m26VarC = c();
        return m26VarC != null ? m26VarC.e() : this.d;
    }

    public final int f() {
        m26 m26VarC = c();
        return m26VarC != null ? m26VarC.f() : this.e;
    }

    public final int g() {
        m26 m26VarC = c();
        return m26VarC != null ? m26VarC.g() : this.f;
    }

    public final int h() {
        m26 m26VarC = c();
        return m26VarC != null ? m26VarC.h() : this.g;
    }

    public final int i() {
        m26 m26VarC = c();
        return m26VarC != null ? m26VarC.i() : this.h;
    }

    public final int j() {
        m26 m26VarC = c();
        return m26VarC != null ? m26VarC.j() : this.i;
    }

    public final int k() {
        m26 m26VarC = c();
        return m26VarC != null ? m26VarC.k() : this.j;
    }

    public final int l() {
        m26 m26VarC = c();
        return m26VarC != null ? m26VarC.l() : this.k;
    }

    public final int m() {
        m26 m26VarC = c();
        return m26VarC != null ? m26VarC.m() : this.l;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("background_worker_send", "apps-music-libs-eventsender", a()), new fpb("background_worker_send_on_stop", "apps-music-libs-eventsender", b()), new fpb("enable_rate_limiter", "apps-music-libs-eventsender", d()), new fpb("event_sending_interval_seconds", "apps-music-libs-eventsender", e(), 0, 3600), new fpb("heartbeat_interval", "apps-music-libs-eventsender", f(), 0, 43200), new fpb("heartbeat_retry_interval", "apps-music-libs-eventsender", g(), 0, 3600), new fpb("max_batch_bytes", "apps-music-libs-eventsender", h(), 10000, 512000), new fpb("max_batch_size", "apps-music-libs-eventsender", i(), 1, 1000), new fpb("rate_limiting_rule_1_events_per_time_unit", "apps-music-libs-eventsender", j(), 0, 10000), new fpb("rate_limiting_rule_1_time_unit_seconds", "apps-music-libs-eventsender", k(), 0, 3600), new fpb("rate_limiting_rule_2_events_per_time_unit", "apps-music-libs-eventsender", l(), 0, 10000), new fpb("rate_limiting_rule_2_time_unit_seconds", "apps-music-libs-eventsender", m(), 0, 3600), new fpb("rate_limiting_rule_3_events_per_time_unit", "apps-music-libs-eventsender", n(), 0, 10000), new fpb("rate_limiting_rule_3_time_unit_seconds", "apps-music-libs-eventsender", o(), 0, 3600), new fpb("retry_db_operations", "apps-music-libs-eventsender", p()), new fpb("send_events_on_bcd_event", "apps-music-libs-eventsender", q()), new fpb("send_full_ess2", "apps-music-libs-eventsender", r()));
    }

    public final int n() {
        m26 m26VarC = c();
        return m26VarC != null ? m26VarC.n() : this.m;
    }

    public final int o() {
        m26 m26VarC = c();
        return m26VarC != null ? m26VarC.o() : this.n;
    }

    public final boolean p() {
        m26 m26VarC = c();
        return m26VarC != null ? m26VarC.p() : this.o;
    }

    public final boolean q() {
        m26 m26VarC = c();
        return m26VarC != null ? m26VarC.q() : this.f55p;
    }

    public final boolean r() {
        m26 m26VarC = c();
        return m26VarC != null ? m26VarC.r() : this.q;
    }

    public m26(tgp0 tgp0Var, luk lukVar) {
        this(false, false, false, 0, 0, 30, 128000, 100, 0, 0, 0, 0, 0, 0, false, false, true, tgp0Var, lukVar);
    }
}
