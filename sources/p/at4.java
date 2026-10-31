package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class at4 implements pdy0 {
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
    public final tgp0 k;
    public final luk l;
    public final idd1 m = new idd1(new q30(this, (byte) 18));
    public final idd1 n = new idd1(new rq4(this, (byte) 18));

    public at4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, tgp0 tgp0Var, luk lukVar) {
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
        this.k = tgp0Var;
        this.l = lukVar;
    }

    public final boolean a() {
        at4 at4VarC = c();
        return at4VarC != null ? at4VarC.a() : this.a;
    }

    public final boolean b() {
        at4 at4VarC = c();
        return at4VarC != null ? at4VarC.b() : this.b;
    }

    public final at4 c() {
        return (at4) this.n.getValue();
    }

    public final boolean d() {
        at4 at4VarC = c();
        return at4VarC != null ? at4VarC.d() : this.c;
    }

    public final boolean e() {
        at4 at4VarC = c();
        return at4VarC != null ? at4VarC.e() : this.d;
    }

    public final boolean f() {
        at4 at4VarC = c();
        return at4VarC != null ? at4VarC.f() : this.e;
    }

    public final boolean g() {
        at4 at4VarC = c();
        return at4VarC != null ? at4VarC.g() : this.f;
    }

    public final boolean h() {
        at4 at4VarC = c();
        return at4VarC != null ? at4VarC.h() : this.g;
    }

    public final boolean i() {
        at4 at4VarC = c();
        return at4VarC != null ? at4VarC.i() : this.h;
    }

    public final boolean j() {
        at4 at4VarC = c();
        return at4VarC != null ? at4VarC.j() : this.i;
    }

    public final boolean k() {
        at4 at4VarC = c();
        return at4VarC != null ? at4VarC.k() : this.j;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("burst_skip_enabled", "android-media-session", a()), new fpb("canvas_in_media_session_enabled", "android-media-session", b()), new fpb("enable_chaptered_content_experience", "android-media-session", d()), new fpb("enable_cold_boot_defaults", "android-media-session", e()), new fpb("enable_lossless_signifiers_when_car_is_connected", "android-media-session", f()), new fpb("media3_enabled", "android-media-session", g()), new fpb("playback_takeover_enabled", "android-media-session", h()), new fpb("restrict_playing_state_when_connect_car_is_active", "android-media-session", i()), new fpb("should_use_vit", "android-media-session", j()), new fpb("skip_to_next_chapter_enabled", "android-media-session", k()));
    }
}
