package p;

import android.content.Context;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nxj1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oxj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nxj1(oxj1 oxj1Var, byte b) {
        super(1);
        this.a = b;
        this.b = oxj1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        oxj1 oxj1Var = this.b;
        switch (b) {
            case 0:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setScaleType(b3k1.d);
                oxj1Var.a.a(videoSurfaceView);
                return videoSurfaceView;
            default:
                oxj1Var.a.b((VideoSurfaceView) obj);
                return rih1.a;
        }
    }
}
