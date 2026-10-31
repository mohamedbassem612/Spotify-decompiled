package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o1k1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ woa b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ wen0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1k1(woa woaVar, ven0 ven0Var, wen0 wen0Var, byte b) {
        super(1);
        this.a = b;
        this.b = woaVar;
        this.c = ven0Var;
        this.d = wen0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bpb1 bpb1Var = this.d;
        ven0 ven0Var = this.c;
        woa woaVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b6p1.j((VideoSurfaceView) obj, woaVar);
                ven0Var.setValue((Object) null);
                bpb1Var.l((Object) null);
                break;
            default:
                b6p1.j((VideoSurfaceView) obj, woaVar);
                ven0Var.setValue((Object) null);
                bpb1Var.l((Object) null);
                break;
        }
        return rih1Var;
    }
}
