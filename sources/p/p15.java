package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p15 implements pdy0 {
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

    public p15(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, luk lukVar) {
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
        this.k = new idd1(new uz4(this, (byte) 22));
    }

    public final p15 a() {
        return (p15) this.k.getValue();
    }

    public final boolean b() {
        p15 p15VarA = a();
        return p15VarA != null ? p15VarA.b() : this.a;
    }

    public final boolean c() {
        p15 p15VarA = a();
        return p15VarA != null ? p15VarA.c() : this.b;
    }

    public final boolean d() {
        p15 p15VarA = a();
        return p15VarA != null ? p15VarA.d() : this.c;
    }

    public final boolean e() {
        p15 p15VarA = a();
        return p15VarA != null ? p15VarA.e() : this.d;
    }

    public final boolean f() {
        p15 p15VarA = a();
        return p15VarA != null ? p15VarA.f() : this.e;
    }

    public final boolean g() {
        p15 p15VarA = a();
        return p15VarA != null ? p15VarA.g() : this.f;
    }

    public final boolean h() {
        p15 p15VarA = a();
        return p15VarA != null ? p15VarA.h() : this.g;
    }

    public final boolean i() {
        p15 p15VarA = a();
        return p15VarA != null ? p15VarA.i() : this.h;
    }

    public final boolean j() {
        p15 p15VarA = a();
        return p15VarA != null ? p15VarA.j() : this.i;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_audio_chapter_provider_registration", "android-shareconsumers-cardproviders", b()), new fpb("enable_audio_content_provider_registration", "android-shareconsumers-cardproviders", c()), new fpb("enable_fandom_collectibles_provider_registration", "android-shareconsumers-cardproviders", d()), new fpb("enable_full_content_provider_registration", "android-shareconsumers-cardproviders", e()), new fpb("enable_music_video_sticker_provider_registration", "android-shareconsumers-cardproviders", f()), new fpb("enable_prompted_playlist_provider_registration", "android-shareconsumers-cardproviders", g()), new fpb("enable_text_content_provider_registration", "android-shareconsumers-cardproviders", h()), new fpb("enable_video_chapter_provider_registration", "android-shareconsumers-cardproviders", i()), new fpb("enable_video_timestamp_provider_registration", "android-shareconsumers-cardproviders", j())});
    }

    public p15(luk lukVar) {
        this(false, false, false, false, false, false, false, false, false, lukVar);
    }
}
