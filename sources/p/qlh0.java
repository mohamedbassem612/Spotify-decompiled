package p;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qlh0 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ rlh0 a;

    public qlh0(rlh0 rlh0Var) {
        this.a = rlh0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        rlh0 rlh0Var = this.a;
        if (rlh0Var.A == surfaceHolder && rlh0Var.p()) {
            if (rlh0Var.o() >= 8) {
                rlh0Var.g(new hlh0(this, i2, i3, (byte) 3));
            }
            rlh0Var.y(i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        rlh0 rlh0Var = this.a;
        if (rlh0Var.A != surfaceHolder) {
            return;
        }
        rlh0Var.z = surfaceHolder.getSurface();
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        rlh0Var.K(rlh0Var.z, surfaceFrame.width(), surfaceFrame.height());
        rlh0Var.y(surfaceFrame.width(), surfaceFrame.height());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        rlh0 rlh0Var = this.a;
        if (rlh0Var.A != surfaceHolder) {
            return;
        }
        rlh0Var.z = null;
        rlh0Var.K(null, 0, 0);
        rlh0Var.y(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
