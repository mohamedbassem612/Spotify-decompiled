package p;

import android.os.Bundle;
import com.facebook.FacebookException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bm5 implements Serializable {
    public static final HashSet f = new HashSet();
    public final JSONObject a;
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final String e;

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1 A[PHI: r11
      0x00b1: PHI (r11v29 java.lang.String) = (r11v1 java.lang.String), (r11v1 java.lang.String), (r11v28 java.lang.String) binds: [B:37:0x00af, B:57:0x00f2, B:54:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    public bm5(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid, ylq0 ylq0Var) throws JSONException, FacebookException {
        JSONObject jSONObject;
        String str3;
        this.c = z;
        this.d = z2;
        this.e = str2;
        String str4 = null;
        if (ylq0Var != null) {
            try {
                LinkedHashMap linkedHashMap = ylq0Var.a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
                for (Object obj : linkedHashMap.entrySet()) {
                    ((zlq0) ((Map.Entry) obj).getKey()).getClass();
                    linkedHashMap2.put("iap_parameters", ((Map.Entry) obj).getValue());
                }
                jSONObject = new JSONObject(sqg0.U(linkedHashMap2));
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        this.b = jSONObject;
        q0o1.o(str2);
        JSONObject jSONObject2 = new JSONObject();
        v131 v131Var = v131.a;
        Set set = dhn.a;
        if (set.contains(v131.class)) {
            str3 = null;
        } else {
            try {
                if (v131.b) {
                    v131 v131Var2 = v131.a;
                    boolean zContains = false;
                    if (!set.contains(v131Var2)) {
                        try {
                            zContains = v131.d.contains(str2);
                        } catch (Throwable th) {
                            dhn.a(v131Var2, th);
                        }
                    }
                    if (zContains) {
                        str3 = "_removed_";
                    } else {
                        str3 = str2;
                    }
                } else {
                    str3 = str2;
                }
            } catch (Throwable th2) {
                dhn.a(v131.class, th2);
                str3 = null;
            }
        }
        if (u890.j(str3, str2)) {
            i711 i711Var = i711.a;
            Set set2 = dhn.a;
            if (set2.contains(i711.class)) {
                str2 = str4;
            } else {
                try {
                    if (i711.b) {
                        i711 i711Var2 = i711.a;
                        if (!set2.contains(i711Var2)) {
                            try {
                                for (String str5 : i711.c.keySet()) {
                                    HashSet hashSet = (HashSet) i711.c.get(str5);
                                    if (hashSet != null && hashSet.contains(str2)) {
                                        str4 = str5;
                                        break;
                                    }
                                }
                            } catch (Throwable th3) {
                                dhn.a(i711Var2, th3);
                            }
                        }
                        if (str4 != null) {
                            str2 = str4;
                        }
                    }
                } catch (Throwable th4) {
                    dhn.a(i711.class, th4);
                }
            }
            str3 = str2;
        }
        jSONObject2.put("_eventName", str3);
        jSONObject2.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject2.put("_ui", str);
        if (uuid != null) {
            jSONObject2.put("_session_id", uuid);
        }
        if (bundle != null) {
            String str6 = this.e;
            HashMap map = new HashMap();
            for (String str7 : bundle.keySet()) {
                q0o1.o(str7);
                Object obj2 = bundle.get(str7);
                if (!(obj2 instanceof String) && !(obj2 instanceof Number)) {
                    throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj2, str7}, 2)));
                }
                map.put(str7, obj2.toString());
            }
            if (!dhn.a.contains(ns80.class)) {
                try {
                    if (ns80.c && !map.isEmpty()) {
                        try {
                            List<String> listL1 = o7h.l1(map.keySet());
                            JSONObject jSONObject3 = new JSONObject();
                            for (String str8 : listL1) {
                                Object obj3 = map.get(str8);
                                if (obj3 == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                String str9 = (String) obj3;
                                ns80 ns80Var = ns80.b;
                                if (ns80Var.b(str8) || ns80Var.b(str9)) {
                                    map.remove(str8);
                                    if (!ns80.d) {
                                        str9 = "";
                                    }
                                    jSONObject3.put(str8, str9);
                                }
                            }
                            if (jSONObject3.length() != 0) {
                                map.put("_onDeviceParams", jSONObject3.toString());
                            }
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Throwable th5) {
                    dhn.a(ns80.class, th5);
                }
            }
            Map mapK = w0h1.k(map);
            v131 v131Var3 = v131.a;
            if (!dhn.a.contains(v131.class)) {
                try {
                    if (v131.b) {
                        HashMap map2 = new HashMap();
                        for (String str10 : new ArrayList(mapK.keySet())) {
                            String strA = v131.a.a(str6, str10);
                            if (strA != null) {
                                map2.put(str10, strA);
                                mapK.remove(str10);
                            }
                        }
                        if (!map2.isEmpty()) {
                            try {
                                JSONObject jSONObject4 = new JSONObject();
                                for (Map.Entry entry : map2.entrySet()) {
                                    jSONObject4.put((String) entry.getKey(), (String) entry.getValue());
                                }
                                mapK.put("_restrictedParams", jSONObject4.toString());
                            } catch (JSONException unused3) {
                            }
                        }
                    }
                } catch (Throwable th6) {
                    dhn.a(v131.class, th6);
                }
            }
            Map mapK2 = w0h1.k(map);
            y900 y900Var = y900.a;
            if (!dhn.a.contains(y900.class)) {
                try {
                    if (y900.b) {
                        ArrayList<String> arrayList = new ArrayList(mapK2.keySet());
                        for (x900 x900Var : new ArrayList(y900.c)) {
                            if (x900Var.a.equals(str6)) {
                                for (String str11 : arrayList) {
                                    if (x900Var.b.contains(str11)) {
                                        mapK2.remove(str11);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th7) {
                    dhn.a(y900.class, th7);
                }
            }
            for (String str12 : map.keySet()) {
                jSONObject2.put(str12, map.get(str12));
            }
        }
        if (d != null) {
            jSONObject2.put("_valueToSum", d.doubleValue());
        }
        if (this.d) {
            jSONObject2.put("_inBackground", "1");
        }
        if (this.c) {
            jSONObject2.put("_implicitlyLogged", "1");
        } else {
            fza fzaVar = oue0.a;
            jSONObject2.toString();
            synchronized (wf10.b) {
            }
        }
        this.a = jSONObject2;
    }

    private final Object writeReplace() {
        return new am5(this.a.toString(), this.c, this.b.toString(), this.d);
    }

    public final JSONObject a() {
        return this.a;
    }

    public final String b() {
        return this.e;
    }

    public final String toString() {
        JSONObject jSONObject = this.a;
        return String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{jSONObject.optString("_eventName"), Boolean.valueOf(this.c), jSONObject.toString()}, 3));
    }

    public bm5(String str, boolean z, String str2, boolean z2) {
        JSONObject jSONObject = new JSONObject(str);
        this.a = jSONObject;
        this.b = new JSONObject(str2);
        this.c = z;
        this.e = jSONObject.optString("_eventName");
        this.d = z2;
    }
}
