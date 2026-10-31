package p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x650 extends Drawable {
    public final Paint a;
    public final u650 b;
    public final ye90 c;

    public x650(w650 w650Var, int i, int i2, boolean z) {
        Paint paint = new Paint();
        this.a = paint;
        u650 u650Var = new u650();
        u650Var.a = w650Var;
        u650Var.d = z;
        this.b = u650Var;
        u650Var.b = i;
        u650Var.c = i2;
        ((v650) w650Var).getClass();
        this.c = new ye90(i, i2);
        invalidateSelf();
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -15592942, Shader.TileMode.REPEAT));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.c.i(canvas, bounds);
        if (this.b.d) {
            canvas.save();
            canvas.scale(bounds.width(), bounds.height() + 1);
            canvas.drawRect(0.0f, 0.0f, 1.0f, 1.0f, this.a);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        int changingConfigurations = getChangingConfigurations();
        u650 u650Var = this.b;
        u650Var.e = changingConfigurations;
        return u650Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        return getConstantState().newDrawable();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
