package p;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jxa1 implements GLSurfaceView.Renderer, wqq0 {
    public final /* synthetic */ kxa1 X;
    public final ek41 a;
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public float g;
    public float h;
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public final float[] i = new float[16];
    public final float[] t = new float[16];

    public jxa1(kxa1 kxa1Var, ek41 ek41Var) {
        this.X = kxa1Var;
        float[] fArr = new float[16];
        this.d = fArr;
        float[] fArr2 = new float[16];
        this.e = fArr2;
        float[] fArr3 = new float[16];
        this.f = fArr3;
        this.a = ek41Var;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.h = 3.1415927f;
    }

    @Override // p.wqq0
    public final synchronized void a(float f, float[] fArr) {
        float[] fArr2 = this.d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.h = f2;
        Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(f2), (float) Math.sin(this.h), 0.0f);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        Object objA;
        synchronized (this) {
            Matrix.multiplyMM(this.t, 0, this.d, 0, this.f, 0);
            Matrix.multiplyMM(this.i, 0, this.e, 0, this.t, 0);
        }
        Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
        ek41 ek41Var = this.a;
        float[] fArr2 = this.c;
        GLES20.glClear(TlsSocketProvider.READ_BUFFER_SIZE);
        try {
            fn31.t();
        } catch (GlUtil.GlException e) {
            oon1.w("Failed to draw a frame", e);
        }
        if (ek41Var.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = ek41Var.t;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                fn31.t();
            } catch (GlUtil.GlException e2) {
                oon1.w("Failed to draw a frame", e2);
            }
            if (ek41Var.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(ek41Var.g, 0);
            }
            long timestamp = ek41Var.t.getTimestamp();
            w4c0 w4c0Var = ek41Var.e;
            synchronized (w4c0Var) {
                objA = w4c0Var.A(timestamp, false);
            }
            Long l = (Long) objA;
            if (l != null) {
                rl1 rl1Var = ek41Var.d;
                float[] fArr3 = ek41Var.g;
                float[] fArr4 = (float[]) ((w4c0) rl1Var.e).C(l.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) rl1Var.d;
                    float f = fArr4[0];
                    float f2 = -fArr4[1];
                    float f3 = -fArr4[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!rl1Var.b) {
                        rl1.p((float[]) rl1Var.c, (float[]) rl1Var.d);
                        rl1Var.b = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) rl1Var.c, 0, (float[]) rl1Var.d, 0);
                }
            }
            llx0 llx0Var = (llx0) ek41Var.f.C(timestamp);
            if (llx0Var != null) {
                olx0 olx0Var = ek41Var.c;
                if (olx0.b(llx0Var)) {
                    olx0Var.a = llx0Var.c;
                    w4c0 w4c0Var2 = llx0Var.a.a[0];
                    wz8 wz8Var = new wz8();
                    float[] fArr6 = (float[]) w4c0Var2.d;
                    wz8Var.a = fArr6.length / 3;
                    wz8Var.c = fn31.C(fArr6);
                    wz8Var.d = fn31.C((float[]) w4c0Var2.e);
                    int i = w4c0Var2.c;
                    if (i == 1) {
                        wz8Var.b = (byte) 5;
                    } else if (i != 2) {
                        wz8Var.b = (byte) 4;
                    } else {
                        wz8Var.b = (byte) 6;
                    }
                    olx0Var.b = wz8Var;
                    if (!llx0Var.d) {
                        w4c0 w4c0Var3 = llx0Var.b.a[0];
                        fn31.C((float[]) w4c0Var3.d);
                        fn31.C((float[]) w4c0Var3.e);
                    }
                }
            }
        }
        Matrix.multiplyMM(ek41Var.h, 0, fArr2, 0, ek41Var.g, 0);
        olx0 olx0Var2 = ek41Var.c;
        int i2 = ek41Var.i;
        float[] fArr7 = ek41Var.h;
        wz8 wz8Var2 = olx0Var2.b;
        if (wz8Var2 == null) {
            return;
        }
        int i3 = olx0Var2.a;
        if (i3 == 1) {
            fArr = olx0.j;
        } else {
            fArr = i3 == 2 ? olx0.k : olx0.i;
        }
        GLES20.glUniformMatrix3fv(olx0Var2.e, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(olx0Var2.d, 1, false, fArr7, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i2);
        GLES20.glUniform1i(olx0Var2.h, 0);
        try {
            fn31.t();
        } catch (GlUtil.GlException e3) {
            oon1.w("Failed to bind uniforms", e3);
        }
        GLES20.glVertexAttribPointer(olx0Var2.f, 3, 5126, false, 12, (Buffer) wz8Var2.c);
        try {
            fn31.t();
        } catch (GlUtil.GlException e4) {
            oon1.w("Failed to load position data", e4);
        }
        GLES20.glVertexAttribPointer(olx0Var2.g, 2, 5126, false, 8, (Buffer) wz8Var2.d);
        try {
            fn31.t();
        } catch (GlUtil.GlException e5) {
            oon1.w("Failed to load texture data", e5);
        }
        GLES20.glDrawArrays(wz8Var2.b, 0, wz8Var2.a);
        try {
            fn31.t();
        } catch (GlUtil.GlException e6) {
            oon1.w("Failed to render", e6);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        kxa1 kxa1Var = this.X;
        SurfaceTexture surfaceTextureB = this.a.b();
        int i = kxa1.O0;
        kxa1Var.e.post(new zyh0((Object) kxa1Var, (Object) surfaceTextureB, (byte) 29));
    }
}
