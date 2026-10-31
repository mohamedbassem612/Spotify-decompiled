package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class axx0 {
    public static smc0 a(axx0 axx0Var, String str) {
        ArrayList arrayList;
        Integer numC0;
        axx0Var.getClass();
        smc0 smc0VarN = k4p1.n();
        nh40 nh40Var = new nh40(se11.b(bxx0.a, str));
        int i = 0;
        while (nh40Var.hasNext()) {
            mbh0 mbh0Var = (mbh0) nh40Var.next();
            String str2 = (String) ((kbh0) mbh0Var.a()).get(1);
            xkg0 xkg0Var = new xkg0();
            nh40 nh40Var2 = new nh40(se11.b(bxx0.b, str2));
            while (nh40Var2.hasNext()) {
                mbh0 mbh0Var2 = (mbh0) nh40Var2.next();
                xkg0Var.put(((kbh0) mbh0Var2.a()).get(1), zwx0.a((String) ((kbh0) mbh0Var2.a()).get(2)));
            }
            xkg0 xkg0VarB = xkg0Var.b();
            String str3 = (String) xkg0VarB.get("field");
            if (str3 != null) {
                if (((rr80) mbh0Var.b()).a > i) {
                    smc0VarN.add(new xxx0(zwx0.a(str.substring(i, ((rr80) mbh0Var.b()).a))));
                }
                String str4 = (String) xkg0VarB.get("allowed-entity-types");
                if (str4 != null) {
                    List listQ0 = ihc1.Q0(str4, new String[]{","}, 0, 6);
                    ArrayList arrayList2 = new ArrayList(q7h.U(listQ0, 10));
                    Iterator it = listQ0.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(ihc1.e1((String) it.next()).toString());
                    }
                    arrayList = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (((String) obj).length() > 0) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = z6x.a;
                }
                ArrayList arrayList3 = arrayList;
                String str5 = (String) xkg0VarB.get("title");
                String str6 = str5 == null ? "" : str5;
                String str7 = (String) xkg0VarB.get("value");
                String str8 = str7 == null ? "" : str7;
                String str9 = (String) xkg0VarB.get("unit");
                String str10 = str9 == null ? "" : str9;
                String str11 = (String) xkg0VarB.get("format");
                String str12 = (String) xkg0VarB.get("min");
                Double dA0 = str12 != null ? nhc1.a0(str12) : null;
                String str13 = (String) xkg0VarB.get("max");
                Double dA1 = str13 != null ? nhc1.a0(str13) : null;
                String str14 = (String) xkg0VarB.get("step");
                Double dA2 = str14 != null ? nhc1.a0(str14) : null;
                String str15 = (String) xkg0VarB.get("min-label");
                String str16 = (String) xkg0VarB.get("max-label");
                String str17 = (String) xkg0VarB.get("item-id");
                String str18 = (String) xkg0VarB.get("entity-type");
                String str19 = (String) xkg0VarB.get("min-items");
                Integer numC1 = str19 != null ? nhc1.c0(str19) : null;
                String str20 = (String) xkg0VarB.get("max-items");
                Integer num = (str20 == null || (numC0 = nhc1.c0(str20)) == null || numC0.intValue() <= 0) ? null : numC0;
                String str21 = (String) xkg0VarB.get("reference-field");
                String str22 = (String) xkg0VarB.get("editor");
                String str23 = (String) ((kbh0) mbh0Var.a()).get(2);
                se11 se11Var = bxx0.a;
                smc0VarN.add(new wxx0(new xwx0(str3, str6, str8, str10, str11, dA0, dA1, dA2, str15, str16, str17, str18, arrayList3, numC1, num, str21, str22, zwx0.a(str23), mbh0Var.a.group(), xkg0VarB)));
                i = ((rr80) mbh0Var.b()).b + 1;
            }
        }
        if (i < str.length()) {
            smc0VarN.add(new xxx0(zwx0.a(str.substring(i))));
        }
        return k4p1.k(smc0VarN);
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        nh40 nh40Var = new nh40(se11.b(bxx0.a, str));
        int i = 0;
        while (nh40Var.hasNext()) {
            mbh0 mbh0Var = (mbh0) nh40Var.next();
            sb.append(zwx0.a(str.substring(i, ((rr80) mbh0Var.b()).a)));
            sb.append(zwx0.a((String) ((kbh0) mbh0Var.a()).get(2)));
            i = ((rr80) mbh0Var.b()).b + 1;
        }
        sb.append(zwx0.a(str.substring(i)));
        return sb.toString();
    }
}
