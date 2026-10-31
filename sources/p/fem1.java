package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.view.Surface;
import com.spotify.base.java.logging.Logger;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fem1 extends GLSurfaceView implements GLSurfaceView.Renderer {
    public int N0;
    public int O0;
    public int P0;
    public final AtomicReference Q0;
    public Bitmap R0;
    public boolean S0;
    public boolean T0;
    public final float[] U0;
    public final float[] V0;
    public final float[] W0;
    public final float[] X0;
    public final float[] Y0;
    public final float[] Z0;
    public iu30 a;
    public final float[] a1;
    public iu30 b;
    public final float[] b1;
    public iu30 c;
    public final float[] c1;
    public volatile float d;
    public FloatBuffer d1;
    public volatile float e;
    public FloatBuffer e1;
    public volatile float f;
    public ShortBuffer f1;
    public volatile Bitmap g;
    public int g1;
    public SurfaceTexture h;
    public float h1;
    public Surface i;
    public int t;

    public fem1(Context context) {
        super(context);
        this.e = 1.0f;
        this.f = 1.0f;
        this.Q0 = new AtomicReference(null);
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        this.U0 = fArr;
        this.V0 = new float[16];
        this.W0 = new float[16];
        this.X0 = new float[16];
        this.Y0 = new float[16];
        this.Z0 = new float[16];
        this.a1 = new float[16];
        this.b1 = new float[16];
        this.c1 = new float[16];
        setEGLContextClientVersion(2);
        setRenderer(this);
        setRenderMode(0);
    }

    public static FloatBuffer c(ArrayList arrayList) {
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(arrayList.size() * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(o7h.i1(arrayList));
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public final void a(int i) {
        GLES20.glUniformMatrix4fv(GLES20.glGetUniformLocation(i, "uMVP"), 1, false, this.X0, 0);
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aPos");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        FloatBuffer floatBuffer = this.d1;
        if (floatBuffer == null) {
            u890.C("vertexBuf");
            throw null;
        }
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 3, 5126, false, 0, (Buffer) floatBuffer);
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(i, "aTC");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation2);
        FloatBuffer floatBuffer2 = this.e1;
        if (floatBuffer2 != null) {
            GLES20.glVertexAttribPointer(iGlGetAttribLocation2, 2, 5126, false, 0, (Buffer) floatBuffer2);
        } else {
            u890.C("texBuf");
            throw null;
        }
    }

    public final void b(int i) {
        int i2 = this.g1;
        ShortBuffer shortBuffer = this.f1;
        if (shortBuffer == null) {
            u890.C("indexBuf");
            throw null;
        }
        GLES20.glDrawElements(4, i2, 5123, shortBuffer);
        GLES20.glDisableVertexAttribArray(GLES20.glGetAttribLocation(i, "aPos"));
        GLES20.glDisableVertexAttribArray(GLES20.glGetAttribLocation(i, "aTC"));
    }

    public final iu30 getOnFallbackFrameRendered() {
        return this.b;
    }

    public final iu30 getOnVideoFrameRendered() {
        return this.c;
    }

    public final iu30 getOnVideoSurfaceReady() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a8 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #4 {all -> 0x008a, blocks: (B:25:0x005b, B:26:0x0062, B:43:0x009f, B:45:0x00a8), top: B:70:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) throws Throwable {
        Bitmap bitmap;
        Bitmap bitmap2;
        int i;
        SurfaceTexture surfaceTexture = this.h;
        if (surfaceTexture != null) {
            AtomicReference atomicReference = this.Q0;
            do {
                if (atomicReference.compareAndSet(surfaceTexture, null)) {
                    surfaceTexture.updateTexImage();
                    surfaceTexture.getTransformMatrix(this.U0);
                    if (!this.T0) {
                        this.T0 = true;
                        post(new eem1(this, (byte) 0));
                        break;
                    }
                    break;
                }
            } while (atomicReference.get() == surfaceTexture);
        }
        GLES20.glClear(16640);
        Bitmap bitmap3 = this.g;
        if (this.R0 != bitmap3) {
            int i2 = this.N0;
            if (i2 != 0) {
                GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            }
            if (bitmap3 != null) {
                try {
                    Bitmap.Config config = bitmap3.getConfig();
                    Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                    if (config == config2) {
                        bitmap = bitmap3;
                    } else {
                        Bitmap bitmapCopy = bitmap3.copy(config2, false);
                        if (bitmapCopy == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        bitmap = bitmapCopy;
                        i = 0;
                        Logger.e(e, "Places panorama thumbnail upload failed", new Object[0]);
                        if (i != 0) {
                            GLES20.glDeleteTextures(1, new int[]{i}, 0);
                        }
                        if (bitmap != null) {
                            bitmap2 = bitmap != bitmap3 ? bitmap : null;
                            if (bitmap2 != null) {
                                bitmap2.recycle();
                            }
                        }
                        i = 0;
                    }
                    try {
                        try {
                            int[] iArr = new int[1];
                            GLES20.glGenTextures(1, iArr, 0);
                            i = iArr[0];
                            try {
                                GLES20.glBindTexture(3553, i);
                                GLES20.glTexParameteri(3553, 10241, 9729);
                                GLES20.glTexParameteri(3553, 10240, 9729);
                                GLES20.glTexParameteri(3553, 10242, 33071);
                                GLES20.glTexParameteri(3553, 10243, 33071);
                                GLUtils.texImage2D(3553, 0, bitmap, 0);
                                bitmap2 = bitmap != bitmap3 ? bitmap : null;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                }
                            } catch (Exception e) {
                                e = e;
                                Logger.e(e, "Places panorama thumbnail upload failed", new Object[0]);
                                if (i != 0) {
                                    GLES20.glDeleteTextures(1, new int[]{i}, 0);
                                }
                                if (bitmap != null) {
                                    if (bitmap != bitmap3) {
                                    }
                                    if (bitmap2 != null) {
                                        bitmap2.recycle();
                                    }
                                }
                                i = 0;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = 0;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (bitmap != null) {
                            bitmap2 = bitmap != bitmap3 ? bitmap : null;
                            if (bitmap2 != null) {
                                bitmap2.recycle();
                            }
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    bitmap = null;
                } catch (Throwable th2) {
                    th = th2;
                    bitmap = null;
                    if (bitmap != null) {
                        if (bitmap != bitmap3) {
                        }
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                    }
                    throw th;
                }
            } else {
                i = 0;
            }
            this.N0 = i;
            this.R0 = bitmap3;
            this.S0 = false;
        }
        Matrix.setLookAtM(this.W0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 1.0f, 0.0f);
        float f = this.d;
        float f2 = this.h1;
        float fO = yoi1.o(f, -f2, f2);
        Matrix.setIdentityM(this.Y0, 0);
        Matrix.rotateM(this.Y0, 0, fO * 57.295776f, 0.0f, 1.0f, 0.0f);
        Matrix.transposeM(this.b1, 0, this.Y0, 0);
        Matrix.multiplyMM(this.c1, 0, this.W0, 0, this.b1, 0);
        float f3 = this.e;
        Matrix.setIdentityM(this.Z0, 0);
        Matrix.scaleM(this.Z0, 0, f3, f3, 1.0f);
        Matrix.multiplyMM(this.a1, 0, this.Z0, 0, this.V0, 0);
        Matrix.multiplyMM(this.X0, 0, this.a1, 0, this.c1, 0);
        float f4 = this.f;
        if (f4 < 1.0f) {
            GLES20.glUseProgram(this.O0);
            a(this.O0);
            GLES20.glUniformMatrix4fv(GLES20.glGetUniformLocation(this.O0, "uST"), 1, false, this.U0, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, this.t);
            GLES20.glUniform1i(GLES20.glGetUniformLocation(this.O0, "uTex"), 0);
            b(this.O0);
        }
        if (f4 <= 0.0f || this.N0 == 0) {
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glDepthFunc(515);
        GLES20.glUseProgram(this.P0);
        a(this.P0);
        GLES20.glUniform1f(GLES20.glGetUniformLocation(this.P0, "uAlpha"), f4);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.N0);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.P0, "uTex"), 0);
        b(this.P0);
        GLES20.glDepthFunc(513);
        GLES20.glDisable(3042);
        if (this.S0) {
            return;
        }
        this.S0 = true;
        post(new eem1(this, (byte) 1));
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        if (i < 1) {
            i = 1;
        }
        float f = i;
        if (i2 < 1) {
            i2 = 1;
        }
        float f2 = f / i2;
        yux yuxVar = pdm1.a;
        Matrix.perspectiveM(this.V0, 0, (float) Math.toDegrees(Math.atan(Math.min(yuxVar.a, yuxVar.c / f2)) * 2.0d), f2, 0.1f, 200.0f);
        this.h1 = pdm1.a(f2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Surface surface = this.i;
        SurfaceTexture surfaceTexture = this.h;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        this.Q0.set(null);
        this.T0 = false;
        post(new eem1(this, (byte) 3));
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glEnable(2929);
        GLES20.glCullFace(1028);
        GLES20.glEnable(2884);
        boolean z = true;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.t = i;
        GLES20.glBindTexture(36197, i);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.t);
        surfaceTexture2.setOnFrameAvailableListener(new v550(this, (byte) 1));
        this.h = surfaceTexture2;
        Surface surface2 = new Surface(surfaceTexture2);
        this.i = surface2;
        post(new hw9(this, surface2, surface, surfaceTexture, (byte) 17));
        int iGlCreateShader = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(iGlCreateShader, "uniform mat4 uMVP;\n     attribute vec4 aPos;\n     attribute vec2 aTC;\n     varying vec2 vTC;\n     void main() { gl_Position = uMVP * aPos; vTC = aTC; }");
        GLES20.glCompileShader(iGlCreateShader);
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glShaderSource(iGlCreateShader2, "#extension GL_OES_EGL_image_external : require\n     precision mediump float;\n     varying vec2 vTC;\n     uniform samplerExternalOES uTex;\n     uniform mat4 uST;\n     void main() { gl_FragColor = texture2D(uTex, (uST * vec4(vTC, 0.0, 1.0)).xy); }");
        GLES20.glCompileShader(iGlCreateShader2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader2);
        GLES20.glLinkProgram(iGlCreateProgram);
        this.O0 = iGlCreateProgram;
        int iGlCreateShader3 = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(iGlCreateShader3, "uniform mat4 uMVP;\n     attribute vec4 aPos;\n     attribute vec2 aTC;\n     varying vec2 vTC;\n     void main() { gl_Position = uMVP * aPos; vTC = aTC; }");
        GLES20.glCompileShader(iGlCreateShader3);
        int iGlCreateShader4 = GLES20.glCreateShader(35632);
        GLES20.glShaderSource(iGlCreateShader4, "precision mediump float;\n     varying vec2 vTC;\n     uniform sampler2D uTex;\n     uniform float uAlpha;\n     void main() {\n       vec4 color = texture2D(uTex, vec2(vTC.x, 1.0 - vTC.y));\n       gl_FragColor = vec4(color.rgb, color.a * uAlpha);\n     }");
        GLES20.glCompileShader(iGlCreateShader4);
        int iGlCreateProgram2 = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram2, iGlCreateShader3);
        GLES20.glAttachShader(iGlCreateProgram2, iGlCreateShader4);
        GLES20.glLinkProgram(iGlCreateProgram2);
        this.P0 = iGlCreateProgram2;
        this.N0 = 0;
        this.R0 = null;
        this.S0 = false;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < 49; i2++) {
            float f = i2;
            float f2 = 48.0f;
            float f3 = ((88.35729f * f) / 48.0f) - 44.178646f;
            int i3 = 0;
            while (i3 < 97) {
                float f4 = i3;
                double d = ((1.5707964f * f4) / 96.0f) - 0.7853982f;
                float f5 = f2;
                arrayList.add(Float.valueOf(((float) Math.sin(d)) * 100.0f));
                arrayList.add(Float.valueOf(f3));
                arrayList.add(Float.valueOf(((float) Math.cos(d)) * (-100.0f)));
                arrayList2.add(Float.valueOf(f4 / 96.0f));
                arrayList2.add(Float.valueOf(f / f5));
                i3++;
                z = z;
                f2 = f5;
            }
        }
        for (int i4 = 0; i4 < 48; i4++) {
            for (int i5 = 0; i5 < 96; i5++) {
                short s = (short) ((i4 * 97) + i5);
                short s2 = (short) (s + 97);
                arrayList3.add(Short.valueOf(s));
                arrayList3.add(Short.valueOf(s2));
                short s3 = (short) (s + 1);
                arrayList3.add(Short.valueOf(s3));
                arrayList3.add(Short.valueOf(s2));
                arrayList3.add(Short.valueOf((short) (s2 + 1)));
                arrayList3.add(Short.valueOf(s3));
            }
        }
        this.d1 = c(arrayList);
        this.e1 = c(arrayList2);
        ShortBuffer shortBufferAsShortBuffer = ByteBuffer.allocateDirect(arrayList3.size() * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        short[] sArr = new short[arrayList3.size()];
        Iterator it = arrayList3.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            sArr[i6] = ((Number) it.next()).shortValue();
            i6++;
        }
        shortBufferAsShortBuffer.put(sArr);
        shortBufferAsShortBuffer.position(0);
        this.f1 = shortBufferAsShortBuffer;
        this.g1 = arrayList3.size();
    }

    public final void setFallbackAlpha(float f) {
        this.f = yoi1.o(f, 0.0f, 1.0f);
        requestRender();
    }

    public final void setFallbackBitmap(Bitmap bitmap) {
        if (this.g == bitmap) {
            return;
        }
        this.g = bitmap;
        requestRender();
    }

    public final void setOnFallbackFrameRendered(iu30 iu30Var) {
        this.b = iu30Var;
    }

    public final void setOnVideoFrameRendered(iu30 iu30Var) {
        this.c = iu30Var;
    }

    public final void setOnVideoSurfaceReady(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final void setYaw(float f) {
        this.d = f;
        requestRender();
    }

    public final void setZoom(float f) {
        this.e = f;
        requestRender();
    }
}
