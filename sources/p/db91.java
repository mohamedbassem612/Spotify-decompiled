package p;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class db91 extends tjk1 {
    public static final DecelerateInterpolator i1 = new DecelerateInterpolator();
    public static final AccelerateInterpolator j1 = new AccelerateInterpolator();
    public static final ab91 k1 = new ab91((byte) 0);
    public static final ab91 l1 = new ab91((byte) 1);
    public static final bb91 m1 = new bb91((byte) 0);
    public static final ab91 n1 = new ab91((byte) 2);
    public static final ab91 o1 = new ab91((byte) 3);
    public static final bb91 p1 = new bb91((byte) 1);
    public cb91 h1 = p1;

    public db91(int i) {
        X(i);
    }

    public final ObjectAnimator V(ViewGroup viewGroup, View view, omg1 omg1Var, omg1 omg1Var2) {
        if (omg1Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) omg1Var2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return m5n1.k(view, omg1Var2, iArr[0], iArr[1], this.h1.a(view, viewGroup), this.h1.b(view, viewGroup), translationX, translationY, i1, this);
    }

    public final ObjectAnimator W(ViewGroup viewGroup, View view, omg1 omg1Var, omg1 omg1Var2) {
        if (omg1Var == null) {
            return null;
        }
        int[] iArr = (int[]) omg1Var.a.get("android:slide:screenPosition");
        return m5n1.k(view, omg1Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.h1.a(view, viewGroup), this.h1.b(view, viewGroup), j1, this);
    }

    public final void X(int i) {
        if (i == 3) {
            this.h1 = k1;
        } else if (i == 5) {
            this.h1 = n1;
        } else if (i == 48) {
            this.h1 = m1;
        } else if (i == 80) {
            this.h1 = p1;
        } else if (i == 8388611) {
            this.h1 = l1;
        } else {
            if (i != 8388613) {
                hhg1.n("Invalid slide direction");
                return;
            }
            this.h1 = o1;
        }
        ij81 ij81Var = new ij81();
        ij81Var.b = i;
        ((jhg1) this).V0 = ij81Var;
    }

    public final void e(omg1 omg1Var) {
        tjk1.T(omg1Var);
        int[] iArr = new int[2];
        omg1Var.b.getLocationOnScreen(iArr);
        omg1Var.a.put("android:slide:screenPosition", iArr);
    }

    public final void i(omg1 omg1Var) {
        tjk1.T(omg1Var);
        int[] iArr = new int[2];
        omg1Var.b.getLocationOnScreen(iArr);
        omg1Var.a.put("android:slide:screenPosition", iArr);
    }
}
