package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class skr implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ skr(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r0.d(r5, r1) == r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r0.e(r6, r1) == r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(p.bzc r6, p.lnm r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.b
            p.clr r0 = (p.clr) r0
            boolean r1 = r7 instanceof p.alr
            if (r1 == 0) goto L17
            r1 = r7
            p.alr r1 = (p.alr) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.d = r2
            goto L1c
        L17:
            p.alr r1 = new p.alr
            r1.<init>(r5, r7)
        L1c:
            java.lang.Object r5 = r1.b
            int r7 = r1.d
            r2 = 0
            r3 = 2
            r4 = 1
            if (r7 == 0) goto L36
            if (r7 == r4) goto L30
            if (r7 != r3) goto L2a
            goto L30
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            return r2
        L30:
            p.bzc r6 = r1.a
            p.hm5.M(r5)
            goto L5a
        L36:
            p.hm5.M(r5)
            boolean r5 = r6 instanceof p.xyc
            p.d9n r7 = p.d9n.a
            if (r5 == 0) goto L4f
            r5 = r6
            p.xyc r5 = (p.xyc) r5
            java.util.ArrayList r5 = r5.c
            r1.a = r6
            r1.d = r4
            java.lang.Object r5 = r0.d(r5, r1)
            if (r5 != r7) goto L5a
            goto L59
        L4f:
            r1.a = r6
            r1.d = r3
            java.lang.Object r5 = r0.e(r6, r1)
            if (r5 != r7) goto L5a
        L59:
            return r7
        L5a:
            p.bpb1 r5 = r0.i
            if (r5 == 0) goto L6b
            java.util.List r6 = r6.b()
            p.ekb r7 = r0.a
            java.util.ArrayList r6 = p.mmo1.t(r6, r7)
            r5.m(r2, r6)
        L6b:
            p.rih1 r5 = p.rih1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.skr.b(p.bzc, p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:195:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:196:0x03fb  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v5 java.lang.Object, still in use, count: 2, list:
          (r4v5 java.lang.Object) from 0x03f4: PHI (r4 I:??) = (r4v2 java.lang.Object), (r4v5 java.lang.Object) binds: [B:192:0x03f3, B:232:0x03f4] A[DONT_GENERATE, DONT_INLINE]
          (r4v5 java.lang.Object) from 0x03e4: CHECK_CAST (p.pr31) (r4v5 java.lang.Object)
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
    public final java.lang.Object emit(java.lang.Object r9, p.lnm r10) {
        /*
            Method dump skipped, instruction units count: 1218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.skr.emit(java.lang.Object, p.lnm):java.lang.Object");
    }
}
