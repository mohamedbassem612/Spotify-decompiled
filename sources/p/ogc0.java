package p;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ogc0 extends tjk1 {
    public static final DecelerateInterpolator i1 = new DecelerateInterpolator();
    public static final AccelerateInterpolator j1 = new AccelerateInterpolator();
    public static final ngc0 k1 = new ngc0((byte) 1);
    public static final ngc0 l1 = new ngc0((byte) 3);
    public static final mgc0 m1 = new mgc0((byte) 1);
    public static final ngc0 n1 = new ngc0((byte) 2);
    public static final ngc0 o1 = new ngc0((byte) 0);
    public static final mgc0 p1 = new mgc0((byte) 0);
    public final lgc0 h1;

    public ogc0(int i) {
        lgc0 lgc0Var;
        if (i == 3) {
            lgc0Var = k1;
        } else if (i == 5) {
            lgc0Var = n1;
        } else if (i == 48) {
            lgc0Var = m1;
        } else if (i == 80) {
            lgc0Var = p1;
        } else if (i == 8388611) {
            lgc0Var = l1;
        } else {
            if (i != 8388613) {
                eg.m("Invalid slide direction");
                throw null;
            }
            lgc0Var = o1;
        }
        this.h1 = lgc0Var;
        ij81 ij81Var = new ij81();
        ij81Var.b = i;
        ((jhg1) this).V0 = ij81Var;
    }

    public final ObjectAnimator V(ViewGroup viewGroup, View view, omg1 omg1Var, omg1 omg1Var2) {
        if (omg1Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) omg1Var2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        lgc0 lgc0Var = this.h1;
        ArrayList arrayList = ((jhg1) this).f;
        return m5n1.k(view, omg1Var2, iArr[0], iArr[1], lgc0Var.a(viewGroup, arrayList, view), lgc0Var.b(viewGroup, arrayList, view), translationX, translationY, i1, this);
    }

    public final ObjectAnimator W(ViewGroup viewGroup, View view, omg1 omg1Var, omg1 omg1Var2) {
        if (omg1Var == null) {
            return null;
        }
        int[] iArr = (int[]) omg1Var.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        lgc0 lgc0Var = this.h1;
        ArrayList arrayList = ((jhg1) this).f;
        return m5n1.k(view, omg1Var, iArr[0], iArr[1], translationX, translationY, lgc0Var.a(viewGroup, arrayList, view), lgc0Var.b(viewGroup, arrayList, view), j1, this);
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
