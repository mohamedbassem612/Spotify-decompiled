package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p.al5;
import p.amv0;
import p.bl5;
import p.cl5;
import p.dl5;
import p.el5;
import p.f0o1;
import p.fk5;
import p.hhg1;
import p.ij5;
import p.jj5;
import p.k9;
import p.kfe1;
import p.kr60;
import p.no80;
import p.pze0;
import p.s1h1;
import p.sf;
import p.sik1;
import p.tx8;
import p.w0h1;
import p.w5w;
import p.wk5;
import p.xzn1;
import p.zlv0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class AppCompatTextView extends TextView implements tx8 {
    private final ij5 a;
    private final bl5 b;
    private final wk5 c;
    private fk5 d;
    public boolean e;
    public kr60 f;
    public Future g;
    public al5 h;

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = false;
        this.f = null;
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
    public int getAutoSizeMaxTextSize() {
        if (sik1.c) {
            return getSuperCaller().f();
        }
        bl5 bl5Var = this.b;
        if (bl5Var != null) {
            return bl5Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (sik1.c) {
            return getSuperCaller().g();
        }
        bl5 bl5Var = this.b;
        if (bl5Var != null) {
            return bl5Var.h();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (sik1.c) {
            return getSuperCaller().i();
        }
        bl5 bl5Var = this.b;
        if (bl5Var != null) {
            return bl5Var.i();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (sik1.c) {
            return getSuperCaller().j();
        }
        bl5 bl5Var = this.b;
        return bl5Var != null ? bl5Var.j() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (sik1.c) {
            return getSuperCaller().k() == 1 ? 1 : 0;
        }
        bl5 bl5Var = this.b;
        if (bl5Var != null) {
            return bl5Var.k();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return w0h1.P(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().a();
    }

    public al5 getFontVariationSettingsManager() {
        al5 al5Var = this.h;
        if (al5Var != null) {
            return al5Var;
        }
        al5 al5Var2 = new al5(this, new jj5(this, (byte) 2));
        this.h = al5Var2;
        return al5Var2;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public cl5 getSuperCaller() {
        kr60 kr60Var = this.f;
        if (kr60Var != null) {
            return kr60Var;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            el5 el5Var = new el5(this);
            this.f = el5Var;
            return el5Var;
        }
        if (i >= 28) {
            kr60 dl5Var = new dl5(this);
            this.f = dl5Var;
            return dl5Var;
        }
        if (i < 26) {
            return kr60Var;
        }
        kr60 kr60Var2 = new kr60(this, (byte) 19);
        this.f = kr60Var2;
        return kr60Var2;
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
    public CharSequence getText() {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                pze0.m(future.get());
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                w0h1.t(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        wk5 wk5Var;
        if (Build.VERSION.SDK_INT >= 28 || (wk5Var = this.c) == null) {
            return getSuperCaller().l();
        }
        TextClassifier textClassifier = wk5Var.b;
        return textClassifier == null ? no80.w(wk5Var.a) : textClassifier;
    }

    public zlv0 getTextMetricsParamsCompat() {
        return w0h1.t(this);
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().b() : super.getTypeface();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            w5w.d(editorInfo, getText());
        }
        xzn1.G(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        bl5 bl5Var = this.b;
        if (bl5Var == null || sik1.c) {
            return;
        }
        bl5Var.e();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                pze0.m(future.get());
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                w0h1.t(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        bl5 bl5Var = this.b;
        if (bl5Var == null || sik1.c || !bl5Var.n()) {
            return;
        }
        this.b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView, p.tx8
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (sik1.c) {
            getSuperCaller().m(i, i2, i3, i4);
            return;
        }
        bl5 bl5Var = this.b;
        if (bl5Var != null) {
            bl5Var.q(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (sik1.c) {
            getSuperCaller().n(iArr, i);
            return;
        }
        bl5 bl5Var = this.b;
        if (bl5Var != null) {
            bl5Var.r(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (sik1.c) {
            getSuperCaller().o(i);
            return;
        }
        bl5 bl5Var = this.b;
        if (bl5Var != null) {
            bl5Var.s(i);
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? f0o1.j(context, i) : null, i2 != 0 ? f0o1.j(context, i2) : null, i3 != 0 ? f0o1.j(context, i3) : null, i4 != 0 ? f0o1.j(context, i4) : null);
        bl5 bl5Var = this.b;
        if (bl5Var != null) {
            bl5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? f0o1.j(context, i) : null, i2 != 0 ? f0o1.j(context, i2) : null, i3 != 0 ? f0o1.j(context, i3) : null, i4 != 0 ? f0o1.j(context, i4) : null);
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
        getEmojiTextViewHelper().e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i);
        } else {
            w0h1.I(this, i);
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().c(str);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i);
        } else {
            w0h1.J(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().b(i, f);
        } else if (i2 >= 34) {
            sf.O(this, i, f);
        } else {
            w0h1.K(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(amv0 amv0Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        w0h1.t(this);
        throw null;
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
            getSuperCaller().p(textClassifier);
        } else {
            wk5Var.b = textClassifier;
        }
    }

    public void setTextFuture(Future<amv0> future) {
        this.g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(zlv0 zlv0Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristicC = zlv0Var.c();
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristicC != textDirectionHeuristic2 && textDirectionHeuristicC != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristicC == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristicC == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristicC == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristicC == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristicC == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristicC == textDirectionHeuristic2) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(zlv0Var.d());
        setBreakStrategy(zlv0Var.a());
        setHyphenationFrequency(zlv0Var.b());
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        if (sik1.c) {
            super.setTextSize(i, f);
            return;
        }
        bl5 bl5Var = this.b;
        if (bl5Var != null) {
            bl5Var.v(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.e) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            k9 k9Var = s1h1.a;
            if (context == null) {
                hhg1.n("Context cannot be null");
                return;
            }
            typeface = Typeface.create(typeface, i);
        }
        this.e = true;
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        w0h1.K(this, i);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 26) {
            getFontVariationSettingsManager().d(typeface);
        } else {
            super.setTypeface(typeface);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        bl5 bl5Var = this.b;
        if (bl5Var != null) {
            bl5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        bl5 bl5Var = this.b;
        if (bl5Var != null) {
            bl5Var.b();
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }
}
