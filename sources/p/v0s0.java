package p;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v0s0 {
    public final th30 a;
    public final Intent b;

    public v0s0(th30 th30Var, Intent intent) {
        this.a = th30Var;
        this.b = intent;
    }

    public final void a() {
        th30 th30Var = this.a;
        th30Var.getClass();
        nu9 nu9Var = new nu9(th30Var);
        u0s0 u0s0Var = new u0s0();
        Bundle bundle = new Bundle();
        Intent intent = this.b;
        Bundle bundleExtra = intent.getBundleExtra("account_linking_bundle");
        if (bundleExtra != null) {
            bundle.putParcelable("account_linking_id", bundleExtra.getParcelable("account_linking_id"));
        }
        if (intent.getData() != null) {
            bundle.putString("data", intent.getDataString());
        }
        u0s0Var.T0(bundle);
        nu9Var.n(2131428943, u0s0Var, "partner_account_linking");
        nu9Var.f();
    }
}
