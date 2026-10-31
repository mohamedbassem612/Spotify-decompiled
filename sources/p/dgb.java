package p;

import android.content.Context;
import android.text.Html;
import app.p000rive.semantics.SemanticState;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class dgb implements Function, c290, au11, Init, myc, Predicate {
    public final /* synthetic */ byte a;

    public dgb(vz20 vz20Var, iac0 iac0Var, boolean z, w25 w25Var) {
        this.a = (byte) 11;
        w25Var.e();
    }

    public static bju b(zle1 zle1Var) {
        return new bju(zle1Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:13:0x001a, B:11:0x0014, B:8:0x0010), top: B:91:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0157  */
    /* JADX WARN: Code duplicated, block: B:71:0x015d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static u580 d(Context context) {
        a680 a680VarE;
        a680 a680Var;
        Class cls;
        Class cls2;
        Class cls3;
        Object objB;
        u580 u580Var;
        Object objB2;
        Object objB3;
        synchronized (a680.g) {
            if (dhn.a.contains(a680.class)) {
                a680VarE = null;
                if (a680VarE == null) {
                    a680VarE = ejb.e();
                }
                a680Var = a680VarE;
            } else {
                try {
                    a680VarE = a680.h;
                } catch (Throwable th) {
                    dhn.a(a680.class, th);
                    a680VarE = null;
                }
                if (a680VarE == null) {
                    a680VarE = ejb.e();
                }
                a680Var = a680VarE;
            }
            throw th;
        }
        if (a680Var == null) {
            return null;
        }
        Class clsX = c680.x("com.android.billingclient.api.BillingClient");
        Class clsX2 = c680.x("com.android.billingclient.api.Purchase");
        Class clsX3 = c680.x("com.android.billingclient.api.Purchase$PurchasesResult");
        Class clsX4 = c680.x("com.android.billingclient.api.SkuDetails");
        Class clsX5 = c680.x("com.android.billingclient.api.PurchaseHistoryRecord");
        Class clsX6 = c680.x("com.android.billingclient.api.SkuDetailsResponseListener");
        Class clsX7 = c680.x("com.android.billingclient.api.PurchaseHistoryResponseListener");
        if (clsX == null || clsX3 == null || clsX2 == null || clsX4 == null || clsX6 == null || clsX5 == null || clsX7 == null) {
            u580.e();
            return null;
        }
        Method methodA = c680.A(clsX, "queryPurchases", new Class[]{String.class});
        Method methodA2 = c680.A(clsX3, "getPurchasesList", new Class[0]);
        Method methodA3 = c680.A(clsX2, "getOriginalJson", new Class[0]);
        Method methodA4 = c680.A(clsX4, "getOriginalJson", new Class[0]);
        Method methodA5 = c680.A(clsX5, "getOriginalJson", new Class[0]);
        if (dhn.a.contains(a680Var)) {
            cls = null;
        } else {
            try {
                cls = (Class) a680Var.a;
            } catch (Throwable th2) {
                dhn.a(a680Var, th2);
                cls = null;
            }
        }
        Method methodA6 = c680.A(clsX, "querySkuDetailsAsync", new Class[]{cls, clsX6});
        Method methodA7 = c680.A(clsX, "queryPurchaseHistoryAsync", new Class[]{String.class, clsX7});
        if (methodA == null || methodA2 == null || methodA3 == null || methodA4 == null || methodA5 == null || methodA6 == null || methodA7 == null) {
            u580.e();
            return null;
        }
        Class clsX8 = c680.x("com.android.billingclient.api.BillingClient$Builder");
        Class clsX9 = c680.x("com.android.billingclient.api.PurchasesUpdatedListener");
        if (clsX8 != null && clsX9 != null) {
            Method methodA8 = c680.A(clsX, "newBuilder", new Class[]{Context.class});
            Method methodA9 = c680.A(clsX8, "enablePendingPurchases", new Class[0]);
            Method methodA10 = c680.A(clsX8, "setListener", new Class[]{clsX9});
            cls2 = clsX4;
            Method methodA11 = c680.A(clsX8, "build", new Class[0]);
            if (methodA8 != null && methodA9 != null && methodA10 != null && methodA11 != null && (objB2 = c680.B(clsX, (Object) null, methodA8, new Object[]{context})) != null) {
                clsX = clsX;
                cls3 = clsX5;
                Object objB4 = c680.B(clsX8, objB2, methodA10, new Object[]{Proxy.newProxyInstance(clsX9.getClassLoader(), new Class[]{clsX9}, new s580((byte) 0))});
                objB = (objB4 == null || (objB3 = c680.B(clsX8, objB4, methodA9, new Object[0])) == null) ? null : c680.B(clsX8, objB3, methodA11, new Object[0]);
            }
            if (objB == null) {
                u580.e();
                return null;
            }
            u580Var = new u580(objB, clsX, cls2, cls3, clsX6, clsX7, methodA4, methodA5, methodA6, methodA7, a680Var);
            if (!dhn.a.contains(u580.class)) {
                try {
                    u580.m = u580Var;
                } catch (Throwable th3) {
                    dhn.a(u580.class, th3);
                }
            }
            if (!dhn.a.contains(u580.class)) {
                try {
                    return u580.m;
                } catch (Throwable th4) {
                    dhn.a(u580.class, th4);
                }
            }
            return null;
        }
        cls2 = clsX4;
        cls3 = clsX5;
        if (objB == null) {
            u580.e();
            return null;
        }
        u580Var = new u580(objB, clsX, cls2, cls3, clsX6, clsX7, methodA4, methodA5, methodA6, methodA7, a680Var);
        if (!dhn.a.contains(u580.class)) {
            u580.m = u580Var;
        }
        if (!dhn.a.contains(u580.class)) {
            return u580.m;
        }
        return null;
    }

    public static String e(di9 di9Var) {
        int iOrdinal = di9Var.ordinal();
        if (iOrdinal == 0) {
            return "immediate";
        }
        if (iOrdinal == 1) {
            return "close";
        }
        if (iOrdinal == 2) {
            return "far";
        }
        if (iOrdinal == 3) {
            return "unknown";
        }
        eg.o();
        return null;
    }

    public static List f(String str, String str2) {
        boolean z;
        String strH = h(str);
        String strH2 = h(str2);
        if (strH2.length() <= 0) {
            return Collections.singletonList(new gp51(str, false));
        }
        if (strH.length() <= 0) {
            return Collections.singletonList(new gp51(str, false));
        }
        if (str2.length() == 1) {
            return ihc1.p0(strH) == ihc1.p0(strH2) ? p7h.M(new gp51[]{new gp51(ihc1.c1(1, str), true), new gp51(ihc1.l0(1, str), false)}) : Collections.singletonList(new gp51(str, false));
        }
        int iW0 = ihc1.w0(strH, strH2, 0, false, 6);
        if (iW0 == -1) {
            return Collections.singletonList(new gp51(str, false));
        }
        int length = strH2.length();
        int length2 = str.length();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (iW0 >= length2) {
                iW0 = -1;
                break;
            }
            char cCharAt = str.charAt(iW0);
            Iterator it = p7h.M(new se11[]{uae1.c, uae1.d}).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((se11) it.next()).e(String.valueOf(cCharAt))) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                i2++;
            }
            if (!z && i == -1) {
                i = iW0;
            }
            if (i2 >= length) {
                break;
            }
            iW0++;
        }
        tr80 tr80Var = new tr80(i, iW0, 1);
        ArrayList arrayList = new ArrayList();
        int i3 = ((rr80) tr80Var).b;
        if (i3 == -1 || i == -1) {
            arrayList.add(new gp51(str, false));
            return arrayList;
        }
        if (i > 0) {
            arrayList.add(new gp51(str.substring(0, i), false));
        }
        int i4 = i3 + 1;
        arrayList.add(new gp51(str.substring(i, i4), true));
        if (i4 < str.length()) {
            arrayList.add(new gp51(str.substring(i4, str.length()), false));
        }
        return arrayList;
    }

    public static yya g(List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, int i) {
        String strA;
        fi9 fi9Var;
        String string = UUID.randomUUID().toString();
        List<gi9> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (gi9 gi9Var : list2) {
            String str = gi9Var.a;
            String str2 = gi9Var.a;
            re9 re9Var = (re9) linkedHashMap.get(str);
            if (re9Var == null || (fi9Var = re9Var.c) == null) {
                int i2 = gi9Var.c;
                if (i2 == 1) {
                    strA = "unknown";
                } else if (i2 == 2) {
                    strA = "ios_like";
                } else {
                    if (i2 != 3) {
                        throw null;
                    }
                    strA = "android_like";
                }
            } else {
                strA = fi9Var.a();
            }
            String str3 = strA;
            int i3 = re9Var != null ? re9Var.b.a : gi9Var.b;
            String strE = e(re9Var != null ? re9Var.b.b : gi9Var.d);
            Integer num = gi9Var.e;
            arrayList.add(new zya(i3, num != null ? num.intValue() : 0, str2, str3, strE, (String) linkedHashMap2.get(str2)));
        }
        return new yya(i, string, arrayList);
    }

    public static String h(String str) {
        int i = ywx0.i(1);
        if ((i & 2) != 0) {
            i |= 64;
        }
        if (Pattern.compile("((https?|ftp|smtp|sftp|ftps|mailto)[\\w.-]+(?:\\.[\\w.-]+)+[/\\w\\-.~%?=&]*)|(https?://)", i).matcher(str).find()) {
            return "";
        }
        return ihc1.e1(Pattern.compile("\\s+").matcher(uae1.c.g("", uae1.d.g("", uae1.b.g("", Normalizer.normalize(str, Normalizer.Form.NFKD)))).toLowerCase(uae1.a)).replaceAll(" ")).toString();
    }

    public m5n a(String str, boolean z) {
        return new m5n(new cl1(this, str, z), mls.T0);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return egb.b.get(obj);
            case 22:
                List<tv00> listB = ((uv00) obj).b(dxc0.class);
                ArrayList arrayList = new ArrayList();
                for (tv00 tv00Var : listB) {
                    ez00 ez00Var = tv00Var.b;
                    mmr0 mmr0Var = ez00Var != null ? new mmr0(tv00Var.a, ez00Var) : null;
                    if (mmr0Var != null) {
                        arrayList.add(mmr0Var);
                    }
                }
                Map mapT = sqg0.T(arrayList);
                ArrayList arrayList2 = new ArrayList(mapT.size());
                for (Map.Entry entry : mapT.entrySet()) {
                    dxc0 dxc0Var = (dxc0) entry.getValue();
                    String str = (String) entry.getKey();
                    String str2 = dxc0Var.d;
                    if (str2.length() == 0) {
                        str2 = dxc0Var.a;
                    }
                    String string = Html.fromHtml(str2, 0).toString();
                    String str3 = dxc0Var.e.b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    arrayList2.add(new etd(str3, "", string, str, z6x.a, Html.fromHtml(str2, 0).toString(), (String) null, SemanticState.Hidden));
                }
                return new r111(arrayList2);
            default:
                List listSubList = ((z310) obj).a;
                if (listSubList.size() > 160) {
                    listSubList = listSubList.subList(0, 160);
                }
                return new z310(listSubList, (f410) null, (m510) null, (String) null);
        }
    }

    public Object convert(int i) {
        Object obj = null;
        switch (this.a) {
            case 1:
                k471 k471VarA = k471.a(i);
                return k471VarA == null ? k471.V0 : k471VarA;
            case 3:
                dvm dvmVarA = dvm.a(i);
                return dvmVarA == null ? dvm.e : dvmVarA;
            case 10:
                switch (i) {
                    case 0:
                        obj = fz00.UNKNOWN;
                        break;
                    case 1:
                        obj = fz00.GENRE;
                        break;
                    case 2:
                        obj = fz00.MOOD;
                        break;
                    case 3:
                        obj = fz00.ACTIVITY;
                        break;
                    case 4:
                        obj = fz00.INSTRUMENT;
                        break;
                    case 5:
                        obj = fz00.TIME;
                        break;
                    case 6:
                        obj = fz00.ERA;
                        break;
                    case 7:
                        obj = fz00.AESTHETIC;
                        break;
                    case 8:
                        obj = fz00.AUDIENCE;
                        break;
                    case 9:
                        obj = fz00.CULTURAL_REFERENCE;
                        break;
                    case 10:
                        obj = fz00.GEOGRAPHIC_LOCATION;
                        break;
                    case 11:
                        obj = fz00.LANGUAGE;
                        break;
                    case 12:
                        obj = fz00.LOCATION;
                        break;
                    case 13:
                        obj = fz00.MEDIA;
                        break;
                    case 14:
                        obj = fz00.MUSIC_FESTIVAL;
                        break;
                    case 15:
                        obj = fz00.MUSIC_VENUE;
                        break;
                    case 16:
                        obj = fz00.MUSICAL_DESCRIPTOR;
                        break;
                    case 17:
                        obj = fz00.MUSICAL_TERM;
                        break;
                    case 18:
                        obj = fz00.PLACE;
                        break;
                    case 19:
                        obj = fz00.PUBLICATION;
                        break;
                    case 20:
                        obj = fz00.RADIO;
                        break;
                    case 21:
                        obj = fz00.RECORD_LABEL;
                        break;
                    case 22:
                        obj = fz00.RECORD_STORE;
                        break;
                    case 23:
                        obj = fz00.RELIGION;
                        break;
                    case 24:
                        obj = fz00.SLANG;
                        break;
                }
                return obj == null ? fz00.UNRECOGNIZED : obj;
            case 12:
                vls0 vls0VarA = vls0.a(i);
                return vls0VarA == null ? vls0.b : vls0VarA;
            case 16:
                xij0 xij0VarA = xij0.a(i);
                return xij0VarA == null ? xij0.b : xij0VarA;
            case 24:
                w80 w80VarA = w80.a(i);
                return w80VarA == null ? w80.f : w80VarA;
            default:
                switch (i) {
                    case 0:
                        obj = qg01.REASON_UNSPECIFIED;
                        break;
                    case 1:
                        obj = qg01.REASON_CONTENT_SHARING;
                        break;
                    case 2:
                        obj = qg01.REASON_COLLABORATIVE_PLAYLISTS;
                        break;
                    case 3:
                        obj = qg01.REASON_BLENDS;
                        break;
                    case 4:
                        obj = qg01.REASON_GROUP_SESSIONS;
                        break;
                    case 5:
                        obj = qg01.REASON_FAMILY;
                        break;
                    case 6:
                        obj = qg01.REASON_FOLLOWING;
                        break;
                    case 7:
                        obj = qg01.REASON_MESSAGING;
                        break;
                    case 8:
                        obj = qg01.REASON_WRAPPED_PARTY;
                        break;
                }
                return obj == null ? qg01.UNRECOGNIZED : obj;
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 15:
                return First.c((e9f0) obj, f46.S0(new v8r[]{p8f0.e, n8f0.e}));
            case 19:
                return First.c((lbt0) obj, Collections.singleton(j9t0.a));
            default:
                return First.b((xry0) obj);
        }
    }

    public lu11 k(fe00 fe00Var, unb1 unb1Var) {
        throw new IllegalStateException("Dummy element used only for data declarations");
    }

    public boolean test(Object obj) {
        return ((List) obj) != z6x.a;
    }

    public void u(dxc dxcVar, Throwable th) {
    }

    public void z(dxc dxcVar, sy21 sy21Var) {
    }
}
