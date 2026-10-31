package p;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ncp1 {
    public final Map a;
    public final Map b;

    public ncp1(HashMap map, HashMap map2, HashMap map3) {
        Collections.unmodifiableMap(new HashMap(map));
        this.a = Collections.unmodifiableMap(new HashMap(map2));
        this.b = td6.n(map3);
    }

    public Enum a(Object obj) throws GeneralSecurityException {
        Enum r1 = (Enum) this.b.get(obj);
        if (r1 != null) {
            return r1;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public Object b(Enum r2) throws GeneralSecurityException {
        Object obj = this.a.get(r2);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(r2.toString()));
    }

    public /* synthetic */ ncp1(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }
}
