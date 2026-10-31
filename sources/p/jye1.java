package p;

import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jye1 extends f311 {
    public final /* synthetic */ byte a = 0;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public jye1(p9f1 p9f1Var, boolean z) {
        this.c = p9f1Var;
        this.b = z;
        List list = p9f1Var.b;
        this.d = new ok41(((list.size() + 1) * 100) + 700);
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((f5v0) it.next()).a);
        }
        this.e = mqo1.A(arrayList);
    }

    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        pxg1 pxg1VarJ0;
        float f;
        float fFloatValue;
        x340 x340Var;
        pxg1 pxg1VarJ1;
        f36 d36Var;
        int i2;
        pxg1 pxg1VarJ2;
        x340 x340Var2;
        x340 x340Var3;
        byte b = this.a;
        Object obj = this.c;
        nim0 nim0Var = nim0.a;
        switch (b) {
            case 0:
                bfg bfgVar = (bfg) obj;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(-450011435);
                int i3 = (i & 6) == 0 ? i | (b0kVar3.g(i2cVar) ? 4 : 2) : i;
                if ((i & 48) == 0) {
                    i3 |= (i & 64) == 0 ? b0kVar3.g(rk41Var) : b0kVar3.i(rk41Var) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i3 |= b0kVar3.i(this) ? 2048 : 1024;
                }
                if (b0kVar3.Y(i3 & 1, (i3 & 1043) != 1042)) {
                    hon1.v(b0kVar3);
                    Object objT = b0kVar3.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = bb00.h(0, b0kVar3);
                    }
                    hdn0 hdn0Var = (hdn0) objT;
                    boolean z = this.b;
                    if (z) {
                        ilv.a.getClass();
                        pxg1VarJ0 = new pxg1(700, 100, flv.g);
                    } else {
                        pxg1VarJ0 = irn1.j0();
                    }
                    hsi1 hsi1Var = new hsi1("titleUp", Float.valueOf(!z ? 0.0f : 1.0f), Float.valueOf(0.0f), pxg1VarJ0, rno1.a);
                    boolean z2 = rk41Var.a;
                    boolean zI = b0kVar3.i(this);
                    Object objT2 = b0kVar3.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new fjc1(this, (byte) 26);
                        b0kVar3.s0(objT2);
                    }
                    ven0 ven0VarR = zod.R(hsi1Var, z2, (Function0) objT2, b0kVar3, 8, 0);
                    b0kVar2 = b0kVar3;
                    if (z) {
                        f = 1.0f;
                        fFloatValue = 1.0f - ((Number) ven0VarR.getValue()).floatValue();
                    } else {
                        fFloatValue = 1.0f;
                        f = 1.0f;
                    }
                    op71.g(b0kVar2, u291.c(nim0Var, 0.13f));
                    vnr0 vnr0Var = (vnr0) bfgVar.invoke(b0kVar2, 0);
                    qim0 qim0VarA = i2cVar.a(uyn1.x(u291.f(nim0Var, f), u890.j(((vnr0) bfgVar.invoke(b0kVar2, 0)).c, new jor0((eor0) null, (djc0) null, (tnr0) null, (bor0) null, 0.0f, 63)) ? 0.0f : 24.0f), een.h);
                    boolean zD = b0kVar2.d(fFloatValue) | b0kVar2.g(ven0VarR);
                    Object objT3 = b0kVar2.T();
                    if (zD || objT3 == m4cVar) {
                        objT3 = new na5(fFloatValue, (tob1) ven0VarR, (byte) 3);
                        b0kVar2.s0(objT3);
                    }
                    qim0 qim0VarC = i541.C(qim0VarA, (iu30) objT3);
                    Object objT4 = b0kVar2.T();
                    if (objT4 == m4cVar) {
                        objT4 = new qsc1(hdn0Var, (byte) 2);
                        b0kVar2.s0(objT4);
                    }
                    qgo1.f(vnr0Var, lrn1.u(qim0VarC, (iu30) objT4), new a0e1(3), 0, false, (iu30) null, b0kVar2, 8, 56);
                    op71.g(b0kVar2, u291.h(nim0Var, 16.0f));
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new uoc1(i, this, i2cVar, rk41Var, function0, (byte) 19);
                    return;
                }
                return;
            case 1:
                p9f1 p9f1Var = (p9f1) obj;
                List list = p9f1Var.b;
                m4c m4cVar2 = fkj0.X;
                Float fValueOf = Float.valueOf(0.0f);
                x340 x340Var4 = (x340) b0kVar;
                x340Var4.k0(-238164694);
                j06 j06Var = x340Var4.a;
                int i4 = (i & 6) == 0 ? (x340Var4.g(i2cVar) ? 4 : 2) | i : i;
                if ((i & 48) == 0) {
                    i4 |= (i & 64) == 0 ? x340Var4.g(rk41Var) : x340Var4.i(rk41Var) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i4 |= x340Var4.i(this) ? 2048 : 1024;
                }
                if (x340Var4.Y(i4 & 1, (i4 & 1043) != 1042)) {
                    Object objT5 = x340Var4.T();
                    if (objT5 == m4cVar2) {
                        objT5 = v8r.q(new rfv0(0, 0));
                        x340Var4.s0(objT5);
                    }
                    ven0 ven0Var = (ven0) objT5;
                    float fC = i2cVar.c() * 0.113f;
                    boolean z3 = ((wat) x340Var4.k(t4k.h)).U0() <= 1.75f;
                    boolean z4 = this.b;
                    float f2 = !z4 ? 0.0f : 1.0f;
                    if (z4) {
                        ilv.a.getClass();
                        pxg1VarJ1 = new pxg1(700, 100, flv.g);
                    } else {
                        pxg1VarJ1 = irn1.j0();
                    }
                    pxg1 pxg1Var = pxg1VarJ1;
                    Float fValueOf2 = Float.valueOf(f2);
                    tzg1 tzg1Var = rno1.a;
                    ven0 ven0VarR2 = zod.R(new hsi1("headerIn", fValueOf2, fValueOf, pxg1Var, tzg1Var), rk41Var.a, (Function0) null, x340Var4, 8, 4);
                    x340 x340Var5 = x340Var4;
                    x340Var5.i0(-1242972788);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    int i5 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            p7h.T();
                            throw null;
                        }
                        Iterator it2 = it;
                        String strC = f4i1.c(i5, "row");
                        char c = !z4 ? (char) 0 : (char) 0;
                        if (z4) {
                            ilv.a.getClass();
                            pxg1VarJ2 = new pxg1(700, (i5 + 2) * 100, flv.g);
                        } else {
                            pxg1VarJ2 = irn1.j0();
                        }
                        hsi1 hsi1Var2 = new hsi1(strC, Float.valueOf(c), fValueOf, pxg1VarJ2, tzg1Var);
                        boolean z5 = rk41Var.a;
                        boolean zE = x340Var5.e(i5) | x340Var5.i(this) | ((i4 & 112) == 32 || ((i4 & 64) != 0 && x340Var5.i(rk41Var)));
                        Object objT6 = x340Var5.T();
                        if (zE || objT6 == m4cVar2) {
                            objT6 = new ynd1(i5, this, rk41Var, (byte) 1);
                            x340Var5.s0(objT6);
                        }
                        x340 x340Var6 = x340Var5;
                        arrayList.add(zod.R(hsi1Var2, z5, (Function0) objT6, x340Var6, 8, 0));
                        x340Var5 = x340Var6;
                        z4 = z4;
                        i5 = i6;
                        i4 = i4;
                        j06Var = j06Var;
                        it = it2;
                    }
                    x340 x340Var7 = x340Var5;
                    j06 j06Var2 = j06Var;
                    x340Var7.r(false);
                    c380 c380Var = (c380) this.e;
                    rfv0 rfv0Var = (rfv0) ven0Var.getValue();
                    Object objT7 = x340Var7.T();
                    if (objT7 == m4cVar2) {
                        objT7 = new ry71(ven0Var, (byte) 21);
                        x340Var7.s0(objT7);
                    }
                    iu30 iu30Var = (iu30) objT7;
                    uwr uwrVar = cbx.a;
                    oon1.a(c380Var, rfv0Var, iu30Var, cbx.d(x340Var7).c, cbx.d(x340Var7).b, (qim0) null, x340Var7, 448);
                    x340Var = x340Var7;
                    era eraVar = een.Q0;
                    qim0 qim0VarB = uyn1.B(uyn1.z(24.0f, 0.0f, 2, u291.d(nim0Var, 1.0f)), 0.0f, 0.0f, 0.0f, 24.0f, 7);
                    mbh mbhVarA = jbh.a(h36.e, eraVar, x340Var, 54);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
                    hzj.A.getClass();
                    if (j06Var2 == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    boolean z6 = x340Var.S;
                    n4k n4kVar = hmb0.t1;
                    if (z6) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(mbhVarA, x340Var, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var, lljVar3);
                    nko1.F(x340Var);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var, lljVar4);
                    vnr0 vnr0Var2 = (vnr0) p9f1Var.a.invoke(x340Var, 0);
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    boolean zG = x340Var.g(ven0VarR2);
                    Object objT8 = x340Var.T();
                    if (zG || objT8 == m4cVar2) {
                        objT8 = new ctd1(ven0VarR2, (byte) 14);
                        x340Var.s0(objT8);
                    }
                    qgo1.f(vnr0Var2, i541.C(qim0VarF, (iu30) objT8), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
                    op71.g(x340Var, u291.h(nim0Var, 24.0f));
                    if (z3) {
                        d36Var = h36.c;
                        i2 = 0;
                    } else {
                        i2 = 0;
                        d36Var = new d36(8.0f, true, new um5(false));
                    }
                    mbh mbhVarA2 = jbh.a(d36Var, een.P0, x340Var, i2);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA2, x340Var, lljVar);
                    nko1.H(xos0VarM2, x340Var, lljVar2);
                    x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar4);
                    x340Var.i0(-1871334510);
                    int i7 = 0;
                    for (Object obj2 : list) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            p7h.T();
                            throw null;
                        }
                        rwq.d(fC, (f5v0) obj2, ((rfv0) ven0Var.getValue()).a, z3, (tob1) arrayList.get(i7), z3 ? u291.j(fC, 0.0f, 2, nim0Var) : u291.j(56.0f, 0.0f, 2, nim0Var), x340Var, 64);
                        i7 = i8;
                    }
                    us71.m(x340Var, false, true, true);
                } else {
                    x340Var = x340Var4;
                    x340Var.b0();
                }
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new uoc1(i, this, i2cVar, rk41Var, function0, (byte) 26);
                    return;
                }
                return;
            case 2:
                Float fValueOf3 = Float.valueOf(1.0f);
                Float fValueOf4 = Float.valueOf(0.0f);
                x340 x340Var8 = (x340) b0kVar;
                x340Var8.k0(1865113151);
                int i9 = (i & 6) == 0 ? (x340Var8.g(i2cVar) ? 4 : 2) | i : i;
                if ((i & 48) == 0) {
                    i9 |= (i & 64) == 0 ? x340Var8.g(rk41Var) : x340Var8.i(rk41Var) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i9 |= x340Var8.i(this) ? 2048 : 1024;
                }
                if (x340Var8.Y(i9 & 1, (i9 & 1043) != 1042)) {
                    x340Var8.i0(1372380862);
                    ArrayList arrayList2 = new ArrayList(4);
                    int i10 = 0;
                    while (true) {
                        tzg1 tzg1Var2 = rno1.a;
                        if (i10 < 4) {
                            int i11 = i10 + 1;
                            String strC2 = f4i1.c(i11, "twinGiftRow");
                            ilv.a.getClass();
                            x340 x340Var9 = x340Var8;
                            arrayList2.add(zod.S(new hsi1(strC2, fValueOf3, fValueOf4, new pxg1(700, (i10 * 100) + 200, flv.g), tzg1Var2), rk41Var.a, this.b, (Function0) null, x340Var9, 8, 8));
                            x340Var8 = x340Var9;
                            i10 = i11;
                        } else {
                            x340Var2 = x340Var8;
                            x340Var2.r(false);
                            ilv.a.getClass();
                            ven0 ven0VarS = zod.S(new hsi1("twinGiftFooter", fValueOf4, fValueOf3, new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 800, flv.d), tzg1Var2), rk41Var.a, this.b, (j4f1) this.d, x340Var2, 8, 0);
                            p3v p3vVarJ = zjy.j(i2cVar.c() * 0.325f, new p3v(i2cVar.d() * 0.575f));
                            float f3 = p3vVarJ.a;
                            float f4 = zjy.j(i2cVar.c() * 0.15f, p3vVarJ).a;
                            qim0 qim0VarC2 = u291.c(u291.f(i2cVar.a(nim0Var, een.h), 1.0f), 0.75f);
                            uwr uwrVar2 = cbx.a;
                            qim0 qim0VarU = qxy0.u(uyn1.z(cbx.b(x340Var2).b.b, 0.0f, 2, qim0VarC2), (idn0) null, 3);
                            Object objT9 = x340Var2.T();
                            m4c m4cVar3 = fkj0.X;
                            if (objT9 == m4cVar3) {
                                objT9 = ppg1.Z0;
                                x340Var2.s0(objT9);
                            }
                            qim0 qim0VarB2 = s161.b(qim0VarU, true, (iu30) objT9);
                            mbh mbhVarA3 = jbh.a(h36.e, een.Q0, x340Var2, 54);
                            int iHashCode3 = Long.hashCode(x340Var2.T);
                            xos0 xos0VarM3 = x340Var2.m();
                            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarB2);
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
                            nko1.H(mbhVarA3, x340Var2, y580.O0);
                            nko1.H(xos0VarM3, x340Var2, y580.N0);
                            nko1.H(Integer.valueOf(iHashCode3), x340Var2, y580.R0);
                            nko1.F(x340Var2);
                            nko1.H(qim0VarE3, x340Var2, y580.Y);
                            crn1.a((tob1) arrayList2.get(0), (qim0) null, apo.r(-222161409, new xxg1(this, (byte) 0), x340Var2), x340Var2, 384);
                            w2g0.c(kx40.h(1.0f, u291.f(nim0Var, 1.0f), false), (tl3) null, apo.r(395938547, new yxg1(f3, f4, arrayList2, this), x340Var2), x340Var2, 3072, 6);
                            crn1.a((tob1) arrayList2.get(2), (qim0) null, apo.r(380374632, new xxg1(this, (byte) 1), x340Var2), x340Var2, 384);
                            cvx cvxVar = cbx.b(x340Var2).b;
                            op71.g(x340Var2, u291.h(nim0Var, 8.0f));
                            crn1.a((tob1) arrayList2.get(3), (qim0) null, apo.r(-999410681, new xxg1(this, (byte) 2), x340Var2), x340Var2, 384);
                            cvx cvxVar2 = cbx.b(x340Var2).b;
                            op71.g(x340Var2, u291.h(nim0Var, 16.0f));
                            vnr0 vnr0Var3 = (vnr0) ((wxg1) obj).e.invoke(x340Var2, 0);
                            boolean zG2 = x340Var2.g(ven0VarS);
                            Object objT10 = x340Var2.T();
                            if (zG2 || objT10 == m4cVar3) {
                                objT10 = new ctd1(ven0VarS, (byte) 27);
                                x340Var2.s0(objT10);
                            }
                            qgo1.f(vnr0Var3, i541.C(nim0Var, (iu30) objT10), (a0e1) null, 0, false, (iu30) null, x340Var2, 8, 60);
                            x340Var2.r(true);
                        }
                    }
                } else {
                    x340Var2 = x340Var8;
                    x340Var2.b0();
                }
                h311 h311VarV3 = x340Var2.v();
                if (h311VarV3 != null) {
                    h311VarV3.d = new ncf1(i, this, i2cVar, rk41Var, function0, (byte) 10);
                    return;
                }
                return;
            default:
                m4c m4cVar4 = fkj0.X;
                Float fValueOf5 = Float.valueOf(1.0f);
                Float fValueOf6 = Float.valueOf(0.0f);
                x340 x340Var10 = (x340) b0kVar;
                x340Var10.k0(-1443631357);
                int i12 = (i & 6) == 0 ? i | (x340Var10.g(i2cVar) ? 4 : 2) : i;
                if ((i & 48) == 0) {
                    i12 |= (i & 64) == 0 ? x340Var10.g(rk41Var) : x340Var10.i(rk41Var) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i12 |= x340Var10.i(this) ? 2048 : 1024;
                }
                if (x340Var10.Y(i12 & 1, (i12 & 1043) != 1042)) {
                    pxg1 pxg1Var2 = new pxg1(700, 100, gdm1.a);
                    tzg1 tzg1Var3 = rno1.a;
                    ven0 ven0VarS2 = zod.S(new hsi1("titleIn", fValueOf5, fValueOf6, pxg1Var2, tzg1Var3), rk41Var.a, this.b, (Function0) null, x340Var10, 8, 8);
                    x340Var3 = x340Var10;
                    hsi1 hsi1Var3 = new hsi1("subtitleIn", fValueOf5, fValueOf6, new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 800, gdm1.c), tzg1Var3);
                    boolean z7 = rk41Var.a;
                    boolean z8 = (i12 & 112) == 32 || ((i12 & 64) != 0 && x340Var3.i(rk41Var));
                    Object objT11 = x340Var3.T();
                    if (z8 || objT11 == m4cVar4) {
                        objT11 = new kf6(rk41Var, (byte) 9);
                        x340Var3.s0(objT11);
                    }
                    ven0 ven0VarS3 = zod.S(hsi1Var3, z7, this.b, (Function0) objT11, x340Var3, 8, 0);
                    qim0 qim0VarA2 = i2cVar.a(u291.c(u291.f(nim0Var, 1.0f), 0.7f), een.h);
                    float fD = i2cVar.d() * 0.19f;
                    uwr uwrVar3 = cbx.a;
                    qim0 qim0VarU2 = qxy0.u(uyn1.y(qim0VarA2, fD, cbx.b(x340Var3).b.b), (idn0) null, 3);
                    Object objT12 = x340Var3.T();
                    if (objT12 == m4cVar4) {
                        objT12 = gbm1.g;
                        x340Var3.s0(objT12);
                    }
                    qim0 qim0VarB3 = s161.b(qim0VarU2, true, (iu30) objT12);
                    mbh mbhVarA4 = jbh.a(h36.e, een.Q0, x340Var3, 54);
                    int iHashCode4 = Long.hashCode(x340Var3.T);
                    xos0 xos0VarM4 = x340Var3.m();
                    qim0 qim0VarE4 = zr7.E(x340Var3, qim0VarB3);
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
                    nko1.H(mbhVarA4, x340Var3, y580.O0);
                    nko1.H(xos0VarM4, x340Var3, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode4), x340Var3, y580.R0);
                    nko1.F(x340Var3);
                    nko1.H(qim0VarE4, x340Var3, y580.Y);
                    vnr0 vnr0Var4 = (vnr0) ((fdm1) obj).invoke(x340Var3, 0);
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    Object objT13 = x340Var3.T();
                    if (objT13 == m4cVar4) {
                        objT13 = gbm1.h;
                        x340Var3.s0(objT13);
                    }
                    qim0 qim0VarB4 = s161.b(qim0VarF2, false, (iu30) objT13);
                    boolean zG3 = x340Var3.g(ven0VarS2);
                    Object objT14 = x340Var3.T();
                    if (zG3 || objT14 == m4cVar4) {
                        objT14 = new eyg1(ven0VarS2, (byte) 16);
                        x340Var3.s0(objT14);
                    }
                    qgo1.f(vnr0Var4, i541.C(qim0VarB4, (iu30) objT14), (a0e1) null, 0, false, (iu30) null, x340Var3, 8, 60);
                    cvx cvxVar3 = cbx.b(x340Var3).b;
                    op71.g(x340Var3, u291.h(nim0Var, 16.0f));
                    vnr0 vnr0Var5 = (vnr0) ((fdm1) this.d).invoke(x340Var3, 0);
                    qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                    boolean zG4 = x340Var3.g(ven0VarS3);
                    Object objT15 = x340Var3.T();
                    if (zG4 || objT15 == m4cVar4) {
                        objT15 = new eyg1(ven0VarS3, (byte) 17);
                        x340Var3.s0(objT15);
                    }
                    qgo1.f(vnr0Var5, i541.C(qim0VarF3, (iu30) objT15), (a0e1) null, 0, false, (iu30) null, x340Var3, 8, 60);
                    x340Var3.r(true);
                } else {
                    x340Var3 = x340Var10;
                    x340Var3.b0();
                }
                h311 h311VarV4 = x340Var3.v();
                if (h311VarV4 != null) {
                    h311VarV4.d = new swk1(i, this, i2cVar, rk41Var, function0, (byte) 14);
                    return;
                }
                return;
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                return (qk41) obj;
            case 1:
                return (ok41) this.d;
            case 2:
                return (qk41) obj;
            default:
                return (qk41) obj;
        }
    }

    public jye1(bfg bfgVar, boolean z, Integer num, mim1 mim1Var) {
        this.c = bfgVar;
        this.b = z;
        this.d = mim1Var;
        this.e = new ok41(num.intValue() + 800);
    }

    public jye1(wxg1 wxg1Var, boolean z, j4f1 j4f1Var) {
        Object ok41Var;
        this.c = wxg1Var;
        this.b = z;
        this.d = j4f1Var;
        if (z) {
            ok41Var = new ok41(1800);
        } else {
            ok41Var = pk41.a;
        }
        this.e = ok41Var;
    }

    public jye1(fdm1 fdm1Var, fdm1 fdm1Var2, boolean z) {
        Object ok41Var;
        this.c = fdm1Var;
        this.d = fdm1Var2;
        this.b = z;
        if (z) {
            ok41Var = new ok41(1800);
        } else {
            ok41Var = pk41.a;
        }
        this.e = ok41Var;
    }
}
