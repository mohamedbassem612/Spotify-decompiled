package p;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bow implements b650 {
    public static aow a(EGLDisplay eGLDisplay, int i, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, new int[]{12352, i, 12339, 1, 12324, 8, 12323, 8, 12322, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (!zEglChooseConfig || iArr2[0] <= 0) {
            eGLConfig = null;
        }
        if (eGLConfig != null) {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
            if (!u890.j(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
                EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
                if (u890.j(eGLSurfaceEglCreatePbufferSurface, EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroyContext(eGLDisplay, eGLContextEglCreateContext);
                    return null;
                }
                if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
                    eGLContextEglCreateContext.getClass();
                    eGLSurfaceEglCreatePbufferSurface.getClass();
                    return new aow(eGLContextEglCreateContext, eGLSurfaceEglCreatePbufferSurface);
                }
                EGL14.eglDestroySurface(eGLDisplay, eGLSurfaceEglCreatePbufferSurface);
                EGL14.eglDestroyContext(eGLDisplay, eGLContextEglCreateContext);
                return null;
            }
        }
        return null;
    }

    public static q550 b(EGLDisplay eGLDisplay, aow aowVar) {
        EGLContext eGLContext = aowVar.a;
        EGLSurface eGLSurface = aowVar.b;
        try {
            String strGlGetString = GLES20.glGetString(7936);
            String strGlGetString2 = GLES20.glGetString(7937);
            Integer num = null;
            try {
                String strGlGetString3 = GLES20.glGetString(7939);
                if (strGlGetString3 != null && ihc1.P0(strGlGetString3, new char[]{' '}, 6).contains("GL_ARM_shader_core_properties")) {
                    int[] iArr = new int[1];
                    GLES20.glGetIntegerv(38640, iArr, 0);
                    int iGlGetError = GLES20.glGetError();
                    int i = iArr[0];
                    Integer numValueOf = Integer.valueOf(i);
                    if (iGlGetError == 0 && i > 0) {
                        num = numValueOf;
                    }
                }
            } catch (Exception | UnsatisfiedLinkError unused) {
            }
            return (strGlGetString == null || strGlGetString2 == null) ? p550.a : new o550(strGlGetString, strGlGetString2, num);
        } finally {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
            EGL14.eglDestroyContext(eGLDisplay, eGLContext);
        }
    }
}
