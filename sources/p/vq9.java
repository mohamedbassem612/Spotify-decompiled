package p;

import android.os.Bundle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vq9 extends hab0 implements vu30 {
    public static final vq9 N0;
    public static final vq9 O0;
    public static final vq9 P0;
    public static final vq9 Q0;
    public static final vq9 R0;
    public static final vq9 S0;
    public static final vq9 T0;
    public static final vq9 U0;
    public static final vq9 V0;
    public static final vq9 W0;
    public static final vq9 X;
    public static final vq9 X0;
    public static final vq9 Y;
    public static final vq9 Y0;
    public static final vq9 Z;
    public static final vq9 Z0;
    public static final vq9 a1;
    public static final vq9 b;
    public static final vq9 b1;
    public static final vq9 c;
    public static final vq9 c1;
    public static final vq9 d;
    public static final vq9 d1;
    public static final vq9 e;
    public static final vq9 e1;
    public static final vq9 f;
    public static final vq9 g;
    public static final vq9 h;
    public static final vq9 i;
    public static final vq9 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new vq9(i2, (byte) 0);
        c = new vq9(i2, (byte) 1);
        d = new vq9(i2, (byte) 2);
        e = new vq9(i2, (byte) 3);
        f = new vq9(i2, (byte) 4);
        g = new vq9(i2, (byte) 5);
        h = new vq9(i2, (byte) 6);
        i = new vq9(i2, (byte) 7);
        t = new vq9(i2, (byte) 8);
        X = new vq9(i2, (byte) 9);
        Y = new vq9(i2, (byte) 10);
        Z = new vq9(i2, (byte) 11);
        N0 = new vq9(i2, (byte) 12);
        O0 = new vq9(i2, (byte) 13);
        P0 = new vq9(i2, (byte) 14);
        Q0 = new vq9(i2, (byte) 15);
        R0 = new vq9(i2, (byte) 16);
        S0 = new vq9(i2, (byte) 17);
        T0 = new vq9(i2, (byte) 18);
        U0 = new vq9(i2, (byte) 19);
        V0 = new vq9(i2, (byte) 20);
        W0 = new vq9(i2, (byte) 21);
        X0 = new vq9(i2, (byte) 22);
        Y0 = new vq9(i2, (byte) 23);
        Z0 = new vq9(i2, (byte) 24);
        a1 = new vq9(i2, (byte) 25);
        b1 = new vq9(i2, (byte) 26);
        c1 = new vq9(i2, (byte) 27);
        d1 = new vq9(i2, (byte) 28);
        e1 = new vq9(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vq9(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        String str;
        mq70 mq70Var;
        List list;
        up70 up70Var;
        String str2;
        lqa lqaVarN;
        long jA;
        long j;
        boolean z = false;
        String str3 = null;
        str3 = null;
        str3 = null;
        str3 = null;
        switch (this.a) {
            case 0:
                return (tq9) obj2;
            case 1:
                return new bs9(((as9) obj).a, i3p1.A((lp9) obj2));
            case 2:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var = (xkk1) obj2;
                String str4 = jo70Var.a;
                io70 io70Var = jo70Var.e;
                if (io70Var == null || (str = io70Var.a) == null) {
                    ho70 ho70Var = (ho70) o7h.s0(jo70Var.d);
                    str = ho70Var != null ? ho70Var.a : null;
                    if (str == null) {
                        str = "";
                    }
                }
                if (xkk1Var != null && (mq70Var = xkk1Var.b) != null && (list = mq70Var.a) != null && (up70Var = (up70) o7h.s0(list)) != null) {
                    str3 = up70Var.a.a;
                }
                return new ts9(str4, str, str3);
            case 3:
                b0a b0aVar = (b0a) obj2;
                return Next.h(x4p1.j((a0a) obj, b0aVar.b, b0aVar.S0));
            case 4:
                a0a a0aVar = (a0a) obj;
                b0a b0aVarJ = x4p1.j(a0aVar, 0, (wkt) null);
                return First.c(b0aVarJ, b0aVarJ.c.size() > 1 ? Collections.singleton(new fz9(b0aVarJ.b, a0aVar.b)) : w7x.a);
            case 5:
                b3a b3aVar = (b3a) obj;
                return new c3a(b3aVar.a, b3aVar.b, (nji0) obj2);
            case 6:
                u3a u3aVar = (u3a) obj;
                y3a y3aVar = (y3a) obj2;
                String str5 = u3aVar.a;
                String str6 = u3aVar.c;
                String str7 = y3aVar.a;
                Boolean bool = y3aVar.b;
                return new v3a(str6, str5, bool != null ? bool.booleanValue() : false, str7);
            case 7:
                vnb1 vnb1Var = (vnb1) obj;
                jo70 jo70Var2 = (jo70) obj2;
                return new y3a(jo70Var2 != null ? jo70Var2.a : null, vnb1Var != null ? Boolean.valueOf(vnb1Var.b) : null);
            case 8:
                oed0 oed0Var = (oed0) obj;
                ted0 ted0Var = (ted0) obj2;
                if (!(ted0Var instanceof ped0)) {
                    return null;
                }
                ped0 ped0Var = (ped0) ted0Var;
                if (ped0Var.a == null || ped0Var.d == null) {
                    return null;
                }
                Object[] objArr = ped0Var.c ? (char) 2 : (char) 1;
                String str8 = oed0Var.b;
                r6h1 r6h1Var = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-listening-activity-indicator-chat-row";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                if (objArr == 1) {
                    str2 = "played";
                } else {
                    if (objArr != 2) {
                        throw null;
                    }
                    str2 = "playing";
                }
                x6h1VarI.b = str2;
                x6h1VarI.d = str8;
                y6h1 y6h1VarA = x6h1VarI.a();
                List listM = p7h.M(new String[]{"chat/list", "sidedrawer"});
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = r6h1.c;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = listM;
                return k7h1Var.a();
            case 9:
                return n8p1.k((im6) obj, (pch) obj2);
            case 10:
                im6 im6Var = (im6) obj2;
                jm6 parcelable = ((Bundle) obj).getParcelable("artist_selection");
                return parcelable == null ? n8p1.k(im6Var, new pch(j1r.a, mm6.a, true)) : parcelable;
            case 11:
                return new kdn0(Boolean.FALSE);
            case 12:
                return new kdn0(Boolean.FALSE);
            case 13:
                return sqg0.J(new mmr0[]{new mmr0(0, Collections.singleton((String) obj)), new mmr0(1, Collections.singleton((String) obj2))});
            case 14:
                jqa jqaVar = (jqa) obj;
                lqa lqaVar = (nqa) obj2;
                int i2 = jqaVar.a;
                if (lqaVar instanceof mqa) {
                    lqaVarN = mqa.n((mqa) lqaVar, i2, null, 254);
                } else if (lqaVar instanceof kqa) {
                    lqaVarN = kqa.n((kqa) lqaVar, i2, null, 254);
                } else {
                    if (!(lqaVar instanceof lqa)) {
                        eg.o();
                        return null;
                    }
                    lqaVarN = lqa.n(lqaVar, jqaVar.a, (String) null, (wkt) null, (String) null, (String) null, (String) null, 0, (llw0) null, (List) null, (cuu0) null, 32766);
                }
                return Next.h(lqaVarN);
            case 15:
                lqa lqaVar2 = (nqa) obj2;
                if (lqaVar2 instanceof lqa) {
                    return First.c(lqaVar2, r2p1.o(lqaVar2.O0, tpa.a, (on71) null));
                }
                if (lqaVar2 instanceof kqa) {
                    return First.b(oap1.I(lqaVar2));
                }
                if (lqaVar2 instanceof mqa) {
                    return First.b(lqaVar2);
                }
                eg.o();
                return null;
            case 16:
                return new hqa(((Number) obj).intValue(), (w8d1) obj2);
            case 17:
                return (aua) obj;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new mza((jo70) obj, (xkk1) obj2);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new u7h(u7h.j);
            case 20:
                uwr uwrVar = cbx.a;
                return new u7h(((vex) zex.a.e).j);
            case 21:
                return new o1b(((n1b) obj).b, ((o1b) obj2).b);
            case 22:
                ixx ixxVar = ((afx) obj).a.b;
                int iOrdinal = ((vux) obj2).ordinal();
                if (iOrdinal == 0) {
                    jA = ixxVar.a();
                } else if (iOrdinal == 1) {
                    jA = ixxVar.b();
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    jA = ixxVar.c();
                }
                return new u7h(jA);
            case 23:
                return (pgb) obj2;
            case 24:
                icx icxVar = ((afx) obj).a;
                int iOrdinal2 = ((vux) obj2).ordinal();
                if (iOrdinal2 == 0) {
                    j = icxVar.c;
                } else if (iOrdinal2 == 1) {
                    j = icxVar.e;
                } else {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    j = icxVar.d;
                }
                return new u7h(j);
            case 25:
                return new mlb((zc8) obj, (zoy0) obj2);
            case 26:
                return null;
            case 27:
                return null;
            case 28:
                return null;
            default:
                zg01 zg01Var = (zg01) obj;
                String str9 = (String) obj2;
                if (zg01Var != null && zg01Var.a && !yto.j(str9)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
