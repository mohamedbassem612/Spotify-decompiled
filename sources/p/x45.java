package p;

import com.spotify.cosmos.cosmos.Response;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x45 implements Function {
    public final nfa0 a;

    public /* synthetic */ x45(nfa0 nfa0Var) {
        this.a = nfa0Var;
    }

    public ega0 a(Object obj) {
        if (obj == null) {
            return rga0.INSTANCE;
        }
        if (obj instanceof String) {
            return fga0.c((String) obj);
        }
        if (obj instanceof Number) {
            return fga0.b((Number) obj);
        }
        if (obj instanceof Boolean) {
            return fga0.a((Boolean) obj);
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return new pfa0(arrayList);
        }
        if (obj instanceof Map) {
            Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
            int iS = zno1.s(q7h.U(setEntrySet, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (Map.Entry entry : setEntrySet) {
                linkedHashMap.put(String.valueOf(entry.getKey()), a(entry.getValue()));
            }
            return new uga0(linkedHashMap);
        }
        if (obj instanceof rlv) {
            Map mapSingletonMap = Collections.singletonMap("response", a(((rlv) obj).a));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : mapSingletonMap.entrySet()) {
                if (!u890.j((ega0) entry2.getValue(), rga0.INSTANCE)) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            return new uga0(linkedHashMap2);
        }
        if (obj instanceof qlv) {
            Map mapSingletonMap2 = Collections.singletonMap("request", a(((qlv) obj).a));
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry3 : mapSingletonMap2.entrySet()) {
                if (!u890.j((ega0) entry3.getValue(), rga0.INSTANCE)) {
                    linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                }
            }
            return new uga0(linkedHashMap3);
        }
        Class<?> cls = obj.getClass();
        nma0 nma0Var = (nma0) l8b0.a.get(cls);
        if (nma0Var == null) {
            hhg1.n("Unsupported WAMP payload: ".concat(cls.getName()));
            return null;
        }
        nfa0 nfa0Var = this.a;
        nfa0Var.getClass();
        return jon1.P(nfa0Var, obj, nma0Var);
    }

    public Object apply(Object obj) {
        nma0 nma0VarSerializer = q0f1.Companion.serializer();
        byte[] body = ((Response) obj).getBody();
        if (body == null) {
            body = new byte[0];
        }
        return (q0f1) this.a.a(new String(body, nne.a), nma0VarSerializer);
    }

    public String b(c0l1 c0l1Var) {
        nma0 nma0VarSerializer = c0l1.Companion.serializer();
        nfa0 nfa0Var = this.a;
        return nfa0Var.b(chc1.a, nfa0Var.b(nma0VarSerializer, c0l1Var));
    }

    public byte[] c(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return new pfa0(arrayList).toString().getBytes(nne.a);
    }
}
