package p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.player.model.BitrateLevel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i0f0 extends hab0 implements Function0 {
    public static final i0f0 N0;
    public static final i0f0 O0;
    public static final i0f0 P0;
    public static final i0f0 Q0;
    public static final i0f0 R0;
    public static final i0f0 S0;
    public static final i0f0 T0;
    public static final i0f0 U0;
    public static final i0f0 V0;
    public static final i0f0 W0;
    public static final i0f0 X;
    public static final i0f0 X0;
    public static final i0f0 Y;
    public static final i0f0 Y0;
    public static final i0f0 Z;
    public static final i0f0 Z0;
    public static final i0f0 a1;
    public static final i0f0 b;
    public static final i0f0 b1;
    public static final i0f0 c;
    public static final i0f0 c1;
    public static final i0f0 d;
    public static final i0f0 d1;
    public static final i0f0 e;
    public static final i0f0 e1;
    public static final i0f0 f;
    public static final i0f0 g;
    public static final i0f0 h;
    public static final i0f0 i;
    public static final i0f0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new i0f0(i2, (byte) 0);
        c = new i0f0(i2, (byte) 1);
        d = new i0f0(i2, (byte) 2);
        e = new i0f0(i2, (byte) 3);
        f = new i0f0(i2, (byte) 4);
        g = new i0f0(i2, (byte) 5);
        h = new i0f0(i2, (byte) 6);
        i = new i0f0(i2, (byte) 7);
        t = new i0f0(i2, (byte) 8);
        X = new i0f0(i2, (byte) 9);
        Y = new i0f0(i2, (byte) 10);
        Z = new i0f0(i2, (byte) 11);
        N0 = new i0f0(i2, (byte) 12);
        O0 = new i0f0(i2, (byte) 13);
        P0 = new i0f0(i2, (byte) 14);
        Q0 = new i0f0(i2, (byte) 15);
        R0 = new i0f0(i2, (byte) 16);
        S0 = new i0f0(i2, (byte) 17);
        T0 = new i0f0(i2, (byte) 18);
        U0 = new i0f0(i2, (byte) 19);
        V0 = new i0f0(i2, (byte) 20);
        W0 = new i0f0(i2, (byte) 21);
        X0 = new i0f0(i2, (byte) 22);
        Y0 = new i0f0(i2, (byte) 23);
        Z0 = new i0f0(i2, (byte) 24);
        a1 = new i0f0(i2, (byte) 25);
        b1 = new i0f0(i2, (byte) 26);
        c1 = new i0f0(i2, (byte) 27);
        d1 = new i0f0(i2, (byte) 28);
        e1 = new i0f0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0f0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return rih1Var;
            case 1:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 2:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 3:
                return new r36(l6f0.a, (byte) 0);
            case 4:
                return new r36(a8u.a, (byte) 0);
            case 5:
                throw new IllegalStateException("No BetamaxCacheStorage provided.");
            case 6:
                throw new IllegalStateException("No BetamaxPlayerPool provided.");
            case 7:
                jpr0 jpr0VarN = zgo1.n();
                jpr0 jpr0VarN2 = zgo1.n();
                jpr0 jpr0VarN3 = zgo1.n();
                BitrateLevel bitrateLevel = BitrateLevel.HIFI;
                BitrateLevel bitrateLevel2 = BitrateLevel.HIFI_24;
                jpr0 jpr0VarO = zgo1.o(new BitrateLevel[]{bitrateLevel2}, bitrateLevel);
                jpr0 jpr0Var = s690.a;
                jpr0 jpr0VarN4 = zgo1.n();
                i9f0 i9f0Var = i9f0.d;
                jpr0 jpr0VarO2 = zgo1.o(new i9f0[0], i9f0Var);
                jpr0 jpr0VarN5 = zgo1.n();
                Boolean bool = Boolean.TRUE;
                mmr0 mmr0Var = new mmr0(new wtd(jpr0VarN, jpr0VarN2, jpr0VarN3, jpr0VarO, jpr0Var, jpr0VarN4, jpr0VarO2, jpr0VarN5, zgo1.o(new Boolean[0], bool), zgo1.n(), zgo1.n(), null, null, null, null, null, null, null, null, 522240), awg1.d);
                ual ualVar = ual.a;
                jpr0 jpr0VarO3 = zgo1.o(new ual[0], ualVar);
                jpr0 jpr0VarO4 = zgo1.o(new u6o0[0], u6o0.b);
                jpr0 jpr0VarN6 = zgo1.n();
                jpr0 jpr0VarN7 = zgo1.n();
                jpr0 jpr0VarN8 = zgo1.n();
                jpr0 jpr0VarN9 = zgo1.n();
                jpr0 jpr0VarN10 = zgo1.n();
                jpr0 jpr0VarN11 = zgo1.n();
                jpr0 jpr0VarO5 = zgo1.o(new Boolean[0], bool);
                x7f0 x7f0Var = x7f0.d;
                x7f0 x7f0Var2 = x7f0.c;
                x7f0 x7f0Var3 = x7f0.a;
                mmr0 mmr0Var2 = new mmr0(new wtd(jpr0VarO3, jpr0VarO4, jpr0VarN6, jpr0VarN7, jpr0VarN8, jpr0VarN9, jpr0VarN10, jpr0VarN11, jpr0VarO5, zgo1.o(new x7f0[]{x7f0Var, x7f0Var2}, x7f0Var3), zgo1.n(), null, null, null, null, null, null, null, null, 522240), awg1.e);
                jpr0 jpr0VarO6 = zgo1.o(new ual[0], ualVar);
                jpr0 jpr0VarN12 = zgo1.n();
                jpr0 jpr0VarN13 = zgo1.n();
                jpr0 jpr0VarO7 = zgo1.o(new BitrateLevel[0], bitrateLevel);
                jpr0 jpr0VarO8 = zgo1.o(new Boolean[0], bool);
                jpr0 jpr0VarN14 = zgo1.n();
                r690 r690Var = r690.b;
                mmr0 mmr0Var3 = new mmr0(new wtd(jpr0VarO6, jpr0VarN12, jpr0VarN13, jpr0Var, jpr0VarO7, jpr0VarO8, jpr0VarN14, zgo1.o(new r690[0], r690Var), zgo1.o(new Boolean[0], bool), zgo1.n(), zgo1.n(), null, null, null, null, null, null, null, null, 522240), awg1.h);
                mmr0 mmr0Var4 = new mmr0(new wtd(zgo1.o(new ual[0], ualVar), zgo1.o(new u6o0[0], u6o0.a), zgo1.o(new Boolean[0], bool), jpr0Var, zgo1.o(new BitrateLevel[0], bitrateLevel), zgo1.o(new Boolean[0], bool), zgo1.n(), zgo1.o(new r690[0], r690Var), zgo1.o(new Boolean[0], bool), zgo1.n(), zgo1.n(), null, null, null, null, null, null, null, null, 522240), awg1.g);
                jpr0 jpr0VarN15 = zgo1.n();
                jpr0 jpr0VarN16 = zgo1.n();
                jpr0 jpr0VarN17 = zgo1.n();
                jpr0 jpr0VarO9 = zgo1.o(new BitrateLevel[0], bitrateLevel);
                jpr0 jpr0VarN18 = zgo1.n();
                i9f0 i9f0Var2 = i9f0.c;
                mmr0 mmr0Var5 = new mmr0(new wtd(jpr0VarN15, jpr0VarN16, jpr0VarN17, jpr0Var, jpr0VarO9, jpr0VarN18, zgo1.o(new i9f0[0], i9f0Var2), zgo1.n(), zgo1.o(new Boolean[0], bool), zgo1.n(), zgo1.n(), null, null, null, null, null, null, null, null, 522240), awg1.i);
                jpr0 jpr0VarO10 = zgo1.o(new ual[0], ualVar);
                jpr0 jpr0VarN19 = zgo1.n();
                jpr0 jpr0VarN20 = zgo1.n();
                jpr0 jpr0VarN21 = zgo1.n();
                i9f0 i9f0Var3 = i9f0.a;
                mmr0 mmr0Var6 = new mmr0(new wtd(jpr0VarO10, jpr0VarN19, jpr0VarN20, jpr0Var, jpr0Var, jpr0VarN21, zgo1.o(new i9f0[]{i9f0Var}, i9f0Var3), zgo1.n(), zgo1.o(new Boolean[0], bool), zgo1.o(new x7f0[]{x7f0Var2}, x7f0Var3), zgo1.o(new Boolean[0], bool), null, null, null, null, null, null, null, null, 522240), awg1.t);
                jpr0 jpr0VarN22 = zgo1.n();
                jpr0 jpr0VarN23 = zgo1.n();
                Boolean bool2 = Boolean.FALSE;
                mmr0 mmr0Var7 = new mmr0(new wtd(jpr0VarN22, jpr0VarN23, zgo1.o(new Boolean[0], bool2), zgo1.o(new BitrateLevel[0], bitrateLevel), zgo1.o(new BitrateLevel[0], bitrateLevel), zgo1.n(), zgo1.o(new i9f0[]{i9f0Var2}, i9f0Var3), zgo1.n(), zgo1.o(new Boolean[0], bool), zgo1.n(), zgo1.n(), zgo1.o(new Boolean[0], bool), null, null, null, null, null, null, null, 520192), awg1.X);
                jpr0 jpr0VarN24 = zgo1.n();
                jpr0 jpr0VarN25 = zgo1.n();
                jpr0 jpr0VarN26 = zgo1.n();
                jpr0 jpr0VarO11 = zgo1.o(new BitrateLevel[0], bitrateLevel);
                jpr0 jpr0VarN27 = zgo1.n();
                i9f0 i9f0Var4 = i9f0.b;
                return new xpb1(mmr0Var, mmr0Var2, mmr0Var3, mmr0Var4, mmr0Var5, mmr0Var6, mmr0Var7, new mmr0(new wtd(jpr0VarN24, jpr0VarN25, jpr0VarN26, jpr0Var, jpr0VarO11, jpr0VarN27, zgo1.o(new i9f0[]{i9f0Var4, i9f0Var2, i9f0Var}, i9f0Var3), zgo1.n(), zgo1.o(new Boolean[0], bool2), zgo1.n(), zgo1.n(), null, null, null, null, null, null, null, null, 522240), awg1.c), new mmr0(new wtd(zgo1.n(), zgo1.n(), zgo1.n(), zgo1.o(new BitrateLevel[]{bitrateLevel2}, bitrateLevel), zgo1.o(new BitrateLevel[0], bitrateLevel), zgo1.n(), zgo1.n(), zgo1.n(), zgo1.o(new Boolean[0], bool), zgo1.o(new x7f0[0], x7f0Var2), zgo1.n(), null, null, null, null, null, null, null, null, 522240), awg1.f), new mmr0(new wtd(zgo1.o(new ual[0], ualVar), zgo1.n(), zgo1.n(), jpr0Var, zgo1.n(), zgo1.o(new Boolean[0], bool), zgo1.o(new i9f0[]{i9f0Var}, i9f0Var3), zgo1.n(), zgo1.o(new Boolean[0], bool), zgo1.n(), zgo1.n(), null, zgo1.o(new Boolean[0], bool), zgo1.o(new Boolean[0], bool2), zgo1.o(new Boolean[0], bool2), null, zgo1.o(new Boolean[0], bool2), null, null, 428032), awg1.Y), new mmr0(new wtd(zgo1.o(new ual[0], ualVar), zgo1.n(), zgo1.n(), jpr0Var, zgo1.n(), zgo1.o(new Boolean[0], bool), zgo1.o(new i9f0[]{i9f0Var}, i9f0Var3), zgo1.n(), zgo1.o(new Boolean[0], bool), zgo1.n(), zgo1.n(), null, zgo1.o(new Boolean[0], bool), zgo1.o(new Boolean[0], bool), zgo1.o(new Boolean[0], bool2), zgo1.o(new Boolean[0], bool), zgo1.o(new Boolean[0], bool2), null, null, 395264), awg1.Z), new mmr0(new wtd(zgo1.o(new ual[0], ualVar), zgo1.n(), zgo1.n(), jpr0Var, zgo1.n(), zgo1.o(new Boolean[0], bool), zgo1.o(new i9f0[]{i9f0Var}, i9f0Var3), zgo1.n(), zgo1.o(new Boolean[0], bool), zgo1.n(), zgo1.n(), null, zgo1.o(new Boolean[0], bool), zgo1.o(new Boolean[0], bool2), zgo1.o(new Boolean[0], bool), zgo1.o(new Boolean[0], bool2), zgo1.o(new Boolean[0], bool2), null, null, 395264), awg1.N0), new mmr0(new wtd(zgo1.o(new ual[0], ualVar), zgo1.n(), zgo1.n(), jpr0Var, zgo1.n(), zgo1.o(new Boolean[0], bool), zgo1.o(new i9f0[]{i9f0Var4, i9f0Var}, i9f0Var3), zgo1.n(), zgo1.o(new Boolean[0], bool), zgo1.n(), zgo1.n(), null, null, null, null, null, null, zgo1.o(new Boolean[0], bool2), zgo1.o(new Boolean[0], bool), 129024), awg1.O0));
            case 8:
                return new nlc0(chc1.a, wr80.a);
            case 9:
                WorkRunners.MyThreadFactory myThreadFactory3 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 10:
                return 0;
            case 11:
                return new y7e1((String) null, 3);
            case 12:
                return v8r.q(Boolean.FALSE);
            case 13:
                return new y7e1((String) null, 3);
            case 14:
                return new r36(sff0.a, (byte) 0);
            case 15:
                return new r36(chc1.a, (byte) 0);
            case 16:
                WorkRunners.MyThreadFactory myThreadFactory4 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 17:
                WorkRunners.MyThreadFactory myThreadFactory5 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 18:
                return 0;
            case 19:
            case 20:
                return rih1Var;
            case 21:
                WorkRunners.MyThreadFactory myThreadFactory6 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 22:
                WorkRunners.MyThreadFactory myThreadFactory7 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 23:
                return bma1.b.q("lyrics_preference_font_scale_key");
            case 24:
                WorkRunners.MyThreadFactory myThreadFactory8 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 25:
                WorkRunners.MyThreadFactory myThreadFactory9 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 26:
                WorkRunners.MyThreadFactory myThreadFactory10 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 27:
                WorkRunners.MyThreadFactory myThreadFactory11 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 28:
                return rih1Var;
            default:
                return new qyl0(r6h1.c);
        }
    }
}
