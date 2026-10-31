package p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.scrollsita.v1.Section;
import com.spotify.signup.signup.v2.proto.Tracking;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gr81 extends hab0 implements Function0 {
    public static final gr81 N0;
    public static final gr81 O0;
    public static final gr81 P0;
    public static final gr81 Q0;
    public static final gr81 R0;
    public static final gr81 S0;
    public static final gr81 T0;
    public static final gr81 U0;
    public static final gr81 V0;
    public static final gr81 W0;
    public static final gr81 X;
    public static final gr81 X0;
    public static final gr81 Y;
    public static final gr81 Y0;
    public static final gr81 Z;
    public static final gr81 Z0;
    public static final gr81 a1;
    public static final gr81 b;
    public static final gr81 b1;
    public static final gr81 c;
    public static final gr81 c1;
    public static final gr81 d;
    public static final gr81 d1;
    public static final gr81 e;
    public static final gr81 e1;
    public static final gr81 f;
    public static final gr81 g;
    public static final gr81 h;
    public static final gr81 i;
    public static final gr81 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new gr81(i2, (byte) 0);
        c = new gr81(i2, (byte) 1);
        d = new gr81(i2, (byte) 2);
        e = new gr81(i2, (byte) 3);
        f = new gr81(i2, (byte) 4);
        g = new gr81(i2, (byte) 5);
        h = new gr81(i2, (byte) 6);
        i = new gr81(i2, (byte) 7);
        t = new gr81(i2, (byte) 8);
        X = new gr81(i2, (byte) 9);
        Y = new gr81(i2, (byte) 10);
        Z = new gr81(i2, (byte) 11);
        N0 = new gr81(i2, (byte) 12);
        O0 = new gr81(i2, (byte) 13);
        P0 = new gr81(i2, (byte) 14);
        Q0 = new gr81(i2, (byte) 15);
        R0 = new gr81(i2, (byte) 16);
        S0 = new gr81(i2, (byte) 17);
        T0 = new gr81(i2, (byte) 18);
        U0 = new gr81(i2, (byte) 19);
        V0 = new gr81(i2, (byte) 20);
        W0 = new gr81(i2, (byte) 21);
        X0 = new gr81(i2, (byte) 22);
        Y0 = new gr81(i2, (byte) 23);
        Z0 = new gr81(i2, (byte) 24);
        a1 = new gr81(i2, (byte) 25);
        b1 = new gr81(i2, (byte) 26);
        c1 = new gr81(i2, (byte) 27);
        d1 = new gr81(i2, (byte) 28);
        e1 = new gr81(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gr81(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                a3g1 a3g1VarN = Tracking.n();
                a3g1VarN.q();
                return (Tracking) a3g1VarN.build();
            case 1:
                chc1 chc1Var = chc1.a;
                return new nlc0(chc1Var, chc1Var);
            case 2:
                return new elg(503, "Timed out waiting for client token");
            case 3:
                return null;
            case 4:
                return ci8.Companion.serializer();
            case 5:
                return new r36(chc1.a, (byte) 0);
            case 6:
                return Boolean.TRUE;
            case 7:
                r6h1 r6h1Var = r6h1.c;
                return new z5l0();
            case 8:
                return v8r.q(Boolean.FALSE);
            case 9:
                return "wearable";
            case 10:
                return new zwk0();
            case 11:
            case 12:
            case 13:
                return rih1Var;
            case 14:
                return null;
            case 15:
                return WorkRunners.a();
            case 16:
                return WorkRunners.a();
            case 17:
                return new u7h(u7h.k);
            case 18:
                return new laa1((byte) 0);
            case 19:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 20:
                return Boolean.FALSE;
            case 21:
                return aka1.b;
            case 22:
                jd11 jd11Var = rc11.a;
                return new fv41("com.spotify.ubi.logger.SourcePathsUnavailableReason", jd11Var.b(mla1.class), new tka0[]{jd11Var.b(ila1.class), jd11Var.b(jla1.class), jd11Var.b(kla1.class), jd11Var.b(lla1.class)}, new nma0[]{gla1.a, new pfp0("non_contextual_page", jla1.INSTANCE, new Annotation[0]), new pfp0("not_implemented", kla1.INSTANCE, new Annotation[0]), new pfp0("unknown", lla1.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 23:
                return new pfp0("non_contextual_page", jla1.INSTANCE, new Annotation[0]);
            case 24:
                return new pfp0("not_implemented", kla1.INSTANCE, new Annotation[0]);
            case 25:
                return new r36(ca20.a, (byte) 0);
            case 26:
                return new r36(z920.a, (byte) 0);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new r36(ca20.a, (byte) 0);
            case 28:
                return new r36(h1b1.a, (byte) 0);
            default:
                return new r36(gol.a, (byte) 0);
        }
    }
}
