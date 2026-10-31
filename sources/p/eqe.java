package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eqe extends hab0 implements vu30 {
    public static final eqe N0;
    public static final eqe O0;
    public static final eqe P0;
    public static final eqe Q0;
    public static final eqe R0;
    public static final eqe S0;
    public static final eqe T0;
    public static final eqe U0;
    public static final eqe V0;
    public static final eqe W0;
    public static final eqe X;
    public static final eqe X0;
    public static final eqe Y;
    public static final eqe Y0;
    public static final eqe Z;
    public static final eqe Z0;
    public static final eqe a1;
    public static final eqe b;
    public static final eqe b1;
    public static final eqe c;
    public static final eqe c1;
    public static final eqe d;
    public static final eqe d1;
    public static final eqe e;
    public static final eqe e1;
    public static final eqe f;
    public static final eqe g;
    public static final eqe h;
    public static final eqe i;
    public static final eqe t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new eqe(i2, (byte) 0);
        c = new eqe(i2, (byte) 1);
        d = new eqe(i2, (byte) 2);
        e = new eqe(i2, (byte) 3);
        f = new eqe(i2, (byte) 4);
        g = new eqe(i2, (byte) 5);
        h = new eqe(i2, (byte) 6);
        i = new eqe(i2, (byte) 7);
        t = new eqe(i2, (byte) 8);
        X = new eqe(i2, (byte) 9);
        Y = new eqe(i2, (byte) 10);
        Z = new eqe(i2, (byte) 11);
        N0 = new eqe(i2, (byte) 12);
        O0 = new eqe(i2, (byte) 13);
        P0 = new eqe(i2, (byte) 14);
        Q0 = new eqe(i2, (byte) 15);
        R0 = new eqe(i2, (byte) 16);
        S0 = new eqe(i2, (byte) 17);
        T0 = new eqe(i2, (byte) 18);
        U0 = new eqe(i2, (byte) 19);
        V0 = new eqe(i2, (byte) 20);
        W0 = new eqe(i2, (byte) 21);
        X0 = new eqe(i2, (byte) 22);
        Y0 = new eqe(i2, (byte) 23);
        Z0 = new eqe(i2, (byte) 24);
        a1 = new eqe(i2, (byte) 25);
        b1 = new eqe(i2, (byte) 26);
        c1 = new eqe(i2, (byte) 27);
        d1 = new eqe(i2, (byte) 28);
        e1 = new eqe(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eqe(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        bve bveVar;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return First.c((ppe) obj2, Collections.singleton(rpe.a));
            case 1:
                int i2 = rre.a[((vux) obj2).ordinal()];
                yxx yxxVar = ((afx) obj).b;
                return new u7h(i2 == 1 ? yxxVar.b : yxxVar.a);
            case 2:
                Bundle bundle = (Bundle) obj2;
                return (bundle == null || (bveVar = (bve) jhc1.t(bundle, "chat_details", bve.class)) == null) ? new bve((qte) obj, false) : bve.a(bveVar, (qte) null, false, 1);
            case 3:
                return ((Boolean) obj2).booleanValue() ? "ENABLED" : "DISABLED_CAN_ENABLE";
            case 4:
                return (r9f) obj;
            case 5:
                return new caf((vba0) obj2);
            case 6:
                ncf ncfVar = (ncf) obj;
                Bundle bundle2 = (Bundle) obj2;
                if (bundle2 == null) {
                    return ncfVar;
                }
                Object objT = jhc1.t(bundle2, "chat_conversation_model", ncf.class);
                objT.getClass();
                ncf ncfVar2 = (ncf) objT;
                h5f h5fVar = ncfVar2.h1;
                if (!ncfVar.i1.contains(h5fVar)) {
                    h5fVar = h5f.b;
                }
                return ncf.a(ncfVar2, null, null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, h5fVar, ncfVar.i1, -1, 1);
            case 7:
                return Next.j();
            case 8:
                return First.b((vif) obj2);
            case 9:
                return (enf) obj2;
            case 10:
                return Next.j();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                isf isfVar = (isf) obj;
                isf isfVar2 = (isf) obj2;
                return Boolean.valueOf((isfVar == null || isfVar2 == null || !isfVar.b.equals(isfVar2.b)) ? false : true);
            case grn1.d /* 12 */:
                long j = ((yr80) obj).a;
                long j2 = ((yr80) obj2).a;
                return irn1.l0(0.0f, 400.0f, null, 5);
            case 13:
                long j3 = ((yr80) obj).a;
                long j4 = ((yr80) obj2).a;
                return irn1.j0();
            case 14:
                long j5 = ((yr80) obj).a;
                long j6 = ((yr80) obj2).a;
                return irn1.o0(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 0, h4g.a, 2);
            case 15:
                long j7 = ((yr80) obj).a;
                long j8 = ((yr80) obj2).a;
                return irn1.o0(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 0, h4g.a, 2);
            case 16:
                return new bcm0(new ybm0("Some checkout status", "Explanation of the status"));
            case 17:
                return new bcm0(new fki0("https://onemillioncheckboxes.com/", (byte) 15));
            case 18:
                return new bcm0(new acm0("Follow this link", "https://wikipedia.org/wiki/Error", "Go back"));
            case 19:
                return new bcm0(ook0.Y0);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return (t6g) ((RetrofitMaker) obj).createWebgateService(t6g.class, "android-gpb-choicescreenuc");
            case 21:
                k370 k370Var = new k370();
                k370Var.f((l370) null, "https://wgint.spotify.net");
                return (t6g) ((RetrofitMaker) obj).createCustomHostService(t6g.class, k370Var.b());
            case 22:
                return new bcm0(dcm0.a);
            case 23:
                return new bcm0(new uah0((RetrofitMaker) obj, (dma1) obj2, (byte) 24));
            case 24:
                return new bcm0(new ccm0(new usw0(p7h.M(new qnc1[]{new qnc1("premium_individual_se", new gnp0("recurring-p1m-1", (String) null), (gtw0) null), new qnc1("premium_duo_se", new gnp0("recurring-p1m", (String) null), (gtw0) null)}), (String) null, (nf21) null), "https://fast.com/"));
            case 25:
                return new bcm0(new os("Item not available title", "Go back", (byte) 21));
            case 26:
                ((k3x) obj).a = (gt40) obj2;
                return rih1Var;
            case 27:
                ((k3x) obj).b = (z9h) obj2;
                return rih1Var;
            case 28:
                Object objT2 = jhc1.t((Bundle) obj, "parcelable", dmg.class);
                objT2.getClass();
                return (Parcelable) objT2;
            default:
                return new fng((jo70) obj, (xkk1) obj2);
        }
    }
}
