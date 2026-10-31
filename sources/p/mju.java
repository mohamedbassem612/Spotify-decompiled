package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mju {
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
            jju jjuVarC = c(string);
            if (jjuVarC != null) {
                String str4 = jjuVarC.a;
                String str5 = jjuVarC.b;
                List list = jjuVarC.c;
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
                        return d(strA, linkedHashMap);
                    }
                    String strA2 = a(iIntValue == 1 ? "one" : "other", list);
                    if (strA2 == null) {
                        strA2 = a("other", list);
                    }
                    if (strA2 != null) {
                        return d(strA2, linkedHashMap);
                    }
                } else {
                    String strA3 = a(str2, list);
                    if (strA3 == null) {
                        strA3 = a("other", list);
                    }
                    if (strA3 != null) {
                        return d(strA3, linkedHashMap);
                    }
                }
                return str2;
            }
            if (!nhc1.Y(string, "{", false) || (!ihc1.h0(string, "plural", false) && !ihc1.h0(string, "select", false))) {
                return d(str, linkedHashMap);
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
    public static jju c(String str) {
        String strSubstring;
        yvg1 yvg1Var;
        String string = ihc1.e1(str).toString();
        int iIntValue = 0;
        if (nhc1.Y(string, "{", false) && nhc1.R(string, "}", false)) {
            String strH = cy30.h(1, 1, string);
            ArrayList arrayList = new ArrayList();
            int length = strH.length();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = strH.charAt(i3);
                if (cCharAt != ',') {
                    if (cCharAt == '{') {
                        i2++;
                    } else if (cCharAt == '}') {
                        i2--;
                    }
                } else if (i2 == 0 && arrayList.size() < 2) {
                    arrayList.add(strH.substring(i, i3));
                    i = i3 + 1;
                }
            }
            arrayList.add(strH.substring(i));
            if (arrayList.size() >= 3) {
                String string2 = ihc1.e1((String) arrayList.get(0)).toString();
                String string3 = ihc1.e1((String) arrayList.get(1)).toString();
                if (u890.j(string3, "plural") || u890.j(string3, "select")) {
                    String str2 = (String) arrayList.get(2);
                    smc0 smc0VarN = k4p1.n();
                    String string4 = ihc1.e1(str2).toString();
                    while (iIntValue < string4.length()) {
                        mbh0 mbh0VarM = mno1.m(b.a.matcher(string4), iIntValue, string4);
                        if (mbh0VarM != null) {
                            int i4 = ((rr80) mbh0VarM.b()).b;
                            if (i4 >= string4.length() || string4.charAt(i4) != '{') {
                                strSubstring = null;
                            } else {
                                int i5 = i4 + 1;
                                int i6 = 1;
                                int i7 = i5;
                                while (i7 < string4.length() && i6 > 0) {
                                    char cCharAt2 = string4.charAt(i7);
                                    if (cCharAt2 == '{') {
                                        i6++;
                                    } else if (cCharAt2 == '}') {
                                        i6--;
                                    }
                                    i7++;
                                }
                                if (i6 != 0) {
                                    strSubstring = null;
                                } else {
                                    strSubstring = string4.substring(i5, i7 - 1);
                                }
                            }
                            if (strSubstring == null) {
                                yvg1Var = null;
                            } else {
                                yvg1Var = new yvg1(((kbh0) mbh0VarM.a()).get(1), strSubstring, Integer.valueOf(strSubstring.length() + i4 + 2));
                            }
                        } else {
                            yvg1Var = null;
                        }
                        if (yvg1Var == null) {
                            break;
                        }
                        smc0VarN.add(new mmr0(yvg1Var.a, yvg1Var.b));
                        iIntValue = ((Number) yvg1Var.c).intValue();
                    }
                    return new jju(string2, string3, k4p1.k(smc0VarN));
                }
            }
        }
        return null;
    }

    public static String d(String str, Map map) {
        String str2 = (String) map.get("value");
        if (str2 == null) {
            str2 = "";
        }
        return a.f(nhc1.W(str, "#", str2), new csb(map, (byte) 3));
    }
}
