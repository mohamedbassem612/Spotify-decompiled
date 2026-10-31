package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class n9p1 {
    public static b180 a;
    public static b180 b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v36 */
    public static final void a(fu1 fu1Var, dx1 dx1Var, ow1 ow1Var, Function0 function0, iu30 iu30Var, j2i j2iVar, qim0 qim0Var, boolean z, Integer num, b0k b0kVar, int i) {
        fu1 fu1Var2;
        iu30 iu30Var2;
        ow1 ow1Var2;
        x340 x340Var;
        Object obj;
        m4c m4cVar;
        int i2;
        fu1 fu1Var3;
        dx1 dx1Var2;
        Object obj2;
        ?? r15;
        boolean z2;
        Object obj3;
        fo1 fo1Var = fu1Var.b;
        c380 c380Var = fu1Var.l;
        c380 c380Var2 = fu1Var.k;
        ju1 ju1Var = dx1Var.b;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-994895800);
        int i3 = i | (x340Var2.i(fu1Var) ? 4 : 2) | (x340Var2.g(dx1Var) ? 32 : 16) | (x340Var2.g(ow1Var) ? 256 : 128) | (x340Var2.i(function0) ? 2048 : 1024) | (x340Var2.i(iu30Var) ? 16384 : 8192) | (x340Var2.g(qim0Var) ? 1048576 : 524288) | (x340Var2.h(z) ? 8388608 : 4194304) | (x340Var2.g(num) ? 67108864 : 33554432);
        if (x340Var2.Y(i3 & 1, (i3 & 38347923) != 38347922)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var2, 3);
            y7e1 y7e1VarD = c4p1.D(0, 2, fu1Var.a, x340Var2);
            Object[] objArr = new Object[0];
            Object objT = x340Var2.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                obj = objT;
                ou1 ou1Var = ou1.e;
                x340Var2.s0(ou1Var);
                obj = ou1Var;
            }
            obj = objT;
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) obj, x340Var2, 48);
            Object[] objArr2 = new Object[0];
            Object objT2 = x340Var2.T();
            Object obj4 = objT2;
            if (objT2 == m4cVar2) {
                ou1 ou1Var2 = ou1.d;
                x340Var2.s0(ou1Var2);
                obj4 = ou1Var2;
            }
            ven0 ven0Var2 = (ven0) k5p1.s(objArr2, (Function0) obj4, x340Var2, 48);
            rt1 rt1VarL = x8p1.l(x340Var2);
            Boolean boolValueOf = Boolean.valueOf(fu1Var.f());
            int i4 = i3 & 57344;
            int i5 = i3 & 896;
            boolean zI = x340Var2.i(fu1Var) | x340Var2.g(rt1VarL) | ((i3 & 112) == 32) | (i4 == 16384) | (i5 == 256);
            Object objT3 = x340Var2.T();
            if (zI || objT3 == m4cVar2) {
                m4cVar = m4cVar2;
                i2 = i5;
                ur1 ur1Var = new ur1((byte) 1, fu1Var, rt1VarL, dx1Var, iu30Var, ow1Var, (lnm) null);
                fu1Var3 = fu1Var;
                dx1Var2 = dx1Var;
                x340Var2.s0(ur1Var);
                obj2 = ur1Var;
            } else {
                dx1Var2 = dx1Var;
                i2 = i5;
                m4cVar = m4cVar2;
                fu1Var3 = fu1Var;
                obj2 = objT3;
            }
            qxd0.s(boolValueOf, rt1VarL, (vu30) obj2, x340Var2);
            Object value = ven0Var2.getValue();
            boolean zG = x340Var2.g(ven0Var2);
            Object objT4 = x340Var2.T();
            if (zG || objT4 == m4cVar) {
                objT4 = new xj0(ven0Var2, (byte) 9);
                x340Var2.s0(objT4);
            }
            int i6 = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0185: ARITH (r9v6 'i6' int) = (r24v0 int) >> (9 int) A[DECLARE_VAR] (LINE:390) in method: p.n9p1.a(p.fu1, p.dx1, p.ow1, kotlin.jvm.functions.Function0, p.iu30, p.j2i, p.qim0, boolean, java.lang.Integer, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r24v0 int
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1147
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.n9p1.a(p.fu1, p.dx1, p.ow1, kotlin.jvm.functions.Function0, p.iu30, p.j2i, p.qim0, boolean, java.lang.Integer, p.b0k, int):void");
        }

        public static final void b(e5h e5hVar, y0q0 y0q0Var, d0r d0rVar, Function0 function0, me30 me30Var, qim0 qim0Var, b0k b0kVar, int i) {
            int i2;
            y0q0 y0q0Var2;
            Function0 function1;
            qim0 qim0Var2;
            int i3;
            String str = e5hVar.a;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1205832943);
            if ((i & 6) == 0) {
                i2 = (x340Var.i(e5hVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                y0q0Var2 = y0q0Var;
                i2 |= x340Var.i(y0q0Var2) ? 32 : 16;
            } else {
                y0q0Var2 = y0q0Var;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var.i(d0rVar) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                function1 = function0;
                i2 |= x340Var.i(function1) ? 2048 : 1024;
            } else {
                function1 = function0;
            }
            if ((i & 24576) == 0) {
                i2 |= x340Var.i(me30Var) ? 16384 : 8192;
            }
            int i4 = i2 | 196608;
            if (x340Var.Y(i4 & 1, (74899 & i4) != 74898)) {
                cr31 cr31VarB = er31.b(dsa0.m(x340Var, 2131166074));
                boolean zG = x340Var.g(str) | x340Var.g(d0rVar);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new j5h(d0rVar, str, me30Var);
                    x340Var.s0(objT);
                }
                j5h j5hVar = (j5h) objT;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                fra fraVar = een.N0;
                cvx cvxVar2 = cbx.b(x340Var).b;
                d36 d36Var = new d36(8.0f, true, new um5(false));
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarQ = i1p1.q(u291.f(qim0Var3, 1.0f), cr31VarB);
                avw0 avw0Var = cbx.b(x340Var).c;
                qim0 qim0VarN = anm1.N("collection_preview_card", uyn1.x(bin.x(dug.f(d1u.E(1.0f, cbx.a(x340Var).a.b.a(), qim0VarQ, cr31VarB), u7h.j, cr31VarB), false, null, null, null, function1, 15), 12.0f));
                jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
                String str2 = e5hVar.a;
                int iC = l1d.C(e5hVar.b);
                if (iC == 0) {
                    i3 = 2;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return;
                    }
                    i3 = 1;
                }
                otw.c(j5hVar, new h5h(str2, i3, e5hVar.e, y0q0Var2, false, false, 64), new wnb0(1.0f, true), (ipb1) null, x340Var, 0, 8);
                plx plxVar = plx.c;
                zov0 zov0Var = cbx.b(x340Var).g;
                w0h1.a(plxVar, isl.a, anm1.N("collection_preview_action_open", u291.r(qim0Var3, 16.0f)), cbx.a(x340Var).b.b, 0L, false, x340Var, plx.d | 48, 48);
                x340Var = x340Var;
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new wc0(e5hVar, y0q0Var, d0rVar, function0, me30Var, qim0Var2, i, (byte) 11);
            }
        }

        public static final void c(iu30 iu30Var, yxa0 yxa0Var, qim0 qim0Var, b0k b0kVar, int i) {
            qim0 qim0Var2 = qim0Var;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-670497792);
            int i2 = i | (x340Var.i(iu30Var) ? 4 : 2) | (x340Var.i(yxa0Var) ? 32 : 16) | (x340Var.i(qim0Var2) ? 256 : 128);
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                ven0 ven0VarS = v8r.s(iu30Var, x340Var);
                String strO0 = cwl1.o0(x340Var, 2131957084);
                String strN0 = cwl1.n0(2131957083, new Object[]{strO0}, x340Var);
                String strO1 = cwl1.o0(x340Var, 2131957082);
                String strN1 = cwl1.n0(2131957081, new Object[]{strO1}, x340Var);
                uwr uwrVar = cbx.a;
                FontFamily fontFamily = cbx.d(x340Var).k.a.f;
                long jQ = f0o1.q(yxa0Var, x340Var);
                boolean zG = x340Var.g(strN0) | x340Var.g(strN1) | x340Var.g(fontFamily) | x340Var.f(jQ);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    String strSubstring = strN0.substring(0, ihc1.w0(strN0, strO0, 0, false, 6));
                    String strSubstring2 = strN0.substring(strO0.length() + strSubstring.length(), strN0.length());
                    String strSubstring3 = strN1.substring(0, ihc1.w0(strN1, strO1, 0, false, 6));
                    String strSubstring4 = strN1.substring(strO1.length() + strSubstring3.length(), strN1.length());
                    zma1 zma1Var = new zma1(jQ, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61406);
                    ye5 ye5Var = new ye5();
                    ye5Var.g(strSubstring);
                    vhg.c(ye5Var, strO0, strO0, zma1Var, new i030(ven0VarS, (byte) 1));
                    ye5Var.g(strSubstring2);
                    ye5Var.g(" ");
                    ye5Var.g(strSubstring3);
                    vhg.c(ye5Var, strO1, strO1, zma1Var, new i030(ven0VarS, (byte) 2));
                    ye5Var.g(strSubstring4);
                    objT = ye5Var.p();
                    x340Var.s0(objT);
                }
                qim0Var2 = qim0Var;
                uwo1.d((af5) objT, cbx.a(x340Var).b.b, qim0Var2, cbx.d(x340Var).j, null, null, 0, false, null, 0, null, null, x340Var, i2 & 896, 0, 4080);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xx00(iu30Var, yxa0Var, qim0Var2, i);
            }
        }

        public static final void d(tu1 tu1Var, bx1 bx1Var, b0k b0kVar, int i) {
            int i2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1445821285);
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? x340Var.g(tu1Var) : x340Var.i(tu1Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(bx1Var) ? 32 : 16;
            }
            boolean z = false;
            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                boolean z2 = (i2 & 112) == 32;
                if ((i2 & 14) == 4 || ((i2 & 8) != 0 && x340Var.i(tu1Var))) {
                    z = true;
                }
                boolean z3 = z2 | z;
                Object objT = x340Var.T();
                if (z3 || objT == fkj0.X) {
                    objT = new k2(bx1Var, tu1Var, null, (byte) 11);
                    x340Var.s0(objT);
                }
                qxd0.t(tu1Var, x340Var, (vu30) objT);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new g90(tu1Var, bx1Var, i, (byte) 5);
            }
        }

        public static final void e(ksw kswVar, iu30 iu30Var, b0k b0kVar, int i) {
            int i2;
            Object obj;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(571070345);
            if ((i & 6) == 0) {
                i2 = (x340Var.g(kswVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(iu30Var) ? 32 : 16;
            }
            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    obj = objT;
                    akk1 akk1Var = new akk1(kswVar.a, iu30Var);
                    akk1Var.b = true;
                    x340Var.s0(akk1Var);
                    obj = akk1Var;
                }
                obj = objT;
                akk1 akk1Var2 = (akk1) obj;
                boolean zI = x340Var.i(akk1Var2);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new y3o0(akk1Var2, (byte) 28);
                    x340Var.s0(objT2);
                }
                qxd0.i(akk1Var2, (iu30) objT2, x340Var);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new sj0(kswVar, iu30Var, i, (byte) 1);
            }
        }

        public static final void f(ck21 ck21Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
            x340 x340Var;
            qim0 qim0Var2;
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.k0(-1092391838);
            j06 j06Var = x340Var2.a;
            int i2 = i | (x340Var2.g(ck21Var) ? 4 : 2) | (x340Var2.i(function0) ? 32 : 16) | (x340Var2.i(function1) ? 256 : 128) | 3072;
            if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
                era eraVar = een.Q0;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                d36 d36Var = new d36(8.0f, true, new um5(false));
                long j = cbx.a(x340Var2).a.c;
                cua cuaVar = cbx.b(x340Var2).f;
                cr31 cr31VarB = er31.b(8.0f);
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarX = uyn1.x(dug.f(qim0Var3, j, cr31VarB), cbx.b(x340Var2).e.c);
                mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
                nko1.H(mbhVarA, x340Var2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar3);
                nko1.F(x340Var2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                cvx cvxVar2 = cbx.b(x340Var2).b;
                d36 d36Var2 = new d36(8.0f, true, new um5(false));
                qim0 qim0VarH = l6o1.H(u291.f(qim0Var3, 1.0f), l6o1.C(0, 0, 1, x340Var2), false, 14);
                mbh mbhVarA2 = jbh.a(d36Var2, eraVar, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarH);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                uwo1.e(ck21Var.a, u291.f(qim0Var3, 1.0f), cbx.d(x340Var2).e, cbx.a(x340Var2).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2016);
                uwo1.e(ck21Var.b, u291.f(qim0Var3, 1.0f), cbx.d(x340Var2).j, cbx.a(x340Var2).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2016);
                x340Var2.r(true);
                cvx cvxVar3 = cbx.b(x340Var2).b;
                op71.g(x340Var2, u291.h(qim0Var3, 8.0f));
                idx idxVar = new idx(4);
                z50 z50Var = z50.c;
                foo1.c(new gbx(z50Var, function0), idxVar, null, null, null, null, null, null, null, null, apo.r(-1440333299, new bk21(ck21Var, (byte) 0), x340Var2), x340Var2, 0, 48, 2044);
                foo1.c(new gbx(z50Var, function1), ldx.c, null, null, null, null, null, null, null, null, apo.r(-594345674, new bk21(ck21Var, (byte) 1), x340Var2), x340Var2, 0, 48, 2044);
                x340Var = x340Var2;
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new pby0(i, ck21Var, function0, function1, qim0Var2, (byte) 16);
            }
        }

        public static final void g(int i, int i2, int i3, int i4, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, qim0 qim0Var, b0k b0kVar, int i5) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-57210807);
            int i6 = i5 | (x340Var.e(i) ? 4 : 2) | (x340Var.e(i2) ? 32 : 16) | (x340Var.e(i3) ? 256 : 128) | (x340Var.e(i4) ? 2048 : 1024) | (x340Var.g(qim0Var) ? 8388608 : 4194304);
            if (x340Var.Y(i6 & 1, (4793491 & i6) != 4793490)) {
                boolean z = ((i6 & 14) == 4) | ((i6 & 112) == 32) | ((i6 & 896) == 256) | ((i6 & 7168) == 2048);
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    wla wlaVar = new wla(j2iVar, j2iVar3, i, i2, i3, j2iVar2, i4);
                    x340Var.s0(wlaVar);
                    objT = wlaVar;
                }
                ejo1.l((i6 >> 21) & 14, 0, x340Var, (vu30) objT, qim0Var);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xla(i, i2, i3, i4, j2iVar, j2iVar2, j2iVar3, qim0Var, i5);
            }
        }

        public static final void h(b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1319274302);
            if (x340Var.Y(i & 1, i != 0)) {
                suo1.e(2, null, 2, aij.a, x340Var, 3462, 2);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new fk01(i, (byte) 23);
            }
        }

        public static final void i(int i, List list, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
            j2i j2iVar2;
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-589496097);
            j06 j06Var = x340Var.a;
            int i2 = (x340Var.i(list) ? 4 : 2) | i | 48;
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
                nko1.H(jw31VarA, x340Var, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                llj lljVar4 = y580.Y;
                wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE, lljVar4, 1.0f, false);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, wnb0VarQ);
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
                j2iVar2 = j2iVar;
                dv20.l(6, j2iVar2, x340Var, true);
                if (list.contains(k4d1.a)) {
                    x340Var.i0(-765561911);
                    h(x340Var, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-765533081);
                    x340Var.r(false);
                }
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                j2iVar2 = j2iVar;
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new deo0(list, qim0Var2, j2iVar2, i, (byte) 2);
            }
        }

        public static final void j(jlw0 jlw0Var, float f, String str, String str2, int i, qim0 qim0Var, int i2, b0k b0kVar, int i3, int i4) {
            int i5;
            int i6;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(479481091);
            if ((i3 & 6) == 0) {
                i5 = (x340Var.g(jlw0Var) ? 4 : 2) | i3;
            } else {
                i5 = i3;
            }
            if ((i3 & 48) == 0) {
                i5 |= x340Var.d(f) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                i5 |= x340Var.g(str) ? 256 : 128;
            }
            if ((i3 & 3072) == 0) {
                i5 |= x340Var.g(str2) ? 2048 : 1024;
            }
            if ((i3 & 24576) == 0) {
                i5 |= x340Var.e(l1d.C(i)) ? 16384 : 8192;
            }
            if ((196608 & i3) == 0) {
                i5 |= x340Var.g(qim0Var) ? 131072 : 65536;
            }
            int i7 = i4 & 64;
            int i8 = 1572864;
            if (i7 != 0) {
                i5 |= i8;
            } else if ((1572864 & i3) == 0) {
                i8 = x340Var.e(i2 == 0 ? -1 : l1d.C(i2)) ? 1048576 : 524288;
                i5 |= i8;
            }
            if (x340Var.Y(i5 & 1, (599187 & i5) != 599186)) {
                int i9 = i7 != 0 ? 1 : i2;
                if (i9 == 2) {
                    x340Var.i0(-839744805);
                    int i10 = i9;
                    i9 = i10;
                    w2g0.c(qim0Var, (tl3) null, apo.r(-360126350, new w1(f, jlw0Var, str, str2, i, i10), x340Var), x340Var, ((i5 >> 15) & 14) | 3072, 6);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-839388894);
                    k(jlw0Var, f, str, str2, i, i9, qim0Var, x340Var, (65534 & i5) | ((i5 >> 3) & 458752) | ((i5 << 3) & 3670016));
                    x340Var.r(false);
                }
                i6 = i9;
            } else {
                x340Var.b0();
                i6 = i2;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vhe1(jlw0Var, f, str, str2, i, qim0Var, i6, i3, i4);
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public static final void k(jlw0 jlw0Var, float f, String str, String str2, int i, int i2, qim0 qim0Var, b0k b0kVar, int i3) throws NoWhenBranchMatchedException {
            int i4;
            qim0 qim0VarK;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1012931253);
            if ((i3 & 6) == 0) {
                i4 = (x340Var.g(jlw0Var) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & 48) == 0) {
                i4 |= x340Var.d(f) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                i4 |= x340Var.g(str) ? 256 : 128;
            }
            if ((i3 & 3072) == 0) {
                i4 |= x340Var.g(str2) ? 2048 : 1024;
            }
            if ((i3 & 24576) == 0) {
                i4 |= x340Var.e(l1d.C(i)) ? 16384 : 8192;
            }
            if ((196608 & i3) == 0) {
                i4 |= x340Var.e(l1d.C(i2)) ? 131072 : 65536;
            }
            if ((1572864 & i3) == 0) {
                i4 |= x340Var.g(qim0Var) ? 1048576 : 524288;
            }
            if (x340Var.Y(i4 & 1, (599187 & i4) != 599186)) {
                float f2 = 8.0f;
                if (i2 == 2) {
                    x340Var.i0(-204961941);
                    uwr uwrVar = cbx.a;
                    cua cuaVar = cbx.b(x340Var).f;
                    f2 = zjy.j(8.0f, new p3v(8.0f)).a;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-204890920);
                    uwr uwrVar2 = cbx.a;
                    cua cuaVar2 = cbx.b(x340Var).f;
                    x340Var.r(false);
                }
                float f3 = 12.0f;
                if (i2 == 2) {
                    x340Var.i0(-204765649);
                    cvx cvxVar = cbx.b(x340Var).b;
                    f3 = zjy.j(12.0f, new p3v(12.0f)).a;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-204698627);
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    x340Var.r(false);
                }
                jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
                float f4 = f2;
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
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                Uri uri = Uri.parse(jlw0Var.a);
                String str3 = jlw0Var.b;
                if (ihc1.y0(str3)) {
                    str3 = str;
                }
                jsl jslVarC = two1.C(2131962251, 0, str3, x340Var);
                nim0 nim0Var = nim0.a;
                if (i2 == 2) {
                    qim0VarK = u291.r(nim0Var, f);
                } else {
                    qim0VarK = xcg1.k(cbx.a, u291.v(nim0Var, f));
                }
                eso1.e(uri, jslVarC, anm1.N("share.card.thumbnail", i1p1.q(qim0VarK, er31.b(f4))), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, true, false, x340Var, 0, 6, 3064);
                ryo1.g(i, i2, ((i4 >> 6) & 1022) | ((i4 >> 3) & 57344), 0, str, str2, x340Var, c13.k(nim0Var, f3, x340Var, 1.0f, true));
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new whe1(jlw0Var, f, str, str2, i, i2, qim0Var, i3);
            }
        }

        public static final hob1 l(mey0 mey0Var) {
            String str = mey0Var.a;
            String str2 = mey0Var.c;
            ar00 ar00Var = new ar00(0, "", "");
            k4m k4mVar = k4m.d;
            return new hob1(str, str2, str2, "", "", false, false, new cr00(k4mVar, true, ar00Var, "", j8h.c), false, (mbw0) null, new lfi0("", "", "", (String) null, "", (d2k1) null, (String) null, (String) null, (String) null, k4mVar, new wcm("", (String) null, (String) null, (ucm) null, (Function0) null, n0r.W0, false, (String) null, (String) null, 990), true, false, false, false, false, false, false, (String) null, (Float) null, 33546920), (yaw0) null, (xfn0) null, new set0(mey0Var.c, false, "", "", (Function0) null, false, false, (Function0) null, (String) null, (String) null, false, 1968), new wcm("", (String) null, (String) null, (ucm) null, (Function0) null, n0r.X0, false, (String) null, (String) null, 990), (uho) null, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, (m9g1) null, (ch7) null, (sbw0) null, 0L, false, false, (Integer) null, false, false, false, (x360) null, (m4m) null, (y2u0) null, false, (sq51) null, (String) null, (String) null, false, false, (String) null, (c5v0) null, -16838144, 2047);
        }

        public static luk0 m(Integer num, r6h1 r6h1Var) {
            return new luk0(num, r6h1Var);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
        public static final nma0 n(f9 f9Var, x1k x1kVar, String str) throws SerializationException {
            nma0 nma0VarA = f9Var.a(x1kVar, str);
            if (nma0VarA != null) {
                return nma0VarA;
            }
            kto1.C(str, f9Var.c());
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
        public static final nma0 o(f9 f9Var, uax uaxVar, Object obj) throws SerializationException {
            nma0 nma0VarB = f9Var.b(uaxVar, obj);
            if (nma0VarB != null) {
                return nma0VarB;
            }
            tka0 tka0VarB = rc11.a.b(obj.getClass());
            tka0 tka0VarC = f9Var.c();
            String strR = tka0VarB.r();
            if (strR == null) {
                strR = String.valueOf(tka0VarB);
            }
            kto1.C(strR, tka0VarC);
            throw null;
        }

        public static lo80 p(int i, long j) {
            long j2 = i;
            long j3 = j2 / 1000000000;
            if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
                j3--;
            }
            long j4 = j + j3;
            if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
                return j > 0 ? lo80.d : lo80.c;
            }
            if (j4 < -31557014167219200L) {
                return lo80.c;
            }
            if (j4 > 31556889864403199L) {
                return lo80.d;
            }
            long j5 = j2 % 1000000000;
            return new lo80(j4, (int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)));
        }

        public static lo80 q() {
            return lo80.d;
        }

        public static lo80 r() {
            return lo80.c;
        }

        public static final esn s(sck1 sck1Var) {
            return sck1Var instanceof ot50 ? ((ot50) sck1Var).O() : csn.b;
        }

        public static final ine0 t(jj40 jj40Var) {
            String str = jj40Var.a;
            String str2 = (String) ihc1.Q0(str, new String[]{","}, 0, 6).get(0);
            List listQ0 = ihc1.Q0(str, new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : listQ0) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                if (i > 0) {
                    arrayList.add(obj);
                }
                i = i2;
            }
            return new ine0(jj40Var.b, str2, o7h.y0(arrayList, ", ", (String) null, (String) null, gje0.f, 30), false);
        }
    }
