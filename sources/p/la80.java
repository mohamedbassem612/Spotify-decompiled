package p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class la80 {
    public final Context a;
    public final TextInputLayout b;
    public LinearLayout c;
    public int d;
    public FrameLayout e;
    public AnimatorSet f;
    public final float g;
    public byte h;
    public byte i;
    public CharSequence j;
    public boolean k;
    public AppCompatTextView l;
    public CharSequence m;
    public int n;
    public ColorStateList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f21p;
    public boolean q;
    public AppCompatTextView r;
    public int s;
    public ColorStateList t;
    public Typeface u;

    public la80(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.a = context;
        this.b = textInputLayout;
        this.g = context.getResources().getDimensionPixelSize(2131165679);
    }

    public final void a(AppCompatTextView appCompatTextView, int i) {
        if (this.c == null && this.e == null) {
            Context context = this.a;
            LinearLayout linearLayout = new LinearLayout(context);
            this.c = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.c;
            TextInputLayout textInputLayout = this.b;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.e = new FrameLayout(context);
            this.c.addView(this.e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.e.setVisibility(0);
            this.e.addView(appCompatTextView);
        } else {
            this.c.addView((View) appCompatTextView, (ViewGroup.LayoutParams) new LinearLayout.LayoutParams(-2, -2));
        }
        this.c.setVisibility(0);
        this.d++;
    }

    public final void b() {
        if (this.c != null) {
            TextInputLayout textInputLayout = this.b;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.a;
                boolean zN = dgo1.n(context);
                LinearLayout linearLayout = this.c;
                WeakHashMap weakHashMap = b8k1.a;
                int paddingStart = editText.getPaddingStart();
                if (zN) {
                    paddingStart = context.getResources().getDimensionPixelSize(2131166440);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166439);
                if (zN) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166441);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zN) {
                    paddingEnd = context.getResources().getDimensionPixelSize(2131166440);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z, AppCompatTextView appCompatTextView, int i, int i2, int i3) {
        if (appCompatTextView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, i3 == i ? 1.0f : 0.0f);
            objectAnimatorOfFloat.setDuration(167L);
            objectAnimatorOfFloat.setInterpolator(je5.a);
            arrayList.add(objectAnimatorOfFloat);
            if (i3 == i) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.g, 0.0f);
                objectAnimatorOfFloat2.setDuration(217L);
                objectAnimatorOfFloat2.setInterpolator(je5.d);
                arrayList.add(objectAnimatorOfFloat2);
            }
        }
    }

    public final boolean e() {
        return (this.i != 1 || this.l == null || TextUtils.isEmpty(this.j)) ? false : true;
    }

    public final TextView f(int i) {
        if (i == 1) {
            return this.l;
        }
        if (i != 2) {
            return null;
        }
        return this.r;
    }

    public final void g() {
        this.j = null;
        c();
        if (this.h == 1) {
            if (!this.q || TextUtils.isEmpty(this.f21p)) {
                this.i = (byte) 0;
            } else {
                this.i = (byte) 2;
            }
        }
        j(this.h, this.i, i(this.l, null));
    }

    public final void h(AppCompatTextView appCompatTextView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.c;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.e) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i2 = this.d - 1;
        this.d = i2;
        LinearLayout linearLayout2 = this.c;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean i(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        WeakHashMap weakHashMap = b8k1.a;
        TextInputLayout textInputLayout = this.b;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.i == this.h && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(int i, int i2, boolean z) {
        TextView textViewF;
        TextView textViewF2;
        la80 la80Var = this;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            la80Var.f = animatorSet;
            ArrayList arrayList = new ArrayList();
            la80Var.d(arrayList, la80Var.q, la80Var.r, 2, i, i2);
            la80Var.d(arrayList, la80Var.k, la80Var.l, 1, i, i2);
            int size = arrayList.size();
            long jMax = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            ka80 ka80Var = new ka80(this, i2, f(i), i, la80Var.f(i2));
            la80Var = this;
            animatorSet.addListener(ka80Var);
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewF2 = la80Var.f(i2)) != null) {
                textViewF2.setVisibility(0);
                textViewF2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewF = f(i)) != null) {
                textViewF.setVisibility(4);
                if (i == 1) {
                    textViewF.setText((CharSequence) null);
                }
            }
            la80Var.h = i2;
        }
        TextInputLayout textInputLayout = la80Var.b;
        textInputLayout.q();
        textInputLayout.s(z, false);
        textInputLayout.z();
    }
}
