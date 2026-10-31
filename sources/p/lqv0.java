package p;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class lqv0 implements rjp0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PremiumCheckoutActivity b;

    public /* synthetic */ lqv0(PremiumCheckoutActivity premiumCheckoutActivity, byte b) {
        this.a = b;
        this.b = premiumCheckoutActivity;
    }

    public final void b(Object obj) {
        byte b = this.a;
        PremiumCheckoutActivity premiumCheckoutActivity = this.b;
        switch (b) {
            case 0:
                idd1 idd1Var = premiumCheckoutActivity.h1;
                idd1 idd1Var2 = premiumCheckoutActivity.i1;
                iqv0 iqv0Var = PremiumCheckoutActivity.o1;
                prv0 prv0Var = ((grv0) obj).a;
                if ((prv0Var instanceof orv0) || (prv0Var instanceof nrv0)) {
                    ((ProgressBar) idd1Var.getValue()).setVisibility(0);
                    ((ViewGroup) idd1Var2.getValue()).setVisibility(8);
                } else if (!(prv0Var instanceof mrv0)) {
                    eg.o();
                } else {
                    ((ViewGroup) idd1Var2.getValue()).setVisibility(0);
                    ((ProgressBar) idd1Var.getValue()).setVisibility(8);
                    ((Button) premiumCheckoutActivity.j1.getValue()).setOnClickListener(new hid0(premiumCheckoutActivity, (byte) 15));
                }
                break;
            case 1:
                iqv0 iqv0Var2 = PremiumCheckoutActivity.o1;
                premiumCheckoutActivity.l0((sqv0) obj);
                break;
            default:
                iqv0 iqv0Var3 = PremiumCheckoutActivity.o1;
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    premiumCheckoutActivity.l0((sqv0) it.next());
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new tv30(1, this.b, PremiumCheckoutActivity.class, "render", "render(Lcom/spotify/checkout/premiumcheckout/domain/PremiumCheckoutModel;)V", 0);
            case 1:
                return new tv30(1, this.b, PremiumCheckoutActivity.class, "trigger", "trigger(Lcom/spotify/checkout/premiumcheckout/domain/PremiumCheckoutEffect$ViewEffect;)V", 0);
            default:
                return new tv30(1, this.b, PremiumCheckoutActivity.class, "triggerAfterPause", "triggerAfterPause(Ljava/lang/Iterable;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
