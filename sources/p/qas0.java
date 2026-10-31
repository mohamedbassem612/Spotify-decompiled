package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qas0 implements q090 {
    public final LinkedHashSet a = new LinkedHashSet();
    public final LinkedHashMap b = new LinkedHashMap();

    public final Object a(vf01 vf01Var, lnm lnmVar) {
        zy70 zy70Var = vf01Var.d;
        LinkedHashSet linkedHashSet = this.a;
        if (linkedHashSet.isEmpty()) {
            return vf01Var.c((onm) lnmVar);
        }
        for (Object obj : zy70Var.s.a.values()) {
            if ((obj instanceof String) && linkedHashSet.contains(obj)) {
                LinkedHashMap linkedHashMap = this.b;
                List arrayList = (List) linkedHashMap.get(obj);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(zy70Var);
                linkedHashMap.put(obj, arrayList);
                throw new CancellationException("Request is paused");
            }
        }
        return vf01Var.c((onm) lnmVar);
    }
}
