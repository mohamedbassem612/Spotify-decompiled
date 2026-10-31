package p;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class psg implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ EGLDisplay a;
    public final /* synthetic */ EGLSurface b;
    public final /* synthetic */ EGLContext c;

    public psg(EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext) {
        this.a = eGLDisplay;
        this.b = eGLSurface;
        this.c = eGLContext;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        EGLSurface eGLSurface = this.b;
        EGL14.eglMakeCurrent(this.a, eGLSurface, eGLSurface, this.c);
        surfaceTexture.updateTexImage();
    }
}
