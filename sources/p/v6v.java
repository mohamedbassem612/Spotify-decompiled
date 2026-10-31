package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v6v extends hab0 implements zu30 {
    public final /* synthetic */ ven0 N0;
    public final /* synthetic */ xtb0 O0;
    public final /* synthetic */ long P0;
    public final /* synthetic */ String Q0;
    public final /* synthetic */ ven0 R0;
    public final /* synthetic */ ven0 S0;
    public final /* synthetic */ ggv T0;
    public final /* synthetic */ fgv U0;
    public final /* synthetic */ String V0;
    public final /* synthetic */ String W0;
    public final /* synthetic */ String X;
    public final /* synthetic */ ven0 X0;
    public final /* synthetic */ ven0 Y;
    public final /* synthetic */ hdn0 Y0;
    public final /* synthetic */ ss50 Z;
    public final /* synthetic */ iu30 Z0;
    public final /* synthetic */ int a;
    public final /* synthetic */ dw91 b;
    public final /* synthetic */ dw91 c;
    public final /* synthetic */ c380 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Set f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6v(int i, dw91 dw91Var, dw91 dw91Var2, c380 c380Var, boolean z, Set set, int i2, int i3, int i4, String str, String str2, ven0 ven0Var, ss50 ss50Var, ven0 ven0Var2, xtb0 xtb0Var, long j, String str3, ven0 ven0Var3, ven0 ven0Var4, ggv ggvVar, fgv fgvVar, String str4, String str5, ven0 ven0Var5, hdn0 hdn0Var, iu30 iu30Var) {
        super(4);
        this.a = i;
        this.b = dw91Var;
        this.c = dw91Var2;
        this.d = c380Var;
        this.e = z;
        this.f = set;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.t = str;
        this.X = str2;
        this.Y = ven0Var;
        this.Z = ss50Var;
        this.N0 = ven0Var2;
        this.O0 = xtb0Var;
        this.P0 = j;
        this.Q0 = str3;
        this.R0 = ven0Var3;
        this.S0 = ven0Var4;
        this.T0 = ggvVar;
        this.U0 = fgvVar;
        this.V0 = str4;
        this.W0 = str5;
        this.X0 = ven0Var5;
        this.Y0 = hdn0Var;
        this.Z0 = iu30Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
        float f;
        long jB;
        x340 x340Var;
        boolean z;
        Throwable th;
        dw91 dw91Var;
        smc0 smc0Var;
        fgv fgvVar;
        String str;
        String str2;
        ven0 ven0Var;
        ven0 ven0Var2;
        hdn0 hdn0Var;
        v6v v6vVar;
        boolean z2;
        long j;
        Throwable th2;
        float f2;
        int iIntValue = ((Number) obj2).intValue();
        ((Number) obj4).intValue();
        m4c m4cVar = fkj0.X;
        int i = this.a + iIntValue;
        Integer numValueOf = Integer.valueOf(i);
        x340 x340Var2 = (b0k) obj3;
        dw91 dw91Var2 = this.b;
        boolean zI = x340Var2.i(dw91Var2) | x340Var2.e(i);
        dw91 dw91Var3 = this.c;
        boolean zI2 = zI | x340Var2.i(dw91Var3);
        Object objT = x340Var2.T();
        if (zI2 || objT == m4cVar) {
            objT = new gu2(dw91Var2, i, dw91Var3, (byte) 16);
            x340Var2.s0(objT);
        }
        qxd0.i(numValueOf, (iu30) objT, x340Var2);
        c380 c380Var = this.d;
        oce1 oce1Var = (oce1) c380Var.get(i);
        String str3 = oce1Var.d;
        String str4 = oce1Var.c;
        boolean zG = x340Var2.g(str3) | x340Var2.h(this.e);
        Object objT2 = x340Var2.T();
        if (zG || objT2 == m4cVar) {
            objT2 = v8r.q((Object) null);
            x340Var2.s0(objT2);
        }
        ven0 ven0Var3 = (ven0) objT2;
        oce1 oce1Var2 = (oce1) o7h.t0(i + 1, c380Var);
        boolean zContains = this.f.contains(Integer.valueOf(i));
        if ((oce1Var2 != null ? oce1Var2.c : null) != null) {
            x340Var2.i0(-1635307136);
            x340Var2.r(false);
            f = 0.0f;
        } else {
            x340Var2.i0(-1635306010);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            x340Var2.r(false);
            f = 2.0f;
        }
        ven0 ven0Var4 = this.Y;
        zu91 zu91VarJ0 = ((h7v) ven0Var4.getValue()).b() ? irn1.j0() : irn1.o0(300, 0, (dlv) null, 6);
        long jE = zContains ? z4p1.e(this.g) : u7h.j;
        zu91 zu91Var = zu91VarJ0;
        tob1 tob1VarA = w191.a(jE, zu91Var, (String) null, x340Var2, 0, 12);
        if (zContains) {
            x340Var2.i0(-1635286736);
            uwr uwrVar2 = cbx.a;
            jB = u7h.b(cbx.a(x340Var2).a.c, 0.2f, 0.0f, 0.0f, 0.0f, 14);
            x340Var2.r(false);
        } else {
            x340Var2.i0(-1635285143);
            x340Var2.r(false);
            jB = u7h.j;
        }
        tob1 tob1VarA2 = w191.a(jB, zu91Var, (String) null, x340Var2, 0, 12);
        nim0 nim0Var = nim0.a;
        if (str4 != null) {
            x340Var2.i0(845910504);
            if (i > 0) {
                x340Var2.i0(-1635278393);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                cvx cvxVar3 = cbx.b(x340Var2).b;
                x340Var2.r(false);
                f2 = 10.0f;
            } else {
                x340Var2.i0(-1635275296);
                x340Var2.r(false);
                f2 = 0.0f;
            }
            uwr uwrVar4 = cbx.a;
            cvx cvxVar4 = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, f2, 0.0f, 4.0f, 5);
            z = zContains;
            th = null;
            uwo1.e(uap1.e(oce1Var.a).concat(str4.length() == 0 ? "" : " · ".concat(str4)), qim0VarB, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
            x340Var = x340Var2;
            x340Var.r(false);
        } else {
            x340Var = x340Var2;
            z = zContains;
            th = null;
            x340Var.i0(846613956);
            x340Var.r(false);
        }
        boolean zE = x340Var.e(i) | x340Var.e(this.h) | x340Var.e(this.i);
        String str5 = this.t;
        boolean zG2 = zE | x340Var.g(str5);
        String str6 = this.X;
        boolean zG3 = zG2 | x340Var.g(str6);
        Object objT3 = x340Var.T();
        ven0 ven0Var5 = this.N0;
        if (zG3 || objT3 == m4cVar) {
            smc0 smc0VarN = k4p1.n();
            int i2 = this.i;
            int i3 = this.h;
            ven0 ven0Var6 = this.S0;
            ss50 ss50Var = this.Z;
            xtb0 xtb0Var = this.O0;
            c380 c380Var2 = this.d;
            ggv ggvVar = this.T0;
            fgv fgvVar2 = this.U0;
            String str7 = this.V0;
            String str8 = this.W0;
            ven0 ven0Var7 = this.X0;
            hdn0 hdn0Var2 = this.Y0;
            if (i <= i2) {
                fgvVar = fgvVar2;
                str2 = str8;
                ven0Var = ven0Var7;
                ven0Var2 = ven0Var4;
                dw91Var = dw91Var3;
                smc0Var = smc0VarN;
                str = str7;
                hdn0Var = hdn0Var2;
                smc0Var.add(new epo(str5, new u6v(i, i3, i2, ven0Var6, ven0Var2, ss50Var, xtb0Var, ven0Var5, c380Var2, ggvVar, fgvVar, str, str2, ven0Var, hdn0Var, (byte) 0)));
            } else {
                dw91Var = dw91Var3;
                smc0Var = smc0VarN;
                fgvVar = fgvVar2;
                str = str7;
                str2 = str8;
                ven0Var = ven0Var7;
                ven0Var2 = ven0Var4;
                hdn0Var = hdn0Var2;
            }
            if (i >= i3) {
                smc0Var.add(new epo(str6, new u6v(i, i3, i2, ven0Var6, ven0Var2, ss50Var, xtb0Var, ven0Var5, c380Var2, ggvVar, fgvVar, str, str2, ven0Var, hdn0Var, (byte) 1)));
            }
            objT3 = k4p1.k(smc0Var);
            
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02aa: INVOKE (r19v1 ?? I:??[OBJECT, ARRAY]), (r11v6 'objT3' java.lang.Object) VIRTUAL call: p.x340.s0(java.lang.Object):void (LINE:683) in method: p.v6v.J(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes9.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v1 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1328
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.v6v.J(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
