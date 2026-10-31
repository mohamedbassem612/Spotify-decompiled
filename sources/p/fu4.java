package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fu4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new st4(this, (byte) 10));

    public fu4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        fu4 fu4Var = (fu4) this.d.getValue();
        return fu4Var != null ? fu4Var.a() : this.a;
    }

    public final boolean b() {
        fu4 fu4Var = (fu4) this.d.getValue();
        return fu4Var != null ? fu4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("music_video_enabled", "android-music-videos-widget-impl", a()), new fpb("podcast_video_enabled", "android-music-videos-widget-impl", b())});
    }
}
