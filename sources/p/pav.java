package p;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pav implements sd00 {
    public final nfa0 a;

    public pav(nfa0 nfa0Var) {
        this.a = nfa0Var;
    }

    public final LinkedHashMap a(String str) {
        if (str.length() == 0) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        chc1 chc1Var = chc1.a;
        Iterator it = ((Map) this.a.a(str, new nlc0(chc1Var, new nlc0(chc1Var, o5f0.a)))).entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((Map) ((Map.Entry) it.next()).getValue()).entrySet()) {
                String str2 = (String) entry.getKey();
                long jLongValue = ((Number) entry.getValue()).longValue();
                Object td00Var = linkedHashMap.get(str2);
                if (td00Var == null) {
                    td00Var = new td00();
                    linkedHashMap.put(str2, td00Var);
                }
                LinkedHashMap linkedHashMap2 = qd00.b;
                nav[] navVarArr = ((td00) td00Var).a;
                nav navVar = navVarArr[2];
                navVar.a += jLongValue;
                navVar.b = navVar.b;
                navVarArr[2] = navVar;
            }
        }
        return linkedHashMap;
    }
}
