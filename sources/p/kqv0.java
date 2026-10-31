package p;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kqv0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PremiumCheckoutActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kqv0(PremiumCheckoutActivity premiumCheckoutActivity, byte b) {
        super(0);
        this.a = b;
        this.b = premiumCheckoutActivity;
    }

    public final Object invoke() {
        byte b = this.a;
        gj5 gj5Var = this.b;
        switch (b) {
            case 0:
                iqv0 iqv0Var = PremiumCheckoutActivity.o1;
                mqv0 mqv0Var = (mqv0) ila0.s(gj5Var.getIntent(), "EXTRA_ARGS", mqv0.class);
                if (mqv0Var != null) {
                    return mqv0Var;
                }
                hhg1.n("Required value was null.");
                return null;
            case 1:
                return (Button) gj5Var.findViewById(2131430685);
            case 2:
                return (ViewGroup) gj5Var.findViewById(2131428733);
            case 3:
                return (ProgressBar) gj5Var.findViewById(2131429838);
            case 4:
                return gj5Var.findViewById(2131430703);
            case 5:
                return gj5Var.o();
            case 6:
                return gj5Var.O();
            default:
                lrv0 lrv0Var = gj5Var.b1;
                if (lrv0Var != null) {
                    return lrv0Var;
                }
                u890.C("premiumCheckoutVmFactory");
                throw null;
        }
    }
}
