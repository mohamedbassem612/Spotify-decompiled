package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Single;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i5a1 {
    public final bo71 a;
    public final Context b;
    public final q8n c;

    public i5a1(bo71 bo71Var, Context context, q8n q8nVar) {
        this.a = bo71Var;
        this.b = context;
        this.c = q8nVar;
    }

    public final Single a(int i, String str) {
        String str2;
        String str3;
        if (i == 1) {
            str2 = "share-options-sheet";
        } else if (i == 2) {
            str2 = "android-auto";
        } else {
            if (i != 3) {
                throw null;
            }
            str2 = "android-automotive";
        }
        cqi1 cqi1Var = new cqi1(null, str2, "qr", null, null);
        xkg0 xkg0Var = new xkg0();
        xkg0Var.put("ssp", "1");
        xkg0Var.put("jam", "1");
        xkg0Var.put("app_destination", "socialsession");
        xkg0Var.put("ipl", "1");
        if (i != 1) {
            str3 = "car";
            if (i != 2 && i != 3) {
                throw null;
            }
        } else {
            str3 = null;
        }
        if (str3 != null) {
            xkg0Var.put("feature", str3);
        }
        return rqt0.F(this.c, new sb91(this, new go71(str, (String) null, cqi1Var, (Map) xkg0Var.b(), (String) null, new ujc0(this.b.getString(2131962322), l1d.m("https://shareables.scdn.co/publish/socialsession/", (String) o7h.A0(ihc1.Q0(str, new String[]{":"}, 0, 6))))), null, (byte) 11));
    }
}
