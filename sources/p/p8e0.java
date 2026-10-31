package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p8e0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q8e0 b;

    public /* synthetic */ p8e0(q8e0 q8e0Var, byte b) {
        this.a = b;
        this.b = q8e0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:40:0x012d A[LOOP:2: B:38:0x0127->B:40:0x012d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x014f A[LOOP:3: B:42:0x0149->B:44:0x014f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x019b  */
    /* JADX WARN: Code duplicated, block: B:48:0x019f  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b6  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v15 java.lang.Object, still in use, count: 2, list:
          (r3v15 java.lang.Object) from 0x00d6: PHI (r3 I:??) = (r3v6 java.lang.Object), (r3v15 java.lang.Object) binds: [B:32:0x00d4, B:61:0x00d6] A[DONT_GENERATE, DONT_INLINE]
          (r3v15 java.lang.Object) from 0x00ca: CHECK_CAST (p.i1z) (r3v15 java.lang.Object)
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
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p8e0.accept(java.lang.Object):void");
    }
}
