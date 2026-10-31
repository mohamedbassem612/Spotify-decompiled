package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class aqr {
    public final ynb0 a;

    public aqr(ynb0 ynb0Var) {
        this.a = ynb0Var;
    }

    public final wa3 a(gpt gptVar) {
        Iterable iterable = (Iterable) this.a.get();
        ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((lhm) it.next()).a(gptVar));
        }
        return new wa3((mr20[]) o7h.l1(arrayList).toArray(new mr20[0]), (byte) 5);
    }
}
