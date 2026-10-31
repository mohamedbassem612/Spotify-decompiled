package p;

import com.spotify.checkout.proto.model.v1.proto.GetSpotifyCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.SpotifyCheckoutNative;
import com.spotify.checkout.proto.model.v1.proto.TimelineV2;
import com.spotify.checkout.proto.model.v1.proto.v0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qbm0 extends hab0 implements iu30 {
    public static final qbm0 a = new qbm0(1);

    public final Object invoke(Object obj) {
        hq40 hq40VarT = GetSpotifyCheckoutPageResponse.t();
        v0 v0VarE = SpotifyCheckoutNative.E();
        ubm0 ubm0Var = ubm0.a;
        TimelineV2 timelineV2 = ubm0.f;
        v0VarE.s(ubm0.b(timelineV2, true));
        v0VarE.t("No Address");
        v0VarE.q(ubm0.g);
        v0VarE.r(ubm0.h);
        v0VarE.u(ubm0.o);
        v0VarE.x(ubm0.e(timelineV2));
        v0VarE.w();
        hq40VarT.t(v0VarE);
        return (GetSpotifyCheckoutPageResponse) hq40VarT.build();
    }
}
