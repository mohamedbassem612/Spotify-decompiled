package p;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g120 {
    public static final g120 a = new g120();
    public static final List b = p7h.M(new String[]{"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled", gvg.k(new StringBuilder("app_events_config.os_version("), Build.VERSION.RELEASE, ')')});
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final AtomicReference d = new AtomicReference(f120.a);
    public static final ConcurrentLinkedQueue e = new ConcurrentLinkedQueue();
    public static volatile boolean f;

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(b);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        String str = md50.j;
        md50 md50VarQ = cwl1.Q(null, "app", null);
        md50VarQ.i = true;
        md50VarQ.d = bundle;
        JSONObject jSONObject = md50VarQ.c().d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static final c120 b(String str) {
        return (c120) c.get(str);
    }

    public static final HashMap c() {
        JSONObject jSONObject;
        String string = wf10.a().getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{wf10.b()}, 1)), null);
        if (!fpi1.y(string)) {
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                    wf10 wf10Var = wf10.a;
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    return h(jSONObject);
                }
            } else {
                eg.m("Required value was null.");
            }
        }
        return null;
    }

    public static final void d() {
        f120 f120Var;
        f120 f120Var2;
        final Context contextA = wf10.a();
        final String strB = wf10.b();
        boolean zY = fpi1.y(strB);
        f120 f120Var3 = f120.d;
        g120 g120Var = a;
        AtomicReference atomicReference = d;
        if (zY) {
            atomicReference.set(f120Var3);
            g120Var.j();
            return;
        }
        if (c.containsKey(strB)) {
            atomicReference.set(f120.c);
            g120Var.j();
            return;
        }
        do {
            f120Var = f120.a;
            f120Var2 = f120.b;
            if (atomicReference.compareAndSet(f120Var, f120Var2)) {
            }
            final String str = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strB}, 1));
            wf10.c().execute(new Runnable() { // from class: p.d120
                @Override // java.lang.Runnable
                public final void run() {
                    JSONObject jSONObject;
                    Context context = contextA;
                    String str2 = str;
                    String str3 = strB;
                    g120 g120Var2 = g120.a;
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                    c120 c120VarE = null;
                    String string = sharedPreferences.getString(str2, null);
                    if (!fpi1.y(string)) {
                        if (string == null) {
                            eg.m("Required value was null.");
                            return;
                        }
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException unused) {
                            wf10 wf10Var = wf10.a;
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            c120VarE = g120.e(str3, jSONObject);
                        }
                    }
                    JSONObject jSONObjectA = g120.a();
                    g120.e(str3, jSONObjectA);
                    sharedPreferences.edit().putString(str2, jSONObjectA.toString()).apply();
                    if (c120VarE != null) {
                        String str4 = c120VarE.i;
                        if (!g120.f && str4.length() > 0) {
                            g120.f = true;
                        }
                    }
                    b120 b120Var = b120.a;
                    JSONObject jSONObjectA2 = b120.a();
                    wf10.a().getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str3}, 1)), jSONObjectA2.toString()).apply();
                    b120.e(str3, jSONObjectA2);
                    ouz ouzVar = m69.a;
                    Context contextA2 = wf10.a();
                    String strB2 = wf10.b();
                    if (wgi1.c() && (contextA2 instanceof Application)) {
                        w0o1.g((Application) contextA2, strB2);
                    }
                    g120.d.set(g120.c.containsKey(str3) ? f120.c : f120.d);
                    g120Var2.j();
                }
            });
        } while (atomicReference.get() == f120Var);
        while (!atomicReference.compareAndSet(f120Var3, f120Var2)) {
            if (atomicReference.get() != f120Var3) {
                g120Var.j();
                return;
            }
        }
        final String str2 = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strB}, 1));
        wf10.c().execute(new Runnable() { // from class: p.d120
            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject;
                Context context = contextA;
                String str3 = str2;
                String str4 = strB;
                g120 g120Var2 = g120.a;
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                c120 c120VarE = null;
                String string = sharedPreferences.getString(str3, null);
                if (!fpi1.y(string)) {
                    if (string == null) {
                        eg.m("Required value was null.");
                        return;
                    }
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException unused) {
                        wf10 wf10Var = wf10.a;
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        c120VarE = g120.e(str4, jSONObject);
                    }
                }
                JSONObject jSONObjectA = g120.a();
                g120.e(str4, jSONObjectA);
                sharedPreferences.edit().putString(str3, jSONObjectA.toString()).apply();
                if (c120VarE != null) {
                    String str5 = c120VarE.i;
                    if (!g120.f && str5.length() > 0) {
                        g120.f = true;
                    }
                }
                b120 b120Var = b120.a;
                JSONObject jSONObjectA2 = b120.a();
                wf10.a().getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str4}, 1)), jSONObjectA2.toString()).apply();
                b120.e(str4, jSONObjectA2);
                ouz ouzVar = m69.a;
                Context contextA2 = wf10.a();
                String strB2 = wf10.b();
                if (wgi1.c() && (contextA2 instanceof Application)) {
                    w0o1.g((Application) contextA2, strB2);
                }
                g120.d.set(g120.c.containsKey(str4) ? f120.c : f120.d);
                g120Var2.j();
            }
        });
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static p.c120 e(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r32v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static ArrayList f(String str, JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (u890.j(jSONObject2.getString("key"), "prod_keys")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                        if (u890.j(jSONObject3.getString("key"), str)) {
                            JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                            ArrayList arrayList = new ArrayList();
                            int length3 = jSONArray3.length();
                            for (int i3 = 0; i3 < length3; i3++) {
                                arrayList.add(jSONArray3.getJSONObject(i3).getString("value"));
                            }
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(arrayList);
                            return arrayList2;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static ArrayList g(JSONObject jSONObject, boolean z) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("key");
            if ((!u890.j(string, "prod_keys") || !z) && (!u890.j(string, "test_keys") || z)) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                    String string2 = jSONObject3.getString("key");
                    if (!u890.j(string2, "_valueToSum") && !u890.j(string2, "fb_currency")) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList2 = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i3 = 0; i3 < length3; i3++) {
                            try {
                                arrayList2.add(jSONArray3.getJSONObject(i3).getString("value"));
                            } catch (Exception unused2) {
                                return null;
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new mmr0(string2, arrayList2));
                    }
                }
            }
        }
        return arrayList;
    }

    public static HashMap h(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                map.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException unused) {
                wf10 wf10Var = wf10.a;
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                map.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException unused2) {
                wf10 wf10Var2 = wf10.a;
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public static JSONArray i(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    public static final c120 k(String str, boolean z) {
        if (!z) {
            ConcurrentHashMap concurrentHashMap = c;
            if (concurrentHashMap.containsKey(str)) {
                return (c120) concurrentHashMap.get(str);
            }
        }
        c120 c120VarE = e(str, a());
        if (str.equals(wf10.b())) {
            d.set(f120.c);
            a.j();
        }
        return c120VarE;
    }

    public final synchronized void j() {
        f120 f120Var = (f120) d.get();
        if (f120.a != f120Var && f120.b != f120Var) {
            c120 c120Var = (c120) c.get(wf10.b());
            Handler handler = new Handler(Looper.getMainLooper());
            if (f120.d == f120Var) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = e;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    } else {
                        handler.post(new e120((vm5) concurrentLinkedQueue.poll()));
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = e;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    } else {
                        handler.post(new e120((vm5) concurrentLinkedQueue2.poll(), c120Var));
                    }
                }
            }
        }
    }
}
