package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vey0 {
    public static boolean b;
    public static HashSet d;
    public static final vey0 a = new vey0();
    public static final idd1 c = new idd1(h0x0.R0);

    public static final void b(Bundle bundle) {
        if (dhn.a.contains(vey0.class)) {
            return;
        }
        try {
            if (b && bundle != null && !bundle.isEmpty() && d != null) {
                ArrayList<String> arrayList = new ArrayList();
                for (String str : bundle.keySet()) {
                    HashSet hashSet = d;
                    hashSet.getClass();
                    if (!hashSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
                boolean z = false;
                for (String str2 : arrayList) {
                    if (bundle.containsKey(str2)) {
                        bundle.remove(str2);
                        z = true;
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cd", z);
                bundle.putString("pm_metadata", jSONObject.toString());
                bundle.putString("pm", "1");
            }
        } catch (Throwable th) {
            dhn.a(vey0.class, th);
        }
    }

    public final void a() {
        HashSet hashSet;
        Set set = dhn.a;
        if (set.contains(this)) {
            return;
        }
        try {
            c120 c120VarK = g120.k(wf10.b(), false);
            if (c120VarK == null) {
                return;
            }
            JSONArray jSONArray = c120VarK.m;
            HashSet hashSet2 = null;
            if (set.contains(this) || jSONArray == null) {
                hashSet = null;
            } else {
                try {
                    if (jSONArray.length() != 0) {
                        hashSet = new HashSet();
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            hashSet.add(jSONArray.getString(i));
                        }
                    }
                } catch (Throwable th) {
                    dhn.a(this, th);
                }
                hashSet = null;
            }
            if (hashSet == null) {
                if (!dhn.a.contains(this)) {
                    try {
                        hashSet2 = (HashSet) c.getValue();
                    } catch (Throwable th2) {
                        dhn.a(this, th2);
                    }
                }
                hashSet = hashSet2;
            }
            d = hashSet;
        } catch (Throwable th3) {
            dhn.a(this, th3);
        }
    }

    public final boolean c(Bundle bundle) {
        if (dhn.a.contains(this) || bundle == null) {
            return false;
        }
        try {
            return bundle.containsKey("pm") && u890.j(bundle.get("pm"), "1");
        } catch (Throwable th) {
            dhn.a(this, th);
            return false;
        }
    }
}
