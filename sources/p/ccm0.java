package p;

import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.n;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ccm0 extends hab0 implements iu30 {
    public final /* synthetic */ vsw0 a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccm0(vsw0 vsw0Var, String str) {
        super(1);
        this.a = vsw0Var;
        this.b = str;
    }

    public final Object invoke(Object obj) {
        n nVarW = GetCheckoutPageResponse.w();
        nVarW.s(ecm0.c(this.a, this.b));
        return (GetCheckoutPageResponse) nVarW.build();
    }
}
