package p;

import android.os.Bundle;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c37 extends hab0 implements vu30 {
    public static final c37 N0;
    public static final c37 O0;
    public static final c37 P0;
    public static final c37 Q0;
    public static final c37 R0;
    public static final c37 S0;
    public static final c37 T0;
    public static final c37 U0;
    public static final c37 V0;
    public static final c37 W0;
    public static final c37 X;
    public static final c37 X0;
    public static final c37 Y;
    public static final c37 Y0;
    public static final c37 Z;
    public static final c37 Z0;
    public static final c37 a1;
    public static final c37 b;
    public static final c37 b1;
    public static final c37 c;
    public static final c37 c1;
    public static final c37 d;
    public static final c37 d1;
    public static final c37 e;
    public static final c37 e1;
    public static final c37 f;
    public static final c37 g;
    public static final c37 h;
    public static final c37 i;
    public static final c37 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new c37(i2, (byte) 0);
        c = new c37(i2, (byte) 1);
        d = new c37(i2, (byte) 2);
        e = new c37(i2, (byte) 3);
        f = new c37(i2, (byte) 4);
        g = new c37(i2, (byte) 5);
        h = new c37(i2, (byte) 6);
        i = new c37(i2, (byte) 7);
        t = new c37(i2, (byte) 8);
        X = new c37(i2, (byte) 9);
        Y = new c37(i2, (byte) 10);
        Z = new c37(i2, (byte) 11);
        N0 = new c37(i2, (byte) 12);
        O0 = new c37(i2, (byte) 13);
        P0 = new c37(i2, (byte) 14);
        Q0 = new c37(i2, (byte) 15);
        R0 = new c37(i2, (byte) 16);
        S0 = new c37(i2, (byte) 17);
        T0 = new c37(i2, (byte) 18);
        U0 = new c37(i2, (byte) 19);
        V0 = new c37(i2, (byte) 20);
        W0 = new c37(i2, (byte) 21);
        X0 = new c37(i2, (byte) 22);
        Y0 = new c37(i2, (byte) 23);
        Z0 = new c37(i2, (byte) 24);
        a1 = new c37(i2, (byte) 25);
        b1 = new c37(i2, (byte) 26);
        c1 = new c37(i2, (byte) 27);
        d1 = new c37(i2, (byte) 28);
        e1 = new c37(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c37(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        mq70 mq70Var;
        up70 up70VarA;
        boolean z;
        mq70 mq70Var2;
        up70 up70VarA2;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        String str = null;
        switch (b2) {
            case 0:
                t27 t27Var = (t27) obj2;
                return new y27(t27Var.a, t27Var.b);
            case 1:
                return (v27) obj2;
            case 2:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var = (xkk1) obj2;
                String str2 = jo70Var != null ? jo70Var.a : null;
                if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (up70VarA = mq70Var.a(vp70.d)) != null) {
                    str = up70VarA.a.a;
                }
                return new t27(str2, str);
            case 3:
                qla1 qla1Var = (rla1) obj2;
                if (qla1Var instanceof qla1) {
                    return new j3r(qla1Var.a);
                }
                if (qla1Var instanceof pla1) {
                    return new h3r(new d3r(((pla1) qla1Var).a.toString()));
                }
                eg.o();
                return null;
            case 4:
                ((Number) obj2).intValue();
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                return rih1Var;
            case 6:
                return new u7h(u7h.f);
            case 7:
                return new u7h(((afx) obj).a.b.a());
            case 8:
                bo7 bo7Var = (bo7) obj;
                co7 co7Var = (co7) obj2;
                boolean z2 = bo7Var.b;
                String str3 = co7Var.a;
                String str4 = bo7Var.a;
                boolean zEquals = str3.equals(str4);
                if (zEquals) {
                    z = co7Var.d;
                } else {
                    z = !z2;
                }
                co7 co7VarA = co7.a(co7Var, str4, (String) null, (String) null, z, !zEquals ? z2 : co7Var.e, bo7Var.c, 6);
                return (zEquals || str4.length() <= 0) ? Next.h(co7VarA) : Next.i(co7VarA, Collections.singleton(new sbw(str4)));
            case 9:
                bo7 bo7Var2 = (bo7) obj;
                String str5 = bo7Var2.a;
                boolean z3 = bo7Var2.b;
                co7 co7VarA2 = co7.a((co7) obj2, str5, (String) null, (String) null, !z3, z3, bo7Var2.c, 6);
                return str5.length() > 0 ? First.c(co7VarA2, Collections.singleton(new sbw(str5))) : First.b(co7VarA2);
            case 10:
                return (dob1) obj2;
            case 11:
                return First.c((qq7) obj2, Collections.singleton(new gq7((vp7) obj)));
            case 12:
                jo70 jo70Var2 = (jo70) obj;
                xkk1 xkk1Var2 = (xkk1) obj2;
                if (xkk1Var2 == null) {
                    xkk1Var2 = new xkk1((mq70) null, (mq70) null, (mq70) null, 63);
                }
                return new hq7(jo70Var2, xkk1Var2);
            case 13:
                return Next.h((pr7) obj2);
            case 14:
                pr7 pr7Var = (pr7) obj2;
                xj61 xj61Var = new xj61();
                nr7 nr7Var = pr7Var.h;
                String str6 = pr7Var.b;
                String str7 = pr7Var.a;
                if (nr7Var instanceof mr7) {
                    xj61Var.add(new gbw(str7, str6));
                }
                if (pr7Var.g.b.d) {
                    xj61Var.add(new vgw(str7, str6));
                }
                return First.c(pr7Var, cwl1.j(xj61Var));
            case 15:
                sr7 sr7Var = (sr7) obj;
                ks7 ks7Var = (ks7) obj2;
                return sr7Var.equals(new sr7(ks7Var.b, ks7Var.a)) ? Next.j() : Next.i(new ks7(sr7Var.a, sr7Var.b, hs7.a), Collections.singleton(new as7(sr7Var)));
            case 16:
                return First.c((ks7) obj2, Collections.singleton(new as7((sr7) obj)));
            case 17:
                return Next.h((lt7) obj2);
            case 18:
                bw7 bw7Var = (bw7) jhc1.t((Bundle) obj, "AudioLanguagePageElementStateKey", bw7.class);
                return bw7Var == null ? new bw7() : bw7Var;
            case 19:
                return new u7h(u7h.j);
            case 20:
                x78 x78Var = (x78) obj;
                return new y78(x78Var.a, x78Var.b, x78Var.c, x78Var.d, x78Var.e, x78Var.f, x78Var.g, x78Var.h, x78Var.i, x78Var.j, x78Var.k, x78Var.l, ((l910) obj2).a, x78Var.n);
            case 21:
                return (o88) obj;
            case 22:
                return zso1.c0(((her0) obj).b, (op80) obj2);
            case 23:
                return null;
            case 24:
                return zso1.c0(((jer0) obj).c, (op80) obj2);
            case 25:
                return new xb8((vb8) obj, ((y810) obj2).a);
            case 26:
                i1r i1rVar = (k1r) obj2;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                xkk1 xkk1Var3 = i1rVar2 != null ? (xkk1) i1rVar2.a : null;
                if (xkk1Var3 != null && (mq70Var2 = xkk1Var3.a) != null && (up70VarA2 = mq70Var2.a(vp70.b)) != null) {
                    str = up70VarA2.a.a;
                }
                return new yb8(str);
            case 27:
                return zso1.c0(((ker0) obj).c, (op80) obj2);
            case 28:
                return zso1.c0(((ler0) obj).b, (op80) obj2);
            default:
                return null;
        }
    }
}
