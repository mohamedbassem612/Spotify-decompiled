package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.TypedValue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zh2 extends Drawable {
    public final String a;
    public final Paint b;
    public final TextPaint c;
    public final Rect d = new Rect();
    public final int e;
    public final int f;
    public final int g;
    public final ColorStateList h;
    public final ColorStateList i;
    public final int j;
    public final int k;

    public zh2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131165297);
        this.g = dimensionPixelSize;
        this.e = resources.getDimensionPixelSize(2131165296);
        this.f = resources.getDimensionPixelSize(2131165298);
        this.h = x74.E(context, 2131101341);
        this.i = x74.E(context, 2131100135);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968791, typedValue, true);
        int i = typedValue.data;
        this.j = i;
        TypedValue typedValue2 = new TypedValue();
        context.getTheme().resolveAttribute(2130968789, typedValue2, true);
        int i2 = typedValue2.data;
        this.k = i2;
        this.a = "19";
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(i2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(dimensionPixelSize);
        TextPaint textPaint = new TextPaint();
        this.c = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setColor(i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(2132018002, new int[]{R.attr.fontFamily});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId > 0) {
            try {
                textPaint.setTypeface(qx21.b(context, resourceId));
            } catch (Resources.NotFoundException unused) {
                n57.e("AgeRestrictionDrawable:: Font cannot be loaded.");
            }
        }
    }

    public final int a() {
        int intrinsicHeight = super.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        float fA = a() / 2.0f;
        canvas.drawCircle(fA, a() / 2.0f, fA - (this.g / 2.0f), this.b);
        int iA = a();
        Rect rect = this.d;
        float fWidth = (iA - (rect.width() + rect.left)) / 2.0f;
        float fHeight = (rect.height() + a()) / 2.0f;
        int iSave = canvas.save();
        canvas.translate(fWidth, fHeight);
        try {
            canvas.drawText(this.a, 0.0f, 0.0f, this.c);
            canvas.restore();
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float fA = a() - (this.f * 2);
        TextPaint textPaint = this.c;
        textPaint.setTextSize(fA);
        String str = this.a;
        textPaint.getTextBounds(str, 0, str.length(), this.d);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        int colorForState = this.h.getColorForState(iArr, this.j);
        TextPaint textPaint = this.c;
        if (colorForState == textPaint.getColor()) {
            int colorForState2 = this.i.getColorForState(iArr, this.k);
            Paint paint = this.b;
            if (colorForState2 != paint.getColor()) {
                paint.setColor(colorForState2);
            } else {
                z = false;
            }
            if (z) {
                invalidateSelf();
            }
            return !z || super.onStateChange(iArr);
        }
        textPaint.setColor(colorForState);
        z = true;
        if (z) {
            invalidateSelf();
        }
        if (z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
    }
}
