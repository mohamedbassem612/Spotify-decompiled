package p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class xjm1 extends xc9 {
    public final RectF N0;
    public final float[] O0;
    public final Path P0;
    public float[] X;
    public final RectF Y;
    public final float[] Z;
    public final wjm1 i;
    public final Path t;

    public xjm1(zdk1 zdk1Var, wjm1 wjm1Var, vi11 vi11Var) {
        super(zdk1Var, vi11Var, wjm1Var);
        this.t = new Path();
        this.X = new float[2];
        this.Y = new RectF();
        this.Z = new float[2];
        this.N0 = new RectF();
        this.O0 = new float[4];
        this.P0 = new Path();
        this.i = wjm1Var;
        this.f.setColor(-16777216);
        this.f.setTextAlign(Paint.Align.CENTER);
        this.f.setTextSize(npi1.c(10.0f));
    }

    @Override // p.xc9
    public final void v1(float f, float f2) {
        zdk1 zdk1Var = (zdk1) this.b;
        RectF rectF = zdk1Var.b;
        RectF rectF2 = zdk1Var.b;
        if (rectF.width() > 10.0f) {
            float f3 = zdk1Var.g;
            float f4 = zdk1Var.e;
            if (f3 > f4 || f4 > 1.0f) {
                float f5 = rectF2.left;
                float f6 = rectF2.top;
                vi11 vi11Var = this.d;
                vi11Var.getClass();
                ofp0 ofp0Var = cuf0.d;
                cuf0 cuf0Var = (cuf0) ofp0Var.b();
                cuf0Var.b = 0.0d;
                cuf0Var.c = 0.0d;
                vi11Var.x(f5, f6, cuf0Var);
                float f7 = rectF2.right;
                float f8 = rectF2.top;
                cuf0 cuf0Var2 = (cuf0) ofp0Var.b();
                cuf0Var2.b = 0.0d;
                cuf0Var2.c = 0.0d;
                vi11Var.x(f7, f8, cuf0Var2);
                f = (float) cuf0Var.b;
                f2 = (float) cuf0Var2.b;
                cuf0.b(cuf0Var);
                cuf0.b(cuf0Var2);
            }
        }
        w1(f, f2);
    }

    @Override // p.xc9
    public final void w1(float f, float f2) {
        super.w1(f, f2);
        wjm1 wjm1Var = this.i;
        String strB = wjm1Var.b();
        Paint paint = this.f;
        paint.setTypeface(null);
        paint.setTextSize(wjm1Var.c);
        zc10 zc10VarB = npi1.b(paint, strB);
        float f3 = zc10VarB.b;
        float fA = npi1.a(paint, "Q");
        float fAbs = Math.abs(((float) Math.sin(0.0d)) * fA) + Math.abs(((float) Math.cos(0.0d)) * f3);
        float fAbs2 = Math.abs(((float) Math.cos(0.0d)) * fA) + Math.abs(((float) Math.sin(0.0d)) * f3);
        ofp0 ofp0Var = zc10.d;
        zc10 zc10Var = (zc10) ofp0Var.b();
        zc10Var.b = fAbs;
        zc10Var.c = fAbs2;
        Math.round(f3);
        Math.round(fA);
        Math.round(zc10Var.b);
        wjm1Var.x = Math.round(zc10Var.c);
        ofp0Var.c(zc10Var);
        ofp0Var.c(zc10VarB);
    }

    public final void x1(Canvas canvas, float f, duf0 duf0Var) {
        ig70 ig70Var;
        wjm1 wjm1Var = this.i;
        wjm1Var.getClass();
        int i = wjm1Var.g * 2;
        float[] fArr = new float[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 2) {
            fArr[i3] = wjm1Var.f[i3 / 2];
        }
        this.d.I(fArr);
        int i4 = 0;
        while (i4 < i) {
            float f2 = fArr[i4];
            zdk1 zdk1Var = (zdk1) this.b;
            if (zdk1Var.a(f2) && zdk1Var.b(f2)) {
                ig70 ig70Var2 = wjm1Var.e;
                if (ig70Var2 == null || ((ig70Var2 instanceof lir) && ((lir) ig70Var2).b != wjm1Var.h)) {
                    ig70Var = ig70Var2;
                    ig70Var = ig70Var2;
                    int i5 = wjm1Var.h;
                    lir lirVar = new lir();
                    lirVar.b = i5;
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i6 = i2; i6 < i5; i6++) {
                        if (i6 == 0) {
                            stringBuffer.append(".");
                        }
                        stringBuffer.append("0");
                    }
                    lirVar.a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
                    wjm1Var.e = lirVar;
                    ig70Var = lirVar;
                }
                ig70Var = ig70Var2;
                ig70Var = ig70Var2;
                ig70Var = ig70Var2;
                String strA = ig70Var.a(wjm1Var.f[i4 / 2], wjm1Var);
                Paint.FontMetrics fontMetrics = npi1.i;
                Paint paint = this.f;
                float fontMetrics2 = paint.getFontMetrics(fontMetrics);
                int length = strA.length();
                Rect rect = npi1.h;
                paint.getTextBounds(strA, i2, length, rect);
                float fWidth = 0.0f - rect.left;
                float f3 = (-fontMetrics.ascent) + 0.0f;
                Paint.Align textAlign = paint.getTextAlign();
                paint.setTextAlign(Paint.Align.LEFT);
                if (duf0Var.b != 0.0f || duf0Var.c != 0.0f) {
                    fWidth -= rect.width() * duf0Var.b;
                    f3 -= fontMetrics2 * duf0Var.c;
                }
                canvas.drawText(strA, fWidth + f2, f3 + f, paint);
                paint.setTextAlign(textAlign);
            }
            i4 += 2;
            i2 = 0;
        }
    }

    public void y1(Canvas canvas) {
        Canvas canvas2;
        zdk1 zdk1Var = (zdk1) this.b;
        wjm1 wjm1Var = this.i;
        if (wjm1Var.n) {
            Paint paint = this.g;
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            paint.setPathEffect(null);
            int i = wjm1Var.y;
            if (i == 1 || i == 4 || i == 3) {
                RectF rectF = zdk1Var.b;
                float f = rectF.left;
                float f2 = rectF.top;
                canvas2 = canvas;
                canvas2.drawLine(f, f2, rectF.right, f2, paint);
            } else {
                canvas2 = canvas;
            }
            int i2 = wjm1Var.y;
            if (i2 == 2 || i2 == 5 || i2 == 3) {
                RectF rectF2 = zdk1Var.b;
                float f3 = rectF2.left;
                float f4 = rectF2.bottom;
                canvas2.drawLine(f3, f4, rectF2.right, f4, paint);
            }
        }
    }
}
