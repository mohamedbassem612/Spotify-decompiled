package p;

import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class xc9 extends k9 {
    public final wc9 c;
    public final vi11 d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;

    public xc9(zdk1 zdk1Var, vi11 vi11Var, wc9 wc9Var) {
        super(zdk1Var, (byte) 12);
        this.d = vi11Var;
        this.c = wc9Var;
        if (zdk1Var != null) {
            this.f = new Paint(1);
            Paint paint = new Paint();
            this.e = paint;
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setAlpha(90);
            Paint paint2 = new Paint();
            this.g = paint2;
            paint2.setColor(-16777216);
            paint2.setStrokeWidth(1.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint(1);
            this.h = paint3;
            paint3.setStyle(style);
        }
    }

    public void v1(float f, float f2) {
        zdk1 zdk1Var = (zdk1) this.b;
        if (zdk1Var != null) {
            RectF rectF = zdk1Var.b;
            if (rectF.width() > 10.0f && zdk1Var.h > 1.0f) {
                float f3 = rectF.left;
                float f4 = rectF.top;
                vi11 vi11Var = this.d;
                vi11Var.getClass();
                ofp0 ofp0Var = cuf0.d;
                cuf0 cuf0Var = (cuf0) ofp0Var.b();
                cuf0Var.b = 0.0d;
                cuf0Var.c = 0.0d;
                vi11Var.x(f3, f4, cuf0Var);
                float f5 = rectF.left;
                float f6 = rectF.bottom;
                cuf0 cuf0Var2 = (cuf0) ofp0Var.b();
                cuf0Var2.b = 0.0d;
                cuf0Var2.c = 0.0d;
                vi11Var.x(f5, f6, cuf0Var2);
                f = (float) cuf0Var2.c;
                f2 = (float) cuf0Var.c;
                cuf0.b(cuf0Var);
                cuf0.b(cuf0Var2);
            }
        }
        w1(f, f2);
    }

    public void w1(float f, float f2) {
        double dFloor;
        int i;
        float f3 = f;
        wc9 wc9Var = this.c;
        int i2 = wc9Var.i;
        double dAbs = Math.abs(f2 - f3);
        if (i2 == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
            wc9Var.f = new float[0];
            wc9Var.g = 0;
            return;
        }
        double d = npi1.d(dAbs / ((double) i2));
        if (wc9Var.k) {
            double d2 = wc9Var.j;
            if (d < d2) {
                d = d2;
            }
        }
        double d3 = npi1.d(Math.pow(10.0d, (int) Math.log10(d)));
        if (((int) (d / d3)) > 5) {
            d = Math.floor(d3 * 10.0d);
        }
        if (wc9Var.l) {
            d = ((float) dAbs) / (i2 - 1);
            wc9Var.g = i2;
            if (wc9Var.f.length < i2) {
                wc9Var.f = new float[i2];
            }
            for (int i3 = 0; i3 < i2; i3++) {
                wc9Var.f[i3] = f3;
                f3 = (float) (((double) f3) + d);
            }
        } else {
            double dCeil = d == 0.0d ? 0.0d : Math.ceil(((double) f3) / d) * d;
            if (d == 0.0d) {
                dFloor = 0.0d;
            } else {
                dFloor = Math.floor(((double) f2) / d) * d;
                if (dFloor != Double.POSITIVE_INFINITY) {
                    double d4 = dFloor + 0.0d;
                    dFloor = Double.longBitsToDouble(Double.doubleToRawLongBits(d4) + (d4 >= 0.0d ? 1L : -1L));
                }
            }
            if (d != 0.0d) {
                i = 0;
                for (double d5 = dCeil; d5 <= dFloor; d5 += d) {
                    i++;
                }
            } else {
                i = 0;
            }
            wc9Var.g = i;
            if (wc9Var.f.length < i) {
                wc9Var.f = new float[i];
            }
            for (int i4 = 0; i4 < i; i4++) {
                if (dCeil == 0.0d) {
                    dCeil = 0.0d;
                }
                wc9Var.f[i4] = (float) dCeil;
                dCeil += d;
            }
        }
        if (d < 1.0d) {
            wc9Var.h = (int) Math.ceil(-Math.log10(d));
        } else {
            wc9Var.h = 0;
        }
    }
}
