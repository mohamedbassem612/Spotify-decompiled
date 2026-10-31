package p;

import com.google.protobuf.Any;
import com.spotify.address.endpoint.model.v1.proto.GetFormResponse;
import com.spotify.checkout.proto.model.v1.proto.FollowLinkCta;
import com.spotify.checkout.proto.model.v1.proto.GetSpotifyCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.Image;
import com.spotify.checkout.proto.model.v1.proto.LineItem;
import com.spotify.checkout.proto.model.v1.proto.ProductBreakdown;
import com.spotify.checkout.proto.model.v1.proto.SpotifyCheckoutNative;
import com.spotify.checkout.proto.model.v1.proto.Timeline;
import com.spotify.checkout.proto.model.v1.proto.h0;
import com.spotify.checkout.proto.model.v1.proto.h1;
import com.spotify.checkout.proto.model.v1.proto.m0;
import com.spotify.checkout.proto.model.v1.proto.m1;
import com.spotify.checkout.proto.model.v1.proto.n0;
import com.spotify.checkout.proto.model.v1.proto.n1;
import com.spotify.checkout.proto.model.v1.proto.p0;
import com.spotify.checkout.proto.model.v1.proto.q0;
import com.spotify.checkout.proto.model.v1.proto.r0;
import com.spotify.checkout.proto.model.v1.proto.s0;
import com.spotify.checkout.proto.model.v1.proto.t0;
import com.spotify.checkout.proto.model.v1.proto.u0;
import com.spotify.checkout.proto.model.v1.proto.v0;
import com.spotify.checkout.proto.model.v1.proto.w0;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tbm0 extends hab0 implements iu30 {
    public final /* synthetic */ RetrofitMaker a;
    public final /* synthetic */ dma1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbm0(RetrofitMaker retrofitMaker, dma1 dma1Var) {
        super(1);
        this.a = retrofitMaker;
        this.b = dma1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        cbm0 cbm0Var = cbm0.a;
        fns fnsVar = igu.a;
        GetFormResponse getFormResponse = (GetFormResponse) jo31.t(o6x.a, new lbm0(cbm0.c(this.a, this.b, b3s.c), null, (byte) 2));
        hq40 hq40VarT = GetSpotifyCheckoutPageResponse.t();
        v0 v0VarE = SpotifyCheckoutNative.E();
        i630 i630VarQ = FollowLinkCta.q();
        i630VarQ.q("Change plan");
        i630VarQ.n("http://spotify.com/logout/");
        v0VarE.r((FollowLinkCta) i630VarQ.build());
        v0VarE.t("Update your subscription");
        h0 h0VarR = LineItem.r();
        m0 m0VarW = LineItem.SimpleLineItem.w();
        n0 n0VarT = LineItem.SimpleLineItem.Header.t();
        n0VarT.t("Premium Family");
        n0VarT.s("6 Premium accounts");
        op70 op70VarP = Image.p();
        op70VarP.q("https://checkout.spotifycdn.com/static/images/product-images/recurring_premium.png");
        op70VarP.n("some alt");
        n0VarT.n((Image) op70VarP.build());
        m0VarW.q(n0VarT);
        m1 m1VarO = Timeline.o();
        n1 n1VarO = Timeline.TimelineItem.o();
        n1VarO.q(true);
        n1VarO.n("<b>Now:</b> Keep Individual until the end of the current billing cycle.");
        n1 n1VarO2 = Timeline.TimelineItem.o();
        n1VarO2.q(false);
        n1VarO2.n("<b>Starting DD/MM/YY:</b> You’ll be charged $12.99 for Premium Family every month.");
        m1VarO.n(p7h.M(new Timeline.TimelineItem[]{n1VarO.build(), n1VarO2.build()}));
        m0VarW.u((Timeline) m1VarO.build());
        t0 t0VarT = ProductBreakdown.t();
        t0VarT.r();
        t0VarT.s("$17.98");
        s0 s0VarR = ProductBreakdown.BreakdownGroup.r();
        r0 r0VarR = ProductBreakdown.BreakdownGroup.BreakdownRow.r();
        r0VarR.q("Premium Individual");
        r0VarR.r("$12.99");
        q0 q0Var = q0.STRIKETHROUGH;
        r0VarR.s(q0Var);
        r0 r0VarR2 = ProductBreakdown.BreakdownGroup.BreakdownRow.r();
        r0VarR2.q("Some product");
        r0VarR2.r("$4.99");
        r0VarR2.s(q0.DEFAULT);
        s0VarR.n(p7h.M(new ProductBreakdown.BreakdownGroup.BreakdownRow[]{r0VarR.build(), r0VarR2.build()}));
        s0VarR.q(p0.DEFAULT);
        s0 s0VarR2 = ProductBreakdown.BreakdownGroup.r();
        r0 r0VarR3 = ProductBreakdown.BreakdownGroup.BreakdownRow.r();
        r0VarR3.q("Basic Individual");
        r0VarR3.r("$6.99");
        q0 q0Var2 = q0.ADDED;
        r0VarR3.s(q0Var2);
        s0VarR2.n(Collections.singletonList(r0VarR3.build()));
        p0 p0Var = p0.HIGHLIGHTED;
        s0VarR2.q(p0Var);
        s0 s0VarR3 = ProductBreakdown.BreakdownGroup.r();
        r0 r0VarR4 = ProductBreakdown.BreakdownGroup.BreakdownRow.r();
        r0VarR4.q("Some product");
        r0VarR4.r("- $4.99");
        r0VarR4.s(q0.REMOVED);
        s0VarR3.n(Collections.singletonList(r0VarR4.build()));
        s0VarR3.q(p0Var);
        s0 s0VarR4 = ProductBreakdown.BreakdownGroup.r();
        r0 r0VarR5 = ProductBreakdown.BreakdownGroup.BreakdownRow.r();
        r0VarR5.q("Premium Individual");
        r0VarR5.r("$12.99");
        r0VarR5.s(q0Var);
        r0 r0VarR6 = ProductBreakdown.BreakdownGroup.BreakdownRow.r();
        r0VarR6.q("More complex example");
        r0VarR6.r("$4.99");
        r0VarR6.n("+ taxxx");
        r0VarR6.s(q0Var2);
        s0VarR4.n(p7h.M(new ProductBreakdown.BreakdownGroup.BreakdownRow[]{r0VarR5.build(), r0VarR6.build()}));
        s0VarR4.q(p0Var);
        t0VarT.n(p7h.M(new ProductBreakdown.BreakdownGroup[]{s0VarR.build(), s0VarR2.build(), s0VarR3.build(), s0VarR4.build()}));
        m0VarW.t((ProductBreakdown) t0VarT.build());
        h0VarR.q((LineItem.SimpleLineItem) m0VarW.build());
        v0VarE.s((LineItem) h0VarR.build());
        u0 u0VarP = SpotifyCheckoutNative.AddressSection.p();
        u0VarP.r();
        u0VarP.q();
        ih5 ih5VarR = Any.r();
        ih5VarR.n(getFormResponse.n().toByteString());
        u0VarP.n(ih5VarR);
        v0VarE.n(u0VarP);
        w0 w0VarW = SpotifyCheckoutNative.PaymentSection.w();
        w0VarW.s("Payment method");
        w0VarW.q(ubm0.m);
        w0VarW.n(ubm0.n);
        v0VarE.v((SpotifyCheckoutNative.PaymentSection) w0VarW.build());
        v0VarE.w();
        h1 h1VarT = SpotifyCheckoutNative.UpdateSubscriptionCta.t();
        h1VarT.q("Complete purchase");
        v0VarE.z((SpotifyCheckoutNative.UpdateSubscriptionCta) h1VarT.build());
        hq40VarT.t(v0VarE);
        return (GetSpotifyCheckoutPageResponse) hq40VarT.build();
    }
}
