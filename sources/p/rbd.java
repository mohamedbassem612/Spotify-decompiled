package p;

import android.content.Intent;
import android.net.Uri;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rbd implements ct80 {
    public final add a;

    public rbd(add addVar) {
        this.a = addVar;
    }

    public final gt80 a(Intent intent) {
        String dataString = intent.getDataString();
        if (dataString != null) {
            Set set = s4b1.f;
            s4b1 s4b1VarX = uic.x(dataString);
            if (nhc1.S(Uri.parse(dataString).getScheme(), "https", true) && !intent.getBooleanExtra("extra_internal_injected", false) && s4b1VarX.v()) {
                qf4 qf4Var = this.a.a;
                if ((qf4Var.h() && qf4Var.W() && !pcf.n(s4b1VarX) && s4b1VarX.c != blc0.A8) || pcf.n(s4b1VarX)) {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(pcf.i(dataString)));
                    intent2.putExtra("deeplink.original.intent", intent);
                    return new ft80(intent2);
                }
            }
        }
        return et80.a;
    }
}
