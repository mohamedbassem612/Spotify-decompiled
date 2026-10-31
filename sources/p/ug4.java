package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ug4 implements pdy0 {
    public final boolean a;
    public final int b;
    public final luk c;
    public final idd1 d;

    public ug4(int i, luk lukVar, boolean z) {
        this.a = z;
        this.b = i;
        this.c = lukVar;
        this.d = new idd1(new cg4(this, (byte) 11));
    }

    public final boolean a() {
        ug4 ug4Var = (ug4) this.d.getValue();
        return ug4Var != null ? ug4Var.a() : this.a;
    }

    public final int b() {
        ug4 ug4Var = (ug4) this.d.getValue();
        return ug4Var != null ? ug4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("music_video_prerelease_enabled", "android-feature-music-video-prerelease", a()), new fpb("music_video_prerelease_timeout_ms", "android-feature-music-video-prerelease", b(), 100, 30000)});
    }

    public ug4(luk lukVar) {
        this(3000, lukVar, false);
    }
}
