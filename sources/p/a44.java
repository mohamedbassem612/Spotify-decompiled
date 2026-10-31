package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a44 implements pdy0 {
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final luk m;
    public final idd1 n = new idd1(new g82(this, (byte) 24));

    public a44(int i, boolean z, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i3, boolean z7, boolean z8, int i4, luk lukVar) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = i3;
        this.j = z7;
        this.k = z8;
        this.l = i4;
        this.m = lukVar;
    }

    public final int a() {
        a44 a44VarE = e();
        return a44VarE != null ? a44VarE.a() : this.a;
    }

    public final boolean b() {
        a44 a44VarE = e();
        return a44VarE != null ? a44VarE.b() : this.b;
    }

    public final int c() {
        a44 a44VarE = e();
        return a44VarE != null ? a44VarE.c() : this.c;
    }

    public final boolean d() {
        a44 a44VarE = e();
        return a44VarE != null ? a44VarE.d() : this.d;
    }

    public final a44 e() {
        return (a44) this.n.getValue();
    }

    public final boolean f() {
        a44 a44VarE = e();
        return a44VarE != null ? a44VarE.f() : this.e;
    }

    public final boolean g() {
        a44 a44VarE = e();
        return a44VarE != null ? a44VarE.g() : this.f;
    }

    public final boolean h() {
        a44 a44VarE = e();
        return a44VarE != null ? a44VarE.h() : this.g;
    }

    public final boolean i() {
        a44 a44VarE = e();
        return a44VarE != null ? a44VarE.i() : this.h;
    }

    public final int j() {
        a44 a44VarE = e();
        return a44VarE != null ? a44VarE.j() : this.i;
    }

    public final boolean k() {
        a44 a44VarE = e();
        return a44VarE != null ? a44VarE.k() : this.j;
    }

    public final boolean l() {
        a44 a44VarE = e();
        return a44VarE != null ? a44VarE.l() : this.k;
    }

    public final int m() {
        a44 a44VarE = e();
        return a44VarE != null ? a44VarE.m() : this.l;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("cached_ad_expiration_period_seconds", "android-ad-on-app-open", a(), 0, Integer.MAX_VALUE), new fpb("core_fetch_enabled", "android-ad-on-app-open", b()), new fpb("core_fetch_read_timeout_ms", "android-ad-on-app-open", c(), 0, Integer.MAX_VALUE), new fpb("cta_card_enabled", "android-ad-on-app-open", d()), new fpb("eligibility_service_enabled", "android-ad-on-app-open", f()), new fpb("page_enabled", "android-ad-on-app-open", g()), new fpb("page_injection_during_startup_enabled", "android-ad-on-app-open", h()), new fpb("skip_button_enabled", "android-ad-on-app-open", i()), new fpb("skippable_ad_delay_ms", "android-ad-on-app-open", j(), 0, Integer.MAX_VALUE), new fpb("testing_dismiss_ad_when_video_finishes", "android-ad-on-app-open", k()), new fpb("testing_frequency_capping_enabled", "android-ad-on-app-open", l()), new fpb("video_loading_timeout_ms", "android-ad-on-app-open", m(), 0, Integer.MAX_VALUE));
    }
}
