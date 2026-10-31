package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class um4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e;

    public um4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
        this.e = new idd1(new om4(this, (byte) 4));
    }

    public final boolean a() {
        um4 um4Var = (um4) this.e.getValue();
        return um4Var != null ? um4Var.a() : this.a;
    }

    public final boolean b() {
        um4 um4Var = (um4) this.e.getValue();
        return um4Var != null ? um4Var.b() : this.b;
    }

    public final boolean c() {
        um4 um4Var = (um4) this.e.getValue();
        return um4Var != null ? um4Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_audio_uri_for_saves_association", "android-libs-music-video-playlists", a()), new fpb("enable_music_video_playlist", "android-libs-music-video-playlists", b()), new fpb("exclude_artist_music_videos", "android-libs-music-video-playlists", c())});
    }

    public um4(luk lukVar) {
        this(false, true, true, lukVar);
    }
}
