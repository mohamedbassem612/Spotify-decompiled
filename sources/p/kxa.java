package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kxa implements oq70 {
    public final Bitmap a;

    public kxa(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // p.oq70
    public final long a() {
        return fpi1.l(this.a);
    }

    @Override // p.oq70
    public final void c(Canvas canvas) {
        canvas.drawBitmap(this.a, 0.0f, 0.0f, (Paint) null);
    }

    @Override // p.oq70
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxa) && u890.j(this.a, ((kxa) obj).a);
    }

    @Override // p.oq70
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // p.oq70
    public final int getWidth() {
        return this.a.getWidth();
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.a + ", shareable=true)";
    }
}
