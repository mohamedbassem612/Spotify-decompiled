package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rvd extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ woa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rvd(ven0 ven0Var, woa woaVar, byte b) {
        super(1);
        this.a = b;
        this.b = ven0Var;
        this.c = woaVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        woa woaVar = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj;
                Object tag = videoSurfaceView.getTag(2131427913);
                uoa uoaVar = tag instanceof uoa ? (uoa) tag : null;
                if (uoaVar != null) {
                    uoaVar.f();
                    uoaVar.k(videoSurfaceView);
                    uoaVar.u();
                    woaVar.c(uoaVar);
                }
                ven0Var.setValue((Object) null);
                videoSurfaceView.setTag(2131427913, null);
                break;
            default:
                VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) obj;
                Object tag2 = videoSurfaceView2.getTag(2131427913);
                uoa uoaVar2 = tag2 instanceof uoa ? (uoa) tag2 : null;
                if (uoaVar2 != null) {
                    uoaVar2.f();
                    uoaVar2.k(videoSurfaceView2);
                    uoaVar2.u();
                    woaVar.c(uoaVar2);
                }
                ven0Var.setValue((Object) null);
                videoSurfaceView2.setTag(2131427913, null);
                break;
        }
        return rih1Var;
    }
}
