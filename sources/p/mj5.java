package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mj5 extends CheckedTextView {
    private final nj5 a;
    private final ij5 b;
    private final bl5 c;
    private fk5 d;

    public mj5(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, i);
        kfe1.a(getContext(), this);
        bl5 bl5Var = new bl5(this);
        this.c = bl5Var;
        bl5Var.o(attributeSet, i);
        bl5Var.b();
        ij5 ij5Var = new ij5(this);
        this.b = ij5Var;
        ij5Var.d(attributeSet, i);
        this.a = new nj5(this);
        Context context2 = getContext();
        int[] iArr = moz0.l;
        lvc1 lvc1VarE = lvc1.E(context2, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) lvc1VarE.c;
        b8k1.o(this, getContext(), iArr, attributeSet, (TypedArray) lvc1VarE.c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(f0o1.j(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(f0o1.j(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(f0o1.j(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(lvc1VarE.g(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(a8v.c(typedArray.getInt(3, -1), (PorterDuff.Mode) null));
            }
            lvc1VarE.I();
            getEmojiTextViewHelper().c(attributeSet, i);
        } catch (Throwable th) {
            lvc1VarE.I();
            throw th;
        }
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

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        bl5 bl5Var = this.c;
        if (bl5Var != null) {
            bl5Var.b();
        }
        ij5 ij5Var = this.b;
        if (ij5Var != null) {
            ij5Var.a();
        }
        nj5 nj5Var = this.a;
        if (nj5Var != null) {
            nj5Var.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return w0h1.P(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        nj5 nj5Var = this.a;
        if (nj5Var != null) {
            return nj5Var.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        nj5 nj5Var = this.a;
        if (nj5Var != null) {
            return nj5Var.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.l();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.m();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        xzn1.G(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        nj5 nj5Var = this.a;
        if (nj5Var != null) {
            if (nj5Var.f) {
                nj5Var.f = false;
            } else {
                nj5Var.f = true;
                nj5Var.a();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(w0h1.Q(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        nj5 nj5Var = this.a;
        if (nj5Var != null) {
            nj5Var.b = colorStateList;
            nj5Var.d = true;
            nj5Var.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        nj5 nj5Var = this.a;
        if (nj5Var != null) {
            nj5Var.c = mode;
            nj5Var.e = true;
            nj5Var.a();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        bl5 bl5Var = this.c;
        if (bl5Var != null) {
            bl5Var.p(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(f0o1.j(getContext(), i));
    }

    public mj5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968950);
    }
}
