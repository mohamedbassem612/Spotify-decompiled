package p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dcg extends Drawable {
    public final g4b1 a;
    public final float b;
    public final Paint c;
    public final Paint d;
    public ColorStateList e;
    public int f;
    public int g;

    public dcg(g4b1 g4b1Var, float f) {
        this.a = g4b1Var;
        this.b = f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0.0f);
        this.c = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.d = paint2;
        this.f = 255;
        if (g4b1Var.n.l() < 0 || g4b1Var.n.j() < 0) {
            hhg1.n("Drawables without intrinsic size are not supported.");
            throw null;
        }
    }

    public final void a() {
        this.c.setAlpha((Color.alpha(0) * this.f) / 255);
        this.d.setAlpha((Color.alpha(this.g) * this.f) / 255);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
        float fMin = Math.min(getBounds().width(), getBounds().height());
        Paint paint = this.c;
        float strokeWidth = (fMin / 2.0f) - (paint.getStrokeWidth() / 2.0f);
        canvas.drawCircle(0.0f, 0.0f, strokeWidth, this.d);
        if (paint.getStrokeWidth() > 0.0f) {
            canvas.drawCircle(0.0f, 0.0f, strokeWidth, paint);
        }
        g4b1 g4b1Var = this.a;
        int iL = g4b1Var.n.l();
        int iJ = g4b1Var.n.j();
        float fMax = fMin / Math.max(iL, iJ);
        canvas.scale(fMax, fMax);
        float f = this.b;
        canvas.scale(f, f);
        canvas.translate((-iL) / 2.0f, (-iJ) / 2.0f);
        g4b1Var.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        g4b1 g4b1Var = this.a;
        return (int) (Math.max(g4b1Var.n.l(), g4b1Var.n.j()) / this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        g4b1 g4b1Var = this.a;
        return (int) (Math.max(g4b1Var.n.l(), g4b1Var.n.j()) / this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int alpha = this.d.getAlpha();
        if (alpha != 0) {
            return alpha != 255 ? -3 : -1;
        }
        return this.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.e;
        return (colorStateList != null && colorStateList.isStateful()) || this.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        g4b1 g4b1Var = this.a;
        g4b1Var.setBounds(0, 0, g4b1Var.n.l(), g4b1Var.n.j());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        g4b1 g4b1Var = this.a;
        boolean z = false;
        boolean state = g4b1Var.isStateful() ? g4b1Var.setState(iArr) : false;
        ColorStateList colorStateList = this.e;
        if (colorStateList != null) {
            Paint paint = this.d;
            int color = paint.getColor();
            int colorForState = colorStateList.getColorForState(iArr, color);
            paint.setColor(colorForState);
            this.g = colorForState;
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
        this.f = i;
        a();
        this.a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
