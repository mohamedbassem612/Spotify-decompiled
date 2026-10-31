package p;

import android.content.res.Resources;
import android.view.View;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class two1 {
    public static owo1 a;
    public static b180 b;

    public static boolean A(ef4 ef4Var) {
        return ef4Var.a();
    }

    public static boolean B(ef4 ef4Var) {
        return ef4Var.b();
    }

    public static final jsl C(int i, int i2, String str, b0k b0kVar) {
        if (ihc1.y0(str)) {
            x340 x340Var = (x340) b0kVar;
            str = x0d.k(x340Var, 1926381404, i, x340Var, false);
        } else {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(1926382779);
            x340Var2.r(false);
        }
        return new jsl(str);
    }

    public static final Map D(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            LinkedHashMap linkedHashMap = ((tg50) it.next()).b;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), ((wrw) entry.getValue()).c());
            }
            arrayList.add(linkedHashMap2);
        }
        return u(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:304:0x0786  */
    /* JADX WARN: Code duplicated, block: B:306:0x078d  */
    /* JADX WARN: Code duplicated, block: B:307:0x0791  */
    /* JADX WARN: Code duplicated, block: B:310:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:311:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:315:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:319:0x0818  */
    /* JADX WARN: Code duplicated, block: B:322:0x083f  */
    /* JADX WARN: Code duplicated, block: B:324:0x0846  */
    /* JADX WARN: Code duplicated, block: B:325:0x084a  */
    /* JADX WARN: Code duplicated, block: B:328:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:330:0x08a5  */
    public static final void a(yqg yqgVar, t7q0 t7q0Var, bc71 bc71Var, yxb0 yxb0Var, nu nuVar, tyq tyqVar, rjh0 rjh0Var, yuu0 yuu0Var, boolean z, boolean z2, w4i1 w4i1Var, String str, String str2, iu30 iu30Var, int i, boolean z3, e821 e821Var, boolean z4, boolean z5, qim0 qim0Var, boolean z6, c380 c380Var, boolean z7, wwb1 wwb1Var, String str3, iu30 iu30Var2, b0k b0kVar, int i2, int i3) {
        int i4;
        yqg yqgVar2;
        b0k b0kVar2;
        iu30 iu30Var3;
        Object obj;
        Object gkeVar;
        Function0 function0;
        b0k b0kVar3;
        int i5;
        String str4;
        iu30 iu30Var4;
        Object obj2;
        lnm lnmVar;
        Object obj3;
        rih1 rih1Var;
        y7e1 y7e1Var;
        sen0 sen0Var;
        boolean z8;
        Function0 function1;
        Object obj4;
        float f;
        Function0 function2;
        m4c m4cVar;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        String strO0;
        boolean z9;
        boolean z10;
        Object obj5;
        boolean zG;
        Object obj6;
        gfh0 gfh0VarC2;
        int iHashCode2;
        xos0 xos0VarM2;
        qim0 qim0VarE2;
        m4c m4cVar2 = fkj0.X;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(1057907204);
        j06 j06Var = ((x340) b0kVar4).a;
        int i6 = i2 | (b0kVar4.g(yqgVar) ? 4 : 2) | (b0kVar4.g(t7q0Var) ? 32 : 16) | (b0kVar4.g(bc71Var) ? 256 : 128) | (b0kVar4.i(yxb0Var) ? 2048 : 1024) | (b0kVar4.i(nuVar) ? 16384 : 8192) | (b0kVar4.i(tyqVar) ? 131072 : 65536) | (b0kVar4.i(rjh0Var) ? 1048576 : 524288) | (b0kVar4.i(yuu0Var) ? 8388608 : 4194304) | (b0kVar4.h(z) ? 67108864 : 33554432) | (b0kVar4.h(z2) ? 536870912 : 268435456);
        if ((i3 & 6) == 0) {
            i4 = i3 | ((i3 & 8) == 0 ? b0kVar4.g(w4i1Var) : b0kVar4.i(w4i1Var) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= b0kVar4.g(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= b0kVar4.g(str2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= b0kVar4.i(iu30Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= b0kVar4.e(l1d.C(i)) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= b0kVar4.h(z3) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i4 |= b0kVar4.i(e821Var) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i4 |= b0kVar4.h(z4) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i4 |= b0kVar4.h(z5) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i4 |= b0kVar4.g(qim0Var) ? 536870912 : 268435456;
        }
        int i7 = i4;
        int i8 = (b0kVar4.h(z6) ? (char) 4 : (char) 2) | (b0kVar4.g(c380Var) ? ' ' : (char) 16) | (b0kVar4.h(z7) ? (char) 256 : (char) 128) | (b0kVar4.i(wwb1Var) ? (char) 2048 : (char) 1024) | (b0kVar4.g(str3) ? (char) 16384 : (char) 8192) | (b0kVar4.i(iu30Var2) ? (char) 0 : (char) 0);
        byte b2 = 1;
        if (b0kVar4.Y(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 306783379) == 306783378 && (i8 & 74899) == 74898) ? false : true)) {
            lnm lnmVar2 = null;
            y7e1 y7e1VarD = c4p1.D(0, 3, null, b0kVar4);
            int i9 = i8 & 57344;
            boolean zG2 = (i9 == 16384) | b0kVar4.g(y7e1VarD);
            Object objT = b0kVar4.T();
            Object obj7 = objT;
            if (zG2 || objT == m4cVar2) {
                woe woeVar = new woe(str3, y7e1VarD, lnmVar2, b2);
                b0kVar4.s0(woeVar);
                obj7 = woeVar;
            }
            rih1 rih1Var2 = rih1.a;
            qxd0.t(rih1Var2, b0kVar4, (vu30) obj7);
            Object objT2 = b0kVar4.T();
            Object obj8 = objT2;
            if (objT2 == m4cVar2) {
                bpb1 bpb1VarB = gio1.b("");
                b0kVar4.s0(bpb1VarB);
                obj8 = bpb1VarB;
            }
            wen0 wen0Var = (wen0) obj8;
            Object objT3 = b0kVar4.T();
            if (objT3 == m4cVar2) {
                objT3 = wwb1Var != null ? wwb1Var.a(wen0Var, new o0d(y7e1VarD, iu30Var, yqgVar, (byte) 6)) : null;
                b0kVar4.s0(objT3);
            } else {
                rih1Var2 = rih1Var2;
            }
            cxb1 cxb1Var = (cxb1) objT3;
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar4, 0);
            int iHashCode3 = Long.hashCode(((x340) b0kVar4).T);
            xos0 xos0VarM3 = b0kVar4.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE3 = zr7.E(b0kVar4, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar4.m0();
            boolean z11 = ((x340) b0kVar4).S;
            Function0 function3 = hmb0.t1;
            if (z11) {
                b0kVar4.l(function3);
            } else {
                b0kVar4.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar4, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM3, b0kVar4, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode3);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar4, lljVar3);
            nko1.F(b0kVar4);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE3, b0kVar4, lljVar4);
            if (cxb1Var == null) {
                b0kVar4.i0(-929423071);
                b0kVar4.r(false);
            } else {
                b0kVar4.i0(-929423070);
                Object objT4 = b0kVar4.T();
                if (objT4 == m4cVar2) {
                    obj = objT4;
                    kna knaVar = kna.Z;
                    b0kVar4.s0(knaVar);
                    obj = knaVar;
                }
                obj = objT4;
                otw.c(cxb1Var, rih1Var2, j9k1.x(nim0Var, (xu30) obj), (ipb1) null, b0kVar4, 48, 8);
                b0kVar4.r(false);
            }
            fra fraVar = z6 ? een.N0 : een.O0;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, b0kVar4, 0);
            int iHashCode4 = Long.hashCode(((x340) b0kVar4).T);
            xos0 xos0VarM4 = b0kVar4.m();
            qim0 qim0VarE4 = zr7.E(b0kVar4, qim0VarF);
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar4.m0();
            if (((x340) b0kVar4).S) {
                b0kVar4.l(function3);
            } else {
                b0kVar4.v0();
            }
            nko1.H(jw31VarA, b0kVar4, lljVar);
            nko1.H(xos0VarM4, b0kVar4, lljVar2);
            x0d.q(iHashCode4, b0kVar4, lljVar3, b0kVar4);
            nko1.H(qim0VarE4, b0kVar4, lljVar4);
            int i10 = i7 & 7168;
            boolean zG3 = b0kVar4.g(y7e1VarD) | ((i7 & 896) == 256) | (i10 == 2048);
            Object objT5 = b0kVar4.T();
            if (zG3 || objT5 == m4cVar2) {
                function0 = function3;
                b0kVar3 = b0kVar4;
                i5 = 0;
                str4 = str2;
                gkeVar = new gke(str4, y7e1VarD, iu30Var, (lnm) null, (byte) 4);
                iu30Var4 = iu30Var;
                b0kVar3.s0(gkeVar);
            } else {
                b0kVar3 = b0kVar4;
                gkeVar = objT5;
                function0 = function3;
                i5 = 0;
                str4 = str2;
                iu30Var4 = iu30Var;
            }
            qxd0.t(str4, b0kVar3, (vu30) gkeVar);
            Object objT6 = b0kVar3.T();
            Object obj9 = objT6;
            if (objT6 == m4cVar2) {
                c9n c9nVarM = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(c9nVarM);
                obj9 = c9nVarM;
            }
            c9n c9nVar = (c9n) obj9;
            Object objT7 = b0kVar3.T();
            Object obj10 = objT7;
            if (objT7 == m4cVar2) {
                dt71 dt71VarE = mgo1.e(i5, i5, i5, 7);
                b0kVar3.s0(dt71VarE);
                obj10 = dt71VarE;
            }
            sen0 sen0Var2 = (sen0) obj10;
            int i11 = (b0kVar3.i(sen0Var2) ? 1 : 0) | (i10 == 2048 ? 1 : i5);
            Object objT8 = b0kVar3.T();
            if (i11 != 0 || objT8 == m4cVar2) {
                hsc hscVar = new hsc(sen0Var2, iu30Var4, (lnm) null, (byte) 21);
                b0kVar3.s0(hscVar);
                obj2 = hscVar;
            } else {
                obj2 = objT8;
            }
            rih1 rih1Var3 = rih1Var2;
            qxd0.t(rih1Var3, b0kVar3, (vu30) obj2);
            boolean zG4 = b0kVar3.g(y7e1VarD) | b0kVar3.i((Object) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x03f1: ARITH (r0v18 'zG4' boolean) = (wrap boolean:0x03e9: INVOKE (r2v5 'b0kVar3' p.b0k), (r7v3 'y7e1VarD' p.y7e1) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:88)) | (wrap boolean:0x03ed: INVOKE (r2v5 'b0kVar3' p.b0k), (wrap java.lang.Object:?: CAST (java.lang.Object) (r30v1 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED]) A[DECLARE_VAR] (LINE:88) in method: p.two1.a(p.yqg, p.t7q0, p.bc71, p.yxb0, p.nu, p.tyq, p.rjh0, p.yuu0, boolean, boolean, p.w4i1, java.lang.String, java.lang.String, p.iu30, int, boolean, p.e821, boolean, boolean, p.qim0, boolean, p.c380, boolean, p.wwb1, java.lang.String, p.iu30, p.b0k, int, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v1 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 2337
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.two1.a(p.yqg, p.t7q0, p.bc71, p.yxb0, p.nu, p.tyq, p.rjh0, p.yuu0, boolean, boolean, p.w4i1, java.lang.String, java.lang.String, p.iu30, int, boolean, p.e821, boolean, boolean, p.qim0, boolean, p.c380, boolean, p.wwb1, java.lang.String, p.iu30, p.b0k, int, int):void");
        }

        /* JADX WARN: Code duplicated, block: B:26:0x004a  */
        /* JADX WARN: Code duplicated, block: B:27:0x004c  */
        /* JADX WARN: Code duplicated, block: B:30:0x0054 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:31:0x0056  */
        /* JADX WARN: Code duplicated, block: B:32:0x0059  */
        /* JADX WARN: Code duplicated, block: B:35:0x0091  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:41:0x00db  */
        /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
        public static final void b(r061 r061Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
            int i3;
            qim0 qim0Var2;
            boolean z;
            qim0 qim0Var3;
            h311 h311VarV;
            qim0 qim0Var4;
            long j;
            long jA;
            qim0 qim0VarB;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1089776432);
            if ((i & 6) == 0) {
                i3 = i | ((i & 8) == 0 ? x340Var.g(r061Var) : x340Var.i(r061Var) ? 4 : 2);
            } else {
                i3 = i;
            }
            int i4 = i2 & 2;
            if (i4 == 0) {
                if ((i & 48) == 0) {
                    qim0Var2 = qim0Var;
                    i3 |= x340Var.i(qim0Var2) ? 32 : 16;
                }
                if ((i3 & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    if (i4 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    uwr uwrVar = cbx.a;
                    j = cbx.a(x340Var).b.c;
                    jA = cbx.a(x340Var).a.b.a();
                    qim0 qim0VarH = u291.h(qim0Var4, 24.0f);
                    cvx cvxVar = cbx.b(x340Var).b;
                    qim0VarB = uyn1.B(qim0VarH, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                    if (r061Var.equals(m061.a)) {
                        x340Var.i0(128472414);
                        w0h1.a(klx.c, isl.a, qim0VarB, j, 0L, false, x340Var, klx.d | 48, 48);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(128663963);
                        qim0 qim0VarR = d7e.r(1.0f, qim0VarB, false);
                        cr31 cr31Var = er31.a;
                        qim0 qim0VarQ = i1p1.q(qim0VarR, cr31Var);
                        avw0 avw0Var = cbx.b(x340Var).c;
                        t1c.a(d1u.E(2.0f, jA, qim0VarQ, cr31Var), x340Var, 0);
                        x340Var.r(false);
                    }
                    qim0Var3 = qim0Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ux1(r061Var, qim0Var3, i, i2, (byte) 8);
                }
            }
            i3 |= 48;
            qim0Var2 = qim0Var;
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).b.c;
                jA = cbx.a(x340Var).a.b.a();
                qim0 qim0VarH2 = u291.h(qim0Var4, 24.0f);
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0VarB = uyn1.B(qim0VarH2, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                if (r061Var.equals(m061.a)) {
                    x340Var.i0(128472414);
                    w0h1.a(klx.c, isl.a, qim0VarB, j, 0L, false, x340Var, klx.d | 48, 48);
                    x340Var.r(false);
                } else {
                    x340Var.i0(128663963);
                    qim0 qim0VarR2 = d7e.r(1.0f, qim0VarB, false);
                    cr31 cr31Var2 = er31.a;
                    qim0 qim0VarQ2 = i1p1.q(qim0VarR2, cr31Var2);
                    avw0 avw0Var2 = cbx.b(x340Var).c;
                    t1c.a(d1u.E(2.0f, jA, qim0VarQ2, cr31Var2), x340Var, 0);
                    x340Var.r(false);
                }
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ux1(r061Var, qim0Var3, i, i2, (byte) 8);
            }
        }

        public static final void c(pm10 pm10Var, qim0 qim0Var, Function0 function0, h0y h0yVar, b0k b0kVar, int i) {
            int i2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-56688216);
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? x340Var.g(pm10Var) : x340Var.i(pm10Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.g(qim0Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var.i(function0) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= (i & 4096) == 0 ? x340Var.g(h0yVar) : x340Var.i(h0yVar) ? 2048 : 1024;
            }
            boolean z = true;
            if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                m4c m4cVar = fkj0.X;
                x340Var.i0(746989775);
                boolean z2 = (((i2 & 896) ^ 384) > 256 && x340Var.g(function0)) || (i2 & 384) == 256;
                Object objT = x340Var.T();
                if (z2 || objT == m4cVar) {
                    objT = new in00(function0, (byte) 13);
                    x340Var.s0(objT);
                }
                q3p1.b(0, 1, (Function0) objT, x340Var, false);
                if ((((i2 & 14) ^ 6) <= 4 || !x340Var.i(pm10Var)) && (i2 & 6) != 4) {
                    z = false;
                }
                Object objT2 = x340Var.T();
                if (z || objT2 == m4cVar) {
                    objT2 = new f710(pm10Var, (byte) 5);
                    x340Var.s0(objT2);
                }
                kes kesVarB = lkr0.b(0, (Function0) objT2, x340Var, 0, 3);
                uwr uwrVar = cbx.a;
                long jQ = cbx.a(x340Var).a.c;
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    try {
                        jQ = rjo1.q(((rn10) pm10Var.c.get(((err0) ((jkr0) kesVarB).d.c).s())).f);
                    } catch (Exception e) {
                        n57.g(pm10Var.toString(), e);
                    }
                    objT3 = new u7h(jQ);
                    x340Var.s0(objT3);
                }
                irn1.u(null, apo.r(1029563906, new qi6(((u7h) objT3).a, (Object) function0, (Object) pm10Var, (byte) 7), x340Var), null, null, apo.r(718502344, new c9y(qim0Var, pm10Var, kesVarB, h0yVar, (byte) 2), x340Var), x340Var, 24624, 13);
                x340Var.r(false);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new m5r(i, pm10Var, qim0Var, function0, h0yVar, (byte) 26);
            }
        }

        public static final void d(Function0 function0, String str, qim0 qim0Var, boolean z, max maxVar, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1822553393);
            byte b2 = 16;
            int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128) | (x340Var.i(maxVar) ? 16384 : 8192);
            if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
                x340Var.d0();
                if ((i & 1) != 0 && !x340Var.E()) {
                    x340Var.b0();
                }
                x340Var.s();
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, qim0Var);
                idx idxVar = new idx(4);
                gdx gdxVarR = yla.r(x340Var);
                if (ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                foo1.c(new gbx(new y50(str), function0), idxVar, qim0VarZ, maxVar, gdxVarR, null, null, null, null, null, apo.r(1083189714, new mv8(z, str, b2), x340Var), x340Var, i2 & 57344, 48, 1992);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ofi0(function0, str, qim0Var, z, maxVar, i);
            }
        }

        public static final void e(int i, Integer num, xtb0 xtb0Var, Function0 function0, b0k b0kVar, int i2) {
            int i3;
            Function0 function1;
            h311 h311VarV;
            j2j0 j2j0Var;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1295046548);
            if ((i2 & 6) == 0) {
                i3 = (x340Var.e(i) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= x340Var.g(num) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= x340Var.g(xtb0Var) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                function1 = function0;
                i3 |= x340Var.i(function1) ? 2048 : 1024;
            } else {
                function1 = function0;
            }
            if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
                if (num != null) {
                    int iIntValue = num.intValue();
                    boolean zE = ((i3 & 14) == 4) | x340Var.e(iIntValue) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
                    Object objT = x340Var.T();
                    if (zE || objT == fkj0.X) {
                        utb0 utb0Var = new utb0(iIntValue, i, xtb0Var, function1, (lnm) null);
                        x340Var.s0(utb0Var);
                        objT = utb0Var;
                    }
                    qxd0.t(num, x340Var, (vu30) objT);
                } else {
                    h311VarV = x340Var.v();
                    if (h311VarV == null) {
                        return;
                    } else {
                        j2j0Var = new j2j0(i, num, xtb0Var, function0, i2, (byte) 1);
                    }
                }
                h311VarV.d = j2j0Var;
            }
            x340Var.b0();
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                j2j0Var = new j2j0(i, num, xtb0Var, function0, i2, (byte) 0);
                h311VarV.d = j2j0Var;
            }
        }

        public static final void f(b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-447720322);
            if (x340Var.Y(i & 1, i != 0)) {
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                gfh0 gfh0VarC = t1c.c(een.d, false);
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
                qim0 qim0VarB = u291.B(nim0Var, (gra) null, 3);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                xto1.e(h2c.a.a(uyn1.x(qim0VarB, 16.0f), een.h), 2, 0L, 0L, x340Var, 48, 12);
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ry90(i, (byte) 20);
            }
        }

        public static final void g(d0r d0rVar, b2j0 b2j0Var, bzi0 bzi0Var, r171 r171Var, j2i j2iVar, ig31 ig31Var, i2j0 i2j0Var, h001 h001Var, bqm bqmVar, gv2 gv2Var, ysd1 ysd1Var, bgd0 bgd0Var, tvu0 tvu0Var, uuu0 uuu0Var, onu0 onu0Var, znb0 znb0Var, xtb0 xtb0Var, qim0 qim0Var, vzq0 vzq0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            b0k b0kVar2;
            boolean z8;
            byte b2;
            String id;
            Object dk6Var;
            m4c m4cVar;
            int i7;
            b0k b0kVar3;
            i2j0 i2j0Var2;
            lnm lnmVarValueOf;
            b0k b0kVar4 = (x340) b0kVar;
            b0kVar4.k0(-1878816056);
            if ((i & 6) == 0) {
                i4 = i | (b0kVar4.i(d0rVar) ? 4 : 2);
            } else {
                i4 = i;
            }
            if ((i & 48) == 0) {
                i4 |= b0kVar4.g(b2j0Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i4 |= b0kVar4.i(bzi0Var) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i4 |= b0kVar4.i(r171Var) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i4 |= b0kVar4.i(j2iVar) ? 16384 : 8192;
            }
            if ((i & 196608) == 0) {
                i4 |= b0kVar4.i(ig31Var) ? 131072 : 65536;
            }
            if ((i & 1572864) == 0) {
                i4 |= b0kVar4.i(i2j0Var) ? 1048576 : 524288;
            }
            if ((i & 12582912) == 0) {
                i4 |= b0kVar4.i(h001Var) ? 8388608 : 4194304;
            }
            if ((i & 100663296) == 0) {
                i4 |= b0kVar4.i(bqmVar) ? 67108864 : 33554432;
            }
            if ((i & 805306368) == 0) {
                i4 |= b0kVar4.i(gv2Var) ? 536870912 : 268435456;
            }
            if ((i2 & 6) == 0) {
                i5 = i2 | (b0kVar4.i(ysd1Var) ? 4 : 2);
            } else {
                i5 = i2;
            }
            if ((i2 & 48) == 0) {
                i5 |= b0kVar4.i(bgd0Var) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i5 |= b0kVar4.i(tvu0Var) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i5 |= b0kVar4.i(uuu0Var) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                i5 |= b0kVar4.i(onu0Var) ? 16384 : 8192;
            }
            if ((i2 & 196608) == 0) {
                i5 |= b0kVar4.i(znb0Var) ? 131072 : 65536;
            }
            if ((i2 & 1572864) == 0) {
                i5 |= b0kVar4.g(xtb0Var) ? 1048576 : 524288;
            }
            if ((i2 & 12582912) == 0) {
                i5 |= b0kVar4.g(qim0Var) ? 8388608 : 4194304;
            }
            if ((i2 & 100663296) == 0) {
                i5 |= b0kVar4.g(vzq0Var) ? 67108864 : 33554432;
            }
            if ((i2 & 805306368) == 0) {
                i5 |= b0kVar4.h(z) ? 536870912 : 268435456;
            }
            if ((i3 & 6) == 0) {
                i6 = i3 | (b0kVar4.h(z2) ? 4 : 2);
            } else {
                i6 = i3;
            }
            if ((i3 & 48) == 0) {
                i6 |= b0kVar4.h(z3) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                i6 |= b0kVar4.h(z4) ? 256 : 128;
            }
            if ((i3 & 3072) == 0) {
                i6 |= b0kVar4.h(z5) ? 2048 : 1024;
            }
            if ((i3 & 24576) == 0) {
                i6 |= b0kVar4.h(z6) ? 16384 : 8192;
            }
            if ((i3 & 196608) == 0) {
                i6 |= b0kVar4.h(z7) ? 131072 : 65536;
            }
            int i8 = i6 | (b0kVar4.i(iu30Var) ? 1048576 : 524288);
            if (b0kVar4.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 306783379) == 306783378 && (4793491 & i8) == 4793490) ? false : true)) {
                c380 c380VarA = mqo1.A(b2j0Var.a);
                if (c380VarA != null && c380VarA.isEmpty()) {
                    z8 = false;
                    break;
                }
                Iterator it = c380VarA.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z8 = false;
                        break;
                    } else if (((a2j0) it.next()) instanceof b1j0) {
                        z8 = true;
                        break;
                    }
                }
                Object objT = b0kVar4.T();
                m4c m4cVar2 = fkj0.X;
                if (objT == m4cVar2) {
                    objT = v8r.q(Boolean.FALSE);
                    b0kVar4.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                Object objT2 = b0kVar4.T();
                if (objT2 == m4cVar2) {
                    objT2 = new zen0(Boolean.FALSE);
                    b0kVar4.s0(objT2);
                }
                zen0 zen0Var = (zen0) objT2;
                Boolean boolValueOf = Boolean.valueOf(z8);
                boolean zH = b0kVar4.h(z8) | b0kVar4.i(zen0Var);
                Object objT3 = b0kVar4.T();
                if (zH || objT3 == m4cVar2) {
                    objT3 = new prb(z8, zen0Var, null);
                    b0kVar4.s0(objT3);
                }
                qxd0.t(boolValueOf, b0kVar4, (vu30) objT3);
                if (zen0Var.v1() && ((Boolean) zen0Var.c.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.TRUE);
                }
                int i9 = i5 & 3670016;
                int i10 = i8 & 3670016;
                boolean z9 = (i9 == 1048576) | (i10 == 1048576);
                Object objT4 = b0kVar4.T();
                if (z9 || objT4 == m4cVar2) {
                    objT4 = new mqv(xtb0Var, iu30Var, (lnm) null, (byte) 2);
                    b0kVar4.s0(objT4);
                }
                int i11 = i5 >> 18;
                int i12 = i11 & 14;
                qxd0.t(xtb0Var, b0kVar4, (vu30) objT4);
                uwr uwrVar = cbx.a;
                int iX0 = (int) ((wat) b0kVar4.k(t4k.h)).X0(cbx.b(b0kVar4).b.a);
                Object objT5 = b0kVar4.T();
                if (objT5 == m4cVar2) {
                    objT5 = v8r.q(Boolean.TRUE);
                    b0kVar4.s0(objT5);
                }
                ven0 ven0Var2 = (ven0) objT5;
                int i13 = i12 ^ 6;
                boolean z10 = (i13 > 4 && b0kVar4.g(xtb0Var)) || (i11 & 6) == 4;
                Object objT6 = b0kVar4.T();
                if (z10 || objT6 == m4cVar2) {
                    b2 = 2;
                    objT6 = new ywj(xtb0Var, ven0Var2, null, b2);
                    b0kVar4.s0(objT6);
                } else {
                    b2 = 2;
                }
                qxd0.t(xtb0Var, b0kVar4, (vu30) objT6);
                boolean zG = b0kVar4.g(c380VarA);
                Object objT7 = b0kVar4.T();
                if (zG || objT7 == m4cVar2) {
                    a2j0 a2j0Var = (a2j0) o7h.s0(c380VarA);
                    if (a2j0Var == null || (id = a2j0Var.getId()) == null) {
                        id = "";
                    }
                    objT7 = id;
                    b0kVar4.s0(objT7);
                }
                String str = (String) objT7;
                boolean z11 = (i13 > 4 && b0kVar4.g(xtb0Var)) || (i11 & 6) == 4;
                Object objT8 = b0kVar4.T();
                if (z11 || objT8 == m4cVar2) {
                    objT8 = new ywj(ven0Var2, xtb0Var, null);
                    b0kVar4.s0(objT8);
                }
                qxd0.t(str, b0kVar4, (vu30) objT8);
                boolean zI = b0kVar4.i(i2j0Var) | b0kVar4.i(c380VarA) | b0kVar4.g(ven0Var2) | b0kVar4.e(iX0) | (i9 == 1048576) | (i10 == 1048576);
                Object objT9 = b0kVar4.T();
                if (zI || objT9 == m4cVar2) {
                    m4cVar = m4cVar2;
                    i7 = iX0;
                    b0kVar3 = b0kVar4;
                    dk6Var = new dk6(i2j0Var, c380VarA, ven0Var2, i7, xtb0Var, iu30Var, (lnm) null);
                    i2j0Var2 = i2j0Var;
                    b0kVar3.s0(dk6Var);
                } else {
                    i2j0Var2 = i2j0Var;
                    dk6Var = objT9;
                    m4cVar = m4cVar2;
                    i7 = iX0;
                    b0kVar3 = b0kVar4;
                }
                qxd0.t(i2j0Var2, b0kVar3, (vu30) dk6Var);
                Object objT10 = b0kVar3.T();
                if (objT10 == m4cVar) {
                    lnmVarValueOf = null;
                    objT10 = v8r.q((Object) null);
                    b0kVar3.s0(objT10);
                } else {
                    lnmVarValueOf = null;
                }
                ven0 ven0Var3 = (ven0) objT10;
                String str2 = (String) ven0Var3.getValue();
                Object objT11 = b0kVar3.T();
                if (objT11 == m4cVar) {
                    objT11 = new h43(iu30Var2, ven0Var3, lnmVarValueOf, b2);
                    b0kVar3.s0(objT11);
                }
                qxd0.t(str2, b0kVar3, (vu30) objT11);
                Object objT12 = b0kVar3.T();
                if (objT12 == m4cVar) {
                    objT12 = v8r.q(lnmVarValueOf);
                    b0kVar3.s0(objT12);
                }
                ven0 ven0Var4 = (ven0) objT12;
                l5f0 l5f0Var = (l5f0) ven0Var4.getValue();
                if (l5f0Var != null) {
                    lnmVarValueOf = Integer.valueOf(l5f0Var.a);
                }
                Object objT13 = b0kVar3.T();
                if (objT13 == m4cVar) {
                    objT13 = new zqe(ven0Var4, ven0Var3, (byte) 7);
                    b0kVar3.s0(objT13);
                }
                e(i7, lnmVarValueOf, xtb0Var, (Function0) objT13, b0kVar3, ((i5 >> 12) & 896) | 3072);
                qim0 qim0VarF = dug.f(u291.f(qim0Var, 1.0f), cbx.a(b0kVar3).a.c, d4o1.a);
                float fD = vzq0Var.d();
                cvx cvxVar = cbx.b(b0kVar3).b;
                float fA = vzq0Var.a() + 16.0f;
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                zzq0 zzq0Var = new zzq0(16.0f, fD, 16.0f, fA);
                boolean zI2 = (i10 == 1048576) | b0kVar3.i(c380VarA) | ((i4 & 112) == 32) | b0kVar3.i(bqmVar) | b0kVar3.i(znb0Var) | ((i5 & 234881024) == 67108864) | ((i8 & 112) == 32) | ((i8 & 57344) == 16384) | b0kVar3.i(bzi0Var) | ((i8 & 896) == 256) | ((i8 & 7168) == 2048) | ((458752 & i8) == 131072) | ((i5 & 1879048192) == 536870912) | ((i8 & 14) == 4) | b0kVar3.i(ig31Var) | b0kVar3.i(h001Var) | b0kVar3.i(uuu0Var) | b0kVar3.i(tvu0Var) | b0kVar3.i(onu0Var) | b0kVar3.i(ysd1Var) | b0kVar3.i(r171Var) | b0kVar3.i(gv2Var) | b0kVar3.i(bgd0Var) | b0kVar3.i(d0rVar) | b0kVar3.i(zen0Var) | ((i4 & 57344) == 16384);
                Object objT14 = b0kVar3.T();
                if (zI2 || objT14 == m4cVar) {
                    o2j0 o2j0Var = new o2j0(c380VarA, b2j0Var, bqmVar, znb0Var, vzq0Var, iu30Var, z3, z6, bzi0Var, z4, z5, z7, z, z2, ig31Var, h001Var, uuu0Var, tvu0Var, onu0Var, r171Var, bgd0Var, d0rVar, ven0Var3, ven0Var4, ysd1Var, gv2Var, zen0Var, ven0Var, j2iVar);
                    b0kVar3 = b0kVar3;
                    b0kVar3.s0(o2j0Var);
                    objT14 = o2j0Var;
                }
                b0k b0kVar5 = b0kVar3;
                ujo1.d(qim0VarF, xtb0Var, zzq0Var, true, null, null, null, false, null, (iu30) objT14, b0kVar5, ((i5 >> 15) & 112) | 3072, 496);
                b0kVar2 = b0kVar5;
            } else {
                b0kVar2 = b0kVar4;
                b0kVar2.b0();
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new p2j0(d0rVar, b2j0Var, bzi0Var, r171Var, j2iVar, ig31Var, i2j0Var, h001Var, bqmVar, gv2Var, ysd1Var, bgd0Var, tvu0Var, uuu0Var, onu0Var, znb0Var, xtb0Var, qim0Var, vzq0Var, z, z2, z3, z4, z5, z6, z7, iu30Var, iu30Var2, i, i2, i3);
            }
        }

        public static final void h(ArrayList arrayList, int i, xpw xpwVar, qim0 qim0Var, b0k b0kVar, int i2) {
            int i3;
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(257770812);
            if ((i2 & 6) == 0) {
                i3 = (x340Var.g(arrayList) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= x340Var.e(i) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= x340Var.i(xpwVar) ? 256 : 128;
            }
            int i4 = i3 | 3072;
            if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
                boolean z = ((i4 & 112) == 32) | ((i4 & 14) == 4);
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    objT = o7h.s1(arrayList, i, i);
                    x340Var.s0(objT);
                }
                List list = (List) objT;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                cvx cvxVar3 = cbx.b(x340Var).b;
                cvx cvxVar4 = cbx.b(x340Var).b;
                cvx cvxVar5 = cbx.b(x340Var).b;
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarB = uyn1.B(qim0Var3, 16.0f, 0.0f, 16.0f, 12.0f, 2);
                mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
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
                mod.b(xdy.a.a(Boolean.TRUE), apo.r(-1386627086, new yvs0(list, i, xpwVar), x340Var), x340Var, 56);
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nk0(arrayList, i, xpwVar, qim0Var2, i2, (byte) 13);
            }
        }

        public static final void i(ArrayList arrayList, xpw xpwVar, lqr lqrVar, b0k b0kVar, int i) {
            int i2;
            m4c m4cVar = fkj0.X;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1518176236);
            if ((i & 6) == 0) {
                i2 = (x340Var.g(arrayList) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            xpw xpwVar2 = xpwVar;
            if ((i & 48) == 0) {
                i2 |= x340Var.i(xpwVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= (i & 512) == 0 ? x340Var.g(lqrVar) : x340Var.i(lqrVar) ? 256 : 128;
            }
            int i3 = i2;
            boolean z = false;
            boolean z2 = true;
            if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                int i4 = i3 & 896;
                boolean z3 = i4 == 256 || ((i3 & 512) != 0 && x340Var.g(lqrVar));
                Object objT = x340Var.T();
                nyy nyyVar = nyy.f;
                if (z3 || objT == m4cVar) {
                    objT = lqrVar.g(0, 0, 1, nyyVar, nyy.c);
                    x340Var.s0(objT);
                }
                vzq0 vzq0Var = (vzq0) objT;
                boolean z4 = i4 == 256 || ((i3 & 512) != 0 && x340Var.g(lqrVar));
                Object objT2 = x340Var.T();
                if (z4 || objT2 == m4cVar) {
                    objT2 = lqrVar.g(0, 0, 1, nyyVar, nyyVar);
                    x340Var.s0(objT2);
                }
                vzq0 vzq0Var2 = (vzq0) objT2;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
                x340Var.i0(812702370);
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    bhy bhyVar = (bhy) arrayList.get(i5);
                    x340Var.f0(2137053218, bhyVar.b.a);
                    boolean z5 = z;
                    otw.c(xpwVar2, bhyVar, uyn1.w(u291.f(nim0Var, 1.0f), i5 == 0 ? vzq0Var : vzq0Var2), (ipb1) null, x340Var, (i3 >> 3) & 14, 8);
                    x340Var.r(z5);
                    i5++;
                    xpwVar2 = xpwVar;
                    i3 = i3;
                    z2 = z2;
                    z = z5;
                }
                x340Var.r(z);
                x340Var.r(z2);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new jmk0(arrayList, xpwVar, lqrVar, i, (byte) 21);
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public static final void j(ArrayList arrayList, a3t0 a3t0Var, xpw xpwVar, lqr lqrVar, boolean z, boolean z2, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
            qim0 qim0Var2;
            qim0 qim0Var3;
            boolean z3;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1698148934);
            int i2 = i | (x340Var.g(arrayList) ? 4 : 2) | (x340Var.e(a3t0Var.ordinal()) ? 32 : 16) | (x340Var.i(xpwVar) ? 256 : 128) | (x340Var.g(lqrVar) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192) | (x340Var.h(z2) ? 131072 : 65536) | (x340Var.i(function0) ? 1048576 : 524288) | (x340Var.i(function1) ? 8388608 : 4194304) | 100663296;
            if (x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
                int integer = ((Resources) x340Var.k(AndroidCompositionLocals_androidKt.c)).getInteger(2131492959);
                qim0 qim0Var4 = nim0.a;
                qim0 qim0VarN = anm1.N("pins_section_test_tag", u291.f(qim0Var4, 1.0f));
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                if (z2) {
                    x340Var.i0(-756173717);
                    int i3 = i2 >> 15;
                    qim0Var3 = qim0Var4;
                    k(((i2 >> 12) & 14) | (i3 & 112) | (i3 & 896), function0, function1, x340Var, null, z);
                    z3 = false;
                    x340Var.r(false);
                } else {
                    qim0Var3 = qim0Var4;
                    z3 = false;
                    x340Var.i0(-756001698);
                    x340Var.r(false);
                }
                int iOrdinal = a3t0Var.ordinal();
                if (iOrdinal == 0) {
                    x340Var.i0(-440027121);
                    int i4 = i2 & 14;
                    int i5 = i2 >> 3;
                    i(arrayList, xpwVar, lqrVar, x340Var, (i5 & 896) | i4 | (i5 & 112));
                    x340Var.r(false);
                } else {
                    if (iOrdinal != 1 && iOrdinal != 2) {
                        throw p3d1.k(x340Var, -440028548, z3);
                    }
                    x340Var.i0(-755789162);
                    if (z2t0.a[a3t0Var.ordinal()] != 1) {
                        integer++;
                    }
                    h(arrayList, integer, xpwVar, null, x340Var, i2 & 910);
                    x340Var.r(false);
                }
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new aa6(arrayList, a3t0Var, xpwVar, lqrVar, z, z2, function0, function1, qim0Var2, i);
            }
        }

        public static final void k(int i, Function0 function0, Function0 function1, b0k b0kVar, qim0 qim0Var, boolean z) {
            int i2;
            x340 x340Var;
            qim0 qim0Var2;
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.k0(-1335747053);
            if ((i & 6) == 0) {
                i2 = (x340Var2.h(z) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var2.i(function0) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var2.i(function1) ? 256 : 128;
            }
            int i3 = i2 | 3072;
            if (x340Var2.Y(i3 & 1, (i3 & 1171) != 1170)) {
                qim0Var2 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                qim0 qim0VarB = uyn1.B(qim0VarF, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var2, 54);
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
                nko1.H(jw31VarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                String strO0 = cwl1.o0(x340Var2, 2131964126);
                lee1 lee1Var = cbx.d(x340Var2).f;
                Object objT = x340Var2.T();
                if (objT == fkj0.X) {
                    objT = egs0.X0;
                    x340Var2.s0(objT);
                }
                uwo1.e(strO0, s161.b(qim0Var2, false, (iu30) objT), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
                x340 x340Var3 = x340Var2;
                kk0.s(1.0f, true, x340Var3);
                if (z) {
                    x340Var3.i0(482748660);
                    foo1.c(new gbx(z50.c, function1), ldx.c, anm1.N("pins_edit_button_test_tag", qim0Var2), null, yla.s(x340Var3), null, null, null, null, null, p7j.a, x340Var3, 432, 48, 2008);
                    x340Var3 = x340Var3;
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(483084235);
                    x340Var3.r(false);
                }
                String strO1 = cwl1.o0(x340Var3, 2131964091);
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                x340 x340Var4 = x340Var3;
                wro1.h(new gbx(new y50(strO1), function0), ldx.c, null, null, yla.s(x340Var4), null, false, null, null, p7j.b, x340Var4, 48, 6, 988);
                x340Var = x340Var4;
                x340Var.r(true);
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new y2t0(z, function0, function1, qim0Var2, i);
            }
        }

        public static final void l(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
            qim0 qim0Var2;
            boolean z2;
            h2c h2cVar;
            qim0 qim0Var3;
            x340 x340Var;
            boolean z3;
            String strK;
            jax haxVar;
            gra graVar = een.g;
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.k0(-1778042238);
            j06 j06Var = x340Var2.a;
            int i2 = i | (x340Var2.i(function0) ? 4 : 2) | 48 | (x340Var2.g(str) ? 256 : 128) | (x340Var2.g(str2) ? 2048 : 1024) | (x340Var2.h(z) ? 16384 : 8192);
            if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
                qim0 qim0Var4 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
                uwr uwrVar = cbx.a;
                float f = cbx.b(x340Var2).b.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                qim0 qim0VarY = uyn1.y(qim0VarF, 4.0f, f);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                boolean z4 = x340Var2.S;
                n4k n4kVar = hmb0.t1;
                if (z4) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar3);
                nko1.F(x340Var2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                h2c h2cVar2 = h2c.a;
                if (str2 == null) {
                    x340Var2.i0(-1548047412);
                    ldx ldxVar = ldx.c;
                    boolean z5 = (i2 & 14) == 4;
                    Object objT = x340Var2.T();
                    if (z5 || objT == fkj0.X) {
                        objT = new sah1(function0, (byte) 17);
                        x340Var2.s0(objT);
                    }
                    gbx gbxVar = new gbx(z50.c, (Function0) objT);
                    if (z) {
                        x340Var2.i0(-742668260);
                        x340Var2.r(false);
                        haxVar = jax.a;
                    } else {
                        x340Var2.i0(-742666255);
                        haxVar = new hax(cwl1.o0(x340Var2, 2131963554));
                        x340Var2.r(false);
                    }
                    wro1.h(gbxVar, ldxVar, h2cVar2.a(qim0Var4, graVar), haxVar, null, null, false, null, null, vpj.a, x340Var2, 0, 6, 1000);
                    x340Var = x340Var2;
                    x340Var.r(false);
                    z2 = false;
                    qim0Var3 = qim0Var4;
                    h2cVar = h2cVar2;
                    z3 = true;
                } else {
                    x340Var2.i0(-1547327902);
                    z2 = false;
                    h2cVar = h2cVar2;
                    qim0Var3 = qim0Var4;
                    qim0 qim0VarX = bin.x(h2cVar2.a(qim0Var4, graVar), z, null, new pm31(0), null, function0, 10);
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarX);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(jw31VarA, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    w0h1.a(olx.c, new jsl(cwl1.o0(x340Var2, 2131963554)), u291.r(qim0Var3, 24.0f), 0L, 0L, false, x340Var2, olx.d, 56);
                    uwo1.e(str2, null, cbx.d(x340Var2).g, 0L, null, null, 0, false, null, 0, null, x340Var2, (i2 >> 9) & 14, 0, 2042);
                    x340Var = x340Var2;
                    z3 = true;
                    x340Var.r(true);
                    x340Var.r(false);
                }
                if (str == null) {
                    strK = x0d.k(x340Var, -742631325, 2131963556, x340Var, z2);
                } else {
                    x340Var.i0(-742631790);
                    x340Var.r(z2);
                    strK = str;
                }
                x340 x340Var3 = x340Var;
                uwo1.e(strK, h2cVar.a(qim0Var3, een.h), lee1.a(cbx.d(x340Var).h, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 3, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16744447), 0L, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2040);
                x340Var2 = x340Var3;
                x340Var2.r(z3);
                qim0Var2 = qim0Var3;
            } else {
                x340Var2.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var2.v();
            if (h311VarV != null) {
                h311VarV.d = new br30(function0, qim0Var2, str, str2, z, i);
            }
        }

        public static final void m(boolean z, String str, c380 c380Var, bqm bqmVar, znb0 znb0Var, qim0 qim0Var, b0k b0kVar, int i) {
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1984396226);
            int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.g(c380Var) ? 256 : 128) | (x340Var.i(bqmVar) ? 2048 : 1024) | (x340Var.i(znb0Var) ? 16384 : 8192) | 196608;
            if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
                Object[] objArr = new Object[0];
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = z7i0.Y;
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, x340Var, 48);
                Object[] objArr2 = new Object[0];
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = z7i0.X;
                    x340Var.s0(objT2);
                }
                ven0 ven0Var2 = (ven0) k5p1.s(objArr2, (Function0) objT2, x340Var, 48);
                Boolean bool = (Boolean) ven0Var.getValue();
                bool.getClass();
                boolean zG = x340Var.g(ven0Var) | x340Var.g(ven0Var2);
                Object objT3 = x340Var.T();
                if (zG || objT3 == m4cVar) {
                    objT3 = new pg6(ven0Var, ven0Var2, (lnm) null, (byte) 3);
                    x340Var.s0(objT3);
                }
                qxd0.t(bool, x340Var, (vu30) objT3);
                fq7.g(((Boolean) ven0Var2.getValue()).booleanValue(), (qim0) null, bby.b, xay.f(3, (ni20) null).a(xay.r(3, (iu30) null)), (String) null, apo.r(1930823270, new j6v(znb0Var, c380Var, ven0Var, bqmVar, z, str), x340Var), x340Var, 199680, 18);
                qim0Var2 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new wr1(z, str, (Object) c380Var, (Object) bqmVar, (Object) znb0Var, qim0Var2, i, (byte) 15);
            }
        }

        public static final void n(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
            b0k b0kVar2;
            idx idxVar;
            m4c m4cVar = fkj0.X;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(1052614902);
            int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024);
            if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
                boolean z2 = (i2 & 7168) == 2048;
                Object objT = b0kVar3.T();
                if (z2 || objT == m4cVar) {
                    objT = new uuc1(function0, (byte) 4);
                    b0kVar3.s0(objT);
                }
                gbx gbxVar = new gbx(z50.c, (Function0) objT);
                if (z) {
                    b0kVar3.i0(894602712);
                    b0kVar3.r(false);
                    idxVar = new idx(6);
                } else {
                    b0kVar3.i0(894738151);
                    Object objT2 = b0kVar3.T();
                    if (objT2 == m4cVar) {
                        objT2 = osc1.f;
                        b0kVar3.s0(objT2);
                    }
                    vu30 vu30Var = (vu30) objT2;
                    Object objT3 = b0kVar3.T();
                    if (objT3 == m4cVar) {
                        objT3 = osc1.g;
                        b0kVar3.s0(objT3);
                    }
                    idx hdxVar = new hdx(1, vu30Var, (vu30) objT3, (vu30) null, (hw61) null, 24);
                    b0kVar3.r(false);
                    idxVar = hdxVar;
                }
                boolean z3 = (i2 & 112) == 32;
                Object objT4 = b0kVar3.T();
                if (z3 || objT4 == m4cVar) {
                    objT4 = new hqa1(str2, (byte) 12);
                    b0kVar3.s0(objT4);
                }
                b0kVar2 = b0kVar3;
                foo1.c(gbxVar, idxVar, s161.b(qim0Var, false, (iu30) objT4), null, null, null, null, null, null, null, apo.r(-843302121, new nl41(str, (byte) 27), b0kVar3), b0kVar2, 0, 48, 2040);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new br30(str, str2, z, function0, qim0Var, i, (byte) 4);
            }
        }

        public static final void o(String str, r061 r061Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
            x340 x340Var;
            qim0 qim0Var2;
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.k0(508335915);
            int i2 = (x340Var2.g(str) ? 4 : 2) | i;
            if ((i & 48) == 0) {
                i2 |= x340Var2.g(r061Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var2.i(function0) ? 256 : 128;
            }
            int i3 = i2 | 3072;
            if (x340Var2.Y(i3 & 1, (i3 & 1171) != 1170)) {
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                uwr uwrVar = cbx.a;
                long jA = cbx.a(x340Var2).a.b.a();
                cua cuaVar = cbx.b(x340Var2).f;
                qim0 qim0VarZ = u291.z(dug.f(qim0VarF, jA, er31.b(16.0f)), (fra) null, 3);
                cvx cvxVar = cbx.b(x340Var2).b;
                qim0 qim0VarX = bin.x(uyn1.x(qim0VarZ, 16.0f), false, null, null, null, function0, 15);
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
                b(r061Var, null, x340Var2, (i3 >> 3) & 14, 2);
                uwo1.e(str, null, cbx.d(x340Var2).g, u7h.f, null, null, 0, false, null, 0, null, x340Var2, i3 & 14, 0, 2034);
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
                h311VarV.d = new a8m(i, str, r061Var, function0, qim0Var2, (byte) 3);
            }
        }

        /* JADX WARN: Code duplicated, block: B:30:0x004f  */
        /* JADX WARN: Code duplicated, block: B:32:0x0054  */
        /* JADX WARN: Code duplicated, block: B:34:0x0058  */
        /* JADX WARN: Code duplicated, block: B:36:0x0060  */
        /* JADX WARN: Code duplicated, block: B:37:0x0063  */
        /* JADX WARN: Code duplicated, block: B:41:0x006a  */
        /* JADX WARN: Code duplicated, block: B:43:0x006f  */
        /* JADX WARN: Code duplicated, block: B:45:0x0073  */
        /* JADX WARN: Code duplicated, block: B:47:0x007b  */
        /* JADX WARN: Code duplicated, block: B:48:0x007e  */
        /* JADX WARN: Code duplicated, block: B:52:0x0087  */
        /* JADX WARN: Code duplicated, block: B:54:0x008b  */
        /* JADX WARN: Code duplicated, block: B:56:0x008e  */
        /* JADX WARN: Code duplicated, block: B:58:0x0096  */
        /* JADX WARN: Code duplicated, block: B:59:0x0099  */
        /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:68:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:80:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:81:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:83:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:84:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:86:0x00df  */
        /* JADX WARN: Code duplicated, block: B:87:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:92:0x010c  */
        /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
        public static final void p(Function0 function0, qim0 qim0Var, String str, String str2, boolean z, boolean z2, j2i j2iVar, b0k b0kVar, int i, int i2) {
            int i3;
            String str3;
            int i4;
            String str4;
            int i5;
            int i6;
            boolean z3;
            int i7;
            int i8;
            int i9;
            boolean z4;
            boolean z5;
            String str5;
            String str6;
            boolean z6;
            h311 h311VarV;
            String str7;
            boolean z7;
            boolean z8;
            int i10;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-721243205);
            if ((i & 6) == 0) {
                i3 = (x340Var.i(function0) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= x340Var.i(qim0Var) ? 32 : 16;
            }
            int i11 = i2 & 4;
            if (i11 == 0) {
                if ((i & 384) == 0) {
                    str3 = str;
                    i3 |= x340Var.g(str3) ? 256 : 128;
                }
                i4 = i2 & 8;
                if (i4 != 0) {
                    if ((i & 3072) == 0) {
                        str4 = str2;
                        if (x340Var.g(str4)) {
                            i5 = 2048;
                        } else {
                            i5 = 1024;
                        }
                        i3 |= i5;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            z3 = z;
                            if (x340Var.h(z3)) {
                                i7 = 16384;
                            } else {
                                i7 = 8192;
                            }
                            i3 |= i7;
                        }
                        i8 = i2 & 32;
                        if (i8 != 0) {
                            if ((196608 & i) == 0) {
                                if (x340Var.h(z2)) {
                                    i9 = 131072;
                                } else {
                                    i9 = 65536;
                                }
                                i3 |= i9;
                            }
                            if ((1572864 & i) != 0) {
                                if (x340Var.i(j2iVar)) {
                                    i10 = 1048576;
                                } else {
                                    i10 = 524288;
                                }
                                i3 |= i10;
                            }
                            if ((599187 & i3) != 599186) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (x340Var.Y(i3 & 1, z4)) {
                                if (i11 != 0) {
                                    str5 = null;
                                } else {
                                    str5 = str3;
                                }
                                if (i4 != 0) {
                                    str7 = null;
                                } else {
                                    str7 = str4;
                                }
                                if (i6 != 0) {
                                    z7 = true;
                                } else {
                                    z7 = z3;
                                }
                                if (i8 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z2;
                                }
                                nyx.a(2, (wux) null, apo.r(481216334, new vl(qim0Var, function0, str5, str7, z7, z8, j2iVar), x340Var), x340Var, 3078, 6);
                                str6 = str7;
                                z6 = z7;
                                z5 = z8;
                            } else {
                                x340Var.b0();
                                z5 = z2;
                                str5 = str3;
                                str6 = str4;
                                z6 = z3;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new vu(function0, qim0Var, str5, str6, z6, z5, j2iVar, i, i2);
                            }
                        }
                        i3 |= 196608;
                        if ((1572864 & i) != 0) {
                            if (x340Var.i(j2iVar)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                        if ((599187 & i3) != 599186) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (x340Var.Y(i3 & 1, z4)) {
                            if (i11 != 0) {
                                str5 = null;
                            } else {
                                str5 = str3;
                            }
                            if (i4 != 0) {
                                str7 = null;
                            } else {
                                str7 = str4;
                            }
                            if (i6 != 0) {
                                z7 = true;
                            } else {
                                z7 = z3;
                            }
                            if (i8 != 0) {
                                z8 = false;
                            } else {
                                z8 = z2;
                            }
                            nyx.a(2, (wux) null, apo.r(481216334, new vl(qim0Var, function0, str5, str7, z7, z8, j2iVar), x340Var), x340Var, 3078, 6);
                            str6 = str7;
                            z6 = z7;
                            z5 = z8;
                        } else {
                            x340Var.b0();
                            z5 = z2;
                            str5 = str3;
                            str6 = str4;
                            z6 = z3;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new vu(function0, qim0Var, str5, str6, z6, z5, j2iVar, i, i2);
                        }
                    }
                    i3 |= 24576;
                    z3 = z;
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            if (x340Var.h(z2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((1572864 & i) != 0) {
                            if (x340Var.i(j2iVar)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                        if ((599187 & i3) != 599186) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (x340Var.Y(i3 & 1, z4)) {
                            if (i11 != 0) {
                                str5 = null;
                            } else {
                                str5 = str3;
                            }
                            if (i4 != 0) {
                                str7 = null;
                            } else {
                                str7 = str4;
                            }
                            if (i6 != 0) {
                                z7 = true;
                            } else {
                                z7 = z3;
                            }
                            if (i8 != 0) {
                                z8 = false;
                            } else {
                                z8 = z2;
                            }
                            nyx.a(2, (wux) null, apo.r(481216334, new vl(qim0Var, function0, str5, str7, z7, z8, j2iVar), x340Var), x340Var, 3078, 6);
                            str6 = str7;
                            z6 = z7;
                            z5 = z8;
                        } else {
                            x340Var.b0();
                            z5 = z2;
                            str5 = str3;
                            str6 = str4;
                            z6 = z3;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new vu(function0, qim0Var, str5, str6, z6, z5, j2iVar, i, i2);
                        }
                    }
                    i3 |= 196608;
                    if ((1572864 & i) != 0) {
                        if (x340Var.i(j2iVar)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599187 & i3) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (x340Var.Y(i3 & 1, z4)) {
                        if (i11 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i4 != 0) {
                            str7 = null;
                        } else {
                            str7 = str4;
                        }
                        if (i6 != 0) {
                            z7 = true;
                        } else {
                            z7 = z3;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        } else {
                            z8 = z2;
                        }
                        nyx.a(2, (wux) null, apo.r(481216334, new vl(qim0Var, function0, str5, str7, z7, z8, j2iVar), x340Var), x340Var, 3078, 6);
                        str6 = str7;
                        z6 = z7;
                        z5 = z8;
                    } else {
                        x340Var.b0();
                        z5 = z2;
                        str5 = str3;
                        str6 = str4;
                        z6 = z3;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu(function0, qim0Var, str5, str6, z6, z5, j2iVar, i, i2);
                    }
                }
                i3 |= 3072;
                str4 = str2;
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        z3 = z;
                        if (x340Var.h(z3)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            if (x340Var.h(z2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((1572864 & i) != 0) {
                            if (x340Var.i(j2iVar)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                        if ((599187 & i3) != 599186) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (x340Var.Y(i3 & 1, z4)) {
                            if (i11 != 0) {
                                str5 = null;
                            } else {
                                str5 = str3;
                            }
                            if (i4 != 0) {
                                str7 = null;
                            } else {
                                str7 = str4;
                            }
                            if (i6 != 0) {
                                z7 = true;
                            } else {
                                z7 = z3;
                            }
                            if (i8 != 0) {
                                z8 = false;
                            } else {
                                z8 = z2;
                            }
                            nyx.a(2, (wux) null, apo.r(481216334, new vl(qim0Var, function0, str5, str7, z7, z8, j2iVar), x340Var), x340Var, 3078, 6);
                            str6 = str7;
                            z6 = z7;
                            z5 = z8;
                        } else {
                            x340Var.b0();
                            z5 = z2;
                            str5 = str3;
                            str6 = str4;
                            z6 = z3;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new vu(function0, qim0Var, str5, str6, z6, z5, j2iVar, i, i2);
                        }
                    }
                    i3 |= 196608;
                    if ((1572864 & i) != 0) {
                        if (x340Var.i(j2iVar)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599187 & i3) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (x340Var.Y(i3 & 1, z4)) {
                        if (i11 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i4 != 0) {
                            str7 = null;
                        } else {
                            str7 = str4;
                        }
                        if (i6 != 0) {
                            z7 = true;
                        } else {
                            z7 = z3;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        } else {
                            z8 = z2;
                        }
                        nyx.a(2, (wux) null, apo.r(481216334, new vl(qim0Var, function0, str5, str7, z7, z8, j2iVar), x340Var), x340Var, 3078, 6);
                        str6 = str7;
                        z6 = z7;
                        z5 = z8;
                    } else {
                        x340Var.b0();
                        z5 = z2;
                        str5 = str3;
                        str6 = str4;
                        z6 = z3;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu(function0, qim0Var, str5, str6, z6, z5, j2iVar, i, i2);
                    }
                }
                i3 |= 24576;
                z3 = z;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        if (x340Var.h(z2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) != 0) {
                        if (x340Var.i(j2iVar)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599187 & i3) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (x340Var.Y(i3 & 1, z4)) {
                        if (i11 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i4 != 0) {
                            str7 = null;
                        } else {
                            str7 = str4;
                        }
                        if (i6 != 0) {
                            z7 = true;
                        } else {
                            z7 = z3;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        } else {
                            z8 = z2;
                        }
                        nyx.a(2, (wux) null, apo.r(481216334, new vl(qim0Var, function0, str5, str7, z7, z8, j2iVar), x340Var), x340Var, 3078, 6);
                        str6 = str7;
                        z6 = z7;
                        z5 = z8;
                    } else {
                        x340Var.b0();
                        z5 = z2;
                        str5 = str3;
                        str6 = str4;
                        z6 = z3;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu(function0, qim0Var, str5, str6, z6, z5, j2iVar, i, i2);
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) != 0) {
                    if (x340Var.i(j2iVar)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599187 & i3) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (x340Var.Y(i3 & 1, z4)) {
                    if (i11 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i4 != 0) {
                        str7 = null;
                    } else {
                        str7 = str4;
                    }
                    if (i6 != 0) {
                        z7 = true;
                    } else {
                        z7 = z3;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    } else {
                        z8 = z2;
                    }
                    nyx.a(2, (wux) null, apo.r(481216334, new vl(qim0Var, function0, str5, str7, z7, z8, j2iVar), x340Var), x340Var, 3078, 6);
                    str6 = str7;
                    z6 = z7;
                    z5 = z8;
                } else {
                    x340Var.b0();
                    z5 = z2;
                    str5 = str3;
                    str6 = str4;
                    z6 = z3;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu(function0, qim0Var, str5, str6, z6, z5, j2iVar, i, i2);
                }
            }
            i3 |= 384;
            str3 = str;
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    str4 = str2;
                    if (x340Var.g(str4)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        z3 = z;
                        if (x340Var.h(z3)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            if (x340Var.h(z2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((1572864 & i) != 0) {
                            if (x340Var.i(j2iVar)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                        if ((599187 & i3) != 599186) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (x340Var.Y(i3 & 1, z4)) {
                            if (i11 != 0) {
                                str5 = null;
                            } else {
                                str5 = str3;
                            }
                            if (i4 != 0) {
                                str7 = null;
                            } else {
                                str7 = str4;
                            }
                            if (i6 != 0) {
                                z7 = true;
                            } else {
                                z7 = z3;
                            }
                            if (i8 != 0) {
                                z8 = false;
                            } else {
                                z8 = z2;
                            }
                            nyx.a(2, (wux) null, apo.r(481216334, new vl(qim0Var, function0, str5, str7, z7, z8, j2iVar), x340Var), x340Var, 3078, 6);
                            str6 = str7;
                            z6 = z7;
                            z5 = z8;
                        } else {
                            x340Var.b0();
                            z5 = z2;
                            str5 = str3;
                            str6 = str4;
                            z6 = z3;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new vu(function0, qim0Var, str5, str6, z6, z5, j2iVar, i, i2);
                        }
                    }
                    i3 |= 196608;
                    if ((1572864 & i) != 0) {
                        if (x340Var.i(j2iVar)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599187 & i3) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (x340Var.Y(i3 & 1, z4)) {
                        if (i11 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i4 != 0) {
                            str7 = null;
                        } else {
                            str7 = str4;
                        }
                        if (i6 != 0) {
                            z7 = true;
                        } else {
                            z7 = z3;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        } else {
                            z8 = z2;
                        }
                        nyx.a(2, (wux) null, apo.r(481216334, new vl(qim0Var, function0, str5, str7, z7, z8, j2iVar), x340Var), x340Var, 3078, 6);
                        str6 = str7;
                        z6 = z7;
                        z5 = z8;
                    } else {
                        x340Var.b0();
                        z5 = z2;
                        str5 = str3;
                        str6 = str4;
                        z6 = z3;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu(function0, qim0Var, str5, str6, z6, z5, j2iVar, i, i2);
                    }
                }
                i3 |= 24576;
                z3 = z;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        if (x340Var.h(z2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) != 0) {
                        if (x340Var.i(j2iVar)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599187 & i3) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (x340Var.Y(i3 & 1, z4)) {
                        if (i11 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i4 != 0) {
                            str7 = null;
                        } else {
                            str7 = str4;
                        }
                        if (i6 != 0) {
                            z7 = true;
                        } else {
                            z7 = z3;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        } else {
                            z8 = z2;
                        }
                        nyx.a(2, (wux) null, apo.r(481216334, new vl(qim0Var, function0, str5, str7, z7, z8, j2iVar), x340Var), x340Var, 3078, 6);
                        str6 = str7;
                        z6 = z7;
                        z5 = z8;
                    } else {
                        x340Var.b0();
                        z5 = z2;
                        str5 = str3;
                        str6 = str4;
                        z6 = z3;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu(function0, qim0Var, str5, str6, z6, z5, j2iVar, i, i2);
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) != 0) {
                    if (x340Var.i(j2iVar)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599187 & i3) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (x340Var.Y(i3 & 1, z4)) {
                    if (i11 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i4 != 0) {
                        str7 = null;
                    } else {
                        str7 = str4;
                    }
                    if (i6 != 0) {
                        z7 = true;
                    } else {
                        z7 = z3;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    } else {
                        z8 = z2;
                    }
                    nyx.a(2, (wux) null, apo.r(481216334, new vl(qim0Var, function0, str5, str7, z7, z8, j2iVar), x340Var), x340Var, 3078, 6);
                    str6 = str7;
                    z6 = z7;
                    z5 = z8;
                } else {
                    x340Var.b0();
                    z5 = z2;
                    str5 = str3;
                    str6 = str4;
                    z6 = z3;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu(function0, qim0Var, str5, str6, z6, z5, j2iVar, i, i2);
                }
            }
            i3 |= 3072;
            str4 = str2;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    z3 = z;
                    if (x340Var.h(z3)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        if (x340Var.h(z2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) != 0) {
                        if (x340Var.i(j2iVar)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599187 & i3) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (x340Var.Y(i3 & 1, z4)) {
                        if (i11 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i4 != 0) {
                            str7 = null;
                        } else {
                            str7 = str4;
                        }
                        if (i6 != 0) {
                            z7 = true;
                        } else {
                            z7 = z3;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        } else {
                            z8 = z2;
                        }
                        nyx.a(2, (wux) null, apo.r(481216334, new vl(qim0Var, function0, str5, str7, z7, z8, j2iVar), x340Var), x340Var, 3078, 6);
                        str6 = str7;
                        z6 = z7;
                        z5 = z8;
                    } else {
                        x340Var.b0();
                        z5 = z2;
                        str5 = str3;
                        str6 = str4;
                        z6 = z3;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu(function0, qim0Var, str5, str6, z6, z5, j2iVar, i, i2);
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) != 0) {
                    if (x340Var.i(j2iVar)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599187 & i3) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (x340Var.Y(i3 & 1, z4)) {
                    if (i11 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i4 != 0) {
                        str7 = null;
                    } else {
                        str7 = str4;
                    }
                    if (i6 != 0) {
                        z7 = true;
                    } else {
                        z7 = z3;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    } else {
                        z8 = z2;
                    }
                    nyx.a(2, (wux) null, apo.r(481216334, new vl(qim0Var, function0, str5, str7, z7, z8, j2iVar), x340Var), x340Var, 3078, 6);
                    str6 = str7;
                    z6 = z7;
                    z5 = z8;
                } else {
                    x340Var.b0();
                    z5 = z2;
                    str5 = str3;
                    str6 = str4;
                    z6 = z3;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu(function0, qim0Var, str5, str6, z6, z5, j2iVar, i, i2);
                }
            }
            i3 |= 24576;
            z3 = z;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    if (x340Var.h(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) != 0) {
                    if (x340Var.i(j2iVar)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599187 & i3) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (x340Var.Y(i3 & 1, z4)) {
                    if (i11 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i4 != 0) {
                        str7 = null;
                    } else {
                        str7 = str4;
                    }
                    if (i6 != 0) {
                        z7 = true;
                    } else {
                        z7 = z3;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    } else {
                        z8 = z2;
                    }
                    nyx.a(2, (wux) null, apo.r(481216334, new vl(qim0Var, function0, str5, str7, z7, z8, j2iVar), x340Var), x340Var, 3078, 6);
                    str6 = str7;
                    z6 = z7;
                    z5 = z8;
                } else {
                    x340Var.b0();
                    z5 = z2;
                    str5 = str3;
                    str6 = str4;
                    z6 = z3;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu(function0, qim0Var, str5, str6, z6, z5, j2iVar, i, i2);
                }
            }
            i3 |= 196608;
            if ((1572864 & i) != 0) {
                if (x340Var.i(j2iVar)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((599187 & i3) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var.Y(i3 & 1, z4)) {
                if (i11 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i4 != 0) {
                    str7 = null;
                } else {
                    str7 = str4;
                }
                if (i6 != 0) {
                    z7 = true;
                } else {
                    z7 = z3;
                }
                if (i8 != 0) {
                    z8 = false;
                } else {
                    z8 = z2;
                }
                nyx.a(2, (wux) null, apo.r(481216334, new vl(qim0Var, function0, str5, str7, z7, z8, j2iVar), x340Var), x340Var, 3078, 6);
                str6 = str7;
                z6 = z7;
                z5 = z8;
            } else {
                x340Var.b0();
                z5 = z2;
                str5 = str3;
                str6 = str4;
                z6 = z3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu(function0, qim0Var, str5, str6, z6, z5, j2iVar, i, i2);
            }
        }

        public static final d50 q(iu30 iu30Var, Set set, vu30 vu30Var) {
            return new d50(Collections.singletonMap(rih1.a, set), vu30Var);
        }

        public static void r(l670 l670Var, View view, y570 y570Var) {
            view.setOnClickListener((y570Var.t() != null || y570Var.j().containsKey("click")) ? new p4x(y570Var, l670Var, (byte) 2) : null);
            boolean z = y570Var.t() != null || y570Var.j().containsKey("click");
            view.setClickable(z);
            view.setFocusable(z);
        }

        public static final boolean s(w1j0 w1j0Var, boolean z) {
            return z && (w1j0Var.getModerationStatus() instanceof g1j0);
        }

        public static final Map u(ArrayList arrayList) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashMap.putAll((Map) it.next());
            }
            return sqg0.U(linkedHashMap);
        }

        public static final void v(dnc0 dnc0Var, mr20 mr20Var, boolean z, iu30 iu30Var) {
            dnc0Var.b(new gj50(new hdo(mr20Var, (byte) 2), z), iu30Var);
        }

        public static final Map w(List list) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                LinkedHashMap linkedHashMap = ((tg50) it.next()).b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), ((wrw) entry.getValue()).d());
                }
                arrayList.add(linkedHashMap2);
            }
            return u(arrayList);
        }

        public static final vtw x(e50 e50Var, epb1 epb1Var, iac0 iac0Var) {
            if (e50Var instanceof d50) {
                vu30 vu30Var = ((d50) e50Var).b;
                w0h1.o(2, vu30Var);
                return (vtw) vu30Var.invoke(epb1Var, iac0Var);
            }
            if (e50Var instanceof c50) {
                hhg1.h("DataPool variant not supported in this context. Use metadata variant instead.");
                return null;
            }
            if (e50Var == null) {
                return null;
            }
            eg.o();
            return null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static wo01 y(RecentlyPlayedEntity recentlyPlayedEntity) {
            n9x0 n9x0Var = n9x0.e;
            m9x0 m9x0Var = m9x0.e;
            Integer num = null;
            switch (recentlyPlayedEntity.getDerivedData().a.ordinal()) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    return recentlyPlayedEntity.isLoading$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed() ? zo01.a : new uo01(2131960940, Collections.singletonList(recentlyPlayedEntity.getArtistName()));
                case 1:
                    return recentlyPlayedEntity.isLoading$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed() ? zo01.a : new uo01(2131960941);
                case 2:
                case 3:
                    return m9x0Var;
                case 4:
                    if (recentlyPlayedEntity.getSubtitle().length() > 0) {
                        return new vo01(recentlyPlayedEntity.getSubtitle());
                    }
                    return m9x0Var;
                case 5:
                    if (recentlyPlayedEntity.isLoading$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed()) {
                        return zo01.a;
                    }
                    if (recentlyPlayedEntity.getSubtitle().length() > 0) {
                        return new vo01(recentlyPlayedEntity.getSubtitle());
                    }
                    return m9x0Var;
                case 6:
                    if (recentlyPlayedEntity.isLoading$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed()) {
                        return zo01.a;
                    }
                    String madeForName = recentlyPlayedEntity.getMadeForName();
                    if (madeForName == null || madeForName.length() == 0) {
                        return (recentlyPlayedEntity.isOwnedBySelf() || recentlyPlayedEntity.getOwnerName().length() <= 0) ? new uo01(2131960946) : new uo01(2131960947, Collections.singletonList(recentlyPlayedEntity.getOwnerName()));
                    }
                    return new uo01(2131960944, Collections.singletonList(recentlyPlayedEntity.getMadeForName()));
                case 7:
                    return recentlyPlayedEntity.isLoading$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed() ? zo01.a : new uo01(2131960951);
                case 8:
                    Set set = s4b1.f;
                    s4b1 s4b1VarX = uic.x(aqz0.a(recentlyPlayedEntity.getLink()));
                    blc0 blc0Var = s4b1VarX.c;
                    if (recentlyPlayedEntity.getSubtitle().length() > 0 && blc0Var == blc0.Uh) {
                        return new vo01(recentlyPlayedEntity.getSubtitle());
                    }
                    v5b1 v5b1Var = s4b1VarX.d;
                    b3i1 type = v5b1Var != null ? v5b1Var.getType() : null;
                    if (type == nyu0.e || type == wyu0.f) {
                        num = 2131960826;
                    } else {
                        int iOrdinal = blc0Var.ordinal();
                        if (iOrdinal == 30) {
                            num = 2131960823;
                        } else if (iOrdinal == 44) {
                            num = 2131960824;
                        } else if (iOrdinal == 111) {
                            num = 2131960825;
                        } else if (iOrdinal == 926) {
                            num = 2131960827;
                        }
                    }
                    return num != null ? new uo01(num.intValue()) : n9x0Var;
                case 9:
                    if (recentlyPlayedEntity.isLoading$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed()) {
                        return zo01.a;
                    }
                    if (!recentlyPlayedEntity.isBook() || recentlyPlayedEntity.getPublisher().length() <= 0) {
                        return recentlyPlayedEntity.getDerivedData().b == f281.c ? new uo01(2131960952, Collections.singletonList(recentlyPlayedEntity.getPublisher())) : new uo01(2131960948, Collections.singletonList(recentlyPlayedEntity.getPublisher()));
                    }
                    return new uo01(2131960942, Collections.singletonList(recentlyPlayedEntity.getPublisher()));
                case 10:
                    return recentlyPlayedEntity.isLoading$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed() ? zo01.a : new uo01(2131960949, Collections.singletonList(recentlyPlayedEntity.getArtistName()));
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    return n9x0Var;
                default:
                    eg.o();
                    return null;
            }
        }

        public static wo01 z(RecentlyPlayedEntity recentlyPlayedEntity) {
            switch (recentlyPlayedEntity.getDerivedData().a.ordinal()) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                case 1:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    return new vo01(recentlyPlayedEntity.getName());
                case 2:
                    return new uo01(2131960943);
                case 3:
                    return new uo01(2131960953);
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    return n9x0.e;
                default:
                    eg.o();
                    return null;
            }
        }

        public abstract zxx t(b0k b0kVar);
    }
