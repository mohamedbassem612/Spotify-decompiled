package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kzp0 {
    public final w5b1 a;

    public kzp0(w5b1 w5b1Var) {
        this.a = w5b1Var;
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!ihc1.y0(str)) {
                cxc cxcVarC = this.a.d.c();
                ne neVar = new ne((byte) 9);
                neVar.t();
                neVar.e0(str);
                cxcVarC.a(new ln21(neVar)).d(new nfb((byte) 18, false));
            }
        }
    }
}
