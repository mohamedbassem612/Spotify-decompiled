package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class il5 extends ToggleButton {
    private final ij5 a;
    private final bl5 b;
    private fk5 c;

    public il5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kfe1.a(getContext(), this);
        ij5 ij5Var = new ij5(this);
        this.a = ij5Var;
        ij5Var.d(attributeSet, i);
        bl5 bl5Var = new bl5(this);
        this.b = bl5Var;
        bl5Var.o(attributeSet, i);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    private fk5 getEmojiTextViewHelper() {
        fk5 fk5Var = this.c;
        if (fk5Var != null) {
            return fk5Var;
        }
        fk5 fk5Var2 = new fk5(this);
        this.c = fk5Var2;
        return fk5Var2;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ij5 ij5Var = this.a;
        if (ij5Var != null) {
            ij5Var.a();
        }
        bl5 bl5Var = this.b;
        if (bl5Var != null) {
            bl5Var.b();
        }
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.l();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.m();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ij5 ij5Var = this.a;
        if (ij5Var != null) {
            ij5Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ij5 ij5Var = this.a;
        if (ij5Var != null) {
            ij5Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        bl5 bl5Var = this.b;
        if (bl5Var != null) {
            bl5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        bl5 bl5Var = this.b;
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.b.t(colorStateList);
        this.b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.b.u(mode);
        this.b.b();
    }

    public il5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }
}
