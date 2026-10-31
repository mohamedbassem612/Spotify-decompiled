package p;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nlc0 extends dog0 {
    public final mlc0 c;

    public nlc0(nma0 nma0Var, nma0 nma0Var2) {
        super(nma0Var, nma0Var2);
        this.c = new mlc0("kotlin.collections.LinkedHashMap", nma0Var.getDescriptor(), nma0Var2.getDescriptor());
    }

    public final Object a() {
        return new LinkedHashMap();
    }

    public final int b(Object obj) {
        return ((LinkedHashMap) obj).size() * 2;
    }

    public final Iterator c(Object obj) {
        return ((Map) obj).entrySet().iterator();
    }

    public final int d(Object obj) {
        return ((Map) obj).size();
    }

    public final Object g(Object obj) {
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    public final h661 getDescriptor() {
        return this.c;
    }

    public final Object h(Object obj) {
        return (LinkedHashMap) obj;
    }
}
