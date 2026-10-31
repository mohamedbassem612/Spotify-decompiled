package p;

import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class d550 {
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    public static i050 a(String str, GetCheckoutPageResponse.GpbCheckout gpbCheckout) {
        GetCheckoutPageResponse.GpbCheckout gpbCheckout2;
        ioc1 ioc1Var;
        String strO;
        nf21 nf21Var;
        vsw0 tsw0Var;
        String strP;
        Object next;
        gtw0 gtw0Var;
        gnp0 gnp0Var;
        Object next2;
        Object next3;
        String str2;
        int iQ = gpbCheckout.q();
        int i = iQ == 0 ? -1 : c550.a[l1d.C(iQ)];
        if (i == 1) {
            gpbCheckout2 = gpbCheckout;
            GetCheckoutPageResponse.GpbCheckout.GpbSubscriptions gpbSubscriptionsR = gpbCheckout2.r();
            if (gpbSubscriptionsR == null) {
                hhg1.n("Required value was null.");
                return null;
            }
            h290 h290VarS = gpbSubscriptionsR.s();
            ArrayList arrayList = new ArrayList(q7h.U(h290VarS, 10));
            Iterator it = h290VarS.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                ioc1Var = ioc1.e;
                if (!zHasNext) {
                    break;
                }
                GetCheckoutPageResponse.GpbCheckout.GpbSubscriptions.GpbIdentifiers gpbIdentifiers = (GetCheckoutPageResponse.GpbCheckout.GpbSubscriptions.GpbIdentifiers) it.next();
                if (gpbSubscriptionsR.u()) {
                    Iterator it2 = gpbSubscriptionsR.p().p().iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!u890.j(((GetCheckoutPageResponse.GpbCheckout.GpbSubscriptions.GpbChangeSubPerProduct.ProductReplacement) next2).o(), gpbIdentifiers.p()));
                    GetCheckoutPageResponse.GpbCheckout.GpbSubscriptions.GpbChangeSubPerProduct.ProductReplacement productReplacement = (GetCheckoutPageResponse.GpbCheckout.GpbSubscriptions.GpbChangeSubPerProduct.ProductReplacement) next2;
                    if (productReplacement != null) {
                        String strN = productReplacement.n();
                        String strP2 = productReplacement.p();
                        Iterator it3 = ioc1.g.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it3.next();
                        } while (!((ioc1) next3).a.equals(strP2));
                        ioc1 ioc1Var2 = (ioc1) next3;
                        if (ioc1Var2 == null) {
                            n57.m("Unknown Replacement Mode: " + strP2);
                            ioc1Var2 = ioc1.c;
                        }
                        gtw0Var = new gtw0(strN, ioc1Var2);
                    } else {
                        gtw0Var = null;
                    }
                } else {
                    gtw0Var = null;
                }
                String strP3 = gpbIdentifiers.p();
                if ((gtw0Var != null ? gtw0Var.b : null) == ioc1Var) {
                    gnp0Var = null;
                } else {
                    String strN2 = gpbIdentifiers.n();
                    String strO2 = gpbIdentifiers.o();
                    if (strO2 == null || ihc1.y0(strO2)) {
                        strO2 = null;
                    }
                    gnp0Var = new gnp0(strN2, strO2);
                }
                arrayList.add(new qnc1(strP3, gnp0Var, gtw0Var));
            }
            int iQ2 = gpbSubscriptionsR.q();
            int i2 = iQ2 == 0 ? -1 : c550.b[l1d.C(iQ2)];
            if (i2 == 1) {
                strO = gpbSubscriptionsR.o().o();
            } else if (i2 == 2) {
                strO = gpbSubscriptionsR.p().o();
            } else {
                if (i2 != 3) {
                    eg.o();
                    return null;
                }
                strO = null;
            }
            if (!gpbSubscriptionsR.t() || (strP = gpbSubscriptionsR.o().p()) == null) {
                nf21Var = null;
            } else {
                Iterator it4 = nf21.f.iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (!((nf21) next).a.equals(strP));
                nf21Var = (nf21) next;
                if (nf21Var == null) {
                    n57.e("Unknown Replacement Mode: ".concat(strP));
                    nf21Var = nf21.c;
                }
            }
            usw0 usw0Var = new usw0(arrayList, strO, nf21Var);
            boolean zU = gpbSubscriptionsR.u();
            List list = usw0Var.c;
            if (zU) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it5 = list2.iterator();
                    do {
                        if (it5.hasNext()) {
                        }
                    } while (((qnc1) it5.next()).c == null);
                }
                hhg1.n("Change sub per product doesn't have any productReplacement");
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                gtw0 gtw0Var2 = ((qnc1) obj).c;
                if ((gtw0Var2 != null ? gtw0Var2.b : null) == ioc1Var) {
                    arrayList2.add(obj);
                }
            }
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                if (((qnc1) it6.next()).b != null) {
                    hhg1.n("If replacement mode is KEEP_EXISTING then offerIdentifier must be null");
                    return null;
                }
            }
            tsw0Var = usw0Var;
        } else {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    eg.o();
                    return null;
                }
                int iQ3 = gpbCheckout.q();
                StringBuilder sb = new StringBuilder("Unexpected product in ");
                sb.append(gpbCheckout);
                if (iQ3 == 1) {
                    str2 = "SUBSCRIPTION";
                } else if (iQ3 == 2) {
                    str2 = "OTP";
                } else if (iQ3 != 3) {
                    str2 = iQ3 != 4 ? "null" : "PRODUCT_NOT_SET";
                } else {
                    str2 = "SUBSCRIPTIONS";
                }
                hhg1.j(sb, " -> ", str2);
                return null;
            }
            gpbCheckout2 = gpbCheckout;
            GetCheckoutPageResponse.GpbCheckout.GpbOtp gpbOtpP = gpbCheckout2.p();
            if (gpbOtpP == null) {
                hhg1.n("Required value was null.");
                return null;
            }
            tsw0Var = new tsw0(gpbOtpP.p());
        }
        String strS = gpbCheckout2.s();
        aih1 aih1Var = new aih1(str, gpbCheckout.t().n());
        String strO3 = gpbCheckout.o();
        return new i050(tsw0Var, strS, (ata) null, aih1Var, (strO3 == null || ihc1.y0(strO3)) ? null : strO3);
    }
}
