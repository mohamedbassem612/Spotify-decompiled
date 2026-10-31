package p;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class eqq0 implements qsk {
    public static final m b;
    public static final eqq0 c;
    public final TreeMap a;

    static {
        m mVar = new m((byte) 24);
        b = mVar;
        c = new eqq0(new TreeMap(mVar));
    }

    public eqq0(TreeMap treeMap) {
        this.a = treeMap;
    }

    public static eqq0 a() {
        return c;
    }

    public static eqq0 b(qsk qskVar) {
        if (eqq0.class.equals(qskVar.getClass())) {
            return (eqq0) qskVar;
        }
        TreeMap treeMap = new TreeMap(b);
        for (sy8 sy8Var : qskVar.c()) {
            Set<osk> setK = qskVar.k(sy8Var);
            ArrayMap arrayMap = new ArrayMap();
            for (osk oskVar : setK) {
                arrayMap.put(oskVar, qskVar.j(sy8Var, oskVar));
            }
            treeMap.put(sy8Var, arrayMap);
        }
        return new eqq0(treeMap);
    }

    public final Set c() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    public final Object e(sy8 sy8Var) {
        Map map = (Map) this.a.get(sy8Var);
        if (map != null) {
            return map.get((osk) Collections.min(map.keySet()));
        }
        hhg1.g(sy8Var, "Option does not exist: ");
        return null;
    }

    public final void f(uk4 uk4Var) {
        for (Map.Entry entry : this.a.tailMap(new sy8("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((sy8) entry.getKey()).a.startsWith("camera2.captureRequest.option.")) {
                return;
            }
            sy8 sy8Var = (sy8) entry.getKey();
            l2a l2aVar = (l2a) uk4Var.b;
            qsk qskVar = (qsk) uk4Var.c;
            ((xdn0) l2aVar.b).s(sy8Var, qskVar.i(sy8Var), qskVar.e(sy8Var));
        }
    }

    public final boolean g(sy8 sy8Var) {
        return this.a.containsKey(sy8Var);
    }

    public final Object h(sy8 sy8Var, Object obj) {
        try {
            return e(sy8Var);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    public final osk i(sy8 sy8Var) {
        Map map = (Map) this.a.get(sy8Var);
        if (map != null) {
            return (osk) Collections.min(map.keySet());
        }
        hhg1.g(sy8Var, "Option does not exist: ");
        return null;
    }

    public final Object j(sy8 sy8Var, osk oskVar) {
        Map map = (Map) this.a.get(sy8Var);
        if (map == null) {
            hhg1.g(sy8Var, "Option does not exist: ");
            return null;
        }
        if (map.containsKey(oskVar)) {
            return map.get(oskVar);
        }
        hhg1.i("Option does not exist: ", sy8Var, " with priority=", oskVar);
        return null;
    }

    public final Set k(sy8 sy8Var) {
        Map map = (Map) this.a.get(sy8Var);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }
}
