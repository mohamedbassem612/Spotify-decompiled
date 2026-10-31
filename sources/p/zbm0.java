package p;

import com.google.protobuf.h;
import com.spotify.checkout.proto.model.v1.proto.Banner;
import com.spotify.checkout.proto.model.v1.proto.ChangeCountry;
import com.spotify.checkout.proto.model.v1.proto.FollowLinkCta;
import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageRequest;
import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.GetSpotifyCheckoutPageRequest;
import com.spotify.checkout.proto.model.v1.proto.GetSpotifyCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.Image;
import com.spotify.checkout.proto.model.v1.proto.SpotifyCheckoutNative;
import com.spotify.checkout.proto.model.v1.proto.a;
import com.spotify.checkout.proto.model.v1.proto.a0;
import com.spotify.checkout.proto.model.v1.proto.b;
import com.spotify.checkout.proto.model.v1.proto.b0;
import com.spotify.checkout.proto.model.v1.proto.c;
import com.spotify.checkout.proto.model.v1.proto.c0;
import com.spotify.checkout.proto.model.v1.proto.d;
import com.spotify.checkout.proto.model.v1.proto.d0;
import com.spotify.checkout.proto.model.v1.proto.e;
import com.spotify.checkout.proto.model.v1.proto.e0;
import com.spotify.checkout.proto.model.v1.proto.f;
import com.spotify.checkout.proto.model.v1.proto.f0;
import com.spotify.checkout.proto.model.v1.proto.g;
import com.spotify.checkout.proto.model.v1.proto.n;
import com.spotify.checkout.proto.model.v1.proto.v0;
import com.spotify.checkout.proto.model.v1.proto.y;
import com.spotify.checkout.proto.model.v1.proto.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zbm0 extends hab0 implements iu30 {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ vsw0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ xbm0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbm0(e0 e0Var, vsw0 vsw0Var, String str, List list, boolean z, int i, int i2, boolean z2, xbm0 xbm0Var) {
        super(1);
        this.a = e0Var;
        this.b = vsw0Var;
        this.c = str;
        this.d = list;
        this.e = z;
        this.f = i;
        this.g = i2;
        this.h = z2;
        this.i = xbm0Var;
    }

    public final Object invoke(Object obj) {
        h hVarBuild;
        n nVarW = GetCheckoutPageResponse.w();
        String strN = ((GetCheckoutPageRequest) obj).n();
        d0 d0VarE = GetCheckoutPageResponse.UcbCheckout.E();
        d0VarE.y();
        d0VarE.r();
        d0VarE.q();
        d0VarE.u(this.a);
        c0 c0VarA = GetCheckoutPageResponse.UcbCheckout.BillingProvider.A();
        c0VarA.t("Google Play");
        c0VarA.s("Pay through <b>Google Play</b> with any supported payment method.");
        a0 a0VarR = GetCheckoutPageResponse.UcbCheckout.AndMorePaymentMethodLogos.r();
        a0VarR.n(p7h.M(new Image[]{ecm0.a("https://wwwcheckout.spotifycdn.com/static/images/play-fop-logos/Play-gift-card.png"), ecm0.a("https://wwwcheckout.spotifycdn.com/static/images/play-fop-logos/Mastercard.png"), ecm0.a("https://wwwcheckout.spotifycdn.com/static/images/play-fop-logos/Visa.png"), ecm0.a("https://wwwcheckout.spotifycdn.com/static/images/play-fop-logos/Paypal.png")}));
        a0VarR.q();
        c0VarA.q((GetCheckoutPageResponse.UcbCheckout.AndMorePaymentMethodLogos) a0VarR.build());
        c0VarA.w("Continue with Google Play");
        c0VarA.u(ecm0.d(this.g, 6, true));
        c0VarA.n(Collections.singletonList("You’ll go to Google Play to finish purchasing your Premium plan. The Spotify <a href=\"https://www.spotify.com/legal/premium-promotional-offer-terms\">offer terms</a> and <a href=\"https://www.spotify.com/legal/privacy-policy\">privacy policy</a> apply. Google Play may also require you to agree to additional terms. Questions about your purchase should be directed to Google Play."));
        List list = this.d;
        if (!list.isEmpty()) {
            u4a u4aVarQ = Banner.q();
            u4aVarQ.q();
            u4aVarQ.r();
            u4aVarQ.n(list);
            c0VarA.r(u4aVarQ);
        }
        b0 b0VarO = GetCheckoutPageResponse.UcbCheckout.BillingProvider.BillingProviderTrackingData.o();
        b0VarO.n("BILLING_PROVIDER_GOOGLE_PLAY_BILLING");
        c0VarA.y(b0VarO);
        if (this.e) {
            c0VarA.x();
        }
        d0VarE.v((GetCheckoutPageResponse.UcbCheckout.BillingProvider) c0VarA.build());
        c0 c0VarA2 = GetCheckoutPageResponse.UcbCheckout.BillingProvider.A();
        c0VarA2.t("Spotify");
        c0VarA2.s("Pay through <b>Spotify</b> with any supported payment method.");
        f0 f0VarT = GetCheckoutPageResponse.UcbCheckout.PopOverPaymentMethodLogos.t();
        f0VarT.n(p7h.M(new Image[]{ecm0.a("https://wwwcheckout.spotifycdn.com/static/images/play-fop-logos/Mastercard.png"), ecm0.a("https://wwwcheckout.spotifycdn.com/static/images/play-fop-logos/Visa.png"), ecm0.a("https://wwwcheckout.spotifycdn.com/static/images/play-fop-logos/Paypal.png"), ecm0.a("https://paymentsdk.spotifycdn.com/png/cards/hiper_136.png")}));
        f0VarT.q(p7h.M(new Image[]{ecm0.a("https://paymentsdk.spotifycdn.com/png/cards/elo_136.png"), ecm0.a("https://paymentsdk.spotifycdn.com/png/providers/itau_136.png"), ecm0.a("https://paymentsdk.spotifycdn.com/png/providers/santander_136.png"), ecm0.a("https://paymentsdk.spotifycdn.com/png/providers/bradesco_136.png"), ecm0.a("https://paymentsdk.spotifycdn.com/png/providers/banco-do-brasil_136.png"), ecm0.a("https://paymentsdk.spotifycdn.com/png/providers/caixa_136.png"), ecm0.a("https://paymentsdk.spotifycdn.com/png/providers/nubank_136.png"), ecm0.a("https://paymentsdk.spotifycdn.com/png/providers/banco-inter_136.png"), ecm0.a("https://paymentsdk.spotifycdn.com/png/providers/banco-original_136.png"), ecm0.a("https://paymentsdk.spotifycdn.com/png/providers/banco-next_136.png"), ecm0.a("https://paymentsdk.spotifycdn.com/png/providers/sicredi_136.png")}));
        c0VarA2.v((GetCheckoutPageResponse.UcbCheckout.PopOverPaymentMethodLogos) f0VarT.build());
        c0VarA2.w("Continue with Spotify");
        c0VarA2.u(ecm0.d(this.f, 2, false));
        b0 b0VarO2 = GetCheckoutPageResponse.UcbCheckout.BillingProvider.BillingProviderTrackingData.o();
        b0VarO2.n("BILLING_PROVIDER_SPOTIFY");
        c0VarA2.y(b0VarO2);
        d0VarE.z((GetCheckoutPageResponse.UcbCheckout.BillingProvider) c0VarA2.build());
        vsw0 vsw0Var = this.b;
        if (vsw0Var != null) {
            d0VarE.w(ecm0.c(vsw0Var, this.c));
        } else {
            y yVarQ = GetCheckoutPageResponse.GpbUnavailable.q();
            yVarQ.q();
            i630 i630VarQ = FollowLinkCta.q();
            i630VarQ.q("Switch to Germany");
            i630VarQ.n("https://simplelocalize.io/data/country/DE/");
            yVarQ.n((FollowLinkCta) i630VarQ.build());
            d0VarE.x((GetCheckoutPageResponse.GpbUnavailable) yVarQ.build());
        }
        xbm0 xbm0Var = this.i;
        if (xbm0Var instanceof wbm0) {
            z zVarP = GetCheckoutPageResponse.SpotifyCheckout.p();
            zVarP.n("https://payments.spotify.com/checkout/" + strN + "?skip=spotify");
            d0VarE.B((GetCheckoutPageResponse.SpotifyCheckout) zVarP.build());
        } else {
            if (!(xbm0Var instanceof vbm0)) {
                eg.o();
                return null;
            }
            ubm0 ubm0Var = ubm0.a;
            vbm0 vbm0Var = (vbm0) xbm0Var;
            v0 v0VarF = SpotifyCheckoutNative.F(((GetSpotifyCheckoutPageResponse) ubm0.a(vbm0Var.a, vbm0Var.b).c(GetSpotifyCheckoutPageRequest.n()).blockingGet()).s());
            v0VarF.s(d0VarE.n().r());
            d0VarE.A((SpotifyCheckoutNative) v0VarF.build());
        }
        if (this.h) {
            i630 i630VarQ2 = FollowLinkCta.q();
            i630VarQ2.q("Change plan");
            i630VarQ2.n("https://giphy.com/gifs/dvYp91NVoNgsvjoagZ");
            d0VarE.t(i630VarQ2);
        }
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
        for (Object obj2 : arrayList) {
            if (hashSet.add(((Locale) obj2).getDisplayCountry())) {
                arrayList2.add(obj2);
            }
        }
        List<Locale> listA1 = o7h.a1(arrayList2, new ktg0((byte) 2));
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
        d0VarE.s((ChangeCountry) aVarQ.build());
        nVarW.w((GetCheckoutPageResponse.UcbCheckout) d0VarE.build());
        return (GetCheckoutPageResponse) nVarW.build();
    }
}
