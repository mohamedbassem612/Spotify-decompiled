package p;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jav extends mzx {
    public final gav e;
    public final x29 f;
    public final hav g;
    public final igg h;
    public final jgg i;
    public boolean j;
    public boolean k;
    public long l;
    public StateListDrawable m;
    public gch0 n;
    public AccessibilityManager o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ValueAnimator f16p;
    public ValueAnimator q;

    public jav(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.e = new gav(this, (byte) 0);
        this.f = new x29((Object) this, (byte) 7);
        this.g = new hav(this, textInputLayout);
        this.h = new igg(this, (byte) 1);
        this.i = new jgg(this, (byte) 1);
        this.j = false;
        this.k = false;
        this.l = Long.MAX_VALUE;
    }

    @Override // p.mzx
    public final void a() {
        Context context = this.b;
        float dimensionPixelOffset = context.getResources().getDimensionPixelOffset(2131166698);
        float dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(2131166631);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(2131166633);
        Drawable drawableD = d(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        Drawable drawableD2 = d(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.n = drawableD;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.m = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, drawableD);
        this.m.addState(new int[0], drawableD2);
        int i = this.d;
        if (i == 0) {
            i = 2131233693;
        }
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconDrawable(i);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(2131955849));
        textInputLayout.setEndIconOnClickListener(new zfs(this, (byte) 4));
        LinkedHashSet linkedHashSet = textInputLayout.F1;
        igg iggVar = this.h;
        linkedHashSet.add(iggVar);
        if (textInputLayout.e != null) {
            iggVar.a(textInputLayout);
        }
        textInputLayout.J1.add(this.i);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = je5.a;
        valueAnimatorOfFloat.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat.setDuration(67L);
        valueAnimatorOfFloat.addUpdateListener(new kb5(this, (byte) 8));
        this.q = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat2.setDuration(50L);
        valueAnimatorOfFloat2.addUpdateListener(new kb5(this, (byte) 8));
        this.f16p = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new d20(this, (byte) 4));
        this.o = (AccessibilityManager) context.getSystemService("accessibility");
    }

    @Override // p.mzx
    public final boolean b(int i) {
        return i != 0;
    }

    public final gch0 d(float f, float f2, float f3, int i) {
        gr31 gr31Var = new gr31();
        gr31 gr31Var2 = new gr31();
        gr31 gr31Var3 = new gr31();
        gr31 gr31Var4 = new gr31();
        fmv fmvVar = new fmv((byte) 0);
        fmv fmvVar2 = new fmv((byte) 0);
        fmv fmvVar3 = new fmv((byte) 0);
        fmv fmvVar4 = new fmv((byte) 0);
        k5 k5Var = new k5(f);
        k5 k5Var2 = new k5(f);
        k5 k5Var3 = new k5(f2);
        k5 k5Var4 = new k5(f2);
        iw61 iw61Var = new iw61();
        iw61Var.a = gr31Var;
        iw61Var.b = gr31Var2;
        iw61Var.c = gr31Var3;
        iw61Var.d = gr31Var4;
        iw61Var.e = k5Var;
        iw61Var.f = k5Var2;
        iw61Var.g = k5Var4;
        iw61Var.h = k5Var3;
        iw61Var.i = fmvVar;
        iw61Var.j = fmvVar2;
        iw61Var.k = fmvVar3;
        iw61Var.l = fmvVar4;
        Paint paint = gch0.W0;
        String simpleName = gch0.class.getSimpleName();
        Context context = this.b;
        int iQ = xfo1.q(2130969040, context, simpleName);
        gch0 gch0Var = new gch0();
        gch0Var.j(context);
        gch0Var.m(ColorStateList.valueOf(iQ));
        gch0Var.l(f3);
        gch0Var.setShapeAppearanceModel(iw61Var);
        fch0 fch0Var = gch0Var.a;
        if (fch0Var.g == null) {
            fch0Var.g = new Rect();
        }
        gch0Var.a.g.set(0, i, 0, i);
        gch0Var.invalidateSelf();
        return gch0Var;
    }

    public final void e(boolean z) {
        if (this.k != z) {
            this.k = z;
            this.q.cancel();
            this.f16p.start();
        }
    }

    public final void f(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.l;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.j = false;
        }
        if (this.j) {
            this.j = false;
            return;
        }
        e(!this.k);
        if (!this.k) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }
}
