package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sn4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final luk h;
    public final idd1 i;

    public sn4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = lukVar;
        this.i = new idd1(new om4(this, (byte) 24));
    }

    public final sn4 a() {
        return (sn4) this.i.getValue();
    }

    public final boolean b() {
        sn4 sn4VarA = a();
        return sn4VarA != null ? sn4VarA.b() : this.a;
    }

    public final boolean c() {
        sn4 sn4VarA = a();
        return sn4VarA != null ? sn4VarA.c() : this.b;
    }

    public final boolean d() {
        sn4 sn4VarA = a();
        return sn4VarA != null ? sn4VarA.d() : this.c;
    }

    public final boolean e() {
        sn4 sn4VarA = a();
        return sn4VarA != null ? sn4VarA.e() : this.d;
    }

    public final boolean f() {
        sn4 sn4VarA = a();
        return sn4VarA != null ? sn4VarA.f() : this.e;
    }

    public final boolean g() {
        sn4 sn4VarA = a();
        return sn4VarA != null ? sn4VarA.g() : this.f;
    }

    public final boolean h() {
        sn4 sn4VarA = a();
        return sn4VarA != null ? sn4VarA.h() : this.g;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_media_type_carousel_acceptance", "android-libs-nowplaying-uiusecases", b()), new fpb("enable_multitap_seek_horizontal_video", "android-libs-nowplaying-uiusecases", c()), new fpb("enable_multitap_seek_square_cover_art", "android-libs-nowplaying-uiusecases", d()), new fpb("enable_multitap_seek_transcript", "android-libs-nowplaying-uiusecases", e()), new fpb("scope_carousel_holders_to_mode_page", "android-libs-nowplaying-uiusecases", f()), new fpb("should_use_vit", "android-libs-nowplaying-uiusecases", g()), new fpb("should_use_vit_to_show_thumbnail", "android-libs-nowplaying-uiusecases", h())});
    }

    public sn4(luk lukVar) {
        this(false, false, false, false, true, false, false, lukVar);
    }
}
