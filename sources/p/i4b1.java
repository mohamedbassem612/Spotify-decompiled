package p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i4b1 extends ImageSpan {
    public static final /* synthetic */ int c = 0;
    public final int a;
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    public i4b1(g4b1 g4b1Var, int i, int i2) {
        int i3 = 0;
        if (i != 1) {
            if (i == 2) {
                i3 = 1;
            } else if (i != 3 && i != 4) {
                throw null;
            }
        }
        super((Drawable) g4b1Var, i3);
        this.a = i;
        this.b = true;
    }

    public final void a(char c2, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, Paint paint) {
        g4b1 drawable = getDrawable();
        if (this.b) {
            drawable.b(paint.getColor());
        }
        Rect rect = new Rect();
        paint.getTextBounds(new char[]{c2}, 0, 1, rect);
        super.draw(canvas, charSequence, i, i2, f, i3, i4, (drawable.n.j() / 2) + (i4 - (rect.height() / 2)), paint);
    }

    public final void b(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.b) {
            getDrawable().b(paint.getColor());
        }
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6 = this.a;
        if (i6 == 1) {
            b(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
            return;
        }
        if (i6 == 2) {
            b(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        } else if (i6 != 3) {
            a('e', canvas, charSequence, i, i2, f, i3, i4, paint);
        } else {
            a('E', canvas, charSequence, i, i2, f, i3, i4, paint);
        }
    }
}
