package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gaa extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaa(cab cabVar) {
        super(3);
        this.a = (byte) 18;
        this.b = cabVar;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0368  */
    /* JADX WARN: Code duplicated, block: B:263:0x0800  */
    /* JADX WARN: Code duplicated, block: B:264:0x080a  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v33 java.lang.Object, still in use, count: 2, list:
          (r6v33 java.lang.Object) from 0x07fc: PHI (r6 I:??) = (r6v30 java.lang.Object), (r6v33 java.lang.Object) binds: [B:260:0x07fb, B:422:0x07fc] A[DONT_GENERATE, DONT_INLINE]
          (r6v33 java.lang.Object) from 0x07f0: CHECK_CAST (p.cih1) (r6v33 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 3204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gaa.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gaa(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }
}
