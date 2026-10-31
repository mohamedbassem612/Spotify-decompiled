package p;

import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageRequest;
import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.n;
import com.spotify.checkout.proto.model.v1.proto.z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dcm0 extends hab0 implements iu30 {
    public static final dcm0 a = new dcm0(1);

    public final Object invoke(Object obj) {
        n nVarW = GetCheckoutPageResponse.w();
        String strN = ((GetCheckoutPageRequest) obj).n();
        z zVarP = GetCheckoutPageResponse.SpotifyCheckout.p();
        zVarP.n("https://payments.spotify.com/checkout/" + strN + "?skip=spotify");
        nVarW.u((GetCheckoutPageResponse.SpotifyCheckout) zVarP.build());
        return (GetCheckoutPageResponse) nVarW.build();
    }
}
