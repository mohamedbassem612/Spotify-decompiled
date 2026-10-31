package p;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface ks40 {
    EGLSurface d(EGLDisplay eGLDisplay, Object obj, int i, boolean z);

    ss40 e(int i, int i2, int i3);

    EGLSurface f(EGLContext eGLContext, EGLDisplay eGLDisplay);

    EGLContext g(EGLDisplay eGLDisplay, int i, int[] iArr);

    void i(EGLDisplay eGLDisplay);
}
