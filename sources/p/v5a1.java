package p;

import android.content.Intent;
import android.net.Uri;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v5a1 implements it80 {
    public final n381 a;
    public final yt91 b;
    public final h5a1 c;
    public final byp d;
    public final q8n e;

    public v5a1(n381 n381Var, yt91 yt91Var, h5a1 h5a1Var, byp bypVar, q8n q8nVar) {
        this.a = n381Var;
        this.b = yt91Var;
        this.c = h5a1Var;
        this.d = bypVar;
        this.e = q8nVar;
    }

    public final void a(ajq0 ajq0Var) {
        ajq0Var.J(new ebu(blc0.A8, (byte) 7), "Join or view a social session", new vr51(this, (byte) 15));
        ajq0Var.J(new ebu(blc0.Lb, (byte) 7), "Join or view a nearby jam", new dn81(this, (byte) 6));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    public final Single b(Intent intent) {
        wea0 wea0Var;
        wea0 wea0Var2;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        Uri uri = s4b1VarX.a;
        ou80 serializableExtra = intent.getSerializableExtra("extra_interaction_id");
        wea0 wea0Var3 = null;
        ou80 ou80Var = serializableExtra instanceof ou80 ? serializableExtra : null;
        String strO = s4b1VarX.o(1);
        if (s4b1VarX.c == blc0.Lb) {
            wea0Var2 = new wea0(xea0.LOCKSCREEN_INVITATION);
        } else {
            String queryParameter = uri != null ? uri.getQueryParameter("utm_medium") : null;
            xea0 xea0Var = xea0.DEEPLINKING;
            if (queryParameter == null) {
                wea0Var = null;
            } else {
                if (queryParameter.length() <= 0) {
                    queryParameter = null;
                }
                if (queryParameter == null) {
                    wea0Var = null;
                } else if (queryParameter.equals("qr")) {
                    wea0Var = new wea0(xea0.SCANNING);
                } else if (queryParameter.equals("share-link")) {
                    wea0Var = new wea0(xea0Var);
                } else {
                    xea0 xea0Var2 = xea0.LISTENING_ACTIVITY;
                    wea0Var = queryParameter.equals(xea0Var2.b) ? new wea0(xea0Var2) : new wea0(queryParameter, xea0Var);
                }
            }
            if (wea0Var == null) {
                String queryParameter2 = uri != null ? uri.getQueryParameter("utm_source") : null;
                if (queryParameter2 != null) {
                    if (queryParameter2.length() <= 0) {
                        queryParameter2 = null;
                    }
                    if (queryParameter2 != null) {
                        wea0Var3 = new wea0(queryParameter2, xea0Var);
                    }
                }
                wea0Var2 = wea0Var3 == null ? new wea0(xea0Var) : wea0Var3;
            } else {
                wea0Var2 = wea0Var;
            }
        }
        return ((iir) this.c.b).m().map(new yt91(strO, wea0Var2, s4b1VarX, (byte) 5)).flatMap(new yt91(this, s4b1VarX, ou80Var, (byte) 6)).onErrorReturn(njx0.P0);
    }
}
