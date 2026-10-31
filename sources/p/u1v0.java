package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u1v0 extends ImageSpan {
    public final int a;
    public final char[] b;

    /* JADX WARN: Illegal instructions before constructor call */
    public u1v0(Context context, int i, int i2) {
        Drawable drawable = context.getDrawable(2131232431);
        if (drawable == null) {
            hhg1.n("Required value was null.");
            throw null;
        }
        drawable.setBounds(0, 0, i2, i2);
        drawable.setTint(i);
        super(drawable, 0);
        this.a = i2;
        this.b = new char[]{'E'};
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(this.b, 0, 1, rect);
        super.draw(canvas, charSequence, i, i2, f, i3, i4, (this.a / 2) + (i4 - (rect.height() / 2)), paint);
    }
}
