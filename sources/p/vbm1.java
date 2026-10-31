package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vbm1 implements o1i {
    public final kj31 a;
    public final ti31 b;
    public final wdm c;
    public final hcl1 d;
    public final m0t e;
    public final long f = z4p1.g(4280756007L);
    public final long g = z4p1.g(4293914602L);
    public final long h = z4p1.g(4288783095L);
    public final long i = z4p1.g(4294415499L);
    public final long j = z4p1.g(4291685748L);

    public vbm1(kj31 kj31Var, ti31 ti31Var, wdm wdmVar, hcl1 hcl1Var, m0t m0tVar) {
        this.a = kj31Var;
        this.b = ti31Var;
        this.c = wdmVar;
        this.d = hcl1Var;
        this.e = m0tVar;
    }

    public final x0i b(z0i z0iVar, o0i o0iVar) {
        return new x0i(new w0i(o0iVar.e, "wrapped_2025_intro_outro_layout", ((pbm1) z0iVar).f, null, 8));
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(pbm1 pbm1Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        o0i o0iVar2;
        x340 x340Var;
        int i3;
        lnm lnmVar;
        int i4;
        pe peVar;
        iu30 iu30Var;
        ven0 ven0Var;
        ven0 ven0Var2;
        boolean z;
        m4c m4cVar;
        boolean z2;
        vu30 vu30Var;
        int i5;
        pe peVar2;
        float f;
        vu30 vu30Var2;
        byte b;
        Function0 function0;
        mmr0 mmr0Var;
        float f2;
        pbm1 pbm1Var2 = pbm1Var;
        m4c m4cVar2 = fkj0.X;
        String str = pbm1Var2.d;
        int i6 = pbm1Var2.c;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-913497382);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(pbm1Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var2.g(o0iVar) : x340Var2.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(this) ? 2048 : 1024;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            pe peVarA = ef.a(x340Var2);
            int i7 = i2 & 14;
            boolean z3 = i7 == 4;
            Object objT = x340Var2.T();
            sbm1 sbm1Var = sbm1.a;
            if (z3 || objT == m4cVar2) {
                objT = v8r.q(sbm1Var);
                x340Var2.s0(objT);
            }
            ven0 ven0Var3 = (ven0) objT;
            boolean z4 = i7 == 4;
            Object objT2 = x340Var2.T();
            if (z4 || objT2 == m4cVar2) {
                objT2 = v8r.q((Object) null);
                x340Var2.s0(objT2);
            }
            ven0 ven0Var4 = (ven0) objT2;
            boolean z5 = i7 == 4;
            Object objT3 = x340Var2.T();
            if (z5 || objT3 == m4cVar2) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT3);
            }
            ven0 ven0Var5 = (ven0) objT3;
            boolean z6 = i7 == 4;
            Object objT4 = x340Var2.T();
            if (z6 || objT4 == m4cVar2) {
                objT4 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT4);
            }
            ven0 ven0Var6 = (ven0) objT4;
            boolean zG = x340Var2.g(ven0Var3) | x340Var2.g(ven0Var6) | x340Var2.g(ven0Var4) | x340Var2.i(this) | (i7 == 4);
            Object objT5 = x340Var2.T();
            if (zG || objT5 == m4cVar2) {
                i3 = i2;
                lnmVar = null;
                kxu kxuVar = new kxu(this, pbm1Var2, ven0Var3, ven0Var6, ven0Var4, null);
                x340Var2.s0(kxuVar);
                objT5 = kxuVar;
            } else {
                i3 = i2;
                lnmVar = null;
            }
            iu30 iu30Var2 = (iu30) objT5;
            boolean zI = x340Var2.i(iu30Var2);
            Object objT6 = x340Var2.T();
            if (zI || objT6 == m4cVar2) {
                objT6 = new w73(iu30Var2, lnmVar, (byte) 24);
                x340Var2.s0(objT6);
            }
            qxd0.t(pbm1Var2, x340Var2, (vu30) objT6);
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            lnm lnmVar2 = lnmVar;
            gra graVar = een.h;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw lnmVar2;
            }
            x340Var2.m0();
            boolean z7 = x340Var2.S;
            Function0 function1 = hmb0.t1;
            if (z7) {
                x340Var2.l(function1);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            vu30 vu30Var3 = y580.N0;
            nko1.H(xos0VarM, x340Var2, vu30Var3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar2);
            nko1.F(x340Var2);
            vu30 vu30Var4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, vu30Var4);
            ubm1 ubm1Var = (ubm1) ven0Var3.getValue();
            boolean zJ = u890.j(ubm1Var, sbm1Var);
            nim0 nim0Var = nim0.a;
            if (zJ) {
                x340Var2.i0(-1138286689);
                peVar = peVarA;
                rhx0.a(u291.r(nim0Var, 48.0f), 0L, 0.0f, 0L, 0, 0.0f, x340Var2, 6, 62);
                x340Var2.r(false);
                o0iVar2 = o0iVar;
                pbm1Var2 = pbm1Var2;
                i4 = i7;
                m4cVar = m4cVar2;
                x340Var = x340Var2;
                iu30Var = iu30Var2;
                ven0Var = ven0Var3;
                ven0Var2 = ven0Var5;
                z2 = true;
            } else if (ubm1Var instanceof tbm1) {
                x340Var2.i0(-1137924733);
                zj31 zj31Var = (wj31) ven0Var4.getValue();
                if (zj31Var == null) {
                    hhg1.n("Required value was null.");
                    return;
                }
                if (str.length() > 0) {
                    x340Var2.i0(948335736);
                    x340Var = x340Var2;
                    i5 = i7;
                    peVar2 = peVarA;
                    vu30Var2 = vu30Var3;
                    vu30Var = vu30Var4;
                    f = 1.0f;
                    sto1.a(this.c, o0iVar, new ny7(new ju7(str, "", 0L, 0L, pbm1Var2.e, true), "", null, false, null, null, 60), (Function0) null, x340Var, 64 | (i3 & 112), 8);
                    b = 0;
                    x340Var.r(false);
                } else {
                    vu30Var = vu30Var4;
                    x340Var = x340Var2;
                    i5 = i7;
                    peVar2 = peVarA;
                    f = 1.0f;
                    vu30Var2 = vu30Var3;
                    b = 0;
                    x340Var.i0(948829690);
                    x340Var.r(false);
                }
                boolean z8 = !((Boolean) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02a6: NOT (r45v0 'z8' boolean) = 
                      (wrap boolean:0x02a1: INVOKE 
                      (wrap java.lang.Boolean:0x029f: CHECK_CAST (java.lang.Boolean) (wrap java.lang.Object:0x029b: INVOKE (r24v3 p.ven0) INTERFACE call: p.tob1.getValue():java.lang.Object A[WRAPPED] (LINE:668)))
                     VIRTUAL call: java.lang.Boolean.booleanValue():boolean A[MD:():boolean (c), WRAPPED] (LINE:674))
                     A[DECLARE_VAR] (LINE:679) in method: p.vbm1.c(p.pbm1, p.o0i, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes12.dex
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
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r24v3 p.ven0
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1563
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.vbm1.a(p.pbm1, p.o0i, p.qim0, p.b0k, int):void");
            }
        }
