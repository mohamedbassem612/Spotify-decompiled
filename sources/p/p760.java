package p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p760 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ uoa c;

    public /* synthetic */ p760(ven0 ven0Var, uoa uoaVar, byte b) {
        this.a = b;
        this.b = ven0Var;
        this.c = uoaVar;
    }

    public final void dispose() {
        byte b = this.a;
        uoa uoaVar = this.c;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) ven0Var.getValue();
                if (videoSurfaceView != null) {
                    uoaVar.k(videoSurfaceView);
                }
                break;
            default:
                kiv kivVar = q7f0.a;
                VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) ven0Var.getValue();
                if (videoSurfaceView2 != null) {
                    uoaVar.k(videoSurfaceView2);
                }
                break;
        }
    }
}
