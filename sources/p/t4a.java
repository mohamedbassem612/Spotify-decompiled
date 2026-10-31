package p;

import android.os.Bundle;
import java.util.HashSet;
import org.json.JSONArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t4a {
    public static boolean b;
    public static final t4a a = new t4a();
    public static HashSet c = new HashSet();

    public static final void a(Bundle bundle) {
        if (dhn.a.contains(t4a.class)) {
            return;
        }
        try {
            if (b && bundle != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : c) {
                    if (bundle.containsKey(str)) {
                        bundle.remove(str);
                        jSONArray.put(str);
                    }
                }
                if (jSONArray.length() > 0) {
                    bundle.putString("_bannedParams", jSONArray.toString());
                }
            }
        } catch (Throwable th) {
            dhn.a(t4a.class, th);
        }
    }
}
