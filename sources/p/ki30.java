package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ki30 implements oh30 {
    public final /* synthetic */ mnn0 a;
    public final /* synthetic */ ii30 b;

    public ki30(mnn0 mnn0Var, ii30 ii30Var) {
        this.a = mnn0Var;
        this.b = ii30Var;
    }

    public final void a(zf30 zf30Var, boolean z) {
        Object obj;
        Object objPrevious;
        ii30 ii30Var = this.b;
        ArrayList arrayList = ii30Var.g;
        mnn0 mnn0Var = this.a;
        ArrayList arrayListN0 = o7h.N0((Iterable) mnn0Var.f.a.getValue(), (Collection) mnn0Var.e.a.getValue());
        ListIterator listIterator = arrayListN0.listIterator(arrayListN0.size());
        do {
            obj = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((hnn0) objPrevious).f.equals(zf30Var.a1));
        hnn0 hnn0Var = (hnn0) objPrevious;
        boolean z2 = z && arrayList.isEmpty() && zf30Var.Y;
        for (Object obj2 : arrayList) {
            if (u890.j(((mmr0) obj2).a, zf30Var.a1)) {
                obj = obj2;
                break;
            }
        }
        mmr0 mmr0Var = (mmr0) obj;
        if (mmr0Var != null) {
            arrayList.remove(mmr0Var);
        }
        if (!z2 && ii30.n()) {
            zf30Var.toString();
            Objects.toString(hnn0Var);
        }
        boolean z3 = mmr0Var != null && ((Boolean) mmr0Var.b).booleanValue();
        if (!z && !z3 && hnn0Var == null) {
            hhg1.f(gvg.i("The fragment ", zf30Var, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."));
            return;
        }
        if (hnn0Var != null) {
            ii30Var.l(zf30Var, hnn0Var, mnn0Var);
            if (z2) {
                if (ii30.n()) {
                    zf30Var.toString();
                    hnn0Var.toString();
                }
                mnn0Var.g(hnn0Var, false);
            }
        }
    }

    public final void b(zf30 zf30Var, boolean z) {
        Object objPrevious;
        if (z) {
            mnn0 mnn0Var = this.a;
            List list = (List) mnn0Var.e.a.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((hnn0) objPrevious).f.equals(zf30Var.a1));
            hnn0 hnn0Var = (hnn0) objPrevious;
            if (ii30.n()) {
                zf30Var.toString();
                Objects.toString(hnn0Var);
            }
            if (hnn0Var != null) {
                mnn0Var.h(hnn0Var);
            }
        }
    }

    public final void onBackStackChanged() {
    }
}
