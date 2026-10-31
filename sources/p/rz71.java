package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rz71 extends hab0 implements iu30 {
    public static final rz71 N0;
    public static final rz71 O0;
    public static final rz71 P0;
    public static final rz71 Q0;
    public static final rz71 R0;
    public static final rz71 S0;
    public static final rz71 T0;
    public static final rz71 U0;
    public static final rz71 V0;
    public static final rz71 W0;
    public static final rz71 X;
    public static final rz71 X0;
    public static final rz71 Y;
    public static final rz71 Y0;
    public static final rz71 Z;
    public static final rz71 Z0;
    public static final rz71 a1;
    public static final rz71 b;
    public static final rz71 b1;
    public static final rz71 c;
    public static final rz71 c1;
    public static final rz71 d;
    public static final rz71 d1;
    public static final rz71 e;
    public static final rz71 e1;
    public static final rz71 f;
    public static final rz71 g;
    public static final rz71 h;
    public static final rz71 i;
    public static final rz71 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new rz71(i2, (byte) 0);
        c = new rz71(i2, (byte) 1);
        d = new rz71(i2, (byte) 2);
        e = new rz71(i2, (byte) 3);
        f = new rz71(i2, (byte) 4);
        g = new rz71(i2, (byte) 5);
        h = new rz71(i2, (byte) 6);
        i = new rz71(i2, (byte) 7);
        t = new rz71(i2, (byte) 8);
        X = new rz71(i2, (byte) 9);
        Y = new rz71(i2, (byte) 10);
        Z = new rz71(i2, (byte) 11);
        N0 = new rz71(i2, (byte) 12);
        O0 = new rz71(i2, (byte) 13);
        P0 = new rz71(i2, (byte) 14);
        Q0 = new rz71(i2, (byte) 15);
        R0 = new rz71(i2, (byte) 16);
        S0 = new rz71(i2, (byte) 17);
        T0 = new rz71(i2, (byte) 18);
        U0 = new rz71(i2, (byte) 19);
        V0 = new rz71(i2, (byte) 20);
        W0 = new rz71(i2, (byte) 21);
        X0 = new rz71(i2, (byte) 22);
        Y0 = new rz71(i2, (byte) 23);
        Z0 = new rz71(i2, (byte) 24);
        a1 = new rz71(i2, (byte) 25);
        b1 = new rz71(i2, (byte) 26);
        c1 = new rz71(i2, (byte) 27);
        d1 = new rz71(i2, (byte) 28);
        e1 = new rz71(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rz71(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                ((kd31) obj).i(1);
                return rih1Var;
            case 1:
                ((kd31) obj).d(6);
                return rih1Var;
            case 2:
                return ((y081) obj).a;
            case 3:
                return ((c181) obj).a.d;
            case 4:
                f381 f381Var = (f381) obj;
                return new j381(f381Var.b, f381Var.c, f381Var.d, f381Var.e, f381Var.h, f381Var.i, f381Var.j);
            case 5:
                int iOrdinal = ((i381) obj).ordinal();
                if (iOrdinal == 0) {
                    return c381.a;
                }
                if (iOrdinal == 1) {
                    return b381.a;
                }
                eg.o();
                return null;
            case 6:
                e381 e381Var = (e381) obj;
                return new f381(e381Var.a, e381Var.b, e381Var.c, e381Var.d, e381Var.e, e381Var.f, e381Var.g, false, false, e381Var.k);
            case 7:
                return Boolean.TRUE;
            case 8:
                return rih1Var;
            case 9:
                return rih1Var;
            case 10:
                yxo0 yxo0Var = (yxo0) obj;
                String str = yxo0Var.a;
                return new c1(str, yxo0Var.b, new a1(str, x0.a), new z0());
            case 11:
                yxo0 yxo0Var2 = (yxo0) obj;
                String str2 = yxo0Var2.a;
                return new pyn(str2, yxo0Var2.b, new jyn(str2, 1), new iyn());
            case 12:
                return Collections.singleton(((yxo0) obj).a);
            case 13:
                return ((j681) obj).a;
            case 14:
                return rih1Var;
            case 15:
                hey0 hey0Var = (hey0) obj;
                i281 i281Var = hey0Var.a;
                return new x6v0(i281Var.a, i281Var.c, i281Var.d, i281Var.b, i281Var.e && !hey0Var.b, hey0Var.b);
            case 16:
                return new i700((w6v0) obj);
            case 17:
                return rih1Var;
            case 18:
                return Boolean.valueOf(!((y781) obj).e);
            case 19:
                return ((y781) obj).b;
            case 20:
                return obj;
            case 21:
                String str3 = ((cp11) obj).a;
                return new c2w(10, str3, str3);
            case 22:
                return new ka11(((cp11) obj).a);
            case 23:
                return new kl41(((cp11) obj).a);
            case 24:
                return rih1Var;
            case 25:
                return "public-toplist";
            case 26:
                Integer numC0 = nhc1.c0((String) obj);
                return new huz(Boolean.valueOf(((numC0 != null ? numC0.intValue() : 0) & 1) != 0), (byte) 10);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ba81 ba81Var = (ba81) obj;
                return new fa81(ba81Var.b, ba81Var.c, ba81Var.h, ba81Var.d, ba81Var.e, ba81Var.i);
            case 28:
                return "campfire-show-suggestions";
            default:
                return new huz(Boolean.valueOf(((String) obj).equals("1")), (byte) 10);
        }
    }
}
