package p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class rce extends jhg1 {
    public static final String[] f1 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final nce g1 = new nce((byte) 0);
    public static final nce h1 = new nce((byte) 1);
    public static final nce i1 = new nce((byte) 2);
    public static final nce j1 = new nce((byte) 3);
    public static final nce k1 = new nce((byte) 4);

    public static void T(omg1 omg1Var) {
        View view = omg1Var.b;
        HashMap map = omg1Var.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // p.jhg1
    public Animator n(ViewGroup viewGroup, omg1 omg1Var, omg1 omg1Var2) {
        int i;
        rce rceVar;
        Animator animatorV;
        if (omg1Var == null) {
            return null;
        }
        HashMap map = omg1Var.a;
        if (omg1Var2 == null) {
            return null;
        }
        HashMap map2 = omg1Var2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = omg1Var2.b;
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        rik1.a(view, i2, i4, i6, i8);
        if (i14 != 2) {
            rceVar = this;
            if (i2 == i3 && i4 == i5) {
                rceVar.X0.getClass();
                animatorV = j7p1.v(view, i1, gtv0.i(i6, i8, i7, i9));
            } else {
                rceVar.X0.getClass();
                animatorV = j7p1.v(view, j1, gtv0.i(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            rceVar = this;
            rceVar.X0.getClass();
            animatorV = j7p1.v(view, k1, gtv0.i(i2, i4, i3, i5));
        } else {
            rceVar = this;
            qce qceVar = new qce(view);
            rceVar.X0.getClass();
            ObjectAnimator objectAnimatorV = j7p1.v(qceVar, g1, gtv0.i(i2, i4, i3, i5));
            rceVar.X0.getClass();
            ObjectAnimator objectAnimatorV2 = j7p1.v(qceVar, h1, gtv0.i(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorV, objectAnimatorV2);
            animatorSet.addListener(new oce(qceVar));
            animatorV = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            mno1.x(viewGroup4, true);
            rceVar.u().a(new pce(viewGroup4));
        }
        return animatorV;
    }

    @Override // p.jhg1
    public final String[] w() {
        return f1;
    }

    @Override // p.jhg1
    public final boolean z() {
        return true;
    }
}
