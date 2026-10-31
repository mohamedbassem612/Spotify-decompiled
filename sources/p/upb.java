package p;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class upb {
    public long a;
    public final Object b;
    public final Object c;

    public upb(long j, up20 up20Var) {
        this.a = j;
        this.b = up20Var;
        this.c = new cg01(this, j);
    }

    public static upb a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new upb(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new upb(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            e.toString();
            return null;
        }
    }

    public void b(bsi0 bsi0Var, oq70 oq70Var, Map map, long j) {
        cg01 cg01Var = (cg01) this.c;
        long j2 = cg01Var.b;
        LinkedHashMap linkedHashMap = cg01Var.a;
        if (j > j2) {
            Object objRemove = linkedHashMap.remove(bsi0Var);
            if (objRemove != null) {
                cg01Var.c = cg01Var.b() - cg01Var.c(bsi0Var, objRemove);
                cg01Var.a(bsi0Var, objRemove, (bg01) null);
            }
            ((up20) this.b).k(bsi0Var, oq70Var, map, j);
            return;
        }
        bg01 bg01Var = new bg01(oq70Var, map, j);
        Object objPut = linkedHashMap.put(bsi0Var, bg01Var);
        cg01Var.c = cg01Var.c(bsi0Var, bg01Var) + cg01Var.b();
        if (objPut != null) {
            cg01Var.c = cg01Var.b() - cg01Var.c(bsi0Var, objPut);
            cg01Var.a(bsi0Var, objPut, bg01Var);
        }
        cg01Var.d(cg01Var.b);
    }

    public upb(yqg yqgVar, lo9 lo9Var) {
        this.b = yqgVar;
        this.c = lo9Var;
    }

    public upb(String str, String str2, long j) {
        this.b = str;
        this.c = str2;
        this.a = j;
    }
}
