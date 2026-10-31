package p;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l2i0 extends hab0 implements iu30 {
    public static final l2i0 N0;
    public static final l2i0 O0;
    public static final l2i0 P0;
    public static final l2i0 Q0;
    public static final l2i0 R0;
    public static final l2i0 S0;
    public static final l2i0 T0;
    public static final l2i0 U0;
    public static final l2i0 V0;
    public static final l2i0 W0;
    public static final l2i0 X;
    public static final l2i0 X0;
    public static final l2i0 Y;
    public static final l2i0 Y0;
    public static final l2i0 Z;
    public static final l2i0 Z0;
    public static final l2i0 a1;
    public static final l2i0 b;
    public static final l2i0 b1;
    public static final l2i0 c;
    public static final l2i0 c1;
    public static final l2i0 d;
    public static final l2i0 d1;
    public static final l2i0 e;
    public static final l2i0 e1;
    public static final l2i0 f;
    public static final l2i0 g;
    public static final l2i0 h;
    public static final l2i0 i;
    public static final l2i0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new l2i0(i2, (byte) 0);
        c = new l2i0(i2, (byte) 1);
        d = new l2i0(i2, (byte) 2);
        e = new l2i0(i2, (byte) 3);
        f = new l2i0(i2, (byte) 4);
        g = new l2i0(i2, (byte) 5);
        h = new l2i0(i2, (byte) 6);
        i = new l2i0(i2, (byte) 7);
        t = new l2i0(i2, (byte) 8);
        X = new l2i0(i2, (byte) 9);
        Y = new l2i0(i2, (byte) 10);
        Z = new l2i0(i2, (byte) 11);
        N0 = new l2i0(i2, (byte) 12);
        O0 = new l2i0(i2, (byte) 13);
        P0 = new l2i0(i2, (byte) 14);
        Q0 = new l2i0(i2, (byte) 15);
        R0 = new l2i0(i2, (byte) 16);
        S0 = new l2i0(i2, (byte) 17);
        T0 = new l2i0(i2, (byte) 18);
        U0 = new l2i0(i2, (byte) 19);
        V0 = new l2i0(i2, (byte) 20);
        W0 = new l2i0(i2, (byte) 21);
        X0 = new l2i0(i2, (byte) 22);
        Y0 = new l2i0(i2, (byte) 23);
        Z0 = new l2i0(i2, (byte) 24);
        a1 = new l2i0(i2, (byte) 25);
        b1 = new l2i0(i2, (byte) 26);
        c1 = new l2i0(i2, (byte) 27);
        d1 = new l2i0(i2, (byte) 28);
        e1 = new l2i0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2i0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return ((ho70) obj).a;
            case 1:
                return (String) obj;
            case 2:
                return (k1r) obj;
            case 3:
                return (String) obj;
            case 4:
                return (k1r) obj;
            case 5:
                return (String) obj;
            case 6:
                return (k1r) obj;
            case 7:
                return Boolean.valueOf(obj instanceof jo70);
            case 8:
                return (k1r) obj;
            case 9:
                return Boolean.valueOf(obj instanceof xkk1);
            case 10:
                return (k1r) obj;
            case 11:
                return Boolean.valueOf(obj instanceof mtl);
            case 12:
                return (k1r) obj;
            case 13:
                return Boolean.valueOf(obj instanceof Boolean);
            case 14:
                return (k1r) obj;
            case 15:
                return (String) obj;
            case 16:
                return (k1r) obj;
            case 17:
                u5i0 u5i0Var = (u5i0) obj;
                u5i0Var.getClass();
                return mno1.h(new mmr0[]{new mmr0("mediatrimmer", u5i0.a(u5i0Var, new v5i0(0L, 80), null, null, false, 0, false, null, false, null, 1048574))});
            case 18:
                u5i0 u5i0Var2 = (u5i0) jhc1.t((Bundle) obj, "mediatrimmer", u5i0.class);
                if (u5i0Var2 == null) {
                    return new u5i0(new v5i0(0L, 80), z6x.a, p5i0.a, "", new o5i0(new uvg1(0L, 0L)), 2, 2, false, false, true, false, false, null, 0L, 0L, null, 1044480);
                }
                return u5i0Var2;
            case 19:
                cas casVar = (a7m0) obj;
                casVar.a = ish0.d;
                casVar.d = lxf0.c1;
                casVar.e = lxf0.d1;
                casVar.a(S0, T0);
                return rih1.a;
            case 20:
                return (String) obj;
            case 21:
                return (d7u0) obj;
            case 22:
                return (String) obj;
            case 23:
                return (String) obj;
            case 24:
                return (String) obj;
            case 25:
                return (String) obj;
            case 26:
                return (String) obj;
            case 27:
                return (String) obj;
            case 28:
                return (jo70) obj;
            default:
                String str = (String) obj;
                Set set = s4b1.f;
                String strZ = uic.v("podcast-chapters", str).z();
                return new qvc0(strZ == null ? str : strZ, (c3d0) null, (Set) null, (mqz0) null, 14);
        }
    }
}
