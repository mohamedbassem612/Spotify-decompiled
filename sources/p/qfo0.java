package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qfo0 extends hab0 implements iu30 {
    public static final qfo0 N0;
    public static final qfo0 O0;
    public static final qfo0 P0;
    public static final qfo0 Q0;
    public static final qfo0 R0;
    public static final qfo0 S0;
    public static final qfo0 T0;
    public static final qfo0 U0;
    public static final qfo0 V0;
    public static final qfo0 W0;
    public static final qfo0 X;
    public static final qfo0 X0;
    public static final qfo0 Y;
    public static final qfo0 Y0;
    public static final qfo0 Z;
    public static final qfo0 Z0;
    public static final qfo0 a1;
    public static final qfo0 b;
    public static final qfo0 b1;
    public static final qfo0 c;
    public static final qfo0 c1;
    public static final qfo0 d;
    public static final qfo0 d1;
    public static final qfo0 e;
    public static final qfo0 e1;
    public static final qfo0 f;
    public static final qfo0 g;
    public static final qfo0 h;
    public static final qfo0 i;
    public static final qfo0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new qfo0(i2, (byte) 0);
        c = new qfo0(i2, (byte) 1);
        d = new qfo0(i2, (byte) 2);
        e = new qfo0(i2, (byte) 3);
        f = new qfo0(i2, (byte) 4);
        g = new qfo0(i2, (byte) 5);
        h = new qfo0(i2, (byte) 6);
        i = new qfo0(i2, (byte) 7);
        t = new qfo0(i2, (byte) 8);
        X = new qfo0(i2, (byte) 9);
        Y = new qfo0(i2, (byte) 10);
        Z = new qfo0(i2, (byte) 11);
        N0 = new qfo0(i2, (byte) 12);
        O0 = new qfo0(i2, (byte) 13);
        P0 = new qfo0(i2, (byte) 14);
        Q0 = new qfo0(i2, (byte) 15);
        R0 = new qfo0(i2, (byte) 16);
        S0 = new qfo0(i2, (byte) 17);
        T0 = new qfo0(i2, (byte) 18);
        U0 = new qfo0(i2, (byte) 19);
        V0 = new qfo0(i2, (byte) 20);
        W0 = new qfo0(i2, (byte) 21);
        X0 = new qfo0(i2, (byte) 22);
        Y0 = new qfo0(i2, (byte) 23);
        Z0 = new qfo0(i2, (byte) 24);
        a1 = new qfo0(i2, (byte) 25);
        b1 = new qfo0(i2, (byte) 26);
        c1 = new qfo0(i2, (byte) 27);
        d1 = new qfo0(i2, (byte) 28);
        e1 = new qfo0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qfo0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                return ((nwl0) obj).e();
            case 1:
                return ((nwl0) obj).e();
            case 2:
                return ((nwl0) obj).e();
            case 3:
                return new ggo0((r231) obj, false);
            case 4:
                return new e1l0((i3l0) obj);
            case 5:
                if (!(obj instanceof hzy) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hzy) obj;
            case 7:
                if (!(obj instanceof hzy) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hzy) obj;
            case 9:
                return new e1l0((i3l0) obj);
            case 10:
                return Boolean.valueOf(obj instanceof nqm);
            case 11:
                if (obj != null) {
                    return (nqm) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.contribution.model.ContributionKindCapabilities");
                return null;
            case 12:
                return (mld) obj;
            case 13:
                return (nqm) obj;
            case 14:
                return dio0.a;
            case 15:
                List list = (List) obj;
                return list == null ? z6x.a : list;
            case 16:
                return (String) obj;
            case 17:
                return (String) obj;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (!(obj instanceof List) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 20:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 22:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 24:
                return ((xho0) obj).a.a;
            case 25:
                return rih1Var;
            case 26:
                return ((wlo0) obj).a;
            case 27:
                return rih1Var;
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
