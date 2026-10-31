package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gx40 extends ReplacementSpan {
    public final int a;
    public final TextPaint b;
    public final Drawable c;
    public final Rect d = new Rect();

    public gx40(Context context, int i, int i2) {
        this.a = i2;
        TextView textView = (TextView) yoi1.w(context, TextView.class, i);
        TextPaint paint = textView.getPaint();
        this.b = paint;
        paint.setColor(textView.getTextColors().getDefaultColor());
        this.c = textView.getBackground();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        Rect rect = this.d;
        paint.getTextBounds("X", 0, 1, rect);
        TextPaint textPaint = this.b;
        float fMeasureText = textPaint.measureText(charSequence, i, i2);
        int i6 = this.a;
        canvas.translate(0.0f, -textPaint.descent());
        canvas.translate(0.0f, (((int) (textPaint.descent() - textPaint.ascent())) - rect.height()) / 2.0f);
        float f2 = i4;
        RectF rectF = new RectF(f, textPaint.ascent() + f2, fMeasureText + (i6 * 2) + f, textPaint.descent() + f2);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
            drawable.draw(canvas);
        }
        canvas.translate(i6, 0.0f);
        canvas.drawText(charSequence, i, i2, f, f2, textPaint);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            fontMetricsInt.ascent = (int) fontMetrics.ascent;
            fontMetricsInt.bottom = (int) fontMetrics.bottom;
            fontMetricsInt.descent = (int) fontMetrics.descent;
            fontMetricsInt.leading = (int) fontMetrics.leading;
            fontMetricsInt.top = (int) fontMetrics.top;
        }
        return (int) (this.b.measureText(charSequence, i, i2) + (this.a * 2));
    }
}
