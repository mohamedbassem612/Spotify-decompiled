package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rg4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final luk i;
    public final idd1 j;

    public rg4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = lukVar;
        this.j = new idd1(new cg4(this, (byte) 8));
    }

    public static rg4 j(aey0 aey0Var) {
        return new rg4(aey0Var.c("android-feature-magpie:capping_enabled", false), aey0Var.c("android-feature-magpie:force_product_state_enabled", false), aey0Var.c("android-feature-magpie:magpie_playlist_enabled", false), aey0Var.c("android-feature-magpie:magpie_playlist_update_cadence_enabled", false), aey0Var.c("android-feature-magpie:play_on_ready_enabled", false), aey0Var.c("android-feature-magpie:playlist_generation_mode_enabled", false), aey0Var.c("android-feature-magpie:upsellability_enabled", false), aey0Var.c("android-feature-magpie:use_feature_definition", false), null);
    }

    public final boolean a() {
        rg4 rg4VarB = b();
        return rg4VarB != null ? rg4VarB.a() : this.a;
    }

    public final rg4 b() {
        return (rg4) this.j.getValue();
    }

    public final boolean c() {
        rg4 rg4VarB = b();
        return rg4VarB != null ? rg4VarB.c() : this.b;
    }

    public final boolean d() {
        rg4 rg4VarB = b();
        return rg4VarB != null ? rg4VarB.d() : this.c;
    }

    public final boolean e() {
        rg4 rg4VarB = b();
        return rg4VarB != null ? rg4VarB.e() : this.d;
    }

    public final boolean f() {
        rg4 rg4VarB = b();
        return rg4VarB != null ? rg4VarB.f() : this.e;
    }

    public final boolean g() {
        rg4 rg4VarB = b();
        return rg4VarB != null ? rg4VarB.g() : this.f;
    }

    public final boolean h() {
        rg4 rg4VarB = b();
        return rg4VarB != null ? rg4VarB.h() : this.g;
    }

    public final boolean i() {
        rg4 rg4VarB = b();
        return rg4VarB != null ? rg4VarB.i() : this.h;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("capping_enabled", "android-feature-magpie", a()), new fpb("force_product_state_enabled", "android-feature-magpie", c()), new fpb("magpie_playlist_enabled", "android-feature-magpie", d()), new fpb("magpie_playlist_update_cadence_enabled", "android-feature-magpie", e()), new fpb("play_on_ready_enabled", "android-feature-magpie", f()), new fpb("playlist_generation_mode_enabled", "android-feature-magpie", g()), new fpb("upsellability_enabled", "android-feature-magpie", h()), new fpb("use_feature_definition", "android-feature-magpie", i()));
    }

    public rg4(luk lukVar) {
        this(false, false, false, false, false, false, false, false, lukVar);
    }
}
