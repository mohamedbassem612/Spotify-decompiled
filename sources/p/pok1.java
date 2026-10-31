package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class pok1 {
    public static final float a;
    public static final float b;

    static {
        u7h.b(u7h.f, 0.1f, 0.0f, 0.0f, 0.0f, 14);
        a = 48.0f;
        b = 4.0f;
    }

    public static final void a(hnk1 hnk1Var, boolean z, boolean z2, float f, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-961915967);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(hnk1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(function2) ? 1048576 : 524288;
        }
        if (!x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            x340Var.b0();
        } else if (hnk1Var instanceof fnk1) {
            x340Var.i0(-416470710);
            if (z2) {
                x340Var.i0(-416451831);
                int i3 = (i2 >> 3) & 14;
                int i4 = i2 >> 6;
                b(z, f, function0, function1, x340Var, i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168));
                x340Var.r(false);
            } else {
                x340Var.i0(-416233467);
                i(function1, f, null, b, false, x340Var, ((i2 >> 15) & 14) | 3072 | ((i2 >> 6) & 112), 20);
                x340Var = x340Var;
                x340Var.r(false);
            }
            x340Var.r(false);
        } else {
            x340Var.i0(-416069291);
            h(function2, f, null, b, x340Var, ((i2 >> 18) & 14) | 3072 | ((i2 >> 6) & 112), 4);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new iok1(hnk1Var, z, z2, f, function0, function1, function2, i);
        }
    }

    public static final void b(boolean z, float f, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1392624169);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function1) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(x340Var, 2131956734);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            float f2 = ((32.0f + a) - b) - f;
            qim0 qim0VarN = anm1.N("VoiceInput.AttachedTtsToggle", u291.h(nim0.a, f));
            boolean z2 = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new izg1(function0, (byte) 14);
                x340Var.s0(objT);
            }
            vqo1.a(z, (iu30) objT, apo.r(647660921, new mv8(z, strO0, (byte) 19), x340Var), apo.r(254661976, new rz2(function1, f, (byte) 13), x340Var), (qim0) null, qim0VarN, 0, f2, (max) null, x340Var, (i2 & 14) | 3456, 336);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mh6(z, f, function0, function1, i, (byte) 3);
        }
    }

    public static final void c(Function0 function0, float f, qim0 qim0Var, b0k b0kVar, int i) {
        Function0 function1;
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(146523377);
        if ((i & 6) == 0) {
            function1 = function0;
            i2 = i | (x340Var.i(function1) ? 4 : 2);
        } else {
            function1 = function0;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.d(f) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131956724);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarR = u291.r(qim0Var3, 32.0f);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new bek1(strO0, (byte) 1);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarR, false, (iu30) objT);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = ktd.n(x340Var);
            }
            qim0 qim0VarV = bin.v(qim0VarB, (idn0) objT2, jtr.f, false, (String) null, new pm31(0), function1, 12);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            w0h1.a(cmx.c, isl.a, u291.r(qim0Var3, f), cbx.a(x340Var).b.d, 0L, false, x340Var, cmx.d | 48, 48);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jh6(function0, f, qim0Var2, i, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0144  */
    /* JADX WARN: Code duplicated, block: B:103:0x0146  */
    /* JADX WARN: Code duplicated, block: B:107:0x0150  */
    /* JADX WARN: Code duplicated, block: B:110:0x0165  */
    /* JADX WARN: Code duplicated, block: B:112:0x0171  */
    /* JADX WARN: Code duplicated, block: B:114:0x0193  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:128:0x01df  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:132:0x0209  */
    /* JADX WARN: Code duplicated, block: B:133:0x0218  */
    /* JADX WARN: Code duplicated, block: B:136:0x0263  */
    /* JADX WARN: Code duplicated, block: B:137:0x0269  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:98:0x0139  */
    /* JADX WARN: Code duplicated, block: B:99:0x013b  */
    public static final void d(String str, long j, hux huxVar, long j2, Function0 function0, qim0 qim0Var, float f, boolean z, float f2, float f3, b0k b0kVar, int i, int i2) {
        int i3;
        int i4;
        b0k b0kVar2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objT;
        qim0 qim0Var2;
        qim0 qim0VarV;
        float f4;
        tl3 tl3Var;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z7;
        Function0 function1;
        vu30 vu30Var;
        vu30 vu30Var2;
        vu30 vu30Var3;
        vu30 vu30Var4;
        qim0 qim0Var3;
        Function0 function2;
        boolean z8;
        vu30 vu30Var5;
        vu30 vu30Var6;
        qim0 qim0VarB;
        Object objT2;
        float f5 = f2;
        tl3 tl3Var2 = een.h;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1625971099);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 = i3 | (b0kVar3.f(j2) ? 2048 : 1024);
        } else {
            i4 = i3;
        }
        if ((i & 24576) == 0) {
            i4 |= b0kVar3.i(function0) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= b0kVar3.i(qim0Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= b0kVar3.d(f) ? 1048576 : 524288;
        }
        int i5 = i2 & 128;
        if (i5 != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= b0kVar3.h(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= b0kVar3.d(f5) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= b0kVar3.d(f3) ? 536870912 : 268435456;
        }
        int i6 = i4;
        if (b0kVar3.Y(i6 & 1, (i6 & 306783379) != 306783378)) {
            b0kVar3.d0();
            if ((i & 1) == 0 || b0kVar3.E()) {
                if (i5 != 0) {
                    z3 = true;
                }
                b0kVar3.s();
                float f6 = a;
                qim0 qim0VarA = u291.a(qim0Var, f6, f6);
                if ((i6 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((i6 & 29360128) == 8388608) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z5 | z4;
                objT = b0kVar3.T();
                if (z6 || objT == m4cVar) {
                    objT = new cl1(str, z3, (byte) 29);
                    b0kVar3.s0(objT);
                }
                qim0 qim0VarB2 = s161.b(qim0VarA, false, (iu30) objT);
                qim0Var2 = nim0.a;
                if (z3) {
                    b0kVar3.i0(-663258104);
                    objT2 = b0kVar3.T();
                    if (objT2 == m4cVar) {
                        objT2 = ktd.n(b0kVar3);
                    }
                    qim0VarV = bin.v(qim0Var2, (idn0) objT2, jtr.f, false, (String) null, new pm31(0), function0, 12);
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(-663015653);
                    b0kVar3.r(false);
                    qim0VarV = qim0Var2;
                }
                qim0 qim0VarThen = qim0VarB2.then(qim0VarV);
                if (z3) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.3f;
                }
                qim0 qim0VarK = d9y0.k(qim0VarThen, f4);
                if (p3v.c(f, Float.NaN)) {
                    tl3Var = tl3Var2;
                } else {
                    tl3Var = een.i;
                }
                gfh0VarC = t1c.c(tl3Var, false);
                iHashCode = Long.hashCode(((x340) b0kVar3).T);
                xos0VarM = b0kVar3.m();
                qim0VarE = zr7.E(b0kVar3, qim0VarK);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar3.m0();
                z7 = ((x340) b0kVar3).S;
                function1 = hmb0.t1;
                if (z7) {
                    b0kVar3.l(function1);
                } else {
                    b0kVar3.v0();
                }
                vu30Var = y580.O0;
                nko1.H(gfh0VarC, b0kVar3, vu30Var);
                vu30Var2 = y580.N0;
                nko1.H(xos0VarM, b0kVar3, vu30Var2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar = y580.R0;
                nko1.H(numValueOf, b0kVar3, lljVar);
                nko1.F(b0kVar3);
                vu30Var3 = y580.Y;
                nko1.H(qim0VarE, b0kVar3, vu30Var3);
                if (p3v.c(f, Float.NaN)) {
                    vu30Var6 = vu30Var3;
                    vu30Var4 = vu30Var;
                    function2 = function1;
                    qim0Var3 = qim0Var2;
                    z8 = false;
                    vu30Var5 = vu30Var2;
                    qim0VarB = qim0Var3;
                } else {
                    vu30Var4 = vu30Var;
                    qim0Var3 = qim0Var2;
                    function2 = function1;
                    z8 = false;
                    vu30Var5 = vu30Var2;
                    vu30Var6 = vu30Var3;
                    qim0VarB = uyn1.B(qim0Var3, 0.0f, 0.0f, f, 0.0f, 11);
                }
                qim0 qim0VarF = dug.f(i1p1.q(u291.r(qim0VarB, f3), er31.a), j, d4o1.a);
                gfh0 gfh0VarC2 = t1c.c(tl3Var2, z8);
                int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
                xos0 xos0VarM2 = b0kVar3.m();
                qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarF);
                b0kVar3.m0();
                if (((x340) b0kVar3).S) {
                    b0kVar3.l(function2);
                } else {
                    b0kVar3.v0();
                }
                nko1.H(gfh0VarC2, b0kVar3, vu30Var4);
                nko1.H(xos0VarM2, b0kVar3, vu30Var5);
                x0d.q(iHashCode2, b0kVar3, lljVar, b0kVar3);
                nko1.H(qim0VarE2, b0kVar3, vu30Var6);
                f5 = f2;
                b0kVar2 = b0kVar3;
                w0h1.a(huxVar, isl.a, u291.r(qim0Var3, f5), j2, 0L, false, b0kVar2, ((
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0297: INVOKE 
                      (r29v0 'huxVar' p.hux)
                      (wrap p.isl:0x028e: SGET  A[WRAPPED] (LINE:655) p.isl.a p.isl)
                      (wrap p.qim0:0x027a: INVOKE (r5v9 'qim0Var3' p.qim0), (r15v5 'f5' float) STATIC call: p.u291.r(p.qim0, float):p.qim0 A[WRAPPED] (LINE:635))
                      (r30v0 'j2' long)
                      (0 long)
                      false
                      (r12v6 'b0kVar2' p.b0k)
                      (wrap int:0x0289: ARITH (wrap int:0x0284: ARITH (wrap int:0x0280: ARITH (wrap int:0x027e: ARITH (r16v10 int) >> (6 int) A[WRAPPED] (LINE:639)) & (14 int) A[WRAPPED] (LINE:641)) | (56 int) A[DONT_WRAP, WRAPPED] (LINE:645)) | (wrap int:0x0287: ARITH (r6v4 'i6' int) & (7168 int) A[WRAPPED] (LINE:648)) A[WRAPPED] (LINE:650))
                      (48 int)
                     STATIC call: p.w0h1.a(p.hux, p.ksl, p.qim0, long, long, boolean, p.b0k, int, int):void (LINE:664) in method: p.pok1.d(java.lang.String, long, p.hux, long, kotlin.jvm.functions.Function0, p.qim0, float, boolean, float, float, p.b0k, int, int):void, file: /workspace/spotify-analysis/dex-input/classes9.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v10 int
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 722
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.pok1.d(java.lang.String, long, p.hux, long, kotlin.jvm.functions.Function0, p.qim0, float, boolean, float, float, p.b0k, int, int):void");
            }

            public static final void e(qim0 qim0Var, long j, j2i j2iVar, b0k b0kVar, int i) {
                int i2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1655190163);
                if ((i & 6) == 0) {
                    i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var.f(j) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= x340Var.i(j2iVar) ? 256 : 128;
                }
                if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                    qim0 qim0VarF = dug.f(i1p1.q(u291.j(40.0f, 0.0f, 2, qim0Var), er31.a(50)), j, d4o1.a);
                    gfh0 gfh0VarC = t1c.c(een.g, false);
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
                    dv20.l((i2 >> 6) & 14, j2iVar, x340Var, true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new je3(qim0Var, j, j2iVar, i, (byte) 9);
                }
            }

            public static final void f(mr20 mr20Var, boolean z, boolean z2, boolean z3, float f, Function0 function0, b0k b0kVar, int i) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1144227384);
                int i2 = i | (x340Var.i(mr20Var) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.h(z2) ? 2048 : 1024) | (x340Var.h(z3) ? 16384 : 8192);
                if ((i & 196608) == 0) {
                    i2 |= x340Var.d(f) ? 131072 : 65536;
                }
                int i3 = i2 | (x340Var.i(function0) ? 1048576 : 524288);
                if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    qim0 qim0VarH = u291.h(wnb0Var, 24.0f);
                    cvx cvxVar = cbx.b(x340Var).b;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    m(mr20Var, z, uyn1.A(qim0VarH, 4.0f, 4.0f, f, 4.0f), x340Var, (i3 >> 3) & 126);
                    if (z3) {
                        x340Var.i0(1478089213);
                        cvx cvxVar4 = cbx.b(x340Var).b;
                        g(((i3 >> 15) & 112) | ((i3 >> 9) & 14), function0, x340Var, uyn1.B(nim0.a, 4.0f, 0.0f, 0.0f, 0.0f, 14), z2);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1478270842);
                        x340Var.r(false);
                    }
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new slf0(mr20Var, z, z2, z3, f, function0, i);
                }
            }

            public static final void g(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
                int i2;
                Function0 function1;
                m4c m4cVar = fkj0.X;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1277071753);
                if ((i & 6) == 0) {
                    i2 = (x340Var.h(z) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    function1 = function0;
                    i2 |= x340Var.i(function1) ? 32 : 16;
                } else {
                    function1 = function0;
                }
                if ((i & 384) == 0) {
                    i2 |= x340Var.i(qim0Var) ? 256 : 128;
                }
                if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                    String strO0 = cwl1.o0(x340Var, 2131956734);
                    uwr uwrVar = cbx.a;
                    mta mtaVar = cbx.b(x340Var).d;
                    qim0 qim0VarR = u291.r(qim0Var, 32.0f);
                    boolean zG = x340Var.g(strO0);
                    Object objT = x340Var.T();
                    if (zG || objT == m4cVar) {
                        objT = new bek1(strO0, (byte) 2);
                        x340Var.s0(objT);
                    }
                    qim0 qim0VarB = s161.b(qim0VarR, false, (iu30) objT);
                    Object objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = ktd.n(x340Var);
                    }
                    qim0 qim0VarV = bin.v(qim0VarB, (idn0) objT2, jtr.f, false, (String) null, new pm31(0), function1, 12);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
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
                    nko1.H(gfh0VarC, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    ztx ztxVar = z ? ztx.c : aux.c;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    w0h1.a(ztxVar, isl.a, u291.r(nim0.a, 16.0f), cbx.a(x340Var).b.b, 0L, true, x340Var, 196664, 16);
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new oj8(z, function0, qim0Var, i, (byte) 10);
                }
            }

            /* JADX WARN: Code duplicated, block: B:31:0x0052  */
            /* JADX WARN: Code duplicated, block: B:33:0x0056  */
            /* JADX WARN: Code duplicated, block: B:35:0x005e  */
            /* JADX WARN: Code duplicated, block: B:36:0x0061  */
            /* JADX WARN: Code duplicated, block: B:39:0x0067  */
            /* JADX WARN: Code duplicated, block: B:42:0x006f  */
            /* JADX WARN: Code duplicated, block: B:43:0x0071  */
            /* JADX WARN: Code duplicated, block: B:46:0x007a  */
            /* JADX WARN: Code duplicated, block: B:56:0x0094 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:57:0x0096  */
            /* JADX WARN: Code duplicated, block: B:58:0x0099  */
            /* JADX WARN: Code duplicated, block: B:61:0x009e  */
            /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
            /* JADX WARN: Code duplicated, block: B:64:0x00f0  */
            /* JADX WARN: Code duplicated, block: B:67:0x00fd  */
            /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
            public static final void h(Function0 function0, float f, qim0 qim0Var, float f2, b0k b0kVar, int i, int i2) {
                int i3;
                float f3;
                qim0 qim0Var2;
                float f4;
                boolean z;
                b0k b0kVar2;
                qim0 qim0Var3;
                float f5;
                h311 h311VarV;
                qim0 qim0Var4;
                qim0 qim0Var5;
                float f6;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(1440443179);
                if ((i & 6) == 0) {
                    i3 = (b0kVar3.i(function0) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    f3 = f;
                    i3 |= b0kVar3.d(f3) ? 32 : 16;
                } else {
                    f3 = f;
                }
                int i4 = i2 & 4;
                if (i4 == 0) {
                    if ((i & 384) == 0) {
                        qim0Var2 = qim0Var;
                        i3 |= b0kVar3.i(qim0Var2) ? 256 : 128;
                    }
                    if ((i & 3072) == 0) {
                        if ((i2 & 8) == 0) {
                            f4 = f2;
                            int i5 = b0kVar3.d(f4) ? 2048 : 1024;
                            i3 |= i5;
                        } else {
                            f4 = f2;
                        }
                        i3 |= i5;
                    } else {
                        f4 = f2;
                    }
                    if ((i3 & 1171) != 1170) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i3 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0 || b0kVar3.E()) {
                            if (i4 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                qim0Var5 = qim0Var4;
                                f6 = Float.NaN;
                            } else {
                                qim0Var5 = qim0Var4;
                            }
                            b0kVar3.s();
                            String strO0 = cwl1.o0(b0kVar3, 2131956730);
                            uwr uwrVar = cbx.a;
                            int i6 = i3 << 9;
                            b0kVar2 = b0kVar3;
                            d(strO0, cbx.a(b0kVar3).b.a, ctx.c, cbx.a(b0kVar3).a.c, function0, qim0Var5, f6, false, 16.0f, f3, b0kVar2, (ctx.d << 6) | ((i3 << 12) & 57344) | (458752 & i6) | (i6 & 3670016) | ((i3 << 24) & 1879048192), 128);
                            qim0Var3 = qim0Var5;
                            f5 = f6;
                        } else {
                            b0kVar3.b0();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            qim0Var5 = qim0Var2;
                        }
                        f6 = f4;
                        b0kVar3.s();
                        String strO1 = cwl1.o0(b0kVar3, 2131956730);
                        uwr uwrVar2 = cbx.a;
                        int i7 = i3 << 9;
                        b0kVar2 = b0kVar3;
                        d(strO1, cbx.a(b0kVar3).b.a, ctx.c, cbx.a(b0kVar3).a.c, function0, qim0Var5, f6, false, 16.0f, f3, b0kVar2, (ctx.d << 6) | ((i3 << 12) & 57344) | (458752 & i7) | (i7 & 3670016) | ((i3 << 24) & 1879048192), 128);
                        qim0Var3 = qim0Var5;
                        f5 = f6;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        f5 = f4;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vc60(function0, f, qim0Var3, f5, i, i2, (byte) 2);
                    }
                }
                i3 |= 384;
                qim0Var2 = qim0Var;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        f4 = f2;
                        if (b0kVar3.d(f4)) {
                        }
                        i3 |= i5;
                    } else {
                        f4 = f2;
                    }
                    i3 |= i5;
                } else {
                    f4 = f2;
                }
                if ((i3 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i3 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i4 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            qim0Var5 = qim0Var4;
                            f6 = Float.NaN;
                        } else {
                            qim0Var5 = qim0Var4;
                            f6 = f4;
                        }
                    } else {
                        if (i4 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            qim0Var5 = qim0Var4;
                            f6 = Float.NaN;
                        } else {
                            qim0Var5 = qim0Var4;
                            f6 = f4;
                        }
                    }
                    b0kVar3.s();
                    String strO2 = cwl1.o0(b0kVar3, 2131956730);
                    uwr uwrVar3 = cbx.a;
                    int i8 = i3 << 9;
                    b0kVar2 = b0kVar3;
                    d(strO2, cbx.a(b0kVar3).b.a, ctx.c, cbx.a(b0kVar3).a.c, function0, qim0Var5, f6, false, 16.0f, f3, b0kVar2, (ctx.d << 6) | ((i3 << 12) & 57344) | (458752 & i8) | (i8 & 3670016) | ((i3 << 24) & 1879048192), 128);
                    qim0Var3 = qim0Var5;
                    f5 = f6;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    f5 = f4;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vc60(function0, f, qim0Var3, f5, i, i2, (byte) 2);
                }
            }

            /* JADX WARN: Code duplicated, block: B:31:0x0052  */
            /* JADX WARN: Code duplicated, block: B:33:0x0056  */
            /* JADX WARN: Code duplicated, block: B:35:0x005e  */
            /* JADX WARN: Code duplicated, block: B:36:0x0061  */
            /* JADX WARN: Code duplicated, block: B:39:0x0067  */
            /* JADX WARN: Code duplicated, block: B:42:0x0072  */
            /* JADX WARN: Code duplicated, block: B:43:0x0074  */
            /* JADX WARN: Code duplicated, block: B:46:0x007d  */
            /* JADX WARN: Code duplicated, block: B:55:0x0099 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:56:0x009b  */
            /* JADX WARN: Code duplicated, block: B:57:0x009e  */
            /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
            /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
            /* JADX WARN: Code duplicated, block: B:64:0x00fb  */
            /* JADX WARN: Code duplicated, block: B:67:0x010a  */
            /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
            public static final void i(Function0 function0, float f, qim0 qim0Var, float f2, boolean z, b0k b0kVar, int i, int i2) {
                int i3;
                float f3;
                qim0 qim0Var2;
                float f4;
                int i4;
                boolean z2;
                b0k b0kVar2;
                qim0 qim0Var3;
                float f5;
                boolean z3;
                h311 h311VarV;
                qim0 qim0Var4;
                float f6;
                qim0 qim0Var5;
                float f7;
                boolean z4;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(802385253);
                if ((i & 6) == 0) {
                    i3 = (b0kVar3.i(function0) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    f3 = f;
                    i3 |= b0kVar3.d(f3) ? 32 : 16;
                } else {
                    f3 = f;
                }
                int i5 = i2 & 4;
                if (i5 == 0) {
                    if ((i & 384) == 0) {
                        qim0Var2 = qim0Var;
                        i3 |= b0kVar3.i(qim0Var2) ? 256 : 128;
                    }
                    if ((i & 3072) == 0) {
                        if ((i2 & 8) == 0) {
                            f4 = f2;
                            int i6 = b0kVar3.d(f4) ? 2048 : 1024;
                            i3 |= i6;
                        } else {
                            f4 = f2;
                        }
                        i3 |= i6;
                    } else {
                        f4 = f2;
                    }
                    i4 = i3 | 24576;
                    if ((i4 & 9363) != 9362) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (b0kVar3.Y(i4 & 1, z2)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0 || b0kVar3.E()) {
                            if (i5 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if ((i2 & 8) != 0) {
                                i4 &= -7169;
                                f6 = Float.NaN;
                            } else {
                                f6 = f4;
                            }
                            qim0Var5 = qim0Var4;
                            f7 = f6;
                            z4 = true;
                        } else {
                            b0kVar3.b0();
                            if ((i2 & 8) != 0) {
                                i4 &= -7169;
                            }
                            z4 = z;
                            qim0Var5 = qim0Var2;
                            f7 = f4;
                        }
                        b0kVar3.s();
                        String strO0 = cwl1.o0(b0kVar3, 2131956731);
                        uwr uwrVar = cbx.a;
                        int i7 = i4 << 9;
                        b0kVar2 = b0kVar3;
                        d(strO0, cbx.a(b0kVar3).b.a, qpx.c, cbx.a(b0kVar3).a.c, function0, qim0Var5, f7, z4, 16.0f, f3, b0kVar2, (qpx.d << 6) | ((i4 << 12) & 57344) | (458752 & i7) | (3670016 & i7) | (i7 & 29360128) | ((i4 << 24) & 1879048192), 0);
                        qim0Var3 = qim0Var5;
                        f5 = f7;
                        z3 = z4;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        f5 = f4;
                        z3 = z;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new kok1(function0, f, qim0Var3, f5, z3, i, i2);
                    }
                }
                i3 |= 384;
                qim0Var2 = qim0Var;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        f4 = f2;
                        if (b0kVar3.d(f4)) {
                        }
                        i3 |= i6;
                    } else {
                        f4 = f2;
                    }
                    i3 |= i6;
                } else {
                    f4 = f2;
                }
                i4 = i3 | 24576;
                if ((i4 & 9363) != 9362) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (b0kVar3.Y(i4 & 1, z2)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i5 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i2 & 8) != 0) {
                            i4 &= -7169;
                            f6 = Float.NaN;
                        } else {
                            f6 = f4;
                        }
                        qim0Var5 = qim0Var4;
                        f7 = f6;
                        z4 = true;
                    } else {
                        if (i5 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i2 & 8) != 0) {
                            i4 &= -7169;
                            f6 = Float.NaN;
                        } else {
                            f6 = f4;
                        }
                        qim0Var5 = qim0Var4;
                        f7 = f6;
                        z4 = true;
                    }
                    b0kVar3.s();
                    String strO1 = cwl1.o0(b0kVar3, 2131956731);
                    uwr uwrVar2 = cbx.a;
                    int i8 = i4 << 9;
                    b0kVar2 = b0kVar3;
                    d(strO1, cbx.a(b0kVar3).b.a, qpx.c, cbx.a(b0kVar3).a.c, function0, qim0Var5, f7, z4, 16.0f, f3, b0kVar2, (qpx.d << 6) | ((i4 << 12) & 57344) | (458752 & i8) | (3670016 & i8) | (i8 & 29360128) | ((i4 << 24) & 1879048192), 0);
                    qim0Var3 = qim0Var5;
                    f5 = f7;
                    z3 = z4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    f5 = f4;
                    z3 = z;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new kok1(function0, f, qim0Var3, f5, z3, i, i2);
                }
            }

            public static final void j(b0k b0kVar, int i) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-150399199);
                if (x340Var.Y(i & 1, (i & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var, 2131956732);
                    uwr uwrVar = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var).j;
                    long j = cbx.a(x340Var).b.b;
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    cvx cvxVar = cbx.b(x340Var).b;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    uwo1.e(strO0, anm1.N("VoiceInput.ThinkingLabel", uyn1.B(wnb0Var, 0.0f, 4.0f, 4.0f, 4.0f, 1)), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new c1j1(i, (byte) 9);
                }
            }

            public static final void k(hnk1 hnk1Var, long j, float f, float f2, qim0 qim0Var, mr20 mr20Var, boolean z, boolean z2, boolean z3, umk1 umk1Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, b0k b0kVar, int i) {
                hnk1 hnk1Var2;
                umk1 umk1Var2;
                x340 x340Var;
                qim0 qim0Var2;
                qim0 qim0Var3;
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.k0(-1547235580);
                int i2 = i | (x340Var2.i(hnk1Var) ? 4 : 2) | (x340Var2.f(j) ? 32 : 16) | (x340Var2.d(f) ? 256 : 128) | (x340Var2.d(f2) ? 2048 : 1024) | 24576 | (x340Var2.i(mr20Var) ? 131072 : 65536) | (x340Var2.h(z) ? 1048576 : 524288) | (x340Var2.h(z2) ? 8388608 : 4194304) | (x340Var2.h(z3) ? 67108864 : 33554432) | (x340Var2.i(umk1Var) ? 536870912 : 268435456);
                int i3 = (x340Var2.i(function0) ? 4 : 2) | (x340Var2.i(function1) ? 32 : 16) | (x340Var2.i(function2) ? 256 : 128) | (x340Var2.i(function3) ? 2048 : 1024);
                if (x340Var2.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 1171) == 1170) ? false : true)) {
                    x340Var2.d0();
                    int i4 = i & 1;
                    qim0 qim0Var4 = nim0.a;
                    if (i4 == 0 || x340Var2.E()) {
                        qim0Var3 = qim0Var4;
                    } else {
                        x340Var2.b0();
                        qim0Var3 = qim0Var;
                    }
                    x340Var2.s();
                    boolean z4 = umk1Var instanceof rmk1;
                    boolean z5 = umk1Var instanceof smk1;
                    qim0 qim0Var5 = qim0Var3;
                    qim0 qim0VarB = u291.b(0.0f, 48.0f, 1, u291.f(qim0Var3, 1.0f));
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
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
                    umk1Var2 = umk1Var;
                    x340Var = x340Var2;
                    e(anm1.N("VoiceInput.Pill", kk0.q(x340Var2, qim0VarE, y580.Y, 1.0f, true)), j, apo.r(43624227, new lok1(z3, umk1Var, z4, hnk1Var, mr20Var, z, z2, function0, function3, f, f2, function1, function2), x340Var2), x340Var, (i2 & 112) | 384);
                    if (z5) {
                        x340Var.i0(-451997211);
                        op71.g(x340Var, u291.v(qim0Var4, 12.0f));
                        int i5 = i2 & 14;
                        int i6 = i2 >> 18;
                        int i7 = i5 | (i6 & 112) | (i6 & 896) | (i2 & 7168) | ((i3 << 3) & 57344);
                        int i8 = i3 << 12;
                        a(hnk1Var, z2, z3, f2, function3, function1, function2, x340Var, i7 | (458752 & i8) | (i8 & 3670016));
                        hnk1Var2 = hnk1Var;
                        x340Var = x340Var;
                        x340Var.r(false);
                    } else {
                        hnk1Var2 = hnk1Var;
                        if (umk1Var2 instanceof tmk1) {
                            x340Var.i0(-451540612);
                            if (hnk1Var2 instanceof fnk1) {
                                x340Var.i0(262531299);
                                i(function1, f2, eqr0.D(4.0f, 0.0f, 2, qim0Var4), 0.0f, false, x340Var, ((i3 >> 3) & 14) | ((i2 >> 6) & 112), 24);
                                x340Var = x340Var;
                                x340Var.r(false);
                            } else {
                                if (!(hnk1Var2 instanceof gnk1)) {
                                    throw p3d1.k(x340Var, 262528838, false);
                                }
                                x340Var.i0(262538655);
                                h(function2, f2, eqr0.D(4.0f, 0.0f, 2, qim0Var4), 0.0f, x340Var, ((i3 >> 6) & 14) | ((i2 >> 6) & 112), 8);
                                x340Var.r(false);
                            }
                            x340Var.r(false);
                        } else {
                            x340Var.i0(-451059678);
                            x340Var.r(false);
                        }
                    }
                    x340Var.r(true);
                    qim0Var2 = qim0Var5;
                } else {
                    hnk1Var2 = hnk1Var;
                    umk1Var2 = umk1Var;
                    x340Var = x340Var2;
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new mok1(hnk1Var2, j, f, f2, qim0Var2, mr20Var, z, z2, z3, umk1Var2, function0, function1, function2, function3, i);
                }
            }

            public static final void l(hnk1 hnk1Var, mr20 mr20Var, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function1, float f, float f2, float f3, qim0 qim0Var, b0k b0kVar, int i) {
                int i2;
                float f4;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-316090838);
                int i3 = i | (x340Var.i(hnk1Var) ? 4 : 2) | (x340Var.i(mr20Var) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.h(z2) ? 2048 : 1024) | (x340Var.h(z3) ? 16384 : 8192) | (x340Var.i(function0) ? 131072 : 65536) | (x340Var.i(function1) ? 1048576 : 524288) | (x340Var.d(f) ? 8388608 : 4194304) | (x340Var.d(f2) ? 67108864 : 33554432) | (x340Var.d(f3) ? 536870912 : 268435456);
                if (x340Var.Y(i3 & 1, ((306783379 & i3) == 306783378 && ((x340Var.i(qim0Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
                    qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                    boolean z4 = hnk1Var instanceof gnk1;
                    if (z4) {
                        x340Var.i0(-2093330245);
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var).b;
                        i2 = 0;
                        x340Var.r(false);
                        f4 = 16.0f;
                    } else {
                        x340Var.i0(-2093263657);
                        uwr uwrVar2 = cbx.a;
                        cvx cvxVar2 = cbx.b(x340Var).b;
                        i2 = 0;
                        x340Var.r(false);
                        f4 = 4.0f;
                    }
                    qim0 qim0VarB = uyn1.B(qim0VarF, f4, 0.0f, f2, 0.0f, 10);
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, i2);
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
                    nko1.H(jw31VarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    if (hnk1Var instanceof fnk1) {
                        x340Var.i0(1927659986);
                        c(function0, f, null, x340Var, ((i3 >> 15) & 14) | ((i3 >> 18) & 112));
                        f(mr20Var, z, z2, z3, f3, function1, x340Var, (i3 & 112) | 6 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | ((i3 >> 12) & 458752) | (i3 & 3670016));
                        x340Var.r(false);
                    } else {
                        if (!z4) {
                            throw p3d1.k(x340Var, -76366879, false);
                        }
                        x340Var.i0(-76351137);
                        j(x340Var, 6);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new nok1(hnk1Var, mr20Var, z, z2, z3, function0, function1, f, f2, f3, qim0Var, i);
                }
            }

            public static final void m(mr20 mr20Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
                int i2;
                boolean z2;
                qim0 qim0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-326199606);
                if ((i & 6) == 0) {
                    i2 = (x340Var.i(mr20Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    z2 = z;
                    i2 |= x340Var.h(z2) ? 32 : 16;
                } else {
                    z2 = z;
                }
                if ((i & 384) == 0) {
                    qim0Var2 = qim0Var;
                    i2 |= x340Var.i(qim0Var2) ? 256 : 128;
                } else {
                    qim0Var2 = qim0Var;
                }
                if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                    boolean zG = x340Var.g(mr20Var);
                    Object objT = x340Var.T();
                    if (zG || objT == fkj0.X) {
                        objT = new uji1(mr20Var, (byte) 5);
                        x340Var.s0(objT);
                    }
                    mr20 mr20Var2 = (mr20) objT;
                    uwr uwrVar = cbx.a;
                    jch0.h(mr20Var2, qim0Var2, 0, 0.2f, z2, 0.0f, new ldl1(1.5f, 3.0f, 0.0f, cbx.a(x340Var).b.b), x340Var, ((i2 >> 3) & 112) | 3072 | ((i2 << 9) & 57344));
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new mi81(mr20Var, z, qim0Var, i, (byte) 2);
                }
            }
        }
