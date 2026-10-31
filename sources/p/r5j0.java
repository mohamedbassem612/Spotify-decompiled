package p;

import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r5j0 extends hab0 implements xu30 {
    public final /* synthetic */ umf0 X;
    public final /* synthetic */ c101 Y;
    public final /* synthetic */ ngs0 Z;
    public final /* synthetic */ zyi0 a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ qj0 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ sve i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5j0(zyi0 zyi0Var, c380 c380Var, boolean z, boolean z2, qj0 qj0Var, String str, boolean z3, iu30 iu30Var, sve sveVar, boolean z4, umf0 umf0Var, c101 c101Var, ngs0 ngs0Var) {
        super(3);
        this.a = zyi0Var;
        this.b = c380Var;
        this.c = z;
        this.d = z2;
        this.e = qj0Var;
        this.f = str;
        this.g = z3;
        this.h = iu30Var;
        this.i = sveVar;
        this.t = z4;
        this.X = umf0Var;
        this.Y = c101Var;
        this.Z = ngs0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        qim0 qim0Var;
        Function0 function0;
        g36 g36Var;
        ni20 ni20Var;
        x340 x340Var;
        g36 g36Var2;
        vu30 vu30Var;
        String strK;
        String str;
        ni20 ni20Var2;
        hxi0 exi0Var;
        pbh pbhVar;
        ni20 sumVar;
        mmr0 mmr0Var;
        tl3 tl3Var;
        vu30 vu30Var2;
        pbh pbhVar2;
        x340 x340Var2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        g2c g2cVar = (g2c) obj;
        x340 x340Var3 = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        nl3 nl3Var = een.R0;
        tl3 tl3Var2 = een.d;
        m4c m4cVar = fkj0.X;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var3.g(g2cVar) ? 4 : 2;
        }
        x340 x340Var4 = x340Var3;
        boolean zY = x340Var4.Y(iIntValue & 1, (iIntValue & 19) != 18);
        j06 j06Var = x340Var4.a;
        if (zY) {
            wat watVar = (wat) x340Var4.k(t4k.h);
            zyi0 zyi0Var = this.a;
            List list = zyi0Var.i;
            w4i1 w4i1Var = zyi0Var.d;
            boolean zG = x340Var4.g(list);
            c380 c380Var = this.b;
            boolean zG2 = zG | x340Var4.g(c380Var);
            Object objT = x340Var4.T();
            if (zG2 || objT == m4cVar) {
                objT = bb00.h((int) ((!list.isEmpty() ? watVar.X0(30.0f) : 0.0f) + (!c380Var.isEmpty() ? watVar.X0(20.0f) : 0.0f)), x340Var4);
            }
            err0 err0Var = (hdn0) objT;
            nl3 nl3Var2 = een.P0;
            g36 g36Var3 = h36.c;
            mbh mbhVarA = jbh.a(g36Var3, nl3Var2, x340Var4, 0);
            int iHashCode = Long.hashCode(x340Var4.T);
            xos0 xos0VarM = x340Var4.m();
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var4, qim0Var2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var4.m0();
            boolean z5 = x340Var4.S;
            Function0 function1 = hmb0.t1;
            if (z5) {
                x340Var4.l(function1);
            } else {
                x340Var4.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var4, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var4, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var4, lljVar3);
            nko1.F(x340Var4);
            vu30 vu30Var3 = y580.Y;
            nko1.H(qim0VarE, x340Var4, vu30Var3);
            boolean z6 = this.d;
            boolean z7 = this.c;
            if (z6 && zyi0Var.m && !z7) {
                x340Var4.i0(-978836095);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var4).b;
                cvx cvxVar2 = cbx.b(x340Var4).b;
                qim0Var = qim0Var2;
                qim0 qim0VarB = uyn1.B(qim0Var, 0.0f, 4.0f, 0.0f, 8.0f, 5);
                gfh0 gfh0VarC = t1c.c(tl3Var2, false);
                int iHashCode2 = Long.hashCode(x340Var4.T);
                xos0 xos0VarM2 = x340Var4.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarB);
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(function1);
                } else {
                    x340Var4.v0();
                }
                nko1.H(gfh0VarC, x340Var4, lljVar);
                nko1.H(xos0VarM2, x340Var4, lljVar2);
                x0d.q(iHashCode2, x340Var4, lljVar3, x340Var4);
                nko1.H(qim0VarE2, x340Var4, vu30Var3);
                ni20Var = null;
                g36Var = g36Var3;
                function0 = function1;
                otw.c(this.i, new yvm(w4i1Var, this.t), (qim0) null, (ipb1) null, x340Var4, 8, 12);
                x340Var = x340Var4;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                qim0Var = qim0Var2;
                function0 = function1;
                g36Var = g36Var3;
                ni20Var = null;
                x340Var = x340Var4;
                x340Var.i0(-978432475);
                x340Var.r(false);
            }
            uyi0 uyi0Var = zyi0Var.n;
            boolean z8 = uyi0Var instanceof ryi0;
            pyi0 pyi0Var = pyi0.a;
            qyi0 qyi0Var = qyi0.a;
            if (z8) {
                x340Var.i0(-1139936988);
                x340Var.r(false);
                str = zyi0Var.c;
                g36Var2 = g36Var;
                vu30Var = vu30Var3;
            } else {
                if (uyi0Var instanceof tyi0) {
                    g36Var2 = g36Var;
                    vu30Var = vu30Var3;
                    strK = x0d.k(x340Var, -1139934631, 2131954574, x340Var, false);
                } else {
                    g36Var2 = g36Var;
                    vu30Var = vu30Var3;
                    if (uyi0Var instanceof syi0) {
                        strK = x0d.k(x340Var, -1139930632, 2131954572, x340Var, false);
                    } else if (uyi0Var instanceof oyi0) {
                        x340Var.i0(-1139926321);
                        strK = z7 != 0 ? x0d.k(x340Var, -977958361, 2131954538, x340Var, false) : x0d.k(x340Var, -977859378, 2131954537, x340Var, false);
                        x340Var.r(false);
                    } else {
                        if (!uyi0Var.equals(qyi0Var) && !uyi0Var.equals(pyi0Var)) {
                            throw p3d1.k(x340Var, -1139939143, false);
                        }
                        x340Var.i0(-977678495);
                        x340Var.r(false);
                        strK = "";
                    }
                }
                str = strK;
            }
            boolean zG3 = x340Var.g(uyi0Var);
            Object objT2 = x340Var.T();
            oyi0 oyi0Var = oyi0.a;
            if (zG3 || objT2 == m4cVar) {
                if ((uyi0Var instanceof syi0) || uyi0Var.equals(oyi0Var)) {
                    ni20Var2 = tkx.c;
                } else {
                    ni20Var2 = uyi0Var instanceof tyi0 ? znx.c : ni20Var;
                }
                x340Var.s0(ni20Var2);
                objT2 = ni20Var2;
            }
            hux huxVar = (hux) objT2;
            String str2 = w4i1Var.a;
            boolean z9 = zyi0Var.m;
            boolean zA = zyi0Var.a();
            yyi0 yyi0Var = zyi0Var.f;
            if (yyi0Var.equals(wyi0.a)) {
                exi0Var = fxi0.a;
            } else if (yyi0Var instanceof vyi0) {
                exi0Var = new exi0(((vyi0) yyi0Var).a);
            } else {
                if (!yyi0Var.equals(xyi0.a)) {
                    eg.o();
                    return null;
                }
                exi0Var = gxi0.a;
            }
            hxi0 hxi0Var = exi0Var;
            String str3 = zyi0Var.a;
            boolean zG4 = x340Var.g(zyi0Var);
            iu30 iu30Var = this.h;
            boolean zG5 = zG4 | x340Var.g(iu30Var);
            Object objT3 = x340Var.T();
            if (zG5 || objT3 == m4cVar) {
                objT3 = new o5j0(zyi0Var, iu30Var, (byte) 2);
                x340Var.s0(objT3);
            }
            iu30 iu30Var2 = (iu30) objT3;
            String str4 = this.f;
            x340 x340Var5 = x340Var;
            otw.c(this.e, new ixi0(str4, str3, str, str2, huxVar, zA, z7, z9, hxi0Var, this.g, iu30Var2), (qim0) null, (ipb1) null, x340Var5, 0, 12);
            x340 x340Var6 = x340Var5;
            boolean zA2 = zyi0Var.a();
            pbh pbhVar3 = pbh.a;
            if (zA2) {
                pbhVar = pbhVar3;
                x340Var6.i0(-975219387);
                x340Var6.r(false);
            } else {
                x340Var6.i0(-975674901);
                fq7.b(pbhVar3, err0Var.s() != 0 && (!list.isEmpty() || !c380Var.isEmpty()), (qim0) null, (bby) null, (ln00) null, (String) null, apo.r(1743384199, new q5j0(err0Var, (byte) 0), x340Var6), x340Var6, 1572870, 30);
                pbhVar = pbhVar3;
                x340Var6 = x340Var6;
                x340Var6.r(false);
            }
            if (uyi0Var.equals(ryi0.a) || uyi0Var.equals(pyi0Var) || uyi0Var.equals(oyi0Var) || uyi0Var.equals(qyi0Var)) {
                sumVar = ni20Var;
            } else if (uyi0Var instanceof tyi0) {
                sumVar = new tum(((tyi0) uyi0Var).a);
            } else {
                if (!(uyi0Var instanceof syi0)) {
                    eg.o();
                    return ni20Var;
                }
                sumVar = new sum(((syi0) uyi0Var).a);
            }
            if (sumVar == null) {
                x340Var6.i0(-974589654);
                x340Var6.r(false);
                x340Var2 = x340Var6;
                pbhVar2 = pbhVar;
                tl3Var = tl3Var2;
                vu30Var2 = vu30Var;
                z = true;
            } else {
                x340Var6.i0(-974589653);
                nl3 nl3Var3 = z7 != 0 ? nl3Var : nl3Var2;
                if (z7 != 0) {
                    x340Var6.i0(1030993909);
                    p3v p3vVar = new p3v(0.0f);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar3 = cbx.b(x340Var6).b;
                    mmr0Var = new mmr0(p3vVar, new p3v(16.0f));
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(1031068309);
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar4 = cbx.b(x340Var6).b;
                    mmr0 mmr0Var2 = new mmr0(new p3v(16.0f), new p3v(0.0f));
                    x340Var6.r(false);
                    mmr0Var = mmr0Var2;
                }
                qim0 qim0VarC = pbhVar.c(nl3Var3, uyn1.B(qim0Var, ((p3v) mmr0Var.a).a, 0.0f, ((p3v) mmr0Var.b).a, 0.0f, 10));
                tl3Var = tl3Var2;
                gfh0 gfh0VarC2 = t1c.c(tl3Var, false);
                pbh pbhVar4 = pbhVar;
                ni20 ni20Var3 = sumVar;
                int iHashCode3 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM3 = x340Var6.m();
                qim0 qim0VarE3 = zr7.E(x340Var6, qim0VarC);
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(function0);
                } else {
                    x340Var6.v0();
                }
                nko1.H(gfh0VarC2, x340Var6, lljVar);
                nko1.H(xos0VarM3, x340Var6, lljVar2);
                x0d.q(iHashCode3, x340Var6, lljVar3, x340Var6);
                vu30Var2 = vu30Var;
                nko1.H(qim0VarE3, x340Var6, vu30Var2);
                x340 x340Var7 = x340Var6;
                pbhVar2 = pbhVar4;
                otw.c(this.X, ni20Var3, (qim0) null, (ipb1) null, x340Var7, 0, 12);
                x340Var2 = x340Var7;
                z = true;
                x340Var2.r(true);
                x340Var2.r(false);
            }
            x340Var2.r(z);
            if (zyi0Var.a()) {
                x340 x340Var8 = x340Var2;
                x340Var8.i0(412717659);
                x340Var8.r(false);
            } else {
                x340Var2.i0(410254616);
                boolean z10 = this.c;
                qim0 qim0VarA = g2cVar.a(qim0Var, z10 ? een.Y : een.t);
                boolean zG6 = x340Var2.g(err0Var);
                Object objT4 = x340Var2.T();
                if (zG6 || objT4 == m4cVar) {
                    objT4 = new myg0(err0Var, (byte) 5);
                    x340Var2.s0(objT4);
                }
                qim0 qim0VarX = ern1.x(qim0VarA, (iu30) objT4);
                gfh0 gfh0VarC3 = t1c.c(tl3Var, false);
                int iHashCode4 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM4 = x340Var2.m();
                qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarX);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(function0);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC3, x340Var2, lljVar);
                nko1.H(xos0VarM4, x340Var2, lljVar2);
                x0d.q(iHashCode4, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE4, x340Var2, vu30Var2);
                mbh mbhVarA2 = jbh.a(g36Var2, z10 ? nl3Var : nl3Var2, x340Var2, 0);
                int iHashCode5 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM5 = x340Var2.m();
                qim0 qim0VarE5 = zr7.E(x340Var2, qim0Var);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(function0);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, lljVar);
                nko1.H(xos0VarM5, x340Var2, lljVar2);
                x0d.q(iHashCode5, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE5, x340Var2, vu30Var2);
                Collection collection = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x04f4: MOVE (r6v8 'collection' java.util.Collection) = (r16v1 java.util.Collection) A[DECLARE_VAR] (LINE:1269) in method: p.r5j0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes5.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v1 java.util.Collection
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1539
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.r5j0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }
