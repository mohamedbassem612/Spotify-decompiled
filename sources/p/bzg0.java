package p;

import com.spotify.mobius.Next;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bzg0 extends hab0 implements vu30 {
    public static final bzg0 N0;
    public static final bzg0 O0;
    public static final bzg0 P0;
    public static final bzg0 Q0;
    public static final bzg0 R0;
    public static final bzg0 S0;
    public static final bzg0 T0;
    public static final bzg0 U0;
    public static final bzg0 V0;
    public static final bzg0 W0;
    public static final bzg0 X;
    public static final bzg0 X0;
    public static final bzg0 Y;
    public static final bzg0 Y0;
    public static final bzg0 Z;
    public static final bzg0 Z0;
    public static final bzg0 a1;
    public static final bzg0 b;
    public static final bzg0 b1;
    public static final bzg0 c;
    public static final bzg0 c1;
    public static final bzg0 d;
    public static final bzg0 d1;
    public static final bzg0 e;
    public static final bzg0 e1;
    public static final bzg0 f;
    public static final bzg0 g;
    public static final bzg0 h;
    public static final bzg0 i;
    public static final bzg0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new bzg0(i2, (byte) 0);
        c = new bzg0(i2, (byte) 1);
        d = new bzg0(i2, (byte) 2);
        e = new bzg0(i2, (byte) 3);
        f = new bzg0(i2, (byte) 4);
        g = new bzg0(i2, (byte) 5);
        h = new bzg0(i2, (byte) 6);
        i = new bzg0(i2, (byte) 7);
        t = new bzg0(i2, (byte) 8);
        X = new bzg0(i2, (byte) 9);
        Y = new bzg0(i2, (byte) 10);
        Z = new bzg0(i2, (byte) 11);
        N0 = new bzg0(i2, (byte) 12);
        O0 = new bzg0(i2, (byte) 13);
        P0 = new bzg0(i2, (byte) 14);
        Q0 = new bzg0(i2, (byte) 15);
        R0 = new bzg0(i2, (byte) 16);
        S0 = new bzg0(i2, (byte) 17);
        T0 = new bzg0(i2, (byte) 18);
        U0 = new bzg0(i2, (byte) 19);
        V0 = new bzg0(i2, (byte) 20);
        W0 = new bzg0(i2, (byte) 21);
        X0 = new bzg0(i2, (byte) 22);
        Y0 = new bzg0(i2, (byte) 23);
        Z0 = new bzg0(i2, (byte) 24);
        a1 = new bzg0(i2, (byte) 25);
        b1 = new bzg0(i2, (byte) 26);
        c1 = new bzg0(i2, (byte) 27);
        d1 = new bzg0(i2, (byte) 28);
        e1 = new bzg0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bzg0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        String str;
        io70 io70Var;
        List list;
        ho70 ho70Var;
        String str2 = null;
        switch (this.a) {
            case 0:
                vyg0 vyg0Var = (vyg0) obj2;
                String str3 = vyg0Var.a;
                i1r i1rVar = vyg0Var.c;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                jo70 jo70Var = i1rVar2 != null ? (jo70) i1rVar2.a : null;
                if (jo70Var == null || (list = jo70Var.d) == null || (ho70Var = (ho70) o7h.s0(list)) == null || (str = ho70Var.a) == null) {
                    str = (jo70Var == null || (io70Var = jo70Var.e) == null) ? null : io70Var.a;
                }
                if (str != null && !ihc1.y0(str)) {
                    str2 = str;
                }
                String str4 = str2;
                o3r o3rVar = ezg0.S0;
                Set set = s4b1.f;
                int iOrdinal = uic.x(str3).c.ordinal();
                return new uyg0(str3, str4, (iOrdinal == 844 || iOrdinal == 860) && !vyg0Var.b, vyg0Var.b, vyg0Var.d);
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                if (obj != null) {
                    throw new ClassCastException();
                }
                throw null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                return null;
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                return null;
            case 12:
                return null;
            case 13:
                return null;
            case 14:
                return null;
            case 15:
                return null;
            case 16:
                if (obj != null) {
                    throw new ClassCastException();
                }
                throw null;
            case 17:
                return ((l5h0) obj).b;
            case 18:
                return null;
            case 19:
                return new u7h(((afx) obj).a.b.a());
            case 20:
                return new u7h(((afx) obj).a.b.a());
            case 21:
                return new ibh0();
            case 22:
                return Next.j();
            case 23:
                pmh0 pmh0Var = (pmh0) obj;
                exh1 exh1Var = (exh1) obj2;
                return new smh0(pmh0Var.d, pmh0Var.c.c, exh1Var.c, pmh0Var.e.b, exh1Var.a, exh1Var.b);
            case 24:
                return ((lxh0) obj).e((String) obj2);
            case 25:
                return ((lxh0) obj).o((String) obj2);
            case 26:
                return ((lxh0) obj).k((String) obj2);
            case 27:
                return ((lxh0) obj).c((String) obj2);
            case 28:
                return ((lxh0) obj).p((String) obj2);
            default:
                return Next.j();
        }
    }
}
