package p;

import com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity;
import com.spotify.checkout.spotifycheckout.events.proto.CPHostedCheckoutPaymentStepLoaded;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w2b1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SpotifyCheckoutActivity b;

    public /* synthetic */ w2b1(SpotifyCheckoutActivity spotifyCheckoutActivity, byte b) {
        this.a = b;
        this.b = spotifyCheckoutActivity;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        SpotifyCheckoutActivity spotifyCheckoutActivity = this.b;
        switch (b) {
            case 0:
                c8e0 c8e0Var = (c8e0) obj;
                yt91 yt91Var = spotifyCheckoutActivity.m1;
                if (yt91Var == null) {
                    u890.C("tracking");
                    throw null;
                }
                String str = c8e0Var.a;
                t2j0 t2j0Var = (t2j0) yt91Var.b;
                boc bocVarN = CPHostedCheckoutPaymentStepLoaded.n();
                bocVarN.n((String) yt91Var.c);
                bocVarN.q(str);
                t2j0Var.a(bocVarN.build());
                return;
            case 1:
                rpw rpwVar = (rpw) obj;
                int i = SpotifyCheckoutActivity.D1;
                spotifyCheckoutActivity.m0().U(new jyz(rpwVar.a, rpwVar.b));
                return;
            case 2:
                int i2 = SpotifyCheckoutActivity.D1;
                spotifyCheckoutActivity.m0().U(pzz.a);
                return;
            case 3:
                int i3 = SpotifyCheckoutActivity.D1;
                spotifyCheckoutActivity.m0().U(f500.a);
                return;
            case 4:
                int i4 = SpotifyCheckoutActivity.D1;
                spotifyCheckoutActivity.m0().U(new rvz((k12) obj));
                return;
            case 5:
                int i5 = SpotifyCheckoutActivity.D1;
                spotifyCheckoutActivity.m0().U(svz.a);
                return;
            default:
                int i6 = SpotifyCheckoutActivity.D1;
                spotifyCheckoutActivity.m0().U(tvz.a);
                return;
        }
    }
}
