package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jh4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final luk i;
    public final idd1 j;

    public jh4(boolean z, boolean z2, int i, int i2, boolean z3, int i3, boolean z4, boolean z5, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = i3;
        this.g = z4;
        this.h = z5;
        this.i = lukVar;
        this.j = new idd1(new cg4(this, (byte) 22));
    }

    public final boolean a() {
        jh4 jh4VarB = b();
        return jh4VarB != null ? jh4VarB.a() : this.a;
    }

    public final jh4 b() {
        return (jh4) this.j.getValue();
    }

    public final boolean c() {
        jh4 jh4VarB = b();
        return jh4VarB != null ? jh4VarB.c() : this.b;
    }

    public final int d() {
        jh4 jh4VarB = b();
        return jh4VarB != null ? jh4VarB.d() : this.c;
    }

    public final int e() {
        jh4 jh4VarB = b();
        return jh4VarB != null ? jh4VarB.e() : this.d;
    }

    public final boolean f() {
        jh4 jh4VarB = b();
        return jh4VarB != null ? jh4VarB.f() : this.e;
    }

    public final int g() {
        jh4 jh4VarB = b();
        return jh4VarB != null ? jh4VarB.g() : this.f;
    }

    public final boolean h() {
        jh4 jh4VarB = b();
        return jh4VarB != null ? jh4VarB.h() : this.g;
    }

    public final boolean i() {
        jh4 jh4VarB = b();
        return jh4VarB != null ? jh4VarB.i() : this.h;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("custom_resolver_enabled", "android-feature-playlist-creation-flags", a()), new fpb("euterpe_enable_pagination", "android-feature-playlist-creation-flags", c()), new fpb("euterpe_menu_option_position", "android-feature-playlist-creation-flags", d(), 0, 2), new fpb("euterpe_message_preference_update_debounce", "android-feature-playlist-creation-flags", e(), 0, Integer.MAX_VALUE), new fpb("euterpe_re_edit_flow_enabled", "android-feature-playlist-creation-flags", f()), new fpb("euterpe_status_update_throttle", "android-feature-playlist-creation-flags", g(), 0, Integer.MAX_VALUE), new fpb("link_with_prepopulated_prompt_enabled", "android-feature-playlist-creation-flags", h()), new fpb("us_disclaimer_enabled", "android-feature-playlist-creation-flags", i()));
    }

    public jh4(luk lukVar) {
        this(false, false, 2, 3000, false, 2000, true, false, lukVar);
    }
}
