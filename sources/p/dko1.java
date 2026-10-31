package p;

import android.util.LruCache;
import defpackage.m;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class dko1 {
    public static b180 a;

    public static final void a(vn6 vn6Var, iu30 iu30Var, em3 em3Var, xfx xfxVar, gw70 gw70Var, qfl1 qfl1Var, q7r0 q7r0Var, bnr bnrVar, ggr ggrVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1967673713);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.g(vn6Var) ? 4 : 2) | (b0kVar2.i(iu30Var) ? 32 : 16) | (b0kVar2.g(em3Var) ? 256 : 128) | (b0kVar2.i(xfxVar) ? 2048 : 1024) | (b0kVar2.i(gw70Var) ? 16384 : 8192) | (b0kVar2.i(qfl1Var) ? 131072 : 65536) | (b0kVar2.i(q7r0Var) ? 1048576 : 524288) | (b0kVar2.i(bnrVar) ? 8388608 : 4194304) | (b0kVar2.i(ggrVar) ? 67108864 : 33554432) | 805306368;
        if (b0kVar2.Y(i2 & 1, (306783379 & i2) != 306783378)) {
            xtb0 xtb0VarA = aub0.a(0, b0kVar2, 3);
            i6o0 i6o0VarQ = k1o1.q(b0kVar2);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            bzn1.e(null, apo.r(1327673317, new xb2(vn6Var, (byte) 27), b0kVar2), false, apo.r(487435427, new sm(iu30Var, (byte) 9), b0kVar2), rgr0.a, null, null, null, b0kVar2, 3120, 229);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, wnb0Var);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            qim0Var2 = qim0Var3;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, bmq0.L(qim0Var2, i6o0VarQ, (g6o0) null));
            d36 d36Var = new d36(16.0f, true, new um5(false));
            zzq0 zzq0VarJ = uyn1.j(0.0f, 16.0f, 0.0f, 16.0f, 5);
            boolean zI = b0kVar2.i(q7r0Var) | b0kVar2.i(ggrVar) | ((i2 & 14) == 4) | ((458752 & i2) == 131072 || b0kVar2.i(qfl1Var)) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | b0kVar2.i(gw70Var) | b0kVar2.i(bnrVar) | b0kVar2.i(xfxVar);
            Object objT = b0kVar2.T();
            if (zI || objT == fkj0.X) {
                vd6 vd6Var = new vd6(vn6Var, q7r0Var, qfl1Var, ggrVar, iu30Var, em3Var, gw70Var, bnrVar, xfxVar, (byte) 1);
                b0kVar2.s0(vd6Var);
                objT = vd6Var;
            }
            b0kVar2 = b0kVar2;
            ujo1.d(qim0VarZ, xtb0VarA, zzq0VarJ, false, d36Var, null, null, false, null, (iu30) objT, b0kVar2, 0, 488);
            b0kVar2.r((boolean) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0237: INVOKE 
                  (r10v12 'b0kVar2' p.b0k)
                  (wrap boolean:?: CAST (boolean) (r5v2 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]))
                 VIRTUAL call: p.x340.r(boolean):void (LINE:568) in method: p.dko1.a(p.vn6, p.iu30, p.em3, p.xfx, p.gw70, p.qfl1, p.q7r0, p.bnr, p.ggr, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v2 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 620
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.dko1.a(p.vn6, p.iu30, p.em3, p.xfx, p.gw70, p.qfl1, p.q7r0, p.bnr, p.ggr, p.qim0, p.b0k, int):void");
        }

        public static final void b(l5m l5mVar, iu30 iu30Var, em3 em3Var, gw70 gw70Var, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1492059384);
            int i2 = i | (x340Var.g(l5mVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(em3Var) ? 256 : 128) | (x340Var.i(gw70Var) ? 2048 : 1024);
            if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                ven0 ven0VarS = v8r.s(l5mVar, x340Var);
                ven0 ven0VarS2 = v8r.s(iu30Var, x340Var);
                boolean zG = x340Var.g(gw70Var) | ((i2 & 896) == 256);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new ei00(gw70Var, new t6(ven0VarS, ven0VarS2, em3Var, (byte) 29));
                    x340Var.s0(objT);
                }
                otw.c((ei00) objT, new ci00(1, l5mVar.c, l5mVar.b, l5mVar.a, l5mVar.d), (qim0) null, (ipb1) null, x340Var, 8, 12);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new wb6((Object) l5mVar, iu30Var, (Object) em3Var, (Object) gw70Var, i, (byte) 4);
            }
        }

        public static final void c(i2c i2cVar, rdm1 rdm1Var, Set set, idm1 idm1Var, iu30 iu30Var, b0k b0kVar, int i) {
            int i2;
            iu30 iu30Var2;
            b0k b0kVar2;
            Object next;
            wat watVar;
            m4c m4cVar = fkj0.X;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(1278962837);
            if ((i & 6) == 0) {
                i2 = (b0kVar3.g(i2cVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= b0kVar3.i(rdm1Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= b0kVar3.g(set) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= b0kVar3.i(idm1Var) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i2 |= b0kVar3.i(iu30Var) ? 16384 : 8192;
            }
            int i3 = i2;
            if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
                Iterator it = f46.i0(new qdm1[]{rdm1Var.j, rdm1Var.k}).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!set.contains(((qdm1) next).e.a));
                qdm1 qdm1Var = (qdm1) next;
                if (qdm1Var == null) {
                    h311 h311VarV = b0kVar3.v();
                    if (h311VarV != null) {
                        h311VarV.d = new kbe(i2cVar, rdm1Var, set, idm1Var, iu30Var, i, (byte) 1);
                        return;
                    }
                    return;
                }
                wat watVar2 = (wat) b0kVar3.k(t4k.h);
                float f = zjy.p(0.0f, new p3v(i2cVar.d() - (w6t0.c * 2.0f))).a;
                boolean zG = b0kVar3.g(qdm1Var);
                Object objT = b0kVar3.T();
                if (zG || objT == m4cVar) {
                    objT = v8r.q((Object) null);
                    b0kVar3.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                boolean zG2 = b0kVar3.g(ven0Var) | b0kVar3.i(qdm1Var);
                Object objT2 = b0kVar3.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new ibe(qdm1Var, ven0Var, (lnm) null, (byte) 0);
                    b0kVar3.s0(objT2);
                }
                qxd0.t(qdm1Var, b0kVar3, (vu30) objT2);
                boolean zI = b0kVar3.i(idm1Var) | b0kVar3.i(qdm1Var);
                Object objT3 = b0kVar3.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new ztb(idm1Var, qdm1Var, (byte) 23);
                    b0kVar3.s0(objT3);
                }
                iu30 iu30Var3 = (iu30) objT3;
                boolean zI2 = b0kVar3.i(idm1Var);
                Object objT4 = b0kVar3.T();
                if (zI2 || objT4 == m4cVar) {
                    watVar = watVar2;
                    qka qkaVar = new qka(1, idm1Var, idm1.class, "stopImpression", "stopImpression(Lcom/spotify/ubi/logger/ImpressionToken;)V", 0, (byte) 18);
                    b0kVar3.s0(qkaVar);
                    objT4 = qkaVar;
                } else {
                    watVar = watVar2;
                }
                yhm1.a(qdm1Var, iu30Var3, (iu30) objT4, b0kVar3, 0);
                yj41 yj41Var = (yj41) ven0Var.getValue();
                mdm1 mdm1Var = qdm1Var.a;
                mdm1 mdm1Var2 = qdm1Var.b;
                Object objT5 = b0kVar3.T();
                if (objT5 == m4cVar) {
                    objT5 = v8r.q(Float.valueOf(1.0f));
                    b0kVar3.s0(objT5);
                }
                tob1 tob1Var = (tob1) objT5;
                qim0 qim0VarA = i2cVar.a(nim0.a, een.h);
                Object objT6 = b0kVar3.T();
                if (objT6 == m4cVar) {
                    objT6 = jzd.S0;
                    b0kVar3.s0(objT6);
                }
                qim0 qim0VarX = u291.x(0.0f, f, 1, s161.b(qim0VarA, true, (iu30) objT6));
                wat watVar3 = watVar;
                boolean zG3 = b0kVar3.g(watVar3) | ((57344 & i3) == 16384);
                Object objT7 = b0kVar3.T();
                if (zG3 || objT7 == m4cVar) {
                    iu30Var2 = iu30Var;
                    objT7 = new jbe(iu30Var2, watVar3, (byte) 0);
                    b0kVar3.s0(objT7);
                } else {
                    iu30Var2 = iu30Var;
                }
                b0kVar2 = b0kVar3;
                vxo1.e(yj41Var, mdm1Var, mdm1Var2, tob1Var, lrn1.u(qim0VarX, (iu30) objT7), b0kVar2, 3080);
            } else {
                i2cVar = i2cVar;
                iu30Var2 = iu30Var;
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
            }
            h311 h311VarV2 = b0kVar2.v();
            if (h311VarV2 != null) {
                h311VarV2.d = new kbe(i2cVar, rdm1Var, set, idm1Var, iu30Var2, i, (byte) 0);
            }
        }

        public static final void d(n5m n5mVar, int i, d0r d0rVar, bnr bnrVar, qim0 qim0Var, b0k b0kVar, int i2) {
            int i3;
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(292107184);
            if ((i2 & 6) == 0) {
                i3 = (x340Var.g(n5mVar) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= x340Var.e(i) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= x340Var.i(d0rVar) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i3 |= x340Var.i(bnrVar) ? 2048 : 1024;
            }
            int i4 = i3 | 24576;
            if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
                boolean zG = x340Var.g(d0rVar);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = bnrVar.a(d0rVar);
                    x340Var.s0(objT);
                }
                i1o1.e((tyq) objT, new vqk(n5mVar.a, (af5) null, (u7h) null, false, 2, 2, false, false, (u7h) null, n5mVar.b, (Integer) null, Integer.valueOf(i), 3982), d0rVar, null, null, w6i.d, null, 0, null, x340Var, 196672 | (i4 & 896), 236);
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new lk0(n5mVar, i, d0rVar, bnrVar, qim0Var2, i2, (byte) 3);
            }
        }

        public static final void e(o5m o5mVar, iu30 iu30Var, em3 em3Var, xfx xfxVar, qim0 qim0Var, b0k b0kVar, int i) {
            b0k b0kVar2;
            qim0 qim0Var2;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-37083993);
            int i2 = i | (b0kVar3.g(o5mVar) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.g(em3Var) ? 256 : 128) | (b0kVar3.i(xfxVar) ? 2048 : 1024) | 24576;
            if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
                boolean zI = b0kVar3.i(xfxVar) | ((i2 & 896) == 256) | ((i2 & 112) == 32) | ((i2 & 14) == 4);
                Object objT = b0kVar3.T();
                if (zI || objT == fkj0.X) {
                    db dbVar = new db(xfxVar, o5mVar, em3Var, iu30Var, (byte) 17);
                    b0kVar3.s0(dbVar);
                    objT = dbVar;
                }
                qim0 qim0Var3 = nim0.a;
                b0kVar2 = b0kVar3;
                dm5.a((iu30) objT, qim0Var3, (iu30) null, b0kVar2, 48, 4);
                qim0Var2 = qim0Var3;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new m((Object) o5mVar, (Object) iu30Var, (Object) em3Var, (Object) xfxVar, qim0Var2, i, (byte) 15);
            }
        }

        public static final void f(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-540465129);
            j06 j06Var = x340Var.a;
            int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | 384;
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                boolean z = x340Var.S;
                n4k n4kVar = hmb0.t1;
                if (z) {
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
                era eraVar = een.Q0;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                d36 d36Var = new d36(12.0f, true, new um5(false));
                qim0 qim0VarB = uyn1.B(uyn1.z(cbx.b(x340Var).b.b, 0.0f, 2, h2c.a.a(qim0Var3, een.h)), 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.f, 7);
                mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 48);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
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
                lee1 lee1Var = cbx.d(x340Var).d;
                long j = cbx.a(x340Var).b.a;
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = s8x.b;
                    x340Var.s0(objT);
                }
                uwo1.e(str, s161.b(qim0Var3, false, (iu30) objT), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2016);
                uwo1.e(str2, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2018);
                x340Var.r(true);
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new c4(str, str2, qim0Var2, i, (byte) 19);
            }
        }

        /* JADX WARN: Code duplicated, block: B:112:0x0160  */
        /* JADX WARN: Code duplicated, block: B:114:0x0164  */
        /* JADX WARN: Code duplicated, block: B:115:0x016b  */
        /* JADX WARN: Code duplicated, block: B:117:0x016e  */
        /* JADX WARN: Code duplicated, block: B:118:0x0175  */
        /* JADX WARN: Code duplicated, block: B:121:0x017a  */
        /* JADX WARN: Code duplicated, block: B:122:0x017f  */
        /* JADX WARN: Code duplicated, block: B:124:0x0182  */
        /* JADX WARN: Code duplicated, block: B:125:0x0185  */
        /* JADX WARN: Code duplicated, block: B:128:0x018a  */
        /* JADX WARN: Code duplicated, block: B:130:0x0198 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:131:0x019a  */
        /* JADX WARN: Code duplicated, block: B:134:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:135:0x01ac  */
        /* JADX WARN: Code duplicated, block: B:156:0x01ff  */
        /* JADX WARN: Code duplicated, block: B:158:0x0250  */
        /* JADX WARN: Code duplicated, block: B:161:0x0263  */
        /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:41:0x0072  */
        /* JADX WARN: Code duplicated, block: B:43:0x0076  */
        /* JADX WARN: Code duplicated, block: B:45:0x007e  */
        /* JADX WARN: Code duplicated, block: B:46:0x0081  */
        /* JADX WARN: Code duplicated, block: B:49:0x0088  */
        /* JADX WARN: Code duplicated, block: B:52:0x0090  */
        /* JADX WARN: Code duplicated, block: B:53:0x0097  */
        /* JADX WARN: Code duplicated, block: B:55:0x009f  */
        /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:66:0x00be  */
        /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:76:0x00db  */
        /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:87:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:94:0x0116  */
        /* JADX WARN: Code duplicated, block: B:97:0x0120  */
        public static final void g(final pf50 pf50Var, final qim0 qim0Var, upb0 upb0Var, vzq0 vzq0Var, g36 g36Var, c36 c36Var, iq20 iq20Var, boolean z, hxq0 hxq0Var, final iu30 iu30Var, b0k b0kVar, final int i, final int i2) {
            int i3;
            upb0 upb0Var2;
            vzq0 vzq0Var2;
            int i4;
            g36 g36Var2;
            int i5;
            int i6;
            c36 c36Var2;
            int i7;
            final iq20 iq20Var2;
            int i8;
            int i9;
            int i10;
            boolean z2;
            boolean z3;
            b0k b0kVar2;
            final boolean z4;
            final hxq0 hxq0Var2;
            final upb0 upb0Var3;
            final vzq0 vzq0Var3;
            final c36 c36Var3;
            final g36 g36Var3;
            h311 h311VarV;
            upb0 upb0VarB;
            vzq0 zzq0Var;
            g36 g36Var4;
            c36 c36Var4;
            boolean z5;
            int i11;
            vzq0 vzq0Var4;
            boolean z6;
            g36 g36Var5;
            hxq0 hxq0VarB;
            upb0 upb0Var4;
            iq20 iq20Var3;
            int i12;
            int i13;
            byte b;
            e9r e9rVarA;
            boolean zG;
            Object objT;
            int i14;
            boolean z7;
            Object objT2;
            m4c m4cVar = fkj0.X;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-2072102870);
            if ((i & 6) == 0) {
                i3 = (b0kVar3.g(pf50Var) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= b0kVar3.g(qim0Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    upb0Var2 = upb0Var;
                    int i15 = b0kVar3.g(upb0Var2) ? 256 : 128;
                    i3 |= i15;
                } else {
                    upb0Var2 = upb0Var;
                }
                i3 |= i15;
            } else {
                upb0Var2 = upb0Var;
            }
            int i16 = i2 & 8;
            if (i16 == 0) {
                if ((i & 3072) == 0) {
                    vzq0Var2 = vzq0Var;
                    i3 |= b0kVar3.g(vzq0Var2) ? 2048 : 1024;
                }
                i4 = i3 | 24576;
                if ((i & 196608) == 0) {
                    if ((i2 & 32) == 0) {
                        g36Var2 = g36Var;
                        int i17 = b0kVar3.g(g36Var2) ? 131072 : 65536;
                        i4 |= i17;
                    } else {
                        g36Var2 = g36Var;
                    }
                    i4 |= i17;
                } else {
                    g36Var2 = g36Var;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i4 |= 1572864;
                    i6 = 196608;
                    c36Var2 = c36Var;
                } else {
                    i6 = 196608;
                    c36Var2 = c36Var;
                    if ((i & 1572864) == 0) {
                        if (b0kVar3.g(c36Var2)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i4 |= i7;
                    }
                }
                if ((i & 12582912) == 0) {
                    if ((i2 & 128) == 0) {
                        iq20Var2 = iq20Var;
                        int i18 = b0kVar3.g(iq20Var2) ? 8388608 : 4194304;
                        i4 |= i18;
                    } else {
                        iq20Var2 = iq20Var;
                    }
                    i4 |= i18;
                } else {
                    iq20Var2 = iq20Var;
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (b0kVar3.h(z)) {
                        i9 = 67108864;
                    } else {
                        i9 = 33554432;
                    }
                    i4 |= i9;
                }
                if ((i & 805306368) == 0) {
                    i4 |= 268435456;
                }
                if (b0kVar3.i(iu30Var)) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                z2 = true;
                if ((i4 & 306783379) == 306783378 || (i10 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (b0kVar3.Y(i4 & 1, z3)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0 || b0kVar3.E()) {
                        if ((i2 & 4) != 0) {
                            upb0VarB = wpb0.b(b0kVar3);
                            i4 &= -897;
                        } else {
                            upb0VarB = upb0Var2;
                        }
                        if (i16 != 0) {
                            zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            zzq0Var = vzq0Var2;
                        }
                        if ((i2 & 32) != 0) {
                            i4 &= -458753;
                            g36Var4 = h36.c;
                        } else {
                            g36Var4 = g36Var2;
                        }
                        if (i5 != 0) {
                            c36Var4 = h36.a;
                        } else {
                            c36Var4 = c36Var2;
                        }
                        if ((i2 & 128) != 0) {
                            e9rVarA = wxa1.a(b0kVar3);
                            zG = b0kVar3.g(e9rVarA);
                            objT = b0kVar3.T();
                            if (zG || objT == m4cVar) {
                                objT = new ozr(e9rVarA);
                                b0kVar3.s0(objT);
                            }
                            iq20Var2 = (ozr) objT;
                            i4 &= -29360129;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z;
                        }
                        i11 = i4 & (-1879048193);
                        vzq0Var4 = zzq0Var;
                        z6 = z5;
                        g36Var5 = g36Var4;
                        hxq0VarB = jxq0.b(b0kVar3);
                        upb0Var4 = upb0VarB;
                        iq20Var3 = iq20Var2;
                        i12 = 32;
                        i13 = 4;
                        b = 16;
                    } else {
                        b0kVar3.b0();
                        if ((i2 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i2 & 32) != 0) {
                            i4 &= -458753;
                        }
                        if ((i2 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        i11 = i4 & (-1879048193);
                        z6 = z;
                        hxq0VarB = hxq0Var;
                        vzq0Var4 = vzq0Var2;
                        c36Var4 = c36Var2;
                        g36Var5 = g36Var2;
                        upb0Var4 = upb0Var2;
                        iq20Var3 = iq20Var2;
                        b = 16;
                        i12 = 32;
                        i13 = 4;
                    }
                    b0kVar3.s();
                    i14 = (i11 & 14) | ((i11 >> 15) & 112);
                    boolean z8 = (((i14 & 14) ^ 6) <= i13 && b0kVar3.g(pf50Var)) || (i14 & 6) == i13;
                    if ((((i14 & 112) ^ 48) > i12 || !b0kVar3.g(c36Var4)) && (i14 & 48) != i12) {
                    }
                    z7 = z8 | z2;
                    objT2 = b0kVar3.T();
                    if (z7 || objT2 == m4cVar) {
                        objT2 = new rg50(new f14(pf50Var, c36Var4, b));
                        b0kVar3.s0(objT2);
                    }
                    int i19 = i11 >> 3;
                    int i20 = ((i11 >> 18) & 14) | ((i10 << 3) & 112);
                    b0kVar2 = b0kVar3;
                    c36 c36Var5 = c36Var4;
                    eko1.i(qim0Var, upb0Var4, (rg50) objT2, vzq0Var4, iq20Var3, z6, hxq0VarB, g36Var5, c36Var5, iu30Var, b0kVar2, (i19 & 29360128) | (i19 & 14) | i6 | (i19 & 112) | (i11 & 7168) | (57344 & i11) | (3670016 & i19) | ((i11 << 12) & 1879048192), i20);
                    upb0Var3 = upb0Var4;
                    vzq0Var3 = vzq0Var4;
                    iq20Var2 = iq20Var3;
                    z4 = z6;
                    hxq0Var2 = hxq0VarB;
                    g36Var3 = g36Var5;
                    c36Var3 = c36Var5;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    z4 = z;
                    hxq0Var2 = hxq0Var;
                    upb0Var3 = upb0Var2;
                    vzq0Var3 = vzq0Var2;
                    c36Var3 = c36Var2;
                    g36Var3 = g36Var2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.apb0
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            dko1.g(pf50Var, qim0Var, upb0Var3, vzq0Var3, g36Var3, c36Var3, iq20Var2, z4, hxq0Var2, iu30Var, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            vzq0Var2 = vzq0Var;
            i4 = i3 | 24576;
            if ((i & 196608) == 0) {
                if ((i2 & 32) == 0) {
                    g36Var2 = g36Var;
                    if (b0kVar3.g(g36Var2)) {
                    }
                    i4 |= i17;
                } else {
                    g36Var2 = g36Var;
                }
                i4 |= i17;
            } else {
                g36Var2 = g36Var;
            }
            i5 = i2 & 64;
            if (i5 != 0) {
                i4 |= 1572864;
                i6 = 196608;
                c36Var2 = c36Var;
            } else {
                i6 = 196608;
                c36Var2 = c36Var;
                if ((i & 1572864) == 0) {
                    if (b0kVar3.g(c36Var2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i4 |= i7;
                }
            }
            if ((i & 12582912) == 0) {
                if ((i2 & 128) == 0) {
                    iq20Var2 = iq20Var;
                    if (b0kVar3.g(iq20Var2)) {
                    }
                    i4 |= i18;
                } else {
                    iq20Var2 = iq20Var;
                }
                i4 |= i18;
            } else {
                iq20Var2 = iq20Var;
            }
            i8 = i2 & 256;
            if (i8 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (b0kVar3.h(z)) {
                    i9 = 67108864;
                } else {
                    i9 = 33554432;
                }
                i4 |= i9;
            }
            if ((i & 805306368) == 0) {
                i4 |= 268435456;
            }
            if (b0kVar3.i(iu30Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            z2 = true;
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (b0kVar3.Y(i4 & 1, z3)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if ((i2 & 4) != 0) {
                        upb0VarB = wpb0.b(b0kVar3);
                        i4 &= -897;
                    } else {
                        upb0VarB = upb0Var2;
                    }
                    if (i16 != 0) {
                        zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        zzq0Var = vzq0Var2;
                    }
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                        g36Var4 = h36.c;
                    } else {
                        g36Var4 = g36Var2;
                    }
                    if (i5 != 0) {
                        c36Var4 = h36.a;
                    } else {
                        c36Var4 = c36Var2;
                    }
                    if ((i2 & 128) != 0) {
                        e9rVarA = wxa1.a(b0kVar3);
                        zG = b0kVar3.g(e9rVarA);
                        objT = b0kVar3.T();
                        if (zG) {
                            objT = new ozr(e9rVarA);
                            b0kVar3.s0(objT);
                        } else {
                            objT = new ozr(e9rVarA);
                            b0kVar3.s0(objT);
                        }
                        iq20Var2 = (ozr) objT;
                        i4 &= -29360129;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z;
                    }
                    i11 = i4 & (-1879048193);
                    vzq0Var4 = zzq0Var;
                    z6 = z5;
                    g36Var5 = g36Var4;
                    hxq0VarB = jxq0.b(b0kVar3);
                    upb0Var4 = upb0VarB;
                    iq20Var3 = iq20Var2;
                    i12 = 32;
                    i13 = 4;
                    b = 16;
                } else {
                    if ((i2 & 4) != 0) {
                        upb0VarB = wpb0.b(b0kVar3);
                        i4 &= -897;
                    } else {
                        upb0VarB = upb0Var2;
                    }
                    if (i16 != 0) {
                        zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        zzq0Var = vzq0Var2;
                    }
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                        g36Var4 = h36.c;
                    } else {
                        g36Var4 = g36Var2;
                    }
                    if (i5 != 0) {
                        c36Var4 = h36.a;
                    } else {
                        c36Var4 = c36Var2;
                    }
                    if ((i2 & 128) != 0) {
                        e9rVarA = wxa1.a(b0kVar3);
                        zG = b0kVar3.g(e9rVarA);
                        objT = b0kVar3.T();
                        if (zG) {
                            objT = new ozr(e9rVarA);
                            b0kVar3.s0(objT);
                        } else {
                            objT = new ozr(e9rVarA);
                            b0kVar3.s0(objT);
                        }
                        iq20Var2 = (ozr) objT;
                        i4 &= -29360129;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z;
                    }
                    i11 = i4 & (-1879048193);
                    vzq0Var4 = zzq0Var;
                    z6 = z5;
                    g36Var5 = g36Var4;
                    hxq0VarB = jxq0.b(b0kVar3);
                    upb0Var4 = upb0VarB;
                    iq20Var3 = iq20Var2;
                    i12 = 32;
                    i13 = 4;
                    b = 16;
                }
                b0kVar3.s();
                i14 = (i11 & 14) | ((i11 >> 15) & 112);
                if (((i14 & 14) ^ 6) <= i13) {
                }
                z2 = ((i14 & 112) ^ 48) > i12 ? false : false;
                z7 = z8 | z2;
                objT2 = b0kVar3.T();
                if (z7) {
                    objT2 = new rg50(new f14(pf50Var, c36Var4, b));
                    b0kVar3.s0(objT2);
                } else {
                    objT2 = new rg50(new f14(pf50Var, c36Var4, b));
                    b0kVar3.s0(objT2);
                }
                int i110 = i11 >> 3;
                int i21 = ((i11 >> 18) & 14) | ((i10 << 3) & 112);
                b0kVar2 = b0kVar3;
                c36 c36Var6 = c36Var4;
                eko1.i(qim0Var, upb0Var4, (rg50) objT2, vzq0Var4, iq20Var3, z6, hxq0VarB, g36Var5, c36Var6, iu30Var, b0kVar2, (i110 & 29360128) | (i110 & 14) | i6 | (i110 & 112) | (i11 & 7168) | (57344 & i11) | (3670016 & i110) | ((i11 << 12) & 1879048192), i21);
                upb0Var3 = upb0Var4;
                vzq0Var3 = vzq0Var4;
                iq20Var2 = iq20Var3;
                z4 = z6;
                hxq0Var2 = hxq0VarB;
                g36Var3 = g36Var5;
                c36Var3 = c36Var6;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z4 = z;
                hxq0Var2 = hxq0Var;
                upb0Var3 = upb0Var2;
                vzq0Var3 = vzq0Var2;
                c36Var3 = c36Var2;
                g36Var3 = g36Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.apb0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        dko1.g(pf50Var, qim0Var, upb0Var3, vzq0Var3, g36Var3, c36Var3, iq20Var2, z4, hxq0Var2, iu30Var, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }

        public static final void h(int i, List list, boolean z, List list2, int i2, boolean z2, p8i0 p8i0Var, boolean z3, LruCache lruCache, q8n q8nVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, iu30 iu30Var, Function0 function4, iu30 iu30Var2, b0k b0kVar, int i3) {
            boolean z4;
            boolean z5;
            x340 x340Var;
            int i4;
            int i5;
            int i6;
            int i7;
            x340 x340Var2 = (x340) b0kVar;
            int i8 = i3 | (kk0.t(1891354828, i, x340Var2) ? 4 : 2) | (x340Var2.g(list) ? 32 : 16) | (x340Var2.h(z) ? 256 : 128) | (x340Var2.g(list2) ? 2048 : 1024) | (x340Var2.e(i2) ? 16384 : 8192) | (x340Var2.h(z2) ? 131072 : 65536) | (x340Var2.e(p8i0Var.ordinal()) ? 1048576 : 524288) | (x340Var2.h(z3) ? 8388608 : 4194304) | (x340Var2.i(lruCache) ? 67108864 : 33554432) | (x340Var2.i(q8nVar) ? 536870912 : 268435456);
            int i9 = 12582912 | (x340Var2.i(function0) ? 4 : 2) | (x340Var2.i(function1) ? 32 : 16) | (x340Var2.i(function2) ? 256 : 128) | (x340Var2.i(function3) ? 2048 : 1024) | (x340Var2.i(iu30Var) ? 16384 : 8192) | (x340Var2.i(function4) ? 131072 : 65536) | (x340Var2.i(iu30Var2) ? 1048576 : 524288);
            if (x340Var2.Y(i8 & 1, ((i8 & 306783379) == 306783378 && (i9 & 4793491) == 4793490) ? false : true)) {
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, u291.d(nim0.a, 1.0f));
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
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
                nko1.H(mbhVarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                if (z3) {
                    x340Var2.i0(152697367);
                    z4 = true;
                    pno1.b(p8i0Var, iu30Var2, uyn1.z(0.0f, 8.0f, 1, new tq60(een.Q0)), x340Var2, ((i8 >> 18) & 14) | ((i9 >> 15) & 112));
                    x340Var2.r(false);
                } else {
                    z4 = true;
                    x340Var2.i0(152921280);
                    x340Var2.r(false);
                }
                if (i == 3) {
                    x340Var2.i0(153015582);
                    iko1.h(cwl1.o0(x340Var2, 2131958421), cwl1.o0(x340Var2, 2131958420), null, z2, function4, function0, cwl1.o0(x340Var2, 2131958403), x340Var2, ((i8 >> 6) & 7168) | ((i9 >> 3) & 57344) | ((i9 << 15) & 458752), 4);
                    x340Var2 = x340Var2;
                    x340Var2.r(false);
                } else if (i == 4) {
                    x340Var2.i0(153492610);
                    iko1.h(cwl1.o0(x340Var2, 2131958421), cwl1.o0(x340Var2, 2131958410), null, z2, function4, function1, cwl1.o0(x340Var2, 2131958415), x340Var2, ((i8 >> 6) & 7168) | ((i9 >> 3) & 57344) | (458752 & (i9 << 12)), 4);
                    x340Var2 = x340Var2;
                    x340Var2.r(false);
                } else {
                    if (i == 2 && list.isEmpty() && !z) {
                        x340Var2.i0(153999305);
                        iko1.h(cwl1.o0(x340Var2, 2131958423), cwl1.o0(x340Var2, 2131958422), null, z2, function4, function2, cwl1.o0(x340Var2, 2131958419), x340Var2, ((i8 >> 6) & 7168) | ((i9 >> 3) & 57344) | (458752 & (i9 << 9)), 4);
                        x340Var2 = x340Var2;
                        x340Var2.r(false);
                    } else {
                        if (i == 2) {
                            x340Var2.i0(1667550857);
                            int i10 = (i8 >> 3) & 14;
                            int i11 = i8 >> 6;
                            int i12 = i8 >> 12;
                            int i13 = i10 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (i12 & 57344) | (i12 & 458752);
                            int i14 = i9 << 9;
                            z5 = z4;
                            i(list, list2, i2, z2, lruCache, q8nVar, function3, iu30Var, function4, p8i0Var, function2, x340Var2, i13 | (i14 & 3670016) | (i14 & 29360128) | (i14 & 234881024) | ((i8 << 9) & 1879048192), (i9 >> 6) & 14, 0);
                            x340Var = x340Var2;
                            x340Var.r(false);
                        } else {
                            z5 = z4;
                            x340Var = x340Var2;
                            if (!list.isEmpty() || z) {
                                x340Var.i0(1667594204);
                                int i15 = i8 >> 6;
                                int i16 = ((i8 >> 3) & 14) | (i15 & 112) | (i15 & 896) | (i15 & 7168);
                                int i17 = i8 >> 12;
                                int i18 = i16 | (i17 & 57344) | (i17 & 458752);
                                int i19 = i9 << 9;
                                x340Var2 = x340Var;
                                i(list, list2, i2, z2, lruCache, q8nVar, function3, iu30Var, function4, p8i0Var, null, x340Var2, i18 | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024) | ((i8 << 9) & 1879048192), 0, 1024);
                                x340Var2.r(false);
                            } else {
                                x340Var.i0(1667568142);
                                p8i0 p8i0Var2 = p8i0.c;
                                if (p8i0Var == p8i0Var2) {
                                    i4 = 155079562;
                                    i5 = 2131958414;
                                } else {
                                    i4 = 155170609;
                                    i5 = 2131958412;
                                }
                                String strK = x0d.k(x340Var, i4, i5, x340Var, false);
                                if (p8i0Var == p8i0Var2) {
                                    i6 = 155323687;
                                    i7 = 2131958413;
                                } else {
                                    i6 = 155417710;
                                    i7 = 2131958411;
                                }
                                iko1.h(strK, x0d.k(x340Var, i6, i7, x340Var, false), null, z2, function4, null, null, x340Var, ((i8 >> 6) & 7168) | ((i9 >> 3) & 57344), 100);
                                x340Var.r(false);
                            }
                        }
                        x340Var2 = x340Var;
                    }
                    x340Var2.r(z5);
                }
                z5 = z4;
                x340Var2.r(z5);
            } else {
                x340Var2.b0();
            }
            h311 h311VarV = x340Var2.v();
            if (h311VarV != null) {
                h311VarV.d = new nsh0(i, list, z, list2, i2, z2, p8i0Var, z3, lruCache, q8nVar, function0, function1, function2, function3, iu30Var, function4, iu30Var2, i3);
            }
        }

        public static final void i(List list, List list2, int i, boolean z, LruCache lruCache, q8n q8nVar, Function0 function0, iu30 iu30Var, Function0 function1, p8i0 p8i0Var, Function0 function2, b0k b0kVar, int i2, int i3, int i4) {
            int i5;
            List list3;
            Function0 function3;
            int i6;
            Function0 function4;
            boolean z2;
            String strK;
            Object cwuVar;
            m4c m4cVar = fkj0.X;
            b0k b0kVar2 = (x340) b0kVar;
            b0kVar2.k0(-1948341868);
            if ((i2 & 6) == 0) {
                i5 = (b0kVar2.g(list) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
            if ((i2 & 48) == 0) {
                list3 = list2;
                i5 |= b0kVar2.g(list3) ? 32 : 16;
            } else {
                list3 = list2;
            }
            if ((i2 & 384) == 0) {
                i5 |= b0kVar2.e(i) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i5 |= b0kVar2.h(z) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                i5 |= b0kVar2.i(lruCache) ? 16384 : 8192;
            }
            if ((196608 & i2) == 0) {
                i5 |= b0kVar2.i(q8nVar) ? 131072 : 65536;
            }
            if ((1572864 & i2) == 0) {
                i5 |= b0kVar2.i(function0) ? 1048576 : 524288;
            }
            if ((12582912 & i2) == 0) {
                i5 |= b0kVar2.i(iu30Var) ? 8388608 : 4194304;
            }
            if ((i2 & 100663296) == 0) {
                i5 |= b0kVar2.i(function1) ? 67108864 : 33554432;
            }
            if ((i2 & 805306368) == 0) {
                i5 |= b0kVar2.e(p8i0Var.ordinal()) ? 536870912 : 268435456;
            }
            int i7 = i4 & 1024;
            if (i7 != 0) {
                function3 = function2;
                i6 = i3 | 6;
            } else {
                function3 = function2;
                if ((i3 & 6) == 0) {
                    i6 = i3 | (b0kVar2.i(function3) ? 4 : 2);
                } else {
                    i6 = i3;
                }
            }
            if (b0kVar2.Y(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
                Function0 function5 = i7 != 0 ? null : function3;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar2).b;
                ven0 ven0VarS = v8r.s(function0, b0kVar2);
                upb0 upb0VarB = wpb0.b(b0kVar2);
                boolean z3 = list3.size() >= i;
                boolean zG = b0kVar2.g(upb0VarB) | b0kVar2.g(ven0VarS);
                Object objT = b0kVar2.T();
                if (zG || objT == m4cVar) {
                    objT = new tfe0(upb0VarB, ven0VarS, (lnm) null, (byte) 22);
                    b0kVar2.s0(objT);
                }
                qxd0.t(upb0VarB, b0kVar2, (vu30) objT);
                mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE = zr7.E(b0kVar2, nim0Var);
                hzj.A.getClass();
                int i8 = i5;
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
                if (function5 != null) {
                    b0kVar2.i0(1952883453);
                    yto1.h(p8i0Var, function5, null, b0kVar2, ((i8 >> 27) & 14) | ((i6 << 3) & 112));
                    z2 = false;
                    b0kVar2.r(false);
                } else {
                    z2 = false;
                    b0kVar2.i0(1952982436);
                    b0kVar2.r(false);
                }
                if (p8i0Var == p8i0.c) {
                    b0kVar2.i0(1953064958);
                    strK = cwl1.U(2131820753, i, new Object[]{Integer.valueOf(i)}, b0kVar2);
                    b0kVar2.r(z2);
                } else {
                    strK = x0d.k(b0kVar2, 1953232637, 2131958416, b0kVar2, z2);
                }
                boolean z4 = z3;
                Function0 function6 = function5;
                uwo1.e(strK, uyn1.z(0.0f, 8.0f, 1, u291.f(nim0Var, 1.0f)), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2016);
                b0kVar2 = b0kVar2;
                pf50 pf50Var = new pf50(4);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                kiv kivVar = xce0.a;
                qim0 qim0VarI = zr7.i(qim0VarD, gce0.c);
                WeakHashMap weakHashMap = osl1.x;
                zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, poo1.x(lhc.g(b0kVar2).e, b0kVar2).a(), 7);
                d36 d36Var = new d36(2.0f, true, new um5(false));
                d36 d36Var2 = new d36(2.0f, true, new um5(false));
                boolean zI = ((i8 & 14) == 4) | ((i8 & 7168) == 2048) | ((234881024 & i8) == 67108864) | ((i8 & 112) == 32) | b0kVar2.i(lruCache) | b0kVar2.i(q8nVar) | b0kVar2.h(z4) | ((i8 & 29360128) == 8388608);
                Object objT2 = b0kVar2.T();
                if (zI || objT2 == m4cVar) {
                    cwuVar = new cwu(z, list, function1, list2, lruCache, q8nVar, z4, iu30Var);
                    b0kVar2.s0(cwuVar);
                } else {
                    cwuVar = objT2;
                }
                g(pf50Var, qim0VarI, upb0VarB, zzq0VarJ, d36Var2, d36Var, null, false, null, (iu30) cwuVar, b0kVar2, 0, 912);
                b0kVar2.r(true);
                function4 = function6;
            } else {
                b0kVar2.b0();
                function4 = function3;
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new sxx(list, list2, i, z, lruCache, q8nVar, function0, iu30Var, function1, p8i0Var, function4, i2, i3, i4);
            }
        }

        public static final void j(String str, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1935653541);
            int i2 = (x340Var.g(str) ? 4 : 2) | i;
            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                gfx.b(6, apo.r(1052415504, new tej0(str, (byte) 21), x340Var), x340Var, 54);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new tej0(str, i, (byte) 22);
            }
        }

        public static final void k(qim0 qim0Var, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-547619561);
            int i2 = i | 6;
            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                qim0 qim0Var2 = nim0.a;
                qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
                yto1.e(2, 48, 0, x340Var, h2c.a.a(qim0Var2, een.h));
                x340Var.r(true);
                qim0Var = qim0Var2;
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new one0(qim0Var, i, (byte) 23);
            }
        }

        public static final void l(w5m w5mVar, iu30 iu30Var, em3 em3Var, qim0 qim0Var, b0k b0kVar, int i) {
            x340 x340Var;
            qim0 qim0Var2;
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.k0(1944680949);
            int i2 = i | (x340Var2.g(w5mVar) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16) | (x340Var2.g(em3Var) ? 256 : 128) | 3072;
            if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                jw31 jw31VarA = ew31.a(h36.g, een.Z, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
                String str = w5mVar.a;
                uwr uwrVar = cbx.a;
                qim0Var2 = qim0Var3;
                uwo1.e(str, null, cbx.d(x340Var2).e, cbx.a(x340Var2).b.a, null, null, 0, false, new cjc0(1), 0, null, x340Var2, 0, 0, 1778);
                x340Var = x340Var2;
                if (w5mVar.b != null) {
                    x340Var.i0(-1865105398);
                    String str2 = w5mVar.b;
                    lee1 lee1Var = cbx.d(x340Var).k;
                    long j = cbx.a(x340Var).b.b;
                    boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4) | ((i2 & 112) == 32);
                    Object objT = x340Var.T();
                    if (z || objT == fkj0.X) {
                        objT = new hh(w5mVar, em3Var, iu30Var, (byte) 21);
                        x340Var.s0(objT);
                    }
                    uwo1.e(str2, bin.x(qim0Var2, false, null, null, null, (Function0) objT, 15), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1864692943);
                    x340Var.r(false);
                }
                x340Var.r(true);
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new wb6((Object) w5mVar, iu30Var, (Object) em3Var, (Object) qim0Var2, i, (byte) 5);
            }
        }

        public static final gal m(no61 no61Var, x6n x6nVar) {
            if (x6nVar.equals(o6n.a)) {
                return n(y6n.i, new j1(2, no61Var, no61.class, "SetOfflineMode", "SetOfflineMode(Lcom/google/protobuf/BoolValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 27));
            }
            if (x6nVar.equals(q6n.a)) {
                return n(y6n.Q0, new z6n(2, no61Var, no61.class, "SetPlayExplicitContext", "SetPlayExplicitContext(Lcom/google/protobuf/BoolValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 8));
            }
            if (x6nVar.equals(r6n.a)) {
                return n(y6n.R0, new z6n(2, no61Var, no61.class, "SetPrivateSession", "SetPrivateSession(Lcom/google/protobuf/BoolValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 10));
            }
            if (x6nVar.equals(i6n.a)) {
                return n(y6n.S0, new z6n(2, no61Var, no61.class, "SetDownloadOver3G", "SetDownloadOver3G(Lcom/google/protobuf/BoolValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 11));
            }
            if (x6nVar.equals(k6n.a)) {
                return q(zxm.c1, new z6n(2, no61Var, no61.class, "SetDownloadQuality", "SetDownloadQuality(Lcom/google/protobuf/Int32Value;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 12));
            }
            if (x6nVar.equals(v6n.a)) {
                return q(zxm.d1, new j1(2, no61Var, no61.class, "SetStreamQuality", "SetStreamQuality(Lcom/google/protobuf/Int32Value;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 22));
            }
            if (x6nVar.equals(u6n.a)) {
                return q(zxm.e1, new j1(2, no61Var, no61.class, "SetStreamNonMeteredQuality", "SetStreamNonMeteredQuality(Lcom/google/protobuf/Int32Value;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 23));
            }
            if (x6nVar.equals(c6n.a)) {
                return n(y6n.b, new j1(2, no61Var, no61.class, "SetAllowAudioQualityDowngrade", "SetAllowAudioQualityDowngrade(Lcom/google/protobuf/BoolValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 24));
            }
            if (x6nVar.equals(l6n.a)) {
                return n(y6n.c, new j1(2, no61Var, no61.class, "SetGapless", "SetGapless(Lcom/google/protobuf/BoolValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 25));
            }
            if (x6nVar.equals(d6n.a)) {
                return n(y6n.d, new j1(2, no61Var, no61.class, "SetAutomix", "SetAutomix(Lcom/google/protobuf/BoolValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 26));
            }
            if (x6nVar.equals(n6n.a)) {
                return n(y6n.e, new j1(2, no61Var, no61.class, "SetNormalize", "SetNormalize(Lcom/google/protobuf/BoolValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 28));
            }
            if (x6nVar.equals(m6n.a)) {
                return q(y6n.f, new j1(2, no61Var, no61.class, "SetLoudnessEnvironment", "SetLoudnessEnvironment(Lcom/google/protobuf/Int32Value;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 29));
            }
            if (x6nVar.equals(e6n.a)) {
                return n(y6n.g, new z6n(2, no61Var, no61.class, "SetCrossfade", "SetCrossfade(Lcom/google/protobuf/BoolValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 0));
            }
            if (x6nVar.equals(f6n.a)) {
                return q(y6n.h, new z6n(2, no61Var, no61.class, "SetCrossfadeTimeSeconds", "SetCrossfadeTimeSeconds(Lcom/google/protobuf/Int32Value;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 1));
            }
            if (x6nVar.equals(s6n.a)) {
                return n(y6n.t, new z6n(2, no61Var, no61.class, "SetShowUnavailableTracks", "SetShowUnavailableTracks(Lcom/google/protobuf/BoolValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 2));
            }
            if (x6nVar.equals(w6n.a)) {
                return new gal(y6n.X, new cuk(new z6n(2, no61Var, no61.class, "SetWebgateUrl", "SetWebgateUrl(Lcom/google/protobuf/StringValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 3), (lnm) null, (byte) 20), (byte) 9);
            }
            if (x6nVar.equals(j6n.a)) {
                return q(y6n.Y, new z6n(2, no61Var, no61.class, "SetDownloadPreferredResourceType", "SetDownloadPreferredResourceType(Lcom/google/protobuf/Int32Value;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 4));
            }
            if (x6nVar.equals(t6n.a)) {
                return n(y6n.Z, new z6n(2, no61Var, no61.class, "SetDownmix", "SetDownmix(Lcom/google/protobuf/BoolValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 5));
            }
            if (x6nVar.equals(p6n.a)) {
                return n(y6n.N0, new z6n(2, no61Var, no61.class, "SetOtfn", "SetOtfn(Lcom/google/protobuf/BoolValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 6));
            }
            if (x6nVar.equals(g6n.a)) {
                return n(y6n.O0, new z6n(2, no61Var, no61.class, "SetCrossfeed", "SetCrossfeed(Lcom/google/protobuf/BoolValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 7));
            }
            if (x6nVar.equals(h6n.a)) {
                return q(y6n.P0, new z6n(2, no61Var, no61.class, "SetCrossfeedIntensity", "SetCrossfeedIntensity(Lcom/google/protobuf/Int32Value;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 9));
            }
            eg.o();
            return null;
        }

        public static final gal n(iu30 iu30Var, vu30 vu30Var) {
            return new gal(iu30Var, new oy3(vu30Var, (lnm) null, (byte) 4), (byte) 9);
        }

        public static final boolean o(waz0 waz0Var, String str, boolean z) {
            bbz0 bbz0VarA = waz0Var.a();
            if (!waz0Var.b(bbz0VarA, str)) {
                return false;
            }
            if (bbz0VarA.b == 1) {
                return true;
            }
            return !z;
        }

        public static final String p(hth1 hth1Var) {
            String str = hth1Var.e;
            if (str == null) {
                str = hth1Var.d;
            }
            if (str == null || ihc1.y0(str)) {
                return null;
            }
            return str;
        }

        public static final gal q(iu30 iu30Var, vu30 vu30Var) {
            return new gal(iu30Var, new cy9(vu30Var, (lnm) null, (byte) 4), (byte) 9);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x003d  */
        public static final tey0 r(hwq hwqVar, String str, String str2) {
            String str3;
            d811 d811Var = hwqVar.f;
            j7e0 j7e0Var = hwqVar.g;
            j7e0 j7e0Var2 = j7e0Var instanceof j7e0 ? j7e0Var : null;
            zuc0 zuc0Var = j7e0Var2 != null ? j7e0Var2.a : null;
            vhc1 vhc1VarU = i2p1.u(hwqVar);
            boolean z = zuc0Var != null && zuc0Var.e();
            boolean z2 = zuc0Var != null && zuc0Var.j;
            boolean z3 = d811Var.a;
            if (zuc0Var != null) {
                String strX = zxo1.x(zuc0Var);
                if (ihc1.y0(strX)) {
                    str3 = null;
                } else {
                    str3 = strX;
                }
            } else {
                str3 = null;
            }
            return s(vhc1VarU, str, z, z2, z3, str2, str3, d811Var.b, d811Var.c);
        }

        public static final tey0 s(vhc1 vhc1Var, String str, boolean z, boolean z2, boolean z3, String str2, String str3, int i, Map map) {
            if (!(vhc1Var instanceof thc1)) {
                return null;
            }
            boolean z4 = false;
            boolean z5 = i > 1;
            if (!z3 && !u890.j(map.get("owner_username"), str2)) {
                z4 = true;
            }
            if (z5) {
                thc1 thc1Var = (thc1) vhc1Var;
                x4i1 x4i1Var = thc1Var.b;
                if (x4i1Var == null) {
                    return null;
                }
                return new c1x0(thc1Var.d, x4i1Var, 2);
            }
            Set set = s4b1.f;
            thc1 thc1Var2 = (thc1) vhc1Var;
            String str4 = thc1Var2.d;
            int iOrdinal = uic.x(str4).c.ordinal();
            if (iOrdinal == 416) {
                if (z2) {
                    return new am1(8, thc1Var2.d, str3, str, false, true);
                }
                return null;
            }
            if (iOrdinal != 926 || thc1Var2.h) {
                return null;
            }
            if (z) {
                return new u3a(str4, str3, 8, str);
            }
            if (z4 && z2) {
                return new am1(8, thc1Var2.d, str3, str, false, true);
            }
            return null;
        }

        public static boolean t(l55 l55Var) {
            return l55Var.b();
        }

        public static final qim0 u(vu30 vu30Var) {
            return new i3e1(vu30Var);
        }

        public static final xuh1 v(tka0 tka0Var) {
            jd11 jd11Var = rc11.a;
            if (tka0Var.equals(jd11Var.b(zyk0.class)) || tka0Var.equals(jd11Var.b(q1l0.class))) {
                return vuh1.a;
            }
            if (tka0Var.equals(jd11Var.b(h2l0.class))) {
                return vuh1.f;
            }
            if (tka0Var.equals(jd11Var.b(q2l0.class)) || tka0Var.equals(jd11Var.b(t1l0.class))) {
                return vuh1.c;
            }
            return tka0Var.equals(jd11Var.b(uyk0.class)) ? vuh1.b : vuh1.i;
        }

        public static void w(int i, Object[] objArr) {
            for (int i2 = 0; i2 < i; i2++) {
                x(i2, objArr[i2]);
            }
        }

        public static void x(int i, Object obj) {
            if (obj != null) {
                return;
            }
            bhn0.i(gvg.l(new StringBuilder(String.valueOf(i).length() + 9), "at index ", i));
        }
    }
