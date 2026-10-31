package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class npa extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ npa(Object obj, long j, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = j;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.h = obj5;
        this.i = obj6;
        this.t = obj7;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.t;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        switch (b) {
            case 0:
                return new npa((oo71) obj8, this.c, (String) obj7, (opa) obj6, (ipa) obj5, (y7g1) obj4, (guq0) obj3, (ArrayList) obj2, lnmVar, (byte) 0);
            default:
                return new npa((yqg) obj8, this.c, (jti0) obj7, (c9n) obj6, (ven0) obj5, (drr0) obj4, (ven0) obj3, (hdn0) obj2, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Throwable, p.xjz] */
    /* JADX WARN: Type inference failed for: r12v5 */
    public final Object invokeSuspend(Object obj) {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        ?? r12;
        oo71 oo71Var;
        Object objF;
        Object obj2;
        ConcurrentHashMap concurrentHashMap3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.t;
        Object obj4 = this.f;
        Object obj5 = this.h;
        Object obj6 = this.g;
        long j = this.c;
        Object obj7 = this.d;
        d9n d9nVar = d9n.a;
        Object obj8 = this.e;
        Object obj9 = this.i;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                String str = (String) obj8;
                opa opaVar = (opa) obj4;
                ConcurrentHashMap concurrentHashMap4 = opaVar.h;
                ConcurrentHashMap concurrentHashMap5 = opaVar.k;
                ConcurrentHashMap concurrentHashMap6 = opaVar.i;
                ConcurrentHashMap concurrentHashMap7 = opaVar.j;
                hpa hpaVar = opaVar.e;
                oo71 oo71Var2 = (oo71) obj7;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    oo71Var2.c(j, 2, str);
                    oo71Var2.c(j, 3, str);
                    a8g1 a8g1VarA = opaVar.a.a((ipa) obj6);
                    jpa jpaVar = new jpa(opaVar, j, (byte) 2);
                    jpa jpaVar2 = new jpa(opaVar, j, (byte) 3);
                    this.b = true;
                    concurrentHashMap = concurrentHashMap4;
                    concurrentHashMap2 = concurrentHashMap5;
                    r12 = 0;
                    oo71Var = oo71Var2;
                    objF = opaVar.c.f((y7g1) obj5, (guq0) obj9, jpaVar, (136 & 8) != 0 ? null : a8g1VarA, null, (136 & 32) == 0, (136 & 64) != 0 ? null : null, (136 & 128) != 0 ? null : jpaVar2, (136 & 256) == 0, this);
                    if (objF == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objF = ((e331) obj).a;
                    concurrentHashMap = concurrentHashMap4;
                    concurrentHashMap2 = concurrentHashMap5;
                    r12 = 0;
                    oo71Var = oo71Var2;
                }
                if (objF instanceof m231) {
                    obj2 = objF;
                    concurrentHashMap3 = concurrentHashMap;
                } else {
                    u4k u4kVar = (u4k) objF;
                    Iterator it = arrayList.iterator();
                    int i = 0;
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        obj2 = objF;
                        long j2 = this.c;
                        if (zHasNext) {
                            Object next = it.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                p7h.T();
                                throw r12;
                            }
                            x7g1 x7g1Var = (x7g1) next;
                            Boolean bool = (Boolean) u4kVar.e.get(new Integer(i));
                            hpaVar.b(j2, i, x7g1Var, bool != null ? bool.booleanValue() : false);
                            objF = obj2;
                            i = i2;
                        } else {
                            rgc rgcVar = (rgc) concurrentHashMap7.remove(new Long(j2));
                            if (rgcVar == null) {
                                rgcVar = new rgc();
                            }
                            long j3 = rgcVar.a.get();
                            long j4 = rgcVar.b.get();
                            gpa gpaVar = (gpa) hpaVar.e.remove(Long.valueOf(j2));
                            if (gpaVar == null) {
                                hpaVar = hpaVar;
                            } else {
                                hpaVar = hpaVar;
                                hpaVar.c(gpaVar, "completed", null, j3, j4);
                            }
                            oo71Var.c(j2, 4, str);
                            concurrentHashMap6.remove(new Long(j2));
                            concurrentHashMap2.remove(new Long(j2));
                            Long l = new Long(j2);
                            concurrentHashMap3 = concurrentHashMap;
                            concurrentHashMap3.remove(l);
                        }
                    }
                }
                Throwable thA = e331.a(obj2);
                if (thA != null) {
                    Iterator it2 = arrayList.iterator();
                    int i3 = 0;
                    while (true) {
                        boolean zHasNext2 = it2.hasNext();
                        long j5 = this.c;
                        if (zHasNext2) {
                            Object next2 = it2.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                p7h.T();
                                throw r12;
                            }
                            hpaVar.b(j5, i3, (x7g1) next2, false);
                            i3 = i4;
                        } else {
                            hpa hpaVar2 = hpaVar;
                            
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01fa: INVOKE 
                                  (r20v0 ?? I:??[OBJECT, ARRAY])
                                  (wrap java.lang.Long:0x01f7: CONSTRUCTOR (r4v3 'j5' long) A[MD:(long):void (c), WRAPPED] (LINE:504) call: java.lang.Long.<init>(long):void type: CONSTRUCTOR)
                                 VIRTUAL call: java.util.concurrent.ConcurrentHashMap.remove(java.lang.Object):java.lang.Object A[MD:(java.lang.Object):V (c)] (LINE:507) in method: p.npa.invokeSuspend(java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes5.dex
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
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
                                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v0 ??
                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                */
                            /*
                                Method dump skipped, instruction units count: 604
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: p.npa.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }
