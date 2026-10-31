package p;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xcn0 implements wsw, o5s {
    public boolean a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();

    public final void a(tka0 tka0Var, xsw xswVar) {
        xswVar.a(this.a);
        vsw vswVar = (vsw) this.b.get(tka0Var);
        if (vswVar != null) {
            xswVar.onNext(vswVar);
        }
        LinkedHashMap linkedHashMap = this.c;
        List list = (List) linkedHashMap.get(tka0Var);
        if (list != null) {
            list.add(xswVar);
        } else {
            linkedHashMap.put(tka0Var, p7h.O(new xsw[]{xswVar}));
        }
    }

    public final void b(boolean z) {
        vsw vswVar;
        this.a = z;
        for (Map.Entry entry : this.c.entrySet()) {
            tka0 tka0Var = (tka0) entry.getKey();
            for (xsw xswVar : (List) entry.getValue()) {
                xswVar.a(z);
                if (z && (vswVar = (vsw) this.b.get(tka0Var)) != null) {
                    xswVar.onNext(vswVar);
                }
            }
        }
    }

    public final void c(tka0 tka0Var, vsw vswVar) {
        List list;
        this.b.put(tka0Var, vswVar);
        if (!this.a || (list = (List) this.c.get(tka0Var)) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((xsw) it.next()).onNext(vswVar);
        }
    }

    @Override // p.o5s
    public final void onDestroy(iac0 iac0Var) {
        iac0Var.getLifecycle().d(this);
        LinkedHashMap linkedHashMap = this.c;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((xsw) it2.next()).a(false);
            }
        }
        linkedHashMap.clear();
    }
}
