package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tj8 extends hab0 implements vu30 {
    public static final tj8 N0;
    public static final tj8 O0;
    public static final tj8 P0;
    public static final tj8 Q0;
    public static final tj8 R0;
    public static final tj8 S0;
    public static final tj8 T0;
    public static final tj8 U0;
    public static final tj8 V0;
    public static final tj8 W0;
    public static final tj8 X;
    public static final tj8 X0;
    public static final tj8 Y;
    public static final tj8 Y0;
    public static final tj8 Z;
    public static final tj8 Z0;
    public static final tj8 a1;
    public static final tj8 b;
    public static final tj8 b1;
    public static final tj8 c;
    public static final tj8 c1;
    public static final tj8 d;
    public static final tj8 d1;
    public static final tj8 e;
    public static final tj8 e1;
    public static final tj8 f;
    public static final tj8 g;
    public static final tj8 h;
    public static final tj8 i;
    public static final tj8 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new tj8(i2, (byte) 0);
        c = new tj8(i2, (byte) 1);
        d = new tj8(i2, (byte) 2);
        e = new tj8(i2, (byte) 3);
        f = new tj8(i2, (byte) 4);
        g = new tj8(i2, (byte) 5);
        h = new tj8(i2, (byte) 6);
        i = new tj8(i2, (byte) 7);
        t = new tj8(i2, (byte) 8);
        X = new tj8(i2, (byte) 9);
        Y = new tj8(i2, (byte) 10);
        Z = new tj8(i2, (byte) 11);
        N0 = new tj8(i2, (byte) 12);
        O0 = new tj8(i2, (byte) 13);
        P0 = new tj8(i2, (byte) 14);
        Q0 = new tj8(i2, (byte) 15);
        R0 = new tj8(i2, (byte) 16);
        S0 = new tj8(i2, (byte) 17);
        T0 = new tj8(i2, (byte) 18);
        U0 = new tj8(i2, (byte) 19);
        V0 = new tj8(i2, (byte) 20);
        W0 = new tj8(i2, (byte) 21);
        X0 = new tj8(i2, (byte) 22);
        Y0 = new tj8(i2, (byte) 23);
        Z0 = new tj8(i2, (byte) 24);
        a1 = new tj8(i2, (byte) 25);
        b1 = new tj8(i2, (byte) 26);
        c1 = new tj8(i2, (byte) 27);
        d1 = new tj8(i2, (byte) 28);
        e1 = new tj8(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tj8(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        mq70 mq70Var;
        List list;
        up70 up70Var;
        mq70 mq70Var2;
        List list2;
        up70 up70Var2;
        mq70 mq70Var3;
        List list3;
        up70 up70Var3;
        int i2;
        int i3;
        int i4;
        String str = null;
        boolean z = false;
        switch (this.a) {
            case 0:
                return new u7h(u7h.f);
            case 1:
                return new u7h(z4p1.g(4282079640L));
            case 2:
                return new u7h(z4p1.g(4278190080L));
            case 3:
                return new u7h(u7h.f);
            case 4:
                jl8 jl8Var = (jl8) ((cl8) obj2).g.getValue();
                return jl8Var instanceof gl8 ? il8.a : jl8Var;
            case 5:
                return zso1.c0(((mer0) obj).b, (op80) obj2);
            case 6:
                pn8 pn8Var = (pn8) obj;
                m910 m910Var = (m910) obj2;
                String str2 = pn8Var.a;
                String str3 = pn8Var.b;
                String str4 = pn8Var.c;
                String str5 = pn8Var.d;
                boolean z2 = m910Var.b;
                return new qn8(str2, str3, str4, str5, !z2, m910Var.a, z2, pn8Var.f, pn8Var.g);
            case 7:
                return (aa9) obj;
            case 8:
                int iIntValue = ((Number) obj).intValue();
                p7t0 p7t0Var = (p7t0) obj2;
                return p7t0Var.e + "_" + p7t0Var.f + "_" + iIntValue;
            case 9:
                int iIntValue2 = ((Number) obj).intValue();
                s2c1 s2c1Var = (s2c1) obj2;
                return s2c1Var.a + "_" + s2c1Var.d + "_" + iIntValue2;
            case 10:
                int iIntValue3 = ((Number) obj).intValue();
                s2c1 s2c1Var2 = (s2c1) obj2;
                return s2c1Var2.a + "_" + s2c1Var2.d + "_" + iIntValue3;
            case 11:
                return new u7h(u7h.j);
            case 12:
                mk9 mk9Var = (mk9) obj2;
                return new nk9(mk9Var.a, mk9Var.b != null);
            case 13:
                vk9 vk9Var = (vk9) obj;
                xk9 xk9Var = (xk9) obj2;
                return new wk9(vk9Var.a, xk9Var.a, xk9Var.b, vk9Var.b, vk9Var.c, vk9Var.d);
            case 14:
                xkk1 xkk1Var = (xkk1) obj2;
                String str6 = ((jo70) obj).a;
                if (xkk1Var != null && (mq70Var = xkk1Var.b) != null && (list = mq70Var.a) != null && (up70Var = (up70) o7h.s0(list)) != null) {
                    str = up70Var.a.a;
                }
                return new xk9(str6, str);
            case 15:
                return (jl9) obj2;
            case 16:
                String str7 = (String) obj;
                pla1 pla1Var = (rla1) obj2;
                if (!(pla1Var instanceof pla1)) {
                    if (pla1Var instanceof qla1) {
                        Object obj3 = ((qla1) pla1Var).a;
                        return ((xq9) obj3).a.size() >= 2 ? new j3r(obj3) : new h3r(new d3r("Fewer than 2 chapters for ".concat(str7)));
                    }
                    eg.o();
                    return null;
                }
                return new h3r(new d3r("Failed to load chapters for " + str7 + ": " + pla1Var.a));
            case 17:
                return (jl9) obj2;
            case 18:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var2 = (xkk1) obj2;
                String str8 = jo70Var.a;
                ho70 ho70Var = (ho70) o7h.s0(jo70Var.d);
                String str9 = ho70Var != null ? ho70Var.a : null;
                if (str9 == null) {
                    str9 = "";
                }
                String str10 = (xkk1Var2 == null || (mq70Var3 = xkk1Var2.a) == null || (list3 = mq70Var3.a) == null || (up70Var3 = (up70) o7h.s0(list3)) == null) ? null : up70Var3.a.a;
                if (xkk1Var2 != null && (mq70Var2 = xkk1Var2.b) != null && (list2 = mq70Var2.a) != null && (up70Var2 = (up70) o7h.s0(list2)) != null) {
                    str = up70Var2.a.a;
                }
                return new dm9(str8, str9, str10, str);
            case 19:
                return new ym9(((Boolean) obj2).booleanValue());
            case 20:
                return l1d.k(((Number) obj).intValue(), ((ao9) obj2).a, "-");
            case 21:
                en9 en9Var = (en9) obj2;
                return new fn9((String) obj, en9Var.a, en9Var.b, en9Var.c);
            case 22:
                return (mn9) obj2;
            case 23:
                jo70 jo70Var2 = (jo70) obj;
                hll hllVar = (hll) obj2;
                if (hllVar == null) {
                    hllVar = new hll(0L, 15);
                }
                return new rn9(jo70Var2, hllVar);
            case 24:
                return (wn9) obj2;
            case 25:
                go9 go9Var = (go9) obj2;
                return p7h.M(new String[]{go9Var.a.name(), String.valueOf(go9Var.b)});
            case 26:
                return new zo9(i3p1.A((lp9) obj2), (f8n) obj);
            case 27:
                jp9 jp9Var = (lp9) obj2;
                if ((jp9Var instanceof jp9) && ((i2 = jp9Var.c) == 2 || i2 == 1)) {
                    z = true;
                }
                return new fp9(z);
            case 28:
                jp9 jp9Var2 = (lp9) obj2;
                if ((jp9Var2 instanceof jp9) && ((i3 = jp9Var2.c) == 2 || i3 == 3 || i3 == 1)) {
                    z = true;
                }
                return new mq9(z);
            default:
                jp9 jp9Var3 = (lp9) obj2;
                if ((jp9Var3 instanceof jp9) && ((i4 = jp9Var3.c) == 2 || i4 == 3 || i4 == 1)) {
                    z = true;
                }
                return new oq9(z);
        }
    }
}
