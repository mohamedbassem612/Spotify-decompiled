package p;

import androidx.media3.exoplayer.ExoPlayer;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mc81 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoSurfaceView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mc81(VideoSurfaceView videoSurfaceView, byte b) {
        super(1);
        this.a = b;
        this.b = videoSurfaceView;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        VideoSurfaceView videoSurfaceView = this.b;
        switch (b) {
            case 0:
                return videoSurfaceView;
            case 1:
                return videoSurfaceView;
            case 2:
                ((ExoPlayer) obj).k(videoSurfaceView.t == b3k1.d ? 1 : 2);
                return rih1.a;
            default:
                return videoSurfaceView;
        }
    }
}
