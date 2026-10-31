package p;

import android.os.Bundle;
import com.google.protobuf.Any;
import com.spotify.watchfeed.component.item.v1.VerticalOnboardingComponent;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nvi1 extends hab0 implements iu30 {
    public static final nvi1 N0;
    public static final nvi1 O0;
    public static final nvi1 P0;
    public static final nvi1 Q0;
    public static final nvi1 R0;
    public static final nvi1 S0;
    public static final nvi1 T0;
    public static final nvi1 U0;
    public static final nvi1 V0;
    public static final nvi1 W0;
    public static final nvi1 X;
    public static final nvi1 X0;
    public static final nvi1 Y;
    public static final nvi1 Y0;
    public static final nvi1 Z;
    public static final nvi1 Z0;
    public static final nvi1 a1;
    public static final nvi1 b;
    public static final nvi1 b1;
    public static final nvi1 c;
    public static final nvi1 c1;
    public static final nvi1 d;
    public static final nvi1 d1;
    public static final nvi1 e;
    public static final nvi1 e1;
    public static final nvi1 f;
    public static final nvi1 g;
    public static final nvi1 h;
    public static final nvi1 i;
    public static final nvi1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new nvi1(i2, (byte) 0);
        c = new nvi1(i2, (byte) 1);
        d = new nvi1(i2, (byte) 2);
        e = new nvi1(i2, (byte) 3);
        f = new nvi1(i2, (byte) 4);
        g = new nvi1(i2, (byte) 5);
        h = new nvi1(i2, (byte) 6);
        i = new nvi1(i2, (byte) 7);
        t = new nvi1(i2, (byte) 8);
        X = new nvi1(i2, (byte) 9);
        Y = new nvi1(i2, (byte) 10);
        Z = new nvi1(i2, (byte) 11);
        N0 = new nvi1(i2, (byte) 12);
        O0 = new nvi1(i2, (byte) 13);
        P0 = new nvi1(i2, (byte) 14);
        Q0 = new nvi1(i2, (byte) 15);
        R0 = new nvi1(i2, (byte) 16);
        S0 = new nvi1(i2, (byte) 17);
        T0 = new nvi1(i2, (byte) 18);
        U0 = new nvi1(i2, (byte) 19);
        V0 = new nvi1(i2, (byte) 20);
        W0 = new nvi1(i2, (byte) 21);
        X0 = new nvi1(i2, (byte) 22);
        Y0 = new nvi1(i2, (byte) 23);
        Z0 = new nvi1(i2, (byte) 24);
        a1 = new nvi1(i2, (byte) 25);
        b1 = new nvi1(i2, (byte) 26);
        c1 = new nvi1(i2, (byte) 27);
        d1 = new nvi1(i2, (byte) 28);
        e1 = new nvi1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nvi1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                return ((kvi1) obj).a;
            case 1:
                if (!(obj instanceof avi1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (avi1) obj;
            case 3:
                return Boolean.valueOf(obj instanceof jo70);
            case 4:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 5:
                return Boolean.valueOf(obj instanceof xkk1);
            case 6:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 7:
                return tvi1.f;
            case 8:
                return rih1Var;
            case 9:
                Bundle bundle = new Bundle();
                uzi1 uzi1Var = ((xzi1) obj).a;
                if (uzi1Var instanceof uzi1) {
                    bundle.putSerializable("verification_onboarding_step", uzi1Var.a);
                }
                return bundle;
            case 10:
                return mno1.h(new mmr0[]{new mmr0("verificationCodeVerifyBundle", (x1j1) obj)});
            case 11:
                return rih1Var;
            case 12:
                return rih1Var;
            case 13:
                return ((h3j1) obj).a;
            case 14:
                return (uxn) obj;
            case 15:
                return new i3j1((String) null, (z2a) null, (List) null, 15);
            case 16:
                return ((h3j1) obj).a;
            case 17:
                return (a7q0) obj;
            case 18:
                if (!(obj instanceof a7q0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (a7q0) obj;
            case 20:
                if (!(obj instanceof uxn) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (uxn) obj;
            case 22:
                VerticalOnboardingComponent verticalOnboardingComponentT = VerticalOnboardingComponent.t(((Any) obj).q());
                return new p5j1(verticalOnboardingComponentT.getTitle(), verticalOnboardingComponentT.p(), verticalOnboardingComponentT.q(), verticalOnboardingComponentT.r(), verticalOnboardingComponentT.s(), verticalOnboardingComponentT.n(), verticalOnboardingComponentT.o());
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                n6j1 n6j1Var = ((q6j1) obj).a;
                return new n6j1(n6j1Var.a, n6j1Var.b, n6j1Var.c, n6j1Var.d, n6j1Var.e, n6j1Var.f, n6j1Var.g, "home:mdc_card");
            case 24:
                if (!(obj instanceof prl) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (prl) obj;
            case 26:
                return Boolean.valueOf(obj instanceof oox0);
            case 27:
                if (obj != null) {
                    return (oox0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.promov3trait.PromoV3Trait");
                return null;
            case 28:
                return Boolean.valueOf(obj instanceof yo60);
            default:
                if (obj != null) {
                    return (yo60) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.homepreviewplaybacktrait.HomePreviewPlaybackTrait");
                return null;
        }
    }
}
