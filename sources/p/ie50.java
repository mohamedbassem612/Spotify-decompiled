package p;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ie50 implements fe50 {
    public static final AtomicBoolean K = new AtomicBoolean(true);
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public vc21 J;
    public final ljd b;
    public final vid c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public ColorFilter l;
    public float m;
    public boolean n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f67p;
    public float q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;
    public float w;
    public float x;
    public float y;
    public float z;

    public ie50(ha4 ha4Var, ljd ljdVar, vid vidVar) {
        this.b = ljdVar;
        this.c = vidVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", ha4Var);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (K.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                ad21.c(renderNodeCreate, ad21.a(renderNodeCreate));
                ad21.d(renderNodeCreate, ad21.b(renderNodeCreate));
            }
            zc21.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        R(0);
        this.j = 0;
        this.k = 3;
        this.m = 1.0f;
        this.o = 9205357640488583168L;
        this.f67p = 1.0f;
        this.q = 1.0f;
        long j = u7h.b;
        this.u = j;
        this.v = j;
        this.z = 8.0f;
    }

    public final void A(float f) {
        this.w = f;
        this.d.setRotationX(f);
    }

    public final int B() {
        return this.k;
    }

    public final void C(float f) {
        this.x = f;
        this.d.setRotationY(f);
    }

    public final void D(float f) {
        this.t = f;
        this.d.setElevation(f);
    }

    public final void E(float f) {
        this.y = f;
        this.d.setRotation(f);
    }

    public final void F(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        Q();
    }

    public final void G(vc21 vc21Var) {
        this.J = vc21Var;
    }

    public final void H(ColorFilter colorFilter) {
        this.l = colorFilter;
        if (colorFilter == null) {
            S();
            return;
        }
        R(1);
        RenderNode renderNode = this.d;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(colorFilter.a);
        renderNode.setLayerPaint(paint);
    }

    public final void I(long j) {
        this.o = j;
        T();
    }

    public final void J(float f) {
        this.m = f;
        this.d.setAlpha(f);
    }

    public final float K() {
        return this.s;
    }

    public final float L() {
        return this.r;
    }

    public final float M() {
        return this.w;
    }

    public final void N(int i) {
        this.j = i;
        S();
    }

    public final void O(float f) {
        this.r = f;
        this.d.setTranslationX(f);
    }

    public final float P() {
        return this.t;
    }

    public final void Q() {
        boolean z = this.A;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.F) {
            this.F = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.G) {
            this.G = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void R(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void S() {
        int i = this.j;
        if (i != 1 && this.k == 3 && this.l == null) {
            R(i);
        } else {
            R(1);
        }
    }

    public final void T() {
        long j = this.o;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.n = true;
            this.d.setPivotX((((int) (this.e >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (4294967295L & this.e)) / 2.0f) + this.C);
        } else {
            this.n = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.B);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.o & 4294967295L)) + this.C);
        }
    }

    public final void U() {
        RenderNode renderNode = this.d;
        int i = this.H;
        int i2 = i - this.B;
        int i3 = this.I;
        int i4 = i3 - this.C;
        long j = this.e;
        renderNode.setLeftTopRightBottom(i2, i4, i + ((int) (j >> 32)) + this.D, i3 + ((int) (j & 4294967295L)) + this.E);
    }

    public final void a(float f) {
        this.f67p = f;
        this.d.setScaleX(f);
    }

    public final float b() {
        return this.m;
    }

    public final float c() {
        return this.f67p;
    }

    public final void d(float f) {
        this.q = f;
        this.d.setScaleY(f);
    }

    public final float e() {
        return this.q;
    }

    public final vc21 f() {
        return this.J;
    }

    public final void g(float f) {
        this.s = f;
        this.d.setTranslationY(f);
    }

    public final void h(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(x74.w0(i)));
        S();
    }

    public final void i() {
        zc21.a(this.d);
    }

    public final void j(int i, long j, int i2) {
        this.H = i;
        this.I = i2;
        boolean zB = yr80.b(this.e, j);
        this.e = j;
        U();
        if (zB) {
            return;
        }
        if (this.n || Offset.c(this.o, 9205357640488583168L)) {
            this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.C);
        }
    }

    public final int k() {
        return this.j;
    }

    public final ColorFilter l() {
        return this.l;
    }

    public final float m() {
        return this.x;
    }

    public final void n(wat watVar, flb0 flb0Var, be50 be50Var, xul1 xul1Var) throws Throwable {
        ie50 ie50Var;
        DisplayListCanvas displayListCanvas;
        DisplayListCanvas displayListCanvas2;
        int i;
        int i2;
        long jR;
        cab cabVar;
        wat watVarR;
        flb0 flb0VarT;
        fid fidVarP;
        long jU;
        be50 be50Var2;
        DisplayListCanvas displayListCanvasStart = this.d.start(Math.max(((int) (this.e >> 32)) + this.B + this.D, (int) (this.i >> 32)), Math.max(((int) (this.e & 4294967295L)) + this.C + this.E, (int) (this.i & 4294967295L)));
        float f = this.B;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.C)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            ljd ljdVar = this.b;
            u84 u84Var = ljdVar.a;
            Canvas canvas = u84Var.a;
            u84Var.a = (Canvas) displayListCanvasStart;
            float f2 = this.B;
            vid vidVar = this.c;
            try {
                try {
                    try {
                        if (f2 <= 0.0f) {
                            try {
                                if (this.C <= 0.0f) {
                                    long jR2 = o0c.R(this.e);
                                    cab cabVar2 = vidVar.b;
                                    cab cabVar3 = vidVar.b;
                                    wat watVarR2 = cabVar2.r();
                                    flb0 flb0VarT2 = cabVar3.t();
                                    fid fidVarP2 = cabVar3.p();
                                    long jU2 = cabVar3.u();
                                    displayListCanvas2 = displayListCanvasStart;
                                    be50 be50Var3 = (be50) cabVar3.c;
                                    cabVar3.A(watVar);
                                    cabVar3.C(flb0Var);
                                    cabVar3.z(u84Var);
                                    cabVar3.D(jR2);
                                    cabVar3.c = be50Var;
                                    u84Var.q();
                                    try {
                                        xul1Var.invoke(vidVar);
                                        u84Var.i();
                                        cabVar3.A(watVarR2);
                                        cabVar3.C(flb0VarT2);
                                        cabVar3.z(fidVarP2);
                                        cabVar3.D(jU2);
                                        cabVar3.c = be50Var3;
                                    } catch (Throwable th) {
                                        u84Var.i();
                                        cab cabVar4 = vidVar.b;
                                        cabVar4.A(watVarR2);
                                        cabVar4.C(flb0VarT2);
                                        cabVar4.z(fidVarP2);
                                        cabVar4.D(jU2);
                                        cabVar4.c = be50Var3;
                                        throw th;
                                    }
                                }
                                ljdVar.a.a = canvas;
                                this.d.end(displayListCanvas2);
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                displayListCanvas2 = displayListCanvasStart;
                                ie50Var = this;
                                displayListCanvas = displayListCanvas2;
                                ie50Var.d.end(displayListCanvas);
                                throw th;
                            }
                        }
                        xul1Var.invoke(vidVar);
                        u84Var.i();
                        cabVar.A(watVarR);
                        cabVar.C(flb0VarT);
                        cabVar.z(fidVarP);
                        cabVar.D(jU);
                        cabVar.c = be50Var2;
                        u84Var.h(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
                        ljdVar.a.a = canvas;
                        this.d.end(displayListCanvas2);
                        return;
                    } catch (Throwable th3) {
                        ie50Var = this;
                        displayListCanvas = displayListCanvas2;
                        try {
                            u84Var.i();
                            cab cabVar5 = vidVar.b;
                            cabVar5.A(watVarR);
                            cabVar5.C(flb0VarT);
                            cabVar5.z(fidVarP);
                            cabVar5.D(jU);
                            cabVar5.c = be50Var2;
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            ie50Var.d.end(displayListCanvas);
                            throw th;
                        }
                    }
                    be50Var2 = (be50) cabVar.c;
                    cabVar.A(watVar);
                    cabVar.C(flb0Var);
                    cabVar.z(u84Var);
                    cabVar.D(jR);
                    cabVar.c = be50Var;
                    u84Var.q();
                } catch (Throwable th5) {
                    th = th5;
                    ie50Var = this;
                    displayListCanvas = displayListCanvas2;
                    ie50Var.d.end(displayListCanvas);
                    throw th;
                }
                displayListCanvas2 = displayListCanvasStart;
                i = (int) (jFloatToRawIntBits >> 32);
                i2 = (int) (jFloatToRawIntBits & 4294967295L);
                u84Var.h(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                jR = o0c.R(this.e);
                cab cabVar6 = vidVar.b;
                cabVar = vidVar.b;
                watVarR = cabVar6.r();
                flb0VarT = cabVar.t();
                fidVarP = cabVar.p();
                jU = cabVar.u();
            } catch (Throwable th6) {
                th = th6;
                ie50Var = this;
                displayListCanvas = displayListCanvas2;
                ie50Var.d.end(displayListCanvas);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            ie50Var = this;
            displayListCanvas = displayListCanvasStart;
        }
    }

    public final boolean o() {
        return this.d.isValid();
    }

    public final float p() {
        return this.y;
    }

    public final long q() {
        return this.u;
    }

    public final void r(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            StringBuilder sbQ = cy30.q(i, i2, "Outsets cannot be negative! Left: ", ", Top: ", ", Right: ");
            sbQ.append(i3);
            sbQ.append(", Bottom: ");
            sbQ.append(i4);
            pf80.a(sbQ.toString());
        }
        int i5 = this.B;
        if (i == i5 && i2 == this.C && i3 == this.D && i4 == this.E) {
            return;
        }
        boolean z = (i == i5 && i2 == this.C) ? false : true;
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = i4;
        U();
        if (z) {
            T();
        }
    }

    public final long s() {
        return this.v;
    }

    public final void t(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            ad21.c(this.d, z4p1.G(j));
        }
    }

    public final float u() {
        return this.z;
    }

    public final void v(boolean z) {
        this.A = z;
        Q();
    }

    public final void w(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            ad21.d(this.d, z4p1.G(j));
        }
    }

    public final Matrix x() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    public final void y(fid fidVar) {
        Canvas canvas = v84.a;
        ((u84) fidVar).a.drawRenderNode(this.d);
    }

    public final void z(float f) {
        this.z = f;
        this.d.setCameraDistance(-f);
    }

    public /* synthetic */ ie50(ha4 ha4Var) {
        this(ha4Var, new ljd(), new vid());
    }
}
