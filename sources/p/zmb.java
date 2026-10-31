package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zmb extends hab0 implements iu30 {
    public static final zmb N0;
    public static final zmb O0;
    public static final zmb P0;
    public static final zmb Q0;
    public static final zmb R0;
    public static final zmb S0;
    public static final zmb T0;
    public static final zmb U0;
    public static final zmb V0;
    public static final zmb W0;
    public static final zmb X;
    public static final zmb X0;
    public static final zmb Y;
    public static final zmb Y0;
    public static final zmb Z;
    public static final zmb Z0;
    public static final zmb a1;
    public static final zmb b;
    public static final zmb b1;
    public static final zmb c;
    public static final zmb c1;
    public static final zmb d;
    public static final zmb d1;
    public static final zmb e;
    public static final zmb e1;
    public static final zmb f;
    public static final zmb g;
    public static final zmb h;
    public static final zmb i;
    public static final zmb t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new zmb(i2, (byte) 0);
        c = new zmb(i2, (byte) 1);
        d = new zmb(i2, (byte) 2);
        e = new zmb(i2, (byte) 3);
        f = new zmb(i2, (byte) 4);
        g = new zmb(i2, (byte) 5);
        h = new zmb(i2, (byte) 6);
        i = new zmb(i2, (byte) 7);
        t = new zmb(i2, (byte) 8);
        X = new zmb(i2, (byte) 9);
        Y = new zmb(i2, (byte) 10);
        Z = new zmb(i2, (byte) 11);
        N0 = new zmb(i2, (byte) 12);
        O0 = new zmb(i2, (byte) 13);
        P0 = new zmb(i2, (byte) 14);
        Q0 = new zmb(i2, (byte) 15);
        R0 = new zmb(i2, (byte) 16);
        S0 = new zmb(i2, (byte) 17);
        T0 = new zmb(i2, (byte) 18);
        U0 = new zmb(i2, (byte) 19);
        V0 = new zmb(i2, (byte) 20);
        W0 = new zmb(i2, (byte) 21);
        X0 = new zmb(i2, (byte) 22);
        Y0 = new zmb(i2, (byte) 23);
        Z0 = new zmb(i2, (byte) 24);
        a1 = new zmb(i2, (byte) 25);
        b1 = new zmb(i2, (byte) 26);
        c1 = new zmb(i2, (byte) 27);
        d1 = new zmb(i2, (byte) 28);
        e1 = new zmb(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zmb(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new ah01(((fnb) obj).a);
            case 1:
                return (String) obj;
            case 2:
                return (iix0) obj;
            case 3:
                return fg91.b;
            case 4:
                return ((bnb) obj).a;
            case 5:
                return "apply-child-content-restrictions";
            case 6:
                return Boolean.valueOf((obj instanceof zg01) || (obj instanceof rih1));
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zg01) obj;
            case 8:
                return Boolean.valueOf((obj instanceof String) || (obj instanceof rih1));
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 10:
                return Boolean.valueOf((obj instanceof iix0) || (obj instanceof rih1));
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iix0) obj;
            case 12:
                return new tnb();
            case 13:
                return (String) obj;
            case 14:
                return (w281) obj;
            case 15:
                return Boolean.valueOf((obj instanceof w281) || (obj instanceof rih1));
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (w281) obj;
            case 17:
                return new eob();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return Collections.singletonList(((bob) obj).a);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (String) obj;
            case 20:
                return (String) obj;
            case 21:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 23:
                return Boolean.valueOf(obj instanceof zc8);
            case 24:
                if (obj != null) {
                    return (zc8) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.audiobookspecifics.AudiobookSpecifics");
                return null;
            case 25:
                return ((Throwable) obj).getCause();
            case 26:
                return Integer.valueOf(((Number) obj).intValue() / 3);
            case 27:
                return Integer.valueOf((-((Number) obj).intValue()) / 3);
            case 28:
                return xsb.b;
            default:
                b261.F((e261) obj, true);
                return rih1.a;
        }
    }
}
