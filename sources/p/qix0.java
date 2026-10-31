package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qix0 {
    public final gnq0 a;
    public final jn7 b;
    public final q8n c;

    public qix0(gnq0 gnq0Var, jn7 jn7Var, q8n q8nVar) {
        this.a = gnq0Var;
        this.b = jn7Var;
        this.c = q8nVar;
    }

    public final void a(Object obj, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            jh5 jh5Var = (jh5) entry.getKey();
            hix0 hix0Var = (iix0) entry.getValue();
            gnq0 gnq0Var = this.a;
            if (gnq0Var.b.get(jh5Var) == obj) {
                if (hix0Var == null) {
                    hix0Var = new hix0(false, 0L);
                }
                gnq0Var.a.put(jh5Var, new enq0(hix0Var, obj));
                gnq0Var.b(jh5Var);
            }
            gnq0Var.a(jh5Var, obj);
        }
    }
}
