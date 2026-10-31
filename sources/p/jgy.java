package p;

import android.view.View;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jgy extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k0t b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jgy(k0t k0tVar, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = k0tVar;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        k0t k0tVar = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj;
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    k0tVar.c(new x500(videoSurfaceView, (View) null));
                }
                break;
            default:
                VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) obj;
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    k0tVar.c(new x500(videoSurfaceView2, (View) null));
                }
                break;
        }
        return rih1Var;
    }
}
