package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class th51 extends hab0 implements iu30 {
    public static final th51 N0;
    public static final th51 O0;
    public static final th51 P0;
    public static final th51 Q0;
    public static final th51 R0;
    public static final th51 S0;
    public static final th51 T0;
    public static final th51 U0;
    public static final th51 V0;
    public static final th51 W0;
    public static final th51 X;
    public static final th51 X0;
    public static final th51 Y;
    public static final th51 Y0;
    public static final th51 Z;
    public static final th51 Z0;
    public static final th51 a1;
    public static final th51 b;
    public static final th51 b1;
    public static final th51 c;
    public static final th51 c1;
    public static final th51 d;
    public static final th51 d1;
    public static final th51 e;
    public static final th51 e1;
    public static final th51 f;
    public static final th51 g;
    public static final th51 h;
    public static final th51 i;
    public static final th51 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new th51(i2, (byte) 0);
        c = new th51(i2, (byte) 1);
        d = new th51(i2, (byte) 2);
        e = new th51(i2, (byte) 3);
        f = new th51(i2, (byte) 4);
        g = new th51(i2, (byte) 5);
        h = new th51(i2, (byte) 6);
        i = new th51(i2, (byte) 7);
        t = new th51(i2, (byte) 8);
        X = new th51(i2, (byte) 9);
        Y = new th51(i2, (byte) 10);
        Z = new th51(i2, (byte) 11);
        N0 = new th51(i2, (byte) 12);
        O0 = new th51(i2, (byte) 13);
        P0 = new th51(i2, (byte) 14);
        Q0 = new th51(i2, (byte) 15);
        R0 = new th51(i2, (byte) 16);
        S0 = new th51(i2, (byte) 17);
        T0 = new th51(i2, (byte) 18);
        U0 = new th51(i2, (byte) 19);
        V0 = new th51(i2, (byte) 20);
        W0 = new th51(i2, (byte) 21);
        X0 = new th51(i2, (byte) 22);
        Y0 = new th51(i2, (byte) 23);
        Z0 = new th51(i2, (byte) 24);
        a1 = new th51(i2, (byte) 25);
        b1 = new th51(i2, (byte) 26);
        c1 = new th51(i2, (byte) 27);
        d1 = new th51(i2, (byte) 28);
        e1 = new th51(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ th51(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        w7x w7xVar = w7x.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return w7xVar;
            case 1:
                return w7xVar;
            case 2:
                return ((arn0) obj).b;
            case 3:
                b261.c((e261) obj);
                return rih1Var;
            case 4:
                return mj51.a;
            case 5:
                bk51 bk51Var = (bk51) obj;
                return new ck51(bk51Var.a, "", bk51Var.b, bk51Var.c);
            case 6:
                return ((bk51) obj).b;
            case 7:
                return new dk51(((jo70) obj).a);
            case 8:
                return Boolean.valueOf(obj instanceof jo70);
            case 9:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 10:
                return new g3l0((i3l0) obj);
            case 11:
                return new yl51("", true, vp91.a, 0L);
            case 12:
                return new nm51("", true, vp91.a, false, 0L);
            case 13:
                ((kd31) obj).f(false);
                return rih1Var;
            case 14:
                return new vn51("");
            case 15:
                return new f0g1("", 0L, 0L, false, ((lo51) obj).a, false, (yzf1) null, (agv) null, 224);
            case 16:
                return (f0g1) obj;
            case 17:
                return (e0g1) obj;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return ((nwl0) obj).e();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                op51 op51Var = (op51) obj;
                Set set = s4b1.f;
                String strZ = uic.v(lf51.c(op51Var.b), op51Var.a).z();
                if (strZ != null) {
                    return new rxc0(strZ);
                }
                return null;
            case 20:
                op51 op51Var2 = (op51) obj;
                Set set2 = s4b1.f;
                String strZ2 = uic.v(lf51.c(op51Var2.b), op51Var2.a).z();
                if (strZ2 != null) {
                    return new qvc0(strZ2, (c3d0) null, (Set) null, (mqz0) null, 14);
                }
                return null;
            case 21:
                if (!(obj instanceof qxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 23:
                if (!(obj instanceof List) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 25:
                b261.B((e261) obj, "segmentDetailSectionItemFollowButton");
                return rih1Var;
            case 26:
                return ((tp51) obj).a;
            case 27:
                return ((tp51) obj).a;
            case 28:
                return ((tp51) obj).a;
            default:
                return ((tp51) obj).a;
        }
    }
}
