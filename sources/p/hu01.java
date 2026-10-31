package p;

import android.content.Context;
import android.util.Base64;
import com.spotify.common.uri.SpotifyUriParserException;
import com.spotify.recents.recentsdatasourceimpl.Filters;
import com.spotify.recents.recentsdatasourceimpl.GroupMetadata;
import com.spotify.recents.recentsdatasourceimpl.Share;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hu01 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cm0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hu01(cm0 cm0Var, byte b) {
        super(1);
        this.a = b;
        this.b = cm0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.y6b1 */
    /* JADX WARN: Code duplicated, block: B:102:0x021a A[LOOP:2: B:100:0x0214->B:102:0x021a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x022f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0233  */
    /* JADX WARN: Code duplicated, block: B:107:0x0238  */
    /* JADX WARN: Code duplicated, block: B:109:0x023c  */
    /* JADX WARN: Code duplicated, block: B:113:0x024f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0259  */
    /* JADX WARN: Code duplicated, block: B:116:0x025b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x02cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:137:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:138:0x02db A[PHI: r4
      0x02db: PHI (r4v19 p.y6b1) = (r4v18 p.y6b1), (r4v27 p.y6b1) binds: [B:132:0x02cb, B:136:0x02d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:141:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:142:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:146:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:148:0x0302  */
    /* JADX WARN: Code duplicated, block: B:149:0x0307  */
    /* JADX WARN: Code duplicated, block: B:151:0x030a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0322  */
    /* JADX WARN: Code duplicated, block: B:157:0x0341  */
    /* JADX WARN: Code duplicated, block: B:161:0x0353  */
    /* JADX WARN: Code duplicated, block: B:163:0x0356  */
    /* JADX WARN: Code duplicated, block: B:164:0x035b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0360  */
    /* JADX WARN: Code duplicated, block: B:205:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0180  */
    /* JADX WARN: Code duplicated, block: B:79:0x018b  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:99:0x0203  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v26, types: [java.util.ArrayList] */
    public final Object invoke(Object obj) throws y6b1 {
        pvc0 pvc0Var;
        y6b1 y6b1Var;
        br01 br01Var;
        boolean z;
        boolean z2;
        y6b1 y6b1VarP;
        String strN;
        List list;
        y6b1 ce71Var;
        GroupMetadata groupMetadataR;
        GroupMetadata groupMetadataR2;
        List listD1;
        y6b1 y6b1Var2;
        y6b1 string;
        ?? SingletonList;
        fkt fktVarA;
        kdy0 kdy0Var;
        y6b1 gktVar;
        y6b1 iktVar;
        String str;
        y6b1 string2;
        y6b1 y6b1Var3;
        boolean zContains;
        String str2;
        GroupMetadata groupMetadataR3;
        int itemsCount;
        y6b1 yq01Var;
        ArrayList arrayList;
        String str3;
        y6b1 y6b1VarU0;
        h290 h290VarO;
        byte b = this.a;
        y6b1 y6b1Var4 = null;
        cm0 cm0Var = this.b;
        switch (b) {
            case 0:
                lu01 lu01Var = (lu01) obj;
                kdy0 kdy0Var2 = (kdy0) cm0Var.g;
                List list2 = lu01Var.b;
                ArrayList arrayList2 = new ArrayList();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                List list3 = list2;
                Iterator it = list3.iterator();
                String str4 = null;
                int i = 0;
                while (it.hasNext()) {
                    String strX = yxo1.x(((pvc0) it.next()).f);
                    String strU0 = strX != null ? ihc1.U0(strX, "group_id_", strX) : null;
                    if (!u890.j(strU0, str4)) {
                        i = 0;
                    }
                    i++;
                    if (i >= 2 && strU0 != null) {
                        linkedHashSet.add(strU0);
                    }
                    str4 = strU0;
                }
                Iterator it2 = list3.iterator();
                String str5 = null;
                int i2 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        y6b1 y6b1Var5 = y6b1Var4;
                        p7h.T();
                        throw y6b1Var5;
                    }
                    pvc0 pvc0Var2 = (pvc0) next;
                    y6b1 y6b1Var6 = y6b1Var4;
                    int i4 = pvc0Var2.b;
                    y6b1 y6b1Var7 = pvc0Var2.c;
                    Date date = new Date(((long) i4) * 1000);
                    String str6 = ((SimpleDateFormat) kdy0Var2.b).format(date);
                    if (i2 == 0 || !u890.j(str6, str5)) {
                        pvc0Var = pvc0Var2;
                        int i5 = pvc0Var.b;
                        str6.getClass();
                        Context context = (Context) kdy0Var2.d;
                        int iC = l1d.C(((ftr) kdy0Var2.c).a(i5));
                        String string3 = iC != 0 ? iC != 1 ? str6 : context.getString(2131954842) : context.getString(2131954840);
                        string3.getClass();
                        arrayList2.add(new ut01(string3));
                        str5 = str6;
                    } else {
                        pvc0Var = pvc0Var2;
                    }
                    try {
                        y6b1Var = new y6b1(y6b1Var7, false);
                    } catch (SpotifyUriParserException unused) {
                        y6b1Var = y6b1Var6;
                    }
                    Map map = pvc0Var.f;
                    String strX2 = yxo1.x(map);
                    String strX3 = yxo1.x(map);
                    y6b1 y6b1VarU1 = strX3 != null ? ihc1.U0(strX3, "group_id_", strX3) : y6b1Var6;
                    boolean zContainsKey = map.containsKey("recent_type_saved");
                    y6b1 y6b1Var8 = y6b1Var;
                    br01 br01Var2 = br01.c;
                    if (zContainsKey) {
                        br01Var = br01.b;
                    } else if (map.containsKey("recent_type_shared")) {
                        br01Var = br01Var2;
                    } else {
                        br01Var = map.containsKey("recent_type_auto_generated") ? br01.e : br01.d;
                    }
                    boolean zJ = u890.j(strX2, "group_id_0");
                    boolean z3 = br01Var == br01Var2;
                    if (z3) {
                        z = z3;
                        String str7 = (String) map.get("share_metadata");
                        if (str7 == null || str7.length() == 0) {
                            z2 = zJ;
                        } else {
                            z2 = zJ;
                            try {
                                y6b1VarP = Share.p(Base64.decode(str7, 0));
                            } catch (Exception unused2) {
                                y6b1VarP = y6b1Var6;
                            }
                            if (y6b1VarP == null) {
                                strN = y6b1VarP.n();
                                if (strN.length() == 0) {
                                    list = list2;
                                    if (z2 || (groupMetadataR = g6p1.r(map)) == null || !prn1.p(y6b1Var7, y6b1VarP, groupMetadataR)) {
                                        ce71Var = new ce71(new hy71(), strN);
                                    } else {
                                        String strQ = groupMetadataR.q();
                                        h290<String> h290VarR = groupMetadataR.r();
                                        ArrayList arrayList3 = new ArrayList(q7h.U(h290VarR, 10));
                                        for (String str8 : h290VarR) {
                                            arrayList3.add(new hy71());
                                        }
                                        ce71Var = new be71(strQ, strN, arrayList3);
                                    }
                                }
                            }
                            groupMetadataR2 = g6p1.r(map);
                            if (groupMetadataR2 != null || (h290VarO = groupMetadataR2.o()) == null) {
                                listD1 = z6x.a;
                            } else {
                                listD1 = o7h.d1(h290VarO, 3);
                            }
                            y6b1Var2 = "";
                            if (listD1.isEmpty()) {
                                if (y6b1Var8 != null) {
                                    string = y6b1Var8.toString();
                                } else {
                                    string = y6b1Var6;
                                }
                                if (string == null) {
                                    string = "";
                                }
                                SingletonList = Collections.singletonList(new ft01("", string));
                            } else {
                                List<String> list4 = listD1;
                                SingletonList = new ArrayList(q7h.U(list4, 10));
                                for (String str9 : list4) {
                                    str9.getClass();
                                    SingletonList.add(new ft01("", str9));
                                }
                            }
                            ?? r22 = SingletonList;
                            fktVarA = ((i3h) kdy0Var2.e).a(y6b1Var7);
                            if (fktVarA != null) {
                                iktVar = new ekt(fktVarA);
                                kdy0Var = kdy0Var2;
                            } else {
                                if (!z && z2 && (ce71Var instanceof be71)) {
                                    ArrayList arrayList4 = new ArrayList(q7h.U(((be71) ce71Var).b, 10));
                                    for (Iterator it3 = r2.iterator(); it3.hasNext(); it3 = it3) {
                                        hy71 hy71Var = (hy71) it3.next();
                                        arrayList4.add(new ikt(hy71Var.a, hy71Var.b, hy71Var.c));
                                        kdy0Var2 = kdy0Var2;
                                    }
                                    kdy0Var = kdy0Var2;
                                    gktVar = new gkt(arrayList4);
                                } else {
                                    kdy0Var = kdy0Var2;
                                    if (!z && z2 && (ce71Var instanceof ce71)) {
                                        hy71 hy71Var2 = ((ce71) ce71Var).a;
                                        iktVar = new ikt(hy71Var2.a, hy71Var2.b, hy71Var2.c);
                                    } else {
                                        gktVar = y6b1Var6;
                                    }
                                }
                                str = pvc0Var.a;
                                String str10 = pvc0Var.c;
                                string2 = (String) map.get("name");
                                if (string2 != null) {
                                    y6b1Var3 = string2;
                                } else {
                                    if (y6b1Var8 != null) {
                                        string2 = y6b1Var8.toString();
                                    } else {
                                        string2 = y6b1Var6;
                                    }
                                    if (string2 == null) {
                                        y6b1Var3 = y6b1Var7;
                                    } else {
                                        y6b1Var3 = string2;
                                    }
                                }
                                String str11 = (String) map.get("subtitle");
                                if (y6b1VarU1 != null) {
                                    zContains = linkedHashSet.contains(y6b1VarU1);
                                } else {
                                    zContains = false;
                                }
                                str2 = (String) map.get("children_group_id");
                                if (str2 != null) {
                                    groupMetadataR3 = g6p1.r(map);
                                    if (groupMetadataR3 != null) {
                                        itemsCount = groupMetadataR3.getItemsCount();
                                    } else {
                                        itemsCount = 0;
                                    }
                                    if (itemsCount > 0) {
                                        yq01Var = new yq01(str2, itemsCount);
                                    } else {
                                        yq01Var = y6b1Var6;
                                    }
                                } else {
                                    yq01Var = y6b1Var6;
                                }
                                arrayList = new ArrayList();
                                for (Object obj2 : m9m.f) {
                                    String str12 = str;
                                    if (map.containsKey("content_type_".concat(((m9m) obj2).name().toLowerCase(Locale.ROOT)))) {
                                        arrayList.add(obj2);
                                    }
                                    str = str12;
                                }
                                String str13 = str;
                                str3 = (String) map.get("children_group_id");
                                if (str3 == null) {
                                    str3 = "";
                                }
                                if (strX2 != null) {
                                    y6b1VarU0 = ihc1.U0(strX2, "group_id_", strX2);
                                } else {
                                    y6b1VarU0 = y6b1Var6;
                                }
                                if (y6b1VarU0 == null) {
                                    y6b1Var2 = y6b1VarU0;
                                }
                                arrayList2.add(new tt01(new cr01(str13, str10, y6b1Var3, date, br01Var, (List) r22, gktVar, str11, strX2, false, false, false, yq01Var, Boolean.valueOf(zContains), arrayList, false, false, false, true, false, (String) null, new zq01(str3, y6b1Var2), (String) null, ce71Var, (String) map.get("navigation_uri"), (List) null, false, 404822016)));
                                kdy0Var2 = kdy0Var;
                                y6b1Var4 = y6b1Var6;
                                it2 = it2;
                                list2 = list;
                                str5 = str5;
                                i2 = i3;
                            }
                            gktVar = iktVar;
                            str = pvc0Var.a;
                            String str14 = pvc0Var.c;
                            string2 = (String) map.get("name");
                            if (string2 != null) {
                                y6b1Var3 = string2;
                            } else {
                                if (y6b1Var8 != null) {
                                    string2 = y6b1Var8.toString();
                                } else {
                                    string2 = y6b1Var6;
                                }
                                if (string2 == null) {
                                    y6b1Var3 = y6b1Var7;
                                } else {
                                    y6b1Var3 = string2;
                                }
                            }
                            String str15 = (String) map.get("subtitle");
                            if (y6b1VarU1 != null) {
                                zContains = linkedHashSet.contains(y6b1VarU1);
                            } else {
                                zContains = false;
                            }
                            str2 = (String) map.get("children_group_id");
                            if (str2 != null) {
                                groupMetadataR3 = g6p1.r(map);
                                if (groupMetadataR3 != null) {
                                    itemsCount = groupMetadataR3.getItemsCount();
                                } else {
                                    itemsCount = 0;
                                }
                                if (itemsCount > 0) {
                                    yq01Var = new yq01(str2, itemsCount);
                                } else {
                                    yq01Var = y6b1Var6;
                                }
                            } else {
                                yq01Var = y6b1Var6;
                            }
                            arrayList = new ArrayList();
                            while (r11.hasNext()) {
                                String str16 = str;
                                if (map.containsKey("content_type_".concat(((m9m) obj2).name().toLowerCase(Locale.ROOT)))) {
                                    arrayList.add(obj2);
                                }
                                str = str16;
                            }
                            String str17 = str;
                            str3 = (String) map.get("children_group_id");
                            if (str3 == null) {
                                str3 = "";
                            }
                            if (strX2 != null) {
                                y6b1VarU0 = ihc1.U0(strX2, "group_id_", strX2);
                            } else {
                                y6b1VarU0 = y6b1Var6;
                            }
                            if (y6b1VarU0 == null) {
                                y6b1Var2 = y6b1VarU0;
                            }
                            arrayList2.add(new tt01(new cr01(str17, str14, y6b1Var3, date, br01Var, (List) r22, gktVar, str15, strX2, false, false, false, yq01Var, Boolean.valueOf(zContains), arrayList, false, false, false, true, false, (String) null, new zq01(str3, y6b1Var2), (String) null, ce71Var, (String) map.get("navigation_uri"), (List) null, false, 404822016)));
                            kdy0Var2 = kdy0Var;
                            y6b1Var4 = y6b1Var6;
                            it2 = it2;
                            list2 = list;
                            str5 = str5;
                            i2 = i3;
                        }
                        y6b1VarP = y6b1Var6;
                        if (y6b1VarP == null) {
                            strN = y6b1VarP.n();
                            if (strN.length() == 0) {
                                list = list2;
                                if (z2) {
                                    ce71Var = new ce71(new hy71(), strN);
                                } else {
                                    ce71Var = new ce71(new hy71(), strN);
                                }
                            }
                        }
                        groupMetadataR2 = g6p1.r(map);
                        if (groupMetadataR2 != null) {
                            listD1 = z6x.a;
                        } else {
                            listD1 = z6x.a;
                        }
                        y6b1Var2 = "";
                        if (listD1.isEmpty()) {
                            List<String> list5 = listD1;
                            SingletonList = new ArrayList(q7h.U(list5, 10));
                            while (r2.hasNext()) {
                                str9.getClass();
                                SingletonList.add(new ft01("", str9));
                            }
                        } else {
                            if (y6b1Var8 != null) {
                                string = y6b1Var8.toString();
                            } else {
                                string = y6b1Var6;
                            }
                            if (string == null) {
                                string = "";
                            }
                            SingletonList = Collections.singletonList(new ft01("", string));
                        }
                        ?? r23 = SingletonList;
                        fktVarA = ((i3h) kdy0Var2.e).a(y6b1Var7);
                        if (fktVarA != null) {
                            iktVar = new ekt(fktVarA);
                            kdy0Var = kdy0Var2;
                        } else {
                            if (!z) {
                                kdy0Var = kdy0Var2;
                                if (!z) {
                                }
                                gktVar = y6b1Var6;
                            } else {
                                kdy0Var = kdy0Var2;
                                if (!z) {
                                }
                                gktVar = y6b1Var6;
                            }
                            str = pvc0Var.a;
                            String str18 = pvc0Var.c;
                            string2 = (String) map.get("name");
                            if (string2 != null) {
                                y6b1Var3 = string2;
                            } else {
                                if (y6b1Var8 != null) {
                                    string2 = y6b1Var8.toString();
                                } else {
                                    string2 = y6b1Var6;
                                }
                                if (string2 == null) {
                                    y6b1Var3 = y6b1Var7;
                                } else {
                                    y6b1Var3 = string2;
                                }
                            }
                            String str19 = (String) map.get("subtitle");
                            if (y6b1VarU1 != null) {
                                zContains = linkedHashSet.contains(y6b1VarU1);
                            } else {
                                zContains = false;
                            }
                            str2 = (String) map.get("children_group_id");
                            if (str2 != null) {
                                groupMetadataR3 = g6p1.r(map);
                                if (groupMetadataR3 != null) {
                                    itemsCount = groupMetadataR3.getItemsCount();
                                } else {
                                    itemsCount = 0;
                                }
                                if (itemsCount > 0) {
                                    yq01Var = new yq01(str2, itemsCount);
                                } else {
                                    yq01Var = y6b1Var6;
                                }
                            } else {
                                yq01Var = y6b1Var6;
                            }
                            arrayList = new ArrayList();
                            while (r11.hasNext()) {
                                String str110 = str;
                                if (map.containsKey("content_type_".concat(((m9m) obj2).name().toLowerCase(Locale.ROOT)))) {
                                    arrayList.add(obj2);
                                }
                                str = str110;
                            }
                            String str111 = str;
                            str3 = (String) map.get("children_group_id");
                            if (str3 == null) {
                                str3 = "";
                            }
                            if (strX2 != null) {
                                y6b1VarU0 = ihc1.U0(strX2, "group_id_", strX2);
                            } else {
                                y6b1VarU0 = y6b1Var6;
                            }
                            if (y6b1VarU0 == null) {
                                y6b1Var2 = y6b1VarU0;
                            }
                            arrayList2.add(new tt01(new cr01(str111, str18, y6b1Var3, date, br01Var, (List) r23, gktVar, str19, strX2, false, false, false, yq01Var, Boolean.valueOf(zContains), arrayList, false, false, false, true, false, (String) null, new zq01(str3, y6b1Var2), (String) null, ce71Var, (String) map.get("navigation_uri"), (List) null, false, 404822016)));
                            kdy0Var2 = kdy0Var;
                            y6b1Var4 = y6b1Var6;
                            it2 = it2;
                            list2 = list;
                            str5 = str5;
                            i2 = i3;
                        }
                        gktVar = iktVar;
                        str = pvc0Var.a;
                        String str112 = pvc0Var.c;
                        string2 = (String) map.get("name");
                        if (string2 != null) {
                            y6b1Var3 = string2;
                        } else {
                            if (y6b1Var8 != null) {
                                string2 = y6b1Var8.toString();
                            } else {
                                string2 = y6b1Var6;
                            }
                            if (string2 == null) {
                                y6b1Var3 = y6b1Var7;
                            } else {
                                y6b1Var3 = string2;
                            }
                        }
                        String str113 = (String) map.get("subtitle");
                        if (y6b1VarU1 != null) {
                            zContains = linkedHashSet.contains(y6b1VarU1);
                        } else {
                            zContains = false;
                        }
                        str2 = (String) map.get("children_group_id");
                        if (str2 != null) {
                            groupMetadataR3 = g6p1.r(map);
                            if (groupMetadataR3 != null) {
                                itemsCount = groupMetadataR3.getItemsCount();
                            } else {
                                itemsCount = 0;
                            }
                            if (itemsCount > 0) {
                                yq01Var = new yq01(str2, itemsCount);
                            } else {
                                yq01Var = y6b1Var6;
                            }
                        } else {
                            yq01Var = y6b1Var6;
                        }
                        arrayList = new ArrayList();
                        while (r11.hasNext()) {
                            String str114 = str;
                            if (map.containsKey("content_type_".concat(((m9m) obj2).name().toLowerCase(Locale.ROOT)))) {
                                arrayList.add(obj2);
                            }
                            str = str114;
                        }
                        String str115 = str;
                        str3 = (String) map.get("children_group_id");
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (strX2 != null) {
                            y6b1VarU0 = ihc1.U0(strX2, "group_id_", strX2);
                        } else {
                            y6b1VarU0 = y6b1Var6;
                        }
                        if (y6b1VarU0 == null) {
                            y6b1Var2 = y6b1VarU0;
                        }
                        arrayList2.add(new tt01(new cr01(str115, str112, y6b1Var3, date, br01Var, (List) r23, gktVar, str113, strX2, false, false, false, yq01Var, Boolean.valueOf(zContains), arrayList, false, false, false, true, false, (String) null, new zq01(str3, y6b1Var2), (String) null, ce71Var, (String) map.get("navigation_uri"), (List) null, false, 404822016)));
                        kdy0Var2 = kdy0Var;
                        y6b1Var4 = y6b1Var6;
                        it2 = it2;
                        list2 = list;
                        str5 = str5;
                        i2 = i3;
                    } else {
                        z = z3;
                        z2 = zJ;
                    }
                    list = list2;
                    ce71Var = y6b1Var6;
                    groupMetadataR2 = g6p1.r(map);
                    if (groupMetadataR2 != null) {
                        listD1 = z6x.a;
                    } else {
                        listD1 = z6x.a;
                    }
                    y6b1Var2 = "";
                    if (listD1.isEmpty()) {
                        List<String> list6 = listD1;
                        SingletonList = new ArrayList(q7h.U(list6, 10));
                        while (r2.hasNext()) {
                            str9.getClass();
                            SingletonList.add(new ft01("", str9));
                        }
                    } else {
                        if (y6b1Var8 != null) {
                            string = y6b1Var8.toString();
                        } else {
                            string = y6b1Var6;
                        }
                        if (string == null) {
                            string = "";
                        }
                        SingletonList = Collections.singletonList(new ft01("", string));
                    }
                    ?? r24 = SingletonList;
                    fktVarA = ((i3h) kdy0Var2.e).a(y6b1Var7);
                    if (fktVarA != null) {
                        iktVar = new ekt(fktVarA);
                        kdy0Var = kdy0Var2;
                    } else {
                        if (!z) {
                            kdy0Var = kdy0Var2;
                            if (!z) {
                            }
                            gktVar = y6b1Var6;
                        } else {
                            kdy0Var = kdy0Var2;
                            if (!z) {
                            }
                            gktVar = y6b1Var6;
                        }
                        str = pvc0Var.a;
                        String str116 = pvc0Var.c;
                        string2 = (String) map.get("name");
                        if (string2 != null) {
                            y6b1Var3 = string2;
                        } else {
                            if (y6b1Var8 != null) {
                                string2 = y6b1Var8.toString();
                            } else {
                                string2 = y6b1Var6;
                            }
                            if (string2 == null) {
                                y6b1Var3 = y6b1Var7;
                            } else {
                                y6b1Var3 = string2;
                            }
                        }
                        String str117 = (String) map.get("subtitle");
                        if (y6b1VarU1 != null) {
                            zContains = linkedHashSet.contains(y6b1VarU1);
                        } else {
                            zContains = false;
                        }
                        str2 = (String) map.get("children_group_id");
                        if (str2 != null) {
                            groupMetadataR3 = g6p1.r(map);
                            if (groupMetadataR3 != null) {
                                itemsCount = groupMetadataR3.getItemsCount();
                            } else {
                                itemsCount = 0;
                            }
                            if (itemsCount > 0) {
                                yq01Var = new yq01(str2, itemsCount);
                            } else {
                                yq01Var = y6b1Var6;
                            }
                        } else {
                            yq01Var = y6b1Var6;
                        }
                        arrayList = new ArrayList();
                        while (r11.hasNext()) {
                            String str118 = str;
                            if (map.containsKey("content_type_".concat(((m9m) obj2).name().toLowerCase(Locale.ROOT)))) {
                                arrayList.add(obj2);
                            }
                            str = str118;
                        }
                        String str119 = str;
                        str3 = (String) map.get("children_group_id");
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (strX2 != null) {
                            y6b1VarU0 = ihc1.U0(strX2, "group_id_", strX2);
                        } else {
                            y6b1VarU0 = y6b1Var6;
                        }
                        if (y6b1VarU0 == null) {
                            y6b1Var2 = y6b1VarU0;
                        }
                        arrayList2.add(new tt01(new cr01(str119, str116, y6b1Var3, date, br01Var, (List) r24, gktVar, str117, strX2, false, false, false, yq01Var, Boolean.valueOf(zContains), arrayList, false, false, false, true, false, (String) null, new zq01(str3, y6b1Var2), (String) null, ce71Var, (String) map.get("navigation_uri"), (List) null, false, 404822016)));
                        kdy0Var2 = kdy0Var;
                        y6b1Var4 = y6b1Var6;
                        it2 = it2;
                        list2 = list;
                        str5 = str5;
                        i2 = i3;
                    }
                    gktVar = iktVar;
                    str = pvc0Var.a;
                    String str1110 = pvc0Var.c;
                    string2 = (String) map.get("name");
                    if (string2 != null) {
                        y6b1Var3 = string2;
                    } else {
                        if (y6b1Var8 != null) {
                            string2 = y6b1Var8.toString();
                        } else {
                            string2 = y6b1Var6;
                        }
                        if (string2 == null) {
                            y6b1Var3 = y6b1Var7;
                        } else {
                            y6b1Var3 = string2;
                        }
                    }
                    String str1111 = (String) map.get("subtitle");
                    if (y6b1VarU1 != null) {
                        zContains = linkedHashSet.contains(y6b1VarU1);
                    } else {
                        zContains = false;
                    }
                    str2 = (String) map.get("children_group_id");
                    if (str2 != null) {
                        groupMetadataR3 = g6p1.r(map);
                        if (groupMetadataR3 != null) {
                            itemsCount = groupMetadataR3.getItemsCount();
                        } else {
                            itemsCount = 0;
                        }
                        if (itemsCount > 0) {
                            yq01Var = new yq01(str2, itemsCount);
                        } else {
                            yq01Var = y6b1Var6;
                        }
                    } else {
                        yq01Var = y6b1Var6;
                    }
                    arrayList = new ArrayList();
                    while (r11.hasNext()) {
                        String str1112 = str;
                        if (map.containsKey("content_type_".concat(((m9m) obj2).name().toLowerCase(Locale.ROOT)))) {
                            arrayList.add(obj2);
                        }
                        str = str1112;
                    }
                    String str1113 = str;
                    str3 = (String) map.get("children_group_id");
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (strX2 != null) {
                        y6b1VarU0 = ihc1.U0(strX2, "group_id_", strX2);
                    } else {
                        y6b1VarU0 = y6b1Var6;
                    }
                    if (y6b1VarU0 == null) {
                        y6b1Var2 = y6b1VarU0;
                    }
                    arrayList2.add(new tt01(new cr01(str1113, str1110, y6b1Var3, date, br01Var, (List) r24, gktVar, str1111, strX2, false, false, false, yq01Var, Boolean.valueOf(zContains), arrayList, false, false, false, true, false, (String) null, new zq01(str3, y6b1Var2), (String) null, ce71Var, (String) map.get("navigation_uri"), (List) null, false, 404822016)));
                    kdy0Var2 = kdy0Var;
                    y6b1Var4 = y6b1Var6;
                    it2 = it2;
                    list2 = list;
                    str5 = str5;
                    i2 = i3;
                    break;
                }
                List list7 = list2;
                String str20 = (String) lu01Var.a.X.get("filters");
                if (str20 != null && str20.length() != 0) {
                    try {
                        Filters filtersP = Filters.p(Base64.decode(str20, 0));
                        filtersP.getClass();
                        kdy0.r(filtersP);
                        break;
                    } catch (Exception unused3) {
                    }
                }
                list7.size();
                new tr80(0, list7.size(), 1);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (obj3 instanceof tt01) {
                        arrayList5.add(obj3);
                    }
                }
                ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(((tt01) it4.next()).a);
                }
                return arrayList6;
            default:
                return hu20.e(new ht20(ew01.b, new egv0(2, (lnm) null, (byte) 14)), new af01((lnm) null, new zkz0(cm0Var, (cu01) obj, (byte) 12), (byte) 3));
        }
    }
}
