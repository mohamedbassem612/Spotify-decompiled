package p;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k2e implements c2e {
    public final d2e b;
    public final yqg c;
    public final dp60 d;
    public final zsc e;
    public final tp60 f;
    public final emm g;
    public final u9c0 h;
    public final w25 i;
    public final Context j;
    public final yjq k;
    public final long l;

    public k2e(d2e d2eVar, yqg yqgVar, dp60 dp60Var, zsc zscVar, tp60 tp60Var, emm emmVar, u9c0 u9c0Var, w25 w25Var, Context context, zov0 zov0Var, yjq yjqVar) {
        this.b = d2eVar;
        this.c = yqgVar;
        this.d = dp60Var;
        this.e = zscVar;
        this.f = tp60Var;
        this.g = emmVar;
        this.h = u9c0Var;
        this.i = w25Var;
        this.j = context;
        this.k = yjqVar;
        this.l = ((long) w25Var.H()) * 1000;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // p.c2e
    public final Object b(String str, ice0 ice0Var, boolean z, boolean z2, String str2, String str3, boolean z3, String str4, onm onmVar) throws IOException {
        f2e f2eVar;
        k2e k2eVar;
        Object m231Var;
        if (onmVar instanceof f2e) {
            f2eVar = (f2e) onmVar;
            int i = f2eVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f2eVar.d = i - Integer.MIN_VALUE;
            } else {
                f2eVar = new f2e(this, onmVar);
            }
        } else {
            f2eVar = new f2e(this, onmVar);
        }
        f2e f2eVar2 = f2eVar;
        Object objS = f2eVar2.b;
        int i2 = f2eVar2.d;
        try {
            if (i2 == 0) {
                hm5.M(objS);
                try {
                    i2e i2eVar = new i2e(this, str, this.k.l(), z, str2, str3, z3, str4, (lnm) null);
                    f2eVar2.a = this;
                    f2eVar2.d = 1;
                    objS = smo1.s(i2eVar, f2eVar2);
                    d9n d9nVar = d9n.a;
                    if (objS == d9nVar) {
                        return d9nVar;
                    }
                    k2eVar = this;
                } catch (Throwable th) {
                    th = th;
                    k2eVar = this;
                    m231Var = new m231(th);
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k2eVar = f2eVar2.a;
                try {
                    hm5.M(objS);
                } catch (Throwable th2) {
                    th = th2;
                    m231Var = new m231(th);
                }
            }
            m231Var = (sy21) objS;
            Throwable thA = e331.a(m231Var);
            if (thA != null) {
                this.e.E((sy21) null, thA);
            }
            Throwable thA2 = e331.a(m231Var);
            if (thA2 != null) {
                throw new IOException(thA2);
            }
            sy21 sy21Var = (sy21) m231Var;
            k2eVar.getClass();
            ry21 ry21Var = sy21Var.a;
            if (ry21Var.Q0) {
                return sy21Var;
            }
            k220.i(ab80.n("HTTP ", " ", ry21Var.d, ry21Var.c));
            return null;
        } catch (CancellationException e) {
            throw e;
        }
    }

    public final String c(boolean z) {
        if (this.d.a.h(dp60.b, false)) {
            return "no-cache";
        }
        if (!z) {
            return "";
        }
        upc upcVar = upc.o;
        upcVar.getClass();
        return nyn1.Z(upcVar);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Throwable, p.sy21] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    public final Object d(String str, String str2, boolean z, boolean z2, String str3, String str4, boolean z3, String str5, onm onmVar) {
        j2e j2eVar;
        Object obj;
        yqg yqgVar;
        Object m231Var;
        ?? r5;
        boolean z4;
        zsc zscVar;
        Throwable thA;
        sy21 sy21Var;
        up60 up60Var;
        boolean z5 = z;
        boolean z6 = z3;
        w25 w25Var = this.i;
        if (onmVar instanceof j2e) {
            j2eVar = (j2e) onmVar;
            int i = j2eVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                j2eVar.e = i - Integer.MIN_VALUE;
            } else {
                j2eVar = new j2e(this, onmVar);
            }
        } else {
            j2eVar = new j2e(this, onmVar);
        }
        Object objB = j2eVar.c;
        int i2 = j2eVar.e;
        yqg yqgVar2 = this.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                try {
                    d2e d2eVar = this.b;
                    String id = yqgVar2.g().getID();
                    try {
                        String strC = c(z5);
                        String strK = this.g.a.k();
                        String strZ = upn1.z(upn1.q());
                        try {
                            boolean zH = w25Var.h();
                            String str6 = w25Var.k() ? str4 : null;
                            try {
                                Boolean boolM = yah0.m(xoi1.b(this.j));
                                if (!w25Var.P()) {
                                    boolM = null;
                                }
                                Boolean boolM2 = z6 ? yah0.m(true) : null;
                                j2eVar.a = z5;
                                j2eVar.b = z6;
                                j2eVar.e = 1;
                                j2e j2eVar2 = j2eVar;
                                obj = null;
                                yqgVar = yqgVar2;
                                try {
                                    objB = d2eVar.b(strC, strK, zH, str6, boolM, "home", str, str2, id, z2, strZ, str3, boolM2, str5, j2eVar2);
                                    d9n d9nVar = d9n.a;
                                    obj = obj;
                                    if (objB == d9nVar) {
                                        return d9nVar;
                                    }
                                    m231Var = (sy21) objB;
                                    r5 = obj;
                                } catch (Throwable th) {
                                    th = th;
                                    m231Var = new m231(th);
                                    r5 = obj;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj = null;
                                yqgVar = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c2: MOVE (r4v3 'yqgVar' p.yqg) = (r10v0 p.yqg) (LINE:195) in method: p.k2e.d(java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, p.onm):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes2.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:383)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
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
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
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
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 p.yqg
                                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                    */
                                /*
                                    Method dump skipped, instruction units count: 270
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: p.k2e.d(java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, p.onm):java.lang.Object");
                            }
                        }
