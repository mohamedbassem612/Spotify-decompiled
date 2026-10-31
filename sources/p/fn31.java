package p;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.common.util.GlUtil;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.functions.Function0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract /* synthetic */ class fn31 {
    public static final int[] a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    public static final int[] c = {12445, 13120, 12344, 12344};
    public static final int[] d = {12445, 13632, 12344, 12344};
    public static final int[] e = {12344};
    public static b180 f;

    public static float[] A() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static void B(Window window, d7a0 d7a0Var) {
        new e7a0(window, d7a0Var);
    }

    public static FloatBuffer C(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public static EGLContext D(EGLContext eGLContext, EGLDisplay eGLDisplay, int i, int[] iArr) throws GlUtil.GlException {
        boolean z = true;
        dm5.m(Arrays.equals(iArr, a) || Arrays.equals(iArr, b));
        if (i != 2 && i != 3) {
            z = false;
        }
        dm5.m(z);
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, O(eGLDisplay, iArr), eGLContext, new int[]{12440, i, 12344}, 0);
        if (eGLContextEglCreateContext == null || eGLContextEglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglTerminate(eGLDisplay);
            throw new GlUtil.GlException(f4i1.c(i, "eglCreateContext() failed to create a valid context. The device may not support EGL version "));
        }
        s("Error in createEglContext");
        return eGLContextEglCreateContext;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public static EGLSurface E(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlUtil.GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (R("EGL_KHR_surfaceless_context")) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, O(eGLDisplay, a), new int[]{12375, 1, 12374, 1, 12344}, 0);
            s("Error creating a new EGL Pbuffer surface");
        }
        I(eGLDisplay, eGLContext, eGLSurfaceEglCreatePbufferSurface, 1, 1);
        return eGLSurfaceEglCreatePbufferSurface;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public static long F() throws GlUtil.GlException {
        if (M() < 3) {
            return 0L;
        }
        long jGlFenceSync = GLES30.glFenceSync(37143, 0);
        t();
        GLES20.glFlush();
        t();
        return jGlFenceSync;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public static void G(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlUtil.GlException {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        s("Error releasing context");
        if (eGLContext == null || eGLContext.equals(EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        EGL14.eglDestroyContext(eGLDisplay, eGLContext);
        s("Error destroying context");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public static void H(EGLDisplay eGLDisplay, EGLSurface eGLSurface) throws GlUtil.GlException {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY) || eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        s("Error destroying surface");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public static void I(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2) throws GlUtil.GlException {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        s("Error making context current");
        J(0, i, i2);
        if (eGLSurface.equals(EGL14.EGL_NO_SURFACE) || M() < 3) {
            return;
        }
        GLES30.glDrawBuffers(1, new int[]{1029}, 0);
        t();
        GLES30.glReadBuffer(1029);
        t();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public static void J(int i, int i2, int i3) throws GlUtil.GlException {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i) {
            GLES20.glBindFramebuffer(36160, i);
        }
        t();
        GLES20.glViewport(0, 0, i2, i3);
        t();
    }

    public static aka1 K(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tja1 tja1Var = (tja1) it.next();
            oja1 oja1Var = tja1Var.b;
            List list2 = oja1Var.a;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(new rvt0((long) (oja1Var.d * 1000.0d), (String) it2.next(), oja1Var.b / 100.0f));
            }
            fw80 fw80Var = tja1Var.a;
            Object arrayList2 = linkedHashMap.get(fw80Var);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(fw80Var, arrayList2);
            }
            ((List) arrayList2).addAll(arrayList);
        }
        return new aka1(linkedHashMap);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public static int L() throws GlUtil.GlException {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        t();
        return iArr[0];
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public static long M() throws GlUtil.GlException {
        int[] iArr = new int[1];
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, iArr, 0);
        t();
        return iArr[0];
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public static EGLDisplay N() throws GlUtil.GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        u("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        u("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        s("Error in getDefaultEglDisplay");
        return eGLDisplayEglGetDisplay;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public static EGLConfig O(EGLDisplay eGLDisplay, int[] iArr) throws GlUtil.GlException {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new GlUtil.GlException("eglChooseConfig failed.");
    }

    public static float[] P() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean Q() {
        return Build.VERSION.SDK_INT >= 33 && R("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean R(String str) {
        String strEglQueryString = EGL14.eglQueryString(N(), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static final xab1 S(c9n c9nVar, o8n o8nVar, int i, vu30 vu30Var) {
        o8n o8nVarO = ulo1.o(c9nVar, o8nVar);
        gvb0 gvb0Var = i == 2 ? new gvb0(o8nVarO, vu30Var) : new xab1(o8nVarO, true, true);
        gvb0Var.A0(i, gvb0Var, vu30Var);
        return gvb0Var;
    }

    public static xab1 T(c9n c9nVar, o8n o8nVar, int i, vu30 vu30Var, int i2) {
        if ((i2 & 1) != 0) {
            o8nVar = o6x.a;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return S(c9nVar, o8nVar, i, vu30Var);
    }

    public static boolean U(w9v0 w9v0Var) {
        return w9v0Var.a();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public static void V(int i, Bitmap bitmap) throws GlUtil.GlException {
        p(bitmap.getWidth(), bitmap.getHeight());
        r(3553, i, 9729);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        t();
    }

    public static final Object W(x8c0 x8c0Var, boolean z, bs50 bs50Var, Function0 function0, lnm lnmVar) {
        ohd ohdVar = new ohd(1, aym.t(lnmVar));
        ohdVar.t();
        s760 s760Var = new s760(x8c0Var, ohdVar, function0, (byte) 2);
        if (z) {
            bs50Var.h(o6x.a, new mqh1(x8c0Var, s760Var, (byte) 7));
        } else {
            x8c0Var.a(s760Var);
        }
        ohdVar.n(new ffr(bs50Var, x8c0Var, s760Var, (byte) 7));
        return ohdVar.r();
    }

    public static final int X(int i) {
        switch (l1d.C(i)) {
            case 0:
                return 3;
            case 1:
                return 1;
            case 2:
                return 10;
            case 3:
                return 5;
            case 4:
                return 4;
            case 5:
                return 9;
            case 6:
                return 2;
            default:
                eg.o();
                return 0;
        }
    }

    public static final Object Y(o8n o8nVar, vu30 vu30Var, lnm lnmVar) {
        Unsafe unsafe;
        long j;
        o8n context = lnmVar.getContext();
        o8n o8nVarN = ulo1.n(context, o8nVar);
        op71.x(o8nVarN);
        if (o8nVarN == context) {
            fn41 fn41Var = new fn41(lnmVar, o8nVarN);
            return wgo1.E(fn41Var, true, fn41Var, vu30Var);
        }
        wdu0 wdu0Var = wdu0.Y;
        if (u890.j(o8nVarN.A(wdu0Var), context.A(wdu0Var))) {
            fhh1 fhh1Var = new fhh1(lnmVar, o8nVarN);
            o8n o8nVar2 = ((q6) fhh1Var).d;
            Object objW = flo1.w(o8nVar2, null);
            try {
                return wgo1.E(fhh1Var, true, fhh1Var, vu30Var);
            } finally {
                flo1.p(o8nVar2, objW);
            }
        }
        wfu wfuVar = new wfu(lnmVar, o8nVarN);
        ozn1.s(vu30Var, wfuVar, wfuVar);
        do {
            unsafe = avg.a;
            j = wfu.f;
            int intVolatile = unsafe.getIntVolatile(wfuVar, j);
            if (intVolatile != 0) {
                if (intVolatile != 2) {
                    eg.m("Already suspended");
                    return null;
                }
                Object objD = j1e1.D(wfuVar.g0());
                if (objD instanceof nyh) {
                    throw ((nyh) objD).a;
                }
                return objD;
            }
        } while (!unsafe.compareAndSwapInt(wfuVar, j, 0, 1));
        return d9n.a;
    }

    public static final Object Z(lnm lnmVar, iu30 iu30Var, en31 en31Var) {
        fuo fuoVar = new fuo(iu30Var, (lnm) null, (byte) 3);
        p7g1 p7g1VarA = lnmVar.getContext().A(p7g1.b);
        q8n q8nVar = p7g1VarA != null ? p7g1VarA.a : null;
        if (q8nVar != null) {
            return Y(q8nVar, fuoVar, lnmVar);
        }
        ohd ohdVar = new ohd(1, aym.t(lnmVar));
        ohdVar.t();
        try {
            q7g1 q7g1Var = en31Var.d;
            if (q7g1Var != null) {
                q7g1Var.execute(new sl21(ohdVar, en31Var, fuoVar, (byte) 3));
                return ohdVar.r();
            }
            u890.C("internalTransactionExecutor");
            throw null;
        } catch (RejectedExecutionException e2) {
            ohdVar.q(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
    }

    public static final void a(wx wxVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(317741508);
        int i3 = (x340Var.g(wxVar) ? 4 : 2) | i;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            ux uxVar = wxVar instanceof ux ? (ux) wxVar : null;
            if (uxVar == null || uxVar.b < 2) {
                uxVar = null;
            }
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zG = x340Var.g(uxVar);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new dvg0(uxVar, ven0Var, (byte) 24);
                x340Var.s0(objT2);
            }
            qxd0.S((Function0) objT2, x340Var);
            if (uxVar == null || (i2 = uxVar.a) == 0) {
                ux uxVar2 = (ux) ven0Var.getValue();
                i2 = uxVar2 != null ? uxVar2.a : 0;
            }
            gfh0 gfh0VarC = t1c.c(i2 == 1 ? een.g : een.i, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            fq7.g(uxVar != null, (qim0) null, xay.e(2, irn1.o0(150, 0, (dlv) null, 6)), xay.f(2, irn1.o0(150, 0, (dlv) null, 6)), (String) null, apo.r(2111417766, new ukm0(uxVar, ven0Var, (byte) 3), x340Var), x340Var, 200064, 18);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new loi0(wxVar, qim0Var, i, (byte) 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:70:0x011b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0134  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void b(final Function0 function0, final j2i j2iVar, qim0 qim0Var, vu30 vu30Var, final vu30 vu30Var2, final vu30 vu30Var3, hw61 hw61Var, long j, long j2, long j3, long j4, i3u i3uVar, b0k b0kVar, final int i, final int i2) {
        Function0 function1;
        int i3;
        j2i j2iVar2;
        final vu30 vu30Var4;
        int i4;
        boolean z;
        b0k b0kVar2;
        final qim0 qim0Var2;
        final hw61 hw61Var2;
        final long j5;
        final long j6;
        final long jE;
        final long jE2;
        final i3u i3uVar2;
        h311 h311VarV;
        int i5;
        int i6;
        int i7;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(94478519);
        if ((i & 6) == 0) {
            function1 = function0;
            i3 = (b0kVar3.i(function1) ? 4 : 2) | i;
        } else {
            function1 = function0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            j2iVar2 = j2iVar;
            i3 |= b0kVar3.i(j2iVar2) ? 32 : 16;
        } else {
            j2iVar2 = j2iVar;
        }
        int i8 = i3 | 384;
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                vu30Var4 = vu30Var;
                i8 |= b0kVar3.i(vu30Var4) ? SemanticState.Modal : SemanticState.ReadOnly;
            }
            i4 = i8 | 24576;
            if ((196608 & i) != 0) {
                if (b0kVar3.i(vu30Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i4 |= i7;
            }
            if ((1572864 & i) != 0) {
                if (b0kVar3.i(vu30Var3)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            }
            if ((12582912 & i) == 0) {
                i4 |= 4194304;
            }
            if ((100663296 & i) == 0) {
                i4 |= 33554432;
            }
            if ((805306368 & i) == 0) {
                i4 |= 268435456;
            }
            if ((306783379 & i4) == 306783378) {
                z = false;
            } else {
                z = true;
            }
            if (b0kVar3.Y(i4 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0 || b0kVar3.E()) {
                    if (i9 != 0) {
                        vu30Var4 = null;
                    }
                    hw61 hw61VarB = px61.b(b0kVar3, 2);
                    long jE3 = eah.e(b0kVar3, 38);
                    long jE4 = eah.e(b0kVar3, 31);
                    i5 = i4 & (-2143289345);
                    j5 = jE3;
                    jE = eah.e(b0kVar3, 18);
                    j6 = jE4;
                    jE2 = eah.e(b0kVar3, 19);
                    i3uVar2 = new i3u(7, false, false, false);
                    hw61Var2 = hw61VarB;
                    qim0Var2 = nim0.a;
                } else {
                    b0kVar3.b0();
                    hw61Var2 = hw61Var;
                    j5 = j;
                    j6 = j2;
                    jE = j3;
                    jE2 = j4;
                    i3uVar2 = i3uVar;
                    i5 = i4 & (-2143289345);
                    qim0Var2 = qim0Var;
                }
                b0kVar3.s();
                b0kVar2 = b0kVar3;
                gi3.c(function1, j2iVar2, qim0Var2, vu30Var4, vu30Var2, vu30Var3, hw61Var2, j5, j6, jE, jE2, i3uVar2, b0kVar2, i5 & 2147483646, 3456);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
                hw61Var2 = hw61Var;
                j5 = j;
                j6 = j2;
                jE = j3;
                jE2 = j4;
                i3uVar2 = i3uVar;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.v44
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = czo1.p(i | 1);
                        fn31.b(function0, j2iVar, qim0Var2, vu30Var4, vu30Var2, vu30Var3, hw61Var2, j5, j6, jE, jE2, i3uVar2, (b0k) obj, iP, i2);
                        return rih1.a;
                    }
                };
            }
        }
        i8 = i3 | 3456;
        vu30Var4 = vu30Var;
        i4 = i8 | 24576;
        if ((196608 & i) != 0) {
            if (b0kVar3.i(vu30Var2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i4 |= i7;
        }
        if ((1572864 & i) != 0) {
            if (b0kVar3.i(vu30Var3)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i4 |= i6;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= 268435456;
        }
        if ((306783379 & i4) == 306783378) {
            z = false;
        } else {
            z = true;
        }
        if (b0kVar3.Y(i4 & 1, z)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    vu30Var4 = null;
                }
                hw61 hw61VarB2 = px61.b(b0kVar3, 2);
                long jE5 = eah.e(b0kVar3, 38);
                long jE6 = eah.e(b0kVar3, 31);
                i5 = i4 & (-2143289345);
                j5 = jE5;
                jE = eah.e(b0kVar3, 18);
                j6 = jE6;
                jE2 = eah.e(b0kVar3, 19);
                i3uVar2 = new i3u(7, false, false, false);
                hw61Var2 = hw61VarB2;
                qim0Var2 = nim0.a;
            } else {
                if (i9 != 0) {
                    vu30Var4 = null;
                }
                hw61 hw61VarB3 = px61.b(b0kVar3, 2);
                long jE7 = eah.e(b0kVar3, 38);
                long jE8 = eah.e(b0kVar3, 31);
                i5 = i4 & (-2143289345);
                j5 = jE7;
                jE = eah.e(b0kVar3, 18);
                j6 = jE8;
                jE2 = eah.e(b0kVar3, 19);
                i3uVar2 = new i3u(7, false, false, false);
                hw61Var2 = hw61VarB3;
                qim0Var2 = nim0.a;
            }
            b0kVar3.s();
            b0kVar2 = b0kVar3;
            gi3.c(function1, j2iVar2, qim0Var2, vu30Var4, vu30Var2, vu30Var3, hw61Var2, j5, j6, jE, jE2, i3uVar2, b0kVar2, i5 & 2147483646, 3456);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
            hw61Var2 = hw61Var;
            j5 = j;
            j6 = j2;
            jE = j3;
            jE2 = j4;
            i3uVar2 = i3uVar;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.v44
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(i | 1);
                    fn31.b(function0, j2iVar, qim0Var2, vu30Var4, vu30Var2, vu30Var3, hw61Var2, j5, j6, jE, jE2, i3uVar2, (b0k) obj, iP, i2);
                    return rih1.a;
                }
            };
        }
    }

    public static final void c(vcl vclVar, String str, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        if5 if5Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1533742368);
        int i2 = i | (x340Var.i(vclVar) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.i(function0) ? SemanticState.Hidden : SemanticState.Focused) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String str2 = vclVar.a;
            v1s0 v1s0Var = new v1s0(Uri.parse(vclVar.d));
            String str3 = vclVar.b;
            if (vclVar.f.length() > 0) {
                x340Var.i0(-1815076511);
                if5Var = new if5((Integer) null, (String) null, new lo9(apo.r(-117493843, new okg(vclVar, (byte) 29), x340Var), (byte) 20), (hf5) null, 11);
                x340Var.r(false);
            } else if (vclVar.c.length() > 0) {
                x340Var.i0(-1815059052);
                x340Var.r(false);
                if5Var = new if5((Integer) null, vclVar.c, (b2i) null, (hf5) null, 13);
            } else {
                x340Var.i0(-432209108);
                x340Var.r(false);
                if5Var = null;
            }
            if5 if5Var2 = if5Var;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = tqk.Z0;
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = tqk.a1;
                x340Var.s0(objT2);
            }
            int i3 = i2 << 9;
            qim0 qim0Var3 = nim0.a;
            bno1.f(str2, v1s0Var, str3, if5Var2, str, function0, iu30Var, (iu30) objT2, qim0Var3, (lax) null, (lax) null, x340Var, (i3 & 458752) | (57344 & i3) | 14159872 | 100663296, 1536);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hwd(i, vclVar, str, function0, qim0Var2, (byte) 28);
        }
    }

    public static final void d(bor0 bor0Var, qim0 qim0Var, float f2, float f3, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        h311 h311VarV;
        vv40 vv40Var;
        boolean z;
        Paint paint;
        gw70 gw70Var;
        boolean z2;
        Object obj;
        Object obj2;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        gra graVar = een.d;
        m4c m4cVar = fkj0.X;
        long j = bor0Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1278484440);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(bor0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f2) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.d(f3) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(j2iVar) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            boolean zB = z4h1.b(j, u7h.j);
            h2c h2cVar = h2c.a;
            n4k n4kVar = hmb0.t1;
            if (zB || u7h.c(j) == 0.0f) {
                x340Var.i0(-439738230);
                int i4 = (i3 >> 3) & 7182;
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar4);
                nko1.H(xos0VarM, x340Var, lljVar3);
                x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE, x340Var, lljVar);
                ywx0.l(((i4 >> 6) & ContentType.LONG_FORM_ON_DEMAND) | 6, j2iVar, h2cVar, x340Var, true);
                x340Var.r(false);
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    vv40Var = new vv40(bor0Var, qim0Var, f2, f3, j2iVar, i, (byte) 0);
                }
            } else {
                x340Var.i0(-439676726);
                x340Var.r(false);
                if (Build.VERSION.SDK_INT >= 33) {
                    x340Var.i0(-439590577);
                    Object objT = x340Var.T();
                    if (objT == m4cVar) {
                        obj2 = objT;
                        idd1 idd1Var = ol10.a;
                        Paint paint2 = new Paint();
                        paint2.setShader(rqb.b());
                        x340Var.s0(paint2);
                        obj2 = paint2;
                    }
                    obj2 = objT;
                    paint = (Paint) obj2;
                    z = false;
                    x340Var.r(false);
                } else {
                    z = false;
                    x340Var.i0(-439527803);
                    x340Var.r(false);
                    paint = null;
                }
                String str = bor0Var.b;
                if (str == null) {
                    x340Var.i0(-439475010);
                    x340Var.r(z);
                    str = null;
                } else {
                    x340Var.i0(-439475009);
                    if (!((Boolean) x340Var.k(zv40.a)).booleanValue()) {
                        str = null;
                    }
                    z = false;
                    x340Var.r(false);
                }
                if (str != null) {
                    x340Var.i0(262921535);
                    gw70 gw70Var2 = (gw70) x340Var.k(oi7.a);
                    x340Var.r(false);
                    gw70Var = gw70Var2;
                } else {
                    x340Var.i0(-439354203);
                    x340Var.r(z);
                    gw70Var = null;
                }
                boolean zI = x340Var.i(gw70Var) | x340Var.g(str);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    z2 = false;
                    obj = null;
                    objT2 = new wv40(gw70Var, str, null, (byte) 0);
                    x340Var.s0(objT2);
                } else {
                    z2 = false;
                    obj = null;
                }
                ven0 ven0VarP = yto.p(obj, str, (vu30) objT2, x340Var, 6);
                gfh0 gfh0VarC2 = t1c.c(graVar, z2);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0Var);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarR = exd0.r(h2cVar.b(nim0Var), new yv40(bor0Var, f3, paint, (Bitmap) ven0VarP.getValue()));
                if (p3v.b(f2, 0.0f) > 0) {
                    qim0VarR = qim0VarR.then(fc11.n(nim0Var, f2, f2, d4o1.a));
                }
                t1c.a(qim0VarR, x340Var, 0);
                ywx0.l(6 | ((i3 >> 9) & ContentType.LONG_FORM_ON_DEMAND), j2iVar, h2cVar, x340Var, true);
            }
            h311VarV.d = vv40Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            vv40Var = new vv40(bor0Var, qim0Var, f2, f3, j2iVar, i, (byte) 1);
            h311VarV.d = vv40Var;
        }
    }

    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    public static final void e(iqf0 iqf0Var, cx0 cx0Var, tyq tyqVar, c920 c920Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        ?? r2;
        m4c m4cVar = fkj0.X;
        List list = iqf0Var.b;
        List list2 = iqf0Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1926360942);
        int i2 = (i & 6) == 0 ? (x340Var.g(iqf0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(cx0Var) : x340Var.i(cx0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(tyqVar) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & SemanticState.Obscured) == 0 ? x340Var.g(c920Var) : x340Var.i(c920Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(qim0Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(iu30Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 74899) != 74898)) {
            boolean zG = x340Var.g(list2);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = yv91.a(new jgd0(iqf0Var, (byte) 28));
                x340Var.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            qim0 qim0VarN = anm1.N("stickers-picker-root", qim0Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN2 = anm1.N("stickers-picker-search", uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 8.0f, 7));
            int i4 = i3 & 458752;
            boolean z = i4 == 131072;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new yjf0(iu30Var, (byte) 5);
                x340Var.s0(objT2);
            }
            iu30 iu30Var2 = (iu30) objT2;
            boolean z2 = i4 == 131072;
            Object objT3 = x340Var.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new uef0(iu30Var, (byte) 18);
                x340Var.s0(objT3);
            }
            Function0 function0 = (Function0) objT3;
            boolean z3 = i4 == 131072;
            Object objT4 = x340Var.T();
            if (z3 || objT4 == m4cVar) {
                objT4 = new yjf0(iu30Var, (byte) 6);
                x340Var.s0(objT4);
            }
            i(cx0Var, iu30Var2, qim0VarN2, function0, (iu30) objT4, x340Var, 8 | ((i3 >> 3) & 14));
            if (((Boolean) tob1Var.getValue()).booleanValue()) {
                x340Var.i0(2046689824);
                List<zpf0> list3 = list2;
                ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                for (zpf0 zpf0Var : list3) {
                    arrayList.add(new x820(zpf0Var.a, zpf0Var.b, zpf0Var.c));
                }
                z820 z820Var = new z820(arrayList);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                otw.c(c920Var, z820Var, anm1.N("stickers-picker-filters", uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 8.0f, 7)), (ipb1) null, x340Var, (i3 >> 9) & 14, 8);
                x340Var = x340Var;
                r2 = 0;
                x340Var.r(false);
            } else {
                r2 = 0;
                x340Var.i0(2047145338);
                x340Var.r(false);
            }
            boolean z4 = iqf0Var.a;
            pbh pbhVar = pbh.a;
            if (z4) {
                x340Var.i0(1867154047);
                t6p1.d(anm1.N("stickers-picker-loading", pbhVar.a(1.0f, u291.f(nim0Var, (float) r3), true)), x340Var, (int) r2);
                x340Var.r((boolean) r2);
            } else if (iqf0Var.e || (iqf0Var.d && list.isEmpty())) {
                x340Var.i0(1867160314);
                h(anm1.N("stickers-picker-error", pbhVar.a((float) r3, u291.f(nim0Var, (float) r3), true)), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(2047540495);
                qim0 qim0VarN3 = anm1.N("stickers-picker-grid", u291.d(nim0Var, (float) r3));
                c380 c380VarA = mqo1.A(list);
                boolean z5 = i4 == 131072;
                Object objT5 = x340Var.T();
                if (z5 || objT5 == m4cVar) {
                    objT5 = new yjf0(iu30Var, (byte) 7);
                    x340Var.s0(objT5);
                }
                iu30 iu30Var3 = (iu30) objT5;
                boolean z6 = (i4 == 131072) | ((i3 & 14) == 4);
                Object objT6 = x340Var.T();
                if (z6 || objT6 == m4cVar) {
                    objT6 = new bsc0(iqf0Var, iu30Var, (byte) 18);
                    x340Var.s0(objT6);
                }
                j(tyqVar, c380VarA, iu30Var3, (Function0) objT6, qim0VarN3, x340Var, (i3 >> 6) & 14);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0(iqf0Var, cx0Var, tyqVar, c920Var, qim0Var, iu30Var, i, (byte) 0);
        }
    }

    public static final void f(fvf1 fvf1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        int i3;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1928186070);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(fvf1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(vx.a);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            wx wxVar = (wx) ven0Var.getValue();
            boolean z2 = (i4 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new wkk0(ven0Var, iu30Var, (lnm) null);
                x340Var.s0(objT2);
            }
            qxd0.t(wxVar, x340Var, (vu30) objT2);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarD2 = u291.d(qim0Var3, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            boolean z4 = ((wx) ven0Var.getValue()) instanceof ux;
            pw31 pw31Var = pw31.a;
            qim0 qim0VarN = anm1.N("multitap-seek-tap-zone-left", u291.c(pw31Var.a(1.0f, qim0Var3, true), 1.0f));
            boolean zI = x340Var.i(fvf1Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                i3 = 0;
                objT3 = new vym0(fvf1Var, ven0Var, (byte) 0);
                x340Var.s0(objT3);
            } else {
                i3 = 0;
            }
            k(i3, (Function0) objT3, x340Var, qim0VarN, z4);
            op71.g(x340Var, pw31Var.a(1.0f, qim0Var3, true));
            boolean z5 = ((wx) ven0Var.getValue()) instanceof ux;
            qim0 qim0VarN2 = anm1.N("multitap-seek-tap-zone-right", u291.c(pw31Var.a(1.0f, qim0Var3, true), 1.0f));
            boolean zI2 = x340Var.i(fvf1Var);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                z = true;
                objT4 = new vym0(fvf1Var, ven0Var, (byte) 1);
                x340Var.s0(objT4);
            } else {
                z = true;
            }
            k(0, (Function0) objT4, x340Var, qim0VarN2, z5);
            x340Var.r(z);
            a((wx) ven0Var.getValue(), u291.d(qim0Var3, 1.0f), x340Var, 48);
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(fvf1Var, iu30Var, qim0Var2, i, (byte) 2);
        }
    }

    public static final void g(String str, String str2, long j, Function0 function0, qim0 qim0Var, boolean z, boolean z2, boolean z3, b0k b0kVar, int i) {
        int i2;
        String str3;
        long j2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1265226758);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i2 |= x340Var.g(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i2 |= x340Var.f(j2) ? SemanticState.Hidden : SemanticState.Focused;
        } else {
            j2 = j;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= x340Var.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= x340Var.h(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= x340Var.h(z3) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            nyx.a(2, (wux) null, apo.r(269188359, new xoq0(z3, z, z2, function0, (View) x340Var.k(AndroidCompositionLocals_androidKt.f), str, j2, str3), x340Var), x340Var, 3078, 6);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yoq0(str, str2, j, function0, qim0Var2, z, z2, z3, i);
        }
    }

    public static final void h(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(623637695);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            gux guxVar = gux.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(guxVar, isl.a, u291.r(qim0VarB, 24.0f), j, 0L, false, x340Var, gux.d | 48, 48);
            uwo1.e(cwl1.o0(x340Var, 2131962933), (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            uwo1.e(cwl1.o0(x340Var, 2131962932), (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var, i, (byte) 7);
        }
    }

    public static final void i(cx0 cx0Var, iu30 iu30Var, qim0 qim0Var, Function0 function0, iu30 iu30Var2, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-358116437);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(cx0Var) : x340Var.i(cx0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var2) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = v8r.q("");
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            String str = (String) ven0Var.getValue();
            boolean zI = ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new mbg(ven0Var, iu30Var, (lnm) null);
                x340Var.s0(objT2);
            }
            qxd0.t(str, x340Var, (vu30) objT2);
            String str2 = (String) ven0Var.getValue();
            boolean zI2 = x340Var.i(ven0Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new sqa0(ven0Var, (byte) 15);
                x340Var.s0(objT3);
            }
            iu30 iu30Var3 = (iu30) objT3;
            boolean zI3 = x340Var.i(ven0Var) | ((i2 & 7168) == 2048);
            Object objT4 = x340Var.T();
            if (zI3 || objT4 == m4cVar) {
                objT4 = new cb(function0, ven0Var, (byte) 25);
                x340Var.s0(objT4);
            }
            otw.c(cx0Var, new rb51(str2, iu30Var3, (Function0) objT4, iu30Var2, (String) null), qim0Var, (ipb1) null, x340Var, (i2 & 14) | 8 | (i2 & 896), 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0(cx0Var, iu30Var, qim0Var, function0, iu30Var2, i);
        }
    }

    public static final void j(tyq tyqVar, c380 c380Var, iu30 iu30Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1466225981);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(tyqVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(c380Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function0) ? 2048 : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            qim0Var2 = qim0Var;
            i2 |= b0kVar3.i(qim0Var2) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        } else {
            qim0Var2 = qim0Var;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            upb0 upb0VarB = wpb0.b(b0kVar3);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = yv91.a(new ppk(upb0VarB, (byte) 5));
                b0kVar3.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            Boolean bool = (Boolean) tob1Var.getValue();
            bool.getClass();
            boolean zI = b0kVar3.i(tob1Var) | ((i2 & 7168) == 2048);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new xlh(function0, tob1Var, null, (byte) 1);
                b0kVar3.s0(objT2);
            }
            int i3 = i2 & ContentType.LONG_FORM_ON_DEMAND;
            qxd0.s(bool, c380Var, (vu30) objT2, b0kVar3);
            pf50 pf50Var = new pf50(2);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            d36 d36Var2 = new d36(8.0f, true, new um5(false));
            boolean zI2 = (i3 == 32) | ((i2 & 896) == 256) | b0kVar3.i(tyqVar);
            Object objT3 = b0kVar3.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new gnf0(c380Var, iu30Var, tyqVar, (byte) 1);
                b0kVar3.s0(objT3);
            }
            b0kVar2 = b0kVar3;
            dko1.g(pf50Var, qim0Var2, upb0VarB, zzq0Var, d36Var, d36Var2, (iq20) null, false, (hxq0) null, (iu30) objT3, b0kVar2, (i2 >> 9) & ContentType.LONG_FORM_ON_DEMAND, 912);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0(tyqVar, c380Var, iu30Var, function0, qim0Var, i);
        }
    }

    public static final void k(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1744749526);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16) | (x340Var.i(function0) ? SemanticState.Hidden : SemanticState.Focused);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ven0 ven0VarS = v8r.s(function0, x340Var);
            ven0 ven0VarS2 = v8r.s(Boolean.valueOf(z), x340Var);
            View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            boolean zG = x340Var.g(ven0VarS2) | x340Var.i(view) | x340Var.g(ven0VarS);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new mhg(view, ven0VarS2, ven0VarS, (byte) 7);
                x340Var.s0(objT);
            }
            t1c.a(f8d1.b(qim0Var, rih1.a, (PointerInputEventHandler) objT), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new le3(z, qim0Var, function0, i, (byte) 14);
        }
    }

    public static final void l(String str, long j, String str2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2010351121);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 32 : 16) | (x340Var.f(j) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.g(str2) ? SemanticState.Modal : SemanticState.ReadOnly);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, wnb0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).g, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, ((i2 >> 3) & 14) | ((i2 << 3) & 7168), 0, 2034);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(nim0Var, 6.0f));
            p9p1.b((qim0) null, 1, 1, x340Var, 432, 1);
            x340Var.r(true);
            lee1 lee1Var = cbx.d(x340Var).j;
            long j2 = cbx.a(x340Var).b.b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(str2, uyn1.B(nim0Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), lee1Var, j2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i2 >> 9) & 14, 0, 2032);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zoq0(i, str, str2, j);
        }
    }

    public static final void n(e4v e4vVar, x3v x3vVar) {
        e4vVar.O0(x3vVar);
        e4vVar.a0(x3vVar);
    }

    public static final void o(dpg1 dpg1Var, iu30 iu30Var) {
        if (iu30Var.invoke(dpg1Var) != cpg1.a) {
            return;
        }
        don1.H(dpg1Var, iu30Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public static void p(int i, int i2) throws GlUtil.GlException {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i3 = iArr[0];
        dm5.z(i3 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i < 0 || i2 < 0) {
            throw new GlUtil.GlException("width or height is less than 0");
        }
        if (i > i3 || i2 > i3) {
            throw new GlUtil.GlException(f4i1.c(i3, "width or height is greater than GL_MAX_TEXTURE_SIZE "));
        }
    }

    public static s2t q(c9n c9nVar, o8n o8nVar, int i, vu30 vu30Var, int i2) {
        if ((i2 & 1) != 0) {
            o8nVar = o6x.a;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        o8n o8nVarO = ulo1.o(c9nVar, o8nVar);
        q6 sob0Var = i == 2 ? new sob0(o8nVarO, vu30Var) : new s2t(o8nVarO, true, true);
        sob0Var.A0(i, sob0Var, vu30Var);
        return sob0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public static void r(int i, int i2, int i3) throws GlUtil.GlException {
        GLES20.glBindTexture(i, i2);
        t();
        GLES20.glTexParameteri(i, 10240, i3);
        t();
        GLES20.glTexParameteri(i, 10241, i3);
        t();
        GLES20.glTexParameteri(i, 10242, 33071);
        t();
        GLES20.glTexParameteri(i, 10243, 33071);
        t();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public static void s(String str) throws GlUtil.GlException {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbG = dv20.g(str, ", error code: 0x");
        sbG.append(Integer.toHexString(iEglGetError));
        throw new GlUtil.GlException(sbG.toString(), b380.t(Integer.valueOf(iEglGetError)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public static void t() throws GlUtil.GlException {
        StringBuilder sb = new StringBuilder();
        n3p1.j(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        boolean z = false;
        int i = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            Integer numValueOf = Integer.valueOf(iGlGetError);
            int i2 = i + 1;
            int iB = o280.b(objArrCopyOf.length, i2);
            if (iB > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
            }
            objArrCopyOf[i] = numValueOf;
            z = true;
            i = i2;
        }
        if (z) {
            throw new GlUtil.GlException(sb.toString(), b380.l(i, objArrCopyOf));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public static void u(String str, boolean z) throws GlUtil.GlException {
        if (!z) {
            throw new GlUtil.GlException(str);
        }
    }

    public static final void v(nen0 nen0Var) {
        nen0Var.a();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public static void w() throws GlUtil.GlException {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        t();
    }

    public static final Object x(lnm lnmVar, iu30 iu30Var, en31 en31Var) {
        if (en31Var.m() && en31Var.q() && en31Var.n()) {
            return iu30Var.invoke(lnmVar);
        }
        return lnmVar.getContext().A(xhd.c) == null ? iu30Var.invoke(lnmVar) : Z(lnmVar, iu30Var, en31Var);
    }

    public static nen0 y() {
        return new nen0();
    }

    public static final boolean z(d4v d4vVar, long j) {
        if (!((pim0) d4vVar).a.N0) {
            return false;
        }
        sh80 sh80Var = (sh80) oap1.B(d4vVar).e1.d;
        if (!((pim0) sh80Var.E1).N0) {
            return false;
        }
        long jO = sh80Var.O(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jO >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jO & 4294967295L));
        long j2 = d4vVar.R0;
        float f2 = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f3 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f2) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f3;
    }
}
