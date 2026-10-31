package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yy4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final luk h;
    public final idd1 i;

    public yy4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = lukVar;
        this.i = new idd1(new sx4(this, (byte) 18));
    }

    public final yy4 a() {
        return (yy4) this.i.getValue();
    }

    public final boolean b() {
        yy4 yy4VarA = a();
        return yy4VarA != null ? yy4VarA.b() : this.a;
    }

    public final boolean c() {
        yy4 yy4VarA = a();
        return yy4VarA != null ? yy4VarA.c() : this.b;
    }

    public final boolean d() {
        yy4 yy4VarA = a();
        return yy4VarA != null ? yy4VarA.d() : this.c;
    }

    public final boolean e() {
        yy4 yy4VarA = a();
        return yy4VarA != null ? yy4VarA.e() : this.d;
    }

    public final boolean f() {
        yy4 yy4VarA = a();
        return yy4VarA != null ? yy4VarA.f() : this.e;
    }

    public final boolean g() {
        yy4 yy4VarA = a();
        return yy4VarA != null ? yy4VarA.g() : this.f;
    }

    public final boolean h() {
        yy4 yy4VarA = a();
        return yy4VarA != null ? yy4VarA.h() : this.g;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_content_experience_trait", "android-preview-card-medium", b()), new fpb("enable_extended_linger_time", "android-preview-card-medium", c()), new fpb("enable_podcast_chapter_transcripts", "android-preview-card-medium", d()), new fpb("enable_user_initiated_play", "android-preview-card-medium", e()), new fpb("enable_video_promo_recsplanation_header_in_main_feed", "android-preview-card-medium", f()), new fpb("full_length_music_video_and_tentpole_enabled", "android-preview-card-medium", g()), new fpb("unify_mdc_section_carousel", "android-preview-card-medium", h()));
    }

    public yy4(luk lukVar) {
        this(false, false, true, false, false, false, false, lukVar);
    }
}
