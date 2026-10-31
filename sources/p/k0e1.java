package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k0e1 {
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public final ColorStateList j;
    public float k;
    public final int l;
    public boolean m = false;
    public Typeface n;

    public k0e1(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, omz0.L);
        this.k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.j = dgo1.i(context, typedArrayObtainStyledAttributes, 3);
        dgo1.i(context, typedArrayObtainStyledAttributes, 4);
        dgo1.i(context, typedArrayObtainStyledAttributes, 5);
        this.c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int iM = dgo1.m(typedArrayObtainStyledAttributes);
        this.l = typedArrayObtainStyledAttributes.getResourceId(iM, 0);
        this.b = typedArrayObtainStyledAttributes.getString(iM);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.a = dgo1.i(context, typedArrayObtainStyledAttributes, 6);
        this.e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, omz0.C);
        this.h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        Typeface typeface;
        String str;
        Typeface typefaceCreate = this.n;
        int i = this.c;
        if (typefaceCreate == null && (str = this.b) != null) {
            typefaceCreate = Typeface.create(str, i);
            this.n = typefaceCreate;
        }
        if (typefaceCreate == null) {
            int i2 = this.d;
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
                this.n = typeface;
            } else if (i2 == 2) {
                typeface = Typeface.SERIF;
                this.n = typeface;
            } else if (i2 != 3) {
                typeface = Typeface.DEFAULT;
                this.n = typeface;
            } else {
                typeface = Typeface.MONOSPACE;
                this.n = typeface;
            }
            this.n = Typeface.create(typeface, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceB = qx21.b(context, this.l);
                this.n = typefaceB;
                if (typefaceB != null) {
                    this.n = Typeface.create(typefaceB, this.c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        a();
        this.m = true;
        return this.n;
    }

    public final void c(Context context, g2p1 g2p1Var) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.l;
        if (i == 0) {
            this.m = true;
        }
        if (this.m) {
            g2p1Var.I(this.n, true);
            return;
        }
        try {
            i0e1 i0e1Var = new i0e1(this, g2p1Var);
            ThreadLocal threadLocal = qx21.a;
            if (context.isRestricted()) {
                i0e1Var.e(-4);
            } else {
                qx21.c(context, i, new TypedValue(), 0, i0e1Var, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            g2p1Var.H(1);
        } catch (Exception unused2) {
            this.m = true;
            g2p1Var.H(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typefaceC = null;
        int i = this.l;
        if (i != 0) {
            ThreadLocal threadLocal = qx21.a;
            if (!context.isRestricted()) {
                typefaceC = qx21.c(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceC != null;
    }

    public final void e(Context context, TextPaint textPaint, g2p1 g2p1Var) {
        f(context, textPaint, g2p1Var);
        ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(this.g, this.e, this.f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, g2p1 g2p1Var) {
        if (d(context)) {
            g(textPaint, b(context));
            return;
        }
        a();
        g(textPaint, this.n);
        c(context, new j0e1(this, textPaint, g2p1Var));
    }

    public final void g(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
