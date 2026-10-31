package p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zmm1 extends xc9 {
    public final float[] N0;
    public final RectF O0;
    public final RectF X;
    public float[] Y;
    public final Path Z;
    public final ymm1 i;
    public final Path t;

    public zmm1(zdk1 zdk1Var, ymm1 ymm1Var, vi11 vi11Var) {
        super(zdk1Var, vi11Var, ymm1Var);
        this.t = new Path();
        this.X = new RectF();
        this.Y = new float[2];
        new Path();
        new RectF();
        this.Z = new Path();
        this.N0 = new float[2];
        this.O0 = new RectF();
        this.i = ymm1Var;
        if (zdk1Var != null) {
            this.f.setColor(-16777216);
            this.f.setTextSize(npi1.c(10.0f));
            Paint paint = new Paint(1);
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            paint.setStyle(Paint.Style.STROKE);
        }
    }

    public final void A1(Canvas canvas) {
        zdk1 zdk1Var = (zdk1) this.b;
        ymm1 ymm1Var = this.i;
        ymm1Var.getClass();
        if (ymm1Var.m) {
            int iSave = canvas.save();
            RectF rectF = zdk1Var.b;
            RectF rectF2 = zdk1Var.b;
            RectF rectF3 = this.X;
            rectF3.set(rectF);
            this.c.getClass();
            rectF3.inset(0.0f, -1.0f);
            canvas.clipRect(rectF3);
            float[] fArrX1 = x1();
            Paint paint = this.e;
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            paint.setPathEffect(null);
            Path path = this.t;
            path.reset();
            for (int i = 0; i < fArrX1.length; i += 2) {
                int i2 = i + 1;
                path.moveTo(rectF2.left, fArrX1[i2]);
                path.lineTo(rectF2.right, fArrX1[i2]);
                canvas.drawPath(path, paint);
                path.reset();
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final void B1(Canvas canvas) {
        int i;
        zdk1 zdk1Var = (zdk1) this.b;
        ArrayList arrayList = this.i.f163p;
        if (arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.N0;
        int i2 = 0;
        float f = 0.0f;
        fArr[0] = 0.0f;
        int i3 = 1;
        fArr[1] = 0.0f;
        Path path = this.Z;
        path.reset();
        while (i2 < arrayList.size()) {
            cgc0 cgc0Var = (cgc0) arrayList.get(i2);
            cgc0Var.getClass();
            int iSave = canvas.save();
            RectF rectF = zdk1Var.b;
            RectF rectF2 = zdk1Var.b;
            RectF rectF3 = this.O0;
            rectF3.set(rectF);
            rectF3.inset(f, -cgc0Var.f);
            canvas.clipRect(rectF3);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.h;
            paint.setStyle(style);
            paint.setColor(cgc0Var.g);
            paint.setStrokeWidth(cgc0Var.f);
            paint.setPathEffect(null);
            fArr[i3] = cgc0Var.e;
            this.d.I(fArr);
            path.moveTo(rectF2.left, fArr[i3]);
            path.lineTo(rectF2.right, fArr[i3]);
            canvas.drawPath(path, paint);
            path.reset();
            String str = cgc0Var.i;
            if (str == null || str.equals("")) {
                i = i3;
            } else {
                paint.setStyle(cgc0Var.h);
                paint.setPathEffect(null);
                paint.setColor(cgc0Var.d);
                paint.setTypeface(null);
                paint.setStrokeWidth(0.5f);
                paint.setTextSize(cgc0Var.c);
                float fA = npi1.a(paint, str);
                float fC = npi1.c(4.0f) + cgc0Var.a;
                int i4 = i3;
                float f2 = cgc0Var.f + fA + cgc0Var.b;
                int i5 = cgc0Var.j;
                if (i5 == 3) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                    canvas.drawText(str, rectF2.right - fC, (fArr[i4] - f2) + fA, paint);
                } else if (i5 == 4) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                    canvas.drawText(str, rectF2.right - fC, fArr[i4] + f2, paint);
                } else {
                    i = i4;
                    if (i5 == i) {
                        paint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(str, rectF2.left + fC, (fArr[i] - f2) + fA, paint);
                    } else {
                        paint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(str, rectF2.left + fC, fArr[i] + f2, paint);
                    }
                }
                i = i4;
            }
            canvas.restoreToCount(iSave);
            i2++;
            i3 = i;
            f = 0.0f;
        }
    }

    public final float[] x1() {
        float[] fArr = this.Y;
        int length = fArr.length;
        ymm1 ymm1Var = this.i;
        int i = ymm1Var.g * 2;
        if (length != i) {
            fArr = new float[i];
            this.Y = fArr;
        }
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            fArr[i2 + 1] = ymm1Var.f[i2 / 2];
        }
        this.d.I(fArr);
        return fArr;
    }

    public final void y1(Canvas canvas) {
        float f;
        String strA;
        ig70 ig70Var;
        zdk1 zdk1Var = (zdk1) this.b;
        ymm1 ymm1Var = this.i;
        ymm1Var.getClass();
        if (ymm1Var.o) {
            float[] fArrX1 = x1();
            Paint paint = this.f;
            paint.setTypeface(null);
            paint.setTextSize(ymm1Var.c);
            paint.setColor(ymm1Var.d);
            float f2 = ymm1Var.a;
            float fA = (npi1.a(paint, "A") / 2.5f) + ymm1Var.b;
            if (ymm1Var.x == 1) {
                paint.setTextAlign(Paint.Align.RIGHT);
                f = zdk1Var.b.left - f2;
            } else {
                paint.setTextAlign(Paint.Align.LEFT);
                f = zdk1Var.b.right + f2;
            }
            int i = ymm1Var.g;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 < 0 || i2 >= ymm1Var.f.length) {
                    strA = "";
                } else {
                    ig70 ig70Var2 = ymm1Var.e;
                    if (ig70Var2 == null || ((ig70Var2 instanceof lir) && ((lir) ig70Var2).b != ymm1Var.h)) {
                        ig70Var = ig70Var2;
                        ig70Var = ig70Var2;
                        int i3 = ymm1Var.h;
                        lir lirVar = new lir();
                        lirVar.b = i3;
                        StringBuffer stringBuffer = new StringBuffer();
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (i4 == 0) {
                                stringBuffer.append(".");
                            }
                            stringBuffer.append("0");
                        }
                        lirVar.a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
                        ymm1Var.e = lirVar;
                        ig70Var = lirVar;
                    }
                    ig70Var = ig70Var2;
                    ig70Var = ig70Var2;
                    ig70Var = ig70Var2;
                    strA = ig70Var.a(ymm1Var.f[i2], ymm1Var);
                }
                canvas.drawText(strA, f, fArrX1[(i2 * 2) + 1] + fA, paint);
            }
        }
    }

    public final void z1(Canvas canvas) {
        ymm1 ymm1Var = this.i;
        ymm1Var.getClass();
        if (ymm1Var.n) {
            Paint paint = this.g;
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            int i = ymm1Var.x;
            zdk1 zdk1Var = (zdk1) this.b;
            if (i == 1) {
                RectF rectF = zdk1Var.b;
                float f = rectF.left;
                canvas.drawLine(f, rectF.top, f, rectF.bottom, paint);
            } else {
                RectF rectF2 = zdk1Var.b;
                float f2 = rectF2.right;
                canvas.drawLine(f2, rectF2.top, f2, rectF2.bottom, paint);
            }
        }
    }
}
