package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gel1 extends hab0 implements xu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ vge1 Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ ven0 a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ xu30 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gel1(ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, xu30 xu30Var, ven0 ven0Var5, int i, int i2, int i3, int i4, int i5, vge1 vge1Var, List list) {
        super(3);
        this.a = ven0Var;
        this.b = ven0Var2;
        this.c = ven0Var3;
        this.d = ven0Var4;
        this.e = xu30Var;
        this.f = ven0Var5;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.t = i4;
        this.X = i5;
        this.Y = vge1Var;
        this.Z = list;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        cr31 cr31VarB = er31.b(8.0f);
        nim0 nim0Var = nim0.a;
        qim0 qim0VarC = u291.c(u291.j(56.0f, 0.0f, 2, u291.f(nim0Var, 1.0f)), 1.0f);
        uwr uwrVar = cbx.a;
        long j = cbx.a(x340Var).a.c;
        u5j1 u5j1Var = d4o1.a;
        qim0 qim0VarF = dug.f(qim0VarC, j, u5j1Var);
        gra graVar = een.d;
        gfh0 gfh0VarC = t1c.c(graVar, false);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        boolean z = x340Var3.S;
        n4k n4kVar = hmb0.t1;
        if (z) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
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
        nko1.H(qim0VarE, x340Var, lljVar4);
        qim0 qim0VarF2 = dug.f(i1p1.q(u291.c(u291.f(uyn1.z(16.0f, 0.0f, 2, h2c.a.a(nim0Var, een.h)), 1.0f), 0.8f), cr31VarB), cbx.a(x340Var).a.a.a(), u5j1Var);
        ven0 ven0Var = this.a;
        boolean zG = x340Var3.g(ven0Var);
        ven0 ven0Var2 = this.b;
        boolean zG2 = zG | x340Var3.g(ven0Var2);
        ven0 ven0Var3 = this.c;
        boolean zG3 = zG2 | x340Var3.g(ven0Var3);
        ven0 ven0Var4 = this.d;
        boolean zG4 = zG3 | x340Var3.g(ven0Var4);
        xu30 xu30Var = this.e;
        boolean zG5 = zG4 | x340Var3.g(xu30Var);
        Object objT = x340Var3.T();
        if (zG5 || objT == m4cVar) {
            objT = new qj40(xu30Var, ven0Var, ven0Var2, ven0Var3, ven0Var4, (byte) 2);
            x340Var3.s0(objT);
        }
        rih1 rih1Var = rih1.a;
        qim0 qim0VarB = f8d1.b(qim0VarF2, rih1Var, (PointerInputEventHandler) objT);
        boolean zG6 = x340Var3.g((Object) 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x013b: ARITH (r6v23 'zG6' boolean) = (wrap boolean:0x0135: ARITH (wrap boolean:0x012f: ARITH (wrap boolean:0x0129: ARITH (wrap boolean:0x0121: INVOKE (r15v2 'x340Var3' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r18v0 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:290)) | (wrap boolean:0x0125: INVOKE (r15v2 'x340Var3' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r19v0 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:294)) A[DONT_WRAP, WRAPPED] (LINE:298)) | (wrap boolean:0x012b: INVOKE (r15v2 'x340Var3' p.x340), (r8v4 'ven0Var2' p.ven0) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:300)) A[DONT_WRAP, WRAPPED] (LINE:304)) | (wrap boolean:0x0131: INVOKE (r15v2 'x340Var3' p.x340), (r9v2 'ven0Var3' p.ven0) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:306)) A[DONT_WRAP, WRAPPED] (LINE:310)) | (wrap boolean:0x0137: INVOKE (r15v2 'x340Var3' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r22v0 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:312)) A[DECLARE_VAR] (LINE:316) in method: p.gel1.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes10.dex
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
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            */
        /*
            Method dump skipped, instruction units count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gel1.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
