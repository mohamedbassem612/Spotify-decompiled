package p;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fev extends xmm0 {
    public int n = -1;
    public int o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xi20 f48p;
    public final xi20 q;

    public fev(xi20 xi20Var, xi20 xi20Var2) {
        this.f48p = xi20Var;
        this.q = xi20Var2;
    }

    @Override // p.xmm0
    public final y09 j(liv livVar) {
        Map map = Collections.EMPTY_MAP;
        y09 y09VarJ = super.j(livVar);
        this.n = hy30.g();
        this.o = hy30.g();
        return y09VarJ;
    }

    public final void q(long j, Surface surface, d4d1 d4d1Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        hy30.d((AtomicBoolean) this.c, true);
        hy30.c((Thread) this.e);
        HashMap map = (HashMap) this.d;
        o0c.q("The surface is not registered.", map.containsKey(surface));
        p19 p19VarB = (p19) map.get(surface);
        Objects.requireNonNull(p19VarB);
        if (p19VarB == hy30.j) {
            p19VarB = b(surface);
            if (p19VarB == null) {
                return;
            } else {
                map.put(surface, p19VarB);
            }
        }
        p19 p19Var = p19VarB;
        EGLSurface eGLSurface = p19Var.a;
        if (surface != ((Surface) this.j)) {
            k(eGLSurface);
            this.j = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(TlsSocketProvider.READ_BUFFER_SIZE);
        r(p19Var, d4d1Var, surfaceTexture, this.f48p, this.n);
        r(p19Var, d4d1Var, surfaceTexture2, this.q, this.o);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f, eGLSurface)) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        j2h1.M("DualOpenGlRenderer");
        n(surface, false);
    }

    public final void r(p19 p19Var, d4d1 d4d1Var, SurfaceTexture surfaceTexture, xi20 xi20Var, int i) {
        p(i);
        int i2 = p19Var.b;
        int i3 = p19Var.c;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, d4d1Var.e, 0);
        fy30 fy30Var = (fy30) this.l;
        fy30Var.getClass();
        if (fy30Var instanceof gy30) {
            GLES20.glUniformMatrix4fv(((gy30) fy30Var).f, 1, false, fArr2, 0);
            hy30.b("glUniformMatrix4fv");
        }
        xi20Var.getClass();
        Size size = new Size((int) (i2 * 1.0f), (int) (i3 * 1.0f));
        Size size2 = new Size(i2, i3);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Matrix.translateM(fArr4, 0, 0.0f, 0.0f, 0.0f);
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(fy30Var.b, 1, false, fArr5, 0);
        hy30.b("glUniformMatrix4fv");
        GLES20.glUniform1f(fy30Var.c, 1.0f);
        hy30.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        hy30.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
