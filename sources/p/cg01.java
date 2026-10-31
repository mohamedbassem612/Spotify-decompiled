package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cg01 {
    public final LinkedHashMap a = new LinkedHashMap(0, 0.75f, true);
    public long b;
    public long c;
    public final /* synthetic */ upb d;

    public cg01(upb upbVar, long j) {
        this.d = upbVar;
        this.b = j;
        if (j > 0) {
            return;
        }
        hhg1.n("maxSize <= 0");
        throw null;
    }

    public final void a(Object obj, Object obj2, bg01 bg01Var) {
        bg01 bg01Var2 = (bg01) obj2;
        ((up20) this.d.b).k((bsi0) obj, bg01Var2.a, bg01Var2.b, bg01Var2.c);
    }

    public final long b() {
        long j = this.c;
        if (j != -1) {
            return j;
        }
        long jC = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            jC += c(entry.getKey(), entry.getValue());
        }
        this.c = jC;
        return jC;
    }

    public final long c(Object obj, Object obj2) throws Exception {
        try {
            long j = ((bg01) obj2).c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.c = -1L;
            throw e;
        }
    }

    public final void d(long j) {
        while (b() > j) {
            LinkedHashMap linkedHashMap = this.a;
            if (linkedHashMap.isEmpty()) {
                if (b() == 0) {
                    return;
                }
                eg.m("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) o7h.p0(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.c = b() - c(key, value);
                a(key, value, null);
            }
        }
    }
}
