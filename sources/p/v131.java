package p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v131 {
    public static boolean b;
    public static final v131 a = new v131();
    public static final ArrayList c = new ArrayList();
    public static final CopyOnWriteArraySet d = new CopyOnWriteArraySet();

    public final String a(String str, String str2) {
        if (!dhn.a.contains(this)) {
            try {
                for (u131 u131Var : new ArrayList(c)) {
                    if (u131Var != null && u890.j(str, u131Var.a())) {
                        for (String str3 : ((HashMap) u131Var.b()).keySet()) {
                            if (u890.j(str2, str3)) {
                                return (String) ((HashMap) u131Var.b()).get(str3);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                dhn.a(this, th);
            }
        }
        return null;
    }

    public final void b() {
        String str;
        CopyOnWriteArraySet copyOnWriteArraySet = d;
        ArrayList arrayList = c;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            c120 c120VarK = g120.k(wf10.b(), false);
            if (c120VarK != null && (str = c120VarK.l) != null && str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                arrayList.clear();
                copyOnWriteArraySet.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        u131 u131Var = new u131(next, new HashMap());
                        if (jSONObjectOptJSONObject != null) {
                            u131Var.c(fpi1.h(jSONObjectOptJSONObject));
                            arrayList.add(u131Var);
                        }
                        if (jSONObject2.has("process_event_name")) {
                            copyOnWriteArraySet.add(u131Var.a());
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }
}
