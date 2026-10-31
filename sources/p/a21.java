package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a21 implements Consumer {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ a21(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:291:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0191  */
    /* JADX WARN: Code duplicated, block: B:57:0x0196  */
    /* JADX WARN: Code duplicated, block: B:60:0x019b  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d7  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v13 java.lang.Object, still in use, count: 2, list:
          (r12v13 java.lang.Object) from 0x018d: PHI (r12 I:??) = (r12v4 java.lang.Object), (r12v13 java.lang.Object) binds: [B:53:0x018c, B:288:0x018d] A[DONT_GENERATE, DONT_INLINE]
          (r12v13 java.lang.Object) from 0x0183: CHECK_CAST (p.ps80) (r12v13 java.lang.Object)
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
    public final void accept(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 2304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a21.accept(java.lang.Object):void");
    }
}
