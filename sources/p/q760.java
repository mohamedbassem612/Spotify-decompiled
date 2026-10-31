package p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q760 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ uoa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q760(ven0 ven0Var, uoa uoaVar, byte b) {
        super(1);
        this.a = b;
        this.b = ven0Var;
        this.c = uoaVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ven0 ven0Var = this.b;
        uoa uoaVar = this.c;
        switch (b) {
            case 0:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) ven0Var.getValue();
                if (videoSurfaceView != null) {
                    uoaVar.d(videoSurfaceView);
                }
                return new p760(ven0Var, uoaVar, (byte) 0);
            default:
                VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) ven0Var.getValue();
                if (videoSurfaceView2 != null) {
                    uoaVar.d(videoSurfaceView2);
                }
                return new p760(ven0Var, uoaVar, (byte) 1);
        }
    }
}
