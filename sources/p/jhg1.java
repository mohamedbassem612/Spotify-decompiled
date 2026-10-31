package p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class jhg1 implements Cloneable {
    public static final Animator[] b1 = new Animator[0];
    public static final int[] c1 = {2, 1, 3, 4};
    public static final gtv0 d1 = new gtv0((byte) 21);
    public static final ThreadLocal e1 = new ThreadLocal();
    public ij81 V0;
    public fj30 W0;
    public ArrayList X;
    public ArrayList Y;
    public long Y0;
    public ghg1[] Z;
    public chg1 Z0;
    public long a1;
    public final String a = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator d = null;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public hce1 g = new hce1((byte) 11);
    public hce1 h = new hce1((byte) 11);
    public glg1 i = null;
    public final int[] t = c1;
    public final ArrayList N0 = new ArrayList();
    public Animator[] O0 = b1;
    public int P0 = 0;
    public boolean Q0 = false;
    public boolean R0 = false;
    public jhg1 S0 = null;
    public ArrayList T0 = null;
    public ArrayList U0 = new ArrayList();
    public gtv0 X0 = d1;

    public static boolean C(omg1 omg1Var, omg1 omg1Var2, String str) {
        Object obj = omg1Var.a.get(str);
        Object obj2 = omg1Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void d(hce1 hce1Var, View view, omg1 omg1Var) {
        y36 y36Var = (y36) hce1Var.b;
        y36 y36Var2 = (y36) hce1Var.e;
        SparseArray sparseArray = (SparseArray) hce1Var.c;
        q5f0 q5f0Var = (q5f0) hce1Var.d;
        y36Var.put(view, omg1Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = b8k1.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (y36Var2.containsKey(transitionName)) {
                y36Var2.put(transitionName, null);
            } else {
                y36Var2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (q5f0Var.d(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    q5f0Var.g(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) q5f0Var.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    q5f0Var.g(itemIdAtPosition, null);
                }
            }
        }
    }

    public static y36 v() {
        ThreadLocal threadLocal = e1;
        y36 y36Var = (y36) threadLocal.get();
        if (y36Var != null) {
            return y36Var;
        }
        y36 y36Var2 = new y36(0);
        threadLocal.set(y36Var2);
        return y36Var2;
    }

    public boolean A(omg1 omg1Var, omg1 omg1Var2) {
        if (omg1Var != null && omg1Var2 != null) {
            String[] strArrW = w();
            if (strArrW != null) {
                for (String str : strArrW) {
                    if (C(omg1Var, omg1Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = omg1Var.a.keySet().iterator();
                while (it.hasNext()) {
                    if (C(omg1Var, omg1Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean B(View view) {
        int id = view.getId();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final void D(jhg1 jhg1Var, ihg1 ihg1Var, boolean z) {
        jhg1 jhg1Var2 = this.S0;
        if (jhg1Var2 != null) {
            jhg1Var2.D(jhg1Var, ihg1Var, z);
        }
        ArrayList arrayList = this.T0;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.T0.size();
        ghg1[] ghg1VarArr = this.Z;
        if (ghg1VarArr == null) {
            ghg1VarArr = new ghg1[size];
        }
        this.Z = null;
        ghg1[] ghg1VarArr2 = (ghg1[]) this.T0.toArray(ghg1VarArr);
        for (int i = 0; i < size; i++) {
            ihg1Var.a(ghg1VarArr2[i], jhg1Var, z);
            ghg1VarArr2[i] = null;
        }
        this.Z = ghg1VarArr2;
    }

    public void E(View view) {
        if (this.R0) {
            return;
        }
        ArrayList arrayList = this.N0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.O0);
        this.O0 = b1;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.O0 = animatorArr;
        D(this, ihg1.y0, false);
        this.Q0 = true;
    }

    public void F() {
        y36 y36VarV = v();
        this.Y0 = 0L;
        int i = 0;
        while (true) {
            int size = this.U0.size();
            ArrayList arrayList = this.U0;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            Animator animator = (Animator) arrayList.get(i);
            xgg1 xgg1Var = (xgg1) y36VarV.get(animator);
            if (animator != null && xgg1Var != null) {
                Animator animator2 = xgg1Var.f;
                long j = this.c;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.b;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.d;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.N0.add(animator);
                this.Y0 = Math.max(this.Y0, kw7.A(animator));
            }
            i++;
        }
    }

    public jhg1 G(ghg1 ghg1Var) {
        jhg1 jhg1Var;
        ArrayList arrayList = this.T0;
        if (arrayList != null) {
            if (!arrayList.remove(ghg1Var) && (jhg1Var = this.S0) != null) {
                jhg1Var.G(ghg1Var);
            }
            if (this.T0.size() == 0) {
                this.T0 = null;
            }
        }
        return this;
    }

    public void H(View view) {
        this.f.remove(view);
    }

    public void I(View view) {
        if (this.Q0) {
            if (!this.R0) {
                ArrayList arrayList = this.N0;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.O0);
                this.O0 = b1;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.O0 = animatorArr;
                D(this, ihg1.z0, false);
            }
            this.Q0 = false;
        }
    }

    public void J() {
        R();
        y36 y36VarV = v();
        for (Animator animator : this.U0) {
            if (y36VarV.containsKey(animator)) {
                R();
                if (animator != null) {
                    animator.addListener(new vgg1(this, y36VarV));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new wgg1(this));
                    animator.start();
                }
            }
        }
        this.U0.clear();
        r();
    }

    public void K(long j, long j2) {
        long j3 = this.Y0;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.R0 = false;
            D(this, ihg1.v0, z);
        }
        ArrayList arrayList = this.N0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.O0);
        this.O0 = b1;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            kw7.H(animator, Math.min(Math.max(0L, j), kw7.A(animator)));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.O0 = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.R0 = true;
        }
        D(this, ihg1.w0, z);
    }

    public void L(long j) {
        this.c = j;
    }

    public void M(fj30 fj30Var) {
        this.W0 = fj30Var;
    }

    public void N(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void O(gtv0 gtv0Var) {
        if (gtv0Var == null) {
            this.X0 = d1;
        } else {
            this.X0 = gtv0Var;
        }
    }

    public void P(ij81 ij81Var) {
        this.V0 = ij81Var;
    }

    public void Q(long j) {
        this.b = j;
    }

    public final void R() {
        if (this.P0 == 0) {
            D(this, ihg1.v0, false);
            this.R0 = false;
        }
        this.P0++;
    }

    public String S(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(ghg1 ghg1Var) {
        ArrayList arrayList = this.T0;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.T0 = arrayList;
        }
        arrayList.add(ghg1Var);
    }

    public jhg1 b(View view) {
        this.f.add(view);
        return this;
    }

    public void cancel() {
        ArrayList arrayList = this.N0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.O0);
        this.O0 = b1;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.O0 = animatorArr;
        D(this, ihg1.x0, false);
    }

    public void e(omg1 omg1Var) {
        rce.T(omg1Var);
    }

    public final void g(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            omg1 omg1Var = new omg1(view);
            if (z) {
                i(omg1Var);
            } else {
                e(omg1Var);
            }
            omg1Var.c.add(this);
            h(omg1Var);
            if (z) {
                d(this.g, view, omg1Var);
            } else {
                d(this.h, view, omg1Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), z);
            }
        }
    }

    public void h(omg1 omg1Var) {
        HashMap map = omg1Var.a;
        if (this.V0 == null || map.isEmpty()) {
            return;
        }
        this.V0.getClass();
        String[] strArr = ij81.c;
        for (int i = 0; i < 2; i++) {
            if (!map.containsKey(strArr[i])) {
                this.V0.j(omg1Var);
                return;
            }
        }
    }

    public void i(omg1 omg1Var) {
        rce.T(omg1Var);
    }

    public final void j(ViewGroup viewGroup, boolean z) {
        k(z);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size <= 0 && arrayList2.size() <= 0) {
            g(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                omg1 omg1Var = new omg1(viewFindViewById);
                if (z) {
                    i(omg1Var);
                } else {
                    e(omg1Var);
                }
                omg1Var.c.add(this);
                h(omg1Var);
                if (z) {
                    d(this.g, viewFindViewById, omg1Var);
                } else {
                    d(this.h, viewFindViewById, omg1Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            omg1 omg1Var2 = new omg1(view);
            if (z) {
                i(omg1Var2);
            } else {
                e(omg1Var2);
            }
            omg1Var2.c.add(this);
            h(omg1Var2);
            if (z) {
                d(this.g, view, omg1Var2);
            } else {
                d(this.h, view, omg1Var2);
            }
        }
    }

    public final void k(boolean z) {
        if (z) {
            ((y36) this.g.b).clear();
            ((SparseArray) this.g.c).clear();
            ((q5f0) this.g.d).a();
        } else {
            ((y36) this.h.b).clear();
            ((SparseArray) this.h.c).clear();
            ((q5f0) this.h.d).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public jhg1 clone() {
        try {
            jhg1 jhg1Var = (jhg1) super.clone();
            jhg1Var.U0 = new ArrayList();
            jhg1Var.g = new hce1((byte) 11);
            jhg1Var.h = new hce1((byte) 11);
            jhg1Var.X = null;
            jhg1Var.Y = null;
            jhg1Var.Z0 = null;
            jhg1Var.S0 = this;
            jhg1Var.T0 = null;
            return jhg1Var;
        } catch (CloneNotSupportedException e) {
            eg.j(e);
            return null;
        }
    }

    public Animator n(ViewGroup viewGroup, omg1 omg1Var, omg1 omg1Var2) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x0111  */
    /* JADX WARN: Code duplicated, block: B:72:0x0122 A[SYNTHETIC] */
    public void q(ViewGroup viewGroup, hce1 hce1Var, hce1 hce1Var2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorN;
        int i;
        boolean z;
        View view;
        omg1 omg1Var;
        ij81 ij81Var;
        Object obj;
        y36 y36VarV = v();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z2 = u().Z0 != null;
        long jMin = Long.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            omg1 omg1Var2 = (omg1) arrayList.get(i2);
            omg1 omg1Var3 = (omg1) arrayList2.get(i2);
            if (omg1Var2 != null && !omg1Var2.c.contains(this)) {
                omg1Var2 = null;
            }
            if (omg1Var3 != null && !omg1Var3.c.contains(this)) {
                omg1Var3 = null;
            }
            if (!(omg1Var2 == null && omg1Var3 == null) && ((omg1Var2 == null || omg1Var3 == null || A(omg1Var2, omg1Var3)) && (animatorN = n(viewGroup, omg1Var2, omg1Var3)) != null)) {
                String str = this.a;
                if (omg1Var3 != null) {
                    view = omg1Var3.b;
                    i = size;
                    String[] strArrW = w();
                    z = z2;
                    if (strArrW != null && strArrW.length > 0) {
                        omg1Var = new omg1(view);
                        i2 = i2;
                        omg1 omg1Var4 = (omg1) ((y36) hce1Var2.b).get(view);
                        if (omg1Var4 != null) {
                            int i3 = 0;
                            while (i3 < strArrW.length) {
                                String str2 = strArrW[i3];
                                omg1Var.a.put(str2, omg1Var4.a.get(str2));
                                i3++;
                                strArrW = strArrW;
                            }
                        }
                        int i4 = y36VarV.c;
                        for (int i5 = 0; i5 < i4; i5++) {
                            xgg1 xgg1Var = (xgg1) y36VarV.get((Animator) y36VarV.f(i5));
                            if (xgg1Var.c != null && xgg1Var.a == view && xgg1Var.b.equals(str) && xgg1Var.c.equals(omg1Var)) {
                                animatorN = null;
                                break;
                            }
                        }
                    }
                    if (animatorN == null) {
                        ij81Var = this.V0;
                        if (ij81Var != null) {
                            long jO = ij81Var.o(viewGroup, this, omg1Var2, omg1Var3);
                            sparseIntArray.put(this.U0.size(), (int) jO);
                            jMin = Math.min(jO, jMin);
                        }
                        WindowId windowId = viewGroup.getWindowId();
                        xgg1 xgg1Var2 = new xgg1();
                        xgg1Var2.a = view;
                        xgg1Var2.b = str;
                        xgg1Var2.c = omg1Var;
                        xgg1Var2.d = windowId;
                        xgg1Var2.e = this;
                        xgg1Var2.f = animatorN;
                        obj = animatorN;
                        if (z) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animatorN);
                            obj = animatorSet;
                        }
                        y36VarV.put(obj, xgg1Var2);
                        this.U0.add(obj);
                    }
                } else {
                    i = size;
                    z = z2;
                    view = omg1Var2.b;
                }
                omg1Var = null;
                if (animatorN == null) {
                    ij81Var = this.V0;
                    if (ij81Var != null) {
                        long jO2 = ij81Var.o(viewGroup, this, omg1Var2, omg1Var3);
                        sparseIntArray.put(this.U0.size(), (int) jO2);
                        jMin = Math.min(jO2, jMin);
                    }
                    WindowId windowId2 = viewGroup.getWindowId();
                    xgg1 xgg1Var3 = new xgg1();
                    xgg1Var3.a = view;
                    xgg1Var3.b = str;
                    xgg1Var3.c = omg1Var;
                    xgg1Var3.d = windowId2;
                    xgg1Var3.e = this;
                    xgg1Var3.f = animatorN;
                    obj = animatorN;
                    if (z) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.play(animatorN);
                        obj = animatorSet2;
                    }
                    y36VarV.put(obj, xgg1Var3);
                    this.U0.add(obj);
                }
            } else {
                i = size;
                z = z2;
                i2 = i2;
            }
            i2++;
            size = i;
            z2 = z;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                xgg1 xgg1Var4 = (xgg1) y36VarV.get((Animator) this.U0.get(sparseIntArray.keyAt(i6)));
                xgg1Var4.f.setStartDelay(xgg1Var4.f.getStartDelay() + (((long) sparseIntArray.valueAt(i6)) - jMin));
            }
        }
    }

    public final void r() {
        int i = this.P0 - 1;
        this.P0 = i;
        if (i == 0) {
            D(this, ihg1.w0, false);
            for (int i2 = 0; i2 < ((q5f0) this.g.d).i(); i2++) {
                View view = (View) ((q5f0) this.g.d).j(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((q5f0) this.h.d).i(); i3++) {
                View view2 = (View) ((q5f0) this.h.d).j(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.R0 = true;
        }
    }

    public void s(ViewGroup viewGroup) {
        y36 y36VarV = v();
        int i = y36VarV.c;
        if (viewGroup == null || i == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        y36 y36Var = new y36(y36VarV);
        y36VarV.clear();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            xgg1 xgg1Var = (xgg1) y36Var.i(i2);
            if (xgg1Var.a != null && windowId.equals(xgg1Var.d)) {
                ((Animator) y36Var.f(i2)).end();
            }
        }
    }

    public final omg1 t(View view, boolean z) {
        glg1 glg1Var = this.i;
        if (glg1Var != null) {
            return glg1Var.t(view, z);
        }
        ArrayList arrayList = z ? this.X : this.Y;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            omg1 omg1Var = (omg1) arrayList.get(i);
            if (omg1Var == null) {
                return null;
            }
            if (omg1Var.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (omg1) (z ? this.Y : this.X).get(i);
        }
        return null;
    }

    public final String toString() {
        return S("");
    }

    public final jhg1 u() {
        glg1 glg1Var = this.i;
        return glg1Var != null ? glg1Var.u() : this;
    }

    public String[] w() {
        return null;
    }

    public final omg1 x(View view, boolean z) {
        glg1 glg1Var = this.i;
        if (glg1Var != null) {
            return glg1Var.x(view, z);
        }
        return (omg1) ((y36) (z ? this.g : this.h).b).get(view);
    }

    public boolean y() {
        return !this.N0.isEmpty();
    }

    public boolean z() {
        return this instanceof db91;
    }
}
