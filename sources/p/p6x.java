package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p6x implements f1r {
    public static final i1r a = new i1r(rih1.a, (Integer) null);

    public final k1r a(Map map) {
        return a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof f1r) || 1 != obj.hashCode()) {
                return false;
            }
            List items = ((f1r) obj).getItems();
            if (!(items instanceof List) || !items.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final List getItems() {
        return z6x.a;
    }

    public final int hashCode() {
        return 1;
    }
}
