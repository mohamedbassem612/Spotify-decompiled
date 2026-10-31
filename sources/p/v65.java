package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v65 implements pdy0 {
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

    public v65(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = lukVar;
        this.j = new idd1(new f55(this, (byte) 17));
    }

    public final boolean a() {
        v65 v65VarD = d();
        return v65VarD != null ? v65VarD.a() : this.a;
    }

    public final boolean b() {
        v65 v65VarD = d();
        return v65VarD != null ? v65VarD.b() : this.b;
    }

    public final boolean c() {
        v65 v65VarD = d();
        return v65VarD != null ? v65VarD.c() : this.c;
    }

    public final v65 d() {
        return (v65) this.j.getValue();
    }

    public final boolean e() {
        v65 v65VarD = d();
        return v65VarD != null ? v65VarD.e() : this.d;
    }

    public final boolean f() {
        v65 v65VarD = d();
        return v65VarD != null ? v65VarD.f() : this.e;
    }

    public final boolean g() {
        v65 v65VarD = d();
        return v65VarD != null ? v65VarD.g() : this.f;
    }

    public final boolean h() {
        v65 v65VarD = d();
        return v65VarD != null ? v65VarD.h() : this.g;
    }

    public final boolean i() {
        v65 v65VarD = d();
        return v65VarD != null ? v65VarD.i() : this.h;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("cn_element_carousel_for_nova_scroll_enabled", "android-video-preview-flags", a()), new fpb("cn_element_carousel_play_entire_podcast_video_enabled", "android-video-preview-flags", b()), new fpb("cn_element_carousel_use_common_trait_for_preview_playback", "android-video-preview-flags", c()), new fpb("disable_all_previews", "android-video-preview-flags", e()), new fpb("element_videos_carousel_enabled", "android-video-preview-flags", f()), new fpb("enable_duration_label_video_preview_carousel", "android-video-preview-flags", g()), new fpb("multiplayer_stream_reporting_enabled", "android-video-preview-flags", h()), new fpb("use_compose_video_card_ui", "android-video-preview-flags", i()));
    }

    public v65(luk lukVar) {
        this(false, false, false, false, false, false, false, false, lukVar);
    }
}
