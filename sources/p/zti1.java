package p;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zti1 extends Drawable {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    public Drawable a;
    public xti1 b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public final boolean f;
    public final float[] g;
    public final Matrix h;
    public final Rect i;

    public zti1() {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        xti1 xti1Var = new xti1();
        xti1Var.c = null;
        xti1Var.d = j;
        xti1Var.b = new wti1();
        this.b = xti1Var;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.a;
        if (drawable != null) {
            y1a1.q(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        y1a1.s(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && y1a1.z(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        xti1 xti1Var = this.b;
        Bitmap bitmap = xti1Var.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != xti1Var.f.getHeight()) {
            xti1Var.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            xti1Var.k = true;
        }
        xti1 xti1Var2 = this.b;
        if (!this.f) {
            xti1Var2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(xti1Var2.f);
            wti1 wti1Var = xti1Var2.b;
            wti1Var.a(wti1Var.g, wti1.f136p, canvas2, iMin, iMin2);
        } else if (xti1Var2.k || xti1Var2.g != xti1Var2.c || xti1Var2.h != xti1Var2.d || xti1Var2.j != xti1Var2.e || xti1Var2.i != xti1Var2.b.getRootAlpha()) {
            xti1 xti1Var3 = this.b;
            xti1Var3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(xti1Var3.f);
            wti1 wti1Var2 = xti1Var3.b;
            wti1Var2.a(wti1Var2.g, wti1.f136p, canvas3, iMin, iMin2);
            xti1 xti1Var4 = this.b;
            xti1Var4.g = xti1Var4.c;
            xti1Var4.h = xti1Var4.d;
            xti1Var4.i = xti1Var4.b.getRootAlpha();
            xti1Var4.j = xti1Var4.e;
            xti1Var4.k = false;
        }
        xti1 xti1Var5 = this.b;
        if (xti1Var5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (xti1Var5.l == null) {
                Paint paint2 = new Paint();
                xti1Var5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            xti1Var5.l.setAlpha(xti1Var5.b.getRootAlpha());
            xti1Var5.l.setColorFilter(colorFilter);
            paint = xti1Var5.l;
        }
        canvas.drawBitmap(xti1Var5.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? y1a1.u(drawable) : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? y1a1.v(drawable) : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new yti1(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        int i2;
        char c;
        char c2;
        Resources resources2 = resources;
        Drawable drawable = this.a;
        if (drawable != null) {
            y1a1.B(drawable, resources2, xmlPullParser, attributeSet, theme);
            return;
        }
        xti1 xti1Var = this.b;
        xti1Var.b = new wti1();
        TypedArray typedArrayF = xzn1.F(resources2, theme, attributeSet, z47.a);
        xti1 xti1Var2 = this.b;
        wti1 wti1Var = xti1Var2.b;
        int iS = xzn1.s(typedArrayF, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i3 = 3;
        int i4 = 5;
        if (iS == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iS != 5) {
            if (iS != 9) {
                switch (iS) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        xti1Var2.d = mode;
        ColorStateList colorStateListP = xzn1.p(typedArrayF, xmlPullParser, theme);
        if (colorStateListP != null) {
            xti1Var2.c = colorStateListP;
        }
        xti1Var2.e = xzn1.o(typedArrayF, xmlPullParser, xti1Var2.e);
        wti1Var.j = xzn1.r(typedArrayF, xmlPullParser, "viewportWidth", 7, wti1Var.j);
        float fR = xzn1.r(typedArrayF, xmlPullParser, "viewportHeight", 8, wti1Var.k);
        wti1Var.k = fR;
        if (wti1Var.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fR <= 0.0f) {
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        wti1Var.h = typedArrayF.getDimension(3, wti1Var.h);
        int i5 = 2;
        float dimension = typedArrayF.getDimension(2, wti1Var.i);
        wti1Var.i = dimension;
        if (wti1Var.h <= 0.0f) {
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires height > 0");
        }
        wti1Var.setAlpha(xzn1.r(typedArrayF, xmlPullParser, "alpha", 4, wti1Var.getAlpha()));
        String string = typedArrayF.getString(0);
        if (string != null) {
            wti1Var.m = string;
            wti1Var.o.put(string, wti1Var);
        }
        typedArrayF.recycle();
        xti1Var.a = getChangingConfigurations();
        int i6 = 1;
        xti1Var.k = true;
        xti1 xti1Var3 = this.b;
        wti1 wti1Var2 = xti1Var3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        tti1 tti1Var = wti1Var2.g;
        y36 y36Var = wti1Var2.o;
        arrayDeque.push(tti1Var);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i3)) {
            if (eventType == i5) {
                String name = xmlPullParser.getName();
                tti1 tti1Var2 = (tti1) arrayDeque.peek();
                if ("path".equals(name)) {
                    sti1 sti1Var = new sti1();
                    sti1Var.e(resources2, xmlPullParser, attributeSet, theme);
                    tti1Var2.b.add(sti1Var);
                    if (sti1Var.getPathName() != null) {
                        y36Var.put(sti1Var.getPathName(), sti1Var);
                    }
                    xti1Var3.a = xti1Var3.a;
                    c2 = 4;
                    z = false;
                } else {
                    if ("clip-path".equals(name)) {
                        rti1 rti1Var = new rti1();
                        rti1Var.e(resources2, xmlPullParser, attributeSet, theme);
                        tti1Var2.b.add(rti1Var);
                        if (rti1Var.getPathName() != null) {
                            y36Var.put(rti1Var.getPathName(), rti1Var);
                        }
                        xti1Var3.a = xti1Var3.a;
                    } else if ("group".equals(name)) {
                        tti1 tti1Var3 = new tti1();
                        TypedArray typedArrayF2 = xzn1.F(resources2, theme, attributeSet, z47.b);
                        tti1Var3.c = xzn1.r(typedArrayF2, xmlPullParser, "rotation", i4, tti1Var3.c);
                        tti1Var3.d = typedArrayF2.getFloat(1, tti1Var3.d);
                        tti1Var3.e = typedArrayF2.getFloat(2, tti1Var3.e);
                        tti1Var3.f = xzn1.r(typedArrayF2, xmlPullParser, "scaleX", 3, tti1Var3.f);
                        c2 = 4;
                        tti1Var3.g = xzn1.r(typedArrayF2, xmlPullParser, "scaleY", 4, tti1Var3.g);
                        tti1Var3.h = xzn1.r(typedArrayF2, xmlPullParser, "translateX", 6, tti1Var3.h);
                        tti1Var3.i = xzn1.r(typedArrayF2, xmlPullParser, "translateY", 7, tti1Var3.i);
                        String string2 = typedArrayF2.getString(0);
                        if (string2 != null) {
                            tti1Var3.k = string2;
                        }
                        tti1Var3.c();
                        typedArrayF2.recycle();
                        tti1Var2.b.add(tti1Var3);
                        arrayDeque.push(tti1Var3);
                        if (tti1Var3.getGroupName() != null) {
                            y36Var.put(tti1Var3.getGroupName(), tti1Var3);
                        }
                        xti1Var3.a = xti1Var3.a;
                    }
                    c2 = 4;
                }
                c = c2;
                i2 = 3;
                i = 1;
            } else {
                i = i6;
                i2 = i3;
                c = 4;
                if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            resources2 = resources;
            i3 = i2;
            i6 = i;
            i5 = 2;
            i4 = 5;
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
        this.c = a(xti1Var.c, xti1Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? y1a1.C(drawable) : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        xti1 xti1Var = this.b;
        if (xti1Var == null) {
            return false;
        }
        wti1 wti1Var = xti1Var.b;
        Boolean boolValueOf = wti1Var.n;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(wti1Var.g.a());
            wti1Var.n = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.b.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        Drawable drawable = this.a;
        if (drawable != null) {
            y1a1.F(drawable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            xti1 xti1Var = this.b;
            xti1 xti1Var2 = new xti1();
            xti1Var2.c = null;
            xti1Var2.d = j;
            if (xti1Var != null) {
                xti1Var2.a = xti1Var.a;
                wti1 wti1Var = new wti1(xti1Var.b);
                xti1Var2.b = wti1Var;
                if (xti1Var.b.e != null) {
                    wti1Var.e = new Paint(xti1Var.b.e);
                }
                if (xti1Var.b.d != null) {
                    xti1Var2.b.d = new Paint(xti1Var.b.d);
                }
                xti1Var2.c = xti1Var.c;
                xti1Var2.d = xti1Var.d;
                xti1Var2.e = xti1Var.e;
            }
            this.b = xti1Var2;
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setLevel(i) : super.onLevelChange(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        xti1 xti1Var = this.b;
        ColorStateList colorStateList = xti1Var.c;
        if (colorStateList == null || (mode = xti1Var.d) == null) {
            z = false;
        } else {
            this.c = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        wti1 wti1Var = xti1Var.b;
        Boolean boolValueOf = wti1Var.n;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(wti1Var.g.a());
            wti1Var.n = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            boolean zB = xti1Var.b.g.b(iArr);
            xti1Var.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            y1a1.M(drawable, z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            y1a1.P(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Drawable drawable = this.a;
        if (drawable != null) {
            y1a1.Q(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            y1a1.T(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            y1a1.U(drawable, colorStateList);
            return;
        }
        xti1 xti1Var = this.b;
        if (xti1Var.c != colorStateList) {
            xti1Var.c = colorStateList;
            this.c = a(colorStateList, xti1Var.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            y1a1.V(drawable, mode);
            return;
        }
        xti1 xti1Var = this.b;
        if (xti1Var.d != mode) {
            xti1Var.d = mode;
            this.c = a(xti1Var.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public zti1(xti1 xti1Var) {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.b = xti1Var;
        this.c = a(xti1Var.c, xti1Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
