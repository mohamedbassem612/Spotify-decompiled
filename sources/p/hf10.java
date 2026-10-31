package p;

import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hf10 extends if10 {
    public final JSONObject a;

    public hf10(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hf10) && u890.j(this.a, ((hf10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
