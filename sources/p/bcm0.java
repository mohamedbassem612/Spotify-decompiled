package p;

import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageRequest;
import com.spotify.checkout.proto.model.v1.proto.GetSessionStatusRequest;
import com.spotify.checkout.proto.model.v1.proto.GetSessionStatusResponse;
import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutRequest;
import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutResponse;
import com.spotify.checkout.proto.model.v1.proto.i1;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bcm0 implements t6g {
    public final /* synthetic */ iu30 a;

    public bcm0(iu30 iu30Var) {
        this.a = iu30Var;
    }

    @Override // p.t6g
    public final Single a(SubmitCheckoutRequest submitCheckoutRequest) {
        i1 i1VarT = SubmitCheckoutResponse.t();
        i1VarT.s(SubmitCheckoutResponse.Success.n());
        return Single.just(i1VarT.build()).delay(1L, TimeUnit.SECONDS);
    }

    @Override // p.t6g
    public final Single b(GetSessionStatusRequest getSessionStatusRequest) {
        return Single.just(GetSessionStatusResponse.n()).delay(1L, TimeUnit.SECONDS);
    }

    @Override // p.t6g
    public final Single c(GetCheckoutPageRequest getCheckoutPageRequest) {
        return Single.fromCallable(new e71(this.a, getCheckoutPageRequest, (byte) 16)).delay(1L, TimeUnit.SECONDS);
    }
}
