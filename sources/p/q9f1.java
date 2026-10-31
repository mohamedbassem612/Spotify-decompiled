package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q9f1 extends hab0 implements Function0 {
    public static final q9f1 N0;
    public static final q9f1 O0;
    public static final q9f1 P0;
    public static final q9f1 Q0;
    public static final q9f1 R0;
    public static final q9f1 S0;
    public static final q9f1 T0;
    public static final q9f1 U0;
    public static final q9f1 V0;
    public static final q9f1 W0;
    public static final q9f1 X;
    public static final q9f1 X0;
    public static final q9f1 Y;
    public static final q9f1 Y0;
    public static final q9f1 Z;
    public static final q9f1 Z0;
    public static final q9f1 a1;
    public static final q9f1 b;
    public static final q9f1 b1;
    public static final q9f1 c;
    public static final q9f1 c1;
    public static final q9f1 d;
    public static final q9f1 d1;
    public static final q9f1 e;
    public static final q9f1 e1;
    public static final q9f1 f;
    public static final q9f1 g;
    public static final q9f1 h;
    public static final q9f1 i;
    public static final q9f1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new q9f1(i2, (byte) 0);
        c = new q9f1(i2, (byte) 1);
        d = new q9f1(i2, (byte) 2);
        e = new q9f1(i2, (byte) 3);
        f = new q9f1(i2, (byte) 4);
        g = new q9f1(i2, (byte) 5);
        h = new q9f1(i2, (byte) 6);
        i = new q9f1(i2, (byte) 7);
        t = new q9f1(i2, (byte) 8);
        X = new q9f1(i2, (byte) 9);
        Y = new q9f1(i2, (byte) 10);
        Z = new q9f1(i2, (byte) 11);
        N0 = new q9f1(i2, (byte) 12);
        O0 = new q9f1(i2, (byte) 13);
        P0 = new q9f1(i2, (byte) 14);
        Q0 = new q9f1(i2, (byte) 15);
        R0 = new q9f1(i2, (byte) 16);
        S0 = new q9f1(i2, (byte) 17);
        T0 = new q9f1(i2, (byte) 18);
        U0 = new q9f1(i2, (byte) 19);
        V0 = new q9f1(i2, (byte) 20);
        W0 = new q9f1(i2, (byte) 21);
        X0 = new q9f1(i2, (byte) 22);
        Y0 = new q9f1(i2, (byte) 23);
        Z0 = new q9f1(i2, (byte) 24);
        a1 = new q9f1(i2, (byte) 25);
        b1 = new q9f1(i2, (byte) 26);
        c1 = new q9f1(i2, (byte) 27);
        d1 = new q9f1(i2, (byte) 28);
        e1 = new q9f1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q9f1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return rih1Var;
            case 8:
                return Float.valueOf(0.0f);
            case 9:
                return rih1Var;
            case 10:
                return new tgm((String) null, false, false, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -3, 1);
            case 11:
                return rih1Var;
            case 12:
                return new r36(chc1.a, (byte) 0);
            case 13:
                return new r36(chc1.a, (byte) 0);
            case 14:
                return null;
            case 15:
                return 0L;
            case 16:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 17:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new r36(rcg1.a, (byte) 0);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
            case 20:
                return rih1Var;
            case 21:
                return null;
            case 22:
                return 2131232592;
            case 23:
                return 2131233929;
            case 24:
            case 25:
            case 26:
                return rih1Var;
            case 27:
                return new r36(b8h1.a, (byte) 0);
            case 28:
                return mla1.a().serializer();
            default:
                return v8r.q(Boolean.FALSE);
        }
    }
}
