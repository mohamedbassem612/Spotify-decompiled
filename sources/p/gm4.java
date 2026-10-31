package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gm4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f33p;
    public final boolean q;
    public final boolean r;
    public final luk s;
    public final idd1 t;

    public gm4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = z12;
        this.m = i;
        this.n = z13;
        this.o = z14;
        this.f33p = z15;
        this.q = z16;
        this.r = z17;
        this.s = lukVar;
        this.t = new idd1(new gk4(this, (byte) 24));
    }

    public final gm4 a() {
        return (gm4) this.t.getValue();
    }

    public final boolean b() {
        gm4 gm4VarA = a();
        return gm4VarA != null ? gm4VarA.b() : this.a;
    }

    public final boolean c() {
        gm4 gm4VarA = a();
        return gm4VarA != null ? gm4VarA.c() : this.b;
    }

    public final boolean d() {
        gm4 gm4VarA = a();
        return gm4VarA != null ? gm4VarA.d() : this.c;
    }

    public final boolean e() {
        gm4 gm4VarA = a();
        return gm4VarA != null ? gm4VarA.e() : this.d;
    }

    public final boolean f() {
        gm4 gm4VarA = a();
        return gm4VarA != null ? gm4VarA.f() : this.e;
    }

    public final boolean g() {
        gm4 gm4VarA = a();
        return gm4VarA != null ? gm4VarA.g() : this.f;
    }

    public final boolean h() {
        gm4 gm4VarA = a();
        return gm4VarA != null ? gm4VarA.h() : this.g;
    }

    public final boolean i() {
        gm4 gm4VarA = a();
        return gm4VarA != null ? gm4VarA.i() : this.h;
    }

    public final boolean j() {
        gm4 gm4VarA = a();
        return gm4VarA != null ? gm4VarA.j() : this.i;
    }

    public final boolean k() {
        gm4 gm4VarA = a();
        return gm4VarA != null ? gm4VarA.k() : this.j;
    }

    public final boolean l() {
        gm4 gm4VarA = a();
        return gm4VarA != null ? gm4VarA.l() : this.k;
    }

    public final boolean m() {
        gm4 gm4VarA = a();
        return gm4VarA != null ? gm4VarA.m() : this.l;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_artist_concerts_context_menu", "android-libs-concerts-properties", b()), new fpb("enable_campaign_promo_card_effects", "android-libs-concerts-properties", c()), new fpb("enable_campaign_promo_card_tilt", "android-libs-concerts-properties", d()), new fpb("enable_campaign_promo_card_v2", "android-libs-concerts-properties", e()), new fpb("enable_carousel_element", "android-libs-concerts-properties", f()), new fpb("enable_concert_campaign_platform_report", "android-libs-concerts-properties", g()), new fpb("enable_event_bottom_sheet_page", "android-libs-concerts-properties", h()), new fpb("enable_event_page_rotating_backgrounds", "android-libs-concerts-properties", i()), new fpb("enable_full_width_cards", "android-libs-concerts-properties", j()), new fpb("enable_report_bottom_sheet_page", "android-libs-concerts-properties", k()), new fpb("enable_report_concert_issue", "android-libs-concerts-properties", l()), new fpb("lef_mixed_carousel_content_v1", "android-libs-concerts-properties", m()), new fpb("notification_bottomsheet_display_frequency", "android-libs-concerts-properties", n(), 1, 3), new fpb("purchased_event_day_card_enabled", "android-libs-concerts-properties", o()), new fpb("reserved_onboarding_enabled", "android-libs-concerts-properties", p()), new fpb("reserved_share_card_nudge_enabled", "android-libs-concerts-properties", q()), new fpb("reserved_share_enabled", "android-libs-concerts-properties", r()), new fpb("reserved_sharing_client_rendering_enabled", "android-libs-concerts-properties", s()));
    }

    public final int n() {
        gm4 gm4VarA = a();
        return gm4VarA != null ? gm4VarA.n() : this.m;
    }

    public final boolean o() {
        gm4 gm4VarA = a();
        return gm4VarA != null ? gm4VarA.o() : this.n;
    }

    public final boolean p() {
        gm4 gm4VarA = a();
        return gm4VarA != null ? gm4VarA.p() : this.o;
    }

    public final boolean q() {
        gm4 gm4VarA = a();
        return gm4VarA != null ? gm4VarA.q() : this.f33p;
    }

    public final boolean r() {
        gm4 gm4VarA = a();
        return gm4VarA != null ? gm4VarA.r() : this.q;
    }

    public final boolean s() {
        gm4 gm4VarA = a();
        return gm4VarA != null ? gm4VarA.s() : this.r;
    }

    public gm4(luk lukVar) {
        this(false, true, true, false, false, false, false, false, false, false, false, false, 1, false, false, false, false, false, lukVar);
    }
}
