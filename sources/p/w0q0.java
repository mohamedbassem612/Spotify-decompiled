package p;

import android.os.Bundle;
import com.spotify.mobius.Next;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w0q0 extends hab0 implements vu30 {
    public static final w0q0 N0;
    public static final w0q0 O0;
    public static final w0q0 P0;
    public static final w0q0 Q0;
    public static final w0q0 R0;
    public static final w0q0 S0;
    public static final w0q0 T0;
    public static final w0q0 U0;
    public static final w0q0 V0;
    public static final w0q0 W0;
    public static final w0q0 X;
    public static final w0q0 X0;
    public static final w0q0 Y;
    public static final w0q0 Y0;
    public static final w0q0 Z;
    public static final w0q0 Z0;
    public static final w0q0 a1;
    public static final w0q0 b;
    public static final w0q0 b1;
    public static final w0q0 c;
    public static final w0q0 c1;
    public static final w0q0 d;
    public static final w0q0 d1;
    public static final w0q0 e;
    public static final w0q0 e1;
    public static final w0q0 f;
    public static final w0q0 g;
    public static final w0q0 h;
    public static final w0q0 i;
    public static final w0q0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new w0q0(i2, (byte) 0);
        c = new w0q0(i2, (byte) 1);
        d = new w0q0(i2, (byte) 2);
        e = new w0q0(i2, (byte) 3);
        f = new w0q0(i2, (byte) 4);
        g = new w0q0(i2, (byte) 5);
        h = new w0q0(i2, (byte) 6);
        i = new w0q0(i2, (byte) 7);
        t = new w0q0(i2, (byte) 8);
        X = new w0q0(i2, (byte) 9);
        Y = new w0q0(i2, (byte) 10);
        Z = new w0q0(i2, (byte) 11);
        N0 = new w0q0(i2, (byte) 12);
        O0 = new w0q0(i2, (byte) 13);
        P0 = new w0q0(i2, (byte) 14);
        Q0 = new w0q0(i2, (byte) 15);
        R0 = new w0q0(i2, (byte) 16);
        S0 = new w0q0(i2, (byte) 17);
        T0 = new w0q0(i2, (byte) 18);
        U0 = new w0q0(i2, (byte) 19);
        V0 = new w0q0(i2, (byte) 20);
        W0 = new w0q0(i2, (byte) 21);
        X0 = new w0q0(i2, (byte) 22);
        Y0 = new w0q0(i2, (byte) 23);
        Z0 = new w0q0(i2, (byte) 24);
        a1 = new w0q0(i2, (byte) 25);
        b1 = new w0q0(i2, (byte) 26);
        c1 = new w0q0(i2, (byte) 27);
        d1 = new w0q0(i2, (byte) 28);
        e1 = new w0q0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0q0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        Map map;
        String str;
        Integer numC0;
        String str2;
        String str3;
        mq70 mq70Var;
        up70 up70VarA;
        goj0 goj0VarA;
        goj0 goj0VarA2;
        int i2 = 1;
        int iIntValue = 0;
        e6r e6rVar = null;
        switch (this.a) {
            case 0:
                p0q0 p0q0Var = (p0q0) obj;
                s0q0 s0q0Var = (s0q0) obj2;
                return new q0q0(rc2.y(p0q0Var), s0q0Var.d, s0q0Var.a, s0q0Var.b, s0q0Var.c, p0q0Var.a(), s0q0Var.e, s0q0Var.f, s0q0Var.g);
            case 1:
                u0q0 u0q0Var = (u0q0) obj;
                return new u0q0(u0q0Var.a, u0q0Var.b, u0q0Var.c, (ast0) obj2);
            case 2:
                return new u7h(u7h.f);
            case 3:
                e3q0 e3q0Var = (e3q0) obj2;
                if (e3q0Var instanceof d3q0) {
                    d3q0 d3q0Var = (d3q0) e3q0Var;
                    return new b3q0(true, d3q0Var.a, d3q0Var.b);
                }
                if (e3q0Var.equals(c3q0.a)) {
                    return new b3q0(false, 0, 0);
                }
                eg.o();
                return null;
            case 4:
                b9q0 b9q0Var = (b9q0) obj2;
                return new c9q0((String) obj, b9q0Var.a.a, b9q0Var.b);
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return Next.j();
            case 8:
                z6x z6xVar = (List) obj;
                qxc0 qxc0Var = (qxc0) obj2;
                if (z6xVar == null) {
                    z6xVar = z6x.a;
                }
                List<pvc0> list = (Iterable) z6xVar;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (pvc0 pvc0Var : list) {
                    String str4 = pvc0Var.c;
                    Map map2 = pvc0Var.f;
                    rwm rwmVarJ = i1o1.j((String) map2.get("type"));
                    String str5 = (String) map2.get("record_count");
                    arrayList.add(new ifr0(str4, rwmVarJ, str5 != null ? nhc1.c0(str5) : null));
                }
                if (qxc0Var != null && (map = qxc0Var.X) != null && (str = (String) map.get("total_number_of_connections")) != null && (numC0 = nhc1.c0(str)) != null) {
                    iIntValue = numC0.intValue();
                }
                return new z2r0(iIntValue, arrayList);
            case 9:
                return (g5r0) obj2;
            case 10:
                s9l1 s9l1Var = (s9l1) obj;
                s9l1 s9l1Var2 = (s9l1) obj2;
                ArrayList arrayListN0 = o7h.N0(s9l1Var2.b, s9l1Var.b);
                dlr0 dlr0Var = s9l1Var.c;
                String str6 = dlr0Var != null ? dlr0Var.a : null;
                dlr0 dlr0Var2 = s9l1Var2.c;
                return s9l1.a(s9l1Var, arrayListN0, new dlr0(str6, dlr0Var2 != null ? dlr0Var2.b : null), s9l1Var2.g, 953);
            case 11:
                s9l1 s9l1Var3 = (s9l1) obj;
                s9l1 s9l1Var4 = (s9l1) obj2;
                ArrayList arrayListN1 = o7h.N0(s9l1Var3.b, s9l1Var4.b);
                dlr0 dlr0Var3 = s9l1Var4.c;
                String str7 = dlr0Var3 != null ? dlr0Var3.a : null;
                dlr0 dlr0Var4 = s9l1Var3.c;
                return s9l1.a(s9l1Var3, arrayListN1, new dlr0(str7, dlr0Var4 != null ? dlr0Var4.b : null), (wt91) null, 1017);
            case 12:
                return ((der0) obj2).d.e();
            case 13:
                return (zlr0) obj2;
            case 14:
                ioj0 ioj0Var = (ioj0) obj2;
                String str8 = ((amr0) obj).b;
                hoj0 hoj0VarC = ioj0Var.c(tlr0.class, str8);
                hoj0VarC.getClass();
                goj0 goj0VarA3 = hoj0VarC.a();
                goj0VarA3.getClass();
                tlr0 tlr0Var = (tlr0) goj0VarA3.a;
                hoj0 hoj0VarC2 = ioj0Var.c(jo70.class, str8);
                jo70 jo70Var = (hoj0VarC2 == null || (goj0VarA2 = hoj0VarC2.a()) == null) ? null : (jo70) goj0VarA2.a;
                hoj0 hoj0VarC3 = ioj0Var.c(xkk1.class, str8);
                if (hoj0VarC3 != null && (goj0VarA = hoj0VarC3.a()) != null) {
                    e6rVar = (xkk1) goj0VarA.a;
                }
                if (e6rVar == null || (mq70Var = ((xkk1) e6rVar).a) == null || (up70VarA = mq70Var.a(vp70.b)) == null || (str2 = up70VarA.a.a) == null) {
                    str2 = tlr0Var.b;
                }
                String str9 = str2;
                String str10 = tlr0Var.g;
                String str11 = tlr0Var.h;
                if (str11.length() == 0) {
                    str11 = tlr0Var.d;
                }
                String str12 = str11;
                if (jo70Var == null || (str3 = jo70Var.a) == null) {
                    str3 = "";
                }
                return new dmr0(str9, str10, str12, str3, str8, tlr0Var.i.b, tlr0Var.f == 5);
            case 15:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj;
                x340Var.i0(157620536);
                mn20 mn20Var = new mn20(0, 0, 0, 0);
                x340Var.r(false);
                return mn20Var;
            case 16:
                ((Number) obj2).intValue();
                x340 x340Var2 = (b0k) obj;
                x340Var2.i0(6784280);
                mn20 mn20Var2 = new mn20(0, 0, 0, 0);
                x340Var2.r(false);
                return mn20Var2;
            case 17:
                Bundle bundle = (Bundle) obj2;
                return new rhm0("Maya", "", ((bwd1) obj).c + 1, bundle != null ? (e6r) jhc1.t(bundle, "parent_accept_invite_date_of_birth", e6r.class) : null, false);
            case 18:
                return (thm0) obj;
            case 19:
                return (uhm0) obj;
            case 20:
                tyr0 tyr0Var = (tyr0) obj;
                String str13 = tyr0Var.a;
                String str14 = tyr0Var.b;
                String str15 = tyr0Var.c;
                String str16 = tyr0Var.d;
                boolean z = tyr0Var.e;
                boolean z2 = tyr0Var.f;
                boolean z3 = tyr0Var.g;
                int iO = jmo1.o(tyr0Var);
                boolean z4 = tyr0Var.j;
                PlayerState playerState = ((v910) obj2).a;
                String strO = o4p1.o(playerState);
                String str17 = tyr0Var.a;
                if (strO.equals(str17) && playerState.isPaused()) {
                    i2 = 2;
                } else if (!o4p1.o(playerState).equals(str17) || !playerState.isPlaying()) {
                    i2 = 3;
                }
                return new uyr0(iO, i2, str13, str14, str15, str16, z, z2, z3, z4);
            case 21:
                rgs0 rgs0Var = (rgs0) obj;
                ls60 ls60Var = (ms60) obj2;
                if (!ls60Var.equals(is60.a)) {
                    if (!(ls60Var instanceof ls60)) {
                        eg.o();
                        return null;
                    }
                    ArrayList<js60> arrayList2 = ls60Var.b.a;
                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                    for (js60 js60Var : arrayList2) {
                        ps60 ps60Var = js60Var.a;
                        arrayList3.add(new qgs0(ps60Var != null ? new pgs0(ps60Var.a, ps60Var.b, ps60Var.c) : null, js60Var.b, js60Var.e));
                    }
                    if (!arrayList3.isEmpty()) {
                        return new tgs0(rgs0Var.a, arrayList3, rgs0Var.c);
                    }
                }
                return sgs0.a;
            case 22:
                return new u7h(((afx) obj).b.a);
            case 23:
                return new u7h(((afx) obj).d.b);
            case 24:
                mis0 mis0Var = (mis0) obj2;
                return new nis0((lis0) obj, mis0Var.a, mis0Var.b);
            case 25:
                fls0 fls0Var = (fls0) obj;
                els0 els0Var = (els0) obj2;
                boolean z5 = els0Var.b;
                return new gls0(!els0Var.a && z5, els0Var.d && z5, fls0Var);
            case 26:
                return (pms0) obj2;
            case 27:
                return new u7h(((afx) obj).b.d);
            case 28:
                return Boolean.valueOf(u890.j(obj, ((qlc0) obj2).a));
            default:
                return Boolean.valueOf(u890.j(obj, ((qlc0) obj2).a));
        }
    }
}
