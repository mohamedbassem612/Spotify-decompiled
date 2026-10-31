package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class eu4 implements pdy0 {
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
    public final boolean f23p;
    public final luk q;
    public final idd1 r;

    public eu4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, luk lukVar) {
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
        this.f23p = z16;
        this.q = lukVar;
        this.r = new idd1(new st4(this, (byte) 9));
    }

    public final boolean a() {
        eu4 eu4VarD = d();
        return eu4VarD != null ? eu4VarD.a() : this.a;
    }

    public final boolean b() {
        eu4 eu4VarD = d();
        return eu4VarD != null ? eu4VarD.b() : this.b;
    }

    public final boolean c() {
        eu4 eu4VarD = d();
        return eu4VarD != null ? eu4VarD.c() : this.c;
    }

    public final eu4 d() {
        return (eu4) this.r.getValue();
    }

    public final boolean e() {
        eu4 eu4VarD = d();
        return eu4VarD != null ? eu4VarD.e() : this.d;
    }

    public final boolean f() {
        eu4 eu4VarD = d();
        return eu4VarD != null ? eu4VarD.f() : this.e;
    }

    public final boolean g() {
        eu4 eu4VarD = d();
        return eu4VarD != null ? eu4VarD.g() : this.f;
    }

    public final boolean h() {
        eu4 eu4VarD = d();
        return eu4VarD != null ? eu4VarD.h() : this.g;
    }

    public final boolean i() {
        eu4 eu4VarD = d();
        return eu4VarD != null ? eu4VarD.i() : this.h;
    }

    public final boolean j() {
        eu4 eu4VarD = d();
        return eu4VarD != null ? eu4VarD.j() : this.i;
    }

    public final boolean k() {
        eu4 eu4VarD = d();
        return eu4VarD != null ? eu4VarD.k() : this.j;
    }

    public final boolean l() {
        eu4 eu4VarD = d();
        return eu4VarD != null ? eu4VarD.l() : this.k;
    }

    public final boolean m() {
        eu4 eu4VarD = d();
        return eu4VarD != null ? eu4VarD.m() : this.l;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("add_to_button_saves_association", "android-music-videos-flags", a()), new fpb("artist_autoplay_enabled", "android-music-videos-flags", b()), new fpb("auto_play_silent_failure_check", "android-music-videos-flags", c()), new fpb("deeplink_georestricted_play_association", "android-music-videos-flags", e()), new fpb("disable_all_previews", "android-music-videos-flags", f()), new fpb("disable_playback_over_connect_speakers", "android-music-videos-flags", g()), new fpb("enable_download_header_on_music_video_playlist", "android-music-videos-flags", h()), new fpb("enable_download_state_manager", "android-music-videos-flags", i()), new fpb("enable_individual_music_video_download", "android-music-videos-flags", j()), new fpb("enable_video_download_state_data_source", "android-music-videos-flags", k()), new fpb("enable_video_selection_sheet", "android-music-videos-flags", l()), new fpb("heart_button_saves_association", "android-music-videos-flags", m()), new fpb("music_video_deeplink_new_routing_enabled", "android-music-videos-flags", n()), new fpb("music_video_deeplink_on_free_enabled", "android-music-videos-flags", o()), new fpb("new_autoplay_api_enabled", "android-music-videos-flags", p()), new fpb("npv_autoplay_enabled", "android-music-videos-flags", q()));
    }

    public final boolean n() {
        eu4 eu4VarD = d();
        return eu4VarD != null ? eu4VarD.n() : this.m;
    }

    public final boolean o() {
        eu4 eu4VarD = d();
        return eu4VarD != null ? eu4VarD.o() : this.n;
    }

    public final boolean p() {
        eu4 eu4VarD = d();
        return eu4VarD != null ? eu4VarD.p() : this.o;
    }

    public final boolean q() {
        eu4 eu4VarD = d();
        return eu4VarD != null ? eu4VarD.q() : this.f23p;
    }

    public eu4(luk lukVar) {
        this(false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, lukVar);
    }
}
