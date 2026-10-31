package p;

import android.os.Bundle;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class a6o1 {
    public static final fjb a = new fjb((byte) 23);
    public static final sjb b = new sjb((byte) 23);
    public static final ekb c = new ekb((byte) 23);
    public static b180 d;

    public static final void a(String str, long j, Function0 function0, qim0 qim0Var, float f, boolean z, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        boolean z2;
        ven0 ven0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1026087414);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.d(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(j2iVar) ? 1048576 : 524288;
        }
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            woa woaVar = (woa) x340Var.k(ade0.a);
            kma kmaVar = (kma) x340Var.k(ade0.b);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            qqb qqbVarD = k1u.d(1.0f, j);
            qim0 qim0VarQ = i1p1.q(d1u.F(qim0Var, qqbVarD.a, qqbVarD.b, er31.b(16.0f)), er31.b(16.0f));
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarQ, cbx.a(x340Var).c.b, d4o1.a);
            nim0 nim0Var = nim0.a;
            if (f == 0.0f) {
                z2 = false;
            } else {
                float f2 = (f == 1.0f && z) ? 220.0f : 192.0f;
                z2 = false;
                qim0VarF = qim0VarF.then(d7e.r(f >= 0.0f ? f : 0.0f, u291.j(f2 / f, 0.0f, 2, u291.v(nim0Var, f2)), false));
            }
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, z2);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = fjd.Z;
                x340Var.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            boolean zI = x340Var.i(woaVar);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new rvd(ven0Var2, woaVar, (byte) 0);
                x340Var.s0(objT3);
            }
            iu30 iu30Var2 = (iu30) objT3;
            boolean zI2 = x340Var.i(woaVar);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new rvd(ven0Var2, woaVar, (byte) 1);
                x340Var.s0(objT4);
            }
            iu30 iu30Var3 = (iu30) objT4;
            boolean zI3 = x340Var.i(woaVar) | x340Var.i(kmaVar) | ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objT5 = x340Var.T();
            if (zI3 || objT5 == m4cVar) {
                objT5 = new uh0(woaVar, kmaVar, function0, str, ven0Var2);
                ven0Var = ven0Var2;
                x340Var.s0(objT5);
            } else {
                ven0Var = ven0Var2;
            }
            ven0 ven0Var3 = ven0Var;
            int i3 = i2;
            dm5.b(iu30Var, qim0VarD, iu30Var2, iu30Var3, (iu30) objT5, x340Var, 54, 0);
            qim0 qim0VarX = uyn1.x(nim0Var, 8.0f);
            gra graVar2 = een.h;
            h2c h2cVar = h2c.a;
            qim0 qim0VarA = h2cVar.a(qim0VarX, graVar2);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            ywx0.l(((i3 >> 15) & 112) | 6, j2iVar, h2cVar, x340Var, true);
            iac0 iac0Var = (iac0) x340Var.k(jfe0.a);
            boolean zI4 = x340Var.i(iac0Var);
            Object objT6 = x340Var.T();
            if (zI4 || objT6 == m4cVar) {
                objT6 = new svd(iac0Var, ven0Var3, (byte) 0);
                x340Var.s0(objT6);
            }
            qxd0.i(iac0Var, (iu30) objT6, x340Var);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qtd(str, j, function0, qim0Var, f, z, j2iVar, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x026c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0278  */
    /* JADX WARN: Code duplicated, block: B:69:0x0288  */
    /* JADX WARN: Code duplicated, block: B:72:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:73:0x02ba  */
    public static final void b(List list, boolean z, wet0 wet0Var, odh0 odh0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        g36 g36Var;
        b0k b0kVar2;
        boolean z2;
        vu30 vu30Var;
        Object obj;
        boolean z3;
        float fFloatValue;
        rih1 rih1Var;
        int i2;
        qim0 qim0VarB;
        Object objT;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1964908160);
        j06 j06Var = ((x340) b0kVar3).a;
        int i3 = i | (b0kVar3.i(list) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(wet0Var) ? 256 : 128) | (b0kVar3.i(odh0Var) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            Object[] objArr = new Object[0];
            Object objT2 = b0kVar3.T();
            Object obj2 = fkj0.X;
            if (objT2 == obj2) {
                objT2 = lmm.b;
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT2, b0kVar3, 48);
            tob1 tob1VarB = z95.b(z ? 1.0f : 0.0f, ((Boolean) ven0Var.getValue()).booleanValue() ? irn1.j0() : irn1.o0(1000, 0, null, 6), "buttons-alpha", (iu30) null, b0kVar3, 3072, 20);
            if (z && ((Number) tob1VarB.getValue()).floatValue() == 1.0f) {
                ven0Var.setValue(Boolean.TRUE);
            }
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            gra graVar = een.h;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = l6o1.H(uyn1.x(voo1.y(dug.f(u291.d(qim0Var3, 1.0f), cbx.a(b0kVar3).a.c, d4o1.a), voo1.c), 8.0f), l6o1.C(0, 0, 1, b0kVar3), false, 14);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarH);
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
            vu30 vu30Var2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, vu30Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar2);
            nko1.F(b0kVar3);
            llj lljVar3 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar3);
            era eraVar = een.Q0;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var3);
            g36 g36Var2 = h36.c;
            mbh mbhVarA = jbh.a(g36Var2, eraVar, b0kVar3, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarZ);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, vu30Var2);
            x0d.q(iHashCode2, b0kVar3, lljVar2, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar3);
            if (list.isEmpty()) {
                g36Var = g36Var2;
                b0kVar2 = b0kVar3;
                z2 = false;
                vu30Var = vu30Var2;
                b0kVar2.i0(-710118362);
                b0kVar2.r(false);
            } else {
                b0kVar3.i0(-710200047);
                g36Var = g36Var2;
                b0kVar2 = b0kVar3;
                z2 = false;
                vu30Var = vu30Var2;
                ern1.c(list, null, 10.0f, b0kVar2, i3 & 14, 2);
                b0kVar2.r(false);
            }
            vu30 vu30Var3 = vu30Var;
            b0k b0kVar4 = b0kVar2;
            uwo1.e(ydh.g(cvxVar.b, 2131954523, b0kVar2, b0kVar2, qim0Var3), null, cbx.d(b0kVar2).d, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar4, 0, 0, 2026);
            uwo1.e(ydh.g(16.0f, 2131954522, b0kVar4, b0kVar4, qim0Var3), null, cbx.d(b0kVar4).g, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar4, 0, 0, 2026);
            b0kVar3 = b0kVar4;
            op71.g(b0kVar3, u291.h(qim0Var3, cvxVar.d));
            boolean zI = b0kVar3.i(tob1VarB);
            Object objT3 = b0kVar3.T();
            if (zI) {
                obj = obj2;
            } else {
                obj = obj2;
                if (objT3 != obj) {
                    z3 = true;
                }
                qim0 qim0VarC = i541.C(qim0Var3, (iu30) objT3);
                fFloatValue = ((Number) tob1VarB.getValue()).floatValue();
                rih1Var = rih1.a;
                if (fFloatValue < 1.0f) {
                    b0kVar3.i0(-22882460);
                    objT = b0kVar3.T();
                    if (objT == obj) {
                        objT = mia.h;
                        b0kVar3.s0(objT);
                    }
                    qim0VarB = f8d1.b(qim0Var3, rih1Var, (PointerInputEventHandler) objT);
                    i2 = 0;
                    b0kVar3.r(false);
                } else {
                    i2 = 0;
                    b0kVar3.i0(-22875612);
                    b0kVar3.r(false);
                    qim0VarB = qim0Var3;
                }
                qim0 qim0VarThen = qim0VarC.then(qim0VarB);
                mbh mbhVarA2 = jbh.a(g36Var, eraVar, b0kVar3, i2);
                int iHashCode3 = Long.hashCode(((x340) b0kVar3).T);
                xos0 xos0VarM3 = b0kVar3.m();
                qim0 qim0VarE3 = zr7.E(b0kVar3, qim0VarThen);
                b0kVar3.m0();
                if (((x340) b0kVar3).S) {
                    b0kVar3.l(n4kVar);
                } else {
                    b0kVar3.v0();
                }
                nko1.H(mbhVarA2, b0kVar3, lljVar);
                nko1.H(xos0VarM3, b0kVar3, vu30Var3);
                x0d.q(iHashCode3, b0kVar3, lljVar2, b0kVar3);
                nko1.H(qim0VarE3, b0kVar3, lljVar3);
                otw.c(wet0Var, rih1Var, (qim0) null, (ipb1) null, b0kVar3, 56 | ((
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02db: INVOKE 
                      (r39v0 'wet0Var' p.wet0)
                      (r8v8 'rih1Var' p.rih1)
                      (wrap p.qim0:?: CAST (p.qim0) (null p.qim0))
                      (wrap p.ipb1:?: CAST (p.ipb1) (null p.ipb1))
                      (r11v6 'b0kVar3' p.b0k)
                      (wrap int:0x02d3: ARITH (56 int) | (wrap int:0x02cf: ARITH (wrap int:0x02cd: ARITH (r19v0 int) >> (6 int) A[WRAPPED] (LINE:718)) & (14 int) A[WRAPPED] (LINE:720)) A[WRAPPED] (LINE:724))
                      (12 int)
                     STATIC call: p.otw.c(p.maa, java.lang.Object, p.qim0, p.ipb1, p.b0k, int, int):void (LINE:732) in method: p.a6o1.b(java.util.List, boolean, p.wet0, p.odh0, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 int
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 804
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.a6o1.b(java.util.List, boolean, p.wet0, p.odh0, p.qim0, p.b0k, int):void");
            }

            public static final void c(upb0 upb0Var, String str, iu30 iu30Var, b0k b0kVar, int i) {
                int i2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(760396990);
                if ((i & 6) == 0) {
                    i2 = (x340Var.i(upb0Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var.g(str) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= x340Var.i(iu30Var) ? 256 : 128;
                }
                if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                    boolean zI = ((i2 & 112) == 32) | x340Var.i(upb0Var) | ((i2 & 896) == 256);
                    Object objT = x340Var.T();
                    if (zI || objT == fkj0.X) {
                        objT = new qpk(str, upb0Var, iu30Var, (lnm) null);
                        x340Var.s0(objT);
                    }
                    qxd0.s(upb0Var, str, (vu30) objT, x340Var);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new x8t(upb0Var, str, iu30Var, i, (byte) 27);
                }
            }

            public static final void d(s370 s370Var, boolean z, qim0 qim0Var, float f, b0k b0kVar, int i) {
                int i2;
                qim0 qim0Var2;
                x340 x340Var;
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.k0(1631674806);
                if ((i & 6) == 0) {
                    i2 = (x340Var2.g(s370Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var2.h(z) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    qim0Var2 = qim0Var;
                    i2 |= x340Var2.g(qim0Var2) ? 256 : 128;
                } else {
                    qim0Var2 = qim0Var;
                }
                if ((i & 3072) == 0) {
                    i2 |= x340Var2.d(f) ? 2048 : 1024;
                }
                if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    qim0 qim0VarB = uyn1.B(u291.z(u291.f(d9y0.k(qim0Var, f), 1.0f), (fra) null, 3), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    era eraVar = een.P0;
                    mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var2, 0);
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
                    nko1.H(mbhVarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    String str = s370Var.a;
                    uwr uwrVar = cbx.a;
                    lee1 lee1VarQ = vgo1.q(cbx.d(x340Var2).c, z, x340Var2);
                    long j = cbx.a(x340Var2).b.a;
                    tq60 tq60Var = new tq60(eraVar);
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = aw50.X0;
                        x340Var2.s0(objT);
                    }
                    uwo1.e(str, s161.b(tq60Var, false, (iu30) objT), lee1VarQ, j, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
                    x340Var = x340Var2;
                    x340Var.i0(1802520118);
                    x340Var.r(false);
                    x340Var.r(true);
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new mh6(s370Var, z, qim0Var2, f, i);
                }
            }

            public static final void e(Function0 function0, b0k b0kVar, int i) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-425427744);
                int i2 = (x340Var.i(function0) ? 4 : 2) | i;
                if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                    ldx ldxVar = ldx.c;
                    String strO0 = cwl1.o0(x340Var, 2131957267);
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    wro1.h(new gbx(new y50(strO0), function0), ldxVar, anm1.N("match_review_close", nim0.a), null, null, null, false, null, null, tzi.c, x340Var, 432, 6, 1016);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new tse0(function0, i, (byte) 6);
                }
            }

            public static final void f(int i, String str, Function0 function0, b0k b0kVar, hux huxVar, boolean z) {
                int i2;
                long jB;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-794757405);
                if ((i & 6) == 0) {
                    i2 = (x340Var.h(z) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var.g(str) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= (i & 512) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i2 |= x340Var.i(function0) ? 2048 : 1024;
                }
                if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    if (z) {
                        x340Var.i0(742317863);
                        uwr uwrVar = cbx.a;
                        jB = cbx.a(x340Var).b.a;
                    } else {
                        x340Var.i0(742319030);
                        uwr uwrVar2 = cbx.a;
                        jB = u7h.b(cbx.a(x340Var).b.a, 0.38f, 0.0f, 0.0f, 0.0f, 14);
                    }
                    x340Var.r(false);
                    gt4.b(apo.r(291593491, new icc((byte) 6, jB, str), x340Var), function0, (qim0) null, apo.r(-887403344, new nk7((Object) huxVar, jB, (byte) 5), x340Var), z, (wsi0) null, (vzq0) null, x340Var, ((i2 >> 6) & 112) | 3078 | ((i2 << 15) & 458752), 468);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new cbh0(z, str, huxVar, function0, i);
                }
            }

            public static final void g(boolean z, boolean z2, boolean z3, boolean z4, Function0 function0, iu30 iu30Var, Function0 function1, Function0 function2, Function0 function3, b0k b0kVar, int i) {
                b0k b0kVar2 = (x340) b0kVar;
                b0kVar2.k0(-491224461);
                int i2 = i | (b0kVar2.h(z) ? 4 : 2) | (b0kVar2.h(z2) ? 32 : 16) | (b0kVar2.h(z3) ? 256 : 128) | (b0kVar2.h(z4) ? 2048 : 1024) | (b0kVar2.i(function0) ? 16384 : 8192) | (b0kVar2.i(function1) ? 1048576 : 524288) | (b0kVar2.i(function2) ? 8388608 : 4194304) | (b0kVar2.i(function3) ? 67108864 : 33554432);
                if (b0kVar2.Y(i2 & 1, (38347923 & i2) != 38347922)) {
                    uwr uwrVar = cbx.a;
                    x7f1 x7f1VarC = kkn.C(cbx.a(b0kVar2).a.c, cbx.a(b0kVar2).a.c, 0L, 0L, 0L, b0kVar2, 60);
                    b0kVar2 = b0kVar2;
                    mta mtaVar = cbx.b(b0kVar2).d;
                    ti5.a(tzi.a, anm1.N("match_review_top_bar", nim0.a), apo.r(-1542961958, new tse0(function0, (byte) 7), b0kVar2), apo.r(1863366275, new dbh0(iu30Var, z, z2, function1, z3, function2, z4, function3), b0kVar2), 56.0f, (erl1) null, x7f1VarC, b0kVar2, 3510, 160);
                } else {
                    b0kVar2.b0();
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ebh0(z, z2, z3, z4, function0, iu30Var, function1, function2, function3, i);
                }
            }

            public static final void h(xfx xfxVar, yvm0 yvm0Var, qim0 qim0Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
                int i2;
                qim0 qim0Var2;
                m4c m4cVar = fkj0.X;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-144270964);
                if ((i & 6) == 0) {
                    i2 = (x340Var.i(xfxVar) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var.i(yvm0Var) ? 32 : 16;
                }
                int i3 = i2 | 384;
                if ((i & 3072) == 0) {
                    i3 |= x340Var.h(z) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    i3 |= x340Var.i(iu30Var) ? 16384 : 8192;
                }
                if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
                    qim0 qim0Var3 = nim0.a;
                    qim0 qim0VarN = anm1.N("pam-multi-user-recurring-manager", qim0Var3);
                    boolean zI = x340Var.i(xfxVar) | ((i3 & 7168) == 2048) | ((i3 & 57344) == 16384);
                    Object objT = x340Var.T();
                    if (zI || objT == m4cVar) {
                        objT = new bnr0(xfxVar, z, iu30Var, (byte) 2);
                        x340Var.s0(objT);
                    }
                    iu30 iu30Var2 = (iu30) objT;
                    boolean zI2 = x340Var.i(yvm0Var);
                    Object objT2 = x340Var.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new wvq0(yvm0Var, (byte) 16);
                        x340Var.s0(objT2);
                    }
                    dm5.a(iu30Var2, qim0VarN, (iu30) objT2, x340Var, 0, 0);
                    qim0Var2 = qim0Var3;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new cnr0(xfxVar, yvm0Var, qim0Var2, z, iu30Var, i, (byte) 0);
                }
            }

            public static final void i(int i, String str, String str2, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
                x340 x340Var;
                iu30 iu30Var2;
                boolean z;
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.k0(900662575);
                j06 j06Var = x340Var2.a;
                int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.i(qim0Var) ? 32 : 16) | (x340Var2.g(str2) ? 256 : 128) | 27648;
                if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
                    Object objT = x340Var2.T();
                    if (objT == m4cVar) {
                        objT = ej41.d1;
                        x340Var2.s0(objT);
                    }
                    iu30 iu30Var3 = (iu30) objT;
                    qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                    jw31 jw31VarA = ew31.a(h36.g, een.Z, x340Var2, 0);
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
                    llj lljVar = y580.O0;
                    nko1.H(jw31VarA, x340Var2, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var2, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var2, lljVar3);
                    nko1.F(x340Var2);
                    llj lljVar4 = y580.Y;
                    wnb0 wnb0VarQ = kk0.q(x340Var2, qim0VarE, lljVar4, 1.0f, true);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, wnb0VarQ);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    uwr uwrVar = cbx.a;
                    x340Var = x340Var2;
                    uwo1.e(str, null, cbx.d(x340Var2).e, cbx.a(x340Var2).b.a, null, null, 0, false, new cjc0(1), 0, null, x340Var, i2 & 14, 0, 1778);
                    if (str2 == null || str2.length() == 0) {
                        z = false;
                        x340Var.i0(656131181);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(655938020);
                        uwo1.e(str2, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, new cjc0(1), 0, null, x340Var, (i2 >> 6) & 14, 0, 1778);
                        x340Var = x340Var;
                        z = false;
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                    x340Var.i0(-276699465);
                    x340Var.r(z);
                    x340Var.r(true);
                    iu30Var2 = iu30Var3;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    iu30Var2 = iu30Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new pby0(str, qim0Var, str2, iu30Var2, i, (byte) 27);
                }
            }

            public static final fe41 j(wcn0 wcn0Var) {
                fe41 fe41Var;
                LinkedHashMap linkedHashMap = ((esn) wcn0Var).a;
                qe41 qe41Var = (qe41) linkedHashMap.get(a);
                Bundle bundle = null;
                if (qe41Var == null) {
                    hhg1.n("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
                    return null;
                }
                sck1 sck1Var = (sck1) linkedHashMap.get(b);
                if (sck1Var == null) {
                    hhg1.n("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
                    return null;
                }
                Bundle bundle2 = (Bundle) linkedHashMap.get(c);
                String str = (String) linkedHashMap.get(hck1.b);
                if (str == null) {
                    hhg1.n("CreationExtras must have a value by `VIEW_MODEL_KEY`");
                    return null;
                }
                je41 je41VarB = qe41Var.p().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
                je41 je41Var = je41VarB instanceof je41 ? je41VarB : null;
                if (je41Var == null) {
                    eg.m("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                    return null;
                }
                LinkedHashMap linkedHashMap2 = n(sck1Var).b;
                fe41 fe41Var2 = (fe41) linkedHashMap2.get(str);
                if (fe41Var2 != null) {
                    return fe41Var2;
                }
                je41Var.b();
                Bundle bundle3 = je41Var.c;
                if (bundle3 != null && bundle3.containsKey(str)) {
                    Bundle bundle4 = bundle3.getBundle(str);
                    if (bundle4 == null) {
                        bundle4 = mno1.h((mmr0[]) Arrays.copyOf(new mmr0[0], 0));
                    }
                    bundle3.remove(str);
                    if (bundle3.isEmpty()) {
                        je41Var.c = null;
                    }
                    bundle = bundle4;
                }
                if (bundle != null) {
                    bundle2 = bundle;
                }
                if (bundle2 == null) {
                    fe41Var = new fe41();
                } else {
                    ClassLoader classLoader = fe41.class.getClassLoader();
                    classLoader.getClass();
                    bundle2.setClassLoader(classLoader);
                    xkg0 xkg0Var = new xkg0(bundle2.size());
                    for (String str2 : bundle2.keySet()) {
                        str2.getClass();
                        xkg0Var.put(str2, bundle2.get(str2));
                    }
                    fe41Var = new fe41(xkg0Var.b());
                }
                linkedHashMap2.put(str, fe41Var);
                return fe41Var;
            }

            public static final void k(qe41 qe41Var) {
                w8c0 w8c0VarB = qe41Var.getLifecycle().b();
                if (w8c0VarB != w8c0.b && w8c0VarB != w8c0.c) {
                    bhn0.m("Failed to enable `SavedStateHandle` for `", qe41Var, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", w8c0VarB, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
                } else if (qe41Var.p().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
                    je41 je41Var = new je41(qe41Var.p(), (sck1) qe41Var);
                    qe41Var.p().c("androidx.lifecycle.internal.SavedStateHandlesProvider", je41Var);
                    qe41Var.getLifecycle().a(new ek2(je41Var, (byte) 17));
                }
            }

            public static final Integer l(int i, boolean z) {
                switch (l1d.C(i)) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        return 2131954232;
                    case 1:
                        return 2131954254;
                    case 2:
                        return 2131954250;
                    case 3:
                    case 4:
                    case 8:
                    case 14:
                    case 15:
                    case 16:
                    default:
                        return null;
                    case 5:
                        return 2131954243;
                    case 6:
                        return 2131954244;
                    case 7:
                        return 2131954247;
                    case 9:
                        return Integer.valueOf(z ? 2131954242 : 2131954250);
                    case 10:
                        return 2131954223;
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                        return 2131954248;
                    case grn1.d /* 12 */:
                        return 2131954224;
                    case 13:
                        return 2131954225;
                    case 17:
                        return 2131954234;
                    case 18:
                        return 2131954235;
                    case 19:
                        return 2131954237;
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                        return 2131954253;
                    case 21:
                        return 2131954252;
                }
            }

            public static kuw0 m() {
                return ndo0.C1;
            }

            public static final ke41 n(sck1 sck1Var) {
                return new hce1(sck1Var.o(), new ie41(), n9p1.s(sck1Var)).t("androidx.lifecycle.internal.SavedStateHandlesVM", rc11.a.b(ke41.class));
            }

            public static q3c o() {
                return ndo0.D1;
            }

            public static final boolean p(va6 va6Var) {
                return va6Var != null && va6Var.a;
            }

            public static final boolean q(upb0 upb0Var) {
                mpb0 mpb0Var = (mpb0) o7h.C0(upb0Var.h().n);
                return mpb0Var != null && mpb0Var.a >= upb0Var.h().q + (-6);
            }

            public static final String r(String str, ArrayList arrayList) {
                while (true) {
                    Object obj = null;
                    if (str.length() <= 0) {
                        return null;
                    }
                    for (Object obj2 : arrayList) {
                        if (nhc1.S((String) obj2, str, true)) {
                            obj = obj2;
                            break;
                        }
                    }
                    String str2 = (String) obj;
                    if (str2 != null) {
                        return str2;
                    }
                    int iA0 = ihc1.A0(str, '-', 0, 6);
                    str = iA0 > 0 ? str.substring(0, iA0) : "";
                }
            }

            public static final smc0 s(List list, List list2) {
                List list3 = list2;
                int iS = zno1.s(q7h.U(list3, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj : list3) {
                    linkedHashMap.put(((mwb1) obj).a, obj);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                List<mwb1> list4 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list4, 10));
                for (mwb1 mwb1Var : list4) {
                    String str = mwb1Var.a;
                    String str2 = mwb1Var.a;
                    linkedHashSet.add(str);
                    mwb1 mwb1Var2 = (mwb1) linkedHashMap.get(str2);
                    if (mwb1Var2 != null) {
                        ArrayList arrayListN0 = o7h.N0(mwb1Var2.c, mwb1Var.c);
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayListN0) {
                            if (hashSet.add(((rvb1) obj2).a)) {
                                arrayList2.add(obj2);
                            }
                        }
                        mwb1Var = new mwb1(str2, arrayList2, mwb1Var.b);
                    }
                    arrayList.add(mwb1Var);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list3) {
                    if (!linkedHashSet.contains(((mwb1) obj3).a)) {
                        arrayList3.add(obj3);
                    }
                }
                smc0 smc0VarN = k4p1.n();
                smc0VarN.addAll(arrayList);
                smc0VarN.addAll(arrayList3);
                return k4p1.k(smc0VarN);
            }

            public static final void t(lsw lswVar, Function0 function0, Function0 function1) {
                lswVar.a.a(rc11.a.b(vsw.class), new ssw(function0, function1));
            }

            public static final int u(f0u f0uVar) {
                int iOrdinal = f0uVar.ordinal();
                if (iOrdinal == 1) {
                    return 2131954221;
                }
                if (iOrdinal != 2) {
                    return iOrdinal != 14 ? 2131954266 : 2131954220;
                }
                return 2131954268;
            }

            public abstract long v();
        }
