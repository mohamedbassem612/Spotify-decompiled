package p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w2c0 extends k9 {
    public Paint c;
    public Paint d;
    public u2c0 e;
    public ArrayList f;
    public Paint.FontMetrics g;
    public Path h;

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    public final void v1(Canvas canvas, float f, float f2, v2c0 v2c0Var, u2c0 u2c0Var) {
        Canvas canvas2;
        Path path = this.h;
        Paint paint = this.d;
        int i = v2c0Var.e;
        float f3 = v2c0Var.d;
        float f4 = v2c0Var.c;
        if (i == 1122868 || i == 1122867 || i == 0) {
            return;
        }
        int iSave = canvas.save();
        int i2 = v2c0Var.b;
        if (i2 == 3) {
            i2 = u2c0Var.j;
        }
        paint.setColor(i);
        if (Float.isNaN(f4)) {
            f4 = u2c0Var.k;
        }
        float fC = npi1.c(f4);
        float f5 = fC / 2.0f;
        int iC = l1d.C(i2);
        if (iC == 2) {
            canvas2 = canvas;
            paint.setStyle(Paint.Style.FILL);
            canvas2.drawCircle(f + f5, f2, f5, paint);
        } else if (iC == 3) {
            paint.setStyle(Paint.Style.FILL);
            canvas2 = canvas;
            canvas2.drawRect(f, f2 - f5, f + fC, f2 + f5, paint);
        } else if (iC != 4) {
            if (iC == 5) {
                if (Float.isNaN(f3)) {
                    f3 = u2c0Var.l;
                }
                float fC2 = npi1.c(f3);
                u2c0Var.getClass();
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(fC2);
                paint.setPathEffect(null);
                path.reset();
                path.moveTo(f, f2);
                path.lineTo(f + fC, f2);
                canvas.drawPath(path, paint);
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            paint.setStyle(Paint.Style.FILL);
            canvas2.drawCircle(f + f5, f2, f5, paint);
        }
        canvas2.restoreToCount(iSave);
    }
}
