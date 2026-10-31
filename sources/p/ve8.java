package p;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ve8 extends f311 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ve8(rl1 rl1Var, wj31 wj31Var, List list) {
        this.a = (byte) 0;
        this.b = rl1Var;
        this.c = wj31Var;
        this.d = list;
        this.e = rl1Var.b ? new ok41(we8.a) : pk41.a;
    }

    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        boolean z;
        int i3;
        x340 x340Var;
        int i4;
        b0k b0kVar2;
        h311 h311VarV;
        rme1 rme1Var;
        rk41 rk41Var2;
        int i5;
        ve8 ve8Var;
        x340 x340Var2;
        h311 h311VarV2;
        ccf1 ccf1Var;
        float f;
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.c;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                rl1 rl1Var = (rl1) obj3;
                boolean z2 = rk41Var.a;
                x340 x340Var3 = (x340) b0kVar;
                x340Var3.k0(-1681111904);
                if ((i & 6) == 0) {
                    i2 = i | (x340Var3.g(i2cVar) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= (i & 64) == 0 ? x340Var3.g(rk41Var) : x340Var3.i(rk41Var) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i2 |= x340Var3.i(this) ? 2048 : 1024;
                }
                if (x340Var3.Y(i2 & 1, (i2 & 1043) != 1042)) {
                    Object objT = x340Var3.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = v8r.q(Boolean.FALSE);
                        x340Var3.s0(objT);
                    }
                    ven0 ven0Var = (ven0) objT;
                    Object objT2 = x340Var3.T();
                    if (objT2 == m4cVar) {
                        objT2 = v8r.q(Boolean.FALSE);
                        x340Var3.s0(objT2);
                    }
                    ven0 ven0Var2 = (ven0) objT2;
                    Object objT3 = x340Var3.T();
                    if (objT3 == m4cVar) {
                        z = true;
                        objT3 = c13.l(!rl1Var.b, x340Var3);
                    } else {
                        z = true;
                    }
                    ven0 ven0Var3 = (ven0) objT3;
                    boolean z3 = (((Boolean) ven0Var.getValue()).booleanValue() && ((Boolean) ven0Var2.getValue()).booleanValue() && ((Boolean) ven0Var3.getValue()).booleanValue()) ? z : false;
                    Boolean boolValueOf = Boolean.valueOf(z3);
                    Boolean boolValueOf2 = Boolean.valueOf(z2);
                    boolean zH = x340Var3.h(z3);
                    if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !x340Var3.i(rk41Var))) {
                        z = false;
                    }
                    boolean z4 = zH | z;
                    Object objT4 = x340Var3.T();
                    if (z4 || objT4 == m4cVar) {
                        objT4 = new te8(z3, rk41Var, null, (byte) 0);
                        x340Var3.s0(objT4);
                    }
                    qxd0.s(boolValueOf, boolValueOf2, (vu30) objT4, x340Var3);
                    ilv.a.getClass();
                    ceo ceoVar = flv.d;
                    boolean z5 = rk41Var.a;
                    boolean z6 = rl1Var.b;
                    Object objT5 = x340Var3.T();
                    if (objT5 == m4cVar) {
                        objT5 = new ma0(ven0Var, (byte) 26);
                        x340Var3.s0(objT5);
                    }
                    ven0 ven0VarH = yxo1.H("audiobooksListTitle", 100, 800, ceoVar, z5, z6, (Function0) objT5, x340Var3);
                    boolean z7 = rk41Var.a;
                    boolean z8 = rl1Var.b;
                    Object objT6 = x340Var3.T();
                    if (objT6 == m4cVar) {
                        objT6 = new ma0(ven0Var2, (byte) 25);
                        x340Var3.s0(objT6);
                    }
                    ven0 ven0VarH2 = yxo1.H("audiobooksListSubtitle", 200, 800, ceoVar, z7, z8, (Function0) objT6, x340Var3);
                    Object objT7 = x340Var3.T();
                    if (objT7 == m4cVar) {
                        objT7 = new ue8(ven0Var3, null, (byte) 0);
                        x340Var3.s0(objT7);
                    }
                    Map mapSingletonMap = Collections.singletonMap("animationFinished", objT7);
                    uwr uwrVar = cbx.a;
                    float f2 = cbx.b(x340Var3).b.e;
                    String str = !z2 ? (String) rl1Var.e : "";
                    float fC = i2cVar.c();
                    int i6 = we8.a;
                    p3v p3vVarM = yoi1.m(new p3v(fC * 0.36f), new p3v(420.0f));
                    w61 w61Var = new w61(yoi1.m(new p3v(48.0f), p3vVarM).a, p3vVarM.a);
                    j2i j2iVarR = apo.r(-1356001909, new zt6(this, rk41Var, mapSingletonMap, (byte) 6), x340Var3);
                    Object objT8 = x340Var3.T();
                    if (objT8 == m4cVar) {
                        objT8 = new ma0(ven0Var3, (byte) 24);
                        x340Var3.s0(objT8);
                    }
                    wxo1.c(i2cVar, f2, w61Var, str, j2iVarR, (Function0) objT8, apo.r(-934415075, new n891(this, ven0VarH, ven0VarH2, (byte) 24), x340Var3), x340Var3, 14352432 | (i2 & 14));
                } else {
                    x340Var3.b0();
                }
                h311 h311VarV3 = x340Var3.v();
                if (h311VarV3 != null) {
                    h311VarV3.d = new l8(i, this, i2cVar, rk41Var, function0, (byte) 22);
                    return;
                }
                return;
            case 1:
                x990 x990Var = (x990) obj3;
                m4c m4cVar2 = fkj0.X;
                x340 x340Var4 = (x340) b0kVar;
                x340Var4.k0(-1691320547);
                j06 j06Var = x340Var4.a;
                if ((i & 6) == 0) {
                    i3 = (x340Var4.g(i2cVar) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= (i & 64) == 0 ? x340Var4.g(rk41Var) : x340Var4.i(rk41Var) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i3 |= x340Var4.i(this) ? 2048 : 1024;
                }
                if (x340Var4.Y(i3 & 1, (i3 & 1043) != 1042)) {
                    Boolean boolValueOf3 = Boolean.valueOf(rk41Var.a);
                    boolean zI = ((i3 & 112) == 32 || ((i3 & 64) != 0 && x340Var4.i(rk41Var))) | x340Var4.i(this);
                    Object objT9 = x340Var4.T();
                    if (zI || objT9 == m4cVar2) {
                        objT9 = new e3p0(rk41Var, this, (lnm) null, (byte) 11);
                        x340Var4.s0(objT9);
                    }
                    qxd0.t(boolValueOf3, x340Var4, (vu30) objT9);
                    float fC2 = i2cVar.c() * 0.75f * 0.56f;
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarD);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    boolean z9 = x340Var4.S;
                    n4k n4kVar = hmb0.t1;
                    if (z9) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC, x340Var4, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var4, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var4, lljVar3);
                    nko1.F(x340Var4);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var4, lljVar4);
                    qim0 qim0VarU = qxy0.u(uyn1.z(24.0f, 0.0f, 2, u291.c(u291.f(nim0Var, 1.0f), 0.75f)), (idn0) null, 3);
                    Object objT10 = x340Var4.T();
                    if (objT10 == m4cVar2) {
                        objT10 = rfq0.X0;
                        x340Var4.s0(objT10);
                    }
                    qim0 qim0VarB = s161.b(qim0VarU, true, (iu30) objT10);
                    mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var4, 54);
                    int iHashCode2 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarB);
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(mbhVarA, x340Var4, lljVar);
                    nko1.H(xos0VarM2, x340Var4, lljVar2);
                    x0d.q(iHashCode2, x340Var4, lljVar3, x340Var4);
                    nko1.H(qim0VarE2, x340Var4, lljVar4);
                    if (((yj41) this.d) != null) {
                        x340Var4.i0(718968953);
                        w2g0.c(kx40.h(1.0f, u291.f(nim0Var, 1.0f), false), (tl3) null, apo.r(92686672, new ye6(fC2, this, (byte) 5), x340Var4), x340Var4, 3072, 6);
                        x340Var = x340Var4;
                        x340Var.r(false);
                    } else {
                        x340Var = x340Var4;
                        x340Var.i0(719622433);
                        x340Var.r(false);
                    }
                    x340 x340Var5 = x340Var;
                    qgo1.f((vnr0) x990Var.invoke(x340Var, 0), uyn1.z(u890.j(((vnr0) x990Var.invoke(x340Var, 0)).c, new jor0((eor0) null, (djc0) null, (tnr0) null, (bor0) null, 0.0f, 63)) ? 0.0f : 24.0f, 0.0f, 2, u291.f(nim0Var, 1.0f)), new a0e1(3), 0, false, (iu30) null, x340Var5, 8, 56);
                    op71.g(x340Var, u291.h(nim0Var, 16.0f));
                    qgo1.f((vnr0) ((x990) obj2).invoke(x340Var, 0), u291.f(nim0Var, 1.0f), new a0e1(3), 0, false, (iu30) null, x340Var5, 56, 56);
                    x340Var.r(true);
                    x340Var.r(true);
                } else {
                    x340Var = x340Var4;
                    x340Var.b0();
                }
                h311 h311VarV4 = x340Var.v();
                if (h311VarV4 != null) {
                    h311VarV4.d = new etg0(i, this, i2cVar, rk41Var, function0, (byte) 20);
                    return;
                }
                return;
            case 2:
                m4c m4cVar3 = fkj0.X;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(-1480910403);
                if ((i & 48) == 0) {
                    i4 = i | ((i & 64) == 0 ? b0kVar3.g(rk41Var) : b0kVar3.i(rk41Var) ? 32 : 16);
                } else {
                    i4 = i;
                }
                if ((i & 384) == 0) {
                    i4 |= b0kVar3.i(function0) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i4 |= b0kVar3.i(this) ? 2048 : 1024;
                }
                if (b0kVar3.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    if (((Boolean) ((hrr0) obj).getValue()).booleanValue()) {
                        b0kVar3.i0(102397541);
                        boolean z10 = (i4 & 896) == 256;
                        Object objT11 = b0kVar3.T();
                        if (z10 || objT11 == m4cVar3) {
                            objT11 = new to1(function0, (lnm) null, (byte) 18);
                            b0kVar3.s0(objT11);
                        }
                        qxd0.t(rih1Var, b0kVar3, (vu30) objT11);
                        b0kVar3.r(false);
                        h311VarV = b0kVar3.v();
                        if (h311VarV == null) {
                            return;
                        } else {
                            rme1Var = new rme1(this, i2cVar, rk41Var, function0, i, (byte) 0);
                        }
                    } else {
                        b0kVar3.i0(102459045);
                        b0kVar3.r(false);
                        boolean zI2 = b0kVar3.i(this);
                        Object objT12 = b0kVar3.T();
                        if (zI2 || objT12 == m4cVar3) {
                            objT12 = new vbc1(this, (lnm) null, (byte) 2);
                            b0kVar3.s0(objT12);
                        }
                        qxd0.t(rih1Var, b0kVar3, (vu30) objT12);
                        Object objT13 = b0kVar3.T();
                        if (objT13 == m4cVar3) {
                            objT13 = v8r.q(Boolean.FALSE);
                            b0kVar3.s0(objT13);
                        }
                        ven0 ven0Var4 = (ven0) objT13;
                        boolean zI3 = b0kVar3.i(this);
                        Object objT14 = b0kVar3.T();
                        if (zI3 || objT14 == m4cVar3) {
                            objT14 = new pec1(this, ven0Var4, (lnm) null, (byte) 15);
                            b0kVar3.s0(objT14);
                        }
                        qxd0.t(rih1Var, b0kVar3, (vu30) objT14);
                        Boolean bool = (Boolean) ven0Var4.getValue();
                        bool.booleanValue();
                        Boolean boolValueOf4 = Boolean.valueOf(rk41Var.a);
                        boolean zI4 = b0kVar3.i(rk41Var) | b0kVar3.i(this) | ((i4 & 896) == 256);
                        Object objT15 = b0kVar3.T();
                        if (zI4 || objT15 == m4cVar3) {
                            wba1 wba1Var = new wba1(rk41Var, this, function0, ven0Var4, (lnm) null, (byte) 6);
                            rk41Var2 = rk41Var;
                            b0kVar3.s0(wba1Var);
                            objT15 = wba1Var;
                        } else {
                            rk41Var2 = rk41Var;
                        }
                        qxd0.s(bool, boolValueOf4, (vu30) objT15, b0kVar3);
                        hsi1 hsi1Var = new hsi1("timeMachineIntroTimer", Float.valueOf(0.0f), Float.valueOf(1.0f), irn1.o0(4000, 0, (dlv) null, 6), rno1.a);
                        boolean z11 = rk41Var2.a;
                        Object objT16 = b0kVar3.T();
                        if (objT16 == m4cVar3) {
                            objT16 = new aya1(ven0Var4, (byte) 6);
                            b0kVar3.s0(objT16);
                        }
                        b0kVar2 = b0kVar3;
                        zod.R(hsi1Var, z11, (Function0) objT16, b0kVar2, 392, 0);
                    }
                    h311VarV.d = rme1Var;
                    return;
                }
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    rme1Var = new rme1(this, i2cVar, rk41Var, function0, i, (byte) 1);
                    h311VarV.d = rme1Var;
                    return;
                }
                return;
            default:
                Float fValueOf = Float.valueOf(0.0f);
                m4c m4cVar4 = fkj0.X;
                j7s j7sVar = (j7s) obj3;
                List list = (List) j7sVar.f;
                Float fValueOf2 = Float.valueOf(1.0f);
                x340 x340Var6 = (x340) b0kVar;
                x340Var6.k0(520253074);
                if ((i & 6) == 0) {
                    i5 = i | (x340Var6.g(i2cVar) ? 4 : 2);
                } else {
                    i5 = i;
                }
                if ((i & 48) == 0) {
                    i5 |= (i & 64) == 0 ? x340Var6.g(rk41Var) : x340Var6.i(rk41Var) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i5 |= x340Var6.i(this) ? 2048 : 1024;
                }
                if (x340Var6.Y(i5 & 1, (i5 & 1043) != 1042)) {
                    if (list.isEmpty()) {
                        h311VarV2 = x340Var6.v();
                        if (h311VarV2 == null) {
                            return;
                        } else {
                            ccf1Var = new ccf1(this, i2cVar, rk41Var, function0, i, (byte) 0);
                        }
                    } else {
                        ve8Var = this;
                        boolean zI5 = x340Var6.i(ve8Var);
                        Object objT17 = x340Var6.T();
                        if (zI5 || objT17 == m4cVar4) {
                            objT17 = new vbc1(ve8Var, (lnm) null, (byte) 7);
                            x340Var6.s0(objT17);
                        }
                        qxd0.t(rih1Var, x340Var6, (vu30) objT17);
                        Object objT18 = x340Var6.T();
                        if (objT18 == m4cVar4) {
                            objT18 = v8r.q((Object) null);
                            x340Var6.s0(objT18);
                        }
                        ven0 ven0Var5 = (ven0) objT18;
                        ven0 ven0VarS = v8r.s(x340Var6.k(yhm1.a), x340Var6);
                        b2u.i(list, (ard1) obj2, x340Var6, 8);
                        Object objT19 = x340Var6.T();
                        if (objT19 == m4cVar4) {
                            objT19 = v8r.q((Object) null);
                            x340Var6.s0(objT19);
                        }
                        ven0 ven0Var6 = (ven0) objT19;
                        Object objT20 = x340Var6.T();
                        if (objT20 == m4cVar4) {
                            objT20 = v8r.q((Object) null);
                            x340Var6.s0(objT20);
                        }
                        ven0 ven0Var7 = (ven0) objT20;
                        Object objT21 = x340Var6.T();
                        if (objT21 == m4cVar4) {
                            objT21 = bb00.h(0, x340Var6);
                        }
                        err0 err0Var = (hdn0) objT21;
                        Integer num = (Integer) ven0Var5.getValue();
                        Object objT22 = x340Var6.T();
                        if (objT22 == m4cVar4) {
                            objT22 = new wba1(ven0Var5, ven0Var6, ven0Var7, err0Var, (lnm) null, (byte) 7);
                            x340Var6.s0(objT22);
                        }
                        qxd0.t(num, x340Var6, (vu30) objT22);
                        err0 err0Var2 = err0Var;
                        if (err0Var2.s() > 0) {
                            x340Var6.i0(-1676659199);
                            boolean zE = x340Var6.e(err0Var2.s());
                            Object objT23 = x340Var6.T();
                            if (zE || objT23 == m4cVar4) {
                                String strC = f4i1.c(err0Var2.s(), "rm-out-");
                                pxg1 pxg1VarO0 = irn1.o0(160, 0, (dlv) null, 6);
                                tzg1 tzg1Var = rno1.a;
                                objT23 = mqo1.s(new hsi1[]{new hsi1(strC, fValueOf2, fValueOf, pxg1VarO0, tzg1Var), new hsi1(f4i1.c(err0Var2.s(), "rm-in-"), fValueOf, fValueOf2, irn1.o0(160, 0, (dlv) null, 6), tzg1Var)});
                                x340Var6.s0(objT23);
                            }
                            c9 c9Var = (c9) objT23;
                            boolean z12 = rk41Var.a;
                            String strC2 = f4i1.c(err0Var2.s(), "rm-crossfade-");
                            Object objT24 = x340Var6.T();
                            if (objT24 == m4cVar4) {
                                objT24 = new zqe(ven0Var7, ven0Var6, (byte) 14);
                                x340Var6.s0(objT24);
                            }
                            x340Var2 = x340Var6;
                            float fFloatValue = ((Number) zod.P(c9Var, z12, strC2, (Function0) objT24, (Function0) null, x340Var6, 3080, 16).getValue()).floatValue();
                            x340Var2.r(false);
                            f = fFloatValue;
                        } else {
                            obj = obj;
                            x340Var2 = x340Var6;
                            x340Var2.i0(-1676084676);
                            x340Var2.r(false);
                            f = 1.0f;
                        }
                        Integer num2 = (Integer) ven0Var5.getValue();
                        Integer num3 = (Integer) ven0Var6.getValue();
                        obf1 obf1Var = (obf1) obj;
                        boolean zI6 = x340Var2.i(ve8Var) | x340Var2.g(ven0VarS);
                        Object objT25 = x340Var2.T();
                        if (zI6 || objT25 == m4cVar4) {
                            objT25 = new rsc1(ve8Var, ven0VarS, ven0Var5, (byte) 13);
                            x340Var2.s0(objT25);
                        }
                        iu30 iu30Var = (iu30) objT25;
                        Object objT26 = x340Var2.T();
                        if (objT26 == m4cVar4) {
                            objT26 = new aya1(ven0Var5, (byte) 11);
                            x340Var2.s0(objT26);
                        }
                        acf1.e(i2cVar, j7sVar, rk41Var, num2, num3, f, obf1Var, iu30Var, (Function0) objT26, x340Var2, (i5 & 14) | 100663360 | ((i5 << 3) & 896));
                    }
                    h311VarV2.d = ccf1Var;
                    return;
                }
                ve8Var = this;
                x340Var2 = x340Var6;
                x340Var2.b0();
                h311VarV2 = x340Var2.v();
                if (h311VarV2 != null) {
                    ccf1Var = new ccf1(ve8Var, i2cVar, rk41Var, function0, i, (byte) 1);
                    h311VarV2.d = ccf1Var;
                    return;
                }
                return;
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        byte b = this.a;
        pk41 pk41Var = pk41.a;
        switch (b) {
            case 0:
                return (qk41) this.e;
            case 1:
                return pk41Var;
            case 2:
                return (ok41) this.d;
            default:
                return pk41Var;
        }
    }

    public ve8(bbc bbcVar, zqe zqeVar) {
        this.a = (byte) 2;
        this.b = bbcVar;
        this.c = zqeVar;
        this.d = new ok41(4000);
        this.e = v8r.q(Boolean.FALSE);
    }

    public ve8(j7s j7sVar, ard1 ard1Var, nda1 nda1Var, obf1 obf1Var) {
        this.a = (byte) 3;
        this.b = j7sVar;
        this.c = ard1Var;
        this.d = nda1Var;
        this.e = obf1Var;
    }

    public ve8(x990 x990Var, x990 x990Var2, yj41 yj41Var, mim1 mim1Var) {
        this.a = (byte) 1;
        this.b = x990Var;
        this.c = x990Var2;
        this.d = yj41Var;
        this.e = mim1Var;
    }
}
