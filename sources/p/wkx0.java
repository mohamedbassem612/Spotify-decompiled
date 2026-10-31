package p;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wkx0 implements AutoCloseable {
    public static final cua d = new cua((byte) 21);
    public final g2z a;
    public final Set b;
    public final Map c = Collections.synchronizedMap(new LinkedHashMap());

    public wkx0(g2z g2zVar, tj70 tj70Var, Set set) {
        this.a = g2zVar;
        this.b = set;
    }

    public final Set a() {
        return this.b;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Map map = this.c;
        for (iu30 iu30Var : o7h.l1(map.keySet())) {
            iu30Var.getClass();
            if (map.remove(iu30Var) != null) {
                bhn0.d();
                return;
            }
        }
        this.a.z();
    }
}
