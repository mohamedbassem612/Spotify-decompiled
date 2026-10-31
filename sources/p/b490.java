package p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b490 extends Drawable {
    public final Drawable a;
    public Drawable b;
    public final long c;
    public int d = 255;
    public boolean e;

    public b490(Drawable drawable, Drawable drawable2, int i) {
        this.a = drawable;
        if (i != 1) {
            this.b = drawable2;
            this.e = true;
            this.c = SystemClock.uptimeMillis();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z = this.e;
        Drawable drawable = this.a;
        if (!z) {
            drawable.draw(canvas);
            return;
        }
        float fUptimeMillis = (SystemClock.uptimeMillis() - this.c) / 200.0f;
        if (fUptimeMillis >= 1.0f) {
            this.e = false;
            this.b = null;
            drawable.draw(canvas);
            return;
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        drawable.setAlpha((int) (this.d * fUptimeMillis));
        drawable.draw(canvas);
        drawable.setAlpha(this.d);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return this.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d = i;
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        this.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        return this.a.setState(iArr);
    }
}
