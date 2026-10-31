package p;

import android.content.Context;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s141 {
    public final gsa a;
    public final PublishSubject b;
    public final PublishSubject c;

    public s141(Context context, h550 h550Var) {
        gsa axn1Var;
        pra praVar = new pra(context);
        praVar.c = this;
        praVar.a = new twa();
        if (h550Var.a.a()) {
            praVar.d = true;
        }
        if (praVar.c == null) {
            hhg1.n("Please provide a valid listener for purchases updates.");
            throw null;
        }
        if (praVar.a == null) {
            hhg1.n("Pending purchases for one-time products must be supported.");
            throw null;
        }
        praVar.a.getClass();
        s141 s141Var = praVar.c;
        twa twaVar = praVar.a;
        if (s141Var != null) {
            s141 s141Var2 = praVar.c;
            axn1Var = praVar.a() ? new axn1(twaVar, context, s141Var2, praVar) : new gsa(twaVar, context, s141Var2, praVar);
        } else {
            axn1Var = praVar.a() ? new axn1(twaVar, context, praVar) : new gsa(twaVar, context, praVar);
        }
        this.a = axn1Var;
        this.b = new PublishSubject();
        this.c = new PublishSubject();
    }

    public static j331 a(iua iuaVar, List list, int i) {
        ArrayList arrayList;
        int i2 = iuaVar.a;
        if (i2 != 0) {
            if (i2 != 1) {
                return new b231(i, i2, iuaVar.c);
            }
            Logger.d("User has cancelled the purchase flow", new Object[0]);
            return c331.a;
        }
        if (list != null) {
            List<Purchase> list2 = list;
            arrayList = new ArrayList(q7h.U(list2, 10));
            for (Purchase purchase : list2) {
                JSONObject jSONObject = purchase.c;
                String strOptString = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
                JSONObject jSONObject2 = purchase.c;
                char c = jSONObject2.optInt("purchaseState", 1) != 4 ? (char) 1 : (char) 2;
                int i3 = c != 1 ? c != 2 ? 3 : 1 : 2;
                ArrayList arrayList2 = new ArrayList();
                if (jSONObject2.has("productIds")) {
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("productIds");
                    if (jSONArrayOptJSONArray != null) {
                        for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                            arrayList2.add(jSONArrayOptJSONArray.optString(i4));
                        }
                    }
                } else if (jSONObject2.has("productId")) {
                    arrayList2.add(jSONObject2.optString("productId"));
                }
                String strOptString2 = jSONObject2.optString("obfuscatedAccountId");
                String str = null;
                jm jmVar = (strOptString2 == null && jSONObject2.optString("obfuscatedProfileId") == null) ? null : new jm(strOptString2, (byte) 0);
                if (jmVar != null) {
                    str = jmVar.b;
                }
                arrayList.add(new uuy0(i3, strOptString, str, arrayList2));
            }
        } else {
            arrayList = z6x.a;
        }
        return new v231(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:141:0x01ed  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final j331 b(int i) {
        String str;
        iua iuaVar;
        int iC = l1d.C(i);
        if (iC == 0) {
            str = "fff";
        } else if (iC == 1) {
            str = "subscriptions";
        } else {
            if (iC != 2) {
                eg.o();
                return null;
            }
            str = "subscriptionsUpdate";
        }
        gsa gsaVar = this.a;
        if (gsaVar.N()) {
            iua iuaVar2 = iyn1.a;
            switch (str.hashCode()) {
                case -422092961:
                    if (!str.equals("subscriptionsUpdate")) {
                        "Unsupported feature: ".concat(str);
                        int i2 = vsn1.a;
                        Log.isLoggable("BillingClient", 5);
                        iuaVar = iyn1.v;
                        gsaVar.S(34, 1, iuaVar);
                    } else {
                        iuaVar = gsaVar.n ? iyn1.g : iyn1.k;
                        gsaVar.S(10, 3, iuaVar);
                    }
                    break;
                case 96321:
                    if (!str.equals("aaa")) {
                        "Unsupported feature: ".concat(str);
                        int i3 = vsn1.a;
                        Log.isLoggable("BillingClient", 5);
                        iuaVar = iyn1.v;
                        gsaVar.S(34, 1, iuaVar);
                    } else {
                        iuaVar = gsaVar.u ? iyn1.g : iyn1.m;
                        gsaVar.S(31, 6, iuaVar);
                    }
                    break;
                case 97314:
                    if (!str.equals("bbb")) {
                        "Unsupported feature: ".concat(str);
                        int i4 = vsn1.a;
                        Log.isLoggable("BillingClient", 5);
                        iuaVar = iyn1.v;
                        gsaVar.S(34, 1, iuaVar);
                    } else {
                        iuaVar = gsaVar.s ? iyn1.g : iyn1.q;
                        gsaVar.S(30, 5, iuaVar);
                    }
                    break;
                case 98307:
                    if (!str.equals("ccc")) {
                        "Unsupported feature: ".concat(str);
                        int i5 = vsn1.a;
                        Log.isLoggable("BillingClient", 5);
                        iuaVar = iyn1.v;
                        gsaVar.S(34, 1, iuaVar);
                    } else {
                        iuaVar = gsaVar.v ? iyn1.g : iyn1.n;
                        gsaVar.S(19, 8, iuaVar);
                    }
                    break;
                case 99300:
                    if (!str.equals("ddd")) {
                        "Unsupported feature: ".concat(str);
                        int i6 = vsn1.a;
                        Log.isLoggable("BillingClient", 5);
                        iuaVar = iyn1.v;
                        gsaVar.S(34, 1, iuaVar);
                    } else {
                        iuaVar = gsaVar.t ? iyn1.g : iyn1.o;
                        gsaVar.S(21, 7, iuaVar);
                    }
                    break;
                case 100293:
                    if (!str.equals("eee")) {
                        "Unsupported feature: ".concat(str);
                        int i7 = vsn1.a;
                        Log.isLoggable("BillingClient", 5);
                        iuaVar = iyn1.v;
                        gsaVar.S(34, 1, iuaVar);
                    } else {
                        iuaVar = gsaVar.v ? iyn1.g : iyn1.n;
                        gsaVar.S(61, 9, iuaVar);
                    }
                    break;
                case 101286:
                    if (!str.equals("fff")) {
                        "Unsupported feature: ".concat(str);
                        int i8 = vsn1.a;
                        Log.isLoggable("BillingClient", 5);
                        iuaVar = iyn1.v;
                        gsaVar.S(34, 1, iuaVar);
                    } else {
                        iuaVar = gsaVar.w ? iyn1.g : iyn1.f76p;
                        gsaVar.S(20, 10, iuaVar);
                    }
                    break;
                case 102279:
                    if (!str.equals("ggg")) {
                        "Unsupported feature: ".concat(str);
                        int i9 = vsn1.a;
                        Log.isLoggable("BillingClient", 5);
                        iuaVar = iyn1.v;
                        gsaVar.S(34, 1, iuaVar);
                    } else {
                        iuaVar = gsaVar.x ? iyn1.g : iyn1.w;
                        gsaVar.S(32, 11, iuaVar);
                    }
                    break;
                case 103272:
                    if (!str.equals("hhh")) {
                        "Unsupported feature: ".concat(str);
                        int i10 = vsn1.a;
                        Log.isLoggable("BillingClient", 5);
                        iuaVar = iyn1.v;
                        gsaVar.S(34, 1, iuaVar);
                    } else {
                        iuaVar = gsaVar.x ? iyn1.g : iyn1.x;
                        gsaVar.S(33, 12, iuaVar);
                    }
                    break;
                case 104265:
                    if (!str.equals("iii")) {
                        "Unsupported feature: ".concat(str);
                        int i11 = vsn1.a;
                        Log.isLoggable("BillingClient", 5);
                        iuaVar = iyn1.v;
                        gsaVar.S(34, 1, iuaVar);
                    } else {
                        iuaVar = gsaVar.z ? iyn1.g : iyn1.z;
                        gsaVar.S(60, 13, iuaVar);
                    }
                    break;
                case 105258:
                    if (!str.equals("jjj")) {
                        "Unsupported feature: ".concat(str);
                        int i12 = vsn1.a;
                        Log.isLoggable("BillingClient", 5);
                        iuaVar = iyn1.v;
                        gsaVar.S(34, 1, iuaVar);
                    } else {
                        iuaVar = gsaVar.A ? iyn1.g : iyn1.A;
                        gsaVar.S(66, 14, iuaVar);
                    }
                    break;
                case 106251:
                    if (!str.equals("kkk")) {
                        "Unsupported feature: ".concat(str);
                        int i13 = vsn1.a;
                        Log.isLoggable("BillingClient", 5);
                        iuaVar = iyn1.v;
                        gsaVar.S(34, 1, iuaVar);
                    } else {
                        iuaVar = gsaVar.C ? iyn1.g : iyn1.r;
                        gsaVar.S(83, 18, iuaVar);
                    }
                    break;
                case 107244:
                    if (!str.equals("lll")) {
                        "Unsupported feature: ".concat(str);
                        int i14 = vsn1.a;
                        Log.isLoggable("BillingClient", 5);
                        iuaVar = iyn1.v;
                        gsaVar.S(34, 1, iuaVar);
                    } else {
                        iuaVar = gsaVar.B ? iyn1.g : iyn1.s;
                        gsaVar.S(104, 19, iuaVar);
                    }
                    break;
                case 108237:
                    if (!str.equals("mmm")) {
                        "Unsupported feature: ".concat(str);
                        int i15 = vsn1.a;
                        Log.isLoggable("BillingClient", 5);
                        iuaVar = iyn1.v;
                        gsaVar.S(34, 1, iuaVar);
                    } else {
                        iuaVar = gsaVar.C ? iyn1.g : iyn1.t;
                        gsaVar.S(119, 20, iuaVar);
                    }
                    break;
                case 109230:
                    if (!str.equals("nnn")) {
                        "Unsupported feature: ".concat(str);
                        int i16 = vsn1.a;
                        Log.isLoggable("BillingClient", 5);
                        iuaVar = iyn1.v;
                        gsaVar.S(34, 1, iuaVar);
                    } else {
                        iuaVar = gsaVar.D ? iyn1.g : iyn1.u;
                        gsaVar.S(138, 21, iuaVar);
                    }
                    break;
                case 207616302:
                    if (!str.equals("priceChangeConfirmation")) {
                        "Unsupported feature: ".concat(str);
                        int i17 = vsn1.a;
                        Log.isLoggable("BillingClient", 5);
                        iuaVar = iyn1.v;
                        gsaVar.S(34, 1, iuaVar);
                    } else {
                        iuaVar = gsaVar.q ? iyn1.g : iyn1.l;
                        gsaVar.S(35, 4, iuaVar);
                    }
                    break;
                case 1987365622:
                    if (!str.equals("subscriptions")) {
                        "Unsupported feature: ".concat(str);
                        int i18 = vsn1.a;
                        Log.isLoggable("BillingClient", 5);
                        iuaVar = iyn1.v;
                        gsaVar.S(34, 1, iuaVar);
                    } else {
                        iuaVar = gsaVar.m ? iyn1.g : iyn1.j;
                        gsaVar.S(9, 2, iuaVar);
                    }
                    break;
                default:
                    "Unsupported feature: ".concat(str);
                    int i19 = vsn1.a;
                    Log.isLoggable("BillingClient", 5);
                    iuaVar = iyn1.v;
                    gsaVar.S(34, 1, iuaVar);
                    break;
            }
        } else {
            iuaVar = iyn1.h;
            if (iuaVar.a != 0) {
                gsaVar.T(2, 5, iuaVar);
            } else {
                try {
                    int i20 = hxn1.a;
                    gsaVar.I(hxn1.c(5, jno1.b));
                } catch (Throwable unused) {
                    vsn1.i("BillingClient");
                }
            }
        }
        int i21 = iuaVar.a;
        if (i21 != -2) {
            return i21 != 0 ? new b231(3, i21, iuaVar.c) : new v231(Boolean.TRUE);
        }
        return new v231(Boolean.FALSE);
    }

    public final void c(iua iuaVar, List list) {
        this.c.onNext(a(iuaVar, list, 8));
    }
}
