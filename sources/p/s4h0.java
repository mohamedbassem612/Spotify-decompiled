package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s4h0 extends hab0 implements iu30 {
    public static final s4h0 N0;
    public static final s4h0 O0;
    public static final s4h0 P0;
    public static final s4h0 Q0;
    public static final s4h0 R0;
    public static final s4h0 S0;
    public static final s4h0 T0;
    public static final s4h0 U0;
    public static final s4h0 V0;
    public static final s4h0 W0;
    public static final s4h0 X;
    public static final s4h0 X0;
    public static final s4h0 Y;
    public static final s4h0 Y0;
    public static final s4h0 Z;
    public static final s4h0 Z0;
    public static final s4h0 a1;
    public static final s4h0 b;
    public static final s4h0 b1;
    public static final s4h0 c;
    public static final s4h0 c1;
    public static final s4h0 d;
    public static final s4h0 d1;
    public static final s4h0 e;
    public static final s4h0 e1;
    public static final s4h0 f;
    public static final s4h0 g;
    public static final s4h0 h;
    public static final s4h0 i;
    public static final s4h0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new s4h0(i2, (byte) 0);
        c = new s4h0(i2, (byte) 1);
        d = new s4h0(i2, (byte) 2);
        e = new s4h0(i2, (byte) 3);
        f = new s4h0(i2, (byte) 4);
        g = new s4h0(i2, (byte) 5);
        h = new s4h0(i2, (byte) 6);
        i = new s4h0(i2, (byte) 7);
        t = new s4h0(i2, (byte) 8);
        X = new s4h0(i2, (byte) 9);
        Y = new s4h0(i2, (byte) 10);
        Z = new s4h0(i2, (byte) 11);
        N0 = new s4h0(i2, (byte) 12);
        O0 = new s4h0(i2, (byte) 13);
        P0 = new s4h0(i2, (byte) 14);
        Q0 = new s4h0(i2, (byte) 15);
        R0 = new s4h0(i2, (byte) 16);
        S0 = new s4h0(i2, (byte) 17);
        T0 = new s4h0(i2, (byte) 18);
        U0 = new s4h0(i2, (byte) 19);
        V0 = new s4h0(i2, (byte) 20);
        W0 = new s4h0(i2, (byte) 21);
        X0 = new s4h0(i2, (byte) 22);
        Y0 = new s4h0(i2, (byte) 23);
        Z0 = new s4h0(i2, (byte) 24);
        a1 = new s4h0(i2, (byte) 25);
        b1 = new s4h0(i2, (byte) 26);
        c1 = new s4h0(i2, (byte) 27);
        d1 = new s4h0(i2, (byte) 28);
        e1 = new s4h0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s4h0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        int i2 = 1;
        w7x w7xVar = w7x.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                u5h0 u5h0Var = (u5h0) obj;
                String str = u5h0Var.d;
                int iC = l1d.C(u5h0Var.e);
                if (iC != 0) {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    i2 = 2;
                }
                return new rpd1(str, u5h0Var.b, i2, u5h0Var.c);
            case 1:
                w5h0 w5h0Var = (w5h0) obj;
                c380 c380Var = w5h0Var.d;
                String str2 = w5h0Var.e;
                String str3 = w5h0Var.f;
                String str4 = w5h0Var.g;
                String str5 = w5h0Var.h;
                String str6 = w5h0Var.c;
                String str7 = w5h0Var.b;
                zs2 zs2Var = w5h0Var.i;
                return new hth1(c380Var, str2, str3, str4, str5, zs2Var != null ? new ith1(zs2Var.a, zs2Var.b) : null, str6, str7);
            case 2:
                return w7xVar;
            case 3:
                if (obj == null) {
                    return rih1Var;
                }
                bhn0.d();
                return null;
            case 4:
                if (obj == null) {
                    return w7xVar;
                }
                bhn0.d();
                return null;
            case 5:
                return w7xVar;
            case 6:
                return w7xVar;
            case 7:
                ((Number) obj).intValue();
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-about-the-song-page";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA = x6h1VarI.a();
                Collections.singletonList("martini/chat");
                r6h1 r6h1Var = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA), (u8h1) null);
            case 8:
                ((Number) obj).intValue();
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-martini-page";
                x6h1VarI2.f = "5.0.2";
                x6h1VarI2.g = "22.0.0";
                y6h1 y6h1VarA2 = x6h1VarI2.a();
                Collections.singletonList("martini/chat");
                r6h1 r6h1Var2 = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA2), (u8h1) null);
            case 9:
                return Integer.valueOf(-((Number) obj).intValue());
            case 10:
                return Integer.valueOf(-((Number) obj).intValue());
            case 11:
                return Integer.valueOf(((Number) obj).intValue());
            case 12:
                return Integer.valueOf(((Number) obj).intValue());
            case 13:
                return rih1Var;
            case 14:
                return (String) obj;
            case 15:
                return (jo70) obj;
            case 16:
                return Boolean.valueOf(obj instanceof jo70);
            case 17:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 18:
                return Boolean.valueOf(obj instanceof xkk1);
            case 19:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 20:
                return (String) obj;
            case 21:
                return (xkk1) obj;
            case 22:
                return rih1Var;
            case 23:
                ((kd31) obj).b(0.55f);
                return rih1Var;
            case 24:
                neg negVar = (neg) obj;
                negVar.a("matched", gpb.b, true);
                chc1 chc1Var = chc1.a;
                negVar.a("deep_link", m5n1.z(chc1Var).getDescriptor(), true);
                negVar.a("match_method", m5n1.z(chc1Var).getDescriptor(), true);
                negVar.a("match_confidence", dru.b, true);
                negVar.a("click_id", m5n1.z(chc1Var).getDescriptor(), true);
                negVar.a("match_id", m5n1.z(chc1Var).getDescriptor(), true);
                return rih1Var;
            case 25:
                return rih1Var;
            case 26:
                return rih1Var;
            case 27:
                return new gbh0(null);
            case 28:
                return rih1Var;
            default:
                return rih1Var;
        }
    }
}
