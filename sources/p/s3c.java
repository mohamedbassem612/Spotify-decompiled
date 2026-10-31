package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s3c extends u861 {
    public s3c(Context context, int i, HashMap map, JSONObject jSONObject, JSONObject jSONObject2, ArrayList arrayList) {
        super(context, i);
        JSONObject jSONObject3 = new JSONObject();
        try {
            f4t f4tVar = f4t.RandomizedBundleToken;
            jSONObject3.put("name", "COMPLETE_REGISTRATION");
            if (jSONObject2.length() > 0) {
                jSONObject3.put("custom_data", jSONObject2);
            }
            if (jSONObject.length() > 0) {
                jSONObject3.put("event_data", jSONObject);
            }
            if (map.size() > 0) {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject3.put((String) entry.getKey(), entry.getValue());
                }
            }
            if (arrayList.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                f4t f4tVar2 = f4t.RandomizedBundleToken;
                jSONObject3.put("content_items", jSONArray);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((a4c) it.next()).a());
                }
            }
            super.j(jSONObject3);
            this.e.J(jSONObject3);
        } catch (JSONException e) {
            l1d.A(e, new StringBuilder("Caught JSONException "));
        }
        m(jSONObject3);
    }

    @Override // p.u861
    public final int c() {
        return 3;
    }
}
