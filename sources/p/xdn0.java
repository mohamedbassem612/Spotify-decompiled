package p;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xdn0 extends eqq0 {
    public static xdn0 d() {
        return new xdn0(new TreeMap(eqq0.b));
    }

    public static xdn0 n(qsk qskVar) {
        TreeMap treeMap = new TreeMap(eqq0.b);
        for (sy8 sy8Var : qskVar.c()) {
            Set<osk> setK = qskVar.k(sy8Var);
            ArrayMap arrayMap = new ArrayMap();
            for (osk oskVar : setK) {
                arrayMap.put(oskVar, qskVar.j(sy8Var, oskVar));
            }
            treeMap.put(sy8Var, arrayMap);
        }
        return new xdn0(treeMap);
    }

    public final void r(sy8 sy8Var, Object obj) {
        s(sy8Var, osk.c, obj);
    }

    public final void s(sy8 sy8Var, osk oskVar, Object obj) {
        osk oskVar2;
        TreeMap treeMap = this.a;
        Map map = (Map) treeMap.get(sy8Var);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(sy8Var, arrayMap);
            arrayMap.put(oskVar, obj);
            return;
        }
        osk oskVar3 = (osk) Collections.min(map.keySet());
        if (Objects.equals(map.get(oskVar3), obj) || oskVar3 != (oskVar2 = osk.b) || oskVar != oskVar2) {
            map.put(oskVar, obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Option values conflicts: ");
        sb.append(sy8Var.a);
        sb.append(", existing value (");
        sb.append(oskVar3);
        Object obj2 = map.get(oskVar3);
        sb.append(")=");
        sb.append(obj2);
        sb.append(", conflicting (");
        sb.append(oskVar);
        sb.append(")=");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
}
