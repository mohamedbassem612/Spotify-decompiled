package p;

import android.app.Activity;
import android.os.Build;
import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g69 implements f69 {
    public final g1f0 a;
    public final AutofillManager b;

    public g69(Activity activity, g1f0 g1f0Var, ohv0 ohv0Var) {
        AutofillManager autofillManager;
        this.a = g1f0Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.b = qpp0.i(activity.getSystemService(qpp0.k()));
            g1f0Var.j();
        }
        ohv0Var.a(new khv0("start_intent_led", "autofill_enabled", sqg0.J(new mmr0[]{new mmr0("enabled", String.valueOf(g1f0Var.j())), new mmr0("enabled_on_device", String.valueOf(i >= 26 && (autofillManager = this.b) != null && autofillManager.isEnabled())), new mmr0("supported_by_device", String.valueOf(i >= 26))})));
    }

    public final boolean a() {
        AutofillManager autofillManager;
        return this.a.j() && Build.VERSION.SDK_INT >= 26 && (autofillManager = this.b) != null && autofillManager.isEnabled();
    }
}
