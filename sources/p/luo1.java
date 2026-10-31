package p;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.ui.graphics.ColorFilter;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class luo1 {
    public static b180 a;

    public static final void a(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(887354653);
        int i2 = i | (b0kVar2.h(z) ? 4 : 2) | 48;
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = (i2 & 14) == 4;
            Object objT = b0kVar2.T();
            if (z2 || objT == fkj0.X) {
                objT = Integer.valueOf(z ? 2131953299 : 2131953300);
                b0kVar2.s0(objT);
            }
            int iIntValue = ((Number) objT).intValue();
            uwr uwrVar = cbx.a;
            float f = cbx.b(b0kVar2).b.b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = uyn1.x(qim0Var3, f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarX);
            hzj.A.getClass();
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
            cbx.a.getClass();
            ecx ecxVarD = uwr.d();
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0Var2 = qim0Var3;
            eso1.g(cyo1.x(b0kVar2, 2131231207), isl.a, uyn1.y(qim0VarF, 38.0f, 12.0f), (p3v) null, (zvx) null, ecxVarD, mif1.Q0, (tl3) null, (ColorFilter) null, b0kVar2, 48, 408);
            b0kVar2 = b0kVar2;
            uwo1.e(cwl1.o0(b0kVar2, iIntValue), u291.f(qim0Var2, 1.0f), cbx.d(b0kVar2).e, cbx.a(b0kVar2).b.a, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2016);
            qim0 qim0VarF2 = u291.f(qim0Var2, 1.0f);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            uwo1.e(cwl1.o0(b0kVar2, 2131953297), uyn1.B(qim0VarF2, 0.0f, 12.0f, 0.0f, 0.0f, 13), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2016);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(z, qim0Var2, i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:205:0x049d  */
    /* JADX WARN: Code duplicated, block: B:208:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:210:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:212:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:228:0x058f  */
    /* JADX WARN: Code duplicated, block: B:230:0x0595 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:232:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:235:0x05c0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v30 */
    public static final void b(String str, String str2, qim0 qim0Var, boolean z, long j, String str3, String str4, boolean z2, res resVar, rao raoVar, boolean z3, iu30 iu30Var, b0k b0kVar, int i, int i2, int i3) {
        int i4;
        long j2;
        String str5;
        boolean z4;
        int i5;
        String str6;
        res resVar2;
        long j3;
        qim0 qim0Var2;
        boolean z5;
        rao raoVar2;
        String strO0;
        boolean z6;
        boolean z7;
        int i6;
        long j4;
        String str7;
        qim0 qim0Var3;
        float f;
        x340 x340Var;
        Function0 function0;
        vu30 vu30Var;
        vu30 vu30Var2;
        String str8;
        llj lljVar;
        rao raoVar3;
        Object obj;
        vu30 vu30Var3;
        ?? r0;
        long j5;
        qim0 qim0Var4;
        boolean z8;
        byte b;
        rao raoVar4;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        bjc0 cjc0Var;
        res resVar3 = resVar;
        rao raoVar5 = raoVar;
        Object obj2 = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-235507230);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i4 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= x340Var2.g(str2) ? 32 : 16;
        }
        int i7 = i4 | 384;
        if ((i & 3072) == 0) {
            i7 |= x340Var2.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            j2 = j;
            i7 |= ((i3 & 16) == 0 && x340Var2.f(j2)) ? 16384 : 8192;
        } else {
            j2 = j;
        }
        if ((i & 196608) == 0) {
            str5 = str3;
            i7 |= ((i3 & 32) == 0 && x340Var2.g(str5)) ? 131072 : 65536;
        } else {
            str5 = str3;
        }
        if ((i & 1572864) == 0) {
            i7 |= 524288;
        }
        int i8 = i3 & 128;
        if (i8 != 0) {
            i7 |= 12582912;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i & 12582912) == 0) {
                i7 |= x340Var2.h(z4) ? 8388608 : 4194304;
            }
        }
        int i9 = i3 & 256;
        int i10 = 100663296;
        if (i9 != 0) {
            i7 |= i10;
        } else if ((i & 100663296) == 0) {
            i10 = (i & 134217728) == 0 ? x340Var2.g(resVar3) : x340Var2.i(resVar3) ? 67108864 : 33554432;
            i7 |= i10;
        }
        int i11 = i3 & 512;
        int i12 = 805306368;
        if (i11 != 0) {
            i7 |= i12;
        } else if ((i & 805306368) == 0) {
            i12 = (i & 1073741824) == 0 ? x340Var2.g(raoVar5) : x340Var2.i(raoVar5) ? 536870912 : 268435456;
            i7 |= i12;
        }
        int i13 = i3 & 1024;
        if (i13 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (x340Var2.h(z3) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        int i14 = i5;
        if (x340Var2.Y(i7 & 1, ((i7 & 306783379) == 306783378 && (i14 & 19) == 18) ? false : true)) {
            x340Var2.d0();
            int i15 = i & 1;
            qim0 qim0Var5 = nim0.a;
            if (i15 == 0 || x340Var2.E()) {
                if ((i3 & 16) != 0) {
                    uwr uwrVar = cbx.a;
                    j2 = cbx.a(x340Var2).b.b;
                    i7 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    strO0 = cwl1.o0(x340Var2, 2131961494);
                    i7 &= -458753;
                } else {
                    strO0 = str5;
                }
                String strO1 = cwl1.o0(x340Var2, 2131961498);
                int i16 = i7 & (-3670017);
                if (i8 != 0) {
                    z4 = false;
                }
                if (i9 != 0) {
                    resVar3 = null;
                }
                if (i11 != 0) {
                    raoVar5 = null;
                }
                z6 = i13 != 0 ? false : z3;
                z7 = z4;
                i6 = i16;
                j4 = j2;
                str7 = strO1;
                str5 = strO0;
                qim0Var3 = qim0Var5;
            } else {
                x340Var2.b0();
                if ((i3 & 16) != 0) {
                    i7 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    i7 &= -458753;
                }
                str7 = str4;
                z6 = z3;
                i6 = i7 & (-3670017);
                resVar3 = resVar3;
                z7 = z4;
                j4 = j2;
                qim0Var3 = qim0Var;
            }
            x340Var2.s();
            boolean z9 = (i6 & 112) == 32;
            Object objT = x340Var2.T();
            if (z9 || objT == obj2) {
                objT = Boolean.valueOf(str2 != null && bmq0.e0(str2).size() > 1);
                x340Var2.s0(objT);
            }
            boolean zBooleanValue = ((Boolean) objT).booleanValue();
            qim0 qim0VarZ = u291.z(qim0Var3, (fra) null, 3);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            float f2 = 0.0f;
            if (!zBooleanValue || z) {
                x340Var2.i0(1310852902);
                cvx cvxVar4 = cbx.b(x340Var2).b;
                x340Var2.r(false);
                f = 16.0f;
            } else {
                x340Var2.i0(1310851780);
                x340Var2.r(false);
                f = 0.0f;
            }
            qim0 qim0VarA = uyn1.A(qim0VarZ, 16.0f, 16.0f, 16.0f, f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z10 = x340Var2.S;
            Function0 function1 = hmb0.t1;
            if (z10) {
                x340Var2.l(function1);
            } else {
                x340Var2.v0();
            }
            vu30 vu30Var4 = y580.O0;
            nko1.H(mbhVarA, x340Var2, vu30Var4);
            vu30 vu30Var5 = y580.N0;
            nko1.H(xos0VarM2, x340Var2, vu30Var5);
            Integer numValueOf = Integer.valueOf(iHashCode2);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar2);
            nko1.F(x340Var2);
            vu30 vu30Var6 = y580.Y;
            nko1.H(qim0VarE2, x340Var2, vu30Var6);
            if (str == null) {
                x340Var2.i0(759123569);
                x340Var2.r(false);
                vu30Var2 = vu30Var6;
                lljVar = lljVar2;
                raoVar3 = raoVar5;
                r0 = 0;
                obj = obj2;
                vu30Var3 = vu30Var5;
                vu30Var = vu30Var4;
                str8 = str5;
                function0 = function1;
                x340Var = x340Var2;
            } else {
                x340Var2.i0(759123570);
                x340Var = x340Var2;
                function0 = function1;
                vu30Var = vu30Var4;
                vu30Var2 = vu30Var6;
                str8 = str5;
                lljVar = lljVar2;
                raoVar3 = raoVar5;
                obj = obj2;
                vu30Var3 = vu30Var5;
                uwo1.e(str, null, cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, null, null, 0, false, null, 0, null, x340Var, i6 & 14, 0, 2034);
                r0 = 0;
                x340Var.r(false);
            }
            c380 c380VarE0 = str2 != null ? bmq0.e0(str2) : null;
            if (c380VarE0 == null || c380VarE0.isEmpty()) {
                j5 = j4;
                qim0Var4 = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x03de: MOVE (r4v5 'qim0Var4' p.qim0) = (r24v1 p.qim0) (LINE:991) in method: p.luo1.b(java.lang.String, java.lang.String, p.qim0, boolean, long, java.lang.String, java.lang.String, boolean, p.res, p.rao, boolean, p.iu30, p.b0k, int, int, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r24v1 p.qim0
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1530
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.luo1.b(java.lang.String, java.lang.String, p.qim0, boolean, long, java.lang.String, java.lang.String, boolean, p.res, p.rao, boolean, p.iu30, p.b0k, int, int, int):void");
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0033  */
            /* JADX WARN: Code duplicated, block: B:16:0x0035  */
            /* JADX WARN: Code duplicated, block: B:19:0x003d  */
            /* JADX WARN: Code duplicated, block: B:21:0x0040  */
            /* JADX WARN: Code duplicated, block: B:22:0x0043  */
            /* JADX WARN: Code duplicated, block: B:25:0x0086  */
            /* JADX WARN: Code duplicated, block: B:26:0x0091  */
            /* JADX WARN: Code duplicated, block: B:29:0x00bb  */
            /* JADX WARN: Code duplicated, block: B:31:0x00c4  */
            /* JADX WARN: Code duplicated, block: B:32:0x00c8  */
            /* JADX WARN: Code duplicated, block: B:35:0x011f  */
            /* JADX WARN: Code duplicated, block: B:36:0x0123  */
            /* JADX WARN: Code duplicated, block: B:38:0x01ba  */
            /* JADX WARN: Code duplicated, block: B:40:0x01be  */
            /* JADX WARN: Code duplicated, block: B:43:0x01c9  */
            /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
            public static final void c(int i, int i2, String str, b0k b0kVar, qim0 qim0Var) {
                String str2;
                boolean z;
                qim0 qim0Var2;
                h311 h311VarV;
                String str3;
                long jA;
                cr31 cr31VarB;
                float fY;
                String strK;
                era eraVar;
                f36 f36Var;
                mbh mbhVarA;
                int iHashCode;
                xos0 xos0VarM;
                qim0 qim0Var3;
                qim0 qim0VarE;
                boolean z2;
                n4k n4kVar;
                b0k b0kVar2 = (x340) b0kVar;
                b0kVar2.k0(-2002073941);
                j06 j06Var = ((x340) b0kVar2).a;
                int i3 = i | 6;
                int i4 = i2 & 2;
                if (i4 == 0) {
                    if ((i & 48) == 0) {
                        str2 = str;
                        i3 |= b0kVar2.g(str2) ? 32 : 16;
                    }
                    if ((i3 & 19) != 18) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar2.Y(i3 & 1, z)) {
                        if (i4 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        uwr uwrVar = cbx.a;
                        jA = cbx.a(b0kVar2).a.b.a();
                        cua cuaVar = cbx.b(b0kVar2).f;
                        cr31VarB = er31.b(4.0f);
                        b0kVar2.i0(152299637);
                        fY = ((wat) b0kVar2.k(t4k.h)).y(cbx.d(b0kVar2).j.a.b);
                        b0kVar2.r(false);
                        cvx cvxVar = cbx.b(b0kVar2).b;
                        if (str3 == null) {
                            strK = x0d.k(b0kVar2, 152305163, 2131961497, b0kVar2, false);
                        } else {
                            b0kVar2.i0(152304636);
                            b0kVar2.r(false);
                            strK = str3;
                        }
                        eraVar = een.P0;
                        f36Var = h36.c;
                        mbhVarA = jbh.a(f36Var, eraVar, b0kVar2, 0);
                        iHashCode = Long.hashCode(((x340) b0kVar2).T);
                        xos0VarM = b0kVar2.m();
                        qim0Var3 = nim0.a;
                        qim0VarE = zr7.E(b0kVar2, qim0Var3);
                        hzj.A.getClass();
                        if (j06Var != null) {
                            tgp1.p();
                            throw null;
                        }
                        b0kVar2.m0();
                        z2 = ((x340) b0kVar2).S;
                        n4kVar = hmb0.t1;
                        if (z2) {
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
                        cvx cvxVar2 = cbx.b(b0kVar2).b;
                        cvx cvxVar3 = cbx.b(b0kVar2).b;
                        cvx cvxVar4 = cbx.b(b0kVar2).b;
                        qim0 qim0VarA = uyn1.A(qim0Var3, 16.0f, 16.0f, 16.0f, cbx.b(b0kVar2).b.a);
                        mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar2, 0);
                        int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                        xos0 xos0VarM2 = b0kVar2.m();
                        qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarA);
                        b0kVar2.m0();
                        if (((x340) b0kVar2).S) {
                            b0kVar2.l(n4kVar);
                        } else {
                            b0kVar2.v0();
                        }
                        nko1.H(mbhVarA2, b0kVar2, lljVar);
                        nko1.H(xos0VarM2, b0kVar2, lljVar2);
                        x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
                        nko1.H(qim0VarE2, b0kVar2, lljVar4);
                        qim0Var2 = qim0Var3;
                        uwo1.e(strK, null, cbx.d(b0kVar2).h, cbx.a(b0kVar2).b.b, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2034);
                        b0kVar2 = b0kVar2;
                        cvx cvxVar5 = cbx.b(b0kVar2).b;
                        op71.g(b0kVar2, u291.h(qim0Var2, 12.0f));
                        k(fY, jA, cr31VarB, null, b0kVar2, 6);
                        op71.g(b0kVar2, u291.h(qim0Var2, 6.0f));
                        k(fY, jA, cr31VarB, null, b0kVar2, 6);
                        op71.g(b0kVar2, u291.h(qim0Var2, 6.0f));
                        k(fY, jA, cr31VarB, null, b0kVar2, 6);
                        op71.g(b0kVar2, u291.h(qim0Var2, 6.0f));
                        k(fY, jA, cr31VarB, null, b0kVar2, 6);
                        b0kVar2.r(true);
                        rqo1.g(6, 0, b0kVar2, u291.f(qim0Var2, 1.0f));
                        l(fY, jA, cr31VarB, null, b0kVar2, 0);
                        l(fY, jA, cr31VarB, null, b0kVar2, 0);
                        b0kVar2.r(true);
                        str2 = str3;
                    } else {
                        b0kVar2.b0();
                        qim0Var2 = qim0Var;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ux1(i, i2, str2, qim0Var2);
                    }
                }
                i3 = i | 54;
                str2 = str;
                if ((i3 & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar2.Y(i3 & 1, z)) {
                    if (i4 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    uwr uwrVar2 = cbx.a;
                    jA = cbx.a(b0kVar2).a.b.a();
                    cua cuaVar2 = cbx.b(b0kVar2).f;
                    cr31VarB = er31.b(4.0f);
                    b0kVar2.i0(152299637);
                    fY = ((wat) b0kVar2.k(t4k.h)).y(cbx.d(b0kVar2).j.a.b);
                    b0kVar2.r(false);
                    cvx cvxVar6 = cbx.b(b0kVar2).b;
                    if (str3 == null) {
                        strK = x0d.k(b0kVar2, 152305163, 2131961497, b0kVar2, false);
                    } else {
                        b0kVar2.i0(152304636);
                        b0kVar2.r(false);
                        strK = str3;
                    }
                    eraVar = een.P0;
                    f36Var = h36.c;
                    mbhVarA = jbh.a(f36Var, eraVar, b0kVar2, 0);
                    iHashCode = Long.hashCode(((x340) b0kVar2).T);
                    xos0VarM = b0kVar2.m();
                    qim0Var3 = nim0.a;
                    qim0VarE = zr7.E(b0kVar2, qim0Var3);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar2.m0();
                    z2 = ((x340) b0kVar2).S;
                    n4kVar = hmb0.t1;
                    if (z2) {
                        b0kVar2.l(n4kVar);
                    } else {
                        b0kVar2.v0();
                    }
                    llj lljVar5 = y580.O0;
                    nko1.H(mbhVarA, b0kVar2, lljVar5);
                    llj lljVar6 = y580.N0;
                    nko1.H(xos0VarM, b0kVar2, lljVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode);
                    llj lljVar7 = y580.R0;
                    nko1.H(numValueOf2, b0kVar2, lljVar7);
                    nko1.F(b0kVar2);
                    llj lljVar8 = y580.Y;
                    nko1.H(qim0VarE, b0kVar2, lljVar8);
                    cvx cvxVar7 = cbx.b(b0kVar2).b;
                    cvx cvxVar8 = cbx.b(b0kVar2).b;
                    cvx cvxVar9 = cbx.b(b0kVar2).b;
                    qim0 qim0VarA2 = uyn1.A(qim0Var3, 16.0f, 16.0f, 16.0f, cbx.b(b0kVar2).b.a);
                    mbh mbhVarA3 = jbh.a(f36Var, eraVar, b0kVar2, 0);
                    int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
                    xos0 xos0VarM3 = b0kVar2.m();
                    qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarA2);
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(n4kVar);
                    } else {
                        b0kVar2.v0();
                    }
                    nko1.H(mbhVarA3, b0kVar2, lljVar5);
                    nko1.H(xos0VarM3, b0kVar2, lljVar6);
                    x0d.q(iHashCode3, b0kVar2, lljVar7, b0kVar2);
                    nko1.H(qim0VarE3, b0kVar2, lljVar8);
                    qim0Var2 = qim0Var3;
                    uwo1.e(strK, null, cbx.d(b0kVar2).h, cbx.a(b0kVar2).b.b, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2034);
                    b0kVar2 = b0kVar2;
                    cvx cvxVar10 = cbx.b(b0kVar2).b;
                    op71.g(b0kVar2, u291.h(qim0Var2, 12.0f));
                    k(fY, jA, cr31VarB, null, b0kVar2, 6);
                    op71.g(b0kVar2, u291.h(qim0Var2, 6.0f));
                    k(fY, jA, cr31VarB, null, b0kVar2, 6);
                    op71.g(b0kVar2, u291.h(qim0Var2, 6.0f));
                    k(fY, jA, cr31VarB, null, b0kVar2, 6);
                    op71.g(b0kVar2, u291.h(qim0Var2, 6.0f));
                    k(fY, jA, cr31VarB, null, b0kVar2, 6);
                    b0kVar2.r(true);
                    rqo1.g(6, 0, b0kVar2, u291.f(qim0Var2, 1.0f));
                    l(fY, jA, cr31VarB, null, b0kVar2, 0);
                    l(fY, jA, cr31VarB, null, b0kVar2, 0);
                    b0kVar2.r(true);
                    str2 = str3;
                } else {
                    b0kVar2.b0();
                    qim0Var2 = qim0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ux1(i, i2, str2, qim0Var2);
                }
            }

            public static final void d(String str, String str2, c380 c380Var, em0 em0Var, ysr0 ysr0Var, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, boolean z, String str3, long j, String str4, boolean z2, res resVar, rao raoVar, boolean z3, boolean z4, qj0 qj0Var, i2n i2nVar, b0k b0kVar, int i, int i2, int i3) {
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                qim0 qim0Var2;
                String str5;
                long j2;
                String strO0;
                boolean z5;
                res resVar2;
                rao raoVar2;
                boolean z6;
                boolean z7;
                qj0 qj0Var2;
                rao raoVar3;
                int i13;
                boolean z8;
                boolean z9;
                i2n i2nVar2;
                res resVar3;
                qj0 qj0Var3;
                String str6;
                qim0 qim0Var3;
                boolean z10;
                qj0 qj0Var4;
                boolean z11;
                qj0 qj0Var5 = qj0Var;
                i2n i2nVar3 = i2nVar;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(76699396);
                if ((i & 6) == 0) {
                    i4 = (x340Var.g(str) ? 4 : 2) | i;
                } else {
                    i4 = i;
                }
                if ((i & 48) == 0) {
                    i4 |= x340Var.g(str2) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i4 |= x340Var.i(c380Var) ? 256 : 128;
                }
                int i14 = i4 | (x340Var.i(em0Var) ? 2048 : 1024) | (x340Var.i(ysr0Var) ? 16384 : 8192) | (x340Var.i(iu30Var) ? 131072 : 65536) | (x340Var.i(iu30Var2) ? 1048576 : 524288);
                int i15 = i14 | 12582912;
                int i16 = i3 & 512;
                if (i16 != 0) {
                    i5 = i14 | 817889280;
                } else {
                    i5 = i15 | (x340Var.g(str3) ? 536870912 : 268435456);
                }
                int i17 = i5;
                int i18 = i2 | 18;
                int i19 = i3 & 4096;
                if (i19 != 0) {
                    i6 = i2 | 402;
                } else {
                    i6 = i18 | (x340Var.h(z2) ? 256 : 128);
                }
                int i20 = i3 & 8192;
                if (i20 != 0) {
                    i7 = i6 | 3072;
                } else {
                    i7 = i6 | ((i2 & 4096) == 0 ? x340Var.g(resVar) : x340Var.i(resVar) ? 2048 : 1024);
                }
                int i21 = i3 & 16384;
                if (i21 != 0) {
                    i8 = i7 | 24576;
                } else {
                    i8 = i7 | ((i2 & 32768) == 0 ? x340Var.g(raoVar) : x340Var.i(raoVar) ? 16384 : 8192);
                }
                int i22 = i3 & 32768;
                if (i22 != 0) {
                    i9 = i8 | 196608;
                } else {
                    i9 = i8 | (x340Var.h(z3) ? 131072 : 65536);
                }
                int i23 = i3 & 65536;
                if (i23 != 0) {
                    i10 = i9 | 1572864;
                } else {
                    i10 = i9 | (x340Var.h(z4) ? 1048576 : 524288);
                }
                int i24 = i3 & 131072;
                if (i24 != 0) {
                    i11 = i10 | 12582912;
                } else {
                    i11 = i10 | ((i2 & 16777216) == 0 ? x340Var.g(qj0Var5) : x340Var.i(qj0Var5) ? 8388608 : 4194304);
                }
                int i25 = i3 & 262144;
                if (i25 != 0) {
                    i12 = 100663296;
                } else {
                    i12 = (i2 & 134217728) == 0 ? x340Var.g(i2nVar3) : x340Var.i(i2nVar3) ? 67108864 : 33554432;
                }
                int i26 = i11 | i12;
                if (x340Var.Y(i17 & 1, ((i17 & 306783379) == 306783378 && (38347923 & i26) == 38347922) ? false : true)) {
                    x340Var.d0();
                    int i27 = i & 1;
                    qim0 qim0Var4 = nim0.a;
                    if (i27 == 0 || x340Var.E()) {
                        String str7 = i16 != 0 ? null : str3;
                        uwr uwrVar = cbx.a;
                        long j3 = cbx.a(x340Var).b.b;
                        strO0 = cwl1.o0(x340Var, 2131961494);
                        int i28 = i26 & (-127);
                        boolean z12 = i19 != 0 ? false : z2;
                        res resVar4 = i20 != 0 ? null : resVar;
                        raoVar3 = i21 != 0 ? null : raoVar;
                        boolean z13 = i22 != 0 ? false : z3;
                        z7 = i23 != 0 ? false : z4;
                        if (i24 != 0) {
                            qj0Var5 = null;
                        }
                        if (i25 != 0) {
                            qj0Var3 = qj0Var5;
                            i13 = i28;
                            j2 = j3;
                            z8 = z13;
                            z9 = z12;
                            i2nVar2 = null;
                            str6 = str7;
                            qim0Var3 = qim0Var4;
                            resVar3 = resVar4;
                        } else {
                            i13 = i28;
                            j2 = j3;
                            z8 = z13;
                            z9 = z12;
                            i2nVar2 = i2nVar3;
                            resVar3 = resVar4;
                            qj0Var3 = qj0Var5;
                            str6 = str7;
                            qim0Var3 = qim0Var4;
                        }
                    } else {
                        x340Var.b0();
                        j2 = j;
                        strO0 = str4;
                        z9 = z2;
                        resVar3 = resVar;
                        raoVar3 = raoVar;
                        z8 = z3;
                        z7 = z4;
                        i13 = i26 & (-127);
                        i2nVar2 = i2nVar3;
                        qim0Var3 = qim0Var;
                        qj0Var3 = qj0Var5;
                        str6 = str3;
                    }
                    x340Var.s();
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    boolean z14 = z9;
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
                    hzj.A.getClass();
                    qim0 qim0Var5 = qim0Var3;
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
                    if (z) {
                        x340Var.i0(-540183852);
                        z11 = true;
                        c((i17 >> 24) & 112, 1, str6, x340Var, null);
                        x340Var.r(false);
                        z10 = z14;
                        qj0Var4 = qj0Var3;
                        i2nVar3 = i2nVar2;
                    } else {
                        x340Var.i0(-540066362);
                        int i29 = i13 << 15;
                        z10 = z14;
                        b(str, str2, null, z8, j2, strO0, null, z10, resVar3, raoVar3, z7, iu30Var, x340Var, (i17 & 126) | ((i13 >> 6) & 7168) | (29360128 & i29) | 134217728 | (234881024 & i29) | 1073741824 | (i29 & 1879048192), ((i13 >> 18) & 14) | ((i17 >> 12) & 112), 68);
                        if (c380Var.isEmpty()) {
                            x340Var.i0(-539300600);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(-539605237);
                            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
                            uwr uwrVar2 = cbx.a;
                            rqo1.g(0, 0, x340Var, uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.a, 7));
                            kuo1.b(c380Var, em0Var, ysr0Var, iu30Var2, null, x340Var, ((i17 >> 6) & 1022) | ((i17 >> 9) & 7168));
                            x340Var.r(false);
                        }
                        if (qj0Var3 == null || i2nVar2 == null) {
                            x340Var = x340Var;
                            x340Var = x340Var;
                            qj0Var4 = qj0Var3;
                            i2nVar3 = i2nVar2;
                            x340Var.i0(-539117080);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(-539214141);
                            int i30 = i13 >> 21;
                            qj0 qj0Var6 = qj0Var3;
                            i2n i2nVar4 = i2nVar2;
                            otw.c(qj0Var6, i2nVar4, (qim0) null, (ipb1) null, x340Var, (i30 & 112) | (i30 & 14) | 72, 12);
                            qj0Var4 = qj0Var6;
                            i2nVar3 = i2nVar4;
                            x340Var.r(false);
                        }
                        x340Var.r(false);
                        z11 = true;
                    }
                    x340Var.r(z11);
                    qj0Var2 = qj0Var4;
                    z5 = z10;
                    resVar2 = resVar3;
                    raoVar2 = raoVar3;
                    qim0Var2 = qim0Var5;
                    z6 = z8;
                    str5 = str6;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    str5 = str3;
                    j2 = j;
                    strO0 = str4;
                    z5 = z2;
                    resVar2 = resVar;
                    raoVar2 = raoVar;
                    z6 = z3;
                    z7 = z4;
                    qj0Var2 = qj0Var5;
                }
                i2n i2nVar5 = i2nVar3;
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new hco(str, str2, c380Var, em0Var, ysr0Var, iu30Var, iu30Var2, qim0Var2, z, str5, j2, strO0, z5, resVar2, raoVar2, z6, z7, qj0Var2, i2nVar5, i, i2, i3);
                }
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0116  */
            /* JADX WARN: Code duplicated, block: B:102:0x0129  */
            /* JADX WARN: Code duplicated, block: B:115:0x015e A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:117:0x0161  */
            /* JADX WARN: Code duplicated, block: B:120:0x0167  */
            /* JADX WARN: Code duplicated, block: B:121:0x0172  */
            /* JADX WARN: Code duplicated, block: B:123:0x0175  */
            /* JADX WARN: Code duplicated, block: B:125:0x0179  */
            /* JADX WARN: Code duplicated, block: B:128:0x017f  */
            /* JADX WARN: Code duplicated, block: B:129:0x018c  */
            /* JADX WARN: Code duplicated, block: B:132:0x0192  */
            /* JADX WARN: Code duplicated, block: B:135:0x02c5  */
            /* JADX WARN: Code duplicated, block: B:138:0x02df  */
            /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:39:0x006b  */
            /* JADX WARN: Code duplicated, block: B:41:0x006f  */
            /* JADX WARN: Code duplicated, block: B:43:0x0077  */
            /* JADX WARN: Code duplicated, block: B:44:0x007a  */
            /* JADX WARN: Code duplicated, block: B:47:0x0080  */
            /* JADX WARN: Code duplicated, block: B:50:0x0088  */
            /* JADX WARN: Code duplicated, block: B:52:0x008c  */
            /* JADX WARN: Code duplicated, block: B:54:0x008f  */
            /* JADX WARN: Code duplicated, block: B:56:0x0097  */
            /* JADX WARN: Code duplicated, block: B:57:0x009a  */
            /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
            /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
            /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
            /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
            /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
            /* JADX WARN: Code duplicated, block: B:72:0x00bd  */
            /* JADX WARN: Code duplicated, block: B:74:0x00c1  */
            /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
            /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
            /* JADX WARN: Code duplicated, block: B:80:0x00d5  */
            /* JADX WARN: Code duplicated, block: B:83:0x00de  */
            /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
            /* JADX WARN: Code duplicated, block: B:88:0x00ed  */
            /* JADX WARN: Code duplicated, block: B:90:0x00f1  */
            /* JADX WARN: Code duplicated, block: B:93:0x00f9  */
            /* JADX WARN: Code duplicated, block: B:96:0x0109  */
            /* JADX WARN: Code duplicated, block: B:97:0x010c  */
            public static final void e(float f, iu30 iu30Var, qim0 qim0Var, boolean z, ksg ksgVar, int i, Function0 function0, long j, long j2, idn0 idn0Var, long j3, long j4, long j5, b0k b0kVar, int i2, int i3) {
                int i4;
                boolean z2;
                ksg ksgVar2;
                int i5;
                int i6;
                int i7;
                int i8;
                Function0 function1;
                int i9;
                int i10;
                long j6;
                boolean z3;
                x340 x340Var;
                long j7;
                long j8;
                ksg ksgVar3;
                int i11;
                Function0 function2;
                idn0 idn0Var2;
                long j9;
                long j10;
                boolean z4;
                long j11;
                h311 h311VarV;
                ksg jsgVar;
                long j12;
                idn0 idn0Var3;
                int i12;
                Function0 function3;
                long j13;
                boolean z5;
                ksg ksgVar4;
                int i13;
                long j14;
                long j15;
                long j16;
                long j17;
                int i14;
                int i15;
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.k0(-1725983680);
                if ((i2 & 6) == 0) {
                    i4 = (x340Var2.d(f) ? 4 : 2) | i2;
                } else {
                    i4 = i2;
                }
                if ((i2 & 48) == 0) {
                    i4 |= x340Var2.i(iu30Var) ? 32 : 16;
                }
                if ((i2 & 384) == 0) {
                    i4 |= x340Var2.i(qim0Var) ? 256 : 128;
                }
                int i16 = i3 & 8;
                if (i16 == 0) {
                    if ((i2 & 3072) == 0) {
                        z2 = z;
                        i4 |= x340Var2.h(z2) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) == 0) {
                        if ((i3 & 16) == 0) {
                            ksgVar2 = ksgVar;
                            int i17 = x340Var2.g(ksgVar2) ? 16384 : 8192;
                            i4 |= i17;
                        } else {
                            ksgVar2 = ksgVar;
                        }
                        i4 |= i17;
                    } else {
                        ksgVar2 = ksgVar;
                    }
                    i5 = i3 & 32;
                    if (i5 != 0) {
                        if ((196608 & i2) == 0) {
                            i6 = i;
                            if (x340Var2.e(i6)) {
                                i7 = 131072;
                            } else {
                                i7 = 65536;
                            }
                            i4 |= i7;
                        }
                        i8 = i3 & 64;
                        if (i8 != 0) {
                            if ((1572864 & i2) == 0) {
                                function1 = function0;
                                if (x340Var2.i(function1)) {
                                    i9 = 1048576;
                                } else {
                                    i9 = 524288;
                                }
                                i4 |= i9;
                            }
                            if ((12582912 & i2) == 0) {
                                if ((i3 & 128) == 0) {
                                    i15 = i4;
                                    int i18 = x340Var2.f(j) ? 8388608 : 4194304;
                                    i10 = i15 | i18;
                                } else {
                                    i15 = i4;
                                }
                                i10 = i15 | i18;
                            } else {
                                i10 = i4;
                            }
                            if ((i2 & 100663296) == 0) {
                                j6 = j2;
                                if ((i3 & 256) == 0 || !x340Var2.f(j6)) {
                                    i14 = 33554432;
                                } else {
                                    i14 = 67108864;
                                }
                                i10 |= i14;
                            } else {
                                j6 = j2;
                            }
                            if ((i2 & 805306368) == 0) {
                                i10 |= 268435456;
                            }
                            if ((306783379 & i10) == 306783378) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (x340Var2.Y(i10 & 1, z3)) {
                                x340Var2.d0();
                                if ((i2 & 1) != 0 || x340Var2.E()) {
                                    boolean z6 = i16 == 0 ? z2 : true;
                                    if ((i3 & 16) != 0) {
                                        jsgVar = new jsg(0.0f, 1.0f);
                                        i10 &= -57345;
                                    } else {
                                        jsgVar = ksgVar2;
                                    }
                                    if (i5 != 0) {
                                        i6 = 0;
                                    }
                                    if (i8 != 0) {
                                        function1 = null;
                                    }
                                    if ((i3 & 128) != 0) {
                                        uwr uwrVar = cbx.a;
                                        j12 = cbx.a(x340Var2).c.c;
                                        i10 &= -29360129;
                                    } else {
                                        j12 = j;
                                    }
                                    if ((i3 & 256) != 0) {
                                        uwr uwrVar2 = cbx.a;
                                        j6 = cbx.a(x340Var2).c.b;
                                        i10 &= -234881025;
                                    }
                                    idn0 idn0VarY = zso1.Y(x340Var2);
                                    long j18 = j12;
                                    long jB = u7h.b(j18, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                                    long j19 = j6;
                                    long jB2 = u7h.b(j19, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                                    uwr uwrVar3 = cbx.a;
                                    ksg ksgVar5 = jsgVar;
                                    idn0Var3 = idn0VarY;
                                    i12 = i6;
                                    function3 = function1;
                                    j13 = cbx.a(x340Var2).c.b;
                                    z5 = z6;
                                    ksgVar4 = ksgVar5;
                                    i13 = (-1879048193) & i10;
                                    j14 = j18;
                                    j15 = jB;
                                    j16 = j19;
                                    j17 = jB2;
                                } else {
                                    x340Var2.b0();
                                    if ((i3 & 16) != 0) {
                                        i10 &= -57345;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i10 &= -29360129;
                                    }
                                    if ((i3 & 256) != 0) {
                                        i10 &= -234881025;
                                    }
                                    long j20 = j6;
                                    i13 = i10 & (-1879048193);
                                    z5 = z2;
                                    j16 = j20;
                                    j14 = j;
                                    idn0Var3 = idn0Var;
                                    j17 = j4;
                                    ksgVar4 = ksgVar2;
                                    i12 = i6;
                                    function3 = function1;
                                    j15 = j3;
                                    j13 = j5;
                                }
                                x340Var2.s();
                                long jC = jhc1.c(16.0f, 16.0f);
                                lb91 lb91Var = lb91.a;
                                uwr uwrVar4 = cbx.a;
                                ksg ksgVar6 = ksgVar4;
                                long j21 = cbx.a(x340Var2).b.a;
                                long j22 = u7h.j;
                                int i19 = i13;
                                fb91 fb91VarE = lb91.e(j21, j14, j22, j16, j22, j13, j15, j22, j17, j22, x340Var2, 0);
                                cua cuaVar = cbx.b(x340Var2).f;
                                idn0 idn0Var4 = idn0Var3;
                                long j23 = j14;
                                int i20 = i12;
                                Function0 function4 = function3;
                                rb91.a(f, iu30Var, py20.b(qim0Var, idn0Var4, 0L, er31.b(4.0f), (p3v) null, x340Var2, 0, 26), z5, function4, fb91VarE, idn0Var4, i20, apo.r(919443068, new pje(fb91VarE, z5, jC), x340Var2), apo.r(1042347005, new mz0(z5, fb91VarE, (byte) 2), x340Var2), ksgVar6, x340Var2, (i19 & 14) | 905969664 | (i19 & 112) | (i19 & 7168) | ((i19 >> 6) & 57344) | (29360128 & (i19 << 6)), (i19 >> 12) & 14, 0);
                                x340Var = x340Var2;
                                z4 = z5;
                                i11 = i20;
                                function2 = function4;
                                ksgVar3 = ksgVar6;
                                j10 = j16;
                                j11 = j23;
                                long j24 = j13;
                                idn0Var2 = idn0Var4;
                                j9 = j15;
                                j7 = j17;
                                j8 = j24;
                            } else {
                                x340Var = x340Var2;
                                x340Var.b0();
                                j7 = j4;
                                j8 = j5;
                                ksgVar3 = ksgVar2;
                                i11 = i6;
                                function2 = function1;
                                idn0Var2 = idn0Var;
                                j9 = j3;
                                j10 = j6;
                                z4 = z2;
                                j11 = j;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new gxx(f, iu30Var, qim0Var, z4, ksgVar3, i11, function2, j11, j10, idn0Var2, j9, j7, j8, i2, i3);
                            }
                        }
                        i4 |= 1572864;
                        function1 = function0;
                        if ((12582912 & i2) == 0) {
                            if ((i3 & 128) == 0) {
                                i15 = i4;
                                if (x340Var2.f(j)) {
                                }
                                i10 = i15 | i18;
                            } else {
                                i15 = i4;
                            }
                            i10 = i15 | i18;
                        } else {
                            i10 = i4;
                        }
                        if ((i2 & 100663296) == 0) {
                            j6 = j2;
                            if ((i3 & 256) == 0) {
                                i14 = 33554432;
                            } else {
                                i14 = 33554432;
                            }
                            i10 |= i14;
                        } else {
                            j6 = j2;
                        }
                        if ((i2 & 805306368) == 0) {
                            i10 |= 268435456;
                        }
                        if ((306783379 & i10) == 306783378) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (x340Var2.Y(i10 & 1, z3)) {
                            x340Var2.d0();
                            if ((i2 & 1) != 0) {
                                if (i16 == 0) {
                                }
                                if ((i3 & 16) != 0) {
                                    jsgVar = new jsg(0.0f, 1.0f);
                                    i10 &= -57345;
                                } else {
                                    jsgVar = ksgVar2;
                                }
                                if (i5 != 0) {
                                    i6 = 0;
                                }
                                if (i8 != 0) {
                                    function1 = null;
                                }
                                if ((i3 & 128) != 0) {
                                    uwr uwrVar5 = cbx.a;
                                    j12 = cbx.a(x340Var2).c.c;
                                    i10 &= -29360129;
                                } else {
                                    j12 = j;
                                }
                                if ((i3 & 256) != 0) {
                                    uwr uwrVar6 = cbx.a;
                                    j6 = cbx.a(x340Var2).c.b;
                                    i10 &= -234881025;
                                }
                                idn0 idn0VarY2 = zso1.Y(x340Var2);
                                long j110 = j12;
                                long jB3 = u7h.b(j110, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                                long j111 = j6;
                                long jB4 = u7h.b(j111, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                                uwr uwrVar7 = cbx.a;
                                ksg ksgVar7 = jsgVar;
                                idn0Var3 = idn0VarY2;
                                i12 = i6;
                                function3 = function1;
                                j13 = cbx.a(x340Var2).c.b;
                                z5 = z6;
                                ksgVar4 = ksgVar7;
                                i13 = (-1879048193) & i10;
                                j14 = j110;
                                j15 = jB3;
                                j16 = j111;
                                j17 = jB4;
                            } else {
                                if (i16 == 0) {
                                }
                                if ((i3 & 16) != 0) {
                                    jsgVar = new jsg(0.0f, 1.0f);
                                    i10 &= -57345;
                                } else {
                                    jsgVar = ksgVar2;
                                }
                                if (i5 != 0) {
                                    i6 = 0;
                                }
                                if (i8 != 0) {
                                    function1 = null;
                                }
                                if ((i3 & 128) != 0) {
                                    uwr uwrVar8 = cbx.a;
                                    j12 = cbx.a(x340Var2).c.c;
                                    i10 &= -29360129;
                                } else {
                                    j12 = j;
                                }
                                if ((i3 & 256) != 0) {
                                    uwr uwrVar9 = cbx.a;
                                    j6 = cbx.a(x340Var2).c.b;
                                    i10 &= -234881025;
                                }
                                idn0 idn0VarY3 = zso1.Y(x340Var2);
                                long j112 = j12;
                                long jB5 = u7h.b(j112, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                                long j113 = j6;
                                long jB6 = u7h.b(j113, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                                uwr uwrVar10 = cbx.a;
                                ksg ksgVar8 = jsgVar;
                                idn0Var3 = idn0VarY3;
                                i12 = i6;
                                function3 = function1;
                                j13 = cbx.a(x340Var2).c.b;
                                z5 = z6;
                                ksgVar4 = ksgVar8;
                                i13 = (-1879048193) & i10;
                                j14 = j112;
                                j15 = jB5;
                                j16 = j113;
                                j17 = jB6;
                            }
                            x340Var2.s();
                            long jC2 = jhc1.c(16.0f, 16.0f);
                            lb91 lb91Var2 = lb91.a;
                            uwr uwrVar11 = cbx.a;
                            ksg ksgVar9 = ksgVar4;
                            long j25 = cbx.a(x340Var2).b.a;
                            long j26 = u7h.j;
                            int i110 = i13;
                            fb91 fb91VarE2 = lb91.e(j25, j14, j26, j16, j26, j13, j15, j26, j17, j26, x340Var2, 0);
                            cua cuaVar2 = cbx.b(x340Var2).f;
                            idn0 idn0Var5 = idn0Var3;
                            long j27 = j14;
                            int i21 = i12;
                            Function0 function5 = function3;
                            rb91.a(f, iu30Var, py20.b(qim0Var, idn0Var5, 0L, er31.b(4.0f), (p3v) null, x340Var2, 0, 26), z5, function5, fb91VarE2, idn0Var5, i21, apo.r(919443068, new pje(fb91VarE2, z5, jC2), x340Var2), apo.r(1042347005, new mz0(z5, fb91VarE2, (byte) 2), x340Var2), ksgVar9, x340Var2, (i110 & 14) | 905969664 | (i110 & 112) | (i110 & 7168) | ((i110 >> 6) & 57344) | (29360128 & (i110 << 6)), (i110 >> 12) & 14, 0);
                            x340Var = x340Var2;
                            z4 = z5;
                            i11 = i21;
                            function2 = function5;
                            ksgVar3 = ksgVar9;
                            j10 = j16;
                            j11 = j27;
                            long j28 = j13;
                            idn0Var2 = idn0Var5;
                            j9 = j15;
                            j7 = j17;
                            j8 = j28;
                        } else {
                            x340Var = x340Var2;
                            x340Var.b0();
                            j7 = j4;
                            j8 = j5;
                            ksgVar3 = ksgVar2;
                            i11 = i6;
                            function2 = function1;
                            idn0Var2 = idn0Var;
                            j9 = j3;
                            j10 = j6;
                            z4 = z2;
                            j11 = j;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new gxx(f, iu30Var, qim0Var, z4, ksgVar3, i11, function2, j11, j10, idn0Var2, j9, j7, j8, i2, i3);
                        }
                    }
                    i4 |= 196608;
                    i6 = i;
                    i8 = i3 & 64;
                    if (i8 != 0) {
                        if ((1572864 & i2) == 0) {
                            function1 = function0;
                            if (x340Var2.i(function1)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i4 |= i9;
                        }
                        if ((12582912 & i2) == 0) {
                            if ((i3 & 128) == 0) {
                                i15 = i4;
                                if (x340Var2.f(j)) {
                                }
                                i10 = i15 | i18;
                            } else {
                                i15 = i4;
                            }
                            i10 = i15 | i18;
                        } else {
                            i10 = i4;
                        }
                        if ((i2 & 100663296) == 0) {
                            j6 = j2;
                            if ((i3 & 256) == 0) {
                                i14 = 33554432;
                            } else {
                                i14 = 33554432;
                            }
                            i10 |= i14;
                        } else {
                            j6 = j2;
                        }
                        if ((i2 & 805306368) == 0) {
                            i10 |= 268435456;
                        }
                        if ((306783379 & i10) == 306783378) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (x340Var2.Y(i10 & 1, z3)) {
                            x340Var2.d0();
                            if ((i2 & 1) != 0) {
                                if (i16 == 0) {
                                }
                                if ((i3 & 16) != 0) {
                                    jsgVar = new jsg(0.0f, 1.0f);
                                    i10 &= -57345;
                                } else {
                                    jsgVar = ksgVar2;
                                }
                                if (i5 != 0) {
                                    i6 = 0;
                                }
                                if (i8 != 0) {
                                    function1 = null;
                                }
                                if ((i3 & 128) != 0) {
                                    uwr uwrVar12 = cbx.a;
                                    j12 = cbx.a(x340Var2).c.c;
                                    i10 &= -29360129;
                                } else {
                                    j12 = j;
                                }
                                if ((i3 & 256) != 0) {
                                    uwr uwrVar13 = cbx.a;
                                    j6 = cbx.a(x340Var2).c.b;
                                    i10 &= -234881025;
                                }
                                idn0 idn0VarY4 = zso1.Y(x340Var2);
                                long j114 = j12;
                                long jB7 = u7h.b(j114, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                                long j115 = j6;
                                long jB8 = u7h.b(j115, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                                uwr uwrVar14 = cbx.a;
                                ksg ksgVar10 = jsgVar;
                                idn0Var3 = idn0VarY4;
                                i12 = i6;
                                function3 = function1;
                                j13 = cbx.a(x340Var2).c.b;
                                z5 = z6;
                                ksgVar4 = ksgVar10;
                                i13 = (-1879048193) & i10;
                                j14 = j114;
                                j15 = jB7;
                                j16 = j115;
                                j17 = jB8;
                            } else {
                                if (i16 == 0) {
                                }
                                if ((i3 & 16) != 0) {
                                    jsgVar = new jsg(0.0f, 1.0f);
                                    i10 &= -57345;
                                } else {
                                    jsgVar = ksgVar2;
                                }
                                if (i5 != 0) {
                                    i6 = 0;
                                }
                                if (i8 != 0) {
                                    function1 = null;
                                }
                                if ((i3 & 128) != 0) {
                                    uwr uwrVar15 = cbx.a;
                                    j12 = cbx.a(x340Var2).c.c;
                                    i10 &= -29360129;
                                } else {
                                    j12 = j;
                                }
                                if ((i3 & 256) != 0) {
                                    uwr uwrVar16 = cbx.a;
                                    j6 = cbx.a(x340Var2).c.b;
                                    i10 &= -234881025;
                                }
                                idn0 idn0VarY5 = zso1.Y(x340Var2);
                                long j116 = j12;
                                long jB9 = u7h.b(j116, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                                long j117 = j6;
                                long jB10 = u7h.b(j117, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                                uwr uwrVar17 = cbx.a;
                                ksg ksgVar11 = jsgVar;
                                idn0Var3 = idn0VarY5;
                                i12 = i6;
                                function3 = function1;
                                j13 = cbx.a(x340Var2).c.b;
                                z5 = z6;
                                ksgVar4 = ksgVar11;
                                i13 = (-1879048193) & i10;
                                j14 = j116;
                                j15 = jB9;
                                j16 = j117;
                                j17 = jB10;
                            }
                            x340Var2.s();
                            long jC3 = jhc1.c(16.0f, 16.0f);
                            lb91 lb91Var3 = lb91.a;
                            uwr uwrVar18 = cbx.a;
                            ksg ksgVar12 = ksgVar4;
                            long j29 = cbx.a(x340Var2).b.a;
                            long j210 = u7h.j;
                            int i111 = i13;
                            fb91 fb91VarE3 = lb91.e(j29, j14, j210, j16, j210, j13, j15, j210, j17, j210, x340Var2, 0);
                            cua cuaVar3 = cbx.b(x340Var2).f;
                            idn0 idn0Var6 = idn0Var3;
                            long j211 = j14;
                            int i22 = i12;
                            Function0 function6 = function3;
                            rb91.a(f, iu30Var, py20.b(qim0Var, idn0Var6, 0L, er31.b(4.0f), (p3v) null, x340Var2, 0, 26), z5, function6, fb91VarE3, idn0Var6, i22, apo.r(919443068, new pje(fb91VarE3, z5, jC3), x340Var2), apo.r(1042347005, new mz0(z5, fb91VarE3, (byte) 2), x340Var2), ksgVar12, x340Var2, (i111 & 14) | 905969664 | (i111 & 112) | (i111 & 7168) | ((i111 >> 6) & 57344) | (29360128 & (i111 << 6)), (i111 >> 12) & 14, 0);
                            x340Var = x340Var2;
                            z4 = z5;
                            i11 = i22;
                            function2 = function6;
                            ksgVar3 = ksgVar12;
                            j10 = j16;
                            j11 = j211;
                            long j212 = j13;
                            idn0Var2 = idn0Var6;
                            j9 = j15;
                            j7 = j17;
                            j8 = j212;
                        } else {
                            x340Var = x340Var2;
                            x340Var.b0();
                            j7 = j4;
                            j8 = j5;
                            ksgVar3 = ksgVar2;
                            i11 = i6;
                            function2 = function1;
                            idn0Var2 = idn0Var;
                            j9 = j3;
                            j10 = j6;
                            z4 = z2;
                            j11 = j;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new gxx(f, iu30Var, qim0Var, z4, ksgVar3, i11, function2, j11, j10, idn0Var2, j9, j7, j8, i2, i3);
                        }
                    }
                    i4 |= 1572864;
                    function1 = function0;
                    if ((12582912 & i2) == 0) {
                        if ((i3 & 128) == 0) {
                            i15 = i4;
                            if (x340Var2.f(j)) {
                            }
                            i10 = i15 | i18;
                        } else {
                            i15 = i4;
                        }
                        i10 = i15 | i18;
                    } else {
                        i10 = i4;
                    }
                    if ((i2 & 100663296) == 0) {
                        j6 = j2;
                        if ((i3 & 256) == 0) {
                            i14 = 33554432;
                        } else {
                            i14 = 33554432;
                        }
                        i10 |= i14;
                    } else {
                        j6 = j2;
                    }
                    if ((i2 & 805306368) == 0) {
                        i10 |= 268435456;
                    }
                    if ((306783379 & i10) == 306783378) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (x340Var2.Y(i10 & 1, z3)) {
                        x340Var2.d0();
                        if ((i2 & 1) != 0) {
                            if (i16 == 0) {
                            }
                            if ((i3 & 16) != 0) {
                                jsgVar = new jsg(0.0f, 1.0f);
                                i10 &= -57345;
                            } else {
                                jsgVar = ksgVar2;
                            }
                            if (i5 != 0) {
                                i6 = 0;
                            }
                            if (i8 != 0) {
                                function1 = null;
                            }
                            if ((i3 & 128) != 0) {
                                uwr uwrVar19 = cbx.a;
                                j12 = cbx.a(x340Var2).c.c;
                                i10 &= -29360129;
                            } else {
                                j12 = j;
                            }
                            if ((i3 & 256) != 0) {
                                uwr uwrVar110 = cbx.a;
                                j6 = cbx.a(x340Var2).c.b;
                                i10 &= -234881025;
                            }
                            idn0 idn0VarY6 = zso1.Y(x340Var2);
                            long j118 = j12;
                            long jB11 = u7h.b(j118, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                            long j119 = j6;
                            long jB12 = u7h.b(j119, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                            uwr uwrVar111 = cbx.a;
                            ksg ksgVar13 = jsgVar;
                            idn0Var3 = idn0VarY6;
                            i12 = i6;
                            function3 = function1;
                            j13 = cbx.a(x340Var2).c.b;
                            z5 = z6;
                            ksgVar4 = ksgVar13;
                            i13 = (-1879048193) & i10;
                            j14 = j118;
                            j15 = jB11;
                            j16 = j119;
                            j17 = jB12;
                        } else {
                            if (i16 == 0) {
                            }
                            if ((i3 & 16) != 0) {
                                jsgVar = new jsg(0.0f, 1.0f);
                                i10 &= -57345;
                            } else {
                                jsgVar = ksgVar2;
                            }
                            if (i5 != 0) {
                                i6 = 0;
                            }
                            if (i8 != 0) {
                                function1 = null;
                            }
                            if ((i3 & 128) != 0) {
                                uwr uwrVar112 = cbx.a;
                                j12 = cbx.a(x340Var2).c.c;
                                i10 &= -29360129;
                            } else {
                                j12 = j;
                            }
                            if ((i3 & 256) != 0) {
                                uwr uwrVar113 = cbx.a;
                                j6 = cbx.a(x340Var2).c.b;
                                i10 &= -234881025;
                            }
                            idn0 idn0VarY7 = zso1.Y(x340Var2);
                            long j1110 = j12;
                            long jB13 = u7h.b(j1110, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                            long j1111 = j6;
                            long jB14 = u7h.b(j1111, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                            uwr uwrVar114 = cbx.a;
                            ksg ksgVar14 = jsgVar;
                            idn0Var3 = idn0VarY7;
                            i12 = i6;
                            function3 = function1;
                            j13 = cbx.a(x340Var2).c.b;
                            z5 = z6;
                            ksgVar4 = ksgVar14;
                            i13 = (-1879048193) & i10;
                            j14 = j1110;
                            j15 = jB13;
                            j16 = j1111;
                            j17 = jB14;
                        }
                        x340Var2.s();
                        long jC4 = jhc1.c(16.0f, 16.0f);
                        lb91 lb91Var4 = lb91.a;
                        uwr uwrVar115 = cbx.a;
                        ksg ksgVar15 = ksgVar4;
                        long j213 = cbx.a(x340Var2).b.a;
                        long j214 = u7h.j;
                        int i112 = i13;
                        fb91 fb91VarE4 = lb91.e(j213, j14, j214, j16, j214, j13, j15, j214, j17, j214, x340Var2, 0);
                        cua cuaVar4 = cbx.b(x340Var2).f;
                        idn0 idn0Var7 = idn0Var3;
                        long j215 = j14;
                        int i23 = i12;
                        Function0 function7 = function3;
                        rb91.a(f, iu30Var, py20.b(qim0Var, idn0Var7, 0L, er31.b(4.0f), (p3v) null, x340Var2, 0, 26), z5, function7, fb91VarE4, idn0Var7, i23, apo.r(919443068, new pje(fb91VarE4, z5, jC4), x340Var2), apo.r(1042347005, new mz0(z5, fb91VarE4, (byte) 2), x340Var2), ksgVar15, x340Var2, (i112 & 14) | 905969664 | (i112 & 112) | (i112 & 7168) | ((i112 >> 6) & 57344) | (29360128 & (i112 << 6)), (i112 >> 12) & 14, 0);
                        x340Var = x340Var2;
                        z4 = z5;
                        i11 = i23;
                        function2 = function7;
                        ksgVar3 = ksgVar15;
                        j10 = j16;
                        j11 = j215;
                        long j216 = j13;
                        idn0Var2 = idn0Var7;
                        j9 = j15;
                        j7 = j17;
                        j8 = j216;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        j7 = j4;
                        j8 = j5;
                        ksgVar3 = ksgVar2;
                        i11 = i6;
                        function2 = function1;
                        idn0Var2 = idn0Var;
                        j9 = j3;
                        j10 = j6;
                        z4 = z2;
                        j11 = j;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new gxx(f, iu30Var, qim0Var, z4, ksgVar3, i11, function2, j11, j10, idn0Var2, j9, j7, j8, i2, i3);
                    }
                }
                i4 |= 3072;
                z2 = z;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        ksgVar2 = ksgVar;
                        if (x340Var2.g(ksgVar2)) {
                        }
                        i4 |= i17;
                    } else {
                        ksgVar2 = ksgVar;
                    }
                    i4 |= i17;
                } else {
                    ksgVar2 = ksgVar;
                }
                i5 = i3 & 32;
                if (i5 != 0) {
                    if ((196608 & i2) == 0) {
                        i6 = i;
                        if (x340Var2.e(i6)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i4 |= i7;
                    }
                    i8 = i3 & 64;
                    if (i8 != 0) {
                        if ((1572864 & i2) == 0) {
                            function1 = function0;
                            if (x340Var2.i(function1)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i4 |= i9;
                        }
                        if ((12582912 & i2) == 0) {
                            if ((i3 & 128) == 0) {
                                i15 = i4;
                                if (x340Var2.f(j)) {
                                }
                                i10 = i15 | i18;
                            } else {
                                i15 = i4;
                            }
                            i10 = i15 | i18;
                        } else {
                            i10 = i4;
                        }
                        if ((i2 & 100663296) == 0) {
                            j6 = j2;
                            if ((i3 & 256) == 0) {
                                i14 = 33554432;
                            } else {
                                i14 = 33554432;
                            }
                            i10 |= i14;
                        } else {
                            j6 = j2;
                        }
                        if ((i2 & 805306368) == 0) {
                            i10 |= 268435456;
                        }
                        if ((306783379 & i10) == 306783378) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (x340Var2.Y(i10 & 1, z3)) {
                            x340Var2.d0();
                            if ((i2 & 1) != 0) {
                                if (i16 == 0) {
                                }
                                if ((i3 & 16) != 0) {
                                    jsgVar = new jsg(0.0f, 1.0f);
                                    i10 &= -57345;
                                } else {
                                    jsgVar = ksgVar2;
                                }
                                if (i5 != 0) {
                                    i6 = 0;
                                }
                                if (i8 != 0) {
                                    function1 = null;
                                }
                                if ((i3 & 128) != 0) {
                                    uwr uwrVar116 = cbx.a;
                                    j12 = cbx.a(x340Var2).c.c;
                                    i10 &= -29360129;
                                } else {
                                    j12 = j;
                                }
                                if ((i3 & 256) != 0) {
                                    uwr uwrVar117 = cbx.a;
                                    j6 = cbx.a(x340Var2).c.b;
                                    i10 &= -234881025;
                                }
                                idn0 idn0VarY8 = zso1.Y(x340Var2);
                                long j1112 = j12;
                                long jB15 = u7h.b(j1112, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                                long j1113 = j6;
                                long jB16 = u7h.b(j1113, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                                uwr uwrVar118 = cbx.a;
                                ksg ksgVar16 = jsgVar;
                                idn0Var3 = idn0VarY8;
                                i12 = i6;
                                function3 = function1;
                                j13 = cbx.a(x340Var2).c.b;
                                z5 = z6;
                                ksgVar4 = ksgVar16;
                                i13 = (-1879048193) & i10;
                                j14 = j1112;
                                j15 = jB15;
                                j16 = j1113;
                                j17 = jB16;
                            } else {
                                if (i16 == 0) {
                                }
                                if ((i3 & 16) != 0) {
                                    jsgVar = new jsg(0.0f, 1.0f);
                                    i10 &= -57345;
                                } else {
                                    jsgVar = ksgVar2;
                                }
                                if (i5 != 0) {
                                    i6 = 0;
                                }
                                if (i8 != 0) {
                                    function1 = null;
                                }
                                if ((i3 & 128) != 0) {
                                    uwr uwrVar119 = cbx.a;
                                    j12 = cbx.a(x340Var2).c.c;
                                    i10 &= -29360129;
                                } else {
                                    j12 = j;
                                }
                                if ((i3 & 256) != 0) {
                                    uwr uwrVar1110 = cbx.a;
                                    j6 = cbx.a(x340Var2).c.b;
                                    i10 &= -234881025;
                                }
                                idn0 idn0VarY9 = zso1.Y(x340Var2);
                                long j1114 = j12;
                                long jB17 = u7h.b(j1114, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                                long j1115 = j6;
                                long jB18 = u7h.b(j1115, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                                uwr uwrVar1111 = cbx.a;
                                ksg ksgVar17 = jsgVar;
                                idn0Var3 = idn0VarY9;
                                i12 = i6;
                                function3 = function1;
                                j13 = cbx.a(x340Var2).c.b;
                                z5 = z6;
                                ksgVar4 = ksgVar17;
                                i13 = (-1879048193) & i10;
                                j14 = j1114;
                                j15 = jB17;
                                j16 = j1115;
                                j17 = jB18;
                            }
                            x340Var2.s();
                            long jC5 = jhc1.c(16.0f, 16.0f);
                            lb91 lb91Var5 = lb91.a;
                            uwr uwrVar1112 = cbx.a;
                            ksg ksgVar18 = ksgVar4;
                            long j217 = cbx.a(x340Var2).b.a;
                            long j218 = u7h.j;
                            int i113 = i13;
                            fb91 fb91VarE5 = lb91.e(j217, j14, j218, j16, j218, j13, j15, j218, j17, j218, x340Var2, 0);
                            cua cuaVar5 = cbx.b(x340Var2).f;
                            idn0 idn0Var8 = idn0Var3;
                            long j219 = j14;
                            int i24 = i12;
                            Function0 function8 = function3;
                            rb91.a(f, iu30Var, py20.b(qim0Var, idn0Var8, 0L, er31.b(4.0f), (p3v) null, x340Var2, 0, 26), z5, function8, fb91VarE5, idn0Var8, i24, apo.r(919443068, new pje(fb91VarE5, z5, jC5), x340Var2), apo.r(1042347005, new mz0(z5, fb91VarE5, (byte) 2), x340Var2), ksgVar18, x340Var2, (i113 & 14) | 905969664 | (i113 & 112) | (i113 & 7168) | ((i113 >> 6) & 57344) | (29360128 & (i113 << 6)), (i113 >> 12) & 14, 0);
                            x340Var = x340Var2;
                            z4 = z5;
                            i11 = i24;
                            function2 = function8;
                            ksgVar3 = ksgVar18;
                            j10 = j16;
                            j11 = j219;
                            long j2110 = j13;
                            idn0Var2 = idn0Var8;
                            j9 = j15;
                            j7 = j17;
                            j8 = j2110;
                        } else {
                            x340Var = x340Var2;
                            x340Var.b0();
                            j7 = j4;
                            j8 = j5;
                            ksgVar3 = ksgVar2;
                            i11 = i6;
                            function2 = function1;
                            idn0Var2 = idn0Var;
                            j9 = j3;
                            j10 = j6;
                            z4 = z2;
                            j11 = j;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new gxx(f, iu30Var, qim0Var, z4, ksgVar3, i11, function2, j11, j10, idn0Var2, j9, j7, j8, i2, i3);
                        }
                    }
                    i4 |= 1572864;
                    function1 = function0;
                    if ((12582912 & i2) == 0) {
                        if ((i3 & 128) == 0) {
                            i15 = i4;
                            if (x340Var2.f(j)) {
                            }
                            i10 = i15 | i18;
                        } else {
                            i15 = i4;
                        }
                        i10 = i15 | i18;
                    } else {
                        i10 = i4;
                    }
                    if ((i2 & 100663296) == 0) {
                        j6 = j2;
                        if ((i3 & 256) == 0) {
                            i14 = 33554432;
                        } else {
                            i14 = 33554432;
                        }
                        i10 |= i14;
                    } else {
                        j6 = j2;
                    }
                    if ((i2 & 805306368) == 0) {
                        i10 |= 268435456;
                    }
                    if ((306783379 & i10) == 306783378) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (x340Var2.Y(i10 & 1, z3)) {
                        x340Var2.d0();
                        if ((i2 & 1) != 0) {
                            if (i16 == 0) {
                            }
                            if ((i3 & 16) != 0) {
                                jsgVar = new jsg(0.0f, 1.0f);
                                i10 &= -57345;
                            } else {
                                jsgVar = ksgVar2;
                            }
                            if (i5 != 0) {
                                i6 = 0;
                            }
                            if (i8 != 0) {
                                function1 = null;
                            }
                            if ((i3 & 128) != 0) {
                                uwr uwrVar1113 = cbx.a;
                                j12 = cbx.a(x340Var2).c.c;
                                i10 &= -29360129;
                            } else {
                                j12 = j;
                            }
                            if ((i3 & 256) != 0) {
                                uwr uwrVar1114 = cbx.a;
                                j6 = cbx.a(x340Var2).c.b;
                                i10 &= -234881025;
                            }
                            idn0 idn0VarY10 = zso1.Y(x340Var2);
                            long j1116 = j12;
                            long jB19 = u7h.b(j1116, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                            long j1117 = j6;
                            long jB110 = u7h.b(j1117, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                            uwr uwrVar1115 = cbx.a;
                            ksg ksgVar19 = jsgVar;
                            idn0Var3 = idn0VarY10;
                            i12 = i6;
                            function3 = function1;
                            j13 = cbx.a(x340Var2).c.b;
                            z5 = z6;
                            ksgVar4 = ksgVar19;
                            i13 = (-1879048193) & i10;
                            j14 = j1116;
                            j15 = jB19;
                            j16 = j1117;
                            j17 = jB110;
                        } else {
                            if (i16 == 0) {
                            }
                            if ((i3 & 16) != 0) {
                                jsgVar = new jsg(0.0f, 1.0f);
                                i10 &= -57345;
                            } else {
                                jsgVar = ksgVar2;
                            }
                            if (i5 != 0) {
                                i6 = 0;
                            }
                            if (i8 != 0) {
                                function1 = null;
                            }
                            if ((i3 & 128) != 0) {
                                uwr uwrVar1116 = cbx.a;
                                j12 = cbx.a(x340Var2).c.c;
                                i10 &= -29360129;
                            } else {
                                j12 = j;
                            }
                            if ((i3 & 256) != 0) {
                                uwr uwrVar1117 = cbx.a;
                                j6 = cbx.a(x340Var2).c.b;
                                i10 &= -234881025;
                            }
                            idn0 idn0VarY11 = zso1.Y(x340Var2);
                            long j1118 = j12;
                            long jB111 = u7h.b(j1118, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                            long j1119 = j6;
                            long jB112 = u7h.b(j1119, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                            uwr uwrVar1118 = cbx.a;
                            ksg ksgVar110 = jsgVar;
                            idn0Var3 = idn0VarY11;
                            i12 = i6;
                            function3 = function1;
                            j13 = cbx.a(x340Var2).c.b;
                            z5 = z6;
                            ksgVar4 = ksgVar110;
                            i13 = (-1879048193) & i10;
                            j14 = j1118;
                            j15 = jB111;
                            j16 = j1119;
                            j17 = jB112;
                        }
                        x340Var2.s();
                        long jC6 = jhc1.c(16.0f, 16.0f);
                        lb91 lb91Var6 = lb91.a;
                        uwr uwrVar1119 = cbx.a;
                        ksg ksgVar111 = ksgVar4;
                        long j2111 = cbx.a(x340Var2).b.a;
                        long j2112 = u7h.j;
                        int i114 = i13;
                        fb91 fb91VarE6 = lb91.e(j2111, j14, j2112, j16, j2112, j13, j15, j2112, j17, j2112, x340Var2, 0);
                        cua cuaVar6 = cbx.b(x340Var2).f;
                        idn0 idn0Var9 = idn0Var3;
                        long j2113 = j14;
                        int i25 = i12;
                        Function0 function9 = function3;
                        rb91.a(f, iu30Var, py20.b(qim0Var, idn0Var9, 0L, er31.b(4.0f), (p3v) null, x340Var2, 0, 26), z5, function9, fb91VarE6, idn0Var9, i25, apo.r(919443068, new pje(fb91VarE6, z5, jC6), x340Var2), apo.r(1042347005, new mz0(z5, fb91VarE6, (byte) 2), x340Var2), ksgVar111, x340Var2, (i114 & 14) | 905969664 | (i114 & 112) | (i114 & 7168) | ((i114 >> 6) & 57344) | (29360128 & (i114 << 6)), (i114 >> 12) & 14, 0);
                        x340Var = x340Var2;
                        z4 = z5;
                        i11 = i25;
                        function2 = function9;
                        ksgVar3 = ksgVar111;
                        j10 = j16;
                        j11 = j2113;
                        long j2114 = j13;
                        idn0Var2 = idn0Var9;
                        j9 = j15;
                        j7 = j17;
                        j8 = j2114;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        j7 = j4;
                        j8 = j5;
                        ksgVar3 = ksgVar2;
                        i11 = i6;
                        function2 = function1;
                        idn0Var2 = idn0Var;
                        j9 = j3;
                        j10 = j6;
                        z4 = z2;
                        j11 = j;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new gxx(f, iu30Var, qim0Var, z4, ksgVar3, i11, function2, j11, j10, idn0Var2, j9, j7, j8, i2, i3);
                    }
                }
                i4 |= 196608;
                i6 = i;
                i8 = i3 & 64;
                if (i8 != 0) {
                    if ((1572864 & i2) == 0) {
                        function1 = function0;
                        if (x340Var2.i(function1)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i4 |= i9;
                    }
                    if ((12582912 & i2) == 0) {
                        if ((i3 & 128) == 0) {
                            i15 = i4;
                            if (x340Var2.f(j)) {
                            }
                            i10 = i15 | i18;
                        } else {
                            i15 = i4;
                        }
                        i10 = i15 | i18;
                    } else {
                        i10 = i4;
                    }
                    if ((i2 & 100663296) == 0) {
                        j6 = j2;
                        if ((i3 & 256) == 0) {
                            i14 = 33554432;
                        } else {
                            i14 = 33554432;
                        }
                        i10 |= i14;
                    } else {
                        j6 = j2;
                    }
                    if ((i2 & 805306368) == 0) {
                        i10 |= 268435456;
                    }
                    if ((306783379 & i10) == 306783378) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (x340Var2.Y(i10 & 1, z3)) {
                        x340Var2.d0();
                        if ((i2 & 1) != 0) {
                            if (i16 == 0) {
                            }
                            if ((i3 & 16) != 0) {
                                jsgVar = new jsg(0.0f, 1.0f);
                                i10 &= -57345;
                            } else {
                                jsgVar = ksgVar2;
                            }
                            if (i5 != 0) {
                                i6 = 0;
                            }
                            if (i8 != 0) {
                                function1 = null;
                            }
                            if ((i3 & 128) != 0) {
                                uwr uwrVar11110 = cbx.a;
                                j12 = cbx.a(x340Var2).c.c;
                                i10 &= -29360129;
                            } else {
                                j12 = j;
                            }
                            if ((i3 & 256) != 0) {
                                uwr uwrVar11111 = cbx.a;
                                j6 = cbx.a(x340Var2).c.b;
                                i10 &= -234881025;
                            }
                            idn0 idn0VarY12 = zso1.Y(x340Var2);
                            long j11110 = j12;
                            long jB113 = u7h.b(j11110, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                            long j11111 = j6;
                            long jB114 = u7h.b(j11111, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                            uwr uwrVar11112 = cbx.a;
                            ksg ksgVar112 = jsgVar;
                            idn0Var3 = idn0VarY12;
                            i12 = i6;
                            function3 = function1;
                            j13 = cbx.a(x340Var2).c.b;
                            z5 = z6;
                            ksgVar4 = ksgVar112;
                            i13 = (-1879048193) & i10;
                            j14 = j11110;
                            j15 = jB113;
                            j16 = j11111;
                            j17 = jB114;
                        } else {
                            if (i16 == 0) {
                            }
                            if ((i3 & 16) != 0) {
                                jsgVar = new jsg(0.0f, 1.0f);
                                i10 &= -57345;
                            } else {
                                jsgVar = ksgVar2;
                            }
                            if (i5 != 0) {
                                i6 = 0;
                            }
                            if (i8 != 0) {
                                function1 = null;
                            }
                            if ((i3 & 128) != 0) {
                                uwr uwrVar11113 = cbx.a;
                                j12 = cbx.a(x340Var2).c.c;
                                i10 &= -29360129;
                            } else {
                                j12 = j;
                            }
                            if ((i3 & 256) != 0) {
                                uwr uwrVar11114 = cbx.a;
                                j6 = cbx.a(x340Var2).c.b;
                                i10 &= -234881025;
                            }
                            idn0 idn0VarY13 = zso1.Y(x340Var2);
                            long j11112 = j12;
                            long jB115 = u7h.b(j11112, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                            long j11113 = j6;
                            long jB116 = u7h.b(j11113, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                            uwr uwrVar11115 = cbx.a;
                            ksg ksgVar113 = jsgVar;
                            idn0Var3 = idn0VarY13;
                            i12 = i6;
                            function3 = function1;
                            j13 = cbx.a(x340Var2).c.b;
                            z5 = z6;
                            ksgVar4 = ksgVar113;
                            i13 = (-1879048193) & i10;
                            j14 = j11112;
                            j15 = jB115;
                            j16 = j11113;
                            j17 = jB116;
                        }
                        x340Var2.s();
                        long jC7 = jhc1.c(16.0f, 16.0f);
                        lb91 lb91Var7 = lb91.a;
                        uwr uwrVar11116 = cbx.a;
                        ksg ksgVar114 = ksgVar4;
                        long j2115 = cbx.a(x340Var2).b.a;
                        long j2116 = u7h.j;
                        int i115 = i13;
                        fb91 fb91VarE7 = lb91.e(j2115, j14, j2116, j16, j2116, j13, j15, j2116, j17, j2116, x340Var2, 0);
                        cua cuaVar7 = cbx.b(x340Var2).f;
                        idn0 idn0Var10 = idn0Var3;
                        long j2117 = j14;
                        int i26 = i12;
                        Function0 function10 = function3;
                        rb91.a(f, iu30Var, py20.b(qim0Var, idn0Var10, 0L, er31.b(4.0f), (p3v) null, x340Var2, 0, 26), z5, function10, fb91VarE7, idn0Var10, i26, apo.r(919443068, new pje(fb91VarE7, z5, jC7), x340Var2), apo.r(1042347005, new mz0(z5, fb91VarE7, (byte) 2), x340Var2), ksgVar114, x340Var2, (i115 & 14) | 905969664 | (i115 & 112) | (i115 & 7168) | ((i115 >> 6) & 57344) | (29360128 & (i115 << 6)), (i115 >> 12) & 14, 0);
                        x340Var = x340Var2;
                        z4 = z5;
                        i11 = i26;
                        function2 = function10;
                        ksgVar3 = ksgVar114;
                        j10 = j16;
                        j11 = j2117;
                        long j2118 = j13;
                        idn0Var2 = idn0Var10;
                        j9 = j15;
                        j7 = j17;
                        j8 = j2118;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        j7 = j4;
                        j8 = j5;
                        ksgVar3 = ksgVar2;
                        i11 = i6;
                        function2 = function1;
                        idn0Var2 = idn0Var;
                        j9 = j3;
                        j10 = j6;
                        z4 = z2;
                        j11 = j;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new gxx(f, iu30Var, qim0Var, z4, ksgVar3, i11, function2, j11, j10, idn0Var2, j9, j7, j8, i2, i3);
                    }
                }
                i4 |= 1572864;
                function1 = function0;
                if ((12582912 & i2) == 0) {
                    if ((i3 & 128) == 0) {
                        i15 = i4;
                        if (x340Var2.f(j)) {
                        }
                        i10 = i15 | i18;
                    } else {
                        i15 = i4;
                    }
                    i10 = i15 | i18;
                } else {
                    i10 = i4;
                }
                if ((i2 & 100663296) == 0) {
                    j6 = j2;
                    if ((i3 & 256) == 0) {
                        i14 = 33554432;
                    } else {
                        i14 = 33554432;
                    }
                    i10 |= i14;
                } else {
                    j6 = j2;
                }
                if ((i2 & 805306368) == 0) {
                    i10 |= 268435456;
                }
                if ((306783379 & i10) == 306783378) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (x340Var2.Y(i10 & 1, z3)) {
                    x340Var2.d0();
                    if ((i2 & 1) != 0) {
                        if (i16 == 0) {
                        }
                        if ((i3 & 16) != 0) {
                            jsgVar = new jsg(0.0f, 1.0f);
                            i10 &= -57345;
                        } else {
                            jsgVar = ksgVar2;
                        }
                        if (i5 != 0) {
                            i6 = 0;
                        }
                        if (i8 != 0) {
                            function1 = null;
                        }
                        if ((i3 & 128) != 0) {
                            uwr uwrVar11117 = cbx.a;
                            j12 = cbx.a(x340Var2).c.c;
                            i10 &= -29360129;
                        } else {
                            j12 = j;
                        }
                        if ((i3 & 256) != 0) {
                            uwr uwrVar11118 = cbx.a;
                            j6 = cbx.a(x340Var2).c.b;
                            i10 &= -234881025;
                        }
                        idn0 idn0VarY14 = zso1.Y(x340Var2);
                        long j11114 = j12;
                        long jB117 = u7h.b(j11114, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                        long j11115 = j6;
                        long jB118 = u7h.b(j11115, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                        uwr uwrVar11119 = cbx.a;
                        ksg ksgVar115 = jsgVar;
                        idn0Var3 = idn0VarY14;
                        i12 = i6;
                        function3 = function1;
                        j13 = cbx.a(x340Var2).c.b;
                        z5 = z6;
                        ksgVar4 = ksgVar115;
                        i13 = (-1879048193) & i10;
                        j14 = j11114;
                        j15 = jB117;
                        j16 = j11115;
                        j17 = jB118;
                    } else {
                        if (i16 == 0) {
                        }
                        if ((i3 & 16) != 0) {
                            jsgVar = new jsg(0.0f, 1.0f);
                            i10 &= -57345;
                        } else {
                            jsgVar = ksgVar2;
                        }
                        if (i5 != 0) {
                            i6 = 0;
                        }
                        if (i8 != 0) {
                            function1 = null;
                        }
                        if ((i3 & 128) != 0) {
                            uwr uwrVar111110 = cbx.a;
                            j12 = cbx.a(x340Var2).c.c;
                            i10 &= -29360129;
                        } else {
                            j12 = j;
                        }
                        if ((i3 & 256) != 0) {
                            uwr uwrVar111111 = cbx.a;
                            j6 = cbx.a(x340Var2).c.b;
                            i10 &= -234881025;
                        }
                        idn0 idn0VarY15 = zso1.Y(x340Var2);
                        long j11116 = j12;
                        long jB119 = u7h.b(j11116, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                        long j11117 = j6;
                        long jB1110 = u7h.b(j11117, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                        uwr uwrVar111112 = cbx.a;
                        ksg ksgVar116 = jsgVar;
                        idn0Var3 = idn0VarY15;
                        i12 = i6;
                        function3 = function1;
                        j13 = cbx.a(x340Var2).c.b;
                        z5 = z6;
                        ksgVar4 = ksgVar116;
                        i13 = (-1879048193) & i10;
                        j14 = j11116;
                        j15 = jB119;
                        j16 = j11117;
                        j17 = jB1110;
                    }
                    x340Var2.s();
                    long jC8 = jhc1.c(16.0f, 16.0f);
                    lb91 lb91Var8 = lb91.a;
                    uwr uwrVar111113 = cbx.a;
                    ksg ksgVar117 = ksgVar4;
                    long j2119 = cbx.a(x340Var2).b.a;
                    long j21110 = u7h.j;
                    int i116 = i13;
                    fb91 fb91VarE8 = lb91.e(j2119, j14, j21110, j16, j21110, j13, j15, j21110, j17, j21110, x340Var2, 0);
                    cua cuaVar8 = cbx.b(x340Var2).f;
                    idn0 idn0Var11 = idn0Var3;
                    long j21111 = j14;
                    int i27 = i12;
                    Function0 function11 = function3;
                    rb91.a(f, iu30Var, py20.b(qim0Var, idn0Var11, 0L, er31.b(4.0f), (p3v) null, x340Var2, 0, 26), z5, function11, fb91VarE8, idn0Var11, i27, apo.r(919443068, new pje(fb91VarE8, z5, jC8), x340Var2), apo.r(1042347005, new mz0(z5, fb91VarE8, (byte) 2), x340Var2), ksgVar117, x340Var2, (i116 & 14) | 905969664 | (i116 & 112) | (i116 & 7168) | ((i116 >> 6) & 57344) | (29360128 & (i116 << 6)), (i116 >> 12) & 14, 0);
                    x340Var = x340Var2;
                    z4 = z5;
                    i11 = i27;
                    function2 = function11;
                    ksgVar3 = ksgVar117;
                    j10 = j16;
                    j11 = j21111;
                    long j21112 = j13;
                    idn0Var2 = idn0Var11;
                    j9 = j15;
                    j7 = j17;
                    j8 = j21112;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    j7 = j4;
                    j8 = j5;
                    ksgVar3 = ksgVar2;
                    i11 = i6;
                    function2 = function1;
                    idn0Var2 = idn0Var;
                    j9 = j3;
                    j10 = j6;
                    z4 = z2;
                    j11 = j;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new gxx(f, iu30Var, qim0Var, z4, ksgVar3, i11, function2, j11, j10, idn0Var2, j9, j7, j8, i2, i3);
                }
            }

            public static final void f(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
                int i2;
                b0k b0kVar2;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(650306155);
                if ((i & 6) == 0) {
                    i2 = (b0kVar3.g(str) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= b0kVar3.i(function0) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= b0kVar3.g(qim0Var) ? 256 : 128;
                }
                if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
                    String strO0 = cwl1.o0(b0kVar3, 2131961493);
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    } else {
                        b0kVar2 = b0kVar3;
                        foo1.c(new gbx(new y50(strO0), function0), ldx.c, qim0Var, null, yla.s(b0kVar3), new zzq0(0.0f, 0.0f, 0.0f, 0.0f), null, null, null, jhi.c, apo.r(-2102033396, new pji(str, (byte) 24), b0kVar3), b0kVar2, (i2 & 896) | 1572912, 54, 920);
                    }
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new o82(str, function0, qim0Var, i, (byte) 5);
                }
            }

            public static final void g(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var) {
                b0k b0kVar2;
                qim0 qim0Var2;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(916425363);
                int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128) | 3072;
                if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(b0kVar3).b;
                    uvx uvxVar = new uvx(0, (pgx) null, 5, new zzq0(16.0f, 16.0f, 16.0f, 16.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 499);
                    String strN0 = cwl1.n0(2131955921, new Object[]{str}, b0kVar3);
                    if (ihc1.y0(strN0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    gbx gbxVar = new gbx(new y50(strN0), function0);
                    j2i j2iVar = xni.a;
                    j2i j2iVarR = apo.r(-1140114244, new xo6(str2, str, (byte) 6), b0kVar3);
                    j2i j2iVar2 = xni.b;
                    j2i j2iVar3 = xni.c;
                    qim0Var2 = nim0.a;
                    b0kVar2 = b0kVar3;
                    jto1.b(qim0Var2, uvxVar, null, false, null, null, gbxVar, null, null, j2iVar, j2iVarR, j2iVar2, null, null, null, j2iVar3, b0kVar2, 805306438, 196662, 29116);
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new hq6(str, str2, function0, qim0Var2, i, (byte) 3);
                }
            }

            public static final void h(qim0 qim0Var, b0k b0kVar, int i) {
                qim0 qim0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1339371798);
                int i2 = i | 6;
                if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                    jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 6);
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
                    nko1.H(jw31VarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    Object objT = x340Var.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = lmm.Y0;
                        x340Var.s0(objT);
                    }
                    z50 z50Var = z50.c;
                    gbx gbxVar = new gbx(z50Var, (Function0) objT);
                    ldx ldxVar = ldx.c;
                    foo1.c(gbxVar, ldxVar, null, null, yla.s(x340Var), null, null, null, null, null, jhi.a, x340Var, 48, 48, 2012);
                    Object objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = lmm.Z0;
                        x340Var.s0(objT2);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT2), ldxVar, null, null, yla.s(x340Var), null, null, null, null, null, jhi.b, x340Var, 48, 48, 2012);
                    x340Var.r(true);
                    qim0Var2 = qim0Var3;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new wdk(qim0Var2, i, (byte) 5);
                }
            }

            public static final void i(nys0 nys0Var, qim0 qim0Var, b0k b0kVar, int i) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1071164848);
                byte b = 2;
                int i2 = (x340Var.g(nys0Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
                if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                    x340Var.b0();
                } else if (nys0Var.a) {
                    x340Var.i0(535123760);
                    wpx wpxVar = wpx.c;
                    jsl jslVar = new jsl(cwl1.o0(x340Var, 2131959735));
                    qim0 qim0VarK = d9y0.k(qim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    w0h1.a(wpxVar, jslVar, qim0VarK, cbx.a(x340Var).b.c, 0L, true, x340Var, wpx.d | 196608, 16);
                    x340Var.r(false);
                } else {
                    x340Var.i0(535433202);
                    x340Var.r(false);
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new hws0(nys0Var, qim0Var, i, b);
                }
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX WARN: Type inference failed for: r15v1 */
            /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r15v4 */
            public static final void j(dl01 dl01Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                x340 x340Var;
                ?? r15;
                x340 x340Var2;
                qim0 qim0Var;
                long j;
                x340 x340Var3 = (x340) b0kVar;
                x340Var3.k0(-193989154);
                int i2 = (i & 6) == 0 ? (x340Var3.i(dl01Var) ? 4 : 2) | i : i;
                if (x340Var3.Y(i2 & 1, (i2 & 3) != 2)) {
                    fra fraVar = een.N0;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var3).b;
                    jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, x340Var3, 0);
                    int iHashCode = Long.hashCode(x340Var3.T);
                    xos0 xos0VarM = x340Var3.m();
                    qim0 qim0Var2 = nim0.a;
                    qim0 qim0VarE = zr7.E(x340Var3, qim0Var2);
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
                    nko1.H(jw31VarA, x340Var3, y580.O0);
                    nko1.H(xos0VarM, x340Var3, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                    nko1.F(x340Var3);
                    nko1.H(qim0VarE, x340Var3, y580.Y);
                    if (dl01Var.c) {
                        x340Var3.i0(-1194022715);
                        c380<w4i1> c380Var = dl01Var.b;
                        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                        for (w4i1 w4i1Var : c380Var) {
                            String str = w4i1Var.c;
                            if (str == null) {
                                str = "";
                            }
                            arrayList.add(new phx(bro1.q(w4i1Var.d), str, w4i1Var.a, w4i1Var.b));
                        }
                        r15 = 0;
                        qim0Var = qim0Var2;
                        fc11.a(mqo1.A(arrayList), (qim0) null, hcx.a, (hux) null, true, 0, (gbx) null, (String) null, (idn0) null, x340Var3, 24968, 490);
                        x340Var2 = x340Var3;
                        x340Var2.r(false);
                    } else {
                        r15 = 0;
                        x340Var2 = x340Var3;
                        qim0Var = qim0Var2;
                        x340Var2.i0(-1193835320);
                        x340Var2.r(false);
                    }
                    cl01 cl01Var = dl01Var.a;
                    if (cl01Var instanceof zk01) {
                        x340Var2.i0(-1193749140);
                        hux huxVar = ((zk01) cl01Var).a;
                        uwr uwrVar2 = cbx.a;
                        long j2 = cbx.a(x340Var2).b.b;
                        zov0 zov0Var = cbx.b(x340Var2).g;
                        w0h1.a(huxVar, isl.a, u291.r(qim0Var, 12.0f), j2, 0L, false, x340Var2, 56, 48);
                        x340Var2.r((boolean) r15);
                    } else if (cl01Var instanceof bl01) {
                        x340Var2.i0(-1285425838);
                        d0p1.h(u291.r(qim0Var, 12.0f), x340Var2, r15);
                        x340Var2.r((boolean) r15);
                    } else {
                        if (!(cl01Var instanceof al01)) {
                            throw p3d1.k(x340Var2, -1285436181, (boolean) r15);
                        }
                        x340Var2.i0(-1285423074);
                        x340Var2.r((boolean) r15);
                    }
                    String str2 = dl01Var.d;
                    uwr uwrVar3 = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var2).j;
                    if (dl01Var.e) {
                        x340Var2.i0(-1285417790);
                        j = cbx.a(x340Var2).b.f;
                    } else {
                        x340Var2.i0(-1285416671);
                        j = cbx.a(x340Var2).b.b;
                    }
                    x340Var2.r((boolean) r15);
                    x340 x340Var4 = x340Var2;
                    uwo1.e(str2, null, lee1Var, j, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2034);
                    x340Var = x340Var4;
                    x340Var.r(true);
                } else {
                    x340Var = x340Var3;
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ug50(dl01Var, i, (byte) 22);
                }
            }

            public static final void k(float f, long j, cr31 cr31Var, qim0 qim0Var, b0k b0kVar, int i) {
                int i2;
                qim0 qim0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(81113228);
                if ((i & 6) == 0) {
                    i2 = (x340Var.d(1.0f) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var.d(f) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= x340Var.f(j) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i2 |= x340Var.g(cr31Var) ? 2048 : 1024;
                }
                int i3 = i2 | 24576;
                if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
                    qim0 qim0Var3 = nim0.a;
                    t1c.a(cwl1.l0(dug.f(u291.h(u291.f(qim0Var3, 1.0f), f), j, cr31Var), 0L, cr31Var, 13), x340Var, 0);
                    qim0Var2 = qim0Var3;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new uud(f, j, cr31Var, qim0Var2, i, (byte) 3);
                }
            }

            public static final void l(float f, long j, cr31 cr31Var, qim0 qim0Var, b0k b0kVar, int i) {
                qim0 qim0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-407077773);
                j06 j06Var = x340Var.a;
                int i2 = i | (x340Var.d(f) ? 4 : 2) | (x340Var.f(j) ? 32 : 16) | (x340Var.g(cr31Var) ? 256 : 128) | 3072;
                if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    uwr uwrVar = cbx.a;
                    mta mtaVar = cbx.b(x340Var).d;
                    cvx cvxVar = cbx.b(x340Var).b;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    qim0Var2 = nim0.a;
                    qim0 qim0VarY = uyn1.y(qim0Var2, 16.0f, 12.0f);
                    fra fraVar = een.N0;
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var, 48);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
                    nko1.H(qim0VarE, x340Var, lljVar4);
                    t1c.a(cwl1.l0(dug.f(u291.r(qim0Var2, 48.0f), j, cr31Var), 0L, cr31Var, 13), x340Var, 0);
                    wnb0 wnb0Var = new wnb0(1.0f, true);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
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
                    int i3 = i2 << 3;
                    int i4 = (i3 & 112) | 6 | (i3 & 896) | (i3 & 7168);
                    k(f, j, cr31Var, null, x340Var, i4);
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.h(qim0Var2, 6.0f));
                    k(f, j, cr31Var, null, x340Var, i4);
                    x340Var.r(true);
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new nd6(f, j, cr31Var, qim0Var2, i);
                }
            }

            /* JADX WARN: Code duplicated, block: B:37:0x0066  */
            /* JADX WARN: Code duplicated, block: B:38:0x0068  */
            /* JADX WARN: Code duplicated, block: B:41:0x0071 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:42:0x0073  */
            /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
            /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
            /* JADX WARN: Code duplicated, block: B:48:0x0102  */
            /* JADX WARN: Code duplicated, block: B:51:0x0157  */
            /* JADX WARN: Code duplicated, block: B:52:0x0170  */
            /* JADX WARN: Code duplicated, block: B:55:0x017e  */
            /* JADX WARN: Code duplicated, block: B:57:0x0183  */
            /* JADX WARN: Code duplicated, block: B:60:0x0190  */
            /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
            public static final void m(String str, long j, djc0 djc0Var, qim0 qim0Var, boolean z, b0k b0kVar, int i, int i2) {
                int i3;
                boolean z2;
                boolean z3;
                x340 x340Var;
                qim0 qim0Var2;
                boolean z4;
                h311 h311VarV;
                mic0 mic0VarT;
                qim0 qim0Var3;
                gfh0 gfh0VarC;
                int iHashCode;
                xos0 xos0VarM;
                qim0 qim0VarE;
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.k0(-1721255439);
                if ((i & 6) == 0) {
                    i3 = (x340Var2.g(str) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= x340Var2.f(j) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i3 |= x340Var2.g(djc0Var) ? 256 : 128;
                }
                int i4 = i3 | 3072;
                int i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        z2 = z;
                        i4 |= x340Var2.h(z2) ? 16384 : 8192;
                    }
                    if ((i4 & 9363) != 9362) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var2.Y(i4 & 1, z3)) {
                        if (i5 != 0) {
                            z2 = true;
                        }
                        uwr uwrVar = cbx.a;
                        long j2 = ((yex) zex.a.d).a;
                        mic0VarT = v9c.t(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.8f), new u7h(u7h.b(j2, 0.6f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(j2))}, 0.0f, 0.0f, 14);
                        qim0Var3 = nim0.a;
                        qim0 qim0VarZ = u291.z(u291.f(qim0Var3, 1.0f), (fra) null, 3);
                        gfh0VarC = t1c.c(een.d, false);
                        iHashCode = Long.hashCode(x340Var2.T);
                        xos0VarM = x340Var2.m();
                        qim0VarE = zr7.E(x340Var2, qim0VarZ);
                        hzj.A.getClass();
                        if (x340Var2.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var2.m0();
                        if (x340Var2.S) {
                            x340Var2.l(hmb0.t1);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(gfh0VarC, x340Var2, y580.O0);
                        nko1.H(xos0VarM, x340Var2, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                        nko1.F(x340Var2);
                        nko1.H(qim0VarE, x340Var2, y580.Y);
                        qim0Var2 = qim0Var3;
                        uwo1.e(str, o0c.d(u291.f(qim0Var3, 1.0f), (ni20) null, 3), null, j, null, null, 0, false, djc0Var, 0, null, x340Var2, (i4 & 14) | ((i4 << 6) & 7168) | ((i4 << 18) & 234881024), 0, 1780);
                        x340Var = x340Var2;
                        if (z2) {
                            x340Var.i0(323076362);
                            t1c.a(dug.e(h2c.a.b(qim0Var2), mic0VarT, null, 0.0f, 6), x340Var, 0);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(323150359);
                            x340Var.r(false);
                        }
                        x340Var.r(true);
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        qim0Var2 = qim0Var;
                    }
                    z4 = z2;
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new zsh(str, j, djc0Var, qim0Var2, z4, i, i2);
                    }
                }
                i4 = i3 | 27648;
                z2 = z;
                if ((i4 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var2.Y(i4 & 1, z3)) {
                    if (i5 != 0) {
                        z2 = true;
                    }
                    uwr uwrVar2 = cbx.a;
                    long j3 = ((yex) zex.a.d).a;
                    mic0VarT = v9c.t(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(j3, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.8f), new u7h(u7h.b(j3, 0.6f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(j3))}, 0.0f, 0.0f, 14);
                    qim0Var3 = nim0.a;
                    qim0 qim0VarZ2 = u291.z(u291.f(qim0Var3, 1.0f), (fra) null, 3);
                    gfh0VarC = t1c.c(een.d, false);
                    iHashCode = Long.hashCode(x340Var2.T);
                    xos0VarM = x340Var2.m();
                    qim0VarE = zr7.E(x340Var2, qim0VarZ2);
                    hzj.A.getClass();
                    if (x340Var2.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    qim0Var2 = qim0Var3;
                    uwo1.e(str, o0c.d(u291.f(qim0Var3, 1.0f), (ni20) null, 3), null, j, null, null, 0, false, djc0Var, 0, null, x340Var2, (i4 & 14) | ((i4 << 6) & 7168) | ((i4 << 18) & 234881024), 0, 1780);
                    x340Var = x340Var2;
                    if (z2) {
                        x340Var.i0(323076362);
                        t1c.a(dug.e(h2c.a.b(qim0Var2), mic0VarT, null, 0.0f, 6), x340Var, 0);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(323150359);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                z4 = z2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new zsh(str, j, djc0Var, qim0Var2, z4, i, i2);
                }
            }

            /* JADX WARN: Code duplicated, block: B:57:0x00b9  */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            public static n1d1 n(sk30 sk30Var, String str) {
                int i;
                String upperCase = ihc1.e1(str).toString().toUpperCase(Locale.ROOT);
                int i2 = 2;
                int length = upperCase.length() - 2;
                int i3 = -1;
                if (length >= 0) {
                    int iV0 = 0;
                    loop0: while (iV0 < length) {
                        char cCharAt = upperCase.charAt(iV0);
                        if (u890.q(cCharAt, 32) > 0) {
                            if (cCharAt != '-') {
                                if (cCharAt == '/') {
                                    int iV1 = iV0 + 1;
                                    if (upperCase.charAt(iV1) == '*') {
                                        do {
                                            iV1 = ihc1.v0(upperCase, '*', iV1 + 1, 4);
                                            if (iV1 < 0) {
                                                break loop0;
                                            }
                                            i = iV1 + 1;
                                            if (i >= length) {
                                                break;
                                            }
                                        } while (upperCase.charAt(i) != '/');
                                        iV0 = iV1 + 2;
                                    }
                                }
                                i3 = iV0;
                                break;
                            }
                            if (upperCase.charAt(iV0 + 1) != '-') {
                                i3 = iV0;
                                break;
                            }
                            iV0 = ihc1.v0(upperCase, '\n', iV0 + 2, 4);
                            if (iV0 < 0) {
                                break;
                            }
                        }
                        iV0++;
                    }
                }
                zov0 zov0Var = null;
                String strSubstring = (i3 < 0 || i3 > upperCase.length()) ? null : upperCase.substring(i3, Math.min(i3 + 3, upperCase.length()));
                if (strSubstring == null) {
                    return new k1d1(sk30Var, str);
                }
                switch (strSubstring.hashCode()) {
                    case 65636:
                        if (!strSubstring.equals("BEG")) {
                            i2 = 0;
                        } else if (!ihc1.h0(upperCase, "EXCLUSIVE", false)) {
                            i2 = !ihc1.h0(upperCase, "IMMEDIATE", false) ? 5 : 4;
                        } else {
                            i2 = 3;
                        }
                        break;
                    case 66913:
                        if (!strSubstring.equals("COM")) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        break;
                    case 68795:
                        if (!strSubstring.equals("END")) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        break;
                    case 81327:
                        if (!strSubstring.equals("ROL") || ihc1.h0(upperCase, " TO ", false)) {
                            i2 = 0;
                        }
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                if (i2 != 0) {
                    return new m1d1(sk30Var, str, i2);
                }
                if (strSubstring.equals("PRA") && ihc1.h0(ihc1.U0(upperCase.toLowerCase(Locale.ROOT), "journal_mode", ""), "=", false)) {
                    zov0Var = zov0.h;
                }
                if (zov0Var != null) {
                    return new j1d1(sk30Var, str, new l1d1(sk30Var, str));
                }
                int iHashCode = strSubstring.hashCode();
                return (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) ? new k1d1(sk30Var, str) : new l1d1(sk30Var, str);
            }

            public static final String o(h0h1 h0h1Var) {
                StringBuilder sb = new StringBuilder("type: " + h0h1Var);
                sb.append('\n');
                sb.append("hashCode: " + h0h1Var.hashCode());
                sb.append('\n');
                sb.append("javaClass: " + h0h1Var.getClass().getCanonicalName());
                sb.append('\n');
                for (n9r n9rVarS = h0h1Var.s(); n9rVarS != null; n9rVarS = n9rVarS.k()) {
                    sb.append("fqName: ".concat(cht.c.u(n9rVarS)));
                    sb.append('\n');
                    sb.append("javaClass: " + n9rVarS.getClass().getCanonicalName());
                    sb.append('\n');
                }
                return sb.toString();
            }

            public static float p() {
                return phc0.b;
            }

            public static int q(AccessibilityEvent accessibilityEvent) {
                return accessibilityEvent.getContentChangeTypes();
            }

            public static float r() {
                return phc0.c;
            }

            public static final boolean s(qz61 qz61Var, boolean z, boolean z2) {
                if (z && z2) {
                    if (u890.j(qz61Var != null ? qz61Var.a : null, tyo1.p(blc0.ug, new String[0]))) {
                        return true;
                    }
                }
                return false;
            }

            public static final boolean t(zui0 zui0Var) {
                boolean z;
                String str;
                String str2;
                boolean z2 = zui0Var.e;
                List list = zui0Var.b;
                boolean z3 = (z2 && ((str = zui0Var.c) == null || ihc1.y0(str) || (str2 = zui0Var.d) == null || ihc1.y0(str2))) ? false : true;
                if (list.isEmpty()) {
                    z = false;
                } else {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                uui0 uui0Var = (uui0) it.next();
                                if (ihc1.y0(uui0Var.a) || ihc1.y0(uui0Var.b) || ihc1.y0(uui0Var.d) || ihc1.y0(uui0Var.e)) {
                                    z = false;
                                }
                            }
                        }
                    }
                    z = true;
                }
                return z3 && z;
            }

            public static final lvl0 u(urk0 urk0Var, x78 x78Var) {
                d8r0 d8r0Var = x78Var.j;
                return new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var.b, d8r0Var.a, d8r0Var.e), d8r0Var.d), x78Var.i, (byte) 3);
            }

            public static opc v(h8o0 h8o0Var) {
                long j;
                boolean z;
                long j2;
                long j3;
                long j4;
                long j5;
                long jCurrentTimeMillis = System.currentTimeMillis();
                Map map = h8o0Var.b;
                if (map == null) {
                    return null;
                }
                String str = (String) map.get("Date");
                long jW = str != null ? w(str) : 0L;
                String str2 = (String) map.get("Cache-Control");
                int i = 0;
                if (str2 != null) {
                    String[] strArrSplit = str2.split(",", 0);
                    z = false;
                    j2 = 0;
                    j3 = 0;
                    while (i < strArrSplit.length) {
                        String strTrim = strArrSplit[i].trim();
                        if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                            return null;
                        }
                        if (strTrim.startsWith("max-age=")) {
                            try {
                                j2 = Long.parseLong(strTrim.substring(8));
                            } catch (Exception unused) {
                            }
                        } else if (strTrim.startsWith("stale-while-revalidate=")) {
                            j3 = Long.parseLong(strTrim.substring(23));
                        } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                            z = true;
                        }
                        i++;
                    }
                    j = 0;
                    i = 1;
                } else {
                    j = 0;
                    z = false;
                    j2 = 0;
                    j3 = 0;
                }
                String str3 = (String) map.get("Expires");
                long jW2 = str3 != null ? w(str3) : j;
                String str4 = (String) map.get("Last-Modified");
                long jW3 = str4 != null ? w(str4) : j;
                String str5 = (String) map.get("ETag");
                if (i != 0) {
                    long j6 = (j2 * 1000) + jCurrentTimeMillis;
                    j5 = z ? j6 : (j3 * 1000) + j6;
                    j4 = j6;
                } else {
                    j4 = (jW <= j || jW2 < jW) ? j : (jW2 - jW) + jCurrentTimeMillis;
                    j5 = j4;
                }
                opc opcVar = new opc();
                opcVar.a = h8o0Var.a;
                opcVar.b = str5;
                opcVar.f = j4;
                opcVar.e = j5;
                opcVar.c = jW;
                opcVar.d = jW3;
                opcVar.g = map;
                opcVar.h = h8o0Var.c;
                return opcVar;
            }

            public static long w(String str) {
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
                    simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
                    return simpleDateFormat.parse(str).getTime();
                } catch (ParseException unused) {
                    if ("0".equals(str) || "-1".equals(str)) {
                        vqk1.b("Unable to parse dateStr: %s, falling back to 0", new Object[]{str});
                        return 0L;
                    }
                    vqk1.a("Unable to parse dateStr: %s, falling back to 0", new Object[]{str});
                    return 0L;
                }
            }

            public static void x(AccessibilityEvent accessibilityEvent, boolean z) {
                if (Build.VERSION.SDK_INT >= 34) {
                    sf.I(accessibilityEvent, z);
                }
            }

            public static void y(int i, AccessibilityEvent accessibilityEvent) {
                accessibilityEvent.setContentChangeTypes(i);
            }

            public static final avi0 z(zui0 zui0Var) {
                List<uui0> list = zui0Var.b;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (uui0 uui0Var : list) {
                    arrayList.add(new ivi0(uui0Var.a, uui0Var.b, uui0Var.c, uui0Var.d, uui0Var.e));
                }
                return new avi0(zui0Var.c, zui0Var.d, arrayList, zui0Var.e);
            }
        }
