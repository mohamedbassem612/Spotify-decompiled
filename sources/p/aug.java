package p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aug implements u2k1 {
    public final /* synthetic */ cug a;

    public aug(cug cugVar) {
        this.a = cugVar;
    }

    public final void a(VideoSurfaceView videoSurfaceView) {
        cug cugVar = this.a;
        cugVar.b(videoSurfaceView);
        cugVar.f(true);
    }

    public final void b() {
        this.a.f(true);
    }

    public final void c(VideoSurfaceView videoSurfaceView) {
        cug cugVar = this.a;
        cugVar.e(videoSurfaceView);
        if (videoSurfaceView == cugVar.e) {
            cugVar.a();
        }
        cugVar.f(true);
    }
}
