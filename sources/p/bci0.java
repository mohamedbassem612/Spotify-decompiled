package p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bci0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ubw0 b;
    public final /* synthetic */ hob1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bci0(ubw0 ubw0Var, hob1 hob1Var, byte b) {
        super(1);
        this.a = b;
        this.b = ubw0Var;
        this.c = hob1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hob1 hob1Var = this.c;
        ubw0 ubw0Var = this.b;
        switch (b) {
            case 0:
                ubw0Var.b(hob1Var.c, (VideoSurfaceView) obj);
                break;
            default:
                ubw0Var.b(hob1Var.c, (VideoSurfaceView) obj);
                break;
        }
        return rih1Var;
    }
}
