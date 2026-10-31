package p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w661 extends hab0 implements Function0 {
    public static final w661 N0;
    public static final w661 O0;
    public static final w661 P0;
    public static final w661 Q0;
    public static final w661 R0;
    public static final w661 S0;
    public static final w661 T0;
    public static final w661 U0;
    public static final w661 V0;
    public static final w661 W0;
    public static final w661 X;
    public static final w661 X0;
    public static final w661 Y;
    public static final w661 Y0;
    public static final w661 Z;
    public static final w661 Z0;
    public static final w661 a1;
    public static final w661 b;
    public static final w661 b1;
    public static final w661 c;
    public static final w661 c1;
    public static final w661 d;
    public static final w661 d1;
    public static final w661 e;
    public static final w661 e1;
    public static final w661 f;
    public static final w661 g;
    public static final w661 h;
    public static final w661 i;
    public static final w661 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new w661(i2, (byte) 0);
        c = new w661(i2, (byte) 1);
        d = new w661(i2, (byte) 2);
        e = new w661(i2, (byte) 3);
        f = new w661(i2, (byte) 4);
        g = new w661(i2, (byte) 5);
        h = new w661(i2, (byte) 6);
        i = new w661(i2, (byte) 7);
        t = new w661(i2, (byte) 8);
        X = new w661(i2, (byte) 9);
        Y = new w661(i2, (byte) 10);
        Z = new w661(i2, (byte) 11);
        N0 = new w661(i2, (byte) 12);
        O0 = new w661(i2, (byte) 13);
        P0 = new w661(i2, (byte) 14);
        Q0 = new w661(i2, (byte) 15);
        R0 = new w661(i2, (byte) 16);
        S0 = new w661(i2, (byte) 17);
        T0 = new w661(i2, (byte) 18);
        U0 = new w661(i2, (byte) 19);
        V0 = new w661(i2, (byte) 20);
        W0 = new w661(i2, (byte) 21);
        X0 = new w661(i2, (byte) 22);
        Y0 = new w661(i2, (byte) 23);
        Z0 = new w661(i2, (byte) 24);
        a1 = new w661(i2, (byte) 25);
        b1 = new w661(i2, (byte) 26);
        c1 = new w661(i2, (byte) 27);
        d1 = new w661(i2, (byte) 28);
        e1 = new w661(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w661(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new v811(rc11.a.b(t9n.class), u9n.a);
            case 1:
                return new wa8((c821) null, 7);
            case 2:
                return new r36(hg61.a, (byte) 0);
            case 3:
                return v8r.q((Object) null);
            case 4:
            case 5:
                return rih1Var;
            case 6:
                return new r36(hg61.a, (byte) 0);
            case 7:
                return "Exactly one title property must be populated.";
            case 8:
                return "Exactly one message property must be populated.";
            case 9:
                return "Exactly one confirm button action text property must be populated.";
            case 10:
                return "Exactly one title property must be populated.";
            case 11:
                return "Exactly one message property must be populated.";
            case 12:
                return "Exactly one button1 action text property must be populated.";
            case 13:
                return "Exactly one button2 action text property must be populated.";
            case 14:
                return "Exactly one title property must be populated.";
            case 15:
                return "Exactly one message property must be populated.";
            case 16:
                return "Exactly one confirm button action text property must be populated.";
            case 17:
                return v8r.q((Object) null);
            case 18:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 19:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 20:
                return v8r.q(new c8e1(0L, 7, (String) null));
            case 21:
                return "Only one section title property may be populated.";
            case 22:
                return "Only one section note property may be populated.";
            case 23:
                return "Exactly one title property must be populated.";
            case 24:
                return "Only one section note property may be populated.";
            case 25:
                return new err0(0);
            case 26:
                return null;
            case 27:
                return p7h.M(new o571[]{d571.d, t471.d, b571.d, n471.d, k571.d, f571.d, g571.d, l571.d, m571.d, w471.d, u471.d, v471.d, s471.d, q471.d, r471.d, n571.d, x471.d, e571.d, i571.d, j571.d, c571.d, m471.d, z471.d, p471.d, h571.d, y471.d});
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return rih1Var;
            default:
                WorkRunners.MyThreadFactory myThreadFactory3 = WorkRunners.a;
                return new ImmediateWorkRunner();
        }
    }
}
