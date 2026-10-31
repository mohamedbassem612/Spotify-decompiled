package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.mobius.First;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.scrollsita.v1.Section;
import com.spotify.searchview.proto.Entity;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wcf1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wcf1(m801 m801Var, sma1 sma1Var) {
        super(2);
        this.a = (byte) 16;
        this.b = m801Var;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0480  */
    /* JADX WARN: Code duplicated, block: B:36:0x013f  */
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        byte b = this.a;
        j9k1 j9k1Var = gql.b;
        j9k1 j9k1Var2 = fql.b;
        j9k1 j9k1Var3 = eql.b;
        j9k1 j9k1Var4 = dql.b;
        px3 px3Var = px3.b;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj;
                x340Var.i0(-971870064);
                vnr0 vnr0VarA = shy0.a(((SceneTemplate.TopSongJourneyContent.Card3) obj3).p(), x340Var);
                x340Var.r(false);
                return vnr0VarA;
            case 1:
                ((Number) obj2).intValue();
                x340 x340Var2 = (b0k) obj;
                x340Var2.i0(-952072819);
                vnr0 vnr0VarA2 = shy0.a(((SceneTemplate.TopSongsPlaylistContent.Card1) obj3).o(), x340Var2);
                x340Var2.r(false);
                return vnr0VarA2;
            case 2:
                return s110.o((pdf1) obj, (List) obj2, ((xdf1) obj3).h);
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objT = x340Var4.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = udf1.d;
                        x340Var4.s0(objT);
                    }
                    qim0 qim0VarA = s161.a(nim0Var, (iu30) objT);
                    htg0 htg0Var = (htg0) obj3;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarA);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(hmb0.t1);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(gfh0VarC, x340Var4, y580.O0);
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    String str2 = htg0Var.b;
                    Object objT2 = x340Var4.T();
                    if (objT2 == m4cVar) {
                        objT2 = q9f1.X;
                        x340Var4.s0(objT2);
                    }
                    mp10.i(48, str2, (Function0) objT2, x340Var4);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                uef1 uef1Var = (uef1) obj3;
                return gm50.A((oef1) obj, (List) obj2, uef1Var.f, uef1Var.t);
            case 5:
                return First.b(wff1.x0((wff1) obj, ((fg60) ((pt) obj3).g).b()));
            case 6:
                btq btqVar = (btq) ((jly0) ((hlf1) ((ur6) obj3).b).a.c).get();
                btqVar.getClass();
                return new jpg0(f6o1.A(new glf1((atq) ((dr41) ((lbq) btqVar.a.b).b).b, (zob1) obj), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), udf1.R0);
            case 7:
                plf1 plf1Var = (plf1) obj;
                r910 r910Var = (r910) obj2;
                px3 px3Var2 = r910Var.m;
                boolean z4 = r910Var.e || r910Var.f;
                int i = plf1Var.G;
                boolean z5 = r910Var.g;
                boolean z6 = r910Var.d;
                boolean z7 = r910Var.c;
                boolean z8 = r910Var.b;
                boolean z9 = px3Var2 == px3Var;
                boolean z10 = i != 3 && z6;
                boolean zF = o0c.F(i, z7, z8);
                if (z5) {
                    j9k1Var = j9k1Var4;
                } else if (z10 && !z9) {
                    j9k1Var = j9k1Var3;
                } else if (zF && !z9) {
                    j9k1Var = j9k1Var2;
                }
                boolean z11 = r910Var.i;
                String str3 = plf1Var.a;
                String str4 = plf1Var.c;
                String str5 = plf1Var.d;
                String str6 = plf1Var.e;
                String str7 = plf1Var.f;
                String str8 = plf1Var.g;
                int i2 = plf1Var.G;
                boolean zQ = tho1.q(px3Var2, str3, j9k1Var);
                int iQ = o0c.Q(r910Var.a, plf1Var.b);
                boolean z12 = plf1Var.j;
                boolean z13 = plf1Var.k;
                boolean z14 = plf1Var.o;
                boolean z15 = plf1Var.f33p;
                boolean z16 = r910Var.h;
                boolean z17 = plf1Var.s;
                boolean z18 = r910Var.j;
                boolean z19 = plf1Var.v;
                return new qlf1(str3, str4, str5, str6, str7, str8, z4, i2, j9k1Var, zQ, iQ, z12, z13, z14, z18, z15, z16, z17, z19, (z19 || plf1Var.w || z17) && r910Var.k, r910Var.l, plf1Var.z, plf1Var.w, plf1Var.x, plf1Var.D, z11, plf1Var.F && ((di4) ((rlf1) obj3).j).d());
            case 8:
                x340 x340Var5 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    emf1 emf1Var = (emf1) obj3;
                    otw.c(emf1Var.c, new nmf1(emf1Var.b.a), (qim0) null, (ipb1) null, x340Var6, 0, 12);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                ((ujo) obj3).f((b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                ((tva1) obj3).f((b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                x340 x340Var7 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String strK = ((quf1) obj3).f;
                    if (strK == null) {
                        strK = x0d.k(x340Var8, -2045986244, 2131963355, x340Var8, false);
                    } else {
                        x340Var8.i0(-2045987329);
                        x340Var8.r(false);
                    }
                    uwo1.e(strK, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var9 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                yuf1 yuf1Var = (yuf1) obj3;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    etq etqVar = yuf1Var.d;
                    avf1 avf1Var = yuf1Var.a;
                    q7r0 q7r0Var = yuf1Var.b;
                    abu0 abu0VarF = cwl1.F(q7r0Var);
                    iac0 iac0Var = q7r0Var.d.c;
                    kp5 kp5Var = (kp5) etqVar.a.c;
                    zuf1 zuf1Var = (zuf1) kp5Var.a;
                    uu00 uu00Var = (uu00) zuf1Var.d.get();
                    c8o.l(uu00Var);
                    rcy rcyVar = new rcy(uu00Var);
                    a3u0 a3u0Var = (a3u0) zuf1Var.e.get();
                    c8o.l(a3u0Var);
                    yzh1 yzh1Var = (yzh1) zuf1Var.f.get();
                    c8o.l(yzh1Var);
                    yo31 yo31Var = new yo31(yzh1Var, (byte) 28);
                    ynb0 ynb0VarA = xqu.a((tsq) kp5Var.e);
                    yqg yqgVar = (yqg) zuf1Var.g.get();
                    c8o.l(yqgVar);
                    nl9 nl9Var = new nl9(rcyVar, a3u0Var, yo31Var, ynb0VarA, yqgVar, abu0VarF, iac0Var);
                    Set set = s4b1.f;
                    String strZ = uic.B(avf1Var.b).z();
                    otw.c(nl9Var, new luf1(strZ != null ? strZ : "", avf1Var.c), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 13:
                return ((tva1) obj3).j((hyf1) obj, (k1r) obj2);
            case 14:
                iyf1 iyf1Var = (iyf1) obj;
                e910 e910Var = (e910) obj2;
                di4 di4Var = (di4) obj3;
                String str9 = iyf1Var.a;
                px3 px3Var3 = e910Var.k;
                boolean z20 = e910Var.d || e910Var.e;
                int i3 = iyf1Var.f;
                boolean z21 = e910Var.f;
                boolean z22 = iyf1Var.v;
                boolean z23 = e910Var.c;
                boolean z24 = e910Var.b;
                boolean z25 = px3Var3 == px3Var;
                boolean z26 = i3 != 3 && z22;
                boolean zF2 = o0c.F(i3, z23, z24);
                if (z21) {
                    j9k1Var = j9k1Var4;
                } else if (z26 && !z25) {
                    j9k1Var = j9k1Var3;
                } else if (zF2 && !z25) {
                    j9k1Var = j9k1Var2;
                }
                boolean z27 = e910Var.h;
                String str10 = iyf1Var.b;
                String str11 = iyf1Var.c;
                String str12 = iyf1Var.d;
                String str13 = iyf1Var.e;
                int i4 = iyf1Var.f;
                boolean zQ2 = tho1.q(px3Var3, str9, j9k1Var);
                int iQ2 = o0c.Q(e910Var.a, str9);
                boolean z28 = iyf1Var.i;
                boolean z29 = iyf1Var.j;
                boolean z30 = iyf1Var.n;
                boolean z31 = iyf1Var.o;
                String str14 = iyf1Var.q;
                boolean z32 = e910Var.g;
                boolean zX = di4Var.X();
                List list = iyf1Var.r;
                boolean z33 = iyf1Var.t;
                boolean z34 = iyf1Var.s;
                if (z34 || z33) {
                    z = z34;
                    boolean z35 = e910Var.i;
                    Integer num = e910Var.j;
                    String str15 = iyf1Var.y;
                    boolean z36 = iyf1Var.z;
                    if (iyf1Var.B || !di4Var.d()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    return new nyf1(str9, str10, str11, str12, str13, z20, i4, j9k1Var, zQ2, iQ2, z28, z29, z30, z31, str14, z32, zX, list, z33, z, z35, num, str15, z27, z36, z2);
                }
                z = z34;
                Integer num2 = e910Var.j;
                String str16 = iyf1Var.y;
                boolean z37 = iyf1Var.z;
                if (iyf1Var.B) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                return new nyf1(str9, str10, str11, str12, str13, z20, i4, j9k1Var, zQ2, iQ2, z28, z29, z30, z31, str14, z32, zX, list, z33, z, z35, num2, str16, z27, z37, z2);
            case 15:
                x340 x340Var11 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    cev0.j(((jyf1) obj3).j != null, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 16:
                dbg1 dbg1Var = (dbg1) obj;
                ((m801) obj3).b(dbg1Var.a, dbg1Var.d);
                return First.b(sma1.e((ccg1) obj2, dbg1Var));
            case 17:
                ((Number) obj2).intValue();
                cpn1.f((urg1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                x340 x340Var13 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var14, ((yrg1) obj3).c.intValue()), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 19:
                kr61 kr61Var = ((v8c) obj3).d;
                t4m0 t4m0Var = kr61Var.b;
                t4m0Var.getClass();
                x6h1 x6h1VarC = t4m0Var.a.c();
                x6h1VarC.i.add(new a7h1("disable_all_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                ((i8h1) kr61Var.a.get()).m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("auto_download_disable", 1, Collections.singletonMap("item_to_stop_download", "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return zp61.a;
            case 20:
                ((smc0) obj3).add((pyl) obj2);
                return rih1Var;
            case 21:
                x340 x340Var15 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    tbh1 tbh1Var = (tbh1) obj3;
                    if (tbh1Var.e) {
                        x340Var16.i0(1919651608);
                        uwr uwrVar = cbx.a;
                        xto1.e((qim0) null, 1, cbx.a(x340Var16).b.a, 0L, x340Var16, 48, 9);
                        x340Var16.r(false);
                    } else {
                        boolean z38 = tbh1Var.c;
                        isl islVar = isl.a;
                        if (z38) {
                            x340Var16.i0(-620141042);
                            cnx cnxVar = cnx.c;
                            uwr uwrVar2 = cbx.a;
                            zov0 zov0Var = cbx.b(x340Var16).g;
                            w0h1.a(cnxVar, islVar, u291.r(nim0Var, 16.0f), 0L, 0L, true, x340Var16, cnx.d | 196656, 24);
                            x340Var16.r(false);
                        } else {
                            x340Var16.i0(-619862631);
                            wrx wrxVar = wrx.c;
                            uwr uwrVar3 = cbx.a;
                            zov0 zov0Var2 = cbx.b(x340Var16).g;
                            w0h1.a(wrxVar, islVar, u291.r(nim0Var, 16.0f), 0L, 0L, false, x340Var16, wrx.d | 48, 56);
                            x340Var16.r(false);
                        }
                    }
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var17 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    leh1 leh1Var = (leh1) obj3;
                    aym.e(null, new u8h(new oxe1(leh1Var != null ? leh1Var.b : new hn20(abh.h))), x340Var18, 64);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 23:
                x340 x340Var19 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    hkh1 hkh1Var = (hkh1) obj3;
                    qhm qhmVar = hkh1Var.c;
                    kkh1 kkh1Var = hkh1Var.b;
                    otw.c(qhmVar, new gkh1(kkh1Var.a, kkh1Var.b), (qim0) null, (ipb1) null, x340Var20, 0, 12);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 24:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                ((bmh1) obj3).d.t(fFloatValue);
                return rih1Var;
            case 25:
                inh1 inh1Var = (inh1) obj2;
                if (((abm) ((el9) obj3).t).a()) {
                    zd3 zd3Var = inh1Var.e;
                    if (zd3Var != null ? zd3Var.e : false) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    z3 = false;
                }
                String str17 = inh1Var.a.a;
                up70 up70VarA = inh1Var.b.a.a(vp70.c);
                return new mnh1(str17, (up70VarA == null || (str = up70VarA.a.a) == null) ? "" : str, inh1Var.d.a, Long.valueOf(inh1Var.c.c), z3);
            case 26:
                p9p p9pVar = (p9p) ((iz6) obj3).b;
                epb1 epb1Var = new epb1((zob1) obj);
                p9pVar.getClass();
                u9p u9pVar = (u9p) p9pVar.a.c;
                lzn0 lzn0Var = (lzn0) u9pVar.G.get();
                xfx xfxVarD = ((i1o) u9pVar.C).d();
                c8o.l(xfxVarD);
                yfx yfxVar = new yfx(xfxVarD.c, (byte) 3);
                i1o i1oVar = (i1o) u9pVar.C;
                Context contextC = i1oVar.c();
                c8o.l(contextC);
                abm abmVarB = i1oVar.b();
                c8o.l(abmVarB);
                return new jpg0(new onh1(lzn0Var, yfxVar, contextC, abmVarB, epb1Var), qmh1.T0);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                g0g g0gVar = (g0g) obj;
                String str18 = g0gVar.a;
                String str19 = g0gVar.b;
                if (ihc1.y0(str18)) {
                    n57.e("Minimum birthday has not been set.");
                }
                if (ihc1.y0(str19)) {
                    n57.e("Maximum birthday has not been set.");
                }
                return new hph1(((kph1) obj3).b.a, str18, str19, nph1.a);
            case 28:
                ((Number) obj2).intValue();
                ((wph1) obj3).d((b0k) obj, czo1.p(7));
                return rih1Var;
            default:
                x340 x340Var21 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (!x340Var22.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x340Var22.b0();
                } else if (((jth1) obj3).i) {
                    x340Var22.i0(-1595589820);
                    xto1.e((qim0) null, 2, 0L, 0L, x340Var22, 48, 13);
                    x340Var22.r(false);
                } else {
                    x340Var22.i0(-1595493162);
                    w0h1.a(qtx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var22, qtx.d | 48, 60);
                    x340Var22.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wcf1(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wcf1(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
