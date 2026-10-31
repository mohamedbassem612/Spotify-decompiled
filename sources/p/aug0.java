package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aug0 extends View {
    public final idd1 a;
    public final idd1 b;
    public final idd1 c;
    public ztg0 d;
    public ztg0 e;
    public bug0 f;

    public aug0(Context context) {
        super(context, null, 0, 0);
        this.a = new idd1(lxf0.T0);
        this.b = new idd1(lxf0.R0);
        this.c = new idd1(lxf0.S0);
    }

    private final Paint getInnerCirclePaint() {
        return (Paint) this.b.getValue();
    }

    private final Paint getLinesPaint() {
        return (Paint) this.c.getValue();
    }

    private final Paint getOuterCirclePaint() {
        return (Paint) this.a.getValue();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) throws Throwable {
        Canvas canvas2 = canvas;
        super.draw(canvas);
        bug0 bug0Var = this.f;
        if (bug0Var == null) {
            return;
        }
        Throwable th = null;
        if (bug0Var != null) {
            int i = bug0Var.a;
            int i2 = bug0Var.b;
            Paint innerCirclePaint = getInnerCirclePaint();
            innerCirclePaint.setStyle(Paint.Style.FILL);
            ztg0 ztg0Var = this.e;
            if (ztg0Var == null) {
                u890.C("innerCircleData");
                throw null;
            }
            innerCirclePaint.setShader(new RadialGradient(ztg0Var.a, ztg0Var.b, Math.abs(ztg0Var.c), new int[]{uah.l(i2, 25), i2}, new float[]{0.344f, 1.0f}, Shader.TileMode.CLAMP));
            Paint outerCirclePaint = getOuterCirclePaint();
            outerCirclePaint.setStyle(Paint.Style.STROKE);
            outerCirclePaint.setStrokeWidth(3.0f);
            outerCirclePaint.setColor(i);
            Paint linesPaint = getLinesPaint();
            linesPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            linesPaint.setStrokeWidth(3.0f);
            linesPaint.setColor(uah.l(i, 102));
        }
        ztg0 ztg0Var2 = this.d;
        String str = "outerCircleData";
        if (ztg0Var2 == null) {
            u890.C("outerCircleData");
            throw null;
        }
        float f = ztg0Var2.a;
        if (ztg0Var2 == null) {
            u890.C("outerCircleData");
            throw null;
        }
        float f2 = ztg0Var2.b;
        if (ztg0Var2 == null) {
            u890.C("outerCircleData");
            throw null;
        }
        canvas2.drawCircle(f, f2, ztg0Var2.c, getOuterCirclePaint());
        double dCos = Math.cos(1.0471975511965976d);
        double dSin = Math.sin(1.0471975511965976d);
        int i3 = 0;
        while (i3 < 31) {
            float f3 = i3 * 25.0f;
            ztg0 ztg0Var3 = this.d;
            if (ztg0Var3 == null) {
                Throwable th2 = th;
                u890.C(str);
                throw th2;
            }
            float f4 = ztg0Var3.c;
            float f5 = f3 - f4;
            double d = f4;
            Throwable th3 = th;
            String str2 = str;
            double dSqrt = Math.sqrt((d * d) - ((double) (f5 * f5)));
            ztg0 ztg0Var4 = this.d;
            if (ztg0Var4 == null) {
                u890.C(str2);
                throw th3;
            }
            double d2 = f5;
            double d3 = (d2 * dSin) + ((double) ztg0Var4.a);
            double d4 = dSqrt * dCos;
            double d5 = d3 + d4;
            double d6 = d3 - d4;
            double d7 = (d2 * dCos) + ((double) ztg0Var4.b);
            double d8 = dSqrt * dSin;
            canvas2 = canvas;
            canvas2.drawLine((float) d5, (float) (d7 - d8), (float) d6, (float) (d7 + d8), getLinesPaint());
            i3++;
            th = th3;
            str = str2;
        }
        Throwable th4 = th;
        ztg0 ztg0Var5 = this.e;
        if (ztg0Var5 == null) {
            u890.C("innerCircleData");
            throw th4;
        }
        float f6 = ztg0Var5.a;
        if (ztg0Var5 == null) {
            u890.C("innerCircleData");
            throw th4;
        }
        float f7 = ztg0Var5.b;
        if (ztg0Var5 != null) {
            canvas2.drawCircle(f6, f7, ztg0Var5.c, getInnerCirclePaint());
        } else {
            u890.C("innerCircleData");
            throw th4;
        }
    }

    public final bug0 getViewConfig() {
        return this.f;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        bug0 bug0Var = this.f;
        if (bug0Var == null) {
            return;
        }
        float f = (i - 3.0f) / 2.0f;
        float f2 = (i2 - 3.0f) / 2.0f;
        if (i > i2) {
            i = i2;
        }
        float f3 = (i / 2) - 3.0f;
        this.d = new ztg0(f, f2, f3);
        if (bug0Var == null) {
            eg.m("view config isn't provided..");
            return;
        }
        double dPow = ((double) ((float) Math.pow(f3, 2.0d))) * 3.141592653589793d * ((double) bug0Var.c);
        ztg0 ztg0Var = this.d;
        if (ztg0Var == null) {
            u890.C("outerCircleData");
            throw null;
        }
        float f4 = ztg0Var.c - 3.0f;
        float fSqrt = (float) Math.sqrt(dPow / 3.141592653589793d);
        if (40.0f >= fSqrt) {
            fSqrt = 40.0f;
        }
        if (f4 > fSqrt) {
            f4 = fSqrt;
        }
        ztg0 ztg0Var2 = this.d;
        if (ztg0Var2 != null) {
            this.e = new ztg0(f, f2 + ((ztg0Var2.c - f4) - 3.0f), f4);
        } else {
            u890.C("outerCircleData");
            throw null;
        }
    }

    public final void setViewConfig(bug0 bug0Var) {
        this.f = bug0Var;
        invalidate();
    }
}
