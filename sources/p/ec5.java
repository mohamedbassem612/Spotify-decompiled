package p;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.TextureView;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ec5 extends TextureView implements TextureView.SurfaceTextureListener {
    public final zb5 a;
    public EGLDisplay b;
    public EGLContext c;
    public EGLSurface d;
    public HandlerThread e;
    public Handler f;

    public ec5(Context context) {
        super(context);
        this.a = new zb5();
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public final void a() {
        EGLSurface eGLSurface;
        int i;
        EGLDisplay eGLDisplay = this.b;
        if (eGLDisplay == null || (eGLSurface = this.d) == null) {
            return;
        }
        zb5 zb5Var = this.a;
        float[] fArr = zb5Var.e;
        GLES20.glClear(TlsSocketProvider.READ_BUFFER_SIZE);
        if (zb5Var.d != 0 && (i = zb5Var.c) != 0) {
            GLES20.glBindBuffer(34962, i);
            GLES20.glUseProgram(zb5Var.a);
            GLES20.glUniformMatrix4fv(zb5Var.f, 1, false, fArr, 0);
            GLES20.glUniform1f(zb5Var.g, zb5Var.B);
            GLES20.glUniform3f(zb5Var.h, zb5Var.C, zb5Var.D, zb5Var.E);
            GLES20.glUniform1f(zb5Var.i, zb5Var.F);
            GLES20.glEnableVertexAttribArray(zb5Var.j);
            GLES20.glVertexAttribPointer(zb5Var.j, 2, 5126, false, 16, 0);
            GLES20.glEnableVertexAttribArray(zb5Var.k);
            GLES20.glVertexAttribPointer(zb5Var.k, 1, 5126, false, 16, 8);
            GLES20.glEnableVertexAttribArray(zb5Var.l);
            GLES20.glVertexAttribPointer(zb5Var.l, 1, 5126, false, 16, 12);
            GLES20.glDrawArrays(5, 0, zb5Var.d);
            GLES20.glDisableVertexAttribArray(zb5Var.j);
            GLES20.glDisableVertexAttribArray(zb5Var.k);
            GLES20.glDisableVertexAttribArray(zb5Var.l);
            GLES20.glUseProgram(zb5Var.b);
            GLES20.glUniformMatrix4fv(zb5Var.m, 1, false, fArr, 0);
            GLES20.glUniform1f(zb5Var.t, zb5Var.B);
            GLES20.glUniform1f(zb5Var.n, zb5Var.y);
            GLES20.glUniform1f(zb5Var.o, zb5Var.z);
            GLES20.glUniform1f(zb5Var.f184p, 0.3f);
            GLES20.glUniform1f(zb5Var.q, zb5Var.A);
            GLES20.glUniform1f(zb5Var.r, 0.4f);
            GLES20.glUniform1f(zb5Var.s, 0.6f);
            GLES20.glUniform3f(zb5Var.u, zb5Var.G, zb5Var.H, zb5Var.I);
            GLES20.glEnableVertexAttribArray(zb5Var.v);
            GLES20.glVertexAttribPointer(zb5Var.v, 2, 5126, false, 16, 0);
            GLES20.glEnableVertexAttribArray(zb5Var.w);
            GLES20.glVertexAttribPointer(zb5Var.w, 1, 5126, false, 16, 8);
            GLES20.glEnableVertexAttribArray(zb5Var.x);
            GLES20.glVertexAttribPointer(zb5Var.x, 1, 5126, false, 16, 12);
            GLES20.glDrawArrays(5, 0, zb5Var.d);
            GLES20.glDisableVertexAttribArray(zb5Var.v);
            GLES20.glDisableVertexAttribArray(zb5Var.w);
            GLES20.glDisableVertexAttribArray(zb5Var.x);
            GLES20.glBindBuffer(34962, 0);
        }
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Handler handler = this.f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        HandlerThread handlerThread = new HandlerThread("GLRenderThread");
        handlerThread.start();
        this.e = handlerThread;
        HandlerThread handlerThread2 = this.e;
        handlerThread2.getClass();
        Handler handler = new Handler(handlerThread2.getLooper());
        this.f = handler;
        handler.post(new ac5(this, surfaceTexture, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Handler handler = this.f;
        if (handler != null) {
            handler.post(new s10(this, (byte) 6));
        }
        try {
            HandlerThread handlerThread = this.e;
            if (handlerThread != null) {
                handlerThread.join(1000L);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        this.e = null;
        this.f = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Handler handler = this.f;
        if (handler != null) {
            handler.post(new q3g1(this, i, i2, (byte) 2));
        }
    }

    public final void setContourPath(u8s0 u8s0Var) {
        Handler handler = this.f;
        if (handler != null) {
            handler.post(new xwn1(this, u8s0Var, (byte) 3));
        }
    }

    public final void setStrokeWidth(float f) {
        Handler handler = this.f;
        if (handler != null) {
            handler.post(new cc5(this, f, (byte) 0));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
