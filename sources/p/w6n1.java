package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w6n1 implements nma0 {
    public static final w6n1 a = new w6n1();
    public static final nma0 b;
    public static final h661 c;

    static {
        nma0 nma0VarSerializer = uga0.Companion.serializer();
        b = nma0VarSerializer;
        c = nma0VarSerializer.getDescriptor();
    }

    public static Object a(aha0 aha0Var) {
        Long lValueOf;
        if (fga0.j(aha0Var) != null) {
            return Integer.valueOf(fga0.i(aha0Var));
        }
        if (aha0Var.c()) {
            return aha0Var.toString();
        }
        if (fga0.f(aha0Var) != null) {
            return Boolean.valueOf(fga0.e(aha0Var));
        }
        if (nhc1.b0(aha0Var.b()) != null) {
            return Float.valueOf(Float.parseFloat(aha0Var.b()));
        }
        if (nhc1.a0(aha0Var.b()) != null) {
            return Double.valueOf(fga0.h(aha0Var));
        }
        try {
            lValueOf = Long.valueOf(fga0.o(aha0Var));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return Long.valueOf(fga0.n(aha0Var));
        }
        return null;
    }

    @Override // p.nma0
    public final Object deserialize(dar darVar) {
        Object objA;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        uga0 uga0Var = (uga0) darVar.Y(b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(uga0Var.a.size()));
        for (Map.Entry entry : uga0Var.a.entrySet()) {
            Object key = entry.getKey();
            Object key2 = entry.getKey();
            aha0 aha0Var = (ega0) entry.getValue();
            if (aha0Var instanceof aha0) {
                objA = a(aha0Var);
            } else if (aha0Var instanceof pfa0) {
                ArrayList arrayList = new ArrayList();
                for (aha0 aha0Var2 : ((pfa0) entry.getValue()).a) {
                    if (!(aha0Var2 instanceof aha0)) {
                        hhg1.o(aha0Var2, "Type unsupported for element ");
                        return null;
                    }
                    arrayList.add(a(aha0Var2));
                }
                objA = arrayList;
            } else {
                objA = null;
            }
            linkedHashMap.put(key2, objA);
            linkedHashMap2.put(key, rih1.a);
        }
        return linkedHashMap;
    }

    @Override // p.nma0
    public final h661 getDescriptor() {
        return c;
    }

    @Override // p.nma0
    public final void serialize(uax uaxVar, Object obj) {
        aha0 pfa0Var;
        aha0 aha0VarA;
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null ? true : value instanceof Number) {
                pfa0Var = fga0.b((Number) value);
            } else if (value == null ? true : value instanceof String) {
                pfa0Var = fga0.c((String) value);
            } else if (value == null ? true : value instanceof Boolean) {
                pfa0Var = fga0.a((Boolean) value);
            } else {
                if (!(value instanceof List)) {
                    eg.m(f4i1.d(entry.getValue(), "Unsupported type "));
                    return;
                }
                Iterable iterable = (Iterable) value;
                ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null ? true : next instanceof Number) {
                        aha0VarA = fga0.b((Number) next);
                    } else if (next == null ? true : next instanceof String) {
                        aha0VarA = fga0.c((String) next);
                    } else {
                        if (!(next == null ? true : next instanceof Boolean)) {
                            eg.m(f4i1.d(next, "Unsupported type "));
                            return;
                        }
                        aha0VarA = fga0.a((Boolean) next);
                    }
                    arrayList.add(aha0VarA);
                }
                pfa0Var = new pfa0(arrayList);
            }
            linkedHashMap2.put(key, pfa0Var);
        }
        uaxVar.i(b, new uga0(linkedHashMap2));
    }
}
