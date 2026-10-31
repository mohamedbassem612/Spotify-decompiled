package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f8z implements nma0 {
    public static final f8z a = new f8z();
    public static final nlc0 b = new nlc0(chc1.a, gpb.a);
    public static final Set c = f46.S0(new String[]{"show", "extension"});
    public static final j661 d = omo1.j("EpisodePolicy", new h661[0]);

    public final Object deserialize(dar darVar) {
        Map map;
        ArrayList arrayList;
        if (!(darVar instanceof bga0)) {
            hhg1.n("Failed requirement.");
            return null;
        }
        bga0 bga0Var = (bga0) darVar;
        uga0 uga0VarL = fga0.l(bga0Var.m());
        ega0 ega0Var = (ega0) uga0VarL.get("show");
        if (ega0Var != null) {
            nfa0 nfa0VarD = bga0Var.d();
            nfa0VarD.getClass();
            map = (Map) hon1.z(nfa0VarD, ega0Var, b);
        } else {
            map = null;
        }
        ega0 ega0Var2 = (ega0) uga0VarL.get("extension");
        if (ega0Var2 != null) {
            pfa0 pfa0VarK = fga0.k(ega0Var2);
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
            if (!c.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), Boolean.valueOf(fga0.e(fga0.m((ega0) entry2.getValue()))));
        }
        return new war(arrayList, linkedHashMap2.isEmpty() ? null : linkedHashMap2, map);
    }

    public final h661 getDescriptor() {
        return d;
    }

    public final void serialize(uax uaxVar, Object obj) {
        war warVar = (war) obj;
        if (!(uaxVar instanceof jga0)) {
            hhg1.n("Failed requirement.");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map = warVar.b;
        if (map != null) {
            nfa0 nfa0VarD = ((jga0) uaxVar).d();
            nfa0VarD.getClass();
        }
        List list = warVar.c;
        if (list != null) {
            nfa0 nfa0VarD2 = ((jga0) uaxVar).d();
            r36 r36Var = new r36(wr80.a, (byte) 0);
            nfa0VarD2.getClass();
        }
        Map map2 = warVar.a;
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                String str = (String) entry.getKey();
                Boolean bool = (Boolean) entry.getValue();
                bool.getClass();
            }
        }
        ((jga0) uaxVar).R(new uga0(linkedHashMap));
    }
}
