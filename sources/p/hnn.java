package p;

import android.view.Surface;
import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hnn extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnn(q5t0 q5t0Var, int i, long j, int i2) {
        super(1);
        this.e = q5t0Var;
        this.c = i;
        this.b = j;
        this.d = i2;
    }

    public final Object invoke(Object obj) {
        Surface surface;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        int i2 = this.c;
        long j = this.b;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                q5t0 q5t0Var = (q5t0) obj2;
                ((p5t0) obj).k(q5t0Var, yoi1.p(i2, 0, hjl.i(j) - q5t0Var.a), -i, 0.0f);
                break;
            default:
                ExoPlayer exoPlayer = (ExoPlayer) obj;
                r390 r390Var = (r390) obj2;
                if (r390Var.P0.get() == j && (surface = r390Var.Q0.a) != null) {
                    r390Var.L0(exoPlayer, surface, new l291(i2, i));
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnn(r390 r390Var, long j, int i, int i2) {
        super(1);
        this.e = r390Var;
        this.b = j;
        this.c = i;
        this.d = i2;
    }
}
