package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t35 implements pdy0 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final luk G;
    public final idd1 H = new idd1(new k25(this, (byte) 20));
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final int m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f82p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final int x;
    public final int y;
    public final boolean z;

    public t35(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i2, int i3, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i4, int i5, int i6, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = i;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = i2;
        this.m = i3;
        this.n = z11;
        this.o = z12;
        this.f82p = z13;
        this.q = z14;
        this.r = z15;
        this.s = z16;
        this.t = z17;
        this.u = z18;
        this.v = z19;
        this.w = i4;
        this.x = i5;
        this.y = i6;
        this.z = z20;
        this.A = z21;
        this.B = z22;
        this.C = z23;
        this.D = z24;
        this.E = z25;
        this.F = z26;
        this.G = lukVar;
    }

    public final boolean A() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.A() : this.z;
    }

    public final boolean B() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.B() : this.A;
    }

    public final boolean C() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.C() : this.B;
    }

    public final boolean D() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.D() : this.C;
    }

    public final boolean E() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.E() : this.D;
    }

    public final boolean F() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.F() : this.E;
    }

    public final boolean G() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.G() : this.F;
    }

    public final boolean a() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.a() : this.a;
    }

    public final boolean b() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.b() : this.b;
    }

    public final boolean c() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.c() : this.c;
    }

    public final boolean d() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.d() : this.d;
    }

    public final boolean e() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.e() : this.e;
    }

    public final int f() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.f() : this.f;
    }

    public final boolean g() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.g() : this.g;
    }

    public final t35 h() {
        return (t35) this.H.getValue();
    }

    public final boolean i() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.i() : this.h;
    }

    public final boolean j() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.j() : this.i;
    }

    public final boolean k() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.k() : this.j;
    }

    public final boolean l() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.l() : this.k;
    }

    public final int m() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.m() : this.l;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("allow_smart_shuffle_in_jams", "android-system-smart-shuffle", a()), new fpb("connect_fixes_always_restore_sms_after_jam", "android-system-smart-shuffle", b()), new fpb("connect_fixes_avoid_set_options_when_not_needed", "android-system-smart-shuffle", c()), new fpb("connect_fixes_no_update_context_when_disable_smart_shuffle_over_connect", "android-system-smart-shuffle", d()), new fpb("connect_fixes_no_update_context_when_enable_smart_shuffle_over_connect", "android-system-smart-shuffle", e()), new fpb("connect_fixes_resilient_shuffle_state_timeout", "android-system-smart-shuffle", f(), 0, Integer.MAX_VALUE), new fpb("curation_disabled", "android-system-smart-shuffle", g()), new fpb("delay_sending_tap_signal", "android-system-smart-shuffle", i()), new fpb("detect_and_resolve_smart_linear", "android-system-smart-shuffle", j()), new fpb("jam_education_snackbar_enabled", "android-system-smart-shuffle", k()), new fpb("log_internal_operation_results", "android-system-smart-shuffle", l()), new fpb("npv_scroll_card_minimum_recs_fullscreen", "android-system-smart-shuffle", m(), 0, Integer.MAX_VALUE), new fpb("npv_scroll_card_minimum_recs_widget", "android-system-smart-shuffle", n(), 0, Integer.MAX_VALUE), new fpb("re_sync_liked_songs_playlist_in_entity", "android-system-smart-shuffle", o()), new fpb("send_reset_signal_on_session_start", "android-system-smart-shuffle", p()), new fpb("should_disable_liked_songs_wrapper_lens", "android-system-smart-shuffle", q()), new fpb("smart_shuffle_as_default_for_liked_songs", "android-system-smart-shuffle", r()), new fpb("smart_shuffle_as_default_for_playlist", "android-system-smart-shuffle", s()), new fpb("smart_shuffle_for_spotify_sets_enabled", "android-system-smart-shuffle", t()), new fpb("smart_shuffle_for_spotify_sets_phase1_enabled", "android-system-smart-shuffle", u()), new fpb("smart_shuffle_for_spotify_sets_phase2_enabled", "android-system-smart-shuffle", v()), new fpb("smart_shuffle_for_spotify_sets_phase3_enabled", "android-system-smart-shuffle", w()), new fpb("smart_shuffle_lens_timeout", "android-system-smart-shuffle", x(), 0, Integer.MAX_VALUE), new fpb("smart_shuffle_lens_timeout_over_connect", "android-system-smart-shuffle", y(), 0, Integer.MAX_VALUE), new fpb("smart_shuffle_show_sheet_count", "android-system-smart-shuffle", z(), 0, Integer.MAX_VALUE), new fpb("smart_shuffle_user_created_playlists_enabled", "android-system-smart-shuffle", A()), new fpb("smart_shuffle_using_lens_enabled", "android-system-smart-shuffle", B()), new fpb("third_party_playlist_support", "android-system-smart-shuffle", C()), new fpb("use_player_signals_api_for_reset_signal", "android-system-smart-shuffle", D()), new fpb("use_player_signals_api_for_smart_shuffle", "android-system-smart-shuffle", E()), new fpb("use_playlist_state_for_signals_availability", "android-system-smart-shuffle", F()), new fpb("write_to_centralized_shuffle_state", "android-system-smart-shuffle", G()));
    }

    public final int n() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.n() : this.m;
    }

    public final boolean o() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.o() : this.n;
    }

    public final boolean p() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.p() : this.o;
    }

    public final boolean q() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.q() : this.f82p;
    }

    public final boolean r() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.r() : this.q;
    }

    public final boolean s() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.s() : this.r;
    }

    public final boolean t() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.t() : this.s;
    }

    public final boolean u() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.u() : this.t;
    }

    public final boolean v() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.v() : this.u;
    }

    public final boolean w() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.w() : this.v;
    }

    public final int x() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.x() : this.w;
    }

    public final int y() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.y() : this.x;
    }

    public final int z() {
        t35 t35VarH = h();
        return t35VarH != null ? t35VarH.z() : this.y;
    }
}
