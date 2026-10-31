package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor$Companion;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hwd extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hwd(eme emeVar, yle yleVar, ole oleVar, tyq tyqVar) {
        super(2);
        this.a = (byte) 4;
        this.c = emeVar;
        this.d = yleVar;
        this.e = oleVar;
        this.b = tyqVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        String str;
        hof gofVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                xfo1.b((gzd) obj3, (xho) obj6, (Function0) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                nko1.s((pys0) obj3, (iu30) obj6, (cce) obj5, (qim0) obj4, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                ((ske) obj3).d((String) obj6, (c380) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                q1d0 q1d0Var = (q1d0) obj5;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarF = u291.f((qim0) obj4, 1.0f);
                    xtb0 xtb0Var = (xtb0) obj3;
                    vzq0 vzq0Var = (vzq0) obj6;
                    boolean zI = x340Var2.i(q1d0Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new xo8(q1d0Var, (byte) 4);
                        x340Var2.s0(objT);
                    }
                    ujo1.d(qim0VarF, xtb0Var, vzq0Var, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var2, 0, NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_NULL_PROCESS_BYTE_COUNTS);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0VarZ = u291.z(u291.f(anm1.N("ChaptersBottomSheet", nim0.a), 1.0f), (fra) null, 3);
                    eme emeVar = (eme) obj3;
                    yle yleVar = (yle) obj6;
                    ole oleVar = (ole) obj5;
                    tyq tyqVar = (tyq) obj4;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var4, 0);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarZ);
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
                    nko1.H(mbhVarA, x340Var4, y580.O0);
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    emeVar.d(x340Var4, 0);
                    String str2 = yleVar.a;
                    c380 c380Var = yleVar.b;
                    hvp0 hvp0Var = emeVar.h;
                    kba kbaVar = emeVar.i;
                    boolean zI2 = x340Var4.i(emeVar);
                    Object objT2 = x340Var4.T();
                    if (zI2 || objT2 == fkj0.X) {
                        objT2 = new zle(emeVar, (byte) 2);
                        x340Var4.s0(objT2);
                    }
                    h3h1 h3h1Var = new h3h1((iu30) objT2);
                    WeakHashMap weakHashMap = osl1.x;
                    pno1.a(str2, c380Var, hvp0Var, kbaVar, h3h1Var, (qim0) null, oleVar, tyqVar, poo1.x(new bgc0(lhc.g(x340Var4).g, 32), x340Var4), x340Var4, 0);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ven0 ven0Var = (ven0) obj4;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    hz5 hz5Var = ((nse) obj3).i;
                    c380 c380Var2 = (c380) obj6;
                    int iIntValue4 = ((Number) ((uhd1) obj5).d.getValue()).intValue();
                    boolean zI3 = x340Var6.i(ven0Var);
                    Object objT3 = x340Var6.T();
                    if (zI3 || objT3 == fkj0.X) {
                        objT3 = new xd2(ven0Var, (byte) 3);
                        x340Var6.s0(objT3);
                    }
                    otw.c(hz5Var, new zse(c380Var2, iIntValue4, (vu30) objT3), (qim0) null, (ipb1) null, x340Var6, 64, 12);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var7 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                c9n c9nVar = (c9n) obj6;
                Function0 function0 = (Function0) obj5;
                ryx ryxVar = (ryx) obj3;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zI4 = x340Var8.i(ryxVar) | x340Var8.g(function0) | x340Var8.i(c9nVar);
                    Object objT4 = x340Var8.T();
                    if (zI4 || objT4 == fkj0.X) {
                        objT4 = new y3f(ryxVar, function0, c9nVar, (byte) 0);
                        x340Var8.s0(objT4);
                    }
                    wro1.h(new gbx(z50.c, (Function0) objT4), ldx.c, (qim0) null, (max) null, yla.s(x340Var8), (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-818504879, new j3b((String) obj4, (byte) 15), x340Var8), x340Var8, 12582912, 6, 860);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                yto1.c((tkf) obj3, (Function0) obj5, (iu30) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                x340 x340Var9 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                goe goeVar = (goe) obj3;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ctf ctfVar = goeVar.b;
                    List list = (List) obj6;
                    String strN0 = cwl1.n0(2131961657, new Object[]{((jwm) obj5).a.b}, x340Var10);
                    if (ctfVar.equals(atf.a)) {
                        jwm jwmVar = (jwm) o7h.s0(list);
                        String str3 = jwmVar != null ? jwmVar.a.b : null;
                        if (str3 == null) {
                            strN0 = "";
                            str = strN0;
                        } else {
                            str = str3;
                        }
                    } else {
                        if (!(ctfVar instanceof btf)) {
                            eg.o();
                            return null;
                        }
                        String str4 = ((btf) ctfVar).a;
                        if (str4 == null) {
                            if (list.size() > 1) {
                                strN0 = o7h.y0(o7h.a1(list, new p0d((byte) 7)), (CharSequence) null, (String) null, (String) null, nve.e1, 31);
                            } else if (list.size() == 1) {
                                strN0 = f4i1.f(strN0, ", ", ((jwm) o7h.q0(list)).a.b);
                            }
                            str = strN0;
                        } else {
                            str = str4;
                        }
                    }
                    otw.c((mmf) obj4, new dmf(goeVar.a, goeVar.b, str, (jwm) obj5, (List) obj6, goeVar.c, goeVar.X), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var11 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj5;
                kof kofVar = (kof) obj6;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    i6o0 i6o0VarQ = k1o1.q(x340Var12);
                    Object objT5 = x340Var12.T();
                    m4c m4cVar = fkj0.X;
                    if (objT5 == m4cVar) {
                        q5p q5pVar = kofVar.g;
                        ggf ggfVar = new ggf(iu30Var, (byte) 21);
                        k42 k42Var = (k42) q5pVar.a.c;
                        h971 h971Var = (h971) ((lof) k42Var.a).b.get();
                        c8o.l(h971Var);
                        b2p b2pVar = (b2p) k42Var.d;
                        lof lofVar = (lof) k42Var.a;
                        lzn0 lzn0Var = (lzn0) b2pVar.get();
                        wn50 wn50Var = (wn50) lofVar.h.get();
                        c8o.l(wn50Var);
                        los losVar = (los) ((jly0) k42Var.f).get();
                        gv51 gv51Var = (gv51) lofVar.l.get();
                        c8o.l(gv51Var);
                        z6q z6qVar = (z6q) lofVar.s.get();
                        c8o.l(z6qVar);
                        l5p l5pVar = (l5p) ((jly0) k42Var.g).get();
                        a7q a7qVar = (a7q) lofVar.u.get();
                        c8o.l(a7qVar);
                        q8n q8nVar = (q8n) lofVar.q.get();
                        c8o.l(q8nVar);
                        q8n q8nVar2 = (q8n) lofVar.r.get();
                        c8o.l(q8nVar2);
                        w3f w3fVar = (w3f) ((jly0) k42Var.i).get();
                        m5p m5pVar = (m5p) ((jly0) k42Var.j).get();
                        cb0 cb0Var = new cb0(xqu.a((b2p) k42Var.d), (byte) 4);
                        pd71 pd71Var = (pd71) ((jly0) k42Var.h).get();
                        jjz jjzVar = (jjz) lofVar.g.get();
                        c8o.l(jjzVar);
                        joo jooVar = (joo) lofVar.w.get();
                        c8o.l(jooVar);
                        gln glnVar = new gln(h971Var, lzn0Var, wn50Var, losVar, ggfVar, gv51Var, z6qVar, l5pVar, a7qVar, i6o0VarQ, q8nVar, q8nVar2, w3fVar, m5pVar, cb0Var, pd71Var, jjzVar, jooVar);
                        i6o0VarQ = i6o0VarQ;
                        x340Var12.s0(glnVar);
                        objT5 = glnVar;
                    }
                    gln glnVar2 = (gln) objT5;
                    Object objT6 = x340Var12.T();
                    if (objT6 == m4cVar) {
                        n5p n5pVar = kofVar.f;
                        w9f w9fVar = new w9f(iu30Var, kofVar, (byte) 7);
                        k42 k42Var2 = (k42) n5pVar.a.c;
                        lnf lnfVar = (lnf) ((jly0) k42Var2.l).get();
                        jly0 jly0Var = (jly0) k42Var2.o;
                        lof lofVar2 = (lof) k42Var2.a;
                        jwf0 jwf0Var = (jwf0) jly0Var.get();
                        add addVar = (add) lofVar2.i.get();
                        c8o.l(addVar);
                        mxf0 mxf0Var = (mxf0) ((jly0) k42Var2.q).get();
                        yp71 yp71Var = (yp71) ((jly0) k42Var2.r).get();
                        tln tlnVar = (tln) lofVar2.j.get();
                        c8o.l(tlnVar);
                        z6q z6qVar2 = (z6q) lofVar2.s.get();
                        c8o.l(z6qVar2);
                        l5p l5pVar2 = (l5p) ((jly0) k42Var2.g).get();
                        q8n q8nVar3 = (q8n) lofVar2.q.get();
                        c8o.l(q8nVar3);
                        q8n q8nVar4 = (q8n) lofVar2.r.get();
                        c8o.l(q8nVar4);
                        i6o0 i6o0Var = i6o0VarQ;
                        kp71 kp71Var = new kp71(lnfVar, jwf0Var, addVar, mxf0Var, yp71Var, tlnVar, z6qVar2, l5pVar2, q8nVar3, q8nVar4, new cb0(xqu.a((b2p) k42Var2.d), (byte) 4), w9fVar, i6o0Var);
                        i6o0VarQ = i6o0Var;
                        x340Var12.s0(kp71Var);
                        objT6 = kp71Var;
                    }
                    kp71 kp71Var2 = (kp71) objT6;
                    tbr0 tbr0Var = (tbr0) obj4;
                    Object objT7 = x340Var12.T();
                    if (objT7 == m4cVar) {
                        k42 k42Var3 = (k42) kofVar.e.a.c;
                        h971 h971Var2 = (h971) ((lof) k42Var3.a).b.get();
                        c8o.l(h971Var2);
                        b2p b2pVar2 = (b2p) k42Var3.d;
                        lof lofVar3 = (lof) k42Var3.a;
                        lzn0 lzn0Var2 = (lzn0) b2pVar2.get();
                        bfd bfdVar = (bfd) lofVar3.d.get();
                        c8o.l(bfdVar);
                        gv51 gv51Var2 = (gv51) lofVar3.l.get();
                        c8o.l(gv51Var2);
                        z6q z6qVar3 = (z6q) lofVar3.s.get();
                        c8o.l(z6qVar3);
                        l5p l5pVar3 = (l5p) ((jly0) k42Var3.g).get();
                        a7q a7qVar2 = (a7q) lofVar3.u.get();
                        c8o.l(a7qVar2);
                        q8n q8nVar5 = (q8n) lofVar3.q.get();
                        c8o.l(q8nVar5);
                        q8n q8nVar6 = (q8n) lofVar3.r.get();
                        c8o.l(q8nVar6);
                        mj1 mj1Var = new mj1(h971Var2, lzn0Var2, bfdVar, gv51Var2, tbr0Var, z6qVar3, l5pVar3, a7qVar2, i6o0VarQ, q8nVar5, q8nVar6, (w3f) ((jly0) k42Var3.i).get(), (m5p) ((jly0) k42Var3.j).get());
                        x340Var12.s0(mj1Var);
                        objT7 = mj1Var;
                    }
                    mj1 mj1Var2 = (mj1) objT7;
                    eof eofVar = (eof) obj3;
                    String str5 = eofVar.a;
                    t7q0 t7q0Var = eofVar.b;
                    vub1 vub1Var = eofVar.c;
                    if (vub1Var instanceof tub1) {
                        tub1 tub1Var = (tub1) vub1Var;
                        gofVar = new hof(tub1Var.a, tub1Var.b);
                    } else if (vub1Var.equals(uub1.a)) {
                        gofVar = iof.a;
                    } else {
                        if (!(vub1Var instanceof sub1)) {
                            eg.o();
                            return null;
                        }
                        sub1 sub1Var = (sub1) vub1Var;
                        gofVar = new gof(sub1Var.a, sub1Var.b);
                    }
                    guo1.c(new fof(str5, t7q0Var, gofVar), mj1Var2, kp71Var2, glnVar2, (qim0) null, x340Var12, 0);
                    k1p1.c(kofVar.h, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                puo1.b((n9d1) obj3, (n9d1) obj6, (qim0) obj4, (j2i) obj5, (b0k) obj, czo1.p(3073));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                suo1.b((c380) obj3, (jkr0) obj6, (qim0) obj4, (j2i) obj5, (b0k) obj, czo1.p(3073));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                ((l2a) obj3).a((String) obj6, (w4i1) obj5, (c380) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                hxo1.e((quf) obj3, (Function0) obj5, (Function0) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                b2p1.b((lqg) obj3, (iac0) obj6, (khc) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                x340 x340Var13 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                xwa xwaVar = (xwa) obj5;
                q6h q6hVar = (q6h) obj3;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    c4p1.i(q6hVar.X, (qim0) null, apo.r(2063588587, new a7e(xwaVar, q6hVar, (byte) 25), x340Var14), x340Var14, 384);
                    wkt wktVar = q6hVar.f;
                    boolean zG = x340Var14.g(xwaVar) | x340Var14.g(q6hVar) | x340Var14.g((iu30) obj6) | x340Var14.g((xwa) obj4);
                    iu30 iu30Var2 = (iu30) obj6;
                    xwa xwaVar2 = (xwa) obj5;
                    xwa xwaVar3 = (xwa) obj4;
                    Object objT8 = x340Var14.T();
                    if (zG || objT8 == fkj0.X) {
                        ae1 ae1Var = new ae1(q6hVar, iu30Var2, xwaVar2, xwaVar3, (lnm) null, (byte) 3);
                        x340Var14.s0(ae1Var);
                        objT8 = ae1Var;
                    }
                    qxd0.t(wktVar, x340Var14, (vu30) objT8);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                t8p1.d((zph) obj3, (xtb0) obj6, (Function0) obj5, (j2i) obj4, (b0k) obj, czo1.p(3073));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                dro.f((igm) obj3, (yim) obj6, (qim0) obj4, (iu30) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                ((txj) obj3).f((Function0) obj5, (iu30) obj6, (j2i) obj4, (b0k) obj, czo1.p(3463));
                return rih1Var;
            case 19:
                x340 x340Var15 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    lyg.d((obk) ((tob1) obj3).getValue(), (iu30) ((tob1) obj6).getValue(), (lbs) obj5, (d0r) obj4, (qim0) null, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 20:
                x340 x340Var17 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                tbk tbkVar = (tbk) obj3;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(1580057557, new k40(tbkVar, (gw70) obj6, rwq.h((wen0) tbkVar.a.getValue(), x340Var18, 0), rwq.h((wen0) tbkVar.b.getValue(), x340Var18, 0), (lbs) obj5, (d0r) obj4, (byte) 18), x340Var18), x340Var18, 3078, 6);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                ((Number) obj2).intValue();
                aym.d((hqk) obj3, (znb0) obj6, (iu30) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                mym.a((uek) obj3, (Function0) obj5, (Function0) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                x340 x340Var19 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    kly0 kly0Var = (kly0) ((ldo) obj3).d;
                    kkn.c((ffk) obj6, (iu30) obj5, kly0Var != null ? (aod0) kly0Var.get() : null, (qim0) null, (yqg) obj4, x340Var20, NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                ((Number) obj2).intValue();
                ((i7d) obj3).f((zj51) obj6, (iu30) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                ((Number) obj2).intValue();
                ((g1i) obj3).d((gpk) obj6, (iu30) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                c680.e((iuk) obj3, (Function0) obj5, (Function0) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                u7n0.b((q32) obj3, (Function0) obj5, (Function0) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                fn31.c((vcl) obj3, (String) obj6, (Function0) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                jo31.a((String) obj3, (kb4) obj6, (pdl) obj4, (Function0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hwd(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hwd(Object obj, Object obj2, Object obj3, cv30 cv30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = cv30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hwd(Object obj, Function0 function0, cv30 cv30Var, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.e = function0;
        this.d = cv30Var;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hwd(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hwd(ryx ryxVar, Function0 function0, c9n c9nVar, String str) {
        super(2);
        this.a = (byte) 6;
        this.c = ryxVar;
        this.e = function0;
        this.d = c9nVar;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hwd(qim0 qim0Var, xtb0 xtb0Var, vzq0 vzq0Var, q1d0 q1d0Var) {
        super(2);
        this.a = (byte) 3;
        this.b = qim0Var;
        this.c = xtb0Var;
        this.d = vzq0Var;
        this.e = q1d0Var;
    }
}
