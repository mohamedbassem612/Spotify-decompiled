package p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kvj1 extends hab0 implements Function0 {
    public static final kvj1 N0;
    public static final kvj1 O0;
    public static final kvj1 P0;
    public static final kvj1 Q0;
    public static final kvj1 R0;
    public static final kvj1 S0;
    public static final kvj1 T0;
    public static final kvj1 U0;
    public static final kvj1 V0;
    public static final kvj1 W0;
    public static final kvj1 X;
    public static final kvj1 X0;
    public static final kvj1 Y;
    public static final kvj1 Y0;
    public static final kvj1 Z;
    public static final kvj1 Z0;
    public static final kvj1 a1;
    public static final kvj1 b;
    public static final kvj1 b1;
    public static final kvj1 c;
    public static final kvj1 c1;
    public static final kvj1 d;
    public static final kvj1 d1;
    public static final kvj1 e;
    public static final kvj1 e1;
    public static final kvj1 f;
    public static final kvj1 g;
    public static final kvj1 h;
    public static final kvj1 i;
    public static final kvj1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new kvj1(i2, (byte) 0);
        c = new kvj1(i2, (byte) 1);
        d = new kvj1(i2, (byte) 2);
        e = new kvj1(i2, (byte) 3);
        f = new kvj1(i2, (byte) 4);
        g = new kvj1(i2, (byte) 5);
        h = new kvj1(i2, (byte) 6);
        i = new kvj1(i2, (byte) 7);
        t = new kvj1(i2, (byte) 8);
        X = new kvj1(i2, (byte) 9);
        Y = new kvj1(i2, (byte) 10);
        Z = new kvj1(i2, (byte) 11);
        N0 = new kvj1(i2, (byte) 12);
        O0 = new kvj1(i2, (byte) 13);
        P0 = new kvj1(i2, (byte) 14);
        Q0 = new kvj1(i2, (byte) 15);
        R0 = new kvj1(i2, (byte) 16);
        S0 = new kvj1(i2, (byte) 17);
        T0 = new kvj1(i2, (byte) 18);
        U0 = new kvj1(i2, (byte) 19);
        V0 = new kvj1(i2, (byte) 20);
        W0 = new kvj1(i2, (byte) 21);
        X0 = new kvj1(i2, (byte) 22);
        Y0 = new kvj1(i2, (byte) 23);
        Z0 = new kvj1(i2, (byte) 24);
        a1 = new kvj1(i2, (byte) 25);
        b1 = new kvj1(i2, (byte) 26);
        c1 = new kvj1(i2, (byte) 27);
        d1 = new kvj1(i2, (byte) 28);
        e1 = new kvj1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kvj1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new r36(wr80.a, (byte) 0);
            case 1:
                return v8r.q(0L);
            case 2:
                return v8r.q(Boolean.FALSE);
            case 3:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 4:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 5:
                return new r36(m5n1.z(azh.a), (byte) 0);
            case 6:
                return new r36(m5n1.z(azh.a), (byte) 0);
            case 7:
            case 8:
            case 9:
                return rih1Var;
            case 10:
                return null;
            case 11:
            case 12:
            case 13:
            case 14:
                return rih1Var;
            case 15:
                a3i1 a3i1Var = new a3i1();
                for (t2i1 t2i1Var : tyk1.b) {
                    a3i1Var.b(t2i1Var.a, t2i1Var.b);
                }
                return a3i1Var;
            case 16:
                return new pfp0("didActivateCheckout", bzk1.INSTANCE, new Annotation[0]);
            case 17:
                jd11 jd11Var = rc11.a;
                return new fv41("com.spotify.thestage.vtec.logic.VtecAndroidToWebMessage", jd11Var.b(c0l1.class), new tka0[]{jd11Var.b(azk1.class), jd11Var.b(bzk1.class), jd11Var.b(fzk1.class), jd11Var.b(izk1.class), jd11Var.b(lzk1.class), jd11Var.b(ozk1.class), jd11Var.b(rzk1.class), jd11Var.b(uzk1.class), jd11Var.b(vzk1.class), jd11Var.b(yzk1.class), jd11Var.b(b0l1.class)}, new nma0[]{yyk1.a, new pfp0("didActivateCheckout", bzk1.INSTANCE, new Annotation[0]), dzk1.a, gzk1.a, jzk1.a, mzk1.a, pzk1.a, szk1.a, new pfp0("didTakeScreenshot", vzk1.INSTANCE, new Annotation[0]), wzk1.a, zzk1.a}, new Annotation[0]);
            case 18:
                return new r36(chc1.a, (byte) 0);
            case 19:
                return new r36(chc1.a, (byte) 0);
            case 20:
                return new pfp0("didTakeScreenshot", vzk1.INSTANCE, new Annotation[0]);
            case 21:
                return new pfp0("didRequestActivateCheckout", c3l1.INSTANCE, new Annotation[0]);
            case 22:
                return new pfp0("didRequestClose", d3l1.INSTANCE, new Annotation[0]);
            case 23:
                jd11 jd11Var2 = rc11.a;
                return new fv41("com.spotify.thestage.vtec.logic.VtecWebToAndroidMessage", jd11Var2.b(l4l1.class), new tka0[]{jd11Var2.b(c3l1.class), jd11Var2.b(d3l1.class), jd11Var2.b(h3l1.class), jd11Var2.b(i3l1.class), jd11Var2.b(j3l1.class), jd11Var2.b(m3l1.class), jd11Var2.b(p3l1.class), jd11Var2.b(q3l1.class), jd11Var2.b(t3l1.class), jd11Var2.b(u3l1.class), jd11Var2.b(v3l1.class), jd11Var2.b(x3l1.class), jd11Var2.b(y3l1.class), jd11Var2.b(b4l1.class), jd11Var2.b(e4l1.class), jd11Var2.b(h4l1.class), jd11Var2.b(k4l1.class)}, new nma0[]{new pfp0("didRequestActivateCheckout", c3l1.INSTANCE, new Annotation[0]), new pfp0("didRequestClose", d3l1.INSTANCE, new Annotation[0]), f3l1.a, new pfp0("didRequestIDToken", i3l1.INSTANCE, new Annotation[0]), new pfp0("didRequestInitialize", j3l1.INSTANCE, new Annotation[0]), k3l1.a, n3l1.a, new pfp0("didRequestPause", q3l1.INSTANCE, new Annotation[0]), r3l1.a, new pfp0("didRequestResume", u3l1.INSTANCE, new Annotation[0]), new pfp0("didRequestSkipToNext", v3l1.INSTANCE, new Annotation[0]), new pfp0("didRequestSkipToPrevious", x3l1.INSTANCE, new Annotation[0]), new pfp0("didRequestPresentEditProfile", y3l1.INSTANCE, new Annotation[0]), z3l1.a, c4l1.a, f4l1.a, i4l1.a}, new Annotation[0]);
            case 24:
                return new v811(rc11.a.b(String.class), chc1.a);
            case 25:
                return new pfp0("didRequestIDToken", i3l1.INSTANCE, new Annotation[0]);
            case 26:
                return new pfp0("didRequestInitialize", j3l1.INSTANCE, new Annotation[0]);
            case 27:
                return new pfp0("didRequestPause", q3l1.INSTANCE, new Annotation[0]);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new pfp0("didRequestResume", u3l1.INSTANCE, new Annotation[0]);
            default:
                return new pfp0("didRequestSkipToNext", v3l1.INSTANCE, new Annotation[0]);
        }
    }
}
