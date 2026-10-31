package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ikv extends hab0 implements iu30 {
    public static final ikv N0;
    public static final ikv O0;
    public static final ikv P0;
    public static final ikv Q0;
    public static final ikv R0;
    public static final ikv S0;
    public static final ikv T0;
    public static final ikv U0;
    public static final ikv V0;
    public static final ikv W0;
    public static final ikv X;
    public static final ikv X0;
    public static final ikv Y;
    public static final ikv Y0;
    public static final ikv Z;
    public static final ikv Z0;
    public static final ikv a1;
    public static final ikv b;
    public static final ikv b1;
    public static final ikv c;
    public static final ikv c1;
    public static final ikv d;
    public static final ikv d1;
    public static final ikv e;
    public static final ikv e1;
    public static final ikv f;
    public static final ikv g;
    public static final ikv h;
    public static final ikv i;
    public static final ikv t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ikv(i2, (byte) 0);
        c = new ikv(i2, (byte) 1);
        d = new ikv(i2, (byte) 2);
        e = new ikv(i2, (byte) 3);
        f = new ikv(i2, (byte) 4);
        g = new ikv(i2, (byte) 5);
        h = new ikv(i2, (byte) 6);
        i = new ikv(i2, (byte) 7);
        t = new ikv(i2, (byte) 8);
        X = new ikv(i2, (byte) 9);
        Y = new ikv(i2, (byte) 10);
        Z = new ikv(i2, (byte) 11);
        N0 = new ikv(i2, (byte) 12);
        O0 = new ikv(i2, (byte) 13);
        P0 = new ikv(i2, (byte) 14);
        Q0 = new ikv(i2, (byte) 15);
        R0 = new ikv(i2, (byte) 16);
        S0 = new ikv(i2, (byte) 17);
        T0 = new ikv(i2, (byte) 18);
        U0 = new ikv(i2, (byte) 19);
        V0 = new ikv(i2, (byte) 20);
        W0 = new ikv(i2, (byte) 21);
        X0 = new ikv(i2, (byte) 22);
        Y0 = new ikv(i2, (byte) 23);
        Z0 = new ikv(i2, (byte) 24);
        a1 = new ikv(i2, (byte) 25);
        b1 = new ikv(i2, (byte) 26);
        c1 = new ikv(i2, (byte) 27);
        d1 = new ikv(i2, (byte) 28);
        e1 = new ikv(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ikv(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((iey0) obj).a;
            case 1:
                return ((iey0) obj).a;
            case 2:
                return ((iey0) obj).a;
            case 3:
                return ((iey0) obj).a;
            case 4:
                return ((iey0) obj).a;
            case 5:
                return ((iey0) obj).a;
            case 6:
                return ((iey0) obj).a;
            case 7:
                return new a2v(((iey0) obj).a, 1);
            case 8:
                return ((iey0) obj).a;
            case 9:
                return ((iey0) obj).a;
            case 10:
                return ((iey0) obj).a;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return ((iey0) obj).a;
            case grn1.d /* 12 */:
                return ((iey0) obj).a;
            case 13:
                return ((iey0) obj).a;
            case 14:
                return new a2v(((iey0) obj).a, 1);
            case 15:
                return ((iey0) obj).a;
            case 16:
                return ((iey0) obj).a;
            case 17:
                return ((iey0) obj).a;
            case 18:
                return ((iey0) obj).a;
            case 19:
                return ((iey0) obj).a;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return ((iey0) obj).a;
            case 21:
                return new a2v(((iey0) obj).a, 1);
            case 22:
                return ((iey0) obj).a;
            case 23:
                return ((iey0) obj).a;
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
