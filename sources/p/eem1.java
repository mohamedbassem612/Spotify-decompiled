package p;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eem1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fem1 b;

    public /* synthetic */ eem1(fem1 fem1Var, byte b) {
        this.a = b;
        this.b = fem1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fem1 fem1Var = this.b;
        switch (b) {
            case 0:
                iu30 onVideoFrameRendered = fem1Var.getOnVideoFrameRendered();
                if (onVideoFrameRendered != null) {
                    onVideoFrameRendered.invoke(Boolean.TRUE);
                }
                break;
            case 1:
                iu30 onFallbackFrameRendered = fem1Var.getOnFallbackFrameRendered();
                if (onFallbackFrameRendered != null) {
                    onFallbackFrameRendered.invoke(Boolean.TRUE);
                }
                break;
            case 2:
                SurfaceTexture surfaceTexture = fem1Var.h;
                if (surfaceTexture != null) {
                    surfaceTexture.setOnFrameAvailableListener(null);
                }
                fem1Var.Q0.set(null);
                Surface surface = fem1Var.i;
                if (surface != null) {
                    surface.release();
                }
                SurfaceTexture surfaceTexture2 = fem1Var.h;
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                fem1Var.i = null;
                fem1Var.h = null;
                break;
            default:
                iu30 onFallbackFrameRendered2 = fem1Var.getOnFallbackFrameRendered();
                if (onFallbackFrameRendered2 != null) {
                    onFallbackFrameRendered2.invoke(Boolean.FALSE);
                }
                iu30 onVideoFrameRendered2 = fem1Var.getOnVideoFrameRendered();
                if (onVideoFrameRendered2 != null) {
                    onVideoFrameRendered2.invoke(Boolean.FALSE);
                }
                break;
        }
    }
}
