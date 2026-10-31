package p;

import com.spotify.betamax.player.VideoSurfaceView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c3k1 implements o8u0 {
    public final /* synthetic */ VideoSurfaceView a;

    public c3k1(VideoSurfaceView videoSurfaceView) {
        this.a = videoSurfaceView;
    }

    @Override // p.o8u0
    public final void R() {
        int i = VideoSurfaceView.v1;
        VideoSurfaceView videoSurfaceView = this.a;
        videoSurfaceView.N0.post(new toa(videoSurfaceView, (byte) 1));
        Function0 onFirstFrameRendered = videoSurfaceView.getOnFirstFrameRendered();
        if (onFirstFrameRendered != null) {
            onFirstFrameRendered.invoke();
        }
        s2k1 s2k1Var = videoSurfaceView.i;
        if (s2k1Var != null) {
            s2k1Var.g();
        }
    }
}
