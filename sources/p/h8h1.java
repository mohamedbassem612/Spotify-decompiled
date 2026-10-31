package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class h8h1 {
    public static final LinkedHashMap a = sqg0.I(oqn1.n("path_names", "name"), oqn1.n("path_ids", "id"), oqn1.n("path_uris", "uri"), oqn1.n("path_pos", "pos"), oqn1.n("path_reasons", "reason"), oqn1.n("path_specification_versions", "specification_version"));
    public static final LinkedHashMap b = sqg0.I(oqn1.n("element_path_names", "name"), oqn1.n("element_path_ids", "id"), oqn1.n("element_path_uris", "uri"), oqn1.n("element_path_pos", "pos"), oqn1.n("element_path_reasons", "reason"));

    public static String a(s2j0 s2j0Var) {
        Integer numValueOf;
        Integer numValueOf2;
        boolean z;
        String string = s2j0Var.toString();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = a;
        Set setKeySet = linkedHashMap.keySet();
        int iS = zno1.s(q7h.U(setKeySet, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
        for (Object obj : setKeySet) {
            linkedHashMap2.put(obj, new ArrayList());
        }
        LinkedHashMap linkedHashMap3 = b;
        Set setKeySet2 = linkedHashMap3.keySet();
        int iS2 = zno1.s(q7h.U(setKeySet2, 10));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
        for (Object obj2 : setKeySet2) {
            linkedHashMap4.put(obj2, new ArrayList());
        }
        ArrayList arrayList2 = new ArrayList();
        ejc0 it = ihc1.C0(string).iterator();
        Integer numValueOf3 = null;
        String strSubstring = null;
        Integer numValueOf4 = null;
        Integer numValueOf5 = null;
        while (true) {
            ejc0 ejc0Var = it;
            int i = 0;
            if (!ejc0Var.hasNext()) {
                break;
            }
            String str = (String) ejc0Var.next();
            int iW0 = ihc1.w0(str, ": ", 0, false, 6);
            String strSubstring2 = iW0 > 0 ? str.substring(0, iW0) : "";
            String str2 = string;
            if (iW0 <= 0) {
                z = false;
                break;
            }
            while (true) {
                if (i >= strSubstring2.length()) {
                    z = true;
                    break;
                }
                if (eth.H(strSubstring2.charAt(i))) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z && strSubstring2.equals("page_presentation_id")) {
                if (numValueOf3 == null) {
                    numValueOf3 = Integer.valueOf(arrayList.size());
                }
                strSubstring = str.substring(iW0 + 2);
            } else if (z && linkedHashMap.containsKey(strSubstring2)) {
                if (numValueOf3 == null) {
                    numValueOf3 = Integer.valueOf(arrayList.size());
                }
                ((List) sqg0.G(strSubstring2, linkedHashMap2)).add(str.substring(iW0 + 2));
            } else if (z && linkedHashMap3.containsKey(strSubstring2)) {
                if (numValueOf4 == null) {
                    numValueOf4 = Integer.valueOf(arrayList.size());
                }
                ((List) sqg0.G(strSubstring2, linkedHashMap4)).add(str.substring(iW0 + 2));
            } else if (z && strSubstring2.equals("previous_interaction_ids")) {
                if (numValueOf5 == null) {
                    numValueOf5 = Integer.valueOf(arrayList.size());
                }
                arrayList2.add(str.substring(iW0 + 2));
            } else {
                arrayList.add(str);
            }
            string = str2;
        }
        String str3 = string;
        Iterator it2 = linkedHashMap2.values().iterator();
        if (it2.hasNext()) {
            numValueOf = Integer.valueOf(((List) it2.next()).size());
            while (it2.hasNext()) {
                Integer numValueOf6 = Integer.valueOf(((List) it2.next()).size());
                if (numValueOf.compareTo(numValueOf6) < 0) {
                    numValueOf = numValueOf6;
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        Iterator it3 = linkedHashMap4.values().iterator();
        if (it3.hasNext()) {
            numValueOf2 = Integer.valueOf(((List) it3.next()).size());
            while (it3.hasNext()) {
                Integer numValueOf7 = Integer.valueOf(((List) it3.next()).size());
                if (numValueOf2.compareTo(numValueOf7) < 0) {
                    numValueOf2 = numValueOf7;
                }
            }
        } else {
            numValueOf2 = null;
        }
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
        if (strSubstring == null && iIntValue == 0 && iIntValue2 == 0 && arrayList2.isEmpty()) {
            return str3;
        }
        ArrayList arrayList3 = new ArrayList();
        if (strSubstring != null || iIntValue > 0) {
            Integer numValueOf8 = Integer.valueOf(numValueOf3 != null ? numValueOf3.intValue() : arrayList.size());
            smc0 smc0VarN = k4p1.n();
            smc0VarN.add("page_presentation: {");
            if (strSubstring != null) {
                smc0VarN.add("  id: ".concat(strSubstring));
            }
            if (iIntValue > 0) {
                smc0VarN.add("  path: {");
                int i2 = 0;
                while (i2 < iIntValue) {
                    int i3 = iIntValue;
                    smc0VarN.add("    node[" + i2 + "]: {");
                    Iterator it4 = linkedHashMap.entrySet().iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry = (Map.Entry) it4.next();
                        Iterator it5 = it4;
                        String str4 = (String) entry.getKey();
                        String str5 = (String) entry.getValue();
                        String str6 = (String) o7h.t0(i2, (List) sqg0.G(str4, linkedHashMap2));
                        LinkedHashMap linkedHashMap5 = linkedHashMap2;
                        if (str6 != null) {
                            smc0VarN.add("      " + str5 + ": " + str6);
                        }
                        linkedHashMap2 = linkedHashMap5;
                        it4 = it5;
                        i2 = i2;
                    }
                    smc0VarN.add("    }");
                    i2++;
                    iIntValue = i3;
                }
                smc0VarN.add("  }");
            }
            smc0VarN.add("}");
            arrayList3.add(oqn1.n(numValueOf8, k4p1.k(smc0VarN)));
        }
        if (iIntValue2 > 0) {
            Integer numValueOf9 = Integer.valueOf(numValueOf4 != null ? numValueOf4.intValue() : arrayList.size());
            smc0 smc0VarN2 = k4p1.n();
            smc0VarN2.add("element_path: {");
            int i4 = 0;
            while (i4 < iIntValue2) {
                smc0VarN2.add("  node[" + i4 + "]: {");
                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                    String str7 = (String) entry2.getKey();
                    String str8 = (String) entry2.getValue();
                    String str9 = (String) o7h.t0(i4, (List) sqg0.G(str7, linkedHashMap4));
                    if (str9 != null) {
                        smc0VarN2.add("    " + str8 + ": " + str9);
                    }
                    i4 = i4;
                }
                smc0VarN2.add("  }");
                i4++;
            }
            smc0VarN2.add("}");
            arrayList3.add(oqn1.n(numValueOf9, k4p1.k(smc0VarN2)));
        }
        if (!arrayList2.isEmpty()) {
            Integer numValueOf10 = Integer.valueOf(numValueOf5 != null ? numValueOf5.intValue() : arrayList.size());
            smc0 smc0VarN3 = k4p1.n();
            smc0VarN3.add("previous_interactions: {");
            int i5 = 0;
            for (Object obj3 : arrayList2) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    p7h.T();
                    throw null;
                }
                smc0VarN3.add("  interaction[" + i5 + "]: {");
                StringBuilder sb = new StringBuilder("    id: ");
                sb.append((String) obj3);
                smc0VarN3.add(sb.toString());
                smc0VarN3.add("  }");
                i5 = i6;
            }
            smc0VarN3.add("}");
            arrayList3.add(oqn1.n(numValueOf10, k4p1.k(smc0VarN3)));
        }
        for (mmr0 mmr0Var : o7h.a1(arrayList3, new be21((byte) 26))) {
            arrayList.addAll(((Number) mmr0Var.a).intValue(), (List) mmr0Var.b);
        }
        return o7h.y0(arrayList, "\n", null, null, null, 62);
    }
}
