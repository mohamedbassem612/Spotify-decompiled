package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wh4 implements pdy0 {
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
    public final luk l;
    public final idd1 m;

    public wh4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, luk lukVar) {
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
        this.l = lukVar;
        this.m = new idd1(new sh4(this, (byte) 3));
    }

    public final wh4 a() {
        return (wh4) this.m.getValue();
    }

    public final boolean b() {
        wh4 wh4VarA = a();
        return wh4VarA != null ? wh4VarA.b() : this.a;
    }

    public final boolean c() {
        wh4 wh4VarA = a();
        return wh4VarA != null ? wh4VarA.c() : this.b;
    }

    public final boolean d() {
        wh4 wh4VarA = a();
        return wh4VarA != null ? wh4VarA.d() : this.c;
    }

    public final boolean e() {
        wh4 wh4VarA = a();
        return wh4VarA != null ? wh4VarA.e() : this.d;
    }

    public final boolean f() {
        wh4 wh4VarA = a();
        return wh4VarA != null ? wh4VarA.f() : this.e;
    }

    public final boolean g() {
        wh4 wh4VarA = a();
        return wh4VarA != null ? wh4VarA.g() : this.f;
    }

    public final boolean h() {
        wh4 wh4VarA = a();
        return wh4VarA != null ? wh4VarA.h() : this.g;
    }

    public final boolean i() {
        wh4 wh4VarA = a();
        return wh4VarA != null ? wh4VarA.i() : this.h;
    }

    public final boolean j() {
        wh4 wh4VarA = a();
        return wh4VarA != null ? wh4VarA.j() : this.i;
    }

    public final boolean k() {
        wh4 wh4VarA = a();
        return wh4VarA != null ? wh4VarA.k() : this.j;
    }

    public final boolean l() {
        wh4 wh4VarA = a();
        return wh4VarA != null ? wh4VarA.l() : this.k;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_album_reporting", "android-feature-reporting", b()), new fpb("enable_artist_reporting", "android-feature-reporting", c()), new fpb("enable_audiobook_chapter_reporting", "android-feature-reporting", d()), new fpb("enable_author_reporting", "android-feature-reporting", e()), new fpb("enable_canvas_track_reporting", "android-feature-reporting", f()), new fpb("enable_episode_reporting", "android-feature-reporting", g()), new fpb("enable_hybrid_report_flow", "android-feature-reporting", h()), new fpb("enable_promo_episode_reporting", "android-feature-reporting", i()), new fpb("enable_show_reporting", "android-feature-reporting", j()), new fpb("enable_track_reporting", "android-feature-reporting", k()), new fpb("enable_user_reporting", "android-feature-reporting", l())});
    }

    public wh4(luk lukVar) {
        this(false, false, false, false, true, false, false, false, false, false, true, lukVar);
    }
}
