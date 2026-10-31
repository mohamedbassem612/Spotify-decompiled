package p;

import com.spotify.checkout.proto.model.v1.proto.GetSessionStatusRequest;
import com.spotify.checkout.proto.model.v1.proto.GetSessionStatusResponse;
import com.spotify.checkout.proto.model.v1.proto.GetSpotifyCheckoutPageRequest;
import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutRequest;
import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutResponse;
import com.spotify.checkout.proto.model.v1.proto.i1;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ibm0 implements g3b1 {
    public final /* synthetic */ short a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public ibm0(long j, iu30 iu30Var) {
        this.a = (int) j;
        this.b = iu30Var;
    }

    @Override // p.g3b1
    public final Single a(SubmitCheckoutRequest submitCheckoutRequest) {
        i1 i1VarT = SubmitCheckoutResponse.t();
        i1VarT.s(SubmitCheckoutResponse.Success.n());
        return Single.just(i1VarT.build());
    }

    @Override // p.g3b1
    public final Single b(GetSessionStatusRequest getSessionStatusRequest) {
        zp40 zp40VarP = GetSessionStatusResponse.p();
        zp40VarP.n();
        return Single.just(zp40VarP.build());
    }

    @Override // p.g3b1
    public final Single c(GetSpotifyCheckoutPageRequest getSpotifyCheckoutPageRequest) {
        return Single.fromCallable(new e71(this.b, getSpotifyCheckoutPageRequest, (byte) 14)).delay(this.a, TimeUnit.MILLISECONDS);
    }
}
