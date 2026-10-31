package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ilx0 extends hab0 implements iu30 {
    public static final ilx0 N0;
    public static final ilx0 O0;
    public static final ilx0 P0;
    public static final ilx0 Q0;
    public static final ilx0 R0;
    public static final ilx0 S0;
    public static final ilx0 T0;
    public static final ilx0 U0;
    public static final ilx0 V0;
    public static final ilx0 W0;
    public static final ilx0 X;
    public static final ilx0 X0;
    public static final ilx0 Y;
    public static final ilx0 Y0;
    public static final ilx0 Z;
    public static final ilx0 Z0;
    public static final ilx0 a1;
    public static final ilx0 b;
    public static final ilx0 b1;
    public static final ilx0 c;
    public static final ilx0 c1;
    public static final ilx0 d;
    public static final ilx0 d1;
    public static final ilx0 e;
    public static final ilx0 e1;
    public static final ilx0 f;
    public static final ilx0 g;
    public static final ilx0 h;
    public static final ilx0 i;
    public static final ilx0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ilx0(i2, (byte) 0);
        c = new ilx0(i2, (byte) 1);
        d = new ilx0(i2, (byte) 2);
        e = new ilx0(i2, (byte) 3);
        f = new ilx0(i2, (byte) 4);
        g = new ilx0(i2, (byte) 5);
        h = new ilx0(i2, (byte) 6);
        i = new ilx0(i2, (byte) 7);
        t = new ilx0(i2, (byte) 8);
        X = new ilx0(i2, (byte) 9);
        Y = new ilx0(i2, (byte) 10);
        Z = new ilx0(i2, (byte) 11);
        N0 = new ilx0(i2, (byte) 12);
        O0 = new ilx0(i2, (byte) 13);
        P0 = new ilx0(i2, (byte) 14);
        Q0 = new ilx0(i2, (byte) 15);
        R0 = new ilx0(i2, (byte) 16);
        S0 = new ilx0(i2, (byte) 17);
        T0 = new ilx0(i2, (byte) 18);
        U0 = new ilx0(i2, (byte) 19);
        V0 = new ilx0(i2, (byte) 20);
        W0 = new ilx0(i2, (byte) 21);
        X0 = new ilx0(i2, (byte) 22);
        Y0 = new ilx0(i2, (byte) 23);
        Z0 = new ilx0(i2, (byte) 24);
        a1 = new ilx0(i2, (byte) 25);
        b1 = new ilx0(i2, (byte) 26);
        c1 = new ilx0(i2, (byte) 27);
        d1 = new ilx0(i2, (byte) 28);
        e1 = new ilx0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ilx0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iix0) obj;
            case 1:
                return rih1Var;
            case 2:
                return rih1Var;
            case 3:
                ((ez20) obj).c(false);
                return rih1Var;
            case 4:
                return (qxc0) obj;
            case 5:
                return rih1Var;
            case 6:
                return Boolean.valueOf(obj instanceof qxc0);
            case 7:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 8:
                return rih1Var;
            case 9:
                return ((zwn) obj).a;
            case 10:
                if (!(obj instanceof w281) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (w281) obj;
            case 12:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 14:
                return Boolean.valueOf(obj instanceof pnx0);
            case 15:
                if (obj != null) {
                    return (pnx0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.promov1trait.PromoV1Trait");
                return null;
            case 16:
                return ((tmx0) obj).c;
            case 17:
                return ((tmx0) obj).c;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                tmx0 tmx0Var = (tmx0) obj;
                return Boolean.valueOf(tmx0Var.f && tmx0Var.e != 3);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return ((tmx0) obj).c;
            case 20:
                tmx0 tmx0Var2 = (tmx0) obj;
                String str = tmx0Var2.c;
                if (!tmx0Var2.f || tmx0Var2.e == 3) {
                    return null;
                }
                return str;
            case 21:
                return ((pmx0) obj).c;
            case 22:
                return ((zwn) obj).a;
            case 23:
                return ((zwn) obj).a;
            case 24:
                return ((s9b0) obj).a;
            case 25:
                return Boolean.valueOf(obj instanceof oox0);
            case 26:
                if (obj != null) {
                    return (oox0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.promov3trait.PromoV3Trait");
                return null;
            case 27:
                return ((xnx0) obj).b;
            case 28:
                return new pox0((oox0) obj);
            default:
                return ((unx0) obj).c;
        }
    }
}
