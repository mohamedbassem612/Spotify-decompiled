package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class lbc0 extends tv30 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbc0(Object obj, byte b) {
        super(1, obj, qzh.class, "render", "render(Ljava/lang/Object;)V", 0);
        this.a = b;
        switch (b) {
            case 5:
                super(1, obj, qzh.class, "onEvent", "onEvent(Lkotlin/jvm/functions/Function1;)V", 0);
                break;
            case 23:
                super(1, obj, zpj0.class, "unregisterBatchObservable", "unregisterBatchObservable(Ljava/util/UUID;)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:167:0x0408  */
    /* JADX WARN: Code duplicated, block: B:168:0x040a  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:60:0x0209  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v22 java.lang.Object, still in use, count: 2, list:
          (r4v22 java.lang.Object) from 0x038d: PHI (r4 I:??) = (r4v15 java.lang.Object), (r4v22 java.lang.Object) binds: [B:126:0x038c, B:285:0x038d] A[DONT_GENERATE, DONT_INLINE]
          (r4v22 java.lang.Object) from 0x0383: CHECK_CAST (byte[]) (r4v22 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 2008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lbc0.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lbc0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbc0(woa woaVar) {
        super(1, woaVar, woa.class, "release", "release(Lcom/spotify/betamax/player/BetamaxPlayer;)V", 0);
        this.a = (byte) 27;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbc0(zpj0 zpj0Var) {
        super(1, zpj0Var, zpj0.class, "handleViewPersistenceNeeded", "handleViewPersistenceNeeded(Lcom/spotify/performancesdk/observationplatform/impl/metrics/MetricView;)V", 0);
        this.a = (byte) 22;
    }
}
