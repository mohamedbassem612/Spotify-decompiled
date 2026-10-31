package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class ft30 extends tv30 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft30(Object obj, byte b) {
        super(1, obj, ao60.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        this.a = b;
        switch (b) {
            case 14:
                super(1, obj, sp80.class, "createContribution", "createContribution(Lcom/spotify/element/core/instrumentation/InstrumentationEnvironment;)Lcom/spotify/element/core/instrumentation/InstrumentationEnvironment;", 0);
                break;
            case 15:
                super(1, obj, sp80.class, "createContribution", "createContribution(Lcom/spotify/element/core/instrumentation/InstrumentationEnvironment;)Lcom/spotify/element/core/instrumentation/InstrumentationEnvironment;", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x011f A[Catch: all -> 0x0118, TRY_LEAVE, TryCatch #0 {all -> 0x0118, blocks: (B:21:0x0101, B:22:0x0107, B:24:0x010d, B:30:0x011b, B:32:0x011f), top: B:122:0x0101 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0137  */
    /* JADX WARN: Code duplicated, block: B:38:0x0145  */
    /* JADX WARN: Code duplicated, block: B:42:0x014f  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v15 java.lang.Object, still in use, count: 2, list:
          (r2v15 java.lang.Object) from 0x011b: PHI (r2 I:??) = (r2v12 java.lang.Object), (r2v15 java.lang.Object) binds: [B:29:0x011a, B:127:0x011b] A[DONT_GENERATE, DONT_INLINE]
          (r2v15 java.lang.Object) from 0x0112: CHECK_CAST (byte[]) (r2v15 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ft30.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ft30(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft30(io60 io60Var, byte b) {
        super(1, io60Var, io60.class, "isLauncherIntent", "isLauncherIntent(Landroid/content/Intent;)Z", 0);
        this.a = b;
        switch (b) {
            case 6:
                super(1, io60Var, io60.class, "isLauncherIntent", "isLauncherIntent(Landroid/content/Intent;)Z", 0);
                break;
            case 7:
                super(1, io60Var, io60.class, "isHomeIntent", "isHomeIntent(Landroid/content/Intent;)Z", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft30(rm70 rm70Var) {
        super(1, rm70Var, rm70.class, "getItem", "getItem(I)Ljava/lang/Object;", 0);
        this.a = (byte) 9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft30(lu70 lu70Var) {
        super(1, lu70Var, lu70.class, "stateToModel", "stateToModel(Lcom/spotify/home/evopage/element/imagelinks/ImageLinkCardDataElement$State;)Lcom/spotify/home/evopage/element/imagelinks/imagelinkcard/ImageLinkCard$Model;", 0);
        this.a = (byte) 10;
    }
}
