package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kk11 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk11() {
        super(3);
        this.a = (byte) 8;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if5 if5VarO;
        int i;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                kw7.d(4.0f, 0, (b0k) obj2, u291.h(u291.f(nim0Var, 1.0f), 14.0f));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                mbh mbhVarA = jbh.a(new d36(10.0f, true, new um5(false)), een.P0, x340Var, 0);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, nim0Var);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(hmb0.t1);
                } else {
                    x340Var3.v0();
                }
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                kw7.d(4.0f, 0, x340Var, u291.h(u291.f(nim0Var, 1.0f), 16.0f));
                kw7.d(4.0f, 0, x340Var, u291.h(u291.f(nim0Var, 1.0f), 16.0f));
                x340Var3.r(true);
                return rih1Var;
            case 2:
                r6h1 r6h1Var = (r6h1) obj3;
                hgb1 hgb1VarA = ((jp61) obj).c.a();
                if (!(hgb1VarA instanceof fgb1)) {
                    if (hgb1VarA instanceof egb1) {
                        p8h1 p8h1Var = (n8h1) ((egb1) hgb1VarA).a().invoke(r6h1Var);
                        return p8h1Var instanceof p8h1 ? new lv61(p8h1Var) : new mv61(p8h1Var);
                    }
                    if (hgb1VarA instanceof ggb1) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                if (hgb1VarA instanceof j70) {
                    return new mv61(new pwl0(new opl0(r6h1Var, (byte) 7)));
                }
                if (hgb1VarA instanceof oxm0) {
                    return new mv61(new rwl0(new opl0(((oxm0) hgb1VarA).a, r6h1Var, (byte) 9)));
                }
                if (hgb1VarA instanceof jxn0) {
                    jxn0 jxn0Var = (jxn0) hgb1VarA;
                    int i2 = jxn0Var.a;
                    boolean z = jxn0Var.b;
                    swl0 swl0Var = new swl0(new opl0(i2, r6h1Var, (byte) 10));
                    return z ? new lv61(swl0Var) : new mv61(swl0Var);
                }
                if (!(hgb1VarA instanceof xad1)) {
                    eg.o();
                    return null;
                }
                xad1 xad1Var = (xad1) hgb1VarA;
                int i3 = xad1Var.a;
                boolean z2 = xad1Var.b;
                twl0 twl0Var = new twl0(new opl0(i3, r6h1Var, (byte) 11));
                return z2 ? new lv61(twl0Var) : new mv61(twl0Var);
            case 3:
                sq61 sq61Var = (sq61) obj;
                int iIntValue = ((Number) obj3).intValue();
                b0k b0kVar = (x340) ((b0k) obj2);
                b0kVar.i0(1858564225);
                lqs0 lqs0Var = vt61.j;
                String strQ = tro1.q(sq61Var, b0kVar, iIntValue & 14);
                lqs0 lqs0VarE = w7x.a;
                lqs0 lqs0VarE2 = strQ != null ? vt61.e(strQ) : lqs0VarE;
                if (sq61Var instanceof jgb1) {
                    jgb1 jgb1Var = (jgb1) sq61Var;
                    if5VarO = new if5(jgb1Var.f, null, jgb1Var.g, null, 8);
                } else {
                    if (!(sq61Var instanceof vqo)) {
                        eg.o();
                        return null;
                    }
                    if5VarO = tro1.o(((vqo) sq61Var).b);
                }
                String strC = if5VarO.c(b0kVar);
                if (strC != null) {
                    lqs0VarE = vt61.e(strC);
                }
                ut61 ut61Var = new ut61(lqs0VarE2, lqs0VarE);
                b0kVar.r(false);
                return ut61Var;
            case 4:
                ym90 ym90Var = (ym90) obj;
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (!u890.j((tc71) ym90Var.c.getValue(), tc71.a)) {
                    eg.o();
                    return null;
                }
                x340 x340Var5 = x340Var4;
                x340Var5.i0(1266995667);
                x340Var5.r(false);
                ym90Var.d.invoke(sc71.a);
                return rih1Var;
            case 5:
                qim0 qim0VarE2 = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var6 = (b0k) obj2;
                x340Var6.i0(447141049);
                iv71 iv71Var = (iv71) x340Var6.k(jv71.a);
                if (iv71Var != null) {
                    qim0VarE2 = pv71.e(iv71Var.a, pv71.d("side_drawer_profile_avatar", x340Var6), iv71Var.b);
                }
                x340Var6.r(false);
                return qim0VarE2;
            case 6:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarN = anm1.N("song_dna_search_artist_row_role", nim0Var);
                int iC = l1d.C(1);
                if (iC == 0) {
                    i = 2131962734;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    i = 2131962735;
                }
                String strO0 = cwl1.o0(b0kVar2, i);
                uwr uwrVar = cbx.a;
                uwo1.e(strO0, qim0VarN, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, b0kVar2, 0, 0, 1712);
                return rih1Var;
            case 7:
                n8h1 n8h1Var = (n8h1) obj;
                obd1 obd1Var = (obd1) obj3;
                zad1 zad1Var = ((ibd1) obj2).a;
                if (!(obd1Var instanceof mbd1)) {
                    if (obd1Var instanceof nbd1) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                boolean z3 = ((mbd1) obd1Var).a;
                if (zad1Var instanceof xad1) {
                    twl0 twl0Var2 = (twl0) n8h1Var;
                    y6h1 y6h1Var = twl0Var2.a;
                    r6h1 r6h1Var2 = twl0Var2.b.b;
                    return z3 ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), y6h1Var, r6h1Var2, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), y6h1Var, r6h1Var2, System.currentTimeMillis());
                }
                if (zad1Var instanceof wad1) {
                    return (w7h1) ofo0.d1.invoke(n8h1Var, Boolean.valueOf(z3));
                }
                if (zad1Var instanceof yad1) {
                    return null;
                }
                eg.o();
                return null;
            case 8:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    x340Var8.i0(-1446434149);
                    x340Var8.r(false);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 9:
                if (((vkf1) obj2).equals(vkf1.a)) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 10:
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-your-listening-timeline";
                x6h1VarI.f = "12.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1 x6h1VarC = x6h1VarI.a().c();
                x6h1VarC.i.add(new a7h1("edge_case_no_listening_history", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                String str = nik1.z0.a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str == null) {
                    str = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1.c, System.currentTimeMillis());
            case 11:
                if (obj != null) {
                    throw new ClassCastException();
                }
                throw null;
            case 12:
                return new l331((List) obj, ((Boolean) obj3).booleanValue() || Boolean.parseBoolean((String) ((qxc0) obj2).X.get("is_video_first")));
            case 13:
                ifh0 ifh0Var = (ifh0) obj;
                q5t0 q5t0VarH = ((afh0) obj2).H(((hjl) obj3).a);
                return ifh0Var.S(q5t0VarH.a, q5t0VarH.b + (q5t0VarH.b > 0 ? ifh0Var.i0(8.0f) : 0), b7xVar, new oyc1(q5t0VarH, (byte) 6));
            case 14:
                boolean z4 = true;
                String str2 = (String) obj;
                x340 x340Var9 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var9.g(str2) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18) {
                    z4 = false;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue3 & 1, z4)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str2, qim0VarF, cbx.d(x340Var10).g, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var10, iIntValue3 & 14, 0, 2024);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            default:
                b3n1 b3n1Var = (b3n1) obj;
                tqw tqwVar = (tqw) obj3;
                if (c3n1.a[((a3n1) obj2).ordinal()] == 1) {
                    b3n1Var.a.invoke(new o1n1(cvl1.d(tqwVar)));
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kk11(int i, byte b) {
        super(i);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kk11(Object obj, byte b) {
        super(3);
        this.a = b;
    }
}
