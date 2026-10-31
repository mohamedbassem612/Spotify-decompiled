package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a411 extends hab0 implements iu30 {
    public static final a411 N0;
    public static final a411 O0;
    public static final a411 P0;
    public static final a411 Q0;
    public static final a411 R0;
    public static final a411 S0;
    public static final a411 T0;
    public static final a411 U0;
    public static final a411 V0;
    public static final a411 W0;
    public static final a411 X;
    public static final a411 X0;
    public static final a411 Y;
    public static final a411 Y0;
    public static final a411 Z;
    public static final a411 Z0;
    public static final a411 a1;
    public static final a411 b;
    public static final a411 b1;
    public static final a411 c;
    public static final a411 c1;
    public static final a411 d;
    public static final a411 d1;
    public static final a411 e;
    public static final a411 e1;
    public static final a411 f;
    public static final a411 g;
    public static final a411 h;
    public static final a411 i;
    public static final a411 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new a411(i2, (byte) 0);
        c = new a411(i2, (byte) 1);
        d = new a411(i2, (byte) 2);
        e = new a411(i2, (byte) 3);
        f = new a411(i2, (byte) 4);
        g = new a411(i2, (byte) 5);
        h = new a411(i2, (byte) 6);
        i = new a411(i2, (byte) 7);
        t = new a411(i2, (byte) 8);
        X = new a411(i2, (byte) 9);
        Y = new a411(i2, (byte) 10);
        Z = new a411(i2, (byte) 11);
        N0 = new a411(i2, (byte) 12);
        O0 = new a411(i2, (byte) 13);
        P0 = new a411(i2, (byte) 14);
        Q0 = new a411(i2, (byte) 15);
        R0 = new a411(i2, (byte) 16);
        S0 = new a411(i2, (byte) 17);
        T0 = new a411(i2, (byte) 18);
        U0 = new a411(i2, (byte) 19);
        V0 = new a411(i2, (byte) 20);
        W0 = new a411(i2, (byte) 21);
        X0 = new a411(i2, (byte) 22);
        Y0 = new a411(i2, (byte) 23);
        Z0 = new a411(i2, (byte) 24);
        a1 = new a411(i2, (byte) 25);
        b1 = new a411(i2, (byte) 26);
        c1 = new a411(i2, (byte) 27);
        d1 = new a411(i2, (byte) 28);
        e1 = new a411(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a411(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        lnm lnmVar = null;
        switch (b2) {
            case 0:
                if (!(obj instanceof zoy0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                return ((uv11) obj).a;
            case 2:
                return ((uv11) obj).b;
            case 3:
                uv11 uv11Var = (uv11) obj;
                return new qvc0(xzo1.r(uv11Var.b, uv11Var.a), (c3d0) null, (Set) null, (mqz0) null, 14);
            case 4:
                uv11 uv11Var2 = (uv11) obj;
                return new qvc0(xzo1.r(uv11Var2.b, uv11Var2.a), (c3d0) null, (Set) null, (mqz0) null, 14);
            case 5:
                return ((uv11) obj).a;
            case 6:
                return ((uv11) obj).a;
            case 7:
                return ((ho70) obj).a;
            case 8:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 9:
                return new b511("", true);
            case 10:
                ((qtr) obj).b(new gp9(5, lnmVar, (byte) 8));
                return rih1Var;
            case 11:
                return new s1l0((i3l0) obj);
            case 12:
                return q911.c;
            case 13:
                return new ea11(true, false);
            case 14:
                return "is-euterpe";
            case 15:
                return da11.a;
            case 16:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf(obj instanceof qxc0);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 20:
                String str = ((ka11) obj).a;
                if (ja11.a(str) != blc0.fh) {
                    str = null;
                }
                if (str != null) {
                    return new rxc0(str);
                }
                return null;
            case 21:
                String str2 = ((ka11) obj).a;
                if (ja11.a(str2) == blc0.Pg) {
                    return str2;
                }
                return null;
            case 22:
                return Boolean.valueOf(obj instanceof qxc0);
            case 23:
                return (k1r) obj;
            case 24:
                return Boolean.valueOf(obj instanceof hll);
            case 25:
                return (k1r) obj;
            case 26:
                return pa11.a;
            case 27:
                return ((wc11) obj).c;
            case 28:
                return ((cd11) obj).c;
            default:
                return Boolean.valueOf(obj instanceof jo70);
        }
    }
}
