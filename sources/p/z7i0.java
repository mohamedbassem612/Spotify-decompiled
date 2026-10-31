package p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z7i0 extends hab0 implements Function0 {
    public static final z7i0 N0;
    public static final z7i0 O0;
    public static final z7i0 P0;
    public static final z7i0 Q0;
    public static final z7i0 R0;
    public static final z7i0 S0;
    public static final z7i0 T0;
    public static final z7i0 U0;
    public static final z7i0 V0;
    public static final z7i0 W0;
    public static final z7i0 X;
    public static final z7i0 X0;
    public static final z7i0 Y;
    public static final z7i0 Y0;
    public static final z7i0 Z;
    public static final z7i0 Z0;
    public static final z7i0 a1;
    public static final z7i0 b;
    public static final z7i0 b1;
    public static final z7i0 c;
    public static final z7i0 c1;
    public static final z7i0 d;
    public static final z7i0 d1;
    public static final z7i0 e;
    public static final z7i0 e1;
    public static final z7i0 f;
    public static final z7i0 g;
    public static final z7i0 h;
    public static final z7i0 i;
    public static final z7i0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new z7i0(i2, (byte) 0);
        c = new z7i0(i2, (byte) 1);
        d = new z7i0(i2, (byte) 2);
        e = new z7i0(i2, (byte) 3);
        f = new z7i0(i2, (byte) 4);
        g = new z7i0(i2, (byte) 5);
        h = new z7i0(i2, (byte) 6);
        i = new z7i0(i2, (byte) 7);
        t = new z7i0(i2, (byte) 8);
        X = new z7i0(i2, (byte) 9);
        Y = new z7i0(i2, (byte) 10);
        Z = new z7i0(i2, (byte) 11);
        N0 = new z7i0(i2, (byte) 12);
        O0 = new z7i0(i2, (byte) 13);
        P0 = new z7i0(i2, (byte) 14);
        Q0 = new z7i0(i2, (byte) 15);
        R0 = new z7i0(i2, (byte) 16);
        S0 = new z7i0(i2, (byte) 17);
        T0 = new z7i0(i2, (byte) 18);
        U0 = new z7i0(i2, (byte) 19);
        V0 = new z7i0(i2, (byte) 20);
        W0 = new z7i0(i2, (byte) 21);
        X0 = new z7i0(i2, (byte) 22);
        Y0 = new z7i0(i2, (byte) 23);
        Z0 = new z7i0(i2, (byte) 24);
        a1 = new z7i0(i2, (byte) 25);
        b1 = new z7i0(i2, (byte) 26);
        c1 = new z7i0(i2, (byte) 27);
        d1 = new z7i0(i2, (byte) 28);
        e1 = new z7i0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z7i0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 1:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 2:
                return new e27((byte) 5);
            case 3:
                return rih1Var;
            case 4:
                return new tgm((String) null, false, false, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -771, 1);
            case 5:
                return new qbo0();
            case 6:
            case 7:
                return rih1Var;
            case 8:
                return new r36(sui0.a, (byte) 0);
            case 9:
                return v8r.q(Boolean.TRUE);
            case 10:
                return v8r.q(Boolean.FALSE);
            case 11:
                return new a1z("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingError", g4j0.values());
            case 12:
            case 13:
            case 14:
                return rih1Var;
            case 15:
                chc1 chc1Var = chc1.a;
                return new nlc0(chc1Var, new r36(chc1Var, (byte) 1));
            case 16:
                return Boolean.FALSE;
            case 17:
                throw new IllegalStateException("LocalMidSectionItemIndex not provided. Only available inside a MidSection element.");
            case 18:
                return new r36(chc1.a, (byte) 1);
            case 19:
                return new nlc0(chc1.a, o5f0.a);
            case 20:
                return rih1Var;
            case 21:
                WorkRunners.MyThreadFactory myThreadFactory3 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 22:
                WorkRunners.MyThreadFactory myThreadFactory4 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 23:
                WorkRunners.MyThreadFactory myThreadFactory5 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 24:
                WorkRunners.MyThreadFactory myThreadFactory6 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 25:
                return new r36(fbf.a, (byte) 0);
            case 26:
                return null;
            case 27:
            case 28:
            default:
                return rih1Var;
        }
    }
}
