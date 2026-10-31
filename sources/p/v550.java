package p;

import android.graphics.SurfaceTexture;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v550 implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v550(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((x550) obj).q.release();
                break;
            default:
                fem1 fem1Var = (fem1) obj;
                fem1Var.Q0.set(surfaceTexture);
                fem1Var.requestRender();
                break;
        }
    }
}
