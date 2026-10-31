package p;

import androidx.compose.ui.text.font.FontWeight;
import com.spotify.scrollsita.v1.Section;
import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oa01 extends hab0 implements iu30 {
    public static final oa01 N0;
    public static final oa01 O0;
    public static final oa01 P0;
    public static final oa01 Q0;
    public static final oa01 R0;
    public static final oa01 S0;
    public static final oa01 T0;
    public static final oa01 U0;
    public static final oa01 V0;
    public static final oa01 W0;
    public static final oa01 X;
    public static final oa01 X0;
    public static final oa01 Y;
    public static final oa01 Y0;
    public static final oa01 Z;
    public static final oa01 Z0;
    public static final oa01 a1;
    public static final oa01 b;
    public static final oa01 b1;
    public static final oa01 c;
    public static final oa01 c1;
    public static final oa01 d;
    public static final oa01 d1;
    public static final oa01 e;
    public static final oa01 e1;
    public static final oa01 f;
    public static final oa01 g;
    public static final oa01 h;
    public static final oa01 i;
    public static final oa01 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new oa01(i2, (byte) 0);
        c = new oa01(i2, (byte) 1);
        d = new oa01(i2, (byte) 2);
        e = new oa01(i2, (byte) 3);
        f = new oa01(i2, (byte) 4);
        g = new oa01(i2, (byte) 5);
        h = new oa01(i2, (byte) 6);
        i = new oa01(i2, (byte) 7);
        t = new oa01(i2, (byte) 8);
        X = new oa01(i2, (byte) 9);
        Y = new oa01(i2, (byte) 10);
        Z = new oa01(i2, (byte) 11);
        N0 = new oa01(i2, (byte) 12);
        O0 = new oa01(i2, (byte) 13);
        P0 = new oa01(i2, (byte) 14);
        Q0 = new oa01(i2, (byte) 15);
        R0 = new oa01(i2, (byte) 16);
        S0 = new oa01(i2, (byte) 17);
        T0 = new oa01(i2, (byte) 18);
        U0 = new oa01(i2, (byte) 19);
        V0 = new oa01(i2, (byte) 20);
        W0 = new oa01(i2, (byte) 21);
        X0 = new oa01(i2, (byte) 22);
        Y0 = new oa01(i2, (byte) 23);
        Z0 = new oa01(i2, (byte) 24);
        a1 = new oa01(i2, (byte) 25);
        b1 = new oa01(i2, (byte) 26);
        c1 = new oa01(i2, (byte) 27);
        d1 = new oa01(i2, (byte) 28);
        e1 = new oa01(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa01(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        mq70 mq70Var;
        up70 up70VarA;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return (k8g1) obj;
            case 1:
                return Boolean.valueOf(obj instanceof k8g1);
            case 2:
                if (obj != null) {
                    return (k8g1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.transcript.model.Transcript");
                return null;
            case 3:
                return Boolean.valueOf(obj instanceof k8g1);
            case 4:
                if (obj != null) {
                    return (k8g1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.transcript.model.Transcript");
                return null;
            case 5:
                return Boolean.valueOf(obj instanceof k8g1);
            case 6:
                if (obj != null) {
                    return (k8g1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.transcript.model.Transcript");
                return null;
            case 7:
                return (ga01) obj;
            case 8:
                k8g1 k8g1Var = (k8g1) obj;
                return new n701(k8g1Var.a, k8g1Var.h, k8g1Var.d, k8g1Var.e, k8g1Var.i, k8g1Var.f, k8g1Var.g, k8g1Var.t, k8g1Var.X);
            case 9:
                return new ta01(((ra01) obj).a, false, true);
            case 10:
                return new fc01(((ec01) obj).a);
            case 11:
                return Integer.valueOf(-((Number) obj).intValue());
            case 12:
                return Integer.valueOf(-((Number) obj).intValue());
            case 13:
                return Integer.valueOf(((Number) obj).intValue());
            case 14:
                return Integer.valueOf(((Number) obj).intValue());
            case 15:
                return rih1Var;
            case 16:
                FontWeight fontWeight = FontWeight.t;
                return hm5.d(new a930[]{new dj4((File) obj, fontWeight, u890.d(fontWeight, new ga30[0]))});
            case 17:
                return ((kd01) obj).a;
            case 18:
                xkk1 xkk1Var = (xkk1) obj;
                if (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null) {
                    return null;
                }
                return up70VarA.a.a;
            case 19:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 20:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 21:
                qd01 qd01Var = (qd01) obj;
                return new rd01(qd01Var.b, z6x.a, qd01Var.a);
            case 22:
                return ((snu0) obj).a;
            case 23:
                return new ge01(((fe01) obj).a, 2, 1);
            case 24:
                boolean z = ((oe01) obj).a;
                hc01.d.getClass();
                hc01 hc01Var = hc01.e;
                fd01.d.getClass();
                return new pe01(z, hc01Var, fd01.e, 1);
            case 25:
                b261.c((e261) obj);
                return rih1Var;
            case 26:
                return kh01.a;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return ((ah01) obj).a;
            case 28:
                return ((ah01) obj).a;
            default:
                return Boolean.valueOf(obj instanceof iix0);
        }
    }
}
