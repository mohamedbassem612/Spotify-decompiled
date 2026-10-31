package p;

import android.content.res.Resources;
import android.net.Uri;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Next;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.recents.uiusecases.singleartworkwithbadge.SingleArtworkWithBadgeView;
import com.spotify.recents.uiusecases.stackedartwork.StackedArtworkComposeView;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qm71 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm71(atb1 atb1Var, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 12;
        this.c = atb1Var;
        this.b = iu30Var;
        this.d = qim0Var;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [p.rm71] */
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        xzq xzqVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        Object obj5 = this.b;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                zg71 zg71Var = (zg71) obj6;
                m4c m4cVar = fkj0.X;
                sm71 sm71Var = (sm71) obj4;
                final iu30 iu30Var = (iu30) obj5;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i2p1.f((rm71) new iv30() { // from class: p.rm71
                        public final boolean equals(Object obj7) {
                            if (obj7 instanceof rm71) {
                                return u890.j(getFunctionDelegate(), ((iv30) obj7).getFunctionDelegate());
                            }
                            return false;
                        }

                        public final cv30 getFunctionDelegate() {
                            return iu30Var;
                        }

                        public final int hashCode() {
                            return getFunctionDelegate().hashCode();
                        }
                    }, x340Var2, 0);
                    hl71 hl71Var = zg71Var.a;
                    xg71 xg71Var = zg71Var.e;
                    boolean z = hl71Var instanceof el71;
                    nim0 nim0Var = nim0.a;
                    if (z) {
                        x340Var2.i0(2028295870);
                        boolean zG = x340Var2.g(iu30Var);
                        Object objT = x340Var2.T();
                        if (zG || objT == m4cVar) {
                            objT = new v5a(iu30Var, (lnm) null, (byte) 15);
                            x340Var2.s0(objT);
                        }
                        qxd0.t(rih1Var, x340Var2, (vu30) objT);
                        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                        boolean zG2 = x340Var2.g(iu30Var);
                        Object objT2 = x340Var2.T();
                        if (zG2 || objT2 == m4cVar) {
                            objT2 = new m861(iu30Var, (byte) 16);
                            x340Var2.s0(objT2);
                        }
                        x2g0.g(6, (Function0) objT2, x340Var2, qim0VarF);
                        x340Var2.r(false);
                    } else if (xg71Var instanceof wg71) {
                        x340Var2.i0(2028583736);
                        sm71Var.c(x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(2028708325);
                        List list = ((vg71) xg71Var).a;
                        boolean zG3 = x340Var2.g(list);
                        Object objT3 = x340Var2.T();
                        if (zG3 || objT3 == m4cVar) {
                            dc31 dc31Var = (dc31) sm71Var.i.b;
                            List<fd91> list2 = list;
                            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                            for (fd91 fd91Var : list2) {
                                tka0 tka0Var = fd91Var.a;
                                Map map = (Map) dc31Var.b;
                                vl71 vl71Var = (vl71) map.get(tka0Var);
                                if (vl71Var != null) {
                                    ArrayList arrayList2 = fd91Var.b;
                                    Object obj7 = obj6;
                                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        tka0 tka0Var2 = (tka0) it.next();
                                        LinkedHashMap linkedHashMap = (LinkedHashMap) dc31Var.c;
                                        Iterator it2 = it;
                                        ql71 ql71Var = (ql71) linkedHashMap.get(tka0Var2);
                                        if (ql71Var != null) {
                                            arrayList3.add(ql71Var);
                                            it = it2;
                                        } else {
                                            k220.k("Section not found in registry: ", tka0Var2, ". Available: ", linkedHashMap.keySet());
                                        }
                                    }
                                    arrayList.add(vl71Var.a(arrayList3));
                                    obj6 = obj7;
                                } else {
                                    k220.k("Factory not found in registry: ", tka0Var, ". Available: ", map.keySet());
                                }
                                return null;
                            }
                            obj3 = obj6;
                            objT3 = mqo1.A(arrayList);
                            x340Var2.s0(objT3);
                        } else {
                            obj3 = obj6;
                        }
                        c380 c380Var = (c380) objT3;
                        boolean zG4 = x340Var2.g(sm71Var) | x340Var2.g(iu30Var);
                        Object objT4 = x340Var2.T();
                        if (zG4 || objT4 == m4cVar) {
                            objT4 = new pm71(sm71Var, iu30Var, null, (byte) 0);
                            x340Var2.s0(objT4);
                        }
                        qxd0.t(rih1Var, x340Var2, (vu30) objT4);
                        boolean zG5 = x340Var2.g(sm71Var) | x340Var2.g(iu30Var);
                        Object objT5 = x340Var2.T();
                        if (zG5 || objT5 == m4cVar) {
                            objT5 = new pm71(sm71Var, iu30Var, null, (byte) 1);
                            x340Var2.s0(objT5);
                        }
                        qxd0.t(rih1Var, x340Var2, (vu30) objT5);
                        boolean z2 = !(zg71Var.d instanceof qe71);
                        Object objT6 = x340Var2.T();
                        if (objT6 == m4cVar) {
                            objT6 = da71.Z;
                            x340Var2.s0(objT6);
                        }
                        qim0 qim0VarX = bin.x(nim0Var, z2, (String) null, (pm31) null, (idn0) null, (Function0) objT6, 14);
                        ug71 ug71Var = sm71Var.b;
                        zg71 zg71Var2 = (zg71) obj3;
                        boolean zG6 = x340Var2.g(iu30Var);
                        Object objT7 = x340Var2.T();
                        if (zG6 || objT7 == m4cVar) {
                            objT7 = new m861(iu30Var, (byte) 17);
                            x340Var2.s0(objT7);
                        }
                        x1p1.c(ug71Var, zg71Var2, c380Var, (Function0) objT7, qim0VarX, x340Var2, 0);
                        x340Var2.i0(2031377734);
                        x340Var2.r(false);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                t7q0 t7q0Var = ((dp71) obj6).b;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String str = (String) ((ven0) obj4).getValue();
                    String uri = t7q0Var.getUri();
                    t7q0Var.getClass();
                    otw.c((jwf0) obj5, new gwf0(str, uri, t7q0Var instanceof g7q0), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                z5p1.h((ac81) obj5, (Function0) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                o6p1.d((b681) obj5, (xpw) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                d0r d0rVar = (d0r) obj5;
                y441 y441Var = (y441) obj6;
                jd6 jd6Var = new jd6(d0rVar, (e2w) obj4);
                pwc0 pwc0Var = pwc0.b;
                tyq xzqVar2 = new xzq(new qlb(d0rVar, jd6Var, w3p1.o(new l4r(pwc0Var, 2, axv.Z0, new j4r(axv.b1), axv.a1), axv.c1)), rz71.W0);
                jf4 jf4Var = ((u9b) y441Var.d).a;
                if (jf4Var.v() && jf4Var.s()) {
                    bz11 bz11Var = (bz11) y441Var.c;
                    frh1 frh1Var = (frh1) bz11Var.a;
                    a1r0 a1r0Var = (a1r0) bz11Var.c;
                    kt91 kt91Var = (kt91) bz11Var.e;
                    Resources resources = (Resources) bz11Var.f;
                    v9b v9bVar = (v9b) bz11Var.g;
                    jab jabVar = (jab) bz11Var.h;
                    u9b u9bVar = (u9b) bz11Var.i;
                    q8n q8nVar = (q8n) bz11Var.b;
                    q8n q8nVar2 = (q8n) bz11Var.k;
                    jl41 jl41Var = new jl41(frh1Var, a1r0Var, kt91Var, resources, v9bVar, jabVar, u9bVar, q8nVar, q8nVar2);
                    nvh1 nvh1Var = (nvh1) bz11Var.d;
                    q8n q8nVar3 = (q8n) bz11Var.j;
                    xzqVar = new xzq(new qlb(d0rVar, new kls0(jl41Var, new wl41(nvh1Var, q8nVar3), q8nVar3, q8nVar2), w3p1.o(new l4r(pwc0Var, 2, ej41.d, new j4r(ej41.f), ej41.e), ej41.g)), rz71.Y0);
                } else {
                    xzqVar = null;
                }
                xzq xzqVar3 = (jf4Var.v() && jf4Var.r()) ? new xzq(((jcq) y441Var.b).a(d0rVar), rz71.X0) : null;
                return f6o1.A(new jd6(d0rVar, xzqVar3 == null ? f46.i0(new tyq[]{xzqVar2, xzqVar}) : f46.i0(new tyq[]{xzqVar3, xzqVar, xzqVar2})), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            case 5:
                ((Number) obj2).intValue();
                z6p1.k((m881) obj5, (Function0) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                j7p1.a((Uri) obj5, (String) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                ((res) obj5).e((li81) obj6, (qim0) obj4, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                hap1.d((c10) obj6, (qim0) obj4, (iu30) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                ((SingleArtworkWithBadgeView) obj6).z((hy81) obj4, (iu30) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                Next next = (Next) obj5;
                ubm ubmVar = (ubm) obj6;
                return Next.i(kl91.a((kl91) next.g(), (jdu0) null, (Map) null, (Map) null, (Map) null, (y0a1) null, (Boolean) null, (Boolean) null, false, false, 0, (ArrayList) null, sqg0.P(((kl91) next.g()).m, new mmr0(ubmVar.a, new ybd1((if81) obj, rtw0.g.h0((kl91) next.g(), ubmVar), 1, (tv80) obj4))), (Map) null, (Set) null, 0, 0, (Map) null, false, 520191), dm61.y0(next.b(), (Set) obj2));
            case 11:
                ((Number) obj2).intValue();
                d1u.z((unb0) obj5, (qim0) obj6, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                s110.g((atb1) obj6, (iu30) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                gm50.c((cc81) obj5, (String) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                gm50.d((ArrayList) obj5, (Map) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                gm50.h((bc81) obj5, (Map) obj6, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                hr80.g((n8a1) obj5, (qim0) obj6, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                hw2 hw2Var = (hw2) obj6;
                s9a1 s9a1Var = (s9a1) obj5;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    uvx uvxVar = new uvx((pgx) null, 4, (tvx) null, (p3v) null, 27);
                    qim0 qim0VarN = anm1.N("row_root", u291.f(nim0.a, 1.0f));
                    Object objT8 = x340Var6.T();
                    if (objT8 == fkj0.X) {
                        objT8 = p9a1.T0;
                        x340Var6.s0(objT8);
                    }
                    jto1.b(s161.b(qim0VarN, true, (iu30) objT8), uvxVar, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(-457708666, new t9a1(s9a1Var, (byte) 0), x340Var6), (xu30) null, apo.r(1755205605, new t9a1(s9a1Var, hw2Var), x340Var6), apo.r(-660235068, new nu31(hw2Var, s9a1Var, (gft0) obj4, (byte) 16), x340Var6), (xu30) null, (xu30) null, apo.r(683377505, new t9a1(s9a1Var, (byte) 2), x340Var6), x340Var6, 805306432, 221616, 9724);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                rwq0.m((rba1) obj6, (Function0) obj4, (iu30) obj5, (b0k) obj, czo1.p(55));
                return rih1Var;
            case 19:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                e1m0 e1m0Var = (e1m0) obj5;
                pda1 pda1Var = (pda1) obj6;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zG7 = x340Var8.g(e1m0Var);
                    Object objT9 = x340Var8.T();
                    if (zG7 || objT9 == m4cVar2) {
                        d1m0 d1m0Var = e1m0Var != null ? new d1m0(e1m0Var) : null;
                        x340Var8.s0(d1m0Var);
                        objT9 = d1m0Var;
                    }
                    d1m0 d1m0Var2 = (d1m0) objT9;
                    rba1 rba1Var = sba1.a;
                    String strD = pda1Var.d();
                    boolean zI = x340Var8.i(pda1Var);
                    Object objT10 = x340Var8.T();
                    if (zI || objT10 == m4cVar2) {
                        objT10 = new ida1(pda1Var, (byte) 2);
                        x340Var8.s0(objT10);
                    }
                    rqg0.p(rba1Var, strD, (iu30) objT10, apo.r(130982830, new kda1((qba1) obj4, d1m0Var2, (byte) 1), x340Var8), (qim0) null, x340Var8, 3078);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 20:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                iea1 iea1Var = (iea1) obj6;
                eea1 eea1Var = (eea1) obj5;
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x340Var10.b0();
                } else if (eea1Var.e) {
                    x340Var10.i0(-740906914);
                    y08 y08Var = iea1Var.b;
                    String str2 = ((fea1) obj4).a;
                    i1o1.e(y08Var, new p08(str2, str2, "193a8f3811c445a2b9d5d1d696b9de07"), iea1Var.a, (qim0) null, (ipb1) null, zjj.a, (xu30) null, 0, (xu30) null, x340Var10, 196608, 236);
                    x340Var10.r(false);
                } else {
                    x340Var10.i0(-740677452);
                    y7y0.i(eea1Var.d, x340Var10, 0);
                    x340Var10.r(false);
                }
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                j9k1.i((vta1) obj5, (vta1) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                Logger.d("MBS: Error searching for '%s': %s, %s", new Object[]{(String) obj5, (pih0) obj, (String) obj2});
                ((q1m) obj6).b(2);
                ((yhh0) obj4).d((ArrayList) null);
                return rih1Var;
            case 23:
                ((q1m) obj5).b(2);
                ((em61) obj6).u(s7c0.d(z6x.a, (iph0) obj4));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                ((StackedArtworkComposeView) obj6).z((eab1) obj4, (iu30) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                p2o1.i((hob1) obj5, (qim0) obj6, (vu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                rno1.d((c380) obj6, (qyl) obj4, (iu30) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((Number) obj2).intValue();
                yoo1.s((s32) obj5, (Function0) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    uw0 uw0Var = (uw0) obj5;
                    zqo1.k((String) uw0Var.g, ((il51) obj6).d, (vtc1) uw0Var.O0, (List) obj4, (vxe1) uw0Var.c, (kly0) uw0Var.Y, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            default:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                buc1 buc1Var = (buc1) obj5;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    Object objT11 = x340Var14.T();
                    if (objT11 == fkj0.X) {
                        objT11 = (kah1) buc1Var.f.get();
                        x340Var14.s0(objT11);
                    }
                    kah1 kah1Var = (kah1) objT11;
                    kah1Var.getClass();
                    otw.c(kah1Var, new jah1(buc1Var.b, (rxe1) obj6, true, (jtc1) obj4, null), (qim0) null, (ipb1) null, x340Var14, 64, 12);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qm71(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qm71(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qm71(byte b, int i, Object obj, Object obj2, iu30 iu30Var) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = iu30Var;
    }
}
