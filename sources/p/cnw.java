package p;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cnw {
    public static final cnw c;
    public final b380 a;
    public final b380 b;

    static {
        w280 w280Var = b380.b;
        bg11 bg11Var = bg11.e;
        c = new cnw(bg11Var, bg11Var);
    }

    public cnw(List list, List list2) {
        this.a = b380.p(list);
        this.b = b380.p(list2);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        b380 b380Var = this.a;
        boolean zIsEmpty = b380Var.isEmpty();
        b380 b380Var2 = this.b;
        if (zIsEmpty && b380Var2.isEmpty()) {
            return jSONObject;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < b380Var.size(); i++) {
            jSONArray.put(((f18) b380Var.get(i)).getClass().getSimpleName());
        }
        try {
            jSONObject.put("audio", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < b380Var2.size(); i2++) {
                jSONArray2.put(((siw) b380Var2.get(i2)).getClass().getSimpleName());
            }
            jSONObject.put("video", jSONArray2);
            return jSONObject;
        } catch (JSONException e) {
            oon1.I("JSON conversion failed.", e);
            return new JSONObject();
        }
    }

    public final String toString() {
        return a().toString();
    }
}
