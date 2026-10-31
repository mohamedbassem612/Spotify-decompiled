package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qht implements Function0 {
    public final /* synthetic */ byte a;
    public final wht b;

    public /* synthetic */ qht(wht whtVar, byte b) {
        this.a = b;
        this.b = whtVar;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x028e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0299  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fd  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v6 java.lang.Object, still in use, count: 2, list:
          (r1v6 java.lang.Object) from 0x028a: PHI (r1 I:??) = (r1v3 java.lang.Object), (r1v6 java.lang.Object) binds: [B:107:0x0288, B:127:0x028a] A[DONT_GENERATE, DONT_INLINE]
          (r1v6 java.lang.Object) from 0x0277: CHECK_CAST (p.kfy0) (r1v6 java.lang.Object)
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
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qht.invoke():java.lang.Object");
    }
}
