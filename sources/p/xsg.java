package p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xsg extends ReplacementSpan {
    public final String a;
    public final TextPaint b = new TextPaint();

    public xsg(String str) {
        this.a = str;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = this.b;
        textPaint.set(paint);
        textPaint.setTextSize(paint.getTextSize() * 0.5f);
        float fMeasureText = paint.measureText(charSequence, i, i2);
        String str = this.a;
        float fMeasureText2 = textPaint.measureText(str);
        float fMax = Math.max(fMeasureText, fMeasureText2);
        float fD = c13.d(fMax, fMeasureText, 2.0f, f);
        float f2 = i4;
        canvas.drawText(str, c13.d(fMax, fMeasureText2, 2.0f, f), (paint.ascent() + f2) - textPaint.descent(), textPaint);
        canvas.drawText(charSequence, i, i2, fD, f2, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        TextPaint textPaint = this.b;
        textPaint.set(paint);
        textPaint.setTextSize(paint.getTextSize() * 0.5f);
        float fMax = Math.max(paint.measureText(charSequence, i, i2), textPaint.measureText(this.a));
        if (fontMetricsInt != null) {
            int iCeil = (int) Math.ceil(textPaint.descent() - textPaint.ascent());
            fontMetricsInt.ascent -= iCeil;
            fontMetricsInt.top -= iCeil;
        }
        return (int) Math.ceil(fMax);
    }
}
