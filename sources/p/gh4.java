package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gh4 implements pdy0 {
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
    public final luk k;
    public final idd1 l;

    public gh4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, luk lukVar) {
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
        this.k = lukVar;
        this.l = new idd1(new cg4(this, (byte) 19));
    }

    public final gh4 a() {
        return (gh4) this.l.getValue();
    }

    public final boolean b() {
        gh4 gh4VarA = a();
        return gh4VarA != null ? gh4VarA.b() : this.a;
    }

    public final boolean c() {
        gh4 gh4VarA = a();
        return gh4VarA != null ? gh4VarA.c() : this.b;
    }

    public final boolean d() {
        gh4 gh4VarA = a();
        return gh4VarA != null ? gh4VarA.d() : this.c;
    }

    public final boolean e() {
        gh4 gh4VarA = a();
        return gh4VarA != null ? gh4VarA.e() : this.e;
    }

    public final boolean f() {
        gh4 gh4VarA = a();
        return gh4VarA != null ? gh4VarA.f() : this.f;
    }

    public final boolean g() {
        gh4 gh4VarA = a();
        return gh4VarA != null ? gh4VarA.g() : this.g;
    }

    public final boolean h() {
        gh4 gh4VarA = a();
        return gh4VarA != null ? gh4VarA.h() : this.h;
    }

    public final boolean i() {
        gh4 gh4VarA = a();
        return gh4VarA != null ? gh4VarA.i() : this.i;
    }

    public final boolean j() {
        gh4 gh4VarA = a();
        return gh4VarA != null ? gh4VarA.j() : this.j;
    }

    public final boolean k() {
        gh4 gh4VarA = a();
        return gh4VarA != null ? gh4VarA.k() : this.d;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("default_size_remove_video_padding", "android-feature-nowplayingbar", b()), new fpb("enable_resize_gesture", "android-feature-nowplayingbar", c()), new fpb("hide_add_to_element", "android-feature-nowplayingbar", d()), new fpb("is_npb_promo_indicator_enabled", "android-feature-nowplayingbar", k()), new fpb("large_size_remove_video_padding", "android-feature-nowplayingbar", e()), new fpb("larger_npb_video_on_by_default", "android-feature-nowplayingbar", f()), new fpb("larger_npb_video_setting_visible", "android-feature-nowplayingbar", g()), new fpb("npb_visibility_gating", "android-feature-nowplayingbar", h()), new fpb("render_video_surface_as_overlay", "android-feature-nowplayingbar", i()), new fpb("use_video_element", "android-feature-nowplayingbar", j())});
    }

    public gh4(luk lukVar) {
        this(false, false, false, false, false, false, false, false, true, false, lukVar);
    }
}
