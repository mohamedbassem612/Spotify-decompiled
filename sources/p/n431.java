package p;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n431 {
    public final HashMap a = new HashMap();
    public final HashSet b = new HashSet();

    public static String a(String str, Type type) {
        return str + type;
    }

    public final void b(String str, d331 d331Var, Type type) {
        Object next;
        String strA;
        boolean z = d331Var instanceof y231;
        HashSet hashSet = this.b;
        if (z) {
            strA = a(str, ((y231) d331Var).a.getClass());
        } else if (type instanceof zih1) {
            Iterator it = hashSet.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!nhc1.Y((String) next, str, false));
            strA = (String) next;
        } else {
            strA = a(str, type);
        }
        if (strA == null || !hashSet.contains(strA)) {
            return;
        }
        this.a.put(strA, d331Var);
        hashSet.remove(strA);
    }
}
