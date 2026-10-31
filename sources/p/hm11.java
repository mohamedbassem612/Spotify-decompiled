package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hm11 extends hab0 implements iu30 {
    public static final hm11 N0;
    public static final hm11 O0;
    public static final hm11 P0;
    public static final hm11 Q0;
    public static final hm11 R0;
    public static final hm11 S0;
    public static final hm11 T0;
    public static final hm11 U0;
    public static final hm11 V0;
    public static final hm11 W0;
    public static final hm11 X;
    public static final hm11 X0;
    public static final hm11 Y;
    public static final hm11 Y0;
    public static final hm11 Z;
    public static final hm11 Z0;
    public static final hm11 a1;
    public static final hm11 b;
    public static final hm11 b1;
    public static final hm11 c;
    public static final hm11 c1;
    public static final hm11 d;
    public static final hm11 d1;
    public static final hm11 e;
    public static final hm11 e1;
    public static final hm11 f;
    public static final hm11 g;
    public static final hm11 h;
    public static final hm11 i;
    public static final hm11 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new hm11(i2, (byte) 0);
        c = new hm11(i2, (byte) 1);
        d = new hm11(i2, (byte) 2);
        e = new hm11(i2, (byte) 3);
        f = new hm11(i2, (byte) 4);
        g = new hm11(i2, (byte) 5);
        h = new hm11(i2, (byte) 6);
        i = new hm11(i2, (byte) 7);
        t = new hm11(i2, (byte) 8);
        X = new hm11(i2, (byte) 9);
        Y = new hm11(i2, (byte) 10);
        Z = new hm11(i2, (byte) 11);
        N0 = new hm11(i2, (byte) 12);
        O0 = new hm11(i2, (byte) 13);
        P0 = new hm11(i2, (byte) 14);
        Q0 = new hm11(i2, (byte) 15);
        R0 = new hm11(i2, (byte) 16);
        S0 = new hm11(i2, (byte) 17);
        T0 = new hm11(i2, (byte) 18);
        U0 = new hm11(i2, (byte) 19);
        V0 = new hm11(i2, (byte) 20);
        W0 = new hm11(i2, (byte) 21);
        X0 = new hm11(i2, (byte) 22);
        Y0 = new hm11(i2, (byte) 23);
        Z0 = new hm11(i2, (byte) 24);
        a1 = new hm11(i2, (byte) 25);
        b1 = new hm11(i2, (byte) 26);
        c1 = new hm11(i2, (byte) 27);
        d1 = new hm11(i2, (byte) 28);
        e1 = new hm11(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hm11(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new fob1("", "", (String) null, (String) null, false);
            case 1:
                return ((ley0) obj).a;
            case 2:
                return ((ley0) obj).a;
            case 3:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 5:
                return Boolean.valueOf(obj instanceof jo70);
            case 6:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 7:
                return ((jm11) obj).a;
            case 8:
                return ((jm11) obj).a.a;
            case 9:
                return new b491(j491.c);
            case 10:
                return rih1Var;
            case 11:
                return rih1Var;
            case 12:
                ((Number) obj).intValue();
                return null;
            case 13:
                ((Number) obj).intValue();
                return null;
            case 14:
                b261.c((e261) obj);
                return rih1Var;
            case 15:
                return new an11("", "", "", "");
            case 16:
                return new zm11(((xxo0) obj).a);
            case 17:
                return Collections.singleton(((xxo0) obj).a);
            case 18:
                return rih1Var;
            case 19:
                return new p90(((w2c1) ((y1c1) obj)).U(aca.class), (byte) 8);
            case 20:
                return new y4g1(((cp11) obj).a);
            case 21:
                return ((cp11) obj).a;
            case 22:
                return Collections.singleton(((wlr0) obj).a);
            case 23:
                return new wlr0(((cp11) obj).a);
            case 24:
                return (String) obj;
            case 25:
                return ((jo70) obj).a;
            case 26:
                return Boolean.valueOf(obj instanceof jo70);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 28:
                return Boolean.valueOf(obj instanceof List);
            default:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
        }
    }
}
