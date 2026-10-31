package p;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ser {
    public final e831 a;
    public final ux70 b;

    public ser(e831 e831Var, ux70 ux70Var) {
        this.a = e831Var;
        this.b = ux70Var;
    }

    public final void a(String str, String str2, Bundle bundle) {
        Activity activityA = this.a.a();
        if (activityA != null) {
            activityA.runOnUiThread(new n9m(this, activityA, str2, str, bundle, (byte) 1));
        }
    }
}
