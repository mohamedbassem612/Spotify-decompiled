package p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.lang.annotation.Annotation;
import java.net.Socket;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class orc1 extends hab0 implements Function0 {
    public static final orc1 N0;
    public static final orc1 O0;
    public static final orc1 P0;
    public static final orc1 Q0;
    public static final orc1 R0;
    public static final orc1 S0;
    public static final orc1 T0;
    public static final orc1 U0;
    public static final orc1 V0;
    public static final orc1 W0;
    public static final orc1 X;
    public static final orc1 X0;
    public static final orc1 Y;
    public static final orc1 Y0;
    public static final orc1 Z;
    public static final orc1 Z0;
    public static final orc1 a1;
    public static final orc1 b;
    public static final orc1 b1;
    public static final orc1 c;
    public static final orc1 c1;
    public static final orc1 d;
    public static final orc1 d1;
    public static final orc1 e;
    public static final orc1 e1;
    public static final orc1 f;
    public static final orc1 g;
    public static final orc1 h;
    public static final orc1 i;
    public static final orc1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new orc1(i2, (byte) 0);
        c = new orc1(i2, (byte) 1);
        d = new orc1(i2, (byte) 2);
        e = new orc1(i2, (byte) 3);
        f = new orc1(i2, (byte) 4);
        g = new orc1(i2, (byte) 5);
        h = new orc1(i2, (byte) 6);
        i = new orc1(i2, (byte) 7);
        t = new orc1(i2, (byte) 8);
        X = new orc1(i2, (byte) 9);
        Y = new orc1(i2, (byte) 10);
        Z = new orc1(i2, (byte) 11);
        N0 = new orc1(i2, (byte) 12);
        O0 = new orc1(i2, (byte) 13);
        P0 = new orc1(i2, (byte) 14);
        Q0 = new orc1(i2, (byte) 15);
        R0 = new orc1(i2, (byte) 16);
        S0 = new orc1(i2, (byte) 17);
        T0 = new orc1(i2, (byte) 18);
        U0 = new orc1(i2, (byte) 19);
        V0 = new orc1(i2, (byte) 20);
        W0 = new orc1(i2, (byte) 21);
        X0 = new orc1(i2, (byte) 22);
        Y0 = new orc1(i2, (byte) 23);
        Z0 = new orc1(i2, (byte) 24);
        a1 = new orc1(i2, (byte) 25);
        b1 = new orc1(i2, (byte) 26);
        c1 = new orc1(i2, (byte) 27);
        d1 = new orc1(i2, (byte) 28);
        e1 = new orc1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ orc1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new r36(chc1.a, (byte) 0);
            case 1:
                return new r36(jrc1.a, (byte) 0);
            case 2:
                return v8r.q(Boolean.FALSE);
            case 3:
                return v8r.q((Object) null);
            case 4:
                return rih1Var;
            case 5:
                return new r36(chc1.a, (byte) 0);
            case 6:
            case 7:
                return rih1Var;
            case 8:
                return Boolean.FALSE;
            case 9:
                return new kdn0(yoc.a);
            case 10:
                return new r36(m5n1.z(chc1.a), (byte) 0);
            case 11:
                return new r36(chc1.a, (byte) 0);
            case 12:
                return null;
            case 13:
                return new dyd1();
            case 14:
                Boolean bool = Boolean.TRUE;
                Boolean bool2 = Boolean.FALSE;
                return v8r.q(p7h.M(new Boolean[]{bool, bool2, bool2}));
            case 15:
                return Float.valueOf(1.0f);
            case 16:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 17:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 18:
                return null;
            case 19:
                return new r36(hpe1.a, (byte) 0);
            case 20:
                return ope1.Companion.serializer();
            case 21:
                return new a1z("com.spotify.watchfeed.transcript.datasource.TimeSyncedApiRequestResponse.WordTimestampAccuracy", ope1.values());
            case 22:
                jd11 jd11Var = rc11.a;
                return new fv41("com.spotify.yourupdates.domain.models.TimestampType", jd11Var.b(mxe1.class), new tka0[]{jd11Var.b(ywe1.class), jd11Var.b(bxe1.class), jd11Var.b(exe1.class), jd11Var.b(hxe1.class), jd11Var.b(ixe1.class), jd11Var.b(lxe1.class)}, new nma0[]{wwe1.a, zwe1.a, cxe1.a, fxe1.a, new pfp0("com.spotify.yourupdates.domain.models.TimestampType.Now", ixe1.INSTANCE, new Annotation[0]), jxe1.a}, new Annotation[0]);
            case 23:
                return new pfp0("com.spotify.yourupdates.domain.models.TimestampType.Now", ixe1.INSTANCE, new Annotation[0]);
            case 24:
                return Float.valueOf(0.0f);
            case 25:
                return new Socket();
            case 26:
            case 27:
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return Float.valueOf(0.0f);
            default:
                return rih1Var;
        }
    }
}
