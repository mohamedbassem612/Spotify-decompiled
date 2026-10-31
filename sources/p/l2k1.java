package p;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l2k1 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public ArrayList b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2k1)) {
            return false;
        }
        l2k1 l2k1Var = (l2k1) obj;
        return this.a.equals(l2k1Var.a) && u890.j(this.b, l2k1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ArrayList arrayList = this.b;
        return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }
}
