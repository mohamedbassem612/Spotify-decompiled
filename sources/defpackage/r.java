package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import p.bsi1;
import p.csi1;
import p.dm61;
import p.dn90;
import p.dsi1;
import p.fsi1;
import p.ihc1;
import p.nod;
import p.o7h;
import p.ood;
import p.pod;
import p.q7h;
import p.sri1;
import p.xyn1;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r implements p {
    public static final r b = new r(0);
    public static final r c = new r(1);
    public static final r d = new r(2);
    public static final r e = new r(3);
    public final /* synthetic */ byte a;

    public /* synthetic */ r(byte b2) {
        this.a = b2;
    }

    public final dn90 a(sri1 sri1Var) {
        switch (this.a) {
            case 0:
                Map mapO = xyn1.o(new q(sri1Var.b, (byte) 0));
                Map mapO2 = xyn1.o(new q(sri1Var.a, (byte) 1));
                LinkedHashSet linkedHashSetY0 = dm61.y0(mapO.keySet(), mapO2.keySet());
                int iS = zno1.s(q7h.U(linkedHashSetY0, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                for (Object obj : linkedHashSetY0) {
                    String str = (String) obj;
                    Integer num = (Integer) mapO.get(str);
                    int iIntValue = num != null ? num.intValue() : 0;
                    Integer num2 = (Integer) mapO2.get(str);
                    linkedHashMap.put(obj, Integer.valueOf(iIntValue + (num2 != null ? num2.intValue() : 0)));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Number) entry.getValue()).intValue() > 1) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Set setKeySet = linkedHashMap2.keySet();
                if (setKeySet.isEmpty()) {
                    return null;
                }
                return new bsi1(setKeySet);
            case 1:
                Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9/_\\s.-]+$");
                Map map = sri1Var.d;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry2 : map.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    String str3 = (String) entry2.getValue();
                    if (!patternCompile.matcher(str2 + str3).matches() || ihc1.y0(str2) || ihc1.y0(str3)) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                    }
                }
                if (linkedHashMap3.isEmpty()) {
                    return null;
                }
                return new csi1(linkedHashMap3);
            case 2:
                Pattern patternCompile2 = Pattern.compile("^[a-zA-Z0-9_.-]+$");
                Collection collection = sri1Var.b;
                ArrayList arrayList = new ArrayList(q7h.U(collection, 10));
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(((pod) it.next()).a);
                }
                Set setP1 = o7h.p1(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : setP1) {
                    if (!patternCompile2.matcher((String) obj2).matches()) {
                        arrayList2.add(obj2);
                    }
                }
                Collection collection2 = sri1Var.a;
                ArrayList arrayList3 = new ArrayList(q7h.U(collection2, 10));
                Iterator it2 = collection2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((nod) it2.next()).a);
                }
                Set setP2 = o7h.p1(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : setP2) {
                    if (!patternCompile2.matcher((String) obj3).matches()) {
                        arrayList4.add(obj3);
                    }
                }
                Set setR1 = o7h.r1(arrayList4, arrayList2);
                if (setR1.isEmpty()) {
                    return null;
                }
                return new dsi1(setR1);
            default:
                Collection collection3 = sri1Var.b;
                ArrayList<pod> arrayList5 = new ArrayList();
                for (Object obj4 : collection3) {
                    if (((pod) obj4).d) {
                        arrayList5.add(obj4);
                    }
                }
                int iS2 = zno1.s(q7h.U(arrayList5, 10));
                if (iS2 < 16) {
                    iS2 = 16;
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iS2);
                for (pod podVar : arrayList5) {
                    linkedHashMap4.put(podVar.a, Long.valueOf(podVar.c));
                }
                Collection<ood> collection4 = sri1Var.c;
                int iS3 = zno1.s(q7h.U(collection4, 10));
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(iS3 >= 16 ? iS3 : 16);
                for (ood oodVar : collection4) {
                    linkedHashMap5.put(oodVar.a, Long.valueOf(oodVar.b));
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
                    String str4 = (String) entry3.getKey();
                    long jLongValue = ((Number) entry3.getValue()).longValue();
                    Long l = (Long) linkedHashMap5.get(str4);
                    if (l != null && l.longValue() < jLongValue) {
                        linkedHashMap6.put(entry3.getKey(), entry3.getValue());
                    }
                }
                Set setKeySet2 = linkedHashMap6.keySet();
                if (setKeySet2.isEmpty()) {
                    return null;
                }
                return new fsi1(setKeySet2);
        }
    }
}
