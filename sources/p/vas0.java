package p;

import com.spotify.payment.callback.PaymentCallbackActivity;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class vas0 implements rjp0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PaymentCallbackActivity b;

    public /* synthetic */ vas0(PaymentCallbackActivity paymentCallbackActivity, byte b) {
        this.a = b;
        this.b = paymentCallbackActivity;
    }

    public final void b(Object obj) {
        byte b = this.a;
        PaymentCallbackActivity paymentCallbackActivity = this.b;
        switch (b) {
            case 0:
                int i = PaymentCallbackActivity.g1;
                paymentCallbackActivity.n0((eiw) obj);
                break;
            default:
                int i2 = PaymentCallbackActivity.g1;
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    paymentCallbackActivity.n0((eiw) it.next());
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
                return new tv30(1, this.b, PaymentCallbackActivity.class, "trigger", "trigger(Lcom/spotify/payment/callback/data/Effect$ViewEffect;)V", 0);
            default:
                return new tv30(1, this.b, PaymentCallbackActivity.class, "triggerAfterPause", "triggerAfterPause(Ljava/lang/Iterable;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
