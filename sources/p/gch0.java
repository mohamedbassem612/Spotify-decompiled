package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import java.util.BitSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class gch0 extends Drawable implements jx61 {
    public static final Paint W0;
    public final Paint N0;
    public final Paint O0;
    public final dw61 P0;
    public final yfc0 Q0;
    public final bz11 R0;
    public PorterDuffColorFilter S0;
    public PorterDuffColorFilter T0;
    public final RectF U0;
    public boolean V0;
    public final Region X;
    public final Region Y;
    public iw61 Z;
    public fch0 a;
    public final ax61[] b;
    public final ax61[] c;
    public final BitSet d;
    public boolean e;
    public final Matrix f;
    public final Path g;
    public final Path h;
    public final RectF i;
    public final RectF t;

    static {
        Paint paint = new Paint(1);
        W0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public gch0(fch0 fch0Var) {
        this.b = new ax61[4];
        this.c = new ax61[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.t = new RectF();
        this.X = new Region();
        this.Y = new Region();
        Paint paint = new Paint(1);
        this.N0 = paint;
        Paint paint2 = new Paint(1);
        this.O0 = paint2;
        this.P0 = new dw61();
        this.R0 = Looper.getMainLooper().getThread() == Thread.currentThread() ? bz11.j() : new bz11();
        this.U0 = new RectF();
        this.V0 = true;
        this.a = fch0Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        s();
        r(getState());
        this.Q0 = new yfc0(this, (byte) 13);
    }

    public final void b(RectF rectF, Path path) {
        fch0 fch0Var = this.a;
        this.R0.c(fch0Var.a, fch0Var.i, rectF, this.Q0, path);
        if (this.a.h != 1.0f) {
            Matrix matrix = this.f;
            matrix.reset();
            float f = this.a.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.U0, true);
    }

    public final int c(int i) {
        fch0 fch0Var = this.a;
        float f = fch0Var.m + 0.0f + fch0Var.l;
        guw guwVar = fch0Var.b;
        return guwVar != null ? guwVar.a(f, i) : i;
    }

    public final void d(Canvas canvas) {
        this.d.cardinality();
        int i = this.a.f34p;
        Path path = this.g;
        dw61 dw61Var = this.P0;
        if (i != 0) {
            canvas.drawPath(path, dw61Var.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            ax61 ax61Var = this.b[i2];
            int i3 = this.a.o;
            Matrix matrix = ax61.a;
            ax61Var.a(matrix, dw61Var, i3, canvas);
            this.c[i2].a(matrix, dw61Var, this.a.o, canvas);
        }
        if (this.V0) {
            fch0 fch0Var = this.a;
            int iSin = (int) (Math.sin(Math.toRadians(fch0Var.q)) * ((double) fch0Var.f34p));
            fch0 fch0Var2 = this.a;
            int iCos = (int) (Math.cos(Math.toRadians(fch0Var2.q)) * ((double) fch0Var2.f34p));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, W0);
            canvas.translate(iSin, iCos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        gch0 gch0Var;
        Canvas canvas2;
        PorterDuffColorFilter porterDuffColorFilter = this.S0;
        Paint paint = this.N0;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.a.k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.T0;
        Paint paint2 = this.O0;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.a.j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.a.k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.e;
        Path path = this.g;
        if (z) {
            float strokeWidth = i() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            iw61 iw61Var = this.a.a;
            ir20 ir20Var = new ir20((byte) 2, -strokeWidth);
            iw61Var.getClass();
            wdm wdmVar = new wdm(iw61Var);
            wdmVar.L(ir20Var.c(iw61Var.e));
            wdmVar.N(ir20Var.c(iw61Var.f));
            wdmVar.E(ir20Var.c(iw61Var.h));
            wdmVar.G(ir20Var.c(iw61Var.g));
            iw61 iw61VarD = wdmVar.d();
            this.Z = iw61VarD;
            float f = this.a.i;
            RectF rectFG = g();
            RectF rectF = this.t;
            rectF.set(rectFG);
            float strokeWidth2 = i() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth2, strokeWidth2);
            this.R0.b(iw61VarD, f, rectF, this.h);
            b(g(), path);
            this.e = false;
        }
        fch0 fch0Var = this.a;
        byte b = fch0Var.n;
        if (b != 1 && fch0Var.o > 0 && (b == 2 || (!k() && !path.isConvex() && Build.VERSION.SDK_INT < 29))) {
            canvas.save();
            fch0 fch0Var2 = this.a;
            int iSin = (int) (Math.sin(Math.toRadians(fch0Var2.q)) * ((double) fch0Var2.f34p));
            fch0 fch0Var3 = this.a;
            canvas.translate(iSin, (int) (Math.cos(Math.toRadians(fch0Var3.q)) * ((double) fch0Var3.f34p)));
            if (this.V0) {
                RectF rectF2 = this.U0;
                int iWidth = (int) (rectF2.width() - getBounds().width());
                int iHeight = (int) (rectF2.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    eg.m("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    return;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.a.o * 2) + ((int) rectF2.width()) + iWidth, (this.a.o * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas3 = new Canvas(bitmapCreateBitmap);
                float f2 = (getBounds().left - this.a.o) - iWidth;
                float f3 = (getBounds().top - this.a.o) - iHeight;
                canvas3.translate(-f2, -f3);
                d(canvas3);
                canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
                bitmapCreateBitmap.recycle();
                canvas.restore();
            } else {
                d(canvas);
                canvas.restore();
            }
        }
        fch0 fch0Var4 = this.a;
        Paint.Style style = fch0Var4.r;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            gch0Var = this;
            canvas2 = canvas;
            gch0Var.e(canvas2, paint, path, fch0Var4.a, g());
        } else {
            gch0Var = this;
            canvas2 = canvas;
        }
        if (gch0Var.i()) {
            gch0Var.f(canvas2);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, iw61 iw61Var, RectF rectF) {
        if (!iw61Var.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = iw61Var.f.a(rectF) * this.a.i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void f(Canvas canvas) {
        iw61 iw61Var = this.Z;
        RectF rectFG = g();
        RectF rectF = this.t;
        rectF.set(rectFG);
        boolean zI = i();
        Paint paint = this.O0;
        float strokeWidth = zI ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, this.h, iw61Var, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.i;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.a.n == 2) {
            return;
        }
        if (k()) {
            outline.setRoundRect(getBounds(), h() * this.a.i);
            return;
        }
        RectF rectFG = g();
        Path path = this.g;
        b(rectFG, path);
        if (path.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.X;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.g;
        b(rectFG, path);
        Region region2 = this.Y;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        return this.a.a.e.a(g());
    }

    public final boolean i() {
        Paint.Style style = this.a.r;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.O0.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.a.e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.a.getClass();
        ColorStateList colorStateList2 = this.a.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.a.c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(Context context) {
        this.a.b = new guw(context);
        t();
    }

    public final boolean k() {
        return this.a.a.d(g());
    }

    public final void l(float f) {
        fch0 fch0Var = this.a;
        if (fch0Var.m != f) {
            fch0Var.m = f;
            t();
        }
    }

    public final void m(ColorStateList colorStateList) {
        fch0 fch0Var = this.a;
        if (fch0Var.c != colorStateList) {
            fch0Var.c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        fch0 fch0Var = this.a;
        fch0 fch0Var2 = new fch0();
        fch0Var2.c = null;
        fch0Var2.d = null;
        fch0Var2.e = null;
        fch0Var2.f = PorterDuff.Mode.SRC_IN;
        fch0Var2.g = null;
        fch0Var2.h = 1.0f;
        fch0Var2.i = 1.0f;
        fch0Var2.k = 255;
        fch0Var2.l = 0.0f;
        fch0Var2.m = 0.0f;
        fch0Var2.n = (byte) 0;
        fch0Var2.o = 0;
        fch0Var2.f34p = 0;
        fch0Var2.q = (byte) 0;
        fch0Var2.r = Paint.Style.FILL_AND_STROKE;
        fch0Var2.a = fch0Var.a;
        fch0Var2.b = fch0Var.b;
        fch0Var2.j = fch0Var.j;
        fch0Var2.c = fch0Var.c;
        fch0Var2.d = fch0Var.d;
        fch0Var2.f = fch0Var.f;
        fch0Var2.e = fch0Var.e;
        fch0Var2.k = fch0Var.k;
        fch0Var2.h = fch0Var.h;
        fch0Var2.f34p = fch0Var.f34p;
        fch0Var2.n = fch0Var.n;
        fch0Var2.i = fch0Var.i;
        fch0Var2.l = fch0Var.l;
        fch0Var2.m = fch0Var.m;
        fch0Var2.o = fch0Var.o;
        fch0Var2.q = fch0Var.q;
        fch0Var2.r = fch0Var.r;
        if (fch0Var.g != null) {
            fch0Var2.g = new Rect(fch0Var.g);
        }
        this.a = fch0Var2;
        return this;
    }

    public final void n(float f) {
        fch0 fch0Var = this.a;
        if (fch0Var.i != f) {
            fch0Var.i = f;
            this.e = true;
            invalidateSelf();
        }
    }

    public final void o(int i) {
        this.P0.a(i);
        this.a.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = r(iArr) || s();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p() {
        fch0 fch0Var = this.a;
        if (fch0Var.q != 45) {
            fch0Var.q = (byte) 45;
            super.invalidateSelf();
        }
    }

    public final void q() {
        fch0 fch0Var = this.a;
        if (fch0Var.n != 2) {
            fch0Var.n = (byte) 2;
            super.invalidateSelf();
        }
    }

    public final boolean r(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.a.c == null || color2 == (colorForState2 = this.a.c.getColorForState(iArr, (color2 = (paint2 = this.N0).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.a.d == null || color == (colorForState = this.a.d.getColorForState(iArr, (color = (paint = this.O0).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean s() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.S0;
        PorterDuffColorFilter porterDuffColorFilter3 = this.T0;
        fch0 fch0Var = this.a;
        ColorStateList colorStateList = fch0Var.e;
        PorterDuff.Mode mode = fch0Var.f;
        if (colorStateList == null || mode == null) {
            int color = this.N0.getColor();
            int iC = c(color);
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.S0 = porterDuffColorFilter;
        this.a.getClass();
        this.T0 = null;
        this.a.getClass();
        return (n8p1.o(porterDuffColorFilter2, this.S0) && n8p1.o(porterDuffColorFilter3, this.T0)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        fch0 fch0Var = this.a;
        if (fch0Var.k != i) {
            fch0Var.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.getClass();
        super.invalidateSelf();
    }

    @Override // p.jx61
    public final void setShapeAppearanceModel(iw61 iw61Var) {
        this.a.a = iw61Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.a.e = colorStateList;
        s();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        fch0 fch0Var = this.a;
        if (fch0Var.f != mode) {
            fch0Var.f = mode;
            s();
            super.invalidateSelf();
        }
    }

    public final void t() {
        fch0 fch0Var = this.a;
        float f = fch0Var.m + 0.0f;
        fch0Var.o = (int) Math.ceil(0.75f * f);
        this.a.f34p = (int) Math.ceil(f * 0.25f);
        s();
        super.invalidateSelf();
    }

    public gch0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(iw61.b(context, attributeSet, i, i2).d());
    }

    public gch0(iw61 iw61Var) {
        fch0 fch0Var = new fch0();
        fch0Var.c = null;
        fch0Var.d = null;
        fch0Var.e = null;
        fch0Var.f = PorterDuff.Mode.SRC_IN;
        fch0Var.g = null;
        fch0Var.h = 1.0f;
        fch0Var.i = 1.0f;
        fch0Var.k = 255;
        fch0Var.l = 0.0f;
        fch0Var.m = 0.0f;
        fch0Var.n = (byte) 0;
        fch0Var.o = 0;
        fch0Var.f34p = 0;
        fch0Var.q = (byte) 0;
        fch0Var.r = Paint.Style.FILL_AND_STROKE;
        fch0Var.a = iw61Var;
        fch0Var.b = null;
        this(fch0Var);
    }

    public gch0() {
        this(new iw61());
    }
}
