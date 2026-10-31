package p;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gz71 extends Drawable {
    public final fz71 a = new fz71(this);
    public final Paint b;
    public final Rect c;
    public final Matrix d;
    public ValueAnimator e;
    public bz71 f;

    public gz71() {
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Rect();
        this.d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        bz71 bz71Var;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null || valueAnimator.isStarted() || (bz71Var = this.f) == null || !bz71Var.o || getCallback() == null) {
            return;
        }
        this.e.start();
    }

    public final void b() {
        bz71 bz71Var;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (bz71Var = this.f) == null) {
            return;
        }
        int iRound = bz71Var.g;
        if (iRound <= 0) {
            iRound = Math.round(bz71Var.i * iWidth);
        }
        bz71 bz71Var2 = this.f;
        int iRound2 = bz71Var2.h;
        if (iRound2 <= 0) {
            iRound2 = Math.round(bz71Var2.j * iHeight);
        }
        bz71 bz71Var3 = this.f;
        boolean z = true;
        if (!bz71Var3.f) {
            byte b = bz71Var3.c;
            if (b != 1 && b != 3) {
                z = false;
            }
            if (z) {
                iRound = 0;
            }
            if (!z) {
                iRound2 = 0;
            }
            bz71 bz71Var4 = this.f;
            radialGradient = new LinearGradient(0.0f, 0.0f, iRound, iRound2, bz71Var4.b, bz71Var4.a, Shader.TileMode.CLAMP);
        } else {
            float fMax = (float) (((double) Math.max(iRound, iRound2)) / Math.sqrt(2.0d));
            bz71 bz71Var5 = this.f;
            radialGradient = new RadialGradient(iRound / 2.0f, iRound2 / 2.0f, fMax, bz71Var5.b, bz71Var5.a, Shader.TileMode.CLAMP);
        }
        this.b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fE;
        float fE2;
        if (this.f != null) {
            Paint paint = this.b;
            if (paint.getShader() == null) {
                return;
            }
            float fTan = (float) Math.tan(Math.toRadians(this.f.m));
            Rect rect = this.c;
            float fWidth = (rect.width() * fTan) + rect.height();
            float fHeight = (fTan * rect.height()) + rect.width();
            ValueAnimator valueAnimator = this.e;
            float f = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            byte b = this.f.c;
            if (b != 1) {
                if (b == 2) {
                    fE2 = l1d.e(-fHeight, fHeight, animatedFraction, fHeight);
                } else if (b != 3) {
                    float f2 = -fHeight;
                    fE2 = l1d.e(fHeight, f2, animatedFraction, f2);
                } else {
                    fE = l1d.e(-fWidth, fWidth, animatedFraction, fWidth);
                }
                f = fE2;
                fE = 0.0f;
            } else {
                float f3 = -fWidth;
                fE = l1d.e(fWidth, f3, animatedFraction, f3);
            }
            Matrix matrix = this.d;
            matrix.reset();
            matrix.setRotate(this.f.m, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(f, fE);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        bz71 bz71Var = this.f;
        if (bz71Var != null) {
            return (bz71Var.n || bz71Var.f17p) ? -3 : -1;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
