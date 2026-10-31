package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cps0 extends hab0 implements vu30 {
    public static final cps0 N0;
    public static final cps0 O0;
    public static final cps0 P0;
    public static final cps0 Q0;
    public static final cps0 R0;
    public static final cps0 S0;
    public static final cps0 T0;
    public static final cps0 U0;
    public static final cps0 V0;
    public static final cps0 W0;
    public static final cps0 X;
    public static final cps0 X0;
    public static final cps0 Y;
    public static final cps0 Y0;
    public static final cps0 Z;
    public static final cps0 Z0;
    public static final cps0 a1;
    public static final cps0 b;
    public static final cps0 b1;
    public static final cps0 c;
    public static final cps0 c1;
    public static final cps0 d;
    public static final cps0 d1;
    public static final cps0 e;
    public static final cps0 e1;
    public static final cps0 f;
    public static final cps0 g;
    public static final cps0 h;
    public static final cps0 i;
    public static final cps0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new cps0(i2, (byte) 0);
        c = new cps0(i2, (byte) 1);
        d = new cps0(i2, (byte) 2);
        e = new cps0(i2, (byte) 3);
        f = new cps0(i2, (byte) 4);
        g = new cps0(i2, (byte) 5);
        h = new cps0(i2, (byte) 6);
        i = new cps0(i2, (byte) 7);
        t = new cps0(i2, (byte) 8);
        X = new cps0(i2, (byte) 9);
        Y = new cps0(i2, (byte) 10);
        Z = new cps0(i2, (byte) 11);
        N0 = new cps0(i2, (byte) 12);
        O0 = new cps0(i2, (byte) 13);
        P0 = new cps0(i2, (byte) 14);
        Q0 = new cps0(i2, (byte) 15);
        R0 = new cps0(i2, (byte) 16);
        S0 = new cps0(i2, (byte) 17);
        T0 = new cps0(i2, (byte) 18);
        U0 = new cps0(i2, (byte) 19);
        V0 = new cps0(i2, (byte) 20);
        W0 = new cps0(i2, (byte) 21);
        X0 = new cps0(i2, (byte) 22);
        Y0 = new cps0(i2, (byte) 23);
        Z0 = new cps0(i2, (byte) 24);
        a1 = new cps0(i2, (byte) 25);
        b1 = new cps0(i2, (byte) 26);
        c1 = new cps0(i2, (byte) 27);
        d1 = new cps0(i2, (byte) 28);
        e1 = new cps0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cps0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(u890.j(obj, obj2));
            case 1:
                return Boolean.valueOf(u890.j(obj, obj2));
            case 2:
                return Boolean.valueOf(u890.j(obj, obj2));
            case 3:
                return Boolean.valueOf(u890.j(obj, obj2));
            case 4:
                return Boolean.valueOf(u890.j(obj, ((qlc0) obj2).a));
            case 5:
                return Boolean.valueOf(u890.j(obj, ((qlc0) obj2).a));
            case 6:
                return Boolean.valueOf(u890.j(((qlc0) obj).a, ((qlc0) obj2).a));
            case 7:
                return Boolean.valueOf(u890.j(((qlc0) obj).a, ((qlc0) obj2).a));
            case 8:
                return Boolean.valueOf(u890.j(((qlc0) obj).a, obj2));
            case 9:
                return Boolean.valueOf(u890.j(((qlc0) obj).a, obj2));
            case 10:
                return Boolean.valueOf(u890.j(((qlc0) obj).a, ((qlc0) obj2).a));
            case 11:
                return Boolean.valueOf(u890.j(((qlc0) obj).a, ((qlc0) obj2).a));
            case 12:
                return Boolean.valueOf(u890.j(((qlc0) obj).a, obj2));
            case 13:
                return Boolean.valueOf(u890.j(((qlc0) obj).a, obj2));
            case 14:
                return Boolean.TRUE;
            case 15:
                return Boolean.TRUE;
            case 16:
                return Boolean.TRUE;
            case 17:
                return Boolean.TRUE;
            case 18:
                return null;
            case 19:
                return Next.h(ouo1.d0((dzs0) obj2, (pys0) obj));
            case 20:
                dzs0 dzs0Var = (dzs0) obj2;
                return dzs0Var.equals(new dzs0()) ? First.b(ouo1.d0(dzs0Var, (pys0) obj)) : First.b(dzs0Var);
            case 21:
                return (q2t0) obj2;
            case 22:
                i3t0 i3t0Var = (i3t0) obj2;
                boolean z = i3t0Var.a;
                boolean z2 = i3t0Var.b;
                return new j3t0(z, !z2, z2);
            case 23:
                return (k8t0) obj;
            case 24:
                return (lbt0) obj;
            case 25:
                return new u7h(u7h.b);
            case 26:
                return new bft0((gwt0) obj2, ((ret0) obj).b);
            case 27:
                vet0 vet0Var = (vet0) obj2;
                return new vet0((qet0) obj, vet0Var.b, vet0Var.c, vet0Var.d);
            case 28:
                bot0 bot0Var = (bot0) obj2;
                art0 art0Var = bot0Var.g;
                return ((art0Var instanceof art0) && (art0Var.a instanceof cbe0)) ? First.c(bot0Var, Collections.singleton(new dht0(bot0Var.a, bot0Var.c))) : First.b(bot0Var);
            default:
                return (lit0) obj2;
        }
    }
}
