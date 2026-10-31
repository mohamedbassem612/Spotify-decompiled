package p;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qsg extends Surface {
    public static final /* synthetic */ int g = 0;
    public final SurfaceTexture a;
    public final EGLDisplay b;
    public final EGLContext c;
    public final EGLSurface d;
    public final HandlerThread e;
    public volatile boolean f;

    public qsg(SurfaceTexture surfaceTexture, EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, HandlerThread handlerThread) {
        super(surfaceTexture);
        this.a = surfaceTexture;
        this.b = eGLDisplay;
        this.c = eGLContext;
        this.d = eGLSurface;
        this.e = handlerThread;
    }

    @Override // android.view.Surface
    public final void release() {
        if (this.f) {
            return;
        }
        this.f = true;
        super.release();
        new Handler(this.e.getLooper()).post(new s10(this, (byte) 22));
    }
}
