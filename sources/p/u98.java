package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class u98 extends k01 implements vu30 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u98(j2i j2iVar) {
        super(2, j2iVar, j2i.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        this.h = (byte) 3;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0221  */
    /* JADX WARN: Code duplicated, block: B:134:0x0225  */
    /* JADX WARN: Code duplicated, block: B:137:0x0230  */
    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:454:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x00a5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0112  */
    /* JADX WARN: Code duplicated, block: B:67:0x011a  */
    /* JADX WARN: Code duplicated, block: B:68:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0121  */
    /* JADX WARN: Code duplicated, block: B:73:0x012a  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v50 java.lang.Object, still in use, count: 2, list:
          (r4v50 java.lang.Object) from 0x021b: PHI (r4 I:??) = (r4v47 java.lang.Object), (r4v50 java.lang.Object) binds: [B:128:0x021a, B:479:0x021b] A[DONT_GENERATE, DONT_INLINE]
          (r4v50 java.lang.Object) from 0x020f: CHECK_CAST (p.odz0) (r4v50 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r18, java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 2318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.u98.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u98(Object obj) {
        super(2, obj, uya.class, "handleResult", "handleResult(Lcom/spotify/bluetooth/scanner/BLECharacteristicOperationResult$ReadOperationResult;)V", 4);
        this.h = (byte) 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u98(v98 v98Var) {
        super(2, v98Var, v98.class, "onCappedEvent", "onCappedEvent(Lcom/spotify/audiobook/playercapapi/AudiobookCappedEvent;)V", 4);
        this.h = (byte) 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u98(wh9 wh9Var) {
        super(2, wh9Var, wh9.class, "handleAction", "handleAction(Lcom/spotify/bluetooth/connectionimpl/BLEConnectionOperationQueueImpl$OperationQueueAction;)V", 4);
        this.h = (byte) 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u98(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u98(qhw0 qhw0Var) {
        super(2, qhw0Var, qhw0.class, "showUpsell", "showUpsell(Lcom/spotify/liveroom/previewendedeventsapi/ListeningPartyPreviewEndedEvent;)V", 4);
        this.h = (byte) 13;
    }
}
