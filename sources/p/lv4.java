package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lv4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final kv4 j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f49p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final luk t;
    public final idd1 u;

    public lv4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, kv4 kv4Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = kv4Var;
        this.k = z10;
        this.l = z11;
        this.m = z12;
        this.n = z13;
        this.o = z14;
        this.f49p = z15;
        this.q = z16;
        this.r = z17;
        this.s = z18;
        this.t = lukVar;
        this.u = new idd1(new fv4(this, (byte) 4));
    }

    public final lv4 a() {
        return (lv4) this.u.getValue();
    }

    public final boolean b() {
        lv4 lv4VarA = a();
        return lv4VarA != null ? lv4VarA.b() : this.a;
    }

    public final boolean c() {
        lv4 lv4VarA = a();
        return lv4VarA != null ? lv4VarA.c() : this.b;
    }

    public final boolean d() {
        lv4 lv4VarA = a();
        return lv4VarA != null ? lv4VarA.d() : this.c;
    }

    public final boolean e() {
        lv4 lv4VarA = a();
        return lv4VarA != null ? lv4VarA.e() : this.d;
    }

    public final boolean f() {
        lv4 lv4VarA = a();
        return lv4VarA != null ? lv4VarA.f() : this.e;
    }

    public final boolean g() {
        lv4 lv4VarA = a();
        return lv4VarA != null ? lv4VarA.g() : this.f;
    }

    public final boolean h() {
        lv4 lv4VarA = a();
        return lv4VarA != null ? lv4VarA.h() : this.g;
    }

    public final boolean i() {
        lv4 lv4VarA = a();
        return lv4VarA != null ? lv4VarA.i() : this.h;
    }

    public final boolean j() {
        lv4 lv4VarA = a();
        return lv4VarA != null ? lv4VarA.j() : this.i;
    }

    public final kv4 k() {
        kv4 kv4VarK;
        lv4 lv4VarA = a();
        return (lv4VarA == null || (kv4VarK = lv4VarA.k()) == null) ? this.j : kv4VarK;
    }

    public final boolean l() {
        lv4 lv4VarA = a();
        return lv4VarA != null ? lv4VarA.l() : this.k;
    }

    public final boolean m() {
        lv4 lv4VarA = a();
        return lv4VarA != null ? lv4VarA.m() : this.l;
    }

    public final List models() {
        fpb fpbVar = new fpb("enable_about_card_data_element", "android-nowplaying-scroll-registration", b());
        fpb fpbVar2 = new fpb("enable_hyde_scroll_card", "android-nowplaying-scroll-registration", c());
        fpb fpbVar3 = new fpb("enable_membership_upsell_in_about_card", "android-nowplaying-scroll-registration", d());
        fpb fpbVar4 = new fpb("enable_on_tour_data_element", "android-nowplaying-scroll-registration", e());
        fpb fpbVar5 = new fpb("enable_paid_podcast_banner_npv_card", "android-nowplaying-scroll-registration", f());
        fpb fpbVar6 = new fpb("enable_read_along_data_element", "android-nowplaying-scroll-registration", g());
        fpb fpbVar7 = new fpb("enable_related_content_recommendations_carousel", "android-nowplaying-scroll-registration", h());
        fpb fpbVar8 = new fpb("enable_song_dna_data_element", "android-nowplaying-scroll-registration", i());
        fpb fpbVar9 = new fpb("enable_video_carousel_scrollsita_integration", "android-nowplaying-scroll-registration", j());
        String str = k().a;
        kv4[] kv4VarArrValues = kv4.values();
        ArrayList arrayList = new ArrayList(kv4VarArrValues.length);
        for (kv4 kv4Var : kv4VarArrValues) {
            arrayList.add(kv4Var.a);
        }
        return p7h.M(new fpb[]{fpbVar, fpbVar2, fpbVar3, fpbVar4, fpbVar5, fpbVar6, fpbVar7, fpbVar8, fpbVar9, new fpb("scrollsita_injection_policy_internal", "android-nowplaying-scroll-registration", str, arrayList), new fpb("unified_leavebehind_npv_scroll_music_enabled", "android-nowplaying-scroll-registration", l()), new fpb("unified_leavebehind_npv_scroll_podcast_enabled", "android-nowplaying-scroll-registration", m()), new fpb("video_carousel_add_to_queue_button_enabled", "android-nowplaying-scroll-registration", n()), new fpb("video_carousel_duration_label_enabled", "android-nowplaying-scroll-registration", o()), new fpb("video_carousel_in_line_release_date_enabled", "android-nowplaying-scroll-registration", p()), new fpb("video_carousel_save_button_enabled", "android-nowplaying-scroll-registration", q()), new fpb("video_carousel_two_line_title_for_podcasts_enabled", "android-nowplaying-scroll-registration", r()), new fpb("video_carousel_two_line_title_music_video_tracks_enabled", "android-nowplaying-scroll-registration", s()), new fpb("video_carousel_video_preview_when_playing_video_disabled", "android-nowplaying-scroll-registration", t())});
    }

    public final boolean n() {
        lv4 lv4VarA = a();
        return lv4VarA != null ? lv4VarA.n() : this.m;
    }

    public final boolean o() {
        lv4 lv4VarA = a();
        return lv4VarA != null ? lv4VarA.o() : this.n;
    }

    public final boolean p() {
        lv4 lv4VarA = a();
        return lv4VarA != null ? lv4VarA.p() : this.o;
    }

    public final boolean q() {
        lv4 lv4VarA = a();
        return lv4VarA != null ? lv4VarA.q() : this.f49p;
    }

    public final boolean r() {
        lv4 lv4VarA = a();
        return lv4VarA != null ? lv4VarA.r() : this.q;
    }

    public final boolean s() {
        lv4 lv4VarA = a();
        return lv4VarA != null ? lv4VarA.s() : this.r;
    }

    public final boolean t() {
        lv4 lv4VarA = a();
        return lv4VarA != null ? lv4VarA.t() : this.s;
    }

    public lv4(luk lukVar) {
        this(false, false, false, false, false, false, false, false, false, kv4.NONE, false, false, false, false, false, false, false, false, false, lukVar);
    }
}
