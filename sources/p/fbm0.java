package p;

import com.spotify.checkout.proto.model.v1.proto.Error;
import com.spotify.checkout.proto.model.v1.proto.GetSpotifyCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.j;
import com.spotify.checkout.proto.model.v1.proto.k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fbm0 extends hab0 implements iu30 {
    public static final fbm0 a = new fbm0(1);

    public final Object invoke(Object obj) {
        hq40 hq40VarT = GetSpotifyCheckoutPageResponse.t();
        j jVarT = Error.t();
        jVarT.u("Error close");
        jVarT.t("This error only has a close CTA");
        k kVarP = Error.CloseCta.p();
        kVarP.n("close");
        jVarT.n(kVarP);
        hq40VarT.r(jVarT);
        return (GetSpotifyCheckoutPageResponse) hq40VarT.build();
    }
}
