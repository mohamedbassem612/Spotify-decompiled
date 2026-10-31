package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v160 extends hab0 implements iu30 {
    public static final v160 N0;
    public static final v160 O0;
    public static final v160 P0;
    public static final v160 Q0;
    public static final v160 R0;
    public static final v160 S0;
    public static final v160 T0;
    public static final v160 U0;
    public static final v160 V0;
    public static final v160 W0;
    public static final v160 X;
    public static final v160 X0;
    public static final v160 Y;
    public static final v160 Y0;
    public static final v160 Z;
    public static final v160 Z0;
    public static final v160 a1;
    public static final v160 b;
    public static final v160 b1;
    public static final v160 c;
    public static final v160 c1;
    public static final v160 d;
    public static final v160 d1;
    public static final v160 e;
    public static final v160 e1;
    public static final v160 f;
    public static final v160 g;
    public static final v160 h;
    public static final v160 i;
    public static final v160 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new v160(i2, (byte) 0);
        c = new v160(i2, (byte) 1);
        d = new v160(i2, (byte) 2);
        e = new v160(i2, (byte) 3);
        f = new v160(i2, (byte) 4);
        g = new v160(i2, (byte) 5);
        h = new v160(i2, (byte) 6);
        i = new v160(i2, (byte) 7);
        t = new v160(i2, (byte) 8);
        X = new v160(i2, (byte) 9);
        Y = new v160(i2, (byte) 10);
        Z = new v160(i2, (byte) 11);
        N0 = new v160(i2, (byte) 12);
        O0 = new v160(i2, (byte) 13);
        P0 = new v160(i2, (byte) 14);
        Q0 = new v160(i2, (byte) 15);
        R0 = new v160(i2, (byte) 16);
        S0 = new v160(i2, (byte) 17);
        T0 = new v160(i2, (byte) 18);
        U0 = new v160(i2, (byte) 19);
        V0 = new v160(i2, (byte) 20);
        W0 = new v160(i2, (byte) 21);
        X0 = new v160(i2, (byte) 22);
        Y0 = new v160(i2, (byte) 23);
        Z0 = new v160(i2, (byte) 24);
        a1 = new v160(i2, (byte) 25);
        b1 = new v160(i2, (byte) 26);
        c1 = new v160(i2, (byte) 27);
        d1 = new v160(i2, (byte) 28);
        e1 = new v160(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v160(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        t2b t2bVar = lgo1.b;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return (k1r) obj;
            case 1:
                return Boolean.valueOf(obj instanceof prl);
            case 2:
                return (k1r) obj;
            case 3:
                return "rating-access";
            case 4:
                return (String) obj;
            case 5:
                e261 e261Var = (e261) obj;
                b261.F(e261Var, true);
                b261.G(e261Var, -50000.0f);
                return rih1Var;
            case 6:
                ((Number) obj).intValue();
                return rih1Var;
            case 7:
                return new kh51(((z360) obj).a);
            case 8:
                b261.c((e261) obj);
                return rih1Var;
            case 9:
                return ((n460) obj).a;
            case 10:
                b261.c((e261) obj);
                return rih1Var;
            case 11:
                return new kh51(((t460) obj).a);
            case 12:
                return rih1Var;
            case 13:
                return ((m460) obj).b;
            case 14:
                return new t460(((wx11) obj).b);
            case 15:
                return ((o460) obj).b;
            case 16:
                return b7xVar;
            case 17:
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((n161) obj).b(t2bVar, "TEST_TAG_HERO_VERTICAL");
                return rih1Var;
            case 20:
                ((n161) obj).b(t2bVar, "TEST_TAG_HERO_HORIZONTAL");
                return rih1Var;
            case 21:
                return Collections.singleton(((wer0) obj).b);
            case 22:
                return new f1l0((i3l0) obj);
            case 23:
                return ((f1l0) obj).e(2, 1);
            case 24:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "shown_in_section"), new mmr0("state_after_toggle", "hidden_from_section")})), ((w1l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 25:
                return new c3l0((i3l0) obj);
            case 26:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), ((c3l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 27:
                return new m0l0((i3l0) obj);
            case 28:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), ((m0l0) obj).a, r6h1.c, System.currentTimeMillis());
            default:
                return 2;
        }
    }
}
