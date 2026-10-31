package p;

import android.os.Bundle;
import android.view.WindowInsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dvf0 extends hab0 implements iu30 {
    public static final dvf0 N0;
    public static final dvf0 O0;
    public static final dvf0 P0;
    public static final dvf0 Q0;
    public static final dvf0 R0;
    public static final dvf0 S0;
    public static final dvf0 T0;
    public static final dvf0 U0;
    public static final dvf0 V0;
    public static final dvf0 W0;
    public static final dvf0 X;
    public static final dvf0 X0;
    public static final dvf0 Y;
    public static final dvf0 Y0;
    public static final dvf0 Z;
    public static final dvf0 Z0;
    public static final dvf0 a1;
    public static final dvf0 b;
    public static final dvf0 b1;
    public static final dvf0 c;
    public static final dvf0 c1;
    public static final dvf0 d;
    public static final dvf0 d1;
    public static final dvf0 e;
    public static final dvf0 e1;
    public static final dvf0 f;
    public static final dvf0 g;
    public static final dvf0 h;
    public static final dvf0 i;
    public static final dvf0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new dvf0(i2, (byte) 0);
        c = new dvf0(i2, (byte) 1);
        d = new dvf0(i2, (byte) 2);
        e = new dvf0(i2, (byte) 3);
        f = new dvf0(i2, (byte) 4);
        g = new dvf0(i2, (byte) 5);
        h = new dvf0(i2, (byte) 6);
        i = new dvf0(i2, (byte) 7);
        t = new dvf0(i2, (byte) 8);
        X = new dvf0(i2, (byte) 9);
        Y = new dvf0(i2, (byte) 10);
        Z = new dvf0(i2, (byte) 11);
        N0 = new dvf0(i2, (byte) 12);
        O0 = new dvf0(i2, (byte) 13);
        P0 = new dvf0(i2, (byte) 14);
        Q0 = new dvf0(i2, (byte) 15);
        R0 = new dvf0(i2, (byte) 16);
        S0 = new dvf0(i2, (byte) 17);
        T0 = new dvf0(i2, (byte) 18);
        U0 = new dvf0(i2, (byte) 19);
        V0 = new dvf0(i2, (byte) 20);
        W0 = new dvf0(i2, (byte) 21);
        X0 = new dvf0(i2, (byte) 22);
        Y0 = new dvf0(i2, (byte) 23);
        Z0 = new dvf0(i2, (byte) 24);
        a1 = new dvf0(i2, (byte) 25);
        b1 = new dvf0(i2, (byte) 26);
        c1 = new dvf0(i2, (byte) 27);
        d1 = new dvf0(i2, (byte) 28);
        e1 = new dvf0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dvf0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        u0g0 u0g0Var = u0g0.b;
        u0g0 u0g0Var2 = t0g0.b;
        u0g0 u0g0Var3 = s0g0.b;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return rih1Var;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putParcelable("magic_link_already_authenticated_model", (tvf0) obj);
                return bundle;
            case 2:
                return rih1Var;
            case 3:
                return poo1.r(0, 14);
            case 4:
                return poo1.r(0, 14);
            case 5:
                return ((rzf0) obj).b();
            case 6:
                return poo1.r(0, 14);
            case 7:
                return ((rzf0) obj).c();
            case 8:
                return new w6p0((v6p0) obj);
            case 9:
                return ((rzf0) obj).d();
            case 10:
                return (WindowInsets) obj;
            case 11:
                return Integer.valueOf(((Number) obj).intValue() / 4);
            case 12:
                v0g0.a.getClass();
                r0g0 r0g0Var = r0g0.a;
                if (obj.equals("default")) {
                    u0g0Var = u0g0Var3;
                } else if (obj.equals("empty")) {
                    u0g0Var = u0g0Var2;
                }
                return new p0g0(u0g0Var);
            case 13:
                if (obj.equals("default")) {
                    return u0g0Var3;
                }
                return obj.equals("empty") ? u0g0Var2 : u0g0Var;
            case 14:
                return ((m1g0) obj).a;
            case 15:
                return ((rzf0) obj).d();
            case 16:
                return ((m1g0) obj).d;
            case 17:
                return ((rzf0) obj).d();
            case 18:
                dhl dhlVar = (dhl) obj;
                yf.p(dhlVar.e, dhlVar.c.e, 0.0f, 6);
                return rih1Var;
            case 19:
                dhl dhlVar2 = (dhl) obj;
                dhlVar2.g(new e5u((p3v) null, "parent"));
                yf.p(dhlVar2.g, dhlVar2.c.g, 0.0f, 6);
                return rih1Var;
            case 20:
                dhl dhlVar3 = (dhl) obj;
                yf.p(dhlVar3.g, dhlVar3.c.g, 0.0f, 6);
                return rih1Var;
            case 21:
                dhl dhlVar4 = (dhl) obj;
                yf.p(dhlVar4.g, dhlVar4.c.g, 0.0f, 6);
                return rih1Var;
            case 22:
                dhl dhlVar5 = (dhl) obj;
                dhlVar5.g(new e5u((p3v) null, "parent"));
                yf.p(dhlVar5.e, dhlVar5.c.e, 0.0f, 6);
                return rih1Var;
            case 23:
                return ((t1g0) obj).b;
            case 24:
                return ((m1g0) obj).b;
            case 25:
                return ((rzf0) obj).d();
            case 26:
                return ((m1g0) obj).c;
            case 27:
                return poo1.a;
            case 28:
                return ((t1g0) obj).c;
            default:
                return ((t1g0) obj).d;
        }
    }
}
