package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class asd extends Drawable {
    public final int a;
    public final zrd b;
    public final j4b1 c;
    public final float d;
    public final Paint e;
    public final float f;
    public final float g;
    public final float h;
    public final g4b1 i;
    public final int j;
    public final int k;

    public asd(Context context, int i, zrd zrdVar, j4b1 j4b1Var) {
        byte b = zrdVar.a;
        this.a = i;
        this.b = zrdVar;
        this.c = j4b1Var;
        this.d = j4b1Var == j4b1.E6 ? 0.95f : 1.0f;
        this.e = new Paint(1);
        this.f = a8o.y(b, context.getResources());
        float fY = a8o.y(b + 1, context.getResources());
        this.g = fY;
        int iY = a8o.y(zrdVar.b, context.getResources());
        float f = iY % 2 != 0 ? iY + 1.0f : iY;
        this.h = f;
        g4b1 g4b1Var = new g4b1(context, j4b1Var, f);
        g4b1Var.b(-1);
        g4b1Var.setBounds(0, 0, g4b1Var.n.l(), g4b1Var.n.j());
        this.i = g4b1Var;
        int i2 = (int) (fY * 2.0f);
        this.j = i2;
        this.k = a8o.y(7.0f, context.getResources());
        setBounds(0, 0, i2, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.e;
        paint.setColor(855638016);
        float f = this.g;
        canvas.drawCircle(f, f, f, paint);
        paint.setColor(this.a);
        canvas.drawCircle(f, f, this.f, paint);
        float f2 = (this.j - this.h) / 2.0f;
        float f3 = this.d * f2;
        int iSave = canvas.save();
        canvas.translate(f2, f3);
        try {
            this.i.n.c(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asd)) {
            return false;
        }
        asd asdVar = (asd) obj;
        return this.a == asdVar.a && this.c == asdVar.c && this.b == asdVar.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.c.hashCode() + (this.a * 31)) * 31);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
