package p;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ywd extends zw81 {
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public final boolean a(w611 w611Var, w611 w611Var2, f3a f3aVar, f3a f3aVar2) {
        d(w611Var);
        d(w611Var2);
        return false;
    }

    public final void f(w611 w611Var) {
        View view = w611Var.a;
        b8k1.c(view).c();
        if (this.h.remove(w611Var)) {
            view.setAlpha(1.0f);
            d(w611Var);
        }
        if (this.i.remove(w611Var)) {
            xwd xwdVar = (xwd) w611Var.a.getTag(2131430297);
            view.setAlpha(xwdVar != null ? xwdVar.a : 1.0f);
            d(w611Var);
        }
        ArrayList arrayList = this.j;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(size);
            if (arrayList2.remove(w611Var)) {
                view.setAlpha(1.0f);
                d(w611Var);
                if (arrayList2.isEmpty()) {
                    arrayList.remove(size);
                }
            }
        }
        if (i()) {
            return;
        }
        e();
    }

    public final void g() {
        ArrayList arrayList = this.h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d((w611) arrayList.get(size));
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.i;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            w611 w611Var = (w611) arrayList2.get(size2);
            View view = w611Var.a;
            WeakHashMap weakHashMap = b8k1.a;
            view.setAlpha(1.0f);
            d(w611Var);
            arrayList2.remove(size2);
        }
        if (i()) {
            ArrayList arrayList3 = this.j;
            for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                ArrayList arrayList4 = (ArrayList) arrayList3.get(size3);
                for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
                    w611 w611Var2 = (w611) arrayList4.get(size4);
                    View view2 = w611Var2.a;
                    WeakHashMap weakHashMap2 = b8k1.a;
                    view2.setAlpha(1.0f);
                    d(w611Var2);
                    arrayList4.remove(size4);
                    if (arrayList4.isEmpty()) {
                        arrayList3.remove(arrayList4);
                    }
                }
            }
            ArrayList arrayList5 = this.l;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                b8k1.c(((w611) arrayList5.get(size5)).a).c();
            }
            ArrayList arrayList6 = this.k;
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                b8k1.c(((w611) arrayList6.get(size6)).a).c();
            }
            e();
        }
    }

    public final long h() {
        return 120L;
    }

    public final boolean i() {
        return (this.i.isEmpty() && this.h.isEmpty() && this.l.isEmpty() && this.k.isEmpty() && this.j.isEmpty()) ? false : true;
    }

    public final void j() {
        boolean z;
        ArrayList arrayList = this.h;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.i;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        if (zIsEmpty && zIsEmpty2) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            w611 w611Var = (w611) it.next();
            View view = w611Var.a;
            oek1 oek1VarC = b8k1.c(view);
            WeakReference weakReference = oek1VarC.a;
            yyd yydVar = (yyd) view.getTag(2131430298);
            if (yydVar != null) {
                if (yydVar.b == -1) {
                    float f = -yydVar.c;
                    View view2 = (View) weakReference.get();
                    if (view2 != null) {
                        view2.animate().translationXBy(f);
                    }
                }
                if (yydVar.b == 1) {
                    float f2 = yydVar.c;
                    View view3 = (View) weakReference.get();
                    if (view3 != null) {
                        view3.animate().translationXBy(f2);
                    }
                }
            }
            this.l.add(w611Var);
            oek1VarC.d(120L);
            oek1VarC.a(0.0f);
            oek1VarC.f(new wwd(this, w611Var, oek1VarC, (byte) 0));
            oek1VarC.g();
        }
        arrayList.clear();
        if (zIsEmpty2) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList2);
        this.j.add(arrayList3);
        arrayList2.clear();
        nx30 nx30Var = new nx30(this, arrayList3, z, (byte) 8);
        if (zIsEmpty) {
            nx30Var.run();
            return;
        }
        View view4 = ((w611) arrayList3.get(0)).a;
        WeakHashMap weakHashMap = b8k1.a;
        view4.postOnAnimationDelayed(nx30Var, 120L);
    }

    public final void k(w611 w611Var) {
        f(w611Var);
        View view = w611Var.a;
        WeakHashMap weakHashMap = b8k1.a;
        view.setAlpha(0.0f);
        xwd xwdVar = new xwd();
        xwdVar.a = 1.0f;
        view.setTag(2131430297, xwdVar);
        this.i.add(w611Var);
    }

    public final void n(w611 w611Var) {
        f(w611Var);
        this.h.add(w611Var);
    }
}
