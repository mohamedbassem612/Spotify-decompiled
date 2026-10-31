package p;

import com.spotify.gpb.googlecheckout.GoogleCheckoutActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e050 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ GoogleCheckoutActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e050(GoogleCheckoutActivity googleCheckoutActivity, byte b) {
        super(0);
        this.a = b;
        this.b = googleCheckoutActivity;
    }

    public final Object invoke() {
        byte b = this.a;
        g0i g0iVar = this.b;
        switch (b) {
            case 0:
                Object objS = ila0.s(g0iVar.getIntent(), "CHECKOUT_ARGS_PARAM", i050.class);
                if (objS != null) {
                    return (i050) objS;
                }
                hhg1.n("Required value was null.");
                return null;
            case 1:
                return g0iVar.o();
            case 2:
                return g0iVar.O();
            default:
                l150 l150Var = g0iVar.b1;
                if (l150Var != null) {
                    return l150Var;
                }
                u890.C("checkoutVMFactory");
                throw null;
        }
    }
}
