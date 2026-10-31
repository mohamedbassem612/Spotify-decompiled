package p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y900 {
    public static boolean b;
    public static final y900 a = new y900();
    public static final ArrayList c = new ArrayList();
    public static final HashSet d = new HashSet();

    public static final void b(ArrayList arrayList) {
        if (dhn.a.contains(y900.class)) {
            return;
        }
        try {
            if (b) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (d.contains(((bm5) it.next()).b())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            dhn.a(y900.class, th);
        }
    }

    public final synchronized void a() {
        try {
            if (dhn.a.contains(this)) {
                return;
            }
            try {
                c120 c120VarK = g120.k(wf10.b(), false);
                if (c120VarK == null) {
                    return;
                }
                String str = c120VarK.l;
                if (str != null && str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    c.clear();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        if (jSONObject2 != null) {
                            if (jSONObject2.optBoolean("is_deprecated_event")) {
                                d.add(next);
                            } else {
                                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                x900 x900Var = new x900(next, new ArrayList());
                                if (jSONArrayOptJSONArray != null) {
                                    x900Var.a(fpi1.f(jSONArrayOptJSONArray));
                                }
                                c.add(x900Var);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                dhn.a(this, th);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
