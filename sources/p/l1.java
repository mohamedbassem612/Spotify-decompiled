package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l1 extends hab0 implements iu30 {
    public static final l1 N0;
    public static final l1 O0;
    public static final l1 P0;
    public static final l1 Q0;
    public static final l1 R0;
    public static final l1 S0;
    public static final l1 T0;
    public static final l1 U0;
    public static final l1 V0;
    public static final l1 W0;
    public static final l1 X;
    public static final l1 X0;
    public static final l1 Y;
    public static final l1 Y0;
    public static final l1 Z;
    public static final l1 Z0;
    public static final l1 a1;
    public static final l1 b;
    public static final l1 b1;
    public static final l1 c;
    public static final l1 c1;
    public static final l1 d;
    public static final l1 d1;
    public static final l1 e;
    public static final l1 e1;
    public static final l1 f;
    public static final l1 g;
    public static final l1 h;
    public static final l1 i;
    public static final l1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new l1(i2, (byte) 0);
        c = new l1(i2, (byte) 1);
        d = new l1(i2, (byte) 2);
        e = new l1(i2, (byte) 3);
        f = new l1(i2, (byte) 4);
        g = new l1(i2, (byte) 5);
        h = new l1(i2, (byte) 6);
        i = new l1(i2, (byte) 7);
        t = new l1(i2, (byte) 8);
        X = new l1(i2, (byte) 9);
        Y = new l1(i2, (byte) 10);
        Z = new l1(i2, (byte) 11);
        N0 = new l1(i2, (byte) 12);
        O0 = new l1(i2, (byte) 13);
        P0 = new l1(i2, (byte) 14);
        Q0 = new l1(i2, (byte) 15);
        R0 = new l1(i2, (byte) 16);
        S0 = new l1(i2, (byte) 17);
        T0 = new l1(i2, (byte) 18);
        U0 = new l1(i2, (byte) 19);
        V0 = new l1(i2, (byte) 20);
        W0 = new l1(i2, (byte) 21);
        X0 = new l1(i2, (byte) 22);
        Y0 = new l1(i2, (byte) 23);
        Z0 = new l1(i2, (byte) 24);
        a1 = new l1(i2, (byte) 25);
        b1 = new l1(i2, (byte) 26);
        c1 = new l1(i2, (byte) 27);
        d1 = new l1(i2, (byte) 28);
        e1 = new l1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((c1) obj).a;
            case 1:
                return ((c1) obj).a;
            case 2:
                return ((c1) obj).a;
            case 3:
                return ((c1) obj).a;
            case 4:
                return ((c1) obj).a;
            case 5:
                return ((c1) obj).a;
            case 6:
                return ((c1) obj).a;
            case 7:
                return ((c1) obj).a;
            case 8:
                if (obj instanceof rih1) {
                    return null;
                }
                return (uio) obj;
            case 9:
                if (!(obj instanceof pn30) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (pn30) obj;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                if (!(obj instanceof pnt) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case grn1.d /* 12 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (pnt) obj;
            case 13:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 15:
                if (!(obj instanceof a7q0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (a7q0) obj;
            case 17:
                if (!(obj instanceof zoy0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zoy0) obj;
            case 19:
                if (!(obj instanceof uio) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return Boolean.valueOf(obj instanceof jo70);
            case 21:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 22:
                return Boolean.valueOf(obj instanceof hzy);
            case 23:
                if (obj != null) {
                    return (hzy) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.entitytypetrait.EntityTypeTrait");
                return null;
            case 24:
                return ((b3) obj).a;
            case 25:
                return ((b3) obj).a;
            case 26:
                return ((b3) obj).a;
            case 27:
                return ((b3) obj).a;
            case 28:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
        }
    }
}
