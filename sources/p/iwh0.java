package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iwh0 extends lwh0 {
    public final ArrayList w;
    public final y36 x;

    public iwh0(kwh0 kwh0Var, String str, String str2) {
        super(kwh0Var, str, str2, false);
        this.w = new ArrayList();
        this.x = new y36(0);
    }

    public final int m(lwh0 lwh0Var) {
        kvh0 kvh0Var = (kvh0) this.x.get(lwh0Var.c);
        if (kvh0Var != null) {
            return kvh0Var.b;
        }
        return 4;
    }

    public final boolean n() {
        owh0.b();
        return owh0.c().e().contains(this);
    }

    public final boolean o(lwh0 lwh0Var) {
        kvh0 kvh0Var = (kvh0) this.x.get(lwh0Var.c);
        return kvh0Var != null && kvh0Var.d;
    }

    public final boolean p(lwh0 lwh0Var) {
        kvh0 kvh0Var = (kvh0) this.x.get(lwh0Var.c);
        return kvh0Var != null && kvh0Var.c;
    }

    public final void q(Collection collection) {
        lwh0 lwh0Var;
        ((lwh0) this).v.clear();
        ArrayList arrayList = this.w;
        arrayList.clear();
        y36 y36Var = this.x;
        y36Var.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            kvh0 kvh0Var = (kvh0) it.next();
            String strG = kvh0Var.a.g();
            Iterator it2 = ((lwh0) this).a.b.iterator();
            do {
                if (!it2.hasNext()) {
                    lwh0Var = null;
                    break;
                }
                lwh0Var = (lwh0) it2.next();
            } while (!lwh0Var.b.equals(strG));
            if (lwh0Var != null) {
                arrayList.add(lwh0Var);
                y36Var.put(lwh0Var.c, kvh0Var);
                int i = kvh0Var.b;
                if (i == 2 || i == 3) {
                    ((lwh0) this).v.add(lwh0Var);
                }
            }
        }
        owh0.c().a.b(259, this);
    }
}
