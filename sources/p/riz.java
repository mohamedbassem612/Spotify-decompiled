package p;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class riz {
    public String a;
    public String b;
    public Long c;

    public riz(String str) {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        this.c = lValueOf;
        this.b = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        stringBuffer.append(lValueOf.longValue());
        stringBuffer.append(".json");
        this.a = stringBuffer.toString();
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.c;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        return jSONObject == null ? super.toString() : jSONObject.toString();
    }
}
