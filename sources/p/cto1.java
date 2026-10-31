package p;

import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class cto1 {
    public static b180 a;

    public static final void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        Object gh1Var;
        String str;
        String str2;
        String str3;
        int i6;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(844629498);
        j06 j06Var = x340Var.a;
        int i7 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i7 & 1, (i7 & 147) != 146)) {
            if (z) {
                i2 = -1855849377;
                i3 = 2131963885;
            } else {
                i2 = -1855770978;
                i3 = 2131963884;
            }
            String strK = x0d.k(x340Var, i2, i3, x340Var, false);
            if (z) {
                i4 = -1855650667;
                i5 = 2131963887;
            } else {
                i4 = -1855562410;
                i5 = 2131963888;
            }
            String strK2 = x0d.k(x340Var, i4, i5, x340Var, false);
            String strO0 = cwl1.o0(x340Var, 2131963886);
            String strO1 = cwl1.o0(x340Var, 2131963883);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            zov0 zov0Var2 = cbx.b(x340Var).g;
            int iH = (int) jfv.h(cbx.c(x340Var).b.b);
            pxg1 pxg1VarO0 = irn1.o0(iH, 0, null, 6);
            pxg1 pxg1VarO1 = irn1.o0(iH, 0, null, 6);
            long j2 = cbx.a(x340Var).c.c;
            long jA = cbx.a(x340Var).a.b.a();
            if (z) {
                jA = j2;
            }
            long j3 = ((u7h) w191.a(jA, pxg1VarO0, "circle_bg", x340Var, 384, 8).getValue()).a;
            if (z) {
                x340Var.i0(-59822530);
                j = cbx.a(x340Var).a.c;
            } else {
                x340Var.i0(-59821538);
                j = cbx.a(x340Var).b.a;
            }
            x340Var.r(false);
            long j4 = ((u7h) w191.a(j, pxg1VarO0, "icon_tint", x340Var, 384, 8).getValue()).a;
            float fFloatValue = ((Number) z95.b(z ? 0.6f : 0.0f, pxg1VarO1, "glow_alpha", (iu30) null, x340Var, 3072, 20).getValue()).floatValue();
            float f = cbx.b(x340Var).b.a;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            boolean zG = ((i7 & 14) == 4) | x340Var.g(strK) | x340Var.g(strK2) | x340Var.g(strO1);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                str = strK;
                str2 = strK2;
                str3 = strO1;
                i6 = 0;
                gh1Var = new gh1((byte) 3, str, str2, str3, z);
                x340Var.s0(gh1Var);
            } else {
                str = strK;
                str2 = strK2;
                gh1Var = objT;
                str3 = strO1;
                i6 = 0;
            }
            qim0 qim0VarX = bin.x(s161.b(qim0VarF, true, (iu30) gh1Var), false, null, null, null, function0, 15);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, i6);
            String str4 = str;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            op71.g(x340Var, u291.h(qim0Var3, cbx.b(x340Var).b.b));
            qim0 qim0VarR = u291.r(qim0Var3, 88.0f);
            boolean zD = x340Var.d(fFloatValue) | x340Var.d(f) | x340Var.f((long) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01fe: ARITH (r17v4 'zD' boolean) = (wrap boolean:0x01f8: ARITH (wrap boolean:0x01f0: INVOKE (r11v1 'x340Var' p.x340), (r7v9 'fFloatValue' float) VIRTUAL call: p.x340.d(float):boolean A[WRAPPED] (LINE:497)) | (wrap boolean:0x01f4: INVOKE (r11v1 'x340Var' p.x340), (r8v4 'f' float) VIRTUAL call: p.x340.d(float):boolean A[WRAPPED] (LINE:501)) A[DONT_WRAP, WRAPPED] (LINE:505)) | (wrap boolean:0x01fa: INVOKE (r11v1 'x340Var' p.x340), (wrap long:?: CAST (long) (r27v0 ?? I:??[long, double])) VIRTUAL call: p.x340.f(long):boolean A[WRAPPED] (LINE:507)) A[DECLARE_VAR] (LINE:511) in method: p.cto1.a(int, kotlin.jvm.functions.Function0, p.b0k, p.qim0, boolean):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 935
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.cto1.a(int, kotlin.jvm.functions.Function0, p.b0k, p.qim0, boolean):void");
        }

        public static final void b(b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(458694792);
            if (x340Var.Y(i & 1, i != 0)) {
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                String strO0 = cwl1.o0(x340Var, 2131959589);
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).d;
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = oa01.a1;
                    x340Var.s0(objT);
                }
                uwo1.e(strO0, s161.b(nim0Var, false, (iu30) objT), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
                cvx cvxVar = cbx.b(x340Var).b;
                uwo1.e(ydh.g(16.0f, 2131959587, x340Var, x340Var, nim0Var), null, cbx.d(x340Var).g, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
                cvx cvxVar2 = cbx.b(x340Var).b;
                uwo1.e(ydh.g(16.0f, 2131959588, x340Var, x340Var, nim0Var), null, cbx.d(x340Var).g, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xgr0(i, (byte) 28);
            }
        }

        public static final void c(Consumer consumer, mk81 mk81Var, b0k b0kVar, int i) {
            boolean z;
            mk81 mk81Var2 = mk81Var;
            m4c m4cVar = fkj0.X;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(591456075);
            int i2 = i | (x340Var.i(consumer) ? 4 : 2) | (x340Var.g(mk81Var2) ? 32 : 16);
            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                era eraVar = een.Q0;
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.c, 7);
                mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
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
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                int i3 = i2 & 112;
                boolean zI = (i3 == 32) | x340Var.i(consumer);
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new ye01(mk81Var2, consumer, (byte) 0);
                    x340Var.s0(objT);
                }
                z50 z50Var = z50.c;
                foo1.c(new gbx(z50Var, (Function0) objT), new idx(4), anm1.N("parental_consent_screen_positive_button", nim0Var), null, null, null, null, null, null, null, xbj.a, x340Var, 0, 48, 2040);
                cvx cvxVar = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 16.0f));
                boolean zI2 = x340Var.i(consumer) | (i3 == 32);
                Object objT2 = x340Var.T();
                if (zI2 || objT2 == m4cVar) {
                    mk81Var2 = mk81Var;
                    z = true;
                    objT2 = new ye01(mk81Var2, consumer, (byte) 1);
                    x340Var.s0(objT2);
                } else {
                    mk81Var2 = mk81Var;
                    z = true;
                }
                foo1.c(new gbx(z50Var, (Function0) objT2), ldx.c, null, null, null, null, null, null, null, null, xbj.b, x340Var, 0, 48, 2044);
                x340Var.r(z);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new kpw0(consumer, mk81Var2, i, (byte) 21);
            }
        }

        public static final void d(qim0 qim0Var, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, j2i j2iVar5, b0k b0kVar, int i) {
            int i2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-113619602);
            if ((i & 6) == 0) {
                i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(j2iVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var.i(j2iVar2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= x340Var.i(j2iVar3) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i2 |= x340Var.i(j2iVar4) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i2 |= x340Var.i(j2iVar5) ? 131072 : 65536;
            }
            if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
                uwr uwrVar = cbx.a;
                mta mtaVar = cbx.b(x340Var).d;
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarZ = uyn1.z(12.0f, 0.0f, 2, qim0VarF);
                jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                e(48.0f, j2iVar, x340Var, i2 & 112);
                e(48.0f, j2iVar3, x340Var, (i2 >> 6) & 112);
                zov0 zov0Var = cbx.b(x340Var).g;
                e(64.0f, j2iVar4, x340Var, (i2 >> 9) & 112);
                e(48.0f, j2iVar5, x340Var, (i2 >> 12) & 112);
                e(48.0f, j2iVar2, x340Var, (i2 >> 3) & 112);
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new wc0(qim0Var, j2iVar, j2iVar2, j2iVar3, j2iVar4, j2iVar5, i);
            }
        }

        public static final void e(float f, j2i j2iVar, b0k b0kVar, int i) {
            int i2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(391960319);
            if ((i & 6) == 0) {
                i2 = (x340Var.d(f) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(j2iVar) ? 32 : 16;
            }
            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                qim0 qim0VarR = u291.r(nim0.a, f);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
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
                dv20.l((i2 >> 3) & 14, j2iVar, x340Var, true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vgf(f, j2iVar, i);
            }
        }

        public static final void f(hux huxVar, String str, Function0 function0, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1260209372);
            byte b = 2;
            int i2 = ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i | (x340Var.g(str) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                wro1.h(new gbx(z50.c, function0), ldx.c, null, null, yla.r(x340Var), null, false, null, null, apo.r(2075153075, new cp9(huxVar, str, b), x340Var), x340Var, 0, 6, 988);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new r27(huxVar, str, function0, i);
            }
        }

        public static final void g(int i, j2i j2iVar, b0k b0kVar, int i2) {
            boolean z;
            llj lljVar = y580.Y;
            llj lljVar2 = y580.R0;
            llj lljVar3 = y580.N0;
            llj lljVar4 = y580.O0;
            era eraVar = een.P0;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1043959990);
            j06 j06Var = x340Var.a;
            int i3 = (x340Var.e(l1d.C(i)) ? 4 : 2) | i2;
            if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
                int iC = l1d.C(i);
                if (iC != 0) {
                    nim0 nim0Var = nim0.a;
                    n4k n4kVar = hmb0.t1;
                    f36 f36Var = h36.c;
                    if (iC == 1) {
                        x340Var.i0(1776802649);
                        mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
                        int iHashCode = Long.hashCode(x340Var.T);
                        xos0 xos0VarM = x340Var.m();
                        qim0 qim0VarE = zr7.E(x340Var, nim0Var);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(mbhVarA, x340Var, lljVar4);
                        nko1.H(xos0VarM, x340Var, lljVar3);
                        x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                        nko1.H(qim0VarE, x340Var, lljVar);
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var).b;
                        op71.g(x340Var, u291.h(nim0Var, 8.0f));
                        z = false;
                    } else {
                        if (iC != 2) {
                            throw p3d1.k(x340Var, 1776799934, false);
                        }
                        x340Var.i0(1776807649);
                        mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
                        int iHashCode2 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM2 = x340Var.m();
                        qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(mbhVarA2, x340Var, lljVar4);
                        nko1.H(xos0VarM2, x340Var, lljVar3);
                        x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                        nko1.H(qim0VarE2, x340Var, lljVar);
                        z = false;
                        rqo1.g(0, 1, x340Var, null);
                    }
                    ktd.s(j2iVar, x340Var, 6, true, z);
                } else {
                    x340Var.i0(1776801136);
                    j2iVar.invoke(x340Var, 6);
                    x340Var.r(false);
                }
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new bf6(i, j2iVar, i2, (byte) 5);
            }
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0062  */
        /* JADX WARN: Code duplicated, block: B:32:0x0064  */
        /* JADX WARN: Code duplicated, block: B:35:0x006d  */
        /* JADX WARN: Code duplicated, block: B:37:0x0071  */
        /* JADX WARN: Code duplicated, block: B:38:0x0073  */
        /* JADX WARN: Code duplicated, block: B:40:0x0076  */
        /* JADX WARN: Code duplicated, block: B:41:0x0079  */
        /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:50:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:53:0x012a  */
        /* JADX WARN: Code duplicated, block: B:54:0x012e  */
        /* JADX WARN: Code duplicated, block: B:57:0x01a2  */
        /* JADX WARN: Code duplicated, block: B:58:0x01dc  */
        /* JADX WARN: Code duplicated, block: B:60:0x01ed  */
        /* JADX WARN: Code duplicated, block: B:62:0x01f1  */
        /* JADX WARN: Code duplicated, block: B:65:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
        public static final void h(String str, String str2, qim0 qim0Var, boolean z, b0k b0kVar, int i, int i2) {
            qim0 qim0Var2;
            int i3;
            boolean z2;
            boolean z3;
            qim0 qim0Var3;
            boolean z4;
            h311 h311VarV;
            qim0 qim0Var4;
            qim0 qim0Var5;
            boolean z5;
            Object objT;
            jw31 jw31VarA;
            int iHashCode;
            xos0 xos0VarM;
            qim0 qim0VarE;
            boolean z6;
            n4k n4kVar;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(2038729211);
            j06 j06Var = x340Var.a;
            int i4 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16);
            int i5 = i2 & 4;
            if (i5 != 0) {
                i3 = i4 | 384;
                qim0Var2 = qim0Var;
            } else {
                qim0Var2 = qim0Var;
                i3 = i4 | (x340Var.g(qim0Var2) ? 256 : 128);
            }
            int i6 = i2 & 8;
            if (i6 == 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= x340Var.h(z2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i3 & 1, z3)) {
                    qim0Var4 = nim0.a;
                    if (i5 != 0) {
                        qim0Var5 = qim0Var4;
                    } else {
                        qim0Var5 = qim0Var2;
                    }
                    if (i6 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    d36 d36Var = new d36(16.0f, true, new um5(false));
                    qim0 qim0VarZ = u291.z(u291.f(qim0Var5, 1.0f), (fra) null, 3);
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    qim0 qim0VarY = uyn1.y(qim0VarZ, 16.0f, 12.0f);
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = fii0.N0;
                        x340Var.s0(objT);
                    }
                    qim0 qim0VarB = s161.b(qim0VarY, true, (iu30) objT);
                    jw31VarA = ew31.a(d36Var, een.Z, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarB);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    z6 = x340Var.S;
                    n4kVar = hmb0.t1;
                    if (z6) {
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
                    wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE, lljVar4, 1.0f, true);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    int i7 = i3;
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, wnb0VarQ);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA, x340Var, lljVar);
                    nko1.H(xos0VarM2, x340Var, lljVar2);
                    x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar4);
                    uwo1.e(str, anm1.N("member-details-text-row-title", qim0Var4), cbx.d(x340Var).g, cbx.a(x340Var).b.a, new a0e1(5), null, 0, false, null, 0, null, x340Var, (i7 & 14) | 48, 0, 2016);
                    uwo1.e(str2, anm1.N("member-details-text-row-subtitle", qim0Var4), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(5), null, 0, false, null, 0, null, x340Var, ((i7 >> 3) & 14) | 48, 0, 2016);
                    x340Var = x340Var;
                    x340Var.r(true);
                    if (z5) {
                        x340Var.i0(60938711);
                        plx plxVar = plx.c;
                        long j = cbx.a(x340Var).b.b;
                        zov0 zov0Var = cbx.b(x340Var).g;
                        w0h1.a(plxVar, isl.a, u291.r(qim0Var4, 16.0f).then(new i5j1(een.N0)), j, 0L, false, x340Var, plx.d | 48, 48);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(61240651);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                    qim0Var3 = qim0Var5;
                    z4 = z5;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    z4 = z2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new sl(str, str2, qim0Var3, z4, i, i2, (byte) 1);
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                qim0Var4 = nim0.a;
                if (i5 != 0) {
                    qim0Var5 = qim0Var4;
                } else {
                    qim0Var5 = qim0Var2;
                }
                if (i6 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                uwr uwrVar2 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var).b;
                d36 d36Var2 = new d36(16.0f, true, new um5(false));
                qim0 qim0VarZ2 = u291.z(u291.f(qim0Var5, 1.0f), (fra) null, 3);
                cvx cvxVar5 = cbx.b(x340Var).b;
                cvx cvxVar6 = cbx.b(x340Var).b;
                qim0 qim0VarY2 = uyn1.y(qim0VarZ2, 16.0f, 12.0f);
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = fii0.N0;
                    x340Var.s0(objT);
                }
                qim0 qim0VarB2 = s161.b(qim0VarY2, true, (iu30) objT);
                jw31VarA = ew31.a(d36Var2, een.Z, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarB2);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z6 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z6) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(jw31VarA, x340Var, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var, lljVar7);
                nko1.F(x340Var);
                llj lljVar8 = y580.Y;
                wnb0 wnb0VarQ2 = kk0.q(x340Var, qim0VarE, lljVar8, 1.0f, true);
                mbh mbhVarA2 = jbh.a(h36.c, een.P0, x340Var, 0);
                int i8 = i3;
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, wnb0VarQ2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA2, x340Var, lljVar5);
                nko1.H(xos0VarM3, x340Var, lljVar6);
                x0d.q(iHashCode3, x340Var, lljVar7, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar8);
                uwo1.e(str, anm1.N("member-details-text-row-title", qim0Var4), cbx.d(x340Var).g, cbx.a(x340Var).b.a, new a0e1(5), null, 0, false, null, 0, null, x340Var, (i8 & 14) | 48, 0, 2016);
                uwo1.e(str2, anm1.N("member-details-text-row-subtitle", qim0Var4), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(5), null, 0, false, null, 0, null, x340Var, ((i8 >> 3) & 14) | 48, 0, 2016);
                x340Var = x340Var;
                x340Var.r(true);
                if (z5) {
                    x340Var.i0(60938711);
                    plx plxVar2 = plx.c;
                    long j2 = cbx.a(x340Var).b.b;
                    zov0 zov0Var2 = cbx.b(x340Var).g;
                    w0h1.a(plxVar2, isl.a, u291.r(qim0Var4, 16.0f).then(new i5j1(een.N0)), j2, 0L, false, x340Var, plx.d | 48, 48);
                    x340Var.r(false);
                } else {
                    x340Var.i0(61240651);
                    x340Var.r(false);
                }
                x340Var.r(true);
                qim0Var3 = qim0Var5;
                z4 = z5;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new sl(str, str2, qim0Var3, z4, i, i2, (byte) 1);
            }
        }

        public static final void i(vzq0 vzq0Var, x2y x2yVar, mk81 mk81Var, qim0 qim0Var, b0k b0kVar, int i) {
            int i2;
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1791043984);
            if ((i & 6) == 0) {
                i2 = (x340Var.i(vzq0Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(x2yVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= (i & 512) == 0 ? x340Var.g(mk81Var) : x340Var.i(mk81Var) ? 256 : 128;
            }
            int i3 = i2 | 3072;
            if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
                float fD = vzq0Var.d();
                qim0 qim0Var3 = nim0.a;
                ujo1.a(uyn1.B(qim0Var3, 0.0f, fD, 0.0f, 0.0f, 13), l6o1.C(0, 0, 1, x340Var), apo.r(1005342011, new ffx0(vzq0Var, x2yVar, mk81Var, (byte) 16), x340Var), x340Var, 384, 0);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new lzs0(i, vzq0Var, x2yVar, mk81Var, qim0Var2, (byte) 21);
            }
        }

        public static final void j(String str, ArrayList arrayList, vi11 vi11Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1581816355);
            int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(arrayList) ? 32 : 16) | (x340Var.i(vi11Var) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | 24576;
            if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
                nyx.a(2, (wux) null, apo.r(977006000, new gh61(str, function0, arrayList, vi11Var), x340Var), x340Var, 3078, 6);
                qim0Var2 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new wnx0(str, arrayList, vi11Var, function0, qim0Var2, i, (byte) 25);
            }
        }

        public static final Integer l(int i, int i2) {
            int iC = l1d.C(i);
            if (iC == 0) {
                return Integer.valueOf(i2 == 1 ? 2131954714 : 2131954715);
            }
            if (iC == 1) {
                return Integer.valueOf(i2 == 1 ? 2131954716 : 2131954717);
            }
            if (iC == 2) {
                return Integer.valueOf(i2 == 1 ? 2131954718 : 2131954719);
            }
            if (iC == 3) {
                return null;
            }
            eg.o();
            return null;
        }

        public static final byte m(char c) {
            if (c < '~') {
                return mme.b[c];
            }
            return (byte) 0;
        }

        public static final u9c0 q(iac0 iac0Var) {
            return zso1.H(iac0Var.getLifecycle());
        }

        public static final go80 r(klm klmVar, obp0 obp0Var, qbp0 qbp0Var, obp0 obp0Var2, sbp0 sbp0Var) {
            return klmVar.a("CalRolloutDaemon", new k7h0(obp0Var, qbp0Var, obp0Var2, sbp0Var, (byte) 7));
        }

        public static void s(scr scrVar, wu61 wu61Var) {
            String str = wu61Var.a;
            xpw xpwVar = wu61Var.c;
            j2i j2iVar = new j2i(-222038020, new vu61(wu61Var, (byte) 0), true);
            scrVar.e.add(wu61Var);
            scrVar.a.d(str, xpwVar, new j2i(-532513962, new nzd(scrVar, wu61Var, j2iVar), true));
        }

        public static void t(scr scrVar, wu61 wu61Var) {
            String str = wu61Var.a;
            xpw xpwVar = wu61Var.c;
            j2i j2iVar = new j2i(-2064529189, new vu61(wu61Var, (byte) 1), true);
            scrVar.f = true;
            ArrayList arrayList = scrVar.e;
            arrayList.add(null);
            rtb0 rtb0Var = scrVar.a;
            rtb0Var.a(str, xpwVar + ".stickyHeader", new j2i(-2114332953, new gk0(str, scrVar, j2iVar, (byte) 9), true));
            arrayList.add(null);
            rtb0.c(rtb0Var, ((Object) str) + ".divider", vhi.a, 2);
        }

        public static z280 u(c9 c9Var, int i, int i2) {
            return new z280(c9Var, i, i2);
        }

        public static final String v(byte b) {
            if (b == 1) {
                return "quotation mark '\"'";
            }
            if (b == 2) {
                return "string escape sequence '\\'";
            }
            if (b == 4) {
                return "comma ','";
            }
            if (b == 5) {
                return "colon ':'";
            }
            if (b == 6) {
                return "start of the object '{'";
            }
            if (b == 7) {
                return "end of the object '}'";
            }
            if (b == 8) {
                return "start of the array '['";
            }
            if (b == 9) {
                return "end of the array ']'";
            }
            if (b == 10) {
                return "end of the input";
            }
            return b == 127 ? "invalid token" : "valid token";
        }

        public abstract String n(int i, byte[] bArr, int i2);

        public abstract int o(String str, byte[] bArr, int i, int i2);

        public abstract String p();
    }
