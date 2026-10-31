package p;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n3c {
    public static final String o = "!SDK-VERSION-STRING!:io.branch.sdk.android:library:5.21.2";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static String f58p = "";
    public static boolean q = false;
    public static boolean r = false;
    public static boolean s = false;
    public static n3c t = null;
    public static boolean u = false;
    public static final String[] v = {"extra_launch_uri", "branch_intent"};
    public static String w = null;
    public static bb01 x;
    public final le a;
    public final ne b;
    public final rm5 c;
    public final Context d;
    public final q3c e;
    public final y861 f;
    public WeakReference h;
    public o3c j;
    public final b3g1 k;
    public m3c l;
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public int m = 1;
    public int n = 3;
    public boolean i = false;

    public n3c(Context context) {
        this.d = context;
        this.b = ne.z(context);
        b3g1 b3g1Var = new b3g1();
        b3g1Var.a = true;
        b3g1Var.a = ne.z(context).v("bnc_tracking_state");
        this.k = b3g1Var;
        this.a = new le(this);
        this.c = new rm5(context, (byte) 28);
        new ConcurrentHashMap();
        this.e = new q3c();
        y861 y861Var = y861.e;
        if (y861Var == null) {
            synchronized (y861.class) {
                try {
                    y861Var = y861.e;
                    if (y861Var == null) {
                        y861Var = new y861(context);
                        y861.e = y861Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f = y861Var;
    }

    public static boolean b(JSONObject jSONObject, ActivityInfo activityInfo) {
        if (activityInfo.metaData.getString("io.branch.sdk.auto_link_keys") != null) {
            for (String str : activityInfo.metaData.getString("io.branch.sdk.auto_link_keys").split(",")) {
                if (jSONObject.has(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(JSONObject jSONObject, ActivityInfo activityInfo) {
        String string = null;
        try {
            f4t f4tVar = f4t.RandomizedBundleToken;
            if (jSONObject.has("$android_deeplink_path")) {
                string = jSONObject.getString("$android_deeplink_path");
            } else if (jSONObject.has("$deeplink_path")) {
                string = jSONObject.getString("$deeplink_path");
            }
        } catch (JSONException e) {
            i1k0.m(e.getMessage());
        }
        if (activityInfo.metaData.getString("io.branch.sdk.auto_link_path") != null && string != null) {
            for (String str : activityInfo.metaData.getString("io.branch.sdk.auto_link_path").split(",")) {
                String[] strArrSplit = str.trim().split("\\?")[0].split("/");
                String[] strArrSplit2 = string.split("\\?")[0].split("/");
                if (strArrSplit.length == strArrSplit2.length) {
                    for (int i = 0; i < strArrSplit.length && i < strArrSplit2.length; i++) {
                        String str2 = strArrSplit[i];
                        if (str2.equals(strArrSplit2[i]) || str2.contains("*")) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONObject d(String str) {
        if (str.equals("bnc_no_value")) {
            return new JSONObject();
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            try {
                return new JSONObject(new String(l6p1.i(str.getBytes())));
            } catch (JSONException e) {
                e.printStackTrace();
                return new JSONObject();
            }
        }
    }

    public static void e(boolean z) {
        r = z;
        n3c n3cVarH = h();
        if (n3cVarH == null || !z) {
            return;
        }
        n3cVarH.e.getClass();
        q3c.F();
    }

    public static synchronized n3c h() {
        try {
            if (t == null) {
                i1k0.B("Branch instance is not created yet. Make sure you call getAutoInstance(Context).");
            }
        } catch (Throwable th) {
            throw th;
        }
        return t;
    }

    public static boolean j(Activity activity) {
        boolean z = false;
        if (activity != null && activity.getIntent() != null && activity.getIntent().getBooleanExtra(eqq.c(3), false)) {
            z = true;
        }
        i1k0.B("isIntentParamsAlreadyConsumed " + z);
        return z;
    }

    public static boolean k(Intent intent) {
        if (!(intent != null ? intent.getBooleanExtra(eqq.c(2), false) : false)) {
            if (intent != null) {
                boolean z = intent.getStringExtra(eqq.c(4)) != null;
                boolean booleanExtra = intent.getBooleanExtra(eqq.c(3), false);
                if (!z || booleanExtra) {
                }
            }
            return false;
        }
        return true;
    }

    public static void q(String str) {
        if (TextUtils.isEmpty(str)) {
            i1k0.C("setAPIUrl: URL cannot be empty or null");
            return;
        }
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        ne.i = str;
        i1k0.B("setAPIUrl: Branch API URL was set to ".concat(str));
    }

    public static void t(String str) {
        if (TextUtils.isEmpty(str)) {
            i1k0.C("setFBAppID: fbAppID cannot be empty or null");
            return;
        }
        ne.j = str;
        i1k0.B("setFBAppID to " + str);
    }

    public final void a() {
        Bundle bundle;
        Context context = this.d;
        JSONObject jSONObjectI = i();
        String str = null;
        try {
            f4t f4tVar = f4t.RandomizedBundleToken;
            if (jSONObjectI.has("+clicked_branch_link") && jSONObjectI.getBoolean("+clicked_branch_link")) {
                if (jSONObjectI.length() > 0) {
                    Bundle bundle2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle2 == null || !bundle2.getBoolean("io.branch.sdk.auto_link_disable", false)) {
                        ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 129).activities;
                        int i = 1501;
                        if (activityInfoArr != null) {
                            for (ActivityInfo activityInfo : activityInfoArr) {
                                if (activityInfo != null && (bundle = activityInfo.metaData) != null && ((bundle.getString("io.branch.sdk.auto_link_keys") != null || activityInfo.metaData.getString("io.branch.sdk.auto_link_path") != null) && (b(jSONObjectI, activityInfo) || c(jSONObjectI, activityInfo)))) {
                                    str = activityInfo.name;
                                    i = activityInfo.metaData.getInt("io.branch.sdk.auto_link_request_code", 1501);
                                    break;
                                }
                            }
                        }
                        i1k0.B("deepLinkActivity " + str + " getCurrentActivity " + f());
                        if (str == null || f() == null) {
                            i1k0.B("No activity reference to launch deep linked activity");
                            return;
                        }
                        Activity activityF = f();
                        Intent intent = new Intent(activityF, Class.forName(str));
                        intent.putExtra(eqq.c(5), "true");
                        f4t f4tVar2 = f4t.RandomizedBundleToken;
                        intent.putExtra("referring_data", jSONObjectI.toString());
                        Iterator<String> itKeys = jSONObjectI.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            intent.putExtra(next, jSONObjectI.getString(next));
                        }
                        activityF.startActivityForResult(intent, i);
                        return;
                    }
                    return;
                }
                return;
            }
            i1k0.B("Does not have Clicked_Branch_Link or Clicked_Branch_Link is false, returning");
        } catch (PackageManager.NameNotFoundException unused) {
            i1k0.C("Warning: Please make sure Activity names set for auto deep link are correct!");
        } catch (ClassNotFoundException unused2) {
            i1k0.C("Warning: Please make sure Activity names set for auto deep link are correct! Error while looking for activity " + ((String) null));
        } catch (Exception unused3) {
        }
    }

    public final Activity f() {
        WeakReference weakReference = this.h;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public final v861 g(l3c l3cVar, boolean z) {
        v861 z861Var;
        this.f.getClass();
        boolean zJ = y861.j();
        Context context = this.d;
        if (zJ) {
            z861Var = new a961(context, 4, z);
            ne neVar = z861Var.e;
            z861Var.i = l3cVar;
            JSONObject jSONObject = new JSONObject();
            try {
                f4t f4tVar = f4t.RandomizedBundleToken;
                jSONObject.put("randomized_device_token", neVar.C());
                jSONObject.put("randomized_bundle_token", neVar.B());
                z861Var.j(jSONObject);
            } catch (JSONException e) {
                l1d.A(e, new StringBuilder("Caught JSONException "));
            }
        } else {
            z861Var = new z861(context, 3, z);
            z861Var.i = l3cVar;
            try {
                z861Var.j(new JSONObject());
            } catch (JSONException e2) {
                l1d.A(e2, new StringBuilder("Caught JSONException "));
            }
        }
        return z861Var;
    }

    public final JSONObject i() {
        return d(this.b.F("bnc_session_params"));
    }

    public final void l(oql oqlVar, String str, Activity activity) {
        ne neVar = this.b;
        try {
            f4t f4tVar = f4t.RandomizedBundleToken;
            neVar.Z("bnc_enhanced_web_link_ux_used", "IN_APP_WEBVIEW");
            neVar.W(System.currentTimeMillis(), "bnc_url_load_ms");
            oqlVar.j(activity, Uri.parse(str));
        } catch (Exception e) {
            i1k0.n("launchCustomTabBrowser caught exception: " + e);
        }
    }

    public final void m(String str) {
        ne neVar = this.b;
        try {
            f4t f4tVar = f4t.RandomizedBundleToken;
            neVar.Z("bnc_enhanced_web_link_ux_used", "EXTERNAL_BROWSER");
            neVar.W(System.currentTimeMillis(), "bnc_url_load_ms");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            this.d.startActivity(intent);
        } catch (Exception e) {
            i1k0.n("launchExternalBrowser caught exception: " + e);
        }
    }

    public final void n(JSONObject jSONObject) {
        i1k0.B("openBrowserExperience JSONObject: ".concat(String.valueOf(jSONObject)));
        try {
            if (jSONObject == null) {
                i1k0.n("openBrowserExperience: jsonObject is null");
                return;
            }
            f4t f4tVar = f4t.RandomizedBundleToken;
            String strOptString = jSONObject.has("enhanced_web_link_ux") ? jSONObject.optString("enhanced_web_link_ux", null) : null;
            String strOptString2 = jSONObject.has("web_link_redirect_url") ? jSONObject.optString("web_link_redirect_url", null) : null;
            if (strOptString2 != null && !strOptString2.isEmpty()) {
                boolean zX = zod.x("androidx.browser.customtabs.CustomTabsIntent");
                if ("IN_APP_WEBVIEW".equals(strOptString) && zX) {
                    i1k0.B("Using default CustomTabs");
                    l(new oxg1().a(), strOptString2, f());
                    return;
                }
                i1k0.B("customTabsImported " + zX);
                i1k0.B("Opening in external browser.");
                m(strOptString2);
                return;
            }
            i1k0.n("openBrowserExperience: weblinkUrl is null or empty");
        } catch (Exception e) {
            i1k0.n("openBrowserExperience caught exception: " + e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0081  */
    /* JADX WARN: Code duplicated, block: B:53:0x014e A[Catch: JSONException -> 0x00e9, TRY_LEAVE, TryCatch #2 {JSONException -> 0x00e9, blocks: (B:30:0x00b3, B:33:0x00bb, B:36:0x00cb, B:38:0x00d5, B:41:0x00ec, B:42:0x00f8, B:44:0x00fe, B:46:0x0110, B:47:0x011d, B:49:0x0123, B:50:0x0131, B:51:0x0140, B:53:0x014e), top: B:158:0x00b3 }] */
    public final void o(Uri uri, Activity activity) {
        boolean z;
        boolean zContains;
        Context context = this.d;
        i1k0.B("Read params uri: " + uri + " bypassCurrentActivityIntentState: " + q + " intent state: " + l1d.E(this.m));
        this.e.getClass();
        boolean zC = q3c.C();
        String string = null;
        ne neVar = this.b;
        if (zC) {
            if (this.m != 2) {
                HashSet hashSet = this.j.b;
                n3c n3cVarH = h();
                if (n3cVarH == null || n3cVarH.f() == null) {
                    zContains = false;
                } else {
                    i1k0.B("activitiesOnStack_: " + hashSet + " Current Activity: " + n3cVarH.f());
                    zContains = hashSet.contains(n3cVarH.f().toString());
                }
                if (zContains) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
            i1k0.B("activityHasValidIntent: " + z);
            boolean zK = k(activity != null ? activity.getIntent() : null);
            if (z && !zK && activity != null && activity.getIntent() != null) {
                Intent intent = activity.getIntent();
                if (uri != null) {
                    try {
                        if (j(activity)) {
                            if (!neVar.F("bnc_install_params").equals("bnc_no_value")) {
                                JSONObject jSONObject = new JSONObject();
                                f4t f4tVar = f4t.RandomizedBundleToken;
                                jSONObject.put("+is_first_session", false);
                                neVar.Y(jSONObject.toString());
                                this.i = true;
                            }
                        } else if (!TextUtils.isEmpty(intent.getStringExtra(eqq.c(1)))) {
                            String stringExtra = intent.getStringExtra(eqq.c(1));
                            if (stringExtra != null) {
                                JSONObject jSONObject2 = new JSONObject(stringExtra);
                                f4t f4tVar2 = f4t.RandomizedBundleToken;
                                jSONObject2.put("+clicked_branch_link", true);
                                neVar.Y(jSONObject2.toString());
                                this.i = true;
                            }
                            intent.removeExtra(eqq.c(1));
                            activity.setIntent(intent);
                        } else if (uri.isHierarchical()) {
                            f4t f4tVar3 = f4t.RandomizedBundleToken;
                            if (Boolean.valueOf(uri.getQueryParameter("instant")).booleanValue()) {
                                JSONObject jSONObject3 = new JSONObject();
                                for (String str : uri.getQueryParameterNames()) {
                                    jSONObject3.put(str, uri.getQueryParameter(str));
                                }
                                f4t f4tVar4 = f4t.RandomizedBundleToken;
                                jSONObject3.put("+clicked_branch_link", true);
                                neVar.Y(jSONObject3.toString());
                                this.i = true;
                            }
                        }
                    } catch (JSONException e) {
                        i1k0.m(e.getMessage());
                    }
                } else if (!neVar.F("bnc_install_params").equals("bnc_no_value")) {
                    JSONObject jSONObject4 = new JSONObject();
                    f4t f4tVar5 = f4t.RandomizedBundleToken;
                    jSONObject4.put("+is_first_session", false);
                    neVar.Y(jSONObject4.toString());
                    this.i = true;
                }
            }
        }
        if (q) {
            this.m = 2;
        }
        if (this.m == 2) {
            i1k0.B("extractExternalUriAndIntentExtras " + uri + " " + activity);
            try {
                if (!j(activity)) {
                    String strI = ptf1.h(context).i(uri.toString());
                    neVar.Z("bnc_external_intent_uri", strI);
                    if (strI.equals(uri.toString())) {
                        Bundle extras = activity.getIntent().getExtras();
                        Set<String> setKeySet = extras.keySet();
                        if (!setKeySet.isEmpty()) {
                            JSONObject jSONObject5 = new JSONObject();
                            for (String str2 : v) {
                                if (setKeySet.contains(str2)) {
                                    jSONObject5.put(str2, extras.get(str2));
                                }
                            }
                            if (jSONObject5.length() > 0) {
                                neVar.Z("bnc_external_intent_extra", jSONObject5.toString());
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                i1k0.m(e2.getMessage());
            }
            i1k0.B("extractInitialReferrer " + activity);
            if (activity != null) {
                Uri uriZ0 = ag0.z0(activity);
                i1k0.B("Initial referrer: " + uriZ0);
                if (uriZ0 != null) {
                    neVar.T(uriZ0.toString());
                }
            }
            i1k0.B("extractBranchLinkFromIntentExtra " + activity);
            if (activity != null) {
                try {
                    if (activity.getIntent() != null && activity.getIntent().getExtras() != null && !j(activity)) {
                        Object obj = activity.getIntent().getExtras().get(eqq.c(4));
                        if (obj instanceof String) {
                            string = (String) obj;
                        } else if (obj instanceof Uri) {
                            string = ((Uri) obj).toString();
                        }
                        if (!TextUtils.isEmpty(string)) {
                            neVar.Z("bnc_push_identifier", string);
                            Intent intent2 = activity.getIntent();
                            intent2.putExtra(eqq.c(3), true);
                            activity.setIntent(intent2);
                            return;
                        }
                    }
                } catch (Exception e3) {
                    i1k0.m(e3.getMessage());
                }
            }
            if (activity == null || activity.getIntent() == null || (activity.getIntent().getFlags() & 1048576) == 0) {
                if (uri != null) {
                    try {
                        if (uri.isHierarchical()) {
                            f4t f4tVar6 = f4t.RandomizedBundleToken;
                            String queryParameter = uri.getQueryParameter("link_click_id");
                            if (queryParameter != null) {
                                neVar.V(queryParameter);
                                String strConcat = "link_click_id=".concat(queryParameter);
                                String string2 = uri.toString();
                                activity.getIntent().setData(Uri.parse(string2.replaceFirst(strConcat.equals(uri.getQuery()) ? "\\?".concat(strConcat) : string2.length() - strConcat.length() == string2.indexOf(strConcat) ? "&".concat(strConcat) : strConcat.concat("&"), "")));
                                activity.getIntent().putExtra(eqq.c(3), true);
                                return;
                            }
                        }
                    } catch (Exception e4) {
                        i1k0.m(e4.getMessage());
                    }
                }
                if (uri == null || activity == null) {
                    return;
                }
                String scheme = uri.getScheme();
                Intent intent3 = activity.getIntent();
                if (scheme == null || intent3 == null) {
                    return;
                }
                if ((!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase(m3i1.b)) || TextUtils.isEmpty(uri.getHost()) || j(activity)) {
                    return;
                }
                if (uri.toString().equalsIgnoreCase(ptf1.h(context).i(uri.toString()))) {
                    neVar.Z("bnc_app_link", uri.toString());
                }
                intent3.putExtra(eqq.c(3), true);
                activity.setIntent(intent3);
            }
        }
    }

    public final void p(v861 v861Var, boolean z) {
        v861 v861Var2;
        i1k0.B("registerAppInit " + v861Var + " forceBranchSession: " + z);
        this.n = 2;
        y861 y861Var = this.f;
        y861Var.getClass();
        synchronized (y861.f) {
            try {
                Iterator it = ((List) y861Var.b).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        v861Var2 = null;
                        break;
                    }
                    u861 u861Var = (u861) it.next();
                    i1k0.B("Checking if " + u861Var + " is instanceof ServerRequestInitSession");
                    if (u861Var instanceof v861) {
                        v861Var2 = (v861) u861Var;
                        i1k0.B(v861Var2 + " is initiated by client: " + v861Var2.j);
                        if (v861Var2.j) {
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i1k0.B("Ordering init calls");
        i1k0.B("Self init request: " + v861Var2);
        this.f.o();
        if (v861Var2 == null || z) {
            i1k0.B("Moving " + v861Var + " to front of the queue or behind network-in-progress request");
            y861 y861Var2 = this.f;
            y861Var2.getClass();
            i1k0.B("Queue operation insertRequestAtFront " + v861Var + " networkCount_: " + (y861Var2.a ? 1 : 0));
            if (y861Var2.a) {
                y861Var2.k(v861Var, 1);
            } else {
                y861Var2.k(v861Var, 0);
            }
        } else {
            i1k0.B("Retrieved " + v861Var2 + " with callback " + v861Var2.i + " in queue currently");
            v861Var2.i = v861Var.i;
            i1k0.B(v861Var2 + " now has callback " + v861Var.i);
        }
        i1k0.B("Finished ordering init calls");
        this.f.o();
        Context context = this.d;
        rm5 rm5Var = this.c;
        i1k0.B("initTasks " + v861Var);
        if (this.m != 2) {
            v861Var.g.add(t861.c);
            i1k0.B("Added INTENT_PENDING_WAIT_LOCK");
        }
        if (v861Var instanceof z861) {
            v861Var.g.add(t861.d);
            i1k0.B("Added INSTALL_REFERRER_FETCH_WAIT_LOCK");
            Object obj = rm5Var.a;
            tqt.b(context, new ic9(this, v861Var, false, (byte) 17));
        }
        v861Var.g.add(t861.b);
        i1k0.B("Added GAID_FETCH_WAIT_LOCK");
        ((tqt) rm5Var.a).a(context, new ifl1(this, (byte) 7));
        this.f.p("registerAppInit");
    }

    public final void r(Application application) {
        i1k0.B("setActivityLifeCycleObserver activityLifeCycleObserver: " + this.j + " application: " + application);
        try {
            o3c o3cVar = new o3c();
            o3cVar.a = 0;
            o3cVar.b = new HashSet();
            this.j = o3cVar;
            i1k0.B("setActivityLifeCycleObserver set new activityLifeCycleObserver: " + this.j + " application: " + application);
            application.unregisterActivityLifecycleCallbacks(this.j);
            application.registerActivityLifecycleCallbacks(this.j);
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
            i1k0.B("BranchApp class can be used only with API level 14 or above. Please make sure your minimum API level supported is 14. If you wish to use API level below 14 consider calling getInstance(Context) instead.");
        }
    }

    public final void s(int i) {
        String str;
        ne neVar = this.b;
        neVar.getClass();
        neVar.Z("bnc_consumer_protection_attribution_level", gvg.D(i));
        if (i == 1) {
            str = "FULL";
        } else if (i == 2) {
            str = "REDUCED";
        } else if (i != 3) {
            str = i != 4 ? "null" : "NONE";
        } else {
            str = "MINIMAL";
        }
        i1k0.B("Set Consumer Protection Preference to ".concat(str));
        Context context = this.d;
        b3g1 b3g1Var = this.k;
        if (i == 4) {
            b3g1Var.a(context, true);
        } else if (b3g1Var.a) {
            b3g1Var.a(context, false);
        }
    }
}
