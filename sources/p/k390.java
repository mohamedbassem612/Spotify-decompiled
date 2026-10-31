package p;

import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k390 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ r390 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k390(r390 r390Var, boolean z) {
        super(1);
        this.c = r390Var;
        this.b = z;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        r390 r390Var = this.c;
        switch (b) {
            case 0:
                r390Var.M0(new Integer[]{3}, z);
                break;
            default:
                ExoPlayer exoPlayer = (ExoPlayer) obj;
                if (!z && r390Var.H0()) {
                    r390Var.G0(exoPlayer, r390Var.Q0);
                }
                r390Var.M0(new Integer[]{2, 5}, z);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k390(boolean z, r390 r390Var) {
        super(1);
        this.b = z;
        this.c = r390Var;
    }
}
