package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.checkout.proto.model.v1.proto.ChangeCountry;
import com.spotify.checkout.proto.model.v1.proto.SpotifyCheckoutNative;
import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutResponse;
import com.spotify.checkout.proto.model.v1.proto.a1;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class i3b1 implements Update {
    public final Next a(Object obj, Object obj2) {
        int i;
        int i2;
        Object next;
        ChangeCountry.PickerForm.CountryType.Active activeN;
        String str;
        rgm0 rgm0Var;
        qgm0 qgm0Var;
        rgm0 rgm0Var2;
        qgm0 qgm0Var2;
        nhm0 nhm0Var = (nhm0) obj;
        k700 k700Var = (k700) obj2;
        boolean z = k700Var instanceof zxz;
        ggm0 ggm0Var = ggm0.a;
        if (z) {
            try {
                return mve0.a(nhm0Var, ((zxz) k700Var).a);
            } catch (Throwable th) {
                n57.t("Invalid BE response", th);
                return Next.h(ggm0Var);
            }
        }
        if (k700Var instanceof wxz) {
            return Next.i(ggm0Var, Collections.singleton(ccw.a));
        }
        boolean z2 = k700Var instanceof d400;
        tgm0 tgm0Var = tgm0.a;
        kbw kbwVar = kbw.a;
        if (z2) {
            if (nhm0Var instanceof ggm0) {
                return Next.i(tgm0Var, Collections.singleton(kbwVar));
            }
            Logger.d("Received " + d400.a + " with incompatible model " + nhm0Var, new Object[0]);
            return Next.j();
        }
        boolean z3 = k700Var instanceof g400;
        qgm0 qgm0Var3 = qgm0.i;
        String strN = null;
        strN = null;
        if (z3) {
            if (nhm0Var instanceof rgm0) {
                return Next.i(rgm0.a((rgm0) nhm0Var, null, qgm0Var3, null, 5), Collections.singleton(new rfw(true)));
            }
            Logger.d("Received RetrySubmitCheckoutWithCpd with incompatible state " + nhm0Var, new Object[0]);
            return Next.j();
        }
        boolean z4 = k700Var instanceof hyz;
        h3b1 h3b1Var = h3b1.d;
        if (z4) {
            if ((nhm0Var instanceof egm0) || (nhm0Var instanceof xfm0) || (nhm0Var instanceof zfm0)) {
                return Next.a(Collections.singleton(new chw(h3b1Var)));
            }
            Logger.d("Received " + hyz.a + " with incompatible model " + nhm0Var, new Object[0]);
            return Next.j();
        }
        boolean z5 = k700Var instanceof rvz;
        qgm0 qgm0Var4 = qgm0.e;
        qgm0 qgm0Var5 = qgm0.a;
        if (z5) {
            rvz rvzVar = (rvz) k700Var;
            if (!(nhm0Var instanceof rgm0)) {
                Logger.d("Received " + rvzVar + " with incompatible state " + nhm0Var, new Object[0]);
                return Next.j();
            }
            k12 k12Var = rvzVar.a;
            k12 k12Var2 = k12.b;
            qgm0 qgm0Var6 = qgm0.d;
            if (k12Var == k12Var2) {
                rgm0 rgm0Var3 = (rgm0) nhm0Var;
                if (rgm0Var3.b == qgm0Var6) {
                    return Next.h(rgm0.a(rgm0Var3, null, qgm0Var5, null, 5));
                }
            }
            return (k12Var == k12.a && ((qgm0Var2 = (rgm0Var2 = (rgm0) nhm0Var).b) == qgm0Var5 || qgm0Var2 == qgm0Var4)) ? Next.h(rgm0.a(rgm0Var2, null, qgm0Var6, null, 5)) : Next.j();
        }
        boolean z6 = k700Var instanceof svz;
        qgm0 qgm0Var7 = qgm0.b;
        h3b1 h3b1Var2 = h3b1.c;
        if (z6) {
            if (nhm0Var instanceof rgm0) {
                return Next.i(rgm0.a((rgm0) nhm0Var, null, qgm0Var7, null, 5), f46.S0(new oiw[]{kbwVar, new xhw(h3b1Var2)}));
            }
            Logger.d("Received AddressReloadRequested with incompatible state " + nhm0Var, new Object[0]);
            return Next.j();
        }
        if (k700Var instanceof tvz) {
            if (nhm0Var instanceof rgm0) {
                return Next.i(rgm0.a((rgm0) nhm0Var, null, qgm0Var7, null, 5), f46.S0(new oiw[]{kbwVar, new xhw(h3b1Var2)}));
            }
            Logger.d("Received AddressSaved with incompatible state " + nhm0Var, new Object[0]);
            return Next.j();
        }
        boolean z7 = k700Var instanceof jyz;
        qgm0 qgm0Var8 = qgm0.f;
        if (z7) {
            jyz jyzVar = (jyz) k700Var;
            if (nhm0Var instanceof rgm0) {
                rgm0 rgm0Var4 = (rgm0) nhm0Var;
                SpotifyCheckoutNative spotifyCheckoutNative = rgm0Var4.a;
                SpotifyCheckoutNative.PaymentSection paymentSectionU = spotifyCheckoutNative.u();
                String str2 = jyzVar.b;
                if (paymentSectionU.o(str2)) {
                    String strT = spotifyCheckoutNative.u().t(str2);
                    rgm0 rgm0VarA = rgm0.a(rgm0Var4, null, qgm0Var8, null, 5);
                    strT.getClass();
                    return Next.i(rgm0VarA, f46.S0(new oiw[]{new hhw(strT), new icw(jyzVar.a, str2, strT)}));
                }
            }
            Logger.d("Received " + jyzVar + " with incompatible state " + nhm0Var, new Object[0]);
            return Next.j();
        }
        boolean z8 = k700Var instanceof p400;
        qgm0 qgm0Var9 = qgm0.g;
        if (z8) {
            if (nhm0Var instanceof rgm0) {
                rgm0 rgm0Var5 = (rgm0) nhm0Var;
                if (rgm0Var5.b == qgm0Var8) {
                    return Next.i(rgm0.a(rgm0Var5, null, qgm0Var9, null, 5), Collections.singleton(yaw.a));
                }
            }
            return Next.j();
        }
        boolean z9 = k700Var instanceof u400;
        h3b1 h3b1Var3 = h3b1.a;
        if (z9) {
            u400 u400Var = (u400) k700Var;
            if (nhm0Var instanceof rgm0) {
                rgm0 rgm0Var6 = (rgm0) nhm0Var;
                if (rgm0Var6.b == qgm0Var9) {
                    int i3 = kve0.b[u400Var.a.o().ordinal()];
                    if (i3 != 1) {
                        return i3 != 2 ? Next.i(tgm0Var, Collections.singleton(kbwVar)) : Next.h(rgm0.a(rgm0Var6, null, qgm0Var5, null, 5));
                    }
                    return Next.a(Collections.singleton(new chw(h3b1Var3)));
                }
            }
            Logger.d("Received " + u400Var + " with incompatible state " + nhm0Var, new Object[0]);
            return Next.j();
        }
        boolean z10 = k700Var instanceof f500;
        u1q0 u1q0Var = u1q0.b;
        if (z10) {
            if ((nhm0Var instanceof rgm0) && ((qgm0Var = (rgm0Var = (rgm0) nhm0Var).b) == qgm0Var5 || qgm0Var == qgm0Var4)) {
                return Next.i(rgm0.a(rgm0Var, null, qgm0.h, null, 5), Collections.singleton(new rfw(false)));
            }
            Logger.d("Received SubmitCheckoutRequested with incompatible state " + nhm0Var, new Object[0]);
            return Next.a(Collections.singleton(new khw(u1q0Var)));
        }
        boolean z11 = k700Var instanceof wwz;
        u1q0 u1q0Var2 = u1q0.c;
        if (z11) {
            wwz wwzVar = (wwz) k700Var;
            if (!(nhm0Var instanceof rgm0)) {
                Logger.d("Received CheckoutSubmitted with incompatible state " + nhm0Var, new Object[0]);
                return Next.j();
            }
            SubmitCheckoutResponse submitCheckoutResponse = wwzVar.a;
            int iQ = submitCheckoutResponse.q();
            switch (iQ == 0 ? -1 : kve0.c[l1d.C(iQ)]) {
                case -1:
                case 6:
                    switch (submitCheckoutResponse.q()) {
                        case 1:
                            str = "SUCCESS";
                            break;
                        case 2:
                            str = "ERROR";
                            break;
                        case 3:
                            str = "UPDATE_SPOTIFY_CHECKOUT";
                            break;
                        case 4:
                            str = "CHECKOUT_ITEM_UNAVAILABLE";
                            break;
                        case 5:
                            str = "CHECKOUT_STATUS";
                            break;
                        case 6:
                            str = "RESPONSE_NOT_SET";
                            break;
                        default:
                            str = "null";
                            break;
                    }
                    n57.s("Invalid BE response case ".concat(str));
                    return Next.i(rgm0.a((rgm0) nhm0Var, null, qgm0Var5, null, 5), Collections.singleton(new khw(u1q0Var2)));
                case 0:
                default:
                    eg.o();
                    return null;
                case 1:
                    rgm0 rgm0Var7 = (rgm0) nhm0Var;
                    SpotifyCheckoutNative spotifyCheckoutNative2 = rgm0Var7.a;
                    int iOrdinal = rgm0Var7.b.ordinal();
                    if (iOrdinal == 7) {
                        if (!spotifyCheckoutNative2.B() || !spotifyCheckoutNative2.u().u()) {
                            qgm0Var4 = qgm0Var5;
                        }
                        return Next.i(rgm0.a(rgm0Var7, null, qgm0Var4, null, 5), Collections.singleton(new khw(u1q0.a)));
                    }
                    if (iOrdinal == 8) {
                        return Next.a(f46.S0(new diw[]{new hhw(spotifyCheckoutNative2.v()), new chw(h3b1Var3)}));
                    }
                    Logger.d("Received CheckoutSubmitted with incompatible state " + nhm0Var, new Object[0]);
                    return Next.j();
                case 2:
                    return Next.i(new zfm0(submitCheckoutResponse.o()), f46.S0(new diw[]{new khw(u1q0Var), new xhw(h3b1Var)}));
                case 3:
                    return Next.i(new xfm0(submitCheckoutResponse.p()), f46.S0(new diw[]{new khw(u1q0Var), new xhw(h3b1Var)}));
                case 4:
                    rgm0 rgm0VarA2 = rgm0.a((rgm0) nhm0Var, submitCheckoutResponse.r().p(), qgm0Var5, null, 4);
                    khw khwVar = new khw(u1q0Var);
                    SubmitCheckoutResponse.UpdateSpotifyCheckout updateSpotifyCheckoutR = submitCheckoutResponse.r();
                    if (!updateSpotifyCheckoutR.q()) {
                        updateSpotifyCheckoutR = null;
                    }
                    return Next.i(rgm0VarA2, dm61.B0(new diw[]{khwVar, updateSpotifyCheckoutR != null ? new yhw(updateSpotifyCheckoutR.o()) : null, new xhw(h3b1Var2)}));
                case 5:
                    return Next.i(new egm0(submitCheckoutResponse.n()), f46.S0(new diw[]{new khw(u1q0Var), new xhw(h3b1Var)}));
            }
        }
        if (k700Var instanceof e500) {
            if (nhm0Var instanceof rgm0) {
                rgm0 rgm0Var8 = (rgm0) nhm0Var;
                return rgm0Var8.b == qgm0Var3 ? Next.i(rgm0.a(rgm0Var8, null, qgm0Var5, null, 5), Collections.singleton(aiw.a)) : Next.i(rgm0.a(rgm0Var8, null, qgm0Var5, null, 5), Collections.singleton(new khw(u1q0Var2)));
            }
            Logger.d("Received SubmitCheckoutFailed with incompatible state " + nhm0Var, new Object[0]);
            return Next.j();
        }
        if (k700Var instanceof s200) {
            if (nhm0Var instanceof rgm0) {
                return Next.a(f46.S0(new diw[]{new hhw(((rgm0) nhm0Var).a.v()), new chw(h3b1Var3)}));
            }
            Logger.d("Received PaymentSucceeded with incompatible state " + nhm0Var, new Object[0]);
            return Next.j();
        }
        boolean z12 = k700Var instanceof h000;
        h3b1 h3b1Var4 = h3b1.b;
        if (z12) {
            h000 h000Var = (h000) k700Var;
            f3b1 f3b1Var = h000Var.b;
            f3b1 f3b1Var2 = h000Var.a;
            if (f3b1Var instanceof c3b1) {
                return !u890.j(f3b1Var2.Z(), ((c3b1) f3b1Var).b) ? Next.a(Collections.singleton(new ohw(f3b1Var))) : Next.a(Collections.singleton(shw.a));
            }
            if (f3b1Var instanceof d3b1) {
                d3b1 d3b1Var = (d3b1) f3b1Var;
                if (!u890.j(f3b1Var2.Z(), d3b1Var.b)) {
                    h3b1Var3 = h3b1Var4;
                }
                return Next.a(f46.S0(new diw[]{new hhw(d3b1Var.c), new chw(h3b1Var3)}));
            }
            Logger.d("Received NewArgsReceived with newArgs " + f3b1Var, new Object[0]);
            return Next.j();
        }
        if (k700Var instanceof vwz) {
            if (nhm0Var instanceof rgm0) {
                SpotifyCheckoutNative spotifyCheckoutNative3 = ((rgm0) nhm0Var).a;
                if (spotifyCheckoutNative3.A()) {
                    return Next.a(f46.S0(new oiw[]{new hhw(spotifyCheckoutNative3.q().o()), new chw(h3b1Var), vbw.a}));
                }
            }
            Logger.d("Received ChangeProductClicked with incompatible state " + nhm0Var, new Object[0]);
            return Next.j();
        }
        if (k700Var instanceof swz) {
            swz swzVar = (swz) k700Var;
            if ((nhm0Var instanceof rgm0) && ((rgm0) nhm0Var).a.z()) {
                return Next.a(f46.S0(new oiw[]{new nhw(swzVar.a), tbw.a}));
            }
            Logger.d("Received ChangeProductClicked with incompatible state " + nhm0Var, new Object[0]);
            return Next.j();
        }
        if (k700Var instanceof oxz) {
            tan tanVar = ((oxz) k700Var).a;
            if (nhm0Var instanceof rgm0) {
                SpotifyCheckoutNative spotifyCheckoutNative4 = ((rgm0) nhm0Var).a;
                if (spotifyCheckoutNative4.z()) {
                    String str3 = tanVar.c;
                    if (str3 == null) {
                        Logger.g("Selected a country without URL, likely to be the current country", new Object[0]);
                        return Next.j();
                    }
                    Iterator it = spotifyCheckoutNative4.o().o().o().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((ChangeCountry.PickerForm.CountryType) next).q());
                    ChangeCountry.PickerForm.CountryType countryType = (ChangeCountry.PickerForm.CountryType) next;
                    hhw hhwVar = new hhw(str3);
                    chw chwVar = new chw(h3b1Var);
                    String str4 = tanVar.a;
                    if (countryType != null && (activeN = countryType.n()) != null) {
                        strN = activeN.n();
                    }
                    return Next.a(f46.S0(new oiw[]{hhwVar, chwVar, new xbw(str4, strN)}));
                }
            }
            Logger.d("Received ChangeProductClicked with incompatible state " + nhm0Var, new Object[0]);
            return Next.j();
        }
        if (k700Var instanceof pzz) {
            if (nhm0Var instanceof rgm0) {
                return Next.i(rgm0.a((rgm0) nhm0Var, null, qgm0.c, null, 5), f46.S0(new oiw[]{kbwVar, new xhw(h3b1Var2)}));
            }
            Logger.d("Received InvalidPaymentSessionStateDetected with incompatible state " + nhm0Var, new Object[0]);
            return Next.j();
        }
        if (k700Var instanceof bzz) {
            if (nhm0Var instanceof rgm0) {
                SpotifyCheckoutNative spotifyCheckoutNative5 = ((rgm0) nhm0Var).a;
                if (spotifyCheckoutNative5.u().s().s()) {
                    return Next.a(f46.S0(new diw[]{new hhw(spotifyCheckoutNative5.u().s().q().o()), new chw(h3b1Var)}));
                }
            }
            Logger.d("Received FullPriceOfferRequested with incompatible state " + nhm0Var, new Object[0]);
            return Next.j();
        }
        if (k700Var instanceof azz) {
            azz azzVar = (azz) k700Var;
            if (nhm0Var instanceof xfm0) {
                String str5 = azzVar.a;
                return Next.a(f46.S0(new oiw[]{new hhw(str5), new chw(h3b1Var), new bcw(str5)}));
            }
            Logger.d("Received FollowLinkClicked with incompatible state " + nhm0Var, new Object[0]);
            return Next.j();
        }
        if (k700Var instanceof uwz) {
            uwz uwzVar = (uwz) k700Var;
            cgk1 cgk1Var = uwzVar.a;
            if (nhm0Var instanceof rgm0) {
                if (cgk1Var instanceof agk1) {
                    return Next.i(rgm0.a((rgm0) nhm0Var, null, qgm0Var8, null, 5), f46.S0(new oiw[]{new hhw(((agk1) cgk1Var).b), ubw.a}));
                }
                if (cgk1Var instanceof bgk1) {
                    return Next.h(rgm0.a((rgm0) nhm0Var, null, qgm0Var4, null, 5));
                }
                eg.o();
                return null;
            }
            Logger.d("Received " + uwzVar + " with incompatible state " + nhm0Var, new Object[0]);
            return Next.j();
        }
        if (!(k700Var instanceof r500)) {
            if (k700Var instanceof s500) {
                return Next.a(f46.S0(new oiw[]{new chw(h3b1Var4), zbw.a}));
            }
            if (!(k700Var instanceof vzz)) {
                if (k700Var instanceof o500) {
                    return Next.a(f46.S0(new oiw[]{new chw(null), ncw.a}));
                }
                eg.o();
                return null;
            }
            vzz vzzVar = (vzz) k700Var;
            if (nhm0Var instanceof rgm0) {
                rgm0 rgm0Var9 = (rgm0) nhm0Var;
                if (rgm0Var9.a.D()) {
                    igm0 igm0Var = rgm0Var9.c;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(igm0Var.a);
                    linkedHashMap.put(vzzVar.a, Boolean.valueOf(vzzVar.b));
                    return Next.h(rgm0.a(rgm0Var9, null, null, new igm0(linkedHashMap, igm0Var.b), 3));
                }
            }
            Logger.d("Received " + vzzVar + " with incompatible state " + nhm0Var, new Object[0]);
            return Next.j();
        }
        if (nhm0Var instanceof rgm0) {
            rgm0 rgm0Var10 = (rgm0) nhm0Var;
            igm0 igm0Var2 = rgm0Var10.c;
            SpotifyCheckoutNative spotifyCheckoutNative6 = rgm0Var10.a;
            if (spotifyCheckoutNative6.D() && rgm0Var10.b == qgm0Var5) {
                h290<SpotifyCheckoutNative.PaymentSection.LegalTerm> h290VarR = spotifyCheckoutNative6.u().r();
                if (h290VarR.isEmpty()) {
                    i = 0;
                } else {
                    i = 0;
                    for (SpotifyCheckoutNative.PaymentSection.LegalTerm legalTerm : h290VarR) {
                        if (legalTerm.p() == a1.CHECKBOX || legalTerm.p() == a1.CONSPICUOUS_CHECKBOX) {
                            i++;
                            if (i < 0) {
                                p7h.S();
                                throw null;
                            }
                        }
                    }
                }
                Map map = igm0Var2.a;
                if (map.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator it2 = map.entrySet().iterator();
                    i2 = 0;
                    while (it2.hasNext()) {
                        if (((Boolean) ((Map.Entry) it2.next()).getValue()).booleanValue()) {
                            i2++;
                        }
                    }
                }
                return i2 < i ? Next.h(rgm0.a(rgm0Var10, null, null, new igm0(igm0Var2.a, true), 3)) : Next.i(rgm0.a(rgm0Var10, null, qgm0Var3, null, 5), Collections.singleton(new rfw(true)));
            }
        }
        Logger.d("Received UpdateSubscriptionPrimaryClicked with incompatible state " + nhm0Var, new Object[0]);
        return Next.a(Collections.singleton(new khw(u1q0Var)));
    }
}
