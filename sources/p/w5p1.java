package p;

import android.content.Context;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.TextDecoration;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class w5p1 {
    public static b180 a;
    public static b180 b;

    /* JADX WARN: Code duplicated, block: B:62:0x025a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0290  */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static final void a(p60 p60Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        vu30 vu30Var;
        llj lljVar;
        String str;
        vu30 vu30Var2;
        qim0 qim0Var3;
        Function0 function0;
        ?? r1;
        qim0 qim0Var4;
        int i2;
        String str2 = p60Var.c;
        String str3 = p60Var.d;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2068419041);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.g(p60Var) ? 4 : 2) | 48 | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            fra fraVar = een.N0;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            cr31 cr31VarB = er31.b(8.0f);
            qim0 qim0Var5 = nim0.a;
            qim0 qim0VarF = dug.f(qim0Var5, jA, cr31VarB);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            jtr jtrVar = jtr.f;
            boolean z = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new f02(iu30Var, p60Var, (byte) 2);
                x340Var.s0(objT2);
            }
            qim0 qim0VarV = bin.v(qim0VarF, idn0Var, jtrVar, false, null, null, (Function0) objT2, 28);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarV);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z2) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar2);
            vu30 vu30Var3 = y580.N0;
            nko1.H(xos0VarM, x340Var, vu30Var3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            vu30 vu30Var4 = y580.Y;
            nko1.H(qim0VarE, x340Var, vu30Var4);
            String str4 = p60Var.a;
            String str5 = p60Var.g;
            String str6 = p60Var.b;
            int i4 = p60Var.j;
            int length = str4.length();
            isl islVar = isl.a;
            if (length <= 0 || i4 == 6) {
                vu30Var = vu30Var4;
                lljVar = lljVar3;
                str = "-active";
                vu30Var2 = vu30Var3;
                qim0Var3 = qim0Var5;
                function0 = function1;
                r1 = 0;
                x340Var.i0(-1227353753);
                x340Var.r(false);
            } else {
                x340Var.i0(-1227595150);
                hux huxVarE = huj.e(str4);
                long jC = huj.c(str6);
                cqs0 cqs0Var = xxq0.a;
                boolean zR = nhc1.R(str4, "-active", false);
                qim0Var3 = qim0Var5;
                vu30Var2 = vu30Var3;
                lljVar = lljVar3;
                vu30Var = vu30Var4;
                str = "-active";
                function0 = function1;
                r1 = 0;
                w0h1.a(huxVarE, islVar, u291.r(qim0Var5, 24.0f), jC, 0L, zR, x340Var, 56, 16);
                x340Var.r(false);
            }
            float f = 1.0f;
            wnb0 wnb0Var = new wnb0(1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, (int) r1);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar2);
            nko1.H(xos0VarM2, x340Var, vu30Var2);
            x0d.q(iHashCode2, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE2, x340Var, vu30Var);
            if (str2.length() > 0) {
                x340Var.i0(843796516);
                jw31 jw31VarA2 = ew31.a(new d36(8.0f, true, new um5((boolean) r1)), een.Z, x340Var, (int) r1);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0Var4 = qim0Var3;
                qim0 qim0VarE3 = zr7.E(x340Var, qim0Var4);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA2, x340Var, lljVar2);
                nko1.H(xos0VarM3, x340Var, vu30Var2);
                x0d.q(iHashCode3, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE3, x340Var, vu30Var);
                if (str4.length() > 0) {
                    i2 = i4;
                    if (i2 == 6) {
                        x340Var.i0(312450883);
                        hux huxVarE2 = huj.e(str4);
                        long jC2 = huj.c(str6);
                        cqs0 cqs0Var2 = xxq0.a;
                        str = str;
                        f = 1.0f;
                        qim0Var4 = qim0Var4;
                        w0h1.a(huxVarE2, islVar, u291.r(qim0Var4, 16.0f), jC2, 0L, nhc1.R(str4, str, (boolean) r1), x340Var, 56, 16);
                        islVar = islVar;
                        x340Var.r((boolean) r1);
                    }
                    if (i2 == 6) {
                        x340Var.i0(312810855);
                        uwo1.e(str2, u291.f(qim0Var4, f), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                        x340Var = x340Var;
                        x340Var.r((boolean) r1);
                    } else {
                        x340Var.i0(313053802);
                        uwo1.e(str2, u291.f(qim0Var4, f), cbx.d(x340Var).j, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                        x340Var = x340Var;
                        x340Var.r((boolean) r1);
                    }
                    x340Var.r(true);
                    x340Var.r((boolean) r1);
                } else {
                    i2 = i4;
                }
                x340Var.i0(312732828);
                x340Var.r((boolean) r1);
                if (i2 == 6) {
                    x340Var.i0(312810855);
                    uwo1.e(str2, u291.f(qim0Var4, f), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                    x340Var = x340Var;
                    x340Var.r((boolean) r1);
                } else {
                    x340Var.i0(313053802);
                    uwo1.e(str2, u291.f(qim0Var4, f), cbx.d(x340Var).j, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                    x340Var = x340Var;
                    x340Var.r((boolean) r1);
                }
                x340Var.r(true);
                x340Var.r((boolean) r1);
            } else {
                f = 1.0f;
                qim0Var4 = qim0Var3;
                i2 = i4;
                str = str;
                islVar = islVar;
                x340Var.i0(844773853);
                x340Var.r((boolean) r1);
            }
            if (i2 == 6) {
                x340Var.i0(844836008);
                if (str3.length() > 0) {
                    x340Var.i0(844889266);
                    x340 x340Var2 = x340Var;
                    uwo1.e(str3, u291.f(qim0Var4, f), cbx.d(x340Var).j, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
                    x340Var = x340Var2;
                    x340Var.r((boolean) r1);
                } else {
                    x340Var.i0(845094269);
                    x340Var.r((boolean) r1);
                }
                x340Var.r((boolean) r1);
            } else {
                x340Var.i0(845116837);
                if (str3.length() > 0) {
                    x340Var.i0(845170095);
                    x340 x340Var3 = x340Var;
                    uwo1.e(str3, u291.f(qim0Var4, f), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2032);
                    x340Var = x340Var3;
                    x340Var.r((boolean) r1);
                } else {
                    x340Var.i0(845377981);
                    x340Var.r((boolean) r1);
                }
                x340Var.r((boolean) r1);
            }
            x340Var.r(true);
            if (
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 995
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.w5p1.a(p.p60, p.qim0, p.iu30, p.b0k, int):void");
        }

        public static final void b(int i, Function0 function0, b0k b0kVar, boolean z) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-654784764);
            int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                uwr uwrVar = cbx.a;
                w3d1.a(u291.f(nim0.a, 1.0f), (hw61) null, cbx.a(x340Var).a.c, 0L, 0.0f, 0.0f, (qqb) null, apo.r(-2111588279, new ie1(z, function0, (byte) 0), x340Var), x340Var, 12582912, 122);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ie1((byte) 1, i, function0, z);
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v16, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r2v32 */
        public static final void c(mb80 mb80Var, qim0 qim0Var, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
            mb80 mb80Var2;
            iu30 iu30Var3;
            x340 x340Var;
            qim0 qim0Var2;
            m4c m4cVar;
            String str;
            qim0 qim0Var3;
            boolean z;
            ?? r2;
            llj lljVar;
            llj lljVar2;
            int i2;
            qim0 qim0Var4;
            iu30 iu30Var4 = iu30Var2;
            llj lljVar3 = y580.Y;
            llj lljVar4 = y580.R0;
            llj lljVar5 = y580.N0;
            llj lljVar6 = y580.O0;
            String str2 = mb80Var.b;
            fra fraVar = een.Z;
            era eraVar = een.P0;
            m4c m4cVar2 = fkj0.X;
            String str3 = mb80Var.f;
            ArrayList<bm7> arrayList = mb80Var.e;
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.k0(-1066207166);
            j06 j06Var = x340Var2.a;
            int i3 = ((i & 6) == 0 ? i | ((i & 8) == 0 ? x340Var2.g(mb80Var) : x340Var2.i(mb80Var) ? 4 : 2) : i) | 48;
            if ((i & 384) == 0) {
                i3 |= x340Var2.i(iu30Var) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= x340Var2.i(iu30Var4) ? 2048 : 1024;
            }
            int i4 = i3;
            if (x340Var2.Y(i4 & 1, (i4 & 1171) != 1170)) {
                d36 d36Var = new d36(16.0f, true, new um5(false));
                uwr uwrVar = cbx.a;
                long jA = cbx.a(x340Var2).a.a.a();
                cr31 cr31VarB = er31.b(8.0f);
                qim0 qim0Var5 = nim0.a;
                qim0 qim0VarX = uyn1.x(u291.f(dug.f(qim0Var5, jA, cr31VarB), 1.0f), 16.0f);
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
                boolean z2 = x340Var2.S;
                n4k n4kVar = hmb0.t1;
                if (z2) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA, x340Var2, lljVar6);
                nko1.H(xos0VarM, x340Var2, lljVar5);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, lljVar4);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, lljVar3);
                uwo1.e(mb80Var.a, u291.f(qim0Var5, 1.0f), cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
                if (str2.length() > 0) {
                    x340Var2.i0(1691856762);
                    str = str3;
                    qim0Var3 = qim0Var5;
                    m4cVar = m4cVar2;
                    z = true;
                    r2 = 0;
                    uwo1.e(str2, u291.f(qim0Var5, 1.0f), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
                    x340Var = x340Var2;
                    x340Var.r(false);
                } else {
                    x340Var = x340Var2;
                    m4cVar = m4cVar2;
                    str = str3;
                    qim0Var3 = qim0Var5;
                    z = true;
                    r2 = 0;
                    x340Var.i0(1692043382);
                    x340Var.r(false);
                }
                if (arrayList.isEmpty()) {
                    lljVar = lljVar3;
                    lljVar2 = lljVar4;
                    x340Var.i0(1692745718);
                    x340Var.r((boolean) r2);
                } else {
                    x340Var.i0(1692104731);
                    for (bm7 bm7Var : arrayList) {
                        jw31 jw31VarA = ew31.a(new d36((float) r36, z, new um5((boolean) r2)), fraVar, x340Var, (int) r2);
                        int iHashCode2 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM2 = x340Var.m();
                        qim0 qim0VarE2 = zr7.E(x340Var, qim0Var3);
                        hzj.A.getClass();
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(jw31VarA, x340Var, lljVar6);
                        nko1.H(xos0VarM2, x340Var, lljVar5);
                        Integer numValueOf = Integer.valueOf(iHashCode2);
                        llj lljVar7 = lljVar4;
                        nko1.H(numValueOf, x340Var, lljVar7);
                        nko1.F(x340Var);
                        llj lljVar8 = lljVar3;
                        nko1.H(qim0VarE2, x340Var, lljVar8);
                        String str4 = bm7Var.a;
                        if (str4.length() > 0) {
                            x340Var.i0(978215360);
                            hux huxVarE = huj.e(str4);
                            long jC = huj.c(bm7Var.b);
                            cqs0 cqs0Var = xxq0.a;
                            w0h1.a(huxVarE, isl.a, u291.r(qim0Var3, 16.0f), jC, 0L, nhc1.R(str4, "-active", (boolean) r2), x340Var, 56, 16);
                            x340Var.r((boolean) r2);
                        } else {
                            x340Var.i0(978489617);
                            x340Var.r((boolean) r2);
                        }
                        String str5 = bm7Var.c;
                        qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                        uwr uwrVar2 = cbx.a;
                        uwo1.e(str5, qim0VarF, cbx.d(x340Var).j, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                        x340Var.r(z);
                        lljVar3 = lljVar8;
                        lljVar4 = lljVar7;
                    }
                    lljVar = lljVar3;
                    lljVar2 = lljVar4;
                    x340Var.r((boolean) r2);
                }
                mb80Var2 = mb80Var;
                if (mb80Var2.d == 2) {
                    x340Var.i0(1692807222);
                    qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                    jw31 jw31VarA2 = ew31.a(new d36(16.0f, z, new um5((boolean) r2)), (pl3) 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02cf: INVOKE (r4v7 'jw31VarA2' p.jw31) = 
                          (wrap p.d36:0x02cc: CONSTRUCTOR 
                          (16.0f float)
                          (r0v4 'z' boolean)
                          (wrap p.um5:0x02c7: CONSTRUCTOR (wrap boolean:?: CAST (boolean) (r2v16 'r2' ?? I:boolean)) A[WRAPPED] (LINE:712) call: p.um5.<init>(boolean):void type: CONSTRUCTOR)
                         A[WRAPPED] (LINE:717) call: p.d36.<init>(float, boolean, p.e36):void type: CONSTRUCTOR)
                          (wrap p.pl3:?: CAST (p.pl3) (r35v0 ?? I:??[OBJECT, ARRAY]))
                          (r8v18 'x340Var' p.x340)
                          (wrap int:?: CAST (int) (r2v16 'r2' ?? I:int))
                         STATIC call: p.ew31.a(p.c36, p.pl3, p.b0k, int):p.jw31 A[DECLARE_VAR] (LINE:720) in method: p.w5p1.c(p.mb80, p.qim0, p.iu30, p.iu30, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r35v0 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 1092
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.w5p1.c(p.mb80, p.qim0, p.iu30, p.iu30, p.b0k, int):void");
                }

                public static final void d(qim0 qim0Var, b0k b0kVar, int i) {
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(-1672336765);
                    int i2 = i | 6;
                    if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                        gra graVar = een.h;
                        qim0 qim0Var2 = nim0.a;
                        qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
                        uwr uwrVar = cbx.a;
                        qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var).a.b.a(), d4o1.a);
                        gfh0 gfh0VarC = t1c.c(graVar, false);
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
                        nko1.H(gfh0VarC, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        zov0 zov0Var = cbx.b(x340Var).g;
                        rhx0.a(u291.v(qim0Var2, 24.0f), cbx.a(x340Var).c.c, 0.0f, 0L, 0, 0.0f, x340Var, 0, 60);
                        x340Var.r(true);
                        qim0Var = qim0Var2;
                    } else {
                        x340Var.b0();
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ns30(qim0Var, i, (byte) 26);
                    }
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v13 */
                /* JADX WARN: Type inference failed for: r0v14 */
                /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
                /* JADX WARN: Type inference failed for: r0v3 */
                /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
                /* JADX WARN: Type inference failed for: r0v6 */
                /* JADX WARN: Type inference failed for: r0v8 */
                /* JADX WARN: Type inference failed for: r12v11 */
                /* JADX WARN: Type inference failed for: r12v5 */
                /* JADX WARN: Type inference failed for: r12v6 */
                /* JADX WARN: Type inference failed for: r16v3 */
                /* JADX WARN: Type inference failed for: r7v23 */
                /* JADX WARN: Type inference failed for: r7v24 */
                /* JADX WARN: Type inference failed for: r7v26 */
                /* JADX WARN: Type inference failed for: r9v0 */
                /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r9v7 */
                public static final void e(mb80 mb80Var, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                    int i2;
                    ?? r0;
                    int i3;
                    byte b2;
                    int i4;
                    m4c m4cVar = fkj0.X;
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(400968135);
                    int i5 = 2;
                    byte b3 = 4;
                    int i6 = (i & 6) == 0 ? i | ((i & 8) == 0 ? x340Var.g(mb80Var) : x340Var.i(mb80Var) ? 4 : 2) : i;
                    int i7 = 32;
                    if ((i & 48) == 0) {
                        i6 |= x340Var.i(iu30Var) ? 32 : 16;
                    }
                    int i8 = i6;
                    ?? r9 = 0;
                    int i9 = 1;
                    if (x340Var.Y(i8 & 1, (i8 & 19) != 18)) {
                        for (p60 p60Var : mb80Var.c) {
                            int i10 = p60Var.j;
                            String str = p60Var.c;
                            int iC = l1d.C(i10);
                            nim0 nim0Var = nim0.a;
                            if (iC != 0) {
                                if (iC == i9) {
                                    i2 = i7;
                                    ?? r1 = r9;
                                    i3 = i9;
                                    x340Var.i0(-522845900);
                                    qim0 qim0VarF = u291.f(uyn1.x(nim0Var, 16.0f), 1.0f);
                                    int i11 = (x340Var.i(p60Var) ? 1 : 0) | ((i8 & 112) == i2 ? i3 : r1 == true ? 1 : 0);
                                    Object objT = x340Var.T();
                                    Object obj = objT;
                                    if (i11 != 0 || objT == m4cVar) {
                                        f02 f02Var = new f02(iu30Var, p60Var, (byte) 4);
                                        x340Var.s0(f02Var);
                                        obj = f02Var;
                                    }
                                    Function0 function0 = (Function0) obj;
                                    if (ihc1.y0(str)) {
                                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                        return;
                                    } else {
                                        foo1.c(new gbx(new y50(str), function0), jdx.c, qim0VarF, null, yla.p(x340Var), null, null, null, null, null, apo.r(463365035, new g02(p60Var, (byte) 3), x340Var), x340Var, 0, 48, 2008);
                                        x340Var.r((boolean) r1);
                                        r0 = r1;
                                    }
                                } else if (iC == i5) {
                                    x340Var.i0(-522469963);
                                    qim0 qim0VarF2 = u291.f(uyn1.x(nim0Var, 16.0f), 1.0f);
                                    int i12 = ((i8 & 112) == i7 ? 1 : r9) | (x340Var.i(p60Var) ? 1 : 0);
                                    Object objT2 = x340Var.T();
                                    Object obj2 = objT2;
                                    if (i12 != 0 || objT2 == m4cVar) {
                                        f02 f02Var2 = new f02(iu30Var, p60Var, (byte) 5);
                                        x340Var.s0(f02Var2);
                                        obj2 = f02Var2;
                                    }
                                    Function0 function1 = (Function0) obj2;
                                    if (ihc1.y0(str)) {
                                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                        return;
                                    }
                                    gbx gbxVar = new gbx(new y50(str), function1);
                                    ldx ldxVar = ldx.c;
                                    int i13 = i7;
                                    gdx gdxVarP = yla.p(x340Var);
                                    j2i j2iVarR = apo.r(-1688118100, new g02(p60Var, b3), x340Var);
                                    i3 = 1;
                                    i2 = i13;
                                    boolean z = r9 == true ? 1 : 0;
                                    foo1.c(gbxVar, ldxVar, qim0VarF2, null, gdxVarP, null, null, null, null, null, j2iVarR, x340Var, 0, 48, 2008);
                                    x340Var.r(z);
                                    r0 = z;
                                } else {
                                    if (iC != 3 && iC != b3 && iC != 5) {
                                        throw p3d1.k(x340Var, -1263806451, (boolean) r9);
                                    }
                                    x340Var.i0(-1263766498);
                                    ?? r7 = (i8 & 112) == i7 ? 1 : r9;
                                    Object objT3 = x340Var.T();
                                    Object obj3 = objT3;
                                    if (r7 != 0 || objT3 == m4cVar) {
                                        bv70 bv70Var = new bv70(iu30Var, b3);
                                        x340Var.s0(bv70Var);
                                        obj3 = bv70Var;
                                    }
                                    a(p60Var, null, (iu30) obj3, x340Var, r9);
                                    x340Var.r((boolean) r9);
                                    i4 = i5;
                                    b2 = b3;
                                    i2 = i7;
                                    r0 = r9;
                                    i3 = 1;
                                }
                                i4 = 2;
                                b2 = 4;
                            } else {
                                i2 = i7;
                                r0 = r9;
                                i3 = i9;
                                x340Var.i0(-523253612);
                                qim0 qim0VarF3 = u291.f(uyn1.x(nim0Var, 16.0f), 1.0f);
                                int i14 = (x340Var.i(p60Var) ? 1 : 0) | ((i8 & 112) == i2 ? i3 : r0 == true ? 1 : 0);
                                Object objT4 = x340Var.T();
                                Object obj4 = objT4;
                                if (i14 != 0 || objT4 == m4cVar) {
                                    f02 f02Var3 = new f02(iu30Var, p60Var, (byte) 3);
                                    x340Var.s0(f02Var3);
                                    obj4 = f02Var3;
                                }
                                Function0 function2 = (Function0) obj4;
                                if (ihc1.y0(str)) {
                                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                    return;
                                }
                                b2 = 4;
                                i4 = 2;
                                foo1.c(new gbx(new y50(str), function2), new idx(4), qim0VarF3, null, yla.p(x340Var), null, null, null, null, null, apo.r(1493205556, new g02(p60Var, (byte) 2), x340Var), x340Var, 0, 48, 2008);
                                x340Var.r((boolean) r0);
                            }
                            r9 = r0;
                            i7 = i2;
                            i9 = i3;
                            i5 = i4;
                            b3 = b2;
                        }
                    } else {
                        x340Var.b0();
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new lg60(mb80Var, iu30Var, i, (byte) 6);
                    }
                }

                public static final b2a f(cky ckyVar) {
                    u1a y1aVar;
                    k4m k4mVar;
                    o1v o1vVar;
                    piy piyVar = ckyVar.j;
                    if (piyVar == null) {
                        return null;
                    }
                    Set<qiy> set = piyVar.a;
                    ArrayList arrayList = new ArrayList(q7h.U(set, 10));
                    for (qiy qiyVar : set) {
                        if (qiyVar instanceof qiy) {
                            qiy qiyVar2 = qiyVar;
                            y1aVar = new u1a(qiyVar2.a, qiyVar2.b, qiyVar2.c);
                        } else if (qiyVar instanceof riy) {
                            int iC = l1d.C(((riy) qiyVar).a);
                            if (iC == 0) {
                                o1vVar = o1v.b;
                            } else if (iC == 1) {
                                o1vVar = o1v.c;
                            } else if (iC == 2) {
                                o1vVar = o1v.d;
                            } else {
                                if (iC != 3) {
                                    eg.o();
                                    return null;
                                }
                                o1vVar = o1v.e;
                            }
                            y1aVar = new v1a(o1vVar);
                        } else if (qiyVar.equals(siy.a)) {
                            y1aVar = w1a.b;
                        } else if (qiyVar instanceof tiy) {
                            y1aVar = new x1a(((tiy) qiyVar).a);
                        } else if (qiyVar.equals(siy.b)) {
                            y1aVar = w1a.c;
                        } else if (qiyVar.equals(siy.c)) {
                            y1aVar = w1a.d;
                        } else {
                            if (!(qiyVar instanceof uiy)) {
                                eg.o();
                                return null;
                            }
                            int iC2 = l1d.C(((uiy) qiyVar).a);
                            if (iC2 == 0) {
                                k4mVar = k4m.a;
                            } else if (iC2 == 1) {
                                k4mVar = k4m.b;
                            } else {
                                if (iC2 != 2) {
                                    eg.o();
                                    return null;
                                }
                                k4mVar = k4m.c;
                            }
                            y1aVar = new y1a(k4mVar);
                        }
                        arrayList.add(y1aVar);
                    }
                    return new b2a(o7h.p1(arrayList));
                }

                public static final jn7 g(CosmosCoroutineTransport cosmosCoroutineTransport) {
                    return new jn7(cosmosCoroutineTransport);
                }

                public static final az11 h(bz11 bz11Var) {
                    Context context = (Context) bz11Var.a;
                    c8o.l(context);
                    q8n q8nVar = (q8n) bz11Var.b;
                    c8o.l(q8nVar);
                    pz11 pz11Var = (pz11) bz11Var.h;
                    c8o.l(pz11Var);
                    xav0 xav0Var = (xav0) bz11Var.i;
                    c8o.l(xav0Var);
                    efm0 efm0Var = efm0.a;
                    hm61 hm61Var = new hm61(efm0Var, pz11Var, xav0Var);
                    hm61 hm61Var2 = new hm61(efm0Var, pz11Var, xav0Var);
                    sz11 sz11Var = (sz11) bz11Var.j;
                    c8o.l(sz11Var);
                    ne neVar = new ne(context.getApplicationContext(), hm61Var2, sz11Var);
                    cxc cxcVar = (cxc) bz11Var.f;
                    c8o.l(cxcVar);
                    mc00 mc00Var = (mc00) bz11Var.g;
                    c8o.l(mc00Var);
                    lc00 lc00Var = mc00Var.a;
                    xg8 xg8Var = new xg8(neVar, cxcVar, new lmw(lc00Var.H, (byte) 8), hm61Var);
                    lw21 lw21Var = (lw21) bz11Var.k;
                    c8o.l(lw21Var);
                    nz11 nz11Var = new nz11(false, 0, new cz11(lw21Var));
                    zwz0 zwz0Var = (zwz0) bz11Var.d;
                    c8o.l(zwz0Var);
                    lmy0 lmy0Var = (lmy0) bz11Var.e;
                    c8o.l(lmy0Var);
                    Scheduler scheduler = (Scheduler) bz11Var.c;
                    c8o.l(scheduler);
                    return new az11(context, q8nVar, xg8Var, nz11Var, zwz0Var, lmy0Var, scheduler, new aq80(new lmw(lc00Var.H, (byte) 8), pz11Var, xav0Var, (byte) 0));
                }

                public static void i(DrawScope drawScope, y9e1 y9e1Var, long j, long j2, float f, int i) {
                    long j3 = (i & 2) != 0 ? u7h.k : j;
                    long j4 = (i & 4) != 0 ? 0L : j2;
                    float fB = (i & 8) != 0 ? Float.NaN : f;
                    zma1 zma1Var = y9e1Var.a.b.a;
                    Shadow shadow = zma1Var.n;
                    TextDecoration textDecoration = zma1Var.m;
                    DrawStyle drawStyle = zma1Var.p;
                    cab cabVarA1 = drawScope.a1();
                    long jU = cabVarA1.u();
                    cabVarA1.p().q();
                    try {
                        dg8 dg8Var = (dg8) cabVarA1.b;
                        dg8Var.z(Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)));
                        boolean zD = y9e1Var.d();
                        zrm0 zrm0Var = y9e1Var.b;
                        x9e1 x9e1Var = y9e1Var.a;
                        if (zD && x9e1Var.f != 3) {
                            long j5 = y9e1Var.c;
                            dg8.m(dg8Var, (int) (j5 >> 32), (int) (j5 & 4294967295L), 16);
                        }
                        lee1 lee1Var = x9e1Var.b;
                        Brush brushB = lee1Var.b();
                        if (brushB == null || j3 != 16) {
                            zrm0Var.j(drawScope.a1().p(), ila0.A(fB, j3 != 16 ? j3 : lee1Var.c()), shadow, textDecoration, drawStyle);
                        } else {
                            fid fidVarP = drawScope.a1().p();
                            if (Float.isNaN(fB)) {
                                fB = lee1Var.a.a.b();
                            }
                            obg1.p(zrm0Var, fidVarP, brushB, fB, shadow, textDecoration, drawStyle);
                        }
                    } finally {
                        i3a.n(cabVarA1, jU);
                    }
                }

                public static final int j(smr0 smr0Var) {
                    int iA = smr0Var.a(grd1.h, -65281);
                    return iA == -65281 ? smr0Var.a(grd1.e, -7829368) : iA;
                }

                public static mr20 k(ov20 ov20Var) {
                    return rqt0.u(new p3t(((bw20) ov20Var).a, (byte) 23));
                }

                public static dsk0 l() {
                    return new dsk0((byte) 9);
                }

                public static final knu0 m(w4i1 w4i1Var, String str, Set set) {
                    boolean zContains = set.contains(w4i1Var.a);
                    return u890.j(w4i1Var.a, str) ? new jnu0(zContains) : new inu0(zContains, w4i1Var.b);
                }

                public static final h181 n(b181 b181Var, e181 e181Var, int i) {
                    goj0 goj0VarA;
                    goj0 goj0VarA2;
                    hoj0 hoj0VarC;
                    tkl tklVar;
                    x360 x360Var = e181Var.b;
                    String str = e181Var.a;
                    ioj0 ioj0Var = b181Var.a;
                    if (ioj0Var == null) {
                        return new g181(str, x360Var);
                    }
                    b7x b7xVar = b181Var.b;
                    if (b7xVar == null) {
                        b7xVar = b7x.a;
                    }
                    ArrayList<d181> arrayList = e181Var.c;
                    ArrayList<tkl> arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    for (d181 d181Var : arrayList) {
                        h290 h290Var = d181Var.b;
                        String str2 = d181Var.a;
                        if (h290Var.isEmpty()) {
                            tklVar = new tkl(str2, str2, false, null);
                        } else {
                            if (h290Var.isEmpty()) {
                                tklVar = new tkl(str2, (String) o7h.q0(h290Var), true, null);
                                break;
                            }
                            Iterator it = h290Var.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    tklVar = new tkl(str2, (String) o7h.q0(h290Var), true, null);
                                    break;
                                    break;
                                }
                                iix0 iix0Var = (iix0) b7xVar.get((String) it.next());
                                if (iix0Var != null ? iix0Var instanceof gix0 : false) {
                                    tklVar = new tkl((String) o7h.q0(h290Var), (String) o7h.q0(h290Var), true, str2);
                                    break;
                                }
                            }
                        }
                        arrayList2.add(tklVar);
                    }
                    ArrayList<tkl> arrayList3 = new ArrayList();
                    for (tkl tklVar2 : arrayList2) {
                        String str3 = tklVar2.a;
                        String str4 = tklVar2.d;
                        hoj0 hoj0VarC2 = ioj0Var.c(z081.class, str3);
                        boolean z = hoj0VarC2 != null ? hoj0VarC2 instanceof goj0 : false;
                        hoj0 hoj0VarC3 = ioj0Var.c(z081.class, tklVar2.b);
                        boolean z2 = hoj0VarC3 != null ? hoj0VarC3 instanceof goj0 : false;
                        if (!z || !z2) {
                            tklVar2 = (str4 == null || (hoj0VarC = ioj0Var.c(z081.class, str4)) == null || !(hoj0VarC instanceof goj0)) ? null : new tkl(str4, str4, false, null);
                        }
                        if (tklVar2 != null) {
                            arrayList3.add(tklVar2);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        return new g181(str, x360Var);
                    }
                    ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                    for (tkl tklVar3 : arrayList3) {
                        String str5 = tklVar3.b;
                        String str6 = tklVar3.a;
                        hoj0 hoj0VarC4 = ioj0Var.c(z081.class, str5);
                        ez00 ez00Var = (hoj0VarC4 == null || (goj0VarA2 = hoj0VarC4.a()) == null) ? null : (ez00) goj0VarA2.a;
                        if (ez00Var == null) {
                            hhg1.f(f4i1.f(z081.class.getSimpleName(), " not found for uri: ", str5));
                            return null;
                        }
                        String str7 = ((z081) ez00Var).c;
                        hoj0 hoj0VarC5 = ioj0Var.c(z081.class, str6);
                        ez00 ez00Var2 = (hoj0VarC5 == null || (goj0VarA = hoj0VarC5.a()) == null) ? null : (ez00) goj0VarA.a;
                        if (ez00Var2 == null) {
                            hhg1.f(f4i1.f(z081.class.getSimpleName(), " not found for uri: ", str6));
                            return null;
                        }
                        z081 z081Var = (z081) ez00Var2;
                        Set set = alk1.a;
                        arrayList4.add(new m081(str7, 0, z081Var.b, qyo1.A(ihc1.Y0(str6, '?'), ioj0Var), tklVar3.c, z081Var.d));
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : arrayList4) {
                        if (!b181Var.c.contains(((m081) obj).d)) {
                            arrayList5.add(obj);
                        }
                    }
                    List<m081> listD1 = o7h.d1(arrayList5, 8);
                    ArrayList arrayList6 = new ArrayList(q7h.U(listD1, 10));
                    for (m081 m081Var : listD1) {
                        arrayList6.add(new c181(new m081(m081Var.a, i, m081Var.b, m081Var.c, m081Var.e, m081Var.d)));
                    }
                    return new f181(str, arrayList6, x360Var);
                }

                /* JADX WARN: Code duplicated, block: B:18:0x0032  */
                /* JADX WARN: Code duplicated, block: B:26:0x0045  */
                public static final lnu0 o(dnu0 dnu0Var, String str, sv21 sv21Var) {
                    hnu0 hnu0Var;
                    fnu0 fnu0Var;
                    String str2;
                    String str3 = dnu0Var.b;
                    ArrayList arrayList = dnu0Var.e;
                    String str4 = dnu0Var.c;
                    String str5 = sv21Var != null ? sv21Var.a : null;
                    String str6 = sv21Var != null ? sv21Var.b : null;
                    if (sv21Var == null || (str2 = sv21Var.d) == null) {
                        hnu0Var = null;
                    } else {
                        if (str2.length() <= 0) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            hnu0Var = new hnu0(sv21Var.c, str2);
                        } else {
                            hnu0Var = null;
                        }
                    }
                    Set set = sv21Var != null ? sv21Var.e : null;
                    if (set == null) {
                        set = w7x.a;
                    }
                    w4i1 w4i1Var = dnu0Var.d;
                    if (arrayList.isEmpty()) {
                        fnu0Var = null;
                    } else {
                        knu0 knu0VarM = m(w4i1Var, str, set);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (!u890.j(((w4i1) obj).a, w4i1Var.a)) {
                                arrayList2.add(obj);
                            }
                        }
                        if (dnu0Var.f) {
                            w4i1 w4i1Var2 = (w4i1) o7h.s0(arrayList2);
                            if (w4i1Var2 != null) {
                                fnu0Var = new enu0(knu0VarM, m(w4i1Var2, str, set));
                            } else {
                                fnu0Var = null;
                            }
                        } else {
                            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(m((w4i1) it.next(), str, set));
                            }
                            fnu0Var = new fnu0(knu0VarM, arrayList3);
                        }
                    }
                    return new lnu0(str3, str4, str5, str6, hnu0Var, fnu0Var, dnu0Var.g);
                }
            }
