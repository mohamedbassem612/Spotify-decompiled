package p;

import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.Image;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class hah1 {
    public static d5g a(boolean z, GetCheckoutPageResponse.UcbCheckout.BillingProvider billingProvider, tly0 tly0Var, GetCheckoutPageResponse.GpbUnavailable gpbUnavailable) {
        i5l1 i5l1Var;
        ArrayList arrayListO0;
        ArrayList arrayList;
        Object next;
        String displayName = billingProvider.getDisplayName();
        String id = billingProvider.y().getId();
        if (billingProvider.z()) {
            String strP = billingProvider.p().p();
            strP.getClass();
            if (ihc1.y0(strP)) {
                strP = null;
            }
            String strN = billingProvider.p().n();
            Iterator it = j5l1.e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((j5l1) next).a.equals(strN));
            j5l1 j5l1Var = (j5l1) next;
            if (j5l1Var == null) {
                j5l1Var = j5l1.c;
            }
            i5l1Var = new i5l1(strP, j5l1Var, billingProvider.p().getMessagesList());
        } else {
            i5l1Var = null;
        }
        xhc0 xhc0VarA = cic0.a(billingProvider.r());
        boolean z2 = tly0Var instanceof qly0;
        int iS = billingProvider.s();
        int i = iS == 0 ? -1 : gah1.f[l1d.C(iS)];
        ArrayList arrayList2 = z6x.a;
        if (i == -1) {
            arrayListO0 = arrayList2;
            arrayList = arrayListO0;
        } else {
            if (i == 1) {
                h290<Image> h290VarO = billingProvider.x().o();
                ArrayList arrayList3 = new ArrayList(q7h.U(h290VarO, 10));
                for (Image image : h290VarO) {
                    arrayList3.add(new rta(image.getUrl(), image.n(), z2));
                }
                arrayListO0 = arrayList3;
            } else if (i == 2) {
                h290<Image> h290VarQ = billingProvider.o().q();
                ArrayList arrayList4 = new ArrayList(q7h.U(h290VarQ, 10));
                for (Image image2 : h290VarQ) {
                    arrayList4.add(new rta(image2.getUrl(), image2.n(), z2));
                }
                arrayListO0 = o7h.O0(new qta(billingProvider.o().o()), arrayList4);
            } else if (i != 3) {
                if (i != 4) {
                    eg.o();
                    return null;
                }
                arrayListO0 = arrayList2;
                arrayList = arrayListO0;
            } else {
                h290<Image> h290VarQ2 = billingProvider.t().q();
                ArrayList arrayList5 = new ArrayList(q7h.U(h290VarQ2, 10));
                for (Image image3 : h290VarQ2) {
                    arrayList5.add(new rta(image3.getUrl(), image3.n(), z2));
                }
                ArrayList arrayListO1 = o7h.O0(new sta(billingProvider.t().r()), arrayList5);
                h290<Image> h290VarS = billingProvider.t().s();
                ArrayList arrayList6 = new ArrayList(q7h.U(h290VarS, 10));
                for (Image image4 : h290VarS) {
                    arrayList6.add(new rta(image4.getUrl(), image4.n(), z2));
                }
                arrayList = arrayList6;
                arrayListO0 = arrayListO1;
            }
            arrayList = arrayList2;
        }
        nra nraVar = gpbUnavailable != null ? new nra(gpbUnavailable.getMessage(), gpbUnavailable.p() ? new tco(gpbUnavailable.n().p(), gpbUnavailable.n().o()) : null) : null;
        String description = billingProvider.getDescription();
        String strW = billingProvider.w();
        strW.getClass();
        if (ihc1.y0(strW)) {
            strW = null;
        }
        return new d5g(z, false, displayName, id, i5l1Var, xhc0VarA, new lra(nraVar, description, arrayListO0, arrayList, strW != null ? new ora(strW, false) : null, false, billingProvider.u(), tly0Var, billingProvider.v()));
    }
}
