package p;

import com.spotify.checkout.proto.model.v1.proto.CheckoutStatus;
import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.h;
import com.spotify.checkout.proto.model.v1.proto.i;
import com.spotify.checkout.proto.model.v1.proto.n;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ybm0 extends hab0 implements iu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybm0(String str, String str2) {
        super(1);
        this.a = str;
        this.b = str2;
    }

    public final Object invoke(Object obj) {
        n nVarW = GetCheckoutPageResponse.w();
        h hVarQ = CheckoutStatus.q();
        hVarQ.s(this.a);
        hVarQ.r(this.b);
        i iVarP = CheckoutStatus.CloseCta.p();
        iVarP.n("Go back");
        hVarQ.n(iVarP);
        nVarW.q((CheckoutStatus) hVarQ.build());
        return (GetCheckoutPageResponse) nVarW.build();
    }
}
