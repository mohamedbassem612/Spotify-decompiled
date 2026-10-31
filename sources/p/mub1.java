package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mub1 {
    public static boolean b;
    public static final mub1 a = new mub1();
    public static final HashMap c = new HashMap();
    public static final HashMap d = new HashMap();

    public static final void d(Bundle bundle) {
        mub1 mub1Var = a;
        HashMap map = d;
        if (dhn.a.contains(mub1.class)) {
            return;
        }
        try {
            if (b && bundle != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : bundle.keySet()) {
                    String strValueOf = String.valueOf(bundle.get(str));
                    HashMap map2 = c;
                    boolean z = false;
                    boolean z2 = map2.get(str) != null;
                    boolean z3 = map.get(str) != null;
                    if (z2 || z3) {
                        Set set = (Set) map2.get(str);
                        if (!dhn.a.contains(mub1Var) && set != null) {
                            try {
                                Set set2 = set;
                                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                                    Iterator it = set2.iterator();
                                    while (it.hasNext()) {
                                        if (Pattern.compile((String) it.next()).matcher(strValueOf).matches()) {
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                dhn.a(mub1Var, th);
                            }
                        }
                        boolean zB = mub1Var.b(strValueOf, (Set) map.get(str));
                        if (!z && !zB) {
                            arrayList.add(str);
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    bundle.remove((String) it2.next());
                }
            }
        } catch (Throwable th2) {
            dhn.a(mub1.class, th2);
        }
    }

    public final void a(JSONArray jSONArray) {
        HashMap map = c;
        HashMap map2 = d;
        if (dhn.a.contains(this) || jSONArray == null) {
            return;
        }
        try {
            if (b) {
                return;
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("key");
                if (string != null && string.length() != 0) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            boolean z = jSONArray2.getJSONObject(i2).getBoolean("require_exact_match");
                            HashSet hashSetC = c(jSONArray2.getJSONObject(i2).getJSONArray("potential_matches"));
                            if (z) {
                                HashSet hashSet = (HashSet) map2.get(string);
                                if (hashSet != null) {
                                    hashSet.addAll(hashSetC);
                                    hashSetC = hashSet;
                                }
                                map2.put(string, hashSetC);
                            } else {
                                HashSet hashSet2 = (HashSet) map.get(string);
                                if (hashSet2 != null) {
                                    hashSet2.addAll(hashSetC);
                                    hashSetC = hashSet2;
                                }
                                map.put(string, hashSetC);
                            }
                        }
                    } catch (Exception unused) {
                        map2.remove(string);
                        map.remove(string);
                    }
                }
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public final boolean b(String str, Set set) {
        if (!dhn.a.contains(this) && set != null) {
            try {
                Set<String> set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    for (String str2 : set2) {
                        Locale locale = Locale.ROOT;
                        if (str2.toLowerCase(locale).equals(str.toLowerCase(locale))) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                dhn.a(this, th);
            }
        }
        return false;
    }

    public final HashSet c(JSONArray jSONArray) {
        try {
            if (dhn.a.contains(this)) {
                return null;
            }
            try {
                HashSet hashSetE = fpi1.e(jSONArray);
                return hashSetE == null ? new HashSet() : hashSetE;
            } catch (Exception unused) {
                return new HashSet();
            }
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }
}
