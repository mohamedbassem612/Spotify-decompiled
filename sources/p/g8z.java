package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g8z implements nma0 {
    public static final g8z a = new g8z();
    public static final Set b = f46.S0(new String[]{"show", "extension"});
    public static final j661 c = omo1.j("EpisodePolicy", new h661[0]);

    public final Object deserialize(dar darVar) {
        if (!(darVar instanceof bga0)) {
            hhg1.n("Failed requirement.");
            return null;
        }
        bga0 bga0Var = (bga0) darVar;
        uga0 uga0VarL = fga0.l(bga0Var.m());
        nfa0 nfa0VarD = bga0Var.d();
        nma0 nma0VarSerializer = u3h.Companion.serializer();
        Object obj = uga0VarL.get("show");
        obj.getClass();
        nfa0VarD.getClass();
        u3h u3hVar = (u3h) hon1.z(nfa0VarD, (ega0) obj, nma0VarSerializer);
        Object obj2 = uga0VarL.get("extension");
        obj2.getClass();
        pfa0 pfa0VarK = fga0.k((ega0) obj2);
        ArrayList arrayList = new ArrayList(q7h.U(pfa0VarK, 10));
        Iterator it = pfa0VarK.a.iterator();
        while (it.hasNext()) {
            Integer numJ = fga0.j(fga0.m((ega0) it.next()));
            arrayList.add(Integer.valueOf(numJ != null ? numJ.intValue() : 0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : uga0VarL.a.entrySet()) {
            if (!b.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), Boolean.valueOf(fga0.e(fga0.m((ega0) entry2.getValue()))));
        }
        return new p3h(linkedHashMap2, u3hVar, arrayList);
    }

    public final h661 getDescriptor() {
        return c;
    }

    public final void serialize(uax uaxVar, Object obj) {
        p3h p3hVar = (p3h) obj;
        if (!(uaxVar instanceof jga0)) {
            hhg1.n("Failed requirement.");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        jga0 jga0Var = (jga0) uaxVar;
        nfa0 nfa0VarD = jga0Var.d();
        nma0 nma0VarSerializer = u3h.Companion.serializer();
        u3h u3hVar = p3hVar.b;
        nfa0VarD.getClass();
        nfa0 nfa0VarD2 = jga0Var.d();
        r36 r36Var = new r36(wr80.a, (byte) 0);
        List list = p3hVar.c;
        nfa0VarD2.getClass();
        for (Map.Entry entry : p3hVar.a.entrySet()) {
            String str = (String) entry.getKey();
            Boolean bool = (Boolean) entry.getValue();
            bool.getClass();
        }
        jga0Var.R(new uga0(linkedHashMap));
    }
}
