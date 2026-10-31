package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ng51 {
    public final gg11 a;

    public ng51(gg11 gg11Var) {
        this.a = gg11Var;
    }

    public final List a(tr3 tr3Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.a.g()) {
            if (((og51) entry.getValue()).a(tr3Var)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((mg51) ((Map.Entry) it.next()).getKey());
        }
        return o7h.a1(arrayList, new oxh((byte) 1, arrayList.contains(mg51.SavedContentByArtist)));
    }
}
