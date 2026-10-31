package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n15 implements pdy0 {
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
    public final int f57p;
    public final int q;
    public final int r;
    public final luk s;
    public final idd1 t;

    public n15(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i, int i2, int i3, luk lukVar) {
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
        this.f57p = i;
        this.q = i2;
        this.r = i3;
        this.s = lukVar;
        this.t = new idd1(new q30(this, (byte) 21));
    }

    public final n15 a() {
        return (n15) this.t.getValue();
    }

    public final boolean b() {
        n15 n15VarA = a();
        return n15VarA != null ? n15VarA.b() : this.a;
    }

    public final boolean c() {
        n15 n15VarA = a();
        return n15VarA != null ? n15VarA.c() : this.b;
    }

    public final boolean d() {
        n15 n15VarA = a();
        return n15VarA != null ? n15VarA.d() : this.o;
    }

    public final int e() {
        n15 n15VarA = a();
        return n15VarA != null ? n15VarA.e() : this.f57p;
    }

    public final int f() {
        n15 n15VarA = a();
        return n15VarA != null ? n15VarA.f() : this.q;
    }

    public final int g() {
        n15 n15VarA = a();
        return n15VarA != null ? n15VarA.g() : this.r;
    }

    public final boolean h() {
        n15 n15VarA = a();
        return n15VarA != null ? n15VarA.h() : this.c;
    }

    public final boolean i() {
        n15 n15VarA = a();
        return n15VarA != null ? n15VarA.i() : this.d;
    }

    public final boolean j() {
        n15 n15VarA = a();
        return n15VarA != null ? n15VarA.j() : this.e;
    }

    public final boolean k() {
        n15 n15VarA = a();
        return n15VarA != null ? n15VarA.k() : this.f;
    }

    public final boolean l() {
        n15 n15VarA = a();
        return n15VarA != null ? n15VarA.l() : this.g;
    }

    public final boolean m() {
        n15 n15VarA = a();
        return n15VarA != null ? n15VarA.m() : this.h;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_client_side_playlist_sticker", "android-share", b()), new fpb("enable_sts_sharing_as_music", "android-share", c()), new fpb("is_clip_sharing_enhancements_enabled", "android-share", h()), new fpb("is_idaho_videos_enabled", "android-share", i()), new fpb("is_lyrics_edit_from_carousel_enabled", "android-share", j()), new fpb("is_on_platform_local_share_preview_enabled", "android-share", k()), new fpb("is_share_card_config_upload_enabled", "android-share", l()), new fpb("is_share_sheet_time_measurement_enabled", "android-share", m()), new fpb("is_track_uri_to_facebook_feed_enabled", "android-share", n()), new fpb("is_track_uri_to_facebook_stories_enabled", "android-share", o()), new fpb("is_track_uri_to_instagram_stories_enabled", "android-share", p()), new fpb("is_track_uri_to_snapchat_enabled", "android-share", q()), new fpb("is_track_uri_to_whatsapp_status_enabled", "android-share", r()), new fpb("is_whatsapp_status_videos_enabled", "android-share", s()), new fpb("kallax_chat_preview_enabled", "android-share", d()), new fpb("max_shared_video_duration", "android-share", e(), 1, 60), new fpb("minimum_instagram_notes_version", "android-share", f(), -1, Integer.MAX_VALUE), new fpb("required_threads_version", "android-share", g(), -1, Integer.MAX_VALUE));
    }

    public final boolean n() {
        n15 n15VarA = a();
        return n15VarA != null ? n15VarA.n() : this.i;
    }

    public final boolean o() {
        n15 n15VarA = a();
        return n15VarA != null ? n15VarA.o() : this.j;
    }

    public final boolean p() {
        n15 n15VarA = a();
        return n15VarA != null ? n15VarA.p() : this.k;
    }

    public final boolean q() {
        n15 n15VarA = a();
        return n15VarA != null ? n15VarA.q() : this.l;
    }

    public final boolean r() {
        n15 n15VarA = a();
        return n15VarA != null ? n15VarA.r() : this.m;
    }

    public final boolean s() {
        n15 n15VarA = a();
        return n15VarA != null ? n15VarA.s() : this.n;
    }

    public n15(luk lukVar) {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 20, -1, -1, lukVar);
    }
}
