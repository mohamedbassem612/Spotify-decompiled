package p;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hfe1 extends hmw0 {
    public TextureView e;
    public SurfaceTexture f;
    public pzc g;
    public j4d1 h;
    public boolean i;
    public SurfaceTexture j;
    public AtomicReference k;
    public k65 l;

    @Override // p.hmw0
    public final View a() {
        return this.e;
    }

    @Override // p.hmw0
    public final Bitmap b() {
        TextureView textureView = this.e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.e.getBitmap();
    }

    @Override // p.hmw0
    public final void c() {
        if (!this.i || this.j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.j;
        if (surfaceTexture != surfaceTexture2) {
            this.e.setSurfaceTexture(surfaceTexture2);
            this.j = null;
            this.i = false;
        }
    }

    @Override // p.hmw0
    public final void d() {
        this.i = true;
    }

    @Override // p.hmw0
    public final void e(j4d1 j4d1Var, k65 k65Var) {
        Size size = j4d1Var.b;
        this.a = size;
        this.l = k65Var;
        size.getClass();
        FrameLayout frameLayout = this.b;
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.a.getWidth(), this.a.getHeight()));
        this.e.setSurfaceTextureListener(new gfe1(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.e);
        j4d1 j4d1Var2 = this.h;
        if (j4d1Var2 != null) {
            j4d1Var2.c();
        }
        this.h = j4d1Var;
        Executor executorN = x74.N(this.e.getContext());
        j4d1Var.j.a(new qub1(this, j4d1Var, (byte) 2), executorN);
        h();
    }

    @Override // p.hmw0
    public final n8d0 g() {
        mzc mzcVar = new mzc();
        mzcVar.c = new it21();
        pzc pzcVar = new pzc(mzcVar);
        mzcVar.b = pzcVar;
        mzcVar.a = x0d.class;
        try {
            this.k.set(mzcVar);
            mzcVar.a = "textureViewImpl_waitForNextFrame";
            return pzcVar;
        } catch (Exception e) {
            pzcVar.a(e);
            return pzcVar;
        }
    }

    public final void h() {
        SurfaceTexture surfaceTexture;
        Size size = this.a;
        if (size == null || (surfaceTexture = this.f) == null || this.h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.a.getHeight());
        Surface surface = new Surface(this.f);
        j4d1 j4d1Var = this.h;
        pzc pzcVarT = upn1.t(new h341((Object) this, (Object) surface, (byte) 15));
        this.g = pzcVarT;
        pzcVarT.b.b(new m2d((Object) this, (Object) surface, (Object) pzcVarT, (Object) j4d1Var, (byte) 25), x74.N(this.e.getContext()));
        this.d = true;
        f();
    }
}
