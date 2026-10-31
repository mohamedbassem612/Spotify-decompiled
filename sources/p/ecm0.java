package p;

import com.spotify.checkout.proto.model.v1.proto.Face;
import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.Image;
import com.spotify.checkout.proto.model.v1.proto.LineItem;
import com.spotify.checkout.proto.model.v1.proto.Timeline;
import com.spotify.checkout.proto.model.v1.proto.e0;
import com.spotify.checkout.proto.model.v1.proto.h0;
import com.spotify.checkout.proto.model.v1.proto.m0;
import com.spotify.checkout.proto.model.v1.proto.m1;
import com.spotify.checkout.proto.model.v1.proto.n0;
import com.spotify.checkout.proto.model.v1.proto.n1;
import com.spotify.checkout.proto.model.v1.proto.o;
import com.spotify.checkout.proto.model.v1.proto.o0;
import com.spotify.checkout.proto.model.v1.proto.q;
import com.spotify.checkout.proto.model.v1.proto.u;
import com.spotify.checkout.proto.model.v1.proto.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ecm0 {
    public static Image a(String str) {
        op70 op70VarP = Image.p();
        op70VarP.q(str);
        op70VarP.n(str);
        return (Image) op70VarP.build();
    }

    public static bcm0 b(int i, int i2, vbm0 vbm0Var, int i3) {
        return new bcm0(new zbm0(e0.EXPANSION_STATE_GOOGLE_EXPANDED, (i3 & 2) != 0 ? new usw0(Collections.singletonList(new qnc1("premium_individual_se", new gnp0("recurring-p1m-1", null), (gtw0) null)), null, null) : null, "https://fast.com/", p7h.M(new String[]{"This is one warning", "And a second one to talk about the price difference when selecting Google for example"}), (i3 & 16) != 0, (i3 & 32) != 0 ? 1 : i, (i3 & 64) != 0 ? 1 : i2, true, (i3 & 256) != 0 ? wbm0.a : vbm0Var));
    }

    public static GetCheckoutPageResponse.GpbCheckout c(vsw0 vsw0Var, String str) {
        o oVarU = GetCheckoutPageResponse.GpbCheckout.u();
        oVarU.r(str);
        if (vsw0Var instanceof tsw0) {
            q qVarQ = GetCheckoutPageResponse.GpbCheckout.GpbOtp.q();
            qVarQ.n(((tsw0) vsw0Var).c);
            oVarU.n((GetCheckoutPageResponse.GpbCheckout.GpbOtp) qVarQ.build());
        } else if (vsw0Var instanceof usw0) {
            com.spotify.checkout.proto.model.v1.proto.t tVarV = GetCheckoutPageResponse.GpbCheckout.GpbSubscriptions.v();
            usw0 usw0Var = (usw0) vsw0Var;
            String str2 = usw0Var.d;
            List<qnc1> list = usw0Var.c;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (qnc1 qnc1Var : list) {
                x xVarQ = GetCheckoutPageResponse.GpbCheckout.GpbSubscriptions.GpbIdentifiers.q();
                xVarQ.r(qnc1Var.a);
                gnp0 gnp0Var = qnc1Var.b;
                if (gnp0Var != null) {
                    xVarQ.n(gnp0Var.a);
                    String str3 = gnp0Var.b;
                    if (str3 != null) {
                        xVarQ.q(str3);
                    }
                }
                arrayList.add((GetCheckoutPageResponse.GpbCheckout.GpbSubscriptions.GpbIdentifiers) xVarQ.build());
            }
            tVarV.n(arrayList);
            if (str2 != null) {
                u uVarQ = GetCheckoutPageResponse.GpbCheckout.GpbSubscriptions.GpbChangeSub.q();
                uVarQ.n(str2);
                nf21 nf21Var = usw0Var.e;
                nf21Var.getClass();
                uVarQ.q(nf21Var.a);
                tVarV.q((GetCheckoutPageResponse.GpbCheckout.GpbSubscriptions.GpbChangeSub) uVarQ.build());
            }
            oVarU.q((GetCheckoutPageResponse.GpbCheckout.GpbSubscriptions) tVarV.build());
        }
        return (GetCheckoutPageResponse.GpbCheckout) oVarU.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LineItem d(int i, int i2, boolean z) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        boolean z2 = (i2 & 2) == 0;
        boolean z3 = (i2 & 4) == 0;
        if ((i2 & 8) != 0) {
            i = 1;
        }
        h0 h0VarR = LineItem.r();
        m0 m0VarW = LineItem.SimpleLineItem.w();
        n0 n0VarT = LineItem.SimpleLineItem.Header.t();
        op70 op70VarP = Image.p();
        op70VarP.q("https://checkout.spotifycdn.com/static/images/product-images/recurring_premium.png");
        op70VarP.n("some alt");
        n0VarT.n((Image) op70VarP.build());
        int iC = l1d.C(i);
        String str = null;
        if (iC != 0) {
            if (iC == 1) {
                pd10 pd10VarP = Face.p();
                pd10VarP.r("https://vignette.wikia.nocookie.net/dragons/images/4/42/Smaug.jpg");
                pd10VarP.s();
                pd10VarP.q();
                pd10VarP.n();
                n0VarT.r((Face) pd10VarP.build());
            } else if (iC == 2) {
                pd10 pd10VarP2 = Face.p();
                pd10VarP2.r("https://oops.i.dont.exist/image.jpg");
                pd10VarP2.s();
                pd10VarP2.q();
                pd10VarP2.n();
                n0VarT.r((Face) pd10VarP2.build());
            } else if (iC == 3) {
                pd10 pd10VarP3 = Face.p();
                pd10VarP3.s();
                pd10VarP3.q();
                pd10VarP3.n();
                n0VarT.r((Face) pd10VarP3.build());
            } else {
                if (iC != 4) {
                    eg.o();
                    return null;
                }
                n0VarT.r((Face) Face.p().build());
            }
        }
        n0VarT.t("Premium Individual title that is very long and will take multiple lines");
        n0VarT.s("1 Premium account that will hopefully also take two lines");
        o0 o0VarR = LineItem.SimpleLineItem.Header.Price.r();
        o0VarR.q();
        if (z) {
            o0VarR.n();
        }
        o0VarR.r();
        n0VarT.q((LineItem.SimpleLineItem.Header.Price) o0VarR.build());
        m0VarW.r((LineItem.SimpleLineItem.Header) n0VarT.build());
        int iC2 = l1d.C(i);
        if (iC2 != 0) {
            if (iC2 == 1 || iC2 == 2 || iC2 == 3) {
                str = "Premium is purchased for <b>gpbtest_smaug</b>";
            } else {
                if (iC2 != 4) {
                    eg.o();
                    return null;
                }
                str = "One of your plan members will receive this subscription";
            }
        }
        m0VarW.n(f46.i0(new String[]{"Monthly billing starting today", str, "Cancel anytime online. <a href=\"https://www.spotify.com/legal/privacy-policy\">Terms apply</a>"}));
        if (z3) {
            m1 m1VarO = Timeline.o();
            n1 n1VarO = Timeline.TimelineItem.o();
            n1VarO.q(true);
            n1VarO.n("<b>Today:</b> 1 month for $3.00");
            n1 n1VarO2 = Timeline.TimelineItem.o();
            n1VarO2.q(false);
            n1VarO2.n("<b>DD/MM/YY:</b> 1 month for $3.00");
            n1 n1VarO3 = Timeline.TimelineItem.o();
            n1VarO3.q(false);
            n1VarO3.n("<b>Starting DD/MM/YY:</b> $9.99/month");
            m1VarO.n(p7h.M(new Timeline.TimelineItem[]{n1VarO.build(), n1VarO2.build(), n1VarO3.build()}));
            m0VarW.u((Timeline) m1VarO.build());
        }
        if (z2) {
            m0VarW.s();
        }
        h0VarR.q((LineItem.SimpleLineItem) m0VarW.build());
        return (LineItem) h0VarR.build();
    }
}
