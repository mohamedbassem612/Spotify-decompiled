package p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ecg extends Drawable {
    public final Drawable a;
    public final Paint b;
    public final Paint c;
    public ColorStateList d;
    public int e;
    public int f;

    public ecg(Drawable drawable) {
        this.a = drawable;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0.0f);
        this.b = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.c = paint2;
        this.e = 255;
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            hhg1.n("Drawables without intrinsic size are not supported.");
            throw null;
        }
    }

    public final void a() {
        this.b.setAlpha((Color.alpha(0) * this.e) / 255);
        this.c.setAlpha((Color.alpha(this.f) * this.e) / 255);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
        float fMin = Math.min(getBounds().width(), getBounds().height());
        Paint paint = this.b;
        float strokeWidth = (fMin / 2.0f) - (paint.getStrokeWidth() / 2.0f);
        canvas.drawCircle(0.0f, 0.0f, strokeWidth, this.c);
        if (paint.getStrokeWidth() > 0.0f) {
            canvas.drawCircle(0.0f, 0.0f, strokeWidth, paint);
        }
        Drawable drawable = this.a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float fMax = fMin / Math.max(intrinsicWidth, intrinsicHeight);
        canvas.scale(fMax, fMax);
        canvas.scale(0.6f, 0.6f);
        canvas.translate((-intrinsicWidth) / 2.0f, (-intrinsicHeight) / 2.0f);
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return (int) (Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 0.6f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return (int) (Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 0.6f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int alpha = this.c.getAlpha();
        if (alpha != 0) {
            return alpha != 255 ? -3 : -1;
        }
        return this.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.d;
        return (colorStateList != null && colorStateList.isStateful()) || this.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.a;
        boolean z = false;
        boolean state = drawable.isStateful() ? drawable.setState(iArr) : false;
        ColorStateList colorStateList = this.d;
        if (colorStateList != null) {
            Paint paint = this.c;
            int color = paint.getColor();
            int colorForState = colorStateList.getColorForState(iArr, color);
            paint.setColor(colorForState);
            this.f = colorForState;
            if (colorForState != color) {
                z = true;
            }
        }
        boolean z2 = state | z;
        a();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.e = i;
        a();
        this.a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
