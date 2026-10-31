package p;

import android.content.Context;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cu0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uoa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu0(uoa uoaVar, byte b) {
        super(1);
        this.a = b;
        this.b = uoaVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b3k1 b3k1Var = b3k1.c;
        uoa uoaVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setIsBuffering(true);
                videoSurfaceView.setBufferingThrobberEnabled(false);
                videoSurfaceView.setScaleType(b3k1Var);
                uoaVar.d(videoSurfaceView);
                return videoSurfaceView;
            case 1:
                uoaVar.u();
                return rih1Var;
            case 2:
                VideoSurfaceView videoSurfaceView2 = new VideoSurfaceView((Context) obj);
                videoSurfaceView2.setIsBuffering(true);
                videoSurfaceView2.setBufferingThrobberEnabled(false);
                videoSurfaceView2.setScaleType(b3k1Var);
                uoaVar.d(videoSurfaceView2);
                return videoSurfaceView2;
            case 3:
                uoaVar.k((VideoSurfaceView) obj);
                return rih1Var;
            case 4:
                VideoSurfaceView videoSurfaceView3 = new VideoSurfaceView((Context) obj);
                videoSurfaceView3.setIsBuffering(true);
                videoSurfaceView3.setBufferingThrobberEnabled(false);
                videoSurfaceView3.setScaleType(b3k1.b);
                uoaVar.d(videoSurfaceView3);
                return videoSurfaceView3;
            case 5:
                uoaVar.u();
                return rih1Var;
            case 6:
                return new n760(uoaVar, (byte) 2);
            case 7:
                return new n760(uoaVar, (byte) 3);
            default:
                VideoSurfaceView videoSurfaceView4 = new VideoSurfaceView((Context) obj);
                videoSurfaceView4.setScaleType(b3k1Var);
                videoSurfaceView4.setSupportsSurfaceView(false);
                videoSurfaceView4.setUseSurfaceView(false);
                uoaVar.d(videoSurfaceView4);
                videoSurfaceView4.setBufferingThrobberEnabled(false);
                return videoSurfaceView4;
        }
    }
}
