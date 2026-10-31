package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vk5 extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};
    private final ij5 a;
    public final Context b;
    public final nk5 c;
    public SpinnerAdapter d;
    public final boolean e;
    public final uk5 f;
    public int g;
    public final Rect h;

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    public vk5(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, 2130970274);
        this.h = new Rect();
        kfe1.a(getContext(), this);
        int[] iArr = moz0.v;
        lvc1 lvc1VarE = lvc1.E(context, attributeSet, iArr, 2130970274);
        TypedArray typedArray = (TypedArray) lvc1VarE.c;
        this.a = new ij5(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.b = new plm(context, resourceId);
        } else {
            this.b = context;
        }
        int i2 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i, 2130970274, 0);
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                }
            } catch (Exception unused) {
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i2 != 0) {
                    ok5 ok5Var = new ok5(this);
                    this.f = ok5Var;
                    ok5Var.d = typedArray.getString(2);
                } else if (i2 == 1) {
                    sk5 sk5Var = new sk5(this, this.b, attributeSet);
                    lvc1 lvc1VarE2 = lvc1.E(this.b, attributeSet, iArr, 2130970274);
                    this.g = ((TypedArray) lvc1VarE2.c).getLayoutDimension(3, -2);
                    sk5Var.o(lvc1VarE2.k(1));
                    sk5Var.b1 = typedArray.getString(2);
                    lvc1VarE2.I();
                    this.f = sk5Var;
                    this.c = new nk5(this, this, sk5Var);
                }
                textArray = typedArray.getTextArray(0);
                if (textArray != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                    arrayAdapter.setDropDownViewResource(2131626222);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                lvc1VarE.I();
                this.e = true;
                spinnerAdapter = this.d;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.d = null;
                }
                this.a.d(attributeSet, 2130970274);
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception unused2) {
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i2 != 0) {
            ok5 ok5Var2 = new ok5(this);
            this.f = ok5Var2;
            ok5Var2.d = typedArray.getString(2);
        } else if (i2 == 1) {
            sk5 sk5Var2 = new sk5(this, this.b, attributeSet);
            lvc1 lvc1VarE3 = lvc1.E(this.b, attributeSet, iArr, 2130970274);
            this.g = ((TypedArray) lvc1VarE3.c).getLayoutDimension(3, -2);
            sk5Var2.o(lvc1VarE3.k(1));
            sk5Var2.b1 = typedArray.getString(2);
            lvc1VarE3.I();
            this.f = sk5Var2;
            this.c = new nk5(this, this, sk5Var2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(2131626222);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        lvc1VarE.I();
        this.e = true;
        spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.a.d(attributeSet, 2130970274);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ij5 ij5Var = this.a;
        if (ij5Var != null) {
            ij5Var.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        uk5 uk5Var = this.f;
        return uk5Var != null ? uk5Var.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        uk5 uk5Var = this.f;
        return uk5Var != null ? uk5Var.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f != null ? this.g : super.getDropDownWidth();
    }

    public final uk5 getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        uk5 uk5Var = this.f;
        return uk5Var != null ? uk5Var.b() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        uk5 uk5Var = this.f;
        return uk5Var != null ? uk5Var.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        ij5 ij5Var = this.a;
        if (ij5Var != null) {
            return ij5Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ij5 ij5Var = this.a;
        if (ij5Var != null) {
            return ij5Var.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        uk5 uk5Var = this.f;
        if (uk5Var == null || !uk5Var.a()) {
            return;
        }
        uk5Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        tk5 tk5Var = (tk5) parcelable;
        super.onRestoreInstanceState(tk5Var.getSuperState());
        if (!tk5Var.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new x22(this, (byte) 1));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        tk5 tk5Var = new tk5(super.onSaveInstanceState());
        uk5 uk5Var = this.f;
        tk5Var.a = uk5Var != null && uk5Var.a();
        return tk5Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        nk5 nk5Var = this.c;
        if (nk5Var == null || !nk5Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        uk5 uk5Var = this.f;
        if (uk5Var == null) {
            return super.performClick();
        }
        if (uk5Var.a()) {
            return true;
        }
        uk5Var.i(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        uk5 uk5Var = this.f;
        if (uk5Var != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            pk5 pk5Var = new pk5();
            pk5Var.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                pk5Var.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (!Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
            uk5Var.k(pk5Var);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ij5 ij5Var = this.a;
        if (ij5Var != null) {
            ij5Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        ij5 ij5Var = this.a;
        if (ij5Var != null) {
            ij5Var.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        uk5 uk5Var = this.f;
        if (uk5Var == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            uk5Var.h(i2);
            uk5Var.d(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        uk5 uk5Var = this.f;
        if (uk5Var != null) {
            uk5Var.g(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f != null) {
            this.g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        uk5 uk5Var = this.f;
        if (uk5Var != null) {
            uk5Var.o(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(f0o1.j(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        uk5 uk5Var = this.f;
        if (uk5Var != null) {
            uk5Var.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ij5 ij5Var = this.a;
        if (ij5Var != null) {
            ij5Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ij5 ij5Var = this.a;
        if (ij5Var != null) {
            ij5Var.i(mode);
        }
    }
}
