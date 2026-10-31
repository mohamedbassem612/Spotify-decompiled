package p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m390 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r390 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ m390(r390 r390Var, boolean z, byte b) {
        this.a = b;
        this.b = r390Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoSurfaceView videoSurfaceView;
        VideoSurfaceView videoSurfaceView2;
        byte b = this.a;
        boolean z = this.c;
        r390 r390Var = this.b;
        switch (b) {
            case 0:
                if (r390Var.Y0 && (videoSurfaceView = r390Var.f1) != null) {
                    videoSurfaceView.setKeepScreenOn(z);
                    break;
                }
                break;
            default:
                if (r390Var.Y0 && (videoSurfaceView2 = r390Var.f1) != null) {
                    videoSurfaceView2.setKeepScreenOn(z);
                    break;
                }
                break;
        }
    }
}
