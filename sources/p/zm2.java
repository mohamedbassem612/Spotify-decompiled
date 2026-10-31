package p;

import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zm2 extends hab0 implements iu30 {
    public final /* synthetic */ an2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm2(an2 an2Var) {
        super(1);
        this.a = an2Var;
    }

    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (bundle != null) {
            wm2 wm2Var = Build.VERSION.SDK_INT >= 33 ? (wm2) bundle.getParcelable("age_verification_model_key", wm2.class) : (wm2) bundle.getParcelable("age_verification_model_key");
            if (wm2Var != null) {
                return wm2Var;
            }
        }
        dn2 dn2Var = this.a.b;
        return new wm2(dn2Var.a, dn2Var.b, dn2Var.c, false, false, dn2Var.d, null);
    }
}
