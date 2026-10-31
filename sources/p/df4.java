package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class df4 implements pdy0 {
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
    public final luk l;
    public final idd1 m;

    public df4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, luk lukVar) {
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
        this.l = lukVar;
        this.m = new idd1(new pe4(this, (byte) 11));
    }

    public final boolean a() {
        df4 df4VarC = c();
        return df4VarC != null ? df4VarC.a() : this.a;
    }

    public final boolean b() {
        df4 df4VarC = c();
        return df4VarC != null ? df4VarC.b() : this.b;
    }

    public final df4 c() {
        return (df4) this.m.getValue();
    }

    public final boolean d() {
        df4 df4VarC = c();
        return df4VarC != null ? df4VarC.d() : this.c;
    }

    public final boolean e() {
        df4 df4VarC = c();
        return df4VarC != null ? df4VarC.e() : this.d;
    }

    public final boolean f() {
        df4 df4VarC = c();
        return df4VarC != null ? df4VarC.f() : this.e;
    }

    public final int g() {
        df4 df4VarC = c();
        return df4VarC != null ? df4VarC.g() : this.f;
    }

    public final boolean h() {
        df4 df4VarC = c();
        return df4VarC != null ? df4VarC.h() : this.g;
    }

    public final boolean i() {
        df4 df4VarC = c();
        return df4VarC != null ? df4VarC.i() : this.h;
    }

    public final boolean j() {
        df4 df4VarC = c();
        return df4VarC != null ? df4VarC.j() : this.i;
    }

    public final boolean k() {
        df4 df4VarC = c();
        return df4VarC != null ? df4VarC.k() : this.j;
    }

    public final boolean l() {
        df4 df4VarC = c();
        return df4VarC != null ? df4VarC.l() : this.k;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("age_assurance_permission_enabled", "android-feature-album-page", a()), new fpb("context_menu_in_toolbar_trailing_action", "android-feature-album-page", b()), new fpb("enable_omni_play_button", "android-feature-album-page", d()), new fpb("preload_watch_feed_cdp", "android-feature-album-page", e()), new fpb("prerelease_in_cwp_enabled", "android-feature-album-page", f()), new fpb("redirect_to_cdp_timeout", "android-feature-album-page", g(), 0, 3000), new fpb("share_in_action_row_enabled", "android-feature-album-page", h()), new fpb("should_use_compose_encore_list_row", "android-feature-album-page", i()), new fpb("use_curation_state_api_for_banned_state", "android-feature-album-page", j()), new fpb("use_kodiak_release_row", "android-feature-album-page", k()), new fpb("use_mdc_carousel", "android-feature-album-page", l()));
    }

    public df4(luk lukVar) {
        this(false, false, false, false, false, 500, false, false, false, false, false, lukVar);
    }
}
