package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hzg1 extends hab0 implements iu30 {
    public static final hzg1 N0;
    public static final hzg1 O0;
    public static final hzg1 P0;
    public static final hzg1 Q0;
    public static final hzg1 R0;
    public static final hzg1 S0;
    public static final hzg1 T0;
    public static final hzg1 U0;
    public static final hzg1 V0;
    public static final hzg1 W0;
    public static final hzg1 X;
    public static final hzg1 X0;
    public static final hzg1 Y;
    public static final hzg1 Y0;
    public static final hzg1 Z;
    public static final hzg1 Z0;
    public static final hzg1 a1;
    public static final hzg1 b;
    public static final hzg1 b1;
    public static final hzg1 c;
    public static final hzg1 c1;
    public static final hzg1 d;
    public static final hzg1 d1;
    public static final hzg1 e;
    public static final hzg1 e1;
    public static final hzg1 f;
    public static final hzg1 g;
    public static final hzg1 h;
    public static final hzg1 i;
    public static final hzg1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new hzg1(i2, (byte) 0);
        c = new hzg1(i2, (byte) 1);
        d = new hzg1(i2, (byte) 2);
        e = new hzg1(i2, (byte) 3);
        f = new hzg1(i2, (byte) 4);
        g = new hzg1(i2, (byte) 5);
        h = new hzg1(i2, (byte) 6);
        i = new hzg1(i2, (byte) 7);
        t = new hzg1(i2, (byte) 8);
        X = new hzg1(i2, (byte) 9);
        Y = new hzg1(i2, (byte) 10);
        Z = new hzg1(i2, (byte) 11);
        N0 = new hzg1(i2, (byte) 12);
        O0 = new hzg1(i2, (byte) 13);
        P0 = new hzg1(i2, (byte) 14);
        Q0 = new hzg1(i2, (byte) 15);
        R0 = new hzg1(i2, (byte) 16);
        S0 = new hzg1(i2, (byte) 17);
        T0 = new hzg1(i2, (byte) 18);
        U0 = new hzg1(i2, (byte) 19);
        V0 = new hzg1(i2, (byte) 20);
        W0 = new hzg1(i2, (byte) 21);
        X0 = new hzg1(i2, (byte) 22);
        Y0 = new hzg1(i2, (byte) 23);
        Z0 = new hzg1(i2, (byte) 24);
        a1 = new hzg1(i2, (byte) 25);
        b1 = new hzg1(i2, (byte) 26);
        c1 = new hzg1(i2, (byte) 27);
        d1 = new hzg1(i2, (byte) 28);
        e1 = new hzg1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hzg1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        t2b t2bVar = lgo1.b;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return rih1Var;
            case 1:
                List list = (List) obj;
                return new e4h1(new tr80(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), 1));
            case 2:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), ((o3m0) obj).a, r6h1.c, System.currentTimeMillis());
            case 3:
                return new ach1((qxc0) obj);
            case 4:
                return Boolean.valueOf((obj instanceof qxc0) || (obj instanceof rih1));
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 6:
                return new jch1((qxc0) obj);
            case 7:
                return Boolean.valueOf((obj instanceof qxc0) || (obj instanceof rih1));
            case 8:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 9:
                l7e0 l7e0Var = ((hwq) obj).g;
                return new gch1(l7e0Var.getUri(), l7e0Var.a());
            case 10:
                ((n161) obj).b(t2bVar, "TEST_TAG_UNAUTHENTICATED_COMPACT");
                return rih1Var;
            case 11:
                ((n161) obj).b(t2bVar, "TEST_TAG_UNAUTHENTICATED_COMPACT_TEXT");
                return rih1Var;
            case 12:
                ((n161) obj).b(t2bVar, "TEST_TAG_VALUE_TEXT");
                return rih1Var;
            case 13:
                ((n161) obj).b(t2bVar, "TEST_TAG_UNAUTHENTICATED_NO_RECOMMENDATIONS");
                return rih1Var;
            case 14:
                ((n161) obj).b(t2bVar, "TEST_TAG_UNAUTHENTICATED_SINGLE_ARTWORK");
                return rih1Var;
            case 15:
                ((n161) obj).b(t2bVar, "TEST_TAG_UNAUTHENTICATED_WITH_RECOMMENDATIONS_NORMAL");
                return rih1Var;
            case 16:
                ((n161) obj).b(t2bVar, "TEST_TAG_UNAUTHENTICATED_RECOMMENDATIONS_GRID");
                return rih1Var;
            case 17:
                return new bgh1((a331) obj, false);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new r2l0((i3l0) obj);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new b3l0((i3l0) obj);
            case 20:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((b3l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 21:
                return new d1l0((i3l0) obj);
            case 22:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "muted"), new mmr0("state_after_toggle", "not_muted")})), ((d1l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 23:
                return new x2l0((i3l0) obj);
            case 24:
                return rih1Var;
            case 25:
                return (String) obj;
            case 26:
                myv0 myv0Var = (myv0) obj;
                if (myv0Var == null) {
                    return null;
                }
                String str = myv0Var.a;
                if (str.length() > 0) {
                    return str;
                }
                return null;
            case 27:
                return new s460(2, 1006, ((smh1) obj).a, (String) null, (String) null, (String) null, false);
            case 28:
                return new lnh1(((tmh1) obj).a);
            default:
                return Boolean.valueOf((obj instanceof myv0) || (obj instanceof rih1));
        }
    }
}
