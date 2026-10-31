package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class w6k {
    public static final long a = u7h.b(u7h.f, 0.1f, 0.0f, 0.0f, 0.0f, 14);
    public static final float b = 104.0f;
    public static final float c = 184.0f;
    public static final float d = 95.0f;
    public static final float e = 168.0f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    public static final void a(i5d i5dVar, yqg yqgVar, boolean z, boolean z2, u7h u7hVar, u7h u7hVar2, Function0 function0, Function0 function1, Function0 function2, Function0 function3, iu30 iu30Var, Function0 function4, iu30 iu30Var2, wr21 wr21Var, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        b0k b0kVar2;
        long j;
        boolean z3;
        long j2;
        int i3;
        float f;
        ?? r15;
        Object obj;
        tob1 tob1Var;
        Object obj2 = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1054850157);
        j06 j06Var = ((x340) b0kVar3).a;
        int i4 = (i & 6) == 0 ? (b0kVar3.i(i5dVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= b0kVar3.g(yqgVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= b0kVar3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= b0kVar3.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= b0kVar3.g(u7hVar) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= b0kVar3.g(u7hVar2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= b0kVar3.i(function0) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= b0kVar3.i(function1) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= b0kVar3.i(function2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= b0kVar3.i(function3) ? 536870912 : 268435456;
        }
        int i5 = (i2 & 6) == 0 ? i2 | (b0kVar3.i(iu30Var) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i5 |= b0kVar3.i(function4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= b0kVar3.i(iu30Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= b0kVar3.i(wr21Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= b0kVar3.i(vu30Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= b0kVar3.i(qim0Var) ? 131072 : 65536;
        }
        if (b0kVar3.Y(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 74899) == 74898) ? false : true)) {
            pxk0 pxk0VarC = mno1.C((op80) gfe0.a(b0kVar3).getValue());
            pxk0 pxk0Var = pxk0VarC instanceof pxk0 ? pxk0VarC : null;
            Object objT = b0kVar3.T();
            if (objT == obj2) {
                objT = new rie1();
                b0kVar3.s0(objT);
            }
            rie1 rie1Var = (rie1) objT;
            Long l = i5dVar.i;
            af5 af5Var = i5dVar.c;
            pxk0 pxk0Var2 = pxk0Var;
            ArrayList arrayList = i5dVar.g;
            String strO = hno1.o(l, yqgVar, b0kVar3, i4 & 112);
            boolean zG = b0kVar3.g(wr21Var != null ? wr21Var.a : null);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == obj2) {
                objT2 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == obj2) {
                objT3 = v8r.q((Object) null);
                b0kVar3.s0(objT3);
            }
            tob1 tob1Var2 = (ven0) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == obj2) {
                objT4 = v8r.q((Object) null);
                b0kVar3.s0(objT4);
            }
            ven0 ven0Var2 = (ven0) objT4;
            mmr0 mmr0Var = (mmr0) ven0Var2.getValue();
            boolean zI = b0kVar3.i(ven0Var2) | ((i5 & 57344) == 16384);
            Object objT5 = b0kVar3.T();
            if (zI || objT5 == obj2) {
                objT5 = new zti(ven0Var2, vu30Var, (lnm) null, (byte) 5);
                b0kVar3.s0(objT5);
            }
            qxd0.t(mmr0Var, b0kVar3, (vu30) objT5);
            boolean zG2 = b0kVar3.g(arrayList);
            Object objT6 = b0kVar3.T();
            if (zG2 || objT6 == obj2) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (obj3 instanceof s5d) {
                        arrayList2.add(obj3);
                    }
                }
                s5d s5dVar = (s5d) o7h.s0(arrayList2);
                String str = s5dVar != null ? s5dVar.b : null;
                b0kVar3.s0(str);
                objT6 = str;
            }
            String str2 = (String) objT6;
            if (strO != null) {
                af5Var = gf5.b(af5Var, strO);
            } else if (ihc1.h0(af5Var.b, "{{COUNTDOWN}}", false)) {
                af5Var = new af5("");
            }
            vue1 vue1Var = new vue1(2);
            if (u7hVar == null) {
                b0kVar3.i0(98779825);
                uwr uwrVar = cbx.a;
                j = cbx.a(b0kVar3).a.c;
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(98778120);
                b0kVar3.r(false);
                j = u7hVar.a;
            }
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarF);
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
            gra graVar2 = een.g;
            h2c h2cVar = h2c.a;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF2 = u291.f(h2cVar.a(nim0Var, graVar2), 1.0f);
            float f2 = e;
            af5 af5Var2 = af5Var;
            qim0 qim0VarF3 = dug.f(i1p1.q(uyn1.z(0.0f, ((Boolean) ven0Var.getValue()).booleanValue() ? 8.0f : 0.0f, 1, u291.j((wr21Var == null || ((Boolean) ven0Var.getValue()).booleanValue()) ? 0.0f : f2, 0.0f, 2, qim0VarF2)), vue1Var), j, vue1Var);
            uwr uwrVar2 = cbx.a;
            avw0 avw0Var = cbx.b(b0kVar3).c;
            if (u7hVar2 == null) {
                b0kVar3.i0(84236843);
                j2 = cbx.a(b0kVar3).b.a;
                z3 = false;
                b0kVar3.r(false);
            } else {
                z3 = false;
                b0kVar3.i0(84235324);
                b0kVar3.r(false);
                j2 = u7hVar2.a;
            }
            qim0 qim0VarE2 = d1u.E(2.0f, u7h.b(j2, 0.5f, 0.0f, 0.0f, 0.0f, 14), qim0VarF3, vue1Var);
            gfh0 gfh0VarC2 = t1c.c(graVar, z3);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE3 = zr7.E(b0kVar3, qim0VarE2);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(gfh0VarC2, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE3, b0kVar3, lljVar4);
            float f3 = cbx.b(b0kVar3).b.a;
            float f4 = cbx.b(b0kVar3).b.a;
            boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            float f5 = b;
            if (zBooleanValue) {
                b0kVar3.i0(1133071454);
                f = f5 + cbx.b(b0kVar3).b.b;
                i3 = 0;
                b0kVar3.r(false);
            } else {
                i3 = 0;
                b0kVar3.i0(1133174622);
                f = cbx.b(b0kVar3).b.a;
                b0kVar3.r(false);
            }
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarA = uyn1.A(nim0Var, f3, f4, f, 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, i3);
            int iHashCode3 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM3 = b0kVar3.m();
            qim0 qim0VarE4 = zr7.E(b0kVar3, qim0VarA);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, lljVar);
            nko1.H(xos0VarM3, b0kVar3, lljVar2);
            x0d.q(iHashCode3, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE4, b0kVar3, lljVar4);
            gfx.b(1, apo.r(836627350, new mzj(i5dVar, af5Var2, u7hVar2, (byte) 3), b0kVar3), b0kVar3, 54);
            if (arrayList.isEmpty()) {
                b0kVar2 = b0kVar3;
                r15 = 0;
                b0kVar2.i0(227894455);
                b0kVar2.r(false);
            } else {
                b0kVar3.i0(226844082);
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                cvx cvxVar3 = ywx0.k(nim0Var, 4.0f, b0kVar3, b0kVar3).b;
                d36 d36Var = new d36(12.0f, true, new um5(false));
                cvx cvxVar4 = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                r15 = 0;
                k5p1.d(u291.f(nim0Var, 1.0f), d36Var, new d36(2.0f, true, new um5(false)), (pl3) null, 0, 0, apo.r(730882603, new o6k(i5dVar, z2, z, u7hVar2, j, function0, function1, function2, function3, iu30Var, function4, iu30Var2), b0kVar2), b0kVar2, 1572864, 56);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
            b0kVar2.r(true);
            if (wr21Var == null) {
                b0kVar2.i0(-1679763058);
                b0kVar2.r((boolean) r15);
                tob1Var = tob1Var2;
                obj = obj2;
            } else {
                b0kVar2.i0(-1679763057);
                ?? r9 = (((Boolean) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: TERNARY (r9v19 'r9' ??) = (((wrap boolean:0x051c: INVOKE 
                      (wrap java.lang.Boolean:0x051a: CHECK_CAST (java.lang.Boolean) (wrap java.lang.Object:0x0516: INVOKE (r20v1 ?? I:??[OBJECT, ARRAY]) INTERFACE call: p.tob1.getValue():java.lang.Object A[WRAPPED] (LINE:169)))
                     VIRTUAL call: java.lang.Boolean.booleanValue():boolean A[MD:():boolean (c), WRAPPED] (LINE:169)) == true && (wrap p.rs30:0x0526: CHECK_CAST (p.rs30) (wrap java.lang.Object:0x0522: INVOKE (r23v1 p.tob1) INTERFACE call: p.tob1.getValue():java.lang.Object A[WRAPPED] (LINE:170))) == (null p.rs30))) ? (1 ??[boolean, int, float, short, byte, char]) : (r15v6 'r15' ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) in method: p.w6k.a(p.i5d, p.yqg, boolean, boolean, p.u7h, p.u7h, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.iu30, kotlin.jvm.functions.Function0, p.iu30, p.wr21, p.vu30, p.qim0, p.b0k, int, int):void, file: /workspace/spotify-analysis/dex-input/classes8.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v1 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1721
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.w6k.a(p.i5d, p.yqg, boolean, boolean, p.u7h, p.u7h, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.iu30, kotlin.jvm.functions.Function0, p.iu30, p.wr21, p.vu30, p.qim0, p.b0k, int, int):void");
            }

            public static final void b(a9k a9kVar, yqg yqgVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, iu30 iu30Var, Function0 function4, qim0 qim0Var, iu30 iu30Var2, vu30 vu30Var, b0k b0kVar, int i) {
                x340 x340Var;
                qim0 qim0Var2;
                qim0 qim0Var3;
                qim0 qim0Var4;
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.k0(-1814956346);
                int i2 = i | (x340Var2.i(a9kVar) ? 4 : 2) | (x340Var2.g(yqgVar) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128) | (x340Var2.i(function1) ? 2048 : 1024) | (x340Var2.i(function2) ? 16384 : 8192) | (x340Var2.i(function3) ? 131072 : 65536) | (x340Var2.i(iu30Var) ? 1048576 : 524288) | (x340Var2.i(function4) ? 8388608 : 4194304) | 100663296 | (x340Var2.i(iu30Var2) ? 536870912 : 268435456);
                int i3 = x340Var2.i(vu30Var) ? 4 : 2;
                if (x340Var2.Y(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 3) == 2) ? false : true)) {
                    x340Var2.d0();
                    if ((i & 1) == 0 || x340Var2.E()) {
                        qim0Var3 = nim0.a;
                    } else {
                        x340Var2.b0();
                        qim0Var3 = qim0Var;
                    }
                    x340Var2.s();
                    if (a9kVar.g != null) {
                        x340Var2.i0(-20673762);
                        int i4 = i2 << 12;
                        a(a9kVar.g, yqgVar, a9kVar.k, a9kVar.l, a9kVar.m, a9kVar.n, function0, function1, function2, function3, iu30Var, function4, iu30Var2, a9kVar.o, vu30Var, qim0Var3, x340Var2, (i2 & 112) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192), ((i3 << 12) & 57344) | ((i2 >> 18) & 126) | ((i2 >> 21) & 896) | 196608);
                        qim0Var4 = qim0Var3;
                        x340Var = x340Var2;
                        x340Var.r(false);
                    } else {
                        x340Var = x340Var2;
                        qim0Var4 = qim0Var3;
                        if (a9kVar.h) {
                            x340Var.i0(-19912557);
                            d(qim0Var4, x340Var, 6);
                            x340Var.r(false);
                        } else if (a9kVar.i != null) {
                            x340Var.i0(-19842683);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(-19755108);
                            x340Var.r(false);
                        }
                    }
                    qim0Var2 = qim0Var4;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new r6k(a9kVar, yqgVar, function0, function1, function2, function3, iu30Var, function4, qim0Var2, iu30Var2, vu30Var, i);
                }
            }

            public static final void c(u5d u5dVar, boolean z, boolean z2, u7h u7hVar, long j, Function0 function0, Function0 function1, Function0 function2, Function0 function3, iu30 iu30Var, Function0 function4, iu30 iu30Var2, b0k b0kVar, int i) {
                x340 x340Var;
                hdx hdxVar;
                hdx hdxVar2;
                boolean z3;
                String strK;
                boolean z4;
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.k0(390702603);
                int i2 = i | (x340Var2.g(u5dVar) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.h(z2) ? 256 : 128) | (x340Var2.g(u7hVar) ? 2048 : 1024) | (x340Var2.f(j) ? 16384 : 8192) | (x340Var2.i(function0) ? 131072 : 65536) | (x340Var2.i(function1) ? 1048576 : 524288) | (x340Var2.i(function2) ? 8388608 : 4194304) | (x340Var2.i(function3) ? 67108864 : 33554432) | (x340Var2.i(iu30Var) ? 536870912 : 268435456);
                int i3 = (x340Var2.i(function4) ? (char) 4 : (char) 2) | (x340Var2.i(iu30Var2) ? ' ' : (char) 16);
                if (x340Var2.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 19) == 18) ? false : true)) {
                    if (u7hVar != null) {
                        x340Var2.i0(60347836);
                        boolean z5 = (57344 & i2) == 16384;
                        Object objT = x340Var2.T();
                        if (z5 || objT == m4cVar) {
                            objT = new sre((byte) 6, j);
                            x340Var2.s0(objT);
                        }
                        vu30 vu30Var = (vu30) objT;
                        boolean z6 = (i2 & 7168) == 2048;
                        Object objT2 = x340Var2.T();
                        if (z6 || objT2 == m4cVar) {
                            objT2 = new jsf(u7hVar, (byte) 1);
                            x340Var2.s0(objT2);
                        }
                        hdxVar = new hdx(6, vu30Var, (vu30) objT2, (vu30) null, (hw61) null, 24);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(60513903);
                        Object objT3 = x340Var2.T();
                        if (objT3 == m4cVar) {
                            objT3 = yzj.d;
                            x340Var2.s0(objT3);
                        }
                        hdxVar = new hdx(6, (vu30) null, (vu30) objT3, (vu30) null, (hw61) null, 26);
                        x340Var2.r(false);
                    }
                    if (u7hVar != null) {
                        x340Var2.i0(60742993);
                        int i4 = i2 & 7168;
                        boolean z7 = i4 == 2048;
                        Object objT4 = x340Var2.T();
                        if (z7 || objT4 == m4cVar) {
                            objT4 = new jsf(u7hVar, (byte) 2);
                            x340Var2.s0(objT4);
                        }
                        vu30 vu30Var2 = (vu30) objT4;
                        boolean z8 = i4 == 2048;
                        Object objT5 = x340Var2.T();
                        if (z8 || objT5 == m4cVar) {
                            objT5 = new jsf(u7hVar, (byte) 3);
                            x340Var2.s0(objT5);
                        }
                        hdxVar2 = new hdx(0, vu30Var2, (vu30) null, (vu30) objT5, (hw61) null, 21);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(60878990);
                        x340Var2.r(false);
                        hdxVar2 = jdx.c;
                    }
                    if (u5dVar instanceof o5d) {
                        x340Var2.i0(60982623);
                        if (ihc1.y0("Join Waitlist")) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return;
                        } else {
                            foo1.c(new gbx(new y50("Join Waitlist"), function0), ((o5d) u5dVar).a ? hdxVar : hdxVar2, (qim0) null, (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1950432140, new s6k(u5dVar, (byte) 2), x340Var2), x340Var2, 0, 48, 2012);
                            x340Var = x340Var2;
                            x340Var.r(false);
                        }
                    } else {
                        x340Var = x340Var2;
                        if (u5dVar instanceof t5d) {
                            x340Var.i0(61438912);
                            Object objT6 = x340Var.T();
                            if (objT6 == m4cVar) {
                                objT6 = fki.Y0;
                                x340Var.s0(objT6);
                            }
                            Function0 function5 = (Function0) objT6;
                            if (ihc1.y0("Joined Waitlist")) {
                                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                return;
                            } else {
                                foo1.c(new gbx(new y50("Joined Waitlist"), function5), new idx(6), (qim0) null, new hax("Already joined waitlist"), yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, eei.a, apo.r(-1209189845, new s6k(u5dVar, (byte) 3), x340Var), x340Var, 0, 54, 972);
                                x340Var.r(false);
                            }
                        } else if (u5dVar instanceof q5d) {
                            x340Var.i0(62171690);
                            if (z) {
                                x340Var.i0(62209758);
                                strK = ((q5d) u5dVar).c;
                                if (strK == null) {
                                    z4 = false;
                                    strK = x0d.k(x340Var, 1803122921, 2131954190, x340Var, false);
                                } else {
                                    z4 = false;
                                    x340Var.i0(1803122084);
                                    x340Var.r(false);
                                }
                                x340Var.r(z4);
                            } else {
                                x340Var.i0(62325636);
                                strK = ((q5d) u5dVar).b;
                                if (strK == null) {
                                    strK = x0d.k(x340Var, 1803126473, 2131954193, x340Var, false);
                                } else {
                                    x340Var.i0(1803125822);
                                    x340Var.r(false);
                                }
                                x340Var.r(false);
                            }
                            if (ihc1.y0(strK)) {
                                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                return;
                            } else {
                                foo1.c(new gbx(new y50(strK), function3), ((q5d) u5dVar).a ? hdxVar : hdxVar2, (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, apo.r(2043156557, new dr0((byte) 12, z), x340Var), apo.r(-1767173908, new pji(strK, (byte) 12), x340Var), x340Var, 0, 54, 988);
                                x340Var.r(false);
                            }
                        } else if (u5dVar instanceof m5d) {
                            x340Var.i0(63038698);
                            boolean z9 = ((1879048192 & i2) == 536870912) | ((i2 & 14) == 4);
                            Object objT7 = x340Var.T();
                            if (z9 || objT7 == m4cVar) {
                                objT7 = new t6k(iu30Var, u5dVar, (byte) 1);
                                x340Var.s0(objT7);
                            }
                            Function0 function6 = (Function0) objT7;
                            if (ihc1.y0("Buy tickets")) {
                                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                return;
                            } else {
                                foo1.c(new gbx(new y50("Buy tickets"), function6), ((m5d) u5dVar).a ? hdxVar : hdxVar2, (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, eei.b, apo.r(1969809325, new s6k(u5dVar, (byte) 4), x340Var), x340Var, 0, 54, 988);
                                x340Var.r(false);
                            }
                        } else if (u5dVar instanceof p5d) {
                            x340Var.i0(63717133);
                            if (z2) {
                                z3 = false;
                                x340Var.i0(64120567);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(63745777);
                                if (ihc1.y0("Not Interested")) {
                                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                    return;
                                } else {
                                    foo1.c(new gbx(new y50("Not Interested"), function2), hdxVar2, (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1346138445, new s6k(u5dVar, (byte) 5), x340Var), x340Var, 0, 48, 2012);
                                    z3 = false;
                                    x340Var.r(false);
                                }
                            }
                            x340Var.r(z3);
                        } else {
                            hdx hdxVar3 = hdxVar2;
                            if (u5dVar instanceof n5d) {
                                x340Var.i0(64172461);
                                if (ihc1.y0("Can't attend")) {
                                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                    return;
                                } else {
                                    foo1.c(new gbx(new y50("Can't attend"), function1), hdxVar3, (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(853841199, new s6k(u5dVar, (byte) 6), x340Var), x340Var, 0, 48, 2012);
                                    x340Var.r(false);
                                }
                            } else if (u5dVar instanceof r5d) {
                                x340Var.i0(64567494);
                                if (ihc1.y0("Show more shows")) {
                                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                    return;
                                } else {
                                    foo1.c(new gbx(new y50("Show more shows"), function4), hdxVar3, (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(295857136, new s6k(u5dVar, (byte) 0), x340Var), x340Var, 0, 48, 2012);
                                    x340Var.r(false);
                                }
                            } else {
                                if (!(u5dVar instanceof s5d)) {
                                    throw p3d1.k(x340Var, 1803085204, false);
                                }
                                x340Var.i0(64969936);
                                boolean z10 = ((i3 & 112) == 32) | ((i2 & 14) == 4);
                                Object objT8 = x340Var.T();
                                if (z10 || objT8 == m4cVar) {
                                    objT8 = new t6k(iu30Var2, u5dVar, (byte) 0);
                                    x340Var.s0(objT8);
                                }
                                gbx gbxVar = new gbx(z50.c, (Function0) objT8);
                                if (((s5d) u5dVar).a) {
                                    hdxVar3 = hdxVar;
                                }
                                foo1.c(gbxVar, hdxVar3, (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, eei.c, apo.r(-262126927, new s6k(u5dVar, (byte) 1), x340Var), x340Var, 0, 54, 988);
                                x340Var.r(false);
                            }
                        }
                    }
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new u6k(u5dVar, z, z2, u7hVar, j, function0, function1, function2, function3, iu30Var, function4, iu30Var2, i);
                }
            }

            public static final void d(qim0 qim0Var, b0k b0kVar, int i) {
                int i2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1022980081);
                j06 j06Var = x340Var.a;
                if ((i & 6) == 0) {
                    i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                    vue1 vue1Var = new vue1(2);
                    qim0 qim0VarQ = i1p1.q(u291.h(u291.f(qim0Var, 1.0f), 180.0f), vue1Var);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarE = d1u.E(1.0f, a, dug.f(qim0VarQ, cbx.a(x340Var).a.b.a(), vue1Var), vue1Var);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarE);
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
                    nko1.H(qim0VarE2, x340Var, lljVar4);
                    float f = cbx.b(x340Var).b.a;
                    float f2 = cbx.b(x340Var).b.a;
                    float f3 = cbx.b(x340Var).b.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarA = uyn1.A(nim0Var, f, f2, f3, 16.0f);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarA);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA, x340Var, lljVar);
                    nko1.H(xos0VarM2, x340Var, lljVar2);
                    x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar4);
                    fra fraVar = een.N0;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    jw31 jw31VarA = ew31.a(h36.g, fraVar, x340Var, 0);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE4 = zr7.E(x340Var, qim0VarF);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(jw31VarA, x340Var, lljVar);
                    nko1.H(xos0VarM3, x340Var, lljVar2);
                    x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE4, x340Var, lljVar4);
                    f(112.0f, 14.0f, null, null, "concert_campaign_card_loading_pretitle", x340Var, 24576, 12);
                    f(76.0f, 32.0f, null, er31.b(16.0f), "concert_campaign_card_loading_tag", x340Var, 24576, 4);
                    x340Var.r(true);
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.h(nim0Var, 8.0f));
                    f(220.0f, 20.0f, null, null, "concert_campaign_card_loading_title", x340Var, 24576, 12);
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.h(nim0Var, 8.0f));
                    f(280.0f, 14.0f, null, null, "concert_campaign_card_loading_description", x340Var, 24576, 12);
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    cvx cvxVar5 = ywx0.k(nim0Var, 4.0f, x340Var, x340Var).b;
                    jw31 jw31VarA2 = ew31.a(new d36(12.0f, true, new um5(false)), een.Z, x340Var, 0);
                    int iHashCode4 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM4 = x340Var.m();
                    qim0 qim0VarE5 = zr7.E(x340Var, nim0Var);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(jw31VarA2, x340Var, lljVar);
                    nko1.H(xos0VarM4, x340Var, lljVar2);
                    x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE5, x340Var, lljVar4);
                    f(128.0f, 32.0f, null, er31.b(16.0f), "concert_campaign_card_loading_secondary_button", x340Var, 24576, 4);
                    f(156.0f, 32.0f, null, er31.b(16.0f), "concert_campaign_card_loading_primary_button", x340Var, 24576, 4);
                    us71.m(x340Var, true, true, true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new mq2(qim0Var, i, (byte) 5);
                }
            }

            public static final void e(wr21 wr21Var, boolean z, iu30 iu30Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
                m4c m4cVar = fkj0.X;
                String str = wr21Var.b;
                b0k b0kVar2 = (x340) b0kVar;
                b0kVar2.k0(2000297151);
                int i2 = i | (b0kVar2.i(wr21Var) ? 4 : 2) | (b0kVar2.h(z) ? 32 : 16) | (b0kVar2.i(iu30Var) ? 256 : 128) | (b0kVar2.i(function0) ? 2048 : 1024) | (b0kVar2.i(qim0Var) ? 16384 : 8192);
                if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
                    String strO0 = cwl1.o0(b0kVar2, 2131954199);
                    Uri uri = Uri.parse(wr21Var.a);
                    long jC = jhc1.c(b, c);
                    int i3 = i2 & 896;
                    boolean z2 = i3 == 256;
                    Object objT = b0kVar2.T();
                    if (z2 || objT == m4cVar) {
                        objT = new usj(iu30Var, (byte) 6);
                        b0kVar2.s0(objT);
                    }
                    iu30 iu30Var2 = (iu30) objT;
                    boolean z3 = i3 == 256;
                    Object objT2 = b0kVar2.T();
                    if (z3 || objT2 == m4cVar) {
                        objT2 = new usj(iu30Var, (byte) 7);
                        b0kVar2.s0(objT2);
                    }
                    ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, true, false, (j6m) null, iu30Var2, (iu30) objT2, (iu30) null, jC, b0kVar2, 100663296, 0, 85758);
                    b0kVar2 = b0kVar2;
                    jsl jslVar = (!z || ihc1.y0(str)) ? isl.a : new jsl(str);
                    qim0 qim0VarK = d9y0.k(qim0Var, z ? 1.0f : 0.0f);
                    qim0 qim0VarX = nim0.a;
                    if (z) {
                        qim0VarX = bin.x(anm1.N("reserved-share-artwork-loaded", qim0VarX), false, strO0, new pm31(0), (idn0) null, function0, 9);
                    }
                    eso1.h(ni7VarA, jslVar, qim0VarK.then(qim0VarX), (p3v) null, (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, b0kVar2, 224256, 384);
                } else {
                    b0kVar2.b0();
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ey(wr21Var, z, iu30Var, function0, qim0Var, i, (byte) 12);
                }
            }

            public static final void f(float f, float f2, qim0 qim0Var, cr31 cr31Var, String str, b0k b0kVar, int i, int i2) {
                qim0 qim0VarN;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1143981254);
                int i3 = (x340Var.d(f) ? 4 : 2) | i | (x340Var.d(f2) ? 32 : 16) | 384 | (((i2 & 8) == 0 && x340Var.g(cr31Var)) ? 2048 : 1024);
                if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
                    x340Var.d0();
                    if ((i & 1) == 0 || x340Var.E()) {
                        if ((i2 & 8) != 0) {
                            cr31Var = er31.b(8.0f);
                        }
                        qim0Var = nim0.a;
                    } else {
                        x340Var.b0();
                    }
                    x340Var.s();
                    if (str == null || (qim0VarN = anm1.N(str, qim0Var)) == null) {
                        qim0VarN = qim0Var;
                    }
                    qim0 qim0VarS = u291.s(qim0VarN, f, f2);
                    uwr uwrVar = cbx.a;
                    t1c.a(cwl1.l0(dug.f(qim0VarS, cbx.a(x340Var).a.b.a(), cr31Var), 0L, cr31Var, 13), x340Var, 0);
                } else {
                    x340Var.b0();
                }
                qim0 qim0Var2 = qim0Var;
                cr31 cr31Var2 = cr31Var;
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new v6k(f, f2, qim0Var2, cr31Var2, str, i, i2);
                }
            }

            public static final void g(f7d f7dVar, b0k b0kVar, int i) {
                long jC;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-470381725);
                int i2 = (x340Var.i(f7dVar) ? 4 : 2) | i;
                if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                    qim0 qim0VarQ = i1p1.q(nim0.a, er31.a(50));
                    u7h u7hVar = f7dVar.b;
                    if (u7hVar == null) {
                        x340Var.i0(-1065265844);
                        uwr uwrVar = cbx.a;
                        jC = cbx.a(x340Var).a.b.c();
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-1065267611);
                        x340Var.r(false);
                        jC = u7hVar.a;
                    }
                    qim0 qim0VarF = dug.f(qim0VarQ, jC, d4o1.a);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, qim0VarF);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
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
                    nko1.H(gfh0VarC, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    af5 af5Var = f7dVar.a;
                    lee1 lee1Var = cbx.d(x340Var).k;
                    u7h u7hVar2 = f7dVar.c;
                    uwo1.d(af5Var, u7hVar2 != null ? u7hVar2.a : z4p1.g(4281545523L), (qim0) null, lee1Var, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 4084);
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new boj(f7dVar, i, (byte) 12);
                }
            }
        }
