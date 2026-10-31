package p;

import com.spotify.player.model.PlayerState;
import com.spotify.signup.signup.v2.proto.FieldError;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class er81 extends hab0 implements iu30 {
    public static final er81 N0;
    public static final er81 O0;
    public static final er81 P0;
    public static final er81 Q0;
    public static final er81 R0;
    public static final er81 S0;
    public static final er81 T0;
    public static final er81 U0;
    public static final er81 V0;
    public static final er81 W0;
    public static final er81 X;
    public static final er81 X0;
    public static final er81 Y;
    public static final er81 Y0;
    public static final er81 Z;
    public static final er81 Z0;
    public static final er81 a1;
    public static final er81 b;
    public static final er81 b1;
    public static final er81 c;
    public static final er81 c1;
    public static final er81 d;
    public static final er81 d1;
    public static final er81 e;
    public static final er81 e1;
    public static final er81 f;
    public static final er81 g;
    public static final er81 h;
    public static final er81 i;
    public static final er81 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new er81(i2, (byte) 0);
        c = new er81(i2, (byte) 1);
        d = new er81(i2, (byte) 2);
        e = new er81(i2, (byte) 3);
        f = new er81(i2, (byte) 4);
        g = new er81(i2, (byte) 5);
        h = new er81(i2, (byte) 6);
        i = new er81(i2, (byte) 7);
        t = new er81(i2, (byte) 8);
        X = new er81(i2, (byte) 9);
        Y = new er81(i2, (byte) 10);
        Z = new er81(i2, (byte) 11);
        N0 = new er81(i2, (byte) 12);
        O0 = new er81(i2, (byte) 13);
        P0 = new er81(i2, (byte) 14);
        Q0 = new er81(i2, (byte) 15);
        R0 = new er81(i2, (byte) 16);
        S0 = new er81(i2, (byte) 17);
        T0 = new er81(i2, (byte) 18);
        U0 = new er81(i2, (byte) 19);
        V0 = new er81(i2, (byte) 20);
        W0 = new er81(i2, (byte) 21);
        X0 = new er81(i2, (byte) 22);
        Y0 = new er81(i2, (byte) 23);
        Z0 = new er81(i2, (byte) 24);
        a1 = new er81(i2, (byte) 25);
        b1 = new er81(i2, (byte) 26);
        c1 = new er81(i2, (byte) 27);
        d1 = new er81(i2, (byte) 28);
        e1 = new er81(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ er81(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return ((FieldError) obj).getMessage();
            case 1:
                return cw81.a;
            case 2:
                return ((bw81) obj).a;
            case 3:
                return poo1.z((PlayerState) obj);
            case 4:
                return Boolean.TRUE;
            case 5:
                q0f1 q0f1Var = (q0f1) obj;
                return Boolean.valueOf((q0f1Var != null ? q0f1Var.b : null) == null);
            case 6:
                xa5 xa5Var = (xa5) obj;
                return hm5.P(xa5Var.g(2, irn1.o0(400, 0, (dlv) null, 6)), xa5Var.c(2, irn1.o0(400, 0, (dlv) null, 6)));
            case 7:
                return rih1Var;
            case 8:
                ((n161) obj).b(lgo1.b, "TEST_TAG_RELOAD_BODY");
                return rih1Var;
            case 9:
                ((Boolean) obj).getClass();
                return rih1Var;
            case 10:
                return new a591(false);
            case 11:
                return rih1Var;
            case 12:
                List list = (List) obj;
                if (list.isEmpty()) {
                    return null;
                }
                return new l591((String) list.get(0), p791.valueOf((String) list.get(1)));
            case 13:
                return "spotify:internal:bluejay:skip-forward";
            case 14:
                return new l691("", true, new fvf1(0L, 0L));
            case 15:
                return (l691) obj;
            case 16:
                return (j691) obj;
            case 17:
                return new t691("", true, new fvf1(0L, 0L));
            case 18:
                return (t691) obj;
            case 19:
                return (r691) obj;
            case 20:
                return new x691(i791.a, false);
            case 21:
                return new e791(null, null, false, 0L);
            case 22:
                return new a891(null);
            case 23:
                return ((n3l0) obj).a("spotify:new:playlist");
            case 24:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 25:
                return new p991("", false);
            case 26:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 27:
                return new i1l0((i3l0) obj);
            case 28:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((i1l0) obj).a, r6h1.c, System.currentTimeMillis());
            default:
                return rih1Var;
        }
    }
}
