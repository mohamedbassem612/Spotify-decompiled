package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ka5 {
    public static final ceo a = new ceo(0.4f, 0.0f, 0.6f, 1.0f);

    public static final void a(p3g p3gVar, mt71 mt71Var, long j, l4g l4gVar, qim0 qim0Var, f08 f08Var, boolean z, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        int i3;
        l4g l4gVar2;
        int i4;
        h2c h2cVar;
        boolean z2;
        String str;
        u7h u7hVarC;
        String str2;
        u7h u7hVarC2;
        String str3;
        u7h u7hVarC3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1126503001);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar3.e(p3gVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(mt71Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(l4gVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? b0kVar3.g(f08Var) : b0kVar3.i(f08Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.h(z) ? 1048576 : 524288;
        }
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new q811();
                b0kVar3.s0(objT);
            }
            q811 q811Var = (q811) objT;
            p3g p3gVar2 = p3g.a;
            if (p3gVar == p3gVar2) {
                q811Var.a = mt71Var.a();
            }
            sju sjuVar = (sju) q811Var.a;
            long j2 = (f08Var == null || (str3 = f08Var.a) == null || (u7hVarC3 = wz7.c(str3)) == null) ? wz7.b : u7hVarC3.a;
            long j3 = (f08Var == null || (str2 = f08Var.b) == null || (u7hVarC2 = wz7.c(str2)) == null) ? wz7.c : u7hVarC2.a;
            long j4 = (f08Var == null || (str = f08Var.c) == null || (u7hVarC = wz7.c(str)) == null) ? wz7.a : u7hVarC.a;
            uwr uwrVar = cbx.a;
            avw0 avw0Var = cbx.b(b0kVar3).c;
            boolean z3 = p3gVar == p3gVar2 && (mt71Var instanceof kt71) && z && wkt0.d();
            qim0 qim0VarA = u291.a(qim0Var, 48.0f, 48.0f);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z4 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            gra graVar2 = een.h;
            h2c h2cVar2 = h2c.a;
            boolean z5 = z3;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarX = u291.x(0.0f, 320.0f, 1, h2cVar2.a(nim0Var, graVar2));
            int i5 = i2 & 7168;
            boolean zD = b0kVar3.d(1.0f) | (i5 == 2048) | b0kVar3.f(j2) | b0kVar3.f(j3);
            Object objT2 = b0kVar3.T();
            if (zD || objT2 == m4cVar) {
                i3 = i2;
                l4gVar2 = l4gVar;
                i4 = 2048;
                da5 da5Var = new da5(l4gVar2, j2, j3, (byte) 0);
                b0kVar3.s0(da5Var);
                objT2 = da5Var;
            } else {
                l4gVar2 = l4gVar;
                i3 = i2;
                i4 = 2048;
            }
            qim0 qim0VarR = exd0.r(qim0VarX, (iu30) objT2);
            boolean z6 = i5 == i4;
            Object objT3 = b0kVar3.T();
            if (z6 || objT3 == m4cVar) {
                objT3 = new ea5(l4gVar2, (byte) 0);
                b0kVar3.s0(objT3);
            }
            qim0 qim0VarC = i541.C(qim0VarR, (iu30) objT3);
            if (z && sjuVar != null) {
                qim0VarC = qim0VarC.then(i1p1.r(nim0Var).then(new m291(q2g.c, een.h)));
            }
            qim0 qim0VarB = u291.b(0.0f, 48.0f, 1, qim0VarC);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarB);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(gfh0VarC2, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            if (sjuVar != null) {
                b0kVar3.i0(1784297267);
                h2cVar = h2cVar2;
                b0kVar2 = b0kVar3;
                b(sjuVar, mt71Var, j4, z5, h2cVar.a(nim0Var, graVar2), b0kVar2, i3 & 112);
                z2 = false;
                b0kVar2.r(false);
            } else {
                b0kVar2 = b0kVar3;
                h2cVar = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0291: MOVE (r0v7 'h2cVar' p.h2c) = (r27v0 p.h2c) (LINE:658) in method: p.ka5.a(p.p3g, p.mt71, long, p.l4g, p.qim0, p.f08, boolean, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 p.h2c
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 784
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.ka5.a(p.p3g, p.mt71, long, p.l4g, p.qim0, p.f08, boolean, p.b0k, int):void");
            }

            public static final void b(sju sjuVar, mt71 mt71Var, long j, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
                int i2;
                es41 es41Var;
                zkt0 zkt0Var;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(127077384);
                j06 j06Var = x340Var.a;
                if ((i & 6) == 0) {
                    i2 = ((i & 8) == 0 ? x340Var.g(sjuVar) : x340Var.i(sjuVar) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var.i(mt71Var) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= x340Var.f(j) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i2 |= x340Var.h(z) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    i2 |= x340Var.g(qim0Var) ? 16384 : 8192;
                }
                if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
                    es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
                    wat watVar = (wat) x340Var.k(t4k.h);
                    Boolean boolValueOf = Boolean.valueOf(z);
                    boolean zG = x340Var.g(es41VarC) | ((i2 & 7168) == 2048) | x340Var.g(watVar);
                    Object objT = x340Var.T();
                    if (zG || objT == fkj0.X) {
                        objT = new hl1(es41VarC, z, watVar, (lnm) null, (byte) 1);
                        es41Var = es41VarC;
                        x340Var.s0(objT);
                    } else {
                        es41Var = es41VarC;
                    }
                    qxd0.s(sjuVar, boolValueOf, (vu30) objT, x340Var);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    qim0 qim0VarT = l6o1.t(exd0.r(uyn1.y(qim0Var, 12.0f, 8.0f), new ve3(es41Var, (byte) 10)), es41Var, 12);
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarT);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    boolean z2 = x340Var.S;
                    n4k n4kVar = hmb0.t1;
                    if (z2) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(jw31VarA, x340Var, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var, lljVar3);
                    nko1.F(x340Var);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var, lljVar4);
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    qim0 qim0VarR = u291.r(qim0VarB, 16.0f);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarR);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, lljVar);
                    nko1.H(xos0VarM2, x340Var, lljVar2);
                    x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar4);
                    if (mt71Var instanceof kt71) {
                        zkt0Var = zkt0.a;
                    } else if (mt71Var instanceof jt71) {
                        zkt0Var = zkt0.b;
                    } else {
                        if (!mt71Var.equals(lt71.a)) {
                            eg.o();
                            return;
                        }
                        zkt0Var = zkt0.c;
                    }
                    zkt0 zkt0Var2 = zkt0Var;
                    int i3 = i2 << 3;
                    int i4 = i3 & 7168;
                    wkt0.a(zkt0Var2, (qim0) null, (ksl) null, j, z, x340Var, i3 & 64512, 6);
                    x340Var.r(true);
                    uwo1.e(sjuVar.a, null, cbx.d(x340Var).k, j, null, null, 0, false, new cjc0(1), 0, null, x340Var, i4, 0, 1778);
                    uwo1.e("•", uyn1.z(4.0f, 0.0f, 2, nim0Var), cbx.d(x340Var).j, j, null, null, 0, false, new cjc0(1), 0, null, x340Var, i4 | 54, 0, 1776);
                    uwo1.e(sjuVar.b, null, cbx.d(x340Var).j, j, null, null, 0, false, new cjc0(1), 0, null, x340Var, i4, 0, 1778);
                    x340Var = x340Var;
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ia5(sjuVar, mt71Var, j, z, qim0Var, i);
                }
            }

            public static final void c(lsl lslVar, boolean z, float f, float f2) {
                if (f2 <= 0.0f) {
                    return;
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(z ? 0.0f : Float.intBitsToFloat((int) (lslVar.j() >> 32)) - f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)))) & 4294967295L);
                long j = u7h.f;
                DrawScope.S0(lslVar, v9c.h(p7h.M(new u7h[]{new u7h(u7h.b(j, 1.0f - f2, 0.0f, 0.0f, 0.0f, 14)), new u7h(j)}), z ? 0.0f : Float.intBitsToFloat((int) (lslVar.j() >> 32)), z ? f : Float.intBitsToFloat((int) (lslVar.j() >> 32)) - f, 8), jFloatToRawIntBits, jFloatToRawIntBits2, 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 56);
            }
        }
