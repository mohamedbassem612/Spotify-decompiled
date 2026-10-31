package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nty extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nty(l4r l4rVar, n39 n39Var, boolean z) {
        super(1);
        this.a = (byte) 13;
        this.b = n39Var;
    }

    /* JADX WARN: Code duplicated, block: B:215:0x0789  */
    /* JADX WARN: Code duplicated, block: B:217:0x078c  */
    /* JADX WARN: Code duplicated, block: B:218:0x0792  */
    /* JADX WARN: Code duplicated, block: B:269:0x081d  */
    /* JADX WARN: Code duplicated, block: B:336:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:69:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x0409  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v20 java.lang.Object, still in use, count: 2, list:
          (r13v20 java.lang.Object) from 0x0778: PHI (r13 I:??) = (r13v17 java.lang.Object), (r13v20 java.lang.Object) binds: [B:209:0x0777, B:518:0x0778] A[DONT_GENERATE, DONT_INLINE]
          (r13v20 java.lang.Object) from 0x076c: CHECK_CAST (p.u740) (r13v20 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r54) {
        /*
            Method dump skipped, instruction units count: 2916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nty.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nty(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }
}
