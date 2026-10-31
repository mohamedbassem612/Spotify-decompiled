package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nv4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final luk f;
    public final idd1 g = new idd1(new fv4(this, (byte) 6));

    public nv4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = lukVar;
    }

    public final boolean a() {
        nv4 nv4Var = (nv4) this.g.getValue();
        return nv4Var != null ? nv4Var.a() : this.a;
    }

    public final boolean b() {
        nv4 nv4Var = (nv4) this.g.getValue();
        return nv4Var != null ? nv4Var.b() : this.b;
    }

    public final boolean c() {
        nv4 nv4Var = (nv4) this.g.getValue();
        return nv4Var != null ? nv4Var.c() : this.c;
    }

    public final boolean d() {
        nv4 nv4Var = (nv4) this.g.getValue();
        return nv4Var != null ? nv4Var.d() : this.d;
    }

    public final boolean e() {
        nv4 nv4Var = (nv4) this.g.getValue();
        return nv4Var != null ? nv4Var.e() : this.e;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_audio_language_setting", "android-nowplaying-video-settings", a()), new fpb("enable_larger_npb_setting", "android-nowplaying-video-settings", b()), new fpb("enable_pip_setting", "android-nowplaying-video-settings", c()), new fpb("enable_playback_settings", "android-nowplaying-video-settings", d()), new fpb("enable_video_quality_setting", "android-nowplaying-video-settings", e())});
    }
}
