package p;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wmk0 extends hab0 implements xu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ c9n c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmk0(nwb nwbVar, boolean z, c9n c9nVar, vy71 vy71Var, Function0 function0, dxb dxbVar, ven0 ven0Var, ven0 ven0Var2, kvq0 kvq0Var, Function0 function1, iu30 iu30Var, ven0 ven0Var3) {
        super(3);
        this.h = nwbVar;
        this.b = z;
        this.c = c9nVar;
        this.i = vy71Var;
        this.t = function0;
        this.X = dxbVar;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.Y = kvq0Var;
        this.Z = function1;
        this.f = iu30Var;
        this.g = ven0Var3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ven0 ven0Var;
        iu30 iu30Var;
        ven0 ven0Var2;
        ven0 ven0Var3;
        ven0 ven0Var4;
        max maxVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.Z;
        Object obj5 = this.Y;
        boolean z = this.b;
        Object obj6 = this.i;
        Object obj7 = this.X;
        Object obj8 = this.h;
        Object obj9 = this.t;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                res resVar = (res) obj8;
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                bfm0.b(x340Var2, 0);
                boolean zI = x340Var2.i(resVar);
                Object objT = x340Var2.T();
                if (zI || objT == m4cVar) {
                    objT = new iyb0(resVar, (lnm) null, (byte) 15);
                    x340Var2.s0(objT);
                }
                qxd0.t(rih1Var, x340Var2, (vu30) objT);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarN = anm1.N("transition_feedback_bottom_sheet", uyn1.y(qim0VarF, cbx.b(x340Var2).e.c, cbx.b(x340Var2).e.b));
                ArrayList arrayList = (ArrayList) obj6;
                smk0 smk0Var = (smk0) obj9;
                drr0 drr0Var = (drr0) obj7;
                frr0 frr0Var = (frr0) obj5;
                frr0 frr0Var2 = (frr0) obj4;
                mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 48);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
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
                uwo1.e(cwl1.o0(x340Var2, 2131958868), (qim0) null, cbx.d(x340Var2).e, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2026);
                cvx cvxVar = cbx.b(x340Var2).b;
                uwo1.e(ydh.g(8.0f, 2131958859, x340Var2, x340Var2, nim0Var), (qim0) null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2018);
                cvx cvxVar2 = cbx.b(x340Var2).b;
                op71.g(x340Var2, u291.h(nim0Var, 16.0f));
                hx10 hx10Var = new hx10(arrayList);
                boolean zI2 = x340Var2.i(smk0Var);
                iu30 iu30Var2 = this.f;
                boolean zG = zI2 | x340Var2.g(iu30Var2);
                Object objT2 = x340Var2.T();
                ven0 ven0Var5 = this.d;
                if (zG || objT2 == m4cVar) {
                    objT2 = new gnf0(smk0Var, iu30Var2, ven0Var5, (byte) 23);
                    x340Var2.s0(objT2);
                }
                iu30 iu30Var3 = (iu30) objT2;
                boolean zG2 = x340Var2.g(iu30Var2) | x340Var2.i(resVar);
                c9n c9nVar = this.c;
                boolean zI3 = zG2 | x340Var2.i(c9nVar) | x340Var2.i(smk0Var);
                Object objT3 = x340Var2.T();
                ven0 ven0Var6 = this.e;
                ven0 ven0Var7 = this.g;
                if (zI3 || objT3 == m4cVar) {
                    ven0Var = ven0Var7;
                    objT3 = new l690(iu30Var2, resVar, c9nVar, smk0Var, ven0Var5, ven0Var6, ven0Var, drr0Var, frr0Var, frr0Var2, (byte) 4);
                    iu30Var = iu30Var2;
                    ven0Var2 = ven0Var5;
                    ven0Var3 = ven0Var6;
                    x340Var2.s0(objT3);
                } else {
                    ven0Var = ven0Var7;
                    ven0Var3 = ven0Var6;
                    iu30Var = iu30Var2;
                    ven0Var2 = ven0Var5;
                }
                gyo1.m(hx10Var, iu30Var3, (qim0) null, (iu30) objT3, x340Var2, 0, 4);
                op71.g(x340Var2, u291.h(nim0Var, cbx.b(x340Var2).b.b));
                boolean zI4 = x340Var2.i(resVar) | x340Var2.i((Object) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0304: ARITH (r2v28 'zI4' boolean) = (wrap boolean:0x02ff: ARITH (wrap boolean:0x02f7: INVOKE (r1v5 'x340Var2' p.x340), (r11v1 'resVar' p.res) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:760)) | (wrap boolean:0x02fb: INVOKE (r1v5 'x340Var2' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r24v2 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:764)) A[DONT_WRAP, WRAPPED] (LINE:768)) | (wrap boolean:0x0300: INVOKE (r1v5 'x340Var2' p.x340), (r0v3 'iu30Var' p.iu30) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:769)) A[DECLARE_VAR] (LINE:773) in method: p.wmk0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes9.dex
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
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r24v2 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1036
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.wmk0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public wmk0(res resVar, ArrayList arrayList, smk0 smk0Var, iu30 iu30Var, c9n c9nVar, boolean z, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, drr0 drr0Var, frr0 frr0Var, frr0 frr0Var2) {
                super(3);
                this.h = resVar;
                this.i = arrayList;
                this.t = smk0Var;
                this.f = iu30Var;
                this.c = c9nVar;
                this.b = z;
                this.d = ven0Var;
                this.e = ven0Var2;
                this.g = ven0Var3;
                this.X = drr0Var;
                this.Y = frr0Var;
                this.Z = frr0Var2;
            }
        }
