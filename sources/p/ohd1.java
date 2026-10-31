package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ohd1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qhd1 b;

    public /* synthetic */ ohd1(qhd1 qhd1Var, byte b) {
        this.a = b;
        this.b = qhd1Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v10 java.lang.Object, still in use, count: 2, list:
          (r5v10 java.lang.Object) from 0x0043: PHI (r5 I:??) = (r5v4 java.lang.Object), (r5v10 java.lang.Object) binds: [B:12:0x0042, B:22:0x0043] A[DONT_GENERATE, DONT_INLINE]
          (r5v10 java.lang.Object) from 0x0033: CHECK_CAST (p.ygd1) (r5v10 java.lang.Object)
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
    public final java.lang.Object emit(java.lang.Object r4, p.lnm r5) {
        /*
            r3 = this;
            byte r5 = r3.a
            p.rih1 r0 = p.rih1.a
            p.qhd1 r3 = r3.b
            r1 = 0
            switch(r5) {
                case 0: goto L17;
                default: goto La;
            }
        La:
            p.nd10 r4 = (p.nd10) r4
            java.lang.String r4 = "[CAL] FAB loop updated, invalidating screen"
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.spotify.base.java.logging.Logger.g(r4, r5)
            r3.c()
            return r0
        L17:
            p.khd1 r4 = (p.khd1) r4
            java.lang.String r5 = "[CAL] Tab loop updated, invalidating screen"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.spotify.base.java.logging.Logger.g(r5, r1)
            java.util.List r4 = r4.a
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L28:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L42
            java.lang.Object r5 = r4.next()
            r1 = r5
            p.ygd1 r1 = (p.ygd1) r1
            p.xgd1 r1 = r1.a
            p.wqn0 r1 = r1.e
            p.ypn0 r2 = p.ypn0.a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L28
            goto L43
        L42:
            r5 = 0
        L43:
            p.ygd1 r5 = (p.ygd1) r5
            if (r5 != 0) goto L48
            goto L5f
        L48:
            java.lang.String r4 = r5.d
            java.lang.String r5 = r3.Z0
            boolean r5 = p.u890.j(r4, r5)
            if (r5 != 0) goto L5f
            java.lang.String r5 = p.ypn0.b
            p.bqk0 r1 = new p.bqk0
            r2 = 16
            r1.<init>(r5, r4, r2)
            r3.Y0 = r1
            r3.Z0 = r4
        L5f:
            r3.c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ohd1.emit(java.lang.Object, p.lnm):java.lang.Object");
    }
}
