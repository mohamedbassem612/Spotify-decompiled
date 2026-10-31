package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xz50 implements nma0 {
    public static final xz50 a = new xz50();
    public static final j661 b = omo1.j("HeaderDecorationPolicy", new h661[0]);

    public static ega0 a(Object obj) {
        if (obj == null) {
            mf80 mf80Var = fga0.a;
            return rga0.INSTANCE;
        }
        if (obj instanceof Boolean) {
            return fga0.a((Boolean) obj);
        }
        if (obj instanceof Number) {
            return fga0.b((Number) obj);
        }
        if (obj instanceof String) {
            return fga0.c((String) obj);
        }
        if (obj instanceof ega0) {
            return (ega0) obj;
        }
        if (!(obj instanceof Map)) {
            return fga0.c(obj.toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof String) {
            }
        }
        return new uga0(linkedHashMap);
    }

    public final Object deserialize(dar darVar) {
        ArrayList arrayList;
        if (!(darVar instanceof bga0)) {
            hhg1.n("Failed requirement.");
            return null;
        }
        uga0 uga0VarL = fga0.l(((bga0) darVar).m());
        ega0 ega0Var = (ega0) uga0VarL.get("extension");
        if (ega0Var != null) {
            pfa0 pfa0VarK = fga0.k(ega0Var);
            arrayList = new ArrayList(q7h.U(pfa0VarK, 10));
            Iterator it = pfa0VarK.a.iterator();
            while (it.hasNext()) {
                Integer numJ = fga0.j(fga0.m((ega0) it.next()));
                arrayList.add(Integer.valueOf(numJ != null ? numJ.intValue() : 0));
            }
        } else {
            arrayList = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : uga0VarL.a.entrySet()) {
            if (!u890.j((String) entry.getKey(), "extension")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), fga0.m((ega0) entry2.getValue()));
        }
        return new x381(arrayList, linkedHashMap2.isEmpty() ? null : linkedHashMap2);
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        x381 x381Var = (x381) obj;
        if (!(uaxVar instanceof jga0)) {
            hhg1.n("Failed requirement.");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list = x381Var.b;
        if (list != null) {
            nfa0 nfa0VarD = ((jga0) uaxVar).d();
            r36 r36Var = new r36(wr80.a, (byte) 0);
            nfa0VarD.getClass();
        }
        Map map = x381Var.a;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
            }
        }
        ((jga0) uaxVar).R(new uga0(linkedHashMap));
    }
}
