package p;

import com.spotify.checkout.proto.model.v1.proto.Error;
import com.spotify.checkout.proto.model.v1.proto.FollowLinkCta;
import com.spotify.checkout.proto.model.v1.proto.GetSpotifyCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.j;
import com.spotify.checkout.proto.model.v1.proto.l;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gbm0 extends hab0 implements iu30 {
    public static final gbm0 a = new gbm0(1);

    public final Object invoke(Object obj) {
        hq40 hq40VarT = GetSpotifyCheckoutPageResponse.t();
        j jVarT = Error.t();
        jVarT.u("Error double follow link");
        jVarT.t("This error only has TWO CTAs");
        l lVarQ = Error.DoubleFollowLinkCta.q();
        i630 i630VarQ = FollowLinkCta.q();
        i630VarQ.q("Amazing video");
        i630VarQ.n("https://www.youtube.com/watch?v=DJO_9auJhJQ");
        lVarQ.n(i630VarQ);
        i630 i630VarQ2 = FollowLinkCta.q();
        i630VarQ2.q("This one too");
        i630VarQ2.n("https://www.youtube.com/watch?v=evUfG3lrk5U");
        lVarQ.q(i630VarQ2);
        jVarT.q(lVarQ);
        hq40VarT.r(jVarT);
        return (GetSpotifyCheckoutPageResponse) hq40VarT.build();
    }
}
