package p;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o8x extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o8x(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        pd20 pd20Var = (pd20) obj2;
        hl00 hl00Var = ((sd20) this.b).b;
        Set set = ((rd20) obj).a;
        y11 y11Var = (y11) hl00Var.b;
        Object obj4 = null;
        if (pd20Var instanceof kd20) {
            for (Object obj5 : set) {
                if (u890.j(((m620) obj5).a, ((kd20) pd20Var).a.c)) {
                    obj4 = obj5;
                    break;
                }
            }
            m620 m620Var = (m620) obj4;
            m620Var.getClass();
            y11Var.accept(new bw11(m620Var));
        } else if (pd20Var instanceof jd20) {
            for (Object obj6 : set) {
                if (u890.j(((m620) obj6).a, ((jd20) pd20Var).a.c)) {
                    obj4 = obj6;
                    break;
                }
            }
            m620 m620Var2 = (m620) obj4;
            m620Var2.getClass();
            y11Var.accept(new aw11(m620Var2));
        } else if (pd20Var instanceof nd20) {
            for (Object obj7 : set) {
                if (u890.j(((m620) obj7).a, ((nd20) pd20Var).a.c)) {
                    obj4 = obj7;
                    break;
                }
            }
            obj4.getClass();
            y11Var.accept(new fw11((m620) obj4, ((nd20) pd20Var).b.c));
        } else if (pd20Var instanceof md20) {
            for (Object obj8 : set) {
                if (u890.j(((m620) obj8).a, ((md20) pd20Var).a.c)) {
                    obj4 = obj8;
                    break;
                }
            }
            obj4.getClass();
            y11Var.accept(new ew11((m620) obj4, ((md20) pd20Var).b.c));
        } else {
            if (!pd20Var.equals(ld20.a)) {
                eg.o();
                return null;
            }
            y11Var.accept(cw11.a);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:238:0x08db  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        Function0 iqyVar;
        clj0 clj0Var;
        vjj0 vjj0Var;
        d0r d0rVar;
        String str;
        switch (this.a) {
            case 0:
                tqw tqwVar = (tqw) obj3;
                lzn0 lzn0Var = ((q8x) this.b).a;
                if (tqwVar != null) {
                    lzn0Var.a(q8x.e, n3o1.y(tqwVar), (Bundle) null);
                } else {
                    lzn0Var.h(q8x.e);
                }
                return rih1.a;
            case 1:
                tqw tqwVar2 = (tqw) obj3;
                if (m9x.a[((j9x) obj2).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                if (tqwVar2 != null) {
                    tv80 tv80VarY = n3o1.y(tqwVar2);
                    o9x o9xVar = (o9x) this.b;
                    o9xVar.d.a(o9xVar.b, tv80VarY);
                }
                return rih1.a;
            case 2:
                v9x v9xVar = (v9x) obj2;
                tqw tqwVar3 = (tqw) obj3;
                z9x z9xVar = (z9x) this.b;
                if (v9xVar.equals(t9x.a)) {
                    pcf.a(z9xVar.a, (String) z9xVar.t.getValue(), tqwVar3 != null ? n3o1.y(tqwVar3) : null, (Bundle) null);
                } else {
                    if (!v9xVar.equals(u9x.a)) {
                        eg.o();
                        return null;
                    }
                    hma1 hma1VarEdit = ((fpf) z9xVar.f.getValue()).b.edit();
                    hma1VarEdit.a(fpf.f, true);
                    hma1VarEdit.g();
                }
                return rih1.a;
            case 3:
                ifh0 ifh0Var = (ifh0) obj;
                long j = ((hjl) obj3).a;
                q5t0 q5t0VarH = ((afh0) obj2).H(j);
                ur80 ur80Var = (ur80) this.b;
                int iB = ur80Var != null ? ur80Var.b() : hjl.j(j);
                int i = q5t0VarH.b;
                int i2 = iB - i;
                return ifh0Var.S(q5t0VarH.a, i, b7x.a, new wb5(q5t0VarH, i2 < 0 ? 0 : i2, (byte) 7));
            case 4:
                vzq0 vzq0Var = (vzq0) obj;
                ((Number) obj3).intValue();
                d9y d9yVar = (d9y) this.b;
                x340 x340Var = (b0k) obj2;
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    idp idpVar = d9yVar.c;
                    d0r d0rVarC = cwl1.C(d9yVar.d);
                    a680 a680Var = (a680) idpVar.a.c;
                    jdp jdpVar = (jdp) ((jly0) a680Var.b).get();
                    jly0 jly0Var = (jly0) a680Var.c;
                    e9y e9yVar = (e9y) a680Var.a;
                    kly0 kly0Var = e9yVar.h;
                    kdp kdpVar = (kdp) jly0Var.get();
                    ldp ldpVar = (ldp) ((jly0) a680Var.d).get();
                    mdp mdpVar = (mdp) ((jly0) a680Var.e).get();
                    a1r0 a1r0Var = (a1r0) e9yVar.f.get();
                    c8o.l(a1r0Var);
                    cua cuaVar = new cua((byte) 23);
                    a9y a9yVar = (a9y) kly0Var.get();
                    c8o.l(a9yVar);
                    tl40 tl40Var = new tl40(cuaVar, a9yVar);
                    a9y a9yVar2 = (a9y) kly0Var.get();
                    c8o.l(a9yVar2);
                    tl40 tl40Var2 = new tl40(a9yVar2);
                    lnf0 lnf0Var = (lnf0) e9yVar.e.get();
                    c8o.l(lnf0Var);
                    fns fnsVar = igu.a;
                    b3s b3sVar = b3s.c;
                    zxa zxaVar = (zxa) e9yVar.a.get();
                    c8o.l(zxaVar);
                    lo9 lo9Var = new lo9(zxaVar);
                    uu00 uu00Var = (uu00) e9yVar.d.get();
                    c8o.l(uu00Var);
                    Flowable flowable = (Flowable) e9yVar.g.get();
                    c8o.l(flowable);
                    z9y z9yVar = new z9y(d0rVarC, jdpVar, kdpVar, ldpVar, mdpVar, a1r0Var, tl40Var, tl40Var2, new sp00(lnf0Var, lo9Var, uu00Var, flowable, (byte) 8));
                    x340Var.s0(z9yVar);
                    objT = z9yVar;
                }
                z9y z9yVar2 = (z9y) objT;
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    aay aayVar = d9yVar.a;
                    u9y u9yVar = new u9y(aayVar.a, aayVar.b, aayVar.c, aayVar.d);
                    x340Var.s0(u9yVar);
                    objT2 = u9yVar;
                }
                w2g0.c(u291.d(nim0.a, 1.0f), null, apo.r(-1202736778, new c9y(vzq0Var, z9yVar2, (u9y) objT2, d9yVar, (byte) 0), x340Var), x340Var, 3072, 6);
                return rih1.a;
            case 5:
                jey jeyVar = (jey) obj;
                if (((iey) obj2).equals(iey.a)) {
                    ((key) this.b).b.invoke(Integer.valueOf(jeyVar.b));
                    return rih1.a;
                }
                eg.o();
                return null;
            case 6:
                cgy cgyVar = (cgy) obj;
                tqw tqwVar4 = (tqw) obj3;
                String str2 = cgyVar.a.f;
                if (str2.length() > 0 && tqwVar4 != null) {
                    tv80 tv80VarY2 = n3o1.y(tqwVar4);
                    fgy fgyVar = (fgy) this.b;
                    String str3 = cgyVar.b;
                    if (str3.length() != 0) {
                        char c = ihc1.i0(str2, '?') ? '&' : '?';
                        str2 = str2 + c + Uri.encode("entrypointIdentifier") + "=" + Uri.encode(str3);
                    }
                    fgyVar.a.a(str2, tv80VarY2, (Bundle) null);
                }
                return rih1.a;
            case 7:
                emy emyVar = (emy) obj;
                dmy dmyVar = (dmy) obj2;
                tqw tqwVar5 = (tqw) obj3;
                if (dmyVar instanceof bmy) {
                    r1m r1mVar = ((fmy) this.b).f;
                    tv80 tv80VarY3 = tqwVar5 != null ? n3o1.y(tqwVar5) : null;
                    String str4 = emyVar.b;
                    String str5 = str4 == null ? "" : str4;
                    String str6 = emyVar.c;
                    zau0 zau0VarC = r1mVar.e;
                    if (zau0VarC == null) {
                        zau0VarC = r1mVar.a.c(false);
                        r1mVar.e = zau0VarC;
                        r1mVar.a.a(zau0VarC);
                    }
                    if (!((Boolean) zau0VarC.b.getValue()).booleanValue()) {
                        r1mVar.a.a(zau0VarC);
                    }
                    r091 r091VarR = q3p1.r(zau0VarC, r1mVar.c);
                    r1mVar.c = r091VarR;
                    xab1 xab1Var = r1mVar.d;
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                    if (r091VarR != null) {
                        r1mVar.d = fn31.T(r1mVar.b, (o8n) null, 0, new cuk(r091VarR, r1mVar, (lnm) null, (byte) 13), 3);
                        r091VarR.b(new lsm0(str5, new ksm0(new gec1("bd8def11f6974e91b43929ad588c7696"), str6, (String) null, "ChatContentPickerPreview", (String) null, (String) null, 500), false, false, (jsm0) null, 0L, (ism0) null, (String) null, false, 0, 2044));
                        r091VarR.k();
                        r091.f(r091VarR, tv80VarY3, (Long) null, sky0.a, 6);
                    }
                } else if (dmyVar instanceof amy) {
                    r1m r1mVar2 = ((fmy) this.b).f;
                    r091 r091Var = r1mVar2.c;
                    if (r091Var != null) {
                        r091Var.c();
                    }
                    r1mVar2.f.l((Object) null);
                } else {
                    if (!(dmyVar instanceof cmy)) {
                        eg.o();
                        return null;
                    }
                    int iOrdinal = emyVar.g.ordinal();
                    if (iOrdinal == 3) {
                        fmy fmyVar = (fmy) this.b;
                        fn31.T(fmyVar.b, (o8n) null, 0, new ymu(fmyVar, emyVar, null, (byte) 20), 3);
                    } else if (iOrdinal == 4) {
                        ((fmy) this.b).c.b(emyVar.c, emyVar.a);
                    }
                }
                return rih1.a;
            case 8:
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    lpy lpyVar = (lpy) this.b;
                    sgc1.l(lpyVar.c, lpyVar.k, x340Var3, 0);
                } else {
                    x340Var3.b0();
                }
                return rih1.a;
            case 9:
                wto wtoVar = (wto) obj;
                d0r d0rVar2 = (d0r) obj2;
                vto vtoVar = wtoVar.c;
                tqy tqyVar = (tqy) this.b;
                vqy vqyVar = tqyVar.b;
                String str7 = vqyVar.c;
                if (str7 == null) {
                    str7 = vtoVar != null ? vtoVar.a : null;
                    if (str7 == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                }
                String str8 = str7;
                String str9 = vtoVar != null ? vtoVar.a : null;
                sqy sqyVar = tqyVar.f;
                String str10 = wtoVar.f.c;
                if (str10 == null) {
                    str10 = "Chapter";
                }
                String str11 = str10;
                lzn0 lzn0Var2 = tqyVar.h;
                String str12 = vqyVar.a;
                qto qtoVar = wtoVar.d;
                g3d0 g3d0Var = vqyVar.d;
                Set set = vqyVar.e;
                huz huzVar = str9 != null ? new huz(str9, (byte) 10) : r6x.a;
                Set set2 = s4b1.f;
                boolean zG = uic.g(str12, blc0.ed);
                if (qtoVar instanceof qto) {
                    List list = qtoVar.a;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        z = false;
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                uto utoVar = (uto) it.next();
                                Set set3 = s4b1.f;
                                if (uic.g(utoVar.a, blc0.u1)) {
                                    z = true;
                                }
                            } else {
                                z = false;
                            }
                        }
                    }
                } else {
                    z = false;
                }
                xj20 xj20Var = xj20.e;
                flj0 flj0Var = z ? new flj0(new clj0(3), 1) : new flj0(new clj0(1), 2);
                Activity activity = sqyVar.a;
                blj0 blj0Var = zG ? new blj0(activity.getResources().getDimensionPixelSize(2131165958), new vjj0(new en6(d0rVar2, (byte) 3)), new vjj0(new gqy(sqyVar, d0rVar2)), new vjj0(new hqy(sqyVar, (byte) 0)), (vjj0) null, (vjj0) null, new klj0(true, new vjj0(new j96((Object) sqyVar, (Object) str8, (Object) set, (Object) g3d0Var, (Object) str12, (Object) d0rVar2, (byte) 12))), (vjj0) null, (vjj0) null, 432) : new blj0(activity.getResources().getDimensionPixelSize(2131165958), new vjj0(new en6(d0rVar2, (byte) 3)), new vjj0(new gqy(sqyVar, d0rVar2)), new vjj0(new hqy(sqyVar, (byte) 0)), (vjj0) null, (vjj0) null, new klj0(true, new vjj0(new j96((Object) sqyVar, (Object) str8, (Object) set, (Object) g3d0Var, (Object) str12, (Object) d0rVar2, (byte) 12))), (vjj0) null, (vjj0) null, 432);
                Set set4 = s4b1.f;
                blc0 blc0Var = blc0.M3;
                iqy iqyVar2 = uic.g(str12, blc0Var) ? new iqy(sqyVar, d0rVar2, str12, (byte) 0) : null;
                if (uic.g(str12, blc0Var)) {
                    z2 = true;
                    iqyVar = new iqy(sqyVar, d0rVar2, str12, (byte) 1);
                } else {
                    z2 = true;
                    iqyVar = null;
                }
                return new mlj0(new llj0(xj20Var, iqyVar2, iqyVar, blj0Var, new hlj0(3, z2), (vjj0) null, (vjj0) null, str11, flj0Var, new jlj0(508, (String) null, false, false, false), (nx50) null, 51090), (vjj0) null, (up11) null, new k40(sqyVar, str12, huzVar, lzn0Var2, str9, d0rVar2, (byte) 28), sqyVar.f, 1, false, (xe01) null, 2846);
            case 10:
                buy buyVar = (buy) obj;
                x340 x340Var4 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? x340Var4.g(buyVar) : x340Var4.i(buyVar) ? 4 : 2;
                }
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    gwq gwqVar = (gwq) rwq.h(buyVar.g, x340Var5, 0).getValue();
                    msy msyVar = (msy) this.b;
                    msyVar.d(24576, msyVar.c.a, gwqVar.b, x340Var5, mqo1.A(gwqVar.a), gwqVar.c);
                } else {
                    x340Var5.b0();
                }
                return rih1.a;
            case 11:
                wto wtoVar2 = (wto) obj;
                d0r d0rVar3 = (d0r) obj2;
                c7z c7zVar = (c7z) this.b;
                g4v0 g4v0Var = c7zVar.c;
                boolean z3 = c7zVar.a.t;
                boolean z4 = g4v0Var.i;
                pbq pbqVar = g4v0Var.b;
                tto ttoVar = wtoVar2.d;
                String str13 = wtoVar2.a;
                vto vtoVar2 = wtoVar2.c;
                String str14 = vtoVar2 != null ? vtoVar2.a : null;
                n3z n3zVar = (n3z) wtoVar2.e;
                String str15 = wtoVar2.f.b;
                String str16 = str15 == null ? "" : str15;
                zj20 zj20Var = zj20.e;
                boolean z5 = ttoVar instanceof qto;
                if (z5) {
                    clj0Var = new clj0(4);
                } else if (u890.j(ttoVar, sto.a)) {
                    clj0Var = dlj0.a;
                } else {
                    if (!u890.j(ttoVar, rto.a)) {
                        eg.o();
                        return null;
                    }
                    clj0Var = new clj0(1);
                }
                flj0 flj0Var2 = new flj0(clj0Var, z5 ? 1 : 2);
                String str17 = str14;
                String str18 = str16;
                g4v0 g4v0Var2 = g4v0Var;
                llj0 llj0Var = new llj0(zj20Var, (iqy) null, new odp0(g4v0Var2, d0rVar3, wtoVar2, n3zVar, (byte) 7), new blj0(0, new vjj0(new djx(pbqVar, d0rVar3, str13, (byte) 8)), new vjj0(new en6(d0rVar3, (byte) 4)), new vjj0(new f0z(pbqVar, d0rVar3, (byte) 1)), new vjj0(new uh0(pbqVar, d0rVar3, str13, str17, str16, (byte) 24)), z4 ? null : new vjj0(new lhx(pbqVar, str13, str18, rcm.a, (byte) 4)), new klj0(true, new vjj0(new nty(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x04df: CONSTRUCTOR (r25v3 'llj0Var' p.llj0) = 
                      (r26v2 'zj20Var' p.zj20)
                      (wrap p.iqy:?: CAST (p.iqy) (null p.iqy))
                      (wrap p.odp0:0x04cc: CONSTRUCTOR (r15v18 'g4v0Var2' p.g4v0), (r5v33 'd0rVar3' p.d0r), (r1v80 'wtoVar2' p.wto), (r6v20 'n3zVar' p.n3z), (7 byte) A[WRAPPED] (LINE:1229) call: p.odp0.<init>(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, byte):void type: CONSTRUCTOR)
                      (wrap p.blj0:0x0492: CONSTRUCTOR 
                      (0 int)
                      (wrap p.vjj0:0x03fe: CONSTRUCTOR 
                      (wrap p.djx:0x03fb: CONSTRUCTOR (r10v6 'pbqVar' p.pbq), (r5v33 'd0rVar3' p.d0r), (r14v18 'str13' java.lang.String), (8 byte) A[MD:(java.lang.Object, java.lang.Object, java.lang.Object, byte):void (m), WRAPPED] (LINE:1020) call: p.djx.<init>(java.lang.Object, java.lang.Object, java.lang.Object, byte):void type: CONSTRUCTOR)
                     A[WRAPPED] (LINE:1023) call: p.vjj0.<init>(p.iu30):void type: CONSTRUCTOR)
                      (wrap p.vjj0:0x0408: CONSTRUCTOR 
                      (wrap p.en6:0x0405: CONSTRUCTOR (r5v33 'd0rVar3' p.d0r), (4 byte) A[WRAPPED] (LINE:1030) call: p.en6.<init>(p.d0r, byte):void type: CONSTRUCTOR)
                     A[WRAPPED] (LINE:1033) call: p.vjj0.<init>(p.iu30):void type: CONSTRUCTOR)
                      (wrap p.vjj0:0x0412: CONSTRUCTOR 
                      (wrap p.f0z:0x040f: CONSTRUCTOR (r10v6 'pbqVar' p.pbq), (r5v33 'd0rVar3' p.d0r), (1 byte) A[MD:(java.lang.Object, java.lang.Object, byte):void (m), WRAPPED] (LINE:1040) call: p.f0z.<init>(java.lang.Object, java.lang.Object, byte):void type: CONSTRUCTOR)
                     A[WRAPPED] (LINE:1043) call: p.vjj0.<init>(p.iu30):void type: CONSTRUCTOR)
                      (wrap p.vjj0:0x0432: CONSTRUCTOR 
                      (wrap p.uh0:0x0427: CONSTRUCTOR 
                      (r10v6 'pbqVar' p.pbq)
                      (r5v33 'd0rVar3' p.d0r)
                      (r14v18 'str13' java.lang.String)
                      (r19v3 'str17' java.lang.String)
                      (r20v4 'str16' java.lang.String)
                      (24 byte)
                     A[WRAPPED] (LINE:1064) call: p.uh0.<init>(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, byte):void type: CONSTRUCTOR)
                     A[WRAPPED] (LINE:1075) call: p.vjj0.<init>(p.iu30):void type: CONSTRUCTOR)
                      (wrap p.vjj0:?: TERNARY null = ((r8v13 'z4' boolean) != false) ? (null p.vjj0) : (wrap ??:0x0453: CONSTRUCTOR 
                      (wrap p.lhx:0x044a: CONSTRUCTOR 
                      (r10v6 'pbqVar' p.pbq)
                      (r14v18 'str13' java.lang.String)
                      (r18v8 'str18' java.lang.String)
                      (wrap p.rcm:0x043c: SGET  A[WRAPPED] (LINE:1085) p.rcm.a p.rcm)
                      (4 byte)
                     A[MD:(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, byte):void (m), WRAPPED] (LINE:1099) call: p.lhx.<init>(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, byte):void type: CONSTRUCTOR)
                     A[WRAPPED] (LINE:1105) call: p.vjj0.<init>(p.iu30):void type: CONSTRUCTOR))
                      (wrap p.klj0:0x0462: CONSTRUCTOR 
                      true
                      (wrap p.vjj0:0x045e: CONSTRUCTOR 
                      (wrap p.nty:0x045b: CONSTRUCTOR (r16v7 ?? I:??[OBJECT, ARRAY]), (7 byte) A[MD:(java.lang.Object, byte):void (m), WRAPPED] (LINE:1116) call: p.nty.<init>(java.lang.Object, byte):void type: CONSTRUCTOR)
                     A[WRAPPED] (LINE:1119) call: p.vjj0.<init>(p.iu30):void type: CONSTRUCTOR)
                     A[WRAPPED] (LINE:1123) call: p.klj0.<init>(boolean, p.vjj0):void type: CONSTRUCTOR)
                      (wrap p.vjj0:?: CAST (p.vjj0) (null p.vjj0))
                      (wrap p.vjj0:?: TERNARY null = ((r8v13 'z4' boolean) != false) ? (wrap ??:0x0479: CONSTRUCTOR 
                      (wrap p.lhx:0x0471: CONSTRUCTOR 
                      (r10v6 'pbqVar' p.pbq)
                      (r14v18 'str13' java.lang.String)
                      (r18v8 'str18' java.lang.String)
                      (wrap p.tcm:0x0467: SGET  A[WRAPPED] (LINE:1128) p.tcm.a p.tcm)
                      (4 byte)
                     A[MD:(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, byte):void (m), WRAPPED] (LINE:1138) call: p.lhx.<init>(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, byte):void type: CONSTRUCTOR)
                     A[WRAPPED] (LINE:1143) call: p.vjj0.<init>(p.iu30):void type: CONSTRUCTOR) : (null p.vjj0))
                      (128 int)
                     A[WRAPPED] (LINE:1171) call: p.blj0.<init>(int, p.vjj0, p.vjj0, p.vjj0, p.vjj0, p.vjj0, p.klj0, p.vjj0, p.vjj0, int):void type: CONSTRUCTOR)
                      (wrap p.hlj0:0x04b0: CONSTRUCTOR (5 int), false A[WRAPPED] (LINE:1201) call: p.hlj0.<init>(int, boolean):void type: CONSTRUCTOR)
                      (wrap p.vjj0:?: CAST (p.vjj0) (null p.vjj0))
                      (wrap p.vjj0:?: CAST (p.vjj0) (null p.vjj0))
                      (wrap java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
                      (r4v51 'flj0Var2' p.flj0)
                      (wrap p.jlj0:0x04a5: CONSTRUCTOR 
                      (456 int)
                      (r19v3 'str17' java.lang.String)
                      false
                      (wrap boolean:0x0499: IGET (r7v18 'g4v0Var' p.g4v0) A[WRAPPED] (LINE:1178) p.g4v0.h boolean)
                      false
                     A[WRAPPED] (LINE:1190) call: p.jlj0.<init>(int, java.lang.String, boolean, boolean, boolean):void type: CONSTRUCTOR)
                      (wrap p.mx50:?: TERNARY null = ((r0v82 'z3' boolean) != false) ? (wrap ??:0x04b5: SGET  A[WRAPPED] (LINE:1206) p.mx50.a p.mx50) : (wrap ??:0x04ba: SGET  A[WRAPPED] (LINE:1211) p.lx50.a p.lx50))
                      (3990 int)
                     A[DECLARE_VAR] (LINE:1248) call: p.llj0.<init>(p.jy50, p.iqy, kotlin.jvm.functions.Function0, p.blj0, p.hlj0, p.vjj0, p.vjj0, java.lang.String, p.flj0, p.jlj0, p.nx50, int):void type: CONSTRUCTOR in method: p.o8x.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes7.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v7 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 3608
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.o8x.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }
