package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hkv extends hab0 implements iu30 {
    public static final hkv N0;
    public static final hkv O0;
    public static final hkv P0;
    public static final hkv Q0;
    public static final hkv R0;
    public static final hkv S0;
    public static final hkv T0;
    public static final hkv U0;
    public static final hkv V0;
    public static final hkv W0;
    public static final hkv X;
    public static final hkv X0;
    public static final hkv Y;
    public static final hkv Y0;
    public static final hkv Z;
    public static final hkv Z0;
    public static final hkv a1;
    public static final hkv b;
    public static final hkv b1;
    public static final hkv c;
    public static final hkv c1;
    public static final hkv d;
    public static final hkv d1;
    public static final hkv e;
    public static final hkv e1;
    public static final hkv f;
    public static final hkv g;
    public static final hkv h;
    public static final hkv i;
    public static final hkv t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new hkv(i2, (byte) 0);
        c = new hkv(i2, (byte) 1);
        d = new hkv(i2, (byte) 2);
        e = new hkv(i2, (byte) 3);
        f = new hkv(i2, (byte) 4);
        g = new hkv(i2, (byte) 5);
        h = new hkv(i2, (byte) 6);
        i = new hkv(i2, (byte) 7);
        t = new hkv(i2, (byte) 8);
        X = new hkv(i2, (byte) 9);
        Y = new hkv(i2, (byte) 10);
        Z = new hkv(i2, (byte) 11);
        N0 = new hkv(i2, (byte) 12);
        O0 = new hkv(i2, (byte) 13);
        P0 = new hkv(i2, (byte) 14);
        Q0 = new hkv(i2, (byte) 15);
        R0 = new hkv(i2, (byte) 16);
        S0 = new hkv(i2, (byte) 17);
        T0 = new hkv(i2, (byte) 18);
        U0 = new hkv(i2, (byte) 19);
        V0 = new hkv(i2, (byte) 20);
        W0 = new hkv(i2, (byte) 21);
        X0 = new hkv(i2, (byte) 22);
        Y0 = new hkv(i2, (byte) 23);
        Z0 = new hkv(i2, (byte) 24);
        a1 = new hkv(i2, (byte) 25);
        b1 = new hkv(i2, (byte) 26);
        c1 = new hkv(i2, (byte) 27);
        d1 = new hkv(i2, (byte) 28);
        e1 = new hkv(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hkv(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return Boolean.valueOf(obj instanceof xkk1);
            case 1:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 2:
                return Boolean.valueOf(obj instanceof xkk1);
            case 3:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 4:
                return Boolean.valueOf(obj instanceof hll);
            case 5:
                if (obj != null) {
                    return (hll) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
                return null;
            case 6:
                return Boolean.valueOf(obj instanceof hzy);
            case 7:
                if (obj != null) {
                    return (hzy) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.entitytypetrait.EntityTypeTrait");
                return null;
            case 8:
                return Boolean.valueOf(obj instanceof iix0);
            case 9:
                if (obj != null) {
                    return (iix0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.progressstate.state.ProgressState");
                return null;
            case 10:
                return Boolean.valueOf(obj instanceof h2v);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case grn1.d /* 12 */:
                if (obj != null) {
                    return (h2v) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.download.state.DownloadStatus");
                return null;
            case 13:
                return Boolean.valueOf(obj instanceof zoy0);
            case 14:
                if (obj != null) {
                    return (zoy0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.publishingmetadatatrait.PublishingMetadataTrait");
                return null;
            case 15:
                return Boolean.valueOf(obj instanceof jo70);
            case 16:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 17:
                return Boolean.valueOf(obj instanceof xkk1);
            case 18:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 19:
                return Boolean.valueOf(obj instanceof hzy);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                if (obj != null) {
                    return (hzy) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.entitytypetrait.EntityTypeTrait");
                return null;
            case 21:
                return Boolean.valueOf(obj instanceof jo70);
            case 22:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 23:
                return Boolean.valueOf(obj instanceof xkk1);
            case 24:
                return ((iey0) obj).a;
            case 25:
                return ((iey0) obj).a;
            case 26:
                return ((iey0) obj).a;
            case 27:
                return ((iey0) obj).a;
            case 28:
                return ((iey0) obj).a;
            default:
                return ((iey0) obj).a;
        }
    }
}
