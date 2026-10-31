package p;

import com.spotify.checkout.proto.model.v1.proto.GetSpotifyCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.SpotifyCheckoutNative;
import com.spotify.checkout.proto.model.v1.proto.f1;
import com.spotify.checkout.proto.model.v1.proto.v0;
import com.spotify.checkout.proto.model.v1.proto.w0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kbm0 extends hab0 implements iu30 {
    public static final kbm0 a = new kbm0(1);

    public final Object invoke(Object obj) {
        hq40 hq40VarT = GetSpotifyCheckoutPageResponse.t();
        v0 v0VarE = SpotifyCheckoutNative.E();
        v0VarE.s(ubm0.c);
        v0VarE.t("No Address");
        v0VarE.q(ubm0.g);
        v0VarE.r(ubm0.h);
        w0 w0VarW = SpotifyCheckoutNative.PaymentSection.w();
        w0VarW.s("Payment");
        v0VarE.v((SpotifyCheckoutNative.PaymentSection) w0VarW.build());
        f1 f1VarA = SpotifyCheckoutNative.SummarySection.A();
        f1VarA.s();
        v0VarE.y((SpotifyCheckoutNative.SummarySection) f1VarA.build());
        v0VarE.w();
        hq40VarT.t(v0VarE);
        return (GetSpotifyCheckoutPageResponse) hq40VarT.build();
    }
}
