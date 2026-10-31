package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g26 implements pdy0 {
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

    public g26(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, luk lukVar) {
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
        this.m = new idd1(new f85(this, (byte) 29));
    }

    public final boolean a() {
        g26 g26VarE = e();
        return g26VarE != null ? g26VarE.a() : this.a;
    }

    public final boolean b() {
        g26 g26VarE = e();
        return g26VarE != null ? g26VarE.b() : this.b;
    }

    public final boolean c() {
        g26 g26VarE = e();
        return g26VarE != null ? g26VarE.c() : this.c;
    }

    public final boolean d() {
        g26 g26VarE = e();
        return g26VarE != null ? g26VarE.d() : this.d;
    }

    public final g26 e() {
        return (g26) this.m.getValue();
    }

    public final boolean f() {
        g26 g26VarE = e();
        return g26VarE != null ? g26VarE.f() : this.e;
    }

    public final boolean g() {
        g26 g26VarE = e();
        return g26VarE != null ? g26VarE.g() : this.f;
    }

    public final boolean h() {
        g26 g26VarE = e();
        return g26VarE != null ? g26VarE.h() : this.g;
    }

    public final boolean i() {
        g26 g26VarE = e();
        return g26VarE != null ? g26VarE.i() : this.h;
    }

    public final boolean j() {
        g26 g26VarE = e();
        return g26VarE != null ? g26VarE.j() : this.i;
    }

    public final boolean k() {
        g26 g26VarE = e();
        return g26VarE != null ? g26VarE.k() : this.j;
    }

    public final boolean l() {
        g26 g26VarE = e();
        return g26VarE != null ? g26VarE.l() : this.k;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("canvas_enabled", "apps-music-libs-canvas", a()), new fpb("canvas_on_tablets_enabled", "apps-music-libs-canvas", b()), new fpb("canvas_on_tablets_landscape_enabled", "apps-music-libs-canvas", c()), new fpb("canvas_on_tablets_portrait_enabled", "apps-music-libs-canvas", d()), new fpb("dim_canvas_on_mixing_transition", "apps-music-libs-canvas", f()), new fpb("explicit_canvas_enabled", "apps-music-libs-canvas", g()), new fpb("gate_canvas_surface_on_first_frame", "apps-music-libs-canvas", h()), new fpb("pause_offscreen_canvas_playback_enabled", "apps-music-libs-canvas", i()), new fpb("scope_canvas_holders_to_mode_page", "apps-music-libs-canvas", j()), new fpb("stable_canvas_backdrop", "apps-music-libs-canvas", k()), new fpb("use_multiplayer_for_canvas_video", "apps-music-libs-canvas", l()));
    }

    public g26(luk lukVar) {
        this(true, false, false, false, false, false, false, false, true, false, false, lukVar);
    }
}
