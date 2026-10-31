package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m2k implements ieh {
    public final ArrayList a;

    public m2k(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // p.ieh
    public final void a(qs31 qs31Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ieh) it.next()).a(qs31Var);
        }
    }

    @Override // p.ieh
    public final void b(qs31 qs31Var, qy8 qy8Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ieh) it.next()).b(qs31Var, qy8Var);
        }
    }

    @Override // p.ieh
    public final void c(qs31 qs31Var, List list) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ieh) it.next()).c(qs31Var, list);
        }
    }
}
