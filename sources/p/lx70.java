package p;

import com.spotify.mobius.runners.WorkRunners;
import com.spotify.player.model.BitrateLevel;
import com.spotify.player.model.BitrateStrategy;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lx70 extends hab0 implements Function0 {
    public static final lx70 N0;
    public static final lx70 O0;
    public static final lx70 P0;
    public static final lx70 Q0;
    public static final lx70 R0;
    public static final lx70 S0;
    public static final lx70 T0;
    public static final lx70 U0;
    public static final lx70 V0;
    public static final lx70 W0;
    public static final lx70 X;
    public static final lx70 X0;
    public static final lx70 Y;
    public static final lx70 Y0;
    public static final lx70 Z;
    public static final lx70 Z0;
    public static final lx70 a1;
    public static final lx70 b;
    public static final lx70 b1;
    public static final lx70 c;
    public static final lx70 c1;
    public static final lx70 d;
    public static final lx70 d1;
    public static final lx70 e;
    public static final lx70 e1;
    public static final lx70 f;
    public static final lx70 g;
    public static final lx70 h;
    public static final lx70 i;
    public static final lx70 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new lx70(i2, (byte) 0);
        c = new lx70(i2, (byte) 1);
        d = new lx70(i2, (byte) 2);
        e = new lx70(i2, (byte) 3);
        f = new lx70(i2, (byte) 4);
        g = new lx70(i2, (byte) 5);
        h = new lx70(i2, (byte) 6);
        i = new lx70(i2, (byte) 7);
        t = new lx70(i2, (byte) 8);
        X = new lx70(i2, (byte) 9);
        Y = new lx70(i2, (byte) 10);
        Z = new lx70(i2, (byte) 11);
        N0 = new lx70(i2, (byte) 12);
        O0 = new lx70(i2, (byte) 13);
        P0 = new lx70(i2, (byte) 14);
        Q0 = new lx70(i2, (byte) 15);
        R0 = new lx70(i2, (byte) 16);
        S0 = new lx70(i2, (byte) 17);
        T0 = new lx70(i2, (byte) 18);
        U0 = new lx70(i2, (byte) 19);
        V0 = new lx70(i2, (byte) 20);
        W0 = new lx70(i2, (byte) 21);
        X0 = new lx70(i2, (byte) 22);
        Y0 = new lx70(i2, (byte) 23);
        Z0 = new lx70(i2, (byte) 24);
        a1 = new lx70(i2, (byte) 25);
        b1 = new lx70(i2, (byte) 26);
        c1 = new lx70(i2, (byte) 27);
        d1 = new lx70(i2, (byte) 28);
        e1 = new lx70(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lx70(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return v8r.q((Object) null);
            case 1:
                return new nlc0(chc1.a, m5n1.z(ip70.a));
            case 2:
                return new r36(wg80.a, (byte) 0);
            case 3:
                return oyl.a;
            case 4:
                return e;
            case 5:
                return new r36(ds80.a, (byte) 0);
            case 6:
                return rih1Var;
            case 7:
                return Long.valueOf(System.nanoTime());
            case 8:
            case 9:
                return rih1Var;
            case 10:
                BitrateLevel bitrateLevel = BitrateLevel.HIFI;
                jpr0 jpr0VarO = zgo1.o(new BitrateLevel[0], bitrateLevel);
                jpr0 jpr0VarN = zgo1.n();
                BitrateStrategy bitrateStrategy = BitrateStrategy.BEST_MATCHING;
                BitrateStrategy bitrateStrategy2 = BitrateStrategy.BACKEND_ADVISED;
                BitrateStrategy bitrateStrategy3 = BitrateStrategy.CACHED_FILE;
                jpr0 jpr0VarO2 = zgo1.o(new BitrateStrategy[]{bitrateStrategy2, bitrateStrategy3}, bitrateStrategy);
                jpr0 jpr0VarN2 = zgo1.n();
                Boolean bool = Boolean.TRUE;
                jpr0 jpr0VarO3 = zgo1.o(new Boolean[0], bool);
                u6o0 u6o0Var = u6o0.a;
                v690 v690Var = new v690(jpr0VarO, jpr0VarN, jpr0VarO2, jpr0VarN2, jpr0VarO3, zgo1.o(new u6o0[0], u6o0Var));
                r690 r690Var = r690.a;
                mmr0 mmr0Var = new mmr0(v690Var, r690Var);
                jpr0 jpr0Var = s690.a;
                mmr0 mmr0Var2 = new mmr0(new v690(jpr0Var, jpr0Var, zgo1.o(new BitrateStrategy[]{bitrateStrategy3}, bitrateStrategy), zgo1.n(), zgo1.o(new Boolean[0], bool), zgo1.o(new u6o0[0], u6o0Var)), r690Var);
                v690 v690Var2 = new v690(jpr0Var, zgo1.o(new BitrateLevel[0], bitrateLevel), zgo1.o(new BitrateStrategy[]{bitrateStrategy2, bitrateStrategy3}, bitrateStrategy), zgo1.o(new Boolean[0], bool), zgo1.o(new Boolean[0], bool), zgo1.o(new u6o0[0], u6o0Var));
                r690 r690Var2 = r690.b;
                mmr0 mmr0Var3 = new mmr0(v690Var2, r690Var2);
                mmr0 mmr0Var4 = new mmr0(new v690(jpr0Var, jpr0Var, zgo1.o(new BitrateStrategy[0], bitrateStrategy2), zgo1.n(), zgo1.o(new Boolean[0], bool), zgo1.o(new u6o0[0], u6o0Var)), r690Var2);
                jpr0 jpr0VarO4 = zgo1.o(new BitrateLevel[0], bitrateLevel);
                jpr0 jpr0VarN3 = zgo1.n();
                Boolean bool2 = Boolean.FALSE;
                mmr0 mmr0Var5 = new mmr0(new v690(jpr0Var, jpr0VarO4, jpr0VarN3, zgo1.o(new Boolean[0], bool2), zgo1.o(new Boolean[0], bool), zgo1.n()), r690.d);
                v690 v690Var3 = new v690(zgo1.n(), zgo1.n(), zgo1.n(), zgo1.n(), zgo1.n(), zgo1.o(new u6o0[0], u6o0.b));
                r690 r690Var3 = r690.c;
                return new xpb1(mmr0Var, mmr0Var2, mmr0Var3, mmr0Var4, mmr0Var5, new mmr0(v690Var3, r690Var3), new mmr0(new v690(zgo1.n(), zgo1.n(), zgo1.n(), zgo1.n(), zgo1.o(new Boolean[0], bool2), zgo1.n()), r690Var3), new mmr0(new v690(zgo1.n(), zgo1.n(), zgo1.o(new BitrateStrategy[0], BitrateStrategy.OFFLINED_FILE), zgo1.n(), zgo1.o(new Boolean[0], bool), zgo1.o(new u6o0[0], u6o0Var)), r690Var3), new mmr0(new v690(zgo1.n(), zgo1.n(), zgo1.n(), zgo1.n(), zgo1.n(), zgo1.n()), r690Var));
            case 11:
                return rih1Var;
            case 12:
                return dhr0.Companion.serializer();
            case 13:
                return new r36(n2b.a, (byte) 0);
            case 14:
                jd11 jd11Var = rc11.a;
                return new fv41("com.spotify.blend.tastematch.api.InvitationResponse", jd11Var.b(qc90.class), new tka0[]{jd11Var.b(jr00.class), jd11Var.b(hgs0.class), jd11Var.b(dri1.class)}, new nma0[]{new pfp0("com.spotify.blend.tastematch.api.ExpiredInvitation", jr00.INSTANCE, new Annotation[0]), new pfp0("com.spotify.blend.tastematch.api.PendingInvitation", hgs0.INSTANCE, new Annotation[0]), bri1.a}, new Annotation[0]);
            case 15:
                return new r36(r9a.a, (byte) 0);
            case 16:
                return new r36(pm90.d, (byte) 0);
            case 17:
                return b7x.a;
            case 18:
            case 19:
                return rih1Var;
            case 20:
                return x9a0.d;
            case 21:
                return new r36(r9a.a, (byte) 0);
            case 22:
                return new r36(chc1.a, (byte) 0);
            case 23:
            case 24:
            case 25:
                return rih1Var;
            case 26:
                return new r36(oyb0.a, (byte) 0);
            case 27:
                return Boolean.FALSE;
            case 28:
                return WorkRunners.a();
            default:
                return new r36(t920.a, (byte) 0);
        }
    }
}
