package p;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class fjg1 {
    public static final by8 a = new by8();
    public static final ThreadLocal b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    public static void a(ViewGroup viewGroup, jhg1 jhg1Var) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (jhg1Var == null) {
            jhg1Var = a;
        }
        jhg1 jhg1VarClone = jhg1Var.clone();
        d(viewGroup, jhg1VarClone);
        men1.C(viewGroup);
        ejg1 ejg1Var = new ejg1();
        ejg1Var.a = jhg1VarClone;
        ejg1Var.b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(ejg1Var);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(ejg1Var);
    }

    public static void b(ViewGroup viewGroup) {
        c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((jhg1) arrayList2.get(size)).s(viewGroup);
        }
    }

    public static y36 c() {
        y36 y36Var;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (y36Var = (y36) weakReference.get()) != null) {
            return y36Var;
        }
        y36 y36Var2 = new y36(0);
        threadLocal.set(new WeakReference(y36Var2));
        return y36Var2;
    }

    public static void d(ViewGroup viewGroup, jhg1 jhg1Var) {
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((jhg1) it.next()).E(viewGroup);
            }
        }
        if (jhg1Var != null) {
            jhg1Var.j(viewGroup, true);
        }
        men1.s(viewGroup);
    }
}
