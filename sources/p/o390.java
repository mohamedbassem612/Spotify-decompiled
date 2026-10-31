package p;

import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.media3.exoplayer.ExoPlayer;
import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o390 extends hab0 implements iu30 {
    public static final o390 N0;
    public static final o390 O0;
    public static final o390 P0;
    public static final o390 Q0;
    public static final o390 R0;
    public static final o390 S0;
    public static final o390 T0;
    public static final o390 U0;
    public static final o390 V0;
    public static final o390 W0;
    public static final o390 X;
    public static final o390 X0;
    public static final o390 Y;
    public static final o390 Y0;
    public static final o390 Z;
    public static final o390 Z0;
    public static final o390 a1;
    public static final o390 b;
    public static final o390 b1;
    public static final o390 c;
    public static final o390 c1;
    public static final o390 d;
    public static final o390 d1;
    public static final o390 e;
    public static final o390 e1;
    public static final o390 f;
    public static final o390 g;
    public static final o390 h;
    public static final o390 i;
    public static final o390 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new o390(i2, (byte) 0);
        c = new o390(i2, (byte) 1);
        d = new o390(i2, (byte) 2);
        e = new o390(i2, (byte) 3);
        f = new o390(i2, (byte) 4);
        g = new o390(i2, (byte) 5);
        h = new o390(i2, (byte) 6);
        i = new o390(i2, (byte) 7);
        t = new o390(i2, (byte) 8);
        X = new o390(i2, (byte) 9);
        Y = new o390(i2, (byte) 10);
        Z = new o390(i2, (byte) 11);
        N0 = new o390(i2, (byte) 12);
        O0 = new o390(i2, (byte) 13);
        P0 = new o390(i2, (byte) 14);
        Q0 = new o390(i2, (byte) 15);
        R0 = new o390(i2, (byte) 16);
        S0 = new o390(i2, (byte) 17);
        T0 = new o390(i2, (byte) 18);
        U0 = new o390(i2, (byte) 19);
        V0 = new o390(i2, (byte) 20);
        W0 = new o390(i2, (byte) 21);
        X0 = new o390(i2, (byte) 22);
        Y0 = new o390(i2, (byte) 23);
        Z0 = new o390(i2, (byte) 24);
        a1 = new o390(i2, (byte) 25);
        b1 = new o390(i2, (byte) 26);
        c1 = new o390(i2, (byte) 27);
        d1 = new o390(i2, (byte) 28);
        e1 = new o390(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o390(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                ((ExoPlayer) obj).e();
                return rih1Var;
            case 1:
                ((ExoPlayer) obj).stop();
                return rih1Var;
            case 2:
                return rih1Var;
            case 3:
                j990 j990Var = (j990) obj;
                return new o990(j990Var.a, j990Var.b, m990.a, mqo1.A(j990Var.d), j990Var.e);
            case 4:
                return rih1Var;
            case 5:
                return rih1Var;
            case 6:
                return new o0l0((i3l0) obj);
            case 7:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((o0l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 8:
                return new tyk0((i3l0) obj);
            case 9:
                return ((tyk0) obj).e();
            case 10:
                b261.c((e261) obj);
                return rih1Var;
            case 11:
                b261.c((e261) obj);
                return rih1Var;
            case 12:
                return new z8l0(new h7l0((byte) 19));
            case 13:
                return new z8l0(new h7l0((byte) 19));
            case 14:
                qe90 qe90Var = (qe90) obj;
                return new bjs0(qe90Var.b, qe90Var.c, qe90Var.d, qe90Var.e, true, (bro1) null, 96);
            case 15:
                return new pe90((zis0) obj);
            case 16:
                return Boolean.valueOf((obj instanceof Boolean) || (obj instanceof rih1));
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 18:
                return rih1Var;
            case 19:
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 20:
                return rl90.a;
            case 21:
                return ((pl90) obj).a;
            case 22:
                return (cm90) obj;
            case 23:
                return Boolean.valueOf((obj instanceof cm90) || (obj instanceof rih1));
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (cm90) obj;
            case 25:
                return rih1Var;
            case 26:
                return ((n3l0) obj).a((String) null);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Long.valueOf(((tpt) obj).a);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((kd31) obj).i(1);
                return rih1Var;
            default:
                lsl lslVar = (lsl) obj;
                float fE = Size.e(lslVar.j()) * 0.07f;
                float fE2 = (Size.e(lslVar.j()) * 0.5f) + fE;
                if (Float.intBitsToFloat((int) (lslVar.j() >> 32)) == Float.intBitsToFloat((int) (lslVar.j() & 4294967295L))) {
                    DrawScope.b0(lslVar, u7h.b, fE2, 0L, 0.0f, (DrawStyle) null, 60);
                } else {
                    float f2 = -fE;
                    float f3 = 2.0f * fE;
                    DrawScope.g0(lslVar, u7h.b, (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() >> 32)) + f3)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) + f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fE2)) << 32) | (((long) Float.floatToRawIntBits(fE2)) & 4294967295L), (DrawStyle) null, 0.0f, 0, ContentType.LONG_FORM_ON_DEMAND);
                }
                lslVar.s1();
                return rih1Var;
        }
    }
}
