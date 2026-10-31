package p;

import android.graphics.Color;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class swj extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swj(txj txjVar, w061 w061Var, l7e0 l7e0Var, hwq hwqVar, String str, String str2, boolean z, tob1 tob1Var) {
        super(3);
        this.a = (byte) 0;
        this.c = txjVar;
        this.d = w061Var;
        this.e = l7e0Var;
        this.f = hwqVar;
        this.g = str;
        this.h = str2;
        this.b = z;
        this.i = tob1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        int i;
        String str;
        Object obj4;
        u7h m231Var;
        long j;
        String strK;
        boolean z;
        boolean z2;
        u7h m231Var2;
        long j2;
        int i2;
        x340 x340Var;
        float f;
        rdi0 rdi0Var;
        boolean z3;
        x340 x340Var2;
        u7h m231Var3;
        byte b = this.a;
        boolean z4 = this.b;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.c;
        Object obj8 = this.i;
        Object obj9 = this.h;
        Object obj10 = this.g;
        Object obj11 = this.d;
        switch (b) {
            case 0:
                vu30 vu30Var = (vu30) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                hwq hwqVar = (hwq) obj5;
                l7e0 l7e0Var = (l7e0) obj6;
                txj txjVar = (txj) obj7;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var3.i(vu30Var) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    if (!txjVar.c || ((w061) obj11) == null) {
                        i = 0;
                        x340Var4.i0(94375465);
                        us71.j(iIntValue & 14, vu30Var, x340Var4, false);
                    } else {
                        x340Var4.i0(93970202);
                        l061.a(l7e0Var.a(), hwqVar.a, l7e0Var.getUri(), (String) obj10, (String) obj9, this.b, (tob1) obj8, (w061) obj11, vu30Var, x340Var4, (iIntValue << 24) & 234881024);
                        i = 0;
                        x340Var4.r(false);
                    }
                    txjVar.d(hwqVar, x340Var4, i);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 1:
                iir iirVar = (iir) obj5;
                vzq0 vzq0Var = (vzq0) obj;
                x340 x340Var5 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                etu etuVar = (etu) obj7;
                ven0 ven0Var = (ven0) obj11;
                nim0 nim0Var = nim0.a;
                if (z4) {
                    x340 x340Var6 = x340Var5;
                    x340Var6.i0(985381800);
                    boolean z5 = etuVar.c;
                    boolean zI = x340Var6.i(ven0Var);
                    Object objT = x340Var6.T();
                    if (zI || objT == m4cVar) {
                        objT = new hnf(ven0Var, (byte) 23);
                        x340Var6.s0(objT);
                    }
                    lmt0.d(0, (Function0) objT, x340Var6, uyn1.w(nim0Var, vzq0Var), z5);
                    x340Var6.r(false);
                } else {
                    x340 x340Var7 = x340Var5;
                    x340Var7.i0(985680268);
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    xtb0 xtb0Var = (xtb0) obj6;
                    boolean zI2 = x340Var7.i(iirVar) | x340Var7.i(etuVar) | x340Var7.i(ven0Var) | x340Var7.i((List) obj10) | x340Var7.i((tvr) obj9) | x340Var7.i((List) obj8);
                    List list = (List) obj10;
                    List list2 = (List) obj8;
                    tvr tvrVar = (tvr) obj9;
                    Object objT2 = x340Var7.T();
                    if (zI2 || objT2 == m4cVar) {
                        j96 j96Var = new j96(etuVar, list, list2, iirVar, ven0Var, tvrVar);
                        x340Var7.s0(j96Var);
                        objT2 = j96Var;
                    }
                    ujo1.d(qim0VarD, xtb0Var, vzq0Var, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT2, x340Var7, (iIntValue2 << 6) & 896, 504);
                    x340Var7.r(false);
                }
                return rih1Var;
            case 2:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                i2c i2cVar = (i2c) obj;
                x340 x340Var8 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                odi0 odi0Var = (odi0) obj7;
                boolean z6 = odi0Var.j;
                String str2 = odi0Var.g;
                try {
                    str = str2;
                    obj4 = obj5;
                    try {
                        m231Var = new u7h(z4p1.e(Color.parseColor(str2)));
                    } catch (Throwable th) {
                        th = th;
                        m231Var = new m231(th);
                    }
                    break;
                } catch (Throwable th2) {
                    th = th2;
                    str = str2;
                    obj4 = obj5;
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                u7h u7hVar = m231Var;
                if (u7hVar != null) {
                    j = u7hVar.a;
                } else {
                    uwr uwrVar = cbx.a;
                    j = ((xex) ((gmt) zex.a.c).b).s;
                }
                rdi0 rdi0Var2 = odi0Var.f;
                if (z6) {
                    x340 x340Var9 = x340Var8;
                    strK = x0d.k(x340Var9, -1782092904, 2131961274, x340Var9, false);
                } else {
                    x340 x340Var10 = x340Var8;
                    x340Var10.i0(589771457);
                    x340Var10.r(false);
                    strK = null;
                }
                x340 x340Var11 = x340Var8;
                x340Var11.i0(-1782072976);
                j06 j06Var = x340Var11.a;
                Object objT3 = x340Var11.T();
                if (objT3 == m4cVar2) {
                    objT3 = ktd.n(x340Var11);
                }
                idn0 idn0Var = (idn0) objT3;
                jtr jtrVar = jtr.c;
                String strO0 = cwl1.o0(x340Var11, 2131954292);
                String text = rdi0Var2 != 0 ? rdi0Var2.getText() : null;
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarY = bin.y(nim0Var2, idn0Var, jtrVar, false, text, new pm31(0), strO0, (Function0) obj11, (Function0) obj6, 388);
                float fD = i2cVar.d();
                cbx.a.getClass();
                if (p3v.b(fD / uwr.d().a, 192.0f) >= 0 && i2cVar.d() / 235.0f < uwr.d().a) {
                    x340Var11.i0(-1878851097);
                    boolean z7 = !upo1.A(x340Var11);
                    z = false;
                    x340Var11.r(false);
                    z2 = z7;
                } else {
                    z = false;
                    x340Var11.i0(1885159374);
                    x340Var11.r(false);
                    z2 = false;
                }
                if (z2) {
                    d7e.r(uwr.d().a, qim0VarY, z);
                }
                x340Var11.r(z);
                qim0 qim0VarF = u291.f(qim0VarY, 1.0f);
                boolean zI3 = x340Var11.i(odi0Var) | x340Var11.g(strK);
                Object objT4 = x340Var11.T();
                if (zI3 || objT4 == m4cVar2) {
                    objT4 = new uah0(odi0Var, strK, (byte) 9);
                    x340Var11.s0(objT4);
                }
                qim0 qim0VarB = uyn1.B(s161.b(qim0VarF, false, (iu30) objT4), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                uwr uwrVar2 = cbx.a;
                cua cuaVar = cbx.b(x340Var11).f;
                qim0 qim0VarQ = i1p1.q(qim0VarB, er31.b(8.0f));
                u5j1 u5j1Var = d4o1.a;
                qim0 qim0VarF2 = dug.f(qim0VarQ, j, u5j1Var);
                hdn0 hdn0Var = (hdn0) obj4;
                j2i j2iVar = (j2i) obj10;
                Function0 function0 = (Function0) obj9;
                fns fnsVar = (fns) obj8;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var11.T);
                xos0 xos0VarM = x340Var11.m();
                qim0 qim0VarE = zr7.E(x340Var11, qim0VarF2);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var11.m0();
                boolean z8 = x340Var11.S;
                n4k n4kVar = hmb0.t1;
                if (z8) {
                    x340Var11.l(n4kVar);
                } else {
                    x340Var11.v0();
                }
                nko1.H(gfh0VarC, x340Var11, lljVar4);
                nko1.H(xos0VarM, x340Var11, lljVar3);
                x0d.q(iHashCode, x340Var11, lljVar2, x340Var11);
                nko1.H(qim0VarE, x340Var11, lljVar);
                try {
                    m231Var2 = new u7h(z4p1.e(Color.parseColor(str)));
                    break;
                } catch (Throwable th3) {
                    m231Var2 = new m231(th3);
                }
                if (m231Var2 instanceof m231) {
                    m231Var2 = null;
                }
                u7h u7hVar2 = m231Var2;
                if (u7hVar2 != null) {
                    j2 = u7hVar2.a;
                } else {
                    uwr uwrVar3 = cbx.a;
                    j2 = ((xex) ((gmt) zex.a.c).b).s;
                }
                idi0 idi0Var = odi0Var.h;
                if (idi0Var instanceof gdi0) {
                    x340Var11.i0(-325581242);
                    wpo1.b(((gdi0) idi0Var).a, x340Var11, 0);
                    x340Var11.r(false);
                } else if (idi0Var instanceof hdi0) {
                    x340Var11.i0(-325578338);
                    wpo1.c((hdi0) idi0Var, x340Var11, 0);
                    x340Var11.r(false);
                } else {
                    if (idi0Var != null) {
                        throw p3d1.k(x340Var11, -325584102, false);
                    }
                    x340Var11.i0(-325576858);
                    x340Var11.r(false);
                }
                qim0 qim0VarA = h2c.a.a(u291.d(nim0Var2, 1.0f), een.t);
                era eraVar = een.P0;
                f36 f36Var = h36.c;
                mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var11, 0);
                int iHashCode2 = Long.hashCode(x340Var11.T);
                xos0 xos0VarM2 = x340Var11.m();
                qim0 qim0VarE2 = zr7.E(x340Var11, qim0VarA);
                hzj.A.getClass();
                x340Var11.m0();
                if (x340Var11.S) {
                    x340Var11.l(n4kVar);
                } else {
                    x340Var11.v0();
                }
                nko1.H(mbhVarA, x340Var11, lljVar4);
                nko1.H(xos0VarM2, x340Var11, lljVar3);
                x0d.q(iHashCode2, x340Var11, lljVar2, x340Var11);
                nko1.H(qim0VarE2, x340Var11, lljVar);
                Object objT5 = x340Var11.T();
                if (objT5 == m4cVar2) {
                    objT5 = bb00.h(0, x340Var11);
                }
                hdn0 hdn0Var2 = (hdn0) objT5;
                qim0 qim0VarF3 = u291.f(nim0Var2, 1.0f);
                boolean zI4 = x340Var11.i(hdn0Var2);
                Object objT6 = x340Var11.T();
                if (zI4 || objT6 == m4cVar2) {
                    i2 = 2;
                    objT6 = new myg0(hdn0Var2, (byte) 2);
                    x340Var11.s0(objT6);
                } else {
                    i2 = 2;
                }
                qim0 qim0VarB2 = uyn1.B(u291.j(48.0f, 0.0f, i2, ern1.x(qim0VarF3, (iu30) objT6)), 0.0f, 4.0f, 4.0f, 0.0f, 9);
                fra fraVar = een.Z;
                gex0 gex0Var = h36.a;
                jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var11, 0);
                int iHashCode3 = Long.hashCode(x340Var11.T);
                xos0 xos0VarM3 = x340Var11.m();
                qim0 qim0VarE3 = zr7.E(x340Var11, qim0VarB2);
                x340Var11.m0();
                if (x340Var11.S) {
                    x340Var11.l(n4kVar);
                } else {
                    x340Var11.v0();
                }
                nko1.H(jw31VarA, x340Var11, lljVar4);
                nko1.H(xos0VarM3, x340Var11, lljVar3);
                x0d.q(iHashCode3, x340Var11, lljVar2, x340Var11);
                nko1.H(qim0VarE3, x340Var11, lljVar);
                if (z6) {
                    x340Var11.i0(-1571810933);
                    f = 16.0f;
                    p9p1.b(uyn1.B(nim0Var2, 16.0f, 16.0f, 0.0f, 0.0f, 12), 3, 0, x340Var11, 48, 4);
                    x340Var = x340Var11;
                    x340Var.r(false);
                } else {
                    x340Var = x340Var11;
                    f = 16.0f;
                    x340Var.i0(-1571631226);
                    x340Var.r(false);
                }
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                float f2 = Float.MAX_VALUE;
                if (1.0f <= Float.MAX_VALUE) {
                    f2 = 1.0f;
                }
                op71.g(x340Var, new wnb0(f2, true));
                j2iVar.invoke(x340Var, 0);
                x340Var.r(true);
                op71.g(x340Var, exd0.r(kx40.h(1.0f, u291.d((qim0) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0429: INVOKE 
                      (r1v19 'x340Var' p.x340)
                      (wrap p.qim0:0x0425: INVOKE 
                      (wrap p.qim0:0x041a: INVOKE 
                      (1.0f float)
                      (wrap p.qim0:0x0416: INVOKE (wrap p.qim0:?: CAST (p.qim0) (r39v3 ?? I:??[OBJECT, ARRAY])), (1.0f float) STATIC call: p.u291.d(p.qim0, float):p.qim0 A[WRAPPED] (LINE:1047))
                      true
                     STATIC call: p.kx40.h(float, p.qim0, boolean):p.qim0 A[WRAPPED] (LINE:1051))
                      (wrap p.ps:0x0422: CONSTRUCTOR (13 byte), (r8v13 'j2' long) A[WRAPPED] (LINE:1059) call: p.ps.<init>(byte, long):void type: CONSTRUCTOR)
                     STATIC call: p.exd0.r(p.qim0, p.iu30):p.qim0 A[WRAPPED] (LINE:1062))
                     STATIC call: p.op71.g(p.b0k, p.qim0):void (LINE:1066) in method: p.swj.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes8.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r39v3 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1972
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.swj.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public swj(odi0 odi0Var, Function0 function0, Function0 function1, hdn0 hdn0Var, j2i j2iVar, Function0 function2, fns fnsVar, boolean z) {
                super(3);
                this.a = (byte) 2;
                this.c = odi0Var;
                this.d = function0;
                this.e = function1;
                this.f = hdn0Var;
                this.g = j2iVar;
                this.h = function2;
                this.i = fnsVar;
                this.b = z;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ swj(boolean z, Object obj, ven0 ven0Var, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
                super(3);
                this.a = b;
                this.b = z;
                this.c = obj;
                this.d = ven0Var;
                this.e = obj2;
                this.f = obj3;
                this.g = obj4;
                this.h = obj5;
                this.i = obj6;
            }
        }
