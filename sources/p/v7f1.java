package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v7f1 extends hab0 implements iu30 {
    public static final v7f1 N0;
    public static final v7f1 O0;
    public static final v7f1 P0;
    public static final v7f1 Q0;
    public static final v7f1 R0;
    public static final v7f1 S0;
    public static final v7f1 T0;
    public static final v7f1 U0;
    public static final v7f1 V0;
    public static final v7f1 W0;
    public static final v7f1 X;
    public static final v7f1 X0;
    public static final v7f1 Y;
    public static final v7f1 Y0;
    public static final v7f1 Z;
    public static final v7f1 Z0;
    public static final v7f1 a1;
    public static final v7f1 b;
    public static final v7f1 b1;
    public static final v7f1 c;
    public static final v7f1 c1;
    public static final v7f1 d;
    public static final v7f1 d1;
    public static final v7f1 e;
    public static final v7f1 e1;
    public static final v7f1 f;
    public static final v7f1 g;
    public static final v7f1 h;
    public static final v7f1 i;
    public static final v7f1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new v7f1(i2, (byte) 0);
        c = new v7f1(i2, (byte) 1);
        d = new v7f1(i2, (byte) 2);
        e = new v7f1(i2, (byte) 3);
        f = new v7f1(i2, (byte) 4);
        g = new v7f1(i2, (byte) 5);
        h = new v7f1(i2, (byte) 6);
        i = new v7f1(i2, (byte) 7);
        t = new v7f1(i2, (byte) 8);
        X = new v7f1(i2, (byte) 9);
        Y = new v7f1(i2, (byte) 10);
        Z = new v7f1(i2, (byte) 11);
        N0 = new v7f1(i2, (byte) 12);
        O0 = new v7f1(i2, (byte) 13);
        P0 = new v7f1(i2, (byte) 14);
        Q0 = new v7f1(i2, (byte) 15);
        R0 = new v7f1(i2, (byte) 16);
        S0 = new v7f1(i2, (byte) 17);
        T0 = new v7f1(i2, (byte) 18);
        U0 = new v7f1(i2, (byte) 19);
        V0 = new v7f1(i2, (byte) 20);
        W0 = new v7f1(i2, (byte) 21);
        X0 = new v7f1(i2, (byte) 22);
        Y0 = new v7f1(i2, (byte) 23);
        Z0 = new v7f1(i2, (byte) 24);
        a1 = new v7f1(i2, (byte) 25);
        b1 = new v7f1(i2, (byte) 26);
        c1 = new v7f1(i2, (byte) 27);
        d1 = new v7f1(i2, (byte) 28);
        e1 = new v7f1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v7f1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return rih1Var;
            case 1:
                return new z8f1(z6x.a);
            case 2:
                ArrayList arrayList = ((jfr0) obj).a;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ifr0) it.next()).a);
                }
                return o7h.p1(arrayList2);
            case 3:
                return rih1Var;
            case 4:
                return rih1Var;
            case 5:
                return rih1Var;
            case 6:
                return rih1Var;
            case 7:
                return rih1Var;
            case 8:
                return rih1Var;
            case 9:
                return rih1Var;
            case 10:
                return rih1Var;
            case 11:
                b261.c((e261) obj);
                return rih1Var;
            case 12:
                return rih1Var;
            case 13:
                b261.c((e261) obj);
                return rih1Var;
            case 14:
                return rih1Var;
            case 15:
                return rih1Var;
            case 16:
                b261.t((e261) obj, 0);
                return rih1Var;
            case 17:
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return rih1Var;
            case 20:
                ((kd31) obj).b(0.0f);
                return rih1Var;
            case 21:
                return ((kdf1) obj).a;
            case 22:
                return ((wef1) obj).a;
            case 23:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 25:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 27:
                if (!(obj instanceof zoy0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zoy0) obj;
            default:
                return ((gef1) obj).a;
        }
    }
}
