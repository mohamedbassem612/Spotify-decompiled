package p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fos0 implements Serializable {
    public final HashMap a;

    public fos0(HashMap map) {
        HashMap map2 = new HashMap();
        this.a = map2;
        map2.putAll(map);
    }

    private final Object writeReplace() {
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            return new eos0(this.a);
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    public final void a(zd zdVar, List list) {
        HashMap map = this.a;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            if (!map.containsKey(zdVar)) {
                map.put(zdVar, new ArrayList(list));
                return;
            }
            List list2 = (List) map.get(zdVar);
            if (list2 != null) {
                list2.addAll(list);
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public fos0() {
        this.a = new HashMap();
    }
}
