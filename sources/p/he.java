package p;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class he implements id50 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ he(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.id50
    public final void a(pd50 pd50Var) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                le leVar = (le) obj;
                JSONObject jSONObject3 = pd50Var.d;
                if (jSONObject3 != null) {
                    leVar.c = jSONObject3.optString("access_token");
                    leVar.b = jSONObject3.optInt("expires_at");
                    leVar.e = jSONObject3.optInt("expires_in");
                    leVar.f = Long.valueOf(jSONObject3.optLong("data_access_expiration_time"));
                    leVar.d = jSONObject3.optString("graph_domain", null);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                try {
                    if (pd50Var.c == null && (jSONObject = pd50Var.d) != null && jSONObject.getBoolean("success")) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            fap1.g(((riz) it.next()).a);
                        }
                        break;
                    }
                } catch (JSONException unused) {
                    return;
                }
                break;
            default:
                ep80 ep80Var = (ep80) obj;
                try {
                    if (pd50Var.c == null && (jSONObject2 = pd50Var.d) != null && jSONObject2.getBoolean("success")) {
                        fap1.g(ep80Var.a);
                        break;
                    }
                } catch (JSONException unused2) {
                    return;
                }
                break;
        }
    }
}
