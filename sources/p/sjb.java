package p;

import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.ui.text.font.FontWeight;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.identity.proto.v3.IdentityV3;
import com.spotify.profile.coreprofileimpl.CoreProfileException;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import spotify.profile_esperanto.proto.GetProfilesResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sjb implements Function, jqc1, pp00, n2i1, tga, zdt0, dsn, fr61, syp0 {
    public final /* synthetic */ byte a;

    public static final tr80 k(int i, int i2, int i3) {
        int i4 = (i / i2) * i2;
        return yoi1.Q(Math.max(i4 - i3, 0), i4 + i2 + i3);
    }

    public static final m210 l(pfb pfbVar) {
        String str = pfbVar != null ? pfbVar.a : null;
        if (str == null) {
            str = "";
        }
        return new m210("bluetooth", "", str, "bluetooth", "", "", "", "", "", "media_button", "");
    }

    public static final boolean m(sjb sjbVar) {
        return u890.j(Build.FINGERPRINT, "robolectric");
    }

    public static Typeface o(String str, FontWeight fontWeight, int i) {
        if (i == 0 && u890.j(fontWeight, FontWeight.t) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iU = wpb1.u(i, fontWeight);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iU) : Typeface.create(str, iU);
    }

    public static Bundle p(bi90 bi90Var, String str) {
        Bundle bundle = new Bundle();
        if (bi90Var == null && str == null) {
            hhg1.n("Category details fragment cannot be instantiated without a category or a valid category key");
            return null;
        }
        if (bi90Var != null) {
            bundle.putParcelable("SELECTED_ITEM", bi90Var);
        }
        if (str != null) {
            bundle.putString("SELECTED_ITEM_KEY", str);
        }
        return bundle;
    }

    public static String u(String str, LinkedHashMap linkedHashMap) {
        y570 y570Var = (y570) linkedHashMap.get(str);
        if (y570Var == null) {
            return null;
        }
        return y570Var.n().a.a;
    }

    public static boolean v(f951 f951Var, f951 f951Var2) {
        if (f951Var instanceof a951) {
            a951 a951Var = (a951) f951Var;
            if (f951Var2 instanceof a951) {
                qiq0 qiq0Var = a951Var.a;
                qiq0 qiq0Var2 = ((a951) f951Var2).a;
                if (qiq0Var instanceof riq0) {
                    return qiq0Var2 instanceof riq0;
                }
                if (!(qiq0Var instanceof qiq0)) {
                    eg.o();
                } else if (qiq0Var2 instanceof qiq0) {
                    qiq0 qiq0Var3 = qiq0Var;
                    qiq0 qiq0Var4 = qiq0Var2;
                    if (u890.j(qiq0Var3.a, qiq0Var4.a) && u890.j(qiq0Var3.c, qiq0Var4.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public qp00[] a(op00[] op00VarArr, o4a o4aVar) {
        qp00[] qp00VarArr = new qp00[op00VarArr.length];
        for (int i = 0; i < op00VarArr.length; i++) {
            op00 op00Var = op00VarArr[i];
            qp00VarArr[i] = op00Var == null ? null : new nwu(0, op00Var.a, op00Var.b);
        }
        return qp00VarArr;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                GetProfilesResponse getProfilesResponse = (GetProfilesResponse) obj;
                int statusCode = getProfilesResponse.getStatusCode();
                if (200 > statusCode || statusCode >= 300 || getProfilesResponse.p() <= 0) {
                    return Observable.error(new CoreProfileException(f4i1.c(getProfilesResponse.getStatusCode(), "Failed loading profile, status ")));
                }
                h290<IdentityV3.UserProfile> h290VarQ = getProfilesResponse.q();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarQ, 10));
                for (IdentityV3.UserProfile userProfile : h290VarQ) {
                    userProfile.getClass();
                    arrayList.add(v5n.e(userProfile));
                }
                return Observable.just(arrayList);
            case 21:
                throw td6.k(obj);
            default:
                return emk1.b.get(obj);
        }
    }

    public Typeface b(int i, FontWeight fontWeight) {
        return o(null, fontWeight, i);
    }

    public int c(ie30 ie30Var) {
        String str = ie30Var.p;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        hhg1.n(l1d.m("Unsupported MIME type: ", str));
        return 0;
    }

    public Typeface d(zh40 zh40Var, FontWeight fontWeight, int i) {
        String strConcat = zh40Var.f;
        int i2 = fontWeight.a / 100;
        if (i2 >= 0 && i2 < 2) {
            strConcat = strConcat.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            strConcat = strConcat.concat("-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                strConcat = strConcat.concat("-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                strConcat = strConcat.concat("-black");
            }
        }
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceO = o(strConcat, fontWeight, i);
            if (!u890.j(typefaceO, Typeface.create(Typeface.DEFAULT, wpb1.u(i, fontWeight))) && !u890.j(typefaceO, o(null, fontWeight, i))) {
                typeface = typefaceO;
            }
        }
        return typeface == null ? o(zh40Var.f, fontWeight, i) : typeface;
    }

    public boolean e(ie30 ie30Var) {
        String str = ie30Var.p;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    public long f(fc10 fc10Var) {
        return -1L;
    }

    public jm61 g(mta mtaVar, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        ho41 ho41Var = jSONObject.has("session") ? new ho41(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new ho41(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        yw7 yw7Var = new yw7(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            jCurrentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new jm61(jCurrentTimeMillis, ho41Var, yw7Var, dOptDouble, dOptDouble2, iOptInt2);
    }

    public lqc1 h(ie30 ie30Var) {
        String str = ie30Var.p;
        List list = ie30Var.s;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new d520(list);
                case "application/pgs":
                    return new mts0();
                case "application/x-mp4-vtt":
                    return new bm70((byte) 1);
                case "text/vtt":
                    return new bml1();
                case "application/x-quicktime-tx3g":
                    a5u a5uVar = new a5u();
                    a5uVar.g = new izr0();
                    if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
                        byte[] bArr = (byte[]) list.get(0);
                        a5uVar.b = bArr[24];
                        a5uVar.c = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
                        a5uVar.d = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
                        int i = bArr[25] * 20;
                        a5uVar.f = i;
                        boolean z = (bArr[0] & 32) != 0;
                        a5uVar.a = z;
                        if (z) {
                            a5uVar.e = zoi1.i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
                        } else {
                            a5uVar.e = 0.85f;
                        }
                    } else {
                        a5uVar.b = 0;
                        a5uVar.c = -1;
                        a5uVar.d = "sans-serif";
                        a5uVar.a = false;
                        a5uVar.e = 0.85f;
                        a5uVar.f = -1;
                    }
                    return a5uVar;
                case "text/x-ssa":
                    return new p9b1(list);
                case "application/vobsub":
                    return new tlk1(list);
                case "application/x-subrip":
                    return new wmc1();
                case "application/ttml+xml":
                    return new axg1();
            }
        }
        hhg1.n(l1d.m("Unsupported MIME type: ", str));
        return null;
    }

    public fn51 i() {
        return new bc9(-9223372036854775807L);
    }

    public void n(fg5 fg5Var, fg5 fg5Var2) {
        HashSet hashSet = new HashSet();
        Iterator it = fg5Var.iterator();
        while (it.hasNext()) {
            hashSet.add(((pf5) it.next()).b());
        }
        Iterator it2 = fg5Var2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((pf5) it2.next()).b());
        }
    }

    public qx81 q(zsc zscVar, e0h1 e0h1Var, boolean z, int i, boolean z2) {
        fg5 fg5Var;
        e0h1 e0h1VarD;
        jit jitVar = (jit) zscVar.c;
        e1h1 e1h1VarR = r(new f1h1(1, jitVar.y1()), zscVar, null, i);
        qx81 qx81VarP = jzn1.p(e1h1VarR.b());
        if (d4o1.i(qx81VarP)) {
            return qx81VarP;
        }
        e1h1VarR.a();
        fg5 annotations = qx81VarP.getAnnotations();
        ig5 ig5Var = (ig5) jg5.b.p(e0h1Var, jg5.a[0]);
        if (ig5Var == null || (fg5Var = ig5Var.a) == null) {
            fg5Var = rzs0.g;
        }
        n(annotations, fg5Var);
        if (!d4o1.i(qx81VarP)) {
            if (d4o1.i(qx81VarP)) {
                e0h1VarD = qx81VarP.s0();
            } else {
                e0h1 e0h1VarS0 = qx81VarP.s0();
                ffe1 ffe1Var = e0h1.b;
                if (e0h1Var.isEmpty() && e0h1VarS0.isEmpty()) {
                    e0h1VarD = e0h1Var;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((ConcurrentHashMap) ffe1Var.b).values().iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        ig5 ig5Var2 = (ig5) e0h1Var.a.get(iIntValue);
                        ig5 ig5Var3 = (ig5) e0h1VarS0.a.get(iIntValue);
                        if (ig5Var2 != null) {
                            if (ig5Var3 != null) {
                                fg5 hg5Var = ig5Var2.a;
                                fg5 fg5Var2 = ig5Var3.a;
                                if (hg5Var.isEmpty()) {
                                    hg5Var = fg5Var2;
                                } else if (!fg5Var2.isEmpty()) {
                                    hg5Var = new hg5(new fg5[]{hg5Var, fg5Var2});
                                }
                                ig5Var2 = new ig5(hg5Var);
                            }
                            ig5Var3 = ig5Var2;
                        } else if (ig5Var3 == null) {
                            ig5Var3 = null;
                        } else if (ig5Var2 != null) {
                            fg5 hg5Var2 = ig5Var3.a;
                            fg5 fg5Var3 = ig5Var2.a;
                            if (hg5Var2.isEmpty()) {
                                hg5Var2 = fg5Var3;
                            } else if (!fg5Var3.isEmpty()) {
                                hg5Var2 = new hg5(new fg5[]{hg5Var2, fg5Var3});
                            }
                            ig5Var3 = new ig5(hg5Var2);
                        }
                        h4p1.d(arrayList, ig5Var3);
                    }
                    e0h1VarD = ffe1.d(arrayList);
                }
            }
            qx81VarP = jzn1.z(qx81VarP, (List) null, e0h1VarD, 1);
        }
        qx81 qx81VarI = o1h1.i(qx81VarP, z);
        return z2 ? mue1.Y(qx81VarI, y3o1.j0((List) zscVar.d, ypi0.b, e0h1Var, jitVar.i, z)) : qx81VarI;
    }

    public e1h1 r(e1h1 e1h1Var, zsc zscVar, y0h1 y0h1Var, int i) {
        int iX;
        jit jitVar = (jit) zscVar.c;
        if (i > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + jitVar.getName());
        }
        if (e1h1Var.c()) {
            y0h1Var.getClass();
            return o1h1.j(y0h1Var);
        }
        a8b0 a8b0VarB = e1h1Var.b();
        jfg jfgVarS = a8b0VarB.t0().s();
        e1h1 e1h1Var2 = jfgVarS instanceof y0h1 ? (e1h1) ((Map) zscVar.e).get(jfgVarS) : null;
        int i2 = 0;
        if (e1h1Var2 == null) {
            qx81 qx81VarP = jzn1.p(e1h1Var.b().w0());
            if (!d4o1.i(qx81VarP) && o1h1.c(qx81VarP, j141.T0, null)) {
                h0h1 h0h1VarT0 = qx81VarP.t0();
                jfg jfgVarS2 = h0h1VarT0.s();
                h0h1VarT0.getParameters().size();
                qx81VarP.r0().size();
                if (!(jfgVarS2 instanceof y0h1)) {
                    if (!(jfgVarS2 instanceof jit)) {
                        qx81 qx81VarZ = z(qx81VarP, zscVar, i);
                        l1h1.d(qx81VarZ);
                        for (Object obj : qx81VarZ.r0()) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                p7h.T();
                                throw null;
                            }
                            e1h1 e1h1Var3 = (e1h1) obj;
                            if (!e1h1Var3.c() && !o1h1.c(e1h1Var3.b(), j141.S0, null)) {
                            }
                            i2 = i3;
                        }
                        return new f1h1(e1h1Var.a(), qx81VarZ);
                    }
                    jit jitVar2 = (jit) jfgVarS2;
                    if (zscVar.y(jitVar2)) {
                        return new f1h1(1, bkz.b(zjz.f, jitVar2.getName().a));
                    }
                    List listR0 = qx81VarP.r0();
                    int i4 = 0;
                    ArrayList arrayList = new ArrayList(q7h.U(listR0, 10));
                    for (Object obj2 : listR0) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            p7h.T();
                            throw null;
                        }
                        arrayList.add(r((e1h1) obj2, zscVar, (y0h1) h0h1VarT0.getParameters().get(i4), i + 1));
                        i4 = i5;
                    }
                    List parameters = jitVar2.i.getParameters();
                    ArrayList arrayList2 = new ArrayList(q7h.U(parameters, 10));
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((y0h1) it.next()).w1());
                    }
                    return new f1h1(e1h1Var.a(), mue1.Y(q(new zsc(zscVar, jitVar2, arrayList, sqg0.T(o7h.v1(arrayList2, arrayList)), (byte) 25), qx81VarP.s0(), qx81VarP.u0(), i + 1, false), z(qx81VarP, zscVar, i)));
                }
            }
            return e1h1Var;
        }
        if (e1h1Var2.c()) {
            y0h1Var.getClass();
            return o1h1.j(y0h1Var);
        }
        gmh1 gmh1VarW0 = e1h1Var2.b().w0();
        int iA = e1h1Var2.a();
        int iA2 = e1h1Var.a();
        if (iA2 != iA && iA2 != 1 && iA == 1) {
            iA = iA2;
        }
        if (y0h1Var == null || (iX = y0h1Var.x()) == 0) {
            iX = 1;
        }
        if (iX != iA && iX != 1 && iA == 1) {
            iA = 1;
        }
        n(a8b0VarB.getAnnotations(), gmh1VarW0.getAnnotations());
        qx81 qx81VarI = o1h1.i(jzn1.p(gmh1VarW0), a8b0VarB.u0());
        e0h1 e0h1VarS0 = a8b0VarB.s0();
        if (!d4o1.i(qx81VarI)) {
            if (d4o1.i(qx81VarI)) {
                e0h1VarS0 = qx81VarI.s0();
            } else {
                e0h1 e0h1VarS1 = qx81VarI.s0();
                ffe1 ffe1Var = e0h1.b;
                if (!e0h1VarS0.isEmpty() || !e0h1VarS1.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = ((ConcurrentHashMap) ffe1Var.b).values().iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        ig5 ig5Var = (ig5) e0h1VarS0.a.get(iIntValue);
                        ig5 ig5Var2 = (ig5) e0h1VarS1.a.get(iIntValue);
                        if (ig5Var != null) {
                            if (ig5Var2 != null) {
                                fg5 hg5Var = ig5Var.a;
                                fg5 fg5Var = ig5Var2.a;
                                if (hg5Var.isEmpty()) {
                                    hg5Var = fg5Var;
                                } else if (!fg5Var.isEmpty()) {
                                    hg5Var = new hg5(new fg5[]{hg5Var, fg5Var});
                                }
                                ig5Var = new ig5(hg5Var);
                            }
                            ig5Var2 = ig5Var;
                        } else if (ig5Var2 == null) {
                            ig5Var2 = null;
                        } else if (ig5Var != null) {
                            fg5 hg5Var2 = ig5Var2.a;
                            fg5 fg5Var2 = ig5Var.a;
                            if (hg5Var2.isEmpty()) {
                                hg5Var2 = fg5Var2;
                            } else if (!fg5Var2.isEmpty()) {
                                hg5Var2 = new hg5(new fg5[]{hg5Var2, fg5Var2});
                            }
                            ig5Var2 = new ig5(hg5Var2);
                        }
                        h4p1.d(arrayList3, ig5Var2);
                    }
                    e0h1VarS0 = ffe1.d(arrayList3);
                }
            }
            qx81VarI = jzn1.z(qx81VarI, (List) null, e0h1VarS0, 1);
        }
        return new f1h1(iA, qx81VarI);
    }

    public boolean s(Uri uri) {
        List list = vly0.a;
        return u890.j(uri.getScheme(), "https") && o7h.i0(vly0.a, uri.getHost()) && uri.getPathSegments().size() == 3 && u890.j(uri.getPathSegments().get(0), "api") && u890.j(uri.getPathSegments().get(1), "payment-sdk") && u890.j(uri.getPathSegments().get(2), "provider-redirect");
    }

    public String t() {
        return Thread.currentThread().getName();
    }

    public String toString() {
        switch (this.a) {
            case 23:
                int iHashCode = hashCode();
                eth.h(16);
                return cy30.p("CreationExtras.Key@", Integer.toString(iHashCode, 16), "<", rc11.a.b(sck1.class).r(), ">");
            default:
                return super.toString();
        }
    }

    public ktv0 w(y570 y570Var) {
        ld70 ld70Var;
        z6x z6xVar;
        String str;
        int i;
        int i2 = u890.j(y570Var.h().a(), "premiumPage:wtsOfferCardV2") ? 2 : 3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (y570 y570Var2 : y570Var.s()) {
            linkedHashMap.put(y570Var2.h().a(), y570Var2);
        }
        String strU = u("premiumPage:wtsOfferHighlight", linkedHashMap);
        String strU2 = u("premiumPage:wtsOfferTitlePricePeriod", linkedHashMap);
        y570 y570Var3 = (y570) linkedHashMap.get("premiumPage:wtsOfferTitlePricePeriod");
        String str2 = y570Var3 == null ? null : y570Var3.n().a.b;
        y570 y570Var4 = (y570) linkedHashMap.get("premiumPage:wtsOfferTitlePricePeriod");
        String str3 = y570Var4 == null ? null : y570Var4.n().a.c;
        y570 y570Var5 = (y570) linkedHashMap.get("premiumPage:wtsOfferTitlePricePeriod");
        String str4 = y570Var5 == null ? null : y570Var5.n().a.d;
        y570 y570Var6 = (y570) linkedHashMap.get("premiumPage:wtsOfferTitlePricePeriod");
        String str5 = (y570Var6 == null || (ld70Var = y570Var6.k().a.c) == null) ? null : ld70Var.a.c;
        String strU3 = u("premiumPage:wtsOfferAdditionalPricePeriod", linkedHashMap);
        y570 y570Var7 = (y570) linkedHashMap.get("premiumPage:wtsOfferDescription");
        z6x z6xVar2 = z6x.a;
        if (y570Var7 == null) {
            z6xVar = z6xVar2;
        } else {
            HubsImmutableComponentBundle[] hubsImmutableComponentBundleArrH = y570Var7.g().h("items");
            z6x z6xVarQ0 = hubsImmutableComponentBundleArrH != null ? f46.Q0(hubsImmutableComponentBundleArrH) : null;
            if (z6xVarQ0 != null) {
                z6xVar2 = z6xVarQ0;
            }
            Iterable<HubsImmutableComponentBundle> iterable = (Iterable) z6xVar2;
            z6x arrayList = new ArrayList(q7h.U(iterable, 10));
            for (HubsImmutableComponentBundle hubsImmutableComponentBundle : iterable) {
                String strB = hubsImmutableComponentBundle.B("text");
                String strB2 = hubsImmutableComponentBundle.B("icon");
                String str6 = strU3;
                String strB3 = hubsImmutableComponentBundle.B("color");
                int i3 = i2;
                String strB4 = hubsImmutableComponentBundle.B("state");
                if (strB4 != null) {
                    int iHashCode = strB4.hashCode();
                    str = strU;
                    if (iHashCode != -1808450477) {
                        if (iHashCode == 0) {
                            strB4.equals("");
                        } else if (iHashCode == 104264043 && strB4.equals("muted")) {
                            i = 2;
                        }
                    } else if (strB4.equals("highlighted")) {
                        i = 1;
                    }
                    arrayList.add(new anp0(strB, strB2, i, strB3));
                    strU3 = str6;
                    i2 = i3;
                    strU = str;
                } else {
                    str = strU;
                }
                i = 0;
                arrayList.add(new anp0(strB, strB2, i, strB3));
                strU3 = str6;
                i2 = i3;
                strU = str;
            }
            z6xVar = arrayList;
        }
        return new ktv0(i2, strU, strU2, str2, str3, strU3, str4, str5, z6xVar, u("premiumPage:wtsOfferFootnote", linkedHashMap), y570Var.g().B("colorset"), y570Var.g().B("backgroundColorSet"), x("premiumPage:wtsOfferCta", linkedHashMap), x("premiumPage:wtsOfferSecondaryCta", linkedHashMap), fjb.l(y570Var));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    public htv0 x(String str, LinkedHashMap linkedHashMap) {
        String strB;
        String strB2;
        String strB3;
        String strF;
        y570 y570Var;
        String str2;
        qp20 qp20Var;
        y570 y570Var2 = (y570) linkedHashMap.get(str);
        if (y570Var2 == null) {
            return null;
        }
        String str3 = y570Var2.n().a.a;
        doc docVarF = a0b.f(y570Var2);
        sc70 sc70Var = (j570) y570Var2.j().get("click");
        int i = 0;
        boolean zB = sc70Var != null ? sc70Var.b.c.b("renderAsPrimaryCTA", false) : false;
        HubsImmutableComponentBundle hubsImmutableComponentBundleG = sc70Var != null ? sc70Var.b.c.g("flavorPageViewModel") : null;
        if (hubsImmutableComponentBundleG == null || (strB = hubsImmutableComponentBundleG.B("planName")) == null || (strB2 = hubsImmutableComponentBundleG.B("benefit")) == null || (strB3 = hubsImmutableComponentBundleG.B("tagLine")) == null) {
            y570Var = y570Var2;
            qp20Var = null;
            str2 = str3;
        } else {
            String strB4 = hubsImmutableComponentBundleG.B("inviteExplanation");
            String strB5 = hubsImmutableComponentBundleG.B("legalText");
            String strB6 = hubsImmutableComponentBundleG.B("ctaText");
            HubsImmutableComponentBundle[] hubsImmutableComponentBundleArrH = hubsImmutableComponentBundleG.h("planDetailViewModels");
            if (hubsImmutableComponentBundleArrH == null) {
                y570Var = y570Var2;
                qp20Var = null;
                str2 = str3;
            } else {
                ArrayList arrayList = new ArrayList();
                if (hubsImmutableComponentBundleArrH.length != 0) {
                    ArrayList arrayList2 = new ArrayList(hubsImmutableComponentBundleArrH.length);
                    int length = hubsImmutableComponentBundleArrH.length;
                    int i2 = 0;
                    while (i < length) {
                        HubsImmutableComponentBundle hubsImmutableComponentBundle = hubsImmutableComponentBundleArrH[i];
                        int i3 = i2 + 1;
                        y570 y570Var3 = y570Var2;
                        HubsImmutableComponentBundle[] hubsImmutableComponentBundleArr = hubsImmutableComponentBundleArrH;
                        String strF2 = hubsImmutableComponentBundle.F("offerDuration", "");
                        int i4 = i;
                        String strF3 = hubsImmutableComponentBundle.F("offerPrice", "");
                        String str4 = str3;
                        String strB7 = hubsImmutableComponentBundle.B("paymentMethodText");
                        String strB8 = hubsImmutableComponentBundle.B("fullPriceComparison");
                        String strB9 = hubsImmutableComponentBundle.B("offerDescriptionText");
                        String strB10 = hubsImmutableComponentBundle.B("offerSavingsBadge");
                        String strF4 = hubsImmutableComponentBundle.F("checkoutUrl", "");
                        if (strB7 == null) {
                            strF = f4i1.f(strF2, " • ", strF3);
                        }
                        if (strB8 == null) {
                            strF = strB7;
                            strB8 = strB9;
                        } else {
                            strF = strB7;
                        }
                        arrayList2.add(Boolean.valueOf(arrayList.add(new s7t0(i2, strB10, strF4, strF, strB8, hubsImmutableComponentBundle.B("discountBadgeText")))));
                        i = i4 + 1;
                        y570Var2 = y570Var3;
                        hubsImmutableComponentBundleArrH = hubsImmutableComponentBundleArr;
                        i2 = i3;
                        str3 = str4;
                    }
                }
                y570Var = y570Var2;
                str2 = str3;
                qp20Var = new qp20(strB, strB2, strB3, strB4, strB5, arrayList, strB6);
            }
        }
        return new htv0(str2, docVarF, zB, qp20Var, fjb.l(y570Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y(iud iudVar, wh71 wh71Var, onm onmVar) {
        awy awyVar;
        if (onmVar instanceof awy) {
            awyVar = (awy) onmVar;
            int i = awyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                awyVar.c = i - Integer.MIN_VALUE;
            } else {
                awyVar = new awy(this, onmVar);
            }
        } else {
            awyVar = new awy(this, onmVar);
        }
        Object obj = awyVar.a;
        int i2 = awyVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return null;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (iudVar instanceof aud) {
            return new qwy(((aud) iudVar).a);
        }
        if (iudVar instanceof ztd) {
            ztd ztdVar = (ztd) iudVar;
            dlw0 dlw0Var = new dlw0(ztdVar.b, ztdVar.c);
            awyVar.c = 1;
            Object objA = wh71Var.a(dlw0Var, awyVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else if (iudVar instanceof dud) {
            a9d1 a9d1Var = ((dud) iudVar).a;
            if (a9d1Var instanceof a9d1) {
                return new rwy(a9d1Var.a);
            }
            if (a9d1Var instanceof bd90) {
                return new lwy(((bd90) a9d1Var).a);
            }
        }
        return null;
    }

    public qx81 z(qx81 qx81Var, zsc zscVar, int i) {
        h0h1 h0h1VarT0 = qx81Var.t0();
        List listR0 = qx81Var.r0();
        ArrayList arrayList = new ArrayList(q7h.U(listR0, 10));
        int i2 = 0;
        for (Object obj : listR0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            e1h1 e1h1Var = (e1h1) obj;
            e1h1 e1h1VarR = r(e1h1Var, zscVar, (y0h1) h0h1VarT0.getParameters().get(i2), i + 1);
            if (!e1h1VarR.c()) {
                e1h1VarR = new f1h1(e1h1VarR.a(), o1h1.h(e1h1VarR.b(), e1h1Var.b().u0()));
            }
            arrayList.add(e1h1VarR);
            i2 = i3;
        }
        return jzn1.z(qx81Var, arrayList, (e0h1) null, 2);
    }

    public /* synthetic */ sjb(byte b) {
        this.a = b;
    }

    public sjb(a0b a0bVar, t2b t2bVar, fjb fjbVar) {
        this.a = (byte) 20;
    }

    public void unregister() {
    }

    public void j(long j) {
    }
}
