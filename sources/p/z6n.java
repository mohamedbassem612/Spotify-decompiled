package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class z6n extends tv30 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6n(qor qorVar, byte b) {
        super(2, qorVar, qor.class, "onDismiss", "onDismiss(Lcom/spotify/connect/smartcontrol/smartcontrolimpl/DefaultSmartControlHandle;Lcom/spotify/connect/smartcontrol/smartcontrolimpl/StatusReason;)V", 0);
        this.a = b;
        switch (b) {
            case 17:
                super(2, qorVar, qor.class, "onRefreshEvent", "onRefreshEvent(Lcom/spotify/connect/smartcontrol/smartcontrolimpl/DefaultSmartControlHandle;J)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0323  */
    /* JADX WARN: Code duplicated, block: B:130:0x0328  */
    /* JADX WARN: Code duplicated, block: B:142:0x0357  */
    /* JADX WARN: Code duplicated, block: B:152:0x037f  */
    /* JADX WARN: Code duplicated, block: B:162:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:167:0x03ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x03b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x03b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x03b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:179:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:181:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:183:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:185:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:186:0x03db  */
    /* JADX WARN: Code duplicated, block: B:188:0x03de  */
    /* JADX WARN: Code duplicated, block: B:189:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:191:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:193:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:194:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:197:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:202:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:210:0x0416  */
    /* JADX WARN: Code duplicated, block: B:218:0x0432  */
    /* JADX WARN: Code duplicated, block: B:228:0x0452  */
    /* JADX WARN: Code duplicated, block: B:238:0x0471  */
    /* JADX WARN: Code duplicated, block: B:241:0x047c  */
    /* JADX WARN: Code duplicated, block: B:247:0x0491  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v12 java.lang.Object, still in use, count: 2, list:
          (r3v12 java.lang.Object) from 0x031f: PHI (r3 I:??) = (r3v9 java.lang.Object), (r3v12 java.lang.Object) binds: [B:126:0x031e, B:281:0x031f] A[DONT_GENERATE, DONT_INLINE]
          (r3v12 java.lang.Object) from 0x0311: CHECK_CAST (p.up70) (r3v12 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.z6n.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6n(Object obj) {
        super(2, obj, swv.class, "createInitialModel", "createInitialModel(Ljava/util/List;Landroid/os/Bundle;)Lcom/spotify/playlistediting/privacypage/domain/model/EditPlaylistsPrivacyModel;", 0);
        this.a = (byte) 25;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6n(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6n(sut sutVar) {
        super(2, sutVar, sut.class, "handleUpdate", "handleUpdate(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = (byte) 19;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6n(bvt bvtVar) {
        super(2, bvtVar, bvt.class, "handleUpdate", "handleUpdate(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = (byte) 20;
    }
}
