package p;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class le50 implements fe50 {
    public static final ke50 I = new ke50();
    public float A;
    public float B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public vc21 H;
    public final l7v b;
    public final ljd c;
    public final sbk1 d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public ColorFilter o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f86p;
    public float q;
    public boolean r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public long z;

    public le50(l7v l7vVar) {
        ljd ljdVar = new ljd();
        vid vidVar = new vid();
        this.b = l7vVar;
        this.c = ljdVar;
        sbk1 sbk1Var = new sbk1(l7vVar, ljdVar, vidVar);
        this.d = sbk1Var;
        this.e = l7vVar.getResources();
        this.f = new Rect();
        l7vVar.addView(sbk1Var);
        sbk1Var.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.f86p = 0;
        this.q = 1.0f;
        this.s = 9205357640488583168L;
        this.t = 1.0f;
        this.u = 1.0f;
        long j = u7h.b;
        this.y = j;
        this.z = j;
    }

    public final void A(float f) {
        this.A = f;
        this.d.setRotationX(f);
    }

    public final int B() {
        return this.n;
    }

    public final void C(float f) {
        this.B = f;
        this.d.setRotationY(f);
    }

    public final void D(float f) {
        this.x = f;
        this.d.setElevation(f);
    }

    public final void E(float f) {
        this.C = f;
        this.d.setRotation(f);
    }

    public final void F(Outline outline, long j) {
        sbk1 sbk1Var = this.d;
        sbk1Var.e = outline;
        sbk1Var.invalidateOutline();
        if ((this.m || sbk1Var.getClipToOutline()) && outline != null) {
            sbk1Var.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    public final void G(vc21 vc21Var) {
        this.H = vc21Var;
        if (Build.VERSION.SDK_INT >= 31) {
            mb4.M(this.d, vc21Var);
        }
    }

    public final void H(ColorFilter colorFilter) {
        this.o = colorFilter;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(colorFilter != null ? colorFilter.a : null);
        S();
    }

    public final void I(long j) {
        this.s = j;
        this.r = (j & 9223372034707292159L) == 9205357640488583168L;
        T();
    }

    public final void J(float f) {
        this.q = f;
        this.d.setAlpha(f);
    }

    public final float K() {
        return this.w;
    }

    public final float L() {
        return this.v;
    }

    public final float M() {
        return this.A;
    }

    public final void N(int i) {
        this.f86p = i;
        S();
    }

    public final void O(float f) {
        this.v = f;
        this.d.setTranslationX(f);
    }

    public final float P() {
        return this.x;
    }

    public final void Q(int i) {
        Paint paint = this.g;
        sbk1 sbk1Var = this.d;
        boolean z = true;
        if (i == 1) {
            sbk1Var.setLayerType(2, paint);
        } else if (i == 2) {
            sbk1Var.setLayerType(0, paint);
            z = false;
        } else {
            sbk1Var.setLayerType(0, paint);
        }
        sbk1Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    public final void R() {
        boolean z = this.m;
        sbk1 sbk1Var = this.d;
        if (z || sbk1Var.getClipToOutline()) {
            this.k = true;
        }
        int i = this.h;
        int i2 = i - this.D;
        int i3 = this.i;
        int i4 = i3 - this.E;
        long j = this.j;
        sbk1Var.layout(i2, i4, i + ((int) (j >> 32)) + this.F, i3 + ((int) (j & 4294967295L)) + this.G);
    }

    public final void S() {
        int i = this.f86p;
        if (i != 1 && this.n == 3 && this.o == null) {
            Q(i);
        } else {
            Q(1);
        }
    }

    public final void T() {
        boolean z = this.r;
        sbk1 sbk1Var = this.d;
        if (z || Offset.c(this.s, 9205357640488583168L)) {
            sbk1Var.setPivotX((((int) (this.j >> 32)) / 2.0f) + this.D);
            sbk1Var.setPivotY((((int) (this.j & 4294967295L)) / 2.0f) + this.E);
        } else {
            sbk1Var.setPivotX(Float.intBitsToFloat((int) (this.s >> 32)) + this.D);
            sbk1Var.setPivotY(Float.intBitsToFloat((int) (this.s & 4294967295L)) + this.E);
        }
    }

    public final void a(float f) {
        this.t = f;
        this.d.setScaleX(f);
    }

    public final float b() {
        return this.q;
    }

    public final float c() {
        return this.t;
    }

    public final void d(float f) {
        this.u = f;
        this.d.setScaleY(f);
    }

    public final float e() {
        return this.u;
    }

    public final vc21 f() {
        return this.H;
    }

    public final void g(float f) {
        this.w = f;
        this.d.setTranslationY(f);
    }

    public final void h(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(x74.w0(i)));
        S();
    }

    public final void i() {
        this.b.removeViewInLayout(this.d);
    }

    public final void j(int i, long j, int i2) {
        if (!yr80.b(this.j, j)) {
            this.h = i;
            this.i = i2;
            this.j = j;
            R();
            return;
        }
        int i3 = this.h;
        sbk1 sbk1Var = this.d;
        if (i3 != i) {
            sbk1Var.offsetLeftAndRight(i - i3);
        }
        int i4 = this.i;
        if (i4 != i2) {
            sbk1Var.offsetTopAndBottom(i2 - i4);
        }
        this.h = i;
        this.i = i2;
    }

    public final int k() {
        return this.f86p;
    }

    public final ColorFilter l() {
        return this.o;
    }

    public final float m() {
        return this.B;
    }

    public final void n(wat watVar, flb0 flb0Var, be50 be50Var, xul1 xul1Var) {
        sbk1 sbk1Var = this.d;
        ViewParent parent = sbk1Var.getParent();
        l7v l7vVar = this.b;
        if (parent == null) {
            l7vVar.addView(sbk1Var);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.D)) << 32) | (((long) Float.floatToRawIntBits(this.E)) & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        sbk1Var.g = watVar;
        sbk1Var.h = flb0Var;
        sbk1Var.i = xul1Var;
        sbk1Var.t = be50Var;
        sbk1Var.N0 = fIntBitsToFloat;
        sbk1Var.O0 = fIntBitsToFloat2;
        if (sbk1Var.isAttachedToWindow()) {
            sbk1Var.setVisibility(4);
            sbk1Var.setVisibility(0);
            try {
                u84 u84Var = this.c.a;
                ke50 ke50Var = I;
                Canvas canvas = u84Var.a;
                u84Var.a = ke50Var;
                l7vVar.a(u84Var, sbk1Var, sbk1Var.getDrawingTime());
                u84Var.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    public final float p() {
        return this.C;
    }

    public final long q() {
        return this.y;
    }

    public final void r(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            StringBuilder sbQ = cy30.q(i, i2, "Outsets cannot be negative! Left: ", ", Top: ", ", Right: ");
            sbQ.append(i3);
            sbQ.append(", Bottom: ");
            sbQ.append(i4);
            pf80.a(sbQ.toString());
        }
        int i5 = this.D;
        if (i == i5 && i2 == this.E && i3 == this.F && i4 == this.G) {
            return;
        }
        boolean z = (i == i5 && i2 == this.E) ? false : true;
        this.D = i;
        this.E = i2;
        this.F = i3;
        this.G = i4;
        R();
        if (z) {
            T();
        }
    }

    public final long s() {
        return this.z;
    }

    public final void t(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.y = j;
            mmg1.e(this.d, z4p1.G(j));
        }
    }

    public final float u() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    public final void v(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    public final void w(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.z = j;
            mmg1.f(this.d, z4p1.G(j));
        }
    }

    public final Matrix x() {
        return this.d.getMatrix();
    }

    public final void y(fid fidVar) {
        Rect rect;
        boolean z = this.k;
        sbk1 sbk1Var = this.d;
        if (z) {
            if ((this.m || sbk1Var.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = sbk1Var.getWidth();
                rect.bottom = sbk1Var.getHeight();
            } else {
                rect = null;
            }
            sbk1Var.setClipBounds(rect);
        }
        Canvas canvas = v84.a;
        if (((u84) fidVar).a.isHardwareAccelerated()) {
            this.b.a(fidVar, sbk1Var, sbk1Var.getDrawingTime());
        }
    }

    public final void z(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }
}
