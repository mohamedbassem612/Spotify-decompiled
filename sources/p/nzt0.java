package p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nzt0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c0u0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nzt0(c0u0 c0u0Var, Object obj, long j, long j2, byte b) {
        this.a = b;
        this.b = c0u0Var;
        this.e = obj;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                long j = this.c;
                long j2 = this.d;
                this.b.N((ev7) obj, j, j2);
                break;
            case 1:
                long j3 = this.c;
                long j4 = this.d;
                this.b.r((hpc1) obj, j3, j4);
                break;
            case 2:
                long j5 = this.c;
                long j6 = this.d;
                this.b.H((VideoSurfaceView) obj, j5, j6);
                break;
            default:
                long j7 = this.c;
                long j8 = this.d;
                this.b.M(j7, j8, (koj1) obj);
                break;
        }
    }
}
