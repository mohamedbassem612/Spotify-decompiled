package p;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ef10 implements ss80 {
    public final kly0 a;

    public ef10(kly0 kly0Var) {
        this.a = kly0Var;
    }

    @Override // p.ss80
    public final smc0 a(Intent intent) {
        smc0 smc0VarN = k4p1.n();
        String action = intent.getAction();
        Bundle bundle = (Bundle) ((kf10) ((r7n0) this.a.get()).b.getValue()).b.getValue();
        String string = bundle != null ? bundle.getString("com.facebook.sdk.ApplicationId") : null;
        if (string == null) {
            string = "";
        }
        if (u890.j(action, "com.facebook.application.".concat(string))) {
            smc0VarN.add(new ts80());
        }
        return k4p1.k(smc0VarN);
    }
}
