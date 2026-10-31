package p;

import com.spotify.payment.callback.PaymentCallbackActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class was0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PaymentCallbackActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ was0(PaymentCallbackActivity paymentCallbackActivity, byte b) {
        super(0);
        this.a = b;
        this.b = paymentCallbackActivity;
    }

    public final Object invoke() {
        byte b = this.a;
        PaymentCallbackActivity paymentCallbackActivity = this.b;
        switch (b) {
            case 0:
                return paymentCallbackActivity.o();
            case 1:
                return paymentCallbackActivity.O();
            default:
                rlk1 rlk1Var = paymentCallbackActivity.c1;
                if (rlk1Var != null) {
                    return rlk1Var;
                }
                u890.C("vmFactory");
                throw null;
        }
    }
}
