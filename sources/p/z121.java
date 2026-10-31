package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z121 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m0u b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z121(a221 a221Var, m0u m0uVar, byte b) {
        super(3);
        this.a = b;
        this.b = m0uVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d3  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v7 java.lang.Object, still in use, count: 2, list:
          (r4v7 java.lang.Object) from 0x00cf: PHI (r4 I:??) = (r4v1 java.lang.Object), (r4v7 java.lang.Object) binds: [B:26:0x00ce, B:33:0x00cf] A[DONT_GENERATE, DONT_INLINE]
          (r4v7 java.lang.Object) from 0x00c1: CHECK_CAST (p.g0u) (r4v7 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r21, java.lang.Object r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.z121.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
