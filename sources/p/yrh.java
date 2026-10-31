package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class yrh implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yrh(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:121:0x0300  */
    /* JADX WARN: Code duplicated, block: B:271:0x0566  */
    /* JADX WARN: Code duplicated, block: B:280:0x0594  */
    /* JADX WARN: Code duplicated, block: B:282:0x0598  */
    /* JADX WARN: Code duplicated, block: B:284:0x05af  */
    /* JADX WARN: Code duplicated, block: B:287:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:372:0x02fb A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v40 java.lang.Object, still in use, count: 2, list:
          (r3v40 java.lang.Object) from 0x02e1: PHI (r3 I:??) = (r3v35 java.lang.Object), (r3v40 java.lang.Object) binds: [B:111:0x02e0, B:370:0x02e1] A[DONT_GENERATE, DONT_INLINE]
          (r3v40 java.lang.Object) from 0x02d7: CHECK_CAST (p.l0l) (r3v40 java.lang.Object)
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
    public final void accept(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 1950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yrh.accept(java.lang.Object):void");
    }
}
