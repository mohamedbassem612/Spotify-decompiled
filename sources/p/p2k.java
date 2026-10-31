package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p2k implements sig {
    public final Set a;

    public p2k(Set set) {
        this.a = set;
    }

    @Override // p.sig
    public final String a(m210 m210Var) {
        Set set = this.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String strA = ((sig) it.next()).a(m210Var);
            if (strA != null) {
                arrayList.add(strA);
            }
        }
        if (arrayList.size() > 1) {
            n57.s("More than one matching client context: " + m210Var);
        }
        return (String) o7h.s0(arrayList);
    }
}
