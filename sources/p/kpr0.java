package p;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kpr0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;

    public kpr0(JSONObject jSONObject) {
        this.a = jSONObject.getString("name");
        this.b = jSONObject.optString("value");
        this.d = jSONObject.optString("path_type", "absolute");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("path");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(new v8s0(jSONArrayOptJSONArray.getJSONObject(i)));
            }
        }
        this.c = arrayList;
    }
}
