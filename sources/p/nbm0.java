package p;

import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutResponse;
import com.spotify.checkout.proto.model.v1.proto.i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nbm0 extends hab0 implements iu30 {
    public static final nbm0 a = new nbm0(1);

    public final Object invoke(Object obj) {
        i1 i1VarT = SubmitCheckoutResponse.t();
        i1VarT.s(SubmitCheckoutResponse.Success.n());
        return (SubmitCheckoutResponse) i1VarT.build();
    }
}
