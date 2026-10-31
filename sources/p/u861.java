package p;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.URLUtil;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class u861 {
    public static final int[] h = {3, 4, 5, 6, 7};
    public final long a;
    public final String b;
    public JSONObject c;
    public final int d;
    public final ne e;
    public final Context f;
    public final HashSet g;

    public u861(Context context, int i) {
        JSONObject jSONObject = new JSONObject();
        this.a = 0L;
        i1k0.B("ServerRequest constructor");
        this.f = context;
        this.d = i;
        this.c = jSONObject;
        this.e = ne.z(context);
        this.g = new HashSet();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.a = jCurrentTimeMillis;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("-yyyyMMddHH", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        this.b = UUID.randomUUID().toString() + simpleDateFormat.format(Long.valueOf(jCurrentTimeMillis));
    }

    public void a() {
        String str;
        boolean zV;
        i1k0.B("doFinalUpdateOnBackgroundThread");
        if (this instanceof v861) {
            v861 v861Var = (v861) this;
            StringBuilder sb = new StringBuilder("updateLinkReferrerParams retrieved ");
            ne neVar = v861Var.e;
            sb.append(neVar.F("bnc_link_click_identifier"));
            i1k0.B(sb.toString());
            if (neVar.F("bnc_link_click_identifier") == null || TextUtils.isEmpty(neVar.F("bnc_link_click_identifier").trim())) {
                i1k0.B("linkIdentifier is null or empty, resetting to bnc_no_value");
                neVar.V("bnc_no_value");
                neVar.U("bnc_no_value");
            }
            String strF = neVar.F("bnc_link_click_identifier");
            if (!strF.equals("bnc_no_value")) {
                try {
                    JSONObject jSONObject = v861Var.c;
                    f4t f4tVar = f4t.RandomizedBundleToken;
                    jSONObject.put("link_identifier", strF);
                } catch (JSONException e) {
                    l1d.A(e, new StringBuilder("Caught JSONException "));
                }
            }
            String strF2 = neVar.F("bnc_google_search_install_identifier");
            if (!strF2.equals("bnc_no_value")) {
                try {
                    JSONObject jSONObject2 = v861Var.c;
                    f4t f4tVar2 = f4t.RandomizedBundleToken;
                    jSONObject2.put("google_search_install_referrer", strF2);
                } catch (JSONException e2) {
                    l1d.A(e2, new StringBuilder("Caught JSONException "));
                }
            }
            String strF3 = neVar.F("bnc_google_play_install_referrer_extras");
            if (!strF3.equals("bnc_no_value")) {
                try {
                    JSONObject jSONObject3 = v861Var.c;
                    f4t f4tVar3 = f4t.RandomizedBundleToken;
                    jSONObject3.put("install_referrer_extras", strF3);
                } catch (JSONException e3) {
                    l1d.A(e3, new StringBuilder("Caught JSONException "));
                }
            }
            String strF4 = neVar.F("bnc_app_store_source");
            if (!"bnc_no_value".equals(strF4)) {
                try {
                    f4t f4tVar4 = f4t.RandomizedBundleToken;
                    boolean zEquals = strF4.equals("Meta");
                    JSONObject jSONObject4 = v861Var.c;
                    if (zEquals) {
                        jSONObject4.put("app_store", "PlayStore");
                        v861Var.c.put("is_meta_ct", neVar.v("bnc_is_meta_clickthrough"));
                    } else {
                        jSONObject4.put("app_store", strF4);
                    }
                } catch (JSONException e4) {
                    l1d.A(e4, new StringBuilder("Caught JSONException "));
                }
            }
            if (neVar.v("bnc_is_full_app_conversion")) {
                try {
                    JSONObject jSONObject5 = v861Var.c;
                    f4t f4tVar5 = f4t.RandomizedBundleToken;
                    jSONObject5.put("android_app_link_url", neVar.F("bnc_app_link"));
                    v861Var.c.put("is_full_app_conversion", true);
                } catch (JSONException e5) {
                    l1d.A(e5, new StringBuilder("Caught JSONException "));
                }
            }
            JSONObject jSONObject6 = this.c;
            if (n3c.s) {
                f4t f4tVar6 = f4t.RandomizedBundleToken;
                if (jSONObject6.has("link_identifier")) {
                    JSONObject jSONObject7 = this.c;
                    jSONObject7.remove(eqq.d(2));
                    jSONObject7.remove(eqq.d(1));
                    jSONObject7.remove("install_referrer_extras");
                }
            }
        }
        int iC = c();
        ne neVar2 = this.e;
        if (iC == 3) {
            JSONObject jSONObject8 = this.c;
            f4t f4tVar7 = f4t.RandomizedBundleToken;
            JSONObject jSONObjectOptJSONObject = jSONObject8.optJSONObject("user_data");
            if (jSONObjectOptJSONObject != null) {
                try {
                    jSONObjectOptJSONObject.put("developer_identity", neVar2.F("bnc_identity"));
                    jSONObjectOptJSONObject.put("randomized_device_token", neVar2.C());
                } catch (JSONException e6) {
                    l1d.A(e6, new StringBuilder("Caught JSONException "));
                }
            }
        }
        int iC2 = c();
        JSONObject jSONObjectOptJSONObject2 = this.c;
        if (iC2 != 1) {
            f4t f4tVar8 = f4t.RandomizedBundleToken;
            jSONObjectOptJSONObject2 = jSONObjectOptJSONObject2.optJSONObject("user_data");
        }
        if (jSONObjectOptJSONObject2 != null && (zV = neVar2.v("bnc_ad_network_callouts_disabled"))) {
            try {
                f4t f4tVar9 = f4t.RandomizedBundleToken;
                jSONObjectOptJSONObject2.putOpt("disable_ad_network_callouts", Boolean.valueOf(zV));
            } catch (JSONException e7) {
                l1d.A(e7, new StringBuilder("Caught JSONException "));
            }
        }
        int iC3 = c();
        int iN = ((tqt) rm5.t().a).n();
        String strC = ((tqt) rm5.t().a).c();
        if (!TextUtils.isEmpty(strC) && (neVar2.x() == 1 || !((SharedPreferences) neVar2.a).contains("bnc_consumer_protection_attribution_level"))) {
            try {
                if (tqt.A()) {
                    f4t f4tVar10 = f4t.RandomizedBundleToken;
                    str = "fire_ad_id";
                } else if (tqt.B(n3c.h().d)) {
                    f4t f4tVar11 = f4t.RandomizedBundleToken;
                    str = "oaid";
                } else {
                    f4t f4tVar12 = f4t.RandomizedBundleToken;
                    str = "aaid";
                }
                this.c.put("advertising_ids", new JSONObject().put(str, strC));
            } catch (JSONException e8) {
                l1d.A(e8, new StringBuilder("Caught JSONException "));
            }
            try {
                med1 med1VarY = tqt.y((Context) rm5.t().b);
                String str2 = med1VarY.a;
                JSONObject jSONObject9 = this.c;
                f4t f4tVar13 = f4t.RandomizedBundleToken;
                jSONObject9.put("hardware_id", str2);
                this.c.put("is_hardware_id_real", med1VarY.b);
                if (this.c.has("user_data")) {
                    JSONObject jSONObject10 = this.c.getJSONObject("user_data");
                    if (jSONObject10.has("android_id")) {
                        jSONObject10.put("android_id", str2);
                    }
                }
            } catch (JSONException e9) {
                l1d.A(e9, new StringBuilder("Caught JSONException "));
            }
        }
        JSONObject jSONObject11 = this.c;
        Context context = this.f;
        try {
            if (iC3 == 1) {
                f4t f4tVar14 = f4t.RandomizedBundleToken;
                jSONObject11.put("lat_val", iN);
                if (TextUtils.isEmpty(strC)) {
                    JSONObject jSONObject12 = this.c;
                    if ((jSONObject12.has("android_id") || jSONObject12.has("randomized_device_token")) || this.c.optBoolean("unidentified_device")) {
                        return;
                    }
                    this.c.put("unidentified_device", true);
                    return;
                }
                if (!tqt.B(context) && (neVar2.x() == 1 || !((SharedPreferences) neVar2.a).contains("bnc_consumer_protection_attribution_level"))) {
                    this.c.put("google_advertising_id", strC);
                }
                this.c.remove("unidentified_device");
                return;
            }
            f4t f4tVar15 = f4t.RandomizedBundleToken;
            JSONObject jSONObjectOptJSONObject3 = jSONObject11.optJSONObject("user_data");
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject3.put("limit_ad_tracking", iN);
                if (TextUtils.isEmpty(strC)) {
                    if ((jSONObjectOptJSONObject3.has("android_id") || jSONObjectOptJSONObject3.has("randomized_device_token")) || jSONObjectOptJSONObject3.optBoolean("unidentified_device")) {
                        return;
                    }
                    jSONObjectOptJSONObject3.put("unidentified_device", true);
                    return;
                }
                if (!tqt.B(context) && (neVar2.x() == 1 || !((SharedPreferences) neVar2.a).contains("bnc_consumer_protection_attribution_level"))) {
                    jSONObjectOptJSONObject3.put("aaid", strC);
                }
                jSONObjectOptJSONObject3.remove("unidentified_device");
            }
        } catch (JSONException e10) {
            l1d.A(e10, new StringBuilder("Caught JSONException "));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r11v0, types: [p.u861] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [p.u861] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0166 -> B:72:0x016d). Please report as a decompilation issue!!! */
    public void b() {
        boolean zV;
        i1k0.B("doFinalUpdateOnMainThread");
        ne neVar = this.e;
        try {
            JSONObject jSONObject = new JSONObject();
            Iterator<String> itKeys = ((JSONObject) neVar.c).keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, ((JSONObject) neVar.c).get(next));
            }
            JSONObject jSONObject2 = this.c;
            f4t f4tVar = f4t.RandomizedBundleToken;
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("metadata");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    jSONObject.put(next2, jSONObjectOptJSONObject.get(next2));
                }
            }
            if (this instanceof z861) {
                JSONObject jSONObject3 = (JSONObject) neVar.d;
                if (jSONObject3.length() > 0) {
                    Iterator<String> itKeys3 = jSONObject3.keys();
                    while (itKeys3.hasNext()) {
                        String next3 = itKeys3.next();
                        this.c.putOpt(next3, jSONObject3.get(next3));
                    }
                }
            }
            JSONObject jSONObject4 = this.c;
            f4t f4tVar2 = f4t.RandomizedBundleToken;
            jSONObject4.put("metadata", jSONObject);
        } catch (JSONException e) {
            l1d.A(e, new StringBuilder("Caught JSONException. Could not merge metadata, ignoring user metadata. "));
        }
        if (l()) {
            int iC = c();
            JSONObject jSONObjectOptJSONObject2 = this.c;
            if (iC != 1) {
                f4t f4tVar3 = f4t.RandomizedBundleToken;
                jSONObjectOptJSONObject2 = jSONObjectOptJSONObject2.optJSONObject("user_data");
            }
            if (jSONObjectOptJSONObject2 != null && (zV = neVar.v("bnc_limit_facebook_tracking"))) {
                try {
                    f4t f4tVar4 = f4t.RandomizedBundleToken;
                    jSONObjectOptJSONObject2.putOpt("limit_facebook_tracking", Boolean.valueOf(zV));
                } catch (JSONException e2) {
                    l1d.A(e2, new StringBuilder("Caught JSONException "));
                }
            }
        }
        if (k() && ((SharedPreferences) neVar.a).contains("bnc_dma_eea")) {
            try {
                int iC2 = c();
                JSONObject jSONObject5 = this.c;
                if (iC2 == 1) {
                    f4t f4tVar5 = f4t.RandomizedBundleToken;
                    jSONObject5.put("dma_eea", neVar.v("bnc_dma_eea"));
                    this.c.put("dma_ad_personalization", neVar.v("bnc_dma_ad_personalization"));
                    this.c.put("dma_ad_user_data", neVar.v("bnc_dma_ad_user_data"));
                } else {
                    f4t f4tVar6 = f4t.RandomizedBundleToken;
                    JSONObject jSONObjectOptJSONObject3 = jSONObject5.optJSONObject("user_data");
                    if (jSONObjectOptJSONObject3 != null) {
                        jSONObjectOptJSONObject3.put("dma_eea", neVar.v("bnc_dma_eea"));
                        jSONObjectOptJSONObject3.put("dma_ad_personalization", neVar.v("bnc_dma_ad_personalization"));
                        jSONObjectOptJSONObject3.put("dma_ad_user_data", neVar.v("bnc_dma_ad_user_data"));
                    }
                }
            } catch (JSONException e3) {
                i1k0.m(e3.getMessage());
            }
        }
        ?? r11 = this;
        if (((SharedPreferences) neVar.a).contains("bnc_consumer_protection_attribution_level")) {
            try {
                int iC3 = c();
                JSONObject jSONObject6 = this.c;
                if (iC3 == 1) {
                    f4t f4tVar7 = f4t.RandomizedBundleToken;
                    jSONObject6.put("cpp_level", gvg.D(neVar.x()));
                    this = this;
                } else {
                    f4t f4tVar8 = f4t.RandomizedBundleToken;
                    JSONObject jSONObjectOptJSONObject4 = jSONObject6.optJSONObject("user_data");
                    if (jSONObjectOptJSONObject4 != null) {
                        this = this;
                        jSONObjectOptJSONObject4.put("cpp_level", gvg.D(neVar.x()));
                        this = this;
                    }
                }
            } catch (JSONException e4) {
                i1k0.m(e4.getMessage());
                r11 = this;
            }
        }
        try {
            this = this;
            JSONObject jSONObject7 = r11.c;
            f4t f4tVar9 = f4t.RandomizedBundleToken;
            jSONObject7.put("branch_sdk_request_timestamp", r11.a);
            ?? r0 = r11.c;
            this = r11.b;
            r0.put("branch_sdk_request_unique_id", this);
        } catch (JSONException e5) {
            eg.j(e5);
        }
    }

    public int c() {
        return 1;
    }

    public final JSONObject d(ConcurrentHashMap concurrentHashMap) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                JSONObject jSONObject2 = new JSONObject(this.c.toString());
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
                if (concurrentHashMap.size() <= 0) {
                    return jSONObject;
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    for (String str : concurrentHashMap.keySet()) {
                        jSONObject3.put(str, concurrentHashMap.get(str));
                        concurrentHashMap.remove(str);
                    }
                    f4t f4tVar = f4t.RandomizedBundleToken;
                    jSONObject.put("instrumentation", jSONObject3);
                    return jSONObject;
                } catch (JSONException e) {
                    i1k0.C("Caught JSONException " + e.getMessage());
                    return jSONObject;
                }
            } catch (JSONException e2) {
                i1k0.m(e2.getMessage());
                return jSONObject;
            }
        } catch (ConcurrentModificationException unused) {
            return this.c;
        } catch (Exception e3) {
            i1k0.B("ServerRequest " + this + " getPostWithInstrumentationValues caught exception: " + e3.getMessage());
            return jSONObject;
        }
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        this.e.getClass();
        sb.append(URLUtil.isHttpsUrl(ne.i) ? ne.i : "https://api2.branch.io/");
        sb.append(eqq.f(this.d));
        return sb.toString();
    }

    public void g() {
        ne neVar = this.e;
        i1k0.B("onPreExecute " + this);
        if ((this instanceof a961) || (this instanceof s3c)) {
            try {
                k811 k811Var = new k811(neVar);
                k811Var.y(neVar.F("bnc_external_intent_uri"));
                if (neVar.x() == 1 || !((SharedPreferences) neVar.a).contains("bnc_consumer_protection_attribution_level")) {
                    JSONObject jSONObjectM = k811Var.m(this);
                    Iterator<String> itKeys = jSONObjectM.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        this.c.put(next, jSONObjectM.get(next));
                    }
                }
            } catch (Exception e) {
                i1k0.n("Caught exception in onPreExecute: " + e.getMessage() + " stacktrace " + i1k0.x(e));
            }
        }
    }

    public boolean i() {
        return this instanceof oaz0;
    }

    public void j(JSONObject jSONObject) {
        u861 u861Var;
        boolean z;
        boolean z2;
        i1k0.B("setPost " + jSONObject);
        this.c = jSONObject;
        int iC = c();
        int i = this.d;
        int[] iArr = h;
        if (iC == 1) {
            rm5 rm5VarT = rm5.t();
            JSONObject jSONObject2 = this.c;
            Context context = (Context) rm5VarT.b;
            try {
                med1 med1VarY = tqt.y(context);
                String str = med1VarY.a;
                if (!rm5.v(str)) {
                    f4t f4tVar = f4t.RandomizedBundleToken;
                    jSONObject2.put("hardware_id", str);
                    jSONObject2.put("is_hardware_id_real", med1VarY.b);
                }
                String strE = tqt.e(context);
                if (!rm5.v(strE)) {
                    f4t f4tVar2 = f4t.RandomizedBundleToken;
                    jSONObject2.put("anon_id", strE);
                }
                tqt.u();
                String str2 = Build.MANUFACTURER;
                if (!rm5.v(str2)) {
                    f4t f4tVar3 = f4t.RandomizedBundleToken;
                    jSONObject2.put("brand", str2);
                }
                tqt.v();
                String str3 = Build.MODEL;
                if (!rm5.v(str3)) {
                    f4t f4tVar4 = f4t.RandomizedBundleToken;
                    jSONObject2.put("model", str3);
                }
                DisplayMetrics displayMetricsW = tqt.w(context);
                f4t f4tVar5 = f4t.RandomizedBundleToken;
                jSONObject2.put("screen_dpi", displayMetricsW.densityDpi);
                jSONObject2.put("screen_height", displayMetricsW.heightPixels);
                jSONObject2.put("screen_width", displayMetricsW.widthPixels);
                jSONObject2.put("wifi", tqt.z(context));
                jSONObject2.put("ui_mode", tqt.x(context));
                String strR = tqt.r(context);
                if (!rm5.v(strR)) {
                    jSONObject2.put("os", strR);
                }
                jSONObject2.put("os_version", tqt.d());
                String strL = tqt.l();
                if (!TextUtils.isEmpty(strL)) {
                    jSONObject2.put("country", strL);
                }
                String strM = tqt.m();
                if (!TextUtils.isEmpty(strM)) {
                    jSONObject2.put("language", strM);
                }
                String strP = tqt.p();
                if (!TextUtils.isEmpty(strP)) {
                    jSONObject2.put("local_ip", strP);
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= 5) {
                        z2 = false;
                        break;
                    }
                    int i3 = i;
                    if (l1d.d(iArr[i2], i3)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                        i = i3;
                    }
                }
                if (z2) {
                    jSONObject2.put("cpu_type", tqt.g());
                    tqt.j();
                    jSONObject2.put("build", Build.DISPLAY);
                    jSONObject2.put("locale", tqt.q());
                    jSONObject2.put("connection_type", tqt.i(context));
                    jSONObject2.put("device_carrier", tqt.h(context));
                    tqt.s();
                    jSONObject2.put("os_version_android", Build.VERSION.RELEASE);
                }
            } catch (JSONException e) {
                l1d.A(e, new StringBuilder("Caught JSONException"));
            }
            u861Var = this;
        } else {
            JSONObject jSONObject3 = new JSONObject();
            u861Var = this;
            JSONObject jSONObject4 = u861Var.c;
            f4t f4tVar6 = f4t.RandomizedBundleToken;
            int i4 = i;
            jSONObject4.put("user_data", jSONObject3);
            rm5 rm5VarT2 = rm5.t();
            Context context2 = (Context) rm5VarT2.b;
            try {
                String str4 = tqt.y(context2).a;
                if (!rm5.v(str4)) {
                    jSONObject3.put("android_id", str4);
                }
                String strE2 = tqt.e(context2);
                if (!rm5.v(strE2)) {
                    jSONObject3.put("anon_id", strE2);
                }
                tqt.u();
                String str5 = Build.MANUFACTURER;
                if (!rm5.v(str5)) {
                    jSONObject3.put("brand", str5);
                }
                tqt.v();
                String str6 = Build.MODEL;
                if (!rm5.v(str6)) {
                    jSONObject3.put("model", str6);
                }
                DisplayMetrics displayMetricsW2 = tqt.w(context2);
                jSONObject3.put("screen_dpi", displayMetricsW2.densityDpi);
                jSONObject3.put("screen_height", displayMetricsW2.heightPixels);
                jSONObject3.put("screen_width", displayMetricsW2.widthPixels);
                jSONObject3.put("ui_mode", tqt.x(context2));
                String strR2 = tqt.r(context2);
                if (!rm5.v(strR2)) {
                    jSONObject3.put("os", strR2);
                }
                jSONObject3.put("os_version", tqt.d());
                String strL2 = tqt.l();
                if (!TextUtils.isEmpty(strL2)) {
                    jSONObject3.put("country", strL2);
                }
                String strM2 = tqt.m();
                if (!TextUtils.isEmpty(strM2)) {
                    jSONObject3.put("language", strM2);
                }
                String strP2 = tqt.p();
                if (!TextUtils.isEmpty(strP2)) {
                    jSONObject3.put("local_ip", strP2);
                }
                ne neVar = u861Var.e;
                if (neVar != null) {
                    if (!rm5.v(neVar.C())) {
                        jSONObject3.put("randomized_device_token", neVar.C());
                    }
                    String strF = neVar.F("bnc_identity");
                    if (!rm5.v(strF)) {
                        jSONObject3.put("developer_identity", strF);
                    }
                    String strF2 = neVar.F("bnc_app_store_source");
                    if (!"bnc_no_value".equals(strF2)) {
                        jSONObject3.put("app_store", strF2);
                    }
                }
                jSONObject3.put("app_version", tqt.f(context2));
                jSONObject3.put("sdk", "android");
                jSONObject3.put("sdk_version", "5.21.2");
                rm5VarT2.M(jSONObject3);
                int i5 = 0;
                while (true) {
                    if (i5 >= 5) {
                        z = false;
                        break;
                    }
                    int i6 = iArr[i5];
                    int i7 = i4;
                    if (l1d.d(i6, i7)) {
                        z = true;
                        break;
                    } else {
                        i5++;
                        i4 = i7;
                    }
                }
                if (z) {
                    jSONObject3.put("cpu_type", tqt.g());
                    tqt.j();
                    jSONObject3.put("build", Build.DISPLAY);
                    jSONObject3.put("locale", tqt.q());
                    jSONObject3.put("connection_type", tqt.i(context2));
                    jSONObject3.put("device_carrier", tqt.h(context2));
                    tqt.s();
                    jSONObject3.put("os_version_android", Build.VERSION.RELEASE);
                }
            } catch (JSONException e2) {
                l1d.A(e2, new StringBuilder("Caught JSONException"));
            }
        }
        JSONObject jSONObject5 = u861Var.c;
        f4t f4tVar7 = f4t.RandomizedBundleToken;
        jSONObject5.put("debug", false);
    }

    public boolean k() {
        return this instanceof s3c;
    }

    public boolean l() {
        return this instanceof s3c;
    }

    public final void m(JSONObject jSONObject) {
        String str;
        try {
            if (tqt.C((Context) rm5.t().b)) {
                f4t f4tVar = f4t.RandomizedBundleToken;
                str = "FULL_APP";
            } else {
                f4t f4tVar2 = f4t.RandomizedBundleToken;
                str = "INSTANT_APP";
            }
            if (c() != 3) {
                jSONObject.put("environment", str);
                return;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("user_data");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.put("environment", str);
            }
        } catch (Exception e) {
            i1k0.m(e.getMessage());
        }
    }

    public void f(int i, String str) {
    }

    public void h(b961 b961Var, n3c n3cVar) {
    }
}
