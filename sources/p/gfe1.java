package p;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gfe1 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ hfe1 a;

    public gfe1(hfe1 hfe1Var) {
        this.a = hfe1Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        j2h1.o("TextureViewImpl");
        hfe1 hfe1Var = this.a;
        hfe1Var.f = surfaceTexture;
        if (hfe1Var.g == null) {
            hfe1Var.h();
            return;
        }
        hfe1Var.h.getClass();
        Objects.toString(hfe1Var.h);
        j2h1.o("TextureViewImpl");
        hfe1Var.h.k.a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        hfe1 hfe1Var = this.a;
        hfe1Var.f = null;
        pzc pzcVar = hfe1Var.g;
        if (pzcVar == null) {
            j2h1.o("TextureViewImpl");
            return true;
        }
        ffe1 ffe1Var = new ffe1(this, surfaceTexture);
        pzcVar.b(new nx30(pzcVar, ffe1Var, (byte) 0), x74.N(hfe1Var.e.getContext()));
        hfe1Var.j = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        j2h1.o("TextureViewImpl");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        mzc mzcVar = (mzc) this.a.k.getAndSet(null);
        if (mzcVar != null) {
            mzcVar.b((Object) null);
        }
    }
}
