package p;

import com.spotify.allboarding.contextualaudio.presentation.ContextualAudioFragment;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mzj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzj(ljk ljkVar, tob1 tob1Var, tob1 tob1Var2) {
        super(2);
        this.a = (byte) 9;
        this.d = ljkVar;
        this.b = tob1Var;
        this.c = tob1Var2;
    }

    private final Object a(Object obj, Object obj2) {
        ArrayList arrayList;
        Integer numValueOf;
        Integer numValueOf2;
        tlc1 tlc1Var = (tlc1) obj;
        long j = ((hjl) obj2).a;
        long jB = hjl.b(j, 0, 0, 0, 0, 11);
        vu30 vu30Var = (vu30) this.b;
        ArrayList arrayList2 = z6x.a;
        if (vu30Var != null) {
            List listP = tlc1Var.P("sourceChips", vu30Var);
            arrayList = new ArrayList(q7h.U(listP, 10));
            Iterator it = listP.iterator();
            while (it.hasNext()) {
                arrayList.add(((afh0) it.next()).H(jB));
            }
        } else {
            arrayList = arrayList2;
        }
        vu30 vu30Var2 = (vu30) this.c;
        if (vu30Var2 != null) {
            List listP2 = tlc1Var.P("richContent", vu30Var2);
            arrayList2 = new ArrayList(q7h.U(listP2, 10));
            Iterator it2 = listP2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((afh0) it2.next()).H(jB));
            }
        }
        ArrayList arrayList3 = arrayList2;
        Iterator it3 = arrayList.iterator();
        Integer num = null;
        if (it3.hasNext()) {
            numValueOf = Integer.valueOf(((q5t0) it3.next()).b);
            while (it3.hasNext()) {
                Integer numValueOf3 = Integer.valueOf(((q5t0) it3.next()).b);
                if (numValueOf.compareTo(numValueOf3) < 0) {
                    numValueOf = numValueOf3;
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        Iterator it4 = arrayList3.iterator();
        if (it4.hasNext()) {
            numValueOf2 = Integer.valueOf(((q5t0) it4.next()).b);
            while (it4.hasNext()) {
                Integer numValueOf4 = Integer.valueOf(((q5t0) it4.next()).b);
                if (numValueOf2.compareTo(numValueOf4) < 0) {
                    numValueOf2 = numValueOf4;
                }
            }
        } else {
            numValueOf2 = null;
        }
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
        int iH = hjl.h(j) - (iIntValue + iIntValue2);
        long jB2 = hjl.b(jB, 0, 0, 0, iH < 0 ? 0 : iH, 7);
        List listP3 = tlc1Var.P("text", (j2i) this.d);
        ArrayList arrayList4 = new ArrayList(q7h.U(listP3, 10));
        Iterator it5 = listP3.iterator();
        while (it5.hasNext()) {
            arrayList4.add(((afh0) it5.next()).H(jB2));
        }
        Iterator it6 = arrayList4.iterator();
        if (it6.hasNext()) {
            Integer numValueOf5 = Integer.valueOf(((q5t0) it6.next()).b);
            loop3: while (true) {
                num = numValueOf5;
                do {
                    if (!it6.hasNext()) {
                        break loop3;
                    }
                    numValueOf5 = Integer.valueOf(((q5t0) it6.next()).b);
                } while (num.compareTo(numValueOf5) >= 0);
            }
        }
        int iIntValue3 = num != null ? num.intValue() : 0;
        return tlc1Var.S(hjl.i(j), iIntValue3 + iIntValue + iIntValue2, b7x.a, new hh6(arrayList4, iIntValue3, arrayList, iIntValue, arrayList3));
    }

    private final Object d(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("CONTEXT_MENU_LOADED_TEST_TAG", nim0Var);
            cfm cfmVar = (cfm) this.b;
            pem pemVar = (pem) this.c;
            Map map = (Map) this.d;
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarH = l6o1.H(nim0Var, l6o1.C(0, 0, 1, x340Var2), false, 14);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarH);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            cfmVar.h(pemVar, x340Var2, 0);
            rqo1.g(0, 1, x340Var2, (qim0) null);
            x340Var2.r(true);
            cfmVar.i(pemVar, map, (qim0) null, x340Var2, 0);
            if (map.isEmpty()) {
                x340Var2.i0(1235171495);
                x340Var2.r(false);
            } else {
                x340Var2.i0(1235029267);
                y441 y441Var = cfmVar.e;
                gu61 gu61Var = pemVar.g;
                boolean zG = x340Var2.g(map);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    objT = new csb(map, (byte) 2);
                    x340Var2.s0(objT);
                }
                y441Var.b(gu61Var, (iu30) objT, x340Var2, 512);
                x340Var2.r(false);
            }
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            qlb qlbVar = (qlb) this.b;
            gxm gxmVar = (gxm) this.c;
            otw.c(qlbVar, new eyg(gxmVar.b, gxmVar.a, ((jxm) this.d).a), (qim0) null, (ipb1) null, x340Var2, 0, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = 0;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            gym gymVar = (gym) this.b;
            c380 c380Var = gymVar.b;
            tyq tyqVar = (tyq) this.c;
            d0r d0rVar = (d0r) this.d;
            for (Object obj3 : c380Var) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                String str = (String) obj3;
                Integer numValueOf = Integer.valueOf(i);
                boolean zE = x340Var2.e(i);
                Object objT = x340Var2.T();
                if (zE || objT == fkj0.X) {
                    objT = new uv4(i, (byte) 12);
                    x340Var2.s0(objT);
                }
                dgo1.c(numValueOf, (iu30) objT, apo.r(-1834544402, new n7m(tyqVar, str, gymVar, d0rVar, (byte) 6), x340Var2), x340Var2, 384);
                i = i2;
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            xcn xcnVar = (xcn) ((cdn) this.b).f.get();
            adn adnVar = (adn) this.c;
            adnVar.getClass();
            xcnVar.a(adnVar, (iu30) this.d, (qim0) null, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            fm50 fm50Var = (fm50) this.b;
            zkn zknVar = (zkn) this.c;
            w4i1 w4i1Var = zknVar.i;
            String str = w4i1Var.b;
            String str2 = w4i1Var.a;
            f7q0 f7q0Var = zknVar.c;
            f7q0 f7q0Var2 = f7q0Var instanceof f7q0 ? f7q0Var : null;
            otw.c(fm50Var, new bm50(9, f7q0Var2 != null ? f7q0Var2.a : null, str2, str, (String) ((ven0) this.d).getValue()), (qim0) null, (ipb1) null, x340Var2, 0, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    public final Object invoke(Object obj, Object obj2) {
        long j;
        long j2;
        long j3;
        byte b = this.a;
        ngv ngvVar = ngv.d;
        nim0 nim0Var = nim0.a;
        n4k n4kVar = hmb0.t1;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object value = ((tob1) obj3).getValue();
                    if (value == null) {
                        x340Var2.i0(-1271157282);
                    } else {
                        x340Var2.i0(-1271157281);
                        ((j2i) obj4).J(value, (iu30) ((tob1) obj5).getValue(), x340Var2, 0);
                    }
                    x340Var2.r(false);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                fq7.q((uyl) obj3, (uyl) obj5, (uyl) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                sqe.c((b6k) obj3, (iu30) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                u7h u7hVar = (u7h) obj4;
                i5d i5dVar = (i5d) obj3;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    af5 af5Var = i5dVar.a;
                    af5 af5Var2 = i5dVar.e;
                    f7d f7dVar = i5dVar.j;
                    if (af5Var.b.length() <= 0 && f7dVar == null) {
                        x340Var4.i0(271086732);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(270356961);
                        fra fraVar = een.N0;
                        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                        jw31 jw31VarA = ew31.a(h36.g, fraVar, x340Var4, 0);
                        int iHashCode = Long.hashCode(x340Var4.T);
                        xos0 xos0VarM = x340Var4.m();
                        qim0 qim0VarE = zr7.E(x340Var4, qim0VarF);
                        hzj.A.getClass();
                        if (x340Var4.a == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var4.m0();
                        if (x340Var4.S) {
                            x340Var4.l(n4kVar);
                        } else {
                            x340Var4.v0();
                        }
                        nko1.H(jw31VarA, x340Var4, y580.O0);
                        nko1.H(xos0VarM, x340Var4, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                        nko1.F(x340Var4);
                        nko1.H(qim0VarE, x340Var4, y580.Y);
                        af5 af5Var3 = i5dVar.a;
                        uwr uwrVar = cbx.a;
                        lee1 lee1Var = cbx.d(x340Var4).k;
                        zma1 zma1Var = gf5.a;
                        ef5 ef5Var = new ef5(lee1Var, (byte) 0);
                        ye5 ye5Var = new ye5(af5Var3);
                        ye5Var.i(ef5Var);
                        af5 af5VarP = ye5Var.p();
                        lee1 lee1Var2 = cbx.d(x340Var4).j;
                        u7h u7hVar2 = i5dVar.b;
                        if (u7hVar2 == null) {
                            u7hVar2 = u7hVar;
                        }
                        if (u7hVar2 == null) {
                            x340Var4.i0(26392478);
                            j = cbx.a(x340Var4).b.b;
                            x340Var4.r(false);
                        } else {
                            x340Var4.i0(26388913);
                            x340Var4.r(false);
                            j = u7hVar2.a;
                        }
                        uwo1.d(af5VarP, j, new wnb0(1.0f, true), lee1Var2, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, (cqs0) null, x340Var4, 0, 0, 3760);
                        if (f7dVar == null) {
                            x340Var4.i0(818362646);
                        } else {
                            x340Var4.i0(818362647);
                            w6k.g(f7dVar, x340Var4, 0);
                        }
                        x340Var4.r(false);
                        x340Var4.r(true);
                        x340Var4.r(false);
                    }
                    int length = ((af5) obj5).b.length();
                    bjc0 bjc0Var = bjc0.a;
                    if (length > 0) {
                        x340Var4.i0(271203912);
                        uwr uwrVar2 = cbx.a;
                        lee1 lee1Var3 = cbx.d(x340Var4).h;
                        u7h u7hVar3 = i5dVar.d;
                        if (u7hVar3 != null) {
                            u7hVar = u7hVar3;
                        }
                        if (u7hVar == null) {
                            x340Var4.i0(840038458);
                            j3 = cbx.a(x340Var4).b.a;
                            x340Var4.r(false);
                        } else {
                            x340Var4.i0(840036226);
                            x340Var4.r(false);
                            j3 = u7hVar.a;
                        }
                        uwo1.d((af5) obj5, j3, u291.f(nim0Var, 1.0f), lee1Var3, (a0e1) null, (iu30) null, 2, false, bjc0Var, 0, (qx8) null, (cqs0) null, x340Var4, 0, 0, 3760);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(271557932);
                        x340Var4.r(false);
                    }
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    op71.g(x340Var4, u291.h(nim0Var, 8.0f));
                    if (af5Var2.b.length() > 0) {
                        x340Var4.i0(271754100);
                        lee1 lee1Var4 = cbx.d(x340Var4).n;
                        zma1 zma1Var2 = gf5.a;
                        ef5 ef5Var2 = new ef5(lee1Var4, (byte) 0);
                        ye5 ye5Var2 = new ye5(af5Var2);
                        ye5Var2.i(ef5Var2);
                        af5 af5VarP2 = ye5Var2.p();
                        lee1 lee1Var5 = cbx.d(x340Var4).m;
                        u7h u7hVar4 = i5dVar.f;
                        if (u7hVar4 == null) {
                            x340Var4.i0(840056826);
                            j2 = cbx.a(x340Var4).b.a;
                            x340Var4.r(false);
                        } else {
                            x340Var4.i0(840055276);
                            x340Var4.r(false);
                            j2 = u7hVar4.a;
                        }
                        uwo1.d(af5VarP2, j2, u291.f(nim0Var, 1.0f), lee1Var5, (a0e1) null, (iu30) null, 2, false, bjc0Var, 0, (qx8) null, (cqs0) null, x340Var4, 0, 0, 3760);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(272127340);
                        x340Var4.r(false);
                    }
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                pt ptVar = (pt) obj5;
                a9k a9kVar = (a9k) obj3;
                m4c m4cVar = fkj0.X;
                iu30 iu30Var = (iu30) obj4;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    f8k f8kVar = a9kVar.j;
                    if (f8kVar == null) {
                        x340Var6.i0(-265908039);
                        x340Var6.r(false);
                    } else {
                        x340Var6.i0(-265908038);
                        p9k p9kVar = (p9k) ((idd1) ptVar.f).getValue();
                        String str = f8kVar.a;
                        String str2 = f8kVar.b;
                        String strO0 = cwl1.o0(x340Var6, 2131954185);
                        boolean zG = x340Var6.g(iu30Var);
                        Object objT = x340Var6.T();
                        if (zG || objT == m4cVar) {
                            objT = new erj(iu30Var, (byte) 14);
                            x340Var6.s0(objT);
                        }
                        Function0 function0 = (Function0) objT;
                        boolean zG2 = x340Var6.g(iu30Var);
                        Object objT2 = x340Var6.T();
                        if (zG2 || objT2 == m4cVar) {
                            objT2 = new erj(iu30Var, (byte) 15);
                            x340Var6.s0(objT2);
                        }
                        otw.c(p9kVar, new o9k(str, str2, strO0, function0, (Function0) objT2), (qim0) null, (ipb1) null, x340Var6, 8, 12);
                        x340Var6.r(false);
                    }
                    yqg yqgVar = (yqg) ptVar.d;
                    boolean zG3 = x340Var6.g(iu30Var);
                    Object objT3 = x340Var6.T();
                    if (zG3 || objT3 == m4cVar) {
                        objT3 = new erj(iu30Var, (byte) 16);
                        x340Var6.s0(objT3);
                    }
                    Function0 function1 = (Function0) objT3;
                    boolean zG4 = x340Var6.g(iu30Var);
                    Object objT4 = x340Var6.T();
                    if (zG4 || objT4 == m4cVar) {
                        objT4 = new erj(iu30Var, (byte) 17);
                        x340Var6.s0(objT4);
                    }
                    Function0 function2 = (Function0) objT4;
                    boolean zG5 = x340Var6.g(iu30Var);
                    Object objT5 = x340Var6.T();
                    if (zG5 || objT5 == m4cVar) {
                        objT5 = new erj(iu30Var, (byte) 18);
                        x340Var6.s0(objT5);
                    }
                    Function0 function3 = (Function0) objT5;
                    boolean zG6 = x340Var6.g(iu30Var);
                    Object objT6 = x340Var6.T();
                    if (zG6 || objT6 == m4cVar) {
                        objT6 = new erj(iu30Var, (byte) 19);
                        x340Var6.s0(objT6);
                    }
                    Function0 function4 = (Function0) objT6;
                    boolean zG7 = x340Var6.g(iu30Var);
                    Object objT7 = x340Var6.T();
                    if (zG7 || objT7 == m4cVar) {
                        objT7 = new usj(iu30Var, (byte) 8);
                        x340Var6.s0(objT7);
                    }
                    iu30 iu30Var2 = (iu30) objT7;
                    boolean zG8 = x340Var6.g(iu30Var) | x340Var6.i(a9kVar);
                    Object objT8 = x340Var6.T();
                    if (zG8 || objT8 == m4cVar) {
                        objT8 = new gmj(iu30Var, a9kVar, (byte) 6);
                        x340Var6.s0(objT8);
                    }
                    Function0 function5 = (Function0) objT8;
                    boolean zG9 = x340Var6.g(iu30Var);
                    Object objT9 = x340Var6.T();
                    if (zG9 || objT9 == m4cVar) {
                        objT9 = new usj(iu30Var, (byte) 9);
                        x340Var6.s0(objT9);
                    }
                    iu30 iu30Var3 = (iu30) objT9;
                    boolean zG10 = x340Var6.g(iu30Var);
                    Object objT10 = x340Var6.T();
                    if (zG10 || objT10 == m4cVar) {
                        objT10 = new v0j(iu30Var, (byte) 14);
                        x340Var6.s0(objT10);
                    }
                    w6k.b(a9kVar, yqgVar, function1, function2, function3, function4, iu30Var2, function5, (qim0) null, iu30Var3, (vu30) objT10, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                lyg.a((obk) obj3, (iu30) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                qj0 qj0Var = (qj0) obj4;
                iu30 iu30Var4 = (iu30) obj5;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    bek bekVar = (bek) obj3;
                    boolean zG11 = x340Var8.g(iu30Var4) | x340Var8.g(qj0Var);
                    Object objT11 = x340Var8.T();
                    if (zG11 || objT11 == fkj0.X) {
                        objT11 = new gmj(iu30Var4, qj0Var, (byte) 12);
                        x340Var8.s0(objT11);
                    }
                    dek.a(bekVar, (Function0) objT11, (qim0) null, x340Var8, 48);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                dek.a((bek) obj3, (Function0) obj5, (qim0) obj4, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 8:
                uek uekVar = (uek) obj3;
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                iu30 iu30Var5 = (iu30) obj5;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    int iC = l1d.C(uekVar.i);
                    if (iC == 1) {
                        x340Var10.i0(-688704114);
                        boolean zG12 = x340Var10.g(iu30Var5);
                        Object objT12 = x340Var10.T();
                        if (zG12 || objT12 == m4cVar2) {
                            objT12 = new lck(iu30Var5, (byte) 2);
                            x340Var10.s0(objT12);
                        }
                        Function0 function6 = (Function0) objT12;
                        boolean zG13 = x340Var10.g(iu30Var5);
                        Object objT13 = x340Var10.T();
                        if (zG13 || objT13 == m4cVar2) {
                            objT13 = new lck(iu30Var5, (byte) 3);
                            x340Var10.s0(objT13);
                        }
                        qxd0.G(uekVar, function6, (Function0) objT13, ((wek) obj4).d, (qim0) null, x340Var10, 0);
                        x340Var10.r(false);
                    } else if (iC != 2) {
                        x340Var10.i0(-688330967);
                        boolean zG14 = x340Var10.g(iu30Var5);
                        Object objT14 = x340Var10.T();
                        if (zG14 || objT14 == m4cVar2) {
                            objT14 = new lck(iu30Var5, (byte) 4);
                            x340Var10.s0(objT14);
                        }
                        Function0 function7 = (Function0) objT14;
                        boolean zG15 = x340Var10.g(iu30Var5);
                        Object objT15 = x340Var10.T();
                        if (zG15 || objT15 == m4cVar2) {
                            objT15 = new lck(iu30Var5, (byte) 5);
                            x340Var10.s0(objT15);
                        }
                        mym.a(uekVar, function7, (Function0) objT15, (qim0) null, x340Var10, 0);
                        x340Var10.r(false);
                    } else {
                        x340Var10.i0(-688446380);
                        boolean zG16 = x340Var10.g(iu30Var5);
                        Object objT16 = x340Var10.T();
                        if (zG16 || objT16 == m4cVar2) {
                            objT16 = new usj(iu30Var5, (byte) 12);
                            x340Var10.s0(objT16);
                        }
                        k1u.e(uekVar, (iu30) objT16, (qim0) null, x340Var10, 0);
                        x340Var10.r(false);
                    }
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                ljk ljkVar = (ljk) obj4;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ljkVar.d.c((nkk) ((tob1) obj3).getValue(), ljkVar.b, (iu30) ((tob1) obj5).getValue(), (qim0) null, x340Var12, 8);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                eok eokVar = (gok) obj3;
                m4c m4cVar3 = fkj0.X;
                iu30 iu30Var6 = (iu30) obj4;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    List list = eokVar.c;
                    xnk xnkVarA = ((ynk) ((tm) obj5).d).a();
                    boolean zG17 = x340Var14.g(iu30Var6) | x340Var14.i(eokVar);
                    Object objT17 = x340Var14.T();
                    if (zG17 || objT17 == m4cVar3) {
                        objT17 = new gmj(iu30Var6, eokVar, (byte) 13);
                        x340Var14.s0(objT17);
                    }
                    Function0 function8 = (Function0) objT17;
                    boolean zG18 = x340Var14.g(iu30Var6);
                    Object objT18 = x340Var14.T();
                    if (zG18 || objT18 == m4cVar3) {
                        objT18 = new usj(iu30Var6, (byte) 15);
                        x340Var14.s0(objT18);
                    }
                    iu30 iu30Var7 = (iu30) objT18;
                    boolean zG19 = x340Var14.g(iu30Var6);
                    Object objT19 = x340Var14.T();
                    if (zG19 || objT19 == m4cVar3) {
                        objT19 = new usj(iu30Var6, (byte) 16);
                        x340Var14.s0(objT19);
                    }
                    iu30 iu30Var8 = (iu30) objT19;
                    boolean zG20 = x340Var14.g(iu30Var6);
                    Object objT20 = x340Var14.T();
                    if (zG20 || objT20 == m4cVar3) {
                        objT20 = new lck(iu30Var6, (byte) 7);
                        x340Var14.s0(objT20);
                    }
                    yto.b(list, xnkVarA, function8, iu30Var7, (qim0) null, iu30Var8, (Function0) objT20, x340Var14, 0);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                ((g1i) obj3).g((iye1) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                k1u.e((uek) obj3, (iu30) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                vpb1.a((xrd) obj3, (qim0) obj5, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    mod.c(new ely0[]{gde0.a.a((d0r) obj3), o0r.a.a((uq8) obj5)}, apo.r(-1731418477, new pu2((j2i) obj4, (byte) 14), x340Var16), x340Var16, 56);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ttj ttjVar = (ttj) obj5;
                    qxl qxlVar = (qxl) obj4;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var18.T);
                    xos0 xos0VarM2 = x340Var18.m();
                    qim0 qim0VarE2 = zr7.E(x340Var18, (qim0) obj3);
                    hzj.A.getClass();
                    if (x340Var18.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var18.m0();
                    if (x340Var18.S) {
                        x340Var18.l(n4kVar);
                    } else {
                        x340Var18.v0();
                    }
                    nko1.H(gfh0VarC, x340Var18, y580.O0);
                    nko1.H(xos0VarM2, x340Var18, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var18, y580.R0);
                    nko1.F(x340Var18);
                    nko1.H(qim0VarE2, x340Var18, y580.Y);
                    ttjVar.a(qxlVar, (dp5) null, x340Var18, 0);
                    x340Var18.r(true);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 16:
                return ((hrk) obj3).b((zob1) obj, (iac0) obj2, (xk00) obj5, ((ji50) obj4).a);
            case 17:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    twl twlVar = (twl) obj3;
                    kwl kwlVar = (kwl) obj5;
                    iu30 iu30Var9 = (iu30) obj4;
                    gfh0 gfh0VarC2 = t1c.c(een.X, false);
                    int iHashCode3 = Long.hashCode(x340Var20.T);
                    xos0 xos0VarM3 = x340Var20.m();
                    qim0 qim0VarE3 = zr7.E(x340Var20, qim0VarD);
                    hzj.A.getClass();
                    if (x340Var20.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var20.m0();
                    if (x340Var20.S) {
                        x340Var20.l(n4kVar);
                    } else {
                        x340Var20.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var20, y580.O0);
                    nko1.H(xos0VarM3, x340Var20, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var20, y580.R0);
                    nko1.F(x340Var20);
                    nko1.H(qim0VarE3, x340Var20, y580.Y);
                    j2i j2iVarR = apo.r(-1504673065, new v08(kwlVar, (byte) 10), x340Var20);
                    uwr uwrVar4 = cbx.a;
                    fq7.g(twlVar instanceof swl, (qim0) null, xay.e(2, irn1.o0(jfv.t(cbx.c(x340Var20).b.d, ngvVar), 0, ((jhx) cbx.c(x340Var20).a.b).b, 2)), xay.f(2, irn1.o0(jfv.t(cbx.c(x340Var20).b.d, ngvVar), 0, ((jhx) cbx.c(x340Var20).a.c).b, 2)), (String) null, apo.r(-1519388053, new jwl(twlVar, j2iVarR, (byte) 0), x340Var20), x340Var20, 196608, 18);
                    fq7.g(twlVar instanceof rwl, (qim0) null, xay.e(2, irn1.o0(jfv.t(cbx.c(x340Var20).b.d, ngvVar), 0, ((jhx) cbx.c(x340Var20).a.b).b, 2)), xay.f(2, irn1.o0(jfv.t(cbx.c(x340Var20).b.d, ngvVar), 0, ((jhx) cbx.c(x340Var20).a.c).b, 2)), (String) null, apo.r(-1519388053, new jwl(twlVar, apo.r(1376672522, new v08(kwlVar, (byte) 11), x340Var20), (byte) 1), x340Var20), x340Var20, 196608, 18);
                    fq7.g(twlVar instanceof qwl, (qim0) null, xay.e(2, irn1.o0(jfv.t(cbx.c(x340Var20).b.d, ngvVar), 0, ((jhx) cbx.c(x340Var20).a.b).b, 2)), xay.f(2, irn1.o0(jfv.t(cbx.c(x340Var20).b.d, ngvVar), 0, ((jhx) cbx.c(x340Var20).a.c).b, 2)), (String) null, apo.r(-1519388053, new jwl(twlVar, apo.r(-1843211022, new t7i(iu30Var9, kwlVar, (byte) 1), x340Var20), (byte) 2), x340Var20), x340Var20, 196608, 18);
                    x340Var20.r(true);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    twl twlVar2 = (twl) obj3;
                    uwl uwlVar = (uwl) obj5;
                    iu30 iu30Var10 = (iu30) obj4;
                    gfh0 gfh0VarC3 = t1c.c(een.X, false);
                    int iHashCode4 = Long.hashCode(x340Var22.T);
                    xos0 xos0VarM4 = x340Var22.m();
                    qim0 qim0VarE4 = zr7.E(x340Var22, qim0VarD2);
                    hzj.A.getClass();
                    if (x340Var22.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var22.m0();
                    if (x340Var22.S) {
                        x340Var22.l(n4kVar);
                    } else {
                        x340Var22.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var22, y580.O0);
                    nko1.H(xos0VarM4, x340Var22, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode4), x340Var22, y580.R0);
                    nko1.F(x340Var22);
                    nko1.H(qim0VarE4, x340Var22, y580.Y);
                    j2i j2iVarR2 = apo.r(736175299, new v08(uwlVar, (byte) 12), x340Var22);
                    uwr uwrVar5 = cbx.a;
                    fq7.g(twlVar2 instanceof swl, (qim0) null, xay.e(2, irn1.o0(jfv.t(cbx.c(x340Var22).b.d, ngvVar), 0, ((jhx) cbx.c(x340Var22).a.b).b, 2)), xay.f(2, irn1.o0(jfv.t(cbx.c(x340Var22).b.d, ngvVar), 0, ((jhx) cbx.c(x340Var22).a.c).b, 2)), (String) null, apo.r(-1519388053, new jwl(twlVar2, j2iVarR2, (byte) 3), x340Var22), x340Var22, 196608, 18);
                    fq7.g(twlVar2 instanceof rwl, (qim0) null, xay.e(2, irn1.o0(jfv.t(cbx.c(x340Var22).b.d, ngvVar), 0, ((jhx) cbx.c(x340Var22).a.b).b, 2)), xay.f(2, irn1.o0(jfv.t(cbx.c(x340Var22).b.d, ngvVar), 0, ((jhx) cbx.c(x340Var22).a.c).b, 2)), (String) null, apo.r(-1519388053, new jwl(twlVar2, apo.r(-1226317834, new v08(uwlVar, (byte) 13), x340Var22), (byte) 4), x340Var22), x340Var22, 196608, 18);
                    fq7.g(twlVar2 instanceof qwl, (qim0) null, xay.e(2, irn1.o0(jfv.t(cbx.c(x340Var22).b.d, ngvVar), 0, ((jhx) cbx.c(x340Var22).a.b).b, 2)), xay.f(2, irn1.o0(jfv.t(cbx.c(x340Var22).b.d, ngvVar), 0, ((jhx) cbx.c(x340Var22).a.c).b, 2)), (String) null, apo.r(-1519388053, new jwl(twlVar2, apo.r(-211238434, new t7i(iu30Var10, uwlVar, (byte) 2), x340Var22), (byte) 5), x340Var22), x340Var22, 196608, 18);
                    x340Var22.r(true);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return a(obj, obj2);
            case 20:
                ((Number) obj2).intValue();
                bzn1.b((lik1) obj3, (String) obj5, (idm) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                return d(obj, obj2);
            case 22:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                ContextualAudioFragment contextualAudioFragment = (ContextualAudioFragment) obj3;
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    kdn0 kdn0Var = contextualAudioFragment.Z0().e;
                    cp41 cp41Var = rmm.g;
                    np41 np41Var = (np41) b2p1.B(kdn0Var, cp41Var, x340Var24, 0).getValue();
                    cp41 cp41Var2 = np41Var instanceof cp41 ? (cp41) np41Var : null;
                    if (cp41Var2 != null) {
                        cp41Var = cp41Var2;
                    }
                    kiv kivVar = oi7.a;
                    gw70 gw70Var = contextualAudioFragment.I1;
                    if (gw70Var == null) {
                        u890.C("imageLoader");
                        throw null;
                    }
                    mod.b(kivVar.a(gw70Var), apo.r(-729451878, new hmm(cp41Var, (wet0) obj5, (odh0) obj4, (byte) 2), x340Var24), x340Var24, 56);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                ((pt) obj3).m((List) obj5, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                iho1.b((w4i1) obj3, (qim0) obj5, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                return e(obj, obj2);
            case 26:
                return f(obj, obj2);
            case 27:
                return g(obj, obj2);
            case 28:
                return h(obj, obj2);
            default:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                iu30 iu30Var11 = (iu30) obj4;
                String str3 = (String) obj5;
                x340 x340Var26 = x340Var25;
                if (!x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x340Var26.b0();
                } else if (((zkn) obj3).d) {
                    x340Var26.i0(-1303735614);
                    boolean zG21 = x340Var26.g(iu30Var11);
                    Object objT21 = x340Var26.T();
                    if (zG21 || objT21 == fkj0.X) {
                        objT21 = new jzk(iu30Var11, (byte) 29);
                        x340Var26.s0(objT21);
                    }
                    Function0 function9 = (Function0) objT21;
                    if (ihc1.y0(str3)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    cwl1.b((qim0) null, (tl3) null, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(str3), function9), (gbx) null, apo.r(1862179634, new kaf(str3, (byte) 19), x340Var26), x340Var26, 0, 48, 1535);
                    x340Var26.r(false);
                } else {
                    x340Var26.i0(-1303401186);
                    x340Var26.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mzj(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mzj(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzj(ven0 ven0Var, j2i j2iVar, ven0 ven0Var2) {
        super(2);
        this.a = (byte) 0;
        this.b = ven0Var;
        this.d = j2iVar;
        this.c = ven0Var2;
    }
}
