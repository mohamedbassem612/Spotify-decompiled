package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bl5 {
    public final TextView a;
    public mal b;
    public mal c;
    public mal d;
    public mal e;
    public mal f;
    public mal g;
    public mal h;
    private final hl5 i;
    public Typeface l;
    public boolean n;
    public int j = 0;
    public int k = -1;
    public String m = null;

    public bl5(TextView textView) {
        this.a = textView;
        this.i = new hl5(textView);
    }

    public static void d(TextView textView, Typeface typeface, int i) {
        int i2 = Build.VERSION.SDK_INT;
        String str = null;
        if (i2 >= 26) {
            String strB = zk5.b(textView);
            if (!TextUtils.isEmpty(strB)) {
                zk5.e(textView, null);
            }
            str = strB;
        }
        textView.setTypeface(typeface, i);
        if (i2 < 26 || TextUtils.isEmpty(str)) {
            return;
        }
        zk5.e(textView, str);
    }

    public static mal f(Context context, ck5 ck5Var, int i) {
        ColorStateList colorStateListG;
        synchronized (ck5Var) {
            colorStateListG = ck5Var.a.g(context, i);
        }
        if (colorStateListG == null) {
            return null;
        }
        mal malVar = new mal();
        malVar.b = true;
        malVar.c = colorStateListG;
        return malVar;
    }

    public final void a(Drawable drawable, mal malVar) {
        if (drawable == null || malVar == null) {
            return;
        }
        int[] drawableState = this.a.getDrawableState();
        PorterDuff.Mode mode = ck5.b;
        ex21.h(drawable, malVar, drawableState);
    }

    public final void b() {
        mal malVar = this.b;
        TextView textView = this.a;
        if (malVar != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final void c(boolean z) {
        Typeface typeface = this.l;
        TextView textView = this.a;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        } else if (z) {
            textView.setTypeface(null);
        }
        String str = this.m;
        if (str == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        zk5.e(textView, str);
    }

    public final void e() {
        this.i.a();
    }

    public final int g() {
        return Math.round(this.i.e);
    }

    public final int h() {
        return Math.round(this.i.d);
    }

    public final int i() {
        return Math.round(this.i.c);
    }

    public final int[] j() {
        return this.i.f;
    }

    public final int k() {
        return this.i.a;
    }

    public final ColorStateList l() {
        mal malVar = this.h;
        if (malVar != null) {
            return (ColorStateList) malVar.c;
        }
        return null;
    }

    public final PorterDuff.Mode m() {
        mal malVar = this.h;
        if (malVar != null) {
            return (PorterDuff.Mode) malVar.d;
        }
        return null;
    }

    public final boolean n() {
        hl5 hl5Var = this.i;
        return hl5Var.h() && hl5Var.a != 0;
    }

    /* JADX WARN: Code duplicated, block: B:201:0x0340  */
    /* JADX WARN: Code duplicated, block: B:203:0x0345  */
    /* JADX WARN: Code duplicated, block: B:206:0x034c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:207:0x034e  */
    /* JADX WARN: Code duplicated, block: B:209:0x0353  */
    /* JADX WARN: Code duplicated, block: B:211:0x0359  */
    /* JADX WARN: Code duplicated, block: B:213:0x035d  */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    public final void o(AttributeSet attributeSet, int i) {
        boolean z;
        boolean zD;
        String strS;
        float fI;
        int iF;
        int resourceId;
        TextView textView = this.a;
        Context context = textView.getContext();
        ck5 ck5VarA = ck5.a();
        int[] iArr = moz0.h;
        lvc1 lvc1VarE = lvc1.E(context, attributeSet, iArr, i);
        b8k1.o(textView, textView.getContext(), iArr, attributeSet, lvc1VarE.w(), i);
        int iQ = lvc1VarE.q(0, -1);
        if (lvc1VarE.y(3)) {
            this.b = f(context, ck5VarA, lvc1VarE.q(3, 0));
        }
        if (lvc1VarE.y(1)) {
            this.c = f(context, ck5VarA, lvc1VarE.q(1, 0));
        }
        if (lvc1VarE.y(4)) {
            this.d = f(context, ck5VarA, lvc1VarE.q(4, 0));
        }
        if (lvc1VarE.y(2)) {
            this.e = f(context, ck5VarA, lvc1VarE.q(2, 0));
        }
        if (lvc1VarE.y(5)) {
            this.f = f(context, ck5VarA, lvc1VarE.q(5, 0));
        }
        if (lvc1VarE.y(6)) {
            this.g = f(context, ck5VarA, lvc1VarE.q(6, 0));
        }
        lvc1VarE.I();
        boolean z2 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = moz0.x;
        if (iQ != -1) {
            lvc1 lvc1VarC = lvc1.C(context, iQ, iArr2);
            if (z2 || !lvc1VarC.y(14)) {
                z = false;
                zD = false;
            } else {
                zD = lvc1VarC.d(14, false);
                z = true;
            }
            w(context, lvc1VarC);
            strS = lvc1VarC.y(15) ? lvc1VarC.s(15) : null;
            lvc1VarC.I();
        } else {
            z = false;
            zD = false;
            strS = null;
        }
        lvc1 lvc1VarE2 = lvc1.E(context, attributeSet, iArr2, i);
        if (!z2 && lvc1VarE2.y(14)) {
            zD = lvc1VarE2.d(14, false);
            z = true;
        }
        boolean z3 = zD;
        if (lvc1VarE2.y(15)) {
            strS = lvc1VarE2.s(15);
        }
        if (Build.VERSION.SDK_INT >= 28 && lvc1VarE2.y(0) && lvc1VarE2.i(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        w(context, lvc1VarE2);
        lvc1VarE2.I();
        if (!z2 && z) {
            textView.setAllCaps(z3);
        }
        c(false);
        if (strS != null) {
            j0o1.z(textView, j0o1.t(strS));
        }
        hl5 hl5Var = this.i;
        Context context2 = hl5Var.j;
        int[] iArr3 = moz0.i;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = hl5Var.i;
        b8k1.o(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes, i);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            hl5Var.a = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(2) ? typedArrayObtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(1) ? typedArrayObtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i2 = 0; i2 < length; i2++) {
                    iArr4[i2] = typedArrayObtainTypedArray.getDimensionPixelSize(i2, -1);
                }
                hl5Var.f = hl5.b(iArr4);
                hl5Var.g();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!hl5Var.h()) {
            hl5Var.a = 0;
        } else if (hl5Var.a == 1) {
            if (!hl5Var.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                hl5Var.i(dimension2, f, dimension);
            }
            hl5Var.f();
        }
        if (sik1.c) {
            hl5 hl5Var2 = this.i;
            if (hl5Var2.a != 0) {
                int[] iArr5 = hl5Var2.f;
                if (iArr5.length > 0) {
                    if (zk5.a(textView) != -1.0f) {
                        zk5.c(textView, Math.round(this.i.d), Math.round(this.i.e), Math.round(this.i.c));
                    } else {
                        zk5.d(textView, iArr5);
                    }
                }
            }
        }
        lvc1 lvc1VarD = lvc1.D(context, attributeSet, iArr3);
        int iQ2 = lvc1VarD.q(8, -1);
        Drawable drawableB = iQ2 != -1 ? ck5VarA.b(context, iQ2) : null;
        int iQ3 = lvc1VarD.q(13, -1);
        Drawable drawableB2 = iQ3 != -1 ? ck5VarA.b(context, iQ3) : null;
        int iQ4 = lvc1VarD.q(9, -1);
        Drawable drawableB3 = iQ4 != -1 ? ck5VarA.b(context, iQ4) : null;
        int iQ5 = lvc1VarD.q(6, -1);
        Drawable drawableB4 = iQ5 != -1 ? ck5VarA.b(context, iQ5) : null;
        int iQ6 = lvc1VarD.q(10, -1);
        Drawable drawableB5 = iQ6 != -1 ? ck5VarA.b(context, iQ6) : null;
        int iQ7 = lvc1VarD.q(7, -1);
        Drawable drawableB6 = iQ7 != -1 ? ck5VarA.b(context, iQ7) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (lvc1VarD.y(11)) {
            textView.setCompoundDrawableTintList(lvc1VarD.g(11));
        }
        if (lvc1VarD.y(12)) {
            textView.setCompoundDrawableTintMode(a8v.c(lvc1VarD.n(12, -1), null));
        }
        int i3 = lvc1VarD.i(15, -1);
        int i4 = lvc1VarD.i(18, -1);
        if (lvc1VarD.y(19)) {
            TypedValue typedValueG = lvc1VarD.G();
            if (typedValueG == null || typedValueG.type != 5) {
                fI = lvc1VarD.i(19, -1);
            } else {
                iF = b0o1.f(typedValueG.data);
                fI = TypedValue.complexToFloat(typedValueG.data);
            }
            lvc1VarD.I();
            if (i3 != -1) {
                w0h1.I(textView, i3);
            }
            if (i4 != -1) {
                w0h1.J(textView, i4);
            }
            if (fI != -1.0f) {
                if (iF == -1) {
                    w0h1.K(textView, (int) fI);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    sf.O(textView, iF, fI);
                } else {
                    w0h1.K(textView, Math.round(TypedValue.applyDimension(iF, fI, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        fI = -1.0f;
        iF = -1;
        lvc1VarD.I();
        if (i3 != -1) {
            w0h1.I(textView, i3);
        }
        if (i4 != -1) {
            w0h1.J(textView, i4);
        }
        if (fI != -1.0f) {
            if (iF == -1) {
                w0h1.K(textView, (int) fI);
            } else if (Build.VERSION.SDK_INT >= 34) {
                sf.O(textView, iF, fI);
            } else {
                w0h1.K(textView, Math.round(TypedValue.applyDimension(iF, fI, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void p(Context context, int i) {
        lvc1 lvc1VarC = lvc1.C(context, i, moz0.x);
        boolean zY = lvc1VarC.y(14);
        TextView textView = this.a;
        if (zY) {
            textView.setAllCaps(lvc1VarC.d(14, false));
        }
        if (lvc1VarC.y(0) && lvc1VarC.i(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        boolean zW = w(context, lvc1VarC);
        lvc1VarC.I();
        c(zW);
    }

    public final void q(int i, int i2, int i3, int i4) {
        hl5 hl5Var = this.i;
        if (hl5Var.h()) {
            DisplayMetrics displayMetrics = hl5Var.j.getResources().getDisplayMetrics();
            hl5Var.i(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (hl5Var.f()) {
                hl5Var.a();
            }
        }
    }

    public final void r(int[] iArr, int i) {
        hl5 hl5Var = this.i;
        if (hl5Var.h()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = hl5Var.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                hl5Var.f = hl5.b(iArrCopyOf);
                if (!hl5Var.g()) {
                    tw20.t(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                hl5Var.g = false;
            }
            if (hl5Var.f()) {
                hl5Var.a();
            }
        }
    }

    public final void s(int i) {
        hl5 hl5Var = this.i;
        if (hl5Var.h()) {
            if (i == 0) {
                hl5Var.a = 0;
                hl5Var.d = -1.0f;
                hl5Var.e = -1.0f;
                hl5Var.c = -1.0f;
                hl5Var.f = new int[0];
                hl5Var.b = false;
                return;
            }
            if (i != 1) {
                hhg1.n(f4i1.c(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = hl5Var.j.getResources().getDisplayMetrics();
            hl5Var.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (hl5Var.f()) {
                hl5Var.a();
            }
        }
    }

    public final void t(ColorStateList colorStateList) {
        mal malVar = this.h;
        if (malVar == null) {
            malVar = new mal();
            this.h = malVar;
        }
        mal malVar2 = malVar;
        malVar.c = colorStateList;
        malVar.b = colorStateList != null;
        this.b = malVar2;
        this.c = malVar2;
        this.d = malVar2;
        this.e = malVar2;
        this.f = malVar2;
        this.g = malVar2;
    }

    public final void u(PorterDuff.Mode mode) {
        mal malVar = this.h;
        if (malVar == null) {
            malVar = new mal();
            this.h = malVar;
        }
        mal malVar2 = malVar;
        malVar.d = mode;
        malVar.a = mode != null;
        this.b = malVar2;
        this.c = malVar2;
        this.d = malVar2;
        this.e = malVar2;
        this.f = malVar2;
        this.g = malVar2;
    }

    public final void v(int i, float f) {
        if (sik1.c) {
            return;
        }
        hl5 hl5Var = this.i;
        if (!hl5Var.h() || hl5Var.a == 0) {
            this.i.e(f, i);
        }
    }

    public final boolean w(Context context, lvc1 lvc1Var) {
        String strS;
        int i;
        Typeface typeface;
        this.j = lvc1Var.n(2, this.j);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int iN = lvc1Var.n(11, -1);
            this.k = iN;
            if (iN != -1) {
                this.j &= 2;
            }
        }
        if (i2 >= 26 && lvc1Var.y(13)) {
            this.m = lvc1Var.s(13);
        }
        if (lvc1Var.y(10) || lvc1Var.y(12)) {
            this.l = null;
            int i3 = lvc1Var.y(12) ? 12 : 10;
            int i4 = this.k;
            int i5 = this.j;
            if (!context.isRestricted()) {
                try {
                    Typeface typefaceM = lvc1Var.m(i3, this.j, new xk5(this, i4, i5, new WeakReference(this.a)));
                    if (typefaceM != null) {
                        if (i2 < 28 || this.k == -1) {
                            this.l = typefaceM;
                        } else {
                            this.l = ph5.e(Typeface.create(typefaceM, 0), this.k, (this.j & 2) != 0);
                        }
                    }
                    this.n = this.l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.l == null && (strS = lvc1Var.s(i3)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                    this.l = Typeface.create(strS, this.j);
                } else {
                    this.l = ph5.e(Typeface.create(strS, 0), this.k, (this.j & 2) != 0);
                }
            }
        } else {
            if (!lvc1Var.y(1)) {
                if (i2 < 28 || (i = this.k) == -1 || (typeface = this.l) == null) {
                    return false;
                }
                this.l = ph5.e(typeface, i, (this.j & 2) != 0);
                return true;
            }
            this.n = false;
            int iN2 = lvc1Var.n(1, 1);
            if (iN2 == 1) {
                this.l = Typeface.SANS_SERIF;
                return true;
            }
            if (iN2 == 2) {
                this.l = Typeface.SERIF;
                return true;
            }
            if (iN2 == 3) {
                this.l = Typeface.MONOSPACE;
                return true;
            }
        }
        return true;
    }
}
