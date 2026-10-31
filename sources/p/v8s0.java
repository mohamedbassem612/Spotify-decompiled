package p;

import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v8s0 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    public v8s0(JSONObject jSONObject) {
        this.a = jSONObject.getString("class_name");
        this.b = jSONObject.optInt("index", -1);
        this.c = jSONObject.optInt("id");
        this.d = jSONObject.optString("text");
        this.e = jSONObject.optString("tag");
        this.f = jSONObject.optString("description");
        this.g = jSONObject.optString("hint");
        this.h = jSONObject.optInt("match_bitmask");
    }
}
