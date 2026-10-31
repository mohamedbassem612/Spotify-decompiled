package p;

import com.spotify.checkout.proto.model.v1.proto.GetSpotifyCheckoutPageResponse;
import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mve0 {
    public static Next a(nhm0 nhm0Var, GetSpotifyCheckoutPageResponse getSpotifyCheckoutPageResponse) {
        String str;
        int iR = getSpotifyCheckoutPageResponse.r();
        int i = iR == 0 ? -1 : kve0.a[l1d.C(iR)];
        h3b1 h3b1Var = h3b1.d;
        switch (i) {
            case -1:
            case 6:
                switch (getSpotifyCheckoutPageResponse.r()) {
                    case 1:
                        str = "SPOTIFY_CHECKOUT_NATIVE";
                        break;
                    case 2:
                        str = "CHECKOUT_ITEM_UNAVAILABLE";
                        break;
                    case 3:
                        str = "CHECKOUT_STATUS";
                        break;
                    case 4:
                        str = "REDIRECT";
                        break;
                    case 5:
                        str = "ERROR";
                        break;
                    case 6:
                        str = "RESPONSE_NOT_SET";
                        break;
                    default:
                        str = "null";
                        break;
                }
                hhg1.n("Unexpected response case ".concat(str));
                return null;
            case 0:
            default:
                eg.o();
                return null;
            case 1:
                return Next.i(new rgm0(getSpotifyCheckoutPageResponse.s(), ((nhm0Var instanceof rgm0) && ((rgm0) nhm0Var).b == qgm0.c && getSpotifyCheckoutPageResponse.s().B() && getSpotifyCheckoutPageResponse.s().u().u()) ? qgm0.e : qgm0.a, 4), Collections.singleton(dcw.a));
            case 2:
                return Next.i(new egm0(getSpotifyCheckoutPageResponse.n()), Collections.singleton(new xhw(h3b1Var)));
            case 3:
                return Next.i(new zfm0(getSpotifyCheckoutPageResponse.o()), Collections.singleton(new xhw(h3b1Var)));
            case 4:
                return Next.i(new xfm0(getSpotifyCheckoutPageResponse.p()), Collections.singleton(new xhw(h3b1Var)));
            case 5:
                return Next.a(f46.S0(new diw[]{new hhw(getSpotifyCheckoutPageResponse.q().getUrl()), new chw(h3b1Var)}));
        }
    }
}
