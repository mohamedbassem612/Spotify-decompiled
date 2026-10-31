package p;

import com.google.protobuf.Any;
import com.spotify.address.endpoint.model.v1.proto.GetFormResponse;
import com.spotify.checkout.proto.model.v1.proto.GetSpotifyCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.LineItem;
import com.spotify.checkout.proto.model.v1.proto.ProductBreakdown;
import com.spotify.checkout.proto.model.v1.proto.SpotifyCheckoutNative;
import com.spotify.checkout.proto.model.v1.proto.Timeline;
import com.spotify.checkout.proto.model.v1.proto.h0;
import com.spotify.checkout.proto.model.v1.proto.h1;
import com.spotify.checkout.proto.model.v1.proto.m0;
import com.spotify.checkout.proto.model.v1.proto.m1;
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
public final class sbm0 extends hab0 implements iu30 {
    public final /* synthetic */ RetrofitMaker a;
    public final /* synthetic */ dma1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbm0(RetrofitMaker retrofitMaker, dma1 dma1Var) {
        super(1);
        this.a = retrofitMaker;
        this.b = dma1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        cbm0 cbm0Var = cbm0.a;
        fns fnsVar = igu.a;
        GetFormResponse getFormResponse = (GetFormResponse) jo31.t(o6x.a, new lbm0(cbm0.c(this.a, this.b, b3s.c), null, (byte) 1));
        hq40 hq40VarT = GetSpotifyCheckoutPageResponse.t();
        v0 v0VarE = SpotifyCheckoutNative.E();
        v0VarE.t("Add to subscription");
        h0 h0VarR = LineItem.r();
        m0 m0VarW = LineItem.SimpleLineItem.w();
        m0VarW.n(Collections.singletonList("Your billing date will change because you’re updating your subscription. You can cancel anytime."));
        m1 m1VarO = Timeline.o();
        n1 n1VarO = Timeline.TimelineItem.o();
        n1VarO.q(true);
        n1VarO.n("<b>Now:</b> You won’t pay anything, but access to [Add-on Name] will start immediately. ");
        n1 n1VarO2 = Timeline.TimelineItem.o();
        n1VarO2.q(false);
        n1VarO2.n("<b>Starting DD/MM/YY:</b> $xx.99/month");
        m1VarO.n(p7h.M(new Timeline.TimelineItem[]{n1VarO.build(), n1VarO2.build()}));
        m0VarW.u((Timeline) m1VarO.build());
        t0 t0VarT = ProductBreakdown.t();
        t0VarT.r();
        t0VarT.s("$19.98");
        t0VarT.q();
        s0 s0VarR = ProductBreakdown.BreakdownGroup.r();
        r0 r0VarR = ProductBreakdown.BreakdownGroup.BreakdownRow.r();
        r0VarR.q("Premium Family");
        r0VarR.r("$19.99");
        r0VarR.n("+tax");
        q0 q0Var = q0.STRIKETHROUGH;
        r0VarR.s(q0Var);
        r0 r0VarR2 = ProductBreakdown.BreakdownGroup.BreakdownRow.r();
        r0VarR2.q("Premium some stuff");
        r0VarR2.r("$3.99");
        r0VarR2.s(q0Var);
        r0 r0VarR3 = ProductBreakdown.BreakdownGroup.BreakdownRow.r();
        r0VarR3.q("Premium duo");
        r0VarR3.r("$14.99");
        r0VarR3.s(q0.ADDED);
        s0VarR.n(p7h.M(new ProductBreakdown.BreakdownGroup.BreakdownRow[]{r0VarR.build(), r0VarR2.build(), r0VarR3.build()}));
        s0VarR.q(p0.HIGHLIGHTED);
        s0 s0VarR2 = ProductBreakdown.BreakdownGroup.r();
        r0 r0VarR4 = ProductBreakdown.BreakdownGroup.BreakdownRow.r();
        r0VarR4.q("Some product");
        r0VarR4.r("$4.99");
        r0VarR4.s(q0.DEFAULT);
        s0VarR2.n(Collections.singletonList(r0VarR4.build()));
        s0VarR2.q(p0.DEFAULT);
        t0VarT.n(p7h.M(new ProductBreakdown.BreakdownGroup[]{s0VarR.build(), s0VarR2.build()}));
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
        h1VarT.q("Add to subscription");
        v0VarE.z((SpotifyCheckoutNative.UpdateSubscriptionCta) h1VarT.build());
        hq40VarT.t(v0VarE);
        return (GetSpotifyCheckoutPageResponse) hq40VarT.build();
    }
}
