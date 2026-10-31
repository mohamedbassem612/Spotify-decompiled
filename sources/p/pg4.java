package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pg4 implements pdy0 {
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

    public pg4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = lukVar;
        this.j = new idd1(new cg4(this, (byte) 6));
    }

    public final pg4 a() {
        return (pg4) this.j.getValue();
    }

    public final boolean b() {
        pg4 pg4VarA = a();
        return pg4VarA != null ? pg4VarA.b() : this.a;
    }

    public final boolean c() {
        pg4 pg4VarA = a();
        return pg4VarA != null ? pg4VarA.c() : this.b;
    }

    public final boolean d() {
        pg4 pg4VarA = a();
        return pg4VarA != null ? pg4VarA.d() : this.c;
    }

    public final boolean e() {
        pg4 pg4VarA = a();
        return pg4VarA != null ? pg4VarA.e() : this.d;
    }

    public final boolean f() {
        pg4 pg4VarA = a();
        return pg4VarA != null ? pg4VarA.f() : this.e;
    }

    public final boolean g() {
        pg4 pg4VarA = a();
        return pg4VarA != null ? pg4VarA.g() : this.f;
    }

    public final boolean h() {
        pg4 pg4VarA = a();
        return pg4VarA != null ? pg4VarA.h() : this.g;
    }

    public final boolean i() {
        pg4 pg4VarA = a();
        return pg4VarA != null ? pg4VarA.i() : this.h;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_lyrics_multilanguage", "android-feature-lyrics-npvelements", b()), new fpb("enable_music_videos_lyrics", "android-feature-lyrics-npvelements", c()), new fpb("hide_lyrics_on_mixing_transition", "android-feature-lyrics-npvelements", d()), new fpb("lifecycle_aware_lyrics_fetch_enabled", "android-feature-lyrics-npvelements", e()), new fpb("lyrics_entry_point_button_v2_enabled", "android-feature-lyrics-npvelements", f()), new fpb("lyrics_entry_point_enabled", "android-feature-lyrics-npvelements", g()), new fpb("lyrics_on_car_player_enabled", "android-feature-lyrics-npvelements", h()), new fpb("shared_npv_lyrics_loading_enabled", "android-feature-lyrics-npvelements", i())});
    }

    public pg4(luk lukVar) {
        this(false, false, false, false, false, false, false, false, lukVar);
    }
}
