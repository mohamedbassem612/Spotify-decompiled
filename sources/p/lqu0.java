package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lqu0 extends hab0 implements iu30 {
    public static final lqu0 N0;
    public static final lqu0 O0;
    public static final lqu0 P0;
    public static final lqu0 Q0;
    public static final lqu0 R0;
    public static final lqu0 S0;
    public static final lqu0 T0;
    public static final lqu0 U0;
    public static final lqu0 V0;
    public static final lqu0 W0;
    public static final lqu0 X;
    public static final lqu0 X0;
    public static final lqu0 Y;
    public static final lqu0 Y0;
    public static final lqu0 Z;
    public static final lqu0 Z0;
    public static final lqu0 a1;
    public static final lqu0 b;
    public static final lqu0 b1;
    public static final lqu0 c;
    public static final lqu0 c1;
    public static final lqu0 d;
    public static final lqu0 d1;
    public static final lqu0 e;
    public static final lqu0 e1;
    public static final lqu0 f;
    public static final lqu0 g;
    public static final lqu0 h;
    public static final lqu0 i;
    public static final lqu0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new lqu0(i2, (byte) 0);
        c = new lqu0(i2, (byte) 1);
        d = new lqu0(i2, (byte) 2);
        e = new lqu0(i2, (byte) 3);
        f = new lqu0(i2, (byte) 4);
        g = new lqu0(i2, (byte) 5);
        h = new lqu0(i2, (byte) 6);
        i = new lqu0(i2, (byte) 7);
        t = new lqu0(i2, (byte) 8);
        X = new lqu0(i2, (byte) 9);
        Y = new lqu0(i2, (byte) 10);
        Z = new lqu0(i2, (byte) 11);
        N0 = new lqu0(i2, (byte) 12);
        O0 = new lqu0(i2, (byte) 13);
        P0 = new lqu0(i2, (byte) 14);
        Q0 = new lqu0(i2, (byte) 15);
        R0 = new lqu0(i2, (byte) 16);
        S0 = new lqu0(i2, (byte) 17);
        T0 = new lqu0(i2, (byte) 18);
        U0 = new lqu0(i2, (byte) 19);
        V0 = new lqu0(i2, (byte) 20);
        W0 = new lqu0(i2, (byte) 21);
        X0 = new lqu0(i2, (byte) 22);
        Y0 = new lqu0(i2, (byte) 23);
        Z0 = new lqu0(i2, (byte) 24);
        a1 = new lqu0(i2, (byte) 25);
        b1 = new lqu0(i2, (byte) 26);
        c1 = new lqu0(i2, (byte) 27);
        d1 = new lqu0(i2, (byte) 28);
        e1 = new lqu0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lqu0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        ben benVar;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 1:
                return ((nqu0) obj).a;
            case 2:
                return ((nqu0) obj).a;
            case 3:
                return ((nqu0) obj).a;
            case 4:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 6:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 8:
                return Boolean.valueOf(obj instanceof jo70);
            case 9:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 10:
                return ((yif1) obj).a;
            case 11:
                asu0 asu0Var = (asu0) obj;
                return new usu0(asu0Var.c, asu0Var.d, asu0Var.e, asu0Var.f);
            case 12:
                fsu0 fsu0Var = (fsu0) obj;
                bsu0 bsu0Var = fsu0Var.a;
                String str = bsu0Var.b;
                CharSequence charSequence = bsu0Var.c;
                String str2 = bsu0Var.d;
                boolean z2 = fsu0Var.b;
                boolean z3 = fsu0Var.c;
                List list = bsu0Var.g;
                boolean z4 = fsu0Var.d;
                o940 o940Var = bsu0Var.j;
                return new xsu0(str, charSequence, str2, z2, z3, list, z4, (o940Var != null ? o940Var.b : null) == k940.b);
            case 13:
                zru0 zru0Var = (zru0) obj;
                return new usu0(zru0Var.b, zru0Var.c, zru0Var.d, zru0Var.e);
            case 14:
                return new tru0((tsu0) obj);
            case 15:
                return new sru0((tsu0) obj);
            case 16:
                return new fsu0((bsu0) obj, false, false, false);
            case 17:
                return rih1Var;
            case 18:
                return new esu0(((csu0) obj).e);
            case 19:
                return ((csu0) obj).a;
            case 20:
                return ((csu0) obj).a;
            case 21:
                if (!(obj instanceof u061) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (u061) obj;
            case 23:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 25:
                ((qtr) obj).b(new eri0(5, (lnm) null, (byte) 8));
                return rih1Var;
            case 26:
                return new rxc0(((dvu0) obj).a.getPlaylistUri());
            case 27:
                qxc0 qxc0Var = (qxc0) obj;
                return new zvz0(qxc0Var != null ? qxc0Var.a : null, (qxc0Var == null || (benVar = qxc0Var.b) == null) ? null : benVar.a, null, null);
            case 28:
                return ((s1g1) obj).b;
            default:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zei1) obj;
        }
    }
}
