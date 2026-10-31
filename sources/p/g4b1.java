package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g4b1 extends Drawable {
    public j4b1 a;
    public float b;
    public jqd0 c;
    public float f;
    public final Paint g;
    public ColorStateList h;
    public float k;
    public float l;
    public final pyp0 m;
    public f4b1 n;
    public final float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f30p;
    public int d = -1;
    public int e = 255;
    public final Rect i = new Rect();
    public final float[] j = new float[1];

    public g4b1(Context context, j4b1 j4b1Var, float f) {
        y281 y281Var = new y281(this, (byte) 11);
        this.m = new pyp0(this);
        this.n = y281Var;
        this.f30p = 1;
        this.a = j4b1Var;
        this.b = f;
        this.o = context.getResources().getDisplayMetrics().density;
        f();
        Typeface typefaceB = qx21.b(context, 2131296257);
        Paint paint = new Paint();
        this.g = paint;
        paint.setColor(this.d);
        paint.setTypeface(typefaceB);
        paint.setTextSize(f);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setAntiAlias(true);
        g();
    }

    public final String a() {
        if (this.c.w()) {
            return this.c.r();
        }
        boolean z = true;
        int i = this.f30p;
        if (i != 3 && (i != 1 || y1a1.z(this) != 1)) {
            z = false;
        }
        jqd0 jqd0Var = this.c;
        return z ? jqd0Var.s() : jqd0Var.r();
    }

    public final void b(int i) {
        this.h = null;
        this.d = i;
        this.g.setColor(i);
        e();
        invalidateSelf();
    }

    public final void c(ColorStateList colorStateList) {
        this.h = colorStateList;
        onStateChange(getState());
        invalidateSelf();
    }

    public final void d(float f) {
        this.b = f;
        this.g.setTextSize(f);
        f();
        g();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.n.c(canvas);
    }

    public final void e() {
        this.g.setAlpha((Color.alpha(this.d) * this.e) / 255);
    }

    public final void f() {
        int iAbs;
        int iRound = Math.round(this.b / this.o);
        j4b1 j4b1Var = this.a;
        int[] iArr = j4b1Var.a;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 2 && (iAbs = Math.abs(iArr[i2] - iRound)) <= i) {
            i3 = i2;
            i2++;
            i = iAbs;
        }
        int i4 = iArr[i3];
        this.c = new jqd0(j4b1Var.b[i3], j4b1Var.c[i3], j4b1Var.d[i3], (byte) 20);
    }

    public final void g() {
        String strR = this.c.r();
        Rect rect = this.i;
        Paint paint = this.g;
        paint.getTextBounds(strR, 0, 1, rect);
        paint.getTextWidths(this.c.r(), 0, 1, this.j);
        float f = this.b;
        this.l = (-1.0064484f) * f;
        this.k = f * 1.0233134f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.n.j();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.n.l();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Paint paint = this.g;
        if (paint.getXfermode() != null) {
            return -3;
        }
        int alpha = paint.getAlpha();
        if (alpha == 0) {
            return -2;
        }
        return alpha == 255 ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.h != null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.h;
        if (colorStateList == null) {
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, this.d);
        this.d = colorForState;
        this.g.setColor(colorForState);
        e();
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.e = i;
        e();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.g.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
