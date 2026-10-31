package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nju {
    public static final se11 a = new se11("\\{([^}]+)\\}");
    public static final se11 b = new se11("(\\S+)\\s*\\{");

    public static String a(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((mmr0) next).a, str));
        mmr0 mmr0Var = (mmr0) next;
        if (mmr0Var != null) {
            return (String) mmr0Var.b;
        }
        return null;
    }

    public static String b(String str, LinkedHashMap linkedHashMap) {
        String str2 = "";
        if (ihc1.y0(str)) {
            String str3 = (String) linkedHashMap.get("value");
            if (str3 != null) {
                return str3;
            }
        } else {
            String string = ihc1.e1(str).toString();
            kju kjuVarC = c(string);
            if (kjuVarC != null) {
                String str4 = kjuVarC.a;
                String str5 = kjuVarC.b;
                List list = kjuVarC.c;
                String str6 = (String) linkedHashMap.get(str4);
                if (str6 != null) {
                    str2 = str6;
                } else if (u890.j(str5, "plural")) {
                    str2 = "0";
                }
                if (u890.j(str5, "plural")) {
                    Integer numC0 = nhc1.c0(str2);
                    int iIntValue = numC0 != null ? numC0.intValue() : 0;
                    String strA = a("=" + iIntValue, list);
                    if (strA != null) {
                        return e(strA, linkedHashMap);
                    }
                    String strA2 = a(iIntValue == 1 ? "one" : "other", list);
                    if (strA2 == null) {
                        strA2 = a("other", list);
                    }
                    if (strA2 != null) {
                        return e(strA2, linkedHashMap);
                    }
                } else {
                    String strA3 = a(str2, list);
                    if (strA3 == null) {
                        strA3 = a("other", list);
                    }
                    if (strA3 != null) {
                        return e(strA3, linkedHashMap);
                    }
                }
                return str2;
            }
            if (!nhc1.Y(string, "{", false) || (!ihc1.h0(string, "plural", false) && !ihc1.h0(string, "select", false))) {
                return e(str, linkedHashMap);
            }
            String str7 = (String) linkedHashMap.get("value");
            if (str7 != null) {
                return str7;
            }
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f5  */
    public static kju c(String str) {
        String strSubstring;
        yvg1 yvg1Var;
        String string = ihc1.e1(str).toString();
        int i = 0;
        if (nhc1.Y(string, "{", false) && nhc1.R(string, "}", false)) {
            String strH = cy30.h(1, 1, string);
            ArrayList arrayList = new ArrayList();
            int length = strH.length();
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                char cCharAt = strH.charAt(i4);
                if (cCharAt != ',') {
                    if (cCharAt == '{') {
                        i3++;
                    } else if (cCharAt == '}') {
                        i3--;
                    }
                } else if (i3 == 0 && arrayList.size() < 2) {
                    arrayList.add(strH.substring(i2, i4));
                    i2 = i4 + 1;
                }
            }
            arrayList.add(strH.substring(i2));
            if (arrayList.size() >= 3) {
                String string2 = ihc1.e1((String) arrayList.get(0)).toString();
                String string3 = ihc1.e1((String) arrayList.get(1)).toString();
                if (u890.j(string3, "plural") || u890.j(string3, "select")) {
                    String str2 = (String) arrayList.get(2);
                    smc0 smc0VarN = k4p1.n();
                    String string4 = ihc1.e1(str2).toString();
                    while (i < string4.length()) {
                        mbh0 mbh0VarM = mno1.m(b.a.matcher(string4), i, string4);
                        if (mbh0VarM != null) {
                            int i5 = ((rr80) mbh0VarM.b()).b;
                            if (i5 >= string4.length() || string4.charAt(i5) != '{') {
                                strSubstring = null;
                            } else {
                                int i6 = i5 + 1;
                                int i7 = 1;
                                int i8 = i6;
                                while (i8 < string4.length() && i7 > 0) {
                                    char cCharAt2 = string4.charAt(i8);
                                    if (cCharAt2 == '{') {
                                        i7++;
                                    } else if (cCharAt2 == '}') {
                                        i7--;
                                    }
                                    i8++;
                                }
                                if (i7 != 0) {
                                    strSubstring = null;
                                } else {
                                    strSubstring = string4.substring(i6, i8 - 1);
                                }
                            }
                            if (strSubstring == null) {
                                yvg1Var = null;
                            } else {
                                yvg1Var = new yvg1(((kbh0) mbh0VarM.a()).get(1), strSubstring, Integer.valueOf(strSubstring.length() + i5 + 2));
                            }
                        } else {
                            yvg1Var = null;
                        }
                        if (yvg1Var == null) {
                            break;
                        }
                        String str3 = (String) yvg1Var.a;
                        String str4 = (String) yvg1Var.b;
                        int iIntValue = ((Number) yvg1Var.c).intValue();
                        smc0VarN.add(new mmr0(str3, str4));
                        i = iIntValue;
                    }
                    return new kju(string2, string3, k4p1.k(smc0VarN));
                }
            }
        }
        return null;
    }

    public static LinkedHashMap d(String str) {
        kju kjuVarC = c(str);
        if (kjuVarC == null || !u890.j(kjuVarC.b, "select")) {
            return null;
        }
        List list = kjuVarC.c;
        ArrayList<mmr0> arrayList = new ArrayList();
        for (Object obj : list) {
            if (!u890.j(((mmr0) obj).a, "other")) {
                arrayList.add(obj);
            }
        }
        int iS = zno1.s(q7h.U(arrayList, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (mmr0 mmr0Var : arrayList) {
            String str2 = (String) mmr0Var.a;
            linkedHashMap.put(str2, e((String) mmr0Var.b, Collections.singletonMap(kjuVarC.a, str2)));
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    public static String e(String str, Map map) {
        String str2 = (String) map.get("value");
        if (str2 == null) {
            str2 = "";
        }
        return a.f(nhc1.W(str, "#", str2), new s20(map, (byte) 16));
    }
}
