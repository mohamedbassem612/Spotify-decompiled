package p;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kss {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d;
    public boolean e;
    public boolean f;

    public kss(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static void f(y36 y36Var, View view) {
        WeakHashMap weakHashMap = b8k1.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            y36Var.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    f(y36Var, childAt);
                }
            }
        }
    }

    public static boolean j(ArrayList arrayList) {
        boolean z;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                foa1 foa1Var = (foa1) it.next();
                if (!foa1Var.k.isEmpty()) {
                    ArrayList arrayList2 = foa1Var.k;
                    if (!arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        do {
                            if (!it2.hasNext()) {
                                break;
                            }
                        } while (((eoa1) it2.next()).b());
                    } else {
                        break;
                    }
                }
                z = false;
            }
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                r7h.W(((foa1) it3.next()).k, arrayList3);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(foa1 foa1Var) throws NoWhenBranchMatchedException {
        if (foa1Var.i) {
            cy30.a(foa1Var.a, foa1Var.c.Q0(), this.a);
            foa1Var.i = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x036d A[LOOP:18: B:148:0x0367->B:150:0x036d, LOOP_END] */
    public final void b(ArrayList arrayList, boolean z) {
        Object next;
        Object objPrevious;
        ArrayList<css> arrayList2;
        int i;
        iss issVar;
        boolean z2;
        Iterator it;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList<String> arrayList5;
        int i2 = 2;
        th30.P(2);
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            foa1 foa1Var = (foa1) next;
            if (w6d1.e(foa1Var.c.j1) == 2 && foa1Var.a != 2) {
                break;
            }
        }
        foa1 foa1Var2 = (foa1) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            foa1 foa1Var3 = (foa1) objPrevious;
            if (w6d1.e(foa1Var3.c.j1) != 2 && foa1Var3.a == 2) {
                break;
            }
        }
        foa1 foa1Var4 = (foa1) objPrevious;
        if (th30.P(2)) {
            Objects.toString(foa1Var2);
            Objects.toString(foa1Var4);
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        zf30 zf30Var = ((foa1) o7h.A0(arrayList)).c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            vf30 vf30Var = ((foa1) it3.next()).c.m1;
            vf30 vf30Var2 = zf30Var.m1;
            vf30Var.b = vf30Var2.b;
            vf30Var.c = vf30Var2.c;
            vf30Var.d = vf30Var2.d;
            vf30Var.e = vf30Var2.e;
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            foa1 foa1Var5 = (foa1) it4.next();
            arrayList6.add(new css(foa1Var5, z));
            arrayList7.add(new jss(foa1Var5, z, !z ? foa1Var5 != foa1Var4 : foa1Var5 != foa1Var2));
            foa1Var5.d.add(new zrs(this, foa1Var5, (byte) 0));
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj : arrayList7) {
            if (!((jss) obj).f1()) {
                arrayList8.add(obj);
            }
        }
        ArrayList<jss> arrayList9 = new ArrayList();
        for (Object obj2 : arrayList8) {
            if (((jss) obj2).v1() != null) {
                arrayList9.add(obj2);
            }
        }
        ej30 ej30Var = null;
        for (jss jssVar : arrayList9) {
            ej30 ej30VarV1 = jssVar.v1();
            if (ej30Var != null && ej30VarV1 != ej30Var) {
                bhn0.m("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ", jssVar.U0().c, " returned Transition ", jssVar.c, " which uses a different Transition type than other Fragments.");
                return;
            }
            ej30Var = ej30VarV1;
        }
        if (ej30Var == null) {
            arrayList2 = arrayList6;
            i = 2;
            z2 = false;
        } else {
            ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            y36 y36Var = new y36(0);
            ArrayList arrayList12 = new ArrayList();
            ArrayList arrayList13 = new ArrayList();
            y36 y36Var2 = new y36(0);
            ArrayList<String> arrayList14 = arrayList13;
            y36 y36Var3 = new y36(0);
            Iterator it5 = arrayList9.iterator();
            Object obj3 = null;
            while (it5.hasNext()) {
                Object obj4 = ((jss) it5.next()).d;
                if (obj4 == null || foa1Var2 == null) {
                    i2 = i2;
                    i2 = i2;
                    arrayList6 = arrayList6;
                    foa1Var2 = foa1Var2;
                    arrayList10 = arrayList10;
                } else {
                    i2 = i2;
                    zf30 zf30Var2 = foa1Var2.c;
                    if (foa1Var4 != null) {
                        zf30 zf30Var3 = foa1Var4.c;
                        Object objY = ej30Var.y(ej30Var.h(obj4));
                        vf30 vf30Var3 = zf30Var3.m1;
                        if (vf30Var3 == null || (arrayList14 = vf30Var3.g) == null) {
                            arrayList14 = new ArrayList();
                        }
                        vf30 vf30Var4 = zf30Var2.m1;
                        if (vf30Var4 == null || (arrayList3 = vf30Var4.g) == null) {
                            arrayList3 = new ArrayList();
                        }
                        ArrayList arrayList15 = arrayList6;
                        vf30 vf30Var5 = zf30Var2.m1;
                        if (vf30Var5 == null || (arrayList4 = vf30Var5.h) == null) {
                            arrayList4 = new ArrayList();
                        }
                        foa1Var2 = foa1Var2;
                        int size = arrayList4.size();
                        arrayList10 = arrayList10;
                        int i3 = 0;
                        while (i3 < size) {
                            int i4 = size;
                            int iIndexOf = arrayList14.indexOf(arrayList4.get(i3));
                            ArrayList arrayList16 = arrayList4;
                            if (iIndexOf != -1) {
                                arrayList14.set(iIndexOf, arrayList3.get(i3));
                            }
                            i3++;
                            size = i4;
                            arrayList4 = arrayList16;
                        }
                        vf30 vf30Var6 = zf30Var3.m1;
                        if (vf30Var6 == null || (arrayList5 = vf30Var6.h) == null) {
                            arrayList5 = new ArrayList();
                        }
                        mmr0 mmr0VarN = !z ? oqn1.n((Object) null, (Object) null) : oqn1.n((Object) null, (Object) null);
                        pze0.m(mmr0VarN.a);
                        pze0.m(mmr0VarN.b);
                        int i5 = 0;
                        for (int size2 = arrayList14.size(); i5 < size2; size2 = size2) {
                            y36Var.put((String) arrayList14.get(i5), (String) arrayList5.get(i5));
                            i5++;
                        }
                        if (th30.P(i2)) {
                            for (String str : arrayList5) {
                            }
                            for (String str2 : arrayList14) {
                            }
                        }
                        f(y36Var2, zf30Var2.j1);
                        y36Var2.l(arrayList14);
                        y36Var.l(y36Var2.keySet());
                        f(y36Var3, zf30Var3.j1);
                        y36Var3.l(arrayList5);
                        y36Var3.l(y36Var.values());
                        xi30.a(y36Var, y36Var3);
                        Set setKeySet = y36Var.keySet();
                        Iterator it6 = ((e2p1) y36Var2.entrySet()).iterator();
                        while (it6.hasNext()) {
                            it6.next();
                            View view = (View) ((Map.Entry) it6).getValue();
                            WeakHashMap weakHashMap = b8k1.a;
                            if (!o7h.i0(setKeySet, view.getTransitionName())) {
                                it6.remove();
                            }
                        }
                        Collection collectionValues = y36Var.values();
                        Iterator it7 = ((e2p1) y36Var3.entrySet()).iterator();
                        while (it7.hasNext()) {
                            it7.next();
                            View view2 = (View) ((Map.Entry) it7).getValue();
                            WeakHashMap weakHashMap2 = b8k1.a;
                            if (!o7h.i0(collectionValues, view2.getTransitionName())) {
                                it7.remove();
                            }
                        }
                        if (y36Var.isEmpty()) {
                            Objects.toString(objY);
                            foa1Var2.toString();
                            foa1Var4.toString();
                            arrayList10.clear();
                            arrayList11.clear();
                            obj3 = null;
                        } else {
                            obj3 = objY;
                        }
                        arrayList12 = arrayList5;
                        arrayList6 = arrayList15;
                    } else {
                        i2 = i2;
                        arrayList6 = arrayList6;
                        foa1Var2 = foa1Var2;
                        arrayList10 = arrayList10;
                    }
                }
            }
            arrayList2 = arrayList6;
            foa1 foa1Var6 = foa1Var2;
            ArrayList arrayList17 = arrayList10;
            i = i2;
            if (obj3 != null) {
                z2 = false;
                issVar = new iss(arrayList9, foa1Var6, foa1Var4, ej30Var, obj3, arrayList17, arrayList11, y36Var, arrayList12, arrayList14, y36Var2, y36Var3, z);
                it = arrayList9.iterator();
                while (it.hasNext()) {
                    ((jss) it.next()).U0().j.add(issVar);
                }
            } else {
                if (!arrayList9.isEmpty()) {
                    Iterator it8 = arrayList9.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            if (((jss) it8.next()).c != null) {
                                z2 = false;
                                issVar = new iss(arrayList9, foa1Var6, foa1Var4, ej30Var, obj3, arrayList17, arrayList11, y36Var, arrayList12, arrayList14, y36Var2, y36Var3, z);
                                it = arrayList9.iterator();
                                while (it.hasNext()) {
                                    ((jss) it.next()).U0().j.add(issVar);
                                }
                            }
                        }
                    }
                }
                z2 = false;
            }
        }
        ArrayList<css> arrayList18 = new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            r7h.W(((css) it9.next()).U0().k, arrayList19);
        }
        boolean zIsEmpty = arrayList19.isEmpty();
        boolean z3 = z2;
        for (css cssVar : arrayList2) {
            Context context = this.a.getContext();
            foa1 foa1VarU0 = cssVar.U0();
            context.getClass();
            t7y t7yVarV1 = cssVar.v1(context);
            if (t7yVarV1 != null) {
                if (((AnimatorSet) t7yVarV1.c) == null) {
                    arrayList18.add(cssVar);
                } else {
                    zf30 zf30Var4 = foa1VarU0.c;
                    if (foa1VarU0.k.isEmpty()) {
                        if (foa1VarU0.a == 3) {
                            foa1VarU0.i = z2;
                        }
                        foa1VarU0.j.add(new ess(cssVar));
                        z3 = true;
                    } else if (th30.P(i)) {
                        Objects.toString(zf30Var4);
                    }
                }
            }
        }
        for (css cssVar2 : arrayList18) {
            foa1 foa1VarU1 = cssVar2.U0();
            zf30 zf30Var5 = foa1VarU1.c;
            if (zIsEmpty) {
                if (!z3) {
                    foa1VarU1.j.add(new bss(cssVar2));
                } else if (th30.P(i)) {
                    Objects.toString(zf30Var5);
                }
            } else if (th30.P(i)) {
                Objects.toString(zf30Var5);
            }
        }
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r7h.W(((foa1) it.next()).k, arrayList2);
        }
        List listL1 = o7h.l1(o7h.p1(arrayList2));
        int size = listL1.size();
        for (int i = 0; i < size; i++) {
            ((eoa1) listL1.get(i)).d(this.a);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((foa1) arrayList.get(i2));
        }
        List listL2 = o7h.l1(arrayList);
        int size3 = listL2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            foa1 foa1Var = (foa1) listL2.get(i3);
            if (foa1Var.k.isEmpty()) {
                foa1Var.b();
            }
        }
    }

    public final void d(int i, int i2, si30 si30Var) {
        synchronized (this.b) {
            try {
                foa1 foa1VarG = g(si30Var.c);
                if (foa1VarG == null) {
                    zf30 zf30Var = si30Var.c;
                    foa1VarG = (zf30Var.Z || zf30Var.Y) ? h(zf30Var) : null;
                }
                if (foa1VarG != null) {
                    foa1VarG.d(i, i2);
                    return;
                }
                foa1 foa1Var = new foa1(i, i2, si30Var);
                this.b.add(foa1Var);
                foa1Var.d.add(new zrs(this, foa1Var, (byte) 1));
                foa1Var.d.add(new zrs(this, foa1Var, (byte) 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        boolean z;
        if (this.f) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            i();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList<foa1> arrayList = new ArrayList(this.c);
                this.c.clear();
                Iterator it = arrayList.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    foa1 foa1Var = (foa1) it.next();
                    if (this.b.isEmpty() || !foa1Var.c.Z) {
                        z = false;
                    }
                    foa1Var.g = z;
                }
                for (foa1 foa1Var2 : arrayList) {
                    if (this.d) {
                        if (th30.P(2)) {
                            Objects.toString(foa1Var2);
                        }
                        foa1Var2.b();
                    } else {
                        if (th30.P(2)) {
                            Objects.toString(foa1Var2);
                        }
                        foa1Var2.a(this.a);
                    }
                    this.d = false;
                    if (!foa1Var2.f) {
                        this.c.add(foa1Var2);
                    }
                }
                if (!this.b.isEmpty()) {
                    l();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    th30.P(2);
                    b(arrayList2, this.e);
                    boolean zJ = j(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    boolean z2 = true;
                    while (it2.hasNext()) {
                        if (!((foa1) it2.next()).c.Z) {
                            z2 = false;
                        }
                    }
                    if (!z2 || zJ) {
                        z = false;
                    }
                    this.d = z;
                    th30.P(2);
                    if (!z2) {
                        k(arrayList2);
                        c(arrayList2);
                    } else if (zJ) {
                        k(arrayList2);
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            a((foa1) arrayList2.get(i));
                        }
                    }
                    this.e = false;
                    th30.P(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final foa1 g(zf30 zf30Var) {
        Object next;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            next = it.next();
            foa1 foa1Var = (foa1) next;
            if (foa1Var.c.equals(zf30Var) && !foa1Var.e) {
                return (foa1) next;
            }
        }
        next = null;
        return (foa1) next;
    }

    public final foa1 h(zf30 zf30Var) {
        Object next;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            next = it.next();
            foa1 foa1Var = (foa1) next;
            if (foa1Var.c.equals(zf30Var) && !foa1Var.e) {
                return (foa1) next;
            }
        }
        next = null;
        return (foa1) next;
    }

    public final void i() {
        th30.P(2);
        boolean zIsAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                l();
                k(this.b);
                ArrayList<foa1> arrayList = new ArrayList(this.c);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((foa1) it.next()).g = false;
                }
                for (foa1 foa1Var : arrayList) {
                    if (th30.P(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(foa1Var);
                    }
                    foa1Var.a(this.a);
                }
                ArrayList<foa1> arrayList2 = new ArrayList(this.b);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((foa1) it2.next()).g = false;
                }
                for (foa1 foa1Var2 : arrayList2) {
                    if (th30.P(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(foa1Var2);
                    }
                    foa1Var2.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            foa1 foa1Var = (foa1) arrayList.get(i);
            si30 si30Var = foa1Var.l;
            zf30 zf30Var = si30Var.c;
            if (!foa1Var.h) {
                foa1Var.h = true;
                int i2 = foa1Var.b;
                if (i2 == 2) {
                    View viewFindFocus = zf30Var.j1.findFocus();
                    if (viewFindFocus != null) {
                        zf30Var.e0().f125p = viewFindFocus;
                        if (th30.P(2)) {
                            viewFindFocus.toString();
                            zf30Var.toString();
                        }
                    }
                    View viewQ0 = foa1Var.c.Q0();
                    if (viewQ0.getParent() == null) {
                        if (th30.P(2)) {
                            zf30Var.toString();
                            viewQ0.toString();
                        }
                        si30Var.b();
                        viewQ0.setAlpha(0.0f);
                    }
                    if (viewQ0.getAlpha() == 0.0f && viewQ0.getVisibility() == 0) {
                        if (th30.P(2)) {
                            viewQ0.toString();
                        }
                        viewQ0.setVisibility(4);
                    }
                    vf30 vf30Var = zf30Var.m1;
                    viewQ0.setAlpha(vf30Var == null ? 1.0f : vf30Var.o);
                    th30.P(2);
                } else if (i2 == 3) {
                    View viewQ1 = zf30Var.Q0();
                    if (th30.P(2)) {
                        Objects.toString(viewQ1.findFocus());
                        viewQ1.toString();
                        zf30Var.toString();
                    }
                    viewQ1.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r7h.W(((foa1) it.next()).k, arrayList2);
        }
        List listL1 = o7h.l1(o7h.p1(arrayList2));
        int size2 = listL1.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((eoa1) listL1.get(i3)).g(this.a);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void l() throws NoWhenBranchMatchedException {
        for (foa1 foa1Var : this.b) {
            if (foa1Var.b == 2) {
                foa1Var.d(w6d1.j(foa1Var.c.Q0().getVisibility()), 1);
            }
        }
    }
}
