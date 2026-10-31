package p;

import android.content.Context;
import android.graphics.Gainmap;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dos extends vaa implements rs40 {
    public static final bg11 w;
    public static final float[] x;
    public static final float[] y;
    public final ns40 h;
    public final b380 i;
    public final b380 j;
    public final boolean k;
    public final float[][] l;
    public final float[][] m;
    public final float[] n;
    public final float[] o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f39p;
    public final int q;
    public bg11 r;
    public Gainmap s;
    public int t;
    public boolean u;
    public boolean v;

    static {
        w280 w280Var = b380.b;
        Object[] objArr = {new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f}};
        i8p1.m(objArr);
        w = b380.l(4, objArr);
        x = new float[]{1.0f, 1.0f, 1.0f, 0.0f, -0.1646f, 1.8814f, 1.4746f, -0.5714f, 0.0f};
        y = new float[]{1.1689f, 1.1689f, 1.1689f, 0.0f, -0.1881f, 2.1502f, 1.6853f, -0.653f, 0.0f};
    }

    public dos(ns40 ns40Var, b380 b380Var, b380 b380Var2, boolean z) {
        super(1, z);
        this.h = ns40Var;
        this.i = b380Var;
        this.j = b380Var2;
        this.k = z;
        int[] iArr = {b380Var.size(), 16};
        Class cls = Float.TYPE;
        this.l = (float[][]) Array.newInstance((Class<?>) cls, iArr);
        this.m = (float[][]) Array.newInstance((Class<?>) cls, b380Var2.size(), 16);
        this.n = fn31.A();
        this.o = fn31.A();
        this.f39p = new float[16];
        this.r = w;
        this.t = -1;
        int iMax = 9729;
        for (int i = 0; i < b380Var.size(); i++) {
            iMax = Math.max(iMax, ((mch0) b380Var.get(i)).c());
        }
        this.q = iMax;
    }

    public static dos j(Context context, bg11 bg11Var, bg11 bg11Var2, boolean z) {
        return new dos(l(context, 2131886226, bg11Var2.isEmpty() ? 2131886135 : 2131886141), b380.p(bg11Var), b380.p(bg11Var2), z);
    }

    public static dos k(Context context, bg11 bg11Var, List list, x8h x8hVar, int i) throws VideoFrameProcessingException {
        int i2;
        boolean zH = x8h.h(x8hVar);
        boolean z = i == 2;
        int i3 = zH ? 2131886227 : 2131886226;
        if (zH) {
            i2 = 2131886139;
        } else if (z) {
            i2 = 2131886146;
        } else {
            i2 = list.isEmpty() ? 2131886135 : 2131886141;
        }
        ns40 ns40VarL = l(context, i3, i2);
        int i4 = x8hVar.c;
        if (zH) {
            dm5.m(i4 == 7 || i4 == 6);
            ns40VarL.g(i4, "uOutputColorTransfer");
        } else if (z) {
            dm5.m(i4 == 3 || i4 == 10);
            ns40VarL.g(i4, "uOutputColorTransfer");
        }
        return new dos(ns40VarL, b380.p(bg11Var), b380.p(list), zH);
    }

    public static ns40 l(Context context, int i, int i2) throws VideoFrameProcessingException {
        try {
            ns40 ns40Var = new ns40(context, i, i2);
            ns40Var.f("uTexTransformationMatrix", fn31.A());
            return ns40Var;
        } catch (IOException | GlUtil.GlException e) {
            throw new VideoFrameProcessingException(e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public static dos m(Context context, x8h x8hVar, x8h x8hVar2, boolean z) throws VideoFrameProcessingException {
        String strGlGetString;
        boolean zH = x8h.h(x8hVar);
        ns40 ns40VarL = l(context, zH ? 2131886227 : 2131886226, zH ? 2131886142 : 2131886144);
        if (zH) {
            if (Objects.equals(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
                try {
                    EGLDisplay eGLDisplayN = fn31.N();
                    EGLContext eGLContextD = fn31.D(EGL14.EGL_NO_CONTEXT, eGLDisplayN, 2, fn31.a);
                    fn31.E(eGLContextD, eGLDisplayN);
                    strGlGetString = GLES20.glGetString(7939);
                    fn31.G(eGLContextD, eGLDisplayN);
                } catch (GlUtil.GlException unused) {
                }
            } else {
                strGlGetString = GLES20.glGetString(7939);
            }
            if (strGlGetString != null && strGlGetString.contains("GL_EXT_YUV_target")) {
                ns40VarL.f("uYuvToRgbColorTransform", x8hVar.b == 1 ? x : y);
                ns40VarL.g(x8hVar.c, "uInputColorTransfer");
                ns40VarL.g(x8hVar2.a == 6 ? 0 : 1, "uApplyHdrToSdrToneMapping");
            }
            throw new VideoFrameProcessingException("The EXT_YUV_target extension is required for HDR editing input.");
        }
        ns40VarL.f = z;
        w280 w280Var = b380.b;
        return o(ns40VarL, x8hVar, x8hVar2, bg11.e);
    }

    public static dos n(Context context, x8h x8hVar, x8h x8hVar2, int i) throws VideoFrameProcessingException {
        int i2;
        int i3 = x8hVar2.a;
        int i4 = x8hVar.c;
        dm5.y(i4 != 2 || i == 2);
        boolean zH = x8h.h(x8hVar);
        boolean z = i == 2 && i3 == 6;
        int i5 = (zH || z) ? 2131886227 : 2131886226;
        if (z) {
            i2 = 2131886147;
        } else {
            i2 = zH ? 2131886143 : 2131886145;
        }
        ns40 ns40VarL = l(context, i5, i2);
        if (!z) {
            dm5.m(zH || i4 == 2 || i4 == 3);
            ns40VarL.g(i4, "uInputColorTransfer");
        }
        if (zH) {
            ns40VarL.g(i3 == 6 ? 0 : 1, "uApplyHdrToSdrToneMapping");
        }
        w280 w280Var = b380.b;
        bg11 bg11VarT = bg11.e;
        if (i == 2) {
            bg11VarT = b380.t(new cos());
        }
        return o(ns40VarL, x8hVar, x8hVar2, bg11VarT);
    }

    public static dos o(ns40 ns40Var, x8h x8hVar, x8h x8hVar2, b380 b380Var) {
        boolean zH = x8h.h(x8hVar);
        int i = x8hVar.a;
        boolean z = (i == 1 || i == 2) && x8hVar2.a == 6;
        int i2 = x8hVar2.c;
        if (zH) {
            if (i2 == 3) {
                i2 = 10;
            }
            dm5.m(i2 == 1 || i2 == 10 || i2 == 6 || i2 == 7);
            ns40Var.g(i2, "uOutputColorTransfer");
        } else if (z) {
            dm5.m(i2 == 1 || i2 == 6 || i2 == 7);
            ns40Var.g(i2, "uOutputColorTransfer");
        } else {
            ns40Var.g(0, "uSdrWorkingColorSpace");
            dm5.m(i2 == 3 || i2 == 1);
            ns40Var.g(i2, "uOutputColorTransfer");
        }
        w280 w280Var = b380.b;
        return new dos(ns40Var, b380Var, bg11.e, zH || z);
    }

    public static boolean p(float[][] fArr, float[][] fArr2) {
        boolean z = false;
        for (int i = 0; i < fArr.length; i++) {
            float[] fArr3 = fArr[i];
            float[] fArr4 = fArr2[i];
            if (!Arrays.equals(fArr3, fArr4)) {
                dm5.z(fArr4.length == 16, "A 4x4 transformation matrix must have 16 elements");
                System.arraycopy(fArr4, 0, fArr3, 0, fArr4.length);
                z = true;
            }
        }
        return z;
    }

    @Override // p.vaa
    public final l291 e(int i, int i2) {
        return qpn1.i(i, i2, this.i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.vaa
    public final void h(int i, long j) throws VideoFrameProcessingException {
        boolean z;
        int i2;
        float[] fArr;
        ns40 ns40Var = this.h;
        HashMap map = ns40Var.e;
        b380 b380Var = this.j;
        int i3 = 1;
        int[] iArr = {b380Var.size(), 16};
        int i4 = 0;
        Class cls = Float.TYPE;
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) cls, iArr);
        if (b380Var.size() > 0) {
            b380Var.get(0).getClass();
            bhn0.d();
            return;
        }
        boolean zP = p(this.m, fArr2);
        float[] fArr3 = this.o;
        if (zP) {
            Matrix.setIdentityM(fArr3, 0);
            if (b380Var.size() > 0) {
                b380Var.get(0).getClass();
                bhn0.d();
                return;
            }
            z = true;
        } else {
            z = false;
        }
        b380 b380Var2 = this.i;
        float[][] fArr4 = (float[][]) Array.newInstance((Class<?>) cls, b380Var2.size(), 16);
        int i5 = 0;
        while (true) {
            i2 = 3;
            if (i5 >= b380Var2.size()) {
                break;
            }
            float[] fArr5 = new float[9];
            ((mch0) b380Var2.get(i5)).b().getValues(fArr5);
            float[] fArr6 = new float[16];
            fArr6[10] = 1.0f;
            int i6 = i3;
            int i7 = 0;
            while (i7 < 3) {
                int i8 = 0;
                while (i8 < 3) {
                    fArr6[((i7 == 2 ? 3 : i7) * 4) + (i8 == 2 ? 3 : i8)] = fArr5[(i7 * 3) + i8];
                    i8++;
                }
                i7++;
            }
            float[] fArr7 = new float[16];
            Matrix.transposeM(fArr7, 0, fArr6, 0);
            fArr4[i5] = fArr7;
            i5++;
            i3 = i6;
        }
        int i9 = i3;
        int i10 = 4;
        float[][] fArr8 = this.l;
        boolean zP2 = p(fArr8, fArr4);
        int i11 = 6;
        float[] fArr9 = this.n;
        if (zP2) {
            Matrix.setIdentityM(fArr9, 0);
            this.r = w;
            int length = fArr8.length;
            int i12 = 0;
            while (true) {
                float[] fArr10 = this.f39p;
                if (i12 >= length) {
                    fArr = fArr9;
                    int i13 = i4;
                    Matrix.invertM(fArr10, i13, fArr, i13);
                    this.r = qpn1.w(fArr10, this.r);
                    break;
                }
                float[] fArr11 = fArr8[i12];
                float[] fArr12 = fArr9;
                Matrix.multiplyMM(fArr10, 0, fArr11, 0, fArr12, 0);
                fArr = fArr12;
                System.arraycopy(fArr10, i4, fArr, i4, fArr10.length);
                bg11 bg11VarW = qpn1.w(fArr11, this.r);
                dm5.n(bg11VarW.d >= i2 ? i9 : i4, "A polygon must have at least 3 vertices.");
                int i14 = i10;
                v280 v280Var = new v280(i14);
                v280Var.e(bg11VarW);
                int i15 = i4;
                while (i15 < i11) {
                    float[] fArr13 = qpn1.a[i15];
                    bg11 bg11VarG = v280Var.g();
                    v280 v280Var2 = new v280(i14);
                    for (int i16 = i4; i16 < bg11VarG.d; i16++) {
                        float[] fArr14 = (float[]) bg11VarG.get(i16);
                        int i17 = bg11VarG.d;
                        float[] fArr15 = (float[]) bg11VarG.get(((i17 + i16) - 1) % i17);
                        if (qpn1.p(fArr14, fArr13)) {
                            if (!qpn1.p(fArr15, fArr13)) {
                                float[] fArrH = qpn1.h(fArr13, fArr13, fArr15, fArr14);
                                if (!Arrays.equals(fArr14, fArrH)) {
                                    v280Var2.c(fArrH);
                                }
                            }
                            v280Var2.c(fArr14);
                        } else if (qpn1.p(fArr15, fArr13)) {
                            float[] fArrH2 = qpn1.h(fArr13, fArr13, fArr15, fArr14);
                            if (!Arrays.equals(fArr15, fArrH2)) {
                                v280Var2.c(fArrH2);
                            }
                        }
                    }
                    i15++;
                    v280Var = v280Var2;
                    i11 = 6;
                    i4 = 0;
                    i14 = 4;
                }
                bg11 bg11VarG2 = v280Var.g();
                this.r = bg11VarG2;
                if (bg11VarG2.d < 3) {
                    break;
                }
                i12++;
                fArr9 = fArr;
                i11 = 6;
                i4 = 0;
                i2 = 3;
                i10 = 4;
            }
            i4 = i9;
        } else {
            fArr = fArr9;
        }
        int i18 = (z || i4 != 0) ? i9 : 0;
        if (this.r.d < 3) {
            return;
        }
        if (this.u && i18 == 0 && this.v) {
            return;
        }
        try {
            GLES20.glUseProgram(ns40Var.a);
            fn31.t();
            if (this.s != null) {
                if (Build.VERSION.SDK_INT < 34) {
                    throw new IllegalStateException("Gainmaps not supported under API 34.");
                }
                ns40Var.h(this.t, i9, "uGainmapTexSampler");
                sf.M(ns40Var, this.s, -1);
            }
            int i19 = this.q;
            ms40 ms40Var = (ms40) map.get("uTexSampler");
            ms40Var.getClass();
            ms40Var.f = i;
            ms40Var.g = 0;
            ms40Var.h = i19;
            ns40Var.f("uTransformationMatrix", fArr);
            ms40 ms40Var2 = (ms40) map.get("uRgbMatrix");
            if (ms40Var2 != null) {
                System.arraycopy(fArr3, 0, ms40Var2.d, 0, fArr3.length);
            }
            bg11 bg11Var = this.r;
            float[] fArr16 = new float[bg11Var.d * 4];
            for (int i20 = 0; i20 < bg11Var.d; i20++) {
                System.arraycopy(bg11Var.get(i20), 0, fArr16, i20 * 4, 4);
            }
            ns40Var.d(fArr16);
            ns40Var.b();
            GLES20.glDrawArrays(6, 0, this.r.d);
            fn31.t();
            this.v = true;
        } catch (GlUtil.GlException e) {
            throw new VideoFrameProcessingException(j, e);
        }
    }

    @Override // p.vaa
    public final boolean i() {
        return (this.v && this.u) ? false : true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    @Override // p.rs40
    public final void release() throws VideoFrameProcessingException {
        try {
            this.a.b();
            try {
                this.h.c();
                int i = this.t;
                if (i != -1) {
                    GLES20.glDeleteTextures(1, new int[]{i}, 0);
                    fn31.t();
                }
            } catch (GlUtil.GlException e) {
                throw new VideoFrameProcessingException((Throwable) e);
            }
        } catch (GlUtil.GlException e2) {
            throw new VideoFrameProcessingException((Throwable) e2);
        }
    }
}
