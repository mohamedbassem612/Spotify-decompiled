package p;

import com.spotify.checkout.proto.model.v1.proto.SpotifyCheckoutNative;
import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutResponse;
import com.spotify.checkout.proto.model.v1.proto.i1;
import com.spotify.checkout.proto.model.v1.proto.j1;
import com.spotify.checkout.proto.model.v1.proto.l1;
import com.spotify.checkout.proto.model.v1.proto.v0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class obm0 extends hab0 implements iu30 {
    public static final obm0 a = new obm0(1);

    public final Object invoke(Object obj) {
        i1 i1VarT = SubmitCheckoutResponse.t();
        l1 l1VarR = SubmitCheckoutResponse.UpdateSpotifyCheckout.r();
        v0 v0VarE = SpotifyCheckoutNative.E();
        v0VarE.s(ubm0.c);
        v0VarE.t("Updated Spotify Checkout");
        v0VarE.q(ubm0.g);
        v0VarE.r(ubm0.h);
        v0VarE.w();
        l1VarR.q(v0VarE);
        j1 j1VarR = SubmitCheckoutResponse.Dialog.r();
        j1VarR.r();
        j1VarR.n(p7h.M(new String[]{"Lorem Ipsum is simply dummy text of the printing and typesetting industry.", "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s."}));
        j1VarR.q();
        l1VarR.n(j1VarR);
        i1VarT.t(l1VarR);
        return (SubmitCheckoutResponse) i1VarT.build();
    }
}
