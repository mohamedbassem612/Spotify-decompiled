package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ro4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final luk j;
    public final idd1 k = new idd1(new zn4(this, (byte) 12));

    public ro4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = lukVar;
    }

    public final boolean a() {
        ro4 ro4VarB = b();
        return ro4VarB != null ? ro4VarB.a() : this.a;
    }

    public final ro4 b() {
        return (ro4) this.k.getValue();
    }

    public final boolean c() {
        ro4 ro4VarB = b();
        return ro4VarB != null ? ro4VarB.c() : this.b;
    }

    public final boolean d() {
        ro4 ro4VarB = b();
        return ro4VarB != null ? ro4VarB.d() : this.c;
    }

    public final boolean e() {
        ro4 ro4VarB = b();
        return ro4VarB != null ? ro4VarB.e() : this.d;
    }

    public final boolean f() {
        ro4 ro4VarB = b();
        return ro4VarB != null ? ro4VarB.f() : this.e;
    }

    public final boolean g() {
        ro4 ro4VarB = b();
        return ro4VarB != null ? ro4VarB.g() : this.f;
    }

    public final boolean h() {
        ro4 ro4VarB = b();
        return ro4VarB != null ? ro4VarB.h() : this.g;
    }

    public final boolean i() {
        ro4 ro4VarB = b();
        return ro4VarB != null ? ro4VarB.i() : this.h;
    }

    public final boolean j() {
        ro4 ro4VarB = b();
        return ro4VarB != null ? ro4VarB.j() : this.i;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("content_filter_stacking_enabled", "android-libs-your-episodes-flags", a()), new fpb("enable_inline_sort_order", "android-libs-your-episodes-flags", c()), new fpb("enable_sortby_recently_played", "android-libs-your-episodes-flags", d()), new fpb("enable_sortby_show_name", "android-libs-your-episodes-flags", e()), new fpb("remove_played_hint_card_enabled", "android-libs-your-episodes-flags", f()), new fpb("remove_unplayed_settings_enabled", "android-libs-your-episodes-flags", g()), new fpb("reordering_enabled", "android-libs-your-episodes-flags", h()), new fpb("sort_order_enabled", "android-libs-your-episodes-flags", i()), new fpb("text_filter_and_sort_options_enabled", "android-libs-your-episodes-flags", j()));
    }
}
