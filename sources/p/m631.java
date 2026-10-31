package p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m631 implements pua0 {
    public final /* synthetic */ p811 a;
    public final /* synthetic */ p811 b;
    public final /* synthetic */ llm c;
    public final /* synthetic */ n631 d;
    public final /* synthetic */ iu30 e;

    public m631(p811 p811Var, p811 p811Var2, llm llmVar, n631 n631Var, iu30 iu30Var) {
        this.a = p811Var;
        this.b = p811Var2;
        this.c = llmVar;
        this.d = n631Var;
        this.e = iu30Var;
    }

    public final Map a(Set set) {
        p811 p811Var = this.a;
        Set setV0 = dm61.v0(set, (Iterable) p811Var.a);
        p811Var.a = set;
        p811 p811Var2 = this.b;
        faa0 faa0Var = (faa0) p811Var2.a;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        if (!set.isEmpty()) {
            p811Var2.a = fn31.T(this.c, (o8n) null, 0, new m311(this.d, set, this.e, (lnm) null, (byte) 20), 3);
        }
        Set set2 = setV0;
        int iS = zno1.s(q7h.U(set2, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : set2) {
            linkedHashMap.put(obj, i3r.a);
        }
        return linkedHashMap;
    }

    public final Object c(List list, onm onmVar) {
        return rih1.a;
    }

    public final void dispose() {
        smo1.p(this.c, (CancellationException) null);
    }

    public final void b(Set set) {
    }
}
