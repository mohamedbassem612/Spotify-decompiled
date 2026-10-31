package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vf3 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yqg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vf3(yqg yqgVar, byte b) {
        super(1);
        this.a = b;
        this.b = yqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:217:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:238:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:240:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:241:0x03fb  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v8 java.lang.Object, still in use, count: 2, list:
          (r5v8 java.lang.Object) from 0x03e1: PHI (r5 I:??) = (r5v5 java.lang.Object), (r5v8 java.lang.Object) binds: [B:232:0x03e0, B:366:0x03e1] A[DONT_GENERATE, DONT_INLINE]
          (r5v8 java.lang.Object) from 0x03d5: CHECK_CAST (p.u740) (r5v8 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r46) {
        /*
            Method dump skipped, instruction units count: 1388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vf3.invoke(java.lang.Object):java.lang.Object");
    }
}
