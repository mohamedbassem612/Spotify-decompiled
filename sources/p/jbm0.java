package p;

import com.spotify.checkout.proto.model.v1.proto.GetSessionStatusRequest;
import com.spotify.checkout.proto.model.v1.proto.GetSpotifyCheckoutPageRequest;
import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutRequest;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jbm0 implements g3b1 {
    public final /* synthetic */ g3b1 a;
    public final /* synthetic */ short b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public jbm0(g3b1 g3b1Var, long j, iu30 iu30Var) {
        this.b = (int) j;
        this.c = iu30Var;
        this.a = g3b1Var;
    }

    @Override // p.g3b1
    public final Single a(SubmitCheckoutRequest submitCheckoutRequest) {
        return Single.fromCallable(new e71(this.c, submitCheckoutRequest, (byte) 15)).delay(this.b, TimeUnit.MILLISECONDS);
    }

    @Override // p.g3b1
    public final Single b(GetSessionStatusRequest getSessionStatusRequest) {
        return this.a.b(getSessionStatusRequest);
    }

    @Override // p.g3b1
    public final Single c(GetSpotifyCheckoutPageRequest getSpotifyCheckoutPageRequest) {
        return Single.fromCallable(a3n.c);
    }
}
