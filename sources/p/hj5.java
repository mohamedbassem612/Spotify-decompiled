package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class hj5 extends AutoCompleteTextView {
    public static final int[] d = {R.attr.popupBackground};
    private final ij5 a;
    private final bl5 b;
    private final ek5 c;

    public hj5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kfe1.a(getContext(), this);
        lvc1 lvc1VarE = lvc1.E(getContext(), attributeSet, d, i);
        if (((TypedArray) lvc1VarE.c).hasValue(0)) {
            setDropDownBackgroundDrawable(lvc1VarE.k(0));
        }
        lvc1VarE.I();
        ij5 ij5Var = new ij5(this);
        this.a = ij5Var;
        ij5Var.d(attributeSet, i);
        bl5 bl5Var = new bl5(this);
        this.b = bl5Var;
        bl5Var.o(attributeSet, i);
        bl5Var.b();
        ek5 ek5Var = new ek5(this);
        this.c = ek5Var;
        ek5Var.c(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = ek5Var.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return w0h1.P(super.getCustomSelectionActionModeCallback());
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        xzn1.G(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.c.d(inputConnectionOnCreateInputConnection, editorInfo);
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(w0h1.Q(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(f0o1.j(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.e(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.a(keyListener));
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        bl5 bl5Var = this.b;
        if (bl5Var != null) {
            bl5Var.p(context, i);
        }
    }

    public hj5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968722);
    }
}
