package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ezy0 extends Drawable {
    public final Bitmap a;
    public final int b;
    public final Paint c;
    public final Paint d;

    public ezy0(int i, Bitmap bitmap) {
        this.a = bitmap;
        this.b = i;
        Paint paint = new Paint();
        paint.setColor(-1);
        this.c = paint;
        Paint paint2 = new Paint();
        paint2.setFilterBitmap(false);
        this.d = paint2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawRect(getBounds(), this.c);
        int iWidth = getBounds().width();
        Bitmap bitmap = this.a;
        int iMin = Math.min(iWidth / bitmap.getWidth(), getBounds().height() / bitmap.getHeight());
        if (iMin < 1) {
            return;
        }
        int width = bitmap.getWidth() * iMin;
        int height = bitmap.getHeight() * iMin;
        int iWidth2 = ((getBounds().width() - width) / 2) + getBounds().left;
        int iHeight = ((getBounds().height() - height) / 2) + getBounds().top;
        canvas.drawBitmap(bitmap, (Rect) null, new Rect(iWidth2, iHeight, width + iWidth2, height + iHeight), this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.setAlpha(i);
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }
}
