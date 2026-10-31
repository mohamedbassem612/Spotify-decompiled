package p;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class je50 implements fe50 {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public vc21 G;
    public int H;
    public final ljd b;
    public final vid c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public ColorFilter k;
    public long l;
    public float m;
    public float n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f52p;
    public float q;
    public long r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public int y;
    public int z;

    public je50() {
        ljd ljdVar = new ljd();
        vid vidVar = new vid();
        this.b = ljdVar;
        this.c = vidVar;
        RenderNode renderNodeE = i15.e();
        this.d = renderNodeE;
        this.e = 0L;
        renderNodeE.setClipToBounds(false);
        R(renderNodeE, 0);
        this.i = 1.0f;
        this.j = 3;
        this.l = 9205357640488583168L;
        this.m = 1.0f;
        this.n = 1.0f;
        int i = u7h.l;
        this.r = nfb.i();
        this.s = nfb.i();
        this.w = 8.0f;
        this.H = 0;
    }

    @Override // p.fe50
    public final void A(float f) {
        this.t = f;
        this.d.setRotationX(f);
    }

    @Override // p.fe50
    public final int B() {
        return this.j;
    }

    @Override // p.fe50
    public final void C(float f) {
        this.u = f;
        this.d.setRotationY(f);
    }

    @Override // p.fe50
    public final void D(float f) {
        this.q = f;
        this.d.setElevation(f);
    }

    @Override // p.fe50
    public final void E(float f) {
        this.v = f;
        this.d.setRotationZ(f);
    }

    @Override // p.fe50
    public final void F(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        Q();
    }

    @Override // p.fe50
    public final void G(vc21 vc21Var) {
        this.G = vc21Var;
        if (Build.VERSION.SDK_INT >= 31) {
            mb4.L(this.d, vc21Var);
        }
    }

    @Override // p.fe50
    public final void H(ColorFilter colorFilter) {
        this.k = colorFilter;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(colorFilter != null ? bs51.j(colorFilter) : null);
        S();
    }

    @Override // p.fe50
    public final void I(long j) {
        this.l = j;
        T();
    }

    @Override // p.fe50
    public final void J(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // p.fe50
    public final float K() {
        return this.f52p;
    }

    @Override // p.fe50
    public final float L() {
        return this.o;
    }

    @Override // p.fe50
    public final float M() {
        return this.t;
    }

    @Override // p.fe50
    public final void N(int i) {
        this.H = i;
        S();
    }

    @Override // p.fe50
    public final void O(float f) {
        this.o = f;
        this.d.setTranslationX(f);
    }

    @Override // p.fe50
    public final float P() {
        return this.q;
    }

    public final void Q() {
        boolean z = this.x;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.C) {
            this.C = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.D) {
            this.D = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void R(RenderNode renderNode, int i) {
        boolean zW = kbb.w(i, 1);
        Paint paint = this.f;
        if (zW) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (kbb.w(i, 2)) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void S() {
        if (!kbb.w(this.H, 1) && jm5.j(this.j, 3) && this.k == null && this.G == null) {
            R(this.d, this.H);
        } else {
            R(this.d, 1);
        }
    }

    public final void T() {
        long j = this.l;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.e >> 32)) / 2.0f) + this.y);
            this.d.setPivotY((Float.intBitsToFloat((int) (this.e & 4294967295L)) / 2.0f) + this.z);
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.y);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.l & 4294967295L)) + this.z);
        }
    }

    public final void U() {
        RenderNode renderNode = this.d;
        int i = this.E;
        renderNode.setPosition(i - this.y, this.F - this.z, i + ((int) Float.intBitsToFloat((int) (this.e >> 32))) + this.A, this.F + ((int) Float.intBitsToFloat((int) (this.e & 4294967295L))) + this.B);
    }

    @Override // p.fe50
    public final void a(float f) {
        this.m = f;
        this.d.setScaleX(f);
    }

    @Override // p.fe50
    public final float b() {
        return this.i;
    }

    @Override // p.fe50
    public final float c() {
        return this.m;
    }

    @Override // p.fe50
    public final void d(float f) {
        this.n = f;
        this.d.setScaleY(f);
    }

    @Override // p.fe50
    public final float e() {
        return this.n;
    }

    @Override // p.fe50
    public final vc21 f() {
        return this.G;
    }

    @Override // p.fe50
    public final void g(float f) {
        this.f52p = f;
        this.d.setTranslationY(f);
    }

    @Override // p.fe50
    public final void h(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(x74.v0(i));
        S();
    }

    @Override // p.fe50
    public final void i() {
        this.d.discardDisplayList();
    }

    @Override // p.fe50
    public final void j(int i, long j, int i2) {
        this.E = i;
        this.F = i2;
        boolean zC = Size.c(this.e, o0c.R(j));
        this.e = o0c.R(j);
        U();
        if (zC || !Offset.c(this.l, 9205357640488583168L)) {
            return;
        }
        this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.y);
        this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.z);
    }

    @Override // p.fe50
    public final int k() {
        return this.H;
    }

    @Override // p.fe50
    public final ColorFilter l() {
        return this.k;
    }

    @Override // p.fe50
    public final float m() {
        return this.u;
    }

    @Override // p.fe50
    public final void n(wat watVar, flb0 flb0Var, be50 be50Var, xul1 xul1Var) {
        vid vidVar = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        float f = this.y;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.z)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            ljd ljdVar = this.b;
            u84 u84Var = ljdVar.a;
            Canvas canvas = u84Var.a;
            u84Var.a = recordingCanvasBeginRecording;
            cab cabVar = vidVar.b;
            cabVar.A(watVar);
            cabVar.C(flb0Var);
            cabVar.B(be50Var);
            cabVar.D(this.e);
            cabVar.z(u84Var);
            if (this.y > 0.0f || this.z > 0.0f) {
                int i = (int) (jFloatToRawIntBits >> 32);
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                u84Var.h(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                xul1Var.invoke(vidVar);
                u84Var.h(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            } else {
                xul1Var.invoke(vidVar);
            }
            ljdVar.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // p.fe50
    public final boolean o() {
        return this.d.hasDisplayList();
    }

    @Override // p.fe50
    public final float p() {
        return this.v;
    }

    @Override // p.fe50
    public final long q() {
        return this.r;
    }

    @Override // p.fe50
    public final void r(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            StringBuilder sbQ = cy30.q(i, i2, "Outsets cannot be negative! Left: ", ", Top: ", ", Right: ");
            sbQ.append(i3);
            sbQ.append(", Bottom: ");
            sbQ.append(i4);
            pf80.a(sbQ.toString());
        }
        int i5 = this.y;
        if (i == i5 && i2 == this.z && i3 == this.A && i4 == this.B) {
            return;
        }
        boolean z = (i == i5 && i2 == this.z) ? false : true;
        this.y = i;
        this.z = i2;
        this.A = i3;
        this.B = i4;
        U();
        if (z) {
            T();
        }
    }

    @Override // p.fe50
    public final long s() {
        return this.s;
    }

    @Override // p.fe50
    public final void t(long j) {
        this.r = j;
        this.d.setAmbientShadowColor(z4p1.G(j));
    }

    @Override // p.fe50
    public final float u() {
        return this.w;
    }

    @Override // p.fe50
    public final void v(boolean z) {
        this.x = z;
        Q();
    }

    @Override // p.fe50
    public final void w(long j) {
        this.s = j;
        this.d.setSpotShadowColor(z4p1.G(j));
    }

    @Override // p.fe50
    public final Matrix x() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // p.fe50
    public final void y(fid fidVar) {
        Canvas canvas = v84.a;
        ((u84) fidVar).a.drawRenderNode(this.d);
    }

    @Override // p.fe50
    public final void z(float f) {
        this.w = f;
        this.d.setCameraDistance(f);
    }
}
