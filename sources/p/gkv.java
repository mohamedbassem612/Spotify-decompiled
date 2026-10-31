package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gkv extends hab0 implements iu30 {
    public static final gkv N0;
    public static final gkv O0;
    public static final gkv P0;
    public static final gkv Q0;
    public static final gkv R0;
    public static final gkv S0;
    public static final gkv T0;
    public static final gkv U0;
    public static final gkv V0;
    public static final gkv W0;
    public static final gkv X;
    public static final gkv X0;
    public static final gkv Y;
    public static final gkv Y0;
    public static final gkv Z;
    public static final gkv Z0;
    public static final gkv a1;
    public static final gkv b;
    public static final gkv b1;
    public static final gkv c;
    public static final gkv c1;
    public static final gkv d;
    public static final gkv d1;
    public static final gkv e;
    public static final gkv e1;
    public static final gkv f;
    public static final gkv g;
    public static final gkv h;
    public static final gkv i;
    public static final gkv t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new gkv(i2, (byte) 0);
        c = new gkv(i2, (byte) 1);
        d = new gkv(i2, (byte) 2);
        e = new gkv(i2, (byte) 3);
        f = new gkv(i2, (byte) 4);
        g = new gkv(i2, (byte) 5);
        h = new gkv(i2, (byte) 6);
        i = new gkv(i2, (byte) 7);
        t = new gkv(i2, (byte) 8);
        X = new gkv(i2, (byte) 9);
        Y = new gkv(i2, (byte) 10);
        Z = new gkv(i2, (byte) 11);
        N0 = new gkv(i2, (byte) 12);
        O0 = new gkv(i2, (byte) 13);
        P0 = new gkv(i2, (byte) 14);
        Q0 = new gkv(i2, (byte) 15);
        R0 = new gkv(i2, (byte) 16);
        S0 = new gkv(i2, (byte) 17);
        T0 = new gkv(i2, (byte) 18);
        U0 = new gkv(i2, (byte) 19);
        V0 = new gkv(i2, (byte) 20);
        W0 = new gkv(i2, (byte) 21);
        X0 = new gkv(i2, (byte) 22);
        Y0 = new gkv(i2, (byte) 23);
        Z0 = new gkv(i2, (byte) 24);
        a1 = new gkv(i2, (byte) 25);
        b1 = new gkv(i2, (byte) 26);
        c1 = new gkv(i2, (byte) 27);
        d1 = new gkv(i2, (byte) 28);
        e1 = new gkv(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gkv(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (obj != null) {
                    return (hzy) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.entitytypetrait.EntityTypeTrait");
                return null;
            case 1:
                return Boolean.valueOf(obj instanceof h2v);
            case 2:
                if (obj != null) {
                    return (h2v) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.download.state.DownloadStatus");
                return null;
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
                return Boolean.valueOf(obj instanceof jo70);
            case 8:
                return Boolean.valueOf(obj instanceof jo70);
            case 9:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 10:
                return Boolean.valueOf(obj instanceof xkk1);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case grn1.d /* 12 */:
                return Boolean.valueOf(obj instanceof hzy);
            case 13:
                if (obj != null) {
                    return (hzy) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.entitytypetrait.EntityTypeTrait");
                return null;
            case 14:
                return Boolean.valueOf(obj instanceof jo70);
            case 15:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 16:
                return Boolean.valueOf(obj instanceof xkk1);
            case 17:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 18:
                return Boolean.valueOf(obj instanceof hll);
            case 19:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                if (obj != null) {
                    return (hll) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
                return null;
            case 21:
                return Boolean.valueOf(obj instanceof hzy);
            case 22:
                if (obj != null) {
                    return (hzy) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.entitytypetrait.EntityTypeTrait");
                return null;
            case 23:
                return Boolean.valueOf(obj instanceof h2v);
            case 24:
                if (obj != null) {
                    return (h2v) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.download.state.DownloadStatus");
                return null;
            case 25:
                return Boolean.valueOf(obj instanceof jo70);
            case 26:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 27:
                return Boolean.valueOf(obj instanceof xkk1);
            case 28:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            default:
                return Boolean.valueOf(obj instanceof jo70);
        }
    }
}
