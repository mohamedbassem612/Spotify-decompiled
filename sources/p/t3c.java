package p;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t3c {
    public final boolean a;
    public final HashMap b;
    public final JSONObject c;
    public final JSONObject d;
    public final ArrayList e;

    public t3c() {
        String strE = td6.e(15);
        this.b = new HashMap();
        this.c = new JSONObject();
        this.d = new JSONObject();
        boolean z = false;
        for (int i : l1d.H(25)) {
            if (strE.equals(td6.e(i))) {
                z = true;
                break;
            }
        }
        this.a = z;
        this.e = new ArrayList();
    }

    public final void a(String str, String str2) {
        try {
            this.d.put(str, str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void b(Context context) {
        int i = this.a ? 6 : 7;
        if (n3c.h() != null) {
            s3c s3cVar = new s3c(context, i, this.b, this.c, this.d, this.e);
            i1k0.B("Preparing V2 event, user agent is " + n3c.p);
            if (TextUtils.isEmpty(n3c.p)) {
                i1k0.B("User agent is empty, handleNewRequest adding process wait lock USER_AGENT_STRING_LOCK");
                ((u861) s3cVar).g.add(t861.e);
            }
            n3c.h().f.i(s3cVar);
        }
    }
}
