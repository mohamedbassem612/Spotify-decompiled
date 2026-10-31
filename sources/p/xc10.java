package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.encoremobile.facepile.FacePileView;
import java.util.Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xc10 extends hab0 implements iu30 {
    public static final xc10 N0;
    public static final xc10 O0;
    public static final xc10 P0;
    public static final xc10 Q0;
    public static final xc10 R0;
    public static final xc10 S0;
    public static final xc10 T0;
    public static final xc10 U0;
    public static final xc10 V0;
    public static final xc10 W0;
    public static final xc10 X;
    public static final xc10 X0;
    public static final xc10 Y;
    public static final xc10 Y0;
    public static final xc10 Z;
    public static final xc10 Z0;
    public static final xc10 a1;
    public static final xc10 b;
    public static final xc10 b1;
    public static final xc10 c;
    public static final xc10 c1;
    public static final xc10 d;
    public static final xc10 d1;
    public static final xc10 e;
    public static final xc10 e1;
    public static final xc10 f;
    public static final xc10 g;
    public static final xc10 h;
    public static final xc10 i;
    public static final xc10 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new xc10(i2, (byte) 0);
        c = new xc10(i2, (byte) 1);
        d = new xc10(i2, (byte) 2);
        e = new xc10(i2, (byte) 3);
        f = new xc10(i2, (byte) 4);
        g = new xc10(i2, (byte) 5);
        h = new xc10(i2, (byte) 6);
        i = new xc10(i2, (byte) 7);
        t = new xc10(i2, (byte) 8);
        X = new xc10(i2, (byte) 9);
        Y = new xc10(i2, (byte) 10);
        Z = new xc10(i2, (byte) 11);
        N0 = new xc10(i2, (byte) 12);
        O0 = new xc10(i2, (byte) 13);
        P0 = new xc10(i2, (byte) 14);
        Q0 = new xc10(i2, (byte) 15);
        R0 = new xc10(i2, (byte) 16);
        S0 = new xc10(i2, (byte) 17);
        T0 = new xc10(i2, (byte) 18);
        U0 = new xc10(i2, (byte) 19);
        V0 = new xc10(i2, (byte) 20);
        W0 = new xc10(i2, (byte) 21);
        X0 = new xc10(i2, (byte) 22);
        Y0 = new xc10(i2, (byte) 23);
        Z0 = new xc10(i2, (byte) 24);
        a1 = new xc10(i2, (byte) 25);
        b1 = new xc10(i2, (byte) 26);
        c1 = new xc10(i2, (byte) 27);
        d1 = new xc10(i2, (byte) 28);
        e1 = new xc10(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xc10(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return Boolean.valueOf(obj instanceof cd8);
            case 1:
                return (k1r) obj;
            case 2:
                return Boolean.valueOf(obj instanceof s78);
            case 3:
                return (k1r) obj;
            case 4:
                return (le10) jhc1.t((Bundle) obj, "face_header_state", le10.class);
            case 5:
                return new FacePileView((Context) obj, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            case 6:
                return hm5.P(xay.e(2, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6)), xay.f(2, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6)));
            case 7:
                return rih1Var;
            case 8:
                String str = ((wj10) obj).d;
                Long lD0 = str != null ? nhc1.d0(10, str) : null;
                return new lk10((13 & 1) != 0 ? "" : null, (13 & 2) != 0 ? 1 : (str == null || str.length() == 0) ? 1 : 4, null, null, (13 & 16) == 0 ? "https://fan-events-cdn.spotifycdn.com/redemptions/static/redemption-box.webp" : "", (13 & 32) != 0 ? null : lD0);
            case 9:
                b261.t((e261) obj, 0);
                return rih1Var;
            case 10:
                return new sk10(((ter0) obj).a);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return Collections.singleton(((ter0) obj).a);
            case grn1.d /* 12 */:
                return new hv70("fans-also-like-on", (x360) null, ((uer0) obj).a, false, (n1x) null, 112);
            case 13:
                return alk1.c(((uer0) obj).a);
            case 14:
                return ((xa5) obj).a(hm5.P(xay.e(3, (ni20) null), xay.f(3, (ni20) null)), hm5.h(2, (vu30) null));
            case 15:
                b261.d((e261) obj);
                return rih1Var;
            case 16:
                b261.c((e261) obj);
                return rih1Var;
            case 17:
                b261.c((e261) obj);
                return rih1Var;
            case 18:
                return new hv70("featuring-creator", (x360) null, ((ver0) obj).a, false, (n1x) null, 112);
            case 19:
                return alk1.c(((ver0) obj).a);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 21:
                return (Parcelable) jhc1.t((Bundle) obj, "parcelable", vo10.class);
            case 22:
                return ((ro10) obj).a;
            case 23:
                return Integer.valueOf(((q5t0) obj).X());
            case 24:
                return z6b1.a(((fp10) obj).a);
            case 25:
                return ((fp10) obj).b.a;
            case 26:
                dhl dhlVar = (dhl) obj;
                ube ubeVar = dhlVar.e;
                ihl ihlVar = dhlVar.c;
                yf.p(ubeVar, ihlVar.e, 0.0f, 6);
                yf.p(dhlVar.g, ihlVar.g, 0.0f, 6);
                return rih1Var;
            case 27:
                return new ohl0((phl0) obj, (byte) 4);
            case 28:
                return new ohl0((phl0) obj, (byte) 2);
            default:
                return new ohl0((phl0) obj, (byte) 0);
        }
    }
}
