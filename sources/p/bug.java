package p;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bug implements SurfaceHolder.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ VideoSurfaceView b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bug(Object obj, VideoSurfaceView videoSurfaceView, byte b) {
        this.a = b;
        this.c = obj;
        this.b = videoSurfaceView;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        lo9 lo9Var;
        switch (this.a) {
            case 0:
                cug cugVar = (cug) this.c;
                if (cugVar.f == surfaceHolder && cugVar.g == this && (lo9Var = cugVar.d) != null) {
                    lo9Var.q(cug.c(surfaceHolder, this.b, i2, i3));
                    break;
                }
                break;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        lo9 lo9Var;
        byte b = this.a;
        VideoSurfaceView videoSurfaceView = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                cug cugVar = (cug) obj;
                if (cugVar.f == surfaceHolder && cugVar.g == this && (lo9Var = cugVar.d) != null) {
                    lo9Var.q(cug.d(cugVar, surfaceHolder, videoSurfaceView));
                    break;
                }
                break;
            default:
                ((w2k1) obj).g(videoSurfaceView, surfaceHolder, true);
                break;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        lo9 lo9Var;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                cug cugVar = (cug) obj;
                if (cugVar.f == surfaceHolder && cugVar.g == this && (lo9Var = cugVar.d) != null) {
                    lo9Var.q(new wsg((Surface) null, 0, 0, (VideoSurfaceView) null));
                    break;
                }
                break;
            default:
                ((w2k1) obj).g(this.b, surfaceHolder, false);
                break;
        }
    }

    private final void a(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }
}
