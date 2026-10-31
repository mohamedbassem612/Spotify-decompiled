package p;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookException;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q3c implements cee, a2i, tmn0, BiFunction, mdo0, b8b0, Function, hj71 {
    public /* synthetic */ q3c() {
    }

    public static boolean B(Uri uri, String str) {
        return uri != null && uri.getPathSegments() != null && uri.getPathSegments().size() > 0 && u890.j(uri.getPathSegments().get(0), str);
    }

    public static boolean C() {
        ne neVar;
        n3c n3cVarH = n3c.h();
        if (n3cVarH == null || (neVar = n3cVarH.b) == null) {
            return false;
        }
        return neVar.v("bnc_instant_deep_linking_enabled");
    }

    public static JSONObject E() {
        ne neVar;
        ne neVar2;
        ne neVar3;
        ne neVar4;
        try {
            JSONObject jSONObject = new JSONObject();
            n3c n3cVarH = n3c.h();
            boolean zV = false;
            jSONObject.put("expectDelayedSessionInitialization", (n3cVarH == null || (neVar4 = n3cVarH.b) == null) ? false : neVar4.v("bnc_delayed_session_init_used"));
            jSONObject.put("testMode", cwl1.a);
            jSONObject.put("instantDeepLinkingEnabled", C());
            n3c n3cVarH2 = n3c.h();
            if (n3cVarH2 != null && (neVar3 = n3cVarH2.b) != null) {
                zV = neVar3.v("bnc_defer_init_for_plugin_runtime");
            }
            jSONObject.put("deferInitForPluginRuntime", zV);
            n3c n3cVarH3 = n3c.h();
            String strF = null;
            String strF2 = (n3cVarH3 == null || (neVar2 = n3cVarH3.b) == null) ? null : neVar2.F("bnc_branch_key_source");
            String str = "unknown";
            if (strF2 == null) {
                strF2 = "unknown";
            }
            jSONObject.put("branch_key_source", strF2);
            n3c n3cVarH4 = n3c.h();
            if (n3cVarH4 != null && (neVar = n3cVarH4.b) != null) {
                strF = neVar.F("bnc_branch_key_source");
            }
            if (strF != null) {
                str = strF;
            }
            jSONObject.put("branch_key_fallback_used", str.equals("branchKey"));
            return jSONObject;
        } catch (NullPointerException e) {
            i1k0.C("Error serializing configuration - null reference: " + e.getMessage());
            return new JSONObject();
        } catch (JSONException e2) {
            i1k0.C("Error serializing configuration - JSON error: " + e2.getMessage());
            return new JSONObject();
        } catch (Exception e3) {
            i1k0.C("Error serializing configuration - unexpected error: " + e3.getMessage());
            return new JSONObject();
        }
    }

    public static void F() {
        n3c n3cVarH = n3c.h();
        if (n3cVarH != null) {
            ((SharedPreferences.Editor) n3cVarH.b.b).putBoolean("bnc_delayed_session_init_used", true).apply();
        }
    }

    public static final void q(kj41 kj41Var, mwt0 mwt0Var) {
        Set set = e2u0.f;
        Map attributes = kj41Var.getAttributes();
        v(attributes, kj41Var, "playback.id", mwt0Var.a);
        v(attributes, kj41Var, "ubi.interaction_id", mwt0Var.b);
        v(attributes, kj41Var, "playback.context_uri", mwt0Var.c);
        v(attributes, kj41Var, "playback.clip_uri", mwt0Var.d);
        v(attributes, kj41Var, "page.origin.id", mwt0Var.e);
        v(attributes, kj41Var, "page.origin.uri", mwt0Var.f);
        v(attributes, kj41Var, "page.destination.uri", mwt0Var.g);
        v(attributes, kj41Var, "ubi.action", mwt0Var.h);
        v(attributes, kj41Var, "ubi.interaction_type", mwt0Var.i);
        v(attributes, kj41Var, "ubi.element.leaf_specification_id", mwt0Var.j);
        v(attributes, kj41Var, "ubi.element.absolute_path", mwt0Var.k);
        v(attributes, kj41Var, "playback.context_type", mwt0Var.l);
        v(attributes, kj41Var, "playback.content_type", mwt0Var.m);
        v(attributes, kj41Var, "playback.audio_format", mwt0Var.n);
        v(attributes, kj41Var, "playback.video_format", mwt0Var.o);
        v(attributes, kj41Var, "playback.stack", mwt0Var.p);
        v(attributes, kj41Var, "playback.video_surface", mwt0Var.q);
        v(attributes, kj41Var, "app.state", mwt0Var.r);
    }

    public static final bma1 r(int i) {
        bma1 bma1Var = rgc0.f;
        return bma1.b.k("limited_experience_indicator_last_enter_announcement_" + i);
    }

    public static final bma1 s(int i) {
        bma1 bma1Var = rgc0.f;
        return bma1.b.k("limited_experience_indicator_last_exit_announcement_" + i);
    }

    public static final int t(kj41 kj41Var, mwt0 mwt0Var) {
        CharSequence charSequence;
        Set set = e2u0.f;
        Map attributes = kj41Var.getAttributes();
        List listM = p7h.M(new mmr0[]{new mmr0("playback.id", mwt0Var.a), new mmr0("ubi.interaction_id", mwt0Var.b), new mmr0("playback.context_uri", mwt0Var.c), new mmr0("playback.clip_uri", mwt0Var.d)});
        ArrayList<mmr0> arrayList = new ArrayList();
        for (Object obj : listM) {
            mmr0 mmr0Var = (mmr0) obj;
            String str = (String) mmr0Var.a;
            String str2 = (String) mmr0Var.b;
            if (str2 != null && str2.length() != 0 && (charSequence = (CharSequence) attributes.get(str)) != null && charSequence.length() != 0) {
                arrayList.add(obj);
            }
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (mmr0 mmr0Var2 : arrayList) {
            String str3 = (String) mmr0Var2.a;
            if (!u890.j(attributes.get(str3), (String) mmr0Var2.b)) {
                z2 = true;
            } else if (e2u0.f.contains(str3)) {
                z = true;
            }
            z3 = true;
        }
        if (!z) {
            if (z2) {
                return 2;
            }
            if (!z3) {
                return 3;
            }
        }
        return 1;
    }

    public static final void u(kj41 kj41Var, mwt0 mwt0Var) {
        CharSequence charSequence;
        Set set = e2u0.f;
        Map attributes = kj41Var.getAttributes();
        List listM = p7h.M(new mmr0[]{new mmr0("playback.context_uri", mwt0Var.c), new mmr0("playback.clip_uri", mwt0Var.d)});
        ArrayList<mmr0> arrayList = new ArrayList();
        for (Object obj : listM) {
            mmr0 mmr0Var = (mmr0) obj;
            String str = (String) mmr0Var.a;
            String str2 = (String) mmr0Var.b;
            if (str2 != null && str2.length() != 0 && (charSequence = (CharSequence) attributes.get(str)) != null && charSequence.length() != 0) {
                arrayList.add(obj);
            }
        }
        for (mmr0 mmr0Var2 : arrayList) {
            String str3 = (String) mmr0Var2.a;
            if (!u890.j(attributes.get(str3), (String) mmr0Var2.b)) {
                kj41Var.setAttribute(str3, "");
            }
        }
    }

    public static final void v(Map map, kj41 kj41Var, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        CharSequence charSequence = (CharSequence) map.get(str);
        if (charSequence == null || charSequence.length() == 0) {
            kj41Var.setAttribute(str, str2);
        }
    }

    public static qj71 w(k371 k371Var, List list) {
        quk qukVar;
        ArrayList<String> stringArrayList = k371Var.b.getStringArrayList("watchfeed.share.destination_ids");
        if (stringArrayList != null) {
            idd1 idd1Var = o571.c;
            List listI = jyo1.i();
            int iS = zno1.s(q7h.U(listI, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (Object obj : listI) {
                linkedHashMap.put(((o571) obj).a, obj);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = stringArrayList.iterator();
            while (it.hasNext()) {
                o571 o571Var = (o571) linkedHashMap.get((String) it.next());
                if (o571Var != null) {
                    arrayList.add(o571Var);
                }
            }
            qukVar = new quk(new va71(new cmt(arrayList, 3)));
        } else {
            qukVar = puk.d;
        }
        return new qj71(list, 0, qukVar);
    }

    public static lf10 x(JSONObject jSONObject, Object obj) {
        int iOptInt;
        String strOptString;
        String strOptString2;
        boolean zOptBoolean;
        int iOptInt2;
        String str;
        String str2;
        try {
            if (jSONObject.has("code")) {
                int i = jSONObject.getInt("code");
                Object objR = fpi1.r("body", "FACEBOOK_NON_JSON_RESULT", jSONObject);
                if (objR != null && (objR instanceof JSONObject)) {
                    boolean z = true;
                    if (((JSONObject) objR).has("error")) {
                        JSONObject jSONObject2 = (JSONObject) fpi1.r("error", (String) null, (JSONObject) objR);
                        String strOptString3 = jSONObject2 != null ? jSONObject2.optString("type", null) : null;
                        String strOptString4 = jSONObject2 != null ? jSONObject2.optString("message", null) : null;
                        int iOptInt3 = jSONObject2 != null ? jSONObject2.optInt("code", -1) : -1;
                        int iOptInt4 = jSONObject2 != null ? jSONObject2.optInt("error_subcode", -1) : -1;
                        strOptString2 = jSONObject2 != null ? jSONObject2.optString("error_user_msg", null) : null;
                        strOptString = jSONObject2 != null ? jSONObject2.optString("error_user_title", null) : null;
                        zOptBoolean = jSONObject2 != null ? jSONObject2.optBoolean("is_transient", false) : false;
                        iOptInt2 = iOptInt4;
                        str = strOptString3;
                        iOptInt = iOptInt3;
                        str2 = strOptString4;
                    } else if (((JSONObject) objR).has("error_code") || ((JSONObject) objR).has("error_msg") || ((JSONObject) objR).has("error_reason")) {
                        String strOptString5 = ((JSONObject) objR).optString("error_reason", null);
                        String strOptString6 = ((JSONObject) objR).optString("error_msg", null);
                        iOptInt = ((JSONObject) objR).optInt("error_code", -1);
                        strOptString = null;
                        strOptString2 = null;
                        zOptBoolean = false;
                        iOptInt2 = ((JSONObject) objR).optInt("error_subcode", -1);
                        str = strOptString5;
                        str2 = strOptString6;
                    } else {
                        strOptString = null;
                        strOptString2 = null;
                        z = false;
                        zOptBoolean = false;
                        iOptInt2 = -1;
                        iOptInt = -1;
                        str = null;
                        str2 = null;
                    }
                    if (z) {
                        return new lf10(i, iOptInt, iOptInt2, str, str2, strOptString, strOptString2, obj, (FacebookException) null, zOptBoolean);
                    }
                }
                if (i > 299 || 200 > i) {
                    if (jSONObject.has("body")) {
                    }
                    return new lf10(i, -1, -1, (String) null, (String) null, (String) null, (String) null, obj, (FacebookException) null, false);
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static Bundle z(bi90 bi90Var, String str, String str2) {
        Bundle bundle = new Bundle();
        if (bi90Var == null && str == null) {
            hhg1.n("Group categories fragment cannot be instantiated without a category or a valid category key");
            return null;
        }
        if (bi90Var != null) {
            bundle.putParcelable("SELECTED_GROUP_ITEM", bi90Var);
        }
        if (str != null) {
            bundle.putString("SELECTED_GROUP_ITEM_KEY", str);
        }
        if (str2 != null) {
            bundle.putString("SELECTED_GROUP_ITEM_URI", str2);
        }
        return bundle;
    }

    public synchronized uo5 A() {
        c120 c120VarB = g120.b(wf10.b());
        if (c120VarB == null) {
            return uo5.t.s();
        }
        return c120VarB.e;
    }

    public vuv0 D(y570 y570Var) {
        ld70 ld70Var;
        id70 id70VarN = y570Var.n();
        String str = null;
        String str2 = id70VarN != null ? id70VarN.a.a : null;
        id70 id70VarN2 = y570Var.n();
        String str3 = id70VarN2 != null ? id70VarN2.a.b : null;
        id70 id70VarN3 = y570Var.n();
        String str4 = id70VarN3 != null ? id70VarN3.a.d : null;
        dd70 dd70VarK = y570Var.k();
        if (dd70VarK != null && (ld70Var = dd70VarK.a.c) != null) {
            str = ld70Var.a.c;
        }
        return new vuv0(str2, str3, str4, str, fjb.l(y570Var), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (uuv0) null);
    }

    public File a() {
        return null;
    }

    public Object apply(Object obj, Object obj2) {
        return Boolean.valueOf(((ibk0) obj2).b() && z6k0.b((Map) obj));
    }

    public int b() {
        return 8;
    }

    public void c(hmb0 hmb0Var, long j, gk60 gk60Var, int i, boolean z) {
        jdo0 jdo0Var = hmb0Var.e1;
        ndo0 ndo0Var = (ndo0) jdo0Var.e;
        ia4 ia4Var = ndo0.x1;
        ((ndo0) jdo0Var.e).r1(a6o1.o(), ndo0Var.b1(j, true), gk60Var, 1, z);
    }

    public xhn d() {
        return null;
    }

    public File e() {
        return null;
    }

    public boolean f(h0h1 h0h1Var, h0h1 h0h1Var2) {
        return h0h1Var.equals(h0h1Var2);
    }

    public boolean g(hmb0 hmb0Var) {
        o161 o161VarX = hmb0Var.x();
        boolean z = false;
        if (o161VarX != null && o161VarX.d) {
            z = true;
        }
        return !z;
    }

    public File h() {
        return null;
    }

    public File i() {
        return null;
    }

    public File j() {
        return null;
    }

    public boolean k(pim0 pim0Var) {
        return ggo1.H(w0h1.e(oap1.B(pim0Var), false));
    }

    public boolean l(gk60 gk60Var, hmb0 hmb0Var) {
        return false;
    }

    public boolean m(pim0 pim0Var) {
        return false;
    }

    public Object n(k371 k371Var, lnm lnmVar) {
        wa71 wa71Var = k371Var.a;
        Bundle bundle = k371Var.b;
        if (wa71Var != null) {
            String string = bundle.getString("watchfeed.share.background_image_url");
            if (string != null) {
                String string2 = bundle.getString("watchfeed.share.share_format_id");
                String string3 = bundle.getString("watchfeed.share.pre_url_text");
                String string4 = bundle.getString("watchfeed.share.background_content_description");
                f0a f0aVar = new f0a();
                f0aVar.b = wa71Var.a;
                if (string4 == null) {
                    string4 = "";
                }
                f0aVar.h(new jlw0(string, string4));
                f0aVar.X = new pz9(new uz9(string), (String) null, (String) null, 62);
                if (string2 != null) {
                    Set set = s4b1.f;
                    f0aVar.h = new z771(uic.x(string2));
                }
                if (string3 != null) {
                    f0aVar.c = string3;
                }
                return w(k371Var, Collections.singletonList(f0aVar.p()));
            }
            String string5 = bundle.getString("watchfeed.share.share_format_id");
            if (string5 != null) {
                String string6 = bundle.getString("watchfeed.share.preview_entity_uri");
                boolean z = bundle.getBoolean("watchfeed.share.tool_config_enabled", false);
                n1f1 n1f1Var = new n1f1(true);
                tyo1.p(blc0.mg, new String[0]);
                rhy rhyVar = new rhy((yny) null, 63);
                dz61 dz61Var = dz61.d;
                Set set2 = s4b1.f;
                z771 z771Var = new z771(uic.x(string5));
                String str = string6 != null ? string6 : null;
                if (z) {
                    n1f1Var = new n1f1(true);
                }
                return w(k371Var, Collections.singletonList(new u771(new t771(wa71Var, z771Var), new pz61(new y171(rc11.a.b(zwy.class)), new exy(str, n1f1Var, 0, false, rhyVar, (bwe1) null, (cuu0) null), dz61Var, true), new bj71(w7x.a, true, (String) null))));
            }
        }
        return null;
    }

    public af5 o(km61 km61Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-278544108);
        j2i j2iVar = w9j.a;
        ye5 ye5Var = new ye5();
        j2iVar.J(ye5Var, km61Var, x340Var, 8);
        af5 af5VarP = ye5Var.p();
        x340Var.r(false);
        return af5VarP;
    }

    public File p() {
        return null;
    }

    public p9k y() {
        return new p9k();
    }

    public /* synthetic */ q3c(Object obj) {
    }

    public q3c(daq daqVar, teq teqVar) {
    }

    public Object apply(Object obj) {
        return Observable.just(b7x.a).map(a2x0.d).onErrorReturn(e2x0.d);
    }
}
