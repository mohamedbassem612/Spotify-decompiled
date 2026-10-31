package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jn4 implements pdy0 {
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
    public final idd1 k;

    public jn4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, luk lukVar) {
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
        this.k = new idd1(new om4(this, (byte) 16));
    }

    public final jn4 a() {
        return (jn4) this.k.getValue();
    }

    public final boolean b() {
        jn4 jn4VarA = a();
        return jn4VarA != null ? jn4VarA.b() : this.a;
    }

    public final boolean c() {
        jn4 jn4VarA = a();
        return jn4VarA != null ? jn4VarA.c() : this.b;
    }

    public final boolean d() {
        jn4 jn4VarA = a();
        return jn4VarA != null ? jn4VarA.d() : this.c;
    }

    public final boolean e() {
        jn4 jn4VarA = a();
        return jn4VarA != null ? jn4VarA.e() : this.d;
    }

    public final boolean f() {
        jn4 jn4VarA = a();
        return jn4VarA != null ? jn4VarA.f() : this.e;
    }

    public final boolean g() {
        jn4 jn4VarA = a();
        return jn4VarA != null ? jn4VarA.g() : this.f;
    }

    public final boolean h() {
        jn4 jn4VarA = a();
        return jn4VarA != null ? jn4VarA.h() : this.g;
    }

    public final boolean i() {
        jn4 jn4VarA = a();
        return jn4VarA != null ? jn4VarA.i() : this.h;
    }

    public final boolean j() {
        jn4 jn4VarA = a();
        return jn4VarA != null ? jn4VarA.j() : this.i;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("is_hello_kitty_easter_egg_enabled", "android-libs-nowplaying-elements-seekbar", b()), new fpb("is_pokemon_easter_egg_enabled", "android-libs-nowplaying-elements-seekbar", c()), new fpb("is_sanremo_easter_egg_enabled", "android-libs-nowplaying-elements-seekbar", d()), new fpb("is_stranger_things_easter_egg_enabled", "android-libs-nowplaying-elements-seekbar", e()), new fpb("is_super_mario_luma_easter_egg_enabled", "android-libs-nowplaying-elements-seekbar", f()), new fpb("is_super_mario_star_easter_egg_enabled", "android-libs-nowplaying-elements-seekbar", g()), new fpb("is_wednesday_official_easter_egg_enabled", "android-libs-nowplaying-elements-seekbar", h()), new fpb("is_wicked_easter_egg_enabled", "android-libs-nowplaying-elements-seekbar", i()), new fpb("is_world_cup_easter_egg_enabled", "android-libs-nowplaying-elements-seekbar", j())});
    }

    public jn4(luk lukVar) {
        this(false, false, false, false, false, false, false, false, false, lukVar);
    }
}
