package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qa8 extends hab0 implements iu30 {
    public static final qa8 N0;
    public static final qa8 O0;
    public static final qa8 P0;
    public static final qa8 Q0;
    public static final qa8 R0;
    public static final qa8 S0;
    public static final qa8 T0;
    public static final qa8 U0;
    public static final qa8 V0;
    public static final qa8 W0;
    public static final qa8 X;
    public static final qa8 X0;
    public static final qa8 Y;
    public static final qa8 Y0;
    public static final qa8 Z;
    public static final qa8 Z0;
    public static final qa8 a1;
    public static final qa8 b;
    public static final qa8 b1;
    public static final qa8 c;
    public static final qa8 c1;
    public static final qa8 d;
    public static final qa8 d1;
    public static final qa8 e;
    public static final qa8 e1;
    public static final qa8 f;
    public static final qa8 g;
    public static final qa8 h;
    public static final qa8 i;
    public static final qa8 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new qa8(i2, (byte) 0);
        c = new qa8(i2, (byte) 1);
        d = new qa8(i2, (byte) 2);
        e = new qa8(i2, (byte) 3);
        f = new qa8(i2, (byte) 4);
        g = new qa8(i2, (byte) 5);
        h = new qa8(i2, (byte) 6);
        i = new qa8(i2, (byte) 7);
        t = new qa8(i2, (byte) 8);
        X = new qa8(i2, (byte) 9);
        Y = new qa8(i2, (byte) 10);
        Z = new qa8(i2, (byte) 11);
        N0 = new qa8(i2, (byte) 12);
        O0 = new qa8(i2, (byte) 13);
        P0 = new qa8(i2, (byte) 14);
        Q0 = new qa8(i2, (byte) 15);
        R0 = new qa8(i2, (byte) 16);
        S0 = new qa8(i2, (byte) 17);
        T0 = new qa8(i2, (byte) 18);
        U0 = new qa8(i2, (byte) 19);
        V0 = new qa8(i2, (byte) 20);
        W0 = new qa8(i2, (byte) 21);
        X0 = new qa8(i2, (byte) 22);
        Y0 = new qa8(i2, (byte) 23);
        Z0 = new qa8(i2, (byte) 24);
        a1 = new qa8(i2, (byte) 25);
        b1 = new qa8(i2, (byte) 26);
        c1 = new qa8(i2, (byte) 27);
        d1 = new qa8(i2, (byte) 28);
        e1 = new qa8(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qa8(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Collections.singleton(((her0) obj).a);
            case 1:
                uv11 uv11Var = (uv11) obj;
                return new uho(uv11Var.a, uv11Var.b, (tho) null, (nho) null, (String) null, (Function0) null, 124);
            case 2:
                return new duu(((uv11) obj).a);
            case 3:
                uv11 uv11Var2 = (uv11) obj;
                String str = uv11Var2.a;
                String str2 = uv11Var2.d;
                str2.getClass();
                return new o0q0(uv11Var2.b, str, 24, str2);
            case 4:
                return new n0q0(((uv11) obj).a);
            case 5:
                uv11 uv11Var3 = (uv11) obj;
                return new s371(uv11Var3.a, uv11Var3.b, "audiobook-row-quick-action", true);
            case 6:
                return (yt11) obj;
            case 7:
                return ((uv11) obj).a;
            case 8:
                return ((uv11) obj).a;
            case 9:
                return ((uv11) obj).a;
            case 10:
                return ((uv11) obj).a;
            case 11:
                return ((uv11) obj).a;
            case 12:
                return ((uv11) obj).a;
            case 13:
                return ((uv11) obj).a;
            case 14:
                return ((uv11) obj).a;
            case 15:
                return new rxc0(((uv11) obj).b);
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (a7q0) obj;
            case 17:
                return Boolean.valueOf((obj instanceof w281) || (obj instanceof rih1));
            case 18:
                if (obj instanceof rih1) {
                    return null;
                }
                return (w281) obj;
            case 19:
                return Boolean.valueOf((obj instanceof l98) || (obj instanceof rih1));
            case 20:
                if (obj instanceof rih1) {
                    return null;
                }
                return (l98) obj;
            case 21:
                return Boolean.valueOf((obj instanceof zc8) || (obj instanceof rih1));
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zc8) obj;
            case 23:
                return Boolean.valueOf((obj instanceof qxc0) || (obj instanceof rih1));
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 25:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 27:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            default:
                return Boolean.valueOf((obj instanceof hll) || (obj instanceof rih1));
        }
    }
}
