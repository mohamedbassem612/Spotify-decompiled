package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nru extends Drawable {
    public final ColorStateList a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final g4b1 d;
    public final Drawable e;
    public final idd1 f;
    public o1v g;

    public nru(Context context) {
        Drawable drawable = context.getDrawable(2131233784);
        if (drawable == null) {
            eg.m("R.drawable.progress_small_holo is not found");
            throw null;
        }
        this.e = drawable;
        this.f = new idd1(new ots(this, (byte) 27));
        this.g = o1v.b;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165733);
        this.a = x74.E(context, 2131101342);
        this.b = x74.E(context, 2131101359);
        this.c = x74.E(context, 2131101358);
        this.d = azo1.r(context, j4b1.z2, 2131101359, dimensionPixelSize);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        g4b1 g4b1Var = this.d;
        g4b1Var.setBounds(bounds);
        Rect bounds2 = getBounds();
        Drawable drawable = this.e;
        drawable.setBounds(bounds2);
        if (mru.a[this.g.ordinal()] == 4) {
            drawable.draw(canvas);
        } else {
            g4b1Var.n.c(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d.n.j();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d.n.l();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.g == o1v.c ? this.e.getOpacity() : this.d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return mru.a[this.g.ordinal()] == 4 ? this.e.isStateful() : this.d.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.d.setBounds(getBounds());
        this.e.setBounds(getBounds());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (mru.a[this.g.ordinal()] == 4) {
            invalidateSelf();
            return this.e.setState(iArr);
        }
        invalidateSelf();
        return this.d.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.setAlpha(i);
        this.e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
    }
}
