package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l6d0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l6d0(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x033d A[Catch: Exception -> 0x0353, TryCatch #0 {Exception -> 0x0353, blocks: (B:114:0x0322, B:116:0x033d, B:118:0x0349, B:122:0x0356, B:124:0x035b), top: B:175:0x0322 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0349 A[Catch: Exception -> 0x0353, TryCatch #0 {Exception -> 0x0353, blocks: (B:114:0x0322, B:116:0x033d, B:118:0x0349, B:122:0x0356, B:124:0x035b), top: B:175:0x0322 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0355  */
    /* JADX WARN: Code duplicated, block: B:123:0x035a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0322 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v31 java.lang.Object, still in use, count: 2, list:
          (r2v31 java.lang.Object) from 0x031d: PHI (r2 I:??) = (r2v25 java.lang.Object), (r2v31 java.lang.Object) binds: [B:110:0x031c, B:180:0x031d] A[DONT_GENERATE, DONT_INLINE]
          (r2v31 java.lang.Object) from 0x0316: CHECK_CAST (byte[]) (r2v31 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l6d0.invoke(java.lang.Object):java.lang.Object");
    }
}
