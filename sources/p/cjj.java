package p;

import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cjj extends hab0 implements iu30 {
    public static final cjj N0;
    public static final cjj O0;
    public static final cjj P0;
    public static final cjj Q0;
    public static final cjj R0;
    public static final cjj S0;
    public static final cjj T0;
    public static final cjj U0;
    public static final cjj V0;
    public static final cjj W0;
    public static final cjj X;
    public static final cjj X0;
    public static final cjj Y;
    public static final cjj Y0;
    public static final cjj Z;
    public static final cjj Z0;
    public static final cjj a1;
    public static final cjj b;
    public static final cjj b1;
    public static final cjj c;
    public static final cjj c1;
    public static final cjj d;
    public static final cjj d1;
    public static final cjj e;
    public static final cjj e1;
    public static final cjj f;
    public static final cjj g;
    public static final cjj h;
    public static final cjj i;
    public static final cjj t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new cjj(i2, (byte) 0);
        c = new cjj(i2, (byte) 1);
        d = new cjj(i2, (byte) 2);
        e = new cjj(i2, (byte) 3);
        f = new cjj(i2, (byte) 4);
        g = new cjj(i2, (byte) 5);
        h = new cjj(i2, (byte) 6);
        i = new cjj(i2, (byte) 7);
        t = new cjj(i2, (byte) 8);
        X = new cjj(i2, (byte) 9);
        Y = new cjj(i2, (byte) 10);
        Z = new cjj(i2, (byte) 11);
        N0 = new cjj(i2, (byte) 12);
        O0 = new cjj(i2, (byte) 13);
        P0 = new cjj(i2, (byte) 14);
        Q0 = new cjj(i2, (byte) 15);
        R0 = new cjj(i2, (byte) 16);
        S0 = new cjj(i2, (byte) 17);
        T0 = new cjj(i2, (byte) 18);
        U0 = new cjj(i2, (byte) 19);
        V0 = new cjj(i2, (byte) 20);
        W0 = new cjj(i2, (byte) 21);
        X0 = new cjj(i2, (byte) 22);
        Y0 = new cjj(i2, (byte) 23);
        Z0 = new cjj(i2, (byte) 24);
        a1 = new cjj(i2, (byte) 25);
        b1 = new cjj(i2, (byte) 26);
        c1 = new cjj(i2, (byte) 27);
        d1 = new cjj(i2, (byte) 28);
        e1 = new cjj(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cjj(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                ((Boolean) obj).getClass();
                return rih1Var;
            case 1:
                ((kd31) obj).f(false);
                return rih1Var;
            case 2:
                b261.c((e261) obj);
                return rih1Var;
            case 3:
                b261.c((e261) obj);
                return rih1Var;
            case 4:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 5:
                return rih1Var;
            case 6:
                return rih1Var;
            case 7:
                return Long.valueOf(((Number) obj).longValue());
            case 8:
                return Long.valueOf(((Number) obj).longValue());
            case 9:
                b261.c((e261) obj);
                return rih1Var;
            case 11:
            case 10:
                return rih1Var;
            case 12:
                p901 p901Var = (p901) obj;
                return new lwj(p901Var.a, 252, p901Var.b);
            case 13:
                return new ga01(14, ((p901) obj).a, (String) null, false);
            case 14:
                k8g1 k8g1Var = (k8g1) obj;
                String str = k8g1Var.b;
                return new jwj(k8g1Var.h, str, k8g1Var.c, k8g1Var.t, k8g1Var.d);
            case 15:
                return Boolean.valueOf(obj instanceof k8g1);
            case 16:
                if (obj != null) {
                    return (k8g1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.transcript.model.Transcript");
                return null;
            case 17:
                return new gyj(((c061) obj).a, 126);
            case 18:
                return new ga01(10, ((c061) obj).a, (String) null, false);
            case 19:
                k8g1 k8g1Var2 = (k8g1) obj;
                String str2 = k8g1Var2.c;
                String str3 = k8g1Var2.d;
                return new fyj(k8g1Var2.f, k8g1Var2.t, str2, k8g1Var2.h, str3);
            case 20:
                return Boolean.valueOf(obj instanceof k8g1);
            case 21:
                if (obj != null) {
                    return (k8g1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.transcript.model.Transcript");
                return null;
            case 22:
                return rih1Var;
            case 23:
                return new i46(((dpd) obj).b, (byte) 1);
            case 24:
                return (String) obj;
            case 25:
                return (String) obj;
            case 26:
                return (String) obj;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return (String) obj;
            case 28:
                return (String) obj;
            default:
                return (String) obj;
        }
    }
}
