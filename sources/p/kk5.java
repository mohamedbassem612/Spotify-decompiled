package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class kk5 extends RadioButton {
    private final oj5 a;
    private final ij5 b;
    private final bl5 c;
    private fk5 d;

    public kk5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kfe1.a(getContext(), this);
        oj5 oj5Var = new oj5(this);
        this.a = oj5Var;
        oj5Var.b(attributeSet, i);
        ij5 ij5Var = new ij5(this);
        this.b = ij5Var;
        ij5Var.d(attributeSet, i);
        bl5 bl5Var = new bl5(this);
        this.c = bl5Var;
        bl5Var.o(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    private fk5 getEmojiTextViewHelper() {
        fk5 fk5Var = this.d;
        if (fk5Var != null) {
            return fk5Var;
        }
        fk5 fk5Var2 = new fk5(this);
        this.d = fk5Var2;
        return fk5Var2;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ij5 ij5Var = this.b;
        if (ij5Var != null) {
            ij5Var.a();
        }
        bl5 bl5Var = this.c;
        if (bl5Var != null) {
            bl5Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        ij5 ij5Var = this.b;
        if (ij5Var != null) {
            return ij5Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ij5 ij5Var = this.b;
        if (ij5Var != null) {
            return ij5Var.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        oj5 oj5Var = this.a;
        if (oj5Var != null) {
            return oj5Var.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        oj5 oj5Var = this.a;
        if (oj5Var != null) {
            return oj5Var.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.l();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.m();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ij5 ij5Var = this.b;
        if (ij5Var != null) {
            ij5Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ij5 ij5Var = this.b;
        if (ij5Var != null) {
            ij5Var.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        oj5 oj5Var = this.a;
        if (oj5Var != null) {
            if (oj5Var.f) {
                oj5Var.f = false;
            } else {
                oj5Var.f = true;
                oj5Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        bl5 bl5Var = this.c;
        if (bl5Var != null) {
            bl5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        bl5 bl5Var = this.c;
        if (bl5Var != null) {
            bl5Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ij5 ij5Var = this.b;
        if (ij5Var != null) {
            ij5Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ij5 ij5Var = this.b;
        if (ij5Var != null) {
            ij5Var.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        oj5 oj5Var = this.a;
        if (oj5Var != null) {
            oj5Var.b = colorStateList;
            oj5Var.d = true;
            oj5Var.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        oj5 oj5Var = this.a;
        if (oj5Var != null) {
            oj5Var.c = mode;
            oj5Var.e = true;
            oj5Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.c.t(colorStateList);
        this.c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.c.u(mode);
        this.c.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(f0o1.j(getContext(), i));
    }

    public kk5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970120);
    }
}
