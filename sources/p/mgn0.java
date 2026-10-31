package p;

import android.os.Bundle;
import android.view.View;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mgn0 extends hab0 implements xu30 {
    public static final mgn0 N0;
    public static final mgn0 O0;
    public static final mgn0 P0;
    public static final mgn0 Q0;
    public static final mgn0 R0;
    public static final mgn0 S0;
    public static final mgn0 T0;
    public static final mgn0 U0;
    public static final mgn0 V0;
    public static final mgn0 W0;
    public static final mgn0 X;
    public static final mgn0 X0;
    public static final mgn0 Y;
    public static final mgn0 Y0;
    public static final mgn0 Z;
    public static final mgn0 Z0;
    public static final mgn0 a1;
    public static final mgn0 b;
    public static final mgn0 b1;
    public static final mgn0 c;
    public static final mgn0 c1;
    public static final mgn0 d;
    public static final mgn0 d1;
    public static final mgn0 e;
    public static final mgn0 e1;
    public static final mgn0 f;
    public static final mgn0 g;
    public static final mgn0 h;
    public static final mgn0 i;
    public static final mgn0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 3;
        b = new mgn0(i2, (byte) 0);
        c = new mgn0(i2, (byte) 1);
        d = new mgn0(i2, (byte) 2);
        e = new mgn0(i2, (byte) 3);
        f = new mgn0(i2, (byte) 4);
        g = new mgn0(i2, (byte) 5);
        h = new mgn0(i2, (byte) 6);
        i = new mgn0(i2, (byte) 7);
        t = new mgn0(i2, (byte) 8);
        X = new mgn0(i2, (byte) 9);
        Y = new mgn0(i2, (byte) 10);
        Z = new mgn0(i2, (byte) 11);
        N0 = new mgn0(i2, (byte) 12);
        O0 = new mgn0(i2, (byte) 13);
        P0 = new mgn0(i2, (byte) 14);
        Q0 = new mgn0(i2, (byte) 15);
        R0 = new mgn0(i2, (byte) 16);
        S0 = new mgn0(i2, (byte) 17);
        T0 = new mgn0(i2, (byte) 18);
        U0 = new mgn0(i2, (byte) 19);
        V0 = new mgn0(i2, (byte) 20);
        W0 = new mgn0(i2, (byte) 21);
        X0 = new mgn0(i2, (byte) 22);
        Y0 = new mgn0(i2, (byte) 23);
        Z0 = new mgn0(i2, (byte) 24);
        a1 = new mgn0(i2, (byte) 25);
        b1 = new mgn0(i2, (byte) 26);
        c1 = new mgn0(i2, (byte) 27);
        d1 = new mgn0(i2, (byte) 28);
        e1 = new mgn0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mgn0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        char c2;
        String str;
        ben benVar;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        tv80 tv80Var = null;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                String str2 = ((lgn0) obj2).a;
                r6h1 r6h1Var = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-chat-mute-sheet";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = str2;
                y6h1 y6h1VarA = x6h1VarI.a();
                jgn0 jgn0Var = ((kgn0) obj3).a;
                int iOrdinal = jgn0Var.ordinal();
                if (iOrdinal == 0) {
                    c2 = 4;
                } else if (iOrdinal == 1) {
                    c2 = 2;
                } else if (iOrdinal == 2) {
                    c2 = 3;
                } else if (iOrdinal == 3) {
                    c2 = 5;
                } else {
                    if (iOrdinal != 4) {
                        eg.o();
                        return null;
                    }
                    c2 = 1;
                }
                Integer numValueOf = Integer.valueOf(jgn0Var.ordinal());
                x6h1 x6h1VarC = y6h1VarA.c();
                if (c2 == 1) {
                    str = "always";
                } else if (c2 == 2) {
                    str = "eight_hours";
                } else if (c2 == 3) {
                    str = "one_day";
                } else if (c2 == 4) {
                    str = "one_hour";
                } else {
                    if (c2 != 5) {
                        throw null;
                    }
                    str = "one_week";
                }
                x6h1VarC.i.add(new a7h1("duration_row", str, numValueOf, (String) null, (String) null));
                x6h1VarC.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
            case 1:
                return rih1Var;
            case 2:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(963866520);
                uwr uwrVar = cbx.a;
                avw0 avw0Var = cbx.b(x340Var).c;
                long j = cbx.a(x340Var).c.g;
                boolean zD = x340Var.d(2.0f) | x340Var.f(j);
                Object objT = x340Var.T();
                if (zD || objT == fkj0.X) {
                    objT = new ps((byte) 16, j);
                    x340Var.s0(objT);
                }
                qim0 qim0VarS = exd0.s(qim0Var, (iu30) objT);
                x340Var.r(false);
                return qim0VarS;
            case 3:
                View view = (View) obj;
                hsl1 hsl1Var = (hsl1) obj2;
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), ((uc80) obj3).d + hsl1Var.a.i(519).d);
                return hsl1Var;
            case 4:
                hsl1 hsl1Var2 = (hsl1) obj2;
                uc80 uc80Var = (uc80) obj3;
                ((View) obj).setPadding(uc80Var.a, uc80Var.b, uc80Var.c, uc80Var.d + hsl1Var2.a.i(519).d);
                return hsl1Var2;
            case 5:
                km61 km61Var = (km61) obj;
                Boolean bool = (Boolean) obj2;
                if (!bool.booleanValue()) {
                    km61.a(km61Var, "offlineAccess", (Bundle) null, false, 6);
                }
                return bool;
            case 6:
                return new u0q0((y4m) obj, (r840) obj2, (r0q0) obj3, ast0.c);
            case 7:
                long j2 = ((hjl) obj3).a;
                return ((ifh0) obj).S(0, 0, b7xVar, rfq0.Z0);
            case 8:
                ((Number) obj3).intValue();
                x340 x340Var2 = (b0k) obj2;
                x340Var2.i0(1511349194);
                cr31 cr31Var = er31.a;
                uwr uwrVar2 = cbx.a;
                qim0 qim0VarF = d1u.F((qim0) obj, 1.5f, new mic0(0, 0L, 9187343241974906880L, p7h.M(new u7h[]{new u7h(cbx.a(x340Var2).b.a), new u7h(cbx.a(x340Var2).b.c)}), (List) null), cr31Var);
                x340Var2.r(false);
                return qim0VarF;
            case 9:
                prs0 prs0Var = (prs0) obj;
                if (((ors0) obj2).equals(ors0.a)) {
                    prs0Var.b.invoke(prs0Var.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 10:
                rrs0 rrs0Var = (rrs0) obj;
                if (((qrs0) obj2).equals(qrs0.a)) {
                    rrs0Var.a.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 11:
                View view2 = (View) obj;
                uc80 uc80Var2 = (uc80) obj3;
                nk80 nk80VarI = ((hsl1) obj2).a.i(519);
                view2.setPadding(view2.getPaddingLeft(), uc80Var2.b + nk80VarI.b, view2.getPaddingRight(), uc80Var2.d + nk80VarI.d);
                return hsl1.b;
            case 12:
                return new pqu0((hll) obj3, (jo70) obj, (xkk1) obj2);
            case 13:
                ((asu0) obj).g.invoke(((tru0) obj2).a, (tqw) obj3);
                return rih1Var;
            case 14:
                ((zru0) obj).f.invoke(((sru0) obj2).a, (tqw) obj3);
                return rih1Var;
            case 15:
                ((puu0) obj).i.invoke((ouu0) obj2);
                return rih1Var;
            case 16:
                qxc0 qxc0Var = (qxc0) obj;
                z1g1 z1g1Var = (z1g1) obj2;
                List list = (List) obj3;
                String str3 = qxc0Var != null ? qxc0Var.a : null;
                if (qxc0Var != null && (benVar = qxc0Var.b) != null) {
                    tv80Var = benVar.a;
                }
                return new zvz0(str3, tv80Var, z1g1Var, list);
            case 17:
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                View view3 = (View) obj;
                hsl1 hsl1Var3 = (hsl1) obj2;
                view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), ((uc80) obj3).d + hsl1Var3.a.i(519).d);
                return hsl1Var3;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new yvg1((jo70) obj, (xkk1) obj2, (zoy0) obj3);
            case 20:
                km61 km61Var2 = (km61) obj;
                if (((Boolean) obj2).booleanValue()) {
                    km61.a(km61Var2, "privateSessionExplainer", (Bundle) null, true, 2);
                }
                return Boolean.TRUE;
            case 21:
                ((Number) obj2).intValue();
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                return rih1Var;
            case 24:
                hsl1 hsl1Var4 = (hsl1) obj2;
                ((View) obj).setPadding(0, 0, 0, hsl1Var4.a.i(519).d);
                return hsl1Var4;
            case 25:
                View view4 = (View) obj;
                hsl1 hsl1Var5 = (hsl1) obj2;
                uc80 uc80Var3 = (uc80) obj3;
                esl1 esl1Var = hsl1Var5.a;
                nk80 nk80VarI2 = esl1Var.i(519);
                int i2 = esl1Var.i(8).d;
                view4.setPadding(view4.getPaddingLeft(), uc80Var3.b + nk80VarI2.b, view4.getPaddingRight(), uc80Var3.d + i2 + (i2 > 0 ? 0 : nk80VarI2.d));
                return hsl1Var5;
            case 26:
                rwx0 rwx0Var = (rwx0) obj;
                if (((qwx0) obj2).equals(qwx0.a)) {
                    rwx0Var.c.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 27:
                ((d4z0) obj).e.invoke();
                return rih1Var;
            case 28:
                return rih1Var;
            default:
                dlz0 dlz0Var = (dlz0) obj;
                blz0 blz0Var = (clz0) obj2;
                tqw tqwVar = (tqw) obj3;
                if (blz0Var instanceof blz0) {
                    dlz0Var.c.invoke(blz0Var.a, tqwVar != null ? n3o1.y(tqwVar) : null);
                } else if (!(blz0Var instanceof alz0)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
        }
    }
}
