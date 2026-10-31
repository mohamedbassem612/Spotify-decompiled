package p;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class tjk1 extends jhg1 {
    public static final String[] g1 = {"android:visibility:visibility", "android:visibility:parent"};
    public byte f1 = 3;

    public static void T(omg1 omg1Var) {
        View view = omg1Var.b;
        int visibility = view.getVisibility();
        HashMap map = omg1Var.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static rjk1 U(omg1 omg1Var, omg1 omg1Var2) {
        rjk1 rjk1Var = new rjk1();
        rjk1Var.a = false;
        rjk1Var.b = false;
        if (omg1Var != null) {
            HashMap map = omg1Var.a;
            if (map.containsKey("android:visibility:visibility")) {
                rjk1Var.c = ((Integer) map.get("android:visibility:visibility")).intValue();
                rjk1Var.e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                rjk1Var.c = -1;
                rjk1Var.e = null;
            }
        } else {
            rjk1Var.c = -1;
            rjk1Var.e = null;
        }
        if (omg1Var2 != null) {
            HashMap map2 = omg1Var2.a;
            if (map2.containsKey("android:visibility:visibility")) {
                rjk1Var.d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                rjk1Var.f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                rjk1Var.d = -1;
                rjk1Var.f = null;
            }
        } else {
            rjk1Var.d = -1;
            rjk1Var.f = null;
        }
        if (omg1Var != null && omg1Var2 != null) {
            int i = rjk1Var.c;
            int i2 = rjk1Var.d;
            if (i != i2 || rjk1Var.e != rjk1Var.f) {
                if (i != i2) {
                    if (i == 0) {
                        rjk1Var.b = false;
                        rjk1Var.a = true;
                        return rjk1Var;
                    }
                    if (i2 == 0) {
                        rjk1Var.b = true;
                        rjk1Var.a = true;
                        return rjk1Var;
                    }
                } else {
                    if (rjk1Var.f == null) {
                        rjk1Var.b = false;
                        rjk1Var.a = true;
                        return rjk1Var;
                    }
                    if (rjk1Var.e == null) {
                        rjk1Var.b = true;
                        rjk1Var.a = true;
                        return rjk1Var;
                    }
                }
            }
        } else {
            if (omg1Var == null && rjk1Var.d == 0) {
                rjk1Var.b = true;
                rjk1Var.a = true;
                return rjk1Var;
            }
            if (omg1Var2 == null && rjk1Var.c == 0) {
                rjk1Var.b = false;
                rjk1Var.a = true;
            }
        }
        return rjk1Var;
    }

    @Override // p.jhg1
    public final boolean A(omg1 omg1Var, omg1 omg1Var2) {
        if (omg1Var == null && omg1Var2 == null) {
            return false;
        }
        if (omg1Var != null && omg1Var2 != null && omg1Var2.a.containsKey("android:visibility:visibility") != omg1Var.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        rjk1 rjk1VarU = U(omg1Var, omg1Var2);
        if (rjk1VarU.a) {
            return rjk1VarU.c == 0 || rjk1VarU.d == 0;
        }
        return false;
    }

    public abstract ObjectAnimator V(ViewGroup viewGroup, View view, omg1 omg1Var, omg1 omg1Var2);

    public abstract ObjectAnimator W(ViewGroup viewGroup, View view, omg1 omg1Var, omg1 omg1Var2);

    @Override // p.jhg1
    public void e(omg1 omg1Var) {
        T(omg1Var);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (U(t(r1, false), x(r1, false)).a != false) goto L77;
     */
    @Override // p.jhg1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator n(android.view.ViewGroup r13, p.omg1 r14, p.omg1 r15) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tjk1.n(android.view.ViewGroup, p.omg1, p.omg1):android.animation.Animator");
    }

    @Override // p.jhg1
    public final String[] w() {
        return g1;
    }
}
