package p;

import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b961 {
    public final int a;
    public Object b;
    public final String c;

    public b961(int i, String str) {
        this.a = i;
        this.c = str;
    }

    public final JSONObject a() {
        Object obj = this.b;
        return obj instanceof JSONObject ? (JSONObject) obj : new JSONObject();
    }
}
