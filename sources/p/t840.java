package p;

import android.os.Debug;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t840 extends hab0 implements iu30 {
    public static final t840 N0;
    public static final t840 O0;
    public static final t840 P0;
    public static final t840 Q0;
    public static final t840 R0;
    public static final t840 S0;
    public static final t840 T0;
    public static final t840 U0;
    public static final t840 V0;
    public static final t840 W0;
    public static final t840 X;
    public static final t840 X0;
    public static final t840 Y;
    public static final t840 Y0;
    public static final t840 Z;
    public static final t840 Z0;
    public static final t840 a1;
    public static final t840 b;
    public static final t840 b1;
    public static final t840 c;
    public static final t840 c1;
    public static final t840 d;
    public static final t840 d1;
    public static final t840 e;
    public static final t840 e1;
    public static final t840 f;
    public static final t840 g;
    public static final t840 h;
    public static final t840 i;
    public static final t840 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new t840(i2, (byte) 0);
        c = new t840(i2, (byte) 1);
        d = new t840(i2, (byte) 2);
        e = new t840(i2, (byte) 3);
        f = new t840(i2, (byte) 4);
        g = new t840(i2, (byte) 5);
        h = new t840(i2, (byte) 6);
        i = new t840(i2, (byte) 7);
        t = new t840(i2, (byte) 8);
        X = new t840(i2, (byte) 9);
        Y = new t840(i2, (byte) 10);
        Z = new t840(i2, (byte) 11);
        N0 = new t840(i2, (byte) 12);
        O0 = new t840(i2, (byte) 13);
        P0 = new t840(i2, (byte) 14);
        Q0 = new t840(i2, (byte) 15);
        R0 = new t840(i2, (byte) 16);
        S0 = new t840(i2, (byte) 17);
        T0 = new t840(i2, (byte) 18);
        U0 = new t840(i2, (byte) 19);
        V0 = new t840(i2, (byte) 20);
        W0 = new t840(i2, (byte) 21);
        X0 = new t840(i2, (byte) 22);
        Y0 = new t840(i2, (byte) 23);
        Z0 = new t840(i2, (byte) 24);
        a1 = new t840(i2, (byte) 25);
        b1 = new t840(i2, (byte) 26);
        c1 = new t840(i2, (byte) 27);
        d1 = new t840(i2, (byte) 28);
        e1 = new t840(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t840(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return (k1r) obj;
            case 1:
                return Boolean.valueOf(obj instanceof sdy);
            case 2:
                return Boolean.valueOf(obj instanceof l1z);
            case 3:
                return (k1r) obj;
            case 4:
                return Boolean.valueOf(obj instanceof w281);
            case 5:
                return (k1r) obj;
            case 6:
                return Boolean.valueOf(obj instanceof sdy);
            case 7:
                return (k1r) obj;
            case 8:
                return Boolean.valueOf(obj instanceof Boolean);
            case 9:
                return (k1r) obj;
            case 10:
                return Boolean.valueOf(obj instanceof Boolean);
            case 11:
                return (k1r) obj;
            case 12:
                return Boolean.valueOf(obj instanceof qxc0);
            case 13:
                return (k1r) obj;
            case 14:
                return (k1r) obj;
            case 15:
                return Boolean.valueOf(obj instanceof jo70);
            case 16:
                return (k1r) obj;
            case 17:
                return Boolean.valueOf(obj instanceof hzy);
            case 18:
                return (k1r) obj;
            case 19:
                return Boolean.valueOf(obj instanceof xkk1);
            case 20:
                return (k1r) obj;
            case 21:
                return Boolean.valueOf(obj instanceof String);
            case 22:
                return Debug.getRuntimeStat((String) obj);
            case 23:
                return rih1Var;
            case 24:
                return rih1Var;
            case 25:
                b261.c((e261) obj);
                return rih1Var;
            case 26:
                return new b4z(((yd60) obj).a);
            case 27:
                return new rxc0(((b4z) obj).a);
            case 28:
                i1r i1rVar = (k1r) obj;
                boolean zJ = false;
                if (!(i1rVar instanceof h1r)) {
                    if (i1rVar instanceof i1r) {
                        zJ = u890.j(((qxc0) i1rVar.a).X.get("is_genpods"), "true");
                    } else if (!i1rVar.equals(j1r.a)) {
                        eg.o();
                        return null;
                    }
                }
                return Boolean.valueOf(zJ);
            default:
                return Boolean.valueOf(obj instanceof qxc0);
        }
    }
}
