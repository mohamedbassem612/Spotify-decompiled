package p;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t7v implements oq70 {
    public final Drawable a;

    public t7v(Drawable drawable) {
        this.a = drawable;
    }

    @Override // p.oq70
    public final long a() {
        Drawable drawable = this.a;
        long jB = ((long) aqi1.b(drawable)) * 4 * ((long) aqi1.a(drawable));
        if (jB < 0) {
            return 0L;
        }
        return jB;
    }

    @Override // p.oq70
    public final void c(Canvas canvas) {
        this.a.draw(canvas);
    }

    @Override // p.oq70
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7v) && u890.j(this.a, ((t7v) obj).a);
    }

    @Override // p.oq70
    public final int getHeight() {
        return aqi1.a(this.a);
    }

    @Override // p.oq70
    public final int getWidth() {
        return aqi1.b(this.a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", shareable=false)";
    }
}
