package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j0f1 {
    public final ArrayList a;

    public j0f1(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new g0f1(false));
        }
        this.a = arrayList;
    }

    public final Set a() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (!((g0f1) obj).a) {
                arrayList.add(obj);
            }
        }
        return o7h.p1(arrayList);
    }

    public final void b(g0f1 g0f1Var) {
        if (((Boolean) g0f1Var.b.getValue()).booleanValue()) {
            return;
        }
        c(g0f1Var, false);
    }

    public final g0f1 c(g0f1 g0f1Var, boolean z) {
        Object next;
        if (((Boolean) g0f1Var.b.getValue()).booleanValue()) {
            eg.m("token is already invalidated");
            return null;
        }
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j((g0f1) next, g0f1Var));
        if (next == null) {
            bhn0.g(g0f1Var, "token not found: ");
            return null;
        }
        g0f1 g0f1Var2 = (g0f1) next;
        g0f1Var2.b.m((Object) null, Boolean.TRUE);
        arrayList.remove(g0f1Var2);
        g0f1 g0f1Var3 = new g0f1(z);
        arrayList.add(g0f1Var3);
        return g0f1Var3;
    }
}
