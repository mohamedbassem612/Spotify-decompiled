package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u881 implements nma0 {
    public static final u881 a = new u881();
    public static final j661 b = omo1.j("ShowPolicy", new h661[0]);

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
            linkedHashMap2.put(entry2.getKey(), Boolean.valueOf(fga0.e(fga0.m((ega0) entry2.getValue()))));
        }
        return new yar(arrayList, linkedHashMap2.isEmpty() ? null : linkedHashMap2);
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        yar yarVar = (yar) obj;
        List list = yarVar.b;
        if (!(uaxVar instanceof jga0)) {
            hhg1.n("Failed requirement.");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            nfa0 nfa0VarD = ((jga0) uaxVar).d();
            r36 r36Var = new r36(wr80.a, (byte) 0);
            nfa0VarD.getClass();
        }
        Map map = yarVar.a;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Boolean bool = (Boolean) entry.getValue();
                bool.getClass();
            }
        }
        ((jga0) uaxVar).R(new uga0(linkedHashMap));
    }
}
