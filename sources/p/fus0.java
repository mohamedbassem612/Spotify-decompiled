package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fus0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ gus0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fus0(gus0 gus0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = gus0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        gus0 gus0Var = this.c;
        switch (b) {
            case 0:
                return new fus0(gus0Var, lnmVar, (byte) 0);
            default:
                return new fus0(gus0Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v4 java.lang.Object, still in use, count: 2, list:
          (r7v4 java.lang.Object) from 0x0076: PHI (r7 I:??) = (r7v1 java.lang.Object), (r7v4 java.lang.Object) binds: [B:27:0x0075, B:50:0x0076] A[DONT_GENERATE, DONT_INLINE]
          (r7v4 java.lang.Object) from 0x006a: CHECK_CAST (p.m0d) (r7v4 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            p.d9n r2 = p.d9n.a
            r3 = 1
            p.gus0 r4 = r9.c
            r5 = 0
            switch(r0) {
                case 0: goto La4;
                default: goto Ld;
            }
        Ld:
            boolean r0 = r9.b
            if (r0 == 0) goto L1d
            if (r0 != r3) goto L17
            p.hm5.M(r10)
            goto L32
        L17:
            p.eg.m(r1)
            r2 = r5
            goto La3
        L1d:
            p.hm5.M(r10)
            p.q8n r10 = r4.c
            p.fus0 r0 = new p.fus0
            r1 = 0
            r0.<init>(r4, r5, r1)
            r9.b = r3
            java.lang.Object r10 = p.fn31.Y(r10, r0, r9)
            if (r10 != r2) goto L32
            goto La3
        L32:
            p.bus0 r10 = (p.bus0) r10
            p.bpb1 r9 = r4.d
            if (r10 != 0) goto L40
            p.eus0 r10 = new p.eus0
            r0 = 27
            r10.<init>(r0)
            goto L9b
        L40:
            java.lang.Object r0 = r9.getValue()
            p.eus0 r0 = (p.eus0) r0
            java.lang.String r1 = r10.b
            java.util.List r2 = r10.a
            int r10 = r10.c
            p.m0d r4 = r0.b
            if (r4 == 0) goto L57
            boolean r6 = r2.contains(r4)
            if (r6 == 0) goto L57
            goto L58
        L57:
            r4 = r5
        L58:
            r6 = r2
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L5f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L75
            java.lang.Object r7 = r6.next()
            r8 = r7
            p.m0d r8 = (p.m0d) r8
            java.lang.String r8 = r8.a
            boolean r8 = p.nhc1.S(r8, r1, r3)
            if (r8 == 0) goto L5f
            goto L76
        L75:
            r7 = r5
        L76:
            p.m0d r7 = (p.m0d) r7
            boolean r1 = r0.d
            if (r1 == 0) goto L88
            if (r4 != 0) goto L95
            if (r7 != 0) goto L94
            java.lang.Object r1 = p.o7h.s0(r2)
            r4 = r1
            p.m0d r4 = (p.m0d) r4
            goto L95
        L88:
            if (r7 != 0) goto L94
            if (r4 != 0) goto L95
            java.lang.Object r1 = p.o7h.s0(r2)
            r4 = r1
            p.m0d r4 = (p.m0d) r4
            goto L95
        L94:
            r4 = r7
        L95:
            r1 = 8
            p.eus0 r10 = p.eus0.a(r0, r2, r4, r10, r1)
        L9b:
            r9.getClass()
            r9.m(r5, r10)
            p.rih1 r2 = p.rih1.a
        La3:
            return r2
        La4:
            boolean r0 = r9.b
            if (r0 == 0) goto Lb3
            if (r0 != r3) goto Lae
            p.hm5.M(r10)
            goto Lc1
        Lae:
            p.eg.m(r1)
            r10 = r5
            goto Lc1
        Lb3:
            p.hm5.M(r10)
            p.sjq0 r10 = r4.b
            r9.b = r3
            java.lang.Object r10 = r10.x0(r9)
            if (r10 != r2) goto Lc1
            r10 = r2
        Lc1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fus0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
