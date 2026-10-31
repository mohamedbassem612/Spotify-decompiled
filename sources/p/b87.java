package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b87 implements xpw {
    public final String a;
    public final ynb0 b;
    public final ynb0 c;
    public final r87 d;
    public final ynb0 e;
    public final ksk0 f;
    public final ljm0 g = h7w.B(new n5(1, this, b87.class, "stateFromProps", "stateFromProps(Lcom/spotify/assistedcuration/page/elements/AssistedCurationCardElement$Props;)Lcom/spotify/assistedcuration/page/elements/AssistedCurationCardElement$State;", 0, (byte) 15), (o8n) null, (iu30) null, new x77(this, (byte) 0), 6);
    public final ia00 h = n3o1.q(this).a(new x77(this, (byte) 1), d27.d);
    public final psw i;

    public b87(String str, ynb0 ynb0Var, ynb0 ynb0Var2, r87 r87Var, ynb0 ynb0Var3, ksk0 ksk0Var) {
        this.a = str;
        this.b = ynb0Var;
        this.c = ynb0Var2;
        this.d = r87Var;
        this.e = ynb0Var3;
        this.f = ksk0Var;
        j2i j2iVar = new j2i(781013307, new i43(this, (byte) 18), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public static final int j(xtb0 xtb0Var, ven0 ven0Var) {
        int iP = yoi1.p((xtb0Var.h().l.size() / 2) + ((err0) xtb0Var.e.b).s(), 0, p7h.L((List) ven0Var.getValue()));
        int i = -1;
        if (iP >= 0) {
            int i2 = 0;
            while (true) {
                if (((List) ven0Var.getValue()).get(i2) instanceof r77) {
                    i++;
                }
                if (i2 == iP) {
                    break;
                }
                i2++;
            }
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public static final kc7 k(b87 b87Var, o77 o77Var, fsk0 fsk0Var, i iVar, boolean z) {
        String str;
        String str2 = b87Var.a;
        boolean z2 = o77Var.e;
        List list = o77Var.d;
        sfu0 sfu0Var = o77Var.f;
        if (sfu0Var instanceof ofu0) {
            str = null;
        } else if (sfu0Var instanceof lfu0) {
            str = ((lfu0) sfu0Var).a;
        } else if (sfu0Var instanceof kfu0) {
            str = ((kfu0) sfu0Var).a;
        } else {
            if (!(sfu0Var instanceof rfu0)) {
                eg.o();
                return null;
            }
            str = ((rfu0) sfu0Var).a;
        }
        if (!u890.j(str, iVar.a())) {
            sfu0Var = null;
        }
        if (sfu0Var == null) {
            sfu0Var = ofu0.a;
        }
        return new kc7(str2, iVar, list, z2, sfu0Var, o77Var.g, o77Var.h, o77Var.i, o77Var.j, o77Var.k || !z, fsk0Var, o77Var.b, new y77(o77Var, iVar, (byte) 0), new z77(o77Var, iVar, (byte) 0), new y77(o77Var, iVar, (byte) 1), new y77(o77Var, iVar, (byte) 2));
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    public final void e(yrd yrdVar, b0k b0kVar, int i) {
        yrd yrdVar2;
        byte b;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-636676510);
        int i2 = (b0kVar2.g(yrdVar) ? 4 : 2) | i;
        if (b0kVar2.Y(i2 & 1, (i2 & 3) != 2)) {
            String str = yrdVar.b;
            if (str != null) {
                if (ihc1.y0(str)) {
                    str = null;
                }
                if (str != null) {
                    String str2 = yrdVar.d;
                    if (str2 != null) {
                        b0kVar2.i0(-654141389);
                        mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                        int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                        xos0 xos0VarM = b0kVar2.m();
                        nim0 nim0Var = nim0.a;
                        qim0 qim0VarE = zr7.E(b0kVar2, nim0Var);
                        hzj.A.getClass();
                        if (((x340) b0kVar2).a == null) {
                            tgp1.p();
                            throw null;
                        }
                        b0kVar2.m0();
                        if (((x340) b0kVar2).S) {
                            b0kVar2.l(hmb0.t1);
                        } else {
                            b0kVar2.v0();
                        }
                        nko1.H(mbhVarA, b0kVar2, y580.O0);
                        nko1.H(xos0VarM, b0kVar2, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                        nko1.F(b0kVar2);
                        nko1.H(qim0VarE, b0kVar2, y580.Y);
                        jto1.b((qim0) null, (uvx) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(2104984557, new xo6(str2, str, (byte) 2), b0kVar2), b0kVar2, 0, 196608, 32767);
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(b0kVar2).b;
                        qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                        long jC = cbx.a(b0kVar2).a.b.c();
                        b0kVar2 = b0kVar2;
                        hr80.d(qim0VarZ, 1.0f, jC, b0kVar2, 0, 0);
                        b0kVar2.r(true);
                        b = 0;
                        b0kVar2.r(false);
                    } else {
                        b = 0;
                        b0kVar2.i0(-653260059);
                        jto1.b((qim0) null, (uvx) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(-334103942, new p3(str, (byte) 21), b0kVar2), b0kVar2, 0, 196608, 32767);
                        b0kVar2 = b0kVar2;
                        b0kVar2.r(false);
                    }
                    yrdVar2 = yrdVar;
                }
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new h77(this, yrdVar, i, (byte) 1);
                return;
            }
            return;
        }
        yrdVar2 = yrdVar;
        b = 0;
        b0kVar2.b0();
        h311 h311VarV2 = b0kVar2.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new h77(this, yrdVar2, i, b);
        }
    }

    public final void f(aqb0 aqb0Var, l77 l77Var, int i, n8b1 n8b1Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2025840864);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(aqb0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(l77Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(n8b1Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0VarB = aqb0.b(aqb0Var, nim0.a, (pxg1) null, n8b1Var, 5);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            boolean zI = x340Var.i(l77Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new rr6(l77Var, (byte) 8);
                x340Var.s0(objT);
            }
            p2o1.a(i, new h3h1((iu30) objT), apo.r(2012914004, new mu6(l77Var, (byte) 4), x340Var), x340Var, ((i3 >> 6) & 14) | 384);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0(this, aqb0Var, l77Var, i, n8b1Var, i2, (byte) 4);
        }
    }

    public final void g(int i, boolean z, Function0 function0, xtb0 xtb0Var, b0k b0kVar, int i2) {
        h311 h311VarV;
        m77 m77Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(769904803);
        int i3 = i2 | (x340Var.e(i) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(xtb0Var) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            if (z) {
                Integer numValueOf = Integer.valueOf(i);
                boolean zI = ((i3 & 14) == 4) | x340Var.i(xtb0Var) | ((i3 & 896) == 256);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    zi3 zi3Var = new zi3(xtb0Var, i, function0, (lnm) null, (byte) 1);
                    x340Var.s0(zi3Var);
                    objT = zi3Var;
                }
                qxd0.t(numValueOf, x340Var, (vu30) objT);
            } else {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    m77Var = new m77(this, i, z, function0, xtb0Var, i2, (byte) 0);
                }
            }
            h311VarV.d = m77Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            m77Var = new m77(this, i, z, function0, xtb0Var, i2, (byte) 1);
            h311VarV.d = m77Var;
        }
    }

    public final mqw getBehavior() {
        return this.g;
    }

    public final void h(String str, yud yudVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-766863794);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(yudVar) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            b0kVar2 = b0kVar3;
            jto1.b((qim0) null, (uvx) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(-1515298934, new wf(str, yudVar, (byte) 22), b0kVar3), b0kVar2, 0, 196608, 32767);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new zt6(this, str, yudVar, i, (byte) 2);
        }
    }

    public final void i(boolean z, List list, String str, xtb0 xtb0Var, vu30 vu30Var, b0k b0kVar, int i) {
        h311 h311VarV;
        v77 v77Var;
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1475073270);
        int i3 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.g(list) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.i(xtb0Var) ? 2048 : 1024) | (x340Var.i(vu30Var) ? 16384 : 8192);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            ven0 ven0VarS = v8r.s(list, x340Var);
            boolean z2 = (i3 & 112) == 32;
            Object objT = x340Var.T();
            Object obj = objT;
            if (z2 || objT == m4cVar) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((t77) it.next()).getKey());
                }
                x340Var.s0(arrayList);
                obj = arrayList;
            }
            List list3 = (List) obj;
            List list4 = list;
            if ((list4 instanceof Collection) && list4.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it2 = list4.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                    if ((((t77) it2.next()) instanceof r77) && (i2 = i2 + 1) < 0) {
                        p7h.S();
                        throw null;
                    }
                }
            }
            if (!z || i2 == 0) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    v77Var = new v77(this, z, list, str, xtb0Var, vu30Var, i, (byte) 0);
                }
            } else {
                Object[] objArr = {Boolean.valueOf(z), Integer.valueOf(i2), str, list3};
                boolean zI = x340Var.i(xtb0Var) | ((i3 & 57344) == 16384) | x340Var.i(ven0VarS);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    wc5 wc5Var = new wc5(vu30Var, xtb0Var, ven0VarS, (lnm) null, (byte) 6);
                    x340Var.s0(wc5Var);
                    objT2 = wc5Var;
                }
                qxd0.u(objArr, (vu30) objT2, x340Var);
            }
            h311VarV.d = v77Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            v77Var = new v77(this, z, list, str, xtb0Var, vu30Var, i, (byte) 1);
            h311VarV.d = v77Var;
        }
    }

    public final fsk0 l(o77 o77Var) {
        return new fsk0(new gsk0(this.f, (byte) 0), o77Var.a.i.a, Integer.valueOf(o77Var.c), o77Var.a.i.b);
    }

    public final u77 m(o77 o77Var) {
        l77 l77Var;
        fsk0 fsk0VarL = l(o77Var);
        yrd yrdVar = o77Var.a;
        boolean z = o77Var.e;
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(q77.a);
        Iterator it = yrdVar.g.iterator();
        int i = 0;
        while (it.hasNext()) {
            avd avdVar = (avd) it.next();
            String str = avdVar.b;
            String str2 = avdVar.a;
            if (str != null) {
                smc0VarN.add(new s77(str, avdVar.c, "section_title_".concat(str2)));
            }
            dvd dvdVar = avdVar.d;
            if (dvdVar instanceof cvd) {
                for (i iVar : ((cvd) dvdVar).a) {
                    if (iVar instanceof g) {
                        l77Var = new l77((xpw) this.b.get(), k(this, o77Var, fsk0VarL, iVar, o77Var.l));
                    } else {
                        if (iVar instanceof e) {
                            l77Var = new l77((xpw) this.c.get(), k(this, o77Var, fsk0VarL, iVar, o77Var.m));
                        } else {
                            if (!(iVar instanceof d)) {
                                eg.o();
                                return null;
                            }
                            l77Var = new l77((xpw) this.e.get(), k(this, o77Var, fsk0VarL, iVar, false));
                        }
                        smc0VarN.add(new r77(l77Var, i, f4i1.f(str2, ":", iVar.getUri())));
                        i++;
                        it = it;
                    }
                    smc0VarN.add(new r77(l77Var, i, f4i1.f(str2, ":", iVar.getUri())));
                    i++;
                    it = it;
                }
            } else {
                Iterator it2 = it;
                if (!(dvdVar instanceof bvd)) {
                    eg.o();
                    return null;
                }
                smc0VarN.add(new p77("section_custom_".concat(str2), ((bvd) dvdVar).b));
                it = it2;
            }
        }
        return new u77(yrdVar, z, k4p1.k(smc0VarN), o77Var.n);
    }
}
