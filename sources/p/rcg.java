package p;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rcg extends Drawable implements Animatable {
    public static final LinearInterpolator g = new LinearInterpolator();
    public static final hl10 h = new hl10();
    public static final int[] i = {-16777216};
    public final qcg a;
    public float b;
    public final Resources c;
    public final ValueAnimator d;
    public float e;
    public boolean f;

    public rcg(Context context) {
        context.getClass();
        this.c = context.getResources();
        qcg qcgVar = new qcg();
        this.a = qcgVar;
        qcgVar.i = i;
        qcgVar.a(0);
        qcgVar.h = 2.5f;
        qcgVar.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ocg(this, qcgVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(g);
        valueAnimatorOfFloat.addListener(new pcg(this, qcgVar));
        this.d = valueAnimatorOfFloat;
    }

    public static void d(float f, qcg qcgVar) {
        if (f <= 0.75f) {
            qcgVar.u = qcgVar.i[qcgVar.j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = qcgVar.i;
        int i2 = qcgVar.j;
        int i3 = iArr[i2];
        int i4 = iArr[(i2 + 1) % iArr.length];
        int i5 = (i3 >> 24) & 255;
        int i6 = (i3 >> 16) & 255;
        int i7 = (i3 >> 8) & 255;
        int i8 = i3 & 255;
        qcgVar.u = ((i5 + ((int) ((((i4 >> 24) & 255) - i5) * f2))) << 24) | ((i6 + ((int) ((((i4 >> 16) & 255) - i6) * f2))) << 16) | ((i7 + ((int) ((((i4 >> 8) & 255) - i7) * f2))) << 8) | (i8 + ((int) (f2 * ((i4 & 255) - i8))));
    }

    public final void a(float f, qcg qcgVar, boolean z) {
        float interpolation;
        if (this.f) {
            d(f, qcgVar);
            float fFloor = (float) (Math.floor(qcgVar.m / 0.8f) + 1.0d);
            float f2 = qcgVar.k;
            float f3 = qcgVar.l;
            qcgVar.e = (((f3 - 0.01f) - f2) * f) + f2;
            qcgVar.f = f3;
            float f4 = qcgVar.m;
            qcgVar.g = l1d.e(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = qcgVar.m;
            float interpolation2 = qcgVar.k;
            hl10 hl10Var = h;
            if (f < 0.5f) {
                interpolation = (hl10Var.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation2;
            } else {
                float f6 = interpolation2 + 0.79f;
                interpolation2 = f6 - (((1.0f - hl10Var.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.e) * 216.0f;
            qcgVar.e = interpolation2;
            qcgVar.f = interpolation;
            qcgVar.g = f7;
            this.b = f8;
        }
    }

    public final void b(float f, float f2, float f3, float f4) {
        float f5 = this.c.getDisplayMetrics().density;
        float f6 = f2 * f5;
        qcg qcgVar = this.a;
        qcgVar.h = f6;
        qcgVar.b.setStrokeWidth(f6);
        qcgVar.q = f * f5;
        qcgVar.a(0);
        qcgVar.r = (int) (f3 * f5);
        qcgVar.s = (int) (f4 * f5);
    }

    public final void c(int i2) {
        if (i2 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.b, bounds.exactCenterX(), bounds.exactCenterY());
        qcg qcgVar = this.a;
        Paint paint = qcgVar.b;
        RectF rectF = qcgVar.a;
        float f = qcgVar.q;
        float fMin = (qcgVar.h / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((qcgVar.r * qcgVar.f99p) / 2.0f, qcgVar.h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = qcgVar.e;
        float f3 = qcgVar.g;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((qcgVar.f + f3) * 360.0f) - f4;
        paint.setColor(qcgVar.u);
        paint.setAlpha(qcgVar.t);
        float f6 = qcgVar.h / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, qcgVar.d);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        Paint paint2 = qcgVar.c;
        if (qcgVar.n) {
            Path path = qcgVar.o;
            if (path == null) {
                Path path2 = new Path();
                qcgVar.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (qcgVar.r * qcgVar.f99p) / 2.0f;
            qcgVar.o.moveTo(0.0f, 0.0f);
            qcgVar.o.lineTo(qcgVar.r * qcgVar.f99p, 0.0f);
            Path path3 = qcgVar.o;
            float f9 = qcgVar.r;
            float f10 = qcgVar.f99p;
            path3.lineTo((f9 * f10) / 2.0f, qcgVar.s * f10);
            qcgVar.o.offset((rectF.centerX() + fMin2) - f8, (qcgVar.h / 2.0f) + rectF.centerY());
            qcgVar.o.close();
            paint2.setColor(qcgVar.u);
            paint2.setAlpha(qcgVar.t);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(qcgVar.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.a.t = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.d;
        valueAnimator.cancel();
        qcg qcgVar = this.a;
        float f = qcgVar.e;
        qcgVar.k = f;
        float f2 = qcgVar.f;
        qcgVar.l = f2;
        qcgVar.m = qcgVar.g;
        if (f2 != f) {
            this.f = true;
            valueAnimator.setDuration(666L);
            valueAnimator.start();
            return;
        }
        qcgVar.a(0);
        qcgVar.k = 0.0f;
        qcgVar.l = 0.0f;
        qcgVar.m = 0.0f;
        qcgVar.e = 0.0f;
        qcgVar.f = 0.0f;
        qcgVar.g = 0.0f;
        valueAnimator.setDuration(1332L);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.d.cancel();
        this.b = 0.0f;
        qcg qcgVar = this.a;
        if (qcgVar.n) {
            qcgVar.n = false;
        }
        qcgVar.a(0);
        qcgVar.k = 0.0f;
        qcgVar.l = 0.0f;
        qcgVar.m = 0.0f;
        qcgVar.e = 0.0f;
        qcgVar.f = 0.0f;
        qcgVar.g = 0.0f;
        invalidateSelf();
    }
}
