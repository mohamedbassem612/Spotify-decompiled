package p;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pnn0 extends xbk1 {
    public static final gzs c = new gzs((byte) 2);
    public final LinkedHashMap b = new LinkedHashMap();

    public final void S() {
        LinkedHashMap linkedHashMap = this.b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((rck1) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final rck1 T(String str) {
        LinkedHashMap linkedHashMap = this.b;
        rck1 rck1Var = (rck1) linkedHashMap.get(str);
        if (rck1Var != null) {
            return rck1Var;
        }
        rck1 rck1Var2 = new rck1();
        linkedHashMap.put(str, rck1Var2);
        return rck1Var2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
