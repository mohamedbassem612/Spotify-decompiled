package p;

import com.google.protobuf.Any;
import com.spotify.address.endpoint.model.v1.proto.GetFormResponse;
import com.spotify.checkout.proto.model.v1.proto.GetSpotifyCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.SpotifyCheckoutNative;
import com.spotify.checkout.proto.model.v1.proto.f1;
import com.spotify.checkout.proto.model.v1.proto.u0;
import com.spotify.checkout.proto.model.v1.proto.v0;
import com.spotify.checkout.proto.model.v1.proto.w0;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mbm0 extends hab0 implements iu30 {
    public final /* synthetic */ RetrofitMaker a;
    public final /* synthetic */ dma1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbm0(RetrofitMaker retrofitMaker, dma1 dma1Var) {
        super(1);
        this.a = retrofitMaker;
        this.b = dma1Var;
    }

    public final Object invoke(Object obj) {
        cbm0 cbm0Var = cbm0.a;
        fns fnsVar = igu.a;
        GetFormResponse getFormResponse = (GetFormResponse) jo31.t(o6x.a, new lbm0(cbm0.c(this.a, this.b, b3s.c), null, (byte) 0));
        hq40 hq40VarT = GetSpotifyCheckoutPageResponse.t();
        v0 v0VarE = SpotifyCheckoutNative.E();
        v0VarE.t("Require Address");
        v0VarE.s(ubm0.c);
        u0 u0VarP = SpotifyCheckoutNative.AddressSection.p();
        u0VarP.r();
        u0VarP.q();
        ih5 ih5VarR = Any.r();
        ih5VarR.n(getFormResponse.n().toByteString());
        u0VarP.n(ih5VarR);
        v0VarE.n(u0VarP);
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
