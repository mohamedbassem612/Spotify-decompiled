package p;

import com.spotify.checkout.proto.model.v1.proto.Face;
import com.spotify.checkout.proto.model.v1.proto.LineItem;
import com.spotify.checkout.proto.model.v1.proto.ProductBreakdown;
import com.spotify.checkout.proto.model.v1.proto.Timeline;
import com.spotify.checkout.proto.model.v1.proto.p0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class cic0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable, p.xhc0] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static xhc0 a(LineItem lineItem) {
        aic0 aic0Var;
        fqe1 fqe1Var;
        ArrayList arrayListN0;
        int i;
        int i2;
        dic0 dic0Var;
        String str;
        aic0 aic0Var2;
        dic0 dic0Var2;
        int iP = lineItem.p();
        int i3 = iP == 0 ? -1 : bic0.a[l1d.C(iP)];
        ?? r4 = 0;
        if (i3 != 1) {
            if (i3 != 2) {
                int iP2 = lineItem.p();
                if (iP2 == 1) {
                    str = "SIMPLE";
                } else if (iP2 != 2) {
                    str = iP2 != 3 ? "null" : "TYPE_NOT_SET";
                } else {
                    str = "V2";
                }
                hhg1.n("Unexpected LineItem type ".concat(str));
                return null;
            }
            LineItem.LineItemV2 lineItemV2Q = lineItem.q();
            if (lineItemV2Q.t()) {
                kq70 kq70Var = lineItemV2Q.q().r() ? new kq70(lineItemV2Q.q().o().getUrl(), lineItemV2Q.q().o().n()) : null;
                td10 td10VarB = lineItemV2Q.q().t() ? b(lineItemV2Q.q().q()) : null;
                String title = lineItemV2Q.q().getTitle();
                String subtitle = lineItemV2Q.q().getSubtitle();
                if (lineItemV2Q.q().s()) {
                    String title2 = lineItemV2Q.q().p().o().getTitle();
                    String strO = lineItemV2Q.q().p().o().o();
                    strO.getClass();
                    if (ihc1.y0(strO)) {
                        strO = null;
                    }
                    dic0Var2 = new dic0(title2, strO, lineItemV2Q.q().p().o().getSubtitle());
                } else {
                    dic0Var2 = null;
                }
                aic0Var2 = new aic0(kq70Var, td10VarB, title, subtitle, dic0Var2);
            } else {
                aic0Var2 = null;
            }
            String strR = lineItemV2Q.r();
            strR.getClass();
            return new xhc0(aic0Var2, !ihc1.y0(strR) ? strR : null, zse1.a(lineItemV2Q.s()), null, lineItemV2Q.o());
        }
        LineItem.SimpleLineItem simpleLineItemO = lineItem.o();
        if (simpleLineItemO.u()) {
            kq70 kq70Var2 = new kq70(simpleLineItemO.q().o().getUrl(), simpleLineItemO.q().o().n());
            td10 td10VarB2 = simpleLineItemO.q().s() ? b(simpleLineItemO.q().q()) : null;
            String title3 = simpleLineItemO.q().getTitle();
            String subtitle2 = simpleLineItemO.q().getSubtitle();
            if (simpleLineItemO.q().r()) {
                String strP = simpleLineItemO.q().p().p();
                String strN = simpleLineItemO.q().p().n();
                strN.getClass();
                if (ihc1.y0(strN)) {
                    strN = null;
                }
                dic0Var = new dic0(strP, strN, simpleLineItemO.q().p().q());
            } else {
                dic0Var = null;
            }
            aic0Var = new aic0(kq70Var2, td10VarB2, title3, subtitle2, dic0Var);
        } else {
            aic0Var = null;
        }
        h290 h290VarO = simpleLineItemO.o();
        String strR2 = simpleLineItemO.r();
        strR2.getClass();
        String str2 = !ihc1.y0(strR2) ? strR2 : null;
        Timeline timelineT = simpleLineItemO.t();
        if (timelineT.getItemsCount() <= 0) {
            timelineT = null;
        }
        int i4 = 10;
        if (timelineT != null) {
            List<Timeline.TimelineItem> itemsList = timelineT.getItemsList();
            ArrayList arrayList = new ArrayList(q7h.U(itemsList, 10));
            for (Timeline.TimelineItem timelineItem : itemsList) {
                arrayList.add(new dme1(timelineItem.n(), timelineItem.getDescription()));
            }
            fqe1Var = new fqe1(arrayList);
        } else {
            fqe1Var = null;
        }
        if (simpleLineItemO.v()) {
            h290<ProductBreakdown.BreakdownGroup> h290VarQ = simpleLineItemO.s().q();
            ArrayList arrayList2 = new ArrayList();
            for (ProductBreakdown.BreakdownGroup breakdownGroup : h290VarQ) {
                ?? r16 = r4;
                boolean z = breakdownGroup.o() == p0.HIGHLIGHTED;
                h290 h290VarQ2 = breakdownGroup.q();
                ArrayList arrayList3 = new ArrayList(q7h.U(h290VarQ2, i4));
                int i5 = 0;
                for (Object obj : h290VarQ2) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        p7h.T();
                        throw r16;
                    }
                    ProductBreakdown.BreakdownGroup.BreakdownRow breakdownRow = (ProductBreakdown.BreakdownGroup.BreakdownRow) obj;
                    if (!z) {
                        i = 5;
                    } else if (breakdownGroup.p() == 1) {
                        i = 4;
                    } else if (i5 == 0) {
                        i = 1;
                    } else {
                        i = i5 == breakdownGroup.p() - 1 ? 3 : 2;
                    }
                    int i7 = bic0.b[breakdownRow.q().ordinal()];
                    if (i7 == 1) {
                        i2 = 1;
                    } else if (i7 == 2) {
                        i2 = 2;
                    } else if (i7 == 3) {
                        i2 = 3;
                    } else {
                        if (i7 != 4) {
                            tw20.t(breakdownRow.q(), "Unrecognized BreakdownRowStyle ");
                            return r16;
                        }
                        i2 = 4;
                    }
                    String strO2 = breakdownRow.o();
                    String strP2 = breakdownRow.p();
                    String strN2 = breakdownRow.n();
                    strN2.getClass();
                    arrayList3.add(new zsw0(i, i2, strO2, strP2, !ihc1.y0(strN2) ? strN2 : r16));
                    i5 = i6;
                }
                r7h.W(arrayList3, arrayList2);
                r4 = r16;
                i4 = 10;
            }
            ?? r17 = r4;
            String strR3 = simpleLineItemO.s().r();
            String strS = simpleLineItemO.s().s();
            String strO3 = simpleLineItemO.s().o();
            strO3.getClass();
            arrayListN0 = o7h.N0(p7h.M(new atw0[]{ysw0.a, new zsw0(5, 5, strR3, strS, !ihc1.y0(strO3) ? strO3 : r17)}), arrayList2);
        } else {
            arrayListN0 = null;
        }
        return new xhc0(aic0Var, str2, fqe1Var, arrayListN0, h290VarO);
    }

    public static td10 b(Face face) {
        String imageUrl = face.getImageUrl();
        imageUrl.getClass();
        if (ihc1.y0(imageUrl)) {
            imageUrl = null;
        }
        String username = face.getUsername();
        String displayName = face.getDisplayName();
        displayName.getClass();
        if (ihc1.y0(displayName)) {
            displayName = null;
        }
        int iN = face.n();
        Integer numValueOf = Integer.valueOf(iN);
        if (iN == 0) {
            numValueOf = null;
        }
        return new td10(imageUrl, username, displayName, numValueOf != null ? new rd10(numValueOf.intValue() | (-16777216)) : null);
    }
}
