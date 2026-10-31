package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cxd1 {
    public final ynb0 a;
    public final ynb0 b;
    public final xh7 c;
    public final idd1 d;
    public final llm e;

    public cxd1(ynb0 ynb0Var, ynb0 ynb0Var2, caq caqVar, q8n q8nVar, xh7 xh7Var) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = xh7Var;
        this.d = new idd1(new pd3(caqVar, (byte) 16));
        this.e = smo1.e(ilo1.B(new z8n("TelemetryCrashMetadataOrchestrator"), guo1.B()).y(q8nVar));
    }

    public final void a() {
        List list = (List) this.d.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r7h.W(((wgn) it.next()).a(), arrayList);
        }
        ((jxd1) this.a.get()).a(arrayList);
    }
}
