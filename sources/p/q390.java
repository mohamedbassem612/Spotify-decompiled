package p;

import android.view.Surface;
import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q390 extends hab0 implements iu30 {
    public final /* synthetic */ r390 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Surface c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q390(r390 r390Var, long j, Surface surface, int i, int i2) {
        super(1);
        this.a = r390Var;
        this.b = j;
        this.c = surface;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke(Object obj) {
        ExoPlayer exoPlayer = (ExoPlayer) obj;
        r390 r390Var = this.a;
        if (r390Var.P0.get() == this.b) {
            Surface surface = this.c;
            surface.getClass();
            r390Var.L0(exoPlayer, surface, new l291(this.d, this.e));
        }
        return rih1.a;
    }
}
