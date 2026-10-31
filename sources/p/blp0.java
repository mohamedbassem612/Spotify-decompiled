package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class blp0 implements eyf0 {
    public final zor a;

    public blp0(clp0 clp0Var, zor zorVar) {
        this.a = zorVar;
    }

    public final void a(Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            if (action.equals("OFF_NETWORK_CLICK")) {
                zor.i(this.a, null, 6);
            } else {
                action.equals("OFF_NETWORK_CANCEL");
            }
        }
    }
}
