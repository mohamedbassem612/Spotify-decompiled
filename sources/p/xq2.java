package p;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class xq2 {
    public static final se11 a = new se11("\\[agent-event:(\\w+)]\\n(\\{[\\s\\S]*?\\})\\n\\n([\\s\\S]*)");

    public static String a(String str) {
        uga0 m231Var;
        mbh0 mbh0VarD = a.d(str);
        String string = null;
        if (mbh0VarD != null) {
            String str2 = (String) mbh0VarD.a().get(2);
            String str3 = (String) mbh0VarD.a().get(3);
            try {
                m231Var = fga0.l(nfa0.d.c(str2));
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            if (m231Var != null) {
                string = ihc1.e1(str3).toString();
            }
        }
        return string == null ? str : string;
    }

    public static bms0 b(String str) {
        uga0 m231Var;
        String strG;
        String strG2;
        Boolean boolF;
        try {
            m231Var = fga0.l(nfa0.d.c(str));
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        uga0 uga0Var = m231Var;
        if (uga0Var != null) {
            Object obj = uga0Var.get("requestId");
            aha0 aha0Var = obj instanceof aha0 ? (aha0) obj : null;
            if (aha0Var != null && (strG = fga0.g(aha0Var)) != null) {
                if (strG.length() <= 0) {
                    strG = null;
                }
                if (strG != null) {
                    Object obj2 = uga0Var.get("decision");
                    aha0 aha0Var2 = obj2 instanceof aha0 ? (aha0) obj2 : null;
                    if (aha0Var2 == null || (strG2 = fga0.g(aha0Var2)) == null || strG2.length() <= 0) {
                        strG2 = null;
                    }
                    boolean zBooleanValue = false;
                    if (strG2 == null) {
                        Object obj3 = uga0Var.get("granted");
                        aha0 aha0Var3 = obj3 instanceof aha0 ? (aha0) obj3 : null;
                        if (aha0Var3 != null && (boolF = fga0.f(aha0Var3)) != null) {
                            zBooleanValue = boolF.booleanValue();
                        }
                    } else if (!strG2.equals("deny")) {
                        zBooleanValue = true;
                    }
                    return new bms0(strG, strG2, zBooleanValue);
                }
            }
        }
        return null;
    }

    public static String c(uga0 uga0Var, String str) {
        String strG;
        Object obj = uga0Var.get(str);
        aha0 aha0Var = obj instanceof aha0 ? (aha0) obj : null;
        return (aha0Var == null || (strG = fga0.g(aha0Var)) == null) ? "" : strG;
    }

    public static String d(uga0 uga0Var, String str) {
        String strG;
        Object obj = uga0Var.get(str);
        aha0 aha0Var = obj instanceof aha0 ? (aha0) obj : null;
        if (aha0Var == null || (strG = fga0.g(aha0Var)) == null || strG.length() <= 0) {
            return null;
        }
        return strG;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0187  */
    /* JADX WARN: Code duplicated, block: B:105:0x019d  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:146:0x0240  */
    /* JADX WARN: Code duplicated, block: B:201:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0156  */
    /* JADX WARN: Code duplicated, block: B:90:0x0164  */
    /* JADX WARN: Code duplicated, block: B:91:0x0167  */
    /* JADX WARN: Code duplicated, block: B:94:0x016e  */
    /* JADX WARN: Code duplicated, block: B:97:0x017a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0184  */
    public static jzr0 e(String str) {
        Object next;
        uga0 m231Var;
        dr2 cr2Var;
        Set<Map.Entry> setEntrySet;
        String string;
        dr2 zq2Var;
        Boolean boolF;
        int i;
        String strG;
        Object obj;
        pfa0 pfa0Var;
        smc0 smc0VarN;
        uga0 uga0Var;
        String strC;
        Object obj2;
        aha0 aha0Var;
        String strG2;
        int i2;
        String strC2;
        String strG3;
        String strG4;
        Integer numC0;
        mbh0 mbh0VarD = a.d(str);
        if (mbh0VarD != null) {
            String str2 = (String) mbh0VarD.a().get(1);
            String str3 = (String) mbh0VarD.a().get(2);
            String str4 = (String) mbh0VarD.a().get(3);
            Iterator it = fr2.h.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((fr2) next).a.equals(str2));
            fr2 fr2Var = (fr2) next;
            if (fr2Var != null) {
                try {
                    m231Var = fga0.l(nfa0.d.c(str3));
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                uga0 uga0Var2 = m231Var;
                if (uga0Var2 != null) {
                    int iOrdinal = fr2Var.ordinal();
                    if (iOrdinal != 0) {
                        boolean zBooleanValue = false;
                        iIntValue = 0;
                        iIntValue = 0;
                        int iIntValue = 0;
                        zBooleanValue = false;
                        if (iOrdinal == 1) {
                            String strC3 = c(uga0Var2, "toolCallId");
                            String strC4 = c(uga0Var2, "toolName");
                            Object obj3 = uga0Var2.get("isError");
                            aha0 aha0Var2 = obj3 instanceof aha0 ? (aha0) obj3 : null;
                            if (aha0Var2 != null && (boolF = fga0.f(aha0Var2)) != null) {
                                zBooleanValue = boolF.booleanValue();
                            }
                            cr2Var = new br2(new ix2(strC3, strC4, zBooleanValue, c(uga0Var2, "summary")));
                        } else {
                            if (iOrdinal != 2) {
                                if (iOrdinal == 3) {
                                    Object obj4 = uga0Var2.get("schemaVersion");
                                    aha0 aha0Var3 = obj4 instanceof aha0 ? (aha0) obj4 : null;
                                    Integer numC1 = (aha0Var3 == null || (strG = fga0.g(aha0Var3)) == null) ? null : nhc1.c0(strG);
                                    String strD = d(uga0Var2, "runId");
                                    String strC5 = c(uga0Var2, "routineName");
                                    String strD2 = d(uga0Var2, "status");
                                    if (strD2 == null) {
                                        i = 4;
                                    } else {
                                        int iHashCode = strD2.hashCode();
                                        if (iHashCode != -1884319283) {
                                            if (iHashCode != -1281977283) {
                                                if (iHashCode == 945734241 && strD2.equals("succeeded")) {
                                                    i = 1;
                                                } else {
                                                    i = 4;
                                                }
                                            } else if (strD2.equals("failed")) {
                                                i = 2;
                                            } else {
                                                i = 4;
                                            }
                                        } else if (strD2.equals("stopped")) {
                                            i = 3;
                                        } else {
                                            i = 4;
                                        }
                                    }
                                    String strD3 = d(uga0Var2, "startedAt");
                                    String strD4 = d(uga0Var2, "sessionId");
                                    String strC6 = c(uga0Var2, "completedAt");
                                    String strD5 = d(uga0Var2, "summary");
                                    String strD6 = d(uga0Var2, "reasonCode");
                                    String strD7 = d(uga0Var2, "displayReason");
                                    String strD8 = d(uga0Var2, "lastKnownAction");
                                    Object obj5 = uga0Var2.get("nextAction");
                                    uga0 uga0Var3 = obj5 instanceof uga0 ? (uga0) obj5 : null;
                                    zq2Var = new zq2(new yv2(numC1, strD, strC5, i, strD3, strD4, strC6, strD5, strD6, strD7, strD8, uga0Var3 != null ? d(uga0Var3, "kind") : null));
                                } else if (iOrdinal == 4) {
                                    Object obj6 = uga0Var2.get("version");
                                    aha0 aha0Var4 = obj6 instanceof aha0 ? (aha0) obj6 : null;
                                    if (aha0Var4 != null && (strG4 = fga0.g(aha0Var4)) != null && (numC0 = nhc1.c0(strG4)) != null) {
                                        iIntValue = numC0.intValue();
                                    }
                                    Object obj7 = uga0Var2.get("allowedDecisions");
                                    pfa0 pfa0Var2 = obj7 instanceof pfa0 ? (pfa0) obj7 : null;
                                    Object obj8 = uga0Var2.get("display");
                                    uga0 uga0Var4 = obj8 instanceof uga0 ? (uga0) obj8 : null;
                                    if (iIntValue < 1 || pfa0Var2 == null) {
                                        String strC7 = c(uga0Var2, "command");
                                        obj = uga0Var2.get("choices");
                                        if (obj instanceof pfa0) {
                                            pfa0Var = (pfa0) obj;
                                        } else {
                                            pfa0Var = null;
                                        }
                                        smc0VarN = k4p1.n();
                                        if (pfa0Var != null) {
                                            for (uga0 uga0Var5 : pfa0Var.a) {
                                                if (uga0Var5 instanceof uga0) {
                                                    uga0Var = uga0Var5;
                                                } else {
                                                    uga0Var = null;
                                                }
                                                if (uga0Var == null) {
                                                    strC = c(uga0Var, "id");
                                                    obj2 = uga0Var.get("text");
                                                    if (obj2 instanceof aha0) {
                                                        aha0Var = (aha0) obj2;
                                                    } else {
                                                        aha0Var = null;
                                                    }
                                                    if (aha0Var != null || (strG2 = fga0.g(aha0Var)) == null) {
                                                        strG2 = strC;
                                                    }
                                                    if (strC.equals("allow")) {
                                                        i2 = 1;
                                                    } else {
                                                        i2 = 2;
                                                    }
                                                    smc0VarN.add(new cv2(i2, strC, strG2, strC.equals("allow")));
                                                }
                                            }
                                        }
                                        cr2Var = new yq2(new hv2(0, c(uga0Var2, "requestId"), "Permission Request", strC7, k4p1.k(smc0VarN)));
                                    } else {
                                        List<aha0> list = pfa0Var2.a;
                                        if (list.isEmpty()) {
                                            String strC8 = c(uga0Var2, "command");
                                            obj = uga0Var2.get("choices");
                                            if (obj instanceof pfa0) {
                                                pfa0Var = (pfa0) obj;
                                            } else {
                                                pfa0Var = null;
                                            }
                                            smc0VarN = k4p1.n();
                                            if (pfa0Var != null) {
                                                while (r2.hasNext()) {
                                                    if (uga0Var5 instanceof uga0) {
                                                        uga0Var = uga0Var5;
                                                    } else {
                                                        uga0Var = null;
                                                    }
                                                    if (uga0Var == null) {
                                                        strC = c(uga0Var, "id");
                                                        obj2 = uga0Var.get("text");
                                                        if (obj2 instanceof aha0) {
                                                            aha0Var = (aha0) obj2;
                                                        } else {
                                                            aha0Var = null;
                                                        }
                                                        if (aha0Var != null) {
                                                            strG2 = strC;
                                                        } else {
                                                            strG2 = strC;
                                                        }
                                                        if (strC.equals("allow")) {
                                                            i2 = 1;
                                                        } else {
                                                            i2 = 2;
                                                        }
                                                        smc0VarN.add(new cv2(i2, strC, strG2, strC.equals("allow")));
                                                    }
                                                }
                                            }
                                            cr2Var = new yq2(new hv2(0, c(uga0Var2, "requestId"), "Permission Request", strC8, k4p1.k(smc0VarN)));
                                        } else {
                                            if (uga0Var4 == null || (strC2 = d(uga0Var4, "label")) == null) {
                                                strC2 = c(uga0Var2, "command");
                                            }
                                            String str5 = strC2;
                                            smc0 smc0VarN2 = k4p1.n();
                                            for (aha0 aha0Var5 : list) {
                                                aha0 aha0Var6 = aha0Var5 instanceof aha0 ? aha0Var5 : null;
                                                if (aha0Var6 != null && (strG3 = fga0.g(aha0Var6)) != null) {
                                                    smc0VarN2.add(new cv2(strG3.equals("allow_once") ? 1 : strG3.equals("deny") ? 3 : 2, strG3, strG3, !strG3.equals("deny")));
                                                }
                                            }
                                            cr2Var = new yq2(new hv2(1, c(uga0Var2, "requestId"), str5, str5, k4p1.k(smc0VarN2)));
                                        }
                                    }
                                } else {
                                    if (iOrdinal != 5) {
                                        eg.o();
                                        return null;
                                    }
                                    zq2Var = new ar2("");
                                }
                                return new jzr0(fr2Var, zq2Var, ihc1.e1(str4).toString());
                            }
                            cr2Var = new ar2(c(uga0Var2, "content"));
                        }
                    } else {
                        Object obj9 = uga0Var2.get("args");
                        uga0 uga0Var6 = obj9 instanceof uga0 ? (uga0) obj9 : null;
                        xkg0 xkg0Var = new xkg0();
                        if (uga0Var6 != null && (setEntrySet = uga0Var6.a.entrySet()) != null) {
                            for (Map.Entry entry : setEntrySet) {
                                String str6 = (String) entry.getKey();
                                aha0 aha0Var7 = (ega0) entry.getValue();
                                aha0 aha0Var8 = aha0Var7 instanceof aha0 ? aha0Var7 : null;
                                if (aha0Var8 == null || (string = fga0.g(aha0Var8)) == null) {
                                    string = aha0Var7.toString();
                                }
                                xkg0Var.put(str6, string);
                            }
                        }
                        cr2Var = new cr2(new jx2(c(uga0Var2, "toolCallId"), c(uga0Var2, "toolName"), c(uga0Var2, "description"), d(uga0Var2, "cliCommand"), d(uga0Var2, "cliSubject"), xkg0Var.b()));
                    }
                    zq2Var = cr2Var;
                    return new jzr0(fr2Var, zq2Var, ihc1.e1(str4).toString());
                }
            }
        }
        return null;
    }
}
