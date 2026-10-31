package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class j1 extends tv30 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(him himVar) {
        super(2, himVar, him.class, "dismissOnError", "dismissOnError(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = (byte) 21;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0283 A[PHI: r6
      0x0283: PHI (r6v15 p.jfu0) = 
      (r6v14 p.jfu0)
      (r6v14 p.jfu0)
      (r6v14 p.jfu0)
      (r6v14 p.jfu0)
      (r6v14 p.jfu0)
      (r6v14 p.jfu0)
      (r6v14 p.jfu0)
      (r6v16 p.jfu0)
     binds: [B:106:0x0255, B:107:0x0257, B:111:0x025e, B:113:0x0262, B:116:0x026b, B:118:0x0275, B:124:0x028b, B:121:0x0281] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:203:0x0452  */
    /* JADX WARN: Code duplicated, block: B:219:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:220:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:244:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:251:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:255:0x04ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:256:0x0501 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:258:0x0506 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:259:0x0508 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:261:0x050d  */
    /* JADX WARN: Code duplicated, block: B:264:0x0513  */
    /* JADX WARN: Code duplicated, block: B:265:0x0516  */
    /* JADX WARN: Code duplicated, block: B:267:0x0519  */
    /* JADX WARN: Code duplicated, block: B:268:0x051b  */
    /* JADX WARN: Code duplicated, block: B:270:0x051e  */
    /* JADX WARN: Code duplicated, block: B:271:0x0521  */
    /* JADX WARN: Code duplicated, block: B:273:0x0524  */
    /* JADX WARN: Code duplicated, block: B:275:0x0527  */
    /* JADX WARN: Code duplicated, block: B:276:0x052a  */
    /* JADX WARN: Code duplicated, block: B:278:0x052d  */
    /* JADX WARN: Code duplicated, block: B:283:0x053e  */
    /* JADX WARN: Code duplicated, block: B:285:0x0542  */
    /* JADX WARN: Code duplicated, block: B:286:0x0547  */
    /* JADX WARN: Code duplicated, block: B:289:0x054d  */
    /* JADX WARN: Code duplicated, block: B:291:0x0572  */
    /* JADX WARN: Code duplicated, block: B:292:0x058e  */
    /* JADX WARN: Code duplicated, block: B:294:0x0592  */
    /* JADX WARN: Code duplicated, block: B:296:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:298:0x05af  */
    /* JADX WARN: Code duplicated, block: B:300:0x0601  */
    /* JADX WARN: Code duplicated, block: B:302:0x0605  */
    /* JADX WARN: Code duplicated, block: B:304:0x061d  */
    /* JADX WARN: Code duplicated, block: B:306:0x0620  */
    /* JADX WARN: Code duplicated, block: B:308:0x0623  */
    /* JADX WARN: Code duplicated, block: B:309:0x062c  */
    /* JADX WARN: Code duplicated, block: B:310:0x0643  */
    /* JADX WARN: Code duplicated, block: B:311:0x0657  */
    /* JADX WARN: Code duplicated, block: B:312:0x066c  */
    /* JADX WARN: Code duplicated, block: B:314:0x0670  */
    /* JADX WARN: Code duplicated, block: B:319:0x0682  */
    /* JADX WARN: Code duplicated, block: B:324:0x0691  */
    /* JADX WARN: Code duplicated, block: B:331:0x069e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0238  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v6 java.lang.Object, still in use, count: 2, list:
          (r12v6 java.lang.Object) from 0x049e: PHI (r12 I:??) = (r12v3 java.lang.Object), (r12v6 java.lang.Object) binds: [B:216:0x049d, B:336:0x049e] A[DONT_GENERATE, DONT_INLINE]
          (r12v6 java.lang.Object) from 0x0490: CHECK_CAST (p.up70) (r12v6 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object invoke(java.lang.Object r46, java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 1788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.j1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(Object obj) {
        super(2, obj, hld.class, "setCarModeEnabled", "setCarModeEnabled(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = (byte) 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(dt71 dt71Var) {
        super(2, dt71Var, sen0.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = (byte) 3;
    }
}
