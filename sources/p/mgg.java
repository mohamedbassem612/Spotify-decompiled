package p;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mgg extends mzx {
    public final p96 e;
    public final x29 f;
    public final igg g;
    public final jgg h;
    public AnimatorSet i;
    public ValueAnimator j;

    public mgg(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.e = new p96(this, (byte) 4);
        this.f = new x29((Object) this, (byte) 2);
        this.g = new igg(this, (byte) 0);
        this.h = new jgg(this, (byte) 0);
    }

    @Override // p.mzx
    public final void a() {
        int i = this.d;
        if (i == 0) {
            i = 2131233696;
        }
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconDrawable(i);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(2131953914));
        textInputLayout.setEndIconOnClickListener(new c20(this, (byte) 18));
        LinkedHashSet linkedHashSet = textInputLayout.F1;
        igg iggVar = this.g;
        linkedHashSet.add(iggVar);
        if (textInputLayout.e != null) {
            iggVar.a(textInputLayout);
        }
        textInputLayout.J1.add(this.h);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(je5.d);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new lgg(this, (byte) 1));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = je5.a;
        valueAnimatorOfFloat2.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat2.setDuration(100L);
        valueAnimatorOfFloat2.addUpdateListener(new lgg(this, (byte) 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.i = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.i.addListener(new kgg(this, (byte) 0));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat3.setDuration(100L);
        valueAnimatorOfFloat3.addUpdateListener(new lgg(this, (byte) 0));
        this.j = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new kgg(this, (byte) 1));
    }

    @Override // p.mzx
    public final void c(boolean z) {
        if (this.a.getSuffixText() == null) {
            return;
        }
        d(z);
    }

    public final void d(boolean z) {
        boolean z2 = this.a.g() == z;
        if (z && !this.i.isRunning()) {
            this.j.cancel();
            this.i.start();
            if (z2) {
                this.i.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.i.cancel();
        this.j.start();
        if (z2) {
            this.j.end();
        }
    }

    public final boolean e() {
        EditText editText = this.a.getEditText();
        if (editText != null) {
            return (editText.hasFocus() || this.c.hasFocus()) && editText.getText().length() > 0;
        }
        return false;
    }
}
