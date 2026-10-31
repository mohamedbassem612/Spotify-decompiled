package p;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cex0 implements f961 {
    public final uu00 a;
    public final q8n b;

    public cex0(uu00 uu00Var, q8n q8nVar) {
        this.a = uu00Var;
        this.b = q8nVar;
    }

    public final Object a(List list, lnm lnmVar) {
        List list2 = list;
        int iS = zno1.s(q7h.U(list2, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : list2) {
            linkedHashMap.put(pcf.j((String) obj), obj);
        }
        return b5p1.i(new qsc0(new wzv0(new c1v0(o4p1.r(flo1.k(this.a, new paf(linkedHashMap, (byte) 2)), this.b), (byte) 26), (byte) 4), linkedHashMap, this, (byte) 26), lnmVar);
    }

    public final Object getApi() {
        return this;
    }

    public final void shutdown() {
    }
}
