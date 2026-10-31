package p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aag1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aag1(byte b, boolean z) {
        super(1);
        this.a = b;
        this.b = z;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        switch (b) {
            case 0:
                ((kd31) obj).b(z ? 0.0f : 1.0f);
                return rih1Var;
            case 1:
                uu31 uu31Var = (uu31) obj;
                return new iw0(uu31Var.a, uu31Var.c, uu31Var.b, uu31Var.e, this.b);
            case 2:
                ((VideoSurfaceView) obj).setImportantForAccessibility(z ? 4 : 0);
                return rih1Var;
            case 3:
                ((kd31) obj).b(z ? 1.0f : 0.0f);
                return rih1Var;
            default:
                ((kd31) obj).b(z ? 0.0f : 1.0f);
                return rih1Var;
        }
    }
}
