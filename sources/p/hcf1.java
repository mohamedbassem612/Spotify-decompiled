package p;

import com.spotify.mobius.android.MobiusLoopViewModel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class hcf1 extends tv30 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcf1(Object obj, byte b) {
        super(1, obj, p3n1.class, "publishNonAuthenticated", "publishNonAuthenticated(Lcom/google/protobuf/MessageLite;)V", 0);
        this.a = b;
        switch (b) {
            case 29:
                super(1, obj, lvd.class, "observeIsFocusedState", "observeIsFocusedState(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0186 A[Catch: all -> 0x017f, TryCatch #0 {all -> 0x017f, blocks: (B:42:0x0168, B:43:0x016e, B:45:0x0174, B:51:0x0182, B:53:0x0186, B:55:0x019f, B:57:0x01a3, B:60:0x01a8), top: B:139:0x0168 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c5  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v21 java.lang.Object, still in use, count: 2, list:
          (r2v21 java.lang.Object) from 0x0182: PHI (r2 I:??) = (r2v16 java.lang.Object), (r2v21 java.lang.Object) binds: [B:50:0x0181, B:142:0x0182] A[DONT_GENERATE, DONT_INLINE]
          (r2v21 java.lang.Object) from 0x0179: CHECK_CAST (byte[]) (r2v21 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 990
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hcf1.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcf1(MobiusLoopViewModel mobiusLoopViewModel) {
        super(1, mobiusLoopViewModel, MobiusLoopViewModel.class, "dispatchEvent", "dispatchEvent(Ljava/lang/Object;)V", 0);
        this.a = (byte) 16;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hcf1(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcf1(pua0 pua0Var, byte b) {
        super(1, pua0Var, pua0.class, "update", "update(Ljava/util/Set;)Ljava/util/Map;", 0);
        this.a = b;
        switch (b) {
            case 14:
                super(1, pua0Var, pua0.class, "invalidateCache", "invalidateCache(Ljava/util/Set;)V", 0);
                break;
            default:
                break;
        }
    }
}
