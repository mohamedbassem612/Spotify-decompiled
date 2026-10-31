package p;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ww61 extends ax61 {
    public final yw61 b;
    public final float c;
    public final float d;

    public ww61(yw61 yw61Var, float f, float f2) {
        this.b = yw61Var;
        this.c = f;
        this.d = f2;
    }

    @Override // p.ax61
    public final void a(Matrix matrix, dw61 dw61Var, int i, Canvas canvas) {
        yw61 yw61Var = this.b;
        float f = yw61Var.c;
        float f2 = this.d;
        float f3 = yw61Var.b;
        float f4 = this.c;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        dw61Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = dw61Var.f;
        int[] iArr = dw61.i;
        iArr[0] = i2;
        iArr[1] = dw61Var.e;
        iArr[2] = dw61Var.d;
        Paint paint = dw61Var.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, dw61.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        yw61 yw61Var = this.b;
        return (float) Math.toDegrees(Math.atan((yw61Var.c - this.d) / (yw61Var.b - this.c)));
    }
}
