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
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.TypedValue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n0e1 extends Drawable {
    public final String a;
    public final float b;
    public final RectF c = new RectF();
    public final int d;
    public final ColorStateList e;
    public final TextPaint f;
    public final int g;
    public final int h;
    public final int i;
    public final Paint j;
    public final Rect k;

    public n0e1(Context context, String str) {
        this.a = str;
        this.b = context.getResources().getDimensionPixelSize(2131165732);
        this.d = context.getColor(2131101506);
        this.e = x74.E(context, 2131101341);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(2132018002, new int[]{R.attr.textSize, R.attr.textColor, R.attr.fontFamily});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        if (resourceId != 0) {
            try {
                textPaint.setTypeface(qx21.b(context, resourceId));
            } catch (Resources.NotFoundException unused) {
                n57.e("TextBadgeDrawable: Font family cannot be loaded.");
            }
        }
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        if (dimensionPixelSize > 0.0f) {
            textPaint.setTextSize(dimensionPixelSize);
        } else {
            n57.e("TextBadgeDrawable: text size must be greater than 0.");
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968768, typedValue, true);
        textPaint.setColor(typedArrayObtainStyledAttributes.getColor(1, typedValue.data));
        typedArrayObtainStyledAttributes.recycle();
        this.f = textPaint;
        String str2 = this.a;
        int iMeasureText = (int) textPaint.measureText(str2, 0, str2.length());
        this.g = iMeasureText;
        int iDescent = (int) (textPaint.descent() - textPaint.ascent());
        this.h = iDescent;
        this.i = Math.max(iDescent, (context.getResources().getDimensionPixelSize(2131165731) * 2) + iMeasureText);
        Paint paint = new Paint(1);
        paint.setColor(this.d);
        this.j = paint;
        Rect rect = new Rect();
        String str3 = this.a;
        textPaint.getTextBounds(str3, 0, str3.length(), rect);
        this.k = rect;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i = this.h;
        RectF rectF = this.c;
        int iSave = canvas.save();
        int i2 = this.i;
        try {
            rectF.set(0.0f, 0.0f, i2, i);
            float f = this.b;
            canvas.drawRoundRect(rectF, f, f, this.j);
            int i3 = this.g;
            Rect rect = this.k;
            canvas.translate((i2 - (i3 + rect.left)) / 2.0f, (i + rect.height()) / 2.0f);
            canvas.drawText(this.a, 0.0f, 0.0f, this.f);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.i;
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
    public final boolean onStateChange(int[] iArr) {
        int colorForState = this.e.getColorForState(iArr, this.d);
        Paint paint = this.j;
        if (colorForState == paint.getColor()) {
            return super.onStateChange(iArr);
        }
        paint.setColor(colorForState);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.j.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
    }
}
