package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jf4 implements pdy0 {
    public final idd1 A;
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
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f45p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final luk z;

    public jf4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, luk lukVar) {
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
        this.m = z13;
        this.n = z14;
        this.o = z15;
        this.f45p = z16;
        this.q = z17;
        this.r = z18;
        this.s = z19;
        this.t = z20;
        this.u = z21;
        this.v = z22;
        this.w = z23;
        this.x = z24;
        this.y = z25;
        this.z = lukVar;
        this.A = new idd1(new pe4(this, (byte) 16));
    }

    public static jf4 A(aey0 aey0Var) {
        return new jf4(aey0Var.c("android-feature-bluejay:artwork_carousel_enabled", true), aey0Var.c("android-feature-bluejay:capping_enabled", true), aey0Var.c("android-feature-bluejay:connect_apps_chip_enabled", true), aey0Var.c("android-feature-bluejay:create_show_on_confirm_enabled", false), aey0Var.c("android-feature-bluejay:create_show_upload_enabled", true), aey0Var.c("android-feature-bluejay:data_source_enabled", true), aey0Var.c("android-feature-bluejay:disclosure_sheet_enabled", true), aey0Var.c("android-feature-bluejay:episode_page_refine_podcast_entry_point_enabled", false), aey0Var.c("android-feature-bluejay:episode_readiness_indicator_enabled", false), aey0Var.c("android-feature-bluejay:generating_episode_subtitle_enabled", false), aey0Var.c("android-feature-bluejay:generation_banner_enabled", false), aey0Var.c("android-feature-bluejay:is_enabled", false), aey0Var.c("android-feature-bluejay:is_episode_page_entry_point_enabled", true), aey0Var.c("android-feature-bluejay:is_now_playing_entry_point_enabled", true), aey0Var.c("android-feature-bluejay:is_show_page_entry_point_enabled", true), aey0Var.c("android-feature-bluejay:is_upload_enabled", true), aey0Var.c("android-feature-bluejay:now_playing_view_refine_podcast_entry_point_enabled", false), aey0Var.c("android-feature-bluejay:onboarding_enabled", false), aey0Var.c("android-feature-bluejay:personal_apps_settings_enabled", true), aey0Var.c("android-feature-bluejay:schedule_chip_capped_upsell_enabled", false), aey0Var.c("android-feature-bluejay:show_generation_list_enabled", false), aey0Var.c("android-feature-bluejay:show_page_refine_podcast_entry_point_enabled", false), aey0Var.c("android-feature-bluejay:show_page_schedule_chip_enabled", false), aey0Var.c("android-feature-bluejay:skip_forward_enabled", false), aey0Var.c("android-feature-bluejay:suggestions_carousel_enabled", true), null);
    }

    public final boolean a() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.a() : this.a;
    }

    public final boolean b() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.b() : this.b;
    }

    public final boolean c() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.c() : this.c;
    }

    public final boolean d() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.d() : this.d;
    }

    public final boolean e() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.e() : this.e;
    }

    public final jf4 f() {
        return (jf4) this.A.getValue();
    }

    public final boolean g() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.g() : this.f;
    }

    public final boolean h() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.h() : this.g;
    }

    public final boolean i() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.i() : this.h;
    }

    public final boolean j() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.j() : this.i;
    }

    public final boolean k() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.k() : this.j;
    }

    public final boolean l() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.l() : this.k;
    }

    public final boolean m() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.m() : this.q;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("artwork_carousel_enabled", "android-feature-bluejay", a()), new fpb("capping_enabled", "android-feature-bluejay", b()), new fpb("connect_apps_chip_enabled", "android-feature-bluejay", c()), new fpb("create_show_on_confirm_enabled", "android-feature-bluejay", d()), new fpb("create_show_upload_enabled", "android-feature-bluejay", e()), new fpb("data_source_enabled", "android-feature-bluejay", g()), new fpb("disclosure_sheet_enabled", "android-feature-bluejay", h()), new fpb("episode_page_refine_podcast_entry_point_enabled", "android-feature-bluejay", i()), new fpb("episode_readiness_indicator_enabled", "android-feature-bluejay", j()), new fpb("generating_episode_subtitle_enabled", "android-feature-bluejay", k()), new fpb("generation_banner_enabled", "android-feature-bluejay", l()), new fpb("is_enabled", "android-feature-bluejay", v()), new fpb("is_episode_page_entry_point_enabled", "android-feature-bluejay", w()), new fpb("is_now_playing_entry_point_enabled", "android-feature-bluejay", x()), new fpb("is_show_page_entry_point_enabled", "android-feature-bluejay", y()), new fpb("is_upload_enabled", "android-feature-bluejay", z()), new fpb("now_playing_view_refine_podcast_entry_point_enabled", "android-feature-bluejay", m()), new fpb("onboarding_enabled", "android-feature-bluejay", n()), new fpb("personal_apps_settings_enabled", "android-feature-bluejay", o()), new fpb("schedule_chip_capped_upsell_enabled", "android-feature-bluejay", p()), new fpb("show_generation_list_enabled", "android-feature-bluejay", q()), new fpb("show_page_refine_podcast_entry_point_enabled", "android-feature-bluejay", r()), new fpb("show_page_schedule_chip_enabled", "android-feature-bluejay", s()), new fpb("skip_forward_enabled", "android-feature-bluejay", t()), new fpb("suggestions_carousel_enabled", "android-feature-bluejay", u()));
    }

    public final boolean n() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.n() : this.r;
    }

    public final boolean o() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.o() : this.s;
    }

    public final boolean p() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.p() : this.t;
    }

    public final boolean q() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.q() : this.u;
    }

    public final boolean r() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.r() : this.v;
    }

    public final boolean s() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.s() : this.w;
    }

    public final boolean t() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.t() : this.x;
    }

    public final boolean u() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.u() : this.y;
    }

    public final boolean v() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.v() : this.l;
    }

    public final boolean w() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.w() : this.m;
    }

    public final boolean x() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.x() : this.n;
    }

    public final boolean y() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.y() : this.o;
    }

    public final boolean z() {
        jf4 jf4VarF = f();
        return jf4VarF != null ? jf4VarF.z() : this.f45p;
    }

    public jf4(luk lukVar) {
        this(true, true, true, false, true, true, true, false, false, false, false, false, true, true, true, true, false, false, true, false, false, false, false, false, true, lukVar);
    }
}
