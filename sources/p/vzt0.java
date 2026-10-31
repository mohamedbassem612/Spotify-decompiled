package p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vzt0 implements Runnable {
    public final /* synthetic */ c0u0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ VideoSurfaceView e;
    public final /* synthetic */ long f;

    public vzt0(c0u0 c0u0Var, boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView, long j) {
        this.a = c0u0Var;
        this.b = z;
        this.c = z2;
        this.d = f;
        this.e = videoSurfaceView;
        this.f = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.B(this.b, this.c, this.d, this.e, this.f);
    }
}
