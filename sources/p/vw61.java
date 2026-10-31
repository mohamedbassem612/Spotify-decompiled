package p;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vw61 extends ax61 {
    public final xw61 b;

    public vw61(xw61 xw61Var) {
        this.b = xw61Var;
    }

    @Override // p.ax61
    public final void a(Matrix matrix, dw61 dw61Var, int i, Canvas canvas) {
        RectF rectF = xw61.h;
        xw61 xw61Var = this.b;
        float f = xw61Var.f;
        float f2 = xw61Var.g;
        RectF rectF2 = new RectF(xw61Var.b, xw61Var.c, xw61Var.d, xw61Var.e);
        Paint paint = dw61Var.b;
        boolean z = f2 < 0.0f;
        Path path = dw61Var.g;
        int[] iArr = dw61.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = dw61Var.f;
            iArr[2] = dw61Var.e;
            iArr[3] = dw61Var.d;
        } else {
            path.rewind();
            path.moveTo(rectF2.centerX(), rectF2.centerY());
            path.arcTo(rectF2, f, f2);
            path.close();
            float f3 = -i;
            rectF2.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = dw61Var.d;
            iArr[2] = dw61Var.e;
            iArr[3] = dw61Var.f;
        }
        float fWidth = rectF2.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float fD = c13.d(1.0f, f4, 2.0f, f4);
        float[] fArr = dw61.l;
        fArr[1] = f4;
        fArr[2] = fD;
        paint.setShader(new RadialGradient(rectF2.centerX(), rectF2.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF2.height() / rectF2.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, dw61Var.h);
        }
        canvas.drawArc(rectF2, f, f2, true, paint);
        canvas.restore();
    }
}
