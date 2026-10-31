package p;

import com.google.protobuf.h;
import com.spotify.checkout.proto.model.v1.proto.ChangeCountry;
import com.spotify.checkout.proto.model.v1.proto.CheckoutItemUnavailable;
import com.spotify.checkout.proto.model.v1.proto.CheckoutStatus;
import com.spotify.checkout.proto.model.v1.proto.Error;
import com.spotify.checkout.proto.model.v1.proto.FollowLinkCta;
import com.spotify.checkout.proto.model.v1.proto.GetSpotifyCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.Image;
import com.spotify.checkout.proto.model.v1.proto.LineItem;
import com.spotify.checkout.proto.model.v1.proto.ProductBreakdown;
import com.spotify.checkout.proto.model.v1.proto.SpotifyCheckoutNative;
import com.spotify.checkout.proto.model.v1.proto.Timeline;
import com.spotify.checkout.proto.model.v1.proto.TimelineV2;
import com.spotify.checkout.proto.model.v1.proto.a;
import com.spotify.checkout.proto.model.v1.proto.a1;
import com.spotify.checkout.proto.model.v1.proto.b;
import com.spotify.checkout.proto.model.v1.proto.b1;
import com.spotify.checkout.proto.model.v1.proto.c;
import com.spotify.checkout.proto.model.v1.proto.d;
import com.spotify.checkout.proto.model.v1.proto.e;
import com.spotify.checkout.proto.model.v1.proto.f;
import com.spotify.checkout.proto.model.v1.proto.f1;
import com.spotify.checkout.proto.model.v1.proto.g;
import com.spotify.checkout.proto.model.v1.proto.g1;
import com.spotify.checkout.proto.model.v1.proto.h0;
import com.spotify.checkout.proto.model.v1.proto.h1;
import com.spotify.checkout.proto.model.v1.proto.i;
import com.spotify.checkout.proto.model.v1.proto.i0;
import com.spotify.checkout.proto.model.v1.proto.j;
import com.spotify.checkout.proto.model.v1.proto.j0;
import com.spotify.checkout.proto.model.v1.proto.k;
import com.spotify.checkout.proto.model.v1.proto.k0;
import com.spotify.checkout.proto.model.v1.proto.l0;
import com.spotify.checkout.proto.model.v1.proto.m;
import com.spotify.checkout.proto.model.v1.proto.m0;
import com.spotify.checkout.proto.model.v1.proto.m1;
import com.spotify.checkout.proto.model.v1.proto.n0;
import com.spotify.checkout.proto.model.v1.proto.n1;
import com.spotify.checkout.proto.model.v1.proto.o0;
import com.spotify.checkout.proto.model.v1.proto.o1;
import com.spotify.checkout.proto.model.v1.proto.p0;
import com.spotify.checkout.proto.model.v1.proto.p1;
import com.spotify.checkout.proto.model.v1.proto.q0;
import com.spotify.checkout.proto.model.v1.proto.q1;
import com.spotify.checkout.proto.model.v1.proto.r0;
import com.spotify.checkout.proto.model.v1.proto.r1;
import com.spotify.checkout.proto.model.v1.proto.s0;
import com.spotify.checkout.proto.model.v1.proto.t0;
import com.spotify.checkout.proto.model.v1.proto.v0;
import com.spotify.checkout.proto.model.v1.proto.w0;
import com.spotify.checkout.proto.model.v1.proto.x0;
import com.spotify.checkout.proto.model.v1.proto.z0;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ubm0 {
    public static final ubm0 a = new ubm0();
    public static final bma1 b = bma1.b.u("spotify_checkout_mock_endpoint_response");
    public static final LineItem c;
    public static final TimelineV2 d;
    public static final TimelineV2 e;
    public static final TimelineV2 f;
    public static final ChangeCountry g;
    public static final FollowLinkCta h;
    public static final GetSpotifyCheckoutPageResponse i;
    public static final j j;
    public static final CheckoutItemUnavailable k;
    public static final CheckoutStatus l;
    public static final SpotifyCheckoutNative.PaymentSection.CurrentPaymentDetails m;
    public static final List n;
    public static final w0 o;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        h hVarBuild;
        h0 h0VarR = LineItem.r();
        m0 m0VarW = LineItem.SimpleLineItem.w();
        n0 n0VarT = LineItem.SimpleLineItem.Header.t();
        op70 op70VarP = Image.p();
        op70VarP.q("https://checkout.spotifycdn.com/static/images/product-images/recurring_premium.png");
        op70VarP.n("some alt");
        n0VarT.n((Image) op70VarP.build());
        n0VarT.t("Premium Individual title that is very long and will take multiple lines");
        n0VarT.s("1 Premium account that will hopefully also take two lines");
        o0 o0VarR = LineItem.SimpleLineItem.Header.Price.r();
        o0VarR.q();
        o0VarR.r();
        n0VarT.q((LineItem.SimpleLineItem.Header.Price) o0VarR.build());
        m0VarW.r((LineItem.SimpleLineItem.Header) n0VarT.build());
        m0VarW.n(f46.i0(new String[]{"Monthly billing starting today", "Cancel anytime online. <a href=\"https://www.spotify.com/legal/privacy-policy\">Terms apply</a>"}));
        h0VarR.q((LineItem.SimpleLineItem) m0VarW.build());
        c = (LineItem) h0VarR.build();
        o1 o1VarR = TimelineV2.r();
        p1 p1VarP = TimelineV2.TimelineGroup.p();
        p1VarP.r("Now: <strong>$0</strong>");
        q1 q1VarQ = TimelineV2.TimelineGroup.TimelineItem.q();
        q1VarQ.r("Premium individual");
        r1 r1VarO = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.o();
        r1VarO.q("Audiobooks+");
        q1VarQ.n(Collections.singletonList(r1VarO.build()));
        p1VarP.n(Collections.singletonList(q1VarQ.build()));
        p1 p1VarP2 = TimelineV2.TimelineGroup.p();
        p1VarP2.r("Starting 01/02/2025: <strong>$19.98/month</strong>");
        q1 q1VarQ2 = TimelineV2.TimelineGroup.TimelineItem.q();
        q1VarQ2.r("Premium duo");
        r1 r1VarO2 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.o();
        r1VarO2.q("Audiobooks+");
        q1VarQ2.n(Collections.singletonList(r1VarO2.build()));
        p1VarP2.n(Collections.singletonList(q1VarQ2.build()));
        o1VarR.n(p7h.M(new TimelineV2.TimelineGroup[]{p1VarP.build(), p1VarP2.build()}));
        d = (TimelineV2) o1VarR.build();
        o1 o1VarR2 = TimelineV2.r();
        p1 p1VarP3 = TimelineV2.TimelineGroup.p();
        p1VarP3.r("<strong>Now: $0</strong>");
        q1 q1VarQ3 = TimelineV2.TimelineGroup.TimelineItem.q();
        q1VarQ3.r("Premium duo");
        r1 r1VarO3 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.o();
        r1VarO3.q("Audiobooks+");
        r1 r1VarO4 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.o();
        r1VarO4.q("Audiobooks+ for Plan Members");
        q1VarQ3.n(p7h.M(new TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem[]{r1VarO3.build(), r1VarO4.build()}));
        p1VarP3.n(Collections.singletonList(q1VarQ3.build()));
        p1 p1VarP4 = TimelineV2.TimelineGroup.p();
        p1VarP4.r("Starting 01/02/2025: <strong>$19.98/month</strong>");
        q1 q1VarQ4 = TimelineV2.TimelineGroup.TimelineItem.q();
        q1VarQ4.r("Premium Individual");
        r1 r1VarO5 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.o();
        r1VarO5.q("Audiobooks+");
        q1VarQ4.n(Collections.singletonList(r1VarO5.build()));
        q1 q1VarQ5 = TimelineV2.TimelineGroup.TimelineItem.q();
        q1VarQ5.r("Some other stuff");
        r1 r1VarO6 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.o();
        r1VarO6.q("Audiobooks+");
        r1 r1VarO7 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.o();
        r1VarO7.q("More nesting");
        q1VarQ5.n(p7h.M(new TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem[]{r1VarO6.build(), r1VarO7.build()}));
        p1VarP4.n(p7h.M(new TimelineV2.TimelineGroup.TimelineItem[]{q1VarQ4.build(), q1VarQ5.build()}));
        p1 p1VarP5 = TimelineV2.TimelineGroup.p();
        p1VarP5.r("Starting 01/02/2025: <strong>$17.99/months</strong>");
        q1 q1VarQ6 = TimelineV2.TimelineGroup.TimelineItem.q();
        q1VarQ6.r("Premium family");
        r1 r1VarO8 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.o();
        r1VarO8.q("Audiobooks+");
        r1 r1VarO9 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.o();
        r1VarO9.q("Audiobooks+ for fam plan members+");
        q1VarQ6.n(p7h.M(new TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem[]{r1VarO8.build(), r1VarO9.build()}));
        p1VarP5.n(Collections.singletonList(q1VarQ6.build()));
        o1VarR2.n(p7h.M(new TimelineV2.TimelineGroup[]{p1VarP3.build(), p1VarP4.build(), p1VarP5.build()}));
        e = (TimelineV2) o1VarR2.build();
        o1 o1VarR3 = TimelineV2.r();
        p1 p1VarP6 = TimelineV2.TimelineGroup.p();
        p1VarP6.r("<strong>Now</strong>");
        p1VarP6.q("$0.00");
        q1 q1VarQ7 = TimelineV2.TimelineGroup.TimelineItem.q();
        q1VarQ7.r("Premium individual");
        p1VarP6.n(Collections.singletonList(q1VarQ7.build()));
        p1 p1VarP7 = TimelineV2.TimelineGroup.p();
        p1VarP7.r("<strong>Starting 01/02/2025</strong>");
        p1VarP7.q("$19.98/month");
        q1 q1VarQ8 = TimelineV2.TimelineGroup.TimelineItem.q();
        q1VarQ8.r("Premium family for 12 months but could take a couple lines");
        q1VarQ8.q();
        r1 r1VarO10 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.o();
        r1VarO10.q("Product name");
        r1VarO10.n();
        r1 r1VarO11 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.o();
        r1VarO11.q("2x Audiobooks+ for Plan Members");
        q1VarQ8.n(p7h.M(new TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem[]{r1VarO10.build(), r1VarO11.build()}));
        p1VarP7.n(Collections.singletonList(q1VarQ8.build()));
        o1VarR3.n(p7h.M(new TimelineV2.TimelineGroup[]{p1VarP6.build(), p1VarP7.build()}));
        f = (TimelineV2) o1VarR3.build();
        a aVarQ = ChangeCountry.q();
        aVarQ.q();
        b bVarS = ChangeCountry.PickerForm.s();
        f fVarP = ChangeCountry.PickerForm.Cta.p();
        fVarP.n();
        bVarS.q(fVarP);
        bVarS.s();
        g gVarP = ChangeCountry.PickerForm.SearchInput.p();
        gVarP.n();
        bVarS.r(gVarP);
        Locale[] availableLocales = Locale.getAvailableLocales();
        ArrayList arrayList = new ArrayList();
        for (Locale locale : availableLocales) {
            if (!ihc1.y0(locale.getDisplayCountry())) {
                arrayList.add(locale);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((Locale) obj).getDisplayCountry())) {
                arrayList2.add(obj);
            }
        }
        List<Locale> listA1 = o7h.a1(arrayList2, new ktg0((byte) 1));
        ArrayList arrayList3 = new ArrayList(q7h.U(listA1, 10));
        for (Locale locale2 : listA1) {
            if (u890.j(locale2.getCountry(), "FR")) {
                d dVarR = ChangeCountry.PickerForm.CountryType.r();
                c cVarP = ChangeCountry.PickerForm.CountryType.Active.p();
                cVarP.n(locale2.getCountry());
                cVarP.q(locale2.getDisplayCountry());
                dVarR.n(cVarP);
                hVarBuild = dVarR.build();
            } else {
                d dVarR2 = ChangeCountry.PickerForm.CountryType.r();
                e eVarP = ChangeCountry.PickerForm.CountryType.Inactive.p();
                eVarP.n(locale2.getCountry());
                eVarP.q(locale2.getDisplayCountry());
                eVarP.r("https://simplelocalize.io/data/country/" + locale2.getCountry().toUpperCase(Locale.ROOT) + "/");
                dVarR2.q(eVarP);
                hVarBuild = dVarR2.build();
            }
            arrayList3.add((ChangeCountry.PickerForm.CountryType) hVarBuild);
        }
        bVarS.n(arrayList3);
        aVarQ.n(bVarS);
        g = (ChangeCountry) aVarQ.build();
        i630 i630VarQ = FollowLinkCta.q();
        i630VarQ.q("Change plan");
        i630VarQ.n("http://fast.com");
        h = (FollowLinkCta) i630VarQ.build();
        hq40 hq40VarT = GetSpotifyCheckoutPageResponse.t();
        v0 v0VarE = SpotifyCheckoutNative.E();
        v0VarE.t("Confirm changes to your subscription");
        h0 h0VarR2 = LineItem.r();
        m0 m0VarW2 = LineItem.SimpleLineItem.w();
        m1 m1VarO = Timeline.o();
        n1 n1VarO = Timeline.TimelineItem.o();
        n1VarO.q(true);
        n1VarO.n("<b>Current subscription:</b> $xx.99/month");
        n1 n1VarO2 = Timeline.TimelineItem.o();
        n1VarO2.q(false);
        n1VarO2.n("<b>Starting DD/MM/YY:</b> You’ll be charged $12.99 for Premium Family every month.");
        m1VarO.n(p7h.M(new Timeline.TimelineItem[]{n1VarO.build(), n1VarO2.build()}));
        m0VarW2.u((Timeline) m1VarO.build());
        m0VarW2.n(f46.i0(new String[]{"Canceling this add-on will change the price of your monthly subscription.", "Your subscription to [Add-on Name] will be canceled for 1 member."}));
        t0 t0VarT = ProductBreakdown.t();
        t0VarT.r();
        t0VarT.s("$17.98");
        s0 s0VarR = ProductBreakdown.BreakdownGroup.r();
        r0 r0VarR = ProductBreakdown.BreakdownGroup.BreakdownRow.r();
        r0VarR.q("Premium Family");
        r0VarR.r("$12.99");
        q0 q0Var = q0.DEFAULT;
        r0VarR.s(q0Var);
        r0 r0VarR2 = ProductBreakdown.BreakdownGroup.BreakdownRow.r();
        r0VarR2.q("2x Some product");
        r0VarR2.r("$4.99");
        r0VarR2.s(q0Var);
        s0VarR.n(p7h.M(new ProductBreakdown.BreakdownGroup.BreakdownRow[]{r0VarR.build(), r0VarR2.build()}));
        s0VarR.q(p0.DEFAULT);
        s0 s0VarR2 = ProductBreakdown.BreakdownGroup.r();
        r0 r0VarR3 = ProductBreakdown.BreakdownGroup.BreakdownRow.r();
        r0VarR3.q("Some product");
        r0VarR3.r("- $4.99");
        r0VarR3.s(q0.REMOVED);
        s0VarR2.n(Collections.singletonList(r0VarR3.build()));
        s0VarR2.q(p0.HIGHLIGHTED);
        t0VarT.n(p7h.M(new ProductBreakdown.BreakdownGroup[]{s0VarR.build(), s0VarR2.build()}));
        m0VarW2.t((ProductBreakdown) t0VarT.build());
        h0VarR2.q((LineItem.SimpleLineItem) m0VarW2.build());
        v0VarE.s((LineItem) h0VarR2.build());
        v0VarE.w();
        h1 h1VarT = SpotifyCheckoutNative.UpdateSubscriptionCta.t();
        h1VarT.q("Confirm");
        k kVarP = Error.CloseCta.p();
        kVarP.n("Not now");
        h1VarT.n((Error.CloseCta) kVarP.build());
        v0VarE.z((SpotifyCheckoutNative.UpdateSubscriptionCta) h1VarT.build());
        hq40VarT.t(v0VarE);
        i = (GetSpotifyCheckoutPageResponse) hq40VarT.build();
        j jVarT = Error.t();
        jVarT.u("Error link and close");
        jVarT.t("This error has a link or a close btn");
        m mVarQ = Error.PrimaryLinkSecondaryCloseCta.q();
        i630 i630VarQ2 = FollowLinkCta.q();
        i630VarQ2.q("Watch me");
        i630VarQ2.n("https://www.youtube.com/watch?v=nAJN1CrJsVE");
        mVarQ.n(i630VarQ2);
        k kVarP2 = Error.CloseCta.p();
        kVarP2.n("close");
        mVarQ.q(kVarP2);
        jVarT.s(mVarQ);
        j = jVarT;
        jwf jwfVarQ = CheckoutItemUnavailable.q();
        jwfVarQ.r("Item not available title");
        LineItem lineItem = c;
        h0 h0Var = (h0) lineItem.toBuilder();
        m0 m0Var = (m0) lineItem.o().toBuilder();
        m0Var.s();
        h0Var.n(m0Var);
        jwfVarQ.q((LineItem) h0Var.build());
        jwfVarQ.n("Go back");
        k = (CheckoutItemUnavailable) jwfVarQ.build();
        com.spotify.checkout.proto.model.v1.proto.h hVarQ = CheckoutStatus.q();
        hVarQ.s("Wrong checkout status");
        hVarQ.r("Something about the status being wrong");
        i iVarP = CheckoutStatus.CloseCta.p();
        iVarP.n("Ok then");
        hVarQ.q((CheckoutStatus.CloseCta) iVarP.build());
        l = (CheckoutStatus) hVarQ.build();
        x0 x0VarU = SpotifyCheckoutNative.PaymentSection.CurrentPaymentDetails.u();
        op70 op70VarP2 = Image.p();
        op70VarP2.q("https://wwwcheckout.spotifycdn.com/static/images/play-fop-logos/Visa.png");
        op70VarP2.n("some alt");
        x0VarU.n((Image) op70VarP2.build());
        x0VarU.r();
        x0VarU.q();
        i630 i630VarQ3 = FollowLinkCta.q();
        i630VarQ3.q("Change");
        i630VarQ3.n("https://www.youtube.com/watch?v=Q56PMJbCFXQ");
        x0VarU.s((FollowLinkCta) i630VarQ3.build());
        m = (SpotifyCheckoutNative.PaymentSection.CurrentPaymentDetails) x0VarU.build();
        z0 z0VarQ = SpotifyCheckoutNative.PaymentSection.LegalTerm.q();
        a1 a1Var = a1.CHECKBOX;
        z0VarQ.r(a1Var);
        z0VarQ.q("By purchasing this product you agree to Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque a massa id sapien sollicitudin rhoncus.");
        z0VarQ.n("Checkbox 1 not checked");
        z0 z0VarQ2 = SpotifyCheckoutNative.PaymentSection.LegalTerm.q();
        z0VarQ2.r(a1Var);
        z0VarQ2.q("Also, by purchasing this product you massa id sapien sollicitudin");
        z0VarQ2.n("Checkbox 2 not checked");
        z0 z0VarQ3 = SpotifyCheckoutNative.PaymentSection.LegalTerm.q();
        z0VarQ3.r(a1.CONSPICUOUS_CHECKBOX);
        z0VarQ3.q("conspicuous checkbox");
        z0VarQ3.n("Conspicuous checkbox not checked, <a href=\"https://support.spotify.com/\">see this link</a>");
        z0 z0VarQ4 = SpotifyCheckoutNative.PaymentSection.LegalTerm.q();
        a1 a1Var2 = a1.TEXT;
        z0VarQ4.r(a1Var2);
        z0VarQ4.q("Text <b>legal term</b>");
        z0 z0VarQ5 = SpotifyCheckoutNative.PaymentSection.LegalTerm.q();
        z0VarQ5.r(a1Var2);
        z0VarQ5.q("Another text <b>legal term</b>");
        z0 z0VarQ6 = SpotifyCheckoutNative.PaymentSection.LegalTerm.q();
        z0VarQ6.r(a1.CONSPICUOUS_TEXT);
        z0VarQ6.q("<b>Subscription terms:</b> Something about the subscription");
        n = p7h.M(new SpotifyCheckoutNative.PaymentSection.LegalTerm[]{z0VarQ.build(), z0VarQ2.build(), z0VarQ3.build(), z0VarQ4.build(), z0VarQ5.build(), z0VarQ6.build()});
        w0 w0VarW = SpotifyCheckoutNative.PaymentSection.w();
        w0VarW.s("Payment");
        b1 b1VarT = SpotifyCheckoutNative.PaymentSection.PaymentArgs.t();
        b1VarT.n();
        w0VarW.r(b1VarT);
        o = w0VarW;
    }

    public static g3b1 a(RetrofitMaker retrofitMaker, dma1 dma1Var) {
        ebm0 ebm0Var;
        try {
            ebm0Var = (ebm0) ebm0.d.get(dma1Var.l(b, 0));
        } catch (Throwable unused) {
            ebm0Var = ebm0.b;
        }
        return (g3b1) ebm0Var.a.invoke(retrofitMaker, dma1Var);
    }

    public static LineItem b(TimelineV2 timelineV2, boolean z) {
        h0 h0VarR = LineItem.r();
        i0 i0VarU = LineItem.LineItemV2.u();
        j0 j0VarU = LineItem.LineItemV2.Header.u();
        if (z) {
            op70 op70VarP = Image.p();
            op70VarP.q("https://checkout.spotifycdn.com/static/images/product-images/recurring_premium.png");
            op70VarP.n("some alt");
            j0VarU.n((Image) op70VarP.build());
        }
        j0VarU.s();
        j0VarU.r();
        k0 k0VarP = LineItem.PriceInfo.p();
        l0 l0VarP = LineItem.PriceInfo.PriceInfoV1.p();
        l0VarP.q();
        l0VarP.r();
        l0VarP.n();
        k0VarP.n((LineItem.PriceInfo.PriceInfoV1) l0VarP.build());
        j0VarU.q((LineItem.PriceInfo) k0VarP.build());
        i0VarU.q((LineItem.LineItemV2.Header) j0VarU.build());
        i0VarU.n(f46.i0(new String[]{"First additional product info", "Cancel anytime online. <a href=\"https://www.spotify.com/legal/privacy-policy\">Terms apply</a>"}));
        i0VarU.r(timelineV2);
        h0VarR.r((LineItem.LineItemV2) i0VarU.build());
        return (LineItem) h0VarR.build();
    }

    public static ibm0 c(ubm0 ubm0Var, iu30 iu30Var) {
        ubm0Var.getClass();
        return new ibm0(1000L, iu30Var);
    }

    public static jbm0 d(RetrofitMaker retrofitMaker, iu30 iu30Var) {
        ebm0 ebm0Var = ebm0.b;
        return new jbm0((g3b1) retrofitMaker.createWebgateService(g3b1.class, "android-system-checkout"), 1000L, iu30Var);
    }

    public static f1 e(TimelineV2 timelineV2) {
        f1 f1VarA = SpotifyCheckoutNative.SummarySection.A();
        f1VarA.s();
        g1 g1VarT = SpotifyCheckoutNative.SummarySection.ItemRow.t();
        g1VarT.t();
        op70 op70VarP = Image.p();
        op70VarP.q("https://checkout.spotifycdn.com/static/images/product-images/recurring_premium.png");
        op70VarP.n("some alt");
        g1VarT.n(op70VarP);
        g1VarT.s();
        g1VarT.q();
        g1VarT.r();
        f1VarA.q(g1VarT);
        f1VarA.r(timelineV2);
        f1VarA.n(f46.i0(new String[]{"First additional product info", "Cancel anytime online. <a href=\"https://www.spotify.com/legal/privacy-policy\">Terms apply</a>"}));
        f1VarA.t();
        f1VarA.u();
        return f1VarA;
    }
}
