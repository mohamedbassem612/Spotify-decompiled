package p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sv41 extends Drawable {
    public static final nce h = new nce(Integer.class, "level", (byte) 10);
    public final m890 a;
    public final m890 b;
    public final m890 c;
    public final m890 d = m890.g(0.0f);
    public final m890 e = m890.g(0.0f);
    public final Paint f;
    public final RectF g;

    public sv41(int i, int i2, int i3, int i4) {
        Paint paint = new Paint();
        this.f = paint;
        this.g = new RectF();
        paint.setColor(i4);
        m890 m890VarG = m890.g(255.0f);
        this.b = m890VarG.k(i).f();
        this.a = m890VarG.k(i2).f();
        this.c = m890VarG.k(i3).f();
    }

    public final void a() {
        float fL = this.b.l(getLevel());
        float fL2 = this.a.l(getLevel());
        float fL3 = this.d.l(getLevel());
        float fL4 = this.e.l(getLevel());
        Rect bounds = getBounds();
        RectF rectF = this.g;
        rectF.set(bounds);
        float f = fL4 / 2.0f;
        float f2 = fL3 / 2.0f;
        rectF.offset(f - f2, 0.0f);
        rectF.inset(fL + f2 + f, fL2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fL = this.c.l(getLevel());
        canvas.drawRoundRect(this.g, fL, fL, this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        a();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
