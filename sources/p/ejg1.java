package p;

import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ejg1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public jhg1 a;
    public ViewGroup b;

    /* JADX WARN: Code duplicated, block: B:100:0x020d  */
    /* JADX WARN: Code duplicated, block: B:102:0x021b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0227  */
    /* JADX WARN: Code duplicated, block: B:107:0x023e  */
    /* JADX WARN: Code duplicated, block: B:139:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:141:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:147:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:149:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e5 A[EDGE_INSN: B:152:0x01e5->B:90:0x01e5 BREAK  A[LOOP:1: B:19:0x0087->B:89:0x01de], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[LOOP:0: B:15:0x0052->B:17:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:49:0x010e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0151  */
    /* JADX WARN: Code duplicated, block: B:64:0x0160  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fa  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        hce1 hce1Var;
        hce1 hce1Var2;
        y36 y36Var;
        y36 y36Var2;
        int i2;
        int[] iArr;
        boolean z;
        int i3;
        int i4;
        y36 y36VarV;
        ArrayList arrayList2;
        int i5;
        int i6;
        jhg1 jhg1Var;
        Animator animator;
        xgg1 xgg1Var;
        omg1 omg1Var;
        omg1 omg1Var2;
        int i7;
        boolean z2;
        int i8;
        View view;
        omg1 omg1Var3;
        y36 y36Var3;
        int i9;
        int i10;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i11;
        View view4;
        View view5;
        q5f0 q5f0Var;
        int i12;
        int i13;
        View view6;
        boolean z3;
        Iterator it;
        jhg1 jhg1Var2 = this.a;
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z4 = true;
        if (!fjg1.c.remove(viewGroup)) {
            return true;
        }
        y36 y36VarC = fjg1.c();
        ArrayList arrayList3 = (ArrayList) y36VarC.get(viewGroup);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            arrayList3.add(jhg1Var2);
            jhg1Var2.a(new djg1(this, y36VarC));
            i = 0;
            jhg1Var2.j(viewGroup, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((jhg1) it.next()).I(viewGroup);
                }
            }
            jhg1Var2.X = new ArrayList();
            jhg1Var2.Y = new ArrayList();
            hce1Var = jhg1Var2.g;
            hce1Var2 = jhg1Var2.h;
            y36Var = new y36((y36) hce1Var.b);
            y36Var2 = new y36((y36) hce1Var2.b);
            i2 = 0;
            while (true) {
                iArr = jhg1Var2.t;
                if (i2 < iArr.length) {
                    break;
                }
                i7 = iArr[i2];
                if (i7 != z4) {
                    z2 = z4;
                    for (i8 = y36Var.c - 1; i8 >= 0; i8--) {
                        view = (View) y36Var.f(i8);
                        if (view == null && jhg1Var2.B(view) && (omg1Var3 = (omg1) y36Var2.remove(view)) != null && jhg1Var2.B(omg1Var3.b)) {
                            jhg1Var2.X.add((omg1) y36Var.g(i8));
                            jhg1Var2.Y.add(omg1Var3);
                        }
                    }
                } else if (i7 != 2) {
                    z2 = z4;
                    y36Var3 = (y36) hce1Var.e;
                    y36 y36Var4 = (y36) hce1Var2.e;
                    i9 = y36Var3.c;
                    for (i10 = 0; i10 < i9; i10++) {
                        view2 = (View) y36Var3.i(i10);
                        if (view2 == null && jhg1Var2.B(view2) && (view3 = (View) y36Var4.get((String) y36Var3.f(i10))) != null && jhg1Var2.B(view3)) {
                            omg1 omg1Var4 = (omg1) y36Var.get(view2);
                            omg1 omg1Var5 = (omg1) y36Var2.get(view3);
                            if (omg1Var4 != null && omg1Var5 != null) {
                                jhg1Var2.X.add(omg1Var4);
                                jhg1Var2.Y.add(omg1Var5);
                                y36Var.remove(view2);
                                y36Var2.remove(view3);
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 4) {
                        q5f0Var = (q5f0) hce1Var.d;
                        q5f0 q5f0Var2 = (q5f0) hce1Var2.d;
                        i12 = q5f0Var.i();
                        i13 = i;
                        while (i13 < i12) {
                            view6 = (View) q5f0Var.j(i13);
                            if (view6 == null && jhg1Var2.B(view6)) {
                                boolean z5 = z4;
                                View view7 = (View) q5f0Var2.b(q5f0Var.e(i13));
                                if (view7 == null || !jhg1Var2.B(view7)) {
                                    z3 = z5;
                                } else {
                                    omg1 omg1Var6 = (omg1) y36Var.get(view6);
                                    z3 = z5;
                                    omg1 omg1Var7 = (omg1) y36Var2.get(view7);
                                    if (omg1Var6 != null && omg1Var7 != null) {
                                        jhg1Var2.X.add(omg1Var6);
                                        jhg1Var2.Y.add(omg1Var7);
                                        y36Var.remove(view6);
                                        y36Var2.remove(view7);
                                    }
                                }
                            } else {
                                z3 = z4;
                            }
                            i13++;
                            z4 = z3;
                        }
                    }
                    z2 = z4;
                } else {
                    z2 = z4;
                    sparseArray = (SparseArray) hce1Var.c;
                    SparseArray sparseArray2 = (SparseArray) hce1Var2.c;
                    size = sparseArray.size();
                    for (i11 = 0; i11 < size; i11++) {
                        view4 = (View) sparseArray.valueAt(i11);
                        if (view4 == null && jhg1Var2.B(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i11))) != null && jhg1Var2.B(view5)) {
                            omg1 omg1Var8 = (omg1) y36Var.get(view4);
                            omg1 omg1Var9 = (omg1) y36Var2.get(view5);
                            if (omg1Var8 != null && omg1Var9 != null) {
                                jhg1Var2.X.add(omg1Var8);
                                jhg1Var2.Y.add(omg1Var9);
                                y36Var.remove(view4);
                                y36Var2.remove(view5);
                            }
                        }
                    }
                }
                i2++;
                i = 0;
                z4 = z2;
            }
            z = z4;
            for (i3 = 0; i3 < y36Var.c; i3++) {
                omg1Var2 = (omg1) y36Var.i(i3);
                if (jhg1Var2.B(omg1Var2.b)) {
                    jhg1Var2.X.add(omg1Var2);
                    jhg1Var2.Y.add(null);
                }
            }
            for (i4 = 0; i4 < y36Var2.c; i4++) {
                omg1Var = (omg1) y36Var2.i(i4);
                if (jhg1Var2.B(omg1Var.b)) {
                    jhg1Var2.Y.add(omg1Var);
                    jhg1Var2.X.add(null);
                }
            }
            y36VarV = jhg1.v();
            int i14 = y36VarV.c;
            WindowId windowId = viewGroup.getWindowId();
            arrayList2 = new ArrayList();
            i5 = i14 - 1;
            while (i5 >= 0) {
                animator = (Animator) y36VarV.f(i5);
                if (animator == null && (xgg1Var = (xgg1) y36VarV.get(animator)) != null) {
                    jhg1 jhg1Var3 = xgg1Var.e;
                    View view8 = xgg1Var.a;
                    if (view8 != null && Objects.equals(windowId, xgg1Var.d)) {
                        omg1 omg1Var10 = xgg1Var.c;
                        boolean z6 = z;
                        omg1 omg1VarX = jhg1Var2.x(view8, z6);
                        omg1 omg1VarT = jhg1Var2.t(view8, z6);
                        if (omg1VarX == null && omg1VarT == null) {
                            omg1VarT = (omg1) ((y36) jhg1Var2.h.b).get(view8);
                        }
                        if ((omg1VarX != null || omg1VarT != null) && jhg1Var3.A(omg1Var10, omg1VarT)) {
                            jhg1 jhg1VarU = jhg1Var3.u();
                            ArrayList arrayList4 = jhg1Var3.N0;
                            if (jhg1VarU.Z0 != null) {
                                animator.cancel();
                                arrayList4.remove(animator);
                                y36VarV.g(i5);
                                if (arrayList4.size() == 0) {
                                    arrayList2.add(jhg1Var3);
                                }
                            } else if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                y36VarV.g(i5);
                            }
                        }
                    }
                }
                i5--;
                z = true;
            }
            for (i6 = 0; i6 < arrayList2.size(); i6++) {
                jhg1Var = (jhg1) arrayList2.get(i6);
                jhg1Var.D(jhg1Var, ihg1.x0, false);
                if (!jhg1Var.R0) {
                    jhg1Var.R0 = true;
                    jhg1Var.D(jhg1Var, ihg1.w0, false);
                }
            }
            jhg1Var2.q(viewGroup, jhg1Var2.g, jhg1Var2.h, jhg1Var2.X, jhg1Var2.Y);
            if (jhg1Var2.Z0 == null) {
                jhg1Var2.J();
                return true;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                return true;
            }
            jhg1Var2.F();
            jhg1Var2.Z0.k();
            jhg1Var2.Z0.l();
            return true;
        }
        arrayList3 = new ArrayList();
        y36VarC.put(viewGroup, arrayList3);
        arrayList3.add(jhg1Var2);
        jhg1Var2.a(new djg1(this, y36VarC));
        i = 0;
        jhg1Var2.j(viewGroup, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((jhg1) it.next()).I(viewGroup);
            }
        }
        jhg1Var2.X = new ArrayList();
        jhg1Var2.Y = new ArrayList();
        hce1Var = jhg1Var2.g;
        hce1Var2 = jhg1Var2.h;
        y36Var = new y36((y36) hce1Var.b);
        y36Var2 = new y36((y36) hce1Var2.b);
        i2 = 0;
        while (true) {
            iArr = jhg1Var2.t;
            if (i2 < iArr.length) {
                break;
                break;
            }
            i7 = iArr[i2];
            if (i7 != z4) {
                z2 = z4;
                while (i8 >= 0) {
                    view = (View) y36Var.f(i8);
                    if (view == null) {
                    }
                }
            } else if (i7 != 2) {
                z2 = z4;
                y36Var3 = (y36) hce1Var.e;
                y36 y36Var5 = (y36) hce1Var2.e;
                i9 = y36Var3.c;
                while (i10 < i9) {
                    view2 = (View) y36Var3.i(i10);
                    if (view2 == null) {
                    }
                }
            } else if (i7 != 3) {
                if (i7 == 4) {
                    q5f0Var = (q5f0) hce1Var.d;
                    q5f0 q5f0Var3 = (q5f0) hce1Var2.d;
                    i12 = q5f0Var.i();
                    i13 = i;
                    while (i13 < i12) {
                        view6 = (View) q5f0Var.j(i13);
                        if (view6 == null) {
                            z3 = z4;
                        } else {
                            z3 = z4;
                        }
                        i13++;
                        z4 = z3;
                    }
                }
                z2 = z4;
            } else {
                z2 = z4;
                sparseArray = (SparseArray) hce1Var.c;
                SparseArray sparseArray3 = (SparseArray) hce1Var2.c;
                size = sparseArray.size();
                while (i11 < size) {
                    view4 = (View) sparseArray.valueAt(i11);
                    if (view4 == null) {
                    }
                }
            }
            i2++;
            i = 0;
            z4 = z2;
        }
        z = z4;
        while (i3 < y36Var.c) {
            omg1Var2 = (omg1) y36Var.i(i3);
            if (jhg1Var2.B(omg1Var2.b)) {
                jhg1Var2.X.add(omg1Var2);
                jhg1Var2.Y.add(null);
            }
        }
        while (i4 < y36Var2.c) {
            omg1Var = (omg1) y36Var2.i(i4);
            if (jhg1Var2.B(omg1Var.b)) {
                jhg1Var2.Y.add(omg1Var);
                jhg1Var2.X.add(null);
            }
        }
        y36VarV = jhg1.v();
        int i15 = y36VarV.c;
        WindowId windowId2 = viewGroup.getWindowId();
        arrayList2 = new ArrayList();
        i5 = i15 - 1;
        while (i5 >= 0) {
            animator = (Animator) y36VarV.f(i5);
            if (animator == null) {
            }
            i5--;
            z = true;
        }
        while (i6 < arrayList2.size()) {
            jhg1Var = (jhg1) arrayList2.get(i6);
            jhg1Var.D(jhg1Var, ihg1.x0, false);
            if (!jhg1Var.R0) {
                jhg1Var.R0 = true;
                jhg1Var.D(jhg1Var, ihg1.w0, false);
            }
        }
        jhg1Var2.q(viewGroup, jhg1Var2.g, jhg1Var2.h, jhg1Var2.X, jhg1Var2.Y);
        if (jhg1Var2.Z0 == null) {
            jhg1Var2.J();
            return true;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        jhg1Var2.F();
        jhg1Var2.Z0.k();
        jhg1Var2.Z0.l();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        fjg1.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) fjg1.c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((jhg1) it.next()).I(viewGroup);
            }
        }
        this.a.k(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
