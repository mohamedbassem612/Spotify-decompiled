package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b1t extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ l6s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1t(l6s l6sVar) {
        super(2);
        this.b = l6sVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v10 java.lang.Object, still in use, count: 2, list:
          (r13v10 java.lang.Object) from 0x006e: PHI (r13 I:??) = (r13v7 java.lang.Object), (r13v10 java.lang.Object) binds: [B:22:0x006d, B:36:0x006e] A[DONT_GENERATE, DONT_INLINE]
          (r13v10 java.lang.Object) from 0x005e: CHECK_CAST (p.qaj0) (r13v10 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            byte r0 = r12.a
            p.rih1 r1 = p.rih1.a
            r2 = 1
            p.l6s r12 = r12.b
            switch(r0) {
                case 0: goto L19;
                default: goto La;
            }
        La:
            p.b0k r13 = (p.b0k) r13
            java.lang.Number r14 = (java.lang.Number) r14
            r14.intValue()
            int r14 = p.czo1.p(r2)
            r12.a(r13, r14)
            return r1
        L19:
            p.b0k r13 = (p.b0k) r13
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            r0 = r14 & 3
            r3 = 2
            r4 = 0
            if (r0 == r3) goto L29
            r0 = r2
            goto L2a
        L29:
            r0 = r4
        L2a:
            r14 = r14 & r2
            r9 = r13
            p.x340 r9 = (p.x340) r9
            boolean r13 = r9.Y(r14, r0)
            if (r13 == 0) goto Lb9
            java.lang.Object r13 = r12.b
            p.hum1 r13 = (p.hum1) r13
            p.esm1 r6 = r13.a
            boolean r13 = r9.g(r6)
            java.lang.Object r14 = r9.T()
            if (r13 != 0) goto L48
            p.m4c r13 = p.fkj0.X
            if (r14 != r13) goto L91
        L48:
            java.lang.Object r12 = r12.a
            java.util.Set r12 = (java.util.Set) r12
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L52:
            boolean r13 = r12.hasNext()
            r14 = 0
            if (r13 == 0) goto L6d
            java.lang.Object r13 = r12.next()
            r0 = r13
            p.qaj0 r0 = (p.qaj0) r0
            java.lang.Class r0 = r0.a
            java.lang.Class r2 = r6.getClass()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L52
            goto L6e
        L6d:
            r13 = r14
        L6e:
            p.qaj0 r13 = (p.qaj0) r13
            if (r13 != 0) goto L87
            java.lang.Class r12 = r6.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "No MessagingElementFactory registered for "
            r0.<init>(r2)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            p.n57.e(r12)
        L87:
            if (r13 == 0) goto L8e
            p.kpg0 r12 = r13.b()
            r14 = r12
        L8e:
            r9.s0(r14)
        L91:
            r5 = r14
            p.xpw r5 = (p.xpw) r5
            if (r5 == 0) goto Laf
            r12 = -2139516481(0xffffffff807991bf, float:-1.1164379E-38)
            r9.i0(r12)
            p.nim0 r12 = p.nim0.a
            r13 = 1065353216(0x3f800000, float:1.0)
            p.qim0 r7 = p.u291.f(r12, r13)
            r10 = 0
            r11 = 8
            r8 = 0
            p.otw.c(r5, r6, r7, r8, r9, r10, r11)
            r9.r(r4)
            goto Lbc
        Laf:
            r12 = -2139418459(0xffffffff807b10a5, float:-1.1301737E-38)
            r9.i0(r12)
            r9.r(r4)
            goto Lbc
        Lb9:
            r9.b0()
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b1t.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1t(l6s l6sVar, int i) {
        super(2);
        this.b = l6sVar;
    }
}
