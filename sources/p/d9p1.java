package p;

import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.view.MotionEvent;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class d9p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(fu1 fu1Var, xtb0 xtb0Var, Integer num, boolean z, vu30 vu30Var, bx1 bx1Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        j2i j2iVar2;
        Object jv1Var;
        m4c m4cVar;
        int i3;
        int i4;
        fu1 fu1Var2;
        tob1 tob1Var;
        m4c m4cVar2 = fkj0.X;
        long j = fu1Var.d;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2060431277);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(fu1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(xtb0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(num) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.e(250) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.h(z) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= b0kVar3.i(vu30Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= b0kVar3.i(bx1Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= b0kVar3.i(j2iVar) ? 8388608 : 4194304;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 4793491) != 4793490)) {
            Configuration configuration = (Configuration) b0kVar3.k(AndroidCompositionLocals_androidKt.a);
            wat watVar = (wat) b0kVar3.k(t4k.h);
            WeakHashMap weakHashMap = osl1.x;
            int i5 = lhc.g(b0kVar3).e.e().d;
            int iI0 = watVar.i0(13.0f);
            ven0 ven0VarS = v8r.s(fu1Var, b0kVar3);
            ven0 ven0VarS2 = v8r.s(bx1Var, b0kVar3);
            ven0 ven0VarS3 = v8r.s(vu30Var, b0kVar3);
            boolean zG = b0kVar3.g(configuration);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar2) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            tob1 tob1Var2 = (ven0) objT;
            Object[] objArr = {configuration, Long.valueOf(j), Boolean.valueOf(fu1Var.c), num};
            boolean zI = ((i2 & 896) == 256) | b0kVar3.i(fu1Var) | b0kVar3.g(tob1Var2) | b0kVar3.g(ven0VarS) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | b0kVar3.g(watVar) | b0kVar3.i(configuration) | b0kVar3.e(iI0) | b0kVar3.e(i5) | b0kVar3.g(ven0VarS3);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar2) {
                m4cVar = m4cVar2;
                i3 = i2;
                b0kVar2 = b0kVar3;
                i4 = 16384;
                fu1Var2 = fu1Var;
                jv1Var = new jv1(fu1Var2, num, tob1Var2, watVar, iI0, i5, ven0VarS, xtb0Var, configuration, ven0VarS3, null);
                tob1Var = tob1Var2;
                b0kVar2.s0(jv1Var);
            } else {
                fu1Var2 = fu1Var;
                m4cVar = m4cVar2;
                jv1Var = objT2;
                b0kVar2 = b0kVar3;
                i3 = i2;
                tob1Var = tob1Var2;
                i4 = 16384;
            }
            qxd0.u(objArr, (vu30) jv1Var, b0kVar2);
            Long lValueOf = Long.valueOf(j);
            Object value = tob1Var.getValue();
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI2 = b0kVar2.i(fu1Var2) | b0kVar2.g(tob1Var) | ((i3 & 57344) == i4) | b0kVar2.g((Object) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01d0: ARITH (r0v8 'zI2' boolean) = (wrap boolean:0x01ca: ARITH (wrap boolean:0x01c0: ARITH (wrap boolean:0x01b8: INVOKE (r15v4 'b0kVar2' p.b0k), (r1v17 'fu1Var2' p.fu1) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:441)) | (wrap boolean:0x01bc: INVOKE (r15v4 'b0kVar2' p.b0k), (r2v20 'tob1Var' p.tob1) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:445)) A[DONT_WRAP, WRAPPED] (LINE:449)) | (wrap boolean:?: TERNARY null = ((wrap int:0x01c4: ARITH (r16v8 'i3' int) & (57344 int) A[WRAPPED] (LINE:453)) == (r13v7 'i4' int)) ? true : false) A[DONT_WRAP, WRAPPED] (LINE:459)) | (wrap boolean:0x01cc: INVOKE (r15v4 'b0kVar2' p.b0k), (wrap java.lang.Object:?: CAST (java.lang.Object) (r23v0 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:461)) A[DECLARE_VAR] (LINE:465) in method: p.d9p1.a(p.fu1, p.xtb0, java.lang.Integer, boolean, p.vu30, p.bx1, p.j2i, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r23v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 542
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.d9p1.a(p.fu1, p.xtb0, java.lang.Integer, boolean, p.vu30, p.bx1, p.j2i, p.b0k, int):void");
        }

        public static final void b(qb81 qb81Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
            int i2;
            eb81 eb81Var = qb81Var.d;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(792911804);
            j06 j06Var = x340Var.a;
            if ((i & 6) == 0) {
                i2 = (x340Var.g(qb81Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(iu30Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var.i(qim0Var) ? 256 : 128;
            }
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), een.P0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
                nko1.H(mbhVarA, x340Var, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                int i3 = i2;
                uwo1.e(qb81Var.b, null, cbx.d(x340Var).j, cbx.a(x340Var).b.c, null, null, 0, false, new cjc0(1), 0, null, x340Var, 0, 0, 1778);
                qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                jw31 jw31VarA = ew31.a(h36.g, een.O0, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                String str = qb81Var.c;
                lee1 lee1Var = cbx.d(x340Var).d;
                long j = cbx.a(x340Var).b.a;
                cjc0 cjc0Var = new cjc0(2);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                vq60 vq60Var = xl3.b;
                uwo1.e(str, wnb0Var.then(new vul1(vq60Var)), lee1Var, j, null, null, 0, false, cjc0Var, 0, null, x340Var, 0, 0, 1776);
                x340Var = x340Var;
                if (eb81Var != null) {
                    x340Var.i0(376846594);
                    String str2 = eb81Var.a;
                    boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
                    Object objT = x340Var.T();
                    if (z2 || objT == fkj0.X) {
                        objT = new z77(iu30Var, qb81Var, (byte) 26);
                        x340Var.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    if (ihc1.y0(str2)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    gbx gbxVar = new gbx(new y50(str2), function0);
                    cua cuaVar = cbx.b(x340Var).f;
                    zzq0 zzq0VarJ = uyn1.j(6.0f, 0.0f, 0.0f, 0.0f, 14);
                    vul1 vul1Var = new vul1(vq60Var);
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    cwl1.b(uyn1.B(vul1Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), (tl3) null, (hw61) null, (pgx) null, zzq0VarJ, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(2011846184, new gaa(qb81Var, (byte) 2), x340Var), x340Var, 0, 48, 1518);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    x340Var.i0(377694444);
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xx(qb81Var, iu30Var, qim0Var, i, (byte) 28);
            }
        }

        public static final void c(int i, String str, b0k b0kVar, qim0 qim0Var) {
            int i2;
            x340 x340Var;
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.k0(-97181603);
            if ((i & 6) == 0) {
                i2 = i | (x340Var2.g(str) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var2.i(qim0Var) ? 32 : 16;
            }
            int i3 = i2;
            if (x340Var2.Y(i3 & 1, (i3 & 19) != 18)) {
                qim0 qim0VarZ = u291.z(qim0Var, (fra) null, 1);
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
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
                nko1.H(jw31VarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var2).g;
                nim0 nim0Var = nim0.a;
                w0h1.a(wsx.c, isl.a, u291.r(nim0Var, 12.0f), 0L, 0L, false, x340Var2, wsx.d | 48, 56);
                cvx cvxVar = cbx.b(x340Var2).b;
                uwo1.e(str, null, ktd.l(nim0Var, 2.0f, x340Var2, x340Var2).o, cbx.a(x340Var2).b.a, null, null, 0, false, new cjc0(1), 0, null, x340Var2, i3 & 14, 0, 1778);
                x340Var = x340Var2;
                x340Var.r(true);
            } else {
                x340Var = x340Var2;
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new gy0(str, qim0Var, i, (byte) 5);
            }
        }

        public static final void d(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
            String str3;
            int i2;
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1303749633);
            if ((i & 6) == 0) {
                str3 = str;
                i2 = i | (x340Var.g(str3) ? 4 : 2);
            } else {
                str3 = str;
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.g(str2) ? 32 : 16;
            }
            int i3 = i2 | 384;
            if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                mbh mbhVarA = jbh.a(new d36(2.0f, false, new g21(een.Z, (byte) 28)), een.P0, x340Var, 0);
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
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                uwo1.e(str3, null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, new a0e1(5), null, 2, false, new cjc0(2), 0, null, x340Var, i3 & 14, 0, 1698);
                uwo1.e(str2, null, cbx.d(x340Var).m, cbx.a(x340Var).b.b, new a0e1(5), null, 2, false, new cjc0(2), 0, null, x340Var, (i3 >> 3) & 14, 0, 1698);
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new a4f(str, str2, qim0Var2, i, (byte) 1);
            }
        }

        public static final void e(String str, String str2, String str3, Function0 function0, qim0 qim0Var, float f, j2i j2iVar, b0k b0kVar, int i, int i2) {
            int i3;
            float f2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1666046886);
            if ((i & 6) == 0) {
                i3 = (x340Var.g(str) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= x340Var.g(str2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= x340Var.g(str3) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= x340Var.i(function0) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= x340Var.i(qim0Var) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    f2 = f;
                    int i4 = x340Var.d(f2) ? 131072 : 65536;
                    i3 |= i4;
                } else {
                    f2 = f;
                }
                i3 |= i4;
            } else {
                f2 = f;
            }
            if ((1572864 & i) == 0) {
                i3 |= x340Var.i(j2iVar) ? 1048576 : 524288;
            }
            if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
                x340Var.d0();
                if ((i & 1) != 0 && !x340Var.E()) {
                    x340Var.b0();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                } else if ((i2 & 32) != 0) {
                    uwr uwrVar = cbx.a;
                    cua cuaVar = cbx.b(x340Var).f;
                    i3 &= -458753;
                    f2 = 4.0f;
                }
                x340Var.s();
                qim0 qim0VarH = sgc1.H(1, qim0Var);
                jtr jtrVar = jtr.e;
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = ktd.n(x340Var);
                }
                int i5 = i3;
                qim0 qim0VarV = bin.v(qim0VarH, (idn0) objT, jtrVar, false, null, null, function0, 28);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarV);
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
                mod.b(t4k.h.a(new xat(2.0f, 1.0f)), apo.r(2123745756, new gf(f2, str3, j2iVar), x340Var), x340Var, 56);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0.a, 8.0f));
                d(i5 & 126, str, str2, x340Var, null);
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new msh(str, str2, str3, function0, qim0Var, f2, j2iVar, i, i2);
            }
        }

        public static final void f(int i, String str, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
            j2i j2iVar2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1114882176);
            j06 j06Var = x340Var.a;
            int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16);
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                gra graVar = een.d;
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
                nim0 nim0Var = nim0.a;
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                eso1.e(Uri.parse(str), isl.a, i1p1.q(qim0VarD, er31.b(2.0f)), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, true, false, x340Var, 199728, 6, 2960);
                qim0 qim0VarB = h2c.a.b(nim0Var);
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarX = uyn1.x(qim0VarB, 8.0f);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
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
                j2iVar2 = j2iVar;
                k4s0.i(6, j2iVar2, x340Var, true, true);
            } else {
                j2iVar2 = j2iVar;
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new z6a(str, qim0Var, j2iVar2, i, (byte) 1);
            }
        }

        public static final void g(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, adj1 adj1Var) {
            int i2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(73409604);
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? x340Var.g(adj1Var) : x340Var.i(adj1Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(iu30Var) ? 32 : 16;
            }
            int i3 = i2 | 384;
            if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                gfx.b(18, apo.r(2068417583, new tth(adj1Var, iu30Var), x340Var), x340Var, 54);
                qim0Var = nim0.a;
            } else {
                x340Var.b0();
            }
            qim0 qim0Var2 = qim0Var;
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ze10(adj1Var, iu30Var, qim0Var2, i, (byte) 8);
            }
        }

        public static final void h(int i, int i2, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1009809811);
            int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.d(16.0f) ? 32 : 16) | (x340Var.d(16.0f) ? 256 : 128) | (x340Var.g(qim0Var) ? 2048 : 1024);
            if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
                boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 14) == 4);
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    objT = new fm80(i);
                    x340Var.s0(objT);
                }
                gfh0 gfh0Var = (gfh0) objT;
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
                nko1.H(gfh0Var, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                dv20.l(6, j2iVar, x340Var, true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new z3f(i, qim0Var, j2iVar, i2);
            }
        }

        public static final void i(o0i o0iVar, xtb0 xtb0Var, c380 c380Var, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, b0k b0kVar, int i) {
            int i2;
            b0k b0kVar2 = (x340) b0kVar;
            b0kVar2.k0(773019508);
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? b0kVar2.g(o0iVar) : b0kVar2.i(o0iVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= b0kVar2.g(xtb0Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= (i & 512) == 0 ? b0kVar2.g(c380Var) : b0kVar2.i(c380Var) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= b0kVar2.i(iu30Var) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i2 |= b0kVar2.i(iu30Var2) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i2 |= b0kVar2.i(iu30Var3) ? 131072 : 65536;
            }
            int i3 = i2;
            if (b0kVar2.Y(i3 & 1, (74899 & i3) != 74898)) {
                int i4 = (i3 & 14) | 8 | (i3 & 112) | (i3 & 896);
                j(o0iVar, xtb0Var, c380Var, iu30Var, iu30Var2, b0kVar2, (i3 & 7168) | i4 | (57344 & i3));
                b0kVar2 = b0kVar2;
                k(o0iVar, xtb0Var, c380Var, iu30Var3, b0kVar2, i4 | ((i3 >> 6) & 7168));
            } else {
                b0kVar2.b0();
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new kqf0(o0iVar, xtb0Var, c380Var, iu30Var, iu30Var2, iu30Var3, i, (byte) 8);
            }
        }

        public static final void j(o0i o0iVar, xtb0 xtb0Var, c380 c380Var, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
            int i2;
            c380 c380Var2 = c380Var;
            Object obj = fkj0.X;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1101101703);
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.g(xtb0Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= (i & 512) == 0 ? x340Var.g(c380Var2) : x340Var.i(c380Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i2 |= x340Var.i(iu30Var2) ? 16384 : 8192;
            }
            int i3 = i2;
            if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
                ven0 ven0VarS = v8r.s(iu30Var, x340Var);
                ven0 ven0VarS2 = v8r.s(iu30Var2, x340Var);
                int i4 = i3 & 896;
                boolean z = i4 == 256 || ((i3 & 512) != 0 && x340Var.g(c380Var2));
                Object objT = x340Var.T();
                if (z || objT == obj) {
                    objT = new LinkedHashSet();
                    x340Var.s0(objT);
                }
                Set set = (Set) objT;
                boolean zG = ((i3 & 112) == 32) | (i4 == 256 || ((i3 & 512) != 0 && x340Var.i(c380Var2))) | x340Var.g(set) | x340Var.g(ven0VarS2) | x340Var.g(ven0VarS) | ((57344 & i3) == 16384);
                Object objT2 = x340Var.T();
                if (zG || objT2 == obj) {
                    j96 j96Var = new j96(xtb0Var, set, c380Var2, ven0VarS2, ven0VarS, iu30Var2);
                    c380Var2 = c380Var2;
                    x340Var.s0(j96Var);
                    objT2 = j96Var;
                }
                oto1.c(c380Var2, o0iVar, (iu30) objT2, x340Var, ((i3 >> 6) & 14) | 64 | ((i3 << 3) & 112));
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new lqf0(o0iVar, xtb0Var, c380Var2, iu30Var, iu30Var2, i);
            }
        }

        public static final void k(o0i o0iVar, xtb0 xtb0Var, c380 c380Var, iu30 iu30Var, b0k b0kVar, int i) {
            int i2;
            xtb0 xtb0Var2;
            c380 c380Var2 = c380Var;
            Object obj = fkj0.X;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-923568474);
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                xtb0Var2 = xtb0Var;
                i2 |= x340Var.g(xtb0Var2) ? 32 : 16;
            } else {
                xtb0Var2 = xtb0Var;
            }
            if ((i & 384) == 0) {
                i2 |= (i & 512) == 0 ? x340Var.g(c380Var2) : x340Var.i(c380Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
            }
            int i3 = i2;
            boolean z = false;
            if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
                ven0 ven0VarS = v8r.s(iu30Var, x340Var);
                int i4 = i3 & 896;
                boolean z2 = i4 == 256 || ((i3 & 512) != 0 && x340Var.g(c380Var2));
                Object objT = x340Var.T();
                if (z2 || objT == obj) {
                    objT = new LinkedHashSet();
                    x340Var.s0(objT);
                }
                Set set = (Set) objT;
                boolean z3 = (i3 & 112) == 32;
                if (i4 == 256 || ((i3 & 512) != 0 && x340Var.i(c380Var2))) {
                    z = true;
                }
                boolean zG = z3 | z | x340Var.g(set) | x340Var.g(ven0VarS);
                Object objT2 = x340Var.T();
                if (zG || objT2 == obj) {
                    ntf0 ntf0Var = new ntf0(xtb0Var2, set, c380Var2, ven0VarS, (byte) 19);
                    c380Var2 = c380Var2;
                    x340Var.s0(ntf0Var);
                    objT2 = ntf0Var;
                }
                oto1.c(c380Var2, o0iVar, (iu30) objT2, x340Var, ((i3 >> 6) & 14) | 64 | ((i3 << 3) & 112));
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new etg0(o0iVar, xtb0Var, c380Var2, iu30Var, i, (byte) 18);
            }
        }

        public static final void l(qim0 qim0Var, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(853241883);
            int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                long jB = u7h.b(u7h.f, 0.4f, 0.0f, 0.0f, 0.0f, 14);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                t1c.a(dug.f(qim0Var, jB, er31.b(4.0f)), x340Var, 0);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new b5(qim0Var, i, (byte) 24);
            }
        }

        public static final void m(kg0 kg0Var, b0k b0kVar, int i) {
            b0k b0kVar2;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-454779852);
            int i2 = (b0kVar3.i(kg0Var) ? 4 : 2) | i;
            byte b2 = 1;
            if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
                j2i j2iVar = whj.a;
                j2i j2iVarR = apo.r(2035622509, new vj81(kg0Var, b2), b0kVar3);
                long j = u7h.j;
                uwr uwrVar = cbx.a;
                b0kVar2 = b0kVar3;
                ti5.a(j2iVar, (qim0) null, j2iVarR, (xu30) null, 0.0f, (erl1) null, kkn.C(j, ((xex) ((gmt) zex.a.c).b).z, cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.a, b0kVar2, 32), b0kVar2, 390, 186);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vj81(kg0Var, i);
            }
        }

        public static ksk0 n() {
            return new ksk0((byte) 13);
        }

        public static final long o(String str, b0k b0kVar, int i) {
            u7h m231Var;
            uwr uwrVar = cbx.a;
            long j = cbx.a(b0kVar).b.a;
            boolean z = (((i & 14) ^ 6) > 4 && ((x340) b0kVar).g(str)) || (i & 6) == 4;
            x340 x340Var = (x340) b0kVar;
            u7h u7hVarT = x340Var.T();
            if (z || u7hVarT == fkj0.X) {
                try {
                    m231Var = new u7h(z4p1.e(Color.parseColor(str)));
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                u7h u7hVar = new u7h(j);
                if (m231Var instanceof m231) {
                    m231Var = u7hVar;
                }
                u7hVarT = m231Var;
                x340Var.s0(u7hVarT);
            }
            return ((u7h) u7hVarT).a;
        }

        public static final Function0 p(Function0 function0, b0k b0kVar, int i) {
            ven0 ven0VarS = v8r.s(function0, b0kVar);
            x340 x340Var = (x340) b0kVar;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = p3d1.m(-1L, x340Var);
            }
            frr0 frr0Var = (frr0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new x0e1(frr0Var, ven0VarS, (byte) 5);
                x340Var.s0(objT2);
            }
            return (Function0) objT2;
        }

        public static final void q(bav0 bav0Var, long j, iu30 iu30Var, boolean z) {
            MotionEvent motionEventA = bav0Var.a();
            if (motionEventA == null) {
                hhg1.n("The PointerEvent receiver cannot have a null MotionEvent.");
                return;
            }
            int action = motionEventA.getAction();
            if (z) {
                motionEventA.setAction(3);
            }
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            motionEventA.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            iu30Var.invoke(motionEventA);
            motionEventA.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
            motionEventA.setAction(action);
        }

        public static final ArrayList r(ArrayList arrayList) {
            int i;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                k581 k581Var = (k581) it.next();
                int iC = l1d.C(k581Var.e);
                int i2 = 1;
                j681 j681Var = null;
                if (iC == 0) {
                    i = i2;
                } else if (iC != 1) {
                    i2 = 2;
                    if (iC != 2) {
                        if (iC != 3) {
                            eg.o();
                            return null;
                        }
                        i2 = 0;
                    }
                    i = i2;
                } else {
                    i = 3;
                }
                if (i != 0) {
                    String str = k581Var.a;
                    String str2 = k581Var.b;
                    String str3 = k581Var.c;
                    String str4 = k581Var.d;
                    j681Var = new j681(i, str, str2, str3, (str4 == null || ihc1.y0(str4)) ? null : str4);
                }
                if (j681Var != null) {
                    arrayList2.add(j681Var);
                }
            }
            return arrayList2;
        }

        public static final xbk1 s(tka0 tka0Var, sck1 sck1Var, eck1 eck1Var, esn esnVar, b0k b0kVar) {
            if (eck1Var == null) {
                eck1Var = sck1Var instanceof ot50 ? ((ot50) sck1Var).N() : gzs.b;
            }
            hce1 hce1Var = new hce1(sck1Var.o(), eck1Var, esnVar);
            String strO = tka0Var.o();
            if (strO != null) {
                return hce1Var.t("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strO), tka0Var);
            }
            hhg1.n("Local and anonymous classes can not be ViewModels");
            return null;
        }

        public static final List t(xtb0 xtb0Var) {
            int i = xtb0Var.h().m;
            int iG = ((int) (xtb0Var.h().g() >> 32)) + i;
            return z561.k0(new sgg1(pzo0.W0, z561.T(new mun((byte) 5, iG, i), new i46(xtb0Var.h().l, (byte) 1))));
        }

        public static final Set u(nh21 nh21Var, List list) {
            return Collections.singleton(new qg21(nh21Var.a, nh21Var.c, o7h.N0(list, Collections.singletonList(new og21(nh21Var.f, nh21Var.e, nh21Var.g)))));
        }
    }
