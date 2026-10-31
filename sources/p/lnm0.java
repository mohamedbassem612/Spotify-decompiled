package p;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lnm0 {
    public final jv81 a = new jv81(0);
    public final jv81 b = new jv81(0);

    public static lnm0 a(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return b(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    public static lnm0 b(ArrayList arrayList) {
        lnm0 lnm0Var = new lnm0();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                hhg1.g(animator, "Animator must be an ObjectAnimator: ");
                return null;
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            lnm0Var.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            gl10 interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = je5.b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = je5.c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = je5.d;
            }
            nnm0 nnm0Var = new nnm0();
            nnm0Var.d = 0;
            nnm0Var.e = 1;
            nnm0Var.a = startDelay;
            nnm0Var.b = duration;
            nnm0Var.c = interpolator;
            nnm0Var.d = objectAnimator.getRepeatCount();
            nnm0Var.e = objectAnimator.getRepeatMode();
            lnm0Var.a.put(propertyName, nnm0Var);
        }
        return lnm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lnm0) {
            return this.a.equals(((lnm0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + lnm0.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
