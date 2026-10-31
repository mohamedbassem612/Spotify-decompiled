package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zld1 extends hab0 implements iu30 {
    public static final zld1 N0;
    public static final zld1 O0;
    public static final zld1 P0;
    public static final zld1 Q0;
    public static final zld1 R0;
    public static final zld1 S0;
    public static final zld1 T0;
    public static final zld1 U0;
    public static final zld1 V0;
    public static final zld1 W0;
    public static final zld1 X;
    public static final zld1 X0;
    public static final zld1 Y;
    public static final zld1 Y0;
    public static final zld1 Z;
    public static final zld1 Z0;
    public static final zld1 a1;
    public static final zld1 b;
    public static final zld1 b1;
    public static final zld1 c;
    public static final zld1 c1;
    public static final zld1 d;
    public static final zld1 d1;
    public static final zld1 e;
    public static final zld1 e1;
    public static final zld1 f;
    public static final zld1 g;
    public static final zld1 h;
    public static final zld1 i;
    public static final zld1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new zld1(i2, (byte) 0);
        c = new zld1(i2, (byte) 1);
        d = new zld1(i2, (byte) 2);
        e = new zld1(i2, (byte) 3);
        f = new zld1(i2, (byte) 4);
        g = new zld1(i2, (byte) 5);
        h = new zld1(i2, (byte) 6);
        i = new zld1(i2, (byte) 7);
        t = new zld1(i2, (byte) 8);
        X = new zld1(i2, (byte) 9);
        Y = new zld1(i2, (byte) 10);
        Z = new zld1(i2, (byte) 11);
        N0 = new zld1(i2, (byte) 12);
        O0 = new zld1(i2, (byte) 13);
        P0 = new zld1(i2, (byte) 14);
        Q0 = new zld1(i2, (byte) 15);
        R0 = new zld1(i2, (byte) 16);
        S0 = new zld1(i2, (byte) 17);
        T0 = new zld1(i2, (byte) 18);
        U0 = new zld1(i2, (byte) 19);
        V0 = new zld1(i2, (byte) 20);
        W0 = new zld1(i2, (byte) 21);
        X0 = new zld1(i2, (byte) 22);
        Y0 = new zld1(i2, (byte) 23);
        Z0 = new zld1(i2, (byte) 24);
        a1 = new zld1(i2, (byte) 25);
        b1 = new zld1(i2, (byte) 26);
        c1 = new zld1(i2, (byte) 27);
        d1 = new zld1(i2, (byte) 28);
        e1 = new zld1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zld1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        fhz fhzVar = fhz.a;
        k8x k8xVar = k8x.a;
        b7x b7xVar = b7x.a;
        w7x w7xVar = w7x.a;
        switch (b2) {
            case 0:
                return w7xVar;
            case 1:
                return w7xVar;
            case 2:
                return w7xVar;
            case 3:
                return w7xVar;
            case 4:
                ojd1 ojd1Var = (ojd1) obj;
                return new lk11(ojd1Var.a, ojd1Var.b, true);
            case 5:
                return Collections.singleton(((ojd1) obj).a);
            case 6:
                return fhzVar;
            case 7:
                return b7xVar;
            case 8:
                return w7xVar;
            case 9:
                return k8xVar;
            case 10:
                return w7xVar;
            case 11:
                return new set(((cld1) obj).a);
            case 12:
                return Collections.singleton(((cld1) obj).a);
            case 13:
                return new ssz0(((dld1) obj).a);
            case 14:
                return Collections.singleton(((dld1) obj).a);
            case 15:
                return new y4e(((bld1) obj).a, 1);
            case 16:
                return Collections.singleton(((bld1) obj).a);
            case 17:
                return Collections.singleton(((kjd1) obj).a);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return fhzVar;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return w7xVar;
            case 20:
                return k8xVar;
            case 21:
                return w7xVar;
            case 22:
                return w7xVar;
            case 23:
                ljd1 ljd1Var = (ljd1) obj;
                return new n861(ljd1Var.a, ljd1Var.b);
            case 24:
                return w7xVar;
            case 25:
                return w7xVar;
            case 26:
                return rih1.a;
            case 27:
                return w7xVar;
            case 28:
                kjd1 kjd1Var = (kjd1) obj;
                return new lk11(kjd1Var.a, kjd1Var.b, true);
            default:
                return b7xVar;
        }
    }
}
