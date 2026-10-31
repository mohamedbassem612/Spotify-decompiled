package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zzk implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e0l b;

    public /* synthetic */ zzk(e0l e0lVar, byte b) {
        this.a = b;
        this.b = e0lVar;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x013e  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v9 java.lang.Object, still in use, count: 2, list:
          (r5v9 java.lang.Object) from 0x012f: PHI (r5 I:??) = (r5v6 java.lang.Object), (r5v9 java.lang.Object) binds: [B:59:0x012e, B:84:0x012f] A[DONT_GENERATE, DONT_INLINE]
          (r5v9 java.lang.Object) from 0x0125: CHECK_CAST (p.l0l) (r5v9 java.lang.Object)
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
    public final java.lang.Object emit(java.lang.Object r14, p.lnm r15) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zzk.emit(java.lang.Object, p.lnm):java.lang.Object");
    }
}
