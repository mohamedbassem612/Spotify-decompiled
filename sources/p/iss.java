package p;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iss extends eoa1 {
    public final ArrayList c;
    public final foa1 d;
    public final foa1 e;
    public final ej30 f;
    public final Object g;
    public final ArrayList h;
    public final ArrayList i;
    public final y36 j;
    public final ArrayList k;
    public final ArrayList l;
    public final y36 m;
    public final y36 n;
    public final vhd o = new vhd((byte) 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f74p;
    public boolean q;

    public iss(ArrayList arrayList, foa1 foa1Var, foa1 foa1Var2, ej30 ej30Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, y36 y36Var, ArrayList arrayList4, ArrayList arrayList5, y36 y36Var2, y36 y36Var3, boolean z) {
        this.c = arrayList;
        this.d = foa1Var;
        this.e = foa1Var2;
        this.f = ej30Var;
        this.g = obj;
        this.h = arrayList2;
        this.i = arrayList3;
        this.j = y36Var;
        this.k = arrayList4;
        this.l = arrayList5;
        this.m = y36Var2;
        this.n = y36Var3;
    }

    public static void h(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = gbk1.a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                h(childAt, arrayList);
            }
        }
    }

    @Override // p.eoa1
    public final boolean b() {
        Object obj;
        ej30 ej30Var = this.f;
        if (!ej30Var.l()) {
            return false;
        }
        ArrayList<jss> arrayList = this.c;
        if (!arrayList.isEmpty()) {
            for (jss jssVar : arrayList) {
                if (Build.VERSION.SDK_INT < 34 || (obj = jssVar.c) == null || !ej30Var.m(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.g;
        return obj2 == null || ej30Var.m(obj2);
    }

    @Override // p.eoa1
    public final void c(ViewGroup viewGroup) {
        this.o.b();
    }

    @Override // p.eoa1
    public final void d(ViewGroup viewGroup) {
        boolean zIsLaidOut = viewGroup.isLaidOut();
        ArrayList<jss> arrayList = this.c;
        if (!zIsLaidOut || this.q) {
            for (jss jssVar : arrayList) {
                foa1 foa1Var = (foa1) jssVar.b;
                if (th30.P(2)) {
                    if (this.q) {
                        Objects.toString(foa1Var);
                    } else {
                        viewGroup.toString();
                        Objects.toString(foa1Var);
                    }
                }
                ((foa1) jssVar.b).c(this);
            }
            this.q = false;
            return;
        }
        Object obj = this.f74p;
        ej30 ej30Var = this.f;
        foa1 foa1Var2 = this.e;
        foa1 foa1Var3 = this.d;
        if (obj != null) {
            ej30Var.c(obj);
            if (th30.P(2)) {
                Objects.toString(foa1Var3);
                Objects.toString(foa1Var2);
                return;
            }
            return;
        }
        mmr0 mmr0VarI = i(viewGroup, foa1Var2, foa1Var3);
        ArrayList arrayList2 = (ArrayList) mmr0VarI.a;
        Object obj2 = mmr0VarI.b;
        ArrayList<foa1> arrayList3 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add((foa1) ((jss) it.next()).b);
        }
        for (foa1 foa1Var4 : arrayList3) {
            ej30Var.v(foa1Var4.c, obj2, this.o, new gss(foa1Var4, this, (byte) 1));
        }
        k(arrayList2, viewGroup, new hss(this, viewGroup, obj2));
        if (th30.P(2)) {
            Objects.toString(foa1Var3);
            Objects.toString(foa1Var2);
        }
    }

    @Override // p.eoa1
    public final void e(vt9 vt9Var) {
        Object obj = this.f74p;
        if (obj != null) {
            this.f.r(vt9Var.c, obj);
        }
    }

    @Override // p.eoa1
    public final void f(ViewGroup viewGroup) {
        Object obj;
        boolean zIsLaidOut = viewGroup.isLaidOut();
        ArrayList arrayList = this.c;
        if (!zIsLaidOut) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                foa1 foa1Var = (foa1) ((jss) it.next()).b;
                if (th30.P(2)) {
                    viewGroup.toString();
                    Objects.toString(foa1Var);
                }
            }
            return;
        }
        boolean zJ = j();
        foa1 foa1Var2 = this.e;
        foa1 foa1Var3 = this.d;
        if (zJ && (obj = this.g) != null && !b()) {
            Objects.toString(obj);
            Objects.toString(foa1Var3);
            Objects.toString(foa1Var2);
        }
        if (b() && j()) {
            p811 p811Var = new p811();
            mmr0 mmr0VarI = i(viewGroup, foa1Var2, foa1Var3);
            ArrayList arrayList2 = (ArrayList) mmr0VarI.a;
            Object obj2 = mmr0VarI.b;
            ArrayList<foa1> arrayList3 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add((foa1) ((jss) it2.next()).b);
            }
            for (foa1 foa1Var4 : arrayList3) {
                fss fssVar = new fss(p811Var, (byte) 0);
                zf30 zf30Var = foa1Var4.c;
                this.f.u(obj2, this.o, fssVar, new gss(foa1Var4, this, (byte) 0));
            }
            k(arrayList2, viewGroup, new qd4(this, viewGroup, obj2, p811Var, (byte) 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x014e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0153  */
    /* JADX WARN: Code duplicated, block: B:49:0x015c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0169 A[LOOP:2: B:50:0x0163->B:52:0x0169, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0173  */
    /* JADX WARN: Code duplicated, block: B:55:0x017d  */
    /* JADX WARN: Code duplicated, block: B:58:0x018a A[LOOP:3: B:56:0x0184->B:58:0x018a, LOOP_END] */
    public final mmr0 i(ViewGroup viewGroup, foa1 foa1Var, foa1 foa1Var2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        ej30 ej30Var;
        Object obj2;
        ArrayList arrayList3;
        int i;
        Iterator it;
        Iterator it2;
        View view;
        foa1Var = foa1Var;
        View view2 = new View(viewGroup.getContext());
        Rect rect = new Rect();
        ArrayList arrayList4 = this.c;
        Iterator it3 = arrayList4.iterator();
        View view3 = null;
        boolean z = false;
        while (true) {
            boolean zHasNext = it3.hasNext();
            arrayList = this.i;
            arrayList2 = this.h;
            obj = this.g;
            ej30Var = this.f;
            if (!zHasNext) {
                break;
            }
            if (((jss) it3.next()).d != null && foa1Var2 != null && foa1Var != null && !this.j.isEmpty() && obj != null) {
                cj30 cj30Var = xi30.a;
                aiq0.a(viewGroup, new e0i(foa1Var, foa1Var2, this));
                y36 y36Var = this.m;
                arrayList2.addAll(y36Var.values());
                ArrayList arrayList5 = this.l;
                if (!arrayList5.isEmpty()) {
                    View view4 = (View) y36Var.get((String) arrayList5.get(0));
                    ej30Var.s(view4, obj);
                    view3 = view4;
                }
                y36 y36Var2 = this.n;
                arrayList.addAll(y36Var2.values());
                ArrayList arrayList6 = this.k;
                if (!arrayList6.isEmpty() && (view = (View) y36Var2.get((String) arrayList6.get(0))) != null) {
                    aiq0.a(viewGroup, new e0i(ej30Var, view, rect));
                    z = true;
                }
                ej30Var.w(obj, view2, arrayList2);
                Object obj3 = this.g;
                ej30Var.q(obj3, null, null, obj3, arrayList);
            }
            arrayList4 = arrayList4;
        }
        ArrayList arrayList7 = arrayList4;
        ArrayList arrayList8 = arrayList;
        ArrayList arrayList9 = new ArrayList();
        Iterator it4 = arrayList7.iterator();
        Object objO = null;
        while (it4.hasNext()) {
            jss jssVar = (jss) it4.next();
            foa1 foa1Var3 = (foa1) jssVar.b;
            Object objH = ej30Var.h(jssVar.c);
            if (objH != null) {
                ArrayList arrayList10 = arrayList8;
                ArrayList arrayList11 = new ArrayList();
                Iterator it5 = it4;
                zf30 zf30Var = foa1Var3.c;
                boolean z2 = z;
                h(zf30Var.j1, arrayList11);
                if (obj != null && (foa1Var3 == foa1Var2 || foa1Var3 == foa1Var)) {
                    if (foa1Var3 == foa1Var2) {
                        arrayList11.removeAll(o7h.p1(arrayList2));
                    } else {
                        arrayList11.removeAll(o7h.p1(arrayList10));
                    }
                }
                if (arrayList11.isEmpty()) {
                    ej30Var.a(view2, objH);
                    arrayList3 = arrayList11;
                    obj2 = objH;
                } else {
                    ej30Var.b(objH, arrayList11);
                    ej30Var.q(objH, objH, arrayList11, null, null);
                    obj2 = objH;
                    arrayList3 = arrayList11;
                    if (foa1Var3.a == 3) {
                        foa1Var3.i = false;
                        ArrayList arrayList12 = new ArrayList(arrayList3);
                        arrayList12.remove(zf30Var.j1);
                        ej30Var.p(obj2, zf30Var.j1, arrayList12);
                        i = 2;
                        aiq0.a(viewGroup, new fss(arrayList3, (byte) 2));
                    }
                    if (foa1Var3.a == i) {
                        arrayList9.addAll(arrayList3);
                        if (z2) {
                            ej30Var.t(obj2, rect);
                        }
                        if (th30.P(i)) {
                            obj2.toString();
                            it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                ((View) it2.next()).toString();
                            }
                        }
                    } else {
                        ej30Var.s(view3, obj2);
                        if (th30.P(2)) {
                            obj2.toString();
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                                ((View) it.next()).toString();
                            }
                        }
                    }
                    objO = ej30Var.o(objO, obj2);
                    arrayList8 = arrayList10;
                    it4 = it5;
                    z = z2;
                }
                i = 2;
                if (foa1Var3.a == i) {
                    arrayList9.addAll(arrayList3);
                    if (z2) {
                        ej30Var.t(obj2, rect);
                    }
                    if (th30.P(i)) {
                        obj2.toString();
                        it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            ((View) it2.next()).toString();
                        }
                    }
                } else {
                    ej30Var.s(view3, obj2);
                    if (th30.P(2)) {
                        obj2.toString();
                        it = arrayList3.iterator();
                        while (it.hasNext()) {
                            ((View) it.next()).toString();
                        }
                    }
                }
                objO = ej30Var.o(objO, obj2);
                arrayList8 = arrayList10;
                it4 = it5;
                z = z2;
            }
        }
        Object objN = ej30Var.n(objO, null, obj);
        if (th30.P(2)) {
            Objects.toString(objN);
            viewGroup.toString();
        }
        return new mmr0(arrayList9, objN);
    }

    public final boolean j() {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((foa1) ((jss) it.next()).b).c.Z) {
                return false;
            }
        }
        return true;
    }

    public final void k(ArrayList arrayList, ViewGroup viewGroup, Function0 function0) {
        xi30.b(4, arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList<View> arrayList3 = this.i;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            WeakHashMap weakHashMap = b8k1.a;
            arrayList2.add(view.getTransitionName());
            view.setTransitionName(null);
        }
        boolean zP = th30.P(2);
        ArrayList<View> arrayList4 = this.h;
        if (zP) {
            for (View view2 : arrayList4) {
                WeakHashMap weakHashMap2 = b8k1.a;
                view2.getTransitionName();
                view2.toString();
            }
            for (View view3 : arrayList3) {
                WeakHashMap weakHashMap3 = b8k1.a;
                view3.getTransitionName();
                view3.toString();
            }
        }
        function0.invoke();
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i2 = 0; i2 < size2; i2++) {
            View view4 = (View) arrayList4.get(i2);
            WeakHashMap weakHashMap4 = b8k1.a;
            String transitionName = view4.getTransitionName();
            arrayList5.add(transitionName);
            if (transitionName != null) {
                view4.setTransitionName(null);
                String str = (String) this.j.get(transitionName);
                for (int i3 = 0; i3 < size2; i3++) {
                    if (str.equals(arrayList2.get(i3))) {
                        ((View) arrayList3.get(i3)).setTransitionName(transitionName);
                        break;
                    }
                }
            }
        }
        aiq0.a(viewGroup, new dj30(size2, arrayList3, arrayList2, arrayList4, arrayList5));
        xi30.b(0, arrayList);
        this.f.x(this.g, arrayList4, arrayList3);
    }
}
