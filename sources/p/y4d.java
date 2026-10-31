package p;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class y4d implements haw0 {
    @Override // p.haw0
    public final void a(j4d1 j4d1Var) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(j4d1Var.b.getWidth(), j4d1Var.b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        j4d1Var.a(surface, n5u.a(), new x4d(surface, surfaceTexture, (byte) 0));
    }
}
