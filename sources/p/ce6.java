package p;

import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ce6 extends f311 {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final cv30 f;
    public final qk41 g;

    public ce6(l7f1 l7f1Var, boolean z, ard1 ard1Var, nda1 nda1Var, k7b1 k7b1Var) {
        this.a = (byte) 2;
        c380 c380Var = l7f1Var.c;
        this.c = l7f1Var;
        this.b = z;
        this.d = ard1Var;
        this.e = nda1Var;
        this.f = k7b1Var;
        this.g = (!z || c380Var.isEmpty()) ? pk41.a : new ok41((p7h.L(c380Var) * 100) + 900);
    }

    @Override // p.qj41
    public Object b(ak41 ak41Var) {
        switch (this.a) {
            case 3:
                Object objB = ((f311) this.c).b(ak41Var);
                return objB == d9n.a ? objB : rih1.a;
            default:
                return super.b(ak41Var);
        }
    }

    @Override // p.qj41
    public Object c(zj41 zj41Var) {
        switch (this.a) {
            case 3:
                Object objC = ((f311) this.c).c(zj41Var);
                return objC == d9n.a ? objC : rih1.a;
            default:
                return super.c(zj41Var);
        }
    }

    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        pxg1 pxg1VarJ0;
        pxg1 pxg1VarJ1;
        ven0 ven0VarR;
        int i3;
        int i4;
        pxg1 pxg1VarJ2;
        pxg1 pxg1VarJ3;
        hdn0 hdn0Var;
        int i5;
        x340 x340Var;
        x340 x340Var2;
        int i6;
        b0k b0kVar2;
        pxg1 zu91Var;
        ven0 ven0VarR2;
        ce6 ce6Var = this;
        rk41 rk41Var2 = rk41Var;
        byte b = ce6Var.a;
        Object obj = ce6Var.c;
        Object obj2 = ce6Var.e;
        boolean z = ce6Var.b;
        nim0 nim0Var = nim0.a;
        Object obj3 = ce6Var.d;
        boolean z2 = true;
        switch (b) {
            case 0:
                Float fValueOf = Float.valueOf(0.0f);
                x340 x340Var3 = (x340) b0kVar;
                x340Var3.k0(-10683828);
                if ((i & 6) == 0) {
                    i2 = (x340Var3.g(i2cVar) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= (i & 64) == 0 ? x340Var3.g(rk41Var2) : x340Var3.i(rk41Var2) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i2 |= x340Var3.i(ce6Var) ? 2048 : 1024;
                }
                if (x340Var3.Y(i2 & 1, (i2 & 1043) != 1042)) {
                    if (z) {
                        ilv.a.getClass();
                        pxg1VarJ0 = new pxg1(700, 100, flv.g);
                    } else {
                        pxg1VarJ0 = irn1.j0();
                    }
                    if (z) {
                        ilv.a.getClass();
                        pxg1VarJ1 = new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 800, flv.d);
                    } else {
                        pxg1VarJ1 = irn1.j0();
                    }
                    tzg1 tzg1Var = rno1.a;
                    if (z) {
                        x340Var3.i0(-453438283);
                        ven0VarR = zod.R(new hsi1("headerIn", Float.valueOf(1.0f), fValueOf, pxg1VarJ0, tzg1Var), rk41Var2.a, (Function0) null, x340Var3, 8, 4);
                        x340Var3.r(false);
                    } else {
                        x340Var3.i0(-453600227);
                        ven0VarR = zod.y("headerIn", rk41Var2, pxg1VarJ0, x340Var3);
                        x340Var3.r(false);
                    }
                    ven0 ven0Var = ven0VarR;
                    ven0 ven0VarR3 = zod.R(new hsi1("bodyIn", Float.valueOf(!z ? 0.0f : 1.0f), fValueOf, pxg1VarJ1, tzg1Var), rk41Var2.a, (Function0) null, x340Var3, 8, 4);
                    Object objT = x340Var3.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = t16.V0;
                        x340Var3.s0(objT);
                    }
                    gho1.i(i2cVar, (zyq0) obj2, rk41Var, ce6Var.b, ce6Var.f, s161.a(nim0Var, (iu30) objT), x340Var3, (i2 & 14) | 64 | ((i2 << 3) & 896));
                    x340Var3 = x340Var3;
                    qim0 qim0VarU = qxy0.u(uyn1.B(u291.d(nim0Var, 1.0f), 0.0f, 56.0f, 0.0f, 72.0f, 5), (idn0) null, 3);
                    Object objT2 = x340Var3.T();
                    if (objT2 == m4cVar) {
                        objT2 = t16.W0;
                        x340Var3.s0(objT2);
                    }
                    qim0 qim0VarB = s161.b(qim0VarU, true, (iu30) objT2);
                    mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var3, 54);
                    int iHashCode = Long.hashCode(x340Var3.T);
                    xos0 xos0VarM = x340Var3.m();
                    qim0 qim0VarE = zr7.E(x340Var3, qim0VarB);
                    hzj.A.getClass();
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
                    nko1.H(mbhVarA, x340Var3, y580.O0);
                    nko1.H(xos0VarM, x340Var3, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                    nko1.F(x340Var3);
                    nko1.H(qim0VarE, x340Var3, y580.Y);
                    vnr0 vnr0Var = (vnr0) ((zd6) obj).invoke(x340Var3, 0);
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarZ = uyn1.z(cbx.b(x340Var3).e.c, 0.0f, 2, qim0VarF);
                    boolean zG = x340Var3.g(ven0Var);
                    Object objT3 = x340Var3.T();
                    if (zG || objT3 == m4cVar) {
                        objT3 = new lq2(ven0Var, (byte) 3);
                        x340Var3.s0(objT3);
                    }
                    qgo1.f(vnr0Var, i541.C(qim0VarZ, (iu30) objT3), new a0e1(3), 0, false, (iu30) null, x340Var3, 8, 56);
                    cvx cvxVar = cbx.b(x340Var3).b;
                    op71.g(x340Var3, u291.h(nim0Var, 16.0f));
                    vnr0 vnr0Var2 = (vnr0) ((zd6) obj3).invoke(x340Var3, 0);
                    qim0 qim0VarZ2 = uyn1.z(cbx.b(x340Var3).e.c, 0.0f, 2, u291.f(nim0Var, 1.0f));
                    boolean zG2 = x340Var3.g(ven0VarR3);
                    Object objT4 = x340Var3.T();
                    if (zG2 || objT4 == m4cVar) {
                        objT4 = new lq2(ven0VarR3, (byte) 4);
                        x340Var3.s0(objT4);
                    }
                    qgo1.f(vnr0Var2, i541.C(qim0VarZ2, (iu30) objT4), new a0e1(3), 0, false, (iu30) null, x340Var3, 8, 56);
                    x340Var3.r(true);
                } else {
                    x340Var3.b0();
                }
                h311 h311VarV = x340Var3.v();
                if (h311VarV != null) {
                    h311VarV.d = new l8(i, ce6Var, i2cVar, rk41Var, function0, (byte) 15);
                    return;
                }
                return;
            case 1:
                yj41 yj41Var = (yj41) obj2;
                Float fValueOf2 = Float.valueOf(0.0f);
                x340 x340Var4 = (x340) b0kVar;
                x340Var4.k0(-1604383936);
                j06 j06Var = x340Var4.a;
                if ((i & 6) == 0) {
                    i3 = i | (x340Var4.g(i2cVar) ? 4 : 2);
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= (i & 64) == 0 ? x340Var4.g(rk41Var2) : x340Var4.i(rk41Var2) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i3 |= x340Var4.i(ce6Var) ? 2048 : 1024;
                }
                int i7 = i3;
                if (x340Var4.Y(i7 & 1, (i7 & 1043) != 1042)) {
                    Object objT5 = x340Var4.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT5 == m4cVar2) {
                        i4 = 0;
                        objT5 = bb00.h(0, x340Var4);
                    } else {
                        i4 = 0;
                    }
                    hdn0 hdn0Var2 = (hdn0) objT5;
                    Object objT6 = x340Var4.T();
                    if (objT6 == m4cVar2) {
                        objT6 = bb00.h(i4, x340Var4);
                    }
                    hdn0 hdn0Var3 = (hdn0) objT6;
                    Object objT7 = x340Var4.T();
                    if (objT7 == m4cVar2) {
                        objT7 = bb00.h(i4, x340Var4);
                    }
                    hdn0 hdn0Var4 = (hdn0) objT7;
                    if (z) {
                        ilv.a.getClass();
                        pxg1VarJ2 = new pxg1(700, 100, flv.g);
                    } else {
                        pxg1VarJ2 = irn1.j0();
                    }
                    pxg1 pxg1Var = pxg1VarJ2;
                    if (z != 0) {
                        ilv.a.getClass();
                        pxg1VarJ3 = new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 800, flv.d);
                    } else {
                        pxg1VarJ3 = irn1.j0();
                    }
                    Float fValueOf3 = Float.valueOf(z == 0 ? 0.0f : 1.0f);
                    tzg1 tzg1Var2 = rno1.a;
                    ven0 ven0VarR4 = zod.R(new hsi1("entityUp", fValueOf3, fValueOf2, pxg1Var, tzg1Var2), rk41Var2.a, (Function0) null, x340Var4, 8, 4);
                    hsi1 hsi1Var = new hsi1("titleIn", Float.valueOf(!z ? 0.0f : 1.0f), fValueOf2, pxg1VarJ3, tzg1Var2);
                    boolean z3 = rk41Var2.a;
                    boolean zI = x340Var4.i(ce6Var);
                    Object objT8 = x340Var4.T();
                    if (zI || objT8 == m4cVar2) {
                        objT8 = new pdy(ce6Var, (byte) 7);
                        x340Var4.s0(objT8);
                    }
                    ven0 ven0VarR5 = zod.R(hsi1Var, z3, (Function0) objT8, x340Var4, 8, 0);
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarD);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    boolean z4 = x340Var4.S;
                    n4k n4kVar = hmb0.t1;
                    if (z4) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC, x340Var4, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM2, x340Var4, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var4, lljVar3);
                    nko1.F(x340Var4);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE2, x340Var4, lljVar4);
                    qim0 qim0VarJ = u291.j(0.0f, i2cVar.c() * 0.75f, 1, u291.f(nim0Var, 1.0f));
                    Object objT9 = x340Var4.T();
                    if (objT9 == m4cVar2) {
                        objT9 = auy.a1;
                        x340Var4.s0(objT9);
                    }
                    qim0 qim0VarB2 = s161.b(qim0VarJ, true, (iu30) objT9);
                    mbh mbhVarA2 = jbh.a(h36.e, een.Q0, x340Var4, 54);
                    int iHashCode3 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM3 = x340Var4.m();
                    qim0 qim0VarE3 = zr7.E(x340Var4, qim0VarB2);
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(mbhVarA2, x340Var4, lljVar);
                    nko1.H(xos0VarM3, x340Var4, lljVar2);
                    x0d.q(iHashCode3, x340Var4, lljVar3, x340Var4);
                    qim0 qim0VarF2 = u291.f(kk0.q(x340Var4, qim0VarE3, lljVar4, 1.0f, false), 1.0f);
                    boolean zG3 = x340Var4.g(ven0VarR4);
                    Object objT10 = x340Var4.T();
                    if (zG3 || objT10 == m4cVar2) {
                        objT10 = new pak(ven0VarR4, (byte) 6);
                        x340Var4.s0(objT10);
                    }
                    qim0 qim0VarC = i541.C(qim0VarF2, (iu30) objT10);
                    gfh0 gfh0VarC2 = t1c.c(een.e, false);
                    int iHashCode4 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM4 = x340Var4.m();
                    qim0 qim0VarE4 = zr7.E(x340Var4, qim0VarC);
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var4, lljVar);
                    nko1.H(xos0VarM4, x340Var4, lljVar2);
                    x0d.q(iHashCode4, x340Var4, lljVar3, x340Var4);
                    nko1.H(qim0VarE4, x340Var4, lljVar4);
                    yk4 yk4Var = new yk4(yj41Var.a);
                    ksl kslVarA = yj41Var.a();
                    as80 as80Var = mif1.P0;
                    cbx.a.getClass();
                    ecx ecxVarA = uwr.a();
                    qim0 qim0VarR = d7e.r(1.0f, u291.f(uyn1.z(24.0f, 0.0f, 2, nim0Var), 1.0f), true);
                    Object objT11 = x340Var4.T();
                    if (objT11 == m4cVar2) {
                        objT11 = new tu9(hdn0Var3, (byte) 12);
                        x340Var4.s0(objT11);
                    }
                    qim0 qim0VarJ2 = v8r.j(lrn1.u(qim0VarR, (iu30) objT11), yj41Var.c);
                    uwr uwrVar2 = cbx.a;
                    cua cuaVar = cbx.b(x340Var4).f;
                    cua cuaVar2 = cbx.b(x340Var4).f;
                    eso1.f(yk4Var, kslVarA, qim0VarJ2, (p3v) null, new zvx(), ecxVarA, as80Var, (tl3) null, (ColorFilter) null, x340Var4, 1572864, 392);
                    vnr0 vnr0Var3 = (vnr0) ((bfg) obj).invoke(x340Var4, 0);
                    if (vnr0Var3 == null) {
                        x340Var4.i0(1896127619);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(1896127620);
                        qim0 qim0VarX = lrn1.x(uyn1.z(0.0f, 0.0f, 2, u291.f(nim0Var, 1.0f)), 2.0f);
                        Object objT12 = x340Var4.T();
                        if (objT12 == m4cVar2) {
                            hdn0Var = hdn0Var2;
                            objT12 = new tu9(hdn0Var, (byte) 13);
                            x340Var4.s0(objT12);
                        } else {
                            hdn0Var = hdn0Var2;
                        }
                        qim0 qim0VarB3 = eqr0.B(qim0VarX, (iu30) objT12);
                        Object objT13 = x340Var4.T();
                        if (objT13 == m4cVar2) {
                            objT13 = new tu9(hdn0Var, (byte) 14);
                            x340Var4.s0(objT13);
                        }
                        qgo1.f(vnr0Var3, lrn1.u(qim0VarB3, (iu30) objT13), new a0e1(3), 0, false, (iu30) null, x340Var4, 8, 56);
                        x340Var4.r(false);
                    }
                    x340Var4.r(true);
                    op71.g(x340Var4, u291.h(nim0Var, 24.0f));
                    vnr0 vnr0Var4 = (vnr0) ((bfg) obj3).invoke(x340Var4, 0);
                    qim0 qim0VarZ3 = uyn1.z(24.0f, 0.0f, 2, nim0Var);
                    Object objT14 = x340Var4.T();
                    if (objT14 == m4cVar2) {
                        objT14 = new tu9(hdn0Var4, (byte) 15);
                        x340Var4.s0(objT14);
                    }
                    qim0 qim0VarU2 = lrn1.u(qim0VarZ3, (iu30) objT14);
                    boolean zG4 = x340Var4.g(ven0VarR5);
                    Object objT15 = x340Var4.T();
                    if (zG4 || objT15 == m4cVar2) {
                        objT15 = new pak(ven0VarR5, (byte) 7);
                        x340Var4.s0(objT15);
                    }
                    qgo1.f(vnr0Var4, i541.C(qim0VarU2, (iu30) objT15), new a0e1(3), 0, false, (iu30) null, x340Var4, 8, 56);
                    x340Var4.r(true);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                h311 h311VarV2 = x340Var4.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new m5r(i, this, i2cVar, rk41Var, function0, (byte) 17);
                    return;
                }
                return;
            case 2:
                l7f1 l7f1Var = (l7f1) obj;
                m4c m4cVar3 = fkj0.X;
                x340 x340Var5 = (x340) b0kVar;
                x340Var5.k0(100528905);
                if ((i & 6) == 0) {
                    i5 = i | (x340Var5.g(i2cVar) ? 4 : 2);
                } else {
                    i5 = i;
                }
                if ((i & 48) == 0) {
                    i5 |= (i & 64) == 0 ? x340Var5.g(rk41Var2) : x340Var5.i(rk41Var2) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i5 |= x340Var5.i(ce6Var) ? 2048 : 1024;
                }
                if (x340Var5.Y(i5 & 1, (i5 & 1043) != 1042)) {
                    float fC = i2cVar.c();
                    qam1 qam1Var = (qam1) x340Var5.k(sam1.a);
                    ven0 ven0VarS = v8r.s(x340Var5.k(yhm1.a), x340Var5);
                    Object objT16 = x340Var5.T();
                    if (objT16 == m4cVar3) {
                        objT16 = v8r.q((Object) null);
                        x340Var5.s0(objT16);
                    }
                    ven0 ven0Var2 = (ven0) objT16;
                    Object objT17 = x340Var5.T();
                    if (objT17 == m4cVar3) {
                        objT17 = v8r.q((Object) null);
                        x340Var5.s0(objT17);
                    }
                    ven0 ven0Var3 = (ven0) objT17;
                    boolean zI2 = x340Var5.i(ce6Var);
                    Object objT18 = x340Var5.T();
                    if (zI2 || objT18 == m4cVar3) {
                        objT18 = new vbc1(ce6Var, (lnm) null, (byte) 4);
                        x340Var5.s0(objT18);
                    }
                    qxd0.t(rih1.a, x340Var5, (vu30) objT18);
                    x340Var5.i0(2119020703);
                    Iterator it = l7f1Var.c.iterator();
                    int i8 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            p7h.T();
                            throw null;
                        }
                        k7f1 k7f1Var = (k7f1) next;
                        Iterator it2 = it;
                        Integer numValueOf2 = Integer.valueOf(i8);
                        boolean zE = x340Var5.e(i8) | x340Var5.i(ce6Var) | x340Var5.i(k7f1Var);
                        ven0 ven0Var4 = ven0Var3;
                        Object objT19 = x340Var5.T();
                        if (zE || objT19 == m4cVar3) {
                            objT19 = new ju01(i8, ce6Var, k7f1Var, (byte) 11);
                            x340Var5.s0(objT19);
                        }
                        iu30 iu30Var = (iu30) objT19;
                        ard1 ard1Var = (ard1) obj3;
                        boolean zI3 = x340Var5.i(ard1Var);
                        Object objT20 = x340Var5.T();
                        if (zI3 || objT20 == m4cVar3) {
                            objT20 = new k7b1(1, ard1Var, ard1.class, "stopImpression", "stopImpression(Lcom/spotify/ubi/logger/ImpressionToken;)V", 0, (byte) 27);
                            x340Var5.s0(objT20);
                        }
                        yhm1.a(numValueOf2, iu30Var, (iu30) objT20, x340Var5, 0);
                        it = it2;
                        i8 = i9;
                        ven0Var2 = ven0Var2;
                        ven0Var3 = ven0Var4;
                    }
                    ven0 ven0Var5 = ven0Var3;
                    ven0 ven0Var6 = ven0Var2;
                    x340Var5.r(false);
                    boolean zI4 = x340Var5.i(ce6Var) | ((i5 & 112) == 32 || ((i5 & 64) != 0 && x340Var5.i(rk41Var2))) | x340Var5.g(ven0VarS) | x340Var5.i(qam1Var);
                    Object objT21 = x340Var5.T();
                    if (zI4 || objT21 == m4cVar3) {
                        x340Var2 = x340Var5;
                        wyy0 wyy0Var = new wyy0(ce6Var, rk41Var2, ven0Var6, qam1Var, ven0VarS, ven0Var5, (byte) 16);
                        rk41Var2 = rk41Var2;
                        ce6Var = ce6Var;
                        x340Var2.s0(wyy0Var);
                        objT21 = wyy0Var;
                    } else {
                        x340Var2 = x340Var5;
                    }
                    vu30 vu30Var = (vu30) objT21;
                    ven0 ven0VarU = xto.u("ta_title", 100, rk41Var2.a, ce6Var.b, (Function0) null, x340Var2, 54, 16);
                    gsc1 gsc1Var = l7f1Var.b;
                    boolean zG5 = x340Var2.g(ven0VarU);
                    Object objT22 = x340Var2.T();
                    if (zG5 || objT22 == m4cVar3) {
                        objT22 = new ctd1(ven0VarU, (byte) 9);
                        x340Var2.s0(objT22);
                    }
                    x340Var = x340Var2;
                    aym.i(gsc1Var, i541.C(nim0Var, (iu30) objT22), false, apo.r(-1950365336, new kas(ce6Var, rk41Var2, fC, vu30Var, ven0Var5), x340Var2), x340Var, 3456, 0);
                } else {
                    x340Var = x340Var5;
                    x340Var.b0();
                }
                h311 h311VarV3 = x340Var.v();
                if (h311VarV3 != null) {
                    h311VarV3.d = new uoc1(i, this, i2cVar, rk41Var, function0, (byte) 22);
                    return;
                }
                return;
            default:
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(-2046361560);
                if ((i & 48) == 0) {
                    i6 = i | ((i & 64) == 0 ? b0kVar3.g(rk41Var2) : b0kVar3.i(rk41Var2) ? 32 : 16);
                } else {
                    i6 = i;
                }
                if ((i & 384) == 0) {
                    i6 |= b0kVar3.i(function0) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i6 |= b0kVar3.i(ce6Var) ? 2048 : 1024;
                }
                if (b0kVar3.Y(i6 & 1, (i6 & 1169) != 1168)) {
                    boolean zBooleanValue = ((Boolean) ((tob1) obj3).getValue()).booleanValue();
                    ok41 ok41Var = (ok41) ce6Var.g;
                    boolean z5 = rk41Var2.a || ((Boolean) ((hrr0) obj2).getValue()).booleanValue();
                    Function0 function1 = ce6Var.f;
                    int i10 = ((i6 << 12) & 3670016) | 3072;
                    Float fValueOf4 = Float.valueOf(1.0f);
                    m4c m4cVar4 = fkj0.X;
                    b0kVar3.i0(1212549511);
                    if (zBooleanValue) {
                        b0kVar3.i0(-1907121061);
                        b0kVar3.r(false);
                        int i11 = ok41Var.a;
                        if (z) {
                            ilv.a.getClass();
                            zu91Var = new pxg1(500, i11 - 500, flv.j);
                        } else {
                            zu91Var = new zu91(i11);
                        }
                        hsi1 hsi1Var2 = new hsi1("content-exit", fValueOf4, Float.valueOf(0.0f), zu91Var, rno1.a);
                        boolean zG6 = b0kVar3.g(function1);
                        if ((((i10 & 3670016) ^ 1572864) <= 1048576 || !b0kVar3.g(function0)) && (i10 & 1572864) != 1048576) {
                            z2 = false;
                        }
                        boolean z6 = zG6 | z2;
                        Object objT23 = b0kVar3.T();
                        if (z6 || objT23 == m4cVar4) {
                            objT23 = new o350(function1, function0, (byte) 2);
                            b0kVar3.s0(objT23);
                        }
                        ven0VarR2 = zod.R(hsi1Var2, z5, (Function0) objT23, b0kVar3, 8, 0);
                    } else {
                        b0kVar3.i0(-1907167189);
                        Object objT24 = b0kVar3.T();
                        if (objT24 == m4cVar4) {
                            objT24 = v8r.q(fValueOf4);
                            b0kVar3.s0(objT24);
                        }
                        ven0VarR2 = (ven0) objT24;
                        b0kVar3.r(false);
                    }
                    b0kVar3.r(false);
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    boolean zI5 = b0kVar3.i(ce6Var) | b0kVar3.g(ven0VarR2);
                    Object objT25 = b0kVar3.T();
                    if (zI5 || objT25 == m4cVar4) {
                        objT25 = new cmd1(ce6Var, ven0VarR2, (byte) 21);
                        b0kVar3.s0(objT25);
                    }
                    b0kVar2 = b0kVar3;
                    w2g0.c(i541.C(qim0VarD2, (iu30) objT25), (tl3) null, apo.r(-1047138434, new xw91(ce6Var, rk41Var2, (byte) 20), b0kVar3), b0kVar2, 3072, 6);
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                }
                h311 h311VarV4 = b0kVar2.v();
                if (h311VarV4 != null) {
                    h311VarV4.d = new ncf1(i, ce6Var, i2cVar, rk41Var2, function0, (byte) 0);
                    return;
                }
                return;
        }
    }

    public void e(nbh nbhVar, c380 c380Var, float f, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        h311 h311VarV;
        p7f1 p7f1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1484611057);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(nbhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(c380Var) : x340Var.i(c380Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(this) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            m63 m63Var = (m63) m7f1.a.get(Integer.valueOf(c380Var.size()));
            if (m63Var == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    p7f1Var = new p7f1(this, nbhVar, c380Var, f, z, iu30Var, i, (byte) 1);
                }
            } else {
                uwr uwrVar = cbx.a;
                float f2 = cbx.b(x340Var).b.b;
                qim0 qim0VarR = i1p1.r(nbhVar.a(1.0f, u291.f(nim0.a, 1.0f), false));
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = nhe1.e1;
                    x340Var.s0(objT);
                }
                w2g0.c(s161.a(qim0VarR, (iu30) objT), een.e, apo.r(-1055803065, new o7f1(m63Var, f2, c380Var, f, iu30Var, z, this), x340Var), x340Var, 3120, 4);
            }
            h311VarV.d = p7f1Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            p7f1Var = new p7f1(this, nbhVar, c380Var, f, z, iu30Var, i, (byte) 0);
            h311VarV.d = p7f1Var;
        }
    }

    public void f(c380 c380Var, boolean z, Integer num, iu30 iu30Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var;
        Function0 function1;
        Function0 function2;
        qim0 qim0VarA;
        ce6 ce6Var = this;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        era eraVar = een.P0;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1291683619);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.i(c380Var) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.g(num) ? 256 : 128) | (x340Var2.i(iu30Var) ? 2048 : 1024) | (x340Var2.i(function0) ? 16384 : 8192) | (x340Var2.i(ce6Var) ? 131072 : 65536);
        Integer num2 = 0;
        if (x340Var2.Y(i2 & 1, (i2 & 74899) != 74898)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            int i3 = i2;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar4);
            nko1.H(xos0VarM, x340Var2, lljVar3);
            x0d.q(iHashCode, x340Var2, lljVar2, x340Var2);
            Iterator itN = kk0.n(x340Var2, qim0VarE, lljVar, 974466826, c380Var);
            int i4 = 0;
            while (itN.hasNext()) {
                Object next = itN.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                k7f1 k7f1Var = (k7f1) next;
                iu30 iu30Var2 = (iu30Var == null || k7f1Var.f == null) ? null : iu30Var;
                if (iu30Var2 == null) {
                    x340Var2.i0(426399746);
                    x340Var2.r(false);
                    function1 = null;
                } else {
                    x340Var2.i0(426399747);
                    boolean zG = x340Var2.g(iu30Var2) | x340Var2.i(k7f1Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = new n7f1(iu30Var2, k7f1Var);
                        x340Var2.s0(objT);
                    }
                    function1 = (Function0) objT;
                    x340Var2.r(false);
                }
                String strC = f4i1.c(i4, "ta_row_");
                int i6 = (i4 * 100) + 200;
                Iterator it = itN;
                if (i4 == p7h.L(c380Var)) {
                    x340Var2.i0(567955940);
                    x340Var2.r(false);
                    function2 = function0;
                } else {
                    x340Var2.i0(426796950);
                    Object objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = orc1.c1;
                        x340Var2.s0(objT2);
                    }
                    function2 = (Function0) objT2;
                    x340Var2.r(false);
                }
                int i7 = (i3 << 3) & 896;
                n4k n4kVar2 = n4kVar;
                era eraVar2 = eraVar;
                int i8 = i3;
                x340 x340Var3 = x340Var2;
                ven0 ven0VarU = xto.u(strC, i6, z, ce6Var.b, function2, x340Var3, i7, 0);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                uwr uwrVar2 = cbx.a;
                mta mtaVar = cbx.b(x340Var3).d;
                llj lljVar5 = lljVar;
                qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0VarF2);
                if (k7f1Var.e.length() > 0) {
                    x340Var3.i0(427044237);
                    boolean zI = ((i8 & 896) == 256) | x340Var3.i(k7f1Var) | x340Var3.g(function1) | x340Var3.e(i4);
                    Object objT3 = x340Var3.T();
                    if (zI || objT3 == m4cVar) {
                        objT3 = new q7f1(k7f1Var, function1, i4, num);
                        x340Var3.s0(objT3);
                    }
                    qim0VarA = s161.a(nim0Var, (iu30) objT3);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(427535680);
                    boolean zG2 = x340Var3.g(function1) | x340Var3.e(i4) | ((i8 & 896) == 256) | x340Var3.i(k7f1Var);
                    Object objT4 = x340Var3.T();
                    if (zG2 || objT4 == m4cVar) {
                        objT4 = new q7f1(function1, i4, num, k7f1Var);
                        x340Var3.s0(objT4);
                    }
                    qim0 qim0VarB = s161.b(nim0Var, true, (iu30) objT4);
                    x340Var3.r(false);
                    qim0VarA = qim0VarB;
                }
                qim0 qim0VarThen = qim0VarJ.then(qim0VarA);
                boolean zG3 = x340Var3.g(ven0VarU);
                Object objT5 = x340Var3.T();
                if (zG3 || objT5 == m4cVar) {
                    objT5 = new ctd1(ven0VarU, (byte) 8);
                    x340Var3.s0(objT5);
                }
                qim0 qim0VarC = i541.C(qim0VarThen, (iu30) objT5);
                if (function1 != null) {
                    qim0VarC = a8o.D(qim0VarC, function1);
                }
                jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var3, 48);
                int iHashCode2 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM2 = x340Var3.m();
                qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarC);
                hzj.A.getClass();
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar2);
                } else {
                    x340Var3.v0();
                }
                nko1.H(jw31VarA, x340Var3, lljVar4);
                nko1.H(xos0VarM2, x340Var3, lljVar3);
                x0d.q(iHashCode2, x340Var3, lljVar2, x340Var3);
                nko1.H(qim0VarE2, x340Var3, lljVar5);
                Integer num3 = num2;
                qgo1.f((vnr0) k7f1Var.a.invoke(x340Var3, num3), (qim0) null, (a0e1) null, 0, false, (iu30) null, x340Var3, 8, 62);
                cvx cvxVar2 = cbx.b(x340Var3).b;
                op71.g(x340Var3, u291.v(nim0Var, 12.0f));
                cvx cvxVar3 = cbx.b(x340Var3).b;
                mbh mbhVarA2 = jbh.a(new d36(4.0f, true, new um5(false)), eraVar2, x340Var3, 0);
                int iHashCode3 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM3 = x340Var3.m();
                qim0 qim0VarE3 = zr7.E(x340Var3, nim0Var);
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar2);
                } else {
                    x340Var3.v0();
                }
                nko1.H(mbhVarA2, x340Var3, lljVar4);
                nko1.H(xos0VarM3, x340Var3, lljVar3);
                x0d.q(iHashCode3, x340Var3, lljVar2, x340Var3);
                nko1.H(qim0VarE3, x340Var3, lljVar5);
                qgo1.f((vnr0) k7f1Var.b.invoke(x340Var3, num3), (qim0) null, (a0e1) null, 0, false, (iu30) null, x340Var3, 8, 62);
                qgo1.f((vnr0) k7f1Var.c.invoke(x340Var3, num3), (qim0) null, (a0e1) null, 0, false, (iu30) null, x340Var3, 8, 62);
                x340Var3.r(true);
                x340Var3.r(true);
                n4kVar = n4kVar2;
                lljVar = lljVar5;
                x340Var2 = x340Var3;
                i3 = i8;
                itN = it;
                eraVar = eraVar2;
                ce6Var = this;
                num2 = num3;
                i4 = i5;
            }
            x340Var = x340Var2;
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(this, c380Var, z, num, iu30Var, function0, i, (byte) 28);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        byte b = this.a;
        qk41 qk41Var = this.g;
        switch (b) {
            case 0:
                return qk41Var;
            case 1:
                return (ok41) qk41Var;
            case 2:
                return qk41Var;
            default:
                return (ok41) qk41Var;
        }
    }

    public ce6(f311 f311Var, tob1 tob1Var, hrr0 hrr0Var, boolean z, Function0 function0) {
        this.a = (byte) 3;
        this.c = f311Var;
        this.d = tob1Var;
        this.e = hrr0Var;
        this.b = z;
        this.f = function0;
        this.g = new ok41(6100);
    }

    public ce6(bfg bfgVar, bfg bfgVar2, yj41 yj41Var, boolean z, mim1 mim1Var) {
        this.a = (byte) 1;
        this.c = bfgVar;
        this.d = bfgVar2;
        this.e = yj41Var;
        this.b = z;
        this.f = mim1Var;
        this.g = new ok41(1800);
    }

    public ce6(zd6 zd6Var, zd6 zd6Var2, zyq0 zyq0Var, boolean z, i26 i26Var) {
        this.a = (byte) 0;
        ok41 ok41Var = new ok41(3800);
        this.c = zd6Var;
        this.d = zd6Var2;
        this.e = zyq0Var;
        this.b = z;
        this.f = i26Var;
        this.g = ok41Var;
    }
}
