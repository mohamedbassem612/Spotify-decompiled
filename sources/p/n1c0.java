package p;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n1c0 implements me41 {
    public final void a(qe41 qe41Var) {
        if (!(qe41Var instanceof sck1)) {
            bhn0.g(qe41Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
            return;
        }
        rck1 rck1VarO = ((sck1) qe41Var).o();
        oe41 oe41VarP = qe41Var.p();
        LinkedHashMap linkedHashMap = rck1VarO.a;
        LinkedHashMap linkedHashMap2 = rck1VarO.a;
        Iterator it = o7h.p1(linkedHashMap.keySet()).iterator();
        while (it.hasNext()) {
            xbk1 xbk1Var = (xbk1) linkedHashMap2.get(it.next());
            if (xbk1Var != null) {
                aqo1.o(xbk1Var, oe41VarP, qe41Var.getLifecycle());
            }
        }
        if (o7h.p1(linkedHashMap2.keySet()).isEmpty()) {
            return;
        }
        oe41VarP.d();
    }
}
