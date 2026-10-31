package p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cu9 extends hab0 implements Function0 {
    public static final cu9 N0;
    public static final cu9 O0;
    public static final cu9 P0;
    public static final cu9 Q0;
    public static final cu9 R0;
    public static final cu9 S0;
    public static final cu9 T0;
    public static final cu9 U0;
    public static final cu9 V0;
    public static final cu9 W0;
    public static final cu9 X;
    public static final cu9 X0;
    public static final cu9 Y;
    public static final cu9 Y0;
    public static final cu9 Z;
    public static final cu9 Z0;
    public static final cu9 a1;
    public static final cu9 b;
    public static final cu9 b1;
    public static final cu9 c;
    public static final cu9 c1;
    public static final cu9 d;
    public static final cu9 d1;
    public static final cu9 e;
    public static final cu9 e1;
    public static final cu9 f;
    public static final cu9 g;
    public static final cu9 h;
    public static final cu9 i;
    public static final cu9 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new cu9(i2, (byte) 0);
        c = new cu9(i2, (byte) 1);
        d = new cu9(i2, (byte) 2);
        e = new cu9(i2, (byte) 3);
        f = new cu9(i2, (byte) 4);
        g = new cu9(i2, (byte) 5);
        h = new cu9(i2, (byte) 6);
        i = new cu9(i2, (byte) 7);
        t = new cu9(i2, (byte) 8);
        X = new cu9(i2, (byte) 9);
        Y = new cu9(i2, (byte) 10);
        Z = new cu9(i2, (byte) 11);
        N0 = new cu9(i2, (byte) 12);
        O0 = new cu9(i2, (byte) 13);
        P0 = new cu9(i2, (byte) 14);
        Q0 = new cu9(i2, (byte) 15);
        R0 = new cu9(i2, (byte) 16);
        S0 = new cu9(i2, (byte) 17);
        T0 = new cu9(i2, (byte) 18);
        U0 = new cu9(i2, (byte) 19);
        V0 = new cu9(i2, (byte) 20);
        W0 = new cu9(i2, (byte) 21);
        X0 = new cu9(i2, (byte) 22);
        Y0 = new cu9(i2, (byte) 23);
        Z0 = new cu9(i2, (byte) 24);
        a1 = new cu9(i2, (byte) 25);
        b1 = new cu9(i2, (byte) 26);
        c1 = new cu9(i2, (byte) 27);
        d1 = new cu9(i2, (byte) 28);
        e1 = new cu9(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu9(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return v8r.q(Boolean.FALSE);
            case 1:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 2:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 3:
                return rih1Var;
            case 4:
                return new r36(ise.d, (byte) 0);
            case 5:
                return rih1Var;
            case 6:
                WorkRunners.MyThreadFactory myThreadFactory3 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 7:
                WorkRunners.MyThreadFactory myThreadFactory4 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 8:
                return new r36(z5b.a, (byte) 0);
            case 9:
            case 10:
                return rih1Var;
            case 11:
                a3i1 a3i1Var = new a3i1();
                for (t2i1 t2i1Var : sab.b) {
                    a3i1Var.b(t2i1Var.a, t2i1Var.b);
                }
                return a3i1Var;
            case 12:
                return v8r.q(Boolean.FALSE);
            case 13:
                return v8r.q((Object) null);
            case 14:
                return v8r.q(Boolean.FALSE);
            case 15:
                return v8r.q(Boolean.FALSE);
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                return rih1Var;
            case 26:
                return v8r.q(Boolean.FALSE);
            case 27:
                return Float.valueOf(0.0f);
            case 28:
                return Float.valueOf(0.0f);
            default:
                return Boolean.FALSE;
        }
    }
}
