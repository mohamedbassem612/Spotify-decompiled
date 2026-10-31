package p;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import app.p000rive.Artboard;
import app.p000rive.Fit;
import app.p000rive.StateMachine;
import app.p000rive.core.CommandQueue;
import app.p000rive.core.RiveSurface;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wl31 extends a8d1 implements iu30 {
    public final /* synthetic */ x550 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ o811 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl31(x550 x550Var, long j, o811 o811Var, lnm lnmVar) {
        super(1, lnmVar);
        this.a = x550Var;
        this.b = j;
        this.c = o811Var;
    }

    public final lnm create(lnm lnmVar) {
        return new wl31(this.a, this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj) {
        wl31 wl31VarCreate = create((lnm) obj);
        rih1 rih1Var = rih1.a;
        wl31VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        ytw0 ytw0Var = jfv.b;
        long jL0 = fdg1.l0(this.b, ngv.d);
        long j = this.c.a;
        x550 x550Var = this.a;
        float[] fArr = x550Var.s;
        CommandQueue commandQueue = x550Var.c;
        if (commandQueue == null) {
            eg.m("Not initialized");
            return null;
        }
        Artboard artboard = x550Var.e;
        if (artboard == null) {
            eg.m("Artboard not initialized");
            return null;
        }
        StateMachine stateMachine = x550Var.f;
        if (stateMachine == null) {
            eg.m("StateMachine not initialized");
            return null;
        }
        RiveSurface riveSurface = x550Var.m;
        if (riveSurface == null) {
            eg.m("RiveSurface not initialized");
            return null;
        }
        yzu yzuVar = x550Var.j;
        if (yzuVar == null) {
            eg.m("EglHelper not initialized");
            return null;
        }
        efe1 efe1Var = x550Var.k;
        if (efe1Var == null) {
            eg.m("TextureRenderer not initialized");
            return null;
        }
        SurfaceTexture surfaceTexture = x550Var.l;
        if (surfaceTexture == null) {
            eg.m("SurfaceTexture not initialized");
            return null;
        }
        commandQueue.m202advanceStateMachineDDXDRQI(stateMachine.getStateMachineHandle(), jL0);
        commandQueue.m232drawOcc3x_Y(artboard.getArtboardHandle(), stateMachine.getStateMachineHandle(), riveSurface, new Fit.Cover(null, 1, null), (16 & 16) != 0 ? 0 : 0);
        if (!x550Var.q.tryAcquire(5L, TimeUnit.SECONDS)) {
            eg.m("Timed out waiting for frame from Rive renderer");
            return null;
        }
        yzuVar.D();
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(fArr);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) yzuVar.a, (EGLSurface) yzuVar.c, 1000000 * j);
        int i = x550Var.n;
        GLES20.glViewport(0, 0, x550Var.o, x550Var.p);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(TlsSocketProvider.READ_BUFFER_SIZE);
        GLES20.glUseProgram(efe1Var.a);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(efe1Var.e, 0);
        GLES20.glUniformMatrix4fv(efe1Var.d, 1, false, fArr, 0);
        GLES20.glEnableVertexAttribArray(efe1Var.b);
        int i2 = efe1Var.b;
        FloatBuffer floatBuffer = efe1Var.f;
        if (floatBuffer == null) {
            u890.C("vertexBuffer");
            throw null;
        }
        GLES20.glVertexAttribPointer(i2, 2, 5126, false, 0, (Buffer) floatBuffer);
        GLES20.glEnableVertexAttribArray(efe1Var.c);
        int i3 = efe1Var.c;
        FloatBuffer floatBuffer2 = efe1Var.g;
        if (floatBuffer2 == null) {
            u890.C("texCoordBuffer");
            throw null;
        }
        GLES20.glVertexAttribPointer(i3, 2, 5126, false, 0, (Buffer) floatBuffer2);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(efe1Var.b);
        GLES20.glDisableVertexAttribArray(efe1Var.c);
        GLES20.glBindTexture(36197, 0);
        GLES20.glUseProgram(0);
        if (EGL14.eglSwapBuffers((EGLDisplay) yzuVar.a, (EGLSurface) yzuVar.c)) {
            return rih1.a;
        }
        eg.m("eglSwapBuffers failed");
        return null;
    }
}
