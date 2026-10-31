package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p680 implements fyf0 {
    public final s680 a;

    public p680(s680 s680Var) {
        this.a = s680Var;
    }

    public final boolean b(Intent intent) {
        s680 s680Var = this.a;
        s680Var.getClass();
        String dataString = intent.getDataString();
        if (dataString == null || !s680Var.e.f(dataString)) {
            return false;
        }
        String strR = m5n1.R(intent);
        s680Var.f.f(strR, dataString);
        c921.y(s680Var.g, (o8n) null, 0, new lqv(s680Var, intent, dataString, strR, (lnm) null, (byte) 28), 3);
        return true;
    }
}
