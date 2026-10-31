package p;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rg51 implements b031 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("sectionExpandedStates");
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            LinkedHashMap linkedHashMap = this.a;
            Object objB = linkedHashMap.get(str);
            if (objB == null) {
                objB = gio1.b(Boolean.TRUE);
                linkedHashMap.put(str, objB);
            }
            ((wen0) objB).m((Object) null, Boolean.valueOf(bundle2.getBoolean(str, true)));
        }
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.a.entrySet()) {
            bundle2.putBoolean((String) entry.getKey(), ((Boolean) ((wen0) entry.getValue()).getValue()).booleanValue());
        }
        bundle.putBundle("sectionExpandedStates", bundle2);
        return bundle;
    }
}
