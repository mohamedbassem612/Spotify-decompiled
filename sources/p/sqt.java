package p;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sqt implements lnm {
    public final /* synthetic */ JSONObject a;

    public sqt(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final o8n getContext() {
        return o6x.a;
    }

    public final void resumeWith(Object obj) {
        if (obj != null) {
            n3c.p = (String) obj;
            i1k0.B("onUserAgentStringFetchFinished getUserAgentAsync resumeWith releasing lock");
            try {
                JSONObject jSONObject = this.a;
                f4t f4tVar = f4t.b;
                jSONObject.put("user_agent", n3c.p);
            } catch (JSONException e) {
                l1d.A(e, new StringBuilder("Caught JSONException "));
            }
        }
        n3c.h().f.r(t861.e);
        n3c.h().f.p("getUserAgentAsync resumeWith");
    }
}
