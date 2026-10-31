package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rf1 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rf1(byte b, Object obj, Object obj2, List list) {
        this.a = b;
        this.b = list;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        int i;
        bm00 bm00Var = (bm00) this.d;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            oi60 oi60Var = (qi60) this.b.get(iIntValue);
            x340Var2.i0(1044841650);
            boolean z = oi60Var instanceof pi60;
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var2.i0(-243388380);
                zzm zzmVar = ((pi60) oi60Var).a;
                iu30 iu30Var = (iu30) this.c;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                bm00Var.b(zzmVar, iu30Var, aqb0.b(aqb0Var, dug.f(uyn1.z(0.0f, 16.0f, 1, nim0Var), u7h.j, d4o1.a), (pxg1) null, (ni20) null, 7), x340Var2, 0);
                x340Var2.r(false);
            } else {
                if (!(oi60Var instanceof oi60)) {
                    throw p3d1.k(x340Var2, -243390095, false);
                }
                x340Var2.i0(-243375413);
                yzm yzmVar = oi60Var.a;
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                bm00Var.a(yzmVar, aqb0.b(aqb0Var, uyn1.z(16.0f, 0.0f, 2, nim0Var), (pxg1) null, (ni20) null, 7), x340Var2, 0);
                x340Var2.r(false);
            }
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            h8k1 h8k1Var = (h8k1) this.b.get(iIntValue);
            x340Var2.i0(-1669160974);
            Object obj5 = h8k1Var.a;
            boolean zG = x340Var2.g(obj5);
            Object objT = x340Var2.T();
            Object obj6 = this.c;
            if (zG || objT == fkj0.X) {
                objT = new vq80((q1d0) obj6, obj5, (byte) 29);
                x340Var2.s0(objT);
            }
            dgo1.c(obj5, (iu30) objT, apo.r(-1083897078, new nca0(iIntValue, (q1d0) obj6, obj5, (vu30) this.d, aqb0Var, (byte) 11), x340Var2), x340Var2, 384);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        m4c m4cVar = fkj0.X;
        iu30 iu30Var = (iu30) this.c;
        yge0 yge0Var = (yge0) this.d;
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        boolean z = true;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            nhe0 nhe0Var = (nhe0) this.b.get(iIntValue);
            x340Var2.i0(-1596994247);
            boolean zI = x340Var2.i(yge0Var);
            if ((((i & 112) ^ 48) <= 32 || !x340Var2.e(iIntValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean zG = zI | z | x340Var2.g(iu30Var) | x340Var2.i(nhe0Var);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                pne0 pne0Var = new pne0(yge0Var, iIntValue, iu30Var, nhe0Var, (byte) 0);
                x340Var2.s0(pne0Var);
                objT = pne0Var;
            }
            Function0 function0 = (Function0) objT;
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = wce0.c1;
                x340Var2.s0(objT2);
            }
            s9p1.p(nhe0Var, false, function0, (Function0) objT2, (qim0) null, x340Var2, 3120);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        m4c m4cVar = fkj0.X;
        iu30 iu30Var = (iu30) this.c;
        yge0 yge0Var = (yge0) this.d;
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        boolean z = true;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            nhe0 nhe0Var = (nhe0) this.b.get(iIntValue);
            x340Var2.i0(-929943137);
            int i2 = (i & 112) ^ 48;
            boolean zI = x340Var2.i(yge0Var) | ((i2 > 32 && x340Var2.e(iIntValue)) || (i & 48) == 32) | x340Var2.g(iu30Var) | x340Var2.i(nhe0Var);
            Object objT = x340Var2.T();
            if (zI || objT == m4cVar) {
                objT = new pne0(yge0Var, iIntValue, iu30Var, nhe0Var, (byte) 1);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean zI2 = x340Var2.i(yge0Var);
            if ((i2 <= 32 || !x340Var2.e(iIntValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean zG = zI2 | z | x340Var2.g(iu30Var) | x340Var2.i(nhe0Var);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == m4cVar) {
                pne0 pne0Var = new pne0(yge0Var, iIntValue, iu30Var, nhe0Var, (byte) 2);
                x340Var2.s0(pne0Var);
                objT2 = pne0Var;
            }
            s9p1.p(nhe0Var, true, function0, (Function0) objT2, (qim0) null, x340Var2, 48);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            a0g a0gVar = (a0g) this.b.get(iIntValue);
            x340Var2.i0(-1986917801);
            otw.c((keg0) this.c, new jeg0(a0gVar, ((ygg0) this.d).b.containsKey(a0gVar.a)), (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String str;
        r4k0 r4k0Var = (r4k0) this.d;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(i & 1, (i & 147) != 146);
        j06 j06Var = x340Var2.a;
        if (zY) {
            fy00 fy00Var = (fy00) this.b.get(iIntValue);
            x340Var2.i0(-788074558);
            String strConcat = "mixing_extended_versions_row_".concat(fy00Var.a);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N(strConcat, nim0Var);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
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
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, nim0Var);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            wnb0 wnb0VarQ = kk0.q(x340Var2, qim0VarE2, lljVar4, 1.0f, true);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, wnb0VarQ);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            nm1 nm1Var = r4k0Var.b;
            d0r d0rVar = r4k0Var.a;
            if (!fy00Var.d || (str = fy00Var.c) == null) {
                str = fy00Var.b;
            }
            i1o1.e(nm1Var, new mlk0(str, null, false, null, 0, false, 508), d0rVar, (qim0) null, (ipb1) null, s1j.c, (xu30) null, 0, (xu30) null, x340Var2, 196672, 236);
            x340Var2.r(true);
            r4k0Var.i(fy00Var, (iu30) this.c, (qim0) null, x340Var2, 0);
            us71.m(x340Var2, true, true, false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        hkc1 hkc1Var = (hkc1) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            Object obj5 = this.b.get(iIntValue);
            x340Var2.i0(-2100829181);
            boolean z = hkc1Var.a;
            int iIndexOf = ((List) this.d).indexOf(obj5);
            if (z) {
                iIndexOf++;
            }
            String str = (String) hkc1Var.k.invoke(obj5, x340Var2, 0);
            boolean z2 = !hkc1Var.b && u890.j(obj5, hkc1Var.c);
            boolean zI = x340Var2.i(hkc1Var) | x340Var2.i(obj5) | x340Var2.e(iIndexOf);
            Object objT = x340Var2.T();
            if (zI || objT == fkj0.X) {
                objT = new wv1(hkc1Var, obj5, iIndexOf, (byte) 17);
                x340Var2.s0(objT);
            }
            t3p1.p(0, str, (String) hkc1Var.j.invoke(obj5), (Function0) objT, x340Var2, (qim0) null, z2);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            String str = (String) this.b.get(iIntValue);
            x340Var2.i0(-1613512884);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uqk uqkVar = (uqk) this.c;
            vqk vqkVar = new vqk(str, null, null, false, 1, 2, true, false, null, null, null, null, 32526);
            d0r d0rVar = (d0r) this.d;
            j2i j2iVar = q2j.c;
            o3r o3rVar = uqk.h;
            i1o1.e(uqkVar, vqkVar, d0rVar, (qim0) null, (ipb1) null, j2iVar, (xu30) null, 0, (xu30) null, x340Var2, 196680, 236);
            x340Var2.r(true);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            xho0 xho0Var = (xho0) this.b.get(iIntValue);
            x340Var2.i0(770993325);
            boolean zG = x340Var2.g(xho0Var.a.a);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = (xpw) ((hcs) this.d).a.get();
                x340Var2.s0(objT);
            }
            hio0 hio0Var = (hio0) this.c;
            otw.c((xpw) objT, new rho0(xho0Var, hio0Var.b, hio0Var.c, hio0Var.d), u291.v(nim0.a, 324.0f), (ipb1) null, x340Var2, 0, 8);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        xeq0 xeq0Var = (xeq0) this.d;
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            fdq0 fdq0Var = (fdq0) this.b.get(iIntValue);
            x340Var2.i0(195556463);
            idq0 idq0Var = (idq0) this.c;
            xbq0 xbq0Var = (xbq0) xeq0Var.d.get(fdq0Var.a);
            if (xbq0Var == null) {
                xbq0Var = vbq0.a;
            }
            otw.c(idq0Var, new hdq0(iIntValue, fdq0Var, xbq0Var, xeq0Var.b), (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        ahi0 ahi0Var = (ahi0) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            yv31 yv31Var = (yv31) this.b.get(iIntValue);
            x340Var2.i0(-1974034038);
            maa maaVar = (maa) ((ynb0) ahi0Var.h).get();
            g5r0 g5r0Var = (g5r0) this.d;
            otw.c(maaVar, new zc0(yv31Var, iIntValue, g5r0Var.f, g5r0Var.g, (yc0) null), (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        vu30 vu30Var = (vu30) this.d;
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        boolean z = true;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            fji0 fji0Var = (fji0) this.b.get(iIntValue);
            x340Var2.i0(178542985);
            ulc ulcVar = (ulc) this.c;
            boolean zG = x340Var2.g(vu30Var);
            if ((((i & 112) ^ 48) <= 32 || !x340Var2.e(iIntValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean z2 = zG | z;
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new t7m(vu30Var, iIntValue, (byte) 2);
                x340Var2.s0(objT);
            }
            ulcVar.e(fji0Var, (iu30) objT, (qim0) null, x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            t211 t211Var = (t211) this.b.get(iIntValue);
            x340Var2.i0(-505384032);
            boolean zG = x340Var2.g(t211Var);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                tnm tnmVar = (tnm) ((hmq) this.d).a.c;
                objT = new hkz0((d0r) ((jly0) tnmVar.e).get(), (wsl0) ((jly0) tnmVar.f).get());
                x340Var2.s0(objT);
            }
            otw.c((hkz0) objT, new ekz0(t211Var.a, t211Var.c, (iu30) this.c), (qim0) null, (ipb1) null, x340Var2, 8, 12);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        iu30 iu30Var = (iu30) this.c;
        ss50 ss50Var = (ss50) this.d;
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        byte b = 1;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            myz0 myz0Var = (myz0) this.b.get(iIntValue);
            x340Var2.i0(1729378876);
            String str = myz0Var.a;
            boolean zI = x340Var2.i(ss50Var) | x340Var2.g(iu30Var) | x340Var2.i(myz0Var);
            Object objT = x340Var2.T();
            if (zI || objT == fkj0.X) {
                objT = new tyz0(ss50Var, iu30Var, myz0Var, b);
                x340Var2.s0(objT);
            }
            epo1.h(0, str, (Function0) objT, x340Var2, (qim0) null);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        n0v0 n0v0Var = (n0v0) this.d;
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            c401 c401Var = (c401) ((ArrayList) this.b).get(iIntValue);
            x340Var2.i0(1042207566);
            qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 10.0f, 7);
            b401 b401Var = c401Var.a;
            oqo1.g((gw70) n0v0Var.b, new w501(new v501(b401Var.a, b401Var.b, b401Var.d, b401Var.c), c401Var.b, c401Var.c), qim0VarB, c401Var.d ? (iu30) this.c : null, x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:123:0x0264  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        kko kkoVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        byte b = this.a;
        z50 z50Var = z50.c;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.d;
        List list = this.b;
        Object obj6 = this.c;
        byte b2 = 2;
        boolean z = true;
        byte b3 = 6;
        switch (b) {
            case 0:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                lf1 lf1Var = (lf1) obj5;
                iu30 iu30Var = (iu30) obj6;
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (x340Var.g(aqb0Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i & 1, (i & 147) != 146)) {
                    avc0 avc0Var = (avc0) list.get(iIntValue);
                    x340Var2.i0(-1136238116);
                    d36 d36Var = new d36(8.0f, true, new um5(false));
                    qim0 qim0VarB = uyn1.B(u291.f(nim0Var, 1.0f), 32.0f, 0.0f, 24.0f, 12.0f, 2);
                    jw31 jw31VarA = ew31.a(d36Var, een.Z, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    uwr uwrVar = cbx.a;
                    uwo1.e("•", (qim0) null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 6, 0, 2034);
                    String str = avc0Var.c;
                    boolean zG = x340Var2.g(iu30Var) | x340Var2.g(lf1Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new of1(iu30Var, lf1Var, b2);
                        x340Var2.s0(objT);
                    }
                    uwo1.d(huj.a(str, (iu30) objT), cbx.a(x340Var2).b.b, (qim0) null, cbx.d(x340Var2).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var2, 0, 0, 4084);
                    x340Var2.r(true);
                    x340Var2.r(false);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                m4c m4cVar = fkj0.X;
                Function0 function0 = (Function0) obj6;
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (x340Var3.g(aqb0Var2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var3.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    iy2 iy2Var = (iy2) list.get(iIntValue3);
                    x340Var4.i0(2078542829);
                    String str2 = iy2Var.a;
                    String str3 = iy2Var.b;
                    String str4 = iy2Var.c;
                    List listN = iy2Var.e;
                    if (listN.isEmpty()) {
                        String str5 = iy2Var.d;
                        listN = p7h.N(str5 != null ? new qm31(str5, false) : null);
                    }
                    List list2 = listN;
                    boolean zG2 = x340Var4.g(function0);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new wo2(function0, (lnm) null, (byte) 0);
                        x340Var4.s0(objT2);
                    }
                    pw2 pw2Var = new pw2(str2, str3, str4, list2, (vu30) objT2);
                    Object objT3 = x340Var4.T();
                    if (objT3 == m4cVar) {
                        ycc1 ycc1Var = (ycc1) obj5;
                        boolean z2 = iy2Var.f;
                        fcq fcqVar = (fcq) ycc1Var.c;
                        d0r d0rVar = (d0r) ycc1Var.b;
                        lt31 lt31Var = new lt31(z2);
                        r7q r7qVar = fcqVar.a;
                        teq teqVar = r7qVar.d;
                        hw2 hw2Var = new hw2((lzn0) teqVar.i.get(), (gw70) r7qVar.b.d8.get(), (rzo) teqVar.Pb.get(), d0rVar, lt31Var);
                        x340Var4.s0(hw2Var);
                        objT3 = hw2Var;
                    }
                    otw.c((maa) objT3, pw2Var, (qim0) null, (ipb1) null, x340Var4, 64, 12);
                    x340Var4.r(false);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                aqb0 aqb0Var3 = (aqb0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var5 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                iu30 iu30Var2 = (iu30) obj6;
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (x340Var5.g(aqb0Var3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= x340Var5.e(iIntValue5) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(i3 & 1, (i3 & 147) != 146)) {
                    m0d m0dVar = (m0d) list.get(iIntValue5);
                    x340Var6.i0(-1464524591);
                    boolean zJ = u890.j(m0dVar, (m0d) obj5);
                    boolean zG3 = x340Var6.g(iu30Var2) | x340Var6.i(m0dVar);
                    Object objT4 = x340Var6.T();
                    if (zG3 || objT4 == fkj0.X) {
                        objT4 = new rqa(iu30Var2, m0dVar, (byte) 14);
                        x340Var6.s0(objT4);
                    }
                    zpn1.b(m0dVar, zJ, (Function0) objT4, x340Var6, 0);
                    x340Var6.r(false);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                aqb0 aqb0Var4 = (aqb0) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var7 = (b0k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                vu30 vu30Var = (vu30) obj5;
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (x340Var7.g(aqb0Var4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= x340Var7.e(iIntValue7) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i4 & 1, (i4 & 147) != 146)) {
                    tkf tkfVar = (tkf) list.get(iIntValue7);
                    x340Var8.i0(-912792552);
                    boolean zG4 = ((((i4 & 112) ^ 48) > 32 && x340Var8.e(iIntValue7)) || (i4 & 48) == 32) | x340Var8.g(vu30Var) | x340Var8.i(tkfVar);
                    Object objT5 = x340Var8.T();
                    if (zG4 || objT5 == fkj0.X) {
                        objT5 = new u0f(vu30Var, tkfVar, iIntValue7, (byte) 1);
                        x340Var8.s0(objT5);
                    }
                    yto1.c(tkfVar, (Function0) objT5, (iu30) obj6, (qim0) null, x340Var8, 0);
                    x340Var8.r(false);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                aqb0 aqb0Var5 = (aqb0) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var9 = (b0k) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                iu30 iu30Var3 = (iu30) obj6;
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (x340Var9.g(aqb0Var5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= x340Var9.e(iIntValue9) ? 32 : 16;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(i5 & 1, (i5 & 147) != 146)) {
                    aw7 aw7Var = (aw7) list.get(iIntValue9);
                    x340Var10.i0(1864142838);
                    String str6 = aw7Var.a;
                    boolean zJ2 = u890.j(((bw7) obj5).a, aw7Var.b);
                    boolean zG5 = x340Var10.g(iu30Var3) | x340Var10.g(aw7Var);
                    Object objT6 = x340Var10.T();
                    if (zG5 || objT6 == fkj0.X) {
                        objT6 = new ame(iu30Var3, aw7Var, (byte) 28);
                        x340Var10.s0(objT6);
                    }
                    gbx gbxVar = new gbx(z50Var, (Function0) objT6);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var10).b;
                    vzn1.e(str6, gbxVar, uyn1.z(8.0f, 0.0f, 2, nim0Var), zJ2, x340Var10, 0);
                    x340Var10.r(false);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                rub0 rub0Var = (rub0) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var11 = (b0k) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                iu30 iu30Var4 = (iu30) obj6;
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (x340Var11.g(rub0Var) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= x340Var11.e(iIntValue11) ? 32 : 16;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(i6 & 1, (i6 & 147) != 146)) {
                    wol wolVar = (wol) list.get(iIntValue11);
                    x340Var12.i0(-985777607);
                    ujo ujoVar = (ujo) obj5;
                    boolean zG6 = x340Var12.g(iu30Var4) | x340Var12.i(wolVar);
                    Object objT7 = x340Var12.T();
                    if (zG6 || objT7 == fkj0.X) {
                        objT7 = new gmj((Object) iu30Var4, (Object) wolVar, (byte) 21);
                        x340Var12.s0(objT7);
                    }
                    zpn1.e(wolVar, ujoVar, (Function0) objT7, x340Var12, 0);
                    x340Var12.r(false);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 6:
                gpb0 gpb0Var = (gpb0) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var13 = (b0k) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                iu30 iu30Var5 = (iu30) obj6;
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (x340Var13.g(gpb0Var) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= x340Var13.e(iIntValue13) ? 32 : 16;
                }
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(i7 & 1, (i7 & 147) != 146)) {
                    vy30 vy30Var = (vy30) list.get(iIntValue13);
                    x340Var14.i0(425737352);
                    ng20 ng20Var = (ng20) ((pt) obj5).e;
                    boolean zG7 = x340Var14.g(iu30Var5) | x340Var14.g(vy30Var);
                    Object objT8 = x340Var14.T();
                    if (zG7 || objT8 == fkj0.X) {
                        objT8 = new sqm(iu30Var5, vy30Var, (byte) 0);
                        x340Var14.s0(objT8);
                    }
                    otw.c(ng20Var, new doh0(vy30Var, iIntValue13, (Function0) objT8), (qim0) null, (ipb1) null, x340Var14, 0, 12);
                    x340Var14.r(false);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 7:
                aqb0 aqb0Var6 = (aqb0) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var15 = (b0k) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                if ((iIntValue16 & 6) == 0) {
                    i8 = iIntValue16 | (x340Var15.g(aqb0Var6) ? 4 : 2);
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= x340Var15.e(iIntValue15) ? 32 : 16;
                }
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(i8 & 1, (i8 & 147) != 146)) {
                    int i16 = i8 & 126;
                    gxm gxmVar = (gxm) list.get(iIntValue15);
                    x340Var16.i0(-1740967530);
                    Integer numValueOf = Integer.valueOf(iIntValue15);
                    if ((((i8 & 112) ^ 48) <= 32 || !x340Var16.e(iIntValue15)) && (i8 & 48) != 32) {
                        z = false;
                    }
                    Object objT9 = x340Var16.T();
                    if (z || objT9 == fkj0.X) {
                        objT9 = new uv4(iIntValue15, (byte) 11);
                        x340Var16.s0(objT9);
                    }
                    dgo1.c(numValueOf, (iu30) objT9, apo.r(554615850, new mzj((qlb) obj6, gxmVar, (jxm) obj5, (byte) 25), x340Var16), x340Var16, (14 & (i16 >> 3)) | 384);
                    x340Var16.r(false);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 8:
                aqb0 aqb0Var7 = (aqb0) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var17 = (b0k) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                if ((iIntValue18 & 6) == 0) {
                    i9 = iIntValue18 | (x340Var17.g(aqb0Var7) ? 4 : 2);
                } else {
                    i9 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i9 |= x340Var17.e(iIntValue17) ? 32 : 16;
                }
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(i9 & 1, (i9 & 147) != 146)) {
                    iwm iwmVar = (iwm) ((ArrayList) list).get(iIntValue17);
                    x340Var18.i0(-1346408960);
                    Object objT10 = x340Var18.T();
                    if (objT10 == fkj0.X) {
                        dvp dvpVar = (dvp) obj6;
                        bpb1 bpb1VarB = gio1.b(new ioj0());
                        String str7 = iwmVar.b;
                        objT10 = dvpVar.a(bpb1VarB, (str7 == null || str7.length() == 0 || (kkoVar = (kko) obj5) == null) ? c6g1.a : new b6g1(kkoVar), new lt31(false));
                        x340Var18.s0(objT10);
                    }
                    otw.c((aw2) objT10, new pw2(16, iwmVar.a, iwmVar.b, iwmVar.c, iwmVar.d), (qim0) null, (ipb1) null, x340Var18, 64, 12);
                    x340Var18.r(false);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 9:
                aqb0 aqb0Var8 = (aqb0) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                x340 x340Var19 = (b0k) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                if ((iIntValue20 & 6) == 0) {
                    i10 = iIntValue20 | (x340Var19.g(aqb0Var8) ? 4 : 2);
                } else {
                    i10 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i10 |= x340Var19.e(iIntValue19) ? 32 : 16;
                }
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(i10 & 1, (i10 & 147) != 146)) {
                    qpq0 qpq0Var = (qpq0) list.get(iIntValue19);
                    x340Var20.i0(193057294);
                    otw.c((fqs) obj6, new t591(qpq0Var.a, cwl1.o0(x340Var20, qpq0Var.b), cwl1.o0(x340Var20, qpq0Var.c), qpq0Var.d, qpq0Var.a == ((a691) obj5).a), (qim0) null, (ipb1) null, x340Var20, 0, 12);
                    x340Var20.r(false);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 10:
                aqb0 aqb0Var9 = (aqb0) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                x340 x340Var21 = (b0k) obj3;
                int iIntValue22 = ((Number) obj4).intValue();
                if ((iIntValue22 & 6) == 0) {
                    i11 = iIntValue22 | (x340Var21.g(aqb0Var9) ? 4 : 2);
                } else {
                    i11 = iIntValue22;
                }
                if ((iIntValue22 & 48) == 0) {
                    i11 |= x340Var21.e(iIntValue21) ? 32 : 16;
                }
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(i11 & 1, (i11 & 147) != 146)) {
                    zha1 zha1Var = (zha1) ((ArrayList) list).get(iIntValue21);
                    x340Var22.i0(462634515);
                    otw.c((vrs) obj6, new gia1(zha1Var == ((iia1) obj5).a, zha1Var), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                    x340Var22.r(false);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 11:
                aqb0 aqb0Var10 = (aqb0) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                x340 x340Var23 = (b0k) obj3;
                int iIntValue24 = ((Number) obj4).intValue();
                if ((iIntValue24 & 6) == 0) {
                    i12 = iIntValue24 | (x340Var23.g(aqb0Var10) ? 4 : 2);
                } else {
                    i12 = iIntValue24;
                }
                if ((iIntValue24 & 48) == 0) {
                    i12 |= x340Var23.e(iIntValue23) ? 32 : 16;
                }
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(i12 & 1, (i12 & 147) != 146)) {
                    x820 x820Var = (x820) list.get(iIntValue23);
                    x340Var24.i0(-133302948);
                    j0p1.b(0, x820Var.a, x820Var.b, x820Var.c, x340Var24, (iu30) obj6, anm1.N("filter-chips-item", nim0Var), u890.j(x820Var.a, ((b920) obj5).b));
                    x340Var24.r(false);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 12:
                aqb0 aqb0Var11 = (aqb0) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                x340 x340Var25 = (b0k) obj3;
                int iIntValue26 = ((Number) obj4).intValue();
                iu30 iu30Var6 = (iu30) obj6;
                if ((iIntValue26 & 6) == 0) {
                    i13 = iIntValue26 | (x340Var25.g(aqb0Var11) ? 4 : 2);
                } else {
                    i13 = iIntValue26;
                }
                if ((iIntValue26 & 48) == 0) {
                    i13 |= x340Var25.e(iIntValue25) ? 32 : 16;
                }
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(i13 & 1, (i13 & 147) != 146)) {
                    h920 h920Var = (h920) ((ArrayList) list).get(iIntValue25);
                    x340Var26.i0(480429478);
                    if (iIntValue25 == 0) {
                        ArrayList arrayList = ((m920) obj5).a;
                        if (arrayList.isEmpty()) {
                            x340Var26.i0(480932235);
                            x340Var26.r(false);
                        } else {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    x340Var26.i0(480932235);
                                    x340Var26.r(false);
                                } else if (((h920) it.next()).a()) {
                                    x340Var26.i0(480469033);
                                    fux fuxVar = fux.c;
                                    boolean zG8 = x340Var26.g(iu30Var6);
                                    Object objT11 = x340Var26.T();
                                    if (zG8 || objT11 == fkj0.X) {
                                        objT11 = new y720(iu30Var6, (byte) 6);
                                        x340Var26.s0(objT11);
                                    }
                                    gbx gbxVar2 = new gbx(z50Var, (Function0) objT11);
                                    jsl jslVar = new jsl(cwl1.o0(x340Var26, 2131956004));
                                    qim0 qim0VarN = anm1.N("filters-clear", nim0Var);
                                    uwr uwrVar3 = cbx.a;
                                    cvx cvxVar2 = cbx.b(x340Var26).b;
                                    cuo1.k(fuxVar, gbxVar2, jslVar, uyn1.x(qim0VarN, 8.0f), (idn0) null, x340Var26, fux.d, 16);
                                    x340Var26.r(false);
                                }
                            }
                        }
                    } else {
                        x340Var26.i0(480932235);
                        x340Var26.r(false);
                    }
                    int iC = l1d.C(h920Var.b());
                    if (iC == 0) {
                        x340Var26.i0(15516426);
                        o0p1.d((f920) h920Var, iu30Var6, x340Var26, 0);
                        x340Var26.r(false);
                    } else if (iC == 1) {
                        x340Var26.i0(15519935);
                        o0p1.g((k920) h920Var, iu30Var6, x340Var26, 0);
                        x340Var26.r(false);
                    } else {
                        if (iC != 2) {
                            throw p3d1.k(x340Var26, 15514558, false);
                        }
                        x340Var26.i0(15524067);
                        o0p1.c((e920) h920Var, iu30Var6, x340Var26, 0);
                        x340Var26.r(false);
                    }
                    x340Var26.r(false);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 13:
                aqb0 aqb0Var12 = (aqb0) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                x340 x340Var27 = (b0k) obj3;
                int iIntValue28 = ((Number) obj4).intValue();
                if ((iIntValue28 & 6) == 0) {
                    i14 = iIntValue28 | (x340Var27.g(aqb0Var12) ? 4 : 2);
                } else {
                    i14 = iIntValue28;
                }
                if ((iIntValue28 & 48) == 0) {
                    i14 |= x340Var27.e(iIntValue27) ? 32 : 16;
                }
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(i14 & 1, (i14 & 147) != 146)) {
                    y3g y3gVar = (y3g) list.get(iIntValue27);
                    x340Var28.i0(1243203621);
                    otw.c((umf0) ((jd6) obj6).f, new kq50(y3gVar, ((nq50) obj5).b), (qim0) null, (ipb1) null, x340Var28, 0, 12);
                    x340Var28.r(false);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 14:
                return a(obj, obj2, obj3, obj4);
            case 15:
                return d(obj, obj2, obj3, obj4);
            case 16:
                return e(obj, obj2, obj3, obj4);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return f(obj, obj2, obj3, obj4);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return g(obj, obj2, obj3, obj4);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return h(obj, obj2, obj3, obj4);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return i(obj, obj2, obj3, obj4);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return j(obj, obj2, obj3, obj4);
            case 22:
                return k(obj, obj2, obj3, obj4);
            case 23:
                return m(obj, obj2, obj3, obj4);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return n(obj, obj2, obj3, obj4);
            case 25:
                return o(obj, obj2, obj3, obj4);
            case 26:
                return p(obj, obj2, obj3, obj4);
            case 27:
                return q(obj, obj2, obj3, obj4);
            case 28:
                return r(obj, obj2, obj3, obj4);
            default:
                aqb0 aqb0Var13 = (aqb0) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                x340 x340Var29 = (b0k) obj3;
                int iIntValue30 = ((Number) obj4).intValue();
                iu30 iu30Var7 = (iu30) obj6;
                if ((iIntValue30 & 6) == 0) {
                    i15 = iIntValue30 | (x340Var29.g(aqb0Var13) ? (byte) 4 : (byte) 2);
                } else {
                    i15 = iIntValue30;
                }
                if ((iIntValue30 & 48) == 0) {
                    i15 |= x340Var29.e(iIntValue29) ? 32 : 16;
                }
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(i15 & 1, (i15 & 147) != 146)) {
                    snu0 snu0Var = (snu0) list.get(iIntValue29);
                    x340Var30.i0(1964083640);
                    lgu0 lgu0Var = (lgu0) obj5;
                    String str8 = snu0Var.a;
                    String str9 = snu0Var.d;
                    String str10 = snu0Var.b;
                    String str11 = snu0Var.c;
                    boolean zG9 = x340Var30.g(iu30Var7) | x340Var30.g(snu0Var);
                    Object objT12 = x340Var30.T();
                    if (zG9 || objT12 == fkj0.X) {
                        objT12 = new zkz0(iu30Var7, snu0Var, b3);
                        x340Var30.s0(objT12);
                    }
                    tro1.h(lgu0Var, str8, str9, str10, str11, (Function0) objT12, (qim0) null, x340Var30, 0);
                    x340Var30.r(false);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
        }
    }

    public /* synthetic */ rf1(List list, Object obj, iu30 iu30Var, byte b) {
        this.a = b;
        this.b = list;
        this.d = obj;
        this.c = iu30Var;
    }
}
