package p;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class xmm0 {
    public int[] a;
    public int b;
    public Serializable c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;

    /* JADX WARN: Multi-variable type inference failed */
    public xmm0(MotionLayout motionLayout) {
        this.m = motionLayout;
        this.l = new Rect();
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.i = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.j = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(motionLayout.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.e = new float[8];
        Paint paint5 = new Paint();
        this.k = paint5;
        paint5.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        this.d = new float[100];
        this.a = new int[50];
    }

    public void a(liv livVar, x09 x09Var) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            eg.m("Unable to get EGL14 display");
            return;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize((EGLDisplay) this.f, iArr, 0, iArr, 1)) {
            this.f = EGL14.EGL_NO_DISPLAY;
            eg.m("Unable to initialize EGL14");
            return;
        }
        if (x09Var != null) {
            x09Var.b = iArr[0] + "." + iArr[1];
        }
        int i = livVar.a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) this.f, new int[]{12324, i, 12323, i, 12322, i, 12321, livVar.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, livVar.a() ? 64 : 4, 12610, livVar.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            eg.m("Unable to find a suitable EGLConfig");
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.f, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, livVar.a() ? 3 : 2, 12344}, 0);
        hy30.a("eglCreateContext");
        this.h = eGLConfig;
        this.g = eGLContextEglCreateContext;
        EGL14.eglQueryContext((EGLDisplay) this.f, eGLContextEglCreateContext, 12440, new int[1], 0);
    }

    public p19 b(Surface surface) {
        try {
            try {
                EGLDisplay eGLDisplay = (EGLDisplay) this.f;
                EGLConfig eGLConfig = (EGLConfig) this.h;
                Objects.requireNonNull(eGLConfig);
                EGLSurface eGLSurfaceH = hy30.h(eGLDisplay, eGLConfig, surface, this.a);
                EGLDisplay eGLDisplay2 = (EGLDisplay) this.f;
                int[] iArr = new int[1];
                EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceH, 12375, iArr, 0);
                int i = iArr[0];
                int[] iArr2 = new int[1];
                EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceH, 12374, iArr2, 0);
                Size size = new Size(i, iArr2[0]);
                return new p19(eGLSurfaceH, size.getWidth(), size.getHeight());
            } catch (IllegalArgumentException | IllegalStateException e) {
                e = e;
                e.getMessage();
                j2h1.N("OpenGlRenderer");
                return null;
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
            e.getMessage();
            j2h1.N("OpenGlRenderer");
            return null;
        }
    }

    public void c() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.f;
        EGLConfig eGLConfig = (EGLConfig) this.h;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = hy30.a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        hy30.a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            this.i = eGLSurfaceEglCreatePbufferSurface;
        } else {
            eg.m("surface was null");
        }
    }

    public void d(Canvas canvas, int i, int i2, a aVar) {
        Canvas canvas2;
        int width;
        int height;
        float f;
        float f2;
        int i3;
        char c;
        boolean z;
        Paint paint = (Paint) this.i;
        int[] iArr = this.a;
        boolean z2 = false;
        if (i == 4) {
            int i4 = 0;
            boolean z3 = false;
            boolean z4 = false;
            while (i4 < this.b) {
                int i5 = iArr[i4];
                if (i5 == 1) {
                    z = z3;
                    z = true;
                }
                if (i5 == 0) {
                    z4 = true;
                }
                i4++;
                z3 = z;
                z4 = z4;
            }
            if (z3) {
                float[] fArr = (float[]) this.c;
                canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
            }
            if (z4) {
                e(canvas);
            }
        }
        if (i == 2) {
            float[] fArr2 = (float[]) this.c;
            float f3 = fArr2[0];
            float f4 = fArr2[1];
            float f5 = fArr2[fArr2.length - 2];
            float f6 = fArr2[fArr2.length - 1];
            canvas2 = canvas;
            canvas2.drawLine(f3, f4, f5, f6, paint);
        } else {
            canvas2 = canvas;
        }
        char c2 = 3;
        if (i == 3) {
            e(canvas);
        }
        canvas2.drawLines((float[]) this.c, (Paint) this.g);
        Paint paint2 = (Paint) this.h;
        Paint paint3 = (Paint) this.k;
        View view = aVar.b;
        if (view != null) {
            width = view.getWidth();
            height = aVar.b.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        int i6 = 1;
        while (i6 < i2 - 1) {
            if (i == 4 && iArr[i6 - 1] == 0) {
                c = c2;
                i6 = i6;
            } else {
                float[] fArr3 = (float[]) this.d;
                int i7 = i6 * 2;
                float f7 = fArr3[i7];
                float f8 = fArr3[i7 + 1];
                ((Path) this.f).reset();
                ((Path) this.f).moveTo(f7, f8 + 10.0f);
                ((Path) this.f).lineTo(f7 + 10.0f, f8);
                ((Path) this.f).lineTo(f7, f8 - 10.0f);
                ((Path) this.f).lineTo(f7 - 10.0f, f8);
                ((Path) this.f).close();
                int i8 = i6 - 1;
                if (i == 4) {
                    int i9 = iArr[i8];
                    if (i9 == 1) {
                        f2 = 0.0f;
                        g(canvas2, f7 - 0.0f, f8 - 0.0f);
                    } else {
                        f2 = 0.0f;
                        if (i9 == 0) {
                            f(canvas2, f7 - 0.0f, f8 - 0.0f);
                        } else {
                            i3 = 2;
                            if (i9 == 2) {
                                f = f8;
                                h(canvas2, f7 - 0.0f, f8 - 0.0f, width, height);
                            } else {
                                f = f8;
                            }
                        }
                        canvas2.drawPath((Path) this.f, paint3);
                    }
                    f = f8;
                    i3 = 2;
                    canvas2.drawPath((Path) this.f, paint3);
                } else {
                    i6 = i6;
                    f = f8;
                    f2 = 0.0f;
                    i3 = 2;
                }
                if (i == i3) {
                    g(canvas2, f7 - f2, f - f2);
                }
                c = 3;
                if (i == 3) {
                    f(canvas2, f7 - f2, f - f2);
                }
                if (i == 6) {
                    h(canvas2, f7 - f2, f - f2, width, height);
                }
                canvas2.drawPath((Path) this.f, paint3);
            }
            i6++;
            c2 = c;
            z2 = z2;
        }
        boolean z5 = z2;
        float[] fArr4 = (float[]) this.c;
        if (fArr4.length > 1) {
            canvas2.drawCircle(fArr4[z5 ? 1 : 0], fArr4[1], 8.0f, paint2);
            float[] fArr5 = (float[]) this.c;
            canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint2);
        }
    }

    public void e(Canvas canvas) {
        float[] fArr = (float[]) this.c;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[fArr.length - 2];
        float f4 = fArr[fArr.length - 1];
        float fMin = Math.min(f, f3);
        float fMax = Math.max(f2, f4);
        float fMax2 = Math.max(f, f3);
        float fMax3 = Math.max(f2, f4);
        Paint paint = (Paint) this.i;
        canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
        canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), paint);
    }

    public void f(Canvas canvas, float f, float f2) {
        float[] fArr = (float[]) this.c;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float fMin = Math.min(f3, f5);
        float fMax = Math.max(f4, f6);
        float fMin2 = f - Math.min(f3, f5);
        float fMax2 = Math.max(f4, f6) - f2;
        String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d)) / 100.0f);
        Paint paint = (Paint) this.j;
        int length = str.length();
        Rect rect = (Rect) this.l;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f2 - 20.0f, paint);
        float fMin3 = Math.min(f3, f5);
        Paint paint2 = (Paint) this.i;
        canvas.drawLine(f, f2, fMin3, f2, paint2);
        String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str2, 0, str2.length(), rect);
        canvas.drawText(str2, f + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f, f2, f, Math.max(f4, f6), paint2);
    }

    public void g(Canvas canvas, float f, float f2) {
        float[] fArr = (float[]) this.c;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float fHypot = (float) Math.hypot(f3 - f5, f4 - f6);
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        float f9 = (((f2 - f4) * f8) + ((f - f3) * f7)) / (fHypot * fHypot);
        float f10 = (f7 * f9) + f3;
        float f11 = (f9 * f8) + f4;
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f10, f11);
        float fHypot2 = (float) Math.hypot(f10 - f, f11 - f2);
        String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
        Paint paint = (Paint) this.j;
        int length = str.length();
        Rect rect = (Rect) this.l;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (rect.width() / 2), -20.0f, paint);
        canvas.drawLine(f, f2, f10, f11, (Paint) this.i);
    }

    public void h(Canvas canvas, float f, float f2, int i, int i2) {
        StringBuilder sb = new StringBuilder("");
        ConstraintLayout constraintLayout = (MotionLayout) this.m;
        sb.append(((int) (((double) (((f - (i / 2)) * 100.0f) / (constraintLayout.getWidth() - i))) + 0.5d)) / 100.0f);
        String string = sb.toString();
        Paint paint = (Paint) this.j;
        int length = string.length();
        Rect rect = (Rect) this.l;
        paint.getTextBounds(string, 0, length, rect);
        canvas.drawText(string, ((f / 2.0f) - (rect.width() / 2)) + 0.0f, f2 - 20.0f, paint);
        float fMin = Math.min(0.0f, 1.0f);
        Paint paint2 = (Paint) this.i;
        canvas.drawLine(f, f2, fMin, f2, paint2);
        String str = "" + (((int) (((double) (((f2 - (i2 / 2)) * 100.0f) / (constraintLayout.getHeight() - i2))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, f + 5.0f, 0.0f - ((f2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), paint2);
    }

    public nmr0 i(liv livVar) {
        hy30.d((AtomicBoolean) this.c, false);
        try {
            a(livVar, null);
            c();
            k((EGLSurface) this.i);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString((EGLDisplay) this.f, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new nmr0(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e) {
            e.getMessage();
            j2h1.N("OpenGlRenderer");
            return new nmr0("", "");
        } finally {
            m();
        }
    }

    public y09 j(liv livVar) {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        hy30.d(atomicBoolean, false);
        x09 x09Var = new x09();
        x09Var.a = "0.0";
        x09Var.b = "0.0";
        x09Var.c = "";
        x09Var.d = "";
        try {
            if (livVar.a()) {
                nmr0 nmr0VarI = i(livVar);
                String str = (String) nmr0VarI.a;
                str.getClass();
                String str2 = (String) nmr0VarI.b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    j2h1.M("OpenGlRenderer");
                    livVar = liv.d;
                }
                int[] iArr = hy30.a;
                if (livVar.a == 3) {
                    if (str2.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                        iArr = hy30.b;
                    } else {
                        j2h1.M("GLUtils");
                    }
                }
                this.a = iArr;
                x09Var.c = str;
                x09Var.d = str2;
            }
            a(livVar, x09Var);
            c();
            k((EGLSurface) this.i);
            x09Var.a = hy30.i();
            this.k = hy30.f(livVar);
            int iG = hy30.g();
            this.b = iG;
            p(iG);
            this.e = Thread.currentThread();
            atomicBoolean.set(true);
            if ("".isEmpty()) {
                return new y09(x09Var.a, x09Var.b, x09Var.c, x09Var.d);
            }
            eg.m("Missing required properties:".concat(""));
            return null;
        } catch (IllegalArgumentException e) {
            e = e;
            m();
            throw e;
        } catch (IllegalStateException e2) {
            e = e2;
            m();
            throw e;
        }
    }

    public void k(EGLSurface eGLSurface) {
        ((EGLDisplay) this.f).getClass();
        ((EGLContext) this.g).getClass();
        if (EGL14.eglMakeCurrent((EGLDisplay) this.f, eGLSurface, eGLSurface, (EGLContext) this.g)) {
            return;
        }
        eg.m("eglMakeCurrent failed");
    }

    public void l(Surface surface) {
        hy30.d((AtomicBoolean) this.c, true);
        hy30.c((Thread) this.e);
        HashMap map = (HashMap) this.d;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, hy30.j);
    }

    public void m() {
        HashMap map = (HashMap) this.d;
        Iterator it = ((Map) this.k).values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((fy30) it.next()).a);
        }
        this.k = Collections.EMPTY_MAP;
        this.l = null;
        if (!Objects.equals((EGLDisplay) this.f, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (p19 p19Var : map.values()) {
                if (!Objects.equals(p19Var.a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.f, p19Var.a)) {
                    try {
                        hy30.a("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        e.toString();
                        j2h1.q("GLUtils");
                    }
                }
            }
            map.clear();
            if (!Objects.equals((EGLSurface) this.i, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.f, (EGLSurface) this.i);
                this.i = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.g, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.f, (EGLContext) this.g);
                this.g = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.f);
            this.f = EGL14.EGL_NO_DISPLAY;
        }
        this.h = null;
        this.b = -1;
        this.m = ey30.a;
        this.j = null;
        this.e = null;
    }

    public void n(Surface surface, boolean z) {
        if (((Surface) this.j) == surface) {
            this.j = null;
            k((EGLSurface) this.i);
        }
        HashMap map = (HashMap) this.d;
        p19 p19Var = z ? (p19) map.remove(surface) : (p19) map.put(surface, hy30.j);
        if (p19Var == null || p19Var == hy30.j) {
            return;
        }
        try {
            EGL14.eglDestroySurface((EGLDisplay) this.f, p19Var.a);
        } catch (RuntimeException e) {
            e.getMessage();
            j2h1.N("OpenGlRenderer");
        }
    }

    public void o(long j, float[] fArr, Surface surface) {
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
        int i = p19VarB.c;
        int i2 = p19VarB.b;
        EGLSurface eGLSurface = p19VarB.a;
        if (surface != ((Surface) this.j)) {
            k(eGLSurface);
            this.j = surface;
            GLES20.glViewport(0, 0, i2, i);
            GLES20.glScissor(0, 0, i2, i);
        }
        fy30 fy30Var = (fy30) this.l;
        fy30Var.getClass();
        if (fy30Var instanceof gy30) {
            GLES20.glUniformMatrix4fv(((gy30) fy30Var).f, 1, false, fArr, 0);
            hy30.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        hy30.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f, eGLSurface)) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        j2h1.M("OpenGlRenderer");
        n(surface, false);
    }

    public void p(int i) {
        fy30 fy30Var = (fy30) ((Map) this.k).get((ey30) this.m);
        if (fy30Var == null) {
            bhn0.y((ey30) this.m, "Unable to configure program for input format: ");
            return;
        }
        if (((fy30) this.l) != fy30Var) {
            this.l = fy30Var;
            fy30Var.b();
            Objects.toString((ey30) this.m);
            Objects.toString((fy30) this.l);
        }
        GLES20.glActiveTexture(33984);
        hy30.b("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        hy30.b("glBindTexture");
    }

    public xmm0() {
        this.c = new AtomicBoolean(false);
        this.d = new HashMap();
        this.f = EGL14.EGL_NO_DISPLAY;
        this.g = EGL14.EGL_NO_CONTEXT;
        this.a = hy30.a;
        this.i = EGL14.EGL_NO_SURFACE;
        this.k = Collections.EMPTY_MAP;
        this.l = null;
        this.m = ey30.a;
        this.b = -1;
    }
}
