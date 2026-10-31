package p;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class dca extends ProgressBar {
    public final cca N0;
    public final uic0 a;
    public int b;
    public final boolean c;
    public final int d;
    public te5 e;
    public boolean f;
    public int g;
    public final bca h;
    public final bca i;
    public final cca t;

    public dca(Context context, AttributeSet attributeSet, int i) {
        super(u890.J(context, attributeSet, i, 2132018833), attributeSet, i);
        this.f = false;
        this.g = 4;
        this.h = new bca(this, (byte) 0);
        this.i = new bca(this, (byte) 1);
        this.t = new cca(this, (byte) 0);
        this.N0 = new cca(this, (byte) 1);
        Context context2 = getContext();
        uic0 uic0Var = new uic0(context2, attributeSet, 2130969645, 2132018797);
        blo1.m(context2, attributeSet, 2130969645, 2132018797);
        int[] iArr = omz0.r;
        blo1.n(context2, attributeSet, iArr, 2130969645, 2132018797, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130969645, 2132018797);
        uic0Var.g = typedArrayObtainStyledAttributes.getInt(0, 1);
        uic0Var.h = typedArrayObtainStyledAttributes.getInt(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        uic0Var.a();
        uic0Var.i = uic0Var.h == 1;
        this.a = uic0Var;
        blo1.m(context2, attributeSet, i, 2132018797);
        int[] iArr2 = omz0.d;
        blo1.n(context2, attributeSet, iArr2, i, 2132018797, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr2, i, 2132018797);
        typedArrayObtainStyledAttributes2.getInt(5, -1);
        this.d = Math.min(typedArrayObtainStyledAttributes2.getInt(3, -1), 1000);
        typedArrayObtainStyledAttributes2.recycle();
        this.e = new te5();
        this.c = true;
    }

    private q8v getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().Y;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().Y;
    }

    public void a(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.b = i;
            this.f = true;
            if (getIndeterminateDrawable().isVisible()) {
                te5 te5Var = this.e;
                ContentResolver contentResolver = getContext().getContentResolver();
                te5Var.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().Z.H();
                    return;
                }
            }
            getIndeterminateDrawable();
            this.t.a();
        }
    }

    public final boolean b() {
        WeakHashMap weakHashMap = b8k1.a;
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.a.f;
    }

    @Override // android.widget.ProgressBar
    public s980 getIndeterminateDrawable() {
        return (s980) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.a.c;
    }

    @Override // android.widget.ProgressBar
    public jot getProgressDrawable() {
        return (jot) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.a.e;
    }

    public int getTrackColor() {
        return this.a.d;
    }

    public int getTrackCornerRadius() {
        return this.a.b;
    }

    public int getTrackThickness() {
        return this.a.a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().Z.D(this.t);
        }
        jot progressDrawable = getProgressDrawable();
        cca ccaVar = this.N0;
        if (progressDrawable != null) {
            jot progressDrawable2 = getProgressDrawable();
            ArrayList arrayList = progressDrawable2.f;
            if (arrayList == null) {
                arrayList = new ArrayList();
                progressDrawable2.f = arrayList;
            }
            if (!arrayList.contains(ccaVar)) {
                progressDrawable2.f.add(ccaVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            s980 indeterminateDrawable = getIndeterminateDrawable();
            ArrayList arrayList2 = indeterminateDrawable.f;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                indeterminateDrawable.f = arrayList2;
            }
            if (!arrayList2.contains(ccaVar)) {
                indeterminateDrawable.f.add(ccaVar);
            }
        }
        if (b()) {
            if (this.d > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.i);
        removeCallbacks(this.h);
        ((c8v) getCurrentDrawable()).e(false, false, false);
        s980 indeterminateDrawable = getIndeterminateDrawable();
        cca ccaVar = this.N0;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().g(ccaVar);
            getIndeterminateDrawable().Z.O();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().g(ccaVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
            q8v currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            int iE = currentDrawingDelegate.e();
            int iD = currentDrawingDelegate.d();
            setMeasuredDimension(iE < 0 ? getMeasuredWidth() : iE + getPaddingLeft() + getPaddingRight(), iD < 0 ? getMeasuredHeight() : iD + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.c) {
            ((c8v) getCurrentDrawable()).e(b(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.c) {
            ((c8v) getCurrentDrawable()).e(b(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(te5 te5Var) {
        this.e = te5Var;
        if (getProgressDrawable() != null) {
            getProgressDrawable().c = te5Var;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c = te5Var;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.a.f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            c8v c8vVar = (c8v) getCurrentDrawable();
            if (c8vVar != null) {
                c8vVar.e(false, false, false);
            }
            super.setIndeterminate(z);
            c8v c8vVar2 = (c8v) getCurrentDrawable();
            if (c8vVar2 != null) {
                c8vVar2.e(b(), false, false);
            }
            if ((c8vVar2 instanceof s980) && b()) {
                ((s980) c8vVar2).Z.M();
            }
            this.f = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (!(drawable instanceof s980)) {
            hhg1.n("Cannot set framework drawable as indeterminate drawable.");
        } else {
            ((c8v) drawable).e(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{ago1.o(getContext(), 2130969030, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.a.c = iArr;
        getIndeterminateDrawable().Z.v();
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        a(i);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
            return;
        }
        if (!(drawable instanceof jot)) {
            hhg1.n("Cannot set framework drawable as progress drawable.");
            return;
        }
        jot jotVar = (jot) drawable;
        jotVar.e(false, false, false);
        super.setProgressDrawable(jotVar);
        jotVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
    }

    public void setShowAnimationBehavior(int i) {
        this.a.e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        uic0 uic0Var = this.a;
        if (uic0Var.d != i) {
            uic0Var.d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        uic0 uic0Var = this.a;
        if (uic0Var.b != i) {
            uic0Var.b = Math.min(i, uic0Var.a / 2);
        }
    }

    public void setTrackThickness(int i) {
        uic0 uic0Var = this.a;
        if (uic0Var.a != i) {
            uic0Var.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.g = i;
        } else {
            hhg1.n("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
    }
}
