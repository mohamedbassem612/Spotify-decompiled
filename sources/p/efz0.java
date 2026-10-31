package p;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.login.loginflowimpl.QuickLoginActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class efz0 implements oh30 {
    public final /* synthetic */ QuickLoginActivity a;

    public efz0(QuickLoginActivity quickLoginActivity) {
        this.a = quickLoginActivity;
    }

    public final void onBackStackChanged() {
        dg30 dg30Var = this.a;
        if (dg30Var.e1 && dg30Var.U0.t().L() == 0) {
            Logger.d("QuickLoginActivity - Fragment backstack is empty after login navigation. Login flow ended without reaching authenticated state.", new Object[0]);
            dg30Var.setResult(0, new Intent().putExtra("loginFailureReason", "backstack_empty"));
            dg30Var.finish();
        }
    }
}
