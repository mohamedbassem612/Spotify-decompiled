package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ql30 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ kp00 a;
    public final /* synthetic */ cn30 b;
    public final /* synthetic */ c9c0 c;

    public ql30(kp00 kp00Var, cn30 cn30Var, c9c0 c9c0Var) {
        this.a = kp00Var;
        this.b = cn30Var;
        this.c = c9c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v4 java.lang.Object, still in use, count: 2, list:
          (r2v4 java.lang.Object) from 0x0057: PHI (r2 I:??) = (r2v1 java.lang.Object), (r2v4 java.lang.Object) binds: [B:21:0x0056, B:32:0x0057] A[DONT_GENERATE, DONT_INLINE]
          (r2v4 java.lang.Object) from 0x004f: CHECK_CAST (p.hp90) (r2v4 java.lang.Object)
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
    public final java.lang.Object a(java.lang.Object r5, p.r261 r6, p.onm r7) {
        /*
            r4 = this;
            p.nl30 r5 = (p.nl30) r5
            int r5 = r5.h
            int r5 = p.l1d.C(r5)
            p.d9n r6 = p.d9n.a
            p.rih1 r0 = p.rih1.a
            r1 = 0
            switch(r5) {
                case 0: goto L2c;
                case 1: goto L2e;
                case 2: goto L2e;
                case 3: goto L14;
                case 4: goto L2c;
                case 5: goto L2c;
                case 6: goto L2c;
                case 7: goto L2c;
                default: goto L10;
            }
        L10:
            p.eg.o()
            return r1
        L14:
            p.kp00 r4 = r4.a
            java.lang.Object r5 = r4.c
            p.q8n r5 = (p.q8n) r5
            p.n3s r2 = new p.n3s
            r3 = 16
            r2.<init>(r4, r1, r3)
            java.lang.Object r4 = p.fn31.Y(r5, r2, r7)
            if (r4 != r6) goto L28
            goto L29
        L28:
            r4 = r0
        L29:
            if (r4 != r6) goto L2c
            goto L67
        L2c:
            r4 = r0
            goto L67
        L2e:
            p.c9c0 r5 = r4.c
            p.omo r5 = r5.b
            p.zob1 r5 = r5.current()
            java.lang.Object r5 = r5.getValue()
            p.pp90 r5 = (p.pp90) r5
            if (r5 == 0) goto L5d
            java.util.ArrayList r5 = r5.c
            java.util.Iterator r5 = r5.iterator()
        L44:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r5.next()
            r3 = r2
            p.hp90 r3 = (p.hp90) r3
            boolean r3 = r3.e
            if (r3 == 0) goto L44
            goto L57
        L56:
            r2 = r1
        L57:
            p.hp90 r2 = (p.hp90) r2
            if (r2 == 0) goto L5d
            java.lang.String r1 = r2.c
        L5d:
            if (r1 == 0) goto L2c
            p.cn30 r4 = r4.b
            java.lang.Object r4 = r4.b(r1, r7)
            if (r4 != r6) goto L2c
        L67:
            if (r4 != r6) goto L6a
            return r4
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ql30.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
