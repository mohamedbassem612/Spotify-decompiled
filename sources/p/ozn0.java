package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ozn0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qzn0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ozn0(qzn0 qzn0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = qzn0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        qzn0 qzn0Var = this.b;
        switch (b) {
            case 0:
                return new ozn0(qzn0Var, lnmVar, (byte) 0);
            case 1:
                return new ozn0(qzn0Var, lnmVar, (byte) 1);
            default:
                return new ozn0(qzn0Var, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v5 java.lang.Object, still in use, count: 2, list:
          (r5v5 java.lang.Object) from 0x0077: PHI (r5 I:??) = (r5v3 java.lang.Object), (r5v5 java.lang.Object) binds: [B:24:0x0076, B:36:0x0077] A[DONT_GENERATE, DONT_INLINE]
          (r5v5 java.lang.Object) from 0x006f: CHECK_CAST (p.ap41) (r5v5 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            byte r0 = r4.a
            p.rih1 r1 = p.rih1.a
            p.qzn0 r4 = r4.b
            switch(r0) {
                case 0: goto L50;
                case 1: goto L47;
                default: goto L9;
            }
        L9:
            p.hm5.M(r5)
            p.hp41 r4 = r4.b
            java.util.ArrayDeque r5 = r4.a
            p.sge1.a()
            p.tac0 r0 = r4.c
            p.w8c0 r0 = r0.i
            p.w8c0 r2 = p.w8c0.a
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L26
            java.lang.String r4 = "CarApp"
            r5 = 3
            android.util.Log.isLoggable(r4, r5)
            goto L46
        L26:
            int r0 = r5.size()
            r2 = 1
            if (r0 > r2) goto L2e
            goto L46
        L2e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L33:
            int r3 = r5.size()
            if (r3 <= r2) goto L43
            java.lang.Object r3 = r5.pop()
            p.ap41 r3 = (p.ap41) r3
            r0.add(r3)
            goto L33
        L43:
            r4.c(r0)
        L46:
            return r1
        L47:
            p.hm5.M(r5)
            p.hp41 r4 = r4.b
            r4.b()
            return r1
        L50:
            p.hm5.M(r5)
            p.hp41 r4 = r4.b
            r4.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.ArrayDeque r4 = r4.a
            r5.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L63:
            boolean r5 = r4.hasNext()
            r0 = 0
            if (r5 == 0) goto L76
            java.lang.Object r5 = r4.next()
            r1 = r5
            p.ap41 r1 = (p.ap41) r1
            boolean r1 = r1 instanceof p.xo31
            if (r1 == 0) goto L63
            goto L77
        L76:
            r5 = r0
        L77:
            boolean r4 = r5 instanceof p.xo31
            if (r4 == 0) goto L7e
            r0 = r5
            p.xo31 r0 = (p.xo31) r0
        L7e:
            if (r0 == 0) goto L87
            java.lang.String r4 = r0.a()
            if (r4 == 0) goto L87
            goto L89
        L87:
            java.lang.String r4 = p.eqn0.b
        L89:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ozn0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
