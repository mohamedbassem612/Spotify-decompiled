package p;

import com.spotify.checkout.proto.model.v1.proto.CheckoutItemUnavailable;
import com.spotify.checkout.proto.model.v1.proto.CheckoutStatus;
import com.spotify.checkout.proto.model.v1.proto.Error;
import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.e0;
import com.spotify.mobius.Next;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s7g {
    public static d5g a(d5g d5gVar) {
        lra lraVar = d5gVar.g;
        ora oraVar = lraVar.e;
        return d5g.a(d5gVar, false, lra.a(lraVar, oraVar != null ? ora.a(oraVar, !oraVar.b) : null, false, 495), 63);
    }

    public static Next b(g8g g8gVar, k7g k7gVar) {
        tly0 sly0Var;
        tly0 qly0Var;
        y8g y8gVar;
        mmr0 mmr0Var;
        t7g t7gVar = g8gVar.a;
        GetCheckoutPageResponse getCheckoutPageResponse = k7gVar.b;
        String str = k7gVar.a;
        int iS = getCheckoutPageResponse.s();
        int i = iS == 0 ? -1 : r7g.a[l1d.C(iS)];
        String str2 = "SPOTIFY_CHECKOUT_NATIVE";
        String str3 = "GPB_CHECKOUT";
        a9g a9gVar = a9g.a;
        e9gVar = null;
        e9g e9gVar = null;
        switch (i) {
            case 1:
                return Next.a(f46.S0(new c6g[]{new z5g(getCheckoutPageResponse.r().getUrl()), new w5g(pwf.a)}));
            case 2:
                return Next.i(new t8g(k8g.a), Collections.singleton(new z5g(getCheckoutPageResponse.t().n())));
            case 3:
                return Next.i(new t8g(l8g.a), Collections.singleton(new y5g(getCheckoutPageResponse.u())));
            case 4:
                i050 i050VarA = d550.a(str, getCheckoutPageResponse.q());
                t8g t8gVar = new t8g(new n8g(i050VarA));
                aih1 aih1Var = i050VarA.d;
                return Next.i(t8gVar, dm61.B0(new p6g[]{o6g.a, aih1Var != null ? new l6g(aih1Var.b) : null}));
            case 5:
                GetCheckoutPageResponse.UcbCheckout ucbCheckoutV = getCheckoutPageResponse.v();
                e0 e0VarT = ucbCheckoutV.t();
                boolean z = e0VarT == e0.c;
                GetCheckoutPageResponse.UcbCheckout.BillingProvider billingProviderZ = ucbCheckoutV.z();
                int iA = ucbCheckoutV.A();
                int i2 = iA == 0 ? -1 : gah1.a[l1d.C(iA)];
                if (i2 == 1) {
                    sly0Var = new sly0(ucbCheckoutV.C().n());
                } else {
                    if (i2 != 2) {
                        int iA2 = ucbCheckoutV.A();
                        if (iA2 == 1) {
                            str2 = "SPOTIFY_CHECKOUT_URL";
                        } else if (iA2 != 2) {
                            str2 = iA2 != 3 ? "null" : "SPOTIFYCHECKOUTACTION_NOT_SET";
                        }
                        hhg1.n("Unexpected spotifyCheckoutActionCase ".concat(str2));
                        return null;
                    }
                    sly0Var = new rly0(ucbCheckoutV.B());
                }
                d5g d5gVarA = hah1.a(z, billingProviderZ, sly0Var, (GetCheckoutPageResponse.GpbUnavailable) null);
                boolean z2 = e0VarT == e0.d;
                GetCheckoutPageResponse.UcbCheckout.BillingProvider billingProviderU = ucbCheckoutV.u();
                int iW = ucbCheckoutV.w();
                int i3 = iW == 0 ? -1 : gah1.b[l1d.C(iW)];
                if (i3 == 1) {
                    qly0Var = new qly0(d550.a(str, ucbCheckoutV.v()));
                } else {
                    if (i3 != 2) {
                        int iW2 = ucbCheckoutV.w();
                        if (iW2 != 1) {
                            if (iW2 != 2) {
                                str3 = iW2 != 3 ? "null" : "GPBCHECKOUTACTION_NOT_SET";
                            } else {
                                str3 = "GPB_UNAVAILABLE";
                            }
                        }
                        hhg1.n("Unexpected gpbCheckoutActionCase ".concat(str3));
                        return null;
                    }
                    qly0Var = ply0.a;
                }
                GetCheckoutPageResponse.GpbUnavailable gpbUnavailableX = ucbCheckoutV.x();
                if (ucbCheckoutV.w() != 2) {
                    gpbUnavailableX = null;
                }
                d5g d5gVarA2 = hah1.a(z2, billingProviderU, qly0Var, gpbUnavailableX);
                String strY = ucbCheckoutV.y();
                String strO = ucbCheckoutV.o();
                String strN = ucbCheckoutV.n();
                sce sceVarA = ucbCheckoutV.D() ? uce.a(ucbCheckoutV.p()) : null;
                int iQ = ucbCheckoutV.q();
                int i4 = iQ == 0 ? -1 : gah1.c[l1d.C(iQ)];
                if (i4 == -1) {
                    y8gVar = null;
                } else if (i4 != 1) {
                    if (i4 != 2) {
                        eg.o();
                        return null;
                    }
                    y8gVar = null;
                } else {
                    y8gVar = new y8g(ucbCheckoutV.r().p(), ucbCheckoutV.r().o());
                }
                h9g h9gVarC = c(new h9g(strY, strO, strN, d5gVarA, d5gVarA2, sceVarA, y8gVar));
                t8g t8gVar2 = new t8g(new e8g(t7gVar, h9gVarC, 0));
                List listM = p7h.M(new String[]{h9gVarC.d.d, h9gVarC.e.d});
                d5g d5gVarG = h9gVarC.g();
                return Next.i(t8gVar2, Collections.singleton(new m6g(listM, d5gVarG != null ? d5gVarG.d : null)));
            case 6:
                CheckoutItemUnavailable checkoutItemUnavailableN = getCheckoutPageResponse.n();
                return Next.h(new t8g(new b8g(new g9g(checkoutItemUnavailableN.getTitle(), new hn90(cic0.a(checkoutItemUnavailableN.p()), checkoutItemUnavailableN.n())))));
            case 7:
                CheckoutStatus checkoutStatusO = getCheckoutPageResponse.o();
                int iO = checkoutStatusO.o();
                int i5 = iO == 0 ? -1 : gah1.d[l1d.C(iO)];
                if (i5 != -1) {
                    if (i5 == 1) {
                        e9gVar = new e9g(checkoutStatusO.n().o(), a9gVar);
                    } else if (i5 != 2) {
                        eg.o();
                        return null;
                    }
                }
                return Next.h(new t8g(new h8g(t7gVar, new f9g(checkoutStatusO.getTitle(), checkoutStatusO.getSubtitle(), a9gVar, e9gVar, null, 16))));
            case 8:
                Error errorP = getCheckoutPageResponse.p();
                int iR = errorP.r();
                int i6 = iR != 0 ? gah1.e[l1d.C(iR)] : -1;
                if (i6 == 1) {
                    mmr0Var = new mmr0(new e9g(errorP.n().o(), a9gVar), (Object) null);
                } else if (i6 == 2) {
                    mmr0Var = new mmr0(new e9g(errorP.p().p(), new b9g(errorP.p().o())), (Object) null);
                } else if (i6 != 3) {
                    mmr0Var = i6 != 4 ? new mmr0((Object) null, (Object) null) : new mmr0(new e9g(errorP.q().o().p(), new b9g(errorP.q().o().o())), new e9g(errorP.q().p().o(), a9gVar));
                } else {
                    mmr0Var = new mmr0(new e9g(errorP.o().o().p(), new b9g(errorP.o().o().o())), new e9g(errorP.o().p().p(), new b9g(errorP.o().p().o())));
                }
                return Next.h(new t8g(new h8g(t7gVar, new f9g(errorP.getTitle(), errorP.getDescription(), a9gVar, (e9g) mmr0Var.a, (e9g) mmr0Var.b))));
            default:
                switch (getCheckoutPageResponse.s()) {
                    case 1:
                        str2 = "UCB_CHECKOUT";
                        break;
                    case 2:
                        str2 = "SPOTIFY_CHECKOUT";
                        break;
                    case 3:
                        break;
                    case 4:
                        str2 = "GPB_CHECKOUT";
                        break;
                    case 5:
                        str2 = "CHECKOUT_ITEM_UNAVAILABLE";
                        break;
                    case 6:
                        str2 = "CHECKOUT_STATUS";
                        break;
                    case 7:
                        str2 = "REDIRECT";
                        break;
                    case 8:
                        str2 = "ERROR";
                        break;
                    case 9:
                        str2 = "RESPONSE_NOT_SET";
                        break;
                    default:
                        str2 = "null";
                        break;
                }
                hhg1.n("Unexpected response case ".concat(str2));
                return null;
        }
    }

    public static h9g c(h9g h9gVar) {
        d5g d5gVar = h9gVar.d;
        lra lraVar = d5gVar.g;
        ora oraVar = lraVar.e;
        boolean z = oraVar != null ? oraVar.b : true;
        ply0 ply0Var = ply0.a;
        d5g d5gVarA = d5g.a(d5gVar, false, lra.a(lraVar, null, z && !u890.j(lraVar.h, ply0Var), 479), 63);
        d5g d5gVar2 = h9gVar.e;
        lra lraVar2 = d5gVar2.g;
        ora oraVar2 = lraVar2.e;
        return h9g.a(h9gVar, d5gVarA, d5g.a(d5gVar2, false, lra.a(lraVar2, null, (oraVar2 != null ? oraVar2.b : true) && !u890.j(lraVar2.h, ply0Var), 479), 63));
    }
}
