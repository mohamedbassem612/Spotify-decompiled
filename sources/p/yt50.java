package p;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yt50 extends dog0 {
    public final xt50 c;

    public yt50(nma0 nma0Var, nma0 nma0Var2) {
        super(nma0Var, nma0Var2, 0);
        this.c = new xt50(nma0Var.getDescriptor(), nma0Var2.getDescriptor());
    }

    public final Object a() {
        return new HashMap();
    }

    public final int b(Object obj) {
        return ((HashMap) obj).size() * 2;
    }

    public final Iterator c(Object obj) {
        return ((Map) obj).entrySet().iterator();
    }

    public final int d(Object obj) {
        return ((Map) obj).size();
    }

    public final Object g(Object obj) {
        Map map = (Map) obj;
        HashMap map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap(map) : map2;
    }

    public final h661 getDescriptor() {
        return this.c;
    }

    public final Object h(Object obj) {
        return (HashMap) obj;
    }
}
