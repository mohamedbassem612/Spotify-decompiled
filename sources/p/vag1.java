package p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.LineBackgroundSpan;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vag1 implements LineBackgroundSpan {
    public final float a;
    public final Paint b;
    public final RectF c;

    public vag1(int i, float f) {
        this.a = f;
        Paint paint = new Paint();
        paint.setColor(i);
        this.b = paint;
        this.c = new RectF();
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        RectF rectF = this.c;
        rectF.set(i, i3 + 2.0f, i2, i5 - 2.0f);
        float f = this.a;
        canvas.drawRoundRect(rectF, f, f, this.b);
    }
}
