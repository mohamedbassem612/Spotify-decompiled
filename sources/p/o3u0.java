package p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o3u0 extends hab0 implements iu30 {
    public final /* synthetic */ p3u0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3u0(p3u0 p3u0Var, boolean z, boolean z2, boolean z3) {
        super(1);
        this.a = p3u0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        p3u0 p3u0Var = this.a;
        p3u0Var.h.T(p3u0Var.i, this.b, jLongValue);
        if (this.c) {
            p3u0 p3u0Var2 = this.a;
            p3u0Var2.h.W(p3u0Var2.i, jLongValue);
            this.a.Z0 = true;
            VideoSurfaceView videoSurfaceViewI0 = this.a.c.i0();
            if (videoSurfaceViewI0 != null) {
                videoSurfaceViewI0.setIsJoining(true);
            }
        } else if (!this.d && this.b) {
            this.a.Z0 = false;
            VideoSurfaceView videoSurfaceViewI1 = this.a.c.i0();
            if (videoSurfaceViewI1 != null) {
                videoSurfaceViewI1.setIsJoining(false);
            }
        }
        return rih1.a;
    }
}
