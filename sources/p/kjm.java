package p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kjm {
    public final igm a;
    public final List b;
    public final boolean c;
    public final boolean d;

    public kjm(igm igmVar, List list, boolean z) {
        this.a = igmVar;
        this.b = list;
        this.c = z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str = ((jhm) obj).a;
            Object objH = linkedHashMap.get(str);
            if (objH == null) {
                objH = cfm0.h(str, linkedHashMap);
            }
            ((List) objH).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((List) entry.getValue()).size() > 1) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            n57.e("ContextMenuViewModel cannot contain items with duplicate itemResId. id=" + ((String) entry2.getKey()) + ", items=" + o7h.y0((List) entry2.getValue(), ", ", (String) null, (String) null, afm.V0, 30));
        }
        this.d = !linkedHashMap2.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjm)) {
            return false;
        }
        kjm kjmVar = (kjm) obj;
        return u890.j(this.a, kjmVar.a) && u890.j(this.b, kjmVar.b) && this.c == kjmVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    public /* synthetic */ kjm(igm igmVar, List list, int i) {
        this((i & 1) != 0 ? new igm((String) null, (rzn1) null, (String) null, 7) : igmVar, (i & 2) != 0 ? z6x.a : list, (i & 4) == 0);
    }
}
