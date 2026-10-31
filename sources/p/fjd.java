package p;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fjd extends hab0 implements iu30 {
    public static final fjd N0;
    public static final fjd O0;
    public static final fjd P0;
    public static final fjd Q0;
    public static final fjd R0;
    public static final fjd S0;
    public static final fjd T0;
    public static final fjd U0;
    public static final fjd V0;
    public static final fjd W0;
    public static final fjd X;
    public static final fjd X0;
    public static final fjd Y;
    public static final fjd Y0;
    public static final fjd Z;
    public static final fjd Z0;
    public static final fjd a1;
    public static final fjd b;
    public static final fjd b1;
    public static final fjd c;
    public static final fjd c1;
    public static final fjd d;
    public static final fjd d1;
    public static final fjd e;
    public static final fjd e1;
    public static final fjd f;
    public static final fjd g;
    public static final fjd h;
    public static final fjd i;
    public static final fjd t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new fjd(i2, (byte) 0);
        c = new fjd(i2, (byte) 1);
        d = new fjd(i2, (byte) 2);
        e = new fjd(i2, (byte) 3);
        f = new fjd(i2, (byte) 4);
        g = new fjd(i2, (byte) 5);
        h = new fjd(i2, (byte) 6);
        i = new fjd(i2, (byte) 7);
        t = new fjd(i2, (byte) 8);
        X = new fjd(i2, (byte) 9);
        Y = new fjd(i2, (byte) 10);
        Z = new fjd(i2, (byte) 11);
        N0 = new fjd(i2, (byte) 12);
        O0 = new fjd(i2, (byte) 13);
        P0 = new fjd(i2, (byte) 14);
        Q0 = new fjd(i2, (byte) 15);
        R0 = new fjd(i2, (byte) 16);
        S0 = new fjd(i2, (byte) 17);
        T0 = new fjd(i2, (byte) 18);
        U0 = new fjd(i2, (byte) 19);
        V0 = new fjd(i2, (byte) 20);
        W0 = new fjd(i2, (byte) 21);
        X0 = new fjd(i2, (byte) 22);
        Y0 = new fjd(i2, (byte) 23);
        Z0 = new fjd(i2, (byte) 24);
        a1 = new fjd(i2, (byte) 25);
        b1 = new fjd(i2, (byte) 26);
        c1 = new fjd(i2, (byte) 27);
        d1 = new fjd(i2, (byte) 28);
        e1 = new fjd(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fjd(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return rih1Var;
            case 1:
                return "canvas-disabled";
            case 2:
                return (String) obj;
            case 3:
                lrl lrlVar = ((prl) obj).a;
                if (lrlVar.equals(irl.a)) {
                    return old.a;
                }
                if (lrlVar.equals(jrl.a)) {
                    return qld.a;
                }
                if (lrlVar instanceof lrl) {
                    orl orlVar = lrlVar.a;
                    return new sld(orlVar != null ? new ttw0(orlVar.a, orlVar.b) : null);
                }
                if (lrlVar.equals(krl.a)) {
                    return rld.a;
                }
                if (lrlVar.equals(mrl.a)) {
                    return tld.a;
                }
                eg.o();
                return null;
            case 4:
                b261.B((e261) obj, "capped_list_footer");
                return rih1Var;
            case 5:
                return new xmd((wmd) obj, new af5(""));
            case 6:
                return end.a;
            case 7:
                return rih1Var;
            case 8:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 9:
                return rih1Var;
            case 10:
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setScaleType(b3k1.c);
                return videoSurfaceView;
            case grn1.d /* 12 */:
                return rih1Var;
            case 13:
                return (etd) obj;
            case 14:
                return ((etd) obj).d;
            case 15:
                ((Number) obj).intValue();
                return null;
            case 16:
                FrameLayout frameLayout = new FrameLayout((Context) obj);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                return frameLayout;
            case 17:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 19:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 21:
                if (!(obj instanceof zei1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zei1) obj;
            case 23:
                return Boolean.valueOf(obj instanceof jo70);
            case 24:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 25:
                return Boolean.valueOf(obj instanceof xkk1);
            case 26:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 27:
                return (String) obj;
            case 28:
                return (String) obj;
            default:
                return ((ho70) obj).a;
        }
    }
}
