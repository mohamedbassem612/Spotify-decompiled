package p;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wti1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Matrix f136p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final tti1 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final y36 o;

    public wti1(wti1 wti1Var) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        y36 y36Var = new y36(0);
        this.o = y36Var;
        this.g = new tti1(wti1Var.g, y36Var);
        this.a = new Path(wti1Var.a);
        this.b = new Path(wti1Var.b);
        this.h = wti1Var.h;
        this.i = wti1Var.i;
        this.j = wti1Var.j;
        this.k = wti1Var.k;
        this.l = wti1Var.l;
        this.m = wti1Var.m;
        String str = wti1Var.m;
        if (str != null) {
            y36Var.put(str, this);
        }
        this.n = wti1Var.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(tti1 tti1Var, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        Matrix matrix2 = tti1Var.a;
        ArrayList arrayList = tti1Var.b;
        matrix2.set(matrix);
        Matrix matrix3 = tti1Var.a;
        matrix3.preConcat(tti1Var.j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            sti1 sti1Var = (uti1) arrayList.get(i5);
            if (sti1Var instanceof tti1) {
                a((tti1) sti1Var, matrix3, canvas, i, i2);
            } else {
                if (sti1Var instanceof vti1) {
                    sti1 sti1Var2 = (vti1) sti1Var;
                    float f2 = i / this.j;
                    float f3 = i2 / this.k;
                    float fMin = Math.min(f2, f3);
                    Matrix matrix4 = this.c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                    boolean z = c;
                    i3 = i5;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f4 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f4) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.a;
                        sti1Var2.d(path);
                        Path path2 = this.b;
                        path2.reset();
                        if (sti1Var2.c()) {
                            path2.setFillType(((vti1) sti1Var2).c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            sti1 sti1Var3 = sti1Var2;
                            float f5 = sti1Var3.i;
                            if (f5 != 0.0f || sti1Var3.j != 1.0f) {
                                float f6 = sti1Var3.k;
                                float f7 = (f5 + f6) % 1.0f;
                                float f8 = (sti1Var3.j + f6) % 1.0f;
                                PathMeasure pathMeasure = this.f;
                                PathMeasure pathMeasure2 = pathMeasure;
                                if (pathMeasure == null) {
                                    PathMeasure pathMeasure3 = new PathMeasure();
                                    this.f = pathMeasure3;
                                    pathMeasure2 = pathMeasure3;
                                }
                                pathMeasure2.setPath(path, z);
                                float length = this.f.getLength();
                                float f9 = f7 * length;
                                float f10 = f8 * length;
                                path.reset();
                                PathMeasure pathMeasure4 = this.f;
                                if (f9 > f10) {
                                    pathMeasure4.getSegment(f9, length, path, true);
                                    f = 0.0f;
                                    this.f.getSegment(0.0f, f10, path, true);
                                } else {
                                    f = 0.0f;
                                    pathMeasure4.getSegment(f9, f10, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            float f11 = 255.0f;
                            if (sti1Var3.f.Y()) {
                                mgc mgcVar = sti1Var3.f;
                                if (this.e == null) {
                                    i4 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i4 = 16777215;
                                }
                                Paint paint2 = this.e;
                                if (mgcVar.F()) {
                                    Shader shaderA = mgcVar.A();
                                    shaderA.setLocalMatrix(matrix4);
                                    paint2.setShader(shaderA);
                                    paint2.setAlpha(Math.round(sti1Var3.h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int iU = mgcVar.u();
                                    float f12 = sti1Var3.h;
                                    PorterDuff.Mode mode = zti1.j;
                                    paint2.setColor((iU & i4) | (((int) (Color.alpha(iU) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(((vti1) sti1Var3).c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            } else {
                                f11 = 255.0f;
                                i4 = 16777215;
                            }
                            if (sti1Var3.d.Y()) {
                                mgc mgcVar2 = sti1Var3.d;
                                if (this.d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.d;
                                Paint.Join join = sti1Var3.m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = sti1Var3.l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(sti1Var3.n);
                                if (mgcVar2.F()) {
                                    Shader shaderA2 = mgcVar2.A();
                                    shaderA2.setLocalMatrix(matrix4);
                                    paint4.setShader(shaderA2);
                                    paint4.setAlpha(Math.round(sti1Var3.g * f11));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int iU2 = mgcVar2.u();
                                    float f13 = sti1Var3.g;
                                    PorterDuff.Mode mode2 = zti1.j;
                                    paint4.setColor((iU2 & i4) | (((int) (Color.alpha(iU2) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(sti1Var3.e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public wti1() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new y36(0);
        this.g = new tti1();
        this.a = new Path();
        this.b = new Path();
    }
}
