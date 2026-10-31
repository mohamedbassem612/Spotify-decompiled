package p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class peg1 extends ReplacementSpan {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public int f;
    public final RectF g = new RectF();

    public peg1(int i, int i2, int i3, int i4, float f, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
        this.f = i5;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        paint.setColor(this.a);
        float fMeasureText = paint.measureText(charSequence, i, i2) + f;
        int i7 = this.d;
        RectF rectF = this.g;
        rectF.set(f, i3, fMeasureText + (i7 * 2), i5);
        float f2 = this.e;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setColor(this.b);
        try {
            int i8 = this.f;
            if (i8 > i && i8 <= charSequence.length() && (i6 = this.f) <= i2) {
                canvas.drawText(charSequence, i, i6, f + i7, i4, paint);
            }
            int i9 = this.f;
            if (i9 < 0 || i9 >= charSequence.length() || this.f >= i2 || i2 > charSequence.length()) {
                return;
            }
            float fMeasureText2 = paint.measureText(charSequence, i, this.f);
            paint.setColor(this.c);
            try {
                canvas.drawText(charSequence, this.f, i2, i7 + f + fMeasureText2, i4, paint);
                return;
            } catch (IndexOutOfBoundsException e) {
                e = e;
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = e;
        Logger.e(indexOutOfBoundsException, jhc1.J("\n                    Invalid length of transcript.\n                    Text: " + ((Object) charSequence) + ", Start: " + i + ", End: " + i2 + ", HighlightedTextLength: " + this.f + "\n                "), new Object[0]);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3 = this.d;
        return (int) (paint.measureText(charSequence, i, i2) + i3 + i3);
    }
}
