package p;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.common.util.GlUtil;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o6t0 extends HandlerThread implements Handler.Callback {
    public ljv a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public p6t0 e;

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public final void a(int i) throws GlUtil.GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.a.getClass();
        ljv ljvVar = this.a;
        int[] iArr = ljvVar.b;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        fn31.u("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr2 = new int[2];
        fn31.u("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
        ljvVar.c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, ljv.g, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = zoi1.a;
        fn31.u(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(ljvVar.c, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        fn31.u("eglCreateContext failed", eGLContextEglCreateContext != null);
        ljvVar.d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = ljvVar.c;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            fn31.u("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        fn31.u("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        ljvVar.e = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        fn31.t();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        ljvVar.f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(ljvVar);
        SurfaceTexture surfaceTexture2 = this.a.f;
        surfaceTexture2.getClass();
        this.e = new p6t0(this, surfaceTexture2, i != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.a.getClass();
        ljv ljvVar = this.a;
        ljvVar.a.removeCallbacks(ljvVar);
        try {
            SurfaceTexture surfaceTexture = ljvVar.f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, ljvVar.b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = ljvVar.c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = ljvVar.c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = ljvVar.e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(ljvVar.c, ljvVar.e);
            }
            EGLContext eGLContext = ljvVar.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(ljvVar.c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = ljvVar.c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(ljvVar.c);
            }
            ljvVar.c = null;
            ljvVar.d = null;
            ljvVar.e = null;
            ljvVar.f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (Error e) {
                    oon1.w("Failed to initialize placeholder surface", e);
                    this.c = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    oon1.w("Failed to initialize placeholder surface", e2);
                    this.d = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (GlUtil.GlException e3) {
                    oon1.w("Failed to initialize placeholder surface", e3);
                    this.d = new IllegalStateException((Throwable) e3);
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    b();
                    quit();
                    return true;
                } catch (Throwable th) {
                    try {
                        oon1.w("Failed to release placeholder surface", th);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
