package p;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m5k extends z511 {
    public final m5f1 d;

    public m5k(wdu0 wdu0Var, List list) {
        this.d = new m5f1(this, wdu0Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A((z511) it.next());
        }
        this.d.getClass();
        x(false);
    }

    public final void A(z511 z511Var) {
        m5f1 m5f1Var = this.d;
        ArrayList arrayList = (ArrayList) m5f1Var.e;
        int size = arrayList.size();
        if (size < 0 || size > arrayList.size()) {
            tw20.q(arrayList.size(), size, ". Given:", "Index must be between 0 and ");
            return;
        }
        boolean z = z511Var.b;
        int iE = m5f1Var.e(z511Var);
        if ((iE == -1 ? null : (t5o0) arrayList.get(iE)) != null) {
            return;
        }
        t5o0 t5o0Var = new t5o0(z511Var, m5f1Var, (jw91) m5f1Var.b, ((y281) m5f1Var.g).a());
        arrayList.add(size, t5o0Var);
        Iterator it = ((ArrayList) m5f1Var.c).iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                z511Var.m(recyclerView);
            }
        }
        if (t5o0Var.e > 0) {
            ((m5k) m5f1Var.a).k(m5f1Var.b(t5o0Var), t5o0Var.e);
        }
        m5f1Var.a();
    }

    public final List B() {
        List list;
        ArrayList arrayList = (ArrayList) this.d.e;
        if (arrayList.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((t5o0) it.next()).c);
            }
            list = arrayList2;
        }
        return Collections.unmodifiableList(list);
    }

    public final void C(z511 z511Var) {
        m5f1 m5f1Var = this.d;
        ArrayList arrayList = (ArrayList) m5f1Var.e;
        int iE = m5f1Var.e(z511Var);
        if (iE == -1) {
            return;
        }
        t5o0 t5o0Var = (t5o0) arrayList.get(iE);
        int iB = m5f1Var.b(t5o0Var);
        arrayList.remove(iE);
        ((m5k) m5f1Var.a).l(iB, t5o0Var.e);
        Iterator it = ((ArrayList) m5f1Var.c).iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                z511Var.r(recyclerView);
            }
        }
        t5o0Var.c.z(t5o0Var.f);
        t5o0Var.a.c();
        m5f1Var.a();
    }

    @Override // p.z511
    public final int d(z511 z511Var, w611 w611Var, int i) {
        m5f1 m5f1Var = this.d;
        t5o0 t5o0Var = (t5o0) ((IdentityHashMap) m5f1Var.d).get(w611Var);
        if (t5o0Var == null) {
            return -1;
        }
        z511 z511Var2 = t5o0Var.c;
        int iB = i - m5f1Var.b(t5o0Var);
        int iE = z511Var2.e();
        if (iB >= 0 && iB < iE) {
            return z511Var2.d(z511Var, w611Var, iB);
        }
        StringBuilder sbQ = cy30.q(iB, iE, "Detected inconsistent adapter updates. The local position of the view holder maps to ", " which is out of bounds for the adapter with size ", ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        sbQ.append(w611Var);
        sbQ.append("adapter:");
        sbQ.append(z511Var);
        throw new IllegalStateException(sbQ.toString());
    }

    @Override // p.z511
    public final int e() {
        Iterator it = ((ArrayList) this.d.e).iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((t5o0) it.next()).e;
        }
        return i;
    }

    @Override // p.z511
    public final long f(int i) {
        m5f1 m5f1Var = this.d;
        iti1 iti1VarC = m5f1Var.c(i);
        t5o0 t5o0Var = (t5o0) iti1VarC.c;
        long jN = t5o0Var.b.n(t5o0Var.c.f(iti1VarC.b));
        iti1VarC.a = false;
        iti1VarC.c = null;
        iti1VarC.b = -1;
        m5f1Var.f = iti1VarC;
        return jN;
    }

    @Override // p.z511
    public final int g(int i) {
        m5f1 m5f1Var = this.d;
        iti1 iti1VarC = m5f1Var.c(i);
        t5o0 t5o0Var = (t5o0) iti1VarC.c;
        int iJ = t5o0Var.a.j(t5o0Var.c.g(iti1VarC.b));
        iti1VarC.a = false;
        iti1VarC.c = null;
        iti1VarC.b = -1;
        m5f1Var.f = iti1VarC;
        return iJ;
    }

    @Override // p.z511
    public final void m(RecyclerView recyclerView) {
        m5f1 m5f1Var = this.d;
        ArrayList arrayList = (ArrayList) m5f1Var.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = ((ArrayList) m5f1Var.e).iterator();
        while (it2.hasNext()) {
            ((t5o0) it2.next()).c.m(recyclerView);
        }
    }

    @Override // p.z511
    public final void n(int i, w611 w611Var) {
        m5f1 m5f1Var = this.d;
        iti1 iti1VarC = m5f1Var.c(i);
        ((IdentityHashMap) m5f1Var.d).put(w611Var, (t5o0) iti1VarC.c);
        t5o0 t5o0Var = (t5o0) iti1VarC.c;
        t5o0Var.c.b(iti1VarC.b, w611Var);
        iti1VarC.a = false;
        iti1VarC.c = null;
        iti1VarC.b = -1;
        m5f1Var.f = iti1VarC;
    }

    @Override // p.z511
    public final w611 p(int i, ViewGroup viewGroup) {
        t5o0 t5o0VarB = ((jw91) this.d.b).b(i);
        return t5o0VarB.c.p(t5o0VarB.a.g(i), viewGroup);
    }

    @Override // p.z511
    public final void r(RecyclerView recyclerView) {
        m5f1 m5f1Var = this.d;
        ArrayList arrayList = (ArrayList) m5f1Var.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() != null) {
                if (weakReference.get() == recyclerView) {
                    arrayList.remove(size);
                    break;
                }
            } else {
                arrayList.remove(size);
            }
        }
        Iterator it = ((ArrayList) m5f1Var.e).iterator();
        while (it.hasNext()) {
            ((t5o0) it.next()).c.r(recyclerView);
        }
    }

    @Override // p.z511
    public final boolean s(w611 w611Var) {
        m5f1 m5f1Var = this.d;
        IdentityHashMap identityHashMap = (IdentityHashMap) m5f1Var.d;
        t5o0 t5o0Var = (t5o0) identityHashMap.get(w611Var);
        if (t5o0Var == null) {
            ncn0.f("Cannot find wrapper for ", w611Var, ", seems like it is not bound by this adapter: ", m5f1Var);
            return false;
        }
        boolean zS = t5o0Var.c.s(w611Var);
        identityHashMap.remove(w611Var);
        return zS;
    }

    @Override // p.z511
    public final void t(w611 w611Var) {
        this.d.d(w611Var).c.t(w611Var);
    }

    @Override // p.z511
    public final void u(w611 w611Var) {
        this.d.d(w611Var).c.u(w611Var);
    }

    @Override // p.z511
    public final void v(w611 w611Var) {
        m5f1 m5f1Var = this.d;
        IdentityHashMap identityHashMap = (IdentityHashMap) m5f1Var.d;
        t5o0 t5o0Var = (t5o0) identityHashMap.get(w611Var);
        if (t5o0Var == null) {
            ncn0.f("Cannot find wrapper for ", w611Var, ", seems like it is not bound by this adapter: ", m5f1Var);
        } else {
            t5o0Var.c.v(w611Var);
            identityHashMap.remove(w611Var);
        }
    }

    public m5k(wdu0 wdu0Var, z511... z511VarArr) {
        this(wdu0Var, Arrays.asList(z511VarArr));
    }

    public m5k(z511... z511VarArr) {
        this(wdu0.t, z511VarArr);
    }
}
