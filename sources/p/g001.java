package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g001 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g001(Object obj, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        tob1 tob1Var;
        boolean z;
        tob1 tob1Var2;
        tob1 tob1Var3;
        boolean z2;
        tob1 tob1Var4;
        jjm0 jjm0Var;
        ih01 ih01Var;
        ih01 ih01Var2;
        int i;
        ulw0 qlw0Var;
        d011 h011Var;
        int i2;
        Completable completableFlatMapCompletable;
        w7h1 w7h1Var3;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                wzz0 wzz0Var = (wzz0) obj2;
                jzz0 jzz0Var = (jzz0) obj4;
                y6h1 y6h1Var = ((vcl0) obj).a;
                if (!(jzz0Var instanceof azz0)) {
                    if (jzz0Var instanceof zyz0) {
                        String str = ((zyz0) jzz0Var).a;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1Var, r6h1.c, System.currentTimeMillis());
                    } else if (jzz0Var instanceof ezz0) {
                        w7h1Var = new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
                    } else if (jzz0Var instanceof dzz0) {
                        h001 h001Var = (h001) obj6;
                        Iterator it = wzz0Var.i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (u890.j(((gxz0) next).c.a, h001Var.Y)) {
                                    obj5 = next;
                                }
                            } else {
                                obj5 = null;
                            }
                        }
                        gxz0 gxz0Var = (gxz0) obj5;
                        if (gxz0Var != null) {
                            String str2 = gxz0Var.b;
                            w7h1Var = new w7h1("", "", new z7h1("double_hit", 1, b7xVar), new x7h1("remove_reaction", 1, Collections.singletonMap("reaction_to_be_removed", str2 != null ? str2 : "")), y6h1Var, r6h1.c, System.currentTimeMillis());
                        } else {
                            w7h1Var = new w7h1("", "", new z7h1("double_hit", 1, b7xVar), new x7h1("add_reaction", 1, Collections.singletonMap("reaction_to_be_added", "❤️")), y6h1Var, r6h1.c, System.currentTimeMillis());
                        }
                    } else if (!(jzz0Var instanceof fzz0) && !(jzz0Var instanceof bzz0) && !(jzz0Var instanceof hzz0) && !(jzz0Var instanceof gzz0) && !(jzz0Var instanceof czz0)) {
                        eg.o();
                    }
                    return w7h1Var;
                }
                return null;
            case 1:
                return new qtl0(Integer.valueOf(((Number) obj3).intValue()), ((n6r0) ((e701) obj6).e).path(), ((v601) obj).a, (r6h1) obj4);
            case 2:
                return new qtl0(Integer.valueOf(((Number) obj3).intValue()), ((pa01) obj6).c.path(), (String) obj, (r6h1) obj4);
            case 3:
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                hyy0 hyy0Var = (hyy0) obj6;
                return new ntl0(new qtl0(numValueOf, yon1.D4().c, (String) hyy0Var.b, (r6h1) obj4), (otl0) ((ynb0) hyy0Var.c).get());
            case 4:
                jjm0 jjm0Var2 = (jjm0) obj;
                ec01 ec01Var = (ec01) obj2;
                int iIntValue = ((Number) obj4).intValue();
                x340 x340Var = (b0k) obj3;
                x340Var.i0(137277087);
                ngs0 ngs0Var = (ngs0) obj6;
                boolean zI = x340Var.i(ngs0Var);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new wd2(ngs0Var, (lnm) null, (byte) 8);
                    x340Var.s0(objT);
                }
                jjm0Var2.a((zu30) objT, x340Var, (iIntValue << 3) & 112);
                fc01 fc01Var = new fc01(ec01Var.a);
                x340Var.r(false);
                return fc01Var;
            case 5:
                jjm0 jjm0Var3 = (jjm0) obj;
                qd01 qd01Var = (qd01) obj2;
                int iIntValue2 = ((Number) obj4).intValue();
                m4c m4cVar = fkj0.X;
                nl9 nl9Var = (nl9) obj6;
                x340 x340Var2 = (b0k) obj3;
                x340Var2.i0(542361187);
                boolean z3 = qd01Var.a;
                List list = z6x.a;
                if (z3) {
                    x340Var2.i0(-184778208);
                    Object objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = rqt0.u(new lt20(new e6s(((mz10) nl9Var.f).a.d(mz10.b), (byte) 3), new re1(3, (lnm) null, (byte) 29), (byte) 0));
                        x340Var2.s0(objT2);
                    }
                    list = (List) f4p1.j((mr20) objT2, list, null, x340Var2, 48, 14).getValue();
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-184587682);
                    x340Var2.r(false);
                }
                boolean zI2 = x340Var2.i(nl9Var);
                Object objT3 = x340Var2.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new wd2(nl9Var, (lnm) null, (byte) 9);
                    x340Var2.s0(objT3);
                }
                jjm0Var3.a((zu30) objT3, x340Var2, (iIntValue2 << 3) & 112);
                rd01 rd01Var = new rd01(qd01Var.b, list, z3);
                x340Var2.r(false);
                return rd01Var;
            case 6:
                jjm0 jjm0Var4 = (jjm0) obj;
                fe01 fe01Var = (fe01) obj2;
                int iIntValue3 = ((Number) obj4).intValue();
                x340 x340Var3 = (b0k) obj3;
                x340Var3.i0(972052963);
                he01 he01Var = (he01) obj6;
                ven0 ven0VarK = f4p1.k(he01Var.b.g, null, x340Var3, 7);
                boolean zI3 = x340Var3.i(he01Var);
                Object objT4 = x340Var3.T();
                if (zI3 || objT4 == fkj0.X) {
                    objT4 = new wd2(he01Var, (lnm) null, (byte) 10);
                    x340Var3.s0(objT4);
                }
                jjm0Var4.a((zu30) objT4, x340Var3, (iIntValue3 << 3) & 112);
                ge01 ge01Var = new ge01(fe01Var.a, ((te01) ven0VarK.getValue()).b, ((te01) ven0VarK.getValue()).c);
                x340Var3.r(false);
                return ge01Var;
            case 7:
                jjm0 jjm0Var5 = (jjm0) obj;
                oe01 oe01Var = (oe01) obj2;
                int iIntValue4 = ((Number) obj4).intValue();
                x340 x340Var4 = (b0k) obj3;
                x340Var4.i0(-795104285);
                he01 he01Var2 = (he01) obj6;
                qe01 qe01Var = he01Var2.b;
                ven0 ven0VarK2 = f4p1.k(qe01Var.c, null, x340Var4, 7);
                ven0 ven0VarK3 = f4p1.k(qe01Var.e, null, x340Var4, 7);
                ven0 ven0VarK4 = f4p1.k(qe01Var.g, null, x340Var4, 7);
                boolean zI4 = x340Var4.i(he01Var2);
                Object objT5 = x340Var4.T();
                if (zI4 || objT5 == fkj0.X) {
                    objT5 = new wd2(he01Var2, (lnm) null, (byte) 11);
                    x340Var4.s0(objT5);
                }
                jjm0Var5.a((zu30) objT5, x340Var4, (iIntValue4 << 3) & 112);
                pe01 pe01Var = new pe01(oe01Var.a, (hc01) ven0VarK2.getValue(), (fd01) ven0VarK3.getValue(), ((te01) ven0VarK4.getValue()).a);
                x340Var4.r(false);
                return pe01Var;
            case 8:
                irl0 irl0Var = (irl0) obj;
                r6h1 r6h1Var = irl0Var.a;
                y6h1 y6h1Var2 = irl0Var.b;
                if (!((wg01) obj4).equals(wg01.a)) {
                    eg.o();
                    return null;
                }
                if (((Boolean) ((yg01) obj6).d.getValue()).booleanValue()) {
                    x6h1 x6h1VarC = y6h1Var2.c();
                    x6h1VarC.i.add(new a7h1("reasoning_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    x6h1 x6h1VarC2 = y6h1Var2.c();
                    x6h1VarC2.i.add(new a7h1("reasoning_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 9:
                jjm0 jjm0Var6 = (jjm0) obj;
                ah01 ah01Var = (ah01) obj2;
                int iIntValue5 = ((Number) obj4).intValue();
                x340 x340Var5 = (b0k) obj3;
                x340Var5.i0(-503734847);
                uh01 uh01Var = (uh01) obj6;
                tob1 tob1VarG = rwq.g(uh01Var.t, Boolean.TRUE, (o8n) null, x340Var5, 48, 2);
                k740 k740Var = uh01Var.g;
                String str3 = ah01Var.a;
                tob1 tob1VarH = rwq.h(k740Var.d(str3), x340Var5, 0);
                Object objT6 = x340Var5.T();
                m4c m4cVar2 = fkj0.X;
                oh01 oh01Var = oh01.a;
                if (objT6 == m4cVar2) {
                    objT6 = v8r.q(oh01Var);
                    x340Var5.s0(objT6);
                }
                tob1 tob1Var5 = (ven0) objT6;
                eh01 eh01Var = new eh01(new hix0(false, 0L), new zg01(true, 0L));
                boolean zI5 = x340Var5.i(uh01Var) | x340Var5.i(ah01Var);
                Object objT7 = x340Var5.T();
                if (zI5 || objT7 == m4cVar2) {
                    objT7 = new l4f0(uh01Var, ah01Var, (lnm) null, (byte) 28);
                    x340Var5.s0(objT7);
                }
                eh01 eh01Var2 = (eh01) yto.p(eh01Var, str3, (vu30) objT7, x340Var5, 0).getValue();
                long j = eh01Var2.b.b;
                ytw0 ytw0Var = jfv.b;
                long jL0 = fdg1.l0(j, ngv.d);
                gix0 gix0Var = eh01Var2.a;
                tto1 gh01Var = (!(gix0Var instanceof gix0) || gix0Var.c < j) ? new gh01(jL0) : new fh01(jL0);
                boolean zG = x340Var5.g(str3);
                Object objT8 = x340Var5.T();
                if (zG || objT8 == m4cVar2) {
                    objT8 = v8r.q((Object) null);
                    x340Var5.s0(objT8);
                }
                tob1 tob1Var6 = (ven0) objT8;
                if (uh01Var.i != null) {
                    x340Var5.i0(-1045771667);
                    boolean zI6 = x340Var5.i(uh01Var) | x340Var5.g(str3) | x340Var5.i(tob1Var6);
                    Object objT9 = x340Var5.T();
                    if (zI6 || objT9 == m4cVar2) {
                        tob1Var = tob1Var6;
                        objT9 = new glu0(uh01Var, str3, tob1Var, (lnm) null, (byte) 27);
                        x340Var5.s0(objT9);
                    } else {
                        tob1Var = tob1Var6;
                    }
                    qxd0.t(str3, x340Var5, (vu30) objT9);
                    x340Var5.r(false);
                } else {
                    tob1Var = tob1Var6;
                    x340Var5.i0(-1045644815);
                    x340Var5.r(false);
                }
                jfv jfvVar = (jfv) tob1Var.getValue();
                if (jfvVar != null) {
                    z = jfv.c(gh01Var.m(), 0L) > 0 && jfv.c(jfvVar.a, gh01Var.m()) >= 0;
                } else {
                    z = false;
                }
                Object objT10 = x340Var5.T();
                if (objT10 == m4cVar2) {
                    objT10 = qxd0.M(o6x.a, x340Var5);
                    x340Var5.s0(objT10);
                }
                c9n c9nVar = (c9n) objT10;
                Object objT11 = x340Var5.T();
                if (objT11 == m4cVar2) {
                    objT11 = v8r.q((Object) null);
                    x340Var5.s0(objT11);
                }
                ven0 ven0Var = (ven0) objT11;
                boolean zI7 = x340Var5.i(ven0Var) | x340Var5.i(tob1Var5) | x340Var5.i(jjm0Var6) | x340Var5.i(c9nVar) | x340Var5.i(uh01Var) | x340Var5.i(ah01Var) | x340Var5.i(tob1VarH) | x340Var5.g(gh01Var) | x340Var5.h(z) | x340Var5.i(tob1VarG);
                Object objT12 = x340Var5.T();
                if (zI7 || objT12 == m4cVar2) {
                    tob1Var2 = tob1VarG;
                    tob1Var3 = tob1VarH;
                    z2 = z;
                    tob1Var4 = tob1Var5;
                    objT12 = new rh01(jjm0Var6, ven0Var, tob1Var4, c9nVar, uh01Var, ah01Var, gh01Var, z2, tob1Var3, tob1Var2, null);
                    jjm0Var = jjm0Var6;
                    x340Var5.s0(objT12);
                } else {
                    jjm0Var = jjm0Var6;
                    tob1Var2 = tob1VarG;
                    tob1Var3 = tob1VarH;
                    z2 = z;
                    tob1Var4 = tob1Var5;
                }
                jjm0Var.a((zu30) objT12, x340Var5, (iIntValue5 << 3) & 112);
                ph01 ph01Var = (ph01) tob1Var4.getValue();
                x440 x440Var = (x440) tob1Var3.getValue();
                boolean zBooleanValue = ((Boolean) tob1Var2.getValue()).booleanValue();
                if (ph01Var instanceof mh01) {
                    ih01Var2 = ((mh01) ph01Var).a;
                } else {
                    if (!u890.j(ph01Var, nh01.a)) {
                        if (!u890.j(ph01Var, oh01Var)) {
                            eg.o();
                            return null;
                        }
                        boolean z4 = x440Var instanceof r440;
                        ih01 ih01Var3 = hh01.a;
                        if (z4 || (x440Var instanceof w440) || (x440Var instanceof q440) || (x440Var instanceof p440) || (((gh01Var instanceof gh01) && !z2) || !zBooleanValue)) {
                            ih01Var = ih01Var3;
                        } else {
                            ih01Var2 = kh01.a;
                        }
                        x340Var5.r(false);
                        return ih01Var;
                    }
                    ih01Var2 = jh01.a;
                }
                ih01Var = ih01Var2;
                x340Var5.r(false);
                return ih01Var;
            case 10:
                ((Number) obj4).intValue();
                x340 x340Var6 = (b0k) obj3;
                x340Var6.i0(-1771826171);
                dl01 dl01VarM = kuo1.m((yk01) obj2, (Resources) ((ngs0) obj6).d);
                x340Var6.r(false);
                return dl01VarM;
            case 11:
                hl01 hl01Var = (hl01) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var7 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                ll01 ll01Var = (ll01) obj6;
                if ((iIntValue6 & 6) == 0) {
                    i = ((iIntValue6 & 8) == 0 ? x340Var7.g(hl01Var) : x340Var7.i(hl01Var) ? 4 : 2) | iIntValue6;
                } else {
                    i = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i |= x340Var7.i(iu30Var) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i & 1, (i & 147) != 146)) {
                    q7r0 q7r0VarG = ((cir0) x340Var8.k(k2r0.a)).g();
                    Object objT13 = x340Var8.T();
                    m4c m4cVar3 = fkj0.X;
                    if (objT13 == m4cVar3) {
                        objT13 = ll01Var.g.b();
                        x340Var8.s0(objT13);
                    }
                    r6h1 r6h1Var2 = (r6h1) objT13;
                    boolean zI8 = x340Var8.i(ll01Var);
                    Object objT14 = x340Var8.T();
                    if (zI8 || objT14 == m4cVar3) {
                        objT14 = new kdt0(ll01Var, (lnm) null, (byte) 10);
                        x340Var8.s0(objT14);
                    }
                    qxd0.t(rih1Var, x340Var8, (vu30) objT14);
                    boolean zI9 = x340Var8.i(ll01Var) | ((i & 112) == 32);
                    Object objT15 = x340Var8.T();
                    if (zI9 || objT15 == m4cVar3) {
                        objT15 = new b201(ll01Var, iu30Var, (lnm) null, (byte) 10);
                        x340Var8.s0(objT15);
                    }
                    qxd0.t(rih1Var, x340Var8, (vu30) objT15);
                    boolean zI10 = x340Var8.i(ll01Var) | x340Var8.i(r6h1Var2);
                    Object objT16 = x340Var8.T();
                    if (zI10 || objT16 == m4cVar3) {
                        objT16 = new j3y0(ll01Var, r6h1Var2, (byte) 25);
                        x340Var8.s0(objT16);
                    }
                    dgo1.c("receipt", (iu30) objT16, apo.r(-1920074308, new pby0((Object) hl01Var, (Object) ll01Var, iu30Var, (Object) q7r0VarG, (byte) 6), x340Var8), x340Var8, 390);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 12:
                oey0 oey0Var = (oey0) obj;
                int iIntValue7 = ((Number) obj3).intValue();
                zq01 zq01Var = oey0Var.u;
                String strG = jyo1.g(zq01Var.a, zq01Var.b, oey0Var.s, oey0Var.t);
                String str4 = oey0Var.h;
                int length = str4.length();
                brl0 brl0Var = (brl0) ((s6z0) obj6).b;
                return length == 0 ? new vtl0(Integer.valueOf(iIntValue7), strG, new mjl0(brl0Var)) : new utl0(Integer.valueOf(iIntValue7), strG, str4, new mjl0(brl0Var));
            case 13:
                bpb1 bpb1VarB = gio1.b(z6x.a);
                return new vh((Context) obj2, (ViewGroup) obj3, new ne(3, new nt01(bpb1VarB, (rt01) obj6, (byte) 2)), bpb1VarB);
            case 14:
                gyf1 gyf1Var = (gyf1) obj;
                lyf1 lyf1Var = (lyf1) obj2;
                zxf1 zxf1Var = (zxf1) obj3;
                tv80 tv80Var = (tv80) obj4;
                tkt tktVar = (tkt) obj6;
                String str5 = gyf1Var.d;
                String str6 = gyf1Var.b;
                String str7 = gyf1Var.a;
                if (zxf1Var instanceof vxf1) {
                    h011Var = new d011(str7, str6, str5, tv80Var);
                } else {
                    if (!(zxf1Var instanceof sxf1)) {
                        if (zxf1Var instanceof yxf1) {
                            String str8 = gyf1Var.g;
                            rqt0 rqt0Var = lyf1Var.d;
                            if (rqt0Var.equals(dyf1.i)) {
                                qlw0Var = plw0.a;
                            } else if (rqt0Var.equals(fyf1.i)) {
                                qlw0Var = slw0.a;
                            } else if (rqt0Var instanceof eyf1) {
                                eyf1 eyf1Var = (eyf1) rqt0Var;
                                qlw0Var = new qlw0(eyf1Var.i, eyf1Var.j);
                            } else {
                                eg.o();
                            }
                            h011Var = new h011(str7, str6, str8, qlw0Var);
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    h011Var = new yz01(str7, str5, tv80Var);
                }
                ((ak01) tktVar.c).invoke(h011Var);
                return rih1Var;
            case 15:
                ((Number) obj3).intValue();
                return new j6m0((l6m0) ((et90) obj6).b, ((f211) obj).e);
            case 16:
                dml0 dml0Var = (dml0) obj;
                ca11 ca11Var = (ca11) obj4;
                if (ca11Var instanceof ba11) {
                    return null;
                }
                if (!(ca11Var instanceof aa11)) {
                    eg.o();
                    return null;
                }
                String str9 = (String) ((pt) obj6).e;
                Set set = s4b1.f;
                String strZ = uic.x("spotify:ai-playlist:reedit:".concat(uic.x(str9).h())).z();
                if (strZ != null) {
                    return dml0Var.a(strZ);
                }
                eg.m("Required value was null.");
                return null;
            case 17:
                hh11 hh11Var = (hh11) obj;
                iu30 iu30Var2 = (iu30) obj2;
                x340 x340Var9 = (b0k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i2 = iIntValue8 | (x340Var9.g(hh11Var) ? 4 : 2);
                } else {
                    i2 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i2 |= x340Var9.i(iu30Var2) ? 32 : 16;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(i2 & 1, (i2 & 147) != 146)) {
                    jh11 jh11Var = (jh11) obj6;
                    Object objT17 = x340Var10.T();
                    if (objT17 == fkj0.X) {
                        lzn0 lzn0Var = jh11Var.b;
                        oh4 oh4Var = jh11Var.g.b;
                        mh11 mh11Var = new mh11(lzn0Var, oh4Var.i(), oh4Var.c(), jh11Var.h, jh11Var.i, jh11Var.j, jh11Var.k, oh4Var.J(), new n601(iu30Var2, (byte) 5), new vwz0(jh11Var, (byte) 16));
                        x340Var10.s0(mh11Var);
                        objT17 = mh11Var;
                    }
                    hh11Var.getClass();
                    otw.c((mh11) objT17, new lh11(hh11Var), (qim0) null, (ipb1) null, x340Var10, 6, 12);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 18:
                ni11 ni11Var = (ni11) obj2;
                c0g1 c0g1Var = (e0g1) obj3;
                tqw tqwVar = (tqw) obj4;
                ri11 ri11Var = (ri11) obj6;
                int i3 = ni11Var.b;
                if (c0g1Var instanceof d0g1) {
                    Set set2 = ri11.P0;
                    return oi11.a[l1d.C(i3)] == 1 ? new CompletableFromAction(new qi11(ri11Var, (byte) 2)) : CompletableEmpty.a;
                }
                if (c0g1Var instanceof c0g1) {
                    int iC = l1d.C(i3);
                    if (iC == 0) {
                        int i4 = (int) c0g1Var.a;
                        Set set3 = ri11.P0;
                        return new CompletableFromAction(new n68(ri11Var, i4, (byte) 1));
                    }
                    if (iC == 1) {
                        return CompletableEmpty.a;
                    }
                    if (iC == 2) {
                        Set set4 = ri11.P0;
                        return new CompletableFromAction(new qi11(ri11Var, (byte) 1));
                    }
                    eg.o();
                    return null;
                }
                if (c0g1Var instanceof b0g1) {
                    CompletableAndThenCompletable completableAndThenCompletableC = ri11Var.c.a(new i9u0(((b0g1) c0g1Var).a)).ignoreElement().c(new CompletableFromAction(new tt60(ri11Var, c0g1Var, (byte) 20)));
                    if (i3 == 3) {
                        Flowable flowable = ri11Var.a;
                        completableFlatMapCompletable = new FlowableSingleSingle(ydh.f(flowable, flowable)).flatMapCompletable(new k811(ni11Var, ri11Var, tqwVar, (byte) 4));
                    } else {
                        completableFlatMapCompletable = CompletableEmpty.a;
                    }
                    return completableAndThenCompletableC.c(completableFlatMapCompletable);
                }
                if (c0g1Var instanceof a0g1) {
                    Set set5 = ri11.P0;
                    return new CompletableFromAction(new qi11(ri11Var, (byte) 1));
                }
                if (c0g1Var instanceof zzf1) {
                    return new CompletableFromAction(new qi11(ri11Var, (byte) 0));
                }
                eg.o();
                return null;
            case 19:
                ti11 ti11Var = (ti11) obj6;
                Flowable flowable2 = ti11Var.a;
                Completable completableFlatMapCompletable2 = Single.zip(new FlowableSingleSingle(ydh.f(flowable2, flowable2)), ti11Var.t.d.firstOrError(), jcx0.f).flatMapCompletable(new hyy0(ti11Var, (tqw) obj4, (byte) 19));
                completableFlatMapCompletable2.getClass();
                return completableFlatMapCompletable2.o(Functions.h);
            case 20:
                tqw tqwVar2 = (tqw) obj4;
                xi11 xi11Var = (xi11) obj6;
                Flowable flowable3 = xi11Var.a;
                FlowableSingleSingle flowableSingleSingle = new FlowableSingleSingle(ydh.f(flowable3, flowable3));
                return Completable.m(new CompletableSource[]{flowableSingleSingle.flatMapCompletable(new uxy0(xi11Var, tqwVar2, (byte) 16)), flowableSingleSingle.map(hgx0.f).flatMapCompletable(new pux0(xi11Var, tqwVar2, (byte) 25))});
            case 21:
                ug3 ug3Var = (ug3) obj6;
                return new dv70((kly0) ug3Var.c, (ViewGroup) obj3, new ak01(ug3Var, (byte) 20), (Context) obj2, true);
            case 22:
                return new vh((Context) obj2, (w2s) obj6, (iu30) obj4);
            case 23:
                nyk0 nyk0Var = (nyk0) obj;
                r6h1 r6h1Var3 = nyk0Var.a;
                y6h1 y6h1Var3 = nyk0Var.b;
                String str10 = ((uv11) obj2).a;
                lu11 lu11VarK = ((ys11) obj6).a1.k((fe00) obj4, (unb1) obj3);
                if (lu11VarK instanceof eu11) {
                    return nyk0Var.h(str10);
                }
                if (lu11VarK instanceof gu11) {
                    return nyk0Var.a(str10);
                }
                if (lu11VarK instanceof hu11) {
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1Var3, r6h1Var3, System.currentTimeMillis());
                } else {
                    if (!(lu11VarK instanceof fu11)) {
                        if (lu11VarK instanceof iu11) {
                            return nyk0Var.g();
                        }
                        if (lu11VarK instanceof ku11) {
                            return nyk0Var.j(str10);
                        }
                        if (lu11VarK instanceof ju11) {
                            return nyk0Var.i(str10);
                        }
                        if (lu11VarK == null) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), y6h1Var3, r6h1Var3, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 24:
                Context context = (Context) obj2;
                ViewGroup viewGroup = (ViewGroup) obj3;
                iu30 iu30Var3 = (iu30) obj4;
                kt11 kt11Var = (kt11) obj6;
                ppc1 ppc1Var = kt11Var.T0;
                boolean z5 = kt11Var.R0;
                int i5 = kt11Var.g1;
                gw70 gw70Var = kt11Var.c;
                bu11 bu11Var = kt11Var.Y;
                return z5 ? new tt11(context, viewGroup, iu30Var3, gw70Var, bu11Var, kt11Var.a, kt11Var.e1, kt11Var.N0, kt11Var.O0, kt11Var.f1, kt11Var.P0, kt11Var.Q0, k4p1.E(i5), kt11Var.d, kt11Var.e, kt11Var.f, kt11Var.g, kt11Var.h, kt11Var.i, kt11Var.t, kt11Var.X, kt11Var.Y0, ppc1Var, kt11Var.U0, kt11Var.V0, kt11Var.W0, kt11Var.X0, kt11Var.a1, kt11Var.h1) : new xt11(context, viewGroup, iu30Var3, gw70Var, bu11Var, kt11Var.a, kt11Var.b, kt11Var.Z, kt11Var.e1, kt11Var.N0, kt11Var.O0, kt11Var.f1, kt11Var.P0, k4p1.E(i5), kt11Var.d, kt11Var.e, kt11Var.f, kt11Var.g, kt11Var.h, kt11Var.i, kt11Var.t, kt11Var.X, kt11Var.Q0, kt11Var.a1, kt11Var.S0, ppc1Var, kt11Var.U0, kt11Var.W0, kt11Var.Z0, kt11Var.h1);
            case 25:
                n8h1 n8h1Var = (n8h1) obj;
                unb1 unb1Var = (unb1) obj3;
                fe00 fe00Var = (fe00) obj4;
                bu11 bu11Var2 = (bu11) obj6;
                String str11 = ((uv11) obj2).a;
                if (fe00Var.equals(be00.a)) {
                    return bu11Var2.g(n8h1Var, unb1Var, str11);
                }
                if (fe00Var.equals(ce00.a)) {
                    return bu11Var2.s(n8h1Var, unb1Var, str11);
                }
                if (fe00Var.equals(de00.a)) {
                    return bu11Var2.n(n8h1Var, unb1Var, str11);
                }
                if (fe00Var.equals(ee00.a)) {
                    return bu11Var2.i(n8h1Var, unb1Var, str11);
                }
                if (fe00Var instanceof yd00) {
                    return null;
                }
                if (fe00Var.equals(zd00.a)) {
                    return bu11Var2.o(n8h1Var, str11);
                }
                if (fe00Var.equals(ae00.a)) {
                    return bu11Var2.p(n8h1Var, str11);
                }
                eg.o();
                return null;
            case 26:
                ((m221) obj6).d.d((xeq0) obj, (iu30) obj2, (qim0) null, (b0k) obj3, ((Number) obj4).intValue() & 126);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                k221 k221Var = (k221) obj;
                b0k b0kVar = (b0k) obj3;
                q221 q221Var = (q221) obj6;
                q221Var.e.f(q221Var.a.a, cwl1.o0(b0kVar, k221Var.b ? 2131961111 : 2131961110), k221Var, (iu30) obj2, (qim0) null, b0kVar, (((Number) obj4).intValue() << 6) & 8064);
                return rih1Var;
            case 28:
                jol0 jol0Var = (jol0) obj;
                String str12 = ((z521) obj6).g;
                int i6 = ((qt51) obj4).a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                String strValueOf = String.valueOf(i6);
                if (strValueOf == null) {
                    strValueOf = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("remove_items_from_playlist", 2, sqg0.J(new mmr0[]{new mmr0("number_of_items_to_remove_from_playlist", strValueOf), new mmr0("playlist", str12 != null ? str12 : "")})), jol0Var.a, jol0Var.b.b, System.currentTimeMillis());
            default:
                im0 im0Var = (im0) obj6;
                return im0Var.b.z().flatMapCompletable(new k811(im0Var, (n621) obj3, (m621) obj, (byte) 15));
        }
    }
}
