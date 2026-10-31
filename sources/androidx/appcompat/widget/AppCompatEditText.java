package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import p.al5;
import p.b0o1;
import p.b8k1;
import p.bl5;
import p.dk5;
import p.ek5;
import p.f7p1;
import p.ij5;
import p.jj5;
import p.kfe1;
import p.no80;
import p.w0h1;
import p.w5w;
import p.wk5;
import p.xzn1;
import p.zee1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class AppCompatEditText extends EditText {
    private final ij5 a;
    private final bl5 b;
    private final wk5 c;
    public final zee1 d;
    private final ek5 e;
    public dk5 f;
    public al5 g;

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kfe1.a(getContext(), this);
        ij5 ij5Var = new ij5(this);
        this.a = ij5Var;
        ij5Var.d(attributeSet, i);
        bl5 bl5Var = new bl5(this);
        this.b = bl5Var;
        bl5Var.o(attributeSet, i);
        bl5Var.b();
        wk5 wk5Var = new wk5();
        wk5Var.a = this;
        this.c = wk5Var;
        this.d = new zee1();
        ek5 ek5Var = new ek5(this);
        this.e = ek5Var;
        ek5Var.c(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (ek5.b(keyListener)) {
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
    }

    private dk5 getSuperCaller() {
        dk5 dk5Var = this.f;
        if (dk5Var != null) {
            return dk5Var;
        }
        dk5 dk5Var2 = new dk5(this);
        this.f = dk5Var2;
        return dk5Var2;
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

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().a();
    }

    public al5 getFontVariationSettingsManager() {
        al5 al5Var = this.g;
        if (al5Var != null) {
            return al5Var;
        }
        al5 al5Var2 = new al5(this, new jj5(this, (byte) 1));
        this.g = al5Var2;
        return al5Var2;
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        wk5 wk5Var;
        if (Build.VERSION.SDK_INT >= 28 || (wk5Var = this.c) == null) {
            return getSuperCaller().a();
        }
        TextClassifier textClassifier = wk5Var.b;
        return textClassifier == null ? no80.w(wk5Var.a) : textClassifier;
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().b() : super.getTypeface();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrG;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            w5w.d(editorInfo, getText());
        }
        xzn1.G(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrG = b8k1.g(this)) != null) {
            w5w.c(editorInfo, strArrG);
            inputConnectionOnCreateInputConnection = f7p1.i(this, inputConnectionOnCreateInputConnection, editorInfo);
        }
        return this.e.d(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        if (b0o1.g(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (b0o1.h(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
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

    public void setEmojiCompatEnabled(boolean z) {
        this.e.e(z);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().c(str);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.a(keyListener));
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
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        bl5 bl5Var = this.b;
        if (bl5Var != null) {
            bl5Var.p(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        wk5 wk5Var;
        if (Build.VERSION.SDK_INT >= 28 || (wk5Var = this.c) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            wk5Var.b = textClassifier;
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 26) {
            getFontVariationSettingsManager().d(typeface);
        } else {
            super.setTypeface(typeface);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969184);
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }
}
