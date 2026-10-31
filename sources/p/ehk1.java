package p;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import com.spotify.checkout.proto.model.v1.proto.CheckoutItemUnavailable;
import com.spotify.checkout.proto.model.v1.proto.CheckoutStatus;
import com.spotify.checkout.proto.model.v1.proto.Error;
import com.spotify.checkout.proto.model.v1.proto.SpotifyCheckoutNative;
import com.spotify.checkout.proto.model.v1.proto.Timeline;
import com.spotify.checkout.spotifycheckout.SpotifyCheckoutCallbackActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class ehk1 {
    public static final Set a = f46.S0(new qgm0[]{qgm0.e, qgm0.h, qgm0.c});

    public static ArrayList a(h290 h290Var) {
        q2c0 q2c0Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = h290Var.iterator();
        while (it.hasNext()) {
            SpotifyCheckoutNative.PaymentSection.LegalTerm legalTerm = (SpotifyCheckoutNative.PaymentSection.LegalTerm) it.next();
            int i = chk1.b[legalTerm.p().ordinal()];
            String p2c0Var = null;
            if (i == 1) {
                q2c0Var = q2c0.a;
            } else if (i == 2) {
                q2c0Var = q2c0.b;
            } else if (i != 3) {
                q2c0Var = i != 4 ? null : q2c0.d;
            } else {
                q2c0Var = q2c0.c;
            }
            if (q2c0Var != null) {
                String strO = legalTerm.o();
                String strN = legalTerm.n();
                strN.getClass();
                p2c0Var = new p2c0(q2c0Var, strO, strN.length() > 0 ? strN : null);
            }
            if (p2c0Var != null) {
                arrayList.add(p2c0Var);
            }
        }
        return arrayList;
    }

    public static uas0 b(String str, String str2, SpotifyCheckoutNative.PaymentSection.PaymentArgs paymentArgs, h290 h290Var) {
        String strR = paymentArgs.r();
        String strN = paymentArgs.n();
        int i = SpotifyCheckoutCallbackActivity.a1;
        return new uas0(strR, strN, new Uri.Builder().scheme("spotify-checkout").authority("payment-callback").appendPath(str).appendQueryParameter("status", "cancel").build().toString(), new Uri.Builder().scheme("spotify-checkout").authority("payment-callback").appendPath(str).appendQueryParameter("status", "success").appendQueryParameter("success_url", str2).build().toString(), paymentArgs.o(), a(h290Var), paymentArgs.s() ? new v7u(paymentArgs.q().p()) : null, false, str);
    }

    /* JADX WARN: Code duplicated, block: B:173:0x048c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [p.wfk1] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r16v0, types: [p.fgk1] */
    /* JADX WARN: Type inference failed for: r17v3, types: [p.jgk1] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [p.sce] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [p.rgk1] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [p.pqe1] */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [p.vfk1] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v27, types: [com.spotify.checkout.proto.model.v1.proto.Timeline] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v54 */
    public static wgk1 c(Context context, String str, nhm0 nhm0Var) {
        wgk1 wgk1Var;
        xfk1 xfk1Var;
        ?? wfk1Var;
        Parcelable egk1Var;
        Parcelable ggk1Var;
        ?? rgk1Var;
        boolean z;
        ?? r1;
        ?? r21;
        ?? r4;
        Parcelable fqe1Var;
        String str2;
        cgk1 bgk1Var;
        mmr0 mmr0Var;
        nfk1 nfk1Var;
        if (nhm0Var instanceof tgm0) {
            return lgk1.a;
        }
        if (nhm0Var instanceof ggm0) {
            return new ofk1(context.getString(2131953822), context.getString(2131953820), new nfk1(context.getString(2131953821), lfk1.a), null);
        }
        boolean z2 = nhm0Var instanceof zfm0;
        jfk1 jfk1Var = jfk1.a;
        if (z2) {
            CheckoutStatus checkoutStatus = ((zfm0) nhm0Var).a;
            int iO = checkoutStatus.o();
            int i = iO == 0 ? -1 : chk1.c[l1d.C(iO)];
            if (i == -1) {
                nfk1Var = null;
            } else if (i != 1) {
                if (i != 2) {
                    eg.o();
                    return null;
                }
                nfk1Var = null;
            } else {
                nfk1Var = new nfk1(checkoutStatus.n().o(), jfk1Var);
            }
            return new ofk1(checkoutStatus.getTitle(), checkoutStatus.getSubtitle(), nfk1Var, null);
        }
        if (nhm0Var instanceof xfm0) {
            Error error = ((xfm0) nhm0Var).a;
            int iR = error.r();
            int i2 = iR != 0 ? chk1.d[l1d.C(iR)] : -1;
            if (i2 == 1) {
                mmr0Var = new mmr0(new nfk1(error.n().o(), jfk1Var), (Object) null);
            } else if (i2 == 2) {
                mmr0Var = new mmr0(new nfk1(error.p().p(), new kfk1(error.p().o())), (Object) null);
            } else if (i2 != 3) {
                mmr0Var = i2 != 4 ? new mmr0((Object) null, (Object) null) : new mmr0(new nfk1(error.q().o().p(), new kfk1(error.q().o().o())), new nfk1(error.q().p().o(), jfk1Var));
            } else {
                mmr0Var = new mmr0(new nfk1(error.o().o().p(), new kfk1(error.o().o().o())), new nfk1(error.o().p().p(), new kfk1(error.o().p().o())));
            }
            return new ofk1(error.getTitle(), error.getDescription(), (nfk1) mmr0Var.a, (nfk1) mmr0Var.b);
        }
        if (!(nhm0Var instanceof rgm0)) {
            if (nhm0Var instanceof egm0) {
                CheckoutItemUnavailable checkoutItemUnavailable = ((egm0) nhm0Var).a;
                return new ufk1(checkoutItemUnavailable.getTitle(), new hn90(cic0.a(checkoutItemUnavailable.p()), checkoutItemUnavailable.n()));
            }
            eg.o();
            return null;
        }
        rgm0 rgm0Var = (rgm0) nhm0Var;
        qgm0 qgm0Var = rgm0Var.b;
        SpotifyCheckoutNative spotifyCheckoutNative = rgm0Var.a;
        boolean z3 = spotifyCheckoutNative.B() && spotifyCheckoutNative.u().u();
        String strT = spotifyCheckoutNative.t();
        xhc0 xhc0VarA = cic0.a(spotifyCheckoutNative.s());
        int iP = spotifyCheckoutNative.p();
        int i3 = iP == 0 ? -1 : chk1.a[l1d.C(iP)];
        if (i3 == -1) {
            wgk1Var = null;
            xfk1Var = null;
        } else if (i3 != 1) {
            if (i3 != 2) {
                eg.o();
                return null;
            }
            wgk1Var = null;
            xfk1Var = null;
        } else {
            wgk1Var = null;
            xfk1Var = new xfk1(spotifyCheckoutNative.q().p(), spotifyCheckoutNative.q().o());
        }
        if (spotifyCheckoutNative.y()) {
            SpotifyCheckoutNative.AddressSection addressSectionN = spotifyCheckoutNative.n();
            wfk1Var = new wfk1(addressSectionN.getTitle(), addressSectionN.getSubtitle(), addressSectionN.n());
        } else {
            wfk1Var = wgk1Var;
        }
        boolean zB = spotifyCheckoutNative.B();
        Set set = a;
        qgm0 qgm0Var2 = qgm0.d;
        if (zB) {
            String strV = spotifyCheckoutNative.v();
            SpotifyCheckoutNative.PaymentSection paymentSectionU = spotifyCheckoutNative.u();
            igm0 igm0Var = rgm0Var.c;
            if (paymentSectionU.u() && set.contains(qgm0Var)) {
                egk1Var = new zfk1(paymentSectionU.getTitle(), b(str, strV, paymentSectionU.p().q().p(), paymentSectionU.r()));
            } else if (!paymentSectionU.u() || qgm0Var == qgm0Var2) {
                egk1Var = (!paymentSectionU.v() || qgm0Var == qgm0Var2) ? new egk1(paymentSectionU.getTitle()) : new zfk1(paymentSectionU.getTitle(), b(str, strV, paymentSectionU.s(), paymentSectionU.r()));
            } else {
                SpotifyCheckoutNative.PaymentSection.CurrentPaymentDetails currentPaymentDetailsP = paymentSectionU.p();
                String title = paymentSectionU.getTitle();
                kq70 kq70Var = new kq70(currentPaymentDetailsP.p().getUrl(), currentPaymentDetailsP.p().n());
                String title2 = currentPaymentDetailsP.getTitle();
                String subtitle = currentPaymentDetailsP.getSubtitle();
                subtitle.getClass();
                ?? r23 = subtitle.length() > 0 ? subtitle : wgk1Var;
                if (currentPaymentDetailsP.t()) {
                    bgk1Var = new agk1(currentPaymentDetailsP.r().p(), currentPaymentDetailsP.r().o());
                } else {
                    if (!currentPaymentDetailsP.s()) {
                        int iN = currentPaymentDetailsP.n();
                        if (iN == 1) {
                            str2 = "WEB_VIEW";
                        } else if (iN != 2) {
                            str2 = iN != 3 ? "null" : "CHANGEPAYMENT_NOT_SET";
                        } else {
                            str2 = "NATIVE";
                        }
                        hhg1.n("Unexpected response case ".concat(str2));
                        return wgk1Var;
                    }
                    bgk1Var = new bgk1(currentPaymentDetailsP.q().o());
                }
                egk1Var = new dgk1(title, kq70Var, title2, r23, bgk1Var, a(paymentSectionU.r()), igm0Var);
            }
        } else {
            egk1Var = wgk1Var;
        }
        if (spotifyCheckoutNative.C()) {
            SpotifyCheckoutNative.SummarySection summarySectionW = spotifyCheckoutNative.w();
            if (z3 && !set.contains(qgm0Var)) {
                ggk1Var = wgk1Var;
            } else if (qgm0Var == qgm0Var2) {
                ggk1Var = new ggk1(summarySectionW.getTitle());
            } else if (summarySectionW.z()) {
                String title3 = summarySectionW.getTitle();
                String strS = summarySectionW.s().s();
                kq70 kq70Var2 = new kq70(summarySectionW.s().o().getUrl(), summarySectionW.s().o().n());
                String strR = summarySectionW.s().r();
                String strP = summarySectionW.s().p();
                String strQ = summarySectionW.s().q();
                strQ.getClass();
                yfk1 yfk1Var = new yfk1(strS, kq70Var2, strR, strP, strQ.length() > 0 ? strQ : wgk1Var);
                int iV = summarySectionW.v();
                int i4 = iV == 0 ? -1 : yse1.a[l1d.C(iV)];
                if (i4 == -1) {
                    r21 = wgk1Var;
                } else {
                    if (i4 == 1) {
                        Timeline timelineT = summarySectionW.t();
                        if (timelineT.getItemsCount() <= 0) {
                            r4 = timelineT;
                            r4 = wgk1Var;
                        }
                        if (r4 != 0) {
                            List<Timeline.TimelineItem> itemsList = r4.getItemsList();
                            ArrayList arrayList = new ArrayList(q7h.U(itemsList, 10));
                            for (Timeline.TimelineItem timelineItem : itemsList) {
                                arrayList.add(new dme1(timelineItem.n(), timelineItem.getDescription()));
                            }
                            fqe1Var = new fqe1(arrayList);
                        } else {
                            fqe1Var = wgk1Var;
                        }
                    } else if (i4 != 2) {
                        if (i4 != 3) {
                            eg.o();
                            return wgk1Var;
                        }
                        r21 = wgk1Var;
                    } else {
                        fqe1Var = zse1.a(summarySectionW.u());
                    }
                    r21 = fqe1Var;
                }
                h290 h290VarO = summarySectionW.o();
                ?? vfk1Var = summarySectionW.y() ? new vfk1(summarySectionW.q().q(), summarySectionW.q().n(), summarySectionW.q().r(), summarySectionW.q().p()) : wgk1Var;
                String strW = summarySectionW.w();
                String strX = summarySectionW.x();
                String strP2 = summarySectionW.p();
                strP2.getClass();
                ggk1Var = new igk1(title3, yfk1Var, r21, vfk1Var, h290VarO, strW, strX, strP2.length() > 0 ? strP2 : wgk1Var);
            } else if (summarySectionW.z() || summarySectionW.w().length() <= 0 || summarySectionW.x().length() <= 0) {
                ggk1Var = new ggk1(summarySectionW.getTitle());
            } else {
                String strW2 = summarySectionW.w();
                String strX2 = summarySectionW.x();
                String strP3 = summarySectionW.p();
                strP3.getClass();
                if (strP3.length() <= 0) {
                    r1 = strP3;
                    r1 = wgk1Var;
                }
                r1 = strP3;
                ggk1Var = new hgk1(strW2, strX2, r1);
            }
        } else {
            ggk1Var = wgk1Var;
        }
        ?? A = spotifyCheckoutNative.z() ? uce.a(spotifyCheckoutNative.o()) : wgk1Var;
        if (!spotifyCheckoutNative.D() || qgm0Var == qgm0Var2 || set.contains(qgm0Var)) {
            rgk1Var = wgk1Var;
        } else {
            rgk1Var = new rgk1(spotifyCheckoutNative.x().q(), spotifyCheckoutNative.x().r() ? spotifyCheckoutNative.x().n().o() : spotifyCheckoutNative.x().s() ? spotifyCheckoutNative.x().o().p() : wgk1Var);
        }
        switch (qgm0Var.ordinal()) {
            case 0:
            case 3:
            case 4:
            case 5:
                z = false;
                break;
            case 1:
            case 2:
            case 6:
            case 7:
            case 8:
                z = true;
                break;
            default:
                eg.o();
                return wgk1Var;
        }
        return new kgk1(strT, xhc0VarA, xfk1Var, wfk1Var, egk1Var, ggk1Var, A, rgk1Var, z);
    }
}
