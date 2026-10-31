package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fm9 extends hab0 implements iu30 {
    public static final fm9 N0;
    public static final fm9 O0;
    public static final fm9 P0;
    public static final fm9 Q0;
    public static final fm9 R0;
    public static final fm9 S0;
    public static final fm9 T0;
    public static final fm9 U0;
    public static final fm9 V0;
    public static final fm9 W0;
    public static final fm9 X;
    public static final fm9 X0;
    public static final fm9 Y;
    public static final fm9 Y0;
    public static final fm9 Z;
    public static final fm9 Z0;
    public static final fm9 a1;
    public static final fm9 b;
    public static final fm9 b1;
    public static final fm9 c;
    public static final fm9 c1;
    public static final fm9 d;
    public static final fm9 d1;
    public static final fm9 e;
    public static final fm9 e1;
    public static final fm9 f;
    public static final fm9 g;
    public static final fm9 h;
    public static final fm9 i;
    public static final fm9 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new fm9(i2, (byte) 0);
        c = new fm9(i2, (byte) 1);
        d = new fm9(i2, (byte) 2);
        e = new fm9(i2, (byte) 3);
        f = new fm9(i2, (byte) 4);
        g = new fm9(i2, (byte) 5);
        h = new fm9(i2, (byte) 6);
        i = new fm9(i2, (byte) 7);
        t = new fm9(i2, (byte) 8);
        X = new fm9(i2, (byte) 9);
        Y = new fm9(i2, (byte) 10);
        Z = new fm9(i2, (byte) 11);
        N0 = new fm9(i2, (byte) 12);
        O0 = new fm9(i2, (byte) 13);
        P0 = new fm9(i2, (byte) 14);
        Q0 = new fm9(i2, (byte) 15);
        R0 = new fm9(i2, (byte) 16);
        S0 = new fm9(i2, (byte) 17);
        T0 = new fm9(i2, (byte) 18);
        U0 = new fm9(i2, (byte) 19);
        V0 = new fm9(i2, (byte) 20);
        W0 = new fm9(i2, (byte) 21);
        X0 = new fm9(i2, (byte) 22);
        Y0 = new fm9(i2, (byte) 23);
        Z0 = new fm9(i2, (byte) 24);
        a1 = new fm9(i2, (byte) 25);
        b1 = new fm9(i2, (byte) 26);
        c1 = new fm9(i2, (byte) 27);
        d1 = new fm9(i2, (byte) 28);
        e1 = new fm9(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fm9(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 1:
                return Boolean.valueOf(obj instanceof jo70);
            case 2:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 3:
                return (String) obj;
            case 4:
                return (String) obj;
            case 5:
                return (String) obj;
            case 6:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 8:
                return Boolean.valueOf(obj instanceof iw7);
            case 9:
                if (obj != null) {
                    return (iw7) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.audiolayerabilitytrait.AudioLayerabilityTrait");
                return null;
            case 10:
                return Boolean.valueOf(obj instanceof bo9);
            case 11:
                if (obj != null) {
                    return (bo9) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.byom.entrypoint.BYOMItemsData");
                return null;
            case 12:
                return new mn9("", new ub10(-7829368, -7829368));
            case 13:
                return (String) obj;
            case 14:
                io70 io70Var = ((jo70) obj).e;
                String str = io70Var != null ? io70Var.a : null;
                return str == null ? "" : str;
            case 15:
                return Boolean.valueOf(obj instanceof jo70);
            case 16:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 17:
                return new qn9("", "", 0, "");
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (String) obj;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (String) obj;
            case 20:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 22:
                return Boolean.valueOf(obj instanceof jo70);
            case 23:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 24:
                return new wn9(new ub10(-7829368, -7829368), "", false);
            case 25:
                List list = (List) obj;
                return new go9(kq9.valueOf((String) list.get(0)), Boolean.parseBoolean((String) list.get(1)));
            case 26:
                ((Number) obj).intValue();
                return so9.a;
            case 27:
                return Long.valueOf(((Boolean) obj).booleanValue() ? 3000L : 0L);
            case 28:
                return new tq9(63, null, false);
            default:
                ((Number) obj).longValue();
                return rih1.a;
        }
    }
}
