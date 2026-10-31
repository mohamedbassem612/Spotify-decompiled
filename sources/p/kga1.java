package p;

import android.app.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kga1 {
    public static final Map d = sqg0.J(new mmr0[]{new mmr0(yfa1.a, "Default"), new mmr0(aga1.a, "Newest"), new mmr0(bga1.a, "Oldest"), new mmr0(zfa1.a, "MostPopular")});
    public static final bma1 e;
    public static final bma1 f;
    public static final bma1 g;
    public final dma1 a;
    public final idd1 b = new idd1(new jga1(this, (byte) 1));
    public final idd1 c = new idd1(new jga1(this, (byte) 0));

    static {
        nbc nbcVar = bma1.b;
        e = nbcVar.n("show-preferences-sort-order");
        f = nbcVar.n("show-preferences-filter-option");
        g = nbcVar.n("cwp-sort-filter-options");
    }

    public kga1(String str, Application application, ucd ucdVar) {
        this.a = ucdVar.b.b(application, str);
    }

    public static LinkedHashMap d(String str) {
        LinkedHashMap linkedHashMap = null;
        if (str.length() == 0) {
            str = null;
        }
        if (str != null) {
            List listQ0 = ihc1.Q0(cy30.o("\\{|\\}|\"filter\":", nhc1.W(str, "&quot;", "\""), ""), new String[]{","}, 0, 6);
            ArrayList<List> arrayList = new ArrayList();
            Iterator it = listQ0.iterator();
            while (it.hasNext()) {
                List listQ1 = ihc1.Q0((String) it.next(), new String[]{"\":\""}, 0, 6);
                if (listQ1.size() != 2) {
                    listQ1 = null;
                }
                if (listQ1 != null) {
                    arrayList.add(listQ1);
                }
            }
            int iS = zno1.s(q7h.U(arrayList, 10));
            if (iS < 16) {
                iS = 16;
            }
            linkedHashMap = new LinkedHashMap(iS);
            for (List list : arrayList) {
                linkedHashMap.put(nhc1.W((String) list.get(0), "\"", ""), nhc1.W((String) list.get(1), "\"", ""));
            }
        }
        return linkedHashMap;
    }

    public final ega1 a(String str) {
        Object next;
        Object next2;
        dga1 dga1Var;
        Set setB = this.a.b(g, w7x.a);
        Object obj = null;
        if (setB != null) {
            Iterator it = setB.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!ihc1.h0((String) next, str, false));
            String str2 = (String) next;
            if (str2 != null) {
                List listQ0 = ihc1.Q0(str2, new String[]{"|"}, 0, 6);
                String str3 = (String) listQ0.get(1);
                Iterator it2 = d.entrySet().iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!u890.j(((Map.Entry) next2).getValue(), str3));
                Map.Entry entry = (Map.Entry) next2;
                if (entry == null || (dga1Var = (dga1) entry.getKey()) == null) {
                    dga1Var = yfa1.a;
                }
                d7 d7Var = new d7(l620.e, (byte) 0);
                while (d7Var.hasNext()) {
                    Object next3 = d7Var.next();
                    if (u890.j(((l620) next3).name(), listQ0.get(2))) {
                        obj = next3;
                        break;
                    }
                }
                l620 l620Var = (l620) obj;
                if (l620Var == null) {
                    l620Var = l620.a;
                }
                return new ega1(dga1Var, l620Var, 4);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    public final ega1 b(String str) {
        dga1 dga1Var;
        l620 l620Var;
        ega1 ega1Var;
        String str2;
        String str3;
        ega1 ega1VarA = a(str);
        if (ega1VarA != null) {
            return ega1VarA;
        }
        Map map = (Map) this.b.getValue();
        yfa1 yfa1Var = yfa1.a;
        if (map != null && (str3 = (String) map.get(str)) != null) {
            switch (str3) {
                case "BY_CONSUMPTION_ORDER":
                    dga1Var = yfa1Var;
                    break;
                case "BY_DATE_ASC":
                    dga1Var = bga1.a;
                    break;
                case "BY_DATE_DESC":
                    dga1Var = aga1.a;
                    break;
                case "BY_POPULARITY":
                    dga1Var = zfa1.a;
                    break;
                default:
                    dga1Var = null;
                    break;
            }
        } else {
            dga1Var = null;
        }
        Map map2 = (Map) this.c.getValue();
        l620 l620Var2 = l620.a;
        if (map2 == null || (str2 = (String) map2.get(str)) == null) {
            l620Var = null;
        } else {
            int iHashCode = str2.hashCode();
            if (iHashCode != 3387192) {
                if (iHashCode != 414231974) {
                    if (iHashCode == 1902890136 && str2.equals("unPlayedOnly")) {
                        l620Var = l620.c;
                    } else {
                        l620Var = null;
                    }
                } else if (str2.equals("availableOfflineOnly")) {
                    l620Var = l620.b;
                } else {
                    l620Var = null;
                }
            } else if (str2.equals("none")) {
                l620Var = l620Var2;
            } else {
                l620Var = null;
            }
        }
        if (dga1Var != null && l620Var != null) {
            ega1Var = new ega1(dga1Var, l620Var, 4);
        } else if (dga1Var != null) {
            ega1Var = new ega1(dga1Var, l620Var2, 4);
        } else {
            ega1Var = l620Var != null ? new ega1(yfa1Var, l620Var, 4) : null;
        }
        if (ega1Var != null) {
            c(str, ega1Var);
        } else {
            ega1Var = null;
        }
        return ega1Var == null ? new ega1((dga1) null, (l620) null, 7) : ega1Var;
    }

    public final void c(String str, ega1 ega1Var) {
        ega1 ega1VarA;
        dga1 dga1Var = ega1Var.a;
        boolean z = dga1Var instanceof cga1;
        yfa1 yfa1Var = yfa1.a;
        if (z && ((ega1VarA = a(str)) == null || (dga1Var = ega1VarA.a) == null)) {
            dga1Var = yfa1Var;
        }
        ega1 ega1VarA2 = ega1.a(ega1Var, dga1Var, null, null, 6);
        dga1 dga1Var2 = ega1VarA2.a;
        Map map = d;
        String str2 = (String) map.get(dga1Var2);
        if (str2 == null) {
            str2 = (String) sqg0.G(yfa1Var, map);
        }
        String strP = cy30.p(str, "|", str2, "|", ega1VarA2.b.name());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(strP);
        dma1 dma1Var = this.a;
        bma1 bma1Var = g;
        List listD1 = w7x.a;
        Set setB = dma1Var.b(bma1Var, listD1);
        if (setB != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : setB) {
                if (!ihc1.h0((String) obj, str, false)) {
                    arrayList.add(obj);
                }
            }
            listD1 = o7h.d1(arrayList, 1000);
        }
        linkedHashSet.addAll(listD1);
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.e(bma1Var, linkedHashSet);
        hma1VarEdit.g();
    }
}
