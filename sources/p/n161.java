package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n161 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final Object a() {
        Object obj = this.a.get(lgo1.a);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final void b(t2b t2bVar, Object obj) {
        this.a.put(t2bVar, obj);
    }
}
